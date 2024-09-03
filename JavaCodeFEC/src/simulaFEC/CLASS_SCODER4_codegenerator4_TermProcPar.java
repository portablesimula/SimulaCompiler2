// JavaLine 1 <== SourceLine 411
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER4_codegenerator4_TermProcPar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=411, lastLine=459, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 459
    final RTS_LABEL _LABEL_CLASS_SCODER4_codegenerator4_TermProcPar_Block415_EX_0=new RTS_LABEL(this,0,1,"EX"); // Local Label #1=EX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 412
    public CLASS_COMMON_quantity _inspect_412_4661=null;
    // Normal Constructor
    public CLASS_SCODER4_codegenerator4_TermProcPar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER4_codegenerator4_TermProcPar _STM() {
        CLASS_SCODER4_codegenerator4_TermProcPar _THIS=(CLASS_SCODER4_codegenerator4_TermProcPar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_412_4661=((CLASS_SCODER4_codegenerator4)(_CUR._SL)).opq_3;
                    if(_inspect_412_4661!=null) { // INSPECT _inspect_412_4661  type=ref(QUANTITY)
                        // JavaLine 34 <== SourceLine 413
                        {
                            // JavaLine 36 <== SourceLine 412
                            {
                                // JavaLine 38 <== SourceLine 415
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),415,new RTS_TXT(""),new RTS_TXT("============================= TermProcPar"));
                                ;
                                // JavaLine 41 <== SourceLine 416
                                if(_VALUE((((CLASS_SCODER4_codegenerator4)(_CUR._SL)).Etag_10!=(0)))) {
                                    {
                                        // JavaLine 44 <== SourceLine 417
                                        if(_VALUE((_inspect_412_4661.type_1!=(((char)14))))) {
                                            {
                                                // JavaLine 47 <== SourceLine 418
                                                new CLASS_ERRMSG_error1qlin((_CUR._SL._SL),252,((CLASS_COMMON_quantity)_inspect_412_4661));
                                                ;
                                                new CLASS_BUILDER1_StopScode((_CUR._SL._SL));
                                                ;
                                                // JavaLine 52 <== SourceLine 419
                                                _GOTO(_LABEL_CLASS_SCODER4_codegenerator4_TermProcPar_Block415_EX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 57 <== SourceLine 420
                                        if(_VALUE((((CLASS_SCODER4)(_CUR._SL._SL)).opc_6==(((char)141))))) {
                                            new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                        }
                                        ;
                                        // JavaLine 62 <== SourceLine 422
                                        if(_VALUE((_inspect_412_4661.categ_1==(((char)6))))) {
                                            {
                                                // JavaLine 65 <== SourceLine 423
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),423,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005u"))._RESULT);
                                                ;
                                                // JavaLine 68 <== SourceLine 424
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),424,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((_inspect_412_4661.virtno_1-(1)))));
                                                ;
                                                // JavaLine 71 <== SourceLine 425
                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005u")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                ;
                                                // JavaLine 74 <== SourceLine 427
                                                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(_inspect_412_4661.virtno_1-(1)));
                                                ;
                                                // JavaLine 77 <== SourceLine 428
                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),428,new RTS_TXT("ASSPAR"));
                                                ;
                                                // JavaLine 80 <== SourceLine 429
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),429,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005v"))._RESULT);
                                                ;
                                                // JavaLine 83 <== SourceLine 430
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),430,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).Etag_10)._RESULT);
                                                ;
                                                // JavaLine 86 <== SourceLine 431
                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005v")),new RTS_TXT("P")));
                                                ;
                                            }
                                        } else {
                                            // JavaLine 91 <== SourceLine 435
                                            {
                                                // JavaLine 93 <== SourceLine 436
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),436,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005p"))._RESULT);
                                                ;
                                                // JavaLine 96 <== SourceLine 437
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),437,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_412_4661.ftag_1+(1)))._RESULT));
                                                ;
                                                // JavaLine 99 <== SourceLine 438
                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005p")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                                ;
                                                // JavaLine 102 <== SourceLine 440
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_412_4661.ftag_1+(1)));
                                                ;
                                                // JavaLine 105 <== SourceLine 441
                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),441,new RTS_TXT("ASSPAR"));
                                                ;
                                                // JavaLine 108 <== SourceLine 442
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),442,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005q"))._RESULT);
                                                ;
                                                // JavaLine 111 <== SourceLine 443
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER4"),443,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).Etag_10)._RESULT);
                                                ;
                                                // JavaLine 114 <== SourceLine 444
                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005q")),new RTS_TXT("P")));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 120 <== SourceLine 448
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).Etag_10);
                                        ;
                                        // JavaLine 123 <== SourceLine 449
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),449,new RTS_TXT("RUPDATE"));
                                        ;
                                        // JavaLine 126 <== SourceLine 450
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),450,new RTS_TXT("POP"));
                                        ;
                                        // JavaLine 129 <== SourceLine 451
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),451,new RTS_TXT("ENDROUTINE"));
                                        ;
                                        // JavaLine 132 <== SourceLine 452
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),452,new RTS_TXT("ESEG"));
                                        ;
                                        // JavaLine 135 <== SourceLine 453
                                        ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")),new RTS_TXT(")")),new RTS_TXT("<")));
                                        ;
                                        // JavaLine 138 <== SourceLine 455
                                        new CLASS_SCODER0_codegenerator0_popasd((_CUR._SL));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 144 <== SourceLine 457
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0016")));
                                ;
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).Btag_10);
                                ;
                                // JavaLine 149 <== SourceLine 458
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outbyte(68);
                                ;
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curpar_6=null;
                                ;
                                // JavaLine 154 <== SourceLine 459
                                {
                                    _SIM_LABEL(1); // DeclaredIn: TermProcPar -> TermProcPar[externalIdent=CLASS_SCODER4_codegenerator4_TermProcPar] Kind=5, QUAL=ProcedureDeclaration, HashCode=301141958
                                    ;
                                }
                            }
                        }
                    }
                } // END INSPECTION
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER4.sim","5 TermProcPar",1,411,10,459,13,412,34,413,36,412,38,415,41,416,44,417,47,418,52,419,57,420,62,422,65,423,68,424,71,425,74,427,77,428,80,429,83,430,86,431,91,435,93,436,96,437,99,438,102,440,105,441,108,442,111,443,114,444,120,448,123,449,126,450,129,451,132,452,135,453,138,455,144,457,149,458,154,459,172,459);
} // End of Procedure
