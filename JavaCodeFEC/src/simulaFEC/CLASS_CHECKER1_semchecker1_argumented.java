// JavaLine 1 <== SourceLine 1780
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_argumented extends CLASS_CHECKER1_semchecker1_pre_argumented {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=2, firstLine=1780, lastLine=1946, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1847
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_Block1845_Block1847_SEARCH2_0=new RTS_LABEL(this,2,1,"SEARCH2"); // Local Label #1=SEARCH2 At PrefixLevel 2
    // JavaLine 12 <== SourceLine 1860
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_Block1857_Block1858_Block1860_OL_0=new RTS_LABEL(this,2,2,"OL"); // Local Label #2=OL At PrefixLevel 2
    // JavaLine 14 <== SourceLine 1877
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_TYPCHK_0=new RTS_LABEL(this,2,3,"TYPCHK"); // Local Label #3=TYPCHK At PrefixLevel 2
    // Declare locals as attributes
    // JavaLine 17 <== SourceLine 1782
    public int i_2=0;
    public char searched_2=0;
    public char atype_2=0;
    public char ftype_2=0;
    // JavaLine 22 <== SourceLine 1783
    public CLASS_COMMON_symbolbox symx_2=null;
    public CLASS_COMMON_extquantity q_2=null;
    public CLASS_CHECKER1_semchecker1_parameter p_2=null;
    // JavaLine 26 <== SourceLine 1829
    public CLASS_COMMON_extquantity _inspect_1829_4581=null;
    // JavaLine 28 <== SourceLine 1928
    public CLASS_COMMON_quantity _inspect_1928_4582=null;
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_argumented_sameAs.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_argumented(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_identifier sp1_ident,CLASS_CHECKER1_semchecker1_argument sp1_arguments,int sp1_noofexpargs,int sp1_noofactargs) {
        super(staticLink,sp_pred,sp_ch,sp1_ident,sp1_arguments,sp1_noofexpargs,sp1_noofactargs);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_argumented _STM() {
        CLASS_CHECKER1_semchecker1_argumented _THIS=(CLASS_CHECKER1_semchecker1_argumented)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 44 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 46 <== SourceLine 1778
                // BEGIN pre_argumented INNER PART
                // JavaLine 48 <== SourceLine 1813
                type=p1_ident.type;
                ;
                qual=p1_ident.qual;
                ;
                meaning=p1_ident.meaning;
                ;
                // JavaLine 55 <== SourceLine 1814
                ctype=((char)129);
                ;
                // JavaLine 58 <== SourceLine 1815
                if(_VALUE((p_ch==(']')))) {
                    // JavaLine 60 <== SourceLine 1816
                    {
                        // JavaLine 62 <== SourceLine 1818
                        if(_VALUE((p1_ident.kind!=(((char)5))))) {
                            {
                                if(_VALUE((p1_ident.kind!=(((char)10))))) {
                                    // JavaLine 66 <== SourceLine 1819
                                    {
                                        // JavaLine 68 <== SourceLine 1820
                                        new CLASS_CHECKER1_semchecker1_identifier_identError(p1_ident,333);
                                        ;
                                        // JavaLine 71 <== SourceLine 1821
                                        meaning=p1_ident.meaning=null;
                                        ;
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 79 <== SourceLine 1823
                        p1_ident.p_ch='\\';
                        ;
                    }
                } else {
                    // JavaLine 84 <== SourceLine 1827
                    if(_VALUE(RTS_UTIL._IS(meaning,CLASS_COMMON_extquantity.class))) {
                        // JavaLine 86 <== SourceLine 1829
                        {
                            // BEGIN INSPECTION 
                            _inspect_1829_4581=((CLASS_COMMON_extquantity)(meaning));
                            if(_inspect_1829_4581!=null) { // INSPECT _inspect_1829_4581  type=ref(EXTQUANTITY)
                                // JavaLine 91 <== SourceLine 1830
                                {
                                    // JavaLine 93 <== SourceLine 1829
                                    {
                                        // JavaLine 95 <== SourceLine 1839
                                        if(_VALUE((_inspect_1829_4581.longindic_2!=(((char)0))))) {
                                            {
                                                // JavaLine 98 <== SourceLine 1840
                                                i_2=RTS_ENVIRONMENT.rank(_inspect_1829_4581.longindic_2);
                                                ;
                                                p_2=((CLASS_CHECKER1_semchecker1_parameter)(p1_arguments));
                                                ;
                                                q_2=((CLASS_COMMON_extquantity)(((CLASS_COMMON_quantity)_inspect_1829_4581)));
                                                ;
                                                // JavaLine 105 <== SourceLine 1841
                                                searched_2=p_2.p_actual.type;
                                                ;
                                                symx_2=_inspect_1829_4581.symb_1;
                                                ;
                                                // JavaLine 110 <== SourceLine 1842
                                                if(_VALUE((searched_2==(((char)3))))) {
                                                    searched_2=((char)4);
                                                }
                                                ;
                                                // JavaLine 115 <== SourceLine 1843
                                                if(_VALUE((i_2>(20)))) {
                                                    {
                                                        i_2=(i_2-(20));
                                                        ;
                                                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_Block1845_Block1847_SEARCH2_0); // GOTO EVALUATED LABEL
                                                    }
                                                } else {
                                                    // JavaLine 123 <== SourceLine 1844
                                                    if(_VALUE((i_2>(10)))) {
                                                        {
                                                            // JavaLine 126 <== SourceLine 1845
                                                            i_2=(i_2-(10));
                                                            ;
                                                            // JavaLine 129 <== SourceLine 1846
                                                            if(_VALUE((p_2.nextarg.p_actual.type>(searched_2)))) {
                                                                {
                                                                    // JavaLine 132 <== SourceLine 1847
                                                                    {
                                                                        _SIM_LABEL(1); // DeclaredIn: argumented -> argumented[CLASS_CHECKER1_semchecker1_argumented] DeclarationKind=Class
                                                                        searched_2=p_2.nextarg.p_actual.type;
                                                                    }
                                                                    ;
                                                                    // JavaLine 138 <== SourceLine 1848
                                                                    if(_VALUE((searched_2==(((char)3))))) {
                                                                        searched_2=((char)4);
                                                                    }
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 146 <== SourceLine 1850
                                                            while((i_2>=(0))) {
                                                                {
                                                                    // JavaLine 149 <== SourceLine 1851
                                                                    if(_VALUE((((CLASS_COMMON_quantity)(q_2.descr_1.fpar.next)).type_1>=(searched_2)))) {
                                                                        // JavaLine 151 <== SourceLine 1852
                                                                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_Block1857_Block1858_Block1860_OL_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                    ;
                                                                    // JavaLine 155 <== SourceLine 1853
                                                                    q_2=((CLASS_COMMON_extquantity)(q_2.next));
                                                                    ;
                                                                    i_2=(i_2-(1));
                                                                    ;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        // JavaLine 164 <== SourceLine 1856
                                                        if(_VALUE((i_2>(0)))) {
                                                            {
                                                                // JavaLine 167 <== SourceLine 1857
                                                                while((i_2>=(0))) {
                                                                    {
                                                                        // JavaLine 170 <== SourceLine 1858
                                                                        if(_VALUE((q_2.descr_1.fpar.type_1>=(searched_2)))) {
                                                                            // JavaLine 172 <== SourceLine 1859
                                                                            {
                                                                                // JavaLine 174 <== SourceLine 1860
                                                                                {
                                                                                    _SIM_LABEL(2); // DeclaredIn: argumented -> argumented[CLASS_CHECKER1_semchecker1_argumented] DeclarationKind=Class
                                                                                    ((CLASS_CHECKER1_semchecker1_argumented)(_CUR)).p1_ident.meaning=q_2;
                                                                                }
                                                                                ;
                                                                                // JavaLine 180 <== SourceLine 1861
                                                                                ((CLASS_CHECKER1_semchecker1_argumented)(_CUR)).p1_ident.type=((CLASS_CHECKER1_semchecker1_exp)(_CUR)).type=q_2.type_1;
                                                                                ;
                                                                                // JavaLine 183 <== SourceLine 1863
                                                                                q_2.symb_1=symx_2;
                                                                                ;
                                                                                // JavaLine 186 <== SourceLine 1864
                                                                                q_2=((CLASS_COMMON_extquantity)(q_2.descr_1.fpar));
                                                                                ;
                                                                                // JavaLine 189 <== SourceLine 1865
                                                                                while(((q_2!=(null))&&((p_2!=(null))))) {
                                                                                    {
                                                                                        // JavaLine 192 <== SourceLine 1866
                                                                                        p_2.p1_formal=q_2;
                                                                                        ;
                                                                                        q_2=((CLASS_COMMON_extquantity)(q_2.next));
                                                                                        ;
                                                                                        p_2=((CLASS_CHECKER1_semchecker1_parameter)(p_2.nextarg));
                                                                                        ;
                                                                                    }
                                                                                }
                                                                                ;
                                                                                // JavaLine 202 <== SourceLine 1868
                                                                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_argumented_Block1839_Block1840_TYPCHK_0); // GOTO EVALUATED LABEL
                                                                                ;
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 208 <== SourceLine 1870
                                                                        if(_VALUE((q_2.clf_2==(((char)5))))) {
                                                                            q_2=((CLASS_COMMON_extquantity)(q_2.next));
                                                                        }
                                                                        ;
                                                                        // JavaLine 213 <== SourceLine 1872
                                                                        q_2=((CLASS_COMMON_extquantity)(q_2.next));
                                                                        ;
                                                                        i_2=(i_2-(1));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                            }
                                                        }
                                                    }
                                                }
                                                ;
                                                // JavaLine 226 <== SourceLine 1877
                                                {
                                                    _SIM_LABEL(3); // DeclaredIn: argumented -> argumented[CLASS_CHECKER1_semchecker1_argumented] DeclarationKind=Class
                                                    p_2=((CLASS_CHECKER1_semchecker1_parameter)(p1_arguments));
                                                }
                                                ;
                                                // JavaLine 232 <== SourceLine 1878
                                                while((p_2!=(null))) {
                                                    {
                                                        // JavaLine 235 <== SourceLine 1879
                                                        ftype_2=p_2.p1_formal.type_1;
                                                        ;
                                                        // JavaLine 238 <== SourceLine 1880
                                                        if(_VALUE((ftype_2!=(p_2.p_actual.type)))) {
                                                            {
                                                                // JavaLine 241 <== SourceLine 1882
                                                                if(p_2.p_actual.type<((char)0) || p_2.p_actual.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                switch(p_2.p_actual.type) { // BEGIN SWITCH STATEMENT
                                                                    case 2: 
                                                                    case 3: 
                                                                    case 4: 
                                                                    case 5: 
                                                                    case 6: 
                                                                    // JavaLine 249 <== SourceLine 1885
                                                                    if(ftype_2<((char)0) || ftype_2>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                    switch(ftype_2) { // BEGIN SWITCH STATEMENT
                                                                        case 1: 
                                                                        case 7: 
                                                                        case 9: 
                                                                        case 8: 
                                                                        case 14: 
                                                                        // JavaLine 257 <== SourceLine 1888
                                                                        new CLASS_CHECKER1_semchecker1_argument_errARG(p_2,426);
                                                                        break;
                                                                    } // END SWITCH STATEMENT
                                                                    break;
                                                                    case 15: 
                                                                    ;
                                                                    break;
                                                                    default:
                                                                    // JavaLine 266 <== SourceLine 1892
                                                                    if(_VALUE((ftype_2<(((char)14))))) {
                                                                        new CLASS_CHECKER1_semchecker1_argument_errARG(p_2,426);
                                                                    }
                                                                    break;
                                                                } // END SWITCH STATEMENT
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 276 <== SourceLine 1895
                                                        p_2=((CLASS_CHECKER1_semchecker1_parameter)(p_2.nextarg));
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 285 <== SourceLine 1924
                                        if(_VALUE(RTS_UTIL._IS(p1_arguments,CLASS_CHECKER1_semchecker1_parameter.class))) {
                                            {
                                                // JavaLine 288 <== SourceLine 1925
                                                if(_VALUE(((_inspect_1829_4581.clf_2==(((char)10)))|((_inspect_1829_4581.clf_2==(((char)7))))))) {
                                                    {
                                                        // JavaLine 291 <== SourceLine 1926
                                                        p_2=((CLASS_CHECKER1_semchecker1_parameter)(p1_arguments));
                                                        ;
                                                        // JavaLine 294 <== SourceLine 1927
                                                        while((p_2!=(null))) {
                                                            {
                                                                // JavaLine 297 <== SourceLine 1928
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_1928_4582=p_2.p1_formal;
                                                                    if(_inspect_1928_4582!=null) { // INSPECT _inspect_1928_4582  type=ref(QUANTITY)
                                                                        // JavaLine 302 <== SourceLine 1929
                                                                        {
                                                                            // JavaLine 304 <== SourceLine 1928
                                                                            {
                                                                                // JavaLine 306 <== SourceLine 1929
                                                                                if(_VALUE((_inspect_1928_4582.categ_1==(((char)2))))) {
                                                                                    {
                                                                                        // JavaLine 309 <== SourceLine 1930
                                                                                        if(_VALUE((p_2.p_actual.ctype!=('Z')))) {
                                                                                            new CLASS_CHECKER1_semchecker1_argument_errARG(p_2,433);
                                                                                        }
                                                                                        ;
                                                                                        // JavaLine 314 <== SourceLine 1931
                                                                                        if(_VALUE((p_2.p_actual.type!=(_inspect_1928_4582.type_1)))) {
                                                                                            new CLASS_CHECKER1_semchecker1_argument_errARG(p_2,434);
                                                                                        }
                                                                                        ;
                                                                                    }
                                                                                }
                                                                                ;
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                                ;
                                                                // JavaLine 327 <== SourceLine 1934
                                                                p_2=((CLASS_CHECKER1_semchecker1_parameter)(p_2.nextarg));
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                    }
                }
                ;
                // JavaLine 345 <== SourceLine 1940
                if(_VALUE((p1_noofexpargs!=(p1_noofactargs)))) {
                    {
                        // JavaLine 348 <== SourceLine 1941
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).etxt1_2=new CLASS_ERRMSG_qlin((_CUR._SL._SL),p1_ident.meaning)._RESULT;
                        ;
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).etxt2_2=new CLASS_COMMON_leftint((_CUR._SL._SL),p1_noofexpargs)._RESULT;
                        ;
                        // JavaLine 353 <== SourceLine 1942
                        new CLASS_ERRMSG_error2((_CUR._SL._SL),(((p1_noofactargs>(p1_noofexpargs)))?(407):(408)),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).etxt1_2,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).etxt2_2);
                        ;
                    }
                }
                ;
                // JavaLine 359 <== SourceLine 1946
                // BEGIN argumented INNER PART
                // ENDOF argumented INNER PART
                // ENDOF pre_argumented INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 argumented",1,1780,10,1847,12,1860,14,1877,17,1782,22,1783,26,1829,28,1928,44,169,46,1778,48,1813,55,1814,58,1815,60,1816,62,1818,66,1819,68,1820,71,1821,79,1823,84,1827,86,1829,91,1830,93,1829,95,1839,98,1840,105,1841,110,1842,115,1843,123,1844,126,1845,129,1846,132,1847,138,1848,146,1850,149,1851,151,1852,155,1853,164,1856,167,1857,170,1858,172,1859,174,1860,180,1861,183,1863,186,1864,189,1865,192,1866,202,1868,208,1870,213,1872,226,1877,232,1878,235,1879,238,1880,241,1882,249,1885,257,1888,266,1892,276,1895,285,1924,288,1925,291,1926,294,1927,297,1928,302,1929,304,1928,306,1929,309,1930,314,1931,327,1934,345,1940,348,1941,353,1942,359,1946,373,1946);
} // End of Class
