// JavaLine 1 <== SourceLine 1316
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_identifier_identError extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1316, lastLine=1317, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CHECKER1_semchecker1_identifier_identError setPar(Object param) {
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
    public CHECKER1_semchecker1_identifier_identError(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CHECKER1_semchecker1_identifier_identError(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_identifier_identError _STM() {
        // JavaLine 39 <== SourceLine 1317
        new ERRMSG_error1qlin((_CUR._SL._SL._SL),p_n,((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning);
        ;
        ((CHECKER1_semchecker1_identifier)(_CUR._SL)).kind=((char)10);
        ;
        ((CHECKER1_semchecker1_identifier)(_CUR._SL)).type=((char)15);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 identError",1,1316,39,1317,47,1317);
} // End of Procedure
