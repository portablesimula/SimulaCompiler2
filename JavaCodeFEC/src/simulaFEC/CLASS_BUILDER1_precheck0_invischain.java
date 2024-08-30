// JavaLine 1 <== SourceLine 347
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_invischain extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=347, lastLine=362, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 350
    public CLASS_COMMON_identsymbol _inspect_350_4526=null;
    // JavaLine 13 <== SourceLine 352
    public CLASS_COMMON_sembox _inspect_352_4527=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_invischain setPar(Object param) {
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
    public CLASS_BUILDER1_precheck0_invischain(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_invischain(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_invischain _STM() {
        // JavaLine 43 <== SourceLine 349
        while((p_q!=(null))) {
            {
                // JavaLine 46 <== SourceLine 350
                {
                    // BEGIN INSPECTION 
                    _inspect_350_4526=((CLASS_COMMON_identsymbol)(p_q.symb_1));
                    if(_inspect_350_4526!=null) { // INSPECT _inspect_350_4526  type=ref(IDENTSYMBOL)
                        // JavaLine 51 <== SourceLine 351
                        {
                            // JavaLine 53 <== SourceLine 350
                            {
                                // JavaLine 55 <== SourceLine 351
                                if(_VALUE((_inspect_350_4526.curmeaning_1==(p_q)))) {
                                    {
                                        // JavaLine 58 <== SourceLine 352
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_352_4527=_inspect_350_4526.curmeaning_1.prevmeaning;
                                            if(_inspect_352_4527!=null) { // INSPECT _inspect_352_4527  type=ref(SEMBOX)
                                                // JavaLine 63 <== SourceLine 353
                                                {
                                                    // JavaLine 65 <== SourceLine 352
                                                    {
                                                        // JavaLine 67 <== SourceLine 353
                                                        _inspect_350_4526.curmeaning_1.prevmeaning=_inspect_352_4527.prevmeaning;
                                                        ;
                                                        // JavaLine 70 <== SourceLine 354
                                                        _inspect_350_4526.curmeaning_1=_inspect_352_4527.next;
                                                        ;
                                                    }
                                                }
                                            }
                                            else { // OTHERWISE 
                                                // JavaLine 77 <== SourceLine 356
                                                _inspect_350_4526.curmeaning_1=null;
                                            } // END OTHERWISE 
                                        } // END INSPECTION
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 90 <== SourceLine 359
                p_q=((CLASS_COMMON_quantity)(p_q.next));
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 invischain",1,347,11,350,13,352,43,349,46,350,51,351,53,350,55,351,58,352,63,353,65,352,67,353,70,354,77,356,90,359,97,362);
} // End of Procedure
