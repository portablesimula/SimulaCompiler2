// JavaLine 1 <== SourceLine 714
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_module extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=714, lastLine=761, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 736
    final RTS_LABEL _LABEL_PARSER_grammer_module_S0_1=new RTS_LABEL(this,1,1,"S0"); // Local Label #1=S0 At PrefixLevel 1
    // JavaLine 13 <== SourceLine 739
    final RTS_LABEL _LABEL_PARSER_grammer_module_RECOVER3_1=new RTS_LABEL(this,1,2,"RECOVER3"); // Local Label #2=RECOVER3 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 741
    final RTS_LABEL _LABEL_PARSER_grammer_module_Block740_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 743
    final RTS_LABEL _LABEL_PARSER_grammer_module_Block740_S1_0=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 744
    final RTS_LABEL _LABEL_PARSER_grammer_module_Block740_RECOVER1_0=new RTS_LABEL(this,1,5,"RECOVER1"); // Local Label #5=RECOVER1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 748
    final RTS_LABEL _LABEL_PARSER_grammer_module_RECOVER2_1=new RTS_LABEL(this,1,6,"RECOVER2"); // Local Label #6=RECOVER2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 750
    final RTS_LABEL _LABEL_PARSER_grammer_module_S2_1=new RTS_LABEL(this,1,7,"S2"); // Local Label #7=S2 At PrefixLevel 1
    // JavaLine 25 <== SourceLine 751
    final RTS_LABEL _LABEL_PARSER_grammer_module_RECOVER4_1=new RTS_LABEL(this,1,8,"RECOVER4"); // Local Label #8=RECOVER4 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 28 <== SourceLine 716
    public boolean SepOK_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_module_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,PARSER_grammer_module_recoversetting.class)); }
    // Normal Constructor
    public PARSER_grammer_module(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_module _STM() {
        PARSER_grammer_module _THIS=(PARSER_grammer_module)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,8); // For ByteCode Engineering
                // JavaLine 45 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 47 <== SourceLine 733
                detach(733);
                ;
                // JavaLine 50 <== SourceLine 734
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("module"));
                }
                ;
                // JavaLine 55 <== SourceLine 736
                {
                    _SIM_LABEL(1); // DeclaredIn: module
                    isblocklike=true;
                }
                ;
                blockstatus=((char)1);
                ;
                // JavaLine 63 <== SourceLine 737
                stmtreq=((char)2);
                ;
                // JavaLine 66 <== SourceLine 738
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)18))))) {
                    new PARSER_codebuffer((_CUR._SL._SL),new RTS_TXT("$ext$"))._START();
                }
                ;
                // JavaLine 71 <== SourceLine 739
                {
                    _SIM_LABEL(2); // DeclaredIn: module
                    while((((PARSER_grammer)(_CUR._SL)).cs==(((char)18)))) {
                        {
                            // JavaLine 76 <== SourceLine 740
                            rp=((char)1);
                            ;
                            // JavaLine 79 <== SourceLine 741
                            {
                                _SIM_LABEL(3); // DeclaredIn: module -> module[PARSER_grammer_module] DeclarationKind=Class
                                detach(741);
                            }
                            ;
                            _GOTO(new RPSW((_CUR),(RTS_ENVIRONMENT.rank(rp)+(1)))._RESULT); // GOTO EVALUATED LABEL
                            ;
                            // JavaLine 87 <== SourceLine 742
                            {
                                _SIM_LABEL(4); // DeclaredIn: module -> module[PARSER_grammer_module] DeclarationKind=Class
                                _SIM_LABEL(5); // DeclaredIn: module -> module[PARSER_grammer_module] DeclarationKind=Class
                                ;
                            }
                        }
                    }
                }
                ;
                // JavaLine 97 <== SourceLine 746
                if(_VALUE(_IS(((PARSER)(_CUR._SL._SL)).coder,PARSER_codebuffer.class))) {
                    new PARSER_codebuffer_termModul(((PARSER_codebuffer)(((PARSER)(_CUR._SL._SL)).coder)));
                }
                ;
                // JavaLine 102 <== SourceLine 748
                {
                    _SIM_LABEL(6); // DeclaredIn: module
                    rp=((char)2);
                }
                ;
                _GOTO(_LABEL_PARSER_grammer_module_Block740_PARSE_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 110 <== SourceLine 750
                {
                    _SIM_LABEL(7); // DeclaredIn: module
                    while((((PARSER_grammer)(_CUR._SL)).cs!=('X'))) {
                        new PARSER_grammer_NEXTSYMBOL((_CUR._SL));
                    }
                }
                ;
                // JavaLine 118 <== SourceLine 751
                {
                    _SIM_LABEL(8); // DeclaredIn: module
                    if(_VALUE((SepOK_1||(((PARSER)(_CUR._SL._SL)).separatecomp)))) {
                        ;
                    } else {
                        // JavaLine 124 <== SourceLine 752
                        new PARSER_grammer_ParsErr((_CUR._SL),212);
                    }
                }
                ;
                // JavaLine 129 <== SourceLine 753
                while((((PARSER_grammer)(_CUR._SL)).blockfound_1>(0))) {
                    {
                        // JavaLine 132 <== SourceLine 754
                        ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,754);
                        ;
                        ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                    }
                }
                ;
                // JavaLine 141 <== SourceLine 757
                ((PARSER)(_CUR._SL._SL)).opn='X';
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,757);
                ;
                // JavaLine 146 <== SourceLine 758
                while(true) {
                    new PARSER_grammer_NEXTSYMBOL((_CUR._SL));
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 152 <== SourceLine 761
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 module",1,714,11,736,13,739,15,741,17,743,19,744,21,748,23,750,25,751,28,716,45,711,47,733,50,734,55,736,63,737,66,738,71,739,76,740,79,741,87,742,97,746,102,748,110,750,118,751,124,752,129,753,132,754,141,757,146,758,152,761,165,761);
} // End of Class
