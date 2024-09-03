// JavaLine 1 <== SourceLine 573
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_resethide_reprtct extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=573, lastLine=581, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 574
    public CLASS_COMMON_quantity qty=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_resethide_reprtct setPar(Object param) {
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
    public CLASS_BUILDER1_precheck0_resethide_reprtct(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_resethide_reprtct(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_resethide_reprtct _STM() {
        // JavaLine 41 <== SourceLine 575
        qty=p_q.descr_1.fpar;
        ;
        // JavaLine 44 <== SourceLine 576
        while((qty!=(null))) {
            {
                // JavaLine 47 <== SourceLine 577
                if(_VALUE((qty.kind_1==(((char)5))))) {
                    new CLASS_BUILDER1_precheck0_resethide_reprtct((_CUR._SL),qty);
                }
                ;
                // JavaLine 52 <== SourceLine 578
                qty=((CLASS_COMMON_quantity)(qty.next));
                ;
            }
        }
        ;
        // JavaLine 58 <== SourceLine 580
        new CLASS_BUILDER1_precheck0_protect((_CUR._SL._SL),p_q);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 reprtct",1,573,11,574,41,575,44,576,47,577,52,578,58,580,63,581);
} // End of Procedure
