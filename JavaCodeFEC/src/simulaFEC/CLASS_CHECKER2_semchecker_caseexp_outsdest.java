// JavaLine 1 <== SourceLine 288
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_caseexp_outsdest extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=288, lastLine=292, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER2_semchecker_caseexp_outsdest setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER2_semchecker_caseexp_outsdest(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_caseexp_outsdest(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_caseexp_outsdest _STM() {
        // JavaLine 39 <== SourceLine 289
        ((CLASS_CHECKER2_semchecker_caseexp)(_CUR._SL)).seen.putELEMENT(((CLASS_CHECKER2_semchecker_caseexp)(_CUR._SL)).seen.index(p_i),true);
        ;
        // JavaLine 42 <== SourceLine 290
        ((CLASS_CHECKER2)(_CUR._SL._SL._SL)).opihi_6=RTS_ENVIRONMENT._char((p_i/(256)));
        ;
        ((CLASS_CHECKER2)(_CUR._SL._SL._SL)).opilo_6=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(p_i,256));
        ;
        // JavaLine 47 <== SourceLine 291
        ((CLASS_CHECKER2)(_CUR._SL._SL._SL)).opc_6='a';
        ;
        call(((CLASS_CHECKER2)(_CUR._SL._SL._SL)).coder,291);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 outsdest",1,288,39,289,42,290,47,291,54,292);
} // End of Procedure
