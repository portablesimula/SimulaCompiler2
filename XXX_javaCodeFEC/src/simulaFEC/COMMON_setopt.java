// JavaLine 1 <== SourceLine 250
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_setopt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=250, lastLine=254, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ch;
    public char p_val;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_setopt setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_ch=(char)objectValue(param); break;
                case 1: p_val=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public COMMON_setopt(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public COMMON_setopt(RTS_RTObject _SL,char sp_ch,char sp_val) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ch = sp_ch;
        this.p_val = sp_val;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_setopt _STM() {
        // JavaLine 42 <== SourceLine 251
        if(_VALUE((p_ch<(((char)128))))) {
            {
                // JavaLine 45 <== SourceLine 252
                if(_VALUE((p_ch>('_')))) {
                    p_ch=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_ch)-(32)));
                }
                ;
                // JavaLine 50 <== SourceLine 253
                ((COMMON)(_CUR._SL)).option.putELEMENT(((COMMON)(_CUR._SL)).option.index(RTS_ENVIRONMENT.rank(p_ch)),p_val);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 setopt",1,250,42,251,45,252,50,253,57,254);
} // End of Procedure
