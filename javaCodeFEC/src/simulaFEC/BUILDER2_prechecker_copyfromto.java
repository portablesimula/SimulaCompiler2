// JavaLine 1 <== SourceLine 1862
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_copyfromto extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1862, lastLine=1877, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_Q;
    public COMMON_quantity p_qnt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_prechecker_copyfromto setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_Q=(COMMON_quantity)objectValue(param); break;
                case 1: p_qnt=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_prechecker_copyfromto(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER2_prechecker_copyfromto(RTS_RTObject _SL,COMMON_quantity sp_Q,COMMON_quantity sp_qnt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_Q = sp_Q;
        this.p_qnt = sp_qnt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_prechecker_copyfromto _STM() {
        // JavaLine 42 <== SourceLine 1865
        p_qnt.symb_1=p_Q.symb_1;
        ;
        // JavaLine 45 <== SourceLine 1866
        p_qnt.type_1=p_Q.type_1;
        ;
        p_qnt.kind_1=p_Q.kind_1;
        ;
        p_qnt.categ_1=p_Q.categ_1;
        ;
        // JavaLine 52 <== SourceLine 1867
        p_qnt.protect_1=p_Q.protect_1;
        ;
        // JavaLine 55 <== SourceLine 1868
        p_qnt.special_1=p_Q.special_1;
        ;
        p_qnt.virtno_1=p_Q.virtno_1;
        ;
        // JavaLine 60 <== SourceLine 1869
        p_qnt.dim_1=p_Q.dim_1;
        ;
        p_qnt.plev_1=p_Q.plev_1;
        ;
        // JavaLine 65 <== SourceLine 1871
        if(_VALUE(((p_Q.ftag_1<(0))&&(_IS(p_qnt,COMMON_extquantity.class))))) {
            // JavaLine 67 <== SourceLine 1872
            p_qnt.line_1=p_Q.ftag_1;
        } else {
            // JavaLine 70 <== SourceLine 1874
            if(_VALUE(((p_Q.line_1<(0))&&(_IS(p_qnt,COMMON_quantity.class))))) {
                p_qnt.ftag_1=p_Q.line_1;
            } else {
                // JavaLine 74 <== SourceLine 1875
                {
                    p_qnt.ftag_1=p_Q.ftag_1;
                    ;
                    p_qnt.line_1=p_Q.line_1;
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 copyfromto",1,1862,42,1865,45,1866,52,1867,55,1868,60,1869,65,1871,67,1872,70,1874,74,1875,85,1877);
} // End of Procedure
