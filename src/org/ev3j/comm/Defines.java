package org.ev3j.comm;

/**
 * Contains the defined constants for the communication module.
 * Manually extracted from {@code ev3sources/lms2012/c_com/source/c_com.h}.
 * 
 * @see Payload
 */
public final class Defines {

  // SYSTEM COMMANDS
  
  /** System command, reply required */
  public final static byte SYSTEM_COMMAND_REPLY = (byte) 0x01;
  /** System commands, no reply required */
  public final static byte SYSTEM_COMMAND_NO_REPLY = (byte) 0x81;

  /** Begin file down load */
  public final static byte BEGIN_DOWNLOAD = (byte) 0x92;
  /** Continue file down load */
  public final static byte CONTINUE_DOWNLOAD = (byte) 0x93;
  /** Begin file upload */
  public final static byte BEGIN_UPLOAD = (byte) 0x94;
  /** Continue file upload */
  public final static byte CONTINUE_UPLOAD = (byte) 0x95;
  /** Continue get byte from a file (while writing to the file) */
  public final static byte CONTINUE_GETFILE = (byte) 0x97;
  /** Close file handle */
  public final static byte CLOSE_FILEHANDLE = (byte) 0x98;
  /** List files */
  public final static byte LIST_FILES = (byte) 0x99;
  /** Continue list files */
  public final static byte CONTINUE_LIST_FILES = (byte) 0x9A;
  /** Create directory */
  public final static byte CREATE_DIR = (byte) 0x9B;
  /** Delete */
  public final static byte DELETE_FILE = (byte) 0x9C;
  /** List handles */
  public final static byte LIST_OPEN_HANDLES = (byte) 0x9D;
  /** Write to mailbox */
  public final static byte WRITEMAILBOX = (byte) 0x9E;
  /** Transfer trusted pin code to brick */
  public final static byte BLUETOOTHPIN = (byte) 0x9F;
  /** Restart the brick in Firmware update mode */
  public final static byte ENTERFWUPDATE = (byte) 0xA0;
  /** Set Bundle ID for mode 2 */
  public final static byte SETBUNDLEID = (byte) 0xA1;
  /** Set bundle seed ID for mode 2 */
  public final static byte SETBUNDLESEEDID = (byte) 0xA2;

  
  /** System command reply */
  public final static byte SYSTEM_REPLY = (byte) 0x03;
  /** System command reply error */
  public final static byte SYSTEM_REPLY_ERROR = (byte) 0x05;

  // Return codes
  public final static byte SUCCESS = (byte) 0x00;
  public final static byte UNKNOWN_HANDLE = (byte) 0x01;
  public final static byte HANDLE_NOT_READY = (byte) 0x02;
  public final static byte CORRUPT_FILE = (byte) 0x03;
  public final static byte NO_HANDLES_AVAILABLE = (byte) 0x04;
  public final static byte NO_PERMISSION = (byte) 0x05;
  public final static byte ILLEGAL_PATH = (byte) 0x06;
  public final static byte FILE_EXITS = (byte) 0x07;
  public final static byte END_OF_FILE = (byte) 0x08;
  public final static byte SIZE_ERROR = (byte) 0x09;
  public final static byte UNKNOWN_ERROR = (byte) 0x0A;
  public final static byte ILLEGAL_FILENAME = (byte) 0x0B;
  public final static byte ILLEGAL_CONNECTION = (byte) 0x0C;

  
  // DIRECT COMMANDS

  /** Direct command, reply required */
  public final static byte DIRECT_COMMAND_REPLY = (byte) 0x00;
  /** Direct command, reply not required */
  public final static byte DIRECT_COMMAND_NO_REPLY = (byte) 0x80;
  
  /** Direct command reply */
  public final static byte DIRECT_REPLY = (byte) 0x02;
  /** Direct command reply error */
  public final static byte DIRECT_REPLY_ERROR = (byte) 0x04;
  
}
