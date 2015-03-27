package org.ev3j.vm.constants;

/**
 * No errors to report
 * 
 * Busy - try again
 * 
 * Something failed
 * 
 * Stopped
 */
public final class Result {

    public static final int OK = 0;

    /**
     * No errors to report
     */
    public static final int BUSY = 1;

    /**
     * Busy - try again
     */
    public static final int FAIL = 2;

    /**
     * Something failed
     */
    public static final int STOP = 4;

}
