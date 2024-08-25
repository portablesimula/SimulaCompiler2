// JavaLine 1 <== SourceLine 1948
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_expression extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=1948, lastLine=2232, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 2200
    final RTS_LABEL _LABEL_PARSER_grammer_expression_restart_0=new RTS_LABEL(this,0,1,"restart"); // Local Label #1=restart At PrefixLevel 0
    // JavaLine 13 <== SourceLine 2224
    final RTS_LABEL _LABEL_PARSER_grammer_expression_Block2201_EXCALL_0=new RTS_LABEL(this,0,2,"EXCALL"); // Local Label #2=EXCALL At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 1950
    public boolean wasNotexpr=false;
    public boolean startexprstmt=false;
    // JavaLine 19 <== SourceLine 1951
    public boolean NOTblockprefix=false;
    public boolean NOTdesig=false;
    public boolean NOTlhsassig=false;
    public boolean NOTrefexpr=false;
    // JavaLine 24 <== SourceLine 1959
    public char operatortype=0;
    // JavaLine 26 <== SourceLine 1960
    public char opnx=0;
    // JavaLine 28 <== SourceLine 1961
    public char lastsymb=0;
    // JavaLine 30 <== SourceLine 1963
    public PARSER_grammer_expression ex=null;
    // Normal Constructor
    public PARSER_grammer_expression(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_expression _STM() {
        PARSER_grammer_expression _THIS=(PARSER_grammer_expression)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 2199
                detach(2199);
                ;
                // JavaLine 49 <== SourceLine 2200
                {
                    _SIM_LABEL(1); // DeclaredIn: expression
                    while(true) {
                        {
                            // JavaLine 54 <== SourceLine 2201
                            if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                new SCANNER_W1((_CUR._SL._SL),new RTS_TXT("expr., cs="),RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs));
                            }
                            ;
                            // JavaLine 59 <== SourceLine 2202
                            NOTblockprefix=NOTdesig=NOTlhsassig=NOTrefexpr=wasNotexpr=false;
                            ;
                            // JavaLine 62 <== SourceLine 2205
                            if(_VALUE(((((PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER)(_CUR._SL._SL)).opt))==(((char)2)))||((startexprstmt&&((((PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER)(_CUR._SL._SL)).opt))==(((char)4))))))))) {
                                // JavaLine 64 <== SourceLine 2207
                                {
                                    // JavaLine 66 <== SourceLine 2208
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                                        ((PARSER)(_CUR._SL._SL)).opn=((char)139);
                                    } else {
                                        // JavaLine 70 <== SourceLine 2209
                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('[')))) {
                                            {
                                                // JavaLine 73 <== SourceLine 2210
                                                NOTblockprefix=NOTdesig=true;
                                                ;
                                                // JavaLine 76 <== SourceLine 2211
                                                NOTlhsassig=NOTrefexpr=((((PARSER)(_CUR._SL._SL)).opdhi!=(((char)0)))||((((PARSER)(_CUR._SL._SL)).opdlo!=('A'))));
                                                ;
                                                // JavaLine 79 <== SourceLine 2213
                                                ((PARSER)(_CUR._SL._SL)).opn=((char)138);
                                            }
                                        } else {
                                            // JavaLine 83 <== SourceLine 2214
                                            _GOTO(_LABEL_PARSER_grammer_expression_Block2201_EXCALL_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                    // JavaLine 88 <== SourceLine 2215
                                    call(((PARSER)(_CUR._SL._SL)).coder,2215);
                                    ;
                                    // JavaLine 91 <== SourceLine 2216
                                    ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 96 <== SourceLine 2218
                                    detach(2218);
                                    ;
                                    // JavaLine 99 <== SourceLine 2220
                                    _GOTO(_LABEL_PARSER_grammer_expression_restart_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                            ;
                            // JavaLine 105 <== SourceLine 2223
                            {
                                _SIM_LABEL(2); // DeclaredIn: expression -> expression[PARSER_grammer_expression] DeclarationKind=Class
                                // JavaLine 108 <== SourceLine 2224
                                new PARSER_grammer_expression_exp((_CUR),false);
                            }
                            ;
                            // JavaLine 112 <== SourceLine 2225
                            if(_VALUE((lastsymb==('Q')))) {
                                NOTrefexpr=true;
                            } else {
                                // JavaLine 116 <== SourceLine 2226
                                if(_VALUE((lastsymb==(')')))) {
                                    NOTlhsassig=NOTrefexpr=true;
                                }
                            }
                            ;
                            // JavaLine 122 <== SourceLine 2228
                            detach(2228);
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 2232
                // BEGIN INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 expression",1,1948,11,2200,13,2224,16,1950,19,1951,24,1959,26,1960,28,1961,30,1963,46,2199,49,2200,54,2201,59,2202,62,2205,64,2207,66,2208,70,2209,73,2210,76,2211,79,2213,83,2214,88,2215,91,2216,96,2218,99,2220,105,2223,108,2224,112,2225,116,2226,122,2228,130,2232,142,2232);
} // End of Class
