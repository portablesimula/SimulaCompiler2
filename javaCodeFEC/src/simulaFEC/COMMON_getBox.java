// JavaLine 1 <== SourceLine 98
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_getBox extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=98, lastLine=101, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    public COMMON_symbolbox _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_getBox setPar(Object param) {
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
    public COMMON_getBox(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_getBox(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_getBox _STM() {
        // JavaLine 42 <== SourceLine 100
        _RESULT=((RTS_REF_ARRAY<COMMON_symbolbox>)((COMMON)(_CUR._SL)).symtab.getELEMENT((p_i/(256))).val).getELEMENT(RTS_ENVIRONMENT.rem(p_i,256));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 getBox",1,98,42,100,47,101);
} // End of Procedure
