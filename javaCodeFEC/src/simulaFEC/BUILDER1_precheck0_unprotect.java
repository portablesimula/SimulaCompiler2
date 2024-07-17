// JavaLine 1 <== SourceLine 707
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_unprotect extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=707, lastLine=718, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 710
    public COMMON_brecord _inspect_710_4533=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_unprotect setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_unprotect(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_unprotect(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_unprotect _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_710_4533=p_q.descr_1;
            if(_inspect_710_4533!=null) { // INSPECT _inspect_710_4533
                // JavaLine 45 <== SourceLine 711
                {
                    // JavaLine 47 <== SourceLine 710
                    {
                        // JavaLine 49 <== SourceLine 712
                        p_q=_inspect_710_4533.favirt;
                        ;
                        // JavaLine 52 <== SourceLine 713
                        while((p_q!=(null))) {
                            {
                                // JavaLine 55 <== SourceLine 714
                                if(_VALUE((p_q.dim_1==(1)))) {
                                    p_q.visible_1=((char)0);
                                }
                                ;
                                p_q=((COMMON_quantity)(p_q.next));
                            }
                        }
                        ;
                        // JavaLine 64 <== SourceLine 715
                        p_q=_inspect_710_4533.fpar;
                        ;
                        // JavaLine 67 <== SourceLine 716
                        while((p_q!=(null))) {
                            {
                                p_q.visible_1=((char)0);
                                ;
                                p_q=((COMMON_quantity)(p_q.next));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 unprotect",1,707,11,710,45,711,47,710,49,712,52,713,55,714,64,715,67,716,82,718);
} // End of Procedure
