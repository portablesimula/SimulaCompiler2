// JavaLine 1 <== SourceLine 1185
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1__const_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1185, lastLine=1188, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1186
    public RTS_Printfile _inspect_1185_4571=null;
    // Normal Constructor
    public CHECKER1_semchecker1__const_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1__const_dump _STM() {
        // JavaLine 23 <== SourceLine 1185
        {
            // BEGIN INSPECTION 
            _inspect_1185_4571=RTS_BASICIO.sysout();
            if(_inspect_1185_4571!=null) { // INSPECT _inspect_1185_4571
                // JavaLine 28 <== SourceLine 1186
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT(" CONST"));
                        ;
                        // JavaLine 33 <== SourceLine 1187
                        _inspect_1185_4571.outtext(CONC(new RTS_TXT("VALUE:"),new COMMON_nameof((_CUR._SL._SL._SL),((CHECKER1_semchecker1__const)(_CUR._SL)).ixhi_1,((CHECKER1_semchecker1__const)(_CUR._SL)).ixlo_1)._RESULT));
                        ;
                        _inspect_1185_4571.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,1185,10,1186,23,1185,28,1186,33,1187,44,1188);
} // End of Procedure
