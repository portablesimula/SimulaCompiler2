// JavaLine 1 <== SourceLine 617
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_localobject_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=617, lastLine=620, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_localobject_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_localobject_emit _STM() {
        // JavaLine 21 <== SourceLine 618
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='2';
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CHECKER1_semchecker1_localobject)(_CUR._SL)).L3opq_2;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,618);
        ;
        // JavaLine 28 <== SourceLine 619
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,617,21,618,28,619,33,620);
} // End of Procedure
