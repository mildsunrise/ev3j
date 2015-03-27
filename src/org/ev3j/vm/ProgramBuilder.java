package org.ev3j.vm;

/**
 * TODO
 */
public class ProgramBuilder extends ProgramBuilderBase {

    public ProgramBuilder ERROR() {
        write(org.ev3j.vm.constants.Opcode.ERROR);
        return this;
    }

    public ProgramBuilder NOP() {
        write(org.ev3j.vm.constants.Opcode.NOP);
        return this;
    }

    public ProgramBuilder PROGRAM_STOP(Object p1) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_STOP);
        echo(p1);
        return this;
    }

    public ProgramBuilder PROGRAM_START(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_START);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder OBJECT_STOP(Object p1) {
        write(org.ev3j.vm.constants.Opcode.OBJECT_STOP);
        echo(p1);
        return this;
    }

    public ProgramBuilder OBJECT_START(Object p1) {
        write(org.ev3j.vm.constants.Opcode.OBJECT_START);
        echo(p1);
        return this;
    }

    public ProgramBuilder OBJECT_TRIG(Object p1) {
        write(org.ev3j.vm.constants.Opcode.OBJECT_TRIG);
        echo(p1);
        return this;
    }

    public ProgramBuilder OBJECT_WAIT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.OBJECT_WAIT);
        echo(p1);
        return this;
    }

    public ProgramBuilder RETURN() {
        write(org.ev3j.vm.constants.Opcode.RETURN);
        return this;
    }

    public ProgramBuilder OBJECT_END() {
        write(org.ev3j.vm.constants.Opcode.OBJECT_END);
        return this;
    }

    public ProgramBuilder SLEEP() {
        write(org.ev3j.vm.constants.Opcode.SLEEP);
        return this;
    }

    public ProgramBuilder OBJ_STOP(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.OBJ_STOP));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder OBJ_START(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.OBJ_START));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_STATUS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.GET_STATUS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_SPEED(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.GET_SPEED));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_PRGRESULT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.GET_PRGRESULT));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_INSTR(Object p1) {
        write(org.ev3j.vm.constants.Opcode.PROGRAM_INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.ProgramInfo.SET_INSTR));
        echo(p1);
        return this;
    }

    public ProgramBuilder LABEL(Object p1) {
        write(org.ev3j.vm.constants.Opcode.LABEL);
        echo(p1);
        return this;
    }

    public ProgramBuilder PROBE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.PROBE);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder DO(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.DO);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

//    Math

    public ProgramBuilder ADD8(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.ADD8);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder ADD16(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.ADD16);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder ADD32(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.ADD32);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder ADDF(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.ADDF);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder SUB8(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.SUB8);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder SUB16(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.SUB16);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder SUB32(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.SUB32);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder SUBF(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.SUBF);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder MUL8(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MUL8);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder MUL16(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MUL16);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder MUL32(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MUL32);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder MULF(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MULF);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder DIV8(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.DIV8);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder DIV16(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.DIV16);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder DIV32(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.DIV32);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

    public ProgramBuilder DIVF(Object source1, Object source2, Object destination) {
        write(org.ev3j.vm.constants.Opcode.DIVF);
        echo(source1);
        echo(source2);
        echo(destination);
        return this;
    }

//    Logic

    public ProgramBuilder OR8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OR8);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder OR16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OR16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder OR32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OR32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder AND8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.AND8);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder AND16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.AND16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder AND32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.AND32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder XOR8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.XOR8);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder XOR16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.XOR16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder XOR32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.XOR32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder RL8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.RL8);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder RL16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.RL16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder RL32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.RL32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

//    Move

    public ProgramBuilder MOVE8_8(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE8_8);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE8_16(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE8_16);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE8_32(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE8_32);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE8_F(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE8_F);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE16_8(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE16_8);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE16_16(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE16_16);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE16_32(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE16_32);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE16_F(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE16_F);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE32_8(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE32_8);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE32_16(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE32_16);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE32_32(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE32_32);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVE32_F(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVE32_F);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVEF_8(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVEF_8);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVEF_16(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVEF_16);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVEF_32(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVEF_32);
        echo(source);
        echo(destination);
        return this;
    }

    public ProgramBuilder MOVEF_F(Object source, Object destination) {
        write(org.ev3j.vm.constants.Opcode.MOVEF_F);
        echo(source);
        echo(destination);
        return this;
    }

