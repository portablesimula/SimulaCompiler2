// JavaLine 1 <== SourceLine 233
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_expinparantes_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=233, lastLine=234, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_expinparantes_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_expinparantes_emit _STM() {
        // JavaLine 21 <== SourceLine 234
        ((CHECKER1_semchecker1_expinparantes)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_expinparantes)(_CUR._SL)).p1_right.emit_0().CPF();
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,233,21,234,27,234);
} // End of Procedure
