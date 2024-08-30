// JavaLine 1 <== SourceLine 26
package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst66_InputFile_trace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=26, lastLine=34, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst66_InputFile_trace setPar(Object param) {
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
    public simtst66_InputFile_trace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst66_InputFile_trace(RTS_RTObject _SL,RTS_TXT sp_msg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_msg = sp_msg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst66_InputFile_trace _STM() {
        // JavaLine 39 <== SourceLine 28
        if(_VALUE(false)) {
            // JavaLine 41 <== SourceLine 29
            {
                // JavaLine 43 <== SourceLine 30
                RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(p_msg,new RTS_TXT(" - NAVN=")),((simtst66_InputFile)(_CUR._SL)).p_navn),new RTS_TXT(" - a,lnr=")));
                ;
                // JavaLine 46 <== SourceLine 31
                RTS_BASICIO.sysout().outint(((simtst66_InputFile)(_CUR._SL)).p_a,3);
                ;
                RTS_BASICIO.sysout().outint(((simtst66_InputFile)(_CUR._SL)).lnr,3);
                ;
                // JavaLine 51 <== SourceLine 32
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst66.sim","5 trace",1,26,39,28,41,29,43,30,46,31,51,32,59,34);
} // End of Procedure
