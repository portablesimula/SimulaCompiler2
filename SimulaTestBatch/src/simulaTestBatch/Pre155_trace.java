// JavaLine 1 <== SourceLine 14
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Pre155_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=14, lastLine=24, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public Pre155_trace setPar(Object param) {
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
    public Pre155_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public Pre155_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public Pre155_trace _STM() {
        // JavaLine 39 <== SourceLine 17
        {
            RTS_BASICIO.sysout().outtext(p_msg);
            ;
            RTS_BASICIO.sysout().outimage();
            ;
        }
        ;
        // JavaLine 47 <== SourceLine 18
        if(_VALUE(_TXTREL_NE(p_msg,((Pre155)(_CUR._SL)).facit.getELEMENT(((Pre155)(_CUR._SL)).traceCase_1)))) {
            // JavaLine 49 <== SourceLine 19
            {
                new SimulaTest_err((_CUR._SL),CONC(new RTS_TXT("Case "),RTS_ENVIRONMENT.edit(((Pre155)(_CUR._SL)).traceCase_1)));
                ;
                // JavaLine 53 <== SourceLine 20
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Trace: "),p_msg));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 58 <== SourceLine 21
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Facit: "),((Pre155)(_CUR._SL)).facit.getELEMENT(((Pre155)(_CUR._SL)).traceCase_1)));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 66 <== SourceLine 23
        ((Pre155)(_CUR._SL)).traceCase_1=(((Pre155)(_CUR._SL)).traceCase_1+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Pre155.sim","5 trace",1,14,39,17,47,18,49,19,53,20,58,21,66,23,71,24);
} // End of Procedure
