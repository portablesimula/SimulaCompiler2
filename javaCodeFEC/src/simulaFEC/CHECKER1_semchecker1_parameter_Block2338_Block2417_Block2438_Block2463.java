package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_parameter_Block2338_Block2417_Block2438_Block2463 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=2462, lastLine=2486, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 2463
    public COMMON_quantity actqty=null;
    public COMMON_quantity cquant=null;
    // Normal Constructor
    public CHECKER1_semchecker1_parameter_Block2338_Block2417_Block2438_Block2463(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 20 <== SourceLine 2464
        actqty=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p_actual.qual;
        ;
        cquant=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.prefqual_1;
        ;
        // JavaLine 25 <== SourceLine 2465
        if(_VALUE((actqty!=(cquant)))) {
            {
                // JavaLine 28 <== SourceLine 2466
                if(_VALUE((actqty!=(null)))) {
                    {
                        // JavaLine 31 <== SourceLine 2467
                        if(_VALUE((cquant!=(((CHECKER1_semchecker1)(_CUR._SL._SL)).textclass_2)))) {
                            // JavaLine 33 <== SourceLine 2468
                            {
                                // JavaLine 35 <== SourceLine 2469
                                if(_VALUE(new BUILDER1_precheck0_subclass((_CUR._SL._SL),cquant,actqty)._RESULT)) {
                                    // JavaLine 37 <== SourceLine 2470
                                    ((CHECKER1_semchecker1_parameter)(_CUR._SL)).implqua_1=(((CHECKER1)(_CUR._SL._SL._SL)).QuaCheck_6&((((CHECKER1_semchecker1)(_CUR._SL._SL)).ftype_2==(((char)7)))));
                                } else {
                                    // JavaLine 40 <== SourceLine 2471
                                    if(_VALUE(new BUILDER1_precheck0_subclass((_CUR._SL._SL),actqty,cquant)._RESULT)) {
                                        // JavaLine 42 <== SourceLine 2472
                                        ((CHECKER1_semchecker1_parameter)(_CUR._SL)).implqua_1=false;
                                    } else {
                                        // JavaLine 45 <== SourceLine 2473
                                        {
                                            // JavaLine 47 <== SourceLine 2474
                                            if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL._SL)).ftype_2==(((char)9)))||((((((((CHECKER1)(_CUR._SL._SL._SL)).SportOK&&(_IS(actqty,COMMON_extquantity.class)))&&(_IS(cquant,COMMON_extquantity.class)))&&((actqty.symb_1==(cquant.symb_1))))&&((((COMMON_extbrecord)(actqty.descr_1)).checklo_1==(((COMMON_extbrecord)(cquant.descr_1)).checklo_1))))&&((((COMMON_extbrecord)(actqty.descr_1)).checkhi_1==(((COMMON_extbrecord)(cquant.descr_1)).checkhi_1)))))))) {
                                                // JavaLine 49 <== SourceLine 2483
                                                {
                                                    new CHECKER1_semchecker1_argument_errARG((_CUR._SL),-427);
                                                    ;
                                                    ((CHECKER1_semchecker1_parameter)(_CUR._SL)).implqua_1=false;
                                                }
                                            } else {
                                                // JavaLine 56 <== SourceLine 2484
                                                new CHECKER1_semchecker1_argument_errARG((_CUR._SL),427);
                                            }
                                            ;
                                        }
                                    }
                                }
                                ;
                            }
                        }
                    }
                }
            }
        }
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","4 Block2463",8,2463,20,2464,25,2465,28,2466,31,2467,33,2468,35,2469,37,2470,40,2471,42,2472,45,2473,47,2474,49,2483,56,2484,72,2486);
} // End of SubBlock