//    Branch

    public ProgramBuilder JR(Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_FALSE(Object flag, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_FALSE);
        echo(flag);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_TRUE(Object flag, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_TRUE);
        echo(flag);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_NAN(Object value, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_NAN);
        echo(value);
        echo(offset);
        return this;
    }

//    Compare

    public ProgramBuilder CP_LT8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LT8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LT16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LT16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LT32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LT32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LTF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LTF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GT8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GT8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GT16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GT16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GT32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GT32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GTF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GTF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_EQ8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_EQ8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_EQ16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_EQ16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_EQ32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_EQ32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_EQF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_EQF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_NEQ8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_NEQ8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_NEQ16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_NEQ16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_NEQ32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_NEQ32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_NEQF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_NEQF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LTEQ8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LTEQ8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LTEQ16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LTEQ16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LTEQ32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LTEQ32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_LTEQF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_LTEQF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GTEQ8(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GTEQ8);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GTEQ16(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GTEQ16);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GTEQ32(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GTEQ32);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

    public ProgramBuilder CP_GTEQF(Object left, Object right, Object flag) {
        write(org.ev3j.vm.constants.Opcode.CP_GTEQF);
        echo(left);
        echo(right);
        echo(flag);
        return this;
    }

//    Select

    public ProgramBuilder SELECT8(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.SELECT8);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SELECT16(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.SELECT16);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SELECT32(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.SELECT32);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SELECTF(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.SELECTF);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }



    public ProgramBuilder SYSTEM(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.SYSTEM);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder PORT_CNV_OUTPUT(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.PORT_CNV_OUTPUT);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder PORT_CNV_INPUT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.PORT_CNV_INPUT);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder NOTE_TO_FREQ(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.NOTE_TO_FREQ);
        echo(p1);
        echo(p2);
        return this;
    }



//    Branch

    public ProgramBuilder JR_LT8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LT8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LT16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LT16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LT32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LT32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LTF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LTF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GT8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GT8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GT16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GT16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GT32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GT32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GTF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GTF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_EQ8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_EQ8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_EQ16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_EQ16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_EQ32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_EQ32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_EQF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_EQF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_NEQ8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_NEQ8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_NEQ16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_NEQ16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_NEQ32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_NEQ32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_NEQF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_NEQF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LTEQ8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LTEQ8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LTEQ16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LTEQ16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LTEQ32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LTEQ32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_LTEQF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_LTEQF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GTEQ8(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GTEQ8);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GTEQ16(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GTEQ16);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GTEQ32(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GTEQ32);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

    public ProgramBuilder JR_GTEQF(Object left, Object right, Object offset) {
        write(org.ev3j.vm.constants.Opcode.JR_GTEQF);
        echo(left);
        echo(right);
        echo(offset);
        return this;
    }

//    VM

    public ProgramBuilder SET_ERROR(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.SET_ERROR));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_ERROR(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.GET_ERROR));
        echo(p1);
        return this;
    }

    public ProgramBuilder ERRORTEXT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.ERRORTEXT));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_VOLUME(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.GET_VOLUME));
        echo(p1);
        return this;
    }

    public ProgramBuilder SET_VOLUME(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.SET_VOLUME));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_MINUTES(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.GET_MINUTES));
        echo(p1);
        return this;
    }

    public ProgramBuilder SET_MINUTES(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INFO);
        write(number((byte) org.ev3j.vm.constants.Opcode.Info.SET_MINUTES));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_SIZE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.GET_SIZE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ADD(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.ADD));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder COMPARE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.COMPARE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder DUPLICATE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.DUPLICATE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder VALUE_TO_STRING(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.VALUE_TO_STRING));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder STRING_TO_VALUE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.STRING_TO_VALUE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder STRIP(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.STRIP));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder NUMBER_TO_STRING(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.NUMBER_TO_STRING));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SUB(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.SUB));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder VALUE_FORMATTED(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.VALUE_FORMATTED));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder NUMBER_FORMATTED(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.STRINGS);
        write(number((byte) org.ev3j.vm.constants.Opcode.String.NUMBER_FORMATTED));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder MEMORY_WRITE(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.MEMORY_WRITE);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder MEMORY_READ(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.MEMORY_READ);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

