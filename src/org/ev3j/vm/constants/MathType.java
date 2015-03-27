package org.ev3j.vm.constants;

/**
 * e^x            r = expf(x)
 * 
 * Modulo         r = fmod(x,y)
 * 
 * Floor          r = floor(x)
 * 
 * Ceiling        r = ceil(x)
 * 
 * Round          r = round(x)
 * 
 * Absolute       r = fabs(x)
 * 
 * Negate         r = 0.0 - x
 * 
 * Squareroot     r = sqrt(x)
 * 
 * Log            r = log10(x)
 * 
 * Ln             r = log(x)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Modulo DATA8   r = x % y
 * 
 * Modulo DATA16  r = x % y
 * 
 * Modulo DATA32  r = x % y
 * 
 * Exponent       r = powf(x,y)
 * 
 * Truncate       r = (float)((int)(x * pow(y))) / pow(y)
 * 
 * Maximum number of math functions supported by the VM
 */
public final class MathType {

    public static final int EXP = 1;

    /**
     * e^x            r = expf(x)
     */
    public static final int MOD = 2;

    /**
     * Modulo         r = fmod(x,y)
     */
    public static final int FLOOR = 3;

    /**
     * Floor          r = floor(x)
     */
    public static final int CEIL = 4;

    /**
     * Ceiling        r = ceil(x)
     */
    public static final int ROUND = 5;

    /**
     * Round          r = round(x)
     */
    public static final int ABS = 6;

    /**
     * Absolute       r = fabs(x)
     */
    public static final int NEGATE = 7;

    /**
     * Negate         r = 0.0 - x
     */
    public static final int SQRT = 8;

    /**
     * Squareroot     r = sqrt(x)
     */
    public static final int LOG = 9;

    /**
     * Log            r = log10(x)
     */
    public static final int LN = 10;

    /**
     * Ln             r = log(x)
     */
    public static final int SIN = 11;

    public static final int COS = 12;

    public static final int TAN = 13;

    public static final int ASIN = 14;

    public static final int ACOS = 15;

    public static final int ATAN = 16;

    public static final int MOD8 = 17;

    /**
     * Modulo DATA8   r = x % y
     */
    public static final int MOD16 = 18;

    /**
     * Modulo DATA16  r = x % y
     */
    public static final int MOD32 = 19;

    /**
     * Modulo DATA32  r = x % y
     */
    public static final int POW = 20;

    /**
     * Exponent       r = powf(x,y)
     */
    public static final int TRUNC = 21;

    /**
     * Truncate       r = (float)((int)(x * pow(y))) / pow(y)
     */
    public static final int MATHTYPES = 22;

}
