// JavaLine 1 <== SourceLine 2123
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_argument_errARG extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2123, lastLine=2128, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_eax;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 2124
    public RTS_TXT etxt1=null;
    public RTS_TXT etxt2=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CHECKER1_semchecker1_argument_errARG setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_eax=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CHECKER1_semchecker1_argument_errARG(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CHECKER1_semchecker1_argument_errARG(RTS_RTObject _SL,int sp_eax) {
        super(_SL);
        // Parameter assignment to locals
        this.p_eax = sp_eax;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_argument_errARG _STM() {
        // JavaLine 42 <== SourceLine 2125
        etxt1=CONC(CONC(new RTS_TXT(" par#"),new COMMON_leftint((_CUR._SL._SL._SL),((CHECKER1_semchecker1_argument)(_CUR._SL)).p_argno)._RESULT),new RTS_TXT(" "));
        ;
        // JavaLine 45 <== SourceLine 2126
        etxt2=new ERRMSG_qlin((_CUR._SL._SL._SL),((CHECKER1_semchecker1)(_CUR._SL._SL)).lastnap_2.ident.meaning)._RESULT;
        ;
        // JavaLine 48 <== SourceLine 2127
        new ERRMSG_error2((_CUR._SL._SL._SL),p_eax,etxt1,etxt2);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 errARG",1,2123,11,2124,42,2125,45,2126,48,2127,53,2128);
} // End of Procedure
