// JavaLine 1 <== SourceLine 130
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_newQTags extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=130, lastLine=138, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public int p_incr;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_newQTags setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_incr=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_newQTags(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_newQTags(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,int sp_incr) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_incr = sp_incr;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_newQTags _STM() {
        if(_VALUE((p_incr>(0)))) {
            new CLASS_BUILDER1_newQTags_Block131((_CUR))._STM();
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 newQTags",1,130,47,138);
} // End of Procedure
