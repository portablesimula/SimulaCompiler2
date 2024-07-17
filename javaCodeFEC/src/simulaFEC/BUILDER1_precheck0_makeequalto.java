// JavaLine 1 <== SourceLine 533
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_makeequalto extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=533, lastLine=555, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    public COMMON_quantity p_qnt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_makeequalto setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(COMMON_quantity)objectValue(param); break;
                case 1: p_qnt=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_makeequalto(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_makeequalto(RTS_RTObject _SL,COMMON_quantity sp_q,COMMON_quantity sp_qnt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_qnt = sp_qnt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_makeequalto _STM() {
        // JavaLine 42 <== SourceLine 534
        p_qnt.symb_1=p_q.symb_1;
        ;
        // JavaLine 45 <== SourceLine 535
        p_qnt.encl_1=p_q.encl_1;
        ;
        p_qnt.descr_1=p_q.descr_1;
        ;
        // JavaLine 50 <== SourceLine 536
        p_qnt.type_1=p_q.type_1;
        ;
        p_qnt.kind_1=p_q.kind_1;
        ;
        // JavaLine 55 <== SourceLine 537
        p_qnt.categ_1=p_q.categ_1;
        ;
        p_qnt.prefqual_1=p_q.prefqual_1;
        ;
        // JavaLine 60 <== SourceLine 538
        p_qnt.plev_1=p_q.plev_1;
        ;
        p_qnt.dim_1=p_q.dim_1;
        ;
        // JavaLine 65 <== SourceLine 539
        p_qnt.protect_1=p_q.protect_1;
        ;
        p_qnt.visible_1=p_q.visible_1;
        ;
        // JavaLine 70 <== SourceLine 540
        if(_VALUE((p_qnt.visible_1!=(((char)0))))) {
            p_qnt.visible_1=((char)1);
        }
        ;
        // JavaLine 75 <== SourceLine 541
        p_qnt.virtno_1=p_q.virtno_1;
        ;
        p_qnt.match_1=p_q.match_1;
        ;
        // JavaLine 80 <== SourceLine 542
        p_qnt.special_1=p_q.special_1;
        ;
        // JavaLine 83 <== SourceLine 545
        if(_VALUE(((p_q.line_1<(0))&&(_IS(p_qnt,COMMON_quantity.class))))) {
            p_qnt.ftag_1=p_q.line_1;
        } else {
            // JavaLine 87 <== SourceLine 546
            {
                p_qnt.line_1=p_q.line_1;
                ;
                p_qnt.ftag_1=p_q.ftag_1;
            }
        }
        ;
        // JavaLine 95 <== SourceLine 547
        if(_VALUE(_IS(p_qnt,COMMON_extquantity.class))) {
            {
                // JavaLine 98 <== SourceLine 548
                if(_VALUE((p_q.ftag_1<(0)))) {
                    {
                        p_qnt.line_1=p_q.ftag_1;
                        ;
                        p_qnt.ftag_1=0;
                    }
                }
                ;
                // JavaLine 107 <== SourceLine 549
                ((COMMON_extquantity)(p_qnt)).p2_module=((COMMON_extquantity)(p_q)).p2_module;
                ;
                // JavaLine 110 <== SourceLine 550
                ((COMMON_extquantity)(p_qnt)).clf_2=((COMMON_extquantity)(p_q)).clf_2;
                ;
                // JavaLine 113 <== SourceLine 551
                ((COMMON_extquantity)(p_qnt)).longindic_2=((COMMON_extquantity)(p_q)).longindic_2;
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 makeequalto",1,533,42,534,45,535,50,536,55,537,60,538,65,539,70,540,75,541,80,542,83,545,87,546,95,547,98,548,107,549,110,550,113,551,121,555);
} // End of Procedure
