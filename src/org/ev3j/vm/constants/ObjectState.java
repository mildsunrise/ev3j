package org.ev3j.vm.constants;

/**
 * Object code is running
 * 
 * Object is waiting for final trigger
 * 
 * Object is stopped or not triggered yet
 * 
 * Object is halted because a call is in progress
 */
public final class ObjectState {

    public static final int RUNNING = 16;

    /**
     * Object code is running
     */
    public static final int WAITING = 32;

    /**
     * Object is waiting for final trigger
     */
    public static final int STOPPED = 64;

    /**
     * Object is stopped or not triggered yet
     */
    public static final int HALTED = 128;

}
