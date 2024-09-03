// JavaLine 1 <== SourceLine 109
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_OLD_errmsg extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=109, lastLine=143, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare local labels
    // JavaLine 13 <== SourceLine 117
    final RTS_LABEL _LABEL_CLASS_ERRMSG_OLD_errmsg_Block117_SETNUM_0=new RTS_LABEL(this,0,1,"SETNUM"); // Local Label #1=SETNUM At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 110
    public RTS_TXT t=null;
    // JavaLine 18 <== SourceLine 109
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_OLD_errmsg setPar(Object param) {
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
    public CLASS_ERRMSG_OLD_errmsg(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_OLD_errmsg(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_OLD_errmsg _STM() {
        CLASS_ERRMSG_OLD_errmsg _THIS=(CLASS_ERRMSG_OLD_errmsg)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 52 <== SourceLine 112
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("CLASS\u005fERRMSG.errmsg: "),RTS_ENVIRONMENT.edit(p_i)));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 57 <== SourceLine 113
                p_i=0;
                ;
                // JavaLine 60 <== SourceLine 115
                if(_VALUE((p_i==(0)))) {
                    ;
                } else {
                    // JavaLine 64 <== SourceLine 116
                    if(_VALUE(((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1)) {
                        {
                            // JavaLine 67 <== SourceLine 117
                            {
                                _SIM_LABEL(1); // DeclaredIn: OLD_errmsg -> OLD_errmsg[externalIdent=CLASS_ERRMSG_OLD_errmsg] Kind=5, QUAL=ProcedureDeclaration, HashCode=769195805
                                _RESULT=t=RTS_ENVIRONMENT.copy(copy(new RTS_TXT(" ERROR ... ")));
                            }
                            ;
                            RTS_TXT.putint(RTS_TXT.sub(t,8,3),p_i);
                            ;
                        }
                    } else {
                        // JavaLine 77 <== SourceLine 119
                        if(_VALUE(((p_i>(0))&&((p_i<=(450)))))) {
                            {
                                // JavaLine 80 <== SourceLine 120
                                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1==(null)))) {
                                    {
                                        // JavaLine 83 <== SourceLine 121
                                        t=RTS_ENVIRONMENT.getTextInfo(22);
                                        ;
                                        // JavaLine 86 <== SourceLine 122
                                        if(_VALUE(RTS_UTIL.TRF_EQ(t,null))) {
                                            t=new RTS_TXT("FECERROR");
                                        }
                                        ;
                                        // JavaLine 91 <== SourceLine 123
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1=new RTS_Directfile(_USR,t)._STM();
                                        ;
                                        // JavaLine 94 <== SourceLine 124
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.setaccess(new RTS_TXT("READONLY"));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 100 <== SourceLine 126
                                if(_VALUE((!(((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1)))) {
                                    {
                                        // JavaLine 103 <== SourceLine 127
                                        t=RTS_ENVIRONMENT.blanks(50);
                                        ;
                                        // JavaLine 106 <== SourceLine 128
                                        if(_VALUE((!(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.open(t))))) {
                                            {
                                                // JavaLine 109 <== SourceLine 129
                                                new CLASS_ERRMSG_printDiag((_CUR._SL),new RTS_TXT("*** CAN'T OPEN DIAGNOSTICS FILE ***"));
                                                ;
                                                // JavaLine 112 <== SourceLine 130
                                                ((CLASS_ERRMSG)(_CUR._SL)).ERRnotopen_1=true;
                                                ;
                                                _GOTO(_LABEL_CLASS_ERRMSG_OLD_errmsg_Block117_SETNUM_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 120 <== SourceLine 132
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.locate(p_i);
                                        ;
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.inimage();
                                        ;
                                        // JavaLine 125 <== SourceLine 133
                                        if(_VALUE(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.endfile())) {
                                            {
                                                // JavaLine 128 <== SourceLine 134
                                                new CLASS_ERRMSG_printDiag((_CUR._SL),new RTS_TXT("*** INCOMPATIBLE DIAGNOSTICS FILE ***"));
                                                ;
                                                // JavaLine 131 <== SourceLine 135
                                                _GOTO(_LABEL_CLASS_ERRMSG_OLD_errmsg_Block117_SETNUM_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 137 <== SourceLine 137
                                        _RESULT=RTS_ENVIRONMENT.copy(copy(RTS_TXT.strip(((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.image)));
                                        ;
                                        // JavaLine 140 <== SourceLine 138
                                        ((CLASS_ERRMSG)(_CUR._SL)).ERRORFILE_1.close();
                                        ;
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 148 <== SourceLine 141
                            {
                                _RESULT=t=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("*** DIAGNOSTIC ERROR: .....")));
                                ;
                                // JavaLine 152 <== SourceLine 142
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 OLD_errmsg",1,109,13,117,16,110,18,109,52,112,57,113,60,115,64,116,67,117,77,119,80,120,83,121,86,122,91,123,94,124,100,126,103,127,106,128,109,129,112,130,120,132,125,133,128,134,131,135,137,137,140,138,148,141,152,142,168,143);
} // End of Procedure
