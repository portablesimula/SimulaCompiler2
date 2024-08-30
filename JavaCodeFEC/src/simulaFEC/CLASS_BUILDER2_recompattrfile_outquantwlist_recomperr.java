// JavaLine 1 <== SourceLine 925
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=925, lastLine=926, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr _STM() {
        // JavaLine 39 <== SourceLine 926
        ((CLASS_BUILDER2)(_CUR._SL._SL._SL)).diag.putELEMENT(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).diag.index(0),((CLASS_BUILDER2_recompattrfile_outquantwlist)(_CUR._SL)).p_q.symb_1.symbol);
        ;
        new CLASS_ERRMSG_fatal0((_CUR._SL._SL._SL),p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 recomperr",1,925,39,926,46,926);
} // End of Procedure