//    UI

    public ProgramBuilder UI_FLUSH() {
        write(org.ev3j.vm.constants.Opcode.UI_FLUSH);
        return this;
    }

    public ProgramBuilder GET_VBATT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_VBATT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_IBATT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_IBATT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_OS_VERS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_OS_VERS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_EVENT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_EVENT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_TBATT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_TBATT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_IINT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_IINT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_IMOTOR(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_IMOTOR));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_STRING(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_STRING));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder KEY(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.KEY));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_SHUTDOWN(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_SHUTDOWN));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_WARNING(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_WARNING));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_LBATT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_LBATT));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_ADDRESS(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_ADDRESS));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_CODE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_CODE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder TEXTBOX_READ(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.TEXTBOX_READ));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        return this;
    }

    public ProgramBuilder GET_HW_VERS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_HW_VERS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_FW_VERS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_FW_VERS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_FW_BUILD(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_FW_BUILD));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_OS_BUILD(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_OS_BUILD));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_VERSION(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_VERSION));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_IP(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_IP));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_SDCARD(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_SDCARD));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_USBSTICK(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.UI_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIRead.GET_USBSTICK));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE_FLUSH() {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.WRITE_FLUSH));
        return this;
    }

    public ProgramBuilder FLOATVALUE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.FLOATVALUE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder STAMP(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.STAMP));
        echo(p1);
        return this;
    }

    public ProgramBuilder PUT_STRING(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.PUT_STRING));
        echo(p1);
        return this;
    }

    public ProgramBuilder CODE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.CODE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder DOWNLOAD_END() {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.DOWNLOAD_END));
        return this;
    }

    public ProgramBuilder SCREEN_BLOCK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.SCREEN_BLOCK));
        echo(p1);
        return this;
    }

    public ProgramBuilder TEXTBOX_APPEND(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.TEXTBOX_APPEND));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SET_BUSY(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.SET_BUSY));
        echo(p1);
        return this;
    }

    public ProgramBuilder VALUE8(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.VALUE8));
        echo(p1);
        return this;
    }

    public ProgramBuilder VALUE16(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.VALUE16));
        echo(p1);
        return this;
    }

    public ProgramBuilder VALUE32(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.VALUE32));
        echo(p1);
        return this;
    }

    public ProgramBuilder VALUEF(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.VALUEF));
        echo(p1);
        return this;
    }

    public ProgramBuilder INIT_RUN() {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.INIT_RUN));
        return this;
    }

    public ProgramBuilder UPDATE_RUN() {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.UPDATE_RUN));
        return this;
    }

    public ProgramBuilder LED(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.LED));
        echo(p1);
        return this;
    }

    public ProgramBuilder POWER(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.POWER));
        echo(p1);
        return this;
    }

    public ProgramBuilder TERMINAL(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.TERMINAL));
        echo(p1);
        return this;
    }

    public ProgramBuilder GRAPH_SAMPLE() {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.GRAPH_SAMPLE));
        return this;
    }

    public ProgramBuilder SET_TESTPIN(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIWrite.SET_TESTPIN));
        echo(p1);
        return this;
    }

    public ProgramBuilder SHORTPRESS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.SHORTPRESS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder LONGPRESS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.LONGPRESS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder FLUSH() {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.FLUSH));
        return this;
    }

    public ProgramBuilder WAIT_FOR_PRESS() {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.WAIT_FOR_PRESS));
        return this;
    }

    public ProgramBuilder PRESS(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.PRESS));
        echo(p1);
        return this;
    }

    public ProgramBuilder RELEASE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.RELEASE));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_HORZ(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.GET_HORZ));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_VERT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.GET_VERT));
        echo(p1);
        return this;
    }

    public ProgramBuilder PRESSED(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.PRESSED));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_BACK_BLOCK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.SET_BACK_BLOCK));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_BACK_BLOCK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.GET_BACK_BLOCK));
        echo(p1);
        return this;
    }

    public ProgramBuilder TESTSHORTPRESS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.TESTSHORTPRESS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder TESTLONGPRESS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.TESTLONGPRESS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_BUMBED(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.GET_BUMBED));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_CLICK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_BUTTON);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIButton.GET_CLICK));
        echo(p1);
        return this;
    }

    public ProgramBuilder UPDATE() {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.UPDATE));
        return this;
    }

    public ProgramBuilder CLEAN() {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.CLEAN));
        return this;
    }

    public ProgramBuilder FILLRECT(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.FILLRECT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder RECT(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.RECT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder PIXEL(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.PIXEL));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder LINE(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.LINE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder CIRCLE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.CIRCLE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder TEXT(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.TEXT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder ICON(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.ICON));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder PICTURE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.PICTURE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder VALUE(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.VALUE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        return this;
    }

    public ProgramBuilder NOTIFICATION(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.NOTIFICATION));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder QUESTION(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.QUESTION));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder KEYBOARD(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.KEYBOARD));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder BROWSE(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.BROWSE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder VERTBAR(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.VERTBAR));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder INVERSERECT(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.INVERSERECT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SELECT_FONT(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.SELECT_FONT));
        echo(p1);
        return this;
    }

    public ProgramBuilder TOPLINE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.TOPLINE));
        echo(p1);
        return this;
    }

    public ProgramBuilder FILLWINDOW(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.FILLWINDOW));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SCROLL(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.SCROLL));
        echo(p1);
        return this;
    }

    public ProgramBuilder DOTLINE(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.DOTLINE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        return this;
    }

    public ProgramBuilder VIEW_VALUE(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.VIEW_VALUE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        return this;
    }

    public ProgramBuilder VIEW_UNIT(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.VIEW_UNIT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder FILLCIRCLE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.FILLCIRCLE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder STORE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.STORE));
        echo(p1);
        return this;
    }

    public ProgramBuilder RESTORE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.RESTORE));
        echo(p1);
        return this;
    }

    public ProgramBuilder ICON_QUESTION(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.ICON_QUESTION));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder BMPFILE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.BMPFILE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GRAPH_SETUP(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.GRAPH_SETUP));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder GRAPH_DRAW(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.GRAPH_DRAW));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder POPUP(Object p1) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.POPUP));
        echo(p1);
        return this;
    }

    public ProgramBuilder TEXTBOX(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.UI_DRAW);
        write(number((byte) org.ev3j.vm.constants.Opcode.UIDraw.TEXTBOX));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

