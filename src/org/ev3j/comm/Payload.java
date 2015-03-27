package org.ev3j.comm;

import java.io.Serializable;

/**
 * Stores data from an EV3 packet payload, be it a command or a response.
 * Has methods to decode and encode a command from / to a byte array.
 * This class and its subclasses are immutable. Do not use this class directly.
 *
 * @see Packet
 */
public interface Payload extends Serializable {

    /**
     * Encodes this payload. This is then typically
     * encapsulated within a {@code Packet} and sent to the brick.
     * 
     * @return The encoded bytes
     */
    public abstract byte[] encode();

    /**
     * Returns the payload type. This is typically the first byte
     * of an encoded payload, and it's expected to be unique for
     * each (sub)type of payload.
     *
     * @return The payload type
     */
    public abstract byte getPayloadType();

    /**
     * Tests wether this payload is a response to a previous payload,
     * typically a command.
     *
     * @return True if this payload is a response, false otherwise
     */
    public abstract boolean isResponse();

    /**
     * Tests wether this payload is a response to a previous payload <em>and</em>
     * it indicates an error when processing it.
     * 
     * <p> It's expected that, if this returns true, then
     * {@link Payload#isResponse()} will also return true.
     *
     * @return True if this payload is an error response, false otherwise
     */
    public abstract boolean isErrorResponse();

    @Override
    public abstract int hashCode();

    /**
     * Compares this payload with another object.
     *
     * @param obj Object to compare
     * @return True if, and only if, the other object has the same type
     * and fields than this payload
     */
    @Override
    public abstract boolean equals(Object obj);

}
