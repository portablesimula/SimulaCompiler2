// JavaLine 1 <== SourceLine 1231
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_ifstat_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1231, lastLine=1236, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_ifstat_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_ifstat_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 1233
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('1')),true);
        ;
        // JavaLine 24 <== SourceLine 1234
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)15))),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recoversetting",1,1231,21,1233,24,1234,29,1236);
} // End of Procedure
