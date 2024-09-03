// JavaLine 1 <== SourceLine 337
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=337, lastLine=338, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror _STM() {
        // JavaLine 39 <== SourceLine 338
        new CLASS_ERRMSG_errQT((_CUR._SL._SL._SL),((CLASS_CHECKER2_semchecker_ConstEltChecker)(_CUR._SL)).meaning,p_n);
        ;
        ((CLASS_CHECKER2_semchecker_ConstEltChecker)(_CUR._SL)).meaning.special_1=((char)0);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 Cerror",1,337,39,338,46,338);
} // End of Procedure
