package org.ev3j.vm.constants;

public final class Opcode {

    /**
     * \endverbatim \ref VM \verbatim
     * 
     * 0000....
     */
    public static final int ERROR = 0;

    /**
     * 0000
     */
    public static final int NOP = 1;

    /**
     * 0001
     */
    public static final int PROGRAM_STOP = 2;

    /**
     * 0010
     */
    public static final int PROGRAM_START = 3;

    /**
     * 0011
     */
    public static final int OBJECT_STOP = 4;

    /**
     * 0100
     */
    public static final int OBJECT_START = 5;

    /**
     * 0101
     */
    public static final int OBJECT_TRIG = 6;

    /**
     * 0110
     */
    public static final int OBJECT_WAIT = 7;

    /**
     * 0111
     */
    public static final int RETURN = 8;

    /**
     * 1000
     */
    public static final int CALL = 9;

    /**
     * 1001
     */
    public static final int OBJECT_END = 10;

    /**
     * 1010
     */
    public static final int SLEEP = 11;

    /**
     * 1011
     */
    public static final int PROGRAM_INFO = 12;

    /**
     * 1100
     */
    public static final int LABEL = 13;

    /**
     * 1101
     */
    public static final int PROBE = 14;

    /**
     * 1110
     */
    public static final int DO = 15;

    /**
     * 1111
     * 
     * \endverbatim \ref cMath "MATH" \verbatim
     * 
     * 0001....
     * 
     * ADD                     00..
     */
    public static final int ADD8 = 16;

    /**
     * 00
     */
    public static final int ADD16 = 17;

    /**
     * 01
     */
    public static final int ADD32 = 18;

    /**
     * 10
     */
    public static final int ADDF = 19;

    /**
     * 11
     * 
     * SUB                     01..
     */
    public static final int SUB8 = 20;

    /**
     * 00
     */
    public static final int SUB16 = 21;

    /**
     * 01
     */
    public static final int SUB32 = 22;

    /**
     * 10
     */
    public static final int SUBF = 23;

    /**
     * 11
     * 
     * MUL                     10..
     */
    public static final int MUL8 = 24;

    /**
     * 00
     */
    public static final int MUL16 = 25;

    /**
     * 01
     */
    public static final int MUL32 = 26;

    /**
     * 10
     */
    public static final int MULF = 27;

    /**
     * 11
     * 
     * DIV                     11..
     */
    public static final int DIV8 = 28;

    /**
     * 00
     */
    public static final int DIV16 = 29;

    /**
     * 01
     */
    public static final int DIV32 = 30;

    /**
     * 10
     */
    public static final int DIVF = 31;

    /**
     * 11
     * 
     * \endverbatim \ref Logic "LOGIC" \verbatim
     * 
     * LOGIC                           0010....
     * 
     * OR                      00..
     */
    public static final int OR8 = 32;

    /**
     * 00
     */
    public static final int OR16 = 33;

    /**
     * 01
     */
    public static final int OR32 = 34;

    /**
     * 10
     * 
     * AND                     01..
     */
    public static final int AND8 = 36;

    /**
     * 00
     */
    public static final int AND16 = 37;

    /**
     * 01
     */
    public static final int AND32 = 38;

    /**
     * 10
     * 
     * XOR                     10..
     */
    public static final int XOR8 = 40;

    /**
     * 00
     */
    public static final int XOR16 = 41;

    /**
     * 01
     */
    public static final int XOR32 = 42;

    /**
     * 10
     * 
     * RL                      11..
     */
    public static final int RL8 = 44;

    /**
     * 00
     */
    public static final int RL16 = 45;

    /**
     * 01
     */
    public static final int RL32 = 46;

    /**
     * 10
     * 
     * \endverbatim \ref cMove "MOVE" \verbatim
     */
    public static final int INIT_BYTES = 47;

    /**
     * 1111
     * 
     * MOVE                            0011....
     * 
     * MOVE8_                  00..
     */
    public static final int MOVE8_8 = 48;

    /**
     * 00
     */
    public static final int MOVE8_16 = 49;

    /**
     * 01
     */
    public static final int MOVE8_32 = 50;

