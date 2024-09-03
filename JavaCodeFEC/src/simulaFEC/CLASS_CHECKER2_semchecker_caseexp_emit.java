// JavaLine 1 <== SourceLine 283
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_caseexp_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=283, lastLine=286, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_caseexp_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_caseexp_emit _STM() {
        // JavaLine 21 <== SourceLine 284
        new CLASS_CHECKER2_semchecker_caseexp_othwise((_CUR._SL));
        ;
        // JavaLine 24 <== SourceLine 285
        ((CLASS_CHECKER2)(_CUR._SL._SL._SL)).opc_6=((char)39);
        ;
        call(((CLASS_CHECKER2)(_CUR._SL._SL._SL)).coder,285);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 emit",1,283,21,284,24,285,31,286);
} // End of Procedure
