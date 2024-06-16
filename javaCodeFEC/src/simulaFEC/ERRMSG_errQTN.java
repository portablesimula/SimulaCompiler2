// JavaLine 1 <== SourceLine 261
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_errQTN extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=261, lastLine=264, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    public int p_n;
    public COMMON_quantity p_qt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_errQTN setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_q=(COMMON_quantity)objectValue(param); break;
                case 2: p_n=intValue(param); break;
                case 1: p_qt=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_errQTN(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_errQTN(RTS_RTObject _SL,COMMON_quantity sp_q,int sp_n,COMMON_quantity sp_qt) {
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
    public ERRMSG_errQTN _STM() {
        // JavaLine 45 <== SourceLine 262
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(1),new ERRMSG_qlin((_CUR._SL),p_qt)._RESULT);
        ;
        new ERRMSG_errQT((_CUR._SL),p_q,p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 errQTN",1,261,45,262,52,264);
} // End of Procedure