    /**
     * 10
     */
    public static final int MOVE8_F = 51;

    /**
     * 11
     * 
     * MOVE16_                 01..
     */
    public static final int MOVE16_8 = 52;

    /**
     * 00
     */
    public static final int MOVE16_16 = 53;

    /**
     * 01
     */
    public static final int MOVE16_32 = 54;

    /**
     * 10
     */
    public static final int MOVE16_F = 55;

    /**
     * 11
     * 
     * MOVE32_                 10..
     */
    public static final int MOVE32_8 = 56;

    /**
     * 00
     */
    public static final int MOVE32_16 = 57;

    /**
     * 01
     */
    public static final int MOVE32_32 = 58;

    /**
     * 10
     */
    public static final int MOVE32_F = 59;

    /**
     * 11
     * 
     * MOVEF_                  11..
     */
    public static final int MOVEF_8 = 60;

    /**
     * 00
     */
    public static final int MOVEF_16 = 61;

    /**
     * 01
     */
    public static final int MOVEF_32 = 62;

    /**
     * 10
     */
    public static final int MOVEF_F = 63;

    /**
     * 11
     * 
     * \endverbatim \ref cBranch "BRANCH" \verbatim
     * 
     * BRANCH                          010000..
     */
    public static final int JR = 64;

    /**
     * 00
     */
    public static final int JR_FALSE = 65;

    /**
     * 01
     */
    public static final int JR_TRUE = 66;

    /**
     * 10
     */
    public static final int JR_NAN = 67;

    /**
     * 11
     * 
     * \endverbatim \ref cCompare "COMPARE" \verbatim
     * 
     * COMPARE                         010.....
     * 
     * CP_LT                  001..
     */
    public static final int CP_LT8 = 68;

    /**
     * 00
     */
    public static final int CP_LT16 = 69;

    /**
     * 01
     */
    public static final int CP_LT32 = 70;

    /**
     * 10
     */
    public static final int CP_LTF = 71;

    /**
     * 11
     * 
     * CP_GT                  010..
     */
    public static final int CP_GT8 = 72;

    /**
     * 00
     */
    public static final int CP_GT16 = 73;

    /**
     * 01
     */
    public static final int CP_GT32 = 74;

    /**
     * 10
     */
    public static final int CP_GTF = 75;

    /**
     * 11
     * 
     * CP_EQ                  011..
     */
    public static final int CP_EQ8 = 76;

    /**
     * 00
     */
    public static final int CP_EQ16 = 77;

    /**
     * 01
     */
    public static final int CP_EQ32 = 78;

    /**
     * 10
     */
    public static final int CP_EQF = 79;

    /**
     * 11
     * 
     * CP_NEQ                 100..
     */
    public static final int CP_NEQ8 = 80;

    /**
     * 00
     */
    public static final int CP_NEQ16 = 81;

    /**
     * 01
     */
    public static final int CP_NEQ32 = 82;

    /**
     * 10
     */
    public static final int CP_NEQF = 83;

    /**
     * 11
     * 
     * CP_LTEQ                101..
     */
    public static final int CP_LTEQ8 = 84;

    /**
     * 00
     */
    public static final int CP_LTEQ16 = 85;

    /**
     * 01
     */
    public static final int CP_LTEQ32 = 86;

    /**
     * 10
     */
    public static final int CP_LTEQF = 87;

    /**
     * 11
     * 
     * CP_GTEQ                110..
     */
    public static final int CP_GTEQ8 = 88;

    /**
     * 00
     */
    public static final int CP_GTEQ16 = 89;

    /**
     * 01
     */
    public static final int CP_GTEQ32 = 90;

    /**
     * 10
     */
    public static final int CP_GTEQF = 91;

    /**
     * 11
     * 
     * \endverbatim \ref Select "SELECT" \verbatim
     * 
     * SELECT                          010111..
     */
    public static final int SELECT8 = 92;

    /**
     * 00
     */
    public static final int SELECT16 = 93;

    /**
     * 01
     */
    public static final int SELECT32 = 94;

    /**
     * 10
     */
    public static final int SELECTF = 95;

    /**
     * 11
     * 
     * \endverbatim \ref VM \verbatim
     */
    public static final int SYSTEM = 96;

