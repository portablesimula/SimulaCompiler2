// JavaLine 1 <== SourceLine 272
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_dummygenerator_outbyte extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=272, lastLine=273, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_dummygenerator_outbyte setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_dummygenerator_outbyte(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_dummygenerator_outbyte(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_dummygenerator_outbyte _STM() {
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 outbyte",1,272,42,273);
} // End of Procedure
