// JavaLine 1 <== SourceLine 389
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_error2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=389, lastLine=390, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public RTS_TXT p_t1;
    public RTS_TXT p_t2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_error2 setPar(Object param) {
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
    public CLASS_ERRMSG_error2(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_error2(RTS_RTObject _SL,int sp_n,RTS_TXT sp_t1,RTS_TXT sp_t2) {
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
    public CLASS_ERRMSG_error2 _STM() {
        // JavaLine 45 <== SourceLine 390
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),p_t1);
        ;
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(1),p_t2);
        ;
        new CLASS_ERRMSG_error0((_CUR._SL),p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 error2",1,389,45,390,54,390);
} // End of Procedure
