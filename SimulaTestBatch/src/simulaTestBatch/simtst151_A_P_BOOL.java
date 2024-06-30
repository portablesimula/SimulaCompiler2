// JavaLine 1 <== SourceLine 37
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_BOOL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=37, lastLine=41, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public boolean p_par_B;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 38
    public boolean P_B=false;
    // JavaLine 15 <== SourceLine 37
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_BOOL setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_B=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_BOOL(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_BOOL(RTS_RTObject _SL,boolean sp_par_B) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_B = sp_par_B;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_BOOL _STM() {
        // JavaLine 45 <== SourceLine 39
        P_B=_RESULT=p_par_B=((simtst151_A)(_CUR._SL)).A_B=true;
        ;
        // JavaLine 48 <== SourceLine 40
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fB="),RTS_ENVIRONMENT.edit(P_B)),new RTS_TXT(", par\u005fB=")),RTS_ENVIRONMENT.edit(p_par_B)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_BOOL",1,37,13,38,15,37,45,39,48,40,53,41);
} // End of Procedure
