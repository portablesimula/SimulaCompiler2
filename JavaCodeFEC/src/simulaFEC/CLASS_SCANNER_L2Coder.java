// JavaLine 1 <== SourceLine 1558
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCANNER_L2Coder extends CLASS_COMMON_outcodefile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=4, firstLine=1558, lastLine=2382, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1745
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0=new RTS_LABEL(this,4,1,"NEXTOPN"); // Local Label #1=NEXTOPN At PrefixLevel 4
    // JavaLine 13 <== SourceLine 1755
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_CheckNxt_0=new RTS_LABEL(this,4,2,"CheckNxt"); // Local Label #2=CheckNxt At PrefixLevel 4
    // JavaLine 15 <== SourceLine 1790
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0=new RTS_LABEL(this,4,3,"OPNOUT"); // Local Label #3=OPNOUT At PrefixLevel 4
    // JavaLine 17 <== SourceLine 1798
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0=new RTS_LABEL(this,4,4,"OPDOUT"); // Local Label #4=OPDOUT At PrefixLevel 4
    // JavaLine 19 <== SourceLine 1851
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1844_Block1850_SINGLE_0=new RTS_LABEL(this,4,5,"SINGLE"); // Local Label #5=SINGLE At PrefixLevel 4
    // JavaLine 21 <== SourceLine 1872
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1870_SetQual_0=new RTS_LABEL(this,4,6,"SetQual"); // Local Label #6=SetQual At PrefixLevel 4
    // JavaLine 23 <== SourceLine 1900
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0=new RTS_LABEL(this,4,7,"BLOCKOUT"); // Local Label #7=BLOCKOUT At PrefixLevel 4
    // JavaLine 25 <== SourceLine 1939
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0=new RTS_LABEL(this,4,8,"NXTVIRT"); // Local Label #8=NXTVIRT At PrefixLevel 4
    // JavaLine 27 <== SourceLine 1942
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_EXvloop_0=new RTS_LABEL(this,4,9,"EXvloop"); // Local Label #9=EXvloop At PrefixLevel 4
    // JavaLine 29 <== SourceLine 1950
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_L1_0=new RTS_LABEL(this,4,10,"L1"); // Local Label #10=L1 At PrefixLevel 4
    // JavaLine 31 <== SourceLine 1983
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_FOUND_0=new RTS_LABEL(this,4,11,"FOUND"); // Local Label #11=FOUND At PrefixLevel 4
    // JavaLine 33 <== SourceLine 2002
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2002_btout_0=new RTS_LABEL(this,4,12,"btout"); // Local Label #12=btout At PrefixLevel 4
    // JavaLine 35 <== SourceLine 2025
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2014_Qfound_0=new RTS_LABEL(this,4,13,"Qfound"); // Local Label #13=Qfound At PrefixLevel 4
    // JavaLine 37 <== SourceLine 2038
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2037_genlab_0=new RTS_LABEL(this,4,14,"genlab"); // Local Label #14=genlab At PrefixLevel 4
    // JavaLine 39 <== SourceLine 2115
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2115_lidclp_0=new RTS_LABEL(this,4,15,"lidclp"); // Local Label #15=lidclp At PrefixLevel 4
    // JavaLine 41 <== SourceLine 2117
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2115_genbrc_0=new RTS_LABEL(this,4,16,"genbrc"); // Local Label #16=genbrc At PrefixLevel 4
    // JavaLine 43 <== SourceLine 2211
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0=new RTS_LABEL(this,4,17,"Nspec"); // Local Label #17=Nspec At PrefixLevel 4
    // JavaLine 45 <== SourceLine 2235
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2235_LIFWHN_0=new RTS_LABEL(this,4,18,"LIFWHN"); // Local Label #18=LIFWHN At PrefixLevel 4
    // JavaLine 47 <== SourceLine 2254
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0=new RTS_LABEL(this,4,19,"QBLOCKOUT"); // Local Label #19=QBLOCKOUT At PrefixLevel 4
    // JavaLine 49 <== SourceLine 2332
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_LIHIDD_0=new RTS_LABEL(this,4,20,"LIHIDD"); // Local Label #20=LIHIDD At PrefixLevel 4
    // JavaLine 51 <== SourceLine 2368
    final RTS_LABEL _LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2348_NonLoc_0=new RTS_LABEL(this,4,21,"NonLoc"); // Local Label #21=NonLoc At PrefixLevel 4
    // Declare locals as attributes
    // JavaLine 54 <== SourceLine 1566
    public boolean notok_4=false;
    public boolean locals_4=false;
    // JavaLine 57 <== SourceLine 1567
    public char ctype_4=0;
    public char ckind_4=0;
    // JavaLine 60 <== SourceLine 1568
    public char iihi_4=0;
    public char iilo_4=0;
    // JavaLine 63 <== SourceLine 1569
    public char lanhi_4=0;
    public char lanlo_4=0;
    // JavaLine 66 <== SourceLine 1570
    public int L2p_4=0;
    // JavaLine 68 <== SourceLine 1571
    public final int L2max_4=(int)(256);
    // JavaLine 70 <== SourceLine 1573
    public final int L2limit_4;
    // JavaLine 72 <== SourceLine 1574
    public int cqual_4=0;
    // JavaLine 74 <== SourceLine 1575
    public int cswa_4=0;
    public int cswb_4=0;
    // JavaLine 77 <== SourceLine 1576
    public int dimcount_4=0;
    // JavaLine 79 <== SourceLine 1577
    public int iii_4=0;
    public int jjj_4=0;
    public int lastlinenr_4=0;
    // JavaLine 83 <== SourceLine 1578
    public CLASS_COMMON_symbolbox symx_4=null;
    // JavaLine 85 <== SourceLine 1579
    public CLASS_COMMON_quantity firstarr_4=null;
    // JavaLine 87 <== SourceLine 1580
    public CLASS_COMMON_idpack fvis_4=null;
    public CLASS_COMMON_idpack x_4=null;
    // JavaLine 90 <== SourceLine 1581
    public CLASS_COMMON_quantity pq_4=null;
    public CLASS_COMMON_quantity virq_4=null;
    // JavaLine 93 <== SourceLine 1582
    public CLASS_COMMON_brecord cbrec_4=null;
    public CLASS_COMMON_brecord xbrec_4=null;
    public CLASS_COMMON_brecord forbrec_4=null;
    // JavaLine 97 <== SourceLine 1583
    public CLASS_COMMON_quantity cquant_4=null;
    public CLASS_COMMON_quantity vquant_4=null;
    public CLASS_COMMON_quantity xquant_4=null;
    // JavaLine 101 <== SourceLine 1587
    public CLASS_COMMON_quantity p_or_c_qt_4=null;
    // JavaLine 103 <== SourceLine 1596
    public CLASS_COMMON_idpack cvispack_4=null;
    public CLASS_COMMON_brecord lastBrec_4=null;
    public RTS_TXT L2buf_4=null;
    // JavaLine 107 <== SourceLine 1757
    public RTS_Printfile _inspect_1757_4482=null;
    // JavaLine 109 <== SourceLine 1907
    public CLASS_COMMON_brecord _inspect_1907_4483=null;
    // JavaLine 111 <== SourceLine 1909
    public CLASS_COMMON_quantity _inspect_1909_4484=null;
    // JavaLine 113 <== SourceLine 1930
    public CLASS_COMMON_idpack _inspect_1930_4485=null;
    // JavaLine 115 <== SourceLine 1978
    public CLASS_COMMON_idpack _inspect_1977_4486=null;
    // JavaLine 117 <== SourceLine 2078
    public CLASS_COMMON_symbolbox _inspect_2078_4487=null;
    // JavaLine 119 <== SourceLine 2092
    public CLASS_COMMON_quantity _inspect_2092_4488=null;
    // JavaLine 121 <== SourceLine 2130
    public CLASS_COMMON_quantity _inspect_2130_4489=null;
    // JavaLine 123 <== SourceLine 2170
    public CLASS_COMMON_quantity _inspect_2170_4490=null;
    // JavaLine 125 <== SourceLine 2189
    public CLASS_COMMON_idpack _inspect_2189_4491=null;
    // JavaLine 127 <== SourceLine 2270
    public RTS_Printfile _inspect_2270_4492=null;
    // JavaLine 129 <== SourceLine 2341
    public RTS_Printfile _inspect_2341_4493=null;
    // Normal Constructor
    public CLASS_SCANNER_L2Coder(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
        L2limit_4=(256-(7));
    }
    // Class Statements
    @Override
    public CLASS_SCANNER_L2Coder _STM() {
        CLASS_SCANNER_L2Coder _THIS=(CLASS_SCANNER_L2Coder)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,21); // For ByteCode Engineering
                // BEGIN File INNER PART
                // BEGIN Bytefile INNER PART
                // BEGIN Outbytefile INNER PART
                // JavaLine 148 <== SourceLine 868
                RTS_BASICIO.sysout().outtext(new RTS_TXT("COMMON: new outcodefile +++++++++++++++++++++++++++++++++++++++++++++++++"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 153 <== SourceLine 869
                // BEGIN outcodefile INNER PART
                // JavaLine 155 <== SourceLine 1738
                detach(1738);
                ;
                // JavaLine 158 <== SourceLine 1739
                ((CLASS_SCANNER)(_CUR._SL)).L2codebuffer=L2buf_4=RTS_ENVIRONMENT.blanks(256);
                ;
                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_CheckNxt_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 163 <== SourceLine 1742
                while(true) {
                    {
                        // JavaLine 166 <== SourceLine 1744
                        {
                            _SIM_LABEL(1); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                            // JavaLine 169 <== SourceLine 1745
                            if(_VALUE((lastlinenr_4<(((CLASS_SCANNER)(_CUR._SL)).linenr)))) {
                                {
                                    // JavaLine 172 <== SourceLine 1746
                                    if(_VALUE((L2p_4>((256-(4)))))) {
                                        new CLASS_SCANNER_L2Coder_outbuffer((_CUR));
                                    }
                                    ;
                                    // JavaLine 177 <== SourceLine 1747
                                    lastlinenr_4=((CLASS_SCANNER)(_CUR._SL)).linenr;
                                    ;
                                    new CLASS_SCANNER_L2Coder_storecharint((_CUR),((char)133),lastlinenr_4);
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 186 <== SourceLine 1751
                        detach(1751);
                        ;
                        // JavaLine 189 <== SourceLine 1754
                        {
                            _SIM_LABEL(2); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                            // JavaLine 192 <== SourceLine 1755
                            if(_VALUE((L2p_4>(L2limit_4)))) {
                                new CLASS_SCANNER_L2Coder_outbuffer((_CUR));
                            }
                        }
                        ;
                        // JavaLine 198 <== SourceLine 1757
                        if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_1757_4482=RTS_BASICIO.sysout();
                                if(_inspect_1757_4482!=null) { // INSPECT _inspect_1757_4482  type=ref(PRINTFILE)
                                    // JavaLine 204 <== SourceLine 1758
                                    {
                                        // JavaLine 206 <== SourceLine 1757
                                        {
                                            // JavaLine 208 <== SourceLine 1758
                                            if(_VALUE((_inspect_1757_4482.pos()>(1)))) {
                                                _inspect_1757_4482.outimage();
                                            }
                                            ;
                                            // JavaLine 213 <== SourceLine 1759
                                            _inspect_1757_4482.outtext(new RTS_TXT(" L2output: (l. "));
                                            ;
                                            _inspect_1757_4482.outint(((CLASS_SCANNER)(_CUR._SL)).linenr,5);
                                            ;
                                            _inspect_1757_4482.outchar(')');
                                            ;
                                            // JavaLine 220 <== SourceLine 1760
                                            _inspect_1757_4482.outtext(new RTS_TXT(" OPN="));
                                            ;
                                            _inspect_1757_4482.outtext(((CLASS_SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opn)));
                                            ;
                                            _inspect_1757_4482.setpos(32);
                                            ;
                                            // JavaLine 227 <== SourceLine 1761
                                            if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                                {
                                                    _inspect_1757_4482.outtext(CONC(CONC(new RTS_TXT("OPD="),((CLASS_SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).optx))),new RTS_TXT(" ")));
                                                    ;
                                                    // JavaLine 232 <== SourceLine 1763
                                                    if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).optx==(((char)2))))) {
                                                        {
                                                            // JavaLine 235 <== SourceLine 1764
                                                            if(_VALUE(((((CLASS_SCANNER)(_CUR._SL)).opdlo>(((char)32)))&((((CLASS_SCANNER)(_CUR._SL)).opdlo<(((char)127))))))) {
                                                                _inspect_1757_4482.outchar(((CLASS_SCANNER)(_CUR._SL)).opdlo);
                                                            } else {
                                                                // JavaLine 239 <== SourceLine 1765
                                                                {
                                                                    _inspect_1757_4482.outchar('!');
                                                                    ;
                                                                    _inspect_1757_4482.outint(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdlo),0);
                                                                    ;
                                                                    // JavaLine 245 <== SourceLine 1766
                                                                    _inspect_1757_4482.outchar('!');
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        // JavaLine 251 <== SourceLine 1767
                                                        _inspect_1757_4482.outtext(new CLASS_COMMON_nameof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT);
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 257 <== SourceLine 1768
                                                if(_VALUE(((((CLASS_SCANNER)(_CUR._SL)).opdlo!=(((char)0)))||((((CLASS_SCANNER)(_CUR._SL)).opdhi!=(((char)0))))))) {
                                                    {
                                                        // JavaLine 260 <== SourceLine 1769
                                                        _inspect_1757_4482.outtext(new RTS_TXT("OPD=("));
                                                        ;
                                                        _inspect_1757_4482.outint(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdhi),0);
                                                        ;
                                                        // JavaLine 265 <== SourceLine 1770
                                                        _inspect_1757_4482.outchar(',');
                                                        ;
                                                        _inspect_1757_4482.outint(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdlo),0);
                                                        ;
                                                        _inspect_1757_4482.outchar(')');
                                                        ;
                                                    }
                                                }
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                        // JavaLine 282 <== SourceLine 1777
                        if(((CLASS_SCANNER)(_CUR._SL)).opn<((char)0) || ((CLASS_SCANNER)(_CUR._SL)).opn>((char)148)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_SCANNER)(_CUR._SL)).opn) { // BEGIN SWITCH STATEMENT
                            case 102: 
                            case 111: 
                            case 80: 
                            case 81: 
                            case 23: 
                            case 49: 
                            case 15: 
                            case 116: 
                            case 70: 
                            case 71: 
                            case 73: 
                            case 72: 
                            case 75: 
                            case 74: 
                            case 58: 
                            case 61: 
                            case 62: 
                            case 60: 
                            case 59: 
                            case 57: 
                            case 45: 
                            case 17: 
                            case 24: 
                            case 36: 
                            case 68: 
                            case 69: 
                            case 146: 
                            case 35: 
                            case 96: 
                            case 130: 
                            case 27: 
                            case 145: 
                            case 128: 
                            case 119: 
                            case 131: 
                            case 82: 
                            case 83: 
                            case 66: 
                            case 67: 
                            case 28: 
                            case 125: 
                            case 52: 
                            case 100: 
                            case 78: 
                            case 98: 
                            case 104: 
                            case 122: 
                            case 135: 
                            case 84: 
                            case 85: 
                            case 86: 
                            case 79: 
                            // JavaLine 337 <== SourceLine 1789
                            {
                                // JavaLine 339 <== SourceLine 1790
                                {
                                    _SIM_LABEL(3); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opn,L2buf_4,L2p_4);
                                }
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 347 <== SourceLine 1791
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 142: 
                            case 139: 
                            case 90: 
                            case 129: 
                            case 76: 
                            case 115: 
                            case 34: 
                            case 134: 
                            case 46: 
                            case 25: 
                            case 29: 
                            case 41: 
                            case 50: 
                            case 118: 
                            // JavaLine 366 <== SourceLine 1797
                            {
                                // JavaLine 368 <== SourceLine 1798
                                {
                                    _SIM_LABEL(4); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opn,L2buf_4,L2p_4);
                                }
                                ;
                                // JavaLine 374 <== SourceLine 1799
                                RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdhi,L2buf_4,(L2p_4+(1)));
                                ;
                                // JavaLine 377 <== SourceLine 1800
                                RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(2)));
                                ;
                                // JavaLine 380 <== SourceLine 1801
                                L2p_4=(L2p_4+(3));
                                ;
                                ;
                                // JavaLine 384 <== SourceLine 1802
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 63: 
                            case 89: 
                            // JavaLine 391 <== SourceLine 1807
                            {
                                // JavaLine 393 <== SourceLine 1808
                                lastlinenr_4=((CLASS_SCANNER)(_CUR._SL)).linenr;
                                ;
                                new CLASS_SCANNER_L2Coder_storecharint((_CUR),((CLASS_SCANNER)(_CUR._SL)).opn,lastlinenr_4);
                                ;
                                // JavaLine 398 <== SourceLine 1809
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 14: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 3: 
                            case 1: 
                            case 2: 
                            case 8: 
                            // JavaLine 411 <== SourceLine 1813
                            {
                                // JavaLine 413 <== SourceLine 1815
                                ctype_4=((CLASS_SCANNER)(_CUR._SL)).opn;
                                ;
                                ckind_4=((char)0);
                                ;
                                // JavaLine 418 <== SourceLine 1816
                                cqual_4=0;
                                ;
                                // JavaLine 421 <== SourceLine 1817
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 13: 
                            // JavaLine 427 <== SourceLine 1819
                            {
                                // JavaLine 429 <== SourceLine 1820
                                ckind_4=((char)2);
                                ;
                                // JavaLine 432 <== SourceLine 1821
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 12: 
                            // JavaLine 438 <== SourceLine 1822
                            {
                                // JavaLine 440 <== SourceLine 1823
                                ckind_4=((char)1);
                                ;
                                // JavaLine 443 <== SourceLine 1824
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 30: 
                            // JavaLine 449 <== SourceLine 1826
                            {
                                // JavaLine 451 <== SourceLine 1827
                                ckind_4=((char)5);
                                ;
                                // JavaLine 454 <== SourceLine 1828
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 31: 
                            // JavaLine 460 <== SourceLine 1830
                            {
                                // JavaLine 462 <== SourceLine 1831
                                ckind_4=((char)7);
                                ;
                                // JavaLine 465 <== SourceLine 1832
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 138: 
                            case 91: 
                            // JavaLine 472 <== SourceLine 1842
                            {
                                // JavaLine 474 <== SourceLine 1844
                                RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).optx,L2buf_4,L2p_4);
                                ;
                                // JavaLine 477 <== SourceLine 1845
                                if(((CLASS_SCANNER)(_CUR._SL)).optx<((char)0) || ((CLASS_SCANNER)(_CUR._SL)).optx>((char)8)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CLASS_SCANNER)(_CUR._SL)).optx) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    case 2: 
                                    // JavaLine 482 <== SourceLine 1846
                                    {
                                        // JavaLine 484 <== SourceLine 1847
                                        RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(1)));
                                        ;
                                        L2p_4=(L2p_4+(2));
                                        ;
                                        // JavaLine 489 <== SourceLine 1848
                                        _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    case 3: 
                                    case 4: 
                                    case 5: 
                                    case 6: 
                                    case 8: 
                                    // JavaLine 498 <== SourceLine 1849
                                    {
                                        // JavaLine 500 <== SourceLine 1850
                                        RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdhi,L2buf_4,(L2p_4+(1)));
                                        ;
                                        // JavaLine 503 <== SourceLine 1851
                                        {
                                            _SIM_LABEL(5); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                            RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(2)));
                                        }
                                        ;
                                        L2p_4=(L2p_4+(3));
                                        ;
                                        // JavaLine 511 <== SourceLine 1852
                                        _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    default:
                                    // JavaLine 516 <== SourceLine 1854
                                    L2p_4=(L2p_4+(1));
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 521 <== SourceLine 1856
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 47: 
                            case 11: 
                            // JavaLine 527 <== SourceLine 1859
                            {
                                // JavaLine 529 <== SourceLine 1860
                                ctype_4=((char)11);
                                ;
                                // JavaLine 532 <== SourceLine 1861
                                ckind_4=(((((CLASS_SCANNER)(_CUR._SL)).opn==(((char)11))))?(((char)3)):(((char)4)));
                                ;
                                // JavaLine 535 <== SourceLine 1862
                                cqual_4=0;
                                ;
                                // JavaLine 538 <== SourceLine 1863
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 107: 
                            // JavaLine 544 <== SourceLine 1866
                            {
                                // JavaLine 546 <== SourceLine 1867
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1870_SetQual_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 7: 
                            // JavaLine 552 <== SourceLine 1869
                            {
                                // JavaLine 554 <== SourceLine 1870
                                ctype_4=((char)7);
                                ;
                                ckind_4=((char)0);
                                ;
                                // JavaLine 559 <== SourceLine 1871
                                {
                                    _SIM_LABEL(6); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 562 <== SourceLine 1872
                                    cqual_4=((RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdlo)));
                                }
                                ;
                                // JavaLine 566 <== SourceLine 1873
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 132: 
                            // JavaLine 572 <== SourceLine 1875
                            {
                                // JavaLine 574 <== SourceLine 1876
                                lanhi_4=((CLASS_SCANNER)(_CUR._SL)).opdhi;
                                ;
                                lanlo_4=((CLASS_SCANNER)(_CUR._SL)).opdlo;
                                ;
                                // JavaLine 579 <== SourceLine 1877
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 110: 
                            case 42: 
                            // JavaLine 586 <== SourceLine 1880
                            {
                                // JavaLine 588 <== SourceLine 1881
                                ckind_4=(((((CLASS_SCANNER)(_CUR._SL)).opn==('n')))?(((char)5)):(((char)7)));
                                ;
                                // JavaLine 591 <== SourceLine 1882
                                ctype_4=((char)14);
                                ;
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 596 <== SourceLine 1884
                                p_or_c_qt_4=cquant_4;
                                ;
                                // JavaLine 599 <== SourceLine 1886
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),ckind_4);
                                ;
                                // JavaLine 602 <== SourceLine 1887
                                p_or_c_qt_4.descr_1=cbrec_4;
                                ;
                                // JavaLine 605 <== SourceLine 1888
                                if(_VALUE((ckind_4==(((char)7))))) {
                                    cbrec_4.declquant=p_or_c_qt_4;
                                }
                                ;
                                // JavaLine 610 <== SourceLine 1889
                                p_or_c_qt_4.ftag_1=(-(cqual_4));
                                ;
                                // JavaLine 613 <== SourceLine 1890
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 32: 
                            // JavaLine 618 <== SourceLine 1893
                            {
                                // JavaLine 620 <== SourceLine 1894
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)9));
                                ;
                                cbrec_4.stmtag=cbrec_4.inrtag=((char)2);
                                ;
                                // JavaLine 625 <== SourceLine 1895
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 92: 
                            // JavaLine 630 <== SourceLine 1898
                            {
                                // JavaLine 632 <== SourceLine 1899
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)8));
                                ;
                                // JavaLine 635 <== SourceLine 1900
                                {
                                    _SIM_LABEL(7); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    new CLASS_SCANNER_L2Coder_store3chars((_CUR),((CLASS_SCANNER)(_CUR._SL)).opn,cbrec_4.blnohi,cbrec_4.blnolo);
                                }
                                ;
                                // JavaLine 641 <== SourceLine 1901
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 117: 
                            case 16: 
                            // JavaLine 648 <== SourceLine 1904
                            {
                                // JavaLine 650 <== SourceLine 1905
                                if(_VALUE((cbrec_4.kind==(((char)5))))) {
                                    {
                                        // JavaLine 653 <== SourceLine 1907
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1907_4483=cbrec_4;
                                            if(_inspect_1907_4483!=null) { // INSPECT _inspect_1907_4483  type=ref(BRECORD)
                                                // JavaLine 658 <== SourceLine 1908
                                                {
                                                    // JavaLine 660 <== SourceLine 1907
                                                    {
                                                        // JavaLine 662 <== SourceLine 1908
                                                        virq_4=_inspect_1907_4483.favirt;
                                                        ;
                                                        // JavaLine 665 <== SourceLine 1909
                                                        while(true) {
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_1909_4484=virq_4;
                                                                if(_inspect_1909_4484!=null) { // INSPECT _inspect_1909_4484  type=ref(QUANTITY)
                                                                    // JavaLine 671 <== SourceLine 1910
                                                                    {
                                                                        // JavaLine 673 <== SourceLine 1909
                                                                        {
                                                                            // JavaLine 675 <== SourceLine 1912
                                                                            if(_VALUE((_inspect_1909_4484.kind_1!=(((char)1))))) {
                                                                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0); // GOTO EVALUATED LABEL
                                                                            }
                                                                            ;
                                                                            // JavaLine 680 <== SourceLine 1913
                                                                            pq_4=((CLASS_COMMON_quantity)(_inspect_1907_4483.fpar.next));
                                                                            ;
                                                                            // JavaLine 683 <== SourceLine 1914
                                                                            while((pq_4!=(null))) {
                                                                                {
                                                                                    // JavaLine 686 <== SourceLine 1915
                                                                                    if(_VALUE((pq_4.symb_1==(_inspect_1909_4484.symb_1)))) {
                                                                                        // JavaLine 688 <== SourceLine 1916
                                                                                        _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0); // GOTO EVALUATED LABEL
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 692 <== SourceLine 1917
                                                                                    pq_4=((CLASS_COMMON_quantity)(pq_4.next));
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 697 <== SourceLine 1918
                                                                            ctype_4=_inspect_1909_4484.type_1;
                                                                            ;
                                                                            ckind_4=((char)1);
                                                                            ;
                                                                            // JavaLine 702 <== SourceLine 1919
                                                                            new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                                                            ;
                                                                            // JavaLine 705 <== SourceLine 1920
                                                                            cquant_4.line_1=_inspect_1909_4484.line_1;
                                                                            ;
                                                                            cquant_4.ftag_1=_inspect_1909_4484.ftag_1;
                                                                            ;
                                                                            // JavaLine 710 <== SourceLine 1921
                                                                            cquant_4.symb_1=_inspect_1909_4484.symb_1;
                                                                            ;
                                                                            // JavaLine 713 <== SourceLine 1922
                                                                            cquant_4.dim_1=78;
                                                                            ;
                                                                            // JavaLine 716 <== SourceLine 1923
                                                                            xquant_4=cquant_4;
                                                                            ;
                                                                            // JavaLine 719 <== SourceLine 1924
                                                                            new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                                            ;
                                                                            xquant_4.descr_1=cbrec_4;
                                                                            ;
                                                                            // JavaLine 724 <== SourceLine 1925
                                                                            if(_VALUE((_inspect_1909_4484.descr_1!=(null)))) {
                                                                                // JavaLine 726 <== SourceLine 1926
                                                                                cbrec_4.fpar.next=_inspect_1909_4484.descr_1.fpar;
                                                                            }
                                                                            ;
                                                                            // JavaLine 730 <== SourceLine 1928
                                                                            xbrec_4=cbrec_4;
                                                                            ;
                                                                            cbrec_4.line1=_inspect_1909_4484.line_1;
                                                                            ;
                                                                            new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                                                            ;
                                                                            // JavaLine 737 <== SourceLine 1929
                                                                            new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                                            ;
                                                                            cbrec_4.line1=_inspect_1909_4484.line_1;
                                                                            ;
                                                                            // JavaLine 742 <== SourceLine 1930
                                                                            {
                                                                                // BEGIN INSPECTION 
                                                                                _inspect_1930_4485=new CLASS_COMMON_idpack((_CUR._SL))._STM();
                                                                                if(_inspect_1930_4485!=null) { // INSPECT _inspect_1930_4485  type=ref(IDPACK)
                                                                                    // JavaLine 747 <== SourceLine 1931
                                                                                    {
                                                                                        // JavaLine 749 <== SourceLine 1930
                                                                                        {
                                                                                            // JavaLine 751 <== SourceLine 1932
                                                                                            cbrec_4.hidlist=((CLASS_COMMON_idpack)_inspect_1930_4485);
                                                                                            ;
                                                                                            // JavaLine 754 <== SourceLine 1933
                                                                                            _inspect_1930_4485.idhi=xbrec_4.blnohi;
                                                                                            ;
                                                                                            _inspect_1930_4485.idlo=xbrec_4.blnolo;
                                                                                            ;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } // END INSPECTION
                                                                            ;
                                                                            // JavaLine 764 <== SourceLine 1935
                                                                            new CLASS_SCANNER_L2Coder_store3chars((_CUR),'g',cbrec_4.blnohi,cbrec_4.blnolo);
                                                                            ;
                                                                            // JavaLine 767 <== SourceLine 1936
                                                                            new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                                                            ;
                                                                            // JavaLine 770 <== SourceLine 1937
                                                                            RTS_ENVIRONMENT.storeChar('y',L2buf_4,L2p_4);
                                                                            ;
                                                                            L2p_4=(L2p_4+(1));
                                                                            ;
                                                                            // JavaLine 775 <== SourceLine 1938
                                                                            if(_VALUE((L2p_4>(L2limit_4)))) {
                                                                                new CLASS_SCANNER_L2Coder_outbuffer((_CUR));
                                                                            }
                                                                            ;
                                                                            // JavaLine 780 <== SourceLine 1939
                                                                            {
                                                                                _SIM_LABEL(8); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                                                                virq_4=((CLASS_COMMON_quantity)(_inspect_1909_4484.next));
                                                                            }
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                                else { // OTHERWISE 
                                                                    // JavaLine 790 <== SourceLine 1940
                                                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_EXvloop_0); // GOTO EVALUATED LABEL
                                                                } // END OTHERWISE 
                                                            } // END INSPECTION
                                                            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                                        }
                                                        ;
                                                        {
                                                            _SIM_LABEL(9); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                                            // JavaLine 799 <== SourceLine 1942
                                                            fvis_4=_inspect_1907_4483.hidlist;
                                                        }
                                                        ;
                                                        _inspect_1907_4483.hidlist=x_4=null;
                                                        ;
                                                        // JavaLine 805 <== SourceLine 1943
                                                        while((fvis_4!=(null))) {
                                                            {
                                                                // JavaLine 808 <== SourceLine 1945
                                                                if(_VALUE(RTS_UTIL._IS(fvis_4,CLASS_SCANNER_protpack.class))) {
                                                                    {
                                                                        // JavaLine 811 <== SourceLine 1947
                                                                        iihi_4=fvis_4.idhi;
                                                                        ;
                                                                        iilo_4=fvis_4.idlo;
                                                                        ;
                                                                        // JavaLine 816 <== SourceLine 1948
                                                                        locals_4=false;
                                                                        ;
                                                                        notok_4=true;
                                                                        ;
                                                                        // JavaLine 821 <== SourceLine 1949
                                                                        pq_4=_inspect_1907_4483.favirt;
                                                                        ;
                                                                        // JavaLine 824 <== SourceLine 1950
                                                                        {
                                                                            _SIM_LABEL(10); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                                                            while((pq_4!=(null))) {
                                                                                {
                                                                                    // JavaLine 829 <== SourceLine 1951
                                                                                    if(_VALUE(((pq_4.symb_1==(new CLASS_COMMON_boxof((_CUR._SL),iihi_4,iilo_4)._RESULT))&&(((pq_4.protect_1==(((char)0)))||((pq_4.type_1==(((char)11))))))))) {
                                                                                        // JavaLine 831 <== SourceLine 1953
                                                                                        {
                                                                                            pq_4.protect_1=((char)1);
                                                                                            ;
                                                                                            // JavaLine 835 <== SourceLine 1954
                                                                                            if(_VALUE(locals_4)) {
                                                                                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_FOUND_0); // GOTO EVALUATED LABEL
                                                                                            }
                                                                                            ;
                                                                                            // JavaLine 840 <== SourceLine 1956
                                                                                            notok_4=false;
                                                                                        }
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 845 <== SourceLine 1957
                                                                                    pq_4=((CLASS_COMMON_quantity)(pq_4.next));
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 852 <== SourceLine 1959
                                                                        if(_VALUE((!(locals_4)))) {
                                                                            {
                                                                                // JavaLine 855 <== SourceLine 1960
                                                                                locals_4=true;
                                                                                ;
                                                                                pq_4=((CLASS_COMMON_quantity)(_inspect_1907_4483.fpar.next));
                                                                                ;
                                                                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_L1_0); // GOTO EVALUATED LABEL
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 864 <== SourceLine 1974
                                                                        if(_VALUE(notok_4)) {
                                                                            {
                                                                                // JavaLine 867 <== SourceLine 1975
                                                                                new CLASS_ERRMSG_error1id((_CUR._SL),-290,new CLASS_COMMON_boxof((_CUR._SL),iihi_4,iilo_4)._RESULT);
                                                                                ;
                                                                                // JavaLine 870 <== SourceLine 1977
                                                                                {
                                                                                    // BEGIN INSPECTION 
                                                                                    _inspect_1977_4486=fvis_4.next;
                                                                                    if(_inspect_1977_4486!=null) { // INSPECT _inspect_1977_4486  type=ref(IDPACK)
                                                                                        // JavaLine 875 <== SourceLine 1978
                                                                                        {
                                                                                            if(_VALUE((((_inspect_1977_4486.idlo==(iilo_4))&&((_inspect_1977_4486.idhi==(iihi_4))))&&(RTS_UTIL._IS(((CLASS_COMMON_idpack)_inspect_1977_4486),CLASS_COMMON_idpack.class))))) {
                                                                                                // JavaLine 878 <== SourceLine 1980
                                                                                                fvis_4=fvis_4.next;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } // END INSPECTION
                                                                                ;
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 888 <== SourceLine 1982
                                                                        {
                                                                            _SIM_LABEL(11); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                                                            ;
                                                                        }
                                                                    }
                                                                } else {
                                                                    // JavaLine 895 <== SourceLine 1983
                                                                    {
                                                                        // JavaLine 897 <== SourceLine 1984
                                                                        if(_VALUE((x_4==(null)))) {
                                                                            x_4=_inspect_1907_4483.hidlist=fvis_4;
                                                                        } else {
                                                                            // JavaLine 901 <== SourceLine 1985
                                                                            x_4=x_4.next=fvis_4;
                                                                        }
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 908 <== SourceLine 1987
                                                                fvis_4=fvis_4.next;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 913 <== SourceLine 1989
                                                        if(_VALUE((x_4!=(null)))) {
                                                            x_4.next=null;
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 926 <== SourceLine 1993
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    {
                                        // JavaLine 929 <== SourceLine 1994
                                        cbrec_4.stmtag=((char)2);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 935 <== SourceLine 1997
                                lastlinenr_4=((CLASS_SCANNER)(_CUR._SL)).linenr;
                                ;
                                new CLASS_SCANNER_L2Coder_storecharint((_CUR),'Y',lastlinenr_4);
                                ;
                                // JavaLine 940 <== SourceLine 1998
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2002_btout_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 126: 
                            case 106: 
                            case 37: 
                            case 53: 
                            // JavaLine 948 <== SourceLine 2001
                            {
                                // JavaLine 950 <== SourceLine 2002
                                {
                                    _SIM_LABEL(12); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                }
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 26: 
                            // JavaLine 960 <== SourceLine 2005
                            {
                                // JavaLine 962 <== SourceLine 2006
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    {
                                        // JavaLine 965 <== SourceLine 2007
                                        cbrec_4.stmtag=((char)2);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 971 <== SourceLine 2010
                                cbrec_4.inrtag=((char)2);
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 56: 
                            // JavaLine 978 <== SourceLine 2013
                            {
                                // JavaLine 980 <== SourceLine 2014
                                ctype_4=((CLASS_SCANNER)(_CUR._SL)).optx;
                                ;
                                ckind_4=((char)0);
                                ;
                                cqual_4=0;
                                ;
                                // JavaLine 987 <== SourceLine 2015
                                xbrec_4=cbrec_4;
                                ;
                                xquant_4=cquant_4;
                                ;
                                // JavaLine 992 <== SourceLine 2016
                                while((cbrec_4.kind==(((char)11)))) {
                                    cbrec_4=cbrec_4.fpar.encl_1;
                                }
                                ;
                                // JavaLine 997 <== SourceLine 2017
                                cquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 1000 <== SourceLine 2018
                                while((cquant_4.next!=(null))) {
                                    {
                                        // JavaLine 1003 <== SourceLine 2019
                                        cquant_4=((CLASS_COMMON_quantity)(cquant_4.next));
                                        ;
                                        // JavaLine 1006 <== SourceLine 2020
                                        if(_VALUE((cquant_4.symb_1==(new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT)))) {
                                            _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2014_Qfound_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1014 <== SourceLine 2022
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1017 <== SourceLine 2023
                                if(_VALUE((ctype_4==(((char)11))))) {
                                    {
                                        // JavaLine 1020 <== SourceLine 2024
                                        cquant_4.kind_1=((char)3);
                                        ;
                                        cquant_4.dim_1=1;
                                    }
                                }
                                ;
                                // JavaLine 1027 <== SourceLine 2025
                                {
                                    _SIM_LABEL(13); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    cbrec_4=xbrec_4;
                                }
                                ;
                                cquant_4=xquant_4;
                                ;
                                // JavaLine 1035 <== SourceLine 2026
                                if(_VALUE((ctype_4==(((char)11))))) {
                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1040 <== SourceLine 2027
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 113: 
                            // JavaLine 1046 <== SourceLine 2030
                            {
                                // JavaLine 1048 <== SourceLine 2031
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1051 <== SourceLine 2032
                                dimcount_4=0;
                                ;
                                // JavaLine 1054 <== SourceLine 2033
                                ckind_4=((char)4);
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2037_genlab_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 77: 
                            // JavaLine 1061 <== SourceLine 2036
                            {
                                // JavaLine 1063 <== SourceLine 2037
                                ckind_4=((char)3);
                                ;
                                // JavaLine 1066 <== SourceLine 2038
                                {
                                    _SIM_LABEL(14); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    ctype_4=((char)11);
                                }
                                ;
                                // JavaLine 1072 <== SourceLine 2039
                                cqual_4=0;
                                ;
                                // JavaLine 1075 <== SourceLine 2040
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1078 <== SourceLine 2041
                                cquant_4.protect_1=((char)1);
                                ;
                                // JavaLine 1081 <== SourceLine 2042
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opn==('8')))) {
                                    cquant_4.dim_1=1;
                                }
                                ;
                                // JavaLine 1086 <== SourceLine 2043
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 94: 
                            // JavaLine 1091 <== SourceLine 2046
                            {
                                // JavaLine 1093 <== SourceLine 2047
                                ckind_4=((char)0);
                                ;
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1098 <== SourceLine 2048
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 144: 
                            case 114: 
                            // JavaLine 1105 <== SourceLine 2057
                            {
                                // JavaLine 1107 <== SourceLine 2058
                                dimcount_4=(dimcount_4+(1));
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 143: 
                            // JavaLine 1114 <== SourceLine 2061
                            {
                                // JavaLine 1116 <== SourceLine 2062
                                cquant_4.dim_1=dimcount_4;
                                ;
                                // JavaLine 1119 <== SourceLine 2063
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 140: 
                            // JavaLine 1124 <== SourceLine 2066
                            {
                                // JavaLine 1126 <== SourceLine 2067
                                cquant_4.kind_1=((char)6);
                                ;
                                cquant_4.dim_1=1;
                                ;
                                cquant_4.encl_1=cbrec_4;
                                ;
                                // JavaLine 1133 <== SourceLine 2068
                                xquant_4=cquant_4;
                                ;
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)6));
                                ;
                                // JavaLine 1138 <== SourceLine 2069
                                xquant_4.descr_1=cbrec_4;
                                ;
                                cbrec_4.declquant=xquant_4;
                                ;
                                // JavaLine 1143 <== SourceLine 2070
                                cbrec_4.line1=((CLASS_SCANNER)(_CUR._SL)).repcount_2;
                                ;
                                // JavaLine 1146 <== SourceLine 2071
                                new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 97: 
                            // JavaLine 1153 <== SourceLine 2074
                            {
                                // JavaLine 1155 <== SourceLine 2075
                                cquant_4.kind_1=((char)2);
                                ;
                                // JavaLine 1158 <== SourceLine 2076
                                dimcount_4=0;
                                ;
                                if(_VALUE((firstarr_4==(null)))) {
                                    firstarr_4=cquant_4;
                                }
                                ;
                                // JavaLine 1165 <== SourceLine 2077
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1168 <== SourceLine 2078
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2078_4487=cquant_4.symb_1;
                                    if(_inspect_2078_4487!=null) { // INSPECT _inspect_2078_4487  type=ref(SYMBOLBOX)
                                        {
                                            new CLASS_SCANNER_L2Coder_store3chars((_CUR),'m',_inspect_2078_4487.idhi,_inspect_2078_4487.idlo);
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1179 <== SourceLine 2079
                                new CLASS_SCANNER_L2Coder_store3chars((_CUR),((char)4),((char)127),((char)255));
                                ;
                                // JavaLine 1182 <== SourceLine 2080
                                ((CLASS_SCANNER)(_CUR._SL)).opn='f';
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 109: 
                            // JavaLine 1189 <== SourceLine 2083
                            {
                                // JavaLine 1191 <== SourceLine 2084
                                ckind_4=((char)2);
                                ;
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1196 <== SourceLine 2085
                                dimcount_4=0;
                                ;
                                if(_VALUE((firstarr_4==(null)))) {
                                    firstarr_4=cquant_4;
                                }
                                ;
                                // JavaLine 1203 <== SourceLine 2086
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1206 <== SourceLine 2087
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 99: 
                            // JavaLine 1211 <== SourceLine 2090
                            {
                                // JavaLine 1213 <== SourceLine 2091
                                dimcount_4=(dimcount_4+(1));
                                ;
                                // JavaLine 1216 <== SourceLine 2092
                                while(true) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_2092_4488=firstarr_4;
                                        if(_inspect_2092_4488!=null) { // INSPECT _inspect_2092_4488  type=ref(QUANTITY)
                                            // JavaLine 1222 <== SourceLine 2093
                                            {
                                                // JavaLine 1224 <== SourceLine 2092
                                                {
                                                    // JavaLine 1226 <== SourceLine 2093
                                                    _inspect_2092_4488.dim_1=dimcount_4;
                                                    ;
                                                    firstarr_4=((CLASS_COMMON_quantity)(_inspect_2092_4488.next));
                                                }
                                            }
                                        }
                                        else { // OTHERWISE 
                                            // JavaLine 1234 <== SourceLine 2094
                                            _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                                        } // END OTHERWISE 
                                    } // END INSPECTION
                                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                }
                                ;
                            }
                            break;
                            case 64: 
                            // JavaLine 1244 <== SourceLine 2097
                            {
                                // JavaLine 1246 <== SourceLine 2100
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 65: 
                            // JavaLine 1252 <== SourceLine 2104
                            {
                                // JavaLine 1254 <== SourceLine 2106
                                if(_VALUE((cquant_4.virtno_1==(0)))) {
                                    // JavaLine 1256 <== SourceLine 2107
                                    cquant_4.virtno_1=((RTS_ENVIRONMENT.rank(cquant_4.symb_1.idhi)*(256))+(RTS_ENVIRONMENT.rank(cquant_4.symb_1.idlo)));
                                }
                                ;
                                // JavaLine 1260 <== SourceLine 2109
                                cquant_4.symb_1=new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                ;
                                cquant_4.type_1=ctype_4;
                                ;
                                // JavaLine 1265 <== SourceLine 2110
                                cquant_4.ftag_1=(-(cqual_4));
                                ;
                                // JavaLine 1268 <== SourceLine 2111
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2115_genbrc_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 112: 
                            // JavaLine 1273 <== SourceLine 2114
                            {
                                // JavaLine 1275 <== SourceLine 2115
                                {
                                    _SIM_LABEL(15); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    ckind_4=((char)1);
                                }
                                ;
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1283 <== SourceLine 2116
                                {
                                    _SIM_LABEL(16); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 1286 <== SourceLine 2117
                                    p_or_c_qt_4=cquant_4;
                                }
                                ;
                                // JavaLine 1290 <== SourceLine 2119
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                ;
                                p_or_c_qt_4.descr_1=cbrec_4;
                                ;
                                // JavaLine 1295 <== SourceLine 2121
                                new CLASS_SCANNER_L2Coder_store3chars((_CUR),((CLASS_SCANNER)(_CUR._SL)).opn,((CLASS_SCANNER)(_CUR._SL)).nextblhi,((CLASS_SCANNER)(_CUR._SL)).nextbllo);
                                ;
                                // JavaLine 1298 <== SourceLine 2123
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 103: 
                            // JavaLine 1304 <== SourceLine 2127
                            {
                                // JavaLine 1306 <== SourceLine 2130
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2130_4489=vquant_4;
                                    if(_inspect_2130_4489!=null) { // INSPECT _inspect_2130_4489  type=ref(QUANTITY)
                                        // JavaLine 1311 <== SourceLine 2131
                                        {
                                            // JavaLine 1313 <== SourceLine 2130
                                            {
                                                // JavaLine 1315 <== SourceLine 2131
                                                if(_VALUE((_inspect_2130_4489.type_1!=(((char)14))))) {
                                                    new CLASS_ERRMSG_error1id((_CUR._SL),-444,_inspect_2130_4489.symb_1);
                                                }
                                                ;
                                                // JavaLine 1320 <== SourceLine 2133
                                                _inspect_2130_4489.symb_1=new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                                ;
                                                _inspect_2130_4489.type_1=ctype_4;
                                                ;
                                                // JavaLine 1325 <== SourceLine 2134
                                                _inspect_2130_4489.ftag_1=(-(cqual_4));
                                                ;
                                                // JavaLine 1328 <== SourceLine 2135
                                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                ;
                                                _inspect_2130_4489.descr_1=cbrec_4;
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1338 <== SourceLine 2137
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 121: 
                            // JavaLine 1344 <== SourceLine 2140
                            {
                                // JavaLine 1346 <== SourceLine 2141
                                new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                // JavaLine 1349 <== SourceLine 2142
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 95: 
                            // JavaLine 1355 <== SourceLine 2145
                            {
                                // JavaLine 1357 <== SourceLine 2146
                                ctype_4=((char)15);
                                ;
                                ckind_4=((char)12);
                                ;
                                // JavaLine 1362 <== SourceLine 2147
                                cqual_4=0;
                                ;
                                // JavaLine 1365 <== SourceLine 2148
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)0));
                                ;
                                // JavaLine 1368 <== SourceLine 2149
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 10: 
                            case 33: 
                            // JavaLine 1375 <== SourceLine 2152
                            {
                                // JavaLine 1377 <== SourceLine 2153
                                xquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 1380 <== SourceLine 2154
                                while(((xquant_4.symb_1!=(new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT))&&((xquant_4.next!=(null))))) {
                                    // JavaLine 1382 <== SourceLine 2156
                                    xquant_4=((CLASS_COMMON_quantity)(xquant_4.next));
                                }
                                ;
                                // JavaLine 1386 <== SourceLine 2157
                                if(_VALUE(((xquant_4.symb_1.idhi!=(((CLASS_SCANNER)(_CUR._SL)).opdhi))||((xquant_4.symb_1.idlo!=(((CLASS_SCANNER)(_CUR._SL)).opdlo)))))) {
                                    // JavaLine 1388 <== SourceLine 2158
                                    new CLASS_SCANNER_L2Coder_specErr((_CUR),223);
                                } else {
                                    // JavaLine 1391 <== SourceLine 2159
                                    if(_VALUE((xquant_4.categ_1!=(((char)0))))) {
                                        new CLASS_SCANNER_L2Coder_specErr((_CUR),224);
                                    } else {
                                        // JavaLine 1395 <== SourceLine 2160
                                        xquant_4.categ_1=(((((CLASS_SCANNER)(_CUR._SL)).opn==(((char)10))))?(((char)1)):(((char)2)));
                                    }
                                }
                                ;
                                // JavaLine 1400 <== SourceLine 2161
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 137: 
                            case 108: 
                            // JavaLine 1407 <== SourceLine 2164
                            {
                                // JavaLine 1409 <== SourceLine 2165
                                xquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 1412 <== SourceLine 2166
                                while(((xquant_4.symb_1!=(new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT))&&((xquant_4.next!=(null))))) {
                                    // JavaLine 1414 <== SourceLine 2168
                                    xquant_4=((CLASS_COMMON_quantity)(xquant_4.next));
                                }
                                ;
                                // JavaLine 1418 <== SourceLine 2170
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2170_4490=xquant_4;
                                    if(_inspect_2170_4490!=null) { // INSPECT _inspect_2170_4490  type=ref(QUANTITY)
                                        // JavaLine 1423 <== SourceLine 2171
                                        {
                                            // JavaLine 1425 <== SourceLine 2170
                                            {
                                                // JavaLine 1427 <== SourceLine 2171
                                                if(_VALUE(((_inspect_2170_4490.symb_1.idhi!=(((CLASS_SCANNER)(_CUR._SL)).opdhi))||((_inspect_2170_4490.symb_1.idlo!=(((CLASS_SCANNER)(_CUR._SL)).opdlo)))))) {
                                                    // JavaLine 1429 <== SourceLine 2172
                                                    new CLASS_SCANNER_L2Coder_specErr((_CUR),223);
                                                } else {
                                                    // JavaLine 1432 <== SourceLine 2173
                                                    if(_VALUE((_inspect_2170_4490.kind_1!=(((char)12))))) {
                                                        new CLASS_SCANNER_L2Coder_specErr((_CUR),224);
                                                    } else {
                                                        // JavaLine 1436 <== SourceLine 2174
                                                        {
                                                            // JavaLine 1438 <== SourceLine 2175
                                                            _inspect_2170_4490.type_1=ctype_4;
                                                            ;
                                                            _inspect_2170_4490.kind_1=ckind_4;
                                                            ;
                                                            // JavaLine 1443 <== SourceLine 2176
                                                            _inspect_2170_4490.ftag_1=(-(cqual_4));
                                                            ;
                                                        }
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1455 <== SourceLine 2179
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 120: 
                            // JavaLine 1461 <== SourceLine 2182
                            {
                                // JavaLine 1463 <== SourceLine 2183
                                if(_VALUE((cbrec_4.kind==(((char)1))))) {
                                    {
                                        // JavaLine 1466 <== SourceLine 2186
                                        xbrec_4=cbrec_4;
                                        ;
                                        new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                        ;
                                        // JavaLine 1471 <== SourceLine 2187
                                        if(_VALUE((cquant_4.categ_1!=(((char)4))))) {
                                            // JavaLine 1473 <== SourceLine 2188
                                            {
                                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                ;
                                                // JavaLine 1477 <== SourceLine 2189
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_2189_4491=new CLASS_COMMON_idpack((_CUR._SL))._STM();
                                                    if(_inspect_2189_4491!=null) { // INSPECT _inspect_2189_4491  type=ref(IDPACK)
                                                        // JavaLine 1482 <== SourceLine 2190
                                                        {
                                                            // JavaLine 1484 <== SourceLine 2189
                                                            {
                                                                // JavaLine 1486 <== SourceLine 2191
                                                                cbrec_4.hidlist=((CLASS_COMMON_idpack)_inspect_2189_4491);
                                                                ;
                                                                // JavaLine 1489 <== SourceLine 2192
                                                                _inspect_2189_4491.idhi=xbrec_4.blnohi;
                                                                ;
                                                                _inspect_2189_4491.idlo=xbrec_4.blnolo;
                                                                ;
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                                ;
                                                // JavaLine 1499 <== SourceLine 2194
                                                cbrec_4.line1=xbrec_4.line1;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 1504 <== SourceLine 2196
                                            if(_VALUE(((cquant_4.dim_1==(RTS_ENVIRONMENT.rank('L')))||((cquant_4.dim_1==(RTS_ENVIRONMENT.rank('M'))))))) {
                                                // JavaLine 1506 <== SourceLine 2198
                                                {
                                                    // JavaLine 1508 <== SourceLine 2199
                                                    pq_4=xbrec_4.fpar;
                                                    ;
                                                    // JavaLine 1511 <== SourceLine 2200
                                                    while((pq_4!=(null))) {
                                                        {
                                                            // JavaLine 1514 <== SourceLine 2201
                                                            if(_VALUE((pq_4.kind_1==(((char)1))))) {
                                                                {
                                                                    // JavaLine 1517 <== SourceLine 2202
                                                                    if(_VALUE((pq_4.categ_1!=(((char)2))))) {
                                                                        _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                            } else {
                                                                // JavaLine 1523 <== SourceLine 2203
                                                                if(_VALUE((pq_4.categ_1==(((char)0))))) {
                                                                    {
                                                                        // JavaLine 1526 <== SourceLine 2204
                                                                        if(_VALUE((pq_4.kind_1==(((char)2))))) {
                                                                            _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                        ;
                                                                        // JavaLine 1531 <== SourceLine 2205
                                                                        if(pq_4.type_1<((char)0) || pq_4.type_1>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                        switch(pq_4.type_1) { // BEGIN SWITCH STATEMENT
                                                                            case 1: 
                                                                            case 2: 
                                                                            case 3: 
                                                                            case 4: 
                                                                            case 5: 
                                                                            case 6: 
                                                                            case 9: 
                                                                            // JavaLine 1541 <== SourceLine 2207
                                                                            {
                                                                                // JavaLine 1543 <== SourceLine 2208
                                                                                pq_4.categ_1=((char)1);
                                                                                ;
                                                                                iii_4=244;
                                                                                ;
                                                                            }
                                                                            break;
                                                                            default:
                                                                            // JavaLine 1551 <== SourceLine 2210
                                                                            {
                                                                                // JavaLine 1553 <== SourceLine 2211
                                                                                {
                                                                                    _SIM_LABEL(17); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                                                                    pq_4.categ_1=((char)2);
                                                                                }
                                                                                ;
                                                                                iii_4=248;
                                                                                ;
                                                                            }
                                                                            break;
                                                                        } // END SWITCH STATEMENT
                                                                        ;
                                                                        // JavaLine 1565 <== SourceLine 2214
                                                                        ((CLASS_SCANNER)(_CUR._SL)).diag.putELEMENT(((CLASS_SCANNER)(_CUR._SL)).diag.index(0),pq_4.symb_1.symbol);
                                                                        ;
                                                                        // JavaLine 1568 <== SourceLine 2215
                                                                        ((CLASS_SCANNER)(_CUR._SL)).diag.putELEMENT(((CLASS_SCANNER)(_CUR._SL)).diag.index(1),cquant_4.symb_1.symbol);
                                                                        ;
                                                                        // JavaLine 1571 <== SourceLine 2216
                                                                        new CLASS_SCANNER_P1warn((_CUR._SL),iii_4);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 1578 <== SourceLine 2218
                                                            pq_4=((CLASS_COMMON_quantity)(pq_4.next));
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1591 <== SourceLine 2222
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 148: 
                            // JavaLine 1597 <== SourceLine 2225
                            {
                                // JavaLine 1599 <== SourceLine 2226
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)6));
                                ;
                                // JavaLine 1602 <== SourceLine 2227
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 55: 
                            // JavaLine 1608 <== SourceLine 2230
                            {
                                // JavaLine 1610 <== SourceLine 2231
                                new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2235_LIFWHN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 105: 
                            case 127: 
                            // JavaLine 1618 <== SourceLine 2234
                            {
                                // JavaLine 1620 <== SourceLine 2235
                                {
                                    _SIM_LABEL(18); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)11));
                                }
                                ;
                                // JavaLine 1626 <== SourceLine 2239
                                jjj_4=1;
                                ;
                                // JavaLine 1629 <== SourceLine 2240
                                xbrec_4=cbrec_4.fpar.encl_1;
                                ;
                                // JavaLine 1632 <== SourceLine 2241
                                while((xbrec_4.kind==(((char)11)))) {
                                    // JavaLine 1634 <== SourceLine 2242
                                    {
                                        if(_VALUE((xbrec_4.connests!=(0)))) {
                                            jjj_4=(jjj_4+(1));
                                        }
                                        ;
                                        // JavaLine 1640 <== SourceLine 2244
                                        xbrec_4=xbrec_4.fpar.encl_1;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1646 <== SourceLine 2247
                                if(_VALUE((xbrec_4.kind==(((char)1))))) {
                                    // JavaLine 1648 <== SourceLine 2248
                                    xbrec_4=new CLASS_COMMON_getBrc((_CUR._SL),xbrec_4.hidlist.idhi,xbrec_4.hidlist.idlo)._RESULT;
                                }
                                ;
                                // JavaLine 1652 <== SourceLine 2251
                                cbrec_4.connests=jjj_4;
                                ;
                                // JavaLine 1655 <== SourceLine 2252
                                if(_VALUE((xbrec_4.connests<(jjj_4)))) {
                                    xbrec_4.connests=jjj_4;
                                }
                                ;
                                // JavaLine 1660 <== SourceLine 2253
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opn==('i')))) {
                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1665 <== SourceLine 2254
                                {
                                    _SIM_LABEL(19); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    new CLASS_SCANNER_L2Coder_store3chars((_CUR),((CLASS_SCANNER)(_CUR._SL)).opn,cbrec_4.blnohi,cbrec_4.blnolo);
                                }
                                ;
                                // JavaLine 1671 <== SourceLine 2255
                                RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdhi,L2buf_4,L2p_4);
                                ;
                                // JavaLine 1674 <== SourceLine 2256
                                RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(1)));
                                ;
                                L2p_4=(L2p_4+(2));
                                ;
                                // JavaLine 1679 <== SourceLine 2257
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 19: 
                            // JavaLine 1685 <== SourceLine 2260
                            {
                                // JavaLine 1687 <== SourceLine 2261
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)11));
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 93: 
                            // JavaLine 1695 <== SourceLine 2264
                            {
                                // JavaLine 1697 <== SourceLine 2265
                                new CLASS_SCANNER_L2Coder_brecinit((_CUR),((char)9));
                                ;
                                cbrec_4.stmtag=cbrec_4.inrtag=((char)2);
                                ;
                                // JavaLine 1702 <== SourceLine 2266
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 88: 
                            // JavaLine 1707 <== SourceLine 2269
                            {
                                // JavaLine 1709 <== SourceLine 2270
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2270_4492=RTS_BASICIO.sysout();
                                    if(_inspect_2270_4492!=null) { // INSPECT _inspect_2270_4492  type=ref(PRINTFILE)
                                        {
                                            {
                                                if(_VALUE((_inspect_2270_4492.pos()>(1)))) {
                                                    _inspect_2270_4492.outimage();
                                                }
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1724 <== SourceLine 2271
                                while((cbrec_4!=(null))) {
                                    new CLASS_SCANNER_L2Coder_brecterm((_CUR));
                                }
                                ;
                                // JavaLine 1729 <== SourceLine 2272
                                RTS_ENVIRONMENT.storeChar('X',L2buf_4,L2p_4);
                                ;
                                RTS_ENVIRONMENT.storeChar('X',L2buf_4,(L2p_4+(1)));
                                ;
                                // JavaLine 1734 <== SourceLine 2273
                                RTS_TXT.setpos(((CLASS_SCANNER)(_CUR._SL)).L2codebuffer,(L2p_4+(2)));
                                ;
                                // JavaLine 1737 <== SourceLine 2274
                                while(true) {
                                    detach(2274);
                                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                }
                                ;
                            }
                            break;
                            case 18: 
                            // JavaLine 1746 <== SourceLine 2278
                            {
                                // JavaLine 1748 <== SourceLine 2279
                                new CLASS_SCANNER_L2Coder_NewQuant((_CUR),((char)4));
                                ;
                                // JavaLine 1751 <== SourceLine 2280
                                if(_VALUE((ckind_4==(((char)1))))) {
                                    {
                                        // JavaLine 1754 <== SourceLine 2281
                                        cquant_4.dim_1=((RTS_ENVIRONMENT.rank(lanhi_4)*(256))+(RTS_ENVIRONMENT.rank(lanlo_4)));
                                        ;
                                        // JavaLine 1757 <== SourceLine 2282
                                        lanhi_4=lanlo_4=((char)0);
                                        ;
                                    }
                                }
                                ;
                            }
                            break;
                            case 123: 
                            // JavaLine 1766 <== SourceLine 2287
                            {
                                // JavaLine 1768 <== SourceLine 2288
                                if(_VALUE((cquant_4.categ_1==(((char)5))))) {
                                    // JavaLine 1770 <== SourceLine 2289
                                    p_or_c_qt_4.virtno_1=((RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdlo)));
                                } else {
                                    // JavaLine 1773 <== SourceLine 2290
                                    cquant_4.virtno_1=((RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL)).opdlo)));
                                }
                                ;
                            }
                            break;
                            case 87: 
                            // JavaLine 1780 <== SourceLine 2307
                            {
                                // JavaLine 1782 <== SourceLine 2308
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    ((CLASS_SCANNER)(_CUR._SL)).opn=((CLASS_SCANNER)(_CUR._SL)).opdlo;
                                }
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 51: 
                            // JavaLine 1791 <== SourceLine 2311
                            {
                                // JavaLine 1793 <== SourceLine 2312
                                cquant_4.special_1=((char)3);
                                ;
                                // JavaLine 1796 <== SourceLine 2313
                                if(_VALUE((cquant_4.type_1==(((char)3))))) {
                                    cquant_4.type_1=((char)4);
                                }
                                ;
                                // JavaLine 1801 <== SourceLine 2314
                                ((CLASS_SCANNER)(_CUR._SL)).opdhi=cquant_4.symb_1.idhi;
                                ;
                                ((CLASS_SCANNER)(_CUR._SL)).opdlo=cquant_4.symb_1.idlo;
                                ;
                                // JavaLine 1806 <== SourceLine 2315
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 124: 
                            // JavaLine 1811 <== SourceLine 2318
                            {
                                // JavaLine 1813 <== SourceLine 2319
                                cquant_4.protect_1=((char)2);
                                ;
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1818 <== SourceLine 2320
                                RTS_ENVIRONMENT.storeChar('|',L2buf_4,L2p_4);
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 1823 <== SourceLine 2321
                                ((CLASS_SCANNER)(_CUR._SL)).opn=((CLASS_SCANNER)(_CUR._SL)).opdlo;
                                ;
                                _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 136: 
                            case 40: 
                            // JavaLine 1831 <== SourceLine 2324
                            {
                                // JavaLine 1833 <== SourceLine 2325
                                new CLASS_SCANNER_L2Coder_chainVis((_CUR),false);
                                ;
                                // JavaLine 1836 <== SourceLine 2326
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opn==(((char)136))))) {
                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_LIHIDD_0); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                            break;
                            case 22: 
                            // JavaLine 1844 <== SourceLine 2331
                            {
                                {
                                    _SIM_LABEL(20);
                                    // JavaLine 1848 <== SourceLine 2332
                                    new CLASS_SCANNER_L2Coder_chainVis((_CUR),true);
                                    ;
                                }
                            }
                            break;
                            case 141: 
                            // JavaLine 1855 <== SourceLine 2336
                            {
                                // JavaLine 1857 <== SourceLine 2338
                                new CLASS_SCANNER_L2Coder_storecharint((_CUR),((char)141),cswa_4);
                                ;
                                // JavaLine 1860 <== SourceLine 2339
                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((cswb_4/(256))),L2buf_4,L2p_4);
                                ;
                                // JavaLine 1863 <== SourceLine 2340
                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(cswb_4,256)),L2buf_4,(L2p_4+(1)));
                                ;
                                L2p_4=(L2p_4+(2));
                                ;
                                // JavaLine 1868 <== SourceLine 2341
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_2341_4493=RTS_BASICIO.sysout();
                                        if(_inspect_2341_4493!=null) { // INSPECT _inspect_2341_4493  type=ref(PRINTFILE)
                                            // JavaLine 1874 <== SourceLine 2342
                                            {
                                                // JavaLine 1876 <== SourceLine 2341
                                                {
                                                    // JavaLine 1878 <== SourceLine 2342
                                                    _inspect_2341_4493.outtext(new RTS_TXT("SWITCHES: "));
                                                    ;
                                                    _inspect_2341_4493.outint(cswa_4,3);
                                                    ;
                                                    // JavaLine 1883 <== SourceLine 2343
                                                    _inspect_2341_4493.outint(cswb_4,3);
                                                    ;
                                                    _inspect_2341_4493.outimage();
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                                ;
                            }
                            break;
                            case 21: 
                            // JavaLine 1897 <== SourceLine 2347
                            {
                                // JavaLine 1899 <== SourceLine 2348
                                RTS_ENVIRONMENT.storeChar(((char)21),L2buf_4,L2p_4);
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 1904 <== SourceLine 2350
                                detach(2350);
                                ;
                                // JavaLine 1907 <== SourceLine 2352
                                if(_VALUE((((CLASS_SCANNER)(_CUR._SL)).opn==(((char)139))))) {
                                    {
                                        // JavaLine 1910 <== SourceLine 2353
                                        symx_4=new CLASS_COMMON_boxof((_CUR._SL),((CLASS_SCANNER)(_CUR._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                        ;
                                        // JavaLine 1913 <== SourceLine 2354
                                        pq_4=cbrec_4.favirt;
                                        ;
                                        // JavaLine 1916 <== SourceLine 2355
                                        while((pq_4!=(null))) {
                                            {
                                                // JavaLine 1919 <== SourceLine 2356
                                                if(_VALUE((pq_4.symb_1==(symx_4)))) {
                                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 1924 <== SourceLine 2357
                                                pq_4=((CLASS_COMMON_quantity)(pq_4.next));
                                            }
                                        }
                                        ;
                                        // JavaLine 1929 <== SourceLine 2358
                                        pq_4=((CLASS_COMMON_quantity)(cbrec_4.fpar.next));
                                        ;
                                        // JavaLine 1932 <== SourceLine 2359
                                        while((pq_4!=(null))) {
                                            {
                                                // JavaLine 1935 <== SourceLine 2360
                                                if(_VALUE(((pq_4.symb_1==(symx_4))&&((pq_4.kind_1==(((char)3))))))) {
                                                    {
                                                        // JavaLine 1938 <== SourceLine 2361
                                                        if(_VALUE((pq_4.plev_1<(200)))) {
                                                            pq_4.plev_1=(pq_4.plev_1+(1));
                                                        }
                                                        ;
                                                        // JavaLine 1943 <== SourceLine 2363
                                                        _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                                ;
                                                // JavaLine 1948 <== SourceLine 2364
                                                pq_4=((CLASS_COMMON_quantity)(pq_4.next));
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1957 <== SourceLine 2367
                                {
                                    _SIM_LABEL(21); // DeclaredIn: L2Coder -> L2Coder[CLASS_SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 1960 <== SourceLine 2368
                                    _GOTO(_LABEL_CLASS_SCANNER_L2Coder_Block1744_CheckNxt_0); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                            break;
                            default:
                            ;
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 1975 <== SourceLine 2382
                // BEGIN L2Coder INNER PART
                // ENDOF L2Coder INNER PART
                // ENDOF outcodefile INNER PART
                // ENDOF Outbytefile INNER PART
                // ENDOF Bytefile INNER PART
                // ENDOF File INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","8 L2Coder",1,1558,11,1745,13,1755,15,1790,17,1798,19,1851,21,1872,23,1900,25,1939,27,1942,29,1950,31,1983,33,2002,35,2025,37,2038,39,2115,41,2117,43,2211,45,2235,47,2254,49,2332,51,2368,54,1566,57,1567,60,1568,63,1569,66,1570,68,1571,70,1573,72,1574,74,1575,77,1576,79,1577,83,1578,85,1579,87,1580,90,1581,93,1582,97,1583,101,1587,103,1596,107,1757,109,1907,111,1909,113,1930,115,1978,117,2078,119,2092,121,2130,123,2170,125,2189,127,2270,129,2341,148,868,153,869,155,1738,158,1739,163,1742,166,1744,169,1745,172,1746,177,1747,186,1751,189,1754,192,1755,198,1757,204,1758,206,1757,208,1758,213,1759,220,1760,227,1761,232,1763,235,1764,239,1765,245,1766,251,1767,257,1768,260,1769,265,1770,282,1777,337,1789,339,1790,347,1791,366,1797,368,1798,374,1799,377,1800,380,1801,384,1802,391,1807,393,1808,398,1809,411,1813,413,1815,418,1816,421,1817,427,1819,429,1820,432,1821,438,1822,440,1823,443,1824,449,1826,451,1827,454,1828,460,1830,462,1831,465,1832,472,1842,474,1844,477,1845,482,1846,484,1847,489,1848,498,1849,500,1850,503,1851,511,1852,516,1854,521,1856,527,1859,529,1860,532,1861,535,1862,538,1863,544,1866,546,1867,552,1869,554,1870,559,1871,562,1872,566,1873,572,1875,574,1876,579,1877,586,1880,588,1881,591,1882,596,1884,599,1886,602,1887,605,1888,610,1889,613,1890,618,1893,620,1894,625,1895,630,1898,632,1899,635,1900,641,1901,648,1904,650,1905,653,1907,658,1908,660,1907,662,1908,665,1909,671,1910,673,1909,675,1912,680,1913,683,1914,686,1915,688,1916,692,1917,697,1918,702,1919,705,1920,710,1921,713,1922,716,1923,719,1924,724,1925,726,1926,730,1928,737,1929,742,1930,747,1931,749,1930,751,1932,754,1933,764,1935,767,1936,770,1937,775,1938,780,1939,790,1940,799,1942,805,1943,808,1945,811,1947,816,1948,821,1949,824,1950,829,1951,831,1953,835,1954,840,1956,845,1957,852,1959,855,1960,864,1974,867,1975,870,1977,875,1978,878,1980,888,1982,895,1983,897,1984,901,1985,908,1987,913,1989,926,1993,929,1994,935,1997,940,1998,948,2001,950,2002,960,2005,962,2006,965,2007,971,2010,978,2013,980,2014,987,2015,992,2016,997,2017,1000,2018,1003,2019,1006,2020,1014,2022,1017,2023,1020,2024,1027,2025,1035,2026,1040,2027,1046,2030,1048,2031,1051,2032,1054,2033,1061,2036,1063,2037,1066,2038,1072,2039,1075,2040,1078,2041,1081,2042,1086,2043,1091,2046,1093,2047,1098,2048,1105,2057,1107,2058,1114,2061,1116,2062,1119,2063,1124,2066,1126,2067,1133,2068,1138,2069,1143,2070,1146,2071,1153,2074,1155,2075,1158,2076,1165,2077,1168,2078,1179,2079,1182,2080,1189,2083,1191,2084,1196,2085,1203,2086,1206,2087,1211,2090,1213,2091,1216,2092,1222,2093,1224,2092,1226,2093,1234,2094,1244,2097,1246,2100,1252,2104,1254,2106,1256,2107,1260,2109,1265,2110,1268,2111,1273,2114,1275,2115,1283,2116,1286,2117,1290,2119,1295,2121,1298,2123,1304,2127,1306,2130,1311,2131,1313,2130,1315,2131,1320,2133,1325,2134,1328,2135,1338,2137,1344,2140,1346,2141,1349,2142,1355,2145,1357,2146,1362,2147,1365,2148,1368,2149,1375,2152,1377,2153,1380,2154,1382,2156,1386,2157,1388,2158,1391,2159,1395,2160,1400,2161,1407,2164,1409,2165,1412,2166,1414,2168,1418,2170,1423,2171,1425,2170,1427,2171,1429,2172,1432,2173,1436,2174,1438,2175,1443,2176,1455,2179,1461,2182,1463,2183,1466,2186,1471,2187,1473,2188,1477,2189,1482,2190,1484,2189,1486,2191,1489,2192,1499,2194,1504,2196,1506,2198,1508,2199,1511,2200,1514,2201,1517,2202,1523,2203,1526,2204,1531,2205,1541,2207,1543,2208,1551,2210,1553,2211,1565,2214,1568,2215,1571,2216,1578,2218,1591,2222,1597,2225,1599,2226,1602,2227,1608,2230,1610,2231,1618,2234,1620,2235,1626,2239,1629,2240,1632,2241,1634,2242,1640,2244,1646,2247,1648,2248,1652,2251,1655,2252,1660,2253,1665,2254,1671,2255,1674,2256,1679,2257,1685,2260,1687,2261,1695,2264,1697,2265,1702,2266,1707,2269,1709,2270,1724,2271,1729,2272,1734,2273,1737,2274,1746,2278,1748,2279,1751,2280,1754,2281,1757,2282,1766,2287,1768,2288,1770,2289,1773,2290,1780,2307,1782,2308,1791,2311,1793,2312,1796,2313,1801,2314,1806,2315,1811,2318,1813,2319,1818,2320,1823,2321,1831,2324,1833,2325,1836,2326,1844,2331,1848,2332,1855,2336,1857,2338,1860,2339,1863,2340,1868,2341,1874,2342,1876,2341,1878,2342,1883,2343,1897,2347,1899,2348,1904,2350,1907,2352,1910,2353,1913,2354,1916,2355,1919,2356,1924,2357,1929,2358,1932,2359,1935,2360,1938,2361,1943,2363,1948,2364,1957,2367,1960,2368,1975,2382,1991,2382);
} // End of Class
