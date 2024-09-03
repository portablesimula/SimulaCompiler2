// JavaLine 1 <== SourceLine 730
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_exttag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=730, lastLine=774, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 732
    public int oldxtag=0;
    // JavaLine 15 <== SourceLine 730
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_exttag setPar(Object param) {
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
    public CLASS_BUILDER1_exttag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_exttag(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_exttag _STM() {
        // JavaLine 45 <== SourceLine 732
        oldxtag=((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6;
        ;
        // JavaLine 48 <== SourceLine 734
        if(_VALUE(((p_q.visible_1==(((char)0)))||((p_q.protect_1==(((char)1))))))) {
            // JavaLine 50 <== SourceLine 735
            {
                // JavaLine 52 <== SourceLine 741
                _RESULT=((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6;
                ;
                // JavaLine 55 <== SourceLine 743
                if(_VALUE((p_q.categ_1==(((char)6))))) {
                    _RESULT=-1;
                } else {
                    // JavaLine 59 <== SourceLine 744
                    if(_VALUE((p_q.categ_1==(((char)4))))) {
                        {
                            // JavaLine 62 <== SourceLine 745
                            if(_VALUE(RTS_UTIL._IS(p_q.descr_1,CLASS_COMMON_extbrecord.class))) {
                                _RESULT=-1;
                            } else {
                                // JavaLine 66 <== SourceLine 747
                                ((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6=(((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6+(2));
                            }
                            ;
                        }
                    } else {
                        // JavaLine 72 <== SourceLine 749
                        if(_VALUE((RTS_UTIL._IS(p_q,CLASS_COMMON_extquantity.class)&&((((CLASS_COMMON_extquantity)(p_q)).clf_2==(((char)2))))))) {
                            // JavaLine 74 <== SourceLine 751
                            _RESULT=-1;
                        } else {
                            // JavaLine 77 <== SourceLine 752
                            if(_VALUE(((p_q.special_1>(((char)1)))&&((p_q.type_1!=(((char)8))))))) {
                                // JavaLine 79 <== SourceLine 756
                                _RESULT=-1;
                            } else {
                                // JavaLine 82 <== SourceLine 757
                                if(_VALUE(((p_q.kind_1==(((char)5)))&&((p_q.categ_1==(((char)3))))))) {
                                    // JavaLine 84 <== SourceLine 758
                                    ((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6=(((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6+((((p_q.descr_1.inrtag!=(((char)0))))?(3):(2))));
                                } else {
                                    // JavaLine 87 <== SourceLine 760
                                    if(_VALUE(((p_q.kind_1==(((char)1)))&&((p_q.categ_1==(((char)3))))))) {
                                        // JavaLine 89 <== SourceLine 761
                                        ((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6=(((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6+(2));
                                    } else {
                                        // JavaLine 92 <== SourceLine 763
                                        if(_VALUE((p_q.encl_1.declquant.categ_1==(((char)6))))) {
                                            // JavaLine 94 <== SourceLine 765
                                            _RESULT=-1;
                                        } else {
                                            // JavaLine 97 <== SourceLine 766
                                            ((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6=(((CLASS_BUILDER1)(_CUR._SL)).nextexttag_6+((((p_q.categ_1==(((char)2))))?(2):(1))));
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
            // JavaLine 109 <== SourceLine 768
            _RESULT=-2;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 exttag",1,730,13,732,15,730,45,732,48,734,50,735,52,741,55,743,59,744,62,745,66,747,72,749,74,751,77,752,79,756,82,757,84,758,87,760,89,761,92,763,94,765,97,766,109,768,115,774);
} // End of Procedure
