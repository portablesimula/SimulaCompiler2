// JavaLine 1 <== SourceLine 142
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_exp_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=142, lastLine=143, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 143
    public RTS_Printfile _inspect_142_4552=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_exp_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_exp_dump _STM() {
        // JavaLine 23 <== SourceLine 142
        {
            // BEGIN INSPECTION 
            _inspect_142_4552=RTS_BASICIO.sysout();
            if(_inspect_142_4552!=null) { // INSPECT _inspect_142_4552  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 143
                {
                    {
                        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),CONC(new RTS_TXT("  "),((CLASS_CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).p_ch))));
                        ;
                        _inspect_142_4552.outimage();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,142,10,143,23,142,28,143,40,143);
} // End of Procedure