//    Timer

    public ProgramBuilder TIMER_WAIT(Object time, Object timer) {
        write(org.ev3j.vm.constants.Opcode.TIMER_WAIT);
        echo(time);
        echo(timer);
        return this;
    }

    public ProgramBuilder TIMER_READY(Object timer) {
        write(org.ev3j.vm.constants.Opcode.TIMER_READY);
        echo(timer);
        return this;
    }

    public ProgramBuilder TIMER_READ(Object time) {
        write(org.ev3j.vm.constants.Opcode.TIMER_READ);
        echo(time);
        return this;
    }

//    VM

    public ProgramBuilder BP0() {
        write(org.ev3j.vm.constants.Opcode.BP0);
        return this;
    }

    public ProgramBuilder BP1() {
        write(org.ev3j.vm.constants.Opcode.BP1);
        return this;
    }

    public ProgramBuilder BP2() {
        write(org.ev3j.vm.constants.Opcode.BP2);
        return this;
    }

    public ProgramBuilder BP3() {
        write(org.ev3j.vm.constants.Opcode.BP3);
        return this;
    }

    public ProgramBuilder BP_SET(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.BP_SET);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder EXP(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.EXP));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder MOD(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.MOD));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder FLOOR(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.FLOOR));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CEIL(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.CEIL));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ROUND(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.ROUND));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ABS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.ABS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder NEGATE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.NEGATE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SQRT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.SQRT));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder LOG(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.LOG));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder LN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.LN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SIN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.SIN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder COS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.COS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder TAN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.TAN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ASIN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.ASIN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ACOS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.ACOS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder ATAN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.ATAN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder MOD8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.MOD8));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder MOD16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.MOD16));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder MOD32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.MOD32));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder POW(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.POW));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder TRUNC(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.MATH);
        write(number((byte) org.ev3j.vm.constants.MathType.TRUNC));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder RANDOM(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.RANDOM);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder TIMER_READ_US(Object time) {
        write(org.ev3j.vm.constants.Opcode.TIMER_READ_US);
        echo(time);
        return this;
    }

    public ProgramBuilder KEEP_ALIVE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.KEEP_ALIVE);
        echo(p1);
        return this;
    }

