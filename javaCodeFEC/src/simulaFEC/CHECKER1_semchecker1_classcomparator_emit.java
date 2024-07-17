// JavaLine 1 <== SourceLine 538
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_classcomparator_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=538, lastLine=544, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_classcomparator_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_classcomparator_emit _STM() {
        // JavaLine 21 <== SourceLine 539
        ((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 26 <== SourceLine 542
        if(_VALUE((((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p1_right.p_ch==('2')))) {
            ((CHECKER1_semchecker1)(_CUR._SL._SL)).implNone_2=false;
        }
        ;
        // JavaLine 31 <== SourceLine 543
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).p_ch;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).qual;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1_classcomparator)(_CUR._SL)).cl;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,543);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,538,21,539,26,542,31,543,42,544);
} // End of Procedure
