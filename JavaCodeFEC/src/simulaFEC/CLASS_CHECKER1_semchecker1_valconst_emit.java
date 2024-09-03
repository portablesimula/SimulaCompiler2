// JavaLine 1 <== SourceLine 1230
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_valconst_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1230, lastLine=1234, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_valconst_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_valconst_emit _STM() {
        // JavaLine 21 <== SourceLine 1232
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_valconst)(_CUR._SL)).type;
        ;
        // JavaLine 24 <== SourceLine 1233
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1_valconst)(_CUR._SL)).ixlo_1;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1233);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,1230,21,1232,24,1233,31,1234);
} // End of Procedure
