// JavaLine 1 <== SourceLine 712
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_unprotect extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=712, lastLine=723, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 715
    public CLASS_COMMON_brecord _inspect_715_4533=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_unprotect setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_unprotect(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_unprotect(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_unprotect _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_715_4533=p_q.descr_1;
            if(_inspect_715_4533!=null) { // INSPECT _inspect_715_4533  type=ref(BRECORD)
                // JavaLine 45 <== SourceLine 716
                {
                    // JavaLine 47 <== SourceLine 715
                    {
                        // JavaLine 49 <== SourceLine 717
                        p_q=_inspect_715_4533.favirt;
                        ;
                        // JavaLine 52 <== SourceLine 718
                        while((p_q!=(null))) {
                            {
                                // JavaLine 55 <== SourceLine 719
                                if(_VALUE((p_q.dim_1==(1)))) {
                                    p_q.visible_1=((char)0);
                                }
                                ;
                                p_q=((CLASS_COMMON_quantity)(p_q.next));
                            }
                        }
                        ;
                        // JavaLine 64 <== SourceLine 720
                        p_q=_inspect_715_4533.fpar;
                        ;
                        // JavaLine 67 <== SourceLine 721
                        while((p_q!=(null))) {
                            {
                                p_q.visible_1=((char)0);
                                ;
                                p_q=((CLASS_COMMON_quantity)(p_q.next));
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 unprotect",1,712,11,715,45,716,47,715,49,717,52,718,55,719,64,720,67,721,82,723);
} // End of Procedure