//    Com

    public ProgramBuilder COMMAND(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_READ);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComRead.COMMAND));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder REPLY(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_WRITE);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComWrite.REPLY));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

//    Sound

    public ProgramBuilder BREAK() {
        write(org.ev3j.vm.constants.Opcode.SOUND);
        write(number((byte) org.ev3j.vm.constants.Opcode.Sound.BREAK));
        return this;
    }

    public ProgramBuilder TONE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.SOUND);
        write(number((byte) org.ev3j.vm.constants.Opcode.Sound.TONE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder PLAY(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.SOUND);
        write(number((byte) org.ev3j.vm.constants.Opcode.Sound.PLAY));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder REPEAT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.SOUND);
        write(number((byte) org.ev3j.vm.constants.Opcode.Sound.REPEAT));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SERVICE() {
        write(org.ev3j.vm.constants.Opcode.SOUND);
        write(number((byte) org.ev3j.vm.constants.Opcode.Sound.SERVICE));
        return this;
    }

    public ProgramBuilder SOUND_TEST(Object p1) {
        write(org.ev3j.vm.constants.Opcode.SOUND_TEST);
        echo(p1);
        return this;
    }

    public ProgramBuilder SOUND_READY() {
        write(org.ev3j.vm.constants.Opcode.SOUND_READY);
        return this;
    }

//    Input

    public ProgramBuilder INPUT_SAMPLE(Object time, Object samples, Object init, Object devices, Object types, Object modes, Object datasets, Object values) {
        write(org.ev3j.vm.constants.Opcode.INPUT_SAMPLE);
        echo(time);
        echo(samples);
        echo(init);
        echo(devices);
        echo(types);
        echo(modes);
        echo(datasets);
        echo(values);
        return this;
    }

    public ProgramBuilder INPUT_DEVICE_LIST(Object length, Object array, Object changed) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE_LIST);
        echo(length);
        echo(array);
        echo(changed);
        return this;
    }

    public ProgramBuilder GET_TYPEMODE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_TYPEMODE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_CONNECTION(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_CONNECTION));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_NAME(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_NAME));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_SYMBOL(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_SYMBOL));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_FORMAT(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_FORMAT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        return this;
    }

    public ProgramBuilder GET_RAW(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_RAW));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_MODENAME(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_MODENAME));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder SET_RAW(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.SET_RAW));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_FIGURES(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_FIGURES));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_CHANGES(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_CHANGES));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder CLR_CHANGES(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CLR_CHANGES));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_MINMAX(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_MINMAX));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder CAL_MINMAX(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CAL_MINMAX));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder CAL_DEFAULT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CAL_DEFAULT));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CAL_MIN(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CAL_MIN));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder CAL_MAX(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CAL_MAX));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_BUMPS(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.GET_BUMPS));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SETUP(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.SETUP));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder CLR_ALL(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.CLR_ALL));
        echo(p1);
        return this;
    }

    public ProgramBuilder STOP_ALL(Object p1) {
        write(org.ev3j.vm.constants.Opcode.INPUT_DEVICE);
        write(number((byte) org.ev3j.vm.constants.Opcode.InputDevice.STOP_ALL));
        echo(p1);
        return this;
    }

    public ProgramBuilder INPUT_READ(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.INPUT_READ);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder INPUT_READSI(Object layer, Object no, Object type, Object mode, Object si) {
        write(org.ev3j.vm.constants.Opcode.INPUT_READSI);
        echo(layer);
        echo(no);
        echo(type);
        echo(mode);
        echo(si);
        return this;
    }

    public ProgramBuilder INPUT_TEST(Object layer) {
        write(org.ev3j.vm.constants.Opcode.INPUT_TEST);
        echo(layer);
        return this;
    }

    public ProgramBuilder INPUT_TEST(Object layer, Object no, Object busy) {
        write(org.ev3j.vm.constants.Opcode.INPUT_TEST);
        echo(layer);
        echo(no);
        echo(busy);
        return this;
    }

    public ProgramBuilder INPUT_READY(Object layer, Object no) {
        write(org.ev3j.vm.constants.Opcode.INPUT_READY);
        echo(layer);
        echo(no);
        return this;
    }

    public ProgramBuilder INPUT_WRITE(Object layer, Object no, Object bytes, Object data) {
        write(org.ev3j.vm.constants.Opcode.INPUT_WRITE);
        echo(layer);
        echo(no);
        echo(bytes);
        echo(data);
        return this;
    }

