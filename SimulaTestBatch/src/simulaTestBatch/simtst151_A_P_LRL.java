// JavaLine 1 <== SourceLine 61
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_LRL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=61, lastLine=65, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public double p_par_L;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 62
    public double P_L=0.0d;
    // JavaLine 15 <== SourceLine 61
    public double _RESULT=0.0d;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_LRL setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_L=doubleValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_LRL(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_LRL(RTS_RTObject _SL,double sp_par_L) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_L = sp_par_L;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_LRL _STM() {
        // JavaLine 45 <== SourceLine 63
        P_L=_RESULT=p_par_L=((simtst151_A)(_CUR._SL)).A_L=6731.4501953125d;
        ;
        // JavaLine 48 <== SourceLine 64
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fL="),RTS_ENVIRONMENT.edfix(P_L,2)),new RTS_TXT(", par\u005fL=")),RTS_ENVIRONMENT.edfix(p_par_L,2)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_LRL",1,61,13,62,15,61,45,63,48,64,53,65);
} // End of Procedure
