// JavaLine 1 <== SourceLine 28
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 29 09:10:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst154_P1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=28, lastLine=43, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_T;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 28
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst154_P1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_T=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst154_P1(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst154_P1(RTS_RTObject _SL,RTS_TXT sp_T) {
        super(_SL);
        // Parameter assignment to locals
        this.p_T = sp_T;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst154_P1 _STM() {
        // JavaLine 43 <== SourceLine 42
        new simtst154_trace((_CUR._SL),CONC(new RTS_TXT("P2="),RTS_ENVIRONMENT.edit(new simtst154_P1_P2((_CUR))._RESULT)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst154.sim","5 P1",1,28,13,28,43,42,48,43);
} // End of Procedure
