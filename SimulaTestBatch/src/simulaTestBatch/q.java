// JavaLine 1 <== SourceLine 36
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class q extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=36, lastLine=0, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p__SW;
    // Declare locals as attributes
    public RTS_LABEL _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public q setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p__SW=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public q(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public q(RTS_RTObject _SL,int sp__SW) {
        super(_SL);
        // Parameter assignment to locals
        this.p__SW = sp__SW;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Switch Body
    @Override
    public q _STM() {
        switch(p__SW-1) {
            case 0: _RESULT=new s((_CUR._SL),1)._RESULT; break;
            case 1: _RESULT=new q((_CUR._SL),4)._RESULT; break;
            case 2: _RESULT=new q((_CUR._SL),2)._RESULT; break;
            case 3: _RESULT=(((((((simtst26)(_CUR._SL._SL)).j_1==(((simtst26)(_CUR._SL._SL)).i_1)))?((!(((simtst26)(_CUR._SL._SL)).b_1))):(((((simtst26)(_CUR._SL._SL)).b_1) == (((simtst26)(_CUR._SL._SL)).b_1)))))?(((simtst26_Block33)(_CUR._SL))._LABEL_simtst26_Block33_L3_0):(new s((_CUR._SL),2)._RESULT)); break;
            case 4: _RESULT=new q((_CUR._SL),1)._RESULT; break;
            default: throw new RTS_SimulaRuntimeError("Illegal switch index: "+p__SW);
        }
        EBLK();
        return(this);
    } // End of Switch BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","5 q",1,36,52,0);
} // End of Procedure
