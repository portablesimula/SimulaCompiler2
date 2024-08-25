// JavaLine 1 <== SourceLine 872
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_ISOcode_getDigit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=872, lastLine=877, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCANNER_recognizer_ISOcode_getDigit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_ISOcode_getDigit _STM() {
        // JavaLine 21 <== SourceLine 873
        if(_VALUE((((SCANNER_recognizer)(_CUR._SL._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((SCANNER_recognizer)(_CUR._SL._SL)).atom_1))==(((char)2))))) {
            {
                // JavaLine 24 <== SourceLine 874
                ((SCANNER_recognizer_ISOcode)(_CUR._SL)).j=(((SCANNER_recognizer_ISOcode)(_CUR._SL)).j+(1));
                ;
                ((SCANNER_recognizer_ISOcode)(_CUR._SL)).i=(((10*(((SCANNER_recognizer_ISOcode)(_CUR._SL)).i))+(RTS_ENVIRONMENT.isorank(((SCANNER_recognizer)(_CUR._SL._SL)).atom_1)))-(48));
                ;
                // JavaLine 29 <== SourceLine 875
                new SCANNER_recognizer_scanahead((_CUR._SL._SL));
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 getDigit",1,872,21,873,24,874,29,875,36,877);
} // End of Procedure
