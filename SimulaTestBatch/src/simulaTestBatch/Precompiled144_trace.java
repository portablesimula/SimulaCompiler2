// JavaLine 1 <== SourceLine 23
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jun 25 08:48:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Precompiled144_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=23, lastLine=33, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public Precompiled144_trace setPar(Object param) {
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
    public Precompiled144_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public Precompiled144_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public Precompiled144_trace _STM() {
        // JavaLine 39 <== SourceLine 25
        if(_VALUE(false)) {
            // JavaLine 41 <== SourceLine 26
            {
                RTS_BASICIO.sysout().outtext(p_msg);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 50 <== SourceLine 27
        if(_VALUE(_TXTREL_NE(p_msg,((Precompiled144)(_CUR._SL)).facit.getELEMENT(((Precompiled144)(_CUR._SL)).traceCase_1)))) {
            // JavaLine 52 <== SourceLine 28
            {
                new SimulaTest_err((_CUR._SL),CONC(new RTS_TXT("Case "),RTS_ENVIRONMENT.edit(((Precompiled144)(_CUR._SL)).traceCase_1)));
                ;
                // JavaLine 56 <== SourceLine 29
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Trace: "),p_msg));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 61 <== SourceLine 30
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("Facit: "),((Precompiled144)(_CUR._SL)).facit.getELEMENT(((Precompiled144)(_CUR._SL)).traceCase_1)));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 69 <== SourceLine 32
        ((Precompiled144)(_CUR._SL)).traceCase_1=(((Precompiled144)(_CUR._SL)).traceCase_1+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Precompiled144.sim","5 trace",1,23,39,25,41,26,50,27,52,28,56,29,61,30,69,32,74,33);
} // End of Procedure
