// JavaLine 1 <== SourceLine 719
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_module_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=719, lastLine=724, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_module_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_module_recover _STM() {
        // JavaLine 24 <== SourceLine 720
        ((CLASS_PARSER_grammer_module)(_CUR._SL)).recovered=_RESULT=true;
        ;
        // JavaLine 27 <== SourceLine 721
        ((CLASS_PARSER_grammer_module)(_CUR._SL)).rp=(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('O')))?(((char)3)):((((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)32))))?(((char)4)):((((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('X')))?(((char)6)):(((char)5)))))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,719,24,720,27,721,32,724);
} // End of Procedure
