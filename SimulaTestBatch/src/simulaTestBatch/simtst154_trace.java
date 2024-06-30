// JavaLine 1 <== SourceLine 17
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 29 09:10:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst154_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=17, lastLine=26, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst154_trace setPar(Object param) {
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
    public simtst154_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst154_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst154_trace _STM() {
        // JavaLine 39 <== SourceLine 18
        if(_VALUE(false)) {
            // JavaLine 41 <== SourceLine 19
            {
                RTS_BASICIO.sysout().outtext(p_msg);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 50 <== SourceLine 20
        if(_VALUE(_TXTREL_NE(p_msg,((simtst154)(_CUR._SL)).facit.getELEMENT(((simtst154)(_CUR._SL)).traceCase_1)))) {
            {
                // JavaLine 53 <== SourceLine 21
                new SimulaTest_err((_CUR._SL),CONC(new RTS_TXT("Case "),RTS_ENVIRONMENT.edit(((simtst154)(_CUR._SL)).traceCase_1)));
                ;
                // JavaLine 56 <== SourceLine 22
                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("Trace: \""),p_msg),new RTS_TXT("\"")));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 61 <== SourceLine 23
                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("Facit: \""),((simtst154)(_CUR._SL)).facit.getELEMENT(((simtst154)(_CUR._SL)).traceCase_1)),new RTS_TXT("\"")));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 69 <== SourceLine 25
        ((simtst154)(_CUR._SL)).traceCase_1=(((simtst154)(_CUR._SL)).traceCase_1+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst154.sim","5 trace",1,17,39,18,41,19,50,20,53,21,56,22,61,23,69,25,74,26);
} // End of Procedure
