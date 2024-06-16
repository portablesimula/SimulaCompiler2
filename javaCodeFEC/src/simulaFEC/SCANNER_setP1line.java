// JavaLine 1 <== SourceLine 41
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_setP1line extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=41, lastLine=42, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCANNER_setP1line(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_setP1line _STM() {
        // JavaLine 21 <== SourceLine 42
        ((SCANNER)(_CUR._SL)).line=RTS_TXT.sub(((SCANNER)(_CUR._SL)).lexScanner_2.line_1,1,(((SCANNER)(_CUR._SL)).lexScanner_2.linelength_1-(1)));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 setP1line",1,41,21,42,25,42);
} // End of Procedure
