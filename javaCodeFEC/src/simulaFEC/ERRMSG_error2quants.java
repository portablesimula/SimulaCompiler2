// JavaLine 1 <== SourceLine 273
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_error2quants extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=273, lastLine=276, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public COMMON_quantity p_q;
    public COMMON_quantity p_qt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_error2quants setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n=intValue(param); break;
                case 2: p_q=(COMMON_quantity)objectValue(param); break;
                case 1: p_qt=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_error2quants(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_error2quants(RTS_RTObject _SL,int sp_n,COMMON_quantity sp_q,COMMON_quantity sp_qt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_q = sp_q;
        this.p_qt = sp_qt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_error2quants _STM() {
        // JavaLine 45 <== SourceLine 274
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(1),new ERRMSG_qlin((_CUR._SL),p_qt)._RESULT);
        ;
        new ERRMSG_error1id((_CUR._SL),p_n,p_q.symb_1);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 error2quants",1,273,45,274,52,276);
} // End of Procedure
