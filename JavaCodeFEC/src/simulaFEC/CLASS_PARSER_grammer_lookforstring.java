// JavaLine 1 <== SourceLine 308
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_lookforstring extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=308, lastLine=316, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_lookforstring(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_lookforstring _STM() {
        // JavaLine 21 <== SourceLine 310
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('D')))) {
            {
                // JavaLine 24 <== SourceLine 311
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(311);
                ;
                // JavaLine 27 <== SourceLine 312
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('['))&&((((CLASS_PARSER)(_CUR._SL._SL)).optx==(((char)8))))))) {
                    {
                        // JavaLine 30 <== SourceLine 313
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='{';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,313);
                            ;
                            // JavaLine 35 <== SourceLine 314
                            ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                            ;
                        }
                    }
                    ;
                }
            }
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 lookforstring",1,308,21,310,24,311,27,312,30,313,35,314,47,316);
    } // End of Procedure
