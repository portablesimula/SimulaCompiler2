// JavaLine 1 <== SourceLine 30
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:58 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RT_ErrorTest_ExceptionHandler extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=30, lastLine=44, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_ErrorText;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public RT_ErrorTest_ExceptionHandler setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ErrorText=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public RT_ErrorTest_ExceptionHandler(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public RT_ErrorTest_ExceptionHandler(RTS_RTObject _SL,RTS_TXT sp_ErrorText) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ErrorText = sp_ErrorText;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public RT_ErrorTest_ExceptionHandler _STM() {
        // JavaLine 39 <== SourceLine 33
        new RT_ErrorTest_trace((_CUR._SL),CONC(new RTS_TXT("ExceptionHandler got error: "),p_ErrorText));
        ;
        // JavaLine 42 <== SourceLine 34
        if(_VALUE(((RT_ErrorTest)(_CUR._SL)).found_error)) {
            // JavaLine 44 <== SourceLine 35
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("GOT ERROR(S) IN"),((RT_ErrorTest)(_CUR._SL)).fullTitle));
        } else {
            // JavaLine 47 <== SourceLine 36
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- NO ERRORS FOUND IN"),((RT_ErrorTest)(_CUR._SL)).fullTitle));
        }
        ;
        // JavaLine 51 <== SourceLine 38
        if(_VALUE(((RT_ErrorTest)(_CUR._SL)).verbose)) {
            {
                // JavaLine 54 <== SourceLine 39
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 57 <== SourceLine 40
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- END "),((RT_ErrorTest)(_CUR._SL)).fullTitle));
                ;
                // JavaLine 60 <== SourceLine 41
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 66 <== SourceLine 43
        RTS_BASICIO.terminate_program();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("RT_ErrorTest.sim","5 ExceptionHandler",1,30,39,33,42,34,44,35,47,36,51,38,54,39,57,40,60,41,66,43,71,44);
} // End of Procedure
