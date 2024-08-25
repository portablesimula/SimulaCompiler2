// JavaLine 1 <== SourceLine 303
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_meaningof extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=303, lastLine=304, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_symbolbox p_symb;
    // Declare locals as attributes
    public COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_meaningof setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_symb=(COMMON_symbolbox)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_meaningof(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_meaningof(RTS_RTObject _SL,COMMON_symbolbox sp_symb) {
        super(_SL);
        // Parameter assignment to locals
        this.p_symb = sp_symb;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_meaningof _STM() {
        // JavaLine 42 <== SourceLine 304
        _RESULT=((COMMON_quantity)(((COMMON_identsymbol)(p_symb)).curmeaning_1));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 meaningof",1,303,42,304,46,304);
} // End of Procedure
