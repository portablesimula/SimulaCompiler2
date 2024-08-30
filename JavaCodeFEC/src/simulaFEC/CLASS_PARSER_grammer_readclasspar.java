// JavaLine 1 <== SourceLine 431
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readclasspar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=431, lastLine=497, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 475
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readclasspar_hiddenprotected_0=new RTS_LABEL(this,0,1,"hiddenprotected"); // Local Label #1=hiddenprotected At PrefixLevel 0
    // JavaLine 12 <== SourceLine 477
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readclasspar_Block476_PH_0=new RTS_LABEL(this,0,2,"PH"); // Local Label #2=PH At PrefixLevel 0
    // JavaLine 14 <== SourceLine 487
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readclasspar_virtualspec_0=new RTS_LABEL(this,0,3,"virtualspec"); // Local Label #3=virtualspec At PrefixLevel 0
    // JavaLine 16 <== SourceLine 489
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readclasspar_Block488_specification_0=new RTS_LABEL(this,0,4,"specification"); // Local Label #4=specification At PrefixLevel 0
    // JavaLine 18 <== SourceLine 496
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readclasspar_readclassparexit_0=new RTS_LABEL(this,0,5,"readclassparexit"); // Local Label #5=readclassparexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 21 <== SourceLine 432
    public char oph=0;
    // Normal Constructor
    public CLASS_PARSER_grammer_readclasspar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readclasspar _STM() {
        CLASS_PARSER_grammer_readclasspar _THIS=(CLASS_PARSER_grammer_readclasspar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,5); // For ByteCode Engineering
                // JavaLine 38 <== SourceLine 472
                new CLASS_PARSER_grammer_readprocpar((_CUR._SL),'l');
                ;
                // JavaLine 41 <== SourceLine 473
                new CLASS_PARSER_grammer_readclasspar_setrecsymb((_CUR),true);
                ;
                // JavaLine 44 <== SourceLine 474
                {
                    _SIM_LABEL(1); // DeclaredIn: readclasspar
                    // JavaLine 47 <== SourceLine 475
                    while((((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)22)))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('3'))))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('('))))) {
                        {
                            // JavaLine 50 <== SourceLine 476
                            oph=(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('3')))?(((char)136)):(((CLASS_PARSER_grammer)(_CUR._SL)).cs));
                            ;
                            // JavaLine 53 <== SourceLine 477
                            {
                                _SIM_LABEL(2); // DeclaredIn: readclasspar -> readclasspar[externalIdent=CLASS_PARSER_grammer_readclasspar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1996472700, Protected by readclasspar defined in grammer
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(477);
                            }
                            ;
                            // JavaLine 59 <== SourceLine 478
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                new CLASS_PARSER_grammer_readclasspar_classparerror((_CUR),185);
                            }
                            ;
                            // JavaLine 64 <== SourceLine 479
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=oph;
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,479);
                            ;
                            // JavaLine 69 <== SourceLine 480
                            ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 74 <== SourceLine 481
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                _GOTO(_LABEL_CLASS_PARSER_grammer_readclasspar_Block476_PH_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 79 <== SourceLine 482
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new CLASS_PARSER_grammer_skip((_CUR._SL),300);
                            } else {
                                // JavaLine 83 <== SourceLine 483
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(483);
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 91 <== SourceLine 486
                {
                    _SIM_LABEL(3); // DeclaredIn: readclasspar
                    // JavaLine 94 <== SourceLine 487
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('6')))) {
                        {
                            // JavaLine 97 <== SourceLine 488
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach(488);
                            ;
                            // JavaLine 100 <== SourceLine 489
                            {
                                _SIM_LABEL(4); // DeclaredIn: readclasspar -> readclasspar[externalIdent=CLASS_PARSER_grammer_readclasspar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1996472700, Protected by readclasspar defined in grammer
                                new CLASS_PARSER_grammer_readspecification((_CUR._SL),((char)148));
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 110 <== SourceLine 490
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('!'))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)10))))))) {
                    new CLASS_PARSER_grammer_ParsErr((_CUR._SL),217);
                } else {
                    // JavaLine 114 <== SourceLine 491
                    if(_VALUE((((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)22)))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('3'))))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('(')))))) {
                        {
                            // JavaLine 117 <== SourceLine 492
                            new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),291);
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_readclasspar_hiddenprotected_0); // GOTO EVALUATED LABEL
                        }
                    } else {
                        // JavaLine 123 <== SourceLine 493
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs))==(((char)1))))) {
                            new CLASS_PARSER_grammer_ParsErr((_CUR._SL),218);
                        }
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 495
                {
                    _SIM_LABEL(5); // DeclaredIn: readclasspar
                    // JavaLine 133 <== SourceLine 496
                    new CLASS_PARSER_grammer_readclasspar_setrecsymb((_CUR),false);
                }
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 readclasspar",1,431,10,475,12,477,14,487,16,489,18,496,21,432,38,472,41,473,44,474,47,475,50,476,53,477,59,478,64,479,69,480,74,481,79,482,83,483,91,486,94,487,97,488,100,489,110,490,114,491,117,492,123,493,130,495,133,496,146,497);
} // End of Procedure