    public static final int PORT_CNV_OUTPUT = 97;

    public static final int PORT_CNV_INPUT = 98;

    public static final int NOTE_TO_FREQ = 99;

    /**
     * \endverbatim \ref cBranch "BRANCH" \verbatim
     * 
     * BRANCH                          011000..
     * 
     * ?       00
     * 
     * ?       01
     * 
     * ?       10
     * 
     * ?       11
     * 
     * JR_LT                  001..
     */
    public static final int JR_LT8 = 100;

    /**
     * 00
     */
    public static final int JR_LT16 = 101;

    /**
     * 01
     */
    public static final int JR_LT32 = 102;

    /**
     * 10
     */
    public static final int JR_LTF = 103;

    /**
     * 11
     * 
     * JR_GT                  010..
     */
    public static final int JR_GT8 = 104;

    /**
     * 00
     */
    public static final int JR_GT16 = 105;

    /**
     * 01
     */
    public static final int JR_GT32 = 106;

    /**
     * 10
     */
    public static final int JR_GTF = 107;

    /**
     * 11
     * 
     * JR_EQ                  011..
     */
    public static final int JR_EQ8 = 108;

    /**
     * 00
     */
    public static final int JR_EQ16 = 109;

    /**
     * 01
     */
    public static final int JR_EQ32 = 110;

    /**
     * 10
     */
    public static final int JR_EQF = 111;

    /**
     * 11
     * 
     * JR_NEQ                 100..
     */
    public static final int JR_NEQ8 = 112;

    /**
     * 00
     */
    public static final int JR_NEQ16 = 113;

    /**
     * 01
     */
    public static final int JR_NEQ32 = 114;

    /**
     * 10
     */
    public static final int JR_NEQF = 115;

    /**
     * 11
     * 
     * JR_LTEQ                101..
     */
    public static final int JR_LTEQ8 = 116;

    /**
     * 00
     */
    public static final int JR_LTEQ16 = 117;

    /**
     * 01
     */
    public static final int JR_LTEQ32 = 118;

    /**
     * 10
     */
    public static final int JR_LTEQF = 119;

    /**
     * 11
     * 
     * JR_GTEQ                110..
     */
    public static final int JR_GTEQ8 = 120;

    /**
     * 00
     */
    public static final int JR_GTEQ16 = 121;

    /**
     * 01
     */
    public static final int JR_GTEQ32 = 122;

    /**
     * 10
     */
    public static final int JR_GTEQF = 123;

    /**
     * 11
     * 
     * \endverbatim \ref VM \verbatim
     */
    public static final int INFO = 124;

    /**
     * 01111100
     */
    public static final int STRINGS = 125;

    /**
     * 01111101
     */
    public static final int MEMORY_WRITE = 126;

    /**
     * 01111110
     */
    public static final int MEMORY_READ = 127;

    /**
     * 01111111
     * 
     * SYSTEM                          1.......
     * 
     * \endverbatim \ref cUi "UI" \verbatim
     * 
     * UI                              100000..
     */
    public static final int UI_FLUSH = 128;

    /**
     * 00
     */
    public static final int UI_READ = 129;

    /**
     * 01
     */
    public static final int UI_WRITE = 130;

    /**
     * 10
     */
    public static final int UI_BUTTON = 131;

    /**
     * 11
     */
    public static final int UI_DRAW = 132;

    /**
     * 10000100
     * 
     * \endverbatim \ref cTimer "TIMER" \verbatim
     */
    public static final int TIMER_WAIT = 133;

    /**
     * 10000101
     */
    public static final int TIMER_READY = 134;

    /**
     * 10000110
     */
    public static final int TIMER_READ = 135;

    /**
     * 10000111
     * 
     * \endverbatim \ref VM \verbatim
     * 
     * BREAKPOINT                      10001...
     */
    public static final int BP0 = 136;

    /**
     * 000
     */
    public static final int BP1 = 137;

    /**
     * 001
     */
    public static final int BP2 = 138;

    /**
     * 010
     */
    public static final int BP3 = 139;

    /**
     * 011
     */
    public static final int BP_SET = 140;

