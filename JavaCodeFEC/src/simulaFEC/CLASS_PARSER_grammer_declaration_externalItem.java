// JavaLine 1 <== SourceLine 811
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_declaration_externalItem extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=811, lastLine=828, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 825
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_externalItem_Block825_NoSpec_0=new RTS_LABEL(this,0,1,"NoSpec"); // Local Label #1=NoSpec At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_declaration_externalItem(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_declaration_externalItem _STM() {
        CLASS_PARSER_grammer_declaration_externalItem _THIS=(CLASS_PARSER_grammer_declaration_externalItem)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 812
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                ;
                // JavaLine 31 <== SourceLine 813
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                    new CLASS_PARSER_grammer_declaration_declError((_CUR._SL),185);
                }
                ;
                // JavaLine 36 <== SourceLine 814
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)18);
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,814);
                ;
                // JavaLine 41 <== SourceLine 815
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                ;
                // JavaLine 46 <== SourceLine 816
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(':')))) {
                    {
                        // JavaLine 49 <== SourceLine 817
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 52 <== SourceLine 818
                        if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('['))|((((CLASS_PARSER)(_CUR._SL._SL._SL)).optx!=(((char)8))))))) {
                            {
                                // JavaLine 55 <== SourceLine 819
                                new CLASS_PARSER_grammer_skip((_CUR._SL._SL),193);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_externalItem_Block825_NoSpec_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 62 <== SourceLine 820
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='{';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,820);
                            ;
                            // JavaLine 67 <== SourceLine 821
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                            ;
                        }
                    } else {
                        // JavaLine 74 <== SourceLine 823
                        {
                            // JavaLine 76 <== SourceLine 825
                            {
                                _SIM_LABEL(1); // DeclaredIn: externalItem -> externalItem[externalIdent=CLASS_PARSER_grammer_declaration_externalItem] Kind=5, QUAL=ProcedureDeclaration, HashCode=651638041
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=((char)0);
                            }
                            ;
                            // JavaLine 82 <== SourceLine 826
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='{';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,826);
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
            public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 externalItem",1,811,10,825,28,812,31,813,36,814,41,815,46,816,49,817,52,818,55,819,62,820,67,821,74,823,76,825,82,826,99,828);
        } // End of Procedure
