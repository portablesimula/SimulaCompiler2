// JavaLine 1 <== SourceLine 77
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_diagmerge extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=77, lastLine=106, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_n;
    // Declare local labels
    // JavaLine 13 <== SourceLine 101
    final RTS_LABEL _LABEL_CLASS_ERRMSG_diagmerge_Block81_Block82_CONCAT_0=new RTS_LABEL(this,0,1,"CONCAT"); // Local Label #1=CONCAT At PrefixLevel 0
    // JavaLine 15 <== SourceLine 106
    final RTS_LABEL _LABEL_CLASS_ERRMSG_diagmerge_EX_0=new RTS_LABEL(this,0,2,"EX"); // Local Label #2=EX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 78
    public RTS_TXT result=null;
    public RTS_TXT t=null;
    public RTS_TXT t2=null;
    public int i=0;
    // JavaLine 23 <== SourceLine 77
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_diagmerge setPar(Object param) {
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
    public CLASS_ERRMSG_diagmerge(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_diagmerge(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_diagmerge _STM() {
        CLASS_ERRMSG_diagmerge _THIS=(CLASS_ERRMSG_diagmerge)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 57 <== SourceLine 79
                _RESULT=t=new CLASS_ERRMSG_errmsg((_CUR._SL),p_n)._RESULT;
                ;
                // JavaLine 60 <== SourceLine 80
                if(_VALUE(RTS_UTIL.TRF_NE(((CLASS_ERRMSG)(_CUR._SL)).diag.getELEMENT(0),null))) {
                    {
                        // JavaLine 63 <== SourceLine 81
                        while(RTS_UTIL.TRF_NE(((CLASS_ERRMSG)(_CUR._SL)).diag.getELEMENT(i),null)) {
                            {
                                // JavaLine 66 <== SourceLine 82
                                if(_VALUE(((RTS_ENVIRONMENT.loadChar(((CLASS_ERRMSG)(_CUR._SL)).diag.getELEMENT(i),0)==('_'))&&((RTS_ENVIRONMENT.loadChar(((CLASS_ERRMSG)(_CUR._SL)).diag.getELEMENT(i),1)==('_')))))) {
                                    // JavaLine 68 <== SourceLine 84
                                    {
                                        // JavaLine 70 <== SourceLine 85
                                        if(_VALUE((p_n==(337)))) {
                                            {
                                                // JavaLine 73 <== SourceLine 86
                                                _RESULT=new CLASS_ERRMSG_errmsg((_CUR._SL),168)._RESULT;
                                                ;
                                                _GOTO(_LABEL_CLASS_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 80 <== SourceLine 87
                                        if(_VALUE((p_n==(427)))) {
                                            {
                                                // JavaLine 83 <== SourceLine 88
                                                _RESULT=new CLASS_ERRMSG_errmsg((_CUR._SL),358)._RESULT;
                                                ;
                                                _GOTO(_LABEL_CLASS_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 90 <== SourceLine 89
                                        if(_VALUE((p_n==(426)))) {
                                            {
                                                // JavaLine 93 <== SourceLine 90
                                                _RESULT=new CLASS_ERRMSG_errmsg((_CUR._SL),234)._RESULT;
                                                ;
                                                _GOTO(_LABEL_CLASS_ERRMSG_diagmerge_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 100 <== SourceLine 91
                                        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(i),new RTS_TXT("ACTIVATE"));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 106 <== SourceLine 93
                                while(RTS_TXT.more(t)) {
                                    // JavaLine 108 <== SourceLine 94
                                    if(_VALUE((RTS_TXT.getchar(t)==('?')))) {
                                        {
                                            // JavaLine 111 <== SourceLine 95
                                            t2=RTS_TXT.sub(t,1,(RTS_TXT.pos(t)-(2)));
                                            ;
                                            // JavaLine 114 <== SourceLine 96
                                            t=RTS_TXT.sub(t,RTS_TXT.pos(t),((RTS_TXT.length(t)-(RTS_TXT.pos(t)))+(1)));
                                            ;
                                            // JavaLine 117 <== SourceLine 97
                                            _GOTO(_LABEL_CLASS_ERRMSG_diagmerge_Block81_Block82_CONCAT_0); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 124 <== SourceLine 99
                                t2=t;
                                ;
                                t=null;
                                ;
                                // JavaLine 129 <== SourceLine 100
                                {
                                    _SIM_LABEL(1); // DeclaredIn: diagmerge -> diagmerge[externalIdent=CLASS_ERRMSG_diagmerge] Kind=5, QUAL=ProcedureDeclaration, HashCode=726374052, Protected by diagmerge defined in CLASS_ERRMSG
                                    // JavaLine 132 <== SourceLine 101
                                    result=CONC(CONC(result,t2),((CLASS_ERRMSG)(_CUR._SL)).diag.getELEMENT(i));
                                }
                                ;
                                // JavaLine 136 <== SourceLine 102
                                ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(i),null);
                                ;
                                i=(i+(1));
                                ;
                            }
                        }
                        ;
                        // JavaLine 144 <== SourceLine 104
                        _RESULT=CONC(result,t);
                        ;
                    }
                }
                ;
                // JavaLine 150 <== SourceLine 106
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 diagmerge",1,77,13,101,15,106,18,78,23,77,57,79,60,80,63,81,66,82,68,84,70,85,73,86,80,87,83,88,90,89,93,90,100,91,106,93,108,94,111,95,114,96,117,97,124,99,129,100,132,101,136,102,144,104,150,106,164,106);
} // End of Procedure
