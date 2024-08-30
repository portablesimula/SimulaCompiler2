// JavaLine 1 <== SourceLine 2605
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_qualification extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=2605, lastLine=2613, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 2608
    public CLASS_COMMON_quantity cquant=null;
    // JavaLine 14 <== SourceLine 2605
    public CLASS_COMMON_quantity _RESULT=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_qualification(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_qualification _STM() {
        // JavaLine 27 <== SourceLine 2610
        cquant=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        ;
        // JavaLine 30 <== SourceLine 2611
        if(_VALUE((cquant==(null)))) {
            cquant=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        }
        ;
        // JavaLine 35 <== SourceLine 2612
        _RESULT=cquant;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 qualification",1,2605,12,2608,14,2605,27,2610,30,2611,35,2612,40,2613);
} // End of Procedure
