// JavaLine 1 <== SourceLine 1656
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_LAYOUT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1656, lastLine=1776, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1715
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_LAYOUT_Block1686_Block1688_Block1689_Block1712_SIMOBTAG_0=new RTS_LABEL(this,0,1,"SIMOBTAG"); // Local Label #1=SIMOBTAG At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 1683
    public CLASS_COMMON_quantity q=null;
    public CLASS_COMMON_extquantity exq=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_prechecker_allocate_LAYOUT setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(CLASS_COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_prechecker_allocate_LAYOUT(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_LAYOUT(RTS_RTObject _SL,CLASS_COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate_LAYOUT _STM() {
        CLASS_BUILDER2_prechecker_allocate_LAYOUT _THIS=(CLASS_BUILDER2_prechecker_allocate_LAYOUT)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 49 <== SourceLine 1685
                if(_VALUE((p_brc.kind!=(((char)11))))) {
                    {
                        // JavaLine 52 <== SourceLine 1686
                        if(_VALUE((p_brc.kind!=(((char)13))))) {
                            {
                                // JavaLine 55 <== SourceLine 1688
                                if(_VALUE(RTS_UTIL._IS(p_brc.declquant,CLASS_COMMON_quantity.class))) {
                                    {
                                        // JavaLine 58 <== SourceLine 1689
                                        p_brc.declquant.ftag_1=new CLASS_BUILDER1_newFirstTag((_CUR._SL._SL._SL),p_brc.declquant)._RESULT;
                                        ;
                                        // JavaLine 61 <== SourceLine 1695
                                        if(_VALUE(((p_brc.kind==(((char)1)))&&((p_brc.declquant.plev_1==(2)))))) {
                                            ;
                                        } else {
                                            // JavaLine 65 <== SourceLine 1697
                                            if(_VALUE((((p_brc.kind==(((char)5)))||((p_brc.kind==(((char)9)))))||((p_brc.kind==(((char)7))))))) {
                                                // JavaLine 67 <== SourceLine 1699
                                                new CLASS_BUILDER2_prechecker_allocate_LAYOUT_Block1686_Block1688_Block1689_Block1700((_CUR))._STM();
                                            } else {
                                                // JavaLine 70 <== SourceLine 1711
                                                {
                                                    // JavaLine 72 <== SourceLine 1712
                                                    if(_VALUE(((p_brc.kind==(((char)8)))||((p_brc.kind==(((char)1))))))) {
                                                        // JavaLine 74 <== SourceLine 1714
                                                        new CLASS_BUILDER1_newQTags((_CUR._SL._SL._SL),p_brc.declquant,2);
                                                    }
                                                    ;
                                                    // JavaLine 78 <== SourceLine 1715
                                                    {
                                                        _SIM_LABEL(1); // DeclaredIn: LAYOUT -> LAYOUT[externalIdent=CLASS_BUILDER2_prechecker_allocate_LAYOUT] Kind=5, QUAL=ProcedureDeclaration, HashCode=761970631
                                                        if(_VALUE(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).simob_descr)) {
                                                            {
                                                                // JavaLine 83 <== SourceLine 1716
                                                                if(_VALUE(((p_brc.kind==(((char)5)))||((p_brc.kind==(((char)1))))))) {
                                                                    // JavaLine 85 <== SourceLine 1717
                                                                    {
                                                                        // JavaLine 87 <== SourceLine 1719
                                                                        new CLASS_BUILDER1_newTTag((_CUR._SL._SL._SL),new RTS_TXT("bcnt"));
                                                                        ;
                                                                        // JavaLine 90 <== SourceLine 1721
                                                                        p_brc.declquant.ftag_1=(p_brc.declquant.ftag_1+(1));
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 102 <== SourceLine 1728
                                        new CLASS_BUILDER1_newQTags((_CUR._SL._SL._SL),p_brc.declquant,p_brc.connests);
                                        ;
                                    }
                                } else {
                                    // JavaLine 107 <== SourceLine 1730
                                    if(_VALUE((((CLASS_COMMON_extquantity)(p_brc.declquant)).p2_module==(null)))) {
                                        {
                                            // JavaLine 110 <== SourceLine 1732
                                            p_brc.declquant.ftag_1=(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).lastusedtag_6+(1));
                                            ;
                                            // JavaLine 113 <== SourceLine 1733
                                            new CLASS_BUILDER1_newTags((_CUR._SL._SL._SL),(((p_brc.declquant.type_1!=(((char)14))))?(4):(3)));
                                            ;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ;
                // JavaLine 124 <== SourceLine 1739
                q=p_brc.fpar;
                ;
                // JavaLine 127 <== SourceLine 1740
                while((q!=(null))) {
                    {
                        // JavaLine 130 <== SourceLine 1742
                        if(_VALUE(RTS_UTIL._IS(q,CLASS_COMMON_extquantity.class))) {
                            {
                                // JavaLine 133 <== SourceLine 1743
                                if(_VALUE((((CLASS_COMMON_extquantity)(q)).clf_2<=(((char)2))))) {
                                    {
                                        // JavaLine 136 <== SourceLine 1744
                                        if(_VALUE(RTS_UTIL._IS(q.descr_1,CLASS_COMMON_extbrecord.class))) {
                                            {
                                                // JavaLine 139 <== SourceLine 1746
                                                ((CLASS_COMMON_extbrecord)(q.descr_1)).ftag_1=(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).lastusedtag_6+(1));
                                                ;
                                                // JavaLine 142 <== SourceLine 1747
                                                new CLASS_BUILDER1_newTags((_CUR._SL._SL._SL),((CLASS_COMMON_extbrecord)(q.descr_1)).exttagnum_1);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 148 <== SourceLine 1749
                                        if(_VALUE((((CLASS_COMMON_extquantity)(q)).p2_module!=(null)))) {
                                            // JavaLine 150 <== SourceLine 1752
                                            q.ftag_1=(q.ftag_1+(((CLASS_COMMON_extquantity)(q)).p2_module.ftag_1));
                                        } else {
                                            // JavaLine 153 <== SourceLine 1754
                                            if(_VALUE((((CLASS_COMMON_extquantity)(q)).clf_2==(((char)2))))) {
                                                // JavaLine 155 <== SourceLine 1756
                                                q.ftag_1=new CLASS_BUILDER1_newTTag((_CUR._SL._SL._SL),new RTS_TXT("Clf002"))._RESULT;
                                            }
                                        }
                                        ;
                                        // JavaLine 160 <== SourceLine 1757
                                        if(_VALUE((q.special_1==(((char)0))))) {
                                            {
                                                // JavaLine 163 <== SourceLine 1758
                                                if(_VALUE((q.descr_1!=(null)))) {
                                                    new CLASS_BUILDER2_prechecker_allocate_LAYOUT((_CUR._SL),q.descr_1);
                                                }
                                            }
                                        }
                                        ;
                                    }
                                }
                            }
                        } else {
                            // JavaLine 174 <== SourceLine 1761
                            if(_VALUE((((((q.kind_1==(((char)1)))&&((q.categ_1==(((char)3)))))||((q.kind_1==(((char)6)))))||((q.kind_1==(((char)5)))))||((q.kind_1==(((char)7))))))) {
                                // JavaLine 176 <== SourceLine 1765
                                new CLASS_BUILDER2_prechecker_allocate_LAYOUT((_CUR._SL),q.descr_1);
                            } else {
                                // JavaLine 179 <== SourceLine 1766
                                if(_VALUE(((q.special_1>(((char)1)))&&((q.type_1!=(((char)8))))))) {
                                    ;
                                } else {
                                    // JavaLine 183 <== SourceLine 1768
                                    {
                                        // JavaLine 185 <== SourceLine 1770
                                        q.ftag_1=new CLASS_BUILDER1_newFirstTag((_CUR._SL._SL._SL),q)._RESULT;
                                        ;
                                        // JavaLine 188 <== SourceLine 1772
                                        if(_VALUE((q.categ_1==(((char)2))))) {
                                            new CLASS_BUILDER1_newTTag((_CUR._SL._SL._SL),new RTS_TXT("C\u005fname"));
                                        }
                                        ;
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 198 <== SourceLine 1774
                        q=((CLASS_COMMON_quantity)(q.next));
                        ;
                    }
                }
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 LAYOUT",1,1656,11,1715,14,1683,49,1685,52,1686,55,1688,58,1689,61,1695,65,1697,67,1699,70,1711,72,1712,74,1714,78,1715,83,1716,85,1717,87,1719,90,1721,102,1728,107,1730,110,1732,113,1733,124,1739,127,1740,130,1742,133,1743,136,1744,139,1746,142,1747,148,1749,150,1752,153,1754,155,1756,160,1757,163,1758,174,1761,176,1765,179,1766,183,1768,185,1770,188,1772,198,1774,213,1776);
} // End of Procedure
