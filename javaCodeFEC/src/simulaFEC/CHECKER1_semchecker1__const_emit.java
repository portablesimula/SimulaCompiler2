// JavaLine 1 <== SourceLine 1172
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1__const_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1172, lastLine=1179, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1__const_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1__const_emit _STM() {
        // JavaLine 21 <== SourceLine 1174
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CHECKER1_semchecker1__const)(_CUR._SL)).type;
        ;
        // JavaLine 24 <== SourceLine 1176
        ((CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CHECKER1_semchecker1__const)(_CUR._SL)).ixhi_1;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1__const)(_CUR._SL)).ixlo_1;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,1176);
        ;
        // JavaLine 31 <== SourceLine 1177
        if(_VALUE(_IS(((CHECKER1_semchecker1__const)(_CUR._SL)),CHECKER1_semchecker1_arithconst.class))) {
            // JavaLine 33 <== SourceLine 1178
            ((CHECKER1_semchecker1)(_CUR._SL._SL)).aconstList_2=((CHECKER1_semchecker1_arithconst)(((CHECKER1_semchecker1__const)(_CUR._SL))));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,1172,21,1174,24,1176,31,1177,33,1178,39,1179);
} // End of Procedure
