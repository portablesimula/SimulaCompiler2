// JavaLine 1 <== SourceLine 655
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_directive_bytefield extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=655, lastLine=662, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 656
    public RTS_TXT t=null;
    public int result=0;
    // JavaLine 15 <== SourceLine 655
    public int _RESULT=0;
    // Normal Constructor
    public SCANNER_recognizer_directive_bytefield(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_directive_bytefield _STM() {
        // JavaLine 28 <== SourceLine 657
        t=new SCANNER_recognizer_directive_linefield((_CUR._SL))._RESULT;
        ;
        // JavaLine 31 <== SourceLine 658
        result=(((RTS_ENVIRONMENT.digit(RTS_TXT.getchar(t))&&((RTS_TXT.length(t)<=(3)))))?(RTS_TXT.getint(t)):(-1));
        ;
        // JavaLine 34 <== SourceLine 660
        if(_VALUE(((result<(0))|((result>(255)))))) {
            _GOTO(((SCANNER_recognizer_directive)(_CUR._SL))._LABEL_SCANNER_recognizer_directive_Block798_DIRWARN_0); // GOTO EVALUATED LABEL
        }
        ;
        // JavaLine 39 <== SourceLine 661
        _RESULT=result;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 bytefield",1,655,12,656,15,655,28,657,31,658,34,660,39,661,44,662);
} // End of Procedure
