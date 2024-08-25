// JavaLine 1 <== SourceLine 318
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readtypespec extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=318, lastLine=341, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_readtypespec(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readtypespec _STM() {
        // JavaLine 21 <== SourceLine 319
        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs<=(((char)8))))) {
            {
                // JavaLine 24 <== SourceLine 321
                ((PARSER_grammer)(_CUR._SL)).readtype_1=((PARSER_grammer)(_CUR._SL)).cs;
                ;
                // JavaLine 27 <== SourceLine 322
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)7))))) {
                    {
                        // JavaLine 30 <== SourceLine 323
                        ((PARSER_grammer)(_CUR._SL)).detach(323);
                        ;
                        // JavaLine 33 <== SourceLine 324
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('P')))) {
                            new PARSER_grammer_ParsWarn((_CUR._SL),282);
                        } else {
                            // JavaLine 37 <== SourceLine 325
                            ((PARSER_grammer)(_CUR._SL)).detach(325);
                        }
                        ;
                        // JavaLine 41 <== SourceLine 326
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                            new PARSER_grammer_readtypespec_Block321_Block323_Block326((_CUR))._STM();
                        } else {
                            // JavaLine 45 <== SourceLine 331
                            {
                                ((PARSER)(_CUR._SL._SL)).opn=((char)7);
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,331);
                                ;
                                // JavaLine 51 <== SourceLine 332
                                ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                ;
                                ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                ;
                            }
                        }
                        ;
                        // JavaLine 59 <== SourceLine 334
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                            new PARSER_grammer_ParsWarn((_CUR._SL),285);
                        }
                        ;
                    }
                } else {
                    // JavaLine 66 <== SourceLine 336
                    {
                        ((PARSER)(_CUR._SL._SL)).opn=((PARSER_grammer)(_CUR._SL)).cs;
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,336);
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 337
                ((PARSER_grammer)(_CUR._SL)).detach(337);
                ;
            }
        } else {
            // JavaLine 79 <== SourceLine 338
            {
                // JavaLine 81 <== SourceLine 340
                ((PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 readtypespec",1,318,21,319,24,321,27,322,30,323,33,324,37,325,41,326,45,331,51,332,59,334,66,336,74,337,79,338,81,340,88,341);
} // End of Procedure
