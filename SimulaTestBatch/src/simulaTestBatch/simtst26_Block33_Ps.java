// JavaLine 1 <== SourceLine 45
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_Block33_Ps extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=45, lastLine=51, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_ix;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst26_Block33_Ps setPar(Object param) {
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
    public simtst26_Block33_Ps(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst26_Block33_Ps(RTS_RTObject _SL,int sp_ix) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ix = sp_ix;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst26_Block33_Ps _STM() {
        // JavaLine 42 <== SourceLine 46
        if(_VALUE((p_ix==(1)))) {
            _RESULT=new RTS_TXT("L1");
        } else {
            // JavaLine 46 <== SourceLine 47
            if(_VALUE((p_ix==(2)))) {
                _RESULT=new RTS_TXT("L2");
            } else {
                // JavaLine 50 <== SourceLine 48
                if(_VALUE((p_ix==(3)))) {
                    _RESULT=new simtst26_Block33_Pq((_CUR._SL),((simtst26)(_CUR._SL._SL)).i_1)._RESULT;
                } else {
                    // JavaLine 54 <== SourceLine 50
                    if(_VALUE((p_ix==(4)))) {
                        _RESULT=((((!((simtst26)(_CUR._SL._SL)).b_1) | (((simtst26)(_CUR._SL._SL)).j_1>(((simtst26)(_CUR._SL._SL)).i_1))))?(new simtst26_Block33_Pq((_CUR._SL),2)._RESULT):(new RTS_TXT("L2")));
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","5 Ps",1,45,42,46,46,47,50,48,54,50,64,51);
} // End of Procedure
