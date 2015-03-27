package org.ev3j.vm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Logic to encode VM primitives: constants, local and global variable
 * pointers, handles, addresses, and labels. These are the building
 * blocks of the bytecode language used by the VM.
 * 
 * <p> Bytecode is a series of commands, each starting with an opcode byte,
 * and then zero or more encoded primitives, which are the parameters and
 * (if applicable) the last primitive is a variable pointer where the
 * returned result will be saved.
 * 
 * <p> Limits and special primitive values, as well as encoding constants,
 * are also defined in this class.
 * 
 * @see ProgramBuilderBase
 * @see Defines
 */
public final class Primitive {

  public final static byte DATA8_NAN    = (byte) -128;
  public final static short DATA16_NAN  = (short) -32768;
  public final static int DATA32_NAN    = (int) 0x80000000;
  public final static float DATAF_NAN   = (float)0 / (float)0; //(0x7FC00000)

  public final static byte DATA8_MIN    = (-127);
  public final static byte DATA8_MAX    = (127);
  public final static short DATA16_MIN  = (-32767);
  public final static short DATA16_MAX  = (32767);
  public final static int DATA32_MIN    = (-2147483647);
  public final static int DATA32_MAX    = (2147483647);
  //public final static float DATAF_MIN   = (-2147483647);
  //public final static float DATAF_MAX   = (2147483647);


  public final static byte PRIMPAR_SHORT      = (byte) 0x00;
  public final static byte PRIMPAR_LONG       = (byte) 0x80;

  public final static byte PRIMPAR_CONST      = (byte) 0x00;
  public final static byte PRIMPAR_VARIABEL   = (byte) 0x40;
  public final static byte PRIMPAR_LOCAL      = (byte) 0x00;
  public final static byte PRIMPAR_GLOBAL     = (byte) 0x20;
  public final static byte PRIMPAR_HANDLE     = (byte) 0x10;
  public final static byte PRIMPAR_ADDR       = (byte) 0x08;

  public final static byte PRIMPAR_INDEX      = (byte) 0x1F;
  public final static byte PRIMPAR_CONST_SIGN = (byte) 0x20;
  public final static byte PRIMPAR_VALUE      = (byte) 0x3F;

  public final static byte PRIMPAR_BYTES      = (byte) 0x07;

  public final static byte PRIMPAR_STRING_OLD = 0;
  public final static byte PRIMPAR_1_BYTE     = 1;
  public final static byte PRIMPAR_2_BYTES    = 2;
  public final static byte PRIMPAR_4_BYTES    = 3;
  public final static byte PRIMPAR_STRING     = 4;

  public final static byte PRIMPAR_LABEL      = (byte) 0x20;
  
  
  // TODO: limits


  /**
   * Encode constant 8-bit integer. This will use {@code LC1} representation.
   * Keep in mind: the most negative integer represents NaN, see
   * {@code DATA8_NAN}, {@code DATA8_MIN} and {@code DATA8_MAX}.
   * 
   * @param n The integer to encode
   * @return The encoded bytes
   */
  public static byte[] encodeByte(byte n) {
    ByteBuffer buffer = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_CONST | PRIMPAR_1_BYTE));
    buffer.put(n);
    return buffer.array();
  }
  
  /**
   * Encode constant 16-bit integer. This will use {@code LC2} representation.
   * Keep in mind: the most negative integer represents NaN, see
   * {@code DATA16_NAN}, {@code DATA16_MIN} and {@code DATA16_MAX}.
   * 
   * @param n The integer to encode
   * @return The encoded bytes
   */
  public static byte[] encodeShort(short n) {
    ByteBuffer buffer = ByteBuffer.allocate(3).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_CONST | PRIMPAR_2_BYTES));
    buffer.putShort(n);
    return buffer.array();
  }
  
  /**
   * Encode constant 32-bit integer. This will use {@code LC4} representation.
   * Keep in mind: the most negative integer represents NaN, see
   * {@code DATA32_NAN}, {@code DATA32_MIN} and {@code DATA32_MAX}.
   * 
   * @param n The integer to encode
   * @return The encoded bytes
   */
  public static byte[] encodeInt(int n) {
    ByteBuffer buffer = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_CONST | PRIMPAR_4_BYTES));
    buffer.putInt(n);
    return buffer.array();
  }
  
  /**
   * Encode constant 32-bit float. This will use {@code LC4} representation.
   * 
   * @param n The floating-point number to encode
   * @return The encoded bytes
   */
  public static byte[] encodeFloat(float n) {
    ByteBuffer buffer = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_CONST | PRIMPAR_4_BYTES));
    buffer.putFloat(n);
    return buffer.array();
  }

  /**
   * Encode constant string of bytes. This basically prepends the
   * passed in bytes with the {@code LCS} byte, and appends a NUL terminator.
   *
   * @param string The string of bytes to be encoded
   * @return The encoded bytes representing this string
   * @throws IllegalArgumentException if {@code string} contains
   * NUL ({@code 0x00}) bytes
   */
  public static byte[] encodeString(byte[] string) {
    for (int i = 0; i < string.length; i++) {
      if (string[i] == 0)
        throw new IllegalArgumentException("String cannot contain NUL.");
    }
    byte[] result = new byte[string.length+2];
    result[0] = PRIMPAR_LONG | PRIMPAR_STRING;
    System.arraycopy(string, 0, result, 1, string.length);
    result[string.length+1] = 0;
    return result;
  }

  /**
   * Encode a local variable pointer using {@code LV1} representation.
   *
   * @param variable Index of the pointed local variable
   * @return The encoded bytes
   */
  public static byte[] encodeLocal(short variable) {
    ByteBuffer buffer = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_2_BYTES));
    buffer.put((byte)variable);
    return buffer.array();
  }

  /**
   * Encode a global variable pointer using GV2 representation.
   * 
   * @param variable Index of the pointed global variable
   * @return The encoded bytes
   */
  public static byte[] encodeGlobal(short variable) {
    ByteBuffer buffer = ByteBuffer.allocate(3).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_2_BYTES));
    buffer.putShort((short)variable);
    return buffer.array();
  }

  /**
   * Encode a label reference using LAB1 representation.
   */
  public static byte[] encodeLabel(byte label) {
    ByteBuffer buffer = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
    buffer.put((byte)(PRIMPAR_LONG | PRIMPAR_LABEL));
    buffer.put((byte)label);
    return buffer.array();
  }

  //FIXME: handles, addresses, decode

  //FIXME: mention thread-safe, clear trailing indent

}
