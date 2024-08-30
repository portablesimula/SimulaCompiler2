// JavaLine 1 <== SourceLine 384
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_error1id extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=384, lastLine=385, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public CLASS_COMMON_symbolbox p_symb;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_error1id setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_n=intValue(param); break;
                case 1: p_symb=(CLASS_COMMON_symbolbox)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_error1id(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_error1id(RTS_RTObject _SL,int sp_n,CLASS_COMMON_symbolbox sp_symb) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_symb = sp_symb;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_error1id _STM() {
        // JavaLine 42 <== SourceLine 385
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),p_symb.symbol);
        ;
        new CLASS_ERRMSG_error0((_CUR._SL),p_n);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 error1id",1,384,42,385,48,385);
} // End of Procedure
