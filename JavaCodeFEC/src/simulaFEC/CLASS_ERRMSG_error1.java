// JavaLine 1 <== SourceLine 374
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_error1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=374, lastLine=375, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    public RTS_TXT p_t;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_error1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_n=intValue(param); break;
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_error1(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_error1(RTS_RTObject _SL,int sp_n,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_error1 _STM() {
        // JavaLine 42 <== SourceLine 375
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),p_t);
        ;
        new CLASS_ERRMSG_error0((_CUR._SL),p_n);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 error1",1,374,42,375,48,375);
} // End of Procedure
