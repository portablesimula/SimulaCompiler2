// JavaLine 1 <== SourceLine 571
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_instqual_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=571, lastLine=572, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 572
    public RTS_Printfile _inspect_571_4562=null;
    // Normal Constructor
    public CHECKER1_semchecker1_instqual_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_instqual_dump _STM() {
        // JavaLine 23 <== SourceLine 571
        {
            // BEGIN INSPECTION 
            _inspect_571_4562=RTS_BASICIO.sysout();
            if(_inspect_571_4562!=null) { // INSPECT _inspect_571_4562
                // JavaLine 28 <== SourceLine 572
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),CONC(new RTS_TXT("  "),((CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_instqual)(_CUR._SL)).p_ch))));
                        ;
                        _inspect_571_4562.outimage();
                        ;
                        ((CHECKER1_semchecker1_instqual)(_CUR._SL)).p1_right.dump_0().CPF();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,571,10,572,23,571,28,572,42,572);
} // End of Procedure
