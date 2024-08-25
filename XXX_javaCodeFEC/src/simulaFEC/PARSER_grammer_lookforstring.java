// JavaLine 1 <== SourceLine 307
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_lookforstring extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=307, lastLine=315, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_lookforstring(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_lookforstring _STM() {
        // JavaLine 21 <== SourceLine 309
        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('D')))) {
            {
                // JavaLine 24 <== SourceLine 310
                ((PARSER_grammer)(_CUR._SL)).detach(310);
                ;
                // JavaLine 27 <== SourceLine 311
                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==('['))&&((((PARSER)(_CUR._SL._SL)).optx==(((char)8))))))) {
                    {
                        // JavaLine 30 <== SourceLine 312
                        ((PARSER)(_CUR._SL._SL)).opn='{';
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,312);
                            ;
                            // JavaLine 35 <== SourceLine 313
                            ((PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                            ;
                        }
                    }
                    ;
                }
            }
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 lookforstring",1,307,21,309,24,310,27,311,30,312,35,313,47,315);
    } // End of Procedure
