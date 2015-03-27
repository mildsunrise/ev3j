package org.ev3j.vm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Base class for {@link ProgramBuilder}. This class offers a chainable API
 * similar to that of {@link StringBuilder} that allows you to assemble
 * bytecode for the EV3 VM by outputing bytes and encoded primitives. It's
 * an easier way to build bytecode programs than using {@link Primitive}
 * directly.
 * 
 * <p> Another commodity of using this is its variable & label allocation methods,
 * which allow you to <em>name</em> variables and labels instead of using
 * indexes to reference them, which is hard to maintain and error-prone.
 * 
 * <p> The following code creates a program that requests the current volume of
 * the brick, then plays a sound with that volume:
 * 
 * <pre>{@code
 * ProgramBuilderBase program = new ProgramBuilderBase();
 * // Write a raw byte (the opcode)
 * program.write(Opcode.INFO);
 * // Write an encoded integer (first parameter, the subcommand)
 * program.echo(Opcode.Info.GET_VOLUME);
 * // Write an encoded variable pointer (where return value will be put)
 * program.echo(program.local("volume"));
 * // Write a raw byte (the opcode)
 * program.write(Opcode.SOUND);
 * // Write an encoded variable pointer (first parameter, the volume)
 * program.echo(program.local("volume"));
 * // Write an encoded string (second parameter, filename)
 * program.echo("ui/DownloadSucces");
 * }</pre>
 * 
 * <p> In the above example, when the "volume" name is first seen, variable 0
 * is assigned to that name. If another name was introduced later, 1 would be
 * used, and so on. The same happens independently for global variables and
 * labels.
 * 
 * <p> After building the program, use {@code program.getBytecode()} to get the
 * assembled bytecode, and {@code program.getUsed*()} methods to get the total
 * number of variables and labels used by the program. This isn't reliable
 * if you encoded variable pointers manually using {@link Primitive} methods,
 * for instance.
 * 
 * <hr />
 * 
 * <p> Most of the time it's much better to use {@link ProgramBuilder}, which
 * provides additional methods for each instruction, so the above example
 * would be written as:
 * 
 * <pre>{@code
 * ProgramBuilderBase program = new ProgramBuilder();
 * program.GET_VOLUME(program.local("volume"));
 * program.PLAY(program.local("volume"), "ui/DownloadSucces");
 * }</pre>
 * 
 * @see ProgramBuilder
 */
public class ProgramBuilderBase implements Serializable {
    protected final List<String> labels;
    protected final List<String> locals;
    protected final List<String> globals;
    protected ByteArrayOutputStream output;

    public ProgramBuilderBase() {
        this.labels = new ArrayList<String>();
        this.locals = new ArrayList<String>();
        this.globals = new ArrayList<String>();
        this.output = new ByteArrayOutputStream();
    }

    /* Wrapped methods / utils */

    public int size() {
        return output.size();
    }

    public void reset() {
        labels.clear();
        locals.clear();
        globals.clear();
        output.reset();
    }

    public ProgramBuilderBase copy() {
        ProgramBuilderBase other = new ProgramBuilderBase();
        other.labels.addAll(labels);
        other.locals.addAll(locals);
        other.globals.addAll(globals);
        try {
            output.writeTo(other.output);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return other;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.labels.hashCode();
        hash = 89 * hash + this.locals.hashCode();
        hash = 89 * hash + this.globals.hashCode();
        hash = 89 * hash + Arrays.hashCode(getBytecode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ProgramBuilderBase)) return false;
        final ProgramBuilderBase other = (ProgramBuilderBase) obj;
        if (!labels.equals(other.labels)) return false;
        if (!locals.equals(other.locals)) return false;
        if (!globals.equals(other.globals)) return false;
        if (!Arrays.equals(getBytecode(), other.getBytecode())) return false;
        return true;
    }

    /* Raw write methods */

    public ProgramBuilderBase write(byte[] b, int off, int len) {
        output.write(b, off, len);
        return this;
    }
    public ProgramBuilderBase write(byte[] b) {
        output.write(b, 0, b.length);
        return this;
    }
    public ProgramBuilderBase write(int b) {
        output.write(b);
        return this;
    }

    /* Get result */

    public byte getUsedLabels() {
        return (byte) labels.size();
    }

    public short getUsedLocals() {
        return (short) locals.size();
    }

    public short getUsedGlobals() {
        return (short) globals.size();
    }

    public byte[] getBytecode() {
        return output.toByteArray();
    }

    /* Primitive encoding */

    public byte[] bool(boolean n) {
        return Primitive.encodeByte((byte) (n ? 1 : 0));
    }

    public byte[] number(byte n) {
        return Primitive.encodeByte(n);
    }

    public byte[] number(short n) {
        return Primitive.encodeShort(n);
    }

    public byte[] number(char n) {
        return Primitive.encodeInt(n);
    }

    public byte[] number(int n) {
        return Primitive.encodeInt(n);
    }

    public byte[] number(float n) {
        return Primitive.encodeFloat(n);
    }

    public byte[] string(byte[] b) {
        return Primitive.encodeString(b);
    }

    public byte[] string(String s) {
        return Primitive.encodeString(s.getBytes(Charset.forName("US-ASCII")));
    }

    public byte[] label(String name) {
        int idx = labels.indexOf(name);
        if (idx == -1) {
            idx = labels.size();
            if (idx >= Byte.MAX_VALUE)
                throw new IllegalArgumentException("Too many labels!");
            locals.add(name);
        }

        return Primitive.encodeLabel((byte) idx);
    }

    public byte[] local(String name) {
        int idx = locals.indexOf(name);
        if (idx == -1) {
            idx = locals.size();
            if (idx >= Short.MAX_VALUE)
                throw new IllegalArgumentException("Too many local variables!");
            locals.add(name);
        }

        return Primitive.encodeLocal((short) idx);
    }

    public byte[] global(String name) {
        int idx = globals.indexOf(name);
        if (idx == -1) {
            idx = globals.size();
            if (idx >= Short.MAX_VALUE)
                throw new IllegalArgumentException("Too many global variables!");
            globals.add(name);
        }

        return Primitive.encodeGlobal((short) idx);
    }

    /* Implicit primitive encoding */

    public ProgramBuilderBase echo(Object value) {
        if (value instanceof byte[]) {
            write((byte[]) value);
        } else if (value instanceof Byte) {
            write(number((Byte) value));
        } else if (value instanceof Short) {
            write(number((Short) value));
        } else if (value instanceof Integer) {
            write(number((Integer) value));
        } else if (value instanceof Character) {
            write(number((Character) value));
        } else if (value instanceof Float) {
            write(number((Float) value));
        } else if (value instanceof Boolean) {
            write(bool((Boolean) value));
        } else if (value instanceof String) {
            write(string((String) value));
        }
        return this;
    }

}
