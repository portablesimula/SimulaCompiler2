// JavaLine 1 <== SourceLine 342
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_invischain extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=342, lastLine=357, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 345
    public COMMON_identsymbol _inspect_345_4526=null;
    // JavaLine 13 <== SourceLine 347
    public COMMON_sembox _inspect_347_4527=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_invischain setPar(Object param) {
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
    public BUILDER1_precheck0_invischain(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_invischain(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_invischain _STM() {
        // JavaLine 43 <== SourceLine 344
        while((p_q!=(null))) {
            {
                // JavaLine 46 <== SourceLine 345
                {
                    // BEGIN INSPECTION 
                    _inspect_345_4526=((COMMON_identsymbol)(p_q.symb_1));
                    if(_inspect_345_4526!=null) { // INSPECT _inspect_345_4526
                        // JavaLine 51 <== SourceLine 346
                        {
                            // JavaLine 53 <== SourceLine 345
                            {
                                // JavaLine 55 <== SourceLine 346
                                if(_VALUE((_inspect_345_4526.curmeaning_1==(p_q)))) {
                                    {
                                        // JavaLine 58 <== SourceLine 347
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_347_4527=_inspect_345_4526.curmeaning_1.prevmeaning;
                                            if(_inspect_347_4527!=null) { // INSPECT _inspect_347_4527
                                                // JavaLine 63 <== SourceLine 348
                                                {
                                                    // JavaLine 65 <== SourceLine 347
                                                    {
                                                        // JavaLine 67 <== SourceLine 348
                                                        _inspect_345_4526.curmeaning_1.prevmeaning=_inspect_347_4527.prevmeaning;
                                                        ;
                                                        // JavaLine 70 <== SourceLine 349
                                                        _inspect_345_4526.curmeaning_1=_inspect_347_4527.next;
                                                        ;
                                                    }
                                                }
                                            }
                                            else { // OTHERWISE 
                                                // JavaLine 77 <== SourceLine 351
                                                _inspect_345_4526.curmeaning_1=null;
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
                // JavaLine 90 <== SourceLine 354
                p_q=((COMMON_quantity)(p_q.next));
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 invischain",1,342,11,345,13,347,43,344,46,345,51,346,53,345,55,346,58,347,63,348,65,347,67,348,70,349,77,351,90,354,97,357);
} // End of Procedure
