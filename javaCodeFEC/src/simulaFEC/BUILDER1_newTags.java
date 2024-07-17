// JavaLine 1 <== SourceLine 182
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_newTags extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=182, lastLine=186, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_incr;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_newTags setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_incr=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_newTags(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_newTags(RTS_RTObject _SL,int sp_incr) {
        super(_SL);
        // Parameter assignment to locals
        this.p_incr = sp_incr;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_newTags _STM() {
        // JavaLine 39 <== SourceLine 183
        ((BUILDER1)(_CUR._SL)).lastusedtag_6=(((BUILDER1)(_CUR._SL)).lastusedtag_6+(p_incr));
        ;
        // JavaLine 42 <== SourceLine 184
        new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),184,CONC(CONC(CONC(new RTS_TXT("newTags "),RTS_ENVIRONMENT.edit(p_incr)),new RTS_TXT("   ")),RTS_ENVIRONMENT.edit(((BUILDER1)(_CUR._SL)).lastusedtag_6)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 newTags",1,182,39,183,42,184,47,186);
} // End of Procedure
