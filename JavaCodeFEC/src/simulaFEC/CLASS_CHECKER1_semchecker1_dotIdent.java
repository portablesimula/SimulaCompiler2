// JavaLine 1 <== SourceLine 1556
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_dotIdent extends CLASS_CHECKER1_semchecker1_identifier {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=1556, lastLine=1694, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p2_dotexp;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1659
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_dotIdent_Block1659_NQ_0=new RTS_LABEL(this,2,1,"NQ"); // Local Label #1=NQ At PrefixLevel 2
    // JavaLine 13 <== SourceLine 1669
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_dotIdent_newplev_2=new RTS_LABEL(this,2,2,"newplev"); // Local Label #2=newplev At PrefixLevel 2
    // JavaLine 15 <== SourceLine 1681
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_dotIdent_found_2=new RTS_LABEL(this,2,3,"found"); // Local Label #3=found At PrefixLevel 2
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_dotIdent_emit.class)); }
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_dotIdent_sameAs.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_dotIdent(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp2_dotexp) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p2_dotexp = sp2_dotexp;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_dotIdent _STM() {
        CLASS_CHECKER1_semchecker1_dotIdent _THIS=(CLASS_CHECKER1_semchecker1_dotIdent)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 36 <== SourceLine 1480
                // BEGIN identifier INNER PART
                // JavaLine 38 <== SourceLine 1647
                ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_identifier)(_CUR));
                ;
                // JavaLine 41 <== SourceLine 1648
                ctype='Z';
                ;
                // JavaLine 44 <== SourceLine 1649
                if(_VALUE((p2_dotexp.type!=(((char)15))))) {
                    {
                        // JavaLine 47 <== SourceLine 1650
                        if(_VALUE((p2_dotexp.ctype==('Z')))) {
                            // JavaLine 49 <== SourceLine 1651
                            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p2_dotexp)));
                        }
                        ;
                        // JavaLine 53 <== SourceLine 1652
                        if(_VALUE((p2_dotexp.qual==(null)))) {
                            {
                                new CLASS_ERRMSG_error0((_CUR._SL._SL),163);
                                ;
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_dotIdent_Block1659_NQ_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 62 <== SourceLine 1653
                        if(_VALUE((p2_dotexp.type==(((char)7))))) {
                            ;
                        } else {
                            // JavaLine 66 <== SourceLine 1654
                            if(_VALUE((p2_dotexp.type==(((char)8))))) {
                                ;
                            } else {
                                // JavaLine 70 <== SourceLine 1655
                                if(_VALUE((p2_dotexp.type==(((char)9))))) {
                                    ;
                                } else {
                                    // JavaLine 74 <== SourceLine 1656
                                    new CLASS_ERRMSG_error0((_CUR._SL._SL),162);
                                }
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 82 <== SourceLine 1658
                    {
                        // JavaLine 84 <== SourceLine 1659
                        {
                            _SIM_LABEL(1); // DeclaredIn: dotIdent -> dotIdent[CLASS_CHECKER1_semchecker1_dotIdent] DeclarationKind=Class
                            meaning=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                        }
                        ;
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_dotIdent_found_2); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 94 <== SourceLine 1662
                ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2=p2_dotexp.qual.descr_1;
                ;
                // JavaLine 97 <== SourceLine 1663
                meaning=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2.favirt;
                ;
                // JavaLine 100 <== SourceLine 1664
                while((meaning!=(null))) {
                    {
                        // JavaLine 103 <== SourceLine 1665
                        if(_VALUE((meaning.symb_1==(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)))) {
                            {
                                // JavaLine 106 <== SourceLine 1666
                                if(_VALUE((meaning.visible_1==(((char)0))))) {
                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_dotIdent_found_2); // GOTO EVALUATED LABEL
                                }
                            }
                        }
                        ;
                        // JavaLine 113 <== SourceLine 1667
                        meaning=((CLASS_COMMON_quantity)(meaning.next));
                    }
                }
                ;
                // JavaLine 118 <== SourceLine 1669
                {
                    _SIM_LABEL(2); // DeclaredIn: dotIdent
                    meaning=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2.fpar;
                }
                ;
                // JavaLine 124 <== SourceLine 1670
                while((meaning!=(null))) {
                    {
                        // JavaLine 127 <== SourceLine 1671
                        if(_VALUE((meaning.symb_1==(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)))) {
                            {
                                // JavaLine 130 <== SourceLine 1672
                                if(_VALUE((meaning.visible_1==(((char)0))))) {
                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_dotIdent_found_2); // GOTO EVALUATED LABEL
                                }
                            }
                        }
                        ;
                        // JavaLine 137 <== SourceLine 1673
                        meaning=((CLASS_COMMON_quantity)(meaning.next));
                    }
                }
                ;
                // JavaLine 142 <== SourceLine 1674
                if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2.declquant.plev_1!=(0)))) {
                    {
                        // JavaLine 145 <== SourceLine 1675
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2.declquant.prefqual_1.descr_1;
                        ;
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_dotIdent_newplev_2); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 152 <== SourceLine 1678
                meaning=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                ;
                meaning.dim_1=2;
                ;
                // JavaLine 157 <== SourceLine 1679
                new CLASS_ERRMSG_error2quants((_CUR._SL._SL),405,meaning,p2_dotexp.qual);
                ;
                // JavaLine 160 <== SourceLine 1681
                {
                    _SIM_LABEL(3); // DeclaredIn: dotIdent
                    type=meaning.type_1;
                }
                ;
                kind=meaning.kind_1;
                ;
                // JavaLine 168 <== SourceLine 1682
                qual=(((type==(((char)8))))?(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).textclass_2):(meaning.prefqual_1));
                ;
                // JavaLine 171 <== SourceLine 1683
                if(_VALUE((type==(((char)11))))) {
                    // JavaLine 173 <== SourceLine 1684
                    new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),(((kind==(((char)3))))?(354):(355)));
                }
                ;
                // JavaLine 177 <== SourceLine 1685
                if(_VALUE((kind==(((char)0))))) {
                    {
                        // JavaLine 180 <== SourceLine 1686
                        if(_VALUE((p_ch==('s')))) {
                            new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),357);
                        } else {
                            // JavaLine 184 <== SourceLine 1687
                            if(_VALUE((meaning.special_1>(((char)1))))) {
                                new CLASS_CHECKER1_semchecker1_identifier_NamedConstant((_CUR));
                            } else {
                                // JavaLine 188 <== SourceLine 1688
                                if(_VALUE((meaning.categ_1!=(((char)2))))) {
                                    issimple=1;
                                }
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 197 <== SourceLine 1690
                    issimple=p2_dotexp.issimple;
                }
                ;
                // JavaLine 201 <== SourceLine 1691
                ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).cbrec_2=null;
                ;
                ;
                // JavaLine 205 <== SourceLine 1694
                // BEGIN dotIdent INNER PART
                // ENDOF dotIdent INNER PART
                // ENDOF identifier INNER PART
                // ENDOF exp INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 dotIdent",1,1556,11,1659,13,1669,15,1681,34,169,36,1480,38,1647,41,1648,44,1649,47,1650,49,1651,53,1652,62,1653,66,1654,70,1655,74,1656,82,1658,84,1659,94,1662,97,1663,100,1664,103,1665,106,1666,113,1667,118,1669,124,1670,127,1671,130,1672,137,1673,142,1674,145,1675,152,1678,157,1679,160,1681,168,1682,171,1683,173,1684,177,1685,180,1686,184,1687,188,1688,197,1690,201,1691,205,1694,219,1694);
} // End of Class
