// JavaLine 1 <== SourceLine 203
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_outprototypes extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=203, lastLine=251, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 207
    public CLASS_COMMON_quantity qty=null;
    public CLASS_COMMON_quantity pqty=null;
    // JavaLine 14 <== SourceLine 208
    public CLASS_COMMON_brecord lastC=null;
    // JavaLine 16 <== SourceLine 229
    public CLASS_COMMON_brecord _inspect_229_4640=null;
    // JavaLine 18 <== SourceLine 246
    public CLASS_COMMON_quantity _inspect_246_4641=null;
    // JavaLine 20 <== SourceLine 248
    public CLASS_COMMON_quantity _inspect_248_4642=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_outprototypes setPar(Object param) {
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
    public CLASS_SCODER2_codegenerator2_outprototypes(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_outprototypes(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_outprototypes _STM() {
        // JavaLine 50 <== SourceLine 209
        qty=p_q.descr_1.fpar;
        ;
        // JavaLine 53 <== SourceLine 210
        while((qty!=(null))) {
            {
                // JavaLine 56 <== SourceLine 223
                if(_VALUE((qty.special_1==(((char)2))))) {
                    // JavaLine 58 <== SourceLine 224
                    {
                        // JavaLine 60 <== SourceLine 226
                        if(_VALUE((pqty==(null)))) {
                            p_q.descr_1.fpar=((CLASS_COMMON_quantity)(qty.next));
                        } else {
                            // JavaLine 64 <== SourceLine 227
                            pqty.next=qty.next;
                        }
                        ;
                        // JavaLine 68 <== SourceLine 229
                        {
                            // BEGIN INSPECTION 
                            _inspect_229_4640=qty.descr_1;
                            if(_inspect_229_4640!=null) { // INSPECT _inspect_229_4640  type=ref(BRECORD)
                                // JavaLine 73 <== SourceLine 230
                                {
                                    // JavaLine 75 <== SourceLine 229
                                    {
                                        // JavaLine 77 <== SourceLine 230
                                        _inspect_229_4640.fpar=pqty;
                                        ;
                                        // JavaLine 80 <== SourceLine 231
                                        _inspect_229_4640.favirt=(((lastC!=(null)))?(lastC.declquant):(null));
                                        ;
                                        // JavaLine 83 <== SourceLine 233
                                        lastC=((CLASS_COMMON_brecord)_inspect_229_4640);
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                } else {
                    // JavaLine 93 <== SourceLine 236
                    {
                        // JavaLine 95 <== SourceLine 237
                        if(_VALUE((qty.categ_1==(((char)3))))) {
                            {
                                // JavaLine 98 <== SourceLine 238
                                if(_VALUE((qty.kind_1==(((char)5))))) {
                                    new CLASS_SCODER2_codegenerator2_outprototypes((_CUR._SL),qty);
                                }
                            }
                        }
                        ;
                        // JavaLine 105 <== SourceLine 239
                        pqty=qty;
                        ;
                    }
                }
                ;
                // JavaLine 111 <== SourceLine 241
                qty=((CLASS_COMMON_quantity)(qty.next));
                ;
            }
        }
        ;
        // JavaLine 117 <== SourceLine 243
        new CLASS_SCODER2_codegenerator2_prototypegenerator((_CUR._SL),p_q);
        ;
        // JavaLine 120 <== SourceLine 245
        while((lastC!=(null))) {
            {
                // JavaLine 123 <== SourceLine 246
                {
                    // BEGIN INSPECTION 
                    _inspect_246_4641=lastC.fpar;
                    if(_inspect_246_4641!=null) { // INSPECT _inspect_246_4641  type=ref(QUANTITY)
                        {
                            _inspect_246_4641.next=lastC.declquant;
                        }
                    }
                    else { // OTHERWISE 
                        // JavaLine 133 <== SourceLine 247
                        p_q.descr_1.fpar=lastC.declquant;
                    } // END OTHERWISE 
                } // END INSPECTION
                ;
                // JavaLine 138 <== SourceLine 248
                {
                    // BEGIN INSPECTION 
                    _inspect_248_4642=lastC.favirt;
                    if(_inspect_248_4642!=null) { // INSPECT _inspect_248_4642  type=ref(QUANTITY)
                        {
                            lastC=_inspect_248_4642.descr_1;
                        }
                    }
                    else { // OTHERWISE 
                        // JavaLine 148 <== SourceLine 249
                        lastC=null;
                    } // END OTHERWISE 
                } // END INSPECTION
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 outprototypes",1,203,11,207,14,208,16,229,18,246,20,248,50,209,53,210,56,223,58,224,60,226,64,227,68,229,73,230,75,229,77,230,80,231,83,233,93,236,95,237,98,238,105,239,111,241,117,243,120,245,123,246,133,247,138,248,148,249,158,251);
} // End of Procedure
