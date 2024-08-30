// JavaLine 1 <== SourceLine 30
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:39 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FECMAIN_PBLK28_ENDCOMP extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=30, lastLine=30, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public FECMAIN_PBLK28_ENDCOMP(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public FECMAIN_PBLK28_ENDCOMP _STM() {
        _GOTO(((FECMAIN_PBLK28)(_CUR._SL))._LABEL_FECMAIN_PBLK28_FINI_18); // GOTO EVALUATED LABEL
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("FECMAIN.sim","5 ENDCOMP",1,30,24,30);
} // End of Procedure
