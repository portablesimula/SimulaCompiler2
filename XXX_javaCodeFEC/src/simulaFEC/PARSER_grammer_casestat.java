// JavaLine 1 <== SourceLine 1799
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_casestat extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1799, lastLine=1905, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1827
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1829
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1845
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_Block1842_Block1844_NXTL_0=new RTS_LABEL(this,1,3,"NXTL"); // Local Label #3=NXTL At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1860
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_Block1842_PARSE_0=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1880
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_S2_1=new RTS_LABEL(this,1,5,"S2"); // Local Label #5=S2 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1889
    final RTS_LABEL _LABEL_PARSER_grammer_casestat_S3_1=new RTS_LABEL(this,1,6,"S3"); // Local Label #6=S3 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 1801
    public boolean nocolon_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_casestat_recover.class)); }
    // Normal Constructor
    public PARSER_grammer_casestat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_casestat _STM() {
        PARSER_grammer_casestat _THIS=(PARSER_grammer_casestat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 40 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 42 <== SourceLine 1825
                detach(1825);
                ;
                // JavaLine 45 <== SourceLine 1826
                {
                    _SIM_LABEL(1); // DeclaredIn: casestat
                    // JavaLine 48 <== SourceLine 1827
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("case"));
                    }
                }
                ;
                // JavaLine 54 <== SourceLine 1829
                {
                    _SIM_LABEL(2); // DeclaredIn: casestat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 60 <== SourceLine 1830
                new PARSER_grammer_casestat_L2output((_CUR),((char)0));
                ;
                // JavaLine 63 <== SourceLine 1831
                errorno=new PARSER_grammer_notBoundPair((_CUR._SL),((char)137))._RESULT;
                ;
                if(_VALUE((errorno!=(0)))) {
                    _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 70 <== SourceLine 1832
                new PARSER_grammer_casestat_L2output((_CUR),((char)148));
                ;
                // JavaLine 73 <== SourceLine 1833
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                    new PARSER_grammer_ParsWarn((_CUR._SL),285);
                } else {
                    // JavaLine 77 <== SourceLine 1834
                    ((PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 81 <== SourceLine 1835
                call(((PARSER_grammer)(_CUR._SL)).ex_1,1835);
                ;
                // JavaLine 84 <== SourceLine 1836
                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 87 <== SourceLine 1837
                        errorno=1;
                        ;
                        new PARSER_grammer_syntaxerror((_CUR._SL),230);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 96 <== SourceLine 1838
                new PARSER_grammer_casestat_L2output((_CUR),'l');
                ;
                // JavaLine 99 <== SourceLine 1839
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)32))))) {
                    new PARSER_grammer_ParsWarn((_CUR._SL),435);
                } else {
                    // JavaLine 103 <== SourceLine 1840
                    ((PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 107 <== SourceLine 1841
                while((((PARSER_grammer)(_CUR._SL)).cs==('7'))) {
                    {
                        // JavaLine 110 <== SourceLine 1842
                        ((PARSER_grammer)(_CUR._SL)).cs='N';
                        ;
                        // JavaLine 113 <== SourceLine 1843
                        while((((PARSER_grammer)(_CUR._SL)).cs==('N'))) {
                            {
                                // JavaLine 116 <== SourceLine 1844
                                new PARSER_grammer_casestat_L2output((_CUR),((char)11));
                                ;
                                nocolon_1=true;
                                ;
                                // JavaLine 121 <== SourceLine 1845
                                {
                                    _SIM_LABEL(3); // DeclaredIn: casestat -> casestat[PARSER_grammer_casestat] DeclarationKind=Class
                                    ((PARSER_grammer)(_CUR._SL)).detach();
                                }
                                ;
                                call(((PARSER_grammer)(_CUR._SL)).ex_1,1845);
                                ;
                                // JavaLine 129 <== SourceLine 1846
                                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                    {
                                        // JavaLine 132 <== SourceLine 1847
                                        errorno=2;
                                        ;
                                        new PARSER_grammer_syntaxerror((_CUR._SL),231);
                                        ;
                                        _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 141 <== SourceLine 1848
                                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==('M'))&&(nocolon_1)))) {
                                    {
                                        // JavaLine 144 <== SourceLine 1849
                                        new PARSER_grammer_casestat_L2output((_CUR),'_');
                                        ;
                                        nocolon_1=false;
                                        ;
                                        _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_Block1844_NXTL_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 153 <== SourceLine 1850
                                new PARSER_grammer_casestat_L2output((_CUR),'k');
                                ;
                            }
                        }
                        ;
                        // JavaLine 159 <== SourceLine 1852
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))) {
                            new PARSER_grammer_ParsErr((_CUR._SL),206);
                        } else {
                            // JavaLine 163 <== SourceLine 1853
                            ((PARSER_grammer)(_CUR._SL)).detach();
                        }
                        ;
                        // JavaLine 167 <== SourceLine 1854
                        stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)1);
                        ;
                        // JavaLine 172 <== SourceLine 1856
                        ((PARSER)(_CUR._SL._SL)).opn='Y';
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,1856);
                        ;
                        // JavaLine 177 <== SourceLine 1860
                        {
                            _SIM_LABEL(4); // DeclaredIn: casestat -> casestat[PARSER_grammer_casestat] DeclarationKind=Class
                            detach(1860);
                        }
                        ;
                        // JavaLine 183 <== SourceLine 1862
                        if(_VALUE((rp!=(((char)1))))) {
                            {
                                // JavaLine 186 <== SourceLine 1863
                                if(_VALUE((rp==(((char)0))))) {
                                    _GOTO(_LABEL_PARSER_grammer_casestat_S0_1); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 191 <== SourceLine 1864
                                if(_VALUE((rp==(((char)3))))) {
                                    _GOTO(_LABEL_PARSER_grammer_casestat_S3_1); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 199 <== SourceLine 1867
                        new PARSER_grammer_casestat_L2output((_CUR),'/');
                        ;
                        // JavaLine 202 <== SourceLine 1868
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                            {
                                // JavaLine 205 <== SourceLine 1869
                                errorno=3;
                                ;
                                new PARSER_grammer_syntaxerror((_CUR._SL),286);
                                ;
                                _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 214 <== SourceLine 1870
                        ((PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 217 <== SourceLine 1871
                        if(_VALUE((rp==(((char)2))))) {
                            _GOTO(_LABEL_PARSER_grammer_casestat_S2_1); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 225 <== SourceLine 1873
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)147))))) {
                    {
                        // JavaLine 228 <== SourceLine 1874
                        new PARSER_grammer_casestat_L2output((_CUR),'@');
                        ;
                        // JavaLine 231 <== SourceLine 1875
                        ((PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 234 <== SourceLine 1876
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))) {
                            new PARSER_grammer_ParsWarn((_CUR._SL),206);
                        } else {
                            // JavaLine 238 <== SourceLine 1877
                            ((PARSER_grammer)(_CUR._SL)).detach();
                        }
                        ;
                        // JavaLine 242 <== SourceLine 1878
                        stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)2);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 252 <== SourceLine 1880
                {
                    _SIM_LABEL(5); // DeclaredIn: casestat
                    while((((PARSER_grammer)(_CUR._SL)).cs==('O'))) {
                        ((PARSER_grammer)(_CUR._SL)).detach();
                    }
                }
                ;
                // JavaLine 260 <== SourceLine 1882
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                    new PARSER_grammer_ParsErr((_CUR._SL),436);
                } else {
                    // JavaLine 264 <== SourceLine 1883
                    ((PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 268 <== SourceLine 1884
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('%')))) {
                    {
                        // JavaLine 271 <== SourceLine 1885
                        new PARSER_grammer_casestat_L2output((_CUR),((char)10));
                        ;
                        // JavaLine 274 <== SourceLine 1886
                        ((PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 277 <== SourceLine 1887
                        stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)3);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_casestat_Block1842_PARSE_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 287 <== SourceLine 1889
                {
                    _SIM_LABEL(6); // DeclaredIn: casestat
                    new PARSER_grammer_casestat_L2output((_CUR),'x');
                }
                ;
                // JavaLine 293 <== SourceLine 1890
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack case"));
                }
                ;
                // JavaLine 298 <== SourceLine 1892
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 303 <== SourceLine 1895
                detach(1895);
                ;
                // JavaLine 306 <== SourceLine 1905
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 casestat",1,1799,11,1827,13,1829,15,1845,17,1860,19,1880,21,1889,24,1801,40,711,42,1825,45,1826,48,1827,54,1829,60,1830,63,1831,70,1832,73,1833,77,1834,81,1835,84,1836,87,1837,96,1838,99,1839,103,1840,107,1841,110,1842,113,1843,116,1844,121,1845,129,1846,132,1847,141,1848,144,1849,153,1850,159,1852,163,1853,167,1854,172,1856,177,1860,183,1862,186,1863,191,1864,199,1867,202,1868,205,1869,214,1870,217,1871,225,1873,228,1874,231,1875,234,1876,238,1877,242,1878,252,1880,260,1882,264,1883,268,1884,271,1885,274,1886,277,1887,287,1889,293,1890,298,1892,303,1895,306,1905,319,1905);
} // End of Class
