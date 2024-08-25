// JavaLine 1 <== SourceLine 283
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_caseexp_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=283, lastLine=286, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER2_semchecker_caseexp_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_caseexp_emit _STM() {
        // JavaLine 21 <== SourceLine 284
        new CHECKER2_semchecker_caseexp_othwise((_CUR._SL));
        ;
        // JavaLine 24 <== SourceLine 285
        ((CHECKER2)(_CUR._SL._SL._SL)).opc_6=((char)39);
        ;
        call(((CHECKER2)(_CUR._SL._SL._SL)).coder,285);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 emit",1,283,21,284,24,285,31,286);
} // End of Procedure
