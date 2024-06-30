// JavaLine 1 <== SourceLine 49
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_INT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=49, lastLine=53, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_par_I;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 50
    public int P_I=0;
    // JavaLine 15 <== SourceLine 49
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_INT setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_I=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_INT(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_INT(RTS_RTObject _SL,int sp_par_I) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_I = sp_par_I;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_INT _STM() {
        // JavaLine 45 <== SourceLine 51
        P_I=_RESULT=p_par_I=((simtst151_A)(_CUR._SL)).A_I=5632;
        ;
        // JavaLine 48 <== SourceLine 52
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fI="),RTS_ENVIRONMENT.edit(P_I)),new RTS_TXT(", par\u005fI=")),RTS_ENVIRONMENT.edit(p_par_I)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_INT",1,49,13,50,15,49,45,51,48,52,53,53);
} // End of Procedure
