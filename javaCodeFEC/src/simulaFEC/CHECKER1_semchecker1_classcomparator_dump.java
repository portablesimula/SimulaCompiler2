// JavaLine 1 <== SourceLine 535
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_classcomparator_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=535, lastLine=536, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 536
    public RTS_Printfile _inspect_535_4560=null;
    // Normal Constructor
    public CHECKER1_semchecker1_classcomparator_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_classcomparator_dump _STM() {
        // JavaLine 23 <== SourceLine 535
        {
            // BEGIN INSPECTION 
            _inspect_535_4560=RTS_BASICIO.sysout();
            if(_inspect_535_4560!=null) { // INSPECT _inspect_535_4560
                // JavaLine 28 <== SourceLine 536
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),CONC(new RTS_TXT("  "),((CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p_ch))));
                        ;
                        _inspect_535_4560.outimage();
                        ;
                        ((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.dump_0().CPF();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,535,10,536,23,535,28,536,42,536);
} // End of Procedure
