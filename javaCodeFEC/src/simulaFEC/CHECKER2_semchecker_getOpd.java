// JavaLine 1 <== SourceLine 848
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_getOpd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=848, lastLine=853, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 851
    public RTS_Printfile _inspect_851_4604=null;
    // Normal Constructor
    public CHECKER2_semchecker_getOpd(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_getOpd _STM() {
        // JavaLine 23 <== SourceLine 849
        ((CHECKER2)(_CUR._SL._SL)).opdhi=RTS_ENVIRONMENT.loadChar(((CHECKER2_semchecker)(_CUR._SL)).L2buf_3,((CHECKER2_semchecker)(_CUR._SL)).L2p_3);
        ;
        ((CHECKER2)(_CUR._SL._SL)).opdlo=RTS_ENVIRONMENT.loadChar(((CHECKER2_semchecker)(_CUR._SL)).L2buf_3,(((CHECKER2_semchecker)(_CUR._SL)).L2p_3+(1)));
        ;
        // JavaLine 28 <== SourceLine 850
        ((CHECKER2_semchecker)(_CUR._SL)).opdSymb_2=new COMMON_boxof((_CUR._SL._SL),((CHECKER2)(_CUR._SL._SL)).opdhi,((CHECKER2)(_CUR._SL._SL)).opdlo)._RESULT;
        ;
        ((CHECKER2_semchecker)(_CUR._SL)).L2p_3=(((CHECKER2_semchecker)(_CUR._SL)).L2p_3+(2));
        ;
        // JavaLine 33 <== SourceLine 851
        if(_VALUE((((CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
            {
                // BEGIN INSPECTION 
                _inspect_851_4604=RTS_BASICIO.sysout();
                if(_inspect_851_4604!=null) { // INSPECT _inspect_851_4604
                    // JavaLine 39 <== SourceLine 852
                    {
                        // JavaLine 41 <== SourceLine 851
                        {
                            // JavaLine 43 <== SourceLine 852
                            _inspect_851_4604.outtext(new RTS_TXT(", opd: "));
                            ;
                            _inspect_851_4604.outtext(((CHECKER2_semchecker)(_CUR._SL)).opdSymb_2.symbol);
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 getOpd",1,848,10,851,23,849,28,850,33,851,39,852,41,851,43,852,55,853);
} // End of Procedure