    /**
     * 10001100
     */
    public static final int MATH = 141;

    /**
     * 10001101
     */
    public static final int RANDOM = 142;

    /**
     * 10001110
     * 
     * \endverbatim \ref cTimer "TIMER" \verbatim
     */
    public static final int TIMER_READ_US = 143;

    /**
     * 10001111
     * 
     * \endverbatim \ref cUi "UI" \verbatim
     */
    public static final int KEEP_ALIVE = 144;

    /**
     * 10010000
     * 
     * \endverbatim \ref cCom "COM" \verbatim
     * 
     * 100100
     */
    public static final int COM_READ = 145;

    /**
     * 01
     */
    public static final int COM_WRITE = 146;

    /**
     * 10
     * 
     * \endverbatim \ref cSound "SOUND" \verbatim
     * 
     * 100101
     */
    public static final int SOUND = 148;

    /**
     * 00
     */
    public static final int SOUND_TEST = 149;

    /**
     * 01
     */
    public static final int SOUND_READY = 150;

    /**
     * 10
     * 
     * \endverbatim \ref cInput "INPUT" \verbatim
     */
    public static final int INPUT_SAMPLE = 151;

    /**
     * 10010111
     * 
     * 10011...
     */
    public static final int INPUT_DEVICE_LIST = 152;

    /**
     * 000
     */
    public static final int INPUT_DEVICE = 153;

    /**
     * 001
     */
    public static final int INPUT_READ = 154;

    /**
     * 010
     */
    public static final int INPUT_TEST = 155;

    /**
     * 011
     */
    public static final int INPUT_READY = 156;

    /**
     * 100
     */
    public static final int INPUT_READSI = 157;

    /**
     * 101
     */
    public static final int INPUT_READEXT = 158;

    /**
     * 110
     */
    public static final int INPUT_WRITE = 159;

    /**
     * 111
     * 
     * \endverbatim \ref cOutput "OUTPUT" \verbatim
     * 
     * 101.....
     */
    public static final int OUTPUT_GET_TYPE = 160;

    /**
     * 00000
     */
    public static final int OUTPUT_SET_TYPE = 161;

    /**
     * 00001
     */
    public static final int OUTPUT_RESET = 162;

    /**
     * 00010
     */
    public static final int OUTPUT_STOP = 163;

    /**
     * 00011
     */
    public static final int OUTPUT_POWER = 164;

    /**
     * 00100
     */
    public static final int OUTPUT_SPEED = 165;

    /**
     * 00101
     */
    public static final int OUTPUT_START = 166;

    /**
     * 00110
     */
    public static final int OUTPUT_POLARITY = 167;

    /**
     * 00111
     */
    public static final int OUTPUT_READ = 168;

    /**
     * 01000
     */
    public static final int OUTPUT_TEST = 169;

    /**
     * 01001
     */
    public static final int OUTPUT_READY = 170;

    /**
     * 01010
     */
    public static final int OUTPUT_POSITION = 171;

    /**
     * 01011
     */
    public static final int OUTPUT_STEP_POWER = 172;

    /**
     * 01100
     */
    public static final int OUTPUT_TIME_POWER = 173;

    /**
     * 01101
     */
    public static final int OUTPUT_STEP_SPEED = 174;

    /**
     * 01110
     */
    public static final int OUTPUT_TIME_SPEED = 175;

    /**
     * 01111
     */
    public static final int OUTPUT_STEP_SYNC = 176;

    /**
     * 10000
     */
    public static final int OUTPUT_TIME_SYNC = 177;

    /**
     * 10001
     */
    public static final int OUTPUT_CLR_COUNT = 178;

    /**
     * 10010
     */
    public static final int OUTPUT_GET_COUNT = 179;

    /**
     * 10011
     */
    public static final int OUTPUT_PRG_STOP = 180;

    /**
     * 10100
     * 
     * \endverbatim \ref cMemory "MEMORY" \verbatim
     * 
     * 11000...
     */
    public static final int FILE = 192;

    /**
     * 000
     */
    public static final int ARRAY = 193;

    /**
     * 001
     */
    public static final int ARRAY_WRITE = 194;

    /**
     * 010
     */
    public static final int ARRAY_READ = 195;

