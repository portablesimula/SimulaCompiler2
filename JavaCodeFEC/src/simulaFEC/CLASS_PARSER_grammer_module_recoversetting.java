// JavaLine 1 <== SourceLine 726
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_module_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=726, lastLine=730, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_module_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_module_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 727
        if(_VALUE((((CLASS_PARSER_grammer_module)(_CUR._SL)).errorno==(1)))) {
            ((CLASS_PARSER_grammer_module)(_CUR._SL)).errorno=0;
        }
        ;
        // JavaLine 26 <== SourceLine 728
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('X')),true);
        ;
        // JavaLine 29 <== SourceLine 729
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recoversetting",1,726,21,727,26,728,29,729,34,730);
} // End of Procedure
