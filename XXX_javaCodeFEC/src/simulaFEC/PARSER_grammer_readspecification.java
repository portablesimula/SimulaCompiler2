// JavaLine 1 <== SourceLine 501
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readspecification extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=501, lastLine=556, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_speckind;
    // Declare local labels
    // JavaLine 11 <== SourceLine 518
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_spes_0=new RTS_LABEL(this,0,1,"spes"); // Local Label #1=spes At PrefixLevel 0
    // JavaLine 13 <== SourceLine 534
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_Block519_P2_0=new RTS_LABEL(this,0,2,"P2"); // Local Label #2=P2 At PrefixLevel 0
    // JavaLine 15 <== SourceLine 535
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_Block519_P3_0=new RTS_LABEL(this,0,3,"P3"); // Local Label #3=P3 At PrefixLevel 0
    // JavaLine 17 <== SourceLine 536
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_Block519_P4_0=new RTS_LABEL(this,0,4,"P4"); // Local Label #4=P4 At PrefixLevel 0
    // JavaLine 19 <== SourceLine 550
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_P5_0=new RTS_LABEL(this,0,5,"P5"); // Local Label #5=P5 At PrefixLevel 0
    // JavaLine 21 <== SourceLine 555
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_readspecificationexit_0=new RTS_LABEL(this,0,6,"readspecificationexit"); // Local Label #6=readspecificationexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 502
    public char opnx=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readspecification setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_speckind=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_readspecification(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readspecification(RTS_RTObject _SL,char sp_speckind) {
        super(_SL);
        // Parameter assignment to locals
        this.p_speckind = sp_speckind;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readspecification _STM() {
        PARSER_grammer_readspecification _THIS=(PARSER_grammer_readspecification)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 517
                ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),true);
                ;
                // JavaLine 61 <== SourceLine 518
                {
                    _SIM_LABEL(1); // DeclaredIn: readspecification
                    while(true) {
                        {
                            // JavaLine 66 <== SourceLine 519
                            new PARSER_grammer_readtypespec((_CUR._SL));
                            ;
                            opnx=((char)0);
                            ;
                            // JavaLine 71 <== SourceLine 528
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                {
                                    // JavaLine 74 <== SourceLine 529
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
                                        {
                                            ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                            ;
                                            call(((PARSER)(_CUR._SL._SL)).coder,529);
                                        }
                                    } else {
                                        // JavaLine 82 <== SourceLine 530
                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)13))))) {
                                            {
                                                ((PARSER)(_CUR._SL._SL)).opn=((char)5);
                                                ;
                                                call(((PARSER)(_CUR._SL._SL)).coder,530);
                                            }
                                        } else {
                                            // JavaLine 90 <== SourceLine 531
                                            if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs!=(((char)11)))&&((((PARSER_grammer)(_CUR._SL)).cs!=('/')))))) {
                                                _GOTO(_LABEL_PARSER_grammer_readspecification_P5_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                    }
                                }
                            } else {
                                // JavaLine 98 <== SourceLine 532
                                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs!=(((char)12)))&&((((PARSER_grammer)(_CUR._SL)).cs!=(((char)13))))))) {
                                    _GOTO(_LABEL_PARSER_grammer_readspecification_Block519_P4_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 104 <== SourceLine 534
                            {
                                _SIM_LABEL(2); // DeclaredIn: readspecification -> readspecification[externalIdent=PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1273684451, Protected by readspecification defined in grammer
                                opnx=((PARSER)(_CUR._SL._SL)).opn=((PARSER_grammer)(_CUR._SL)).cs;
                            }
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,534);
                            ;
                            // JavaLine 112 <== SourceLine 535
                            {
                                _SIM_LABEL(3); // DeclaredIn: readspecification -> readspecification[externalIdent=PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1273684451, Protected by readspecification defined in grammer
                                ((PARSER_grammer)(_CUR._SL)).detach(535);
                            }
                            ;
                            // JavaLine 118 <== SourceLine 536
                            {
                                _SIM_LABEL(4); // DeclaredIn: readspecification -> readspecification[externalIdent=PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1273684451, Protected by readspecification defined in grammer
                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                    new PARSER_grammer_readspecification_specificationerror((_CUR),185);
                                }
                            }
                            ;
                            // JavaLine 126 <== SourceLine 537
                            ((PARSER)(_CUR._SL._SL)).opn=p_speckind;
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,537);
                            ;
                            // JavaLine 131 <== SourceLine 538
                            if(_VALUE((((PARSER)(_CUR._SL._SL)).opt==('N')))) {
                                _GOTO(_LABEL_PARSER_grammer_readspecification_Block519_P3_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 136 <== SourceLine 539
                            ((PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 141 <== SourceLine 540
                            if(_VALUE((((((PARSER_grammer)(_CUR._SL)).cs==(((char)29)))&&((opnx==(((char)12)))))&&((p_speckind==(((char)148))))))) {
                                // JavaLine 143 <== SourceLine 541
                                {
                                    // JavaLine 145 <== SourceLine 542
                                    ((PARSER_grammer)(_CUR._SL)).specofvirtual_1=true;
                                    ;
                                    // JavaLine 148 <== SourceLine 543
                                    if(_VALUE((!(new PARSER_grammer_extbinding((_CUR._SL))._RESULT)))) {
                                        new PARSER_grammer_readspecification_specificationerror((_CUR),214);
                                    }
                                    ;
                                    // JavaLine 153 <== SourceLine 544
                                    ((PARSER_grammer)(_CUR._SL)).specofvirtual_1=false;
                                    ;
                                    // JavaLine 156 <== SourceLine 545
                                    ((PARSER)(_CUR._SL._SL)).opn='y';
                                    ;
                                    call(((PARSER)(_CUR._SL._SL)).coder,545);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 164 <== SourceLine 547
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new PARSER_grammer_ParsWarn((_CUR._SL),300);
                            } else {
                                // JavaLine 168 <== SourceLine 548
                                ((PARSER_grammer)(_CUR._SL)).detach(548);
                            }
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                }
                ;
                // JavaLine 177 <== SourceLine 550
                {
                    _SIM_LABEL(5); // DeclaredIn: readspecification
                    if(_VALUE((((p_speckind==(((char)148)))&&((opnx==(((char)0)))))&&((((PARSER_grammer)(_CUR._SL)).cs==('Z')))))) {
                        // JavaLine 181 <== SourceLine 551
                        {
                            // JavaLine 183 <== SourceLine 552
                            new PARSER_grammer_ParsErr((_CUR._SL),184);
                            ;
                            ((PARSER)(_CUR._SL._SL)).opn=opnx=((char)12);
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,552);
                            ;
                            _GOTO(_LABEL_PARSER_grammer_readspecification_Block519_P4_0); // GOTO EVALUATED LABEL
                        }
                    }
                }
                ;
                // JavaLine 195 <== SourceLine 554
                {
                    _SIM_LABEL(6); // DeclaredIn: readspecification
                    // JavaLine 198 <== SourceLine 555
                    ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),false);
                }
                ;
                ((PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 readspecification",1,501,11,518,13,534,15,535,17,536,19,550,21,555,24,502,58,517,61,518,66,519,71,528,74,529,82,530,90,531,98,532,104,534,112,535,118,536,126,537,131,538,136,539,141,540,143,541,145,542,148,543,153,544,156,545,164,547,168,548,177,550,181,551,183,552,195,554,198,555,213,556);
} // End of Procedure
