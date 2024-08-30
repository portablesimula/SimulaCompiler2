// JavaLine 1 <== SourceLine 8
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_tagID extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=8, lastLine=10, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_tagID setPar(Object param) {
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
    public CLASS_COMMON_tagID(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_tagID(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_tagID _STM() {
        // JavaLine 42 <== SourceLine 9
        _RESULT=new CLASS_COMMON_TAGTABLE_tagIdent(((CLASS_COMMON)(_CUR._SL)).TAGTAB,p_i)._RESULT;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 tagID",1,8,42,9,47,10);
} // End of Procedure
