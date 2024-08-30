// JavaLine 1 <== SourceLine 1232
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_ifstat_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1232, lastLine=1237, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_ifstat_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_ifstat_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 1234
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('1')),true);
        ;
        // JavaLine 24 <== SourceLine 1235
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)15))),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recoversetting",1,1232,21,1234,24,1235,29,1237);
} // End of Procedure
