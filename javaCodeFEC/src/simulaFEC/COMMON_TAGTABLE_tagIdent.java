// JavaLine 1 <== SourceLine 18
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_TAGTABLE_tagIdent extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=18, lastLine=20, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_TAGTABLE_tagIdent setPar(Object param) {
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
    public COMMON_TAGTABLE_tagIdent(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_TAGTABLE_tagIdent(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_TAGTABLE_tagIdent _STM() {
        // JavaLine 42 <== SourceLine 19
        if(_VALUE((((COMMON_TAGTABLE)(_CUR._SL)).ident.getELEMENT(p_i)!=(null)))) {
            _RESULT=((COMMON_TAGTABLE)(_CUR._SL)).ident.getELEMENT(p_i);
        } else {
            _RESULT=((COMMON_TAGTABLE)(_CUR._SL)).undef;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 tagIdent",1,18,42,19,51,20);
} // End of Procedure
