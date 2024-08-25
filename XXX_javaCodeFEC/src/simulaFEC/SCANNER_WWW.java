// JavaLine 1 <== SourceLine 86
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_WWW extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=86, lastLine=87, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 87
    public RTS_Printfile _inspect_86_4463=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_WWW setPar(Object param) {
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
    public SCANNER_WWW(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_WWW(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_WWW _STM() {
        // JavaLine 41 <== SourceLine 86
        {
            // BEGIN INSPECTION 
            _inspect_86_4463=RTS_BASICIO.sysout();
            if(_inspect_86_4463!=null) { // INSPECT _inspect_86_4463
                // JavaLine 46 <== SourceLine 87
                {
                    {
                        if(_VALUE((_inspect_86_4463.pos()>=(50)))) {
                            _inspect_86_4463.outimage();
                        }
                        ;
                        _inspect_86_4463.setpos(50);
                        ;
                        _inspect_86_4463.outtext(p_t);
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 WWW",1,86,11,87,41,86,46,87,62,87);
} // End of Procedure
