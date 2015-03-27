package org.ev3j.vm;

/**
 * Contains the defined constants for the VM in general.
 * Manually extracted from {@code ev3sources/lms2012/lms2012/source/bytecodes.h}.
 *
 * <p> These define a lot of aspects of the EV3, from physical (motor ports,
 * input ports, LCD dimensions) to software (directories, extensions,
 * defaults).
 */
public final class Defines {
    // HARDWARE

    /** Number of output ports in the system */
    public final static int OUTPUTS                   = 4;
    /** Number of input  ports in the system */
    public final static int INPUTS                    = 4;
    /** Number of buttons in the system */
    public final static int BUTTONS                   = 6;
    /** Number of LEDs in the system */
    public final static int LEDS                      = 4;

    /** LCD horizontal pixels */
    public final static int LCD_WIDTH                 = 178;
    /** LCD vertical pixels */
    public final static int LCD_HEIGHT                = 128;
    /** Top line vertical pixels */
    public final static int TOPLINE_HEIGHT            = 10;
    /** Store levels */
    public final static int LCD_STORE_LEVELS          = 3;

    public final static int DEFAULT_VOLUME            = 100;
    public final static int DEFAULT_SLEEPMINUTES      = 30;

    // SOFTWARE

    /**  Forground color */
    public final static int FG_COLOR                  = 1;
    /**  Background color */
    public final static int BG_COLOR                  = 0;

    /** Number of bricks in the USB daisy chain (master + slaves) */
    public final static int CHAIN_DEPT                = 4;

    /** Max path size excluding trailing forward slash including zero termination */
    public final static int PATHSIZE                  = 84;
    /** Max name size including zero termination (must be divideable by 4) */
    public final static int NAMESIZE                  = 32;
    /** Max extension size including dot and zero termination */
    public final static int EXTSIZE                   = 5;
    /** Max filename size including path, name, extension and termination (must be divideable by 4) */
    public final static int FILENAMESIZE              = 120;
    /** Max WIFI MAC size including zero termination */
    public final static int MACSIZE                   = 18;
    /** Max WIFI IP size including zero termination */
    public final static int IPSIZE                    = 16;
    /** Max bluetooth address size including zero termination */
    public final static int BTADRSIZE                 = 13;

    /** Inclusive zero termination */
    public final static int ERR_STRING_SIZE           = 32;

    public final static int EVENT_BT_PIN              = 1;
    public final static int EVENT_BT_REQ_CONF         = 2;

    /** Highest valid device type */
    public final static int MAX_VALID_TYPE            = 101;

    // FOLDERS

    /** Folder for non volatile user programs/data */
    public final static String MEMORY_FOLDER             = "/mnt/ramdisk";
    /** Folder for On Brick Programming programs */
    public final static String PROGRAM_FOLDER            = "../prjs/BrkProg_SAVE";
    /** Folder for On Brick Data log files */
    public final static String DATALOG_FOLDER            = "../prjs/BrkDL_SAVE";
    /** Folder for SD card mount */
    public final static String SDCARD_FOLDER             = "../prjs/SD_Card";
    /** Folder for USB stick mount */
    public final static String USBSTICK_FOLDER           = "../prjs/USB_Stick";

    /** Project folder */
    public final static String PRJS_DIR                  = "../prjs";
    /** Apps folder */
    public final static String APPS_DIR                  = "../apps";
    /** Tools folder */
    public final static String TOOLS_DIR                 = "../tools";
    /** Temporary folder */
    public final static String TMP_DIR                   = "../tmp";

    /** Folder for non volatile settings */
    public final static String SETTINGS_DIR              = "../sys/settings";

    /** Max directory items allocated including "." and ".." */
    public final static int DIR_DEEPT                 = 127;

    // FILES USED IN APPLICATION

    /** Last run filename */
    public final static String LASTRUN_FILE_NAME         = "lastrun";
    /** Calibration data filename */
    public final static String CALDATA_FILE_NAME         = "caldata";

    // FILES USED IN APPS

    /** File used in "Sleep" app to save status */
    public final static String SLEEP_FILE_NAME           = "Sleep";
    /** File used in "Volume" app to save status */
    public final static String VOLUME_FILE_NAME          = "Volume";
    /** File used in "WiFi" app to save status */
    public final static String WIFI_FILE_NAME            = "WiFi";
    /** File used in "Bluetooth" app to save status */
    public final static String BLUETOOTH_FILE_NAME       = "Bluetooth";

    // EXTENSIONS

    /** Robot Sound File */
    public final static String EXT_SOUND                 = ".rsf";
    /** Robot Graphics File */
    public final static String EXT_GRAPHICS              = ".rgf";
    /** Robot Byte code File */
    public final static String EXT_BYTECODE              = ".rbf";
    /** Robot Text File */
    public final static String EXT_TEXT                  = ".rtf";
    /** Robot Datalog File */
    public final static String EXT_DATALOG               = ".rdf";
    /** Robot Program File */
    public final static String EXT_PROGRAM               = ".rpf";
    /** Robot Configuration File */
    public final static String EXT_CONFIG                = ".rcf";
    /** Robot Archive File */
    public final static String EXT_ARCHIVE               = ".raf";

    // NAME LENGTHs

    /** Brick name maximal size (including zero termination) */
    public final static int BRICKNAMESIZE             = 120;
    /** Bluetooth pass key size (including zero termination) */
    public final static int BTPASSKEYSIZE             = 7;
    /** WiFi pass key size (including zero termination) */
    public final static int WIFIPASSKEYSIZE           = 33;

    // VALID CHARACTERS

    /** Character set allowed in brick name and raw filenames */
    public final static int CHARSET_NAME              = 0x01;
    /** Character set allowed in file names */
    public final static int CHARSET_FILENAME          = 0x02;
    /** Character set allowed in bluetooth pass key */
    public final static int CHARSET_BTPASSKEY         = 0x04;
    /** Character set allowed in WiFi pass key */
    public final static int CHARSET_WIFIPASSKEY       = 0x08;
    /** Character set allowed in WiFi ssid */
    public final static int CHARSET_WIFISSID          = 0x10;

}
