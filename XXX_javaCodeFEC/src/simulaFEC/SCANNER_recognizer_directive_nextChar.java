// JavaLine 1 <== SourceLine 664
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_directive_nextChar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=664, lastLine=667, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCANNER_recognizer_directive_nextChar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_directive_nextChar _STM() {
        // JavaLine 21 <== SourceLine 665
        ((SCANNER_recognizer)(_CUR._SL._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((SCANNER_recognizer)(_CUR._SL._SL)).line_1,((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1);
        ;
        ((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1=(((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1+(1));
        ;
        // JavaLine 26 <== SourceLine 666
        if(_VALUE((((SCANNER_recognizer)(_CUR._SL._SL)).atom_1==(((char)9))))) {
            ((SCANNER_recognizer)(_CUR._SL._SL)).atom_1=((char)32);
        } else {
            // JavaLine 30 <== SourceLine 667
            if(_VALUE((((SCANNER_recognizer)(_CUR._SL._SL)).atom_1>(((char)127))))) {
                ((SCANNER_recognizer)(_CUR._SL._SL)).atom_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((SCANNER_recognizer)(_CUR._SL._SL)).atom_1)-(127)));
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 nextChar",1,664,21,665,26,666,30,667,37,667);
} // End of Procedure
