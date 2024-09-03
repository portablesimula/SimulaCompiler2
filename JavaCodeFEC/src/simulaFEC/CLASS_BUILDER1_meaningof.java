// JavaLine 1 <== SourceLine 308
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_meaningof extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=308, lastLine=309, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_symbolbox p_symb;
    // Declare locals as attributes
    public CLASS_COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_meaningof setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_symb=(CLASS_COMMON_symbolbox)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_meaningof(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_meaningof(RTS_RTObject _SL,CLASS_COMMON_symbolbox sp_symb) {
        super(_SL);
        // Parameter assignment to locals
        this.p_symb = sp_symb;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_meaningof _STM() {
        // JavaLine 42 <== SourceLine 309
        _RESULT=((CLASS_COMMON_quantity)(((CLASS_COMMON_identsymbol)(p_symb)).curmeaning_1));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 meaningof",1,308,42,309,46,309);
} // End of Procedure
