// JavaLine 1 <== SourceLine 420
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_unstack_caseSingle extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=420, lastLine=441, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER2_semchecker_unstack_caseSingle(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_unstack_caseSingle _STM() {
        // JavaLine 21 <== SourceLine 423
        if(_VALUE(_IS(((CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2,CHECKER1_semchecker1_arithconst.class))) {
            {
                // JavaLine 24 <== SourceLine 424
                ((CHECKER2_semchecker_unstack)(_CUR._SL)).rhi=new BUILDER1_getSAFEint((_CUR._SL._SL._SL),((CHECKER1_semchecker1_arithconst)(((CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixhi_1,((CHECKER1_semchecker1_arithconst)(((CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixlo_1)._RESULT;
                ;
                // JavaLine 27 <== SourceLine 426
                ((CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)4);
            }
        } else {
            // JavaLine 31 <== SourceLine 429
            if(_VALUE(_IS(((CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2,CHECKER1_semchecker1_charconst.class))) {
                {
                    // JavaLine 34 <== SourceLine 430
                    ((CHECKER2_semchecker_unstack)(_CUR._SL)).rhi=RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_charconst)(((CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixlo_1);
                    ;
                    // JavaLine 37 <== SourceLine 431
                    ((CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)2);
                }
            } else {
                // JavaLine 41 <== SourceLine 432
                {
                    new ERRMSG_error0((_CUR._SL._SL._SL),441);
                    ;
                    ((CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)15);
                }
            }
        }
        ;
        // JavaLine 50 <== SourceLine 440
        new CHECKER1_semchecker1_popExpStack((_CUR._SL._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 caseSingle",1,420,21,423,24,424,27,426,31,429,34,430,37,431,41,432,50,440,55,441);
} // End of Procedure
