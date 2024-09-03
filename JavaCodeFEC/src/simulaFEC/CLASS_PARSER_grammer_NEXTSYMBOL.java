// JavaLine 1 <== SourceLine 299
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_NEXTSYMBOL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=299, lastLine=306, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_NEXTSYMBOL(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_NEXTSYMBOL _STM() {
        // JavaLine 21 <== SourceLine 300
        if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).getopt)) {
            {
                ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                ;
                // JavaLine 28 <== SourceLine 301
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    // JavaLine 30 <== SourceLine 302
                    new CLASS_SCANNER_W1((_CUR._SL._SL),CONC(new RTS_TXT("next:"),((CLASS_PARSER)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs))),RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs));
                }
                ;
            }
        } else {
            // JavaLine 36 <== SourceLine 304
            ((CLASS_PARSER_grammer)(_CUR._SL)).detach(304);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 NEXTSYMBOL",1,299,21,300,28,301,30,302,36,304,42,306);
} // End of Procedure
