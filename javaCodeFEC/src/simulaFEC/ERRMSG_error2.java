// JavaLine 1 <== SourceLine 394
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_error2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=394, lastLine=395, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public RTS_TXT p_t1;
    public RTS_TXT p_t2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_error2 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n=intValue(param); break;
                case 2: p_t1=(RTS_TXT)objectValue(param); break;
                case 1: p_t2=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_error2(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_error2(RTS_RTObject _SL,int sp_n,RTS_TXT sp_t1,RTS_TXT sp_t2) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_t1 = sp_t1;
        this.p_t2 = sp_t2;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_error2 _STM() {
        // JavaLine 45 <== SourceLine 395
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),p_t1);
        ;
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(1),p_t2);
        ;
        new ERRMSG_error0((_CUR._SL),p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 error2",1,394,45,395,54,395);
} // End of Procedure
