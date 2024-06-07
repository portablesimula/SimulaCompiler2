// JavaLine 1 <== SourceLine 24
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 07 09:54:25 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RT_ErrorTest_err extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=24, lastLine=28, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public RT_ErrorTest_err setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public RT_ErrorTest_err(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public RT_ErrorTest_err(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public RT_ErrorTest_err _STM() {
        // JavaLine 39 <== SourceLine 25
        RTS_BASICIO.sysout().setpos(1);
        ;
        // JavaLine 42 <== SourceLine 26
        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** error: in test "));
        ;
        RTS_BASICIO.sysout().outtext(p_t);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 49 <== SourceLine 27
        ((RT_ErrorTest)(_CUR._SL)).found_error=true;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("RT_ErrorTest.sim","5 err",1,24,39,25,42,26,49,27,54,28);
} // End of Procedure
