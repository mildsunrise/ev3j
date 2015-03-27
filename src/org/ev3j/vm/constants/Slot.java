package org.ev3j.vm.constants;

/**
 * Program slot reserved for executing the user interface
 * 
 * Program slot used to execute user projects, apps and tools
 * 
 * Program slot used for direct commands coming from c_com
 * 
 * Program slot used for direct commands coming from c_ui
 * 
 * Program slot used to run the debug ui
 * 
 * Maximum slots supported by the VM
 * 
 * ONLY VALID IN opPROGRAM_STOP
 */
public final class Slot {

    public static final int GUI = 0;

    /**
     * Program slot reserved for executing the user interface
     */
    public static final int USER = 1;

    /**
     * Program slot used to execute user projects, apps and tools
     */
    public static final int CMD = 2;

    /**
     * Program slot used for direct commands coming from c_com
     */
    public static final int TERM = 3;

    /**
     * Program slot used for direct commands coming from c_ui
     */
    public static final int DEBUG = 4;

    /**
     * Program slot used to run the debug ui
     */
    public static final int SLOTS = 5;

    /**
     * Maximum slots supported by the VM
     * 
     * ONLY VALID IN opPROGRAM_STOP
     */
    public static final int CURRENT = -1;

}
