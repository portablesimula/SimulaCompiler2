// JavaLine 1 <== SourceLine 1239
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_refconst_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1239, lastLine=1240, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1240
    public RTS_Printfile _inspect_1239_4572=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_refconst_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_refconst_dump _STM() {
        // JavaLine 23 <== SourceLine 1239
        {
            // BEGIN INSPECTION 
            _inspect_1239_4572=RTS_BASICIO.sysout();
            if(_inspect_1239_4572!=null) { // INSPECT _inspect_1239_4572  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 1240
                {
                    {
                        _inspect_1239_4572.outtext(new RTS_TXT("   NONE"));
                        ;
                        _inspect_1239_4572.outimage();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,1239,10,1240,23,1239,28,1240,40,1240);
} // End of Procedure
