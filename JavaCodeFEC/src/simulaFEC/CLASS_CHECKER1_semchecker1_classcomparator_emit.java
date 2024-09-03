// JavaLine 1 <== SourceLine 538
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_classcomparator_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=538, lastLine=544, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_classcomparator_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_classcomparator_emit _STM() {
        // JavaLine 21 <== SourceLine 539
        ((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 26 <== SourceLine 542
        if(_VALUE((((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.p_ch==('2')))) {
            ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).implNone_2=false;
        }
        ;
        // JavaLine 31 <== SourceLine 543
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p_ch;
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).qual;
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1_classcomparator)(_CUR._SL)).cl;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,543);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,538,21,539,26,542,31,543,42,544);
} // End of Procedure
