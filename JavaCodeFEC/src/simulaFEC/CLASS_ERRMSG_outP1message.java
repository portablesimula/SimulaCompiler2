// JavaLine 1 <== SourceLine 159
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_outP1message extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=159, lastLine=196, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_where;
    public int p_message;
    public char p_code;
    // Declare local labels
    // JavaLine 13 <== SourceLine 196
    final RTS_LABEL _LABEL_CLASS_ERRMSG_outP1message_NOMESS_0=new RTS_LABEL(this,0,1,"NOMESS"); // Local Label #1=NOMESS At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 161
    public RTS_TXT marker=null;
    public RTS_TXT utlin=null;
    public int tabcor=0;
    // JavaLine 20 <== SourceLine 162
    public final char ISOtab=(char)(((char)9));
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_outP1message setPar(Object param) {
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
    public CLASS_ERRMSG_outP1message(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_outP1message(RTS_RTObject _SL,int sp_where,int sp_message,char sp_code) {
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
    public CLASS_ERRMSG_outP1message _STM() {
        CLASS_ERRMSG_outP1message _THIS=(CLASS_ERRMSG_outP1message)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 163
                if(_VALUE(((((CLASS_ERRMSG)(_CUR._SL)).lasterrline_1==(((CLASS_ERRMSG)(_CUR._SL)).linenr))&&(((((CLASS_ERRMSG)(_CUR._SL)).lasterrpos_1>=(p_where))|((((CLASS_ERRMSG)(_CUR._SL)).lasterrmess_1==(p_message)))))))) {
                    // JavaLine 60 <== SourceLine 165
                    {
                        // JavaLine 62 <== SourceLine 166
                        ((CLASS_ERRMSG)(_CUR._SL)).errloop_1=(((CLASS_ERRMSG)(_CUR._SL)).errloop_1+(1));
                        ;
                        // JavaLine 65 <== SourceLine 167
                        if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).errloop_1>(4)))) {
                            new CLASS_ERRMSG_fatal0((_CUR._SL),0);
                        }
                        ;
                        // JavaLine 70 <== SourceLine 169
                        _GOTO(_LABEL_CLASS_ERRMSG_outP1message_NOMESS_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 76 <== SourceLine 171
                ((CLASS_ERRMSG)(_CUR._SL)).errloop_1=0;
                ;
                // JavaLine 79 <== SourceLine 172
                ((CLASS_ERRMSG)(_CUR._SL)).lasterrmess_1=p_message;
                ;
                // JavaLine 82 <== SourceLine 175
                utlin=((CLASS_ERRMSG)(_CUR._SL)).line;
                ;
                // JavaLine 85 <== SourceLine 176
                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).lasterrline_1!=(((CLASS_ERRMSG)(_CUR._SL)).linenr)))) {
                    {
                        // JavaLine 88 <== SourceLine 177
                        if(_VALUE(((!(((CLASS_ERRMSG)(_CUR._SL)).listingon))||((((CLASS_ERRMSG)(_CUR._SL)).listfile!=(RTS_BASICIO.sysout())))))) {
                            // JavaLine 90 <== SourceLine 178
                            {
                                // JavaLine 92 <== SourceLine 179
                                RTS_BASICIO.sysout().outint(((CLASS_ERRMSG)(_CUR._SL)).linenr,6);
                                ;
                                RTS_BASICIO.sysout().outtext(new RTS_TXT(": "));
                                ;
                                RTS_BASICIO.sysout().outtext(utlin);
                                ;
                                // JavaLine 99 <== SourceLine 180
                                RTS_BASICIO.sysout().outimage();
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 108 <== SourceLine 183
                if(_VALUE(((((CLASS_ERRMSG)(_CUR._SL)).lasterrpos_1!=(p_where))|((((CLASS_ERRMSG)(_CUR._SL)).lasterrline_1!=(((CLASS_ERRMSG)(_CUR._SL)).linenr)))))) {
                    {
                        // JavaLine 111 <== SourceLine 184
                        tabcor=(p_where+(7));
                        ;
                        RTS_TXT.setpos(utlin,1);
                        ;
                        // JavaLine 116 <== SourceLine 186
                        while(RTS_TXT.more(utlin)) {
                            if(_VALUE((RTS_TXT.getchar(utlin)==(((char)9))))) {
                                // JavaLine 119 <== SourceLine 187
                                tabcor=((tabcor+(8))-(RTS_ENVIRONMENT.rem(7,RTS_TXT.pos(utlin))));
                            }
                        }
                        ;
                        // JavaLine 124 <== SourceLine 188
                        marker=RTS_ENVIRONMENT.blanks(tabcor);
                        ;
                        // JavaLine 127 <== SourceLine 189
                        RTS_TXT.setpos(marker,9);
                        ;
                        // JavaLine 130 <== SourceLine 190
                        while((RTS_TXT.pos(marker)<(tabcor))) {
                            RTS_TXT.putchar(marker,'=');
                        }
                        ;
                        // JavaLine 135 <== SourceLine 191
                        RTS_TXT.putchar(marker,'I');
                        ;
                        new CLASS_ERRMSG_printDiag((_CUR._SL),marker);
                        ;
                    }
                }
                ;
                // JavaLine 143 <== SourceLine 193
                ((CLASS_ERRMSG)(_CUR._SL)).lasterrline_1=((CLASS_ERRMSG)(_CUR._SL)).linenr;
                ;
                ((CLASS_ERRMSG)(_CUR._SL)).lasterrpos_1=p_where;
                ;
                // JavaLine 148 <== SourceLine 194
                new CLASS_ERRMSG_GiveMessage((_CUR._SL),p_code,p_message);
                ;
                // JavaLine 151 <== SourceLine 195
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 outP1message",1,159,13,196,16,161,20,162,58,163,60,165,62,166,65,167,70,169,76,171,79,172,82,175,85,176,88,177,90,178,92,179,99,180,108,183,111,184,116,186,119,187,124,188,127,189,130,190,135,191,143,193,148,194,151,195,165,196);
} // End of Procedure
