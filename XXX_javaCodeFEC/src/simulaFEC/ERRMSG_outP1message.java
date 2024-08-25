// JavaLine 1 <== SourceLine 164
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_outP1message extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=164, lastLine=201, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_where;
    public int p_message;
    public char p_code;
    // Declare local labels
    // JavaLine 13 <== SourceLine 201
    final RTS_LABEL _LABEL_ERRMSG_outP1message_NOMESS_0=new RTS_LABEL(this,0,1,"NOMESS"); // Local Label #1=NOMESS At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 166
    public RTS_TXT marker=null;
    public RTS_TXT utlin=null;
    public int tabcor=0;
    // JavaLine 20 <== SourceLine 167
    public final char ISOtab=(char)(((char)9));
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_outP1message setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_where=intValue(param); break;
                case 2: p_message=intValue(param); break;
                case 1: p_code=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_outP1message(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_outP1message(RTS_RTObject _SL,int sp_where,int sp_message,char sp_code) {
        super(_SL);
        // Parameter assignment to locals
        this.p_where = sp_where;
        this.p_message = sp_message;
        this.p_code = sp_code;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_outP1message _STM() {
        ERRMSG_outP1message _THIS=(ERRMSG_outP1message)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 168
                if(_VALUE(((((ERRMSG)(_CUR._SL)).lasterrline_1==(((ERRMSG)(_CUR._SL)).linenr))&&(((((ERRMSG)(_CUR._SL)).lasterrpos_1>=(p_where))|((((ERRMSG)(_CUR._SL)).lasterrmess_1==(p_message)))))))) {
                    // JavaLine 60 <== SourceLine 170
                    {
                        // JavaLine 62 <== SourceLine 171
                        ((ERRMSG)(_CUR._SL)).errloop_1=(((ERRMSG)(_CUR._SL)).errloop_1+(1));
                        ;
                        // JavaLine 65 <== SourceLine 172
                        if(_VALUE((((ERRMSG)(_CUR._SL)).errloop_1>(4)))) {
                            new ERRMSG_fatal0((_CUR._SL),0);
                        }
                        ;
                        // JavaLine 70 <== SourceLine 174
                        _GOTO(_LABEL_ERRMSG_outP1message_NOMESS_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 76 <== SourceLine 176
                ((ERRMSG)(_CUR._SL)).errloop_1=0;
                ;
                // JavaLine 79 <== SourceLine 177
                ((ERRMSG)(_CUR._SL)).lasterrmess_1=p_message;
                ;
                // JavaLine 82 <== SourceLine 180
                utlin=((ERRMSG)(_CUR._SL)).line;
                ;
                // JavaLine 85 <== SourceLine 181
                if(_VALUE((((ERRMSG)(_CUR._SL)).lasterrline_1!=(((ERRMSG)(_CUR._SL)).linenr)))) {
                    {
                        // JavaLine 88 <== SourceLine 182
                        if(_VALUE(((!(((ERRMSG)(_CUR._SL)).listingon))||((((ERRMSG)(_CUR._SL)).listfile!=(RTS_BASICIO.sysout())))))) {
                            // JavaLine 90 <== SourceLine 183
                            {
                                // JavaLine 92 <== SourceLine 184
                                RTS_BASICIO.sysout().outint(((ERRMSG)(_CUR._SL)).linenr,6);
                                ;
                                RTS_BASICIO.sysout().outtext(new RTS_TXT(": "));
                                ;
                                RTS_BASICIO.sysout().outtext(utlin);
                                ;
                                // JavaLine 99 <== SourceLine 185
                                RTS_BASICIO.sysout().outimage();
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 108 <== SourceLine 188
                if(_VALUE(((((ERRMSG)(_CUR._SL)).lasterrpos_1!=(p_where))|((((ERRMSG)(_CUR._SL)).lasterrline_1!=(((ERRMSG)(_CUR._SL)).linenr)))))) {
                    {
                        // JavaLine 111 <== SourceLine 189
                        tabcor=(p_where+(7));
                        ;
                        RTS_TXT.setpos(utlin,1);
                        ;
                        // JavaLine 116 <== SourceLine 191
                        while(RTS_TXT.more(utlin)) {
                            if(_VALUE((RTS_TXT.getchar(utlin)==(((char)9))))) {
                                // JavaLine 119 <== SourceLine 192
                                tabcor=((tabcor+(8))-(RTS_ENVIRONMENT.rem(7,RTS_TXT.pos(utlin))));
                            }
                        }
                        ;
                        // JavaLine 124 <== SourceLine 193
                        marker=RTS_ENVIRONMENT.blanks(tabcor);
                        ;
                        // JavaLine 127 <== SourceLine 194
                        RTS_TXT.setpos(marker,9);
                        ;
                        // JavaLine 130 <== SourceLine 195
                        while((RTS_TXT.pos(marker)<(tabcor))) {
                            RTS_TXT.putchar(marker,'=');
                        }
                        ;
                        // JavaLine 135 <== SourceLine 196
                        RTS_TXT.putchar(marker,'I');
                        ;
                        new ERRMSG_printDiag((_CUR._SL),marker);
                        ;
                    }
                }
                ;
                // JavaLine 143 <== SourceLine 198
                ((ERRMSG)(_CUR._SL)).lasterrline_1=((ERRMSG)(_CUR._SL)).linenr;
                ;
                ((ERRMSG)(_CUR._SL)).lasterrpos_1=p_where;
                ;
                // JavaLine 148 <== SourceLine 199
                new ERRMSG_GiveMessage((_CUR._SL),p_code,p_message);
                ;
                // JavaLine 151 <== SourceLine 200
                {
                    _SIM_LABEL(1); // DeclaredIn: outP1message
                    ;
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 outP1message",1,164,13,201,16,166,20,167,58,168,60,170,62,171,65,172,70,174,76,176,79,177,82,180,85,181,88,182,90,183,92,184,99,185,108,188,111,189,116,191,119,192,124,193,127,194,130,195,135,196,143,198,148,199,151,200,165,201);
} // End of Procedure
