// JavaLine 1 <== SourceLine 326
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_vischain extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=326, lastLine=343, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public CLASS_COMMON_quantity p_visq;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 331
    public CLASS_COMMON_identsymbol _inspect_331_4524=null;
    // JavaLine 14 <== SourceLine 334
    public CLASS_COMMON_sembox _inspect_334_4525=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_vischain setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_visq=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_vischain(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_vischain(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,CLASS_COMMON_quantity sp_visq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_visq = sp_visq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_vischain _STM() {
        // JavaLine 46 <== SourceLine 328
        p_visq=p_q;
        ;
        // JavaLine 49 <== SourceLine 329
        while((p_visq!=(null))) {
            {
                // JavaLine 52 <== SourceLine 330
                if(_VALUE((p_visq.visible_1==(((char)0))))) {
                    // JavaLine 54 <== SourceLine 331
                    {
                        // BEGIN INSPECTION 
                        _inspect_331_4524=((CLASS_COMMON_identsymbol)(p_visq.symb_1));
                        if(_inspect_331_4524!=null) { // INSPECT _inspect_331_4524  type=ref(IDENTSYMBOL)
                            // JavaLine 59 <== SourceLine 332
                            {
                                // JavaLine 61 <== SourceLine 331
                                {
                                    // JavaLine 63 <== SourceLine 333
                                    if(_VALUE(((_inspect_331_4524.curmeaning_1!=(null))||((p_visq==(_inspect_331_4524.curmeaning_1)))))) {
                                        // JavaLine 65 <== SourceLine 334
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_334_4525=new CLASS_COMMON_sembox((_CUR._SL._SL))._STM();
                                            if(_inspect_334_4525!=null) { // INSPECT _inspect_334_4525  type=ref(SEMBOX)
                                                // JavaLine 70 <== SourceLine 335
                                                {
                                                    // JavaLine 72 <== SourceLine 334
                                                    {
                                                        // JavaLine 74 <== SourceLine 335
                                                        _inspect_334_4525.prevmeaning=p_visq.prevmeaning;
                                                        ;
                                                        _inspect_334_4525.next=_inspect_331_4524.curmeaning_1;
                                                        ;
                                                        // JavaLine 79 <== SourceLine 336
                                                        p_visq.prevmeaning=((CLASS_COMMON_sembox)_inspect_334_4525);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                    // JavaLine 88 <== SourceLine 338
                                    _inspect_331_4524.curmeaning_1=p_visq;
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
                // JavaLine 97 <== SourceLine 340
                p_visq=((CLASS_COMMON_quantity)(p_visq.next));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 vischain",1,326,12,331,14,334,46,328,49,329,52,330,54,331,59,332,61,331,63,333,65,334,70,335,72,334,74,335,79,336,88,338,97,340,105,343);
} // End of Procedure
