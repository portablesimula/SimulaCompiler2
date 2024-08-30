// JavaLine 1 <== SourceLine 255
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_STRC extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=255, lastLine=259, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_m;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_STRC setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_m=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_STRC(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_STRC(RTS_RTObject _SL,RTS_TXT sp_m) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m = sp_m;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_STRC _STM() {
        // JavaLine 39 <== SourceLine 257
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("SCode: "),p_m));
        ;
        // JavaLine 42 <== SourceLine 258
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 STRC",1,255,39,257,42,258,47,259);
} // End of Procedure
