// JavaLine 1 <== SourceLine 725
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_exttag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=725, lastLine=769, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 727
    public int oldxtag=0;
    // JavaLine 15 <== SourceLine 725
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_exttag setPar(Object param) {
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
    public BUILDER1_exttag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_exttag(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_exttag _STM() {
        // JavaLine 45 <== SourceLine 727
        oldxtag=((BUILDER1)(_CUR._SL)).nextexttag_6;
        ;
        // JavaLine 48 <== SourceLine 729
        if(_VALUE(((p_q.visible_1==(((char)0)))||((p_q.protect_1==(((char)1))))))) {
            // JavaLine 50 <== SourceLine 730
            {
                // JavaLine 52 <== SourceLine 736
                _RESULT=((BUILDER1)(_CUR._SL)).nextexttag_6;
                ;
                // JavaLine 55 <== SourceLine 738
                if(_VALUE((p_q.categ_1==(((char)6))))) {
                    _RESULT=-1;
                } else {
                    // JavaLine 59 <== SourceLine 739
                    if(_VALUE((p_q.categ_1==(((char)4))))) {
                        {
                            // JavaLine 62 <== SourceLine 740
                            if(_VALUE(_IS(p_q.descr_1,COMMON_extbrecord.class))) {
                                _RESULT=-1;
                            } else {
                                // JavaLine 66 <== SourceLine 742
                                ((BUILDER1)(_CUR._SL)).nextexttag_6=(((BUILDER1)(_CUR._SL)).nextexttag_6+(2));
                            }
                            ;
                        }
                    } else {
                        // JavaLine 72 <== SourceLine 744
                        if(_VALUE((_IS(p_q,COMMON_extquantity.class)&&((((COMMON_extquantity)(p_q)).clf_2==(((char)2))))))) {
                            // JavaLine 74 <== SourceLine 746
                            _RESULT=-1;
                        } else {
                            // JavaLine 77 <== SourceLine 747
                            if(_VALUE(((p_q.special_1>(((char)1)))&&((p_q.type_1!=(((char)8))))))) {
                                // JavaLine 79 <== SourceLine 751
                                _RESULT=-1;
                            } else {
                                // JavaLine 82 <== SourceLine 752
                                if(_VALUE(((p_q.kind_1==(((char)5)))&&((p_q.categ_1==(((char)3))))))) {
                                    // JavaLine 84 <== SourceLine 753
                                    ((BUILDER1)(_CUR._SL)).nextexttag_6=(((BUILDER1)(_CUR._SL)).nextexttag_6+((((p_q.descr_1.inrtag!=(((char)0))))?(3):(2))));
                                } else {
                                    // JavaLine 87 <== SourceLine 755
                                    if(_VALUE(((p_q.kind_1==(((char)1)))&&((p_q.categ_1==(((char)3))))))) {
                                        // JavaLine 89 <== SourceLine 756
                                        ((BUILDER1)(_CUR._SL)).nextexttag_6=(((BUILDER1)(_CUR._SL)).nextexttag_6+(2));
                                    } else {
                                        // JavaLine 92 <== SourceLine 758
                                        if(_VALUE((p_q.encl_1.declquant.categ_1==(((char)6))))) {
                                            // JavaLine 94 <== SourceLine 760
                                            _RESULT=-1;
                                        } else {
                                            // JavaLine 97 <== SourceLine 761
                                            ((BUILDER1)(_CUR._SL)).nextexttag_6=(((BUILDER1)(_CUR._SL)).nextexttag_6+((((p_q.categ_1==(((char)2))))?(2):(1))));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ;
            }
        } else {
            // JavaLine 109 <== SourceLine 763
            _RESULT=-2;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 exttag",1,725,13,727,15,725,45,727,48,729,50,730,52,736,55,738,59,739,62,740,66,742,72,744,74,746,77,747,79,751,82,752,84,753,87,755,89,756,92,758,94,760,97,761,109,763,115,769);
} // End of Procedure
