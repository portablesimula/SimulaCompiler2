// JavaLine 1 <== SourceLine 70
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_popExpStack extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=70, lastLine=75, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_popExpStack(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_popExpStack _STM() {
        // JavaLine 21 <== SourceLine 72
        if(_VALUE(((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2==(null))||((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2==(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2.p_pred)))))) {
            // JavaLine 23 <== SourceLine 73
            new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)8),73);
        }
        ;
        // JavaLine 27 <== SourceLine 74
        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2.p_pred;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 popExpStack",1,70,21,72,23,73,27,74,32,75);
} // End of Procedure
