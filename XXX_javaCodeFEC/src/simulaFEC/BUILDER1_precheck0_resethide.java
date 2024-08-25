// JavaLine 1 <== SourceLine 566
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_resethide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=566, lastLine=586, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 580
    public BUILDER1_precheck0_ignore _inspect_580_4532=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_resethide setPar(Object param) {
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
    public BUILDER1_precheck0_resethide(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_resethide(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_resethide _STM() {
        // JavaLine 41 <== SourceLine 578
        while((((BUILDER1_precheck0)(_CUR._SL)).curhp!=(null))) {
            // JavaLine 43 <== SourceLine 580
            {
                // BEGIN INSPECTION 
                _inspect_580_4532=((BUILDER1_precheck0)(_CUR._SL)).curhp;
                if(_inspect_580_4532!=null) { // INSPECT _inspect_580_4532
                    // JavaLine 48 <== SourceLine 581
                    {
                        // JavaLine 50 <== SourceLine 580
                        {
                            // JavaLine 52 <== SourceLine 581
                            _inspect_580_4532.p_q.protect_1=((char)1);
                            ;
                            _inspect_580_4532.p_q.visible_1=((char)0);
                            ;
                            // JavaLine 57 <== SourceLine 582
                            _inspect_580_4532.p_hp.line=(-(_inspect_580_4532.p_hp.line));
                            ;
                            // JavaLine 60 <== SourceLine 583
                            ((BUILDER1_precheck0)(_CUR._SL)).curhp=_inspect_580_4532.prev;
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 69 <== SourceLine 585
        new BUILDER1_precheck0_resethide_reprtct((_CUR),p_q);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 resethide",1,566,11,580,41,578,43,580,48,581,50,580,52,581,57,582,60,583,69,585,74,586);
} // End of Procedure
