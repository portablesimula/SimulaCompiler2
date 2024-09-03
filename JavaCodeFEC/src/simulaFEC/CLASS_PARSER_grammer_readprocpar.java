// JavaLine 1 <== SourceLine 346
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readprocpar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=346, lastLine=428, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_speckind;
    // Declare local labels
    // JavaLine 11 <== SourceLine 393
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_P1_0=new RTS_LABEL(this,0,1,"P1"); // Local Label #1=P1 At PrefixLevel 0
    // JavaLine 13 <== SourceLine 401
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_checksemic_0=new RTS_LABEL(this,0,2,"checksemic"); // Local Label #2=checksemic At PrefixLevel 0
    // JavaLine 15 <== SourceLine 403
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_namevaluepart_0=new RTS_LABEL(this,0,3,"namevaluepart"); // Local Label #3=namevaluepart At PrefixLevel 0
    // JavaLine 17 <== SourceLine 406
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_Block404_P3_0=new RTS_LABEL(this,0,4,"P3"); // Local Label #4=P3 At PrefixLevel 0
    // JavaLine 19 <== SourceLine 407
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_Block404_P2_0=new RTS_LABEL(this,0,5,"P2"); // Local Label #5=P2 At PrefixLevel 0
    // JavaLine 21 <== SourceLine 418
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_Block393_specification_0=new RTS_LABEL(this,0,6,"specification"); // Local Label #6=specification At PrefixLevel 0
    // JavaLine 23 <== SourceLine 425
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_readprocpar_readprocparexit_0=new RTS_LABEL(this,0,7,"readprocparexit"); // Local Label #7=readprocparexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 26 <== SourceLine 349
    public char opx=0;
    // JavaLine 28 <== SourceLine 350
    public boolean namefound=false;
    public boolean valuefound=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_readprocpar setPar(Object param) {
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
    public CLASS_PARSER_grammer_readprocpar(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_readprocpar(RTS_RTObject _SL,char sp_speckind) {
        super(_SL);
        // Parameter assignment to locals
        this.p_speckind = sp_speckind;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readprocpar _STM() {
        CLASS_PARSER_grammer_readprocpar _THIS=(CLASS_PARSER_grammer_readprocpar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 63 <== SourceLine 391
                new CLASS_PARSER_grammer_readprocpar_setrecsymb((_CUR),true);
                ;
                // JavaLine 66 <== SourceLine 392
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('P')))) {
                    {
                        // JavaLine 69 <== SourceLine 393
                        {
                            _SIM_LABEL(1); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach(393);
                        }
                        ;
                        // JavaLine 75 <== SourceLine 394
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                            new CLASS_PARSER_grammer_readprocpar_procparerror((_CUR),185);
                        }
                        ;
                        // JavaLine 80 <== SourceLine 395
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='_';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,395);
                        ;
                        // JavaLine 85 <== SourceLine 396
                        ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                        ;
                        // JavaLine 90 <== SourceLine 397
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                            new CLASS_PARSER_grammer_lookforstring((_CUR._SL));
                        }
                        ;
                        // JavaLine 95 <== SourceLine 398
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_readprocpar_Block393_P1_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 100 <== SourceLine 399
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Q')))) {
                            new CLASS_PARSER_grammer_readprocpar_procparerror((_CUR),186);
                        }
                        ;
                        // JavaLine 105 <== SourceLine 400
                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach(400);
                        ;
                        // JavaLine 108 <== SourceLine 401
                        {
                            _SIM_LABEL(2); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                                new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),300);
                            } else {
                                // JavaLine 114 <== SourceLine 402
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(402);
                            }
                        }
                        ;
                        // JavaLine 119 <== SourceLine 403
                        {
                            _SIM_LABEL(3); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)10))))) {
                                {
                                    // JavaLine 124 <== SourceLine 404
                                    if(_VALUE(valuefound)) {
                                        new CLASS_PARSER_grammer_ParsErr((_CUR._SL),196);
                                    }
                                    ;
                                    // JavaLine 129 <== SourceLine 405
                                    valuefound=true;
                                    ;
                                    // JavaLine 132 <== SourceLine 406
                                    {
                                        _SIM_LABEL(4); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                                        opx=((CLASS_PARSER_grammer)(_CUR._SL)).cs;
                                    }
                                    ;
                                    // JavaLine 138 <== SourceLine 407
                                    {
                                        _SIM_LABEL(5); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach(407);
                                    }
                                    ;
                                    // JavaLine 144 <== SourceLine 408
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                        new CLASS_PARSER_grammer_readprocpar_procparerror((_CUR),185);
                                    }
                                    ;
                                    // JavaLine 149 <== SourceLine 409
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=opx;
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,409);
                                    ;
                                    // JavaLine 154 <== SourceLine 410
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 159 <== SourceLine 411
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_readprocpar_Block393_Block404_P2_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_readprocpar_Block393_checksemic_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 170 <== SourceLine 413
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('!')))) {
                            {
                                // JavaLine 173 <== SourceLine 414
                                if(_VALUE((p_speckind==('l')))) {
                                    new CLASS_PARSER_grammer_ParsErr((_CUR._SL),194);
                                } else {
                                    // JavaLine 177 <== SourceLine 415
                                    if(_VALUE(namefound)) {
                                        new CLASS_PARSER_grammer_ParsErr((_CUR._SL),195);
                                    }
                                }
                                ;
                                // JavaLine 183 <== SourceLine 416
                                namefound=true;
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_readprocpar_Block393_Block404_P3_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 191 <== SourceLine 418
                        {
                            _SIM_LABEL(6); // DeclaredIn: readprocpar -> readprocpar[externalIdent=CLASS_PARSER_grammer_readprocpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1855172839, Protected by readprocpar defined in grammer
                            new CLASS_PARSER_grammer_readspecification((_CUR._SL),p_speckind);
                        }
                        ;
                        // JavaLine 197 <== SourceLine 419
                        if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('!'))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)10))))))) {
                            new CLASS_PARSER_grammer_readprocpar_procparerror((_CUR),217);
                        }
                        ;
                    }
                } else {
                    // JavaLine 204 <== SourceLine 421
                    {
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('O')))) {
                            new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),286);
                        } else {
                            // JavaLine 209 <== SourceLine 422
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach(422);
                        }
                        ;
                    }
                }
                ;
                // JavaLine 216 <== SourceLine 424
                {
                    _SIM_LABEL(7); // DeclaredIn: readprocpar
                    // JavaLine 219 <== SourceLine 425
                    if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).specofvirtual_1)) {
                        ;
                    } else {
                        {
                            // JavaLine 224 <== SourceLine 426
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn='x';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,426);
                            ;
                        }
                    }
                }
                ;
                // JavaLine 233 <== SourceLine 427
                new CLASS_PARSER_grammer_readprocpar_setrecsymb((_CUR),false);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 readprocpar",1,346,11,393,13,401,15,403,17,406,19,407,21,418,23,425,26,349,28,350,63,391,66,392,69,393,75,394,80,395,85,396,90,397,95,398,100,399,105,400,108,401,114,402,119,403,124,404,129,405,132,406,138,407,144,408,149,409,154,410,159,411,170,413,173,414,177,415,183,416,191,418,197,419,204,421,209,422,216,424,219,425,224,426,233,427,245,428);
} // End of Procedure
