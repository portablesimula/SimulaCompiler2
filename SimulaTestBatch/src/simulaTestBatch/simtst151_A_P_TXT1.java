// JavaLine 1 <== SourceLine 67
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_TXT1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=67, lastLine=71, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_par_T;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 68
    public RTS_TXT P_T=null;
    // JavaLine 15 <== SourceLine 67
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_TXT1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_T=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_TXT1(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_TXT1(RTS_RTObject _SL,RTS_TXT sp_par_T) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_T = sp_par_T;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_TXT1 _STM() {
        // JavaLine 45 <== SourceLine 69
        P_T=_RESULT=p_par_T=((simtst151_A)(_CUR._SL)).A_T=new RTS_TXT("Abra");
        ;
        // JavaLine 48 <== SourceLine 70
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fT="),P_T),new RTS_TXT(", par\u005fT=")),p_par_T));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_TXT1",1,67,13,68,15,67,45,69,48,70,53,71);
} // End of Procedure