    /**
     * 011
     */
    public static final int ARRAY_APPEND = 196;

    /**
     * 100
     */
    public static final int MEMORY_USAGE = 197;

    /**
     * 101
     */
    public static final int FILENAME = 198;

    /**
     * 110
     * 
     * \endverbatim \ref cMove "READ" \verbatim
     * 
     * 110010..
     */
    public static final int READ8 = 200;

    /**
     * 00
     */
    public static final int READ16 = 201;

    /**
     * 01
     */
    public static final int READ32 = 202;

    /**
     * 10
     */
    public static final int READF = 203;

    /**
     * 11
     * 
     * \endverbatim \ref cMove "WRITE" \verbatim
     * 
     * 110011..
     */
    public static final int WRITE8 = 204;

    /**
     * 00
     */
    public static final int WRITE16 = 205;

    /**
     * 01
     */
    public static final int WRITE32 = 206;

    /**
     * 10
     */
    public static final int WRITEF = 207;

    /**
     * 11
     * 
     * \endverbatim \ref cCom "COM" \verbatim
     * 
     * 11010...
     */
    public static final int COM_READY = 208;

    /**
     * 000
     */
    public static final int COM_READDATA = 209;

    /**
     * 001
     */
    public static final int COM_WRITEDATA = 210;

    /**
     * 010
     */
    public static final int COM_GET = 211;

    /**
     * 011
     */
    public static final int COM_SET = 212;

    /**
     * 100
     */
    public static final int COM_TEST = 213;

    /**
     * 101
     */
    public static final int COM_REMOVE = 214;

    /**
     * 110
     */
    public static final int COM_WRITEFILE = 215;

    /**
     * 111
     * 
     * 11011...
     */
    public static final int MAILBOX_OPEN = 216;

    /**
     * 000
     */
    public static final int MAILBOX_WRITE = 217;

    /**
     * 001
     */
    public static final int MAILBOX_READ = 218;

    /**
     * 010
     */
    public static final int MAILBOX_TEST = 219;

    /**
     * 011
     */
    public static final int MAILBOX_READY = 220;

    /**
     * 100
     */
    public static final int MAILBOX_CLOSE = 221;

    /**
     * 101
     * 
     * SPARE                           111.....
     * 
     * \endverbatim \ref TST \verbatim
     */
    public static final int TST = 255;

    public static final class InputDevice {
        public static final int GET_FORMAT = 2;
        public static final int CAL_MINMAX = 3;
        public static final int CAL_DEFAULT = 4;
        public static final int GET_TYPEMODE = 5;
        public static final int GET_SYMBOL = 6;
        public static final int CAL_MIN = 7;
        public static final int CAL_MAX = 8;
        public static final int SETUP = 9;
        public static final int CLR_ALL = 10;
        public static final int GET_RAW = 11;
        public static final int GET_CONNECTION = 12;
        public static final int STOP_ALL = 13;
        public static final int GET_NAME = 21;
        public static final int GET_MODENAME = 22;
        public static final int SET_RAW = 23;
        public static final int GET_FIGURES = 24;
        public static final int GET_CHANGES = 25;
        public static final int CLR_CHANGES = 26;
        public static final int READY_PCT = 27;
        public static final int READY_RAW = 28;
        public static final int READY_SI = 29;
        public static final int GET_MINMAX = 30;
        public static final int GET_BUMPS = 31;
        public static final int INPUT_DEVICESUBCODES = 32;
    }

    public static final class ComRead {
        public static final int COMMAND = 14;
        public static final int COM_READ_SUBCODES = 15;
    }

    /**
     * MUST BE GREATER OR EQUAL TO "ARRAY_SUBCODES"
     */
    public static final class Filename {
        public static final int EXIST = 16;
        /**
         * MUST BE GREATER OR EQUAL TO "ARRAY_SUBCODES"
         */
        public static final int TOTALSIZE = 17;
        public static final int SPLIT = 18;
        public static final int MERGE = 19;
        public static final int CHECK = 20;
        public static final int PACK = 21;
        public static final int UNPACK = 22;
        public static final int GET_FOLDERNAME = 23;
        public static final int FILENAME_SUBCODES = 24;
    }

