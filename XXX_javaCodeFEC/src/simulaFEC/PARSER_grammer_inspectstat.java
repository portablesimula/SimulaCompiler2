// JavaLine 1 <== SourceLine 1699
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_inspectstat extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1699, lastLine=1788, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1714
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1719
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1733
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_Block1727_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1742
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_S1_1=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1759
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_S2_1=new RTS_LABEL(this,1,5,"S2"); // Local Label #5=S2 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1766
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_Block1760_S3_0=new RTS_LABEL(this,1,6,"S3"); // Local Label #6=S3 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 1771
    final RTS_LABEL _LABEL_PARSER_grammer_inspectstat_ENDINSP_1=new RTS_LABEL(this,1,7,"ENDINSP"); // Local Label #7=ENDINSP At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 26 <== SourceLine 1701
    public boolean firstwhen_1=false;
    public boolean iothwsent_1=false;
    public boolean enclgen_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_inspectstat_recover.class)); }
    // Normal Constructor
    public PARSER_grammer_inspectstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_inspectstat _STM() {
        PARSER_grammer_inspectstat _THIS=(PARSER_grammer_inspectstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 44 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 46 <== SourceLine 1712
                detach(1712);
                ;
                // JavaLine 49 <== SourceLine 1713
                {
                    _SIM_LABEL(1); // DeclaredIn: inspectstat
                    // JavaLine 52 <== SourceLine 1714
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("inspect"));
                    }
                }
                ;
                // JavaLine 58 <== SourceLine 1715
                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).blockfound_1==(0))&&((((PARSER)(_CUR._SL._SL)).dummygen_2|((!(((PARSER)(_CUR._SL._SL)).separatecomp)))))))) {
                    // JavaLine 60 <== SourceLine 1716
                    {
                        enclgen_1=true;
                        ;
                        ((PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                        ;
                        // JavaLine 66 <== SourceLine 1717
                        ((PARSER)(_CUR._SL._SL)).opn='\\';
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,1717);
                        ;
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 1719
                {
                    _SIM_LABEL(2); // DeclaredIn: inspectstat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 80 <== SourceLine 1720
                ((PARSER)(_CUR._SL._SL)).opn=((char)27);
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1720);
                ;
                // JavaLine 85 <== SourceLine 1721
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 88 <== SourceLine 1722
                call(((PARSER_grammer)(_CUR._SL)).ex_1,1722);
                ;
                // JavaLine 91 <== SourceLine 1723
                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 94 <== SourceLine 1724
                        errorno=1;
                        ;
                        new PARSER_grammer_syntaxerror((_CUR._SL),205);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_inspectstat_Block1727_PARSE_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 103 <== SourceLine 1725
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('7')))) {
                    firstwhen_1=true;
                } else {
                    // JavaLine 107 <== SourceLine 1726
                    {
                        // JavaLine 109 <== SourceLine 1727
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)28))))) {
                            {
                                // JavaLine 112 <== SourceLine 1728
                                ((PARSER)(_CUR._SL._SL)).opn='i';
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,1728);
                                ;
                                // JavaLine 117 <== SourceLine 1729
                                ((PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 120 <== SourceLine 1730
                                stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                                ;
                                rp=((char)2);
                            }
                        } else {
                            // JavaLine 126 <== SourceLine 1731
                            {
                                errorno=2;
                                ;
                                new PARSER_grammer_syntaxerror((_CUR._SL),211);
                            }
                        }
                        ;
                        // JavaLine 134 <== SourceLine 1733
                        {
                            _SIM_LABEL(3); // DeclaredIn: inspectstat -> inspectstat[PARSER_grammer_inspectstat] DeclarationKind=Class
                            detach(1733);
                        }
                        ;
                        // JavaLine 140 <== SourceLine 1735
                        if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(rp) { // BEGIN SWITCH STATEMENT
                            case 0: 
                            // JavaLine 144 <== SourceLine 1736
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_S0_1); // GOTO EVALUATED LABEL
                            break;
                            case 2: 
                            // JavaLine 148 <== SourceLine 1737
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_S2_1); // GOTO EVALUATED LABEL
                            break;
                            case 3: 
                            // JavaLine 152 <== SourceLine 1738
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_Block1760_S3_0); // GOTO EVALUATED LABEL
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
                ;
                // JavaLine 160 <== SourceLine 1741
                {
                    _SIM_LABEL(4); // DeclaredIn: inspectstat
                    // JavaLine 163 <== SourceLine 1742
                    while((((PARSER_grammer)(_CUR._SL)).cs==('7'))) {
                        {
                            // JavaLine 166 <== SourceLine 1743
                            ((PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 169 <== SourceLine 1744
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                {
                                    // JavaLine 172 <== SourceLine 1745
                                    errorno=3;
                                    ;
                                    new PARSER_grammer_syntaxerror((_CUR._SL),185);
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_inspectstat_Block1727_PARSE_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 181 <== SourceLine 1746
                            if(_VALUE(firstwhen_1)) {
                                {
                                    ((PARSER)(_CUR._SL._SL)).opn=((char)127);
                                    ;
                                    firstwhen_1=false;
                                }
                            } else {
                                // JavaLine 189 <== SourceLine 1747
                                ((PARSER)(_CUR._SL._SL)).opn='7';
                            }
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1747);
                            ;
                            // JavaLine 195 <== SourceLine 1748
                            if(_VALUE((((PARSER)(_CUR._SL._SL)).opt!=(((char)28))))) {
                                {
                                    // JavaLine 198 <== SourceLine 1749
                                    ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 203 <== SourceLine 1750
                                    errorno=4;
                                    ;
                                    new PARSER_grammer_syntaxerror((_CUR._SL),206);
                                    ;
                                }
                            } else {
                                // JavaLine 210 <== SourceLine 1751
                                {
                                    // JavaLine 212 <== SourceLine 1752
                                    ((PARSER_grammer)(_CUR._SL)).detach();
                                    ;
                                    // JavaLine 215 <== SourceLine 1753
                                    stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                                    ;
                                    rp=((char)1);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 223 <== SourceLine 1755
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_Block1727_PARSE_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 230 <== SourceLine 1758
                {
                    _SIM_LABEL(5); // DeclaredIn: inspectstat
                    // JavaLine 233 <== SourceLine 1759
                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('%')))) {
                        {
                            // JavaLine 236 <== SourceLine 1760
                            ((PARSER)(_CUR._SL._SL)).opn='%';
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1760);
                            ;
                            // JavaLine 241 <== SourceLine 1761
                            ((PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 244 <== SourceLine 1762
                            iothwsent_1=true;
                            ;
                            // JavaLine 247 <== SourceLine 1763
                            stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            rp=((char)3);
                            ;
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_Block1727_PARSE_0); // GOTO EVALUATED LABEL
                            ;
                            // JavaLine 254 <== SourceLine 1764
                            {
                                _SIM_LABEL(6); // DeclaredIn: inspectstat -> inspectstat[PARSER_grammer_inspectstat] DeclarationKind=Class
                                // JavaLine 257 <== SourceLine 1766
                                ((PARSER)(_CUR._SL._SL)).opn=((char)135);
                            }
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1766);
                            ;
                            // JavaLine 263 <== SourceLine 1767
                            _GOTO(_LABEL_PARSER_grammer_inspectstat_ENDINSP_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 270 <== SourceLine 1770
                ((PARSER)(_CUR._SL._SL)).opn='j';
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1770);
                ;
                // JavaLine 275 <== SourceLine 1771
                {
                    _SIM_LABEL(7); // DeclaredIn: inspectstat
                    if(_VALUE(enclgen_1)) {
                        {
                            enclgen_1=false;
                            ;
                            // JavaLine 282 <== SourceLine 1772
                            ((PARSER_grammer)(_CUR._SL)).blockfound_1=0;
                            ;
                            ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1772);
                        }
                    }
                }
                ;
                // JavaLine 292 <== SourceLine 1773
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack inspect"));
                }
                ;
                // JavaLine 297 <== SourceLine 1775
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 302 <== SourceLine 1776
                ((PARSER_grammer)(_CUR._SL)).itList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 305 <== SourceLine 1778
                detach(1778);
                ;
                // JavaLine 308 <== SourceLine 1781
                ((PARSER_grammer)(_CUR._SL)).itList_1=null;
                ;
                // JavaLine 311 <== SourceLine 1782
                errorno=0;
                ;
                // JavaLine 314 <== SourceLine 1783
                firstwhen_1=iothwsent_1=enclgen_1=recovered=isblocklike=false;
                ;
                // JavaLine 317 <== SourceLine 1785
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 320 <== SourceLine 1786
                _GOTO(_LABEL_PARSER_grammer_inspectstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 323 <== SourceLine 1788
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 inspectstat",1,1699,11,1714,13,1719,15,1733,17,1742,19,1759,21,1766,23,1771,26,1701,44,711,46,1712,49,1713,52,1714,58,1715,60,1716,66,1717,74,1719,80,1720,85,1721,88,1722,91,1723,94,1724,103,1725,107,1726,109,1727,112,1728,117,1729,120,1730,126,1731,134,1733,140,1735,144,1736,148,1737,152,1738,160,1741,163,1742,166,1743,169,1744,172,1745,181,1746,189,1747,195,1748,198,1749,203,1750,210,1751,212,1752,215,1753,223,1755,230,1758,233,1759,236,1760,241,1761,244,1762,247,1763,254,1764,257,1766,263,1767,270,1770,275,1771,282,1772,292,1773,297,1775,302,1776,305,1778,308,1781,311,1782,314,1783,317,1785,320,1786,323,1788,336,1788);
} // End of Class
