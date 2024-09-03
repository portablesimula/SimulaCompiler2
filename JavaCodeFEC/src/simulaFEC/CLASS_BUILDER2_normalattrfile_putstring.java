// JavaLine 1 <== SourceLine 523
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_normalattrfile_putstring extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=523, lastLine=524, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_hi;
    public char p_lo;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_normalattrfile_putstring setPar(Object param) {
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
    public CLASS_BUILDER2_normalattrfile_putstring(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_normalattrfile_putstring(RTS_RTObject _SL,char sp_hi,char sp_lo) {
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
    public CLASS_BUILDER2_normalattrfile_putstring _STM() {
        // JavaLine 42 <== SourceLine 524
        new CLASS_BUILDER2_normalattrfile_puttext((_CUR._SL),new CLASS_COMMON_nameof((_CUR._SL._SL),p_hi,p_lo)._RESULT);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 putstring",1,523,42,524,46,524);
} // End of Procedure
