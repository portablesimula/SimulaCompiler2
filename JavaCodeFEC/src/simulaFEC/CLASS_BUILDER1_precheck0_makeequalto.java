// JavaLine 1 <== SourceLine 538
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_makeequalto extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=538, lastLine=560, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public CLASS_COMMON_quantity p_qnt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_makeequalto setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_qnt=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_makeequalto(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_makeequalto(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,CLASS_COMMON_quantity sp_qnt) {
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
    public CLASS_BUILDER1_precheck0_makeequalto _STM() {
        // JavaLine 42 <== SourceLine 539
        p_qnt.symb_1=p_q.symb_1;
        ;
        // JavaLine 45 <== SourceLine 540
        p_qnt.encl_1=p_q.encl_1;
        ;
        p_qnt.descr_1=p_q.descr_1;
        ;
        // JavaLine 50 <== SourceLine 541
        p_qnt.type_1=p_q.type_1;
        ;
        p_qnt.kind_1=p_q.kind_1;
        ;
        // JavaLine 55 <== SourceLine 542
        p_qnt.categ_1=p_q.categ_1;
        ;
        p_qnt.prefqual_1=p_q.prefqual_1;
        ;
        // JavaLine 60 <== SourceLine 543
        p_qnt.plev_1=p_q.plev_1;
        ;
        p_qnt.dim_1=p_q.dim_1;
        ;
        // JavaLine 65 <== SourceLine 544
        p_qnt.protect_1=p_q.protect_1;
        ;
        p_qnt.visible_1=p_q.visible_1;
        ;
        // JavaLine 70 <== SourceLine 545
        if(_VALUE((p_qnt.visible_1!=(((char)0))))) {
            p_qnt.visible_1=((char)1);
        }
        ;
        // JavaLine 75 <== SourceLine 546
        p_qnt.virtno_1=p_q.virtno_1;
        ;
        p_qnt.match_1=p_q.match_1;
        ;
        // JavaLine 80 <== SourceLine 547
        p_qnt.special_1=p_q.special_1;
        ;
        // JavaLine 83 <== SourceLine 550
        if(_VALUE(((p_q.line_1<(0))&&(RTS_UTIL._IS(p_qnt,CLASS_COMMON_quantity.class))))) {
            p_qnt.ftag_1=p_q.line_1;
        } else {
            // JavaLine 87 <== SourceLine 551
            {
                p_qnt.line_1=p_q.line_1;
                ;
                p_qnt.ftag_1=p_q.ftag_1;
            }
        }
        ;
        // JavaLine 95 <== SourceLine 552
        if(_VALUE(RTS_UTIL._IS(p_qnt,CLASS_COMMON_extquantity.class))) {
            {
                // JavaLine 98 <== SourceLine 553
                if(_VALUE((p_q.ftag_1<(0)))) {
                    {
                        p_qnt.line_1=p_q.ftag_1;
                        ;
                        p_qnt.ftag_1=0;
                    }
                }
                ;
                // JavaLine 107 <== SourceLine 554
                ((CLASS_COMMON_extquantity)(p_qnt)).p2_module=((CLASS_COMMON_extquantity)(p_q)).p2_module;
                ;
                // JavaLine 110 <== SourceLine 555
                ((CLASS_COMMON_extquantity)(p_qnt)).clf_2=((CLASS_COMMON_extquantity)(p_q)).clf_2;
                ;
                // JavaLine 113 <== SourceLine 556
                ((CLASS_COMMON_extquantity)(p_qnt)).longindic_2=((CLASS_COMMON_extquantity)(p_q)).longindic_2;
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 makeequalto",1,538,42,539,45,540,50,541,55,542,60,543,65,544,70,545,75,546,80,547,83,550,87,551,95,552,98,553,107,554,110,555,113,556,121,560);
} // End of Procedure
