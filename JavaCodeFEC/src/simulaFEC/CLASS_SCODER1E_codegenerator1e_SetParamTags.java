// JavaLine 1 <== SourceLine 119
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_SetParamTags extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=119, lastLine=124, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 120
    public int i=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1E_codegenerator1e_SetParamTags setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1E_codegenerator1e_SetParamTags(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_SetParamTags(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_SetParamTags _STM() {
        // JavaLine 41 <== SourceLine 121
        p_qty=p_qty.prefqual_1.descr_1.fpar;
        ;
        for(i=1;i<=((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).npar_7;i++) {
            // JavaLine 45 <== SourceLine 122
            {
                // JavaLine 47 <== SourceLine 123
                new CLASS_SCODER1E_codegenerator1e_identifiertag((_CUR._SL),p_qty.symb_1);
                ;
                p_qty=((CLASS_COMMON_quantity)(p_qty.next));
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 SetParamTags",1,119,11,120,41,121,45,122,47,123,56,124);
} // End of Procedure
