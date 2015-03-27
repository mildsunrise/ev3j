package org.ev3j.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Stores data from a EV3 communication packet containing a payload.
 * Has methods to read and write the packet to / from a stream.
 * This class is immutable.
 *
 * <p> EV3 packets are channel-independent, they contain a size, a message
 * number and a binary payload. The first byte of the payload generally
 * identifies the type of message that is being sent.
 *
 * @see Payload
 * @see EV3Socket
 */
public class Packet implements Serializable {
  private final short messageNumber;
  private final byte[] payload;

  public Packet(short messageNumber, byte[] payload) {
    this.messageNumber = messageNumber;
    this.payload = payload;
  }

  public short getMessageNumber() {
    return messageNumber;
  }

  public byte[] getPayload() {
    return payload;
  }

  public void writeTo(OutputStream output) throws IOException {
    ByteBuffer header = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
    header.putShort((short) (payload.length + 2));
    header.putShort(messageNumber);
    output.write(header.array());
    output.write(payload);
  }

  public static Packet readFrom(InputStream input) throws IllegalArgumentException, IOException {
    ByteBuffer tmp = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
    int n = input.read(tmp.array());
    if (n == -1)
      return null;
    if (n < 4)
      throw new IllegalArgumentException("Unexpected end of data.");
    
    int payloadLength = tmp.getShort() - 2;
    if (payloadLength < 0)
      throw new IllegalArgumentException("Malformed packet.");

    short messageNumber = tmp.getShort();
    
    byte[] payload = new byte[payloadLength];
    if (input.read(payload) < payloadLength)
      throw new IllegalArgumentException("Unexpected end of data.");

    return new Packet(messageNumber, payload);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 47 * hash + this.messageNumber;
    hash = 47 * hash + Arrays.hashCode(this.payload);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    final Packet other = (Packet) obj;
    if (this.messageNumber != other.messageNumber) return false;
    if (!Arrays.equals(this.payload, other.payload)) return false;
    return true;
  }
}
