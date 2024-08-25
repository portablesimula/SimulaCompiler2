// JavaLine 1 <== SourceLine 308
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_caseexp_othwise extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=308, lastLine=314, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 309
    public int i=0;
    // Normal Constructor
    public CHECKER2_semchecker_caseexp_othwise(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_caseexp_othwise _STM() {
        // JavaLine 23 <== SourceLine 310
        i=(((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_ub-(((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_lb));
        ;
        // JavaLine 26 <== SourceLine 311
        while((i>=(0))) {
            {
                // JavaLine 29 <== SourceLine 312
                if(_VALUE((!(((CHECKER2_semchecker_caseexp)(_CUR._SL)).seen.getELEMENT(i))))) {
                    new CHECKER2_semchecker_caseexp_outsdest((_CUR._SL),i);
                }
                ;
                i=(i-(1));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 othwise",1,308,10,309,23,310,26,311,29,312,41,314);
} // End of Procedure