    public static final class Array {
        public static final int DELETE = 0;
        public static final int CREATE8 = 1;
        public static final int CREATE16 = 2;
        public static final int CREATE32 = 3;
        public static final int CREATEF = 4;
        public static final int RESIZE = 5;
        public static final int FILL = 6;
        public static final int COPY = 7;
        public static final int INIT8 = 8;
        public static final int INIT16 = 9;
        public static final int INIT32 = 10;
        public static final int INITF = 11;
        public static final int SIZE = 12;
        public static final int READ_CONTENT = 13;
        public static final int WRITE_CONTENT = 14;
        public static final int READ_SIZE = 15;
        public static final int ARRAY_SUBCODES = 16;
    }

    public static final class File {
        public static final int OPEN_APPEND = 0;
        public static final int OPEN_READ = 1;
        public static final int OPEN_WRITE = 2;
        public static final int READ_VALUE = 3;
        public static final int WRITE_VALUE = 4;
        public static final int READ_TEXT = 5;
        public static final int WRITE_TEXT = 6;
        public static final int CLOSE = 7;
        public static final int LOAD_IMAGE = 8;
        public static final int GET_HANDLE = 9;
        public static final int MAKE_FOLDER = 10;
        public static final int GET_POOL = 11;
        public static final int SET_LOG_SYNC_TIME = 12;
        public static final int GET_FOLDERS = 13;
        public static final int GET_LOG_SYNC_TIME = 14;
        public static final int GET_SUBFOLDER_NAME = 15;
        public static final int WRITE_LOG = 16;
        public static final int CLOSE_LOG = 17;
        public static final int GET_IMAGE = 18;
        public static final int GET_ITEM = 19;
        public static final int GET_CACHE_FILES = 20;
        public static final int PUT_CACHE_FILE = 21;
        public static final int GET_CACHE_FILE = 22;
        public static final int DEL_CACHE_FILE = 23;
        public static final int DEL_SUBFOLDER = 24;
        public static final int GET_LOG_NAME = 25;
        public static final int OPEN_LOG = 27;
        public static final int READ_BYTES = 28;
        public static final int WRITE_BYTES = 29;
        public static final int REMOVE = 30;
        public static final int MOVE = 31;
        public static final int FILE_SUBCODES = 32;
    }

    public static final class Sound {
        public static final int BREAK = 0;
        public static final int TONE = 1;
        public static final int PLAY = 2;
        public static final int REPEAT = 3;
        public static final int SERVICE = 4;
        public static final int SOUND_SUBCODES = 5;
    }

    /**
     * Set, Get
     * 
     * Set, Get
     * 
     * Get
     * 
     * Set, Get
     * 
     * Get
     * 
     * Get
     * 
     * Get
     * 
     * Get
     */
    public static final class ComGet {
        public static final int GET_ON_OFF = 1;
        /**
         * Set, Get
         */
        public static final int GET_VISIBLE = 2;
        /**
         * Set, Get
         */
        public static final int GET_RESULT = 4;
        /**
         * Get
         */
        public static final int GET_PIN = 5;
        /**
         * Set, Get
         */
        public static final int SEARCH_ITEMS = 8;
        /**
         * Get
         */
        public static final int SEARCH_ITEM = 9;
        /**
         * Get
         */
        public static final int FAVOUR_ITEMS = 10;
        /**
         * Get
         */
        public static final int FAVOUR_ITEM = 11;
        /**
         * Get
         */
        public static final int GET_ID = 12;
        public static final int GET_BRICKNAME = 13;
        public static final int GET_NETWORK = 14;
        public static final int GET_PRESENT = 15;
        public static final int GET_ENCRYPT = 16;
        public static final int CONNEC_ITEMS = 17;
        public static final int CONNEC_ITEM = 18;
        public static final int GET_INCOMING = 19;
        public static final int GET_MODE2 = 20;
        public static final int COM_GET_SUBCODES = 21;
    }

