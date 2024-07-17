// JavaLine 1 <== SourceLine 199
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_operation_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=199, lastLine=203, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 200
    public RTS_Printfile _inspect_199_4553=null;
    // Normal Constructor
    public CHECKER1_semchecker1_operation_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_operation_dump _STM() {
        // JavaLine 23 <== SourceLine 199
        {
            // BEGIN INSPECTION 
            _inspect_199_4553=RTS_BASICIO.sysout();
            if(_inspect_199_4553!=null) { // INSPECT _inspect_199_4553
                // JavaLine 28 <== SourceLine 200
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),CONC(new RTS_TXT("  "),((CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_operation)(_CUR._SL)).p_ch))));
                        ;
                        _inspect_199_4553.outimage();
                        ;
                        // JavaLine 35 <== SourceLine 201
                        if(_VALUE((((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_left!=(null)))) {
                            ((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_left.dump_0().CPF();
                        }
                        ;
                        // JavaLine 40 <== SourceLine 202
                        if(_VALUE((((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_right!=(null)))) {
                            ((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_right.dump_0().CPF();
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,199,10,200,23,199,28,200,35,201,40,202,51,203);
} // End of Procedure
