// JavaLine 1 <== SourceLine 195
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_outbjump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=195, lastLine=199, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_dest;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER1_codegenerator1_outbjump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_dest=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER1_codegenerator1_outbjump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER1_codegenerator1_outbjump(RTS_RTObject _SL,int sp_dest) {
        super(_SL);
        // Parameter assignment to locals
        this.p_dest = sp_dest;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_outbjump _STM() {
        // JavaLine 39 <== SourceLine 196
        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(90);
        ;
        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(p_dest);
        ;
        // JavaLine 44 <== SourceLine 198
        new SCODER0_codegenerator0_releaseIndex((_CUR._SL),p_dest);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 outbjump",1,195,39,196,44,198,49,199);
} // End of Procedure
