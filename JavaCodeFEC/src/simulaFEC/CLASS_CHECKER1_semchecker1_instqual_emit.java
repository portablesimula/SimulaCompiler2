// JavaLine 1 <== SourceLine 574
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_instqual_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=574, lastLine=580, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_instqual_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_instqual_emit _STM() {
        // JavaLine 21 <== SourceLine 575
        ((CLASS_CHECKER1_semchecker1_instqual)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_instqual)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 26 <== SourceLine 576
        if(_VALUE((((CLASS_CHECKER1_semchecker1_instqual)(_CUR._SL)).L3opq_2!=(null)))) {
            // JavaLine 28 <== SourceLine 577
            {
                // JavaLine 30 <== SourceLine 578
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
                ;
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_instqual)(_CUR._SL)).L3opq_2;
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,578);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,574,21,575,26,576,28,577,30,578,42,580);
} // End of Procedure
