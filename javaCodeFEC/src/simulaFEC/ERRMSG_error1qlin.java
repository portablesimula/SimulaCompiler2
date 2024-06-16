// JavaLine 1 <== SourceLine 267
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_error1qlin extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=267, lastLine=270, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_error1qlin setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_n=intValue(param); break;
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_error1qlin(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public ERRMSG_error1qlin(RTS_RTObject _SL,int sp_n,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_error1qlin _STM() {
        // JavaLine 42 <== SourceLine 268
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),new ERRMSG_qlin((_CUR._SL),p_q)._RESULT);
        ;
        new ERRMSG_error0((_CUR._SL),p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 error1qlin",1,267,42,268,49,270);
} // End of Procedure
