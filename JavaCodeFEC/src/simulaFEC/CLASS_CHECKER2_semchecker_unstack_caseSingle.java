// JavaLine 1 <== SourceLine 420
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_unstack_caseSingle extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=420, lastLine=441, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_unstack_caseSingle(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_unstack_caseSingle _STM() {
        // JavaLine 21 <== SourceLine 423
        if(_VALUE(RTS_UTIL._IS(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2,CLASS_CHECKER1_semchecker1_arithconst.class))) {
            {
                // JavaLine 24 <== SourceLine 424
                ((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).rhi=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixlo_1)._RESULT;
                ;
                // JavaLine 27 <== SourceLine 426
                ((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)4);
            }
        } else {
            // JavaLine 31 <== SourceLine 429
            if(_VALUE(RTS_UTIL._IS(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2,CLASS_CHECKER1_semchecker1_charconst.class))) {
                {
                    // JavaLine 34 <== SourceLine 430
                    ((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).rhi=RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_charconst)(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixlo_1);
                    ;
                    // JavaLine 37 <== SourceLine 431
                    ((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)2);
                }
            } else {
                // JavaLine 41 <== SourceLine 432
                {
                    new CLASS_ERRMSG_error0((_CUR._SL._SL._SL),441);
                    ;
                    ((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).lhc=((char)15);
                }
            }
        }
        ;
        // JavaLine 50 <== SourceLine 440
        new CLASS_CHECKER1_semchecker1_popExpStack((_CUR._SL._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 caseSingle",1,420,21,423,24,424,27,426,31,429,34,430,37,431,41,432,50,440,55,441);
} // End of Procedure
