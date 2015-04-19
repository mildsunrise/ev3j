package org.ev3j.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.ev3j.vm.ProgramBuilder;
import org.ev3j.vm.constants.LedPattern;

/**
 * High-level EV3 socket wrapper. This class builds on
 * {@link EV3Socket} to provide a very simplified, chainable
 * API to send simple commands to an EV3 robot. You just
 * need the input and output streams.
 * 
 * If you need something more advanced, you can still use
 * inherited {@link EV3Socket} methods to achieve it.
 */
public class EV3 extends EV3Socket {
    public static final int MOTOR_A = 1 << 0;
    public static final int MOTOR_B = 1 << 1;
    public static final int MOTOR_C = 1 << 2;
    public static final int MOTOR_D = 1 << 3;

    public static final String UUID = "00001101-0000-1000-8000-00805F9B34FB";

    public EV3(InputStream inputStream, OutputStream outputStream) {
        super(inputStream, outputStream);
    }

    protected void validateMotors(int motors) {
        if ((motors & ~(MOTOR_A|MOTOR_B|MOTOR_C|MOTOR_D)) != 0)
            throw new IllegalArgumentException("Invalid motor bitmask.");
    }
    protected void validateSpeed(int speed) {
        if (speed < 100 || speed > 100)
            throw new IllegalArgumentException("Illegal speed value.");
    }
    protected void validateVolume(int volume) {
        if (volume < -1 || volume > 100)
            throw new IllegalArgumentException("Illegal volume value.");
    }

    /**
     * Assign a fixed power (i.e. force) to one or more motors.
     * @param motors Bitmask specifying the motor(s) to power
     * @param speed Desired power [-100..100]
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 powerMotors(int motors, int speed) throws IOException {
        validateMotors(motors);
        validateSpeed(speed);
        ProgramBuilder p = new ProgramBuilder();
        p.OUTPUT_POWER(0, motors, speed);
        sendVoid(p);
        return this;
    }

    /**
     * Start one or more motors.
     * The motors should be previously setup using i.e. {@link EV3#powerMotors}.
     * @param motors Bitmask specifying the motor(s) to start
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 startMotors(int motors) throws IOException {
        validateMotors(motors);
        ProgramBuilder p = new ProgramBuilder();
        p.OUTPUT_START(0, motors);
        sendVoid(p);
        return this;
    }

    /**
     * Stop one or more motors.
     * Note, this doesn't remove power or regulation set on the motors.
     * @param motors Bitmask specifying the motor(s) to stop
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 stopMotors(int motors) throws IOException {
        validateMotors(motors);
        ProgramBuilder p = new ProgramBuilder();
        p.OUTPUT_STOP(0, motors, 0);
        sendVoid(p);
        return this;
    }

    /**
     * Set the pattern for the button LEDs on the brick.
     * @param ledPattern One of {@link LedPattern} values
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 setLedPattern(int ledPattern) throws IOException {
        ProgramBuilder p = new ProgramBuilder();
        p.LED(ledPattern);
        sendVoid(p);
        return this;
    }

    /**
     * Play a tone through the brick's speaker.
     * @param volume The volume [0..100]. Pass -1 to use currently set volume
     * @param frequency The frequency in Hertz
     * @param duration Tone duration in milliseconds
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 playTone(int volume, int frequency, int duration) throws IOException {
        validateVolume(volume);
        ProgramBuilder p = new ProgramBuilder();
        Object volumeValue = volume;
        if (volume == -1) {
            volumeValue = p.local("volume");
            p.GET_VOLUME(volumeValue);
        }
        p.TONE(volumeValue, frequency, duration);
        sendVoid(p);
        return this;
    }

    /**
     * Play a sound file through the brick's speaker.
     * The sound should already be in the EV3 filesystem.
     * @param volume The volume [0..100]. Pass -1 to use currently set volume
     * @param file The path to the sound file to play (must be ASCII)
     * @param repeat True to play the sound indefinitely, false otherwise
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 playSound(int volume, String file, boolean repeat) throws IOException {
        validateVolume(volume);
        ProgramBuilder p = new ProgramBuilder();
        Object volumeValue = volume;
        if (volume == -1) {
            volumeValue = p.local("volume");
            p.GET_VOLUME(volumeValue);
        }
        if (repeat)
            p.REPEAT(volumeValue, file);
        else
            p.PLAY(volumeValue, file);
        sendVoid(p);
        return this;
    }

    /**
     * Wait for all queued sounds to output before processing
     * the next command.
     * @return Own instance
     * @throws IOException If I/O errors occur
     */
    public EV3 soundReady() throws IOException {
        ProgramBuilder p = new ProgramBuilder();
        p.SOUND_READY();
        sendVoid(p);
        return this;
    }
}
