// JavaLine 1 <== SourceLine 856
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_getlastblno extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=856, lastLine=863, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 860
    public RTS_Printfile _inspect_860_4605=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_getlastblno(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_getlastblno _STM() {
        // JavaLine 23 <== SourceLine 857
        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).lastblhi=RTS_ENVIRONMENT.loadChar(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2buf_3,((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3);
        ;
        // JavaLine 26 <== SourceLine 858
        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).lastbllo=RTS_ENVIRONMENT.loadChar(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2buf_3,(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3+(1)));
        ;
        // JavaLine 29 <== SourceLine 859
        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3=(((CLASS_CHECKER2_semchecker)(_CUR._SL)).L2p_3+(2));
        ;
        // JavaLine 32 <== SourceLine 860
        if(_VALUE((((CLASS_CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
            {
                // BEGIN INSPECTION 
                _inspect_860_4605=RTS_BASICIO.sysout();
                if(_inspect_860_4605!=null) { // INSPECT _inspect_860_4605  type=ref(PRINTFILE)
                    // JavaLine 38 <== SourceLine 861
                    {
                        // JavaLine 40 <== SourceLine 860
                        {
                            // JavaLine 42 <== SourceLine 861
                            _inspect_860_4605.outtext(new RTS_TXT(":"));
                            ;
                            // JavaLine 45 <== SourceLine 862
                            _inspect_860_4605.outint(((RTS_ENVIRONMENT.rank(((CLASS_CHECKER2_semchecker)(_CUR._SL)).lastblhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2_semchecker)(_CUR._SL)).lastbllo))),5);
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 getlastblno",1,856,10,860,23,857,26,858,29,859,32,860,38,861,40,860,42,861,45,862,55,863);
} // End of Procedure
