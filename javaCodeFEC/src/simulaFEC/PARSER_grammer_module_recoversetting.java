// JavaLine 1 <== SourceLine 725
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_module_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=725, lastLine=729, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_module_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_module_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 726
        if(_VALUE((((PARSER_grammer_module)(_CUR._SL)).errorno==(1)))) {
            ((PARSER_grammer_module)(_CUR._SL)).errorno=0;
        }
        ;
        // JavaLine 26 <== SourceLine 727
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('X')),true);
        ;
        // JavaLine 29 <== SourceLine 728
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recoversetting",1,725,21,726,26,727,29,728,34,729);
} // End of Procedure
