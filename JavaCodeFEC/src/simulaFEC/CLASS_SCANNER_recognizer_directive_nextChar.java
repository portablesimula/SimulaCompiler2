// JavaLine 1 <== SourceLine 664
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_directive_nextChar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=664, lastLine=667, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCANNER_recognizer_directive_nextChar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_directive_nextChar _STM() {
        // JavaLine 21 <== SourceLine 665
        ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).linepos_1);
        ;
        ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).linepos_1+(1));
        ;
        // JavaLine 26 <== SourceLine 666
        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1==(((char)9))))) {
            ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1=((char)32);
        } else {
            // JavaLine 30 <== SourceLine 667
            if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1>(((char)127))))) {
                ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).atom_1)-(127)));
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 nextChar",1,664,21,665,26,666,30,667,37,667);
} // End of Procedure
