// JavaLine 1 <== SourceLine 55
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_REA extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=55, lastLine=59, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public float p_par_R;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 56
    public float P_R=0.0f;
    // JavaLine 15 <== SourceLine 55
    public float _RESULT=0.0f;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_REA setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_R=floatValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_REA(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_REA(RTS_RTObject _SL,float sp_par_R) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_R = sp_par_R;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_REA _STM() {
        // JavaLine 45 <== SourceLine 57
        P_R=_RESULT=p_par_R=((simtst151_A)(_CUR._SL)).A_R=7353.0f;
        ;
        // JavaLine 48 <== SourceLine 58
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fR="),RTS_ENVIRONMENT.edfix(P_R,2)),new RTS_TXT(", par\u005fR=")),RTS_ENVIRONMENT.edfix(p_par_R,2)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_REA",1,55,13,56,15,55,45,57,48,58,53,59);
} // End of Procedure
