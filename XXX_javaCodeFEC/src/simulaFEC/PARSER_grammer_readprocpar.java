// JavaLine 1 <== SourceLine 345
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readprocpar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=345, lastLine=427, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_speckind;
    // Declare local labels
    // JavaLine 11 <== SourceLine 392
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_P1_0=new RTS_LABEL(this,0,1,"P1"); // Local Label #1=P1 At PrefixLevel 0
    // JavaLine 13 <== SourceLine 400
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_checksemic_0=new RTS_LABEL(this,0,2,"checksemic"); // Local Label #2=checksemic At PrefixLevel 0
    // JavaLine 15 <== SourceLine 402
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_namevaluepart_0=new RTS_LABEL(this,0,3,"namevaluepart"); // Local Label #3=namevaluepart At PrefixLevel 0
    // JavaLine 17 <== SourceLine 405
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_Block403_P3_0=new RTS_LABEL(this,0,4,"P3"); // Local Label #4=P3 At PrefixLevel 0
    // JavaLine 19 <== SourceLine 406
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_Block403_P2_0=new RTS_LABEL(this,0,5,"P2"); // Local Label #5=P2 At PrefixLevel 0
    // JavaLine 21 <== SourceLine 417
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_Block392_specification_0=new RTS_LABEL(this,0,6,"specification"); // Local Label #6=specification At PrefixLevel 0
    // JavaLine 23 <== SourceLine 424
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_readprocparexit_0=new RTS_LABEL(this,0,7,"readprocparexit"); // Local Label #7=readprocparexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 26 <== SourceLine 348
    public char opx=0;
    // JavaLine 28 <== SourceLine 349
    public boolean namefound=false;
    public boolean valuefound=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readprocpar setPar(Object param) {
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
    public PARSER_grammer_readprocpar(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readprocpar(RTS_RTObject _SL,char sp_speckind) {
        super(_SL);
        // Parameter assignment to locals
        this.p_speckind = sp_speckind;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readprocpar _STM() {
        PARSER_grammer_readprocpar _THIS=(PARSER_grammer_readprocpar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 63 <== SourceLine 390
                new PARSER_grammer_readprocpar_setrecsymb((_CUR),true);
                ;
                // JavaLine 66 <== SourceLine 391
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('P')))) {
                    {
                        // JavaLine 69 <== SourceLine 392
                        {
                            _SIM_LABEL(1); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                            ((PARSER_grammer)(_CUR._SL)).detach(392);
                        }
                        ;
                        // JavaLine 75 <== SourceLine 393
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                            new PARSER_grammer_readprocpar_procparerror((_CUR),185);
                        }
                        ;
                        // JavaLine 80 <== SourceLine 394
                        ((PARSER)(_CUR._SL._SL)).opn='_';
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,394);
                        ;
                        // JavaLine 85 <== SourceLine 395
                        ((PARSER_grammer)(_CUR._SL)).getopt=false;
                        ;
                        ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                        ;
                        // JavaLine 90 <== SourceLine 396
                        if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                            new PARSER_grammer_lookforstring((_CUR._SL));
                        }
                        ;
                        // JavaLine 95 <== SourceLine 397
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                            _GOTO(_LABEL_PARSER_grammer_readprocpar_Block392_P1_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 100 <== SourceLine 398
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                            new PARSER_grammer_readprocpar_procparerror((_CUR),186);
                        }
                        ;
                        // JavaLine 105 <== SourceLine 399
                        ((PARSER_grammer)(_CUR._SL)).detach(399);
                        ;
                        // JavaLine 108 <== SourceLine 400
                        {
                            _SIM_LABEL(2); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new PARSER_grammer_ParsWarn((_CUR._SL),300);
                            } else {
                                // JavaLine 114 <== SourceLine 401
                                ((PARSER_grammer)(_CUR._SL)).detach(401);
                            }
                        }
                        ;
                        // JavaLine 119 <== SourceLine 402
                        {
                            _SIM_LABEL(3); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)10))))) {
                                {
                                    // JavaLine 124 <== SourceLine 403
                                    if(_VALUE(valuefound)) {
                                        new PARSER_grammer_ParsErr((_CUR._SL),196);
                                    }
                                    ;
                                    // JavaLine 129 <== SourceLine 404
                                    valuefound=true;
                                    ;
                                    // JavaLine 132 <== SourceLine 405
                                    {
                                        _SIM_LABEL(4); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                                        opx=((PARSER_grammer)(_CUR._SL)).cs;
                                    }
                                    ;
                                    // JavaLine 138 <== SourceLine 406
                                    {
                                        _SIM_LABEL(5); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                                        ((PARSER_grammer)(_CUR._SL)).detach(406);
                                    }
                                    ;
                                    // JavaLine 144 <== SourceLine 407
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                        new PARSER_grammer_readprocpar_procparerror((_CUR),185);
                                    }
                                    ;
                                    // JavaLine 149 <== SourceLine 408
                                    ((PARSER)(_CUR._SL._SL)).opn=opx;
                                    ;
                                    call(((PARSER)(_CUR._SL._SL)).coder,408);
                                    ;
                                    // JavaLine 154 <== SourceLine 409
                                    ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 159 <== SourceLine 410
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                        _GOTO(_LABEL_PARSER_grammer_readprocpar_Block392_Block403_P2_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_readprocpar_Block392_checksemic_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 170 <== SourceLine 412
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('!')))) {
                            {
                                // JavaLine 173 <== SourceLine 413
                                if(_VALUE((p_speckind==('l')))) {
                                    new PARSER_grammer_ParsErr((_CUR._SL),194);
                                } else {
                                    // JavaLine 177 <== SourceLine 414
                                    if(_VALUE(namefound)) {
                                        new PARSER_grammer_ParsErr((_CUR._SL),195);
                                    }
                                }
                                ;
                                // JavaLine 183 <== SourceLine 415
                                namefound=true;
                                ;
                                _GOTO(_LABEL_PARSER_grammer_readprocpar_Block392_Block403_P3_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 191 <== SourceLine 417
                        {
                            _SIM_LABEL(6); // DeclaredIn: readprocpar -> readprocpar[externalIdent=PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1165585194, Protected by readprocpar defined in grammer
                            new PARSER_grammer_readspecification((_CUR._SL),p_speckind);
                        }
                        ;
                        // JavaLine 197 <== SourceLine 418
                        if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==('!'))||((((PARSER_grammer)(_CUR._SL)).cs==(((char)10))))))) {
                            new PARSER_grammer_readprocpar_procparerror((_CUR),217);
                        }
                        ;
                    }
                } else {
                    // JavaLine 204 <== SourceLine 420
                    {
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                            new PARSER_grammer_ParsWarn((_CUR._SL),286);
                        } else {
                            // JavaLine 209 <== SourceLine 421
                            ((PARSER_grammer)(_CUR._SL)).detach(421);
                        }
                        ;
                    }
                }
                ;
                // JavaLine 216 <== SourceLine 423
                {
                    _SIM_LABEL(7); // DeclaredIn: readprocpar
                    // JavaLine 219 <== SourceLine 424
                    if(_VALUE(((PARSER_grammer)(_CUR._SL)).specofvirtual_1)) {
                        ;
                    } else {
                        {
                            // JavaLine 224 <== SourceLine 425
                            ((PARSER)(_CUR._SL._SL)).opn='x';
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,425);
                            ;
                        }
                    }
                }
                ;
                // JavaLine 233 <== SourceLine 426
                new PARSER_grammer_readprocpar_setrecsymb((_CUR),false);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 readprocpar",1,345,11,392,13,400,15,402,17,405,19,406,21,417,23,424,26,348,28,349,63,390,66,391,69,392,75,393,80,394,85,395,90,396,95,397,100,398,105,399,108,400,114,401,119,402,124,403,129,404,132,405,138,406,144,407,149,408,154,409,159,410,170,412,173,413,177,414,183,415,191,417,197,418,204,420,209,421,216,423,219,424,224,425,233,426,245,427);
} // End of Procedure