//    Output

    public ProgramBuilder OUTPUT_SET_TYPE(Object layer, Object no, Object type) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_SET_TYPE);
        echo(layer);
        echo(no);
        echo(type);
        return this;
    }

    public ProgramBuilder OUTPUT_RESET(Object layer, Object nos) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_RESET);
        echo(layer);
        echo(nos);
        return this;
    }

    public ProgramBuilder OUTPUT_STOP(Object layer, Object nos, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_STOP);
        echo(layer);
        echo(nos);
        echo(p3);
        return this;
    }

    public ProgramBuilder OUTPUT_SPEED(Object layer, Object nos, Object speed) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_SPEED);
        echo(layer);
        echo(nos);
        echo(speed);
        return this;
    }

    public ProgramBuilder OUTPUT_POWER(Object layer, Object nos, Object speed) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_POWER);
        echo(layer);
        echo(nos);
        echo(speed);
        return this;
    }

    public ProgramBuilder OUTPUT_START(Object layer, Object nos) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_START);
        echo(layer);
        echo(nos);
        return this;
    }

    public ProgramBuilder OUTPUT_POLARITY(Object layer, Object nos, Object pol) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_POLARITY);
        echo(layer);
        echo(nos);
        echo(pol);
        return this;
    }

    public ProgramBuilder OUTPUT_READ(Object layer, Object no, Object speed, Object tacho) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_READ);
        echo(layer);
        echo(no);
        echo(speed);
        echo(tacho);
        return this;
    }

    public ProgramBuilder OUTPUT_READY(Object layer, Object nos) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_READY);
        echo(layer);
        echo(nos);
        return this;
    }

    public ProgramBuilder OUTPUT_TEST(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_TEST);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder OUTPUT_STEP_POWER(Object layer, Object nos, Object power, Object step1, Object step2, Object step3, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_STEP_POWER);
        echo(layer);
        echo(nos);
        echo(power);
        echo(step1);
        echo(step2);
        echo(step3);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_TIME_POWER(Object layer, Object nos, Object power, Object time1, Object time2, Object time3, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_TIME_POWER);
        echo(layer);
        echo(nos);
        echo(power);
        echo(time1);
        echo(time2);
        echo(time3);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_STEP_SPEED(Object layer, Object nos, Object speed, Object step1, Object step2, Object step3, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_STEP_SPEED);
        echo(layer);
        echo(nos);
        echo(speed);
        echo(step1);
        echo(step2);
        echo(step3);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_TIME_SPEED(Object layer, Object nos, Object speed, Object step1, Object step2, Object step3, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_TIME_SPEED);
        echo(layer);
        echo(nos);
        echo(speed);
        echo(step1);
        echo(step2);
        echo(step3);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_STEP_SYNC(Object layer, Object nos, Object speed, Object turn, Object step, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_STEP_SYNC);
        echo(layer);
        echo(nos);
        echo(speed);
        echo(turn);
        echo(step);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_TIME_SYNC(Object layer, Object nos, Object speed, Object turn, Object step, Object brake) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_TIME_SYNC);
        echo(layer);
        echo(nos);
        echo(speed);
        echo(turn);
        echo(step);
        echo(brake);
        return this;
    }

    public ProgramBuilder OUTPUT_CLR_COUNT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_CLR_COUNT);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder OUTPUT_GET_COUNT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_GET_COUNT);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder OUTPUT_PRG_STOP() {
        write(org.ev3j.vm.constants.Opcode.OUTPUT_PRG_STOP);
        return this;
    }

