// JavaLine 1 <== SourceLine 40
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_Block33_Pst extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=40, lastLine=43, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_ix;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst26_Block33_Pst setPar(Object param) {
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
    public simtst26_Block33_Pst(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst26_Block33_Pst(RTS_RTObject _SL,int sp_ix) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ix = sp_ix;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst26_Block33_Pst _STM() {
        // JavaLine 42 <== SourceLine 41
        if(_VALUE((p_ix==(1)))) {
            _RESULT=new RTS_TXT("T1");
        } else {
            // JavaLine 46 <== SourceLine 42
            if(_VALUE((p_ix==(2)))) {
                _RESULT=new RTS_TXT("T2");
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","5 Pst",1,40,42,41,46,42,54,43);
} // End of Procedure
