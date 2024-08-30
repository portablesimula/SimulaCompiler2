// JavaLine 1 <== SourceLine 32
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_edSymbol extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=32, lastLine=36, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_hi;
    public char p_lo;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 33
    public CLASS_COMMON_symbolbox symbox=null;
    // JavaLine 16 <== SourceLine 32
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_edSymbol setPar(Object param) {
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
    public CLASS_COMMON_edSymbol(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_edSymbol(RTS_RTObject _SL,char sp_hi,char sp_lo) {
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
    public CLASS_COMMON_edSymbol _STM() {
        // JavaLine 48 <== SourceLine 34
        symbox=new CLASS_COMMON_boxof((_CUR._SL),p_hi,p_lo)._RESULT;
        ;
        // JavaLine 51 <== SourceLine 35
        _RESULT=symbox.symbol;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 edSymbol",1,32,14,33,16,32,48,34,51,35,56,36);
} // End of Procedure
