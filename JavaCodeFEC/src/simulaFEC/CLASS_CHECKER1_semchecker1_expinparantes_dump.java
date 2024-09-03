// JavaLine 1 <== SourceLine 230
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_expinparantes_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=230, lastLine=231, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 231
    public RTS_Printfile _inspect_230_4554=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_expinparantes_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_expinparantes_dump _STM() {
        // JavaLine 23 <== SourceLine 230
        {
            // BEGIN INSPECTION 
            _inspect_230_4554=RTS_BASICIO.sysout();
            if(_inspect_230_4554!=null) { // INSPECT _inspect_230_4554  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 231
                {
                    {
                        _inspect_230_4554.outtext(new RTS_TXT("   ("));
                        ;
                        ((CLASS_CHECKER1_semchecker1_expinparantes)(_CUR._SL)).p1_right.dump_0().CPF();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,230,10,231,23,230,28,231,41,231);
} // End of Procedure
