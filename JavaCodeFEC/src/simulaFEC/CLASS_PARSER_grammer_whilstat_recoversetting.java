// JavaLine 1 <== SourceLine 1148
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_whilstat_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1148, lastLine=1149, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_whilstat_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_whilstat_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 1149
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)28))),true);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recoversetting",1,1148,21,1149,25,1149);
} // End of Procedure
