// JavaLine 1 <== SourceLine 848
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_getOpd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=848, lastLine=853, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 851
    public RTS_Printfile _inspect_851_4604=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_getOpd(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_getOpd _STM() {
        // JavaLine 23 <== SourceLine 849
        ((CLASS_CHECKER2)(_CUR._SL._SL)).opdhi=RTS_ENVIRONMENT.loadChar(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2buf_3,((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3);
        ;
        ((CLASS_CHECKER2)(_CUR._SL._SL)).opdlo=RTS_ENVIRONMENT.loadChar(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2buf_3,(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3+(1)));
        ;
        // JavaLine 28 <== SourceLine 850
        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).opdSymb_2=new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_CHECKER2)(_CUR._SL._SL)).opdhi,((CLASS_CHECKER2)(_CUR._SL._SL)).opdlo)._RESULT;
        ;
        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3=(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3+(2));
        ;
        // JavaLine 33 <== SourceLine 851
        if(_VALUE((((CLASS_CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
            {
                // BEGIN INSPECTION 
                _inspect_851_4604=RTS_BASICIO.sysout();
                if(_inspect_851_4604!=null) { // INSPECT _inspect_851_4604  type=ref(PRINTFILE)
                    // JavaLine 39 <== SourceLine 852
                    {
                        // JavaLine 41 <== SourceLine 851
                        {
                            // JavaLine 43 <== SourceLine 852
                            _inspect_851_4604.outtext(new RTS_TXT(", opd: "));
                            ;
                            _inspect_851_4604.outtext(((CLASS_CHECKER2_semchecker)(_CUR._SL)).opdSymb_2.symbol);
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 getOpd",1,848,10,851,23,849,28,850,33,851,39,852,41,851,43,852,55,853);
} // End of Procedure
