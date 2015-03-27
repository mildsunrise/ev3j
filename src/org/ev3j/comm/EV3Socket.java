package org.ev3j.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.ev3j.vm.ProgramBuilderBase;

/**
 * Low-level socket wrapper. This takes an input stream, and an output
 * stream. It sends packets with commands on the output stream,
 * waits for responses (if requested) on the input stream, decodes them
 * and checks they are successful.
 * 
 * <p> Convenience methods allow you to send commands directly without having
 * to construct and encode your payloads. But you still have to supply
 * the bytecode to execute on the device. See {@link EV3} for a higher-level
 * solution that inherits from this class.
 *
 * <p> {@link IllegalArgumentException} is thrown if any of both parties
 * contradicts the protocol, either by attempting to send a response, or
 * receiving a non-response from the robot, or malformed packets / payloads.
 *
 * <p> {@link EV3ResponseException} is thrown if the robot returns an error
 * response after sending a command.
 *
 * @see Packet
 * @see Payload
 */
public class EV3Socket {
    private final InputStream inputStream;
    private final OutputStream outputStream;

    /**
     * Creates a new socket with an input and output stream (presumably
     * connected to an EV3 brick's communication endpoint).
     * 
     * <p> Never send anything through this streams! The protocol isn't
     * self-synchronizing and a single byte will effectively inutilize
     * the connection (and thus the socket). When this happens, no
     * errors will be thrown, but no more responses will be received from
     * the brick.
     * 
     * <p> Sometimes, the brick stops responding to all commands. Again, no errors
     * will be thrown but read operations will never end. In that cases, close
     * the streams, open a new connection and create a new socket.
     * 
     * <p> Also, make sure the streams are <em>not</em> buffered! If they
     * were, some packets would never arrive to the brick, causing similar
     * results.
     *
     * @param inputStream Stream where packets will be read from
     * @param outputStream Stream where packets will be sent on
     */
    public EV3Socket(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    /**
     * Retrieves the input stream used for receiving packets,
     * typically from an EV3 brick.
     * 
     * @return The input stream
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Retrieves the output stream used for sending packets,
     * typically to an EV3 brick.
     * 
     * @return The output stream
     */
    public OutputStream getOutputStream() {
        return outputStream;
    }



    /**
     * Low-level sending of a payload. This wraps the payload in
     * a packet, encodes it and writes it all to the output stream.
     * 
     * <p> You may want to use the convenience methods instead.
     *
     * @param payload The payload to send, typically a command
     * @throws IOException If I/O errors occur
     */
    public void sendPayload(byte[] payload) throws IOException {
        Packet packet = new Packet((short)0, payload);
        packet.writeTo(outputStream);
    }

    /**
     * Low-level receiving of a payload. This waits for a complete
     * packet to arrive to the input stream, then decodes it and
     * returns the received payload.
     *
     * @return The received payload, or {@code null} if end-of-file is reached
     * @throws IOException If I/O errors occur
     * @throws IllegalArgumentException If data is received but it doesn't
     * form a valid, complete packet
     */
    public byte[] readPayload() throws IOException, IllegalArgumentException {
        Packet packet = Packet.readFrom(inputStream);
        if (packet == null) return null;
        return packet.getPayload();
    }

    /**
     * Low-level sending of a payload. This encodes and wraps the payload in
     * a packet, encodes it and writes it all to the output stream.
     *
     * <p> This method is equivalent of calling:
     * {@code sendPayload(payload.encode())}
     *
     * <p> You may want to use the convenience methods instead.
     *
     * @param payload The payload to encode and send, typically a command
     * @throws IOException If I/O errors occur
     * @see EV3Socket#sendPayload(byte[])
     */
    public void sendPayload(Payload payload) throws IOException {
        sendPayload(payload.encode());
    }



    // TODO: implement system commands



    /**
     * Convenience method to create a direct command with the passed fields,
     * encode it and send it, without waiting for a response from the brick.
     *
     * @param bytecode The encoded bytecode to run
     * @param locals Maximum number of local variables used by the program
     * @param globals Maximum number of global variables used by the program
     * @throws IOException If I/O errors occur
     *
     * @see DirectCommand#DirectCommand(boolean, short, short, byte[])
     */
    public void sendDirectCommandVoid(byte[] bytecode, short locals, short globals) throws IOException {
        sendPayload(new DirectCommand(false, locals, globals, bytecode));
    }

    /**
     * Convenience method to create a direct command with the passed fields,
     * encode it and send it, and wait for a response from the brick.
     * When a response is received, it's decoded, checked for the error flag
     * and its <em>result values</em> are returned.
     *
     * @param bytecode The encoded bytecode to run
     * @param locals Maximum number of local variables used by the program
     * @param globals Maximum number of global variables used by the program
     * @return The encoded results returned by the brick
     * @throws IOException If I/O errors occur
     * @throws IllegalArgumentException If no response is received or it's
     * not a valid direct command response as expected
     * @throws EV3ResponseException If the response is marked as failed
     *
     * @see DirectCommand#DirectCommand(boolean, short, short, byte[])
     * @see DirectCommandResponse
     */
    public byte[] sendDirectCommand(byte[] bytecode, short locals, short globals) throws IOException, IllegalArgumentException, EV3ResponseException {
        sendPayload(new DirectCommand(true, locals, globals, bytecode));

        byte[] payload = readPayload();
        if (payload == null)
            throw new IllegalArgumentException("Payload expected.");

        DirectCommandResponse response = DirectCommandResponse.decode(payload);
        assert(response.isResponse());
        if (response.isErrorResponse())
            throw new EV3ResponseException(response);
        return response.getValues();
    }



    /**
     * Convenience method to create a direct command with the result of the
     * passed program builder, encode and send it, without waiting for a
     * response.
     *
     * <p> This method is equivalent to calling
     * {@code sendDirectCommandVoid(program.getBytecode(),
     * program.getUsedLocals(), program.getUsedGlobals())}.
     *
     * @param program The program builder containing the bytecode to send
     * @throws IOException If I/O errors occur
     */
    public void sendVoid(ProgramBuilderBase program) throws IOException {
        short locals = program.getUsedLocals();
        short globals = program.getUsedGlobals();
        sendDirectCommandVoid(program.getBytecode(), locals, globals);
    }

    /**
     * Convenience method to create a direct command with the result of the
     * passed program builder, encode it and send it, and wait for a response
     * from the brick. When a response is received, it's decoded, checked
     * for the error flag and its <em>result values</em> are returned.
     *
     * <p> This method is equivalent to calling
     * {@code sendDirectCommand(program.getBytecode(),
     * program.getUsedLocals(), program.getUsedGlobals())}.
     *
     * @param program The program builder containing the bytecode to send
     * @return The encoded results returned by the brick
     * @throws IOException If I/O errors occur
     * @throws IllegalArgumentException If no response is received or it's
     * not a valid direct command response as expected
     * @throws EV3ResponseException If the response is marked as failed
     *
     * @see DirectCommandResponse
     */
    public ByteBuffer send(ProgramBuilderBase program) throws IOException, IllegalArgumentException, EV3ResponseException {
        short locals = program.getUsedLocals();
        short globals = program.getUsedGlobals();
        byte[] values = sendDirectCommand(program.getBytecode(), locals, globals);
        return ByteBuffer.wrap(values).order(ByteOrder.LITTLE_ENDIAN);
    }
  
}
