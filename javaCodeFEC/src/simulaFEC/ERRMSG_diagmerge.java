// JavaLine 1 <== SourceLine 87
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_diagmerge extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=87, lastLine=116, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_n;
    // Declare local labels
    // JavaLine 13 <== SourceLine 111
    final RTS_LABEL _LABEL_ERRMSG_diagmerge_CompoundStatement115_CompoundStatement113_CONCAT_0=new RTS_LABEL(this,0,1,"CONCAT"); // Local Label #1=CONCAT At PrefixLevel 0
    // JavaLine 15 <== SourceLine 116
    final RTS_LABEL _LABEL_ERRMSG_diagmerge_EX_0=new RTS_LABEL(this,0,2,"EX"); // Local Label #2=EX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 88
    public RTS_TXT result=null;
    public RTS_TXT t=null;
    public RTS_TXT t2=null;
    public int i=0;
    // JavaLine 23 <== SourceLine 87
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_diagmerge setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_diagmerge(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public ERRMSG_diagmerge(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_diagmerge _STM() {
        ERRMSG_diagmerge _THIS=(ERRMSG_diagmerge)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 57 <== SourceLine 89
                _RESULT=t=new ERRMSG_errmsg((_CUR._SL),p_n)._RESULT;
                ;
                // JavaLine 60 <== SourceLine 90
                if(_VALUE(TRF_NE(((ERRMSG)(_CUR._SL)).diag.getELEMENT(0),null))) {
                    {
                        // JavaLine 63 <== SourceLine 91
                        while(TRF_NE(((ERRMSG)(_CUR._SL)).diag.getELEMENT(i),null)) {
                            {
                                // JavaLine 66 <== SourceLine 92
                                if(_VALUE(((RTS_ENVIRONMENT.loadChar(((ERRMSG)(_CUR._SL)).diag.getELEMENT(i),0)==('_'))&&((RTS_ENVIRONMENT.loadChar(((ERRMSG)(_CUR._SL)).diag.getELEMENT(i),1)==('_')))))) {
                                    // JavaLine 68 <== SourceLine 94
                                    {
                                        // JavaLine 70 <== SourceLine 95
                                        if(_VALUE((p_n==(337)))) {
                                            {
                                                // JavaLine 73 <== SourceLine 96
                                                _RESULT=new ERRMSG_errmsg((_CUR._SL),168)._RESULT;
                                                ;
                                                _GOTO(_LABEL_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 80 <== SourceLine 97
                                        if(_VALUE((p_n==(427)))) {
                                            {
                                                // JavaLine 83 <== SourceLine 98
                                                _RESULT=new ERRMSG_errmsg((_CUR._SL),358)._RESULT;
                                                ;
                                                _GOTO(_LABEL_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 90 <== SourceLine 99
                                        if(_VALUE((p_n==(426)))) {
                                            {
                                                // JavaLine 93 <== SourceLine 100
                                                _RESULT=new ERRMSG_errmsg((_CUR._SL),234)._RESULT;
                                                ;
                                                _GOTO(_LABEL_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 100 <== SourceLine 101
                                        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(i),new RTS_TXT("ACTIVATE"));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 106 <== SourceLine 103
                                while(RTS_TXT.more(t)) {
                                    // JavaLine 108 <== SourceLine 104
                                    if(_VALUE((RTS_TXT.getchar(t)==('?')))) {
                                        {
                                            // JavaLine 111 <== SourceLine 105
                                            t2=RTS_TXT.sub(t,1,(RTS_TXT.pos(t)-(2)));
                                            ;
                                            // JavaLine 114 <== SourceLine 106
                                            t=RTS_TXT.sub(t,RTS_TXT.pos(t),((RTS_TXT.length(t)-(RTS_TXT.pos(t)))+(1)));
                                            ;
                                            // JavaLine 117 <== SourceLine 107
                                            _GOTO(_LABEL_ERRMSG_diagmerge_CompoundStatement115_CompoundStatement113_CONCAT_0); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 124 <== SourceLine 109
                                t2=t;
                                ;
                                t=null;
                                ;
                                // JavaLine 129 <== SourceLine 110
                                {
                                    _SIM_LABEL(1); // DeclaredIn: diagmerge -> diagmerge[externalIdent=ERRMSG_diagmerge] Kind=5, QUAL=ProcedureDeclaration, HashCode=1322057909, Protected by diagmerge defined in ERRMSG
                                    // JavaLine 132 <== SourceLine 111
                                    result=CONC(CONC(result,t2),((ERRMSG)(_CUR._SL)).diag.getELEMENT(i));
                                }
                                ;
                                // JavaLine 136 <== SourceLine 112
                                ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(i),null);
                                ;
                                i=(i+(1));
                                ;
                            }
                        }
                        ;
                        // JavaLine 144 <== SourceLine 114
                        _RESULT=CONC(result,t);
                        ;
                    }
                }
                ;
                // JavaLine 150 <== SourceLine 116
                {
                    _SIM_LABEL(2); // DeclaredIn: diagmerge
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 diagmerge",1,87,13,111,15,116,18,88,23,87,57,89,60,90,63,91,66,92,68,94,70,95,73,96,80,97,83,98,90,99,93,100,100,101,106,103,108,104,111,105,114,106,117,107,124,109,129,110,132,111,136,112,144,114,150,116,164,116);
} // End of Procedure
