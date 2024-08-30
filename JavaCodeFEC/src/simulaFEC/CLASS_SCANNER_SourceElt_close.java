// JavaLine 1 <== SourceLine 400
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_SourceElt_close extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=400, lastLine=403, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCANNER_SourceElt_close(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_SourceElt_close _STM() {
        // JavaLine 21 <== SourceLine 401
        if(_VALUE((((CLASS_SCANNER_SourceElt)(_CUR._SL)).sf_1!=(RTS_BASICIO.sysin())))) {
            ((CLASS_SCANNER_SourceElt)(_CUR._SL)).sf_1.close();
        }
        ;
        // JavaLine 26 <== SourceLine 402
        new CLASS_SCANNER_input_restoreScannerState((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 close",1,400,21,401,26,402,31,403);
} // End of Procedure
