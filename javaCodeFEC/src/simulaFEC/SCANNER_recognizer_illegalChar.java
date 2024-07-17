// JavaLine 1 <== SourceLine 623
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_illegalChar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=623, lastLine=624, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCANNER_recognizer_illegalChar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_illegalChar _STM() {
        // JavaLine 21 <== SourceLine 624
        ((SCANNER)(_CUR._SL._SL)).diag.putELEMENT(((SCANNER)(_CUR._SL._SL)).diag.index(0),new COMMON_leftint((_CUR._SL._SL),RTS_ENVIRONMENT.isorank(((SCANNER_recognizer)(_CUR._SL)).atom_1))._RESULT);
        ;
        new SCANNER_P1warn((_CUR._SL._SL),276);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 illegalChar",1,623,21,624,27,624);
} // End of Procedure
