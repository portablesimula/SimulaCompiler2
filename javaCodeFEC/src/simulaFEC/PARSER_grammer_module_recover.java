// JavaLine 1 <== SourceLine 718
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_module_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=718, lastLine=723, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_module_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_module_recover _STM() {
        // JavaLine 24 <== SourceLine 719
        ((PARSER_grammer_module)(_CUR._SL)).recovered=_RESULT=true;
        ;
        // JavaLine 27 <== SourceLine 720
        ((PARSER_grammer_module)(_CUR._SL)).rp=(((((PARSER_grammer)(_CUR._SL._SL)).cs==('O')))?(((char)3)):((((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)32))))?(((char)4)):((((((PARSER_grammer)(_CUR._SL._SL)).cs==('X')))?(((char)6)):(((char)5)))))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,718,24,719,27,720,32,723);
} // End of Procedure