    /**
     * MUST BE GREATER OR EQUAL TO "INFO_SUBCODES"
     */
    public static final class Test {
        /**
         * Maximum number of math functions supported by the VM
         */
        public static final int OPEN = 10;
        /**
         * MUST BE GREATER OR EQUAL TO "INFO_SUBCODES"
         */
        public static final int CLOSE = 11;
        public static final int READ_PINS = 12;
        public static final int WRITE_PINS = 13;
        public static final int READ_ADC = 14;
        public static final int WRITE_UART = 15;
        public static final int READ_UART = 16;
        public static final int ENABLE_UART = 17;
        public static final int DISABLE_UART = 18;
        public static final int ACCU_SWITCH = 19;
        public static final int BOOT_MODE2 = 20;
        public static final int POLL_MODE2 = 21;
        public static final int CLOSE_MODE2 = 22;
        public static final int RAM_CHECK = 23;
        public static final int SUBCODES = 24;
    }

    /**
     * VM
     * 
     * VM
     * 
     * VM
     * 
     * VM
     * 
     * VM
     * 
     * VM
     */
    public static final class ProgramInfo {
        public static final int OBJ_STOP = 0;
        /**
         * VM
         */
        public static final int OBJ_START = 4;
        /**
         * VM
         */
        public static final int GET_STATUS = 22;
        /**
         * VM
         */
        public static final int GET_SPEED = 23;
        /**
         * VM
         */
        public static final int GET_PRGRESULT = 24;
        /**
         * VM
         */
        public static final int SET_INSTR = 25;
        /**
         * VM
         */
        public static final int PROGRAM_INFO_SUBCODES = 26;
    }

    public static final class UIButton {
        public static final int SHORTPRESS = 1;
        public static final int LONGPRESS = 2;
        public static final int WAIT_FOR_PRESS = 3;
        public static final int FLUSH = 4;
        public static final int PRESS = 5;
        public static final int RELEASE = 6;
        public static final int GET_HORZ = 7;
        public static final int GET_VERT = 8;
        public static final int PRESSED = 9;
        public static final int SET_BACK_BLOCK = 10;
        public static final int GET_BACK_BLOCK = 11;
        public static final int TESTSHORTPRESS = 12;
        public static final int TESTLONGPRESS = 13;
        public static final int GET_BUMBED = 14;
        public static final int GET_CLICK = 15;
        public static final int UI_BUTTON_SUBCODES = 16;
    }

    public static final class UIWrite {
        public static final int WRITE_FLUSH = 1;
        public static final int FLOATVALUE = 2;
        public static final int STAMP = 3;
        public static final int PUT_STRING = 8;
        public static final int VALUE8 = 9;
        public static final int VALUE16 = 10;
        public static final int VALUE32 = 11;
        public static final int VALUEF = 12;
        public static final int ADDRESS = 13;
        public static final int CODE = 14;
        public static final int DOWNLOAD_END = 15;
        public static final int SCREEN_BLOCK = 16;
        public static final int TEXTBOX_APPEND = 21;
        public static final int SET_BUSY = 22;
        public static final int SET_TESTPIN = 24;
        public static final int INIT_RUN = 25;
        public static final int UPDATE_RUN = 26;
        public static final int LED = 27;
        public static final int POWER = 29;
        public static final int GRAPH_SAMPLE = 30;
        public static final int TERMINAL = 31;
        public static final int UI_WRITE_SUBCODES = 32;
    }

    public static final class UIRead {
        /**
         * 11111111
         */
        public static final int GET_VBATT = 1;
        public static final int GET_IBATT = 2;
        public static final int GET_OS_VERS = 3;
        public static final int GET_EVENT = 4;
        public static final int GET_TBATT = 5;
        public static final int GET_IINT = 6;
        public static final int GET_IMOTOR = 7;
        public static final int GET_STRING = 8;
        public static final int GET_HW_VERS = 9;
        public static final int GET_FW_VERS = 10;
        public static final int GET_FW_BUILD = 11;
        public static final int GET_OS_BUILD = 12;
        public static final int GET_ADDRESS = 13;
        public static final int GET_CODE = 14;
        public static final int KEY = 15;
        public static final int GET_SHUTDOWN = 16;
        public static final int GET_WARNING = 17;
        public static final int GET_LBATT = 18;
        public static final int TEXTBOX_READ = 21;
        public static final int GET_VERSION = 26;
        public static final int GET_IP = 27;
        public static final int GET_POWER = 29;
        public static final int GET_SDCARD = 30;
        public static final int GET_USBSTICK = 31;
        public static final int UI_READ_SUBCODES = 32;
    }

