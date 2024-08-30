// JavaLine 1 <== SourceLine 1254
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_boolconst_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1254, lastLine=1257, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1255
    public RTS_Printfile _inspect_1254_4574=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_boolconst_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_boolconst_dump _STM() {
        // JavaLine 23 <== SourceLine 1254
        {
            // BEGIN INSPECTION 
            _inspect_1254_4574=RTS_BASICIO.sysout();
            if(_inspect_1254_4574!=null) { // INSPECT _inspect_1254_4574  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 1255
                {
                    {
                        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("bCONST"));
                        ;
                        // JavaLine 33 <== SourceLine 1256
                        _inspect_1254_4574.outtext(CONC(new RTS_TXT("VALUE:"),new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_CHECKER1_semchecker1_boolconst)(_CUR._SL)).ixhi_1,((CLASS_CHECKER1_semchecker1_boolconst)(_CUR._SL)).ixlo_1)._RESULT));
                        ;
                        _inspect_1254_4574.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,1254,10,1255,23,1254,28,1255,33,1256,44,1257);
} // End of Procedure
