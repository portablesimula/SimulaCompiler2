// JavaLine 1 <== SourceLine 186
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_releaseIndex extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=186, lastLine=187, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_index;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER0_codegenerator0_releaseIndex setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_index=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER0_codegenerator0_releaseIndex(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER0_codegenerator0_releaseIndex(RTS_RTObject _SL,int sp_index) {
        super(_SL);
        // Parameter assignment to locals
        this.p_index = sp_index;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_releaseIndex _STM() {
        // JavaLine 39 <== SourceLine 187
        ((SCODER0_codegenerator0)(_CUR._SL)).indexused.putELEMENT(((SCODER0_codegenerator0)(_CUR._SL)).indexused.index(p_index),((SCODER0_codegenerator0)(_CUR._SL)).freeindex_5);
        ;
        ((SCODER0_codegenerator0)(_CUR._SL)).freeindex_5=p_index;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 releaseIndex",1,186,39,187,45,187);
} // End of Procedure
