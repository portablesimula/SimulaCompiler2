// JavaLine 1 <== SourceLine 571
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_resethide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=571, lastLine=591, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 585
    public CLASS_BUILDER1_precheck0_ignore _inspect_585_4532=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_resethide setPar(Object param) {
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
    public CLASS_BUILDER1_precheck0_resethide(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_resethide(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_resethide _STM() {
        // JavaLine 41 <== SourceLine 583
        while((((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp!=(null))) {
            // JavaLine 43 <== SourceLine 585
            {
                // BEGIN INSPECTION 
                _inspect_585_4532=((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp;
                if(_inspect_585_4532!=null) { // INSPECT _inspect_585_4532  type=ref(IGNORE)
                    // JavaLine 48 <== SourceLine 586
                    {
                        // JavaLine 50 <== SourceLine 585
                        {
                            // JavaLine 52 <== SourceLine 586
                            _inspect_585_4532.p_q.protect_1=((char)1);
                            ;
                            _inspect_585_4532.p_q.visible_1=((char)0);
                            ;
                            // JavaLine 57 <== SourceLine 587
                            _inspect_585_4532.p_hp.line=(-(_inspect_585_4532.p_hp.line));
                            ;
                            // JavaLine 60 <== SourceLine 588
                            ((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp=_inspect_585_4532.prev;
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 69 <== SourceLine 590
        new CLASS_BUILDER1_precheck0_resethide_reprtct((_CUR),p_q);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 resethide",1,571,11,585,41,583,43,585,48,586,50,585,52,586,57,587,60,588,69,590,74,591);
} // End of Procedure
