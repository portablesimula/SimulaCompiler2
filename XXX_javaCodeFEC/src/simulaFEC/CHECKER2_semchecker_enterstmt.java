// JavaLine 1 <== SourceLine 61
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_enterstmt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=61, lastLine=71, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 66
    public COMMON_brecord _inspect_66_4586=null;
    // Normal Constructor
    public CHECKER2_semchecker_enterstmt(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_enterstmt _STM() {
        // JavaLine 23 <== SourceLine 64
        new BUILDER2_prechecker_allocate((_CUR._SL));
        ;
        // JavaLine 26 <== SourceLine 66
        {
            // BEGIN INSPECTION 
            _inspect_66_4586=new COMMON_getBrc((_CUR._SL._SL),((CHECKER2_semchecker)(_CUR._SL)).lastblhi,((CHECKER2_semchecker)(_CUR._SL)).lastbllo)._RESULT;
            if(_inspect_66_4586!=null) { // INSPECT _inspect_66_4586
                // JavaLine 31 <== SourceLine 67
                {
                    // JavaLine 33 <== SourceLine 66
                    {
                        // JavaLine 35 <== SourceLine 67
                        ((CHECKER2)(_CUR._SL._SL)).display.putELEMENT(((CHECKER2)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL._SL)).cblev_6)),((COMMON_brecord)_inspect_66_4586));
                        ;
                        // JavaLine 38 <== SourceLine 68
                        ((CHECKER2)(_CUR._SL._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2_semchecker)(_CUR._SL)).lastblhi)).val.putELEMENT(((CHECKER2)(_CUR._SL._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2_semchecker)(_CUR._SL)).lastblhi)).val.index(RTS_ENVIRONMENT.rank(((CHECKER2_semchecker)(_CUR._SL)).lastbllo)),null);
                        ;
                        // JavaLine 41 <== SourceLine 69
                        new BUILDER1_precheck0_vischain((_CUR._SL),_inspect_66_4586.fpar,((CHECKER2_semchecker)(_CUR._SL)).visq_3);
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 enterstmt",1,61,10,66,23,64,26,66,31,67,33,66,35,67,38,68,41,69,51,71);
} // End of Procedure
