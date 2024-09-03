// JavaLine 1 <== SourceLine 268
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_ED_TTAG extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=268, lastLine=270, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_m;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_ED_TTAG setPar(Object param) {
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
    public CLASS_SCODER0_codegenerator0_ED_TTAG(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_ED_TTAG(RTS_RTObject _SL,RTS_TXT sp_m) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m = sp_m;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_ED_TTAG _STM() {
        // JavaLine 42 <== SourceLine 269
        _RESULT=new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),new CLASS_SCODER0_codegenerator0_GET_TAG((_CUR._SL),p_m)._RESULT)._RESULT;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 ED_TTAG",1,268,42,269,47,270);
} // End of Procedure
