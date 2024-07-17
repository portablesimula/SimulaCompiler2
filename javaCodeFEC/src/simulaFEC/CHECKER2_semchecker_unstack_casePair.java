// JavaLine 1 <== SourceLine 443
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_unstack_casePair extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=443, lastLine=447, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 444
    public char rht=0;
    // Normal Constructor
    public CHECKER2_semchecker_unstack_casePair(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_unstack_casePair _STM() {
        // JavaLine 23 <== SourceLine 445
        new CHECKER2_semchecker_unstack_caseSingle((_CUR._SL));
        ;
        ((CHECKER2_semchecker_unstack)(_CUR._SL)).lhi=((CHECKER2_semchecker_unstack)(_CUR._SL)).rhi;
        ;
        rht=((CHECKER2_semchecker_unstack)(_CUR._SL)).lhc;
        ;
        new CHECKER2_semchecker_unstack_caseSingle((_CUR._SL));
        ;
        // JavaLine 32 <== SourceLine 446
        if(_VALUE((rht!=(((CHECKER2_semchecker_unstack)(_CUR._SL)).lhc)))) {
            new ERRMSG_error0((_CUR._SL._SL._SL),442);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 casePair",1,443,10,444,23,445,32,446,39,447);
} // End of Procedure
