// JavaLine 1 <== SourceLine 1700
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_inspectstat extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=1, firstLine=1700, lastLine=1789, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1715
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1720
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1734
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_Block1728_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1743
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_S1_1=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1760
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_S2_1=new RTS_LABEL(this,1,5,"S2"); // Local Label #5=S2 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1767
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_Block1761_S3_0=new RTS_LABEL(this,1,6,"S3"); // Local Label #6=S3 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 1772
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_inspectstat_ENDINSP_1=new RTS_LABEL(this,1,7,"ENDINSP"); // Local Label #7=ENDINSP At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 26 <== SourceLine 1702
    public boolean firstwhen_1=false;
    public boolean iothwsent_1=false;
    public boolean enclgen_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_inspectstat_recover.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_inspectstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_inspectstat _STM() {
        CLASS_PARSER_grammer_inspectstat _THIS=(CLASS_PARSER_grammer_inspectstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 44 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 46 <== SourceLine 1713
                detach(1713);
                ;
                // JavaLine 49 <== SourceLine 1714
                {
                    _SIM_LABEL(1); // DeclaredIn: inspectstat
                    // JavaLine 52 <== SourceLine 1715
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("inspect"));
                    }
                }
                ;
                // JavaLine 58 <== SourceLine 1716
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1==(0))&&((((CLASS_PARSER)(_CUR._SL._SL)).dummygen_2|((!(((CLASS_PARSER)(_CUR._SL._SL)).separatecomp)))))))) {
                    // JavaLine 60 <== SourceLine 1717
                    {
                        enclgen_1=true;
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                        ;
                        // JavaLine 66 <== SourceLine 1718
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='\\';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1718);
                        ;
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 1720
                {
                    _SIM_LABEL(2); // DeclaredIn: inspectstat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 80 <== SourceLine 1721
                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)27);
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1721);
                ;
                // JavaLine 85 <== SourceLine 1722
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 88 <== SourceLine 1723
                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1723);
                ;
                // JavaLine 91 <== SourceLine 1724
                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 94 <== SourceLine 1725
                        errorno=1;
                        ;
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),205);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_Block1728_PARSE_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 103 <== SourceLine 1726
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('7')))) {
                    firstwhen_1=true;
                } else {
                    // JavaLine 107 <== SourceLine 1727
                    {
                        // JavaLine 109 <== SourceLine 1728
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)28))))) {
                            {
                                // JavaLine 112 <== SourceLine 1729
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='i';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1729);
                                ;
                                // JavaLine 117 <== SourceLine 1730
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 120 <== SourceLine 1731
                                stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                                ;
                                rp=((char)2);
                            }
                        } else {
                            // JavaLine 126 <== SourceLine 1732
                            {
                                errorno=2;
                                ;
                                new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),211);
                            }
                        }
                        ;
                        // JavaLine 134 <== SourceLine 1734
                        {
                            _SIM_LABEL(3); // DeclaredIn: inspectstat -> inspectstat[CLASS_PARSER_grammer_inspectstat] DeclarationKind=Class
                            detach(1734);
                        }
                        ;
                        // JavaLine 140 <== SourceLine 1736
                        if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(rp) { // BEGIN SWITCH STATEMENT
                            case 0: 
                            // JavaLine 144 <== SourceLine 1737
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_S0_1); // GOTO EVALUATED LABEL
                            break;
                            case 2: 
                            // JavaLine 148 <== SourceLine 1738
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_S2_1); // GOTO EVALUATED LABEL
                            break;
                            case 3: 
                            // JavaLine 152 <== SourceLine 1739
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_Block1761_S3_0); // GOTO EVALUATED LABEL
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
                ;
                // JavaLine 160 <== SourceLine 1742
                {
                    _SIM_LABEL(4); // DeclaredIn: inspectstat
                    // JavaLine 163 <== SourceLine 1743
                    while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('7'))) {
                        {
                            // JavaLine 166 <== SourceLine 1744
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 169 <== SourceLine 1745
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                {
                                    // JavaLine 172 <== SourceLine 1746
                                    errorno=3;
                                    ;
                                    new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),185);
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_Block1728_PARSE_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 181 <== SourceLine 1747
                            if(_VALUE(firstwhen_1)) {
                                {
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)127);
                                    ;
                                    firstwhen_1=false;
                                }
                            } else {
                                // JavaLine 189 <== SourceLine 1748
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='7';
                            }
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1748);
                            ;
                            // JavaLine 195 <== SourceLine 1749
                            if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).opt!=(((char)28))))) {
                                {
                                    // JavaLine 198 <== SourceLine 1750
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 203 <== SourceLine 1751
                                    errorno=4;
                                    ;
                                    new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),206);
                                    ;
                                }
                            } else {
                                // JavaLine 210 <== SourceLine 1752
                                {
                                    // JavaLine 212 <== SourceLine 1753
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                    ;
                                    // JavaLine 215 <== SourceLine 1754
                                    stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                                    ;
                                    rp=((char)1);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 223 <== SourceLine 1756
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_Block1728_PARSE_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 230 <== SourceLine 1759
                {
                    _SIM_LABEL(5); // DeclaredIn: inspectstat
                    // JavaLine 233 <== SourceLine 1760
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('%')))) {
                        {
                            // JavaLine 236 <== SourceLine 1761
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn='%';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1761);
                            ;
                            // JavaLine 241 <== SourceLine 1762
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 244 <== SourceLine 1763
                            iothwsent_1=true;
                            ;
                            // JavaLine 247 <== SourceLine 1764
                            stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            rp=((char)3);
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_Block1728_PARSE_0); // GOTO EVALUATED LABEL
                            ;
                            // JavaLine 254 <== SourceLine 1765
                            {
                                _SIM_LABEL(6); // DeclaredIn: inspectstat -> inspectstat[CLASS_PARSER_grammer_inspectstat] DeclarationKind=Class
                                // JavaLine 257 <== SourceLine 1767
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)135);
                            }
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1767);
                            ;
                            // JavaLine 263 <== SourceLine 1768
                            _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_ENDINSP_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 270 <== SourceLine 1771
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='j';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1771);
                ;
                // JavaLine 275 <== SourceLine 1772
                {
                    _SIM_LABEL(7); // DeclaredIn: inspectstat
                    if(_VALUE(enclgen_1)) {
                        {
                            enclgen_1=false;
                            ;
                            // JavaLine 282 <== SourceLine 1773
                            ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=0;
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1773);
                        }
                    }
                }
                ;
                // JavaLine 292 <== SourceLine 1774
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack inspect"));
                }
                ;
                // JavaLine 297 <== SourceLine 1776
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 302 <== SourceLine 1777
                ((CLASS_PARSER_grammer)(_CUR._SL)).itList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 305 <== SourceLine 1779
                detach(1779);
                ;
                // JavaLine 308 <== SourceLine 1782
                ((CLASS_PARSER_grammer)(_CUR._SL)).itList_1=null;
                ;
                // JavaLine 311 <== SourceLine 1783
                errorno=0;
                ;
                // JavaLine 314 <== SourceLine 1784
                firstwhen_1=iothwsent_1=enclgen_1=recovered=isblocklike=false;
                ;
                // JavaLine 317 <== SourceLine 1786
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 320 <== SourceLine 1787
                _GOTO(_LABEL_CLASS_PARSER_grammer_inspectstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 323 <== SourceLine 1789
                // BEGIN inspectstat INNER PART
                // ENDOF inspectstat INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","9 inspectstat",1,1700,11,1715,13,1720,15,1734,17,1743,19,1760,21,1767,23,1772,26,1702,44,712,46,1713,49,1714,52,1715,58,1716,60,1717,66,1718,74,1720,80,1721,85,1722,88,1723,91,1724,94,1725,103,1726,107,1727,109,1728,112,1729,117,1730,120,1731,126,1732,134,1734,140,1736,144,1737,148,1738,152,1739,160,1742,163,1743,166,1744,169,1745,172,1746,181,1747,189,1748,195,1749,198,1750,203,1751,210,1752,212,1753,215,1754,223,1756,230,1759,233,1760,236,1761,241,1762,244,1763,247,1764,254,1765,257,1767,263,1768,270,1771,275,1772,282,1773,292,1774,297,1776,302,1777,305,1779,308,1782,311,1783,314,1784,317,1786,320,1787,323,1789,336,1789);
} // End of Class
