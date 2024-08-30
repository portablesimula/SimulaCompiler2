// JavaLine 1 <== SourceLine 319
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readtypespec extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=319, lastLine=342, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_readtypespec(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readtypespec _STM() {
        // JavaLine 21 <== SourceLine 320
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs<=(((char)8))))) {
            {
                // JavaLine 24 <== SourceLine 322
                ((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1=((CLASS_PARSER_grammer)(_CUR._SL)).cs;
                ;
                // JavaLine 27 <== SourceLine 323
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)7))))) {
                    {
                        // JavaLine 30 <== SourceLine 324
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach(324);
                        ;
                        // JavaLine 33 <== SourceLine 325
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('P')))) {
                            new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),282);
                        } else {
                            // JavaLine 37 <== SourceLine 326
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach(326);
                        }
                        ;
                        // JavaLine 41 <== SourceLine 327
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                            new CLASS_PARSER_grammer_readtypespec_Block322_Block324_Block327((_CUR))._STM();
                        } else {
                            // JavaLine 45 <== SourceLine 332
                            {
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)7);
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,332);
                                ;
                                // JavaLine 51 <== SourceLine 333
                                ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                ;
                                ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                ;
                            }
                        }
                        ;
                        // JavaLine 59 <== SourceLine 335
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                            new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),285);
                        }
                        ;
                    }
                } else {
                    // JavaLine 66 <== SourceLine 337
                    {
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL)).cs;
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,337);
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 338
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(338);
                ;
            }
        } else {
            // JavaLine 79 <== SourceLine 339
            {
                // JavaLine 81 <== SourceLine 341
                ((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 readtypespec",1,319,21,320,24,322,27,323,30,324,33,325,37,326,41,327,45,332,51,333,59,335,66,337,74,338,79,339,81,341,88,342);
} // End of Procedure
