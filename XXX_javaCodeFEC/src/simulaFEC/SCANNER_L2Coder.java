// JavaLine 1 <== SourceLine 1558
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class SCANNER_L2Coder extends COMMON_outcodefile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=4, firstLine=1558, lastLine=2382, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1745
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0=new RTS_LABEL(this,4,1,"NEXTOPN"); // Local Label #1=NEXTOPN At PrefixLevel 4
    // JavaLine 13 <== SourceLine 1755
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_CheckNxt_0=new RTS_LABEL(this,4,2,"CheckNxt"); // Local Label #2=CheckNxt At PrefixLevel 4
    // JavaLine 15 <== SourceLine 1790
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0=new RTS_LABEL(this,4,3,"OPNOUT"); // Local Label #3=OPNOUT At PrefixLevel 4
    // JavaLine 17 <== SourceLine 1798
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0=new RTS_LABEL(this,4,4,"OPDOUT"); // Local Label #4=OPDOUT At PrefixLevel 4
    // JavaLine 19 <== SourceLine 1851
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1844_Block1850_SINGLE_0=new RTS_LABEL(this,4,5,"SINGLE"); // Local Label #5=SINGLE At PrefixLevel 4
    // JavaLine 21 <== SourceLine 1872
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1870_SetQual_0=new RTS_LABEL(this,4,6,"SetQual"); // Local Label #6=SetQual At PrefixLevel 4
    // JavaLine 23 <== SourceLine 1900
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0=new RTS_LABEL(this,4,7,"BLOCKOUT"); // Local Label #7=BLOCKOUT At PrefixLevel 4
    // JavaLine 25 <== SourceLine 1939
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0=new RTS_LABEL(this,4,8,"NXTVIRT"); // Local Label #8=NXTVIRT At PrefixLevel 4
    // JavaLine 27 <== SourceLine 1942
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_EXvloop_0=new RTS_LABEL(this,4,9,"EXvloop"); // Local Label #9=EXvloop At PrefixLevel 4
    // JavaLine 29 <== SourceLine 1950
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_L1_0=new RTS_LABEL(this,4,10,"L1"); // Local Label #10=L1 At PrefixLevel 4
    // JavaLine 31 <== SourceLine 1983
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_FOUND_0=new RTS_LABEL(this,4,11,"FOUND"); // Local Label #11=FOUND At PrefixLevel 4
    // JavaLine 33 <== SourceLine 2002
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2002_btout_0=new RTS_LABEL(this,4,12,"btout"); // Local Label #12=btout At PrefixLevel 4
    // JavaLine 35 <== SourceLine 2025
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2014_Qfound_0=new RTS_LABEL(this,4,13,"Qfound"); // Local Label #13=Qfound At PrefixLevel 4
    // JavaLine 37 <== SourceLine 2038
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2037_genlab_0=new RTS_LABEL(this,4,14,"genlab"); // Local Label #14=genlab At PrefixLevel 4
    // JavaLine 39 <== SourceLine 2115
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2115_lidclp_0=new RTS_LABEL(this,4,15,"lidclp"); // Local Label #15=lidclp At PrefixLevel 4
    // JavaLine 41 <== SourceLine 2117
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2115_genbrc_0=new RTS_LABEL(this,4,16,"genbrc"); // Local Label #16=genbrc At PrefixLevel 4
    // JavaLine 43 <== SourceLine 2211
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0=new RTS_LABEL(this,4,17,"Nspec"); // Local Label #17=Nspec At PrefixLevel 4
    // JavaLine 45 <== SourceLine 2235
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2235_LIFWHN_0=new RTS_LABEL(this,4,18,"LIFWHN"); // Local Label #18=LIFWHN At PrefixLevel 4
    // JavaLine 47 <== SourceLine 2254
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0=new RTS_LABEL(this,4,19,"QBLOCKOUT"); // Local Label #19=QBLOCKOUT At PrefixLevel 4
    // JavaLine 49 <== SourceLine 2332
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_LIHIDD_0=new RTS_LABEL(this,4,20,"LIHIDD"); // Local Label #20=LIHIDD At PrefixLevel 4
    // JavaLine 51 <== SourceLine 2368
    final RTS_LABEL _LABEL_SCANNER_L2Coder_Block1744_Block2348_NonLoc_0=new RTS_LABEL(this,4,21,"NonLoc"); // Local Label #21=NonLoc At PrefixLevel 4
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
    public COMMON_symbolbox symx_4=null;
    // JavaLine 85 <== SourceLine 1579
    public COMMON_quantity firstarr_4=null;
    // JavaLine 87 <== SourceLine 1580
    public COMMON_idpack fvis_4=null;
    public COMMON_idpack x_4=null;
    // JavaLine 90 <== SourceLine 1581
    public COMMON_quantity pq_4=null;
    public COMMON_quantity virq_4=null;
    // JavaLine 93 <== SourceLine 1582
    public COMMON_brecord cbrec_4=null;
    public COMMON_brecord xbrec_4=null;
    public COMMON_brecord forbrec_4=null;
    // JavaLine 97 <== SourceLine 1583
    public COMMON_quantity cquant_4=null;
    public COMMON_quantity vquant_4=null;
    public COMMON_quantity xquant_4=null;
    // JavaLine 101 <== SourceLine 1587
    public COMMON_quantity p_or_c_qt_4=null;
    // JavaLine 103 <== SourceLine 1596
    public COMMON_idpack cvispack_4=null;
    public COMMON_brecord lastBrec_4=null;
    public RTS_TXT L2buf_4=null;
    // JavaLine 107 <== SourceLine 1757
    public RTS_Printfile _inspect_1757_4482_4=null;
    // JavaLine 109 <== SourceLine 1907
    public COMMON_brecord _inspect_1907_4483_4=null;
    // JavaLine 111 <== SourceLine 1909
    public COMMON_quantity _inspect_1909_4484_4=null;
    // JavaLine 113 <== SourceLine 1930
    public COMMON_idpack _inspect_1930_4485_4=null;
    // JavaLine 115 <== SourceLine 1978
    public COMMON_idpack _inspect_1977_4486_4=null;
    // JavaLine 117 <== SourceLine 2078
    public COMMON_symbolbox _inspect_2078_4487_4=null;
    // JavaLine 119 <== SourceLine 2092
    public COMMON_quantity _inspect_2092_4488_4=null;
    // JavaLine 121 <== SourceLine 2130
    public COMMON_quantity _inspect_2130_4489_4=null;
    // JavaLine 123 <== SourceLine 2170
    public COMMON_quantity _inspect_2170_4490_4=null;
    // JavaLine 125 <== SourceLine 2189
    public COMMON_idpack _inspect_2189_4491_4=null;
    // JavaLine 127 <== SourceLine 2270
    public RTS_Printfile _inspect_2270_4492_4=null;
    // JavaLine 129 <== SourceLine 2341
    public RTS_Printfile _inspect_2341_4493_4=null;
    // Normal Constructor
    public SCANNER_L2Coder(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
        L2limit_4=(256-(7));
    }
    // Class Statements
    @Override
    public SCANNER_L2Coder _STM() {
        SCANNER_L2Coder _THIS=(SCANNER_L2Coder)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,21); // For ByteCode Engineering
                // BEGIN INNER PART
                // BEGIN INNER PART
                // BEGIN INNER PART
                // JavaLine 148 <== SourceLine 868
                // BEGIN INNER PART
                // JavaLine 150 <== SourceLine 1738
                detach(1738);
                ;
                // JavaLine 153 <== SourceLine 1739
                ((SCANNER)(_CUR._SL)).L2codebuffer=L2buf_4=RTS_ENVIRONMENT.blanks(256);
                ;
                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_CheckNxt_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 158 <== SourceLine 1742
                while(true) {
                    {
                        // JavaLine 161 <== SourceLine 1744
                        {
                            _SIM_LABEL(1); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                            // JavaLine 164 <== SourceLine 1745
                            if(_VALUE((lastlinenr_4<(((SCANNER)(_CUR._SL)).linenr)))) {
                                {
                                    // JavaLine 167 <== SourceLine 1746
                                    if(_VALUE((L2p_4>((256-(4)))))) {
                                        new SCANNER_L2Coder_outbuffer((_CUR));
                                    }
                                    ;
                                    // JavaLine 172 <== SourceLine 1747
                                    lastlinenr_4=((SCANNER)(_CUR._SL)).linenr;
                                    ;
                                    new SCANNER_L2Coder_storecharint((_CUR),((char)133),lastlinenr_4);
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 181 <== SourceLine 1751
                        detach(1751);
                        ;
                        // JavaLine 184 <== SourceLine 1754
                        {
                            _SIM_LABEL(2); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                            // JavaLine 187 <== SourceLine 1755
                            if(_VALUE((L2p_4>(L2limit_4)))) {
                                new SCANNER_L2Coder_outbuffer((_CUR));
                            }
                        }
                        ;
                        // JavaLine 193 <== SourceLine 1757
                        if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_1757_4482_4=RTS_BASICIO.sysout();
                                if(_inspect_1757_4482_4!=null) { // INSPECT _inspect_1757_4482_4
                                    // JavaLine 199 <== SourceLine 1758
                                    {
                                        // JavaLine 201 <== SourceLine 1757
                                        {
                                            // JavaLine 203 <== SourceLine 1758
                                            if(_VALUE((_inspect_1757_4482_4.pos()>(1)))) {
                                                _inspect_1757_4482_4.outimage();
                                            }
                                            ;
                                            // JavaLine 208 <== SourceLine 1759
                                            _inspect_1757_4482_4.outtext(new RTS_TXT(" L2output: (l. "));
                                            ;
                                            _inspect_1757_4482_4.outint(((SCANNER)(_CUR._SL)).linenr,5);
                                            ;
                                            _inspect_1757_4482_4.outchar(')');
                                            ;
                                            // JavaLine 215 <== SourceLine 1760
                                            _inspect_1757_4482_4.outtext(new RTS_TXT(" OPN="));
                                            ;
                                            _inspect_1757_4482_4.outtext(((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opn)));
                                            ;
                                            _inspect_1757_4482_4.setpos(32);
                                            ;
                                            // JavaLine 222 <== SourceLine 1761
                                            if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                                {
                                                    _inspect_1757_4482_4.outtext(CONC(CONC(new RTS_TXT("OPD="),((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).optx))),new RTS_TXT(" ")));
                                                    ;
                                                    // JavaLine 227 <== SourceLine 1763
                                                    if(_VALUE((((SCANNER)(_CUR._SL)).optx==(((char)2))))) {
                                                        {
                                                            // JavaLine 230 <== SourceLine 1764
                                                            if(_VALUE(((((SCANNER)(_CUR._SL)).opdlo>(((char)32)))&((((SCANNER)(_CUR._SL)).opdlo<(((char)127))))))) {
                                                                _inspect_1757_4482_4.outchar(((SCANNER)(_CUR._SL)).opdlo);
                                                            } else {
                                                                // JavaLine 234 <== SourceLine 1765
                                                                {
                                                                    _inspect_1757_4482_4.outchar('!');
                                                                    ;
                                                                    _inspect_1757_4482_4.outint(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdlo),0);
                                                                    ;
                                                                    // JavaLine 240 <== SourceLine 1766
                                                                    _inspect_1757_4482_4.outchar('!');
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        // JavaLine 246 <== SourceLine 1767
                                                        _inspect_1757_4482_4.outtext(new COMMON_nameof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT);
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 252 <== SourceLine 1768
                                                if(_VALUE(((((SCANNER)(_CUR._SL)).opdlo!=(((char)0)))||((((SCANNER)(_CUR._SL)).opdhi!=(((char)0))))))) {
                                                    {
                                                        // JavaLine 255 <== SourceLine 1769
                                                        _inspect_1757_4482_4.outtext(new RTS_TXT("OPD=("));
                                                        ;
                                                        _inspect_1757_4482_4.outint(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdhi),0);
                                                        ;
                                                        // JavaLine 260 <== SourceLine 1770
                                                        _inspect_1757_4482_4.outchar(',');
                                                        ;
                                                        _inspect_1757_4482_4.outint(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdlo),0);
                                                        ;
                                                        _inspect_1757_4482_4.outchar(')');
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
                        // JavaLine 277 <== SourceLine 1777
                        if(((SCANNER)(_CUR._SL)).opn<((char)0) || ((SCANNER)(_CUR._SL)).opn>((char)148)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((SCANNER)(_CUR._SL)).opn) { // BEGIN SWITCH STATEMENT
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
                            // JavaLine 332 <== SourceLine 1789
                            {
                                // JavaLine 334 <== SourceLine 1790
                                {
                                    _SIM_LABEL(3); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opn,L2buf_4,L2p_4);
                                }
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 342 <== SourceLine 1791
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
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
                            // JavaLine 361 <== SourceLine 1797
                            {
                                // JavaLine 363 <== SourceLine 1798
                                {
                                    _SIM_LABEL(4); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opn,L2buf_4,L2p_4);
                                }
                                ;
                                // JavaLine 369 <== SourceLine 1799
                                RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdhi,L2buf_4,(L2p_4+(1)));
                                ;
                                // JavaLine 372 <== SourceLine 1800
                                RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(2)));
                                ;
                                // JavaLine 375 <== SourceLine 1801
                                L2p_4=(L2p_4+(3));
                                ;
                                ;
                                // JavaLine 379 <== SourceLine 1802
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 63: 
                            case 89: 
                            // JavaLine 386 <== SourceLine 1807
                            {
                                // JavaLine 388 <== SourceLine 1808
                                lastlinenr_4=((SCANNER)(_CUR._SL)).linenr;
                                ;
                                new SCANNER_L2Coder_storecharint((_CUR),((SCANNER)(_CUR._SL)).opn,lastlinenr_4);
                                ;
                                // JavaLine 393 <== SourceLine 1809
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
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
                            // JavaLine 406 <== SourceLine 1813
                            {
                                // JavaLine 408 <== SourceLine 1815
                                ctype_4=((SCANNER)(_CUR._SL)).opn;
                                ;
                                ckind_4=((char)0);
                                ;
                                // JavaLine 413 <== SourceLine 1816
                                cqual_4=0;
                                ;
                                // JavaLine 416 <== SourceLine 1817
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 13: 
                            // JavaLine 422 <== SourceLine 1819
                            {
                                // JavaLine 424 <== SourceLine 1820
                                ckind_4=((char)2);
                                ;
                                // JavaLine 427 <== SourceLine 1821
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 12: 
                            // JavaLine 433 <== SourceLine 1822
                            {
                                // JavaLine 435 <== SourceLine 1823
                                ckind_4=((char)1);
                                ;
                                // JavaLine 438 <== SourceLine 1824
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 30: 
                            // JavaLine 444 <== SourceLine 1826
                            {
                                // JavaLine 446 <== SourceLine 1827
                                ckind_4=((char)5);
                                ;
                                // JavaLine 449 <== SourceLine 1828
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 31: 
                            // JavaLine 455 <== SourceLine 1830
                            {
                                // JavaLine 457 <== SourceLine 1831
                                ckind_4=((char)7);
                                ;
                                // JavaLine 460 <== SourceLine 1832
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 138: 
                            case 91: 
                            // JavaLine 467 <== SourceLine 1842
                            {
                                // JavaLine 469 <== SourceLine 1844
                                RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).optx,L2buf_4,L2p_4);
                                ;
                                // JavaLine 472 <== SourceLine 1845
                                if(((SCANNER)(_CUR._SL)).optx<((char)0) || ((SCANNER)(_CUR._SL)).optx>((char)8)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((SCANNER)(_CUR._SL)).optx) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    case 2: 
                                    // JavaLine 477 <== SourceLine 1846
                                    {
                                        // JavaLine 479 <== SourceLine 1847
                                        RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(1)));
                                        ;
                                        L2p_4=(L2p_4+(2));
                                        ;
                                        // JavaLine 484 <== SourceLine 1848
                                        _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    case 3: 
                                    case 4: 
                                    case 5: 
                                    case 6: 
                                    case 8: 
                                    // JavaLine 493 <== SourceLine 1849
                                    {
                                        // JavaLine 495 <== SourceLine 1850
                                        RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdhi,L2buf_4,(L2p_4+(1)));
                                        ;
                                        // JavaLine 498 <== SourceLine 1851
                                        {
                                            _SIM_LABEL(5); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                            RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(2)));
                                        }
                                        ;
                                        L2p_4=(L2p_4+(3));
                                        ;
                                        // JavaLine 506 <== SourceLine 1852
                                        _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    default:
                                    // JavaLine 511 <== SourceLine 1854
                                    L2p_4=(L2p_4+(1));
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 516 <== SourceLine 1856
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 47: 
                            case 11: 
                            // JavaLine 522 <== SourceLine 1859
                            {
                                // JavaLine 524 <== SourceLine 1860
                                ctype_4=((char)11);
                                ;
                                // JavaLine 527 <== SourceLine 1861
                                ckind_4=(((((SCANNER)(_CUR._SL)).opn==(((char)11))))?(((char)3)):(((char)4)));
                                ;
                                // JavaLine 530 <== SourceLine 1862
                                cqual_4=0;
                                ;
                                // JavaLine 533 <== SourceLine 1863
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 107: 
                            // JavaLine 539 <== SourceLine 1866
                            {
                                // JavaLine 541 <== SourceLine 1867
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1870_SetQual_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 7: 
                            // JavaLine 547 <== SourceLine 1869
                            {
                                // JavaLine 549 <== SourceLine 1870
                                ctype_4=((char)7);
                                ;
                                ckind_4=((char)0);
                                ;
                                // JavaLine 554 <== SourceLine 1871
                                {
                                    _SIM_LABEL(6); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 557 <== SourceLine 1872
                                    cqual_4=((RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdlo)));
                                }
                                ;
                                // JavaLine 561 <== SourceLine 1873
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 132: 
                            // JavaLine 567 <== SourceLine 1875
                            {
                                // JavaLine 569 <== SourceLine 1876
                                lanhi_4=((SCANNER)(_CUR._SL)).opdhi;
                                ;
                                lanlo_4=((SCANNER)(_CUR._SL)).opdlo;
                                ;
                                // JavaLine 574 <== SourceLine 1877
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 110: 
                            case 42: 
                            // JavaLine 581 <== SourceLine 1880
                            {
                                // JavaLine 583 <== SourceLine 1881
                                ckind_4=(((((SCANNER)(_CUR._SL)).opn==('n')))?(((char)5)):(((char)7)));
                                ;
                                // JavaLine 586 <== SourceLine 1882
                                ctype_4=((char)14);
                                ;
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 591 <== SourceLine 1884
                                p_or_c_qt_4=cquant_4;
                                ;
                                // JavaLine 594 <== SourceLine 1886
                                new SCANNER_L2Coder_brecinit((_CUR),ckind_4);
                                ;
                                // JavaLine 597 <== SourceLine 1887
                                p_or_c_qt_4.descr_1=cbrec_4;
                                ;
                                // JavaLine 600 <== SourceLine 1888
                                if(_VALUE((ckind_4==(((char)7))))) {
                                    cbrec_4.declquant=p_or_c_qt_4;
                                }
                                ;
                                // JavaLine 605 <== SourceLine 1889
                                p_or_c_qt_4.ftag_1=(-(cqual_4));
                                ;
                                // JavaLine 608 <== SourceLine 1890
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 32: 
                            // JavaLine 613 <== SourceLine 1893
                            {
                                // JavaLine 615 <== SourceLine 1894
                                new SCANNER_L2Coder_brecinit((_CUR),((char)9));
                                ;
                                cbrec_4.stmtag=cbrec_4.inrtag=((char)2);
                                ;
                                // JavaLine 620 <== SourceLine 1895
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 92: 
                            // JavaLine 625 <== SourceLine 1898
                            {
                                // JavaLine 627 <== SourceLine 1899
                                new SCANNER_L2Coder_brecinit((_CUR),((char)8));
                                ;
                                // JavaLine 630 <== SourceLine 1900
                                {
                                    _SIM_LABEL(7); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    new SCANNER_L2Coder_store3chars((_CUR),((SCANNER)(_CUR._SL)).opn,cbrec_4.blnohi,cbrec_4.blnolo);
                                }
                                ;
                                // JavaLine 636 <== SourceLine 1901
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 117: 
                            case 16: 
                            // JavaLine 643 <== SourceLine 1904
                            {
                                // JavaLine 645 <== SourceLine 1905
                                if(_VALUE((cbrec_4.kind==(((char)5))))) {
                                    {
                                        // JavaLine 648 <== SourceLine 1907
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1907_4483_4=cbrec_4;
                                            if(_inspect_1907_4483_4!=null) { // INSPECT _inspect_1907_4483_4
                                                // JavaLine 653 <== SourceLine 1908
                                                {
                                                    // JavaLine 655 <== SourceLine 1907
                                                    {
                                                        // JavaLine 657 <== SourceLine 1908
                                                        virq_4=_inspect_1907_4483_4.favirt;
                                                        ;
                                                        // JavaLine 660 <== SourceLine 1909
                                                        while(true) {
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_1909_4484_4=virq_4;
                                                                if(_inspect_1909_4484_4!=null) { // INSPECT _inspect_1909_4484_4
                                                                    // JavaLine 666 <== SourceLine 1910
                                                                    {
                                                                        // JavaLine 668 <== SourceLine 1909
                                                                        {
                                                                            // JavaLine 670 <== SourceLine 1912
                                                                            if(_VALUE((_inspect_1909_4484_4.kind_1!=(((char)1))))) {
                                                                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0); // GOTO EVALUATED LABEL
                                                                            }
                                                                            ;
                                                                            // JavaLine 675 <== SourceLine 1913
                                                                            pq_4=((COMMON_quantity)(_inspect_1907_4483_4.fpar.next));
                                                                            ;
                                                                            // JavaLine 678 <== SourceLine 1914
                                                                            while((pq_4!=(null))) {
                                                                                {
                                                                                    // JavaLine 681 <== SourceLine 1915
                                                                                    if(_VALUE((pq_4.symb_1==(_inspect_1909_4484_4.symb_1)))) {
                                                                                        // JavaLine 683 <== SourceLine 1916
                                                                                        _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1912_NXTVIRT_0); // GOTO EVALUATED LABEL
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 687 <== SourceLine 1917
                                                                                    pq_4=((COMMON_quantity)(pq_4.next));
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 692 <== SourceLine 1918
                                                                            ctype_4=_inspect_1909_4484_4.type_1;
                                                                            ;
                                                                            ckind_4=((char)1);
                                                                            ;
                                                                            // JavaLine 697 <== SourceLine 1919
                                                                            new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                                                            ;
                                                                            // JavaLine 700 <== SourceLine 1920
                                                                            cquant_4.line_1=_inspect_1909_4484_4.line_1;
                                                                            ;
                                                                            cquant_4.ftag_1=_inspect_1909_4484_4.ftag_1;
                                                                            ;
                                                                            // JavaLine 705 <== SourceLine 1921
                                                                            cquant_4.symb_1=_inspect_1909_4484_4.symb_1;
                                                                            ;
                                                                            // JavaLine 708 <== SourceLine 1922
                                                                            cquant_4.dim_1=78;
                                                                            ;
                                                                            // JavaLine 711 <== SourceLine 1923
                                                                            xquant_4=cquant_4;
                                                                            ;
                                                                            // JavaLine 714 <== SourceLine 1924
                                                                            new SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                                            ;
                                                                            xquant_4.descr_1=cbrec_4;
                                                                            ;
                                                                            // JavaLine 719 <== SourceLine 1925
                                                                            if(_VALUE((_inspect_1909_4484_4.descr_1!=(null)))) {
                                                                                // JavaLine 721 <== SourceLine 1926
                                                                                cbrec_4.fpar.next=_inspect_1909_4484_4.descr_1.fpar;
                                                                            }
                                                                            ;
                                                                            // JavaLine 725 <== SourceLine 1928
                                                                            xbrec_4=cbrec_4;
                                                                            ;
                                                                            cbrec_4.line1=_inspect_1909_4484_4.line_1;
                                                                            ;
                                                                            new SCANNER_L2Coder_brecterm((_CUR));
                                                                            ;
                                                                            // JavaLine 732 <== SourceLine 1929
                                                                            new SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                                            ;
                                                                            cbrec_4.line1=_inspect_1909_4484_4.line_1;
                                                                            ;
                                                                            // JavaLine 737 <== SourceLine 1930
                                                                            {
                                                                                // BEGIN INSPECTION 
                                                                                _inspect_1930_4485_4=new COMMON_idpack((_CUR._SL))._STM();
                                                                                if(_inspect_1930_4485_4!=null) { // INSPECT _inspect_1930_4485_4
                                                                                    // JavaLine 742 <== SourceLine 1931
                                                                                    {
                                                                                        // JavaLine 744 <== SourceLine 1930
                                                                                        {
                                                                                            // JavaLine 746 <== SourceLine 1932
                                                                                            cbrec_4.hidlist=((COMMON_idpack)_inspect_1930_4485_4);
                                                                                            ;
                                                                                            // JavaLine 749 <== SourceLine 1933
                                                                                            _inspect_1930_4485_4.idhi=xbrec_4.blnohi;
                                                                                            ;
                                                                                            _inspect_1930_4485_4.idlo=xbrec_4.blnolo;
                                                                                            ;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } // END INSPECTION
                                                                            ;
                                                                            // JavaLine 759 <== SourceLine 1935
                                                                            new SCANNER_L2Coder_store3chars((_CUR),'g',cbrec_4.blnohi,cbrec_4.blnolo);
                                                                            ;
                                                                            // JavaLine 762 <== SourceLine 1936
                                                                            new SCANNER_L2Coder_brecterm((_CUR));
                                                                            ;
                                                                            // JavaLine 765 <== SourceLine 1937
                                                                            RTS_ENVIRONMENT.storeChar('y',L2buf_4,L2p_4);
                                                                            ;
                                                                            L2p_4=(L2p_4+(1));
                                                                            ;
                                                                            // JavaLine 770 <== SourceLine 1938
                                                                            if(_VALUE((L2p_4>(L2limit_4)))) {
                                                                                new SCANNER_L2Coder_outbuffer((_CUR));
                                                                            }
                                                                            ;
                                                                            // JavaLine 775 <== SourceLine 1939
                                                                            {
                                                                                _SIM_LABEL(8); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                                                                virq_4=((COMMON_quantity)(_inspect_1909_4484_4.next));
                                                                            }
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                                else { // OTHERWISE 
                                                                    // JavaLine 785 <== SourceLine 1940
                                                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_EXvloop_0); // GOTO EVALUATED LABEL
                                                                } // END OTHERWISE 
                                                            } // END INSPECTION
                                                            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                                        }
                                                        ;
                                                        {
                                                            _SIM_LABEL(9); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                                            // JavaLine 794 <== SourceLine 1942
                                                            fvis_4=_inspect_1907_4483_4.hidlist;
                                                        }
                                                        ;
                                                        _inspect_1907_4483_4.hidlist=x_4=null;
                                                        ;
                                                        // JavaLine 800 <== SourceLine 1943
                                                        while((fvis_4!=(null))) {
                                                            {
                                                                // JavaLine 803 <== SourceLine 1945
                                                                if(_VALUE(_IS(fvis_4,SCANNER_protpack.class))) {
                                                                    {
                                                                        // JavaLine 806 <== SourceLine 1947
                                                                        iihi_4=fvis_4.idhi;
                                                                        ;
                                                                        iilo_4=fvis_4.idlo;
                                                                        ;
                                                                        // JavaLine 811 <== SourceLine 1948
                                                                        locals_4=false;
                                                                        ;
                                                                        notok_4=true;
                                                                        ;
                                                                        // JavaLine 816 <== SourceLine 1949
                                                                        pq_4=_inspect_1907_4483_4.favirt;
                                                                        ;
                                                                        // JavaLine 819 <== SourceLine 1950
                                                                        {
                                                                            _SIM_LABEL(10); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                                                            while((pq_4!=(null))) {
                                                                                {
                                                                                    // JavaLine 824 <== SourceLine 1951
                                                                                    if(_VALUE(((pq_4.symb_1==(new COMMON_boxof((_CUR._SL),iihi_4,iilo_4)._RESULT))&&(((pq_4.protect_1==(((char)0)))||((pq_4.type_1==(((char)11))))))))) {
                                                                                        // JavaLine 826 <== SourceLine 1953
                                                                                        {
                                                                                            pq_4.protect_1=((char)1);
                                                                                            ;
                                                                                            // JavaLine 830 <== SourceLine 1954
                                                                                            if(_VALUE(locals_4)) {
                                                                                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_FOUND_0); // GOTO EVALUATED LABEL
                                                                                            }
                                                                                            ;
                                                                                            // JavaLine 835 <== SourceLine 1956
                                                                                            notok_4=false;
                                                                                        }
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 840 <== SourceLine 1957
                                                                                    pq_4=((COMMON_quantity)(pq_4.next));
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 847 <== SourceLine 1959
                                                                        if(_VALUE((!(locals_4)))) {
                                                                            {
                                                                                // JavaLine 850 <== SourceLine 1960
                                                                                locals_4=true;
                                                                                ;
                                                                                pq_4=((COMMON_quantity)(_inspect_1907_4483_4.fpar.next));
                                                                                ;
                                                                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1905_Block1907_Block1908_Block1945_Block1947_L1_0); // GOTO EVALUATED LABEL
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 859 <== SourceLine 1974
                                                                        if(_VALUE(notok_4)) {
                                                                            {
                                                                                // JavaLine 862 <== SourceLine 1975
                                                                                new ERRMSG_error1id((_CUR._SL),-290,new COMMON_boxof((_CUR._SL),iihi_4,iilo_4)._RESULT);
                                                                                ;
                                                                                // JavaLine 865 <== SourceLine 1977
                                                                                {
                                                                                    // BEGIN INSPECTION 
                                                                                    _inspect_1977_4486_4=fvis_4.next;
                                                                                    if(_inspect_1977_4486_4!=null) { // INSPECT _inspect_1977_4486_4
                                                                                        // JavaLine 870 <== SourceLine 1978
                                                                                        {
                                                                                            if(_VALUE((((_inspect_1977_4486_4.idlo==(iilo_4))&&((_inspect_1977_4486_4.idhi==(iihi_4))))&&(_IS(((COMMON_idpack)_inspect_1977_4486_4),COMMON_idpack.class))))) {
                                                                                                // JavaLine 873 <== SourceLine 1980
                                                                                                fvis_4=fvis_4.next;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } // END INSPECTION
                                                                                ;
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 883 <== SourceLine 1982
                                                                        {
                                                                            _SIM_LABEL(11); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                                                            ;
                                                                        }
                                                                    }
                                                                } else {
                                                                    // JavaLine 890 <== SourceLine 1983
                                                                    {
                                                                        // JavaLine 892 <== SourceLine 1984
                                                                        if(_VALUE((x_4==(null)))) {
                                                                            x_4=_inspect_1907_4483_4.hidlist=fvis_4;
                                                                        } else {
                                                                            // JavaLine 896 <== SourceLine 1985
                                                                            x_4=x_4.next=fvis_4;
                                                                        }
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 903 <== SourceLine 1987
                                                                fvis_4=fvis_4.next;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 908 <== SourceLine 1989
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
                                // JavaLine 921 <== SourceLine 1993
                                if(_VALUE((((SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    {
                                        // JavaLine 924 <== SourceLine 1994
                                        cbrec_4.stmtag=((char)2);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 930 <== SourceLine 1997
                                lastlinenr_4=((SCANNER)(_CUR._SL)).linenr;
                                ;
                                new SCANNER_L2Coder_storecharint((_CUR),'Y',lastlinenr_4);
                                ;
                                // JavaLine 935 <== SourceLine 1998
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2002_btout_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 126: 
                            case 106: 
                            case 37: 
                            case 53: 
                            // JavaLine 943 <== SourceLine 2001
                            {
                                // JavaLine 945 <== SourceLine 2002
                                {
                                    _SIM_LABEL(12); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    new SCANNER_L2Coder_brecterm((_CUR));
                                }
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 26: 
                            // JavaLine 955 <== SourceLine 2005
                            {
                                // JavaLine 957 <== SourceLine 2006
                                if(_VALUE((((SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    {
                                        // JavaLine 960 <== SourceLine 2007
                                        cbrec_4.stmtag=((char)2);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 966 <== SourceLine 2010
                                cbrec_4.inrtag=((char)2);
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 56: 
                            // JavaLine 973 <== SourceLine 2013
                            {
                                // JavaLine 975 <== SourceLine 2014
                                ctype_4=((SCANNER)(_CUR._SL)).optx;
                                ;
                                ckind_4=((char)0);
                                ;
                                cqual_4=0;
                                ;
                                // JavaLine 982 <== SourceLine 2015
                                xbrec_4=cbrec_4;
                                ;
                                xquant_4=cquant_4;
                                ;
                                // JavaLine 987 <== SourceLine 2016
                                while((cbrec_4.kind==(((char)11)))) {
                                    cbrec_4=cbrec_4.fpar.encl_1;
                                }
                                ;
                                // JavaLine 992 <== SourceLine 2017
                                cquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 995 <== SourceLine 2018
                                while((cquant_4.next!=(null))) {
                                    {
                                        // JavaLine 998 <== SourceLine 2019
                                        cquant_4=((COMMON_quantity)(cquant_4.next));
                                        ;
                                        // JavaLine 1001 <== SourceLine 2020
                                        if(_VALUE((cquant_4.symb_1==(new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT)))) {
                                            _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2014_Qfound_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1009 <== SourceLine 2022
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1012 <== SourceLine 2023
                                if(_VALUE((ctype_4==(((char)11))))) {
                                    {
                                        // JavaLine 1015 <== SourceLine 2024
                                        cquant_4.kind_1=((char)3);
                                        ;
                                        cquant_4.dim_1=1;
                                    }
                                }
                                ;
                                // JavaLine 1022 <== SourceLine 2025
                                {
                                    _SIM_LABEL(13); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    cbrec_4=xbrec_4;
                                }
                                ;
                                cquant_4=xquant_4;
                                ;
                                // JavaLine 1030 <== SourceLine 2026
                                if(_VALUE((ctype_4==(((char)11))))) {
                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1035 <== SourceLine 2027
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 113: 
                            // JavaLine 1041 <== SourceLine 2030
                            {
                                // JavaLine 1043 <== SourceLine 2031
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1046 <== SourceLine 2032
                                dimcount_4=0;
                                ;
                                // JavaLine 1049 <== SourceLine 2033
                                ckind_4=((char)4);
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2037_genlab_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 77: 
                            // JavaLine 1056 <== SourceLine 2036
                            {
                                // JavaLine 1058 <== SourceLine 2037
                                ckind_4=((char)3);
                                ;
                                // JavaLine 1061 <== SourceLine 2038
                                {
                                    _SIM_LABEL(14); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    ctype_4=((char)11);
                                }
                                ;
                                // JavaLine 1067 <== SourceLine 2039
                                cqual_4=0;
                                ;
                                // JavaLine 1070 <== SourceLine 2040
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1073 <== SourceLine 2041
                                cquant_4.protect_1=((char)1);
                                ;
                                // JavaLine 1076 <== SourceLine 2042
                                if(_VALUE((((SCANNER)(_CUR._SL)).opn==('8')))) {
                                    cquant_4.dim_1=1;
                                }
                                ;
                                // JavaLine 1081 <== SourceLine 2043
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 94: 
                            // JavaLine 1086 <== SourceLine 2046
                            {
                                // JavaLine 1088 <== SourceLine 2047
                                ckind_4=((char)0);
                                ;
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1093 <== SourceLine 2048
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 144: 
                            case 114: 
                            // JavaLine 1100 <== SourceLine 2057
                            {
                                // JavaLine 1102 <== SourceLine 2058
                                dimcount_4=(dimcount_4+(1));
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 143: 
                            // JavaLine 1109 <== SourceLine 2061
                            {
                                // JavaLine 1111 <== SourceLine 2062
                                cquant_4.dim_1=dimcount_4;
                                ;
                                // JavaLine 1114 <== SourceLine 2063
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 140: 
                            // JavaLine 1119 <== SourceLine 2066
                            {
                                // JavaLine 1121 <== SourceLine 2067
                                cquant_4.kind_1=((char)6);
                                ;
                                cquant_4.dim_1=1;
                                ;
                                cquant_4.encl_1=cbrec_4;
                                ;
                                // JavaLine 1128 <== SourceLine 2068
                                xquant_4=cquant_4;
                                ;
                                new SCANNER_L2Coder_brecinit((_CUR),((char)6));
                                ;
                                // JavaLine 1133 <== SourceLine 2069
                                xquant_4.descr_1=cbrec_4;
                                ;
                                cbrec_4.declquant=xquant_4;
                                ;
                                // JavaLine 1138 <== SourceLine 2070
                                cbrec_4.line1=((SCANNER)(_CUR._SL)).repcount_2;
                                ;
                                // JavaLine 1141 <== SourceLine 2071
                                new SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 97: 
                            // JavaLine 1148 <== SourceLine 2074
                            {
                                // JavaLine 1150 <== SourceLine 2075
                                cquant_4.kind_1=((char)2);
                                ;
                                // JavaLine 1153 <== SourceLine 2076
                                dimcount_4=0;
                                ;
                                if(_VALUE((firstarr_4==(null)))) {
                                    firstarr_4=cquant_4;
                                }
                                ;
                                // JavaLine 1160 <== SourceLine 2077
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1163 <== SourceLine 2078
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2078_4487_4=cquant_4.symb_1;
                                    if(_inspect_2078_4487_4!=null) { // INSPECT _inspect_2078_4487_4
                                        {
                                            new SCANNER_L2Coder_store3chars((_CUR),'m',_inspect_2078_4487_4.idhi,_inspect_2078_4487_4.idlo);
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1174 <== SourceLine 2079
                                new SCANNER_L2Coder_store3chars((_CUR),((char)4),((char)127),((char)255));
                                ;
                                // JavaLine 1177 <== SourceLine 2080
                                ((SCANNER)(_CUR._SL)).opn='f';
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 109: 
                            // JavaLine 1184 <== SourceLine 2083
                            {
                                // JavaLine 1186 <== SourceLine 2084
                                ckind_4=((char)2);
                                ;
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1191 <== SourceLine 2085
                                dimcount_4=0;
                                ;
                                if(_VALUE((firstarr_4==(null)))) {
                                    firstarr_4=cquant_4;
                                }
                                ;
                                // JavaLine 1198 <== SourceLine 2086
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1201 <== SourceLine 2087
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 99: 
                            // JavaLine 1206 <== SourceLine 2090
                            {
                                // JavaLine 1208 <== SourceLine 2091
                                dimcount_4=(dimcount_4+(1));
                                ;
                                // JavaLine 1211 <== SourceLine 2092
                                while(true) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_2092_4488_4=firstarr_4;
                                        if(_inspect_2092_4488_4!=null) { // INSPECT _inspect_2092_4488_4
                                            // JavaLine 1217 <== SourceLine 2093
                                            {
                                                // JavaLine 1219 <== SourceLine 2092
                                                {
                                                    // JavaLine 1221 <== SourceLine 2093
                                                    _inspect_2092_4488_4.dim_1=dimcount_4;
                                                    ;
                                                    firstarr_4=((COMMON_quantity)(_inspect_2092_4488_4.next));
                                                }
                                            }
                                        }
                                        else { // OTHERWISE 
                                            // JavaLine 1229 <== SourceLine 2094
                                            _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                                        } // END OTHERWISE 
                                    } // END INSPECTION
                                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                }
                                ;
                            }
                            break;
                            case 64: 
                            // JavaLine 1239 <== SourceLine 2097
                            {
                                // JavaLine 1241 <== SourceLine 2100
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 65: 
                            // JavaLine 1247 <== SourceLine 2104
                            {
                                // JavaLine 1249 <== SourceLine 2106
                                if(_VALUE((cquant_4.virtno_1==(0)))) {
                                    // JavaLine 1251 <== SourceLine 2107
                                    cquant_4.virtno_1=((RTS_ENVIRONMENT.rank(cquant_4.symb_1.idhi)*(256))+(RTS_ENVIRONMENT.rank(cquant_4.symb_1.idlo)));
                                }
                                ;
                                // JavaLine 1255 <== SourceLine 2109
                                cquant_4.symb_1=new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                ;
                                cquant_4.type_1=ctype_4;
                                ;
                                // JavaLine 1260 <== SourceLine 2110
                                cquant_4.ftag_1=(-(cqual_4));
                                ;
                                // JavaLine 1263 <== SourceLine 2111
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2115_genbrc_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 112: 
                            // JavaLine 1268 <== SourceLine 2114
                            {
                                // JavaLine 1270 <== SourceLine 2115
                                {
                                    _SIM_LABEL(15); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    ckind_4=((char)1);
                                }
                                ;
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)3));
                                ;
                                // JavaLine 1278 <== SourceLine 2116
                                {
                                    _SIM_LABEL(16); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 1281 <== SourceLine 2117
                                    p_or_c_qt_4=cquant_4;
                                }
                                ;
                                // JavaLine 1285 <== SourceLine 2119
                                new SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                ;
                                p_or_c_qt_4.descr_1=cbrec_4;
                                ;
                                // JavaLine 1290 <== SourceLine 2121
                                new SCANNER_L2Coder_store3chars((_CUR),((SCANNER)(_CUR._SL)).opn,((SCANNER)(_CUR._SL)).nextblhi,((SCANNER)(_CUR._SL)).nextbllo);
                                ;
                                // JavaLine 1293 <== SourceLine 2123
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 103: 
                            // JavaLine 1299 <== SourceLine 2127
                            {
                                // JavaLine 1301 <== SourceLine 2130
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2130_4489_4=vquant_4;
                                    if(_inspect_2130_4489_4!=null) { // INSPECT _inspect_2130_4489_4
                                        // JavaLine 1306 <== SourceLine 2131
                                        {
                                            // JavaLine 1308 <== SourceLine 2130
                                            {
                                                // JavaLine 1310 <== SourceLine 2131
                                                if(_VALUE((_inspect_2130_4489_4.type_1!=(((char)14))))) {
                                                    new ERRMSG_error1id((_CUR._SL),-444,_inspect_2130_4489_4.symb_1);
                                                }
                                                ;
                                                // JavaLine 1315 <== SourceLine 2133
                                                _inspect_2130_4489_4.symb_1=new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                                ;
                                                _inspect_2130_4489_4.type_1=ctype_4;
                                                ;
                                                // JavaLine 1320 <== SourceLine 2134
                                                _inspect_2130_4489_4.ftag_1=(-(cqual_4));
                                                ;
                                                // JavaLine 1323 <== SourceLine 2135
                                                new SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                ;
                                                _inspect_2130_4489_4.descr_1=cbrec_4;
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1333 <== SourceLine 2137
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 121: 
                            // JavaLine 1339 <== SourceLine 2140
                            {
                                // JavaLine 1341 <== SourceLine 2141
                                new SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                // JavaLine 1344 <== SourceLine 2142
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 95: 
                            // JavaLine 1350 <== SourceLine 2145
                            {
                                // JavaLine 1352 <== SourceLine 2146
                                ctype_4=((char)15);
                                ;
                                ckind_4=((char)12);
                                ;
                                // JavaLine 1357 <== SourceLine 2147
                                cqual_4=0;
                                ;
                                // JavaLine 1360 <== SourceLine 2148
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)0));
                                ;
                                // JavaLine 1363 <== SourceLine 2149
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 10: 
                            case 33: 
                            // JavaLine 1370 <== SourceLine 2152
                            {
                                // JavaLine 1372 <== SourceLine 2153
                                xquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 1375 <== SourceLine 2154
                                while(((xquant_4.symb_1!=(new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT))&&((xquant_4.next!=(null))))) {
                                    // JavaLine 1377 <== SourceLine 2156
                                    xquant_4=((COMMON_quantity)(xquant_4.next));
                                }
                                ;
                                // JavaLine 1381 <== SourceLine 2157
                                if(_VALUE(((xquant_4.symb_1.idhi!=(((SCANNER)(_CUR._SL)).opdhi))||((xquant_4.symb_1.idlo!=(((SCANNER)(_CUR._SL)).opdlo)))))) {
                                    // JavaLine 1383 <== SourceLine 2158
                                    new SCANNER_L2Coder_specErr((_CUR),223);
                                } else {
                                    // JavaLine 1386 <== SourceLine 2159
                                    if(_VALUE((xquant_4.categ_1!=(((char)0))))) {
                                        new SCANNER_L2Coder_specErr((_CUR),224);
                                    } else {
                                        // JavaLine 1390 <== SourceLine 2160
                                        xquant_4.categ_1=(((((SCANNER)(_CUR._SL)).opn==(((char)10))))?(((char)1)):(((char)2)));
                                    }
                                }
                                ;
                                // JavaLine 1395 <== SourceLine 2161
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 137: 
                            case 108: 
                            // JavaLine 1402 <== SourceLine 2164
                            {
                                // JavaLine 1404 <== SourceLine 2165
                                xquant_4=cbrec_4.fpar;
                                ;
                                // JavaLine 1407 <== SourceLine 2166
                                while(((xquant_4.symb_1!=(new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT))&&((xquant_4.next!=(null))))) {
                                    // JavaLine 1409 <== SourceLine 2168
                                    xquant_4=((COMMON_quantity)(xquant_4.next));
                                }
                                ;
                                // JavaLine 1413 <== SourceLine 2170
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2170_4490_4=xquant_4;
                                    if(_inspect_2170_4490_4!=null) { // INSPECT _inspect_2170_4490_4
                                        // JavaLine 1418 <== SourceLine 2171
                                        {
                                            // JavaLine 1420 <== SourceLine 2170
                                            {
                                                // JavaLine 1422 <== SourceLine 2171
                                                if(_VALUE(((_inspect_2170_4490_4.symb_1.idhi!=(((SCANNER)(_CUR._SL)).opdhi))||((_inspect_2170_4490_4.symb_1.idlo!=(((SCANNER)(_CUR._SL)).opdlo)))))) {
                                                    // JavaLine 1424 <== SourceLine 2172
                                                    new SCANNER_L2Coder_specErr((_CUR),223);
                                                } else {
                                                    // JavaLine 1427 <== SourceLine 2173
                                                    if(_VALUE((_inspect_2170_4490_4.kind_1!=(((char)12))))) {
                                                        new SCANNER_L2Coder_specErr((_CUR),224);
                                                    } else {
                                                        // JavaLine 1431 <== SourceLine 2174
                                                        {
                                                            // JavaLine 1433 <== SourceLine 2175
                                                            _inspect_2170_4490_4.type_1=ctype_4;
                                                            ;
                                                            _inspect_2170_4490_4.kind_1=ckind_4;
                                                            ;
                                                            // JavaLine 1438 <== SourceLine 2176
                                                            _inspect_2170_4490_4.ftag_1=(-(cqual_4));
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
                                // JavaLine 1450 <== SourceLine 2179
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 120: 
                            // JavaLine 1456 <== SourceLine 2182
                            {
                                // JavaLine 1458 <== SourceLine 2183
                                if(_VALUE((cbrec_4.kind==(((char)1))))) {
                                    {
                                        // JavaLine 1461 <== SourceLine 2186
                                        xbrec_4=cbrec_4;
                                        ;
                                        new SCANNER_L2Coder_brecterm((_CUR));
                                        ;
                                        // JavaLine 1466 <== SourceLine 2187
                                        if(_VALUE((cquant_4.categ_1!=(((char)4))))) {
                                            // JavaLine 1468 <== SourceLine 2188
                                            {
                                                new SCANNER_L2Coder_brecinit((_CUR),((char)1));
                                                ;
                                                // JavaLine 1472 <== SourceLine 2189
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_2189_4491_4=new COMMON_idpack((_CUR._SL))._STM();
                                                    if(_inspect_2189_4491_4!=null) { // INSPECT _inspect_2189_4491_4
                                                        // JavaLine 1477 <== SourceLine 2190
                                                        {
                                                            // JavaLine 1479 <== SourceLine 2189
                                                            {
                                                                // JavaLine 1481 <== SourceLine 2191
                                                                cbrec_4.hidlist=((COMMON_idpack)_inspect_2189_4491_4);
                                                                ;
                                                                // JavaLine 1484 <== SourceLine 2192
                                                                _inspect_2189_4491_4.idhi=xbrec_4.blnohi;
                                                                ;
                                                                _inspect_2189_4491_4.idlo=xbrec_4.blnolo;
                                                                ;
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                                ;
                                                // JavaLine 1494 <== SourceLine 2194
                                                cbrec_4.line1=xbrec_4.line1;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 1499 <== SourceLine 2196
                                            if(_VALUE(((cquant_4.dim_1==(RTS_ENVIRONMENT.rank('L')))||((cquant_4.dim_1==(RTS_ENVIRONMENT.rank('M'))))))) {
                                                // JavaLine 1501 <== SourceLine 2198
                                                {
                                                    // JavaLine 1503 <== SourceLine 2199
                                                    pq_4=xbrec_4.fpar;
                                                    ;
                                                    // JavaLine 1506 <== SourceLine 2200
                                                    while((pq_4!=(null))) {
                                                        {
                                                            // JavaLine 1509 <== SourceLine 2201
                                                            if(_VALUE((pq_4.kind_1==(((char)1))))) {
                                                                {
                                                                    // JavaLine 1512 <== SourceLine 2202
                                                                    if(_VALUE((pq_4.categ_1!=(((char)2))))) {
                                                                        _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                            } else {
                                                                // JavaLine 1518 <== SourceLine 2203
                                                                if(_VALUE((pq_4.categ_1==(((char)0))))) {
                                                                    {
                                                                        // JavaLine 1521 <== SourceLine 2204
                                                                        if(_VALUE((pq_4.kind_1==(((char)2))))) {
                                                                            _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2183_Block2186_Block2199_Block2201_Block2204_Block2211_Nspec_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                        ;
                                                                        // JavaLine 1526 <== SourceLine 2205
                                                                        if(pq_4.type_1<((char)0) || pq_4.type_1>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                        switch(pq_4.type_1) { // BEGIN SWITCH STATEMENT
                                                                            case 1: 
                                                                            case 2: 
                                                                            case 3: 
                                                                            case 4: 
                                                                            case 5: 
                                                                            case 6: 
                                                                            case 9: 
                                                                            // JavaLine 1536 <== SourceLine 2207
                                                                            {
                                                                                // JavaLine 1538 <== SourceLine 2208
                                                                                pq_4.categ_1=((char)1);
                                                                                ;
                                                                                iii_4=244;
                                                                                ;
                                                                            }
                                                                            break;
                                                                            default:
                                                                            // JavaLine 1546 <== SourceLine 2210
                                                                            {
                                                                                // JavaLine 1548 <== SourceLine 2211
                                                                                {
                                                                                    _SIM_LABEL(17); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                                                                    pq_4.categ_1=((char)2);
                                                                                }
                                                                                ;
                                                                                iii_4=248;
                                                                                ;
                                                                            }
                                                                            break;
                                                                        } // END SWITCH STATEMENT
                                                                        ;
                                                                        // JavaLine 1560 <== SourceLine 2214
                                                                        ((SCANNER)(_CUR._SL)).diag.putELEMENT(((SCANNER)(_CUR._SL)).diag.index(0),pq_4.symb_1.symbol);
                                                                        ;
                                                                        // JavaLine 1563 <== SourceLine 2215
                                                                        ((SCANNER)(_CUR._SL)).diag.putELEMENT(((SCANNER)(_CUR._SL)).diag.index(1),cquant_4.symb_1.symbol);
                                                                        ;
                                                                        // JavaLine 1566 <== SourceLine 2216
                                                                        new SCANNER_P1warn((_CUR._SL),iii_4);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 1573 <== SourceLine 2218
                                                            pq_4=((COMMON_quantity)(pq_4.next));
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
                                // JavaLine 1586 <== SourceLine 2222
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 148: 
                            // JavaLine 1592 <== SourceLine 2225
                            {
                                // JavaLine 1594 <== SourceLine 2226
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)6));
                                ;
                                // JavaLine 1597 <== SourceLine 2227
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 55: 
                            // JavaLine 1603 <== SourceLine 2230
                            {
                                // JavaLine 1605 <== SourceLine 2231
                                new SCANNER_L2Coder_brecterm((_CUR));
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2235_LIFWHN_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 105: 
                            case 127: 
                            // JavaLine 1613 <== SourceLine 2234
                            {
                                // JavaLine 1615 <== SourceLine 2235
                                {
                                    _SIM_LABEL(18); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    new SCANNER_L2Coder_brecinit((_CUR),((char)11));
                                }
                                ;
                                // JavaLine 1621 <== SourceLine 2239
                                jjj_4=1;
                                ;
                                // JavaLine 1624 <== SourceLine 2240
                                xbrec_4=cbrec_4.fpar.encl_1;
                                ;
                                // JavaLine 1627 <== SourceLine 2241
                                while((xbrec_4.kind==(((char)11)))) {
                                    // JavaLine 1629 <== SourceLine 2242
                                    {
                                        if(_VALUE((xbrec_4.connests!=(0)))) {
                                            jjj_4=(jjj_4+(1));
                                        }
                                        ;
                                        // JavaLine 1635 <== SourceLine 2244
                                        xbrec_4=xbrec_4.fpar.encl_1;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1641 <== SourceLine 2247
                                if(_VALUE((xbrec_4.kind==(((char)1))))) {
                                    // JavaLine 1643 <== SourceLine 2248
                                    xbrec_4=new COMMON_getBrc((_CUR._SL),xbrec_4.hidlist.idhi,xbrec_4.hidlist.idlo)._RESULT;
                                }
                                ;
                                // JavaLine 1647 <== SourceLine 2251
                                cbrec_4.connests=jjj_4;
                                ;
                                // JavaLine 1650 <== SourceLine 2252
                                if(_VALUE((xbrec_4.connests<(jjj_4)))) {
                                    xbrec_4.connests=jjj_4;
                                }
                                ;
                                // JavaLine 1655 <== SourceLine 2253
                                if(_VALUE((((SCANNER)(_CUR._SL)).opn==('i')))) {
                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1899_BLOCKOUT_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1660 <== SourceLine 2254
                                {
                                    _SIM_LABEL(19); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    new SCANNER_L2Coder_store3chars((_CUR),((SCANNER)(_CUR._SL)).opn,cbrec_4.blnohi,cbrec_4.blnolo);
                                }
                                ;
                                // JavaLine 1666 <== SourceLine 2255
                                RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdhi,L2buf_4,L2p_4);
                                ;
                                // JavaLine 1669 <== SourceLine 2256
                                RTS_ENVIRONMENT.storeChar(((SCANNER)(_CUR._SL)).opdlo,L2buf_4,(L2p_4+(1)));
                                ;
                                L2p_4=(L2p_4+(2));
                                ;
                                // JavaLine 1674 <== SourceLine 2257
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_NEXTOPN_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 19: 
                            // JavaLine 1680 <== SourceLine 2260
                            {
                                // JavaLine 1682 <== SourceLine 2261
                                new SCANNER_L2Coder_brecinit((_CUR),((char)11));
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 93: 
                            // JavaLine 1690 <== SourceLine 2264
                            {
                                // JavaLine 1692 <== SourceLine 2265
                                new SCANNER_L2Coder_brecinit((_CUR),((char)9));
                                ;
                                cbrec_4.stmtag=cbrec_4.inrtag=((char)2);
                                ;
                                // JavaLine 1697 <== SourceLine 2266
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block2235_QBLOCKOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 88: 
                            // JavaLine 1702 <== SourceLine 2269
                            {
                                // JavaLine 1704 <== SourceLine 2270
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2270_4492_4=RTS_BASICIO.sysout();
                                    if(_inspect_2270_4492_4!=null) { // INSPECT _inspect_2270_4492_4
                                        {
                                            {
                                                if(_VALUE((_inspect_2270_4492_4.pos()>(1)))) {
                                                    _inspect_2270_4492_4.outimage();
                                                }
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1719 <== SourceLine 2271
                                while((cbrec_4!=(null))) {
                                    new SCANNER_L2Coder_brecterm((_CUR));
                                }
                                ;
                                // JavaLine 1724 <== SourceLine 2272
                                RTS_ENVIRONMENT.storeChar('X',L2buf_4,L2p_4);
                                ;
                                RTS_ENVIRONMENT.storeChar('X',L2buf_4,(L2p_4+(1)));
                                ;
                                // JavaLine 1729 <== SourceLine 2273
                                RTS_TXT.setpos(((SCANNER)(_CUR._SL)).L2codebuffer,(L2p_4+(2)));
                                ;
                                // JavaLine 1732 <== SourceLine 2274
                                while(true) {
                                    detach(2274);
                                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                }
                                ;
                            }
                            break;
                            case 18: 
                            // JavaLine 1741 <== SourceLine 2278
                            {
                                // JavaLine 1743 <== SourceLine 2279
                                new SCANNER_L2Coder_NewQuant((_CUR),((char)4));
                                ;
                                // JavaLine 1746 <== SourceLine 2280
                                if(_VALUE((ckind_4==(((char)1))))) {
                                    {
                                        // JavaLine 1749 <== SourceLine 2281
                                        cquant_4.dim_1=((RTS_ENVIRONMENT.rank(lanhi_4)*(256))+(RTS_ENVIRONMENT.rank(lanlo_4)));
                                        ;
                                        // JavaLine 1752 <== SourceLine 2282
                                        lanhi_4=lanlo_4=((char)0);
                                        ;
                                    }
                                }
                                ;
                            }
                            break;
                            case 123: 
                            // JavaLine 1761 <== SourceLine 2287
                            {
                                // JavaLine 1763 <== SourceLine 2288
                                if(_VALUE((cquant_4.categ_1==(((char)5))))) {
                                    // JavaLine 1765 <== SourceLine 2289
                                    p_or_c_qt_4.virtno_1=((RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdlo)));
                                } else {
                                    // JavaLine 1768 <== SourceLine 2290
                                    cquant_4.virtno_1=((RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdhi)*(256))+(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL)).opdlo)));
                                }
                                ;
                            }
                            break;
                            case 87: 
                            // JavaLine 1775 <== SourceLine 2307
                            {
                                // JavaLine 1777 <== SourceLine 2308
                                if(_VALUE((((SCANNER)(_CUR._SL)).opdlo!=(((char)0))))) {
                                    ((SCANNER)(_CUR._SL)).opn=((SCANNER)(_CUR._SL)).opdlo;
                                }
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 51: 
                            // JavaLine 1786 <== SourceLine 2311
                            {
                                // JavaLine 1788 <== SourceLine 2312
                                cquant_4.special_1=((char)3);
                                ;
                                // JavaLine 1791 <== SourceLine 2313
                                if(_VALUE((cquant_4.type_1==(((char)3))))) {
                                    cquant_4.type_1=((char)4);
                                }
                                ;
                                // JavaLine 1796 <== SourceLine 2314
                                ((SCANNER)(_CUR._SL)).opdhi=cquant_4.symb_1.idhi;
                                ;
                                ((SCANNER)(_CUR._SL)).opdlo=cquant_4.symb_1.idlo;
                                ;
                                // JavaLine 1801 <== SourceLine 2315
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 124: 
                            // JavaLine 1806 <== SourceLine 2318
                            {
                                // JavaLine 1808 <== SourceLine 2319
                                cquant_4.protect_1=((char)2);
                                ;
                                cbrec_4.dcltag=((char)2);
                                ;
                                // JavaLine 1813 <== SourceLine 2320
                                RTS_ENVIRONMENT.storeChar('|',L2buf_4,L2p_4);
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 1818 <== SourceLine 2321
                                ((SCANNER)(_CUR._SL)).opn=((SCANNER)(_CUR._SL)).opdlo;
                                ;
                                _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1790_OPNOUT_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 136: 
                            case 40: 
                            // JavaLine 1826 <== SourceLine 2324
                            {
                                // JavaLine 1828 <== SourceLine 2325
                                new SCANNER_L2Coder_chainVis((_CUR),false);
                                ;
                                // JavaLine 1831 <== SourceLine 2326
                                if(_VALUE((((SCANNER)(_CUR._SL)).opn==(((char)136))))) {
                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_LIHIDD_0); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                            break;
                            case 22: 
                            // JavaLine 1839 <== SourceLine 2331
                            {
                                {
                                    _SIM_LABEL(20);
                                    // JavaLine 1843 <== SourceLine 2332
                                    new SCANNER_L2Coder_chainVis((_CUR),true);
                                    ;
                                }
                            }
                            break;
                            case 141: 
                            // JavaLine 1850 <== SourceLine 2336
                            {
                                // JavaLine 1852 <== SourceLine 2338
                                new SCANNER_L2Coder_storecharint((_CUR),((char)141),cswa_4);
                                ;
                                // JavaLine 1855 <== SourceLine 2339
                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((cswb_4/(256))),L2buf_4,L2p_4);
                                ;
                                // JavaLine 1858 <== SourceLine 2340
                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(cswb_4,256)),L2buf_4,(L2p_4+(1)));
                                ;
                                L2p_4=(L2p_4+(2));
                                ;
                                // JavaLine 1863 <== SourceLine 2341
                                if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_2341_4493_4=RTS_BASICIO.sysout();
                                        if(_inspect_2341_4493_4!=null) { // INSPECT _inspect_2341_4493_4
                                            // JavaLine 1869 <== SourceLine 2342
                                            {
                                                // JavaLine 1871 <== SourceLine 2341
                                                {
                                                    // JavaLine 1873 <== SourceLine 2342
                                                    _inspect_2341_4493_4.outtext(new RTS_TXT("SWITCHES: "));
                                                    ;
                                                    _inspect_2341_4493_4.outint(cswa_4,3);
                                                    ;
                                                    // JavaLine 1878 <== SourceLine 2343
                                                    _inspect_2341_4493_4.outint(cswb_4,3);
                                                    ;
                                                    _inspect_2341_4493_4.outimage();
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
                            // JavaLine 1892 <== SourceLine 2347
                            {
                                // JavaLine 1894 <== SourceLine 2348
                                RTS_ENVIRONMENT.storeChar(((char)21),L2buf_4,L2p_4);
                                ;
                                L2p_4=(L2p_4+(1));
                                ;
                                // JavaLine 1899 <== SourceLine 2350
                                detach(2350);
                                ;
                                // JavaLine 1902 <== SourceLine 2352
                                if(_VALUE((((SCANNER)(_CUR._SL)).opn==(((char)139))))) {
                                    {
                                        // JavaLine 1905 <== SourceLine 2353
                                        symx_4=new COMMON_boxof((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo)._RESULT;
                                        ;
                                        // JavaLine 1908 <== SourceLine 2354
                                        pq_4=cbrec_4.favirt;
                                        ;
                                        // JavaLine 1911 <== SourceLine 2355
                                        while((pq_4!=(null))) {
                                            {
                                                // JavaLine 1914 <== SourceLine 2356
                                                if(_VALUE((pq_4.symb_1==(symx_4)))) {
                                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 1919 <== SourceLine 2357
                                                pq_4=((COMMON_quantity)(pq_4.next));
                                            }
                                        }
                                        ;
                                        // JavaLine 1924 <== SourceLine 2358
                                        pq_4=((COMMON_quantity)(cbrec_4.fpar.next));
                                        ;
                                        // JavaLine 1927 <== SourceLine 2359
                                        while((pq_4!=(null))) {
                                            {
                                                // JavaLine 1930 <== SourceLine 2360
                                                if(_VALUE(((pq_4.symb_1==(symx_4))&&((pq_4.kind_1==(((char)3))))))) {
                                                    {
                                                        // JavaLine 1933 <== SourceLine 2361
                                                        if(_VALUE((pq_4.plev_1<(200)))) {
                                                            pq_4.plev_1=(pq_4.plev_1+(1));
                                                        }
                                                        ;
                                                        // JavaLine 1938 <== SourceLine 2363
                                                        _GOTO(_LABEL_SCANNER_L2Coder_Block1744_Block1798_OPDOUT_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                                ;
                                                // JavaLine 1943 <== SourceLine 2364
                                                pq_4=((COMMON_quantity)(pq_4.next));
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1952 <== SourceLine 2367
                                {
                                    _SIM_LABEL(21); // DeclaredIn: L2Coder -> L2Coder[SCANNER_L2Coder] DeclarationKind=Class
                                    // JavaLine 1955 <== SourceLine 2368
                                    _GOTO(_LABEL_SCANNER_L2Coder_Block1744_CheckNxt_0); // GOTO EVALUATED LABEL
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
                // JavaLine 1970 <== SourceLine 2382
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","8 L2Coder",1,1558,11,1745,13,1755,15,1790,17,1798,19,1851,21,1872,23,1900,25,1939,27,1942,29,1950,31,1983,33,2002,35,2025,37,2038,39,2115,41,2117,43,2211,45,2235,47,2254,49,2332,51,2368,54,1566,57,1567,60,1568,63,1569,66,1570,68,1571,70,1573,72,1574,74,1575,77,1576,79,1577,83,1578,85,1579,87,1580,90,1581,93,1582,97,1583,101,1587,103,1596,107,1757,109,1907,111,1909,113,1930,115,1978,117,2078,119,2092,121,2130,123,2170,125,2189,127,2270,129,2341,148,868,150,1738,153,1739,158,1742,161,1744,164,1745,167,1746,172,1747,181,1751,184,1754,187,1755,193,1757,199,1758,201,1757,203,1758,208,1759,215,1760,222,1761,227,1763,230,1764,234,1765,240,1766,246,1767,252,1768,255,1769,260,1770,277,1777,332,1789,334,1790,342,1791,361,1797,363,1798,369,1799,372,1800,375,1801,379,1802,386,1807,388,1808,393,1809,406,1813,408,1815,413,1816,416,1817,422,1819,424,1820,427,1821,433,1822,435,1823,438,1824,444,1826,446,1827,449,1828,455,1830,457,1831,460,1832,467,1842,469,1844,472,1845,477,1846,479,1847,484,1848,493,1849,495,1850,498,1851,506,1852,511,1854,516,1856,522,1859,524,1860,527,1861,530,1862,533,1863,539,1866,541,1867,547,1869,549,1870,554,1871,557,1872,561,1873,567,1875,569,1876,574,1877,581,1880,583,1881,586,1882,591,1884,594,1886,597,1887,600,1888,605,1889,608,1890,613,1893,615,1894,620,1895,625,1898,627,1899,630,1900,636,1901,643,1904,645,1905,648,1907,653,1908,655,1907,657,1908,660,1909,666,1910,668,1909,670,1912,675,1913,678,1914,681,1915,683,1916,687,1917,692,1918,697,1919,700,1920,705,1921,708,1922,711,1923,714,1924,719,1925,721,1926,725,1928,732,1929,737,1930,742,1931,744,1930,746,1932,749,1933,759,1935,762,1936,765,1937,770,1938,775,1939,785,1940,794,1942,800,1943,803,1945,806,1947,811,1948,816,1949,819,1950,824,1951,826,1953,830,1954,835,1956,840,1957,847,1959,850,1960,859,1974,862,1975,865,1977,870,1978,873,1980,883,1982,890,1983,892,1984,896,1985,903,1987,908,1989,921,1993,924,1994,930,1997,935,1998,943,2001,945,2002,955,2005,957,2006,960,2007,966,2010,973,2013,975,2014,982,2015,987,2016,992,2017,995,2018,998,2019,1001,2020,1009,2022,1012,2023,1015,2024,1022,2025,1030,2026,1035,2027,1041,2030,1043,2031,1046,2032,1049,2033,1056,2036,1058,2037,1061,2038,1067,2039,1070,2040,1073,2041,1076,2042,1081,2043,1086,2046,1088,2047,1093,2048,1100,2057,1102,2058,1109,2061,1111,2062,1114,2063,1119,2066,1121,2067,1128,2068,1133,2069,1138,2070,1141,2071,1148,2074,1150,2075,1153,2076,1160,2077,1163,2078,1174,2079,1177,2080,1184,2083,1186,2084,1191,2085,1198,2086,1201,2087,1206,2090,1208,2091,1211,2092,1217,2093,1219,2092,1221,2093,1229,2094,1239,2097,1241,2100,1247,2104,1249,2106,1251,2107,1255,2109,1260,2110,1263,2111,1268,2114,1270,2115,1278,2116,1281,2117,1285,2119,1290,2121,1293,2123,1299,2127,1301,2130,1306,2131,1308,2130,1310,2131,1315,2133,1320,2134,1323,2135,1333,2137,1339,2140,1341,2141,1344,2142,1350,2145,1352,2146,1357,2147,1360,2148,1363,2149,1370,2152,1372,2153,1375,2154,1377,2156,1381,2157,1383,2158,1386,2159,1390,2160,1395,2161,1402,2164,1404,2165,1407,2166,1409,2168,1413,2170,1418,2171,1420,2170,1422,2171,1424,2172,1427,2173,1431,2174,1433,2175,1438,2176,1450,2179,1456,2182,1458,2183,1461,2186,1466,2187,1468,2188,1472,2189,1477,2190,1479,2189,1481,2191,1484,2192,1494,2194,1499,2196,1501,2198,1503,2199,1506,2200,1509,2201,1512,2202,1518,2203,1521,2204,1526,2205,1536,2207,1538,2208,1546,2210,1548,2211,1560,2214,1563,2215,1566,2216,1573,2218,1586,2222,1592,2225,1594,2226,1597,2227,1603,2230,1605,2231,1613,2234,1615,2235,1621,2239,1624,2240,1627,2241,1629,2242,1635,2244,1641,2247,1643,2248,1647,2251,1650,2252,1655,2253,1660,2254,1666,2255,1669,2256,1674,2257,1680,2260,1682,2261,1690,2264,1692,2265,1697,2266,1702,2269,1704,2270,1719,2271,1724,2272,1729,2273,1732,2274,1741,2278,1743,2279,1746,2280,1749,2281,1752,2282,1761,2287,1763,2288,1765,2289,1768,2290,1775,2307,1777,2308,1786,2311,1788,2312,1791,2313,1796,2314,1801,2315,1806,2318,1808,2319,1813,2320,1818,2321,1826,2324,1828,2325,1831,2326,1839,2331,1843,2332,1850,2336,1852,2338,1855,2339,1858,2340,1863,2341,1869,2342,1871,2341,1873,2342,1878,2343,1892,2347,1894,2348,1899,2350,1902,2352,1905,2353,1908,2354,1911,2355,1914,2356,1919,2357,1924,2358,1927,2359,1930,2360,1933,2361,1938,2363,1943,2364,1952,2367,1955,2368,1970,2382,1986,2382);
} // End of Class
