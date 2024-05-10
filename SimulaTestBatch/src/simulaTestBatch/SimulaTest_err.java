// JavaLine 1 <== SourceLine 10
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 10 08:07:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_err extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=10, lastLine=14, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SimulaTest_err setPar(Object param) {
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
    public SimulaTest_err(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SimulaTest_err(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SimulaTest_err _STM() {
        RTS_COMMON._LINE("5 SimulaTest.err",11); // JavaLine 39 <== SourceLine 11
        RTS_BASICIO.sysout().setpos(1);
        ;
        RTS_COMMON._LINE("5 SimulaTest.err",12); // JavaLine 42 <== SourceLine 12
        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** error: in test "));
        ;
        RTS_BASICIO.sysout().outtext(p_t);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_COMMON._LINE("5 SimulaTest.err",13); // JavaLine 49 <== SourceLine 13
        ((SimulaTest)(_CUR._SL)).found_error=true;
        ;
        ((SimulaTest)(_CUR._SL)).nFailed=(((SimulaTest)(_CUR._SL)).nFailed+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SimulaTest.sim","5 err",1,10,39,11,42,12,49,13,56,14);
} // End of Procedure
