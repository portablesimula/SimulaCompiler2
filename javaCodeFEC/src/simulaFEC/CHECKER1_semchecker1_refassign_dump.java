// JavaLine 1 <== SourceLine 921
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_refassign_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=921, lastLine=924, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 922
    public RTS_Printfile _inspect_921_4567=null;
    // Normal Constructor
    public CHECKER1_semchecker1_refassign_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_refassign_dump _STM() {
        // JavaLine 23 <== SourceLine 921
        {
            // BEGIN INSPECTION 
            _inspect_921_4567=RTS_BASICIO.sysout();
            if(_inspect_921_4567!=null) { // INSPECT _inspect_921_4567
                // JavaLine 28 <== SourceLine 922
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("REFASS"));
                        ;
                        _inspect_921_4567.outimage();
                        ;
                        // JavaLine 35 <== SourceLine 923
                        ((CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.dump_0().CPF();
                        ;
                        ((CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source.dump_0().CPF();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,921,10,922,23,921,28,922,35,923,46,924);
} // End of Procedure
