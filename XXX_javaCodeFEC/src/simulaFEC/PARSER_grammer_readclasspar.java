// JavaLine 1 <== SourceLine 430
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readclasspar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=430, lastLine=496, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 474
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_hiddenprotected_0=new RTS_LABEL(this,0,1,"hiddenprotected"); // Local Label #1=hiddenprotected At PrefixLevel 0
    // JavaLine 12 <== SourceLine 476
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_Block475_PH_0=new RTS_LABEL(this,0,2,"PH"); // Local Label #2=PH At PrefixLevel 0
    // JavaLine 14 <== SourceLine 486
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_virtualspec_0=new RTS_LABEL(this,0,3,"virtualspec"); // Local Label #3=virtualspec At PrefixLevel 0
    // JavaLine 16 <== SourceLine 488
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_Block487_specification_0=new RTS_LABEL(this,0,4,"specification"); // Local Label #4=specification At PrefixLevel 0
    // JavaLine 18 <== SourceLine 495
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_readclassparexit_0=new RTS_LABEL(this,0,5,"readclassparexit"); // Local Label #5=readclassparexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 21 <== SourceLine 431
    public char oph=0;
    // Normal Constructor
    public PARSER_grammer_readclasspar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readclasspar _STM() {
        PARSER_grammer_readclasspar _THIS=(PARSER_grammer_readclasspar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,5); // For ByteCode Engineering
                // JavaLine 38 <== SourceLine 471
                new PARSER_grammer_readprocpar((_CUR._SL),'l');
                ;
                // JavaLine 41 <== SourceLine 472
                new PARSER_grammer_readclasspar_setrecsymb((_CUR),true);
                ;
                // JavaLine 44 <== SourceLine 473
                {
                    _SIM_LABEL(1); // DeclaredIn: readclasspar
                    // JavaLine 47 <== SourceLine 474
                    while((((((PARSER_grammer)(_CUR._SL)).cs==(((char)22)))||((((PARSER_grammer)(_CUR._SL)).cs==('3'))))||((((PARSER_grammer)(_CUR._SL)).cs==('('))))) {
                        {
                            // JavaLine 50 <== SourceLine 475
                            oph=(((((PARSER_grammer)(_CUR._SL)).cs==('3')))?(((char)136)):(((PARSER_grammer)(_CUR._SL)).cs));
                            ;
                            // JavaLine 53 <== SourceLine 476
                            {
                                _SIM_LABEL(2); // DeclaredIn: readclasspar -> readclasspar[externalIdent=PARSER_grammer_readclasspar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1268261468, Protected by readclasspar defined in grammer
                                ((PARSER_grammer)(_CUR._SL)).detach(476);
                            }
                            ;
                            // JavaLine 59 <== SourceLine 477
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                new PARSER_grammer_readclasspar_classparerror((_CUR),185);
                            }
                            ;
                            // JavaLine 64 <== SourceLine 478
                            ((PARSER)(_CUR._SL._SL)).opn=oph;
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,478);
                            ;
                            // JavaLine 69 <== SourceLine 479
                            ((PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 74 <== SourceLine 480
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                _GOTO(_LABEL_PARSER_grammer_readclasspar_Block475_PH_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 79 <== SourceLine 481
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new PARSER_grammer_skip((_CUR._SL),300);
                            } else {
                                // JavaLine 83 <== SourceLine 482
                                ((PARSER_grammer)(_CUR._SL)).detach(482);
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 91 <== SourceLine 485
                {
                    _SIM_LABEL(3); // DeclaredIn: readclasspar
                    // JavaLine 94 <== SourceLine 486
                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('6')))) {
                        {
                            // JavaLine 97 <== SourceLine 487
                            ((PARSER_grammer)(_CUR._SL)).detach(487);
                            ;
                            // JavaLine 100 <== SourceLine 488
                            {
                                _SIM_LABEL(4); // DeclaredIn: readclasspar -> readclasspar[externalIdent=PARSER_grammer_readclasspar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1268261468, Protected by readclasspar defined in grammer
                                new PARSER_grammer_readspecification((_CUR._SL),((char)148));
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 110 <== SourceLine 489
                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==('!'))||((((PARSER_grammer)(_CUR._SL)).cs==(((char)10))))))) {
                    new PARSER_grammer_ParsErr((_CUR._SL),217);
                } else {
                    // JavaLine 114 <== SourceLine 490
                    if(_VALUE((((((PARSER_grammer)(_CUR._SL)).cs==(((char)22)))||((((PARSER_grammer)(_CUR._SL)).cs==('3'))))||((((PARSER_grammer)(_CUR._SL)).cs==('(')))))) {
                        {
                            // JavaLine 117 <== SourceLine 491
                            new PARSER_grammer_ParsWarn((_CUR._SL),291);
                            ;
                            _GOTO(_LABEL_PARSER_grammer_readclasspar_hiddenprotected_0); // GOTO EVALUATED LABEL
                        }
                    } else {
                        // JavaLine 123 <== SourceLine 492
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs))==(((char)1))))) {
                            new PARSER_grammer_ParsErr((_CUR._SL),218);
                        }
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 494
                {
                    _SIM_LABEL(5); // DeclaredIn: readclasspar
                    // JavaLine 133 <== SourceLine 495
                    new PARSER_grammer_readclasspar_setrecsymb((_CUR),false);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 readclasspar",1,430,10,474,12,476,14,486,16,488,18,495,21,431,38,471,41,472,44,473,47,474,50,475,53,476,59,477,64,478,69,479,74,480,79,481,83,482,91,485,94,486,97,487,100,488,110,489,114,490,117,491,123,492,130,494,133,495,146,496);
} // End of Procedure
