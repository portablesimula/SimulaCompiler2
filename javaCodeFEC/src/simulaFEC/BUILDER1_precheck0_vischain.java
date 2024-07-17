// JavaLine 1 <== SourceLine 321
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_vischain extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=321, lastLine=338, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    public COMMON_quantity p_visq;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 326
    public COMMON_identsymbol _inspect_326_4524=null;
    // JavaLine 14 <== SourceLine 329
    public COMMON_sembox _inspect_329_4525=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_vischain setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(COMMON_quantity)objectValue(param); break;
                case 1: p_visq=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_vischain(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_vischain(RTS_RTObject _SL,COMMON_quantity sp_q,COMMON_quantity sp_visq) {
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
    public BUILDER1_precheck0_vischain _STM() {
        // JavaLine 46 <== SourceLine 323
        p_visq=p_q;
        ;
        // JavaLine 49 <== SourceLine 324
        while((p_visq!=(null))) {
            {
                // JavaLine 52 <== SourceLine 325
                if(_VALUE((p_visq.visible_1==(((char)0))))) {
                    // JavaLine 54 <== SourceLine 326
                    {
                        // BEGIN INSPECTION 
                        _inspect_326_4524=((COMMON_identsymbol)(p_visq.symb_1));
                        if(_inspect_326_4524!=null) { // INSPECT _inspect_326_4524
                            // JavaLine 59 <== SourceLine 327
                            {
                                // JavaLine 61 <== SourceLine 326
                                {
                                    // JavaLine 63 <== SourceLine 328
                                    if(_VALUE(((_inspect_326_4524.curmeaning_1!=(null))||((p_visq==(_inspect_326_4524.curmeaning_1)))))) {
                                        // JavaLine 65 <== SourceLine 329
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_329_4525=new COMMON_sembox((_CUR._SL._SL))._STM();
                                            if(_inspect_329_4525!=null) { // INSPECT _inspect_329_4525
                                                // JavaLine 70 <== SourceLine 330
                                                {
                                                    // JavaLine 72 <== SourceLine 329
                                                    {
                                                        // JavaLine 74 <== SourceLine 330
                                                        _inspect_329_4525.prevmeaning=p_visq.prevmeaning;
                                                        ;
                                                        _inspect_329_4525.next=_inspect_326_4524.curmeaning_1;
                                                        ;
                                                        // JavaLine 79 <== SourceLine 331
                                                        p_visq.prevmeaning=((COMMON_sembox)_inspect_329_4525);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                    // JavaLine 88 <== SourceLine 333
                                    _inspect_326_4524.curmeaning_1=p_visq;
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
                // JavaLine 97 <== SourceLine 335
                p_visq=((COMMON_quantity)(p_visq.next));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 vischain",1,321,12,326,14,329,46,323,49,324,52,325,54,326,59,327,61,326,63,328,65,329,70,330,72,329,74,330,79,331,88,333,97,335,105,338);
} // End of Procedure
