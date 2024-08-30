// JavaLine 1 <== SourceLine 302
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_caseexp_whenrange extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=302, lastLine=306, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_l;
    public int p_u;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER2_semchecker_caseexp_whenrange setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_l=intValue(param); break;
                case 1: p_u=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER2_semchecker_caseexp_whenrange(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_caseexp_whenrange(RTS_RTObject _SL,int sp_l,int sp_u) {
        super(_SL);
        // Parameter assignment to locals
        this.p_l = sp_l;
        this.p_u = sp_u;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_caseexp_whenrange _STM() {
        // JavaLine 42 <== SourceLine 303
        if(_VALUE((((CLASS_CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_casetype!=(((char)15))))) {
            // JavaLine 44 <== SourceLine 304
            {
                if(_VALUE((((p_u<(p_l))|((p_l<(((CLASS_CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_lb))))|((((CLASS_CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_ub<(p_u)))))) {
                    new CLASS_ERRMSG_error0((_CUR._SL._SL._SL),439);
                } else {
                    // JavaLine 49 <== SourceLine 305
                    while((p_l<=(p_u))) {
                        {
                            new CLASS_CHECKER2_semchecker_caseexp_whenvalue((_CUR._SL),p_l);
                            ;
                            p_l=(p_l+(1));
                        }
                    }
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 whenrange",1,302,42,303,44,304,49,305,63,306);
} // End of Procedure
