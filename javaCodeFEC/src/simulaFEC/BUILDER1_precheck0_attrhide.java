// JavaLine 1 <== SourceLine 588
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_attrhide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=588, lastLine=603, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_qty;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 589
    public BUILDER1_precheck0_ignore ignp=null;
    // JavaLine 13 <== SourceLine 590
    public BUILDER1_precheck0_ignore curp=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_attrhide setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_attrhide(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_attrhide(RTS_RTObject _SL,COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_attrhide _STM() {
        curp=((BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        // JavaLine 45 <== SourceLine 591
        new BUILDER1_precheck0_hide((_CUR._SL),p_qty,true);
        ;
        // JavaLine 48 <== SourceLine 592
        ignp=((BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        while((ignp!=(curp))) {
            {
                // JavaLine 53 <== SourceLine 593
                if(_VALUE((ignp.p_hp.line>(0)))) {
                    // JavaLine 55 <== SourceLine 594
                    ignp.p_hp.line=(-(ignp.p_hp.line));
                } else {
                    // JavaLine 58 <== SourceLine 595
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("??? attrhide ???"));
                }
                ;
                ;
                // JavaLine 63 <== SourceLine 597
                ignp=ignp.prev;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 598
        p_qty=p_qty.descr_1.fpar;
        ;
        // JavaLine 71 <== SourceLine 599
        while((p_qty!=(null))) {
            {
                // JavaLine 74 <== SourceLine 600
                if(_VALUE((p_qty.kind_1==(((char)5))))) {
                    new BUILDER1_precheck0_attrhide((_CUR._SL),p_qty);
                }
                ;
                // JavaLine 79 <== SourceLine 601
                p_qty=((COMMON_quantity)(p_qty.next));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 attrhide",1,588,11,589,13,590,45,591,48,592,53,593,55,594,58,595,63,597,68,598,71,599,74,600,79,601,87,603);
} // End of Procedure
