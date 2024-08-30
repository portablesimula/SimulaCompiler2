// JavaLine 1 <== SourceLine 1800
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_casestat extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1800, lastLine=1906, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1828
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1830
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1846
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_Block1843_Block1845_NXTL_0=new RTS_LABEL(this,1,3,"NXTL"); // Local Label #3=NXTL At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1861
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1881
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_S2_1=new RTS_LABEL(this,1,5,"S2"); // Local Label #5=S2 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1890
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_casestat_S3_1=new RTS_LABEL(this,1,6,"S3"); // Local Label #6=S3 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 1802
    public boolean nocolon_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_casestat_recover.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_casestat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_casestat _STM() {
        CLASS_PARSER_grammer_casestat _THIS=(CLASS_PARSER_grammer_casestat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 40 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 42 <== SourceLine 1826
                detach(1826);
                ;
                // JavaLine 45 <== SourceLine 1827
                {
                    _SIM_LABEL(1); // DeclaredIn: casestat
                    // JavaLine 48 <== SourceLine 1828
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("case"));
                    }
                }
                ;
                // JavaLine 54 <== SourceLine 1830
                {
                    _SIM_LABEL(2); // DeclaredIn: casestat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 60 <== SourceLine 1831
                new CLASS_PARSER_grammer_casestat_L2output((_CUR),((char)0));
                ;
                // JavaLine 63 <== SourceLine 1832
                errorno=new CLASS_PARSER_grammer_notBoundPair((_CUR._SL),((char)137))._RESULT;
                ;
                if(_VALUE((errorno!=(0)))) {
                    _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 70 <== SourceLine 1833
                new CLASS_PARSER_grammer_casestat_L2output((_CUR),((char)148));
                ;
                // JavaLine 73 <== SourceLine 1834
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                    new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),285);
                } else {
                    // JavaLine 77 <== SourceLine 1835
                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 81 <== SourceLine 1836
                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1836);
                ;
                // JavaLine 84 <== SourceLine 1837
                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 87 <== SourceLine 1838
                        errorno=1;
                        ;
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),230);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 96 <== SourceLine 1839
                new CLASS_PARSER_grammer_casestat_L2output((_CUR),'l');
                ;
                // JavaLine 99 <== SourceLine 1840
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)32))))) {
                    new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),435);
                } else {
                    // JavaLine 103 <== SourceLine 1841
                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 107 <== SourceLine 1842
                while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('7'))) {
                    {
                        // JavaLine 110 <== SourceLine 1843
                        ((CLASS_PARSER_grammer)(_CUR._SL)).cs='N';
                        ;
                        // JavaLine 113 <== SourceLine 1844
                        while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N'))) {
                            {
                                // JavaLine 116 <== SourceLine 1845
                                new CLASS_PARSER_grammer_casestat_L2output((_CUR),((char)11));
                                ;
                                nocolon_1=true;
                                ;
                                // JavaLine 121 <== SourceLine 1846
                                {
                                    _SIM_LABEL(3); // DeclaredIn: casestat -> casestat[CLASS_PARSER_grammer_casestat] DeclarationKind=Class
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                }
                                ;
                                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1846);
                                ;
                                // JavaLine 129 <== SourceLine 1847
                                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                    {
                                        // JavaLine 132 <== SourceLine 1848
                                        errorno=2;
                                        ;
                                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),231);
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 141 <== SourceLine 1849
                                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('M'))&&(nocolon_1)))) {
                                    {
                                        // JavaLine 144 <== SourceLine 1850
                                        new CLASS_PARSER_grammer_casestat_L2output((_CUR),'_');
                                        ;
                                        nocolon_1=false;
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_Block1845_NXTL_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 153 <== SourceLine 1851
                                new CLASS_PARSER_grammer_casestat_L2output((_CUR),'k');
                                ;
                            }
                        }
                        ;
                        // JavaLine 159 <== SourceLine 1853
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))) {
                            new CLASS_PARSER_grammer_ParsErr((_CUR._SL),206);
                        } else {
                            // JavaLine 163 <== SourceLine 1854
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                        }
                        ;
                        // JavaLine 167 <== SourceLine 1855
                        stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)1);
                        ;
                        // JavaLine 172 <== SourceLine 1857
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='Y';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1857);
                        ;
                        // JavaLine 177 <== SourceLine 1861
                        {
                            _SIM_LABEL(4); // DeclaredIn: casestat -> casestat[CLASS_PARSER_grammer_casestat] DeclarationKind=Class
                            detach(1861);
                        }
                        ;
                        // JavaLine 183 <== SourceLine 1863
                        if(_VALUE((rp!=(((char)1))))) {
                            {
                                // JavaLine 186 <== SourceLine 1864
                                if(_VALUE((rp==(((char)0))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_S0_1); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 191 <== SourceLine 1865
                                if(_VALUE((rp==(((char)3))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_S3_1); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 199 <== SourceLine 1868
                        new CLASS_PARSER_grammer_casestat_L2output((_CUR),'/');
                        ;
                        // JavaLine 202 <== SourceLine 1869
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                            {
                                // JavaLine 205 <== SourceLine 1870
                                errorno=3;
                                ;
                                new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),286);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 214 <== SourceLine 1871
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 217 <== SourceLine 1872
                        if(_VALUE((rp==(((char)2))))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_S2_1); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 225 <== SourceLine 1874
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)147))))) {
                    {
                        // JavaLine 228 <== SourceLine 1875
                        new CLASS_PARSER_grammer_casestat_L2output((_CUR),'@');
                        ;
                        // JavaLine 231 <== SourceLine 1876
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 234 <== SourceLine 1877
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))) {
                            new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),206);
                        } else {
                            // JavaLine 238 <== SourceLine 1878
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                        }
                        ;
                        // JavaLine 242 <== SourceLine 1879
                        stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)2);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 252 <== SourceLine 1881
                {
                    _SIM_LABEL(5); // DeclaredIn: casestat
                    while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('O'))) {
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                    }
                }
                ;
                // JavaLine 260 <== SourceLine 1883
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                    new CLASS_PARSER_grammer_ParsErr((_CUR._SL),436);
                } else {
                    // JavaLine 264 <== SourceLine 1884
                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                }
                ;
                // JavaLine 268 <== SourceLine 1885
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('%')))) {
                    {
                        // JavaLine 271 <== SourceLine 1886
                        new CLASS_PARSER_grammer_casestat_L2output((_CUR),((char)10));
                        ;
                        // JavaLine 274 <== SourceLine 1887
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                        ;
                        // JavaLine 277 <== SourceLine 1888
                        stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                        ;
                        rp=((char)3);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_casestat_Block1843_PARSE_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 287 <== SourceLine 1890
                {
                    _SIM_LABEL(6); // DeclaredIn: casestat
                    new CLASS_PARSER_grammer_casestat_L2output((_CUR),'x');
                }
                ;
                // JavaLine 293 <== SourceLine 1891
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack case"));
                }
                ;
                // JavaLine 298 <== SourceLine 1893
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 303 <== SourceLine 1896
                detach(1896);
                ;
                // JavaLine 306 <== SourceLine 1906
                // BEGIN casestat INNER PART
                // ENDOF casestat INNER PART
                // ENDOF statement INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 casestat",1,1800,11,1828,13,1830,15,1846,17,1861,19,1881,21,1890,24,1802,40,712,42,1826,45,1827,48,1828,54,1830,60,1831,63,1832,70,1833,73,1834,77,1835,81,1836,84,1837,87,1838,96,1839,99,1840,103,1841,107,1842,110,1843,113,1844,116,1845,121,1846,129,1847,132,1848,141,1849,144,1850,153,1851,159,1853,163,1854,167,1855,172,1857,177,1861,183,1863,186,1864,191,1865,199,1868,202,1869,205,1870,214,1871,217,1872,225,1874,228,1875,231,1876,234,1877,238,1878,242,1879,252,1881,260,1883,264,1884,268,1885,271,1886,274,1887,277,1888,287,1890,293,1891,298,1893,303,1896,306,1906,319,1906);
} // End of Class
