package org.ev3j.comm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Stores decoded data of a direct command payload. A direct
 * command basically instructs the brick to execute a small
 * bytecode and (optionally) answer with the status and global
 * variables at the end.
 * 
 * <p> Quoting the sources: «Special care <em>must</em> be taken when writing
 * direct commands because the decision until now is <em>not</em> to restrict
 * the use of "dangerous" codes and constructions (loops in a direct command
 * are allowed).»
 * 
 * <p> This class has methods to encode and decode this kind of
 * payload, but it doesn't deal with the bytecode inside!
 * 
 * @see DirectCommandResponse
 */
public class DirectCommand implements Payload {
  private final boolean responseNeeded;
  private final short locals;
  private final short globals;
  private final byte[] bytecode;
  
  /**
   * Constructs a direct command payload, which instructs the brick to run
   * a small program and (optionally) return its results in a reply.
   * 
   * <p> The bytecode must never reference local or global variables of indices
   * greater than {@code locals} and {@code globals}, respectively.
   * 
   * @param responseNeeded True if a reply should be sent after the program
   * finishes execution, false otherwise
   * @param locals Maximum number of local variables used by the program
   * @param globals Maximum number of global variables used by the program
   * @param bytecode Encoded bytecode of the program
   * @throws IllegalArgumentException If more globals were requested than fit
   * in a 10-bit integer, or more locals were requested than fit in a 6-bit
   * integer
   */
  public DirectCommand(boolean responseNeeded, short locals, short globals, byte[] bytecode) throws IllegalArgumentException {
    // FIXME: do we need globals if we are requesting a response?
    // Can they be uninitialized?
    if (locals != (locals & ((1<<5)-1)))
      throw new IllegalArgumentException("Locals number won't fit in the header.");
    if (globals != (globals & ((1<<10)-1)))
      throw new IllegalArgumentException("Globals number won't fit in the header.");

    this.responseNeeded = responseNeeded;
    this.locals = locals;
    this.globals = globals;
    this.bytecode = bytecode;
  }

  /**
   * Tests wether this payload requests a reply from the brick,
   * after (un-)successful execution of this direct command.
   * 
   * @return True if a response should be sent, false if it shouldn't
   */
  public boolean isResponseNeeded() {
    return responseNeeded;
  }

  /**
   * Returns the maximum number of local variables the program will use.
   * 
   * @return The maximum number of local variables used
   */
  public short getLocals() {
    return locals;
  }

  /**
   * Returns the maximum number of global variables the program will use.
   * 
   * @return The maximum number of global variables used
   */
  public short getGlobals() {
    return globals;
  }

  /**
   * Returns the array of bytes which holds the bytecode to be run.
   *
   * @return The bytecode to execute
   */
  public byte[] getBytecode() {
    return bytecode;
  }
  
  /**
   * Encodes this direct command payload. This is then typically
   * encapsulated within a {@code Packet} and sent to the brick.
   *
   * @return The encoded bytes of this payload
   */
  @Override
  public byte[] encode() {
    ByteBuffer header = ByteBuffer.allocate(3 + bytecode.length).order(ByteOrder.LITTLE_ENDIAN);
    header.put((byte) getPayloadType());
    header.putShort((short) ((globals & 0x03FF) | (locals << 10)));
    header.put(bytecode);
    return header.array();
  }

  /**
   * Decodes a payload which is known to be a direct command.
   *
   * @param payload The encoded bytes
   * @return The decoded payload
   * @throws IllegalArgumentException If the encoded bytes didn't correspond
   * to a valid direct command payload
   */
  public static DirectCommand decode(byte[] payload) throws IllegalArgumentException {
    throw new RuntimeException("Not implemented FIXME.");
  }

  /**
   * Returns the payload type. This is typically the first byte
   * of an encoded payload, and it's expected to be unique for
   * each (sub)type of payload.
   * 
   * <p> In the case of direct commands, the payload type is {@code 
   * Defines.DIRECT_COMMAND_REPLY} if a response is required, and
   * {@code Defines.DIRECT_COMMAND_NO_REPLY} otherwise.
   * 
   * @return The payload type
   */
  @Override
  public byte getPayloadType() {
    return responseNeeded ? Defines.DIRECT_COMMAND_REPLY : Defines.DIRECT_COMMAND_NO_REPLY;
  }

  /**
   * Tests wether this payload is a response to a previous payload,
   * typically a command.
   *
   * @return Always false, since this is a command
   */
  @Override
  public boolean isResponse() {
    return false;
  }

  /**
   * Tests wether this payload is a response to a previous payload <em>and</em>
   * it indicates an error when processing it.
   *
   * @return Always false, since this is a command
   */
  @Override
  public boolean isErrorResponse() {
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 79 * hash + (this.responseNeeded ? 1 : 0);
    hash = 79 * hash + this.locals;
    hash = 79 * hash + this.globals;
    hash = 79 * hash + Arrays.hashCode(this.bytecode);
    return hash;
  }

  /**
   * Compares this direct command with another object.
   *
   * @param obj Object to compare
   * @return True if, and only if, the other object is also
   * a direct command with the exact same bytecode, local & global
   * variables number and response needed flag set
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    final DirectCommand other = (DirectCommand) obj;
    if (this.responseNeeded != other.responseNeeded) return false;
    if (this.locals != other.locals) return false;
    if (this.globals != other.globals) return false;
    if (!Arrays.equals(this.bytecode, other.bytecode)) return false;
    return true;
  }

}
