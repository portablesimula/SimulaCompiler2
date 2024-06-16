// JavaLine 1 <== SourceLine 103
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_nameof extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=103, lastLine=104, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_hi;
    public char p_lo;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_nameof setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_hi=(char)objectValue(param); break;
                case 1: p_lo=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public COMMON_nameof(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public COMMON_nameof(RTS_RTObject _SL,char sp_hi,char sp_lo) {
        super(_SL);
        // Parameter assignment to locals
        this.p_hi = sp_hi;
        this.p_lo = sp_lo;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_nameof _STM() {
        // JavaLine 45 <== SourceLine 104
        _RESULT=((RTS_REF_ARRAY<COMMON_symbolbox>)((COMMON)(_CUR._SL)).symtab.getELEMENT(RTS_ENVIRONMENT.rank(p_hi)).val).getELEMENT(RTS_ENVIRONMENT.rank(p_lo)).symbol;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 nameof",1,103,45,104,49,104);
} // End of Procedure
