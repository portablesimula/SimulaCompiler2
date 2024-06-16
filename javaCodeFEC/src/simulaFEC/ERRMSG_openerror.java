// JavaLine 1 <== SourceLine 389
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_openerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=389, lastLine=390, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_fname;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_openerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_fname=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_openerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public ERRMSG_openerror(RTS_RTObject _SL,RTS_TXT sp_fname) {
        super(_SL);
        // Parameter assignment to locals
        this.p_fname = sp_fname;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_openerror _STM() {
        // JavaLine 39 <== SourceLine 390
        ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),p_fname);
        ;
        new ERRMSG_fatal0((_CUR._SL),336);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 openerror",1,389,39,390,45,390);
} // End of Procedure
