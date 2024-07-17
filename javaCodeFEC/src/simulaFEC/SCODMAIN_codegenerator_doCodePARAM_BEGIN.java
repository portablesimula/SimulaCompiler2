// JavaLine 1 <== SourceLine 286
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodePARAM_BEGIN extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=286, lastLine=645, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_lastopc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 302
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block299_Block302_TestTOS_0=new RTS_LABEL(this,0,1,"TestTOS"); // Local Label #1=TestTOS At PrefixLevel 0
    // JavaLine 13 <== SourceLine 501
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block501_atpro_0=new RTS_LABEL(this,0,2,"atpro"); // Local Label #2=atpro At PrefixLevel 0
    // JavaLine 15 <== SourceLine 623
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_nosavepassc_0=new RTS_LABEL(this,0,3,"nosavepassc"); // Local Label #3=nosavepassc At PrefixLevel 0
    // JavaLine 17 <== SourceLine 625
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_passc_0=new RTS_LABEL(this,0,4,"passc"); // Local Label #4=passc At PrefixLevel 0
    // JavaLine 19 <== SourceLine 636
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block636_nosavepprec_0=new RTS_LABEL(this,0,5,"nosavepprec"); // Local Label #5=nosavepprec At PrefixLevel 0
    // JavaLine 21 <== SourceLine 639
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block636_pprec_0=new RTS_LABEL(this,0,6,"pprec"); // Local Label #6=pprec At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 331
    public COMMON_brecord _inspect_331_4674=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODMAIN_codegenerator_doCodePARAM_BEGIN setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_lastopc=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODMAIN_codegenerator_doCodePARAM_BEGIN(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodePARAM_BEGIN(RTS_RTObject _SL,char sp_lastopc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_lastopc = sp_lastopc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodePARAM_BEGIN _STM() {
        SCODMAIN_codegenerator_doCodePARAM_BEGIN _THIS=(SCODMAIN_codegenerator_doCodePARAM_BEGIN)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 288
                ((SCODMAIN_codegenerator)(_CUR._SL)).opq_3=((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6;
                ;
                // JavaLine 61 <== SourceLine 290
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),290,new RTS_TXT(""),new RTS_TXT("============================= Quantity DUMP on next line"));
                ;
                // JavaLine 64 <== SourceLine 291
                new COMMON_quantity_dump(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3);
                ;
                // JavaLine 67 <== SourceLine 295
                if(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3)).clf_2):(((char)0)))<((char)0) || ((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3)).clf_2):(((char)0)))>'0') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3)).clf_2):(((char)0)))) { // BEGIN SWITCH STATEMENT
                    case 0: 
                    // JavaLine 71 <== SourceLine 297
                    {
                        // JavaLine 73 <== SourceLine 299
                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                        ;
                        // JavaLine 76 <== SourceLine 300
                        if(_VALUE(((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1==(((char)3)))||((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1==(((char)4))))))) {
                            // JavaLine 78 <== SourceLine 301
                            {
                                // JavaLine 80 <== SourceLine 302
                                {
                                    _SIM_LABEL(1); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                                    if(_VALUE((p_lastopc==('L')))) {
                                        {
                                            // JavaLine 85 <== SourceLine 303
                                            if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4>(1)))) {
                                                {
                                                    // JavaLine 88 <== SourceLine 304
                                                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                        // JavaLine 90 <== SourceLine 305
                                                        new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-A/B\u005fPRO(DOT)"));
                                                    }
                                                    ;
                                                    // JavaLine 94 <== SourceLine 306
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")));
                                                    ;
                                                    // JavaLine 97 <== SourceLine 312
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                                    ;
                                                    // JavaLine 100 <== SourceLine 313
                                                    new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                                    ;
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),true);
                                                    ;
                                                    // JavaLine 105 <== SourceLine 314
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=1;
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 113 <== SourceLine 317
                                        {
                                            // JavaLine 115 <== SourceLine 318
                                            if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4!=(0)))) {
                                                {
                                                    // JavaLine 118 <== SourceLine 319
                                                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                        // JavaLine 120 <== SourceLine 320
                                                        new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-A/B\u005fPRO"));
                                                    }
                                                    ;
                                                    // JavaLine 124 <== SourceLine 321
                                                    new SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                                    ;
                                                    // JavaLine 127 <== SourceLine 322
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6);
                                                    ;
                                                    // JavaLine 130 <== SourceLine 323
                                                    new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                                    ;
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),true);
                                                    ;
                                                    // JavaLine 135 <== SourceLine 324
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=0;
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 141 <== SourceLine 331
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_331_4674=((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.encl_1;
                                                if(_inspect_331_4674!=null) { // INSPECT _inspect_331_4674
                                                    // JavaLine 146 <== SourceLine 332
                                                    {
                                                        // JavaLine 148 <== SourceLine 331
                                                        {
                                                            // JavaLine 150 <== SourceLine 332
                                                            if(_VALUE((((((SCODMAIN)(_CUR._SL._SL)).crtblev_6==(_inspect_331_4674.rtblev))&&((_inspect_331_4674.blev>=(((char)5)))))&&((_inspect_331_4674.inspected==(((char)0))))))) {
                                                                // JavaLine 152 <== SourceLine 335
                                                                ((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12=true;
                                                            } else {
                                                                // JavaLine 155 <== SourceLine 336
                                                                new SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                            }
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 168 <== SourceLine 339
                                ((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12=(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(1));
                                ;
                                // JavaLine 171 <== SourceLine 340
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1!=(((char)6))))) {
                                    {
                                        // JavaLine 174 <== SourceLine 351
                                        if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12)) {
                                            {
                                                // JavaLine 177 <== SourceLine 354
                                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),354,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT));
                                                ;
                                                // JavaLine 180 <== SourceLine 355
                                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                ;
                                                // JavaLine 183 <== SourceLine 356
                                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                                                ;
                                                // JavaLine 186 <== SourceLine 357
                                                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))) {
                                                    {
                                                        // JavaLine 189 <== SourceLine 358
                                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),358,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00bb"))._RESULT);
                                                        ;
                                                        // JavaLine 192 <== SourceLine 359
                                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),359,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00bb"))._RESULT);
                                                        ;
                                                        // JavaLine 195 <== SourceLine 360
                                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00bb")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00bc")));
                                                    }
                                                } else {
                                                    // JavaLine 199 <== SourceLine 362
                                                    {
                                                        // JavaLine 201 <== SourceLine 363
                                                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                                                        ;
                                                        // JavaLine 204 <== SourceLine 364
                                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),364,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00bf"))._RESULT);
                                                        ;
                                                        // JavaLine 207 <== SourceLine 365
                                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),365,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00bf"))._RESULT);
                                                        ;
                                                        // JavaLine 210 <== SourceLine 366
                                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00bf")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00c0")));
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 216 <== SourceLine 369
                                                ((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12=false;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 221 <== SourceLine 371
                                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))) {
                                                {
                                                    // JavaLine 224 <== SourceLine 372
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),372,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00a2"))._RESULT);
                                                    ;
                                                    // JavaLine 227 <== SourceLine 373
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),373,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT));
                                                    ;
                                                    // JavaLine 230 <== SourceLine 374
                                                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),374,new RTS_TXT("ASSPAR"));
                                                    ;
                                                    // JavaLine 233 <== SourceLine 375
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),375,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00a3"))._RESULT);
                                                    ;
                                                    // JavaLine 236 <== SourceLine 376
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00a2")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                                    ;
                                                    // JavaLine 239 <== SourceLine 378
                                                    new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                                                    ;
                                                    // JavaLine 242 <== SourceLine 379
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u00a3")));
                                                    ;
                                                    // JavaLine 245 <== SourceLine 381
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 250 <== SourceLine 383
                                                {
                                                    // JavaLine 252 <== SourceLine 384
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),384,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00a7"))._RESULT);
                                                    ;
                                                    // JavaLine 255 <== SourceLine 385
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),385,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT));
                                                    ;
                                                    // JavaLine 258 <== SourceLine 386
                                                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),386,new RTS_TXT("ASSPAR"));
                                                    ;
                                                    // JavaLine 261 <== SourceLine 387
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),387,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00a8"))._RESULT);
                                                    ;
                                                    // JavaLine 264 <== SourceLine 388
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00a7")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                                    ;
                                                    // JavaLine 267 <== SourceLine 390
                                                    new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                                                    ;
                                                    // JavaLine 270 <== SourceLine 391
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u00a8")));
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 279 <== SourceLine 398
                                    if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).specVirt_12)) {
                                        {
                                            // JavaLine 282 <== SourceLine 399
                                            if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12)) {
                                                {
                                                    // JavaLine 285 <== SourceLine 400
                                                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                        new SCODER1_codegenerator1_outTrace((_CUR._SL),(((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))?(new RTS_TXT("spec virt B")):(new RTS_TXT("spec virt A"))));
                                                    }
                                                    ;
                                                    // JavaLine 290 <== SourceLine 402
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000c")),new RTS_TXT("K")),new RTS_TXT("\u0000s")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                    ;
                                                    // JavaLine 293 <== SourceLine 407
                                                    new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
                                                    ;
                                                    // JavaLine 296 <== SourceLine 408
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u0095")),new RTS_TXT("\u0000u")),new RTS_TXT("\u0088")),new RTS_TXT("\u0004\u00bb")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00bc"))):(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u0095")),new RTS_TXT("\u0000u")),new RTS_TXT("\u0088")),new RTS_TXT("\u0004\u00bf")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00c0")))));
                                                    ;
                                                    // JavaLine 299 <== SourceLine 417
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12=false;
                                                    ;
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 306 <== SourceLine 419
                                                {
                                                    // JavaLine 308 <== SourceLine 420
                                                    if(_VALUE(((p_lastopc!=('L'))||((!(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4))))))) {
                                                        // JavaLine 310 <== SourceLine 421
                                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")));
                                                    }
                                                    ;
                                                    // JavaLine 314 <== SourceLine 425
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00a2")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000c")),new RTS_TXT("K")),new RTS_TXT("\u0000s")),new RTS_TXT("Q")),new RTS_TXT("\r"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00a7")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000c")),new RTS_TXT("K")),new RTS_TXT("\u0000s")),new RTS_TXT("Q")),new RTS_TXT("\r")))));
                                                    ;
                                                    // JavaLine 317 <== SourceLine 440
                                                    new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
                                                    ;
                                                    // JavaLine 320 <== SourceLine 441
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))?(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u0095")),new RTS_TXT("\u0000u")),new RTS_TXT("D")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00a3"))):(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u0095")),new RTS_TXT("\u0000u")),new RTS_TXT("D")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00a8")))));
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 326 <== SourceLine 451
                                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))) {
                                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                            }
                                            ;
                                            // JavaLine 331 <== SourceLine 452
                                            ((SCODMAIN_codegenerator)(_CUR._SL)).specVirt_12=false;
                                            ;
                                        }
                                    } else {
                                        // JavaLine 336 <== SourceLine 454
                                        {
                                            // JavaLine 338 <== SourceLine 455
                                            if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12)) {
                                                {
                                                    // JavaLine 341 <== SourceLine 456
                                                    new SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                    ;
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).localproc_12=false;
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 349 <== SourceLine 458
                                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)0))))) {
                                                {
                                                    // JavaLine 352 <== SourceLine 459
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\b\u00ad")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                    ;
                                                    // JavaLine 355 <== SourceLine 461
                                                    new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
                                                    ;
                                                    // JavaLine 358 <== SourceLine 462
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\b\u00ae")));
                                                    ;
                                                    // JavaLine 361 <== SourceLine 464
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 366 <== SourceLine 466
                                                {
                                                    // JavaLine 368 <== SourceLine 467
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\b\u00b2")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                    ;
                                                    // JavaLine 371 <== SourceLine 469
                                                    new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
                                                    ;
                                                    // JavaLine 374 <== SourceLine 470
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                    ;
                                                    // JavaLine 377 <== SourceLine 472
                                                    new SCODER0_codegenerator0_outsint((_CUR._SL),RTS_ENVIRONMENT.rank(((SCODMAIN)(_CUR._SL._SL)).opilo_6));
                                                    ;
                                                    // JavaLine 380 <== SourceLine 473
                                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\b\u00b3")));
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                }
                            }
                        } else {
                            // JavaLine 391 <== SourceLine 478
                            if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1==(((char)6))))) {
                                {
                                    // JavaLine 394 <== SourceLine 479
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).specVirt_12=(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1!=(null));
                                    ;
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).iii_11=(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.virtno_1-(1));
                                    ;
                                    // JavaLine 399 <== SourceLine 480
                                    _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block299_Block302_TestTOS_0); // GOTO EVALUATED LABEL
                                }
                            } else {
                                // JavaLine 403 <== SourceLine 481
                                new SCODER3_codegenerator3_procLIPROCformal((_CUR._SL));
                            }
                        }
                        ;
                        // JavaLine 408 <== SourceLine 482
                        _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 1: 
                    // JavaLine 414 <== SourceLine 484
                    {
                        // JavaLine 416 <== SourceLine 488
                        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1<=(RTS_ENVIRONMENT.rank('N'))))) {
                            // JavaLine 418 <== SourceLine 489
                            {
                                // JavaLine 420 <== SourceLine 490
                                if(_VALUE((p_lastopc==('L')))) {
                                    {
                                        // JavaLine 423 <== SourceLine 491
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(84);
                                        ;
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 431 <== SourceLine 492
                                _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block636_nosavepprec_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 436 <== SourceLine 493
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block501_atpro_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 7: 
                    // JavaLine 442 <== SourceLine 495
                    {
                        // JavaLine 444 <== SourceLine 501
                        {
                            _SIM_LABEL(2); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                            if(_VALUE((p_lastopc!=('L')))) {
                                // JavaLine 448 <== SourceLine 502
                                new SCODER1_codegenerator1_staticencl((_CUR._SL));
                            }
                        }
                        ;
                        // JavaLine 453 <== SourceLine 503
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_nosavepassc_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 5: 
                    // JavaLine 459 <== SourceLine 505
                    {
                        // JavaLine 461 <== SourceLine 507
                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                        ;
                        // JavaLine 464 <== SourceLine 508
                        if(_VALUE((p_lastopc==('A')))) {
                            {
                                // JavaLine 467 <== SourceLine 509
                                ((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6=((COMMON_quantity)(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.next));
                                ;
                                // JavaLine 470 <== SourceLine 510
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),510,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(0)))._RESULT);
                                ;
                                // JavaLine 473 <== SourceLine 511
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(136);
                                ;
                                // JavaLine 476 <== SourceLine 512
                                new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(0)));
                                ;
                                // JavaLine 479 <== SourceLine 513
                                _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 485 <== SourceLine 515
                        if(_VALUE((p_lastopc==(((char)14))))) {
                            {
                                // JavaLine 488 <== SourceLine 516
                                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),516,new RTS_TXT("DEREF"));
                                ;
                                // JavaLine 491 <== SourceLine 517
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(73);
                                ;
                            }
                        }
                        ;
                        // JavaLine 497 <== SourceLine 519
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_passc_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 8: 
                    // JavaLine 503 <== SourceLine 521
                    {
                        // JavaLine 505 <== SourceLine 524
                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                        ;
                        // JavaLine 508 <== SourceLine 525
                        if(_VALUE((p_lastopc==('L')))) {
                            {
                                // JavaLine 511 <== SourceLine 527
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4<=(1)))) {
                                    _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_passc_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 516 <== SourceLine 528
                                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                    // JavaLine 518 <== SourceLine 529
                                    new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-filetxt(DOT)"));
                                }
                                ;
                                // JavaLine 522 <== SourceLine 532
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")));
                                ;
                                // JavaLine 525 <== SourceLine 538
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                ;
                                // JavaLine 528 <== SourceLine 539
                                new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                ;
                                ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),true);
                                ;
                                // JavaLine 533 <== SourceLine 540
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=1;
                                ;
                            }
                        } else {
                            // JavaLine 538 <== SourceLine 542
                            {
                                // JavaLine 540 <== SourceLine 543
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4!=(0)))) {
                                    {
                                        // JavaLine 543 <== SourceLine 544
                                        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                            new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-fileTXT"));
                                        }
                                        ;
                                        // JavaLine 548 <== SourceLine 545
                                        new SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                        ;
                                        // JavaLine 551 <== SourceLine 546
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6);
                                        ;
                                        // JavaLine 554 <== SourceLine 547
                                        new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                        ;
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),true);
                                        ;
                                        // JavaLine 559 <== SourceLine 548
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=0;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 565 <== SourceLine 550
                                new SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                            }
                        }
                        ;
                        // JavaLine 571 <== SourceLine 552
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_passc_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 11: 
                    // JavaLine 577 <== SourceLine 554
                    {
                        // JavaLine 579 <== SourceLine 557
                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                        ;
                        // JavaLine 582 <== SourceLine 558
                        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4!=(0)))) {
                            {
                                // JavaLine 585 <== SourceLine 559
                                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                    new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-TXT"));
                                }
                                ;
                                // JavaLine 590 <== SourceLine 560
                                new SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                ;
                                // JavaLine 593 <== SourceLine 561
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6);
                                ;
                                // JavaLine 596 <== SourceLine 562
                                new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                ;
                                ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),true);
                                ;
                            }
                        }
                        ;
                        // JavaLine 604 <== SourceLine 564
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=1;
                        ;
                        // JavaLine 607 <== SourceLine 565
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block636_pprec_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 12: 
                    // JavaLine 613 <== SourceLine 567
                    {
                        // JavaLine 615 <== SourceLine 570
                        if(_VALUE((p_lastopc==('L')))) {
                            {
                                // JavaLine 618 <== SourceLine 572
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("K"),new RTS_TXT("\u0000\u00be")),new RTS_TXT("I")));
                                ;
                            }
                        } else {
                            // JavaLine 623 <== SourceLine 574
                            if(_VALUE((p_lastopc!=(((char)14))))) {
                                {
                                    if(_VALUE((p_lastopc!=('A')))) {
                                        // JavaLine 627 <== SourceLine 575
                                        {
                                            // JavaLine 629 <== SourceLine 577
                                            new SCODER1_codegenerator1_staticencl((_CUR._SL));
                                            ;
                                            // JavaLine 632 <== SourceLine 578
                                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("K"),new RTS_TXT("\u0000\u00be")),new RTS_TXT("I")));
                                            ;
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 641 <== SourceLine 580
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block619_Block623_nosavepassc_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 13: 
                    // JavaLine 647 <== SourceLine 582
                    {
                        // JavaLine 649 <== SourceLine 585
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                        ;
                        // JavaLine 652 <== SourceLine 586
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(148);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                        // JavaLine 657 <== SourceLine 587
                        _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 14: 
                    // JavaLine 663 <== SourceLine 589
                    {
                        // JavaLine 665 <== SourceLine 592
                        if(_VALUE((p_lastopc!=('L')))) {
                            new SCODER1_codegenerator1_staticencl((_CUR._SL));
                        }
                        ;
                        // JavaLine 670 <== SourceLine 593
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(150);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                        // JavaLine 675 <== SourceLine 594
                        _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 15: 
                    // JavaLine 681 <== SourceLine 596
                    {
                        // JavaLine 683 <== SourceLine 599
                        if(_VALUE((p_lastopc!=('L')))) {
                            new SCODER1_codegenerator1_staticencl((_CUR._SL));
                        }
                        ;
                        // JavaLine 688 <== SourceLine 603
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),603,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\b\u008e"))._RESULT);
                        ;
                        // JavaLine 691 <== SourceLine 604
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),604,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\b\u008f"))._RESULT);
                        ;
                        // JavaLine 694 <== SourceLine 605
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\b\u008e")),new RTS_TXT("F")),new RTS_TXT("\b\u008f")));
                        ;
                        // JavaLine 697 <== SourceLine 606
                        _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 43: 
                    case 45: 
                    case 47: 
                    // JavaLine 705 <== SourceLine 610
                    {
                        // JavaLine 707 <== SourceLine 612
                        if(_VALUE((p_lastopc!=('L')))) {
                            new SCODER1_codegenerator1_staticencl((_CUR._SL));
                        }
                        ;
                        // JavaLine 712 <== SourceLine 614
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0096"),new RTS_TXT("\u0000\u00be")));
                        ;
                        // JavaLine 715 <== SourceLine 616
                        _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 6: 
                    // JavaLine 721 <== SourceLine 618
                    {
                        // JavaLine 723 <== SourceLine 619
                        if(_VALUE((((p_lastopc==('L'))||((p_lastopc==(((char)14)))))||((p_lastopc==('A')))))) {
                            // JavaLine 725 <== SourceLine 622
                            {
                                // JavaLine 727 <== SourceLine 623
                                {
                                    _SIM_LABEL(3); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                                }
                                ;
                                // JavaLine 733 <== SourceLine 624
                                {
                                    _SIM_LABEL(4); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                                    // JavaLine 736 <== SourceLine 625
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),625,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
                                }
                                ;
                                // JavaLine 740 <== SourceLine 626
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(136);
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                                ;
                                // JavaLine 745 <== SourceLine 627
                                _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 751 <== SourceLine 629
                        _GOTO(_LABEL_SCODMAIN_codegenerator_doCodePARAM_BEGIN_Block636_nosavepprec_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 10: 
                    // JavaLine 757 <== SourceLine 631
                    {
                        // JavaLine 759 <== SourceLine 636
                        {
                            _SIM_LABEL(5); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                            ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4+(1));
                        }
                        ;
                        // JavaLine 765 <== SourceLine 637
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                        ;
                        // JavaLine 768 <== SourceLine 638
                        {
                            _SIM_LABEL(6); // DeclaredIn: doCodePARAM_BEGIN -> doCodePARAM_BEGIN[externalIdent=SCODMAIN_codegenerator_doCodePARAM_BEGIN] Kind=5, QUAL=ProcedureDeclaration, HashCode=284044076
                            // JavaLine 771 <== SourceLine 639
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),639,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
                        }
                        ;
                        // JavaLine 775 <== SourceLine 640
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(67);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                    }
                    break;
                    default:
                    ;
                    break;
                } // END SWITCH STATEMENT
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodePARAM_BEGIN",1,286,11,302,13,501,15,623,17,625,19,636,21,639,24,331,58,288,61,290,64,291,67,295,71,297,73,299,76,300,78,301,80,302,85,303,88,304,90,305,94,306,97,312,100,313,105,314,113,317,115,318,118,319,120,320,124,321,127,322,130,323,135,324,141,331,146,332,148,331,150,332,152,335,155,336,168,339,171,340,174,351,177,354,180,355,183,356,186,357,189,358,192,359,195,360,199,362,201,363,204,364,207,365,210,366,216,369,221,371,224,372,227,373,230,374,233,375,236,376,239,378,242,379,245,381,250,383,252,384,255,385,258,386,261,387,264,388,267,390,270,391,279,398,282,399,285,400,290,402,293,407,296,408,299,417,306,419,308,420,310,421,314,425,317,440,320,441,326,451,331,452,336,454,338,455,341,456,349,458,352,459,355,461,358,462,361,464,366,466,368,467,371,469,374,470,377,472,380,473,391,478,394,479,399,480,403,481,408,482,414,484,416,488,418,489,420,490,423,491,431,492,436,493,442,495,444,501,448,502,453,503,459,505,461,507,464,508,467,509,470,510,473,511,476,512,479,513,485,515,488,516,491,517,497,519,503,521,505,524,508,525,511,527,516,528,518,529,522,532,525,538,528,539,533,540,538,542,540,543,543,544,548,545,551,546,554,547,559,548,565,550,571,552,577,554,579,557,582,558,585,559,590,560,593,561,596,562,604,564,607,565,613,567,615,570,618,572,623,574,627,575,629,577,632,578,641,580,647,582,649,585,652,586,657,587,663,589,665,592,670,593,675,594,681,596,683,599,688,603,691,604,694,605,697,606,705,610,707,612,712,614,715,616,721,618,723,619,725,622,727,623,733,624,736,625,740,626,745,627,751,629,757,631,759,636,765,637,768,638,771,639,775,640,796,645);
} // End of Procedure
