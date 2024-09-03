// JavaLine 1 <== SourceLine 384
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_openerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=384, lastLine=385, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_fname;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_openerror setPar(Object param) {
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
    public CLASS_ERRMSG_openerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_openerror(RTS_RTObject _SL,RTS_TXT sp_fname) {
        super(_SL);
        // Parameter assignment to locals
        this.p_fname = sp_fname;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_openerror _STM() {
        // JavaLine 39 <== SourceLine 385
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),p_fname);
        ;
        new CLASS_ERRMSG_fatal0((_CUR._SL),336);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 openerror",1,384,39,385,45,385);
} // End of Procedure
