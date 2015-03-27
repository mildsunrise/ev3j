package org.ev3j.vm.constants;

/**
 * DATA8  (don't change)
 * 
 * DATA16 (don't change)
 * 
 * DATA32 (don't change)
 * 
 * DATAF  (don't change)
 * 
 * Zero terminated string
 * 
 * Array handle
 * 
 * Variable type
 * 
 * Percent (used in opINPUT_READEXT)
 * 
 * Raw     (used in opINPUT_READEXT)
 * 
 * SI unit (used in opINPUT_READEXT)
 */
public final class DataFormat {

    /**
     * Stopped
     */
    public static final int DATA_8 = 0;

    /**
     * DATA8  (don't change)
     */
    public static final int DATA_16 = 1;

    /**
     * DATA16 (don't change)
     */
    public static final int DATA_32 = 2;

    /**
     * DATA32 (don't change)
     */
    public static final int DATA_F = 3;

    /**
     * DATAF  (don't change)
     */
    public static final int DATA_S = 4;

    /**
     * Zero terminated string
     */
    public static final int DATA_A = 5;

    /**
     * Array handle
     */
    public static final int DATA_V = 7;

    /**
     * Variable type
     */
    public static final int DATA_PCT = 16;

    /**
     * Percent (used in opINPUT_READEXT)
     */
    public static final int DATA_RAW = 18;

    /**
     * Raw     (used in opINPUT_READEXT)
     */
    public static final int DATA_SI = 19;

    /**
     * SI unit (used in opINPUT_READEXT)
     */
    public static final int DATA_FORMATS = 20;

}
