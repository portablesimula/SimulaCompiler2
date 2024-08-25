// JavaLine 1 <== SourceLine 298
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_NEXTSYMBOL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=298, lastLine=305, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_NEXTSYMBOL(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_NEXTSYMBOL _STM() {
        // JavaLine 21 <== SourceLine 299
        if(_VALUE(((PARSER_grammer)(_CUR._SL)).getopt)) {
            {
                ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                ;
                ((PARSER_grammer)(_CUR._SL)).getopt=false;
                ;
                // JavaLine 28 <== SourceLine 300
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    // JavaLine 30 <== SourceLine 301
                    new SCANNER_W1((_CUR._SL._SL),CONC(new RTS_TXT("next:"),((PARSER)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs))),RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs));
                }
                ;
            }
        } else {
            // JavaLine 36 <== SourceLine 303
            ((PARSER_grammer)(_CUR._SL)).detach(303);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 NEXTSYMBOL",1,298,21,299,28,300,30,301,36,303,42,305);
} // End of Procedure
