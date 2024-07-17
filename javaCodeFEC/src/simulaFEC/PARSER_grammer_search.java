// JavaLine 1 <== SourceLine 287
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_search extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=287, lastLine=290, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_search(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_search _STM() {
        // JavaLine 21 <== SourceLine 290
        while((!(((PARSER_grammer)(_CUR._SL)).recoversymbol.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs))))) {
            new PARSER_grammer_NEXTSYMBOL((_CUR._SL));
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 search",1,287,21,290,27,290);
} // End of Procedure
