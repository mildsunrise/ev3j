package org.ev3j.comm;

import java.util.Arrays;

/**
 *
 * @author alba
 */
public class DirectCommandResponse implements Payload {
    private final boolean error;
    private final byte[] values;

    public DirectCommandResponse(boolean error, byte[] values) {
        this.error = error;
        this.values = values;
    }

    public byte[] getValues() {
        return values;
    }

    @Override
    public byte[] encode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static DirectCommandResponse decode(byte[] payload) throws IllegalArgumentException {
        if (payload.length < 1)
            throw new IllegalArgumentException("Malformed payload.");
        if (payload[0] != Defines.DIRECT_REPLY && payload[0] != Defines.DIRECT_REPLY_ERROR)
            throw new IllegalArgumentException("Not a direct command response.");
        boolean error = (payload[0] == Defines.DIRECT_REPLY_ERROR);
        byte[] values = Arrays.copyOfRange(payload, 1, payload.length);
        return new DirectCommandResponse(error, values);
    }

    @Override
    public byte getPayloadType() {
        return error ? Defines.DIRECT_REPLY_ERROR : Defines.DIRECT_REPLY;
    }

    @Override
    public boolean isResponse() {
        return true;
    }

    @Override
    public boolean isErrorResponse() {
        return error;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.error ? 1 : 0);
        hash = 53 * hash + Arrays.hashCode(this.values);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final DirectCommandResponse other = (DirectCommandResponse) obj;
        if (this.error != other.error) return false;
        if (!Arrays.equals(this.values, other.values)) return false;
        return true;
    }

}
