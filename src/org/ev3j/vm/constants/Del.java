package org.ev3j.vm.constants;

/**
 * No delimiter at all
 * 
 * Use tab as delimiter
 * 
 * Use space as delimiter
 * 
 * Use return as delimiter
 * 
 * Use colon as delimiter
 * 
 * Use comma as delimiter
 * 
 * Use line feed as delimiter
 * 
 * Use return+line feed as delimiter
 */
public final class Del {

    public static final int NONE = 0;

    /**
     * No delimiter at all
     */
    public static final int TAB = 1;

    /**
     * Use tab as delimiter
     */
    public static final int SPACE = 2;

    /**
     * Use space as delimiter
     */
    public static final int RETURN = 3;

    /**
     * Use return as delimiter
     */
    public static final int COLON = 4;

    /**
     * Use colon as delimiter
     */
    public static final int COMMA = 5;

    /**
     * Use comma as delimiter
     */
    public static final int LINEFEED = 6;

    /**
     * Use line feed as delimiter
     */
    public static final int CRLF = 7;

    /**
     * Use return+line feed as delimiter
     */
    public static final int DELS = 8;

}
