// JavaLine 1 <== SourceLine 43
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_CHAR extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=43, lastLine=47, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_par_C;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 44
    public char P_C=0;
    // JavaLine 15 <== SourceLine 43
    public char _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_CHAR setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_C=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_CHAR(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_CHAR(RTS_RTObject _SL,char sp_par_C) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_C = sp_par_C;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_CHAR _STM() {
        // JavaLine 45 <== SourceLine 45
        P_C=_RESULT=p_par_C=((simtst151_A)(_CUR._SL)).A_C='Z';
        ;
        // JavaLine 48 <== SourceLine 46
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fC="),RTS_ENVIRONMENT.edit(P_C)),new RTS_TXT(", par\u005fC=")),RTS_ENVIRONMENT.edit(p_par_C)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_CHAR",1,43,13,44,15,43,45,45,48,46,53,47);
} // End of Procedure
