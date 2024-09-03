// JavaLine 1 <== SourceLine 256
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_errQTN extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=256, lastLine=259, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public int p_n;
    public CLASS_COMMON_quantity p_qt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_errQTN setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 2: p_n=intValue(param); break;
                case 1: p_qt=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_errQTN(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_errQTN(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,int sp_n,CLASS_COMMON_quantity sp_qt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_n = sp_n;
        this.p_qt = sp_qt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_errQTN _STM() {
        // JavaLine 45 <== SourceLine 257
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(1),new CLASS_ERRMSG_qlin((_CUR._SL),p_qt)._RESULT);
        ;
        new CLASS_ERRMSG_errQT((_CUR._SL),p_q,p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 errQTN",1,256,45,257,52,259);
} // End of Procedure
