// JavaLine 1 <== SourceLine 394
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_error2xx extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=394, lastLine=397, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n1;
    public char p_n2;
    public char p_n3;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_error2xx setPar(Object param) {
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
    public CLASS_ERRMSG_error2xx(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_error2xx(RTS_RTObject _SL,int sp_n1,char sp_n2,char sp_n3) {
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
    public CLASS_ERRMSG_error2xx _STM() {
        // JavaLine 45 <== SourceLine 395
        if(_VALUE((p_n2!=(((char)15))))) {
            // JavaLine 47 <== SourceLine 396
            {
                ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),new CLASS_ERRMSG_errmsg((_CUR._SL),RTS_ENVIRONMENT.rank(p_n2))._RESULT);
                ;
                ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(1),new CLASS_ERRMSG_errmsg((_CUR._SL),RTS_ENVIRONMENT.rank(p_n3))._RESULT);
                ;
                // JavaLine 53 <== SourceLine 397
                new CLASS_ERRMSG_error0((_CUR._SL),p_n1);
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 error2xx",1,394,45,395,47,396,53,397,59,397);
} // End of Procedure
