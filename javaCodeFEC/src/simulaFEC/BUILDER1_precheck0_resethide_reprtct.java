// JavaLine 1 <== SourceLine 568
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_resethide_reprtct extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=568, lastLine=576, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 569
    public COMMON_quantity qty=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_resethide_reprtct setPar(Object param) {
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
    public BUILDER1_precheck0_resethide_reprtct(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_resethide_reprtct(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_resethide_reprtct _STM() {
        // JavaLine 41 <== SourceLine 570
        qty=p_q.descr_1.fpar;
        ;
        // JavaLine 44 <== SourceLine 571
        while((qty!=(null))) {
            {
                // JavaLine 47 <== SourceLine 572
                if(_VALUE((qty.kind_1==(((char)5))))) {
                    new BUILDER1_precheck0_resethide_reprtct((_CUR._SL),qty);
                }
                ;
                // JavaLine 52 <== SourceLine 573
                qty=((COMMON_quantity)(qty.next));
                ;
            }
        }
        ;
        // JavaLine 58 <== SourceLine 575
        new BUILDER1_precheck0_protect((_CUR._SL._SL),p_q);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 reprtct",1,568,11,569,41,570,44,571,47,572,52,573,58,575,63,576);
} // End of Procedure
