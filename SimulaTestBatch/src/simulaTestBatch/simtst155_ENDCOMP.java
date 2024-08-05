// JavaLine 1 <== SourceLine 15
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst155_ENDCOMP extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=15, lastLine=15, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst155_ENDCOMP(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst155_ENDCOMP _STM() {
        _GOTO(((simtst155)(_CUR._SL))._LABEL_simtst155_FINI_2); // GOTO EVALUATED LABEL
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst155.sim","5 ENDCOMP",1,15,24,15);
} // End of Procedure
