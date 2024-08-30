// JavaLine 1 <== SourceLine 163
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_exp_typeError extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=163, lastLine=167, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_exp_typeError setPar(Object param) {
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
    public CLASS_CHECKER1_semchecker1_exp_typeError(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_exp_typeError(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_exp_typeError _STM() {
        // JavaLine 39 <== SourceLine 164
        if(_VALUE((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).type!=(((char)15))))) {
            {
                // JavaLine 42 <== SourceLine 165
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).diag.putELEMENT(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).diag.index(0),new CLASS_ERRMSG_errmsg((_CUR._SL._SL._SL),RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).type))._RESULT);
                ;
                new CLASS_ERRMSG_error0((_CUR._SL._SL._SL),p_n);
                ;
                // JavaLine 47 <== SourceLine 166
                new CLASS_BUILDER1_StopScode((_CUR._SL._SL._SL));
                ;
                ((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).type=((char)15);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 typeError",1,163,39,164,42,165,47,166,56,167);
} // End of Procedure
