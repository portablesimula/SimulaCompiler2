// JavaLine 1 <== SourceLine 119
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_errmsg extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=119, lastLine=157, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare local labels
    // JavaLine 13 <== SourceLine 123
    final RTS_LABEL _LABEL_CLASS_ERRMSG_errmsg_Block123_SETNUM_0=new RTS_LABEL(this,0,1,"SETNUM"); // Local Label #1=SETNUM At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 120
    public RTS_TXT t=null;
    // JavaLine 18 <== SourceLine 119
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_errmsg setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_errmsg(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_errmsg(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_errmsg _STM() {
        CLASS_ERRMSG_errmsg _THIS=(CLASS_ERRMSG_errmsg)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 52 <== SourceLine 121
                if(_VALUE((p_i==(0)))) {
                    ;
                } else {
                    // JavaLine 56 <== SourceLine 122
                    if(_VALUE(((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1)) {
                        {
                            // JavaLine 59 <== SourceLine 123
                            {
                                _SIM_LABEL(1); // DeclaredIn: errmsg -> errmsg[externalIdent=CLASS_ERRMSG_errmsg] Kind=5, QUAL=ProcedureDeclaration, HashCode=2118482375
                                _RESULT=t=RTS_ENVIRONMENT.copy(copy(new RTS_TXT(" ERROR ... ")));
                            }
                            ;
                            RTS_TXT.putint(RTS_TXT.sub(t,8,3),p_i);
                            ;
                        }
                    } else {
                        // JavaLine 69 <== SourceLine 125
                        if(_VALUE(((p_i>(0))&&((p_i<=(450)))))) {
                            {
                                // JavaLine 72 <== SourceLine 126
                                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1==(null)))) {
                                    {
                                        // JavaLine 75 <== SourceLine 127
                                        t=RTS_ENVIRONMENT.getTextInfo(22);
                                        ;
                                        // JavaLine 78 <== SourceLine 128
                                        if(_VALUE(RTS_UTIL.TRF_EQ(t,null))) {
                                            t=new RTS_TXT("FECERROR");
                                        }
                                        ;
                                        // JavaLine 83 <== SourceLine 132
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1=new RTS_Directfile(_USR,t)._STM();
                                        ;
                                        // JavaLine 86 <== SourceLine 133
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.setaccess(new RTS_TXT("READONLY"));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 92 <== SourceLine 135
                                if(_VALUE((!(((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1)))) {
                                    {
                                        // JavaLine 95 <== SourceLine 136
                                        t=RTS_ENVIRONMENT.blanks(50);
                                        ;
                                        // JavaLine 98 <== SourceLine 137
                                        if(_VALUE((!(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.open(t))))) {
                                            {
                                                // JavaLine 101 <== SourceLine 138
                                                new CLASS_ERRMSG_printDiag((_CUR._SL),new RTS_TXT("*** CAN'T OPEN DIAGNOSTICS FILE ***"));
                                                ;
                                                // JavaLine 104 <== SourceLine 139
                                                ((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1=true;
                                                ;
                                                _GOTO(_LABEL_CLASS_ERRMSG_errmsg_Block123_SETNUM_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 112 <== SourceLine 146
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.locate(p_i);
                                        ;
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.inimage();
                                        ;
                                        // JavaLine 117 <== SourceLine 147
                                        if(_VALUE(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.endfile())) {
                                            {
                                                // JavaLine 120 <== SourceLine 148
                                                new CLASS_ERRMSG_printDiag((_CUR._SL),new RTS_TXT("*** INCOMPATIBLE DIAGNOSTICS FILE ***"));
                                                ;
                                                // JavaLine 123 <== SourceLine 149
                                                _GOTO(_LABEL_CLASS_ERRMSG_errmsg_Block123_SETNUM_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 129 <== SourceLine 151
                                        _RESULT=RTS_ENVIRONMENT.copy(copy(RTS_TXT.strip(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.image)));
                                        ;
                                        // JavaLine 132 <== SourceLine 152
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.close();
                                        ;
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 140 <== SourceLine 155
                            {
                                _RESULT=t=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("*** DIAGNOSTIC ERROR: .....")));
                                ;
                                // JavaLine 144 <== SourceLine 156
                                RTS_TXT.putint(RTS_TXT.sub(t,23,5),p_i);
                            }
                        }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 errmsg",1,119,13,123,16,120,18,119,52,121,56,122,59,123,69,125,72,126,75,127,78,128,83,132,86,133,92,135,95,136,98,137,101,138,104,139,112,146,117,147,120,148,123,149,129,151,132,152,140,155,144,156,160,157);
} // End of Procedure