    public static final class UIDraw {
        public static final int UPDATE = 0;
        public static final int CLEAN = 1;
        public static final int PIXEL = 2;
        public static final int LINE = 3;
        public static final int CIRCLE = 4;
        public static final int TEXT = 5;
        public static final int ICON = 6;
        public static final int PICTURE = 7;
        public static final int VALUE = 8;
        public static final int FILLRECT = 9;
        public static final int RECT = 10;
        public static final int NOTIFICATION = 11;
        public static final int QUESTION = 12;
        public static final int KEYBOARD = 13;
        public static final int BROWSE = 14;
        public static final int VERTBAR = 15;
        public static final int INVERSERECT = 16;
        public static final int SELECT_FONT = 17;
        public static final int TOPLINE = 18;
        public static final int FILLWINDOW = 19;
        public static final int SCROLL = 20;
        public static final int DOTLINE = 21;
        public static final int VIEW_VALUE = 22;
        public static final int VIEW_UNIT = 23;
        public static final int FILLCIRCLE = 24;
        public static final int STORE = 25;
        public static final int RESTORE = 26;
        public static final int ICON_QUESTION = 27;
        public static final int BMPFILE = 28;
        public static final int POPUP = 29;
        public static final int GRAPH_SETUP = 30;
        public static final int GRAPH_DRAW = 31;
        public static final int TEXTBOX = 32;
        public static final int UI_DRAW_SUBCODES = 33;
    }

    /**
     * VM       get string size
     * 
     * VM       add two strings
     * 
     * VM       compare two strings
     * 
     * VM       duplicate one string to another
     */
    public static final class String {
        public static final int GET_SIZE = 1;
        /**
         * VM       get string size
         */
        public static final int ADD = 2;
        /**
         * VM       add two strings
         */
        public static final int COMPARE = 3;
        /**
         * VM       compare two strings
         */
        public static final int DUPLICATE = 5;
        /**
         * VM       duplicate one string to another
         */
        public static final int VALUE_TO_STRING = 6;
        public static final int STRING_TO_VALUE = 7;
        public static final int STRIP = 8;
        public static final int NUMBER_TO_STRING = 9;
        public static final int SUB = 10;
        public static final int VALUE_FORMATTED = 11;
        public static final int NUMBER_FORMATTED = 12;
        public static final int STRING_SUBCODES = 13;
    }

    public static final class Info {
        public static final int SET_ERROR = 1;
        public static final int GET_ERROR = 2;
        public static final int ERRORTEXT = 3;
        public static final int GET_VOLUME = 4;
        public static final int SET_VOLUME = 5;
        public static final int GET_MINUTES = 6;
        public static final int SET_MINUTES = 7;
        public static final int INFO_SUBCODES = 8;
    }

    /**
     * Set, Get
     * 
     * Set, Get
     * 
     * Set
     * 
     * Set, Get
     * 
     * Set
     * 
     * Set
     */
    public static final class ComSet {
        public static final int SET_ON_OFF = 1;
        /**
         * Set, Get
         */
        public static final int SET_VISIBLE = 2;
        /**
         * Set, Get
         */
        public static final int SET_SEARCH = 3;
        /**
         * Set
         */
        public static final int SET_PIN = 5;
        /**
         * Set, Get
         */
        public static final int SET_PASSKEY = 6;
        /**
         * Set
         */
        public static final int SET_CONNECTION = 7;
        /**
         * Set
         */
        public static final int SET_BRICKNAME = 8;
        public static final int SET_MOVEUP = 9;
        public static final int SET_MOVEDOWN = 10;
        public static final int SET_ENCRYPT = 11;
        public static final int SET_SSID = 12;
        public static final int SET_MODE2 = 13;
        public static final int COM_SET_SUBCODES = 14;
    }

    public static final class ComWrite {
        public static final int REPLY = 14;
        public static final int COM_WRITE_SUBCODES = 15;
    }

}
