// JavaLine 1 <== SourceLine 399
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_error2xx extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=399, lastLine=402, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n1;
    public char p_n2;
    public char p_n3;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_error2xx setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n1=intValue(param); break;
                case 2: p_n2=(char)objectValue(param); break;
                case 1: p_n3=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_error2xx(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_error2xx(RTS_RTObject _SL,int sp_n1,char sp_n2,char sp_n3) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n1 = sp_n1;
        this.p_n2 = sp_n2;
        this.p_n3 = sp_n3;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_error2xx _STM() {
        // JavaLine 45 <== SourceLine 400
        if(_VALUE((p_n2!=(((char)15))))) {
            // JavaLine 47 <== SourceLine 401
            {
                ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),new ERRMSG_errmsg((_CUR._SL),RTS_ENVIRONMENT.rank(p_n2))._RESULT);
                ;
                ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(1),new ERRMSG_errmsg((_CUR._SL),RTS_ENVIRONMENT.rank(p_n3))._RESULT);
                ;
                // JavaLine 53 <== SourceLine 402
                new ERRMSG_error0((_CUR._SL),p_n1);
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 error2xx",1,399,45,400,47,401,53,402,59,402);
} // End of Procedure
