// JavaLine 1 <== SourceLine 53
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_Block33_Pq extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=53, lastLine=81, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_ix;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst26_Block33_Pq setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ix=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst26_Block33_Pq(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst26_Block33_Pq(RTS_RTObject _SL,int sp_ix) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ix = sp_ix;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst26_Block33_Pq _STM() {
        // JavaLine 42 <== SourceLine 54
        if(_VALUE((p_ix==(1)))) {
            _RESULT=new simtst26_Block33_Ps((_CUR._SL),1)._RESULT;
        } else {
            // JavaLine 46 <== SourceLine 55
            if(_VALUE((p_ix==(2)))) {
                _RESULT=new simtst26_Block33_Pq((_CUR._SL),4)._RESULT;
            } else {
                // JavaLine 50 <== SourceLine 56
                if(_VALUE((p_ix==(3)))) {
                    _RESULT=new simtst26_Block33_Pq((_CUR._SL),2)._RESULT;
                } else {
                    // JavaLine 54 <== SourceLine 57
                    if(_VALUE((p_ix==(4)))) {
                        // JavaLine 56 <== SourceLine 58
                        {
                            // JavaLine 58 <== SourceLine 59
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("IN TEXT PROCEDURE Pq: t,i,j,b="));
                            ;
                            // JavaLine 61 <== SourceLine 60
                            RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL._SL)).t_1,3);
                            ;
                            RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL._SL)).i_1,3);
                            ;
                            RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL._SL)).j_1,3);
                            ;
                            // JavaLine 68 <== SourceLine 61
                            RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                            ;
                            RTS_BASICIO.sysout().outimage();
                            ;
                            // JavaLine 73 <== SourceLine 63
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("if j=i then not b else b eqv b EVALUTES "));
                            ;
                            // JavaLine 76 <== SourceLine 64
                            ((simtst26)(_CUR._SL._SL)).BBB_1=(((((simtst26)(_CUR._SL._SL)).j_1==(((simtst26)(_CUR._SL._SL)).i_1)))?((!(((simtst26)(_CUR._SL._SL)).b_1))):(((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1))));
                            ;
                            // JavaLine 79 <== SourceLine 65
                            RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL._SL)).BBB_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                            ;
                            RTS_BASICIO.sysout().outimage();
                            ;
                            // JavaLine 84 <== SourceLine 67
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("if j=i then not b else (b eqv b) EVALUTES "));
                            ;
                            // JavaLine 87 <== SourceLine 68
                            ((simtst26)(_CUR._SL._SL)).BBB_1=(((((simtst26)(_CUR._SL._SL)).j_1==(((simtst26)(_CUR._SL._SL)).i_1)))?((!(((simtst26)(_CUR._SL._SL)).b_1))):(((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1))));
                            ;
                            // JavaLine 90 <== SourceLine 69
                            RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL._SL)).BBB_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                            ;
                            RTS_BASICIO.sysout().outimage();
                            ;
                            // JavaLine 95 <== SourceLine 71
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("(b eqv b) EVALUTES "));
                            ;
                            // JavaLine 98 <== SourceLine 72
                            ((simtst26)(_CUR._SL._SL)).BBB_1=((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1));
                            ;
                            // JavaLine 101 <== SourceLine 73
                            RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL._SL)).BBB_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                            ;
                            RTS_BASICIO.sysout().outimage();
                            ;
                            // JavaLine 106 <== SourceLine 75
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("if if j=i then not b else b eqv b then L3 else Ps(2) EVALUTES "));
                            ;
                            // JavaLine 109 <== SourceLine 76
                            RTS_BASICIO.sysout().outtext((((((((simtst26)(_CUR._SL._SL)).j_1==(((simtst26)(_CUR._SL._SL)).i_1)))?((!(((simtst26)(_CUR._SL._SL)).b_1))):(((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1)))))?(new RTS_TXT("L3")):(new simtst26_Block33_Ps((_CUR._SL),2)._RESULT)));
                            ;
                            RTS_BASICIO.sysout().outimage();
                            ;
                            // JavaLine 114 <== SourceLine 78
                            _RESULT=(((((((simtst26)(_CUR._SL._SL)).j_1==(((simtst26)(_CUR._SL._SL)).i_1)))?((!(((simtst26)(_CUR._SL._SL)).b_1))):(((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1)))))?(new RTS_TXT("L3")):(new simtst26_Block33_Ps((_CUR._SL),2)._RESULT));
                        }
                    } else {
                        // JavaLine 118 <== SourceLine 80
                        if(_VALUE((((simtst26)(_CUR._SL._SL)).i_1==(5)))) {
                            _RESULT=new simtst26_Block33_Pq((_CUR._SL),1)._RESULT;
                        }
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","5 Pq",1,53,42,54,46,55,50,56,54,57,56,58,58,59,61,60,68,61,73,63,76,64,79,65,84,67,87,68,90,69,95,71,98,72,101,73,106,75,109,76,114,78,118,80,129,81);
} // End of Procedure
