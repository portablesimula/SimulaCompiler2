// JavaLine 1 <== SourceLine 1093
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_ifexp_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1093, lastLine=1113, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_ifexp_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_ifexp_emit _STM() {
        // JavaLine 21 <== SourceLine 1095
        ((CHECKER1)(_CUR._SL._SL._SL)).notinconditional_6=false;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).generalgoto_6=((CHECKER1)(_CUR._SL._SL._SL)).ingotostmt_6;
        ;
        // JavaLine 26 <== SourceLine 1096
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)23);
        ;
        // JavaLine 29 <== SourceLine 1097
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p2_testexp.cl=(((((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p2_testexp.ctype==(':')))?(((char)2)):(((char)1)));
        ;
        // JavaLine 32 <== SourceLine 1101
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p2_testexp.emit_0().CPF();
        ;
        // JavaLine 35 <== SourceLine 1102
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='1';
        ;
        // JavaLine 38 <== SourceLine 1104
        if(_VALUE((((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p2_testexp.ctype!=(':')))) {
            call(((CHECKER1)(_CUR._SL._SL._SL)).coder,1104);
        }
        ;
        // JavaLine 43 <== SourceLine 1105
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.emit_0().CPF();
        ;
        // JavaLine 48 <== SourceLine 1106
        if(_VALUE((((CHECKER1_semchecker1_ifexp)(_CUR._SL)).type!=(((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.type)))) {
            // JavaLine 50 <== SourceLine 1107
            new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_ifexp)(_CUR._SL)).type,((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.type);
        }
        ;
        // JavaLine 54 <== SourceLine 1108
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)15);
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,1108);
        ;
        // JavaLine 59 <== SourceLine 1109
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 64 <== SourceLine 1110
        if(_VALUE((((CHECKER1_semchecker1_ifexp)(_CUR._SL)).type!=(((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.type)))) {
            // JavaLine 66 <== SourceLine 1111
            new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_ifexp)(_CUR._SL)).type,((CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.type);
        }
        ;
        // JavaLine 70 <== SourceLine 1112
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='t';
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,1112);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,1093,21,1095,26,1096,29,1097,32,1101,35,1102,38,1104,43,1105,48,1106,50,1107,54,1108,59,1109,64,1110,66,1111,70,1112,77,1113);
} // End of Procedure
