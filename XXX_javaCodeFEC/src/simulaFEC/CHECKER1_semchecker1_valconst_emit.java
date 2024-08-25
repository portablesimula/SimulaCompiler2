// JavaLine 1 <== SourceLine 1230
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_valconst_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1230, lastLine=1234, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_valconst_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_valconst_emit _STM() {
        // JavaLine 21 <== SourceLine 1232
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CHECKER1_semchecker1_valconst)(_CUR._SL)).type;
        ;
        // JavaLine 24 <== SourceLine 1233
        ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1_valconst)(_CUR._SL)).ixlo_1;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,1233);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,1230,21,1232,24,1233,31,1234);
} // End of Procedure
