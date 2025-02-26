// JavaLine 1 <== SourceLine 20
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=20, lastLine=28, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst26_trace setPar(Object param) {
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
    public simtst26_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst26_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst26_trace _STM() {
        // JavaLine 39 <== SourceLine 22
        if(_VALUE(false)) {
            // JavaLine 41 <== SourceLine 23
            {
                RTS_BASICIO.sysout().outtext(CONC(p_msg,new RTS_TXT(" - t,i,j,b =")));
                ;
                // JavaLine 45 <== SourceLine 24
                RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                ;
                RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                ;
                RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                ;
                // JavaLine 52 <== SourceLine 25
                RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                ;
                // JavaLine 55 <== SourceLine 26
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","5 trace",1,20,39,22,41,23,45,24,52,25,55,26,63,28);
} // End of Procedure
