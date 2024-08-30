// JavaLine 1 <== SourceLine 1949
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_expression extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=1949, lastLine=2233, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 2201
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_restart_0=new RTS_LABEL(this,0,1,"restart"); // Local Label #1=restart At PrefixLevel 0
    // JavaLine 13 <== SourceLine 2225
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_Block2202_EXCALL_0=new RTS_LABEL(this,0,2,"EXCALL"); // Local Label #2=EXCALL At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 1951
    public boolean wasNotexpr=false;
    public boolean startexprstmt=false;
    // JavaLine 19 <== SourceLine 1952
    public boolean NOTblockprefix=false;
    public boolean NOTdesig=false;
    public boolean NOTlhsassig=false;
    public boolean NOTrefexpr=false;
    // JavaLine 24 <== SourceLine 1960
    public char operatortype=0;
    // JavaLine 26 <== SourceLine 1961
    public char opnx=0;
    // JavaLine 28 <== SourceLine 1962
    public char lastsymb=0;
    // JavaLine 30 <== SourceLine 1964
    public CLASS_PARSER_grammer_expression ex=null;
    // Normal Constructor
    public CLASS_PARSER_grammer_expression(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_expression _STM() {
        CLASS_PARSER_grammer_expression _THIS=(CLASS_PARSER_grammer_expression)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 2200
                detach(2200);
                ;
                // JavaLine 49 <== SourceLine 2201
                {
                    _SIM_LABEL(1); // DeclaredIn: expression
                    while(true) {
                        {
                            // JavaLine 54 <== SourceLine 2202
                            if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                new CLASS_SCANNER_W1((_CUR._SL._SL),new RTS_TXT("expr., cs="),RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs));
                            }
                            ;
                            // JavaLine 59 <== SourceLine 2203
                            NOTblockprefix=NOTdesig=NOTlhsassig=NOTrefexpr=wasNotexpr=false;
                            ;
                            // JavaLine 62 <== SourceLine 2206
                            if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER)(_CUR._SL._SL)).opt))==(((char)2)))||((startexprstmt&&((((CLASS_PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER)(_CUR._SL._SL)).opt))==(((char)4))))))))) {
                                // JavaLine 64 <== SourceLine 2208
                                {
                                    // JavaLine 66 <== SourceLine 2209
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)139);
                                    } else {
                                        // JavaLine 70 <== SourceLine 2210
                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('[')))) {
                                            {
                                                // JavaLine 73 <== SourceLine 2211
                                                NOTblockprefix=NOTdesig=true;
                                                ;
                                                // JavaLine 76 <== SourceLine 2212
                                                NOTlhsassig=NOTrefexpr=((((CLASS_PARSER)(_CUR._SL._SL)).opdhi!=(((char)0)))||((((CLASS_PARSER)(_CUR._SL._SL)).opdlo!=('A'))));
                                                ;
                                                // JavaLine 79 <== SourceLine 2214
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)138);
                                            }
                                        } else {
                                            // JavaLine 83 <== SourceLine 2215
                                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_Block2202_EXCALL_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                    // JavaLine 88 <== SourceLine 2216
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,2216);
                                    ;
                                    // JavaLine 91 <== SourceLine 2217
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 96 <== SourceLine 2219
                                    detach(2219);
                                    ;
                                    // JavaLine 99 <== SourceLine 2221
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_restart_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                            ;
                            // JavaLine 105 <== SourceLine 2224
                            {
                                _SIM_LABEL(2); // DeclaredIn: expression -> expression[CLASS_PARSER_grammer_expression] DeclarationKind=Class
                                // JavaLine 108 <== SourceLine 2225
                                new CLASS_PARSER_grammer_expression_exp((_CUR),false);
                            }
                            ;
                            // JavaLine 112 <== SourceLine 2226
                            if(_VALUE((lastsymb==('Q')))) {
                                NOTrefexpr=true;
                            } else {
                                // JavaLine 116 <== SourceLine 2227
                                if(_VALUE((lastsymb==(')')))) {
                                    NOTlhsassig=NOTrefexpr=true;
                                }
                            }
                            ;
                            // JavaLine 122 <== SourceLine 2229
                            detach(2229);
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 2233
                // BEGIN expression INNER PART
                // ENDOF expression INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 expression",1,1949,11,2201,13,2225,16,1951,19,1952,24,1960,26,1961,28,1962,30,1964,46,2200,49,2201,54,2202,59,2203,62,2206,64,2208,66,2209,70,2210,73,2211,76,2212,79,2214,83,2215,88,2216,91,2217,96,2219,99,2221,105,2224,108,2225,112,2226,116,2227,122,2229,130,2233,142,2233);
} // End of Class
