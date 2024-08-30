// JavaLine 1 <== SourceLine 315
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_fatal0 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=315, lastLine=315, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_fatal0 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_fatal0(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_fatal0(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_fatal0 _STM() {
        new CLASS_ERRMSG_GiveMessage((_CUR._SL),((char)3),p_n);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 fatal0",1,315,42,315);
} // End of Procedure