//    Memory

    public ProgramBuilder OPEN_APPEND(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.OPEN_APPEND));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder OPEN_READ(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.OPEN_READ));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder OPEN_WRITE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.OPEN_WRITE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder READ_VALUE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.READ_VALUE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE_VALUE(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.WRITE_VALUE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder READ_TEXT(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.READ_TEXT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder WRITE_TEXT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.WRITE_TEXT));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder CLOSE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.CLOSE));
        echo(p1);
        return this;
    }

    public ProgramBuilder LOAD_IMAGE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.LOAD_IMAGE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_HANDLE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_HANDLE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder MAKE_FOLDER(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.MAKE_FOLDER));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_LOG_NAME(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_LOG_NAME));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_POOL(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_POOL));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_FOLDERS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_FOLDERS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_SUBFOLDER_NAME(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_SUBFOLDER_NAME));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder WRITE_LOG(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.WRITE_LOG));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder CLOSE_LOG(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.CLOSE_LOG));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_LOG_SYNC_TIME(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.SET_LOG_SYNC_TIME));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder DEL_SUBFOLDER(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.DEL_SUBFOLDER));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_LOG_SYNC_TIME(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_LOG_SYNC_TIME));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_IMAGE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_IMAGE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_ITEM(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_ITEM));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_CACHE_FILES(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_CACHE_FILES));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_CACHE_FILE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.GET_CACHE_FILE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder PUT_CACHE_FILE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.PUT_CACHE_FILE));
        echo(p1);
        return this;
    }

    public ProgramBuilder DEL_CACHE_FILE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.DEL_CACHE_FILE));
        echo(p1);
        return this;
    }

    public ProgramBuilder OPEN_LOG(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.OPEN_LOG));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder READ_BYTES(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.READ_BYTES));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE_BYTES(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.WRITE_BYTES));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder REMOVE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.REMOVE));
        echo(p1);
        return this;
    }

    public ProgramBuilder MOVE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILE);
        write(number((byte) org.ev3j.vm.constants.Opcode.File.MOVE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CREATE8(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.CREATE8));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CREATE16(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.CREATE16));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CREATE32(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.CREATE32));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CREATEF(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.CREATEF));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder RESIZE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.RESIZE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder DELETE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.DELETE));
        echo(p1);
        return this;
    }

    public ProgramBuilder COPY(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.COPY));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SIZE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.SIZE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder READ_CONTENT(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.READ_CONTENT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder WRITE_CONTENT(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.WRITE_CONTENT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder READ_SIZE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.ARRAY);
        write(number((byte) org.ev3j.vm.constants.Opcode.Array.READ_SIZE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder MEMORY_USAGE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MEMORY_USAGE);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder EXIST(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.EXIST));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder TOTALSIZE(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.TOTALSIZE));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SPLIT(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.SPLIT));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder MERGE(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.MERGE));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder CHECK(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.CHECK));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder PACK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.PACK));
        echo(p1);
        return this;
    }

    public ProgramBuilder UNPACK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.UNPACK));
        echo(p1);
        return this;
    }

    public ProgramBuilder GET_FOLDERNAME(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.FILENAME);
        write(number((byte) org.ev3j.vm.constants.Opcode.Filename.GET_FOLDERNAME));
        echo(p1);
        echo(p2);
        return this;
    }

//    Move

    public ProgramBuilder READ8(Object source, Object index, Object destination) {
        write(org.ev3j.vm.constants.Opcode.READ8);
        echo(source);
        echo(index);
        echo(destination);
        return this;
    }

    public ProgramBuilder READ16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.READ16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder READ32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.READ32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder READF(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.READF);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE8(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.WRITE8);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE16(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.WRITE16);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE32(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.WRITE32);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITEF(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.WRITEF);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

