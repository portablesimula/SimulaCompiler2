// JavaLine 1 <== SourceLine 502
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readspecification extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=502, lastLine=557, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_speckind;
    // Declare local labels
    // JavaLine 11 <== SourceLine 519
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_spes_0=new RTS_LABEL(this,0,1,"spes"); // Local Label #1=spes At PrefixLevel 0
    // JavaLine 13 <== SourceLine 535
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_Block520_P2_0=new RTS_LABEL(this,0,2,"P2"); // Local Label #2=P2 At PrefixLevel 0
    // JavaLine 15 <== SourceLine 536
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_Block520_P3_0=new RTS_LABEL(this,0,3,"P3"); // Local Label #3=P3 At PrefixLevel 0
    // JavaLine 17 <== SourceLine 537
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_Block520_P4_0=new RTS_LABEL(this,0,4,"P4"); // Local Label #4=P4 At PrefixLevel 0
    // JavaLine 19 <== SourceLine 551
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_P5_0=new RTS_LABEL(this,0,5,"P5"); // Local Label #5=P5 At PrefixLevel 0
    // JavaLine 21 <== SourceLine 556
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readspecification_readspecificationexit_0=new RTS_LABEL(this,0,6,"readspecificationexit"); // Local Label #6=readspecificationexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 503
    public char opnx=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_readspecification setPar(Object param) {
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
    public CLASS_PARSER_grammer_readspecification(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_readspecification(RTS_RTObject _SL,char sp_speckind) {
        super(_SL);
        // Parameter assignment to locals
        this.p_speckind = sp_speckind;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readspecification _STM() {
        CLASS_PARSER_grammer_readspecification _THIS=(CLASS_PARSER_grammer_readspecification)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 518
                ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),true);
                ;
                // JavaLine 61 <== SourceLine 519
                {
                    _SIM_LABEL(1); // DeclaredIn: readspecification
                    while(true) {
                        {
                            // JavaLine 66 <== SourceLine 520
                            new CLASS_PARSER_grammer_readtypespec((_CUR._SL));
                            ;
                            opnx=((char)0);
                            ;
                            // JavaLine 71 <== SourceLine 529
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                {
                                    // JavaLine 74 <== SourceLine 530
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
                                        {
                                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                            ;
                                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,530);
                                        }
                                    } else {
                                        // JavaLine 82 <== SourceLine 531
                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)13))))) {
                                            {
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)5);
                                                ;
                                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,531);
                                            }
                                        } else {
                                            // JavaLine 90 <== SourceLine 532
                                            if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)11)))&&((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('/')))))) {
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_readspecification_P5_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                    }
                                }
                            } else {
                                // JavaLine 98 <== SourceLine 533
                                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)12)))&&((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)13))))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_readspecification_Block520_P4_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 104 <== SourceLine 535
                            {
                                _SIM_LABEL(2); // DeclaredIn: readspecification -> readspecification[externalIdent=CLASS_PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1657624109, Protected by readspecification defined in grammer
                                opnx=((CLASS_PARSER)(_CUR._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL)).cs;
                            }
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,535);
                            ;
                            // JavaLine 112 <== SourceLine 536
                            {
                                _SIM_LABEL(3); // DeclaredIn: readspecification -> readspecification[externalIdent=CLASS_PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1657624109, Protected by readspecification defined in grammer
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(536);
                            }
                            ;
                            // JavaLine 118 <== SourceLine 537
                            {
                                _SIM_LABEL(4); // DeclaredIn: readspecification -> readspecification[externalIdent=CLASS_PARSER_grammer_readspecification] Kind=5, QUAL=ProcedureDeclaration, HashCode=1657624109, Protected by readspecification defined in grammer
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                    new CLASS_PARSER_grammer_readspecification_specificationerror((_CUR),185);
                                }
                            }
                            ;
                            // JavaLine 126 <== SourceLine 538
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=p_speckind;
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,538);
                            ;
                            // JavaLine 131 <== SourceLine 539
                            if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).opt==('N')))) {
                                _GOTO(_LABEL_CLASS_PARSER_grammer_readspecification_Block520_P3_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 136 <== SourceLine 540
                            ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 141 <== SourceLine 541
                            if(_VALUE((((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)29)))&&((opnx==(((char)12)))))&&((p_speckind==(((char)148))))))) {
                                // JavaLine 143 <== SourceLine 542
                                {
                                    // JavaLine 145 <== SourceLine 543
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).specofvirtual_1=true;
                                    ;
                                    // JavaLine 148 <== SourceLine 544
                                    if(_VALUE((!(new CLASS_PARSER_grammer_extbinding((_CUR._SL))._RESULT)))) {
                                        new CLASS_PARSER_grammer_readspecification_specificationerror((_CUR),214);
                                    }
                                    ;
                                    // JavaLine 153 <== SourceLine 545
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).specofvirtual_1=false;
                                    ;
                                    // JavaLine 156 <== SourceLine 546
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn='y';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,546);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 164 <== SourceLine 548
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),300);
                            } else {
                                // JavaLine 168 <== SourceLine 549
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(549);
                            }
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                }
                ;
                // JavaLine 177 <== SourceLine 551
                {
                    _SIM_LABEL(5); // DeclaredIn: readspecification
                    if(_VALUE((((p_speckind==(((char)148)))&&((opnx==(((char)0)))))&&((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('Z')))))) {
                        // JavaLine 181 <== SourceLine 552
                        {
                            // JavaLine 183 <== SourceLine 553
                            new CLASS_PARSER_grammer_ParsErr((_CUR._SL),184);
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=opnx=((char)12);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,553);
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_readspecification_Block520_P4_0); // GOTO EVALUATED LABEL
                        }
                    }
                }
                ;
                // JavaLine 195 <== SourceLine 555
                {
                    _SIM_LABEL(6); // DeclaredIn: readspecification
                    // JavaLine 198 <== SourceLine 556
                    ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),false);
                }
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 readspecification",1,502,11,519,13,535,15,536,17,537,19,551,21,556,24,503,58,518,61,519,66,520,71,529,74,530,82,531,90,532,98,533,104,535,112,536,118,537,126,538,131,539,136,540,141,541,143,542,145,543,148,544,153,545,156,546,164,548,168,549,177,551,181,552,183,553,195,555,198,556,213,557);
} // End of Procedure
