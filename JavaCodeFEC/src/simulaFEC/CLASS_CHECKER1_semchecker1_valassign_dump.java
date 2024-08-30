// JavaLine 1 <== SourceLine 734
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_valassign_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=734, lastLine=737, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 735
    public RTS_Printfile _inspect_734_4564=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_valassign_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_valassign_dump _STM() {
        // JavaLine 23 <== SourceLine 734
        {
            // BEGIN INSPECTION 
            _inspect_734_4564=RTS_BASICIO.sysout();
            if(_inspect_734_4564!=null) { // INSPECT _inspect_734_4564  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 735
                {
                    {
                        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("VALASS"));
                        ;
                        _inspect_734_4564.outimage();
                        ;
                        // JavaLine 35 <== SourceLine 736
                        ((CLASS_CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.dump_0().CPF();
                        ;
                        ((CLASS_CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.dump_0().CPF();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,734,10,735,23,734,28,735,35,736,46,737);
} // End of Procedure
