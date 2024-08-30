// JavaLine 1 <== SourceLine 150
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_exp_incompTypes extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=150, lastLine=161, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ltype;
    public char p_rtype;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_exp_incompTypes setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_ltype=(char)objectValue(param); break;
                case 1: p_rtype=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER1_semchecker1_exp_incompTypes(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_exp_incompTypes(RTS_RTObject _SL,char sp_ltype,char sp_rtype) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ltype = sp_ltype;
        this.p_rtype = sp_rtype;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_exp_incompTypes _STM() {
        // JavaLine 42 <== SourceLine 157
        if(_VALUE((p_rtype!=(((char)15))))) {
            {
                // JavaLine 45 <== SourceLine 158
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).diag.putELEMENT(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).diag.index(2),new CLASS_ERRMSG_errmsg((_CUR._SL._SL._SL),RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).p_ch))._RESULT);
                ;
                new CLASS_ERRMSG_error2xx((_CUR._SL._SL._SL),400,p_ltype,p_rtype);
            }
        }
        ;
        // JavaLine 52 <== SourceLine 160
        new CLASS_BUILDER1_StopScode((_CUR._SL._SL._SL));
        ;
        ((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).type=((char)15);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 incompTypes",1,150,42,157,45,158,52,160,59,161);
} // End of Procedure
