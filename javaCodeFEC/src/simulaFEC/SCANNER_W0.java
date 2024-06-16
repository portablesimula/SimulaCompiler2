// JavaLine 1 <== SourceLine 89
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_W0 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=89, lastLine=90, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_W0 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_W0(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_W0(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_W0 _STM() {
        // JavaLine 39 <== SourceLine 90
        new SCANNER_WWW((_CUR._SL),p_t);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 W0",1,89,39,90,46,90);
} // End of Procedure