//    Com

    public ProgramBuilder COM_READY(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_READY);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder COM_READDATA(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_READDATA);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder COM_WRITEDATA(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_WRITEDATA);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_ON_OFF(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_ON_OFF));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_VISIBLE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_VISIBLE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_RESULT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_RESULT));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_PIN(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_PIN));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder SEARCH_ITEMS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.SEARCH_ITEMS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SEARCH_ITEM(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.SEARCH_ITEM));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        echo(p8);
        return this;
    }

    public ProgramBuilder FAVOUR_ITEMS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.FAVOUR_ITEMS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder FAVOUR_ITEM(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.FAVOUR_ITEM));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        echo(p6);
        echo(p7);
        return this;
    }

    public ProgramBuilder GET_ID(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_ID));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder GET_BRICKNAME(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_BRICKNAME));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_NETWORK(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_NETWORK));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder GET_PRESENT(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_PRESENT));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder GET_ENCRYPT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_ENCRYPT));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder CONNEC_ITEMS(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.CONNEC_ITEMS));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder CONNEC_ITEM(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.CONNEC_ITEM));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder GET_INCOMING(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_INCOMING));
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }

    public ProgramBuilder GET_MODE2(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_GET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComGet.GET_MODE2));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_ON_OFF(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_ON_OFF));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_VISIBLE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_VISIBLE));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_SEARCH(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_SEARCH));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_PIN(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_PIN));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SET_PASSKEY(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_PASSKEY));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_CONNECTION(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_CONNECTION));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SET_BRICKNAME(Object p1) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_BRICKNAME));
        echo(p1);
        return this;
    }

    public ProgramBuilder SET_MOVEUP(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_MOVEUP));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_MOVEDOWN(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_MOVEDOWN));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_ENCRYPT(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_ENCRYPT));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder SET_SSID(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_SSID));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder SET_MODE2(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_SET);
        write(number((byte) org.ev3j.vm.constants.Opcode.ComSet.SET_MODE2));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder COM_TEST(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.COM_TEST);
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder COM_REMOVE(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.COM_REMOVE);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder COM_WRITEFILE(Object p1, Object p2, Object p3, Object p4) {
        write(org.ev3j.vm.constants.Opcode.COM_WRITEFILE);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        return this;
    }



    public ProgramBuilder MAILBOX_OPEN(Object p1, Object p2, Object p3, Object p4, Object p5) {
        write(org.ev3j.vm.constants.Opcode.MAILBOX_OPEN);
        echo(p1);
        echo(p2);
        echo(p3);
        echo(p4);
        echo(p5);
        return this;
    }

    public ProgramBuilder MAILBOX_TEST(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.MAILBOX_TEST);
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder MAILBOX_READY(Object p1) {
        write(org.ev3j.vm.constants.Opcode.MAILBOX_READY);
        echo(p1);
        return this;
    }

    public ProgramBuilder MAILBOX_CLOSE(Object p1) {
        write(org.ev3j.vm.constants.Opcode.MAILBOX_CLOSE);
        echo(p1);
        return this;
    }

//    Test

    public ProgramBuilder OPEN() {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.OPEN));
        return this;
    }

    public ProgramBuilder CLOSE() {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.CLOSE));
        return this;
    }

    public ProgramBuilder READ_PINS(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.READ_PINS));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder WRITE_PINS(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.WRITE_PINS));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder READ_ADC(Object p1, Object p2) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.READ_ADC));
        echo(p1);
        echo(p2);
        return this;
    }

    public ProgramBuilder WRITE_UART(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.WRITE_UART));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder READ_UART(Object p1, Object p2, Object p3) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.READ_UART));
        echo(p1);
        echo(p2);
        echo(p3);
        return this;
    }

    public ProgramBuilder ENABLE_UART(Object p1) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.ENABLE_UART));
        echo(p1);
        return this;
    }

    public ProgramBuilder DISABLE_UART() {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.DISABLE_UART));
        return this;
    }

    public ProgramBuilder ACCU_SWITCH(Object p1) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.ACCU_SWITCH));
        echo(p1);
        return this;
    }

    public ProgramBuilder BOOT_MODE2() {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.BOOT_MODE2));
        return this;
    }

    public ProgramBuilder POLL_MODE2(Object p1) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.POLL_MODE2));
        echo(p1);
        return this;
    }

    public ProgramBuilder CLOSE_MODE2() {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.CLOSE_MODE2));
        return this;
    }

    public ProgramBuilder RAM_CHECK(Object p1) {
        write(org.ev3j.vm.constants.Opcode.TST);
        write(number((byte) org.ev3j.vm.constants.Opcode.Test.RAM_CHECK));
        echo(p1);
        return this;
    }





}
