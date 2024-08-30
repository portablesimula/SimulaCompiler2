// JavaLine 1 <== SourceLine 617
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_localobject_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=617, lastLine=620, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_localobject_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_localobject_emit _STM() {
        // JavaLine 21 <== SourceLine 618
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='2';
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_localobject)(_CUR._SL)).L3opq_2;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,618);
        ;
        // JavaLine 28 <== SourceLine 619
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,617,21,618,28,619,33,620);
} // End of Procedure
