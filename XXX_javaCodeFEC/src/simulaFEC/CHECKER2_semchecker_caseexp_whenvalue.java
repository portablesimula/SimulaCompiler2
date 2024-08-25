// JavaLine 1 <== SourceLine 294
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER2_semchecker_caseexp_whenvalue extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=294, lastLine=300, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CHECKER2_semchecker_caseexp_whenvalue setPar(Object param) {
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
    public CHECKER2_semchecker_caseexp_whenvalue(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CHECKER2_semchecker_caseexp_whenvalue(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER2_semchecker_caseexp_whenvalue _STM() {
        // JavaLine 39 <== SourceLine 295
        if(_VALUE((((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_casetype!=(((char)15))))) {
            // JavaLine 41 <== SourceLine 296
            {
                if(_VALUE(((p_i<(((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_lb))|((((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_ub<(p_i)))))) {
                    new ERRMSG_error0((_CUR._SL._SL._SL),437);
                } else {
                    // JavaLine 46 <== SourceLine 297
                    {
                        p_i=(p_i-(((CHECKER2_semchecker_caseexp)(_CUR._SL)).p1_lb));
                        ;
                        // JavaLine 50 <== SourceLine 298
                        if(_VALUE(((CHECKER2_semchecker_caseexp)(_CUR._SL)).seen.getELEMENT(p_i))) {
                            new ERRMSG_error0((_CUR._SL._SL._SL),438);
                        } else {
                            new CHECKER2_semchecker_caseexp_outsdest((_CUR._SL),p_i);
                        }
                        ;
                    }
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","5 whenvalue",1,294,39,295,41,296,46,297,50,298,64,300);
} // End of Procedure
