// JavaLine 1 <== SourceLine 17
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=17, lastLine=27, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_trace setPar(Object param) {
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
    public simtst151_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_trace _STM() {
        // JavaLine 39 <== SourceLine 19
        if(_VALUE(false)) {
            // JavaLine 41 <== SourceLine 20
            {
                RTS_BASICIO.sysout().outtext(p_msg);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 50 <== SourceLine 21
        if(_VALUE(_TXTREL_NE(p_msg,((simtst151)(_CUR._SL)).facit.getELEMENT(((simtst151)(_CUR._SL)).traceCase_1)))) {
            // JavaLine 52 <== SourceLine 22
            {
                new SimulaTest_err((_CUR._SL),CONC(new RTS_TXT("Case "),RTS_ENVIRONMENT.edit(((simtst151)(_CUR._SL)).traceCase_1)));
                ;
                // JavaLine 56 <== SourceLine 23
                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("Trace: \""),p_msg),new RTS_TXT("\"")));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 61 <== SourceLine 24
                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("Facit: \""),((simtst151)(_CUR._SL)).facit.getELEMENT(((simtst151)(_CUR._SL)).traceCase_1)),new RTS_TXT("\"")));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 69 <== SourceLine 26
        ((simtst151)(_CUR._SL)).traceCase_1=(((simtst151)(_CUR._SL)).traceCase_1+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 trace",1,17,39,19,41,20,50,21,52,22,56,23,61,24,69,26,74,27);
} // End of Procedure
