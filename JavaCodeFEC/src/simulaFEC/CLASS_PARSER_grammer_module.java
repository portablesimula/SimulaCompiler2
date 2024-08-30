// JavaLine 1 <== SourceLine 715
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_module extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=715, lastLine=762, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 737
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_S0_1=new RTS_LABEL(this,1,1,"S0"); // Local Label #1=S0 At PrefixLevel 1
    // JavaLine 13 <== SourceLine 740
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_RECOVER3_1=new RTS_LABEL(this,1,2,"RECOVER3"); // Local Label #2=RECOVER3 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 742
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_Block741_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 744
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_Block741_S1_0=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 745
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_Block741_RECOVER1_0=new RTS_LABEL(this,1,5,"RECOVER1"); // Local Label #5=RECOVER1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 749
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_RECOVER2_1=new RTS_LABEL(this,1,6,"RECOVER2"); // Local Label #6=RECOVER2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 751
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_S2_1=new RTS_LABEL(this,1,7,"S2"); // Local Label #7=S2 At PrefixLevel 1
    // JavaLine 25 <== SourceLine 752
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_module_RECOVER4_1=new RTS_LABEL(this,1,8,"RECOVER4"); // Local Label #8=RECOVER4 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 28 <== SourceLine 717
    public boolean SepOK_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_module_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_module_recoversetting.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_module(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_module _STM() {
        CLASS_PARSER_grammer_module _THIS=(CLASS_PARSER_grammer_module)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,8); // For ByteCode Engineering
                // JavaLine 45 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 47 <== SourceLine 734
                detach(734);
                ;
                // JavaLine 50 <== SourceLine 735
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("module"));
                }
                ;
                // JavaLine 55 <== SourceLine 737
                {
                    _SIM_LABEL(1); // DeclaredIn: module
                    isblocklike=true;
                }
                ;
                blockstatus=((char)1);
                ;
                // JavaLine 63 <== SourceLine 738
                stmtreq=((char)2);
                ;
                // JavaLine 66 <== SourceLine 739
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)18))))) {
                    new CLASS_PARSER_codebuffer((_CUR._SL._SL),new RTS_TXT("$ext$"))._START();
                }
                ;
                // JavaLine 71 <== SourceLine 740
                {
                    _SIM_LABEL(2); // DeclaredIn: module
                    while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)18)))) {
                        {
                            // JavaLine 76 <== SourceLine 741
                            rp=((char)1);
                            ;
                            // JavaLine 79 <== SourceLine 742
                            {
                                _SIM_LABEL(3); // DeclaredIn: module -> module[CLASS_PARSER_grammer_module] DeclarationKind=Class
                                detach(742);
                            }
                            ;
                            _GOTO(new RPSW((_CUR),(RTS_ENVIRONMENT.rank(rp)+(1)))._RESULT); // GOTO EVALUATED LABEL
                            ;
                            // JavaLine 87 <== SourceLine 743
                            {
                                _SIM_LABEL(4); // DeclaredIn: module -> module[CLASS_PARSER_grammer_module] DeclarationKind=Class
                                _SIM_LABEL(5); // DeclaredIn: module -> module[CLASS_PARSER_grammer_module] DeclarationKind=Class
                                ;
                            }
                        }
                    }
                }
                ;
                // JavaLine 97 <== SourceLine 747
                if(_VALUE(RTS_UTIL._IS(((CLASS_PARSER)(_CUR._SL._SL)).coder,CLASS_PARSER_codebuffer.class))) {
                    new CLASS_PARSER_codebuffer_termModul(((CLASS_PARSER_codebuffer)(((CLASS_PARSER)(_CUR._SL._SL)).coder)));
                }
                ;
                // JavaLine 102 <== SourceLine 749
                {
                    _SIM_LABEL(6); // DeclaredIn: module
                    rp=((char)2);
                }
                ;
                _GOTO(_LABEL_CLASS_PARSER_grammer_module_Block741_PARSE_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 110 <== SourceLine 751
                {
                    _SIM_LABEL(7); // DeclaredIn: module
                    while((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('X'))) {
                        new CLASS_PARSER_grammer_NEXTSYMBOL((_CUR._SL));
                    }
                }
                ;
                // JavaLine 118 <== SourceLine 752
                {
                    _SIM_LABEL(8); // DeclaredIn: module
                    if(_VALUE((SepOK_1||(((CLASS_PARSER)(_CUR._SL._SL)).separatecomp)))) {
                        ;
                    } else {
                        // JavaLine 124 <== SourceLine 753
                        new CLASS_PARSER_grammer_ParsErr((_CUR._SL),212);
                    }
                }
                ;
                // JavaLine 129 <== SourceLine 754
                while((((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1>(0))) {
                    {
                        // JavaLine 132 <== SourceLine 755
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,755);
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                    }
                }
                ;
                // JavaLine 141 <== SourceLine 758
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='X';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,758);
                ;
                // JavaLine 146 <== SourceLine 759
                while(true) {
                    new CLASS_PARSER_grammer_NEXTSYMBOL((_CUR._SL));
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 152 <== SourceLine 762
                // BEGIN module INNER PART
                // ENDOF module INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 module",1,715,11,737,13,740,15,742,17,744,19,745,21,749,23,751,25,752,28,717,45,712,47,734,50,735,55,737,63,738,66,739,71,740,76,741,79,742,87,743,97,747,102,749,110,751,118,752,124,753,129,754,132,755,141,758,146,759,152,762,165,762);
} // End of Class
