// JavaLine 1 <== SourceLine 2571
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_switchelement_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2571, lastLine=2572, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_switchelement_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_switchelement_emit _STM() {
        // JavaLine 21 <== SourceLine 2572
        ((CHECKER1_semchecker1_switchelement)(_CUR._SL)).p_labelexp.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_switchelement)(_CUR._SL)).p_labelexp.emit_0().CPF();
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,2571,21,2572,27,2572);
} // End of Procedure
