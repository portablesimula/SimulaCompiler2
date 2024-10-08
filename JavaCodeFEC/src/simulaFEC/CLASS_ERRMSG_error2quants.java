// JavaLine 1 <== SourceLine 268
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_error2quants extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=268, lastLine=271, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public CLASS_COMMON_quantity p_q;
    public CLASS_COMMON_quantity p_qt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_error2quants setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n=intValue(param); break;
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_qt=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_error2quants(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_error2quants(RTS_RTObject _SL,int sp_n,CLASS_COMMON_quantity sp_q,CLASS_COMMON_quantity sp_qt) {
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
    public CLASS_ERRMSG_error2quants _STM() {
        // JavaLine 45 <== SourceLine 269
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(1),new CLASS_ERRMSG_qlin((_CUR._SL),p_qt)._RESULT);
        ;
        new CLASS_ERRMSG_error1id((_CUR._SL),p_n,p_q.symb_1);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 error2quants",1,268,45,269,52,271);
} // End of Procedure
