// JavaLine 1 <== SourceLine 810
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_declaration_externalItem extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=810, lastLine=827, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 824
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_externalItem_Block824_NoSpec_0=new RTS_LABEL(this,0,1,"NoSpec"); // Local Label #1=NoSpec At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_declaration_externalItem(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_declaration_externalItem _STM() {
        PARSER_grammer_declaration_externalItem _THIS=(PARSER_grammer_declaration_externalItem)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 811
                ((PARSER_grammer)(_CUR._SL._SL)).detach();
                ;
                // JavaLine 31 <== SourceLine 812
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                    new PARSER_grammer_declaration_declError((_CUR._SL),185);
                }
                ;
                // JavaLine 36 <== SourceLine 813
                ((PARSER)(_CUR._SL._SL._SL)).opn=((char)18);
                ;
                call(((PARSER)(_CUR._SL._SL._SL)).coder,813);
                ;
                // JavaLine 41 <== SourceLine 814
                ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                ;
                ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                ;
                // JavaLine 46 <== SourceLine 815
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(':')))) {
                    {
                        // JavaLine 49 <== SourceLine 816
                        ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 52 <== SourceLine 817
                        if(_VALUE(((((PARSER_grammer)(_CUR._SL._SL)).cs!=('['))|((((PARSER)(_CUR._SL._SL._SL)).optx!=(((char)8))))))) {
                            {
                                // JavaLine 55 <== SourceLine 818
                                new PARSER_grammer_skip((_CUR._SL._SL),193);
                                ;
                                _GOTO(_LABEL_PARSER_grammer_declaration_externalItem_Block824_NoSpec_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 62 <== SourceLine 819
                        ((PARSER)(_CUR._SL._SL._SL)).opn='{';
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,819);
                            ;
                            // JavaLine 67 <== SourceLine 820
                            ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                            ;
                            ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                            ;
                        }
                    } else {
                        // JavaLine 74 <== SourceLine 822
                        {
                            // JavaLine 76 <== SourceLine 824
                            {
                                _SIM_LABEL(1); // DeclaredIn: externalItem -> externalItem[externalIdent=PARSER_grammer_declaration_externalItem] Kind=5, QUAL=ProcedureDeclaration, HashCode=1011387188
                                ((PARSER)(_CUR._SL._SL._SL)).opdhi=((PARSER)(_CUR._SL._SL._SL)).opdlo=((char)0);
                            }
                            ;
                            // JavaLine 82 <== SourceLine 825
                            ((PARSER)(_CUR._SL._SL._SL)).opn='{';
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,825);
                                ;
                            }
                        }
                        ;
                        break _LOOP;
                    }
                    catch(RTS_LABEL q) {
                        RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                        _JTX=q.index; continue _LOOP; // EG. GOTO Lx
                    }
                }
                EBLK();
                return(this);
            } // End of Procedure BODY
            public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 externalItem",1,810,10,824,28,811,31,812,36,813,41,814,46,815,49,816,52,817,55,818,62,819,67,820,74,822,76,824,82,825,99,827);
        } // End of Procedure
