// JavaLine 1 <== SourceLine 593
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_attrhide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=593, lastLine=608, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 594
    public CLASS_BUILDER1_precheck0_ignore ignp=null;
    // JavaLine 13 <== SourceLine 595
    public CLASS_BUILDER1_precheck0_ignore curp=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_attrhide setPar(Object param) {
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
    public CLASS_BUILDER1_precheck0_attrhide(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_attrhide(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_attrhide _STM() {
        curp=((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        // JavaLine 45 <== SourceLine 596
        new CLASS_BUILDER1_precheck0_hide((_CUR._SL),p_qty,true);
        ;
        // JavaLine 48 <== SourceLine 597
        ignp=((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        while((ignp!=(curp))) {
            {
                // JavaLine 53 <== SourceLine 598
                if(_VALUE((ignp.p_hp.line>(0)))) {
                    // JavaLine 55 <== SourceLine 599
                    ignp.p_hp.line=(-(ignp.p_hp.line));
                } else {
                    // JavaLine 58 <== SourceLine 600
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("??? attrhide ???"));
                }
                ;
                ;
                // JavaLine 63 <== SourceLine 602
                ignp=ignp.prev;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 603
        p_qty=p_qty.descr_1.fpar;
        ;
        // JavaLine 71 <== SourceLine 604
        while((p_qty!=(null))) {
            {
                // JavaLine 74 <== SourceLine 605
                if(_VALUE((p_qty.kind_1==(((char)5))))) {
                    new CLASS_BUILDER1_precheck0_attrhide((_CUR._SL),p_qty);
                }
                ;
                // JavaLine 79 <== SourceLine 606
                p_qty=((CLASS_COMMON_quantity)(p_qty.next));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 attrhide",1,593,11,594,13,595,45,596,48,597,53,598,55,599,58,600,63,602,68,603,71,604,74,605,79,606,87,608);
} // End of Procedure
