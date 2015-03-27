package org.ev3j.vm.constants;

/**
 * UART device reset
 * 
 * UART device fire   (ultrasonic)
 * 
 * UART device channel (IR seeker)
 */
public final class DeviceCommand {

    /**
     * Object is halted because a call is in progress
     */
    public static final int RESET = 17;

    /**
     * UART device reset
     */
    public static final int FIRE = 17;

    /**
     * UART device fire   (ultrasonic)
     */
    public static final int CHANNEL = 18;

    /**
     * UART device channel (IR seeker)
     */
    public static final int DEVCMDS = 19;

}
