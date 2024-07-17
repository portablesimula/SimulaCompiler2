// JavaLine 1 <== SourceLine 1245
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_charconst_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1245, lastLine=1249, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1246
    public RTS_Printfile _inspect_1245_4573=null;
    // Normal Constructor
    public CHECKER1_semchecker1_charconst_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_charconst_dump _STM() {
        // JavaLine 23 <== SourceLine 1245
        {
            // BEGIN INSPECTION 
            _inspect_1245_4573=RTS_BASICIO.sysout();
            if(_inspect_1245_4573!=null) { // INSPECT _inspect_1245_4573
                // JavaLine 28 <== SourceLine 1246
                {
                    {
                        new CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("cCONST"));
                        ;
                        // JavaLine 33 <== SourceLine 1247
                        _inspect_1245_4573.outtext(new RTS_TXT("VALUE:"));
                        ;
                        _inspect_1245_4573.outint(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_charconst)(_CUR._SL)).ixlo_1),0);
                        ;
                        // JavaLine 38 <== SourceLine 1248
                        _inspect_1245_4573.outtext(CONC(CONC(new RTS_TXT("  ("),((CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_charconst)(_CUR._SL)).ixlo_1))),new RTS_TXT(")")));
                        ;
                        _inspect_1245_4573.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,1245,10,1246,23,1245,28,1246,33,1247,38,1248,49,1249);
} // End of Procedure
