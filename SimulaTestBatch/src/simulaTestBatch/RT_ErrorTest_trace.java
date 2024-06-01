// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:58 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RT_ErrorTest_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=13, lastLine=22, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public RT_ErrorTest_trace setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_msg=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public RT_ErrorTest_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public RT_ErrorTest_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public RT_ErrorTest_trace _STM() {
        // JavaLine 39 <== SourceLine 15
        if(_VALUE(((RT_ErrorTest)(_CUR._SL)).verbose)) {
            {
                RTS_BASICIO.sysout().outtext(p_msg);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 49 <== SourceLine 16
        if(_VALUE(_TXTREL_NE(p_msg,((RT_ErrorTest)(_CUR._SL)).facit.getELEMENT(((RT_ErrorTest)(_CUR._SL)).traceCase)))) {
            // JavaLine 51 <== SourceLine 17
            {
                new RT_ErrorTest_err((_CUR._SL),CONC(new RTS_TXT("Case "),RTS_ENVIRONMENT.edit(((RT_ErrorTest)(_CUR._SL)).traceCase)));
                ;
                // JavaLine 55 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Trace: "),p_msg));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 60 <== SourceLine 19
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Facit: "),((RT_ErrorTest)(_CUR._SL)).facit.getELEMENT(((RT_ErrorTest)(_CUR._SL)).traceCase)));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 21
        ((RT_ErrorTest)(_CUR._SL)).traceCase=(((RT_ErrorTest)(_CUR._SL)).traceCase+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("RT_ErrorTest.sim","5 trace",1,13,39,15,49,16,51,17,55,18,60,19,68,21,73,22);
} // End of Procedure
