// JavaLine 1 <== SourceLine 443
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_procLISSWA extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=443, lastLine=988, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 444
    public int ttag=0;
    public boolean saveEmit=false;
    // JavaLine 13 <== SourceLine 447
    public CLASS_CHECKER2_semchecker _inspect_446_4650=null;
    // JavaLine 15 <== SourceLine 448
    public CLASS_COMMON_quantity _inspect_448_4651=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_procLISSWA(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_procLISSWA _STM() {
        // JavaLine 28 <== SourceLine 446
        {
            // BEGIN INSPECTION 
            _inspect_446_4650=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).checker_5;
            if(_inspect_446_4650!=null) { // INSPECT _inspect_446_4650  type=ref(SEMCHECKER)
                // JavaLine 33 <== SourceLine 448
                {
                    {
                        // BEGIN INSPECTION 
                        _inspect_448_4651=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
                        if(_inspect_448_4651!=null) { // INSPECT _inspect_448_4651  type=ref(QUANTITY)
                            // JavaLine 39 <== SourceLine 449
                            {
                                // JavaLine 41 <== SourceLine 448
                                {
                                    // JavaLine 43 <== SourceLine 449
                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),449,new RTS_TXT(""),new RTS_TXT("============================= procLISSWA"));
                                    ;
                                    // JavaLine 46 <== SourceLine 450
                                    if(_VALUE((_inspect_446_4650.lastopc==('q')))) {
                                        {
                                            // JavaLine 49 <== SourceLine 451
                                            if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6==(null)))) {
                                                {
                                                    // JavaLine 52 <== SourceLine 455
                                                    if(_VALUE((_inspect_448_4651.categ_1==(((char)2))))) {
                                                        {
                                                            // JavaLine 55 <== SourceLine 456
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),456,new RTS_TXT(""),new RTS_TXT("============================= C\u005fname"));
                                                            ;
                                                            // JavaLine 58 <== SourceLine 458
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),458,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006J"))._RESULT);
                                                            ;
                                                            // JavaLine 61 <== SourceLine 459
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006J")));
                                                            ;
                                                            // JavaLine 64 <== SourceLine 460
                                                            new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                                            ;
                                                            // JavaLine 67 <== SourceLine 461
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),461,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001d"))._RESULT);
                                                            ;
                                                            // JavaLine 70 <== SourceLine 462
                                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),462,new RTS_TXT("ASSPAR"));
                                                            ;
                                                            // JavaLine 73 <== SourceLine 463
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001d")),new RTS_TXT("D")));
                                                            ;
                                                            // JavaLine 76 <== SourceLine 465
                                                            new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                                            ;
                                                            // JavaLine 79 <== SourceLine 466
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),466,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001c"))._RESULT);
                                                            ;
                                                            // JavaLine 82 <== SourceLine 467
                                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),467,new RTS_TXT("ASSPAR"));
                                                            ;
                                                            // JavaLine 85 <== SourceLine 468
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),468,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)))));
                                                            ;
                                                            // JavaLine 88 <== SourceLine 469
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("D")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                            ;
                                                            // JavaLine 91 <== SourceLine 471
                                                            new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)));
                                                            ;
                                                            // JavaLine 94 <== SourceLine 472
                                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),472,new RTS_TXT("ASSPAR"));
                                                            ;
                                                            // JavaLine 97 <== SourceLine 473
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),473,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006K"))._RESULT);
                                                            ;
                                                            // JavaLine 100 <== SourceLine 474
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),474,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)))));
                                                            ;
                                                            // JavaLine 103 <== SourceLine 475
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006K")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                                            ;
                                                            // JavaLine 106 <== SourceLine 478
                                                            new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)));
                                                            ;
                                                            // JavaLine 109 <== SourceLine 479
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),479,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006Q"))._RESULT);
                                                            ;
                                                            // JavaLine 112 <== SourceLine 480
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006Q")));
                                                            ;
                                                            // JavaLine 115 <== SourceLine 481
                                                            new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                            ;
                                                            // JavaLine 118 <== SourceLine 482
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),482,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                            ;
                                                            // JavaLine 121 <== SourceLine 483
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                                            ;
                                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                            ;
                                                            // JavaLine 126 <== SourceLine 484
                                                            if(_VALUE((_inspect_448_4651.type_1==(((char)7))))) {
                                                                {
                                                                    // JavaLine 129 <== SourceLine 485
                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),485,new RTS_TXT("ASSPAR"));
                                                                    ;
                                                                    // JavaLine 132 <== SourceLine 486
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                    ;
                                                                    // JavaLine 135 <== SourceLine 487
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=_inspect_448_4651.prefqual_1;
                                                                    ;
                                                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                    ;
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=((CLASS_COMMON_quantity)_inspect_448_4651);
                                                                    ;
                                                                    // JavaLine 142 <== SourceLine 488
                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),488,new RTS_TXT("ASSPAR"));
                                                                    ;
                                                                    // JavaLine 145 <== SourceLine 489
                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),489,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006R"))._RESULT);
                                                                    ;
                                                                    // JavaLine 148 <== SourceLine 490
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006R")));
                                                                    ;
                                                                    // JavaLine 151 <== SourceLine 492
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                    ;
                                                                }
                                                            } else {
                                                                // JavaLine 156 <== SourceLine 494
                                                                {
                                                                    // JavaLine 158 <== SourceLine 495
                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),495,new RTS_TXT("ASSPAR"));
                                                                    ;
                                                                    // JavaLine 161 <== SourceLine 496
                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),496,new RTS_TXT("PUSHC"),new RTS_TXT("ONONE"));
                                                                    ;
                                                                    // JavaLine 164 <== SourceLine 497
                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),497,new RTS_TXT("ASSPAR"));
                                                                    ;
                                                                    // JavaLine 167 <== SourceLine 498
                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),498,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006R"))._RESULT);
                                                                    ;
                                                                    // JavaLine 170 <== SourceLine 499
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("D")),new RTS_TXT("F")),new RTS_TXT("\u0006R")));
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 176 <== SourceLine 504
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(3));
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 181 <== SourceLine 507
                                                        {
                                                            // JavaLine 183 <== SourceLine 508
                                                            ttag=(_inspect_448_4651.ftag_1+(0));
                                                            ;
                                                            // JavaLine 186 <== SourceLine 509
                                                            if(_VALUE(((_inspect_448_4651.categ_1==(((char)6)))||(((((_inspect_448_4651.kind_1==(((char)1)))&&((_inspect_448_4651.type_1!=(((char)14)))))&&(((_inspect_448_4651.categ_1==(((char)3)))||((_inspect_448_4651.categ_1==(((char)4)))))))&&((_inspect_448_4651.descr_1.npar==(0)))))))) {
                                                                // JavaLine 188 <== SourceLine 513
                                                                {
                                                                    // JavaLine 190 <== SourceLine 518
                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),518,new RTS_TXT(""),new RTS_TXT("============================= new thunk"));
                                                                    ;
                                                                    // JavaLine 193 <== SourceLine 519
                                                                    new CLASS_SCODER3_codegenerator3_thunk((_CUR._SL))._STM();
                                                                    ;
                                                                    // JavaLine 196 <== SourceLine 521
                                                                    if(_VALUE((_inspect_448_4651.kind_1==(((char)1))))) {
                                                                        {
                                                                            // JavaLine 199 <== SourceLine 522
                                                                            new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),true);
                                                                            ;
                                                                            // JavaLine 202 <== SourceLine 523
                                                                            if(_VALUE(((_inspect_448_4651.categ_1==(((char)6)))||(((_inspect_448_4651.type_1!=(((char)14)))&&((_inspect_448_4651.descr_1.npar==(0)))))))) {
                                                                                // JavaLine 204 <== SourceLine 525
                                                                                {
                                                                                    // JavaLine 206 <== SourceLine 526
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),526,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 209 <== SourceLine 527
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),527,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b7"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 212 <== SourceLine 528
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),528,new RTS_TXT("PUSHC"),new RTS_TXT("TRUE"));
                                                                                    ;
                                                                                    // JavaLine 215 <== SourceLine 529
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),529,new RTS_TXT("SKIPIF"),new RTS_TXT("NE"));
                                                                                    ;
                                                                                    // JavaLine 218 <== SourceLine 530
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),530,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006A"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 221 <== SourceLine 531
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),531,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006B"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 224 <== SourceLine 532
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u00b7")),new RTS_TXT("Q")),new RTS_TXT("\u001c")),new RTS_TXT("=")),new RTS_TXT("\u007c")),new RTS_TXT("\u0088")),new RTS_TXT("\u0006A")),new RTS_TXT("F")),new RTS_TXT("\u0006B")));
                                                                                    ;
                                                                                    // JavaLine 227 <== SourceLine 539
                                                                                    new CLASS_SCODER0_codegenerator0_pushasd((_CUR._SL));
                                                                                    ;
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                    ;
                                                                                    // JavaLine 232 <== SourceLine 541
                                                                                    if(_VALUE(((_inspect_448_4651.categ_1==(((char)0)))&&(((((char)3)<=(_inspect_448_4651.type_1))&&((_inspect_448_4651.type_1<=(((char)6))))))))) {
                                                                                        // JavaLine 234 <== SourceLine 544
                                                                                        {
                                                                                            // JavaLine 236 <== SourceLine 545
                                                                                            new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                                                                            ;
                                                                                            // JavaLine 239 <== SourceLine 546
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),546,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001c"))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 242 <== SourceLine 547
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),547,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 245 <== SourceLine 548
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),548,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_1.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 248 <== SourceLine 549
                                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0088")));
                                                                                            ;
                                                                                            // JavaLine 251 <== SourceLine 552
                                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_1.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                                            ;
                                                                                            // JavaLine 254 <== SourceLine 553
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),553,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 257 <== SourceLine 554
                                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(70);
                                                                                            ;
                                                                                            // JavaLine 260 <== SourceLine 555
                                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                                            ;
                                                                                        }
                                                                                    } else {
                                                                                        // JavaLine 265 <== SourceLine 557
                                                                                        {
                                                                                            // JavaLine 267 <== SourceLine 558
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),558,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 270 <== SourceLine 559
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),559,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001s"))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 273 <== SourceLine 560
                                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")));
                                                                                            ;
                                                                                            // JavaLine 276 <== SourceLine 562
                                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4+(1));
                                                                                            ;
                                                                                            // JavaLine 279 <== SourceLine 563
                                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),563,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)))._RESULT);
                                                                                            ;
                                                                                            // JavaLine 282 <== SourceLine 564
                                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                                                                            ;
                                                                                            // JavaLine 285 <== SourceLine 565
                                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                                            ;
                                                                                        }
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 291 <== SourceLine 569
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),569,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 294 <== SourceLine 570
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),570,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b8"))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 297 <== SourceLine 571
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),571,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).quantvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)))._RESULT);
                                                                                    ;
                                                                                    // JavaLine 300 <== SourceLine 572
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")));
                                                                                    ;
                                                                                    // JavaLine 303 <== SourceLine 575
                                                                                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).quantvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                                    ;
                                                                                    // JavaLine 306 <== SourceLine 576
                                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),576,new RTS_TXT("RUPDATE"));
                                                                                    ;
                                                                                    // JavaLine 309 <== SourceLine 577
                                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),577,new RTS_TXT("POP"));
                                                                                    ;
                                                                                    // JavaLine 312 <== SourceLine 578
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")),new RTS_TXT("Y")));
                                                                                    ;
                                                                                    // JavaLine 315 <== SourceLine 580
                                                                                    new CLASS_SCODER0_codegenerator0_getnewindex((_CUR._SL));
                                                                                    ;
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).ll2_8=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curindex_5;
                                                                                    ;
                                                                                    // JavaLine 320 <== SourceLine 581
                                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),581,new RTS_TXT("FJUMP"),RTS_ENVIRONMENT.edit(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curindex_5));
                                                                                    ;
                                                                                    // JavaLine 323 <== SourceLine 582
                                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),582,new RTS_TXT("ENDSKIP"));
                                                                                    ;
                                                                                    // JavaLine 326 <== SourceLine 583
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curindex_5);
                                                                                    ;
                                                                                    // JavaLine 329 <== SourceLine 584
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(62);
                                                                                    ;
                                                                                    // JavaLine 332 <== SourceLine 585
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                    ;
                                                                                    new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 337 <== SourceLine 586
                                                                                    new CLASS_SCODER0_codegenerator0_popasd((_CUR._SL));
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 343 <== SourceLine 592
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                            ;
                                                                            // JavaLine 346 <== SourceLine 596
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                            ;
                                                                            // JavaLine 349 <== SourceLine 598
                                                                            if(_VALUE(((_inspect_448_4651.categ_1==(((char)6)))||(((_inspect_448_4651.type_1!=(((char)14)))&&((_inspect_448_4651.descr_1.npar==(0)))))))) {
                                                                                // JavaLine 351 <== SourceLine 600
                                                                                new CLASS_SCODER1_codegenerator1_outfdest((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).ll2_8);
                                                                            }
                                                                            ;
                                                                        }
                                                                    } else {
                                                                        // JavaLine 357 <== SourceLine 603
                                                                        {
                                                                            // JavaLine 359 <== SourceLine 604
                                                                            if(_VALUE((_inspect_448_4651.kind_1==(((char)3))))) {
                                                                                {
                                                                                    // JavaLine 362 <== SourceLine 605
                                                                                    new CLASS_SCODER2_codegenerator2_get_LABQNT((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 365 <== SourceLine 606
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                                    ;
                                                                                }
                                                                            } else {
                                                                                // JavaLine 370 <== SourceLine 611
                                                                                {
                                                                                    // JavaLine 372 <== SourceLine 612
                                                                                    new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 375 <== SourceLine 613
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001x")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 381 <== SourceLine 618
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                            ;
                                                                        }
                                                                    }
                                                                    ;
                                                                    // JavaLine 387 <== SourceLine 621
                                                                    new CLASS_SCODER3_codegenerator3_thunk_endthunk(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9);
                                                                    ;
                                                                    // JavaLine 390 <== SourceLine 622
                                                                    new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),3,_inspect_448_4651.kind_1,_inspect_448_4651.type_1,_inspect_448_4651.prefqual_1,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklabel_9);
                                                                    ;
                                                                    // JavaLine 393 <== SourceLine 625
                                                                    new CLASS_SCODER3_codegenerator3_thunktounspecified((_CUR._SL),_inspect_448_4651.type_1,_inspect_448_4651.prefqual_1);
                                                                    ;
                                                                }
                                                            } else {
                                                                // JavaLine 398 <== SourceLine 628
                                                                {
                                                                    // JavaLine 400 <== SourceLine 629
                                                                    new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),(((_inspect_448_4651.kind_1==(((char)0))))?(2):(1)),_inspect_448_4651.kind_1,_inspect_448_4651.type_1,_inspect_448_4651.prefqual_1,0);
                                                                    ;
                                                                    // JavaLine 403 <== SourceLine 635
                                                                    if(_inspect_448_4651.kind_1<((char)0) || _inspect_448_4651.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                    switch(_inspect_448_4651.kind_1) { // BEGIN SWITCH STATEMENT
                                                                        case 0: 
                                                                        // JavaLine 407 <== SourceLine 636
                                                                        {
                                                                            // JavaLine 409 <== SourceLine 637
                                                                            if(_VALUE((_inspect_448_4651.type_1==(((char)8))))) {
                                                                                // JavaLine 411 <== SourceLine 638
                                                                                {
                                                                                    // JavaLine 413 <== SourceLine 640
                                                                                    saveEmit=true;
                                                                                    ;
                                                                                    // JavaLine 416 <== SourceLine 641
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0088")));
                                                                                    ;
                                                                                }
                                                                            } else {
                                                                                // JavaLine 421 <== SourceLine 650
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")));
                                                                            }
                                                                            ;
                                                                            // JavaLine 425 <== SourceLine 651
                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fpt_profile.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                        }
                                                                        break;
                                                                        case 2: 
                                                                        // JavaLine 430 <== SourceLine 653
                                                                        {
                                                                            // JavaLine 432 <== SourceLine 656
                                                                            saveEmit=true;
                                                                            ;
                                                                            // JavaLine 435 <== SourceLine 657
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u0097")));
                                                                            ;
                                                                        }
                                                                        break;
                                                                        case 1: 
                                                                        // JavaLine 441 <== SourceLine 666
                                                                        {
                                                                            // JavaLine 443 <== SourceLine 667
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u009e")));
                                                                        }
                                                                        break;
                                                                        case 3: 
                                                                        // JavaLine 448 <== SourceLine 669
                                                                        {
                                                                            // JavaLine 450 <== SourceLine 670
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u00a5")));
                                                                        }
                                                                        break;
                                                                        case 4: 
                                                                        // JavaLine 455 <== SourceLine 672
                                                                        {
                                                                            // JavaLine 457 <== SourceLine 673
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u00ab")));
                                                                        }
                                                                        break;
                                                                        default:
                                                                        // JavaLine 462 <== SourceLine 676
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                        break;
                                                                    } // END SWITCH STATEMENT
                                                                    ;
                                                                    // JavaLine 467 <== SourceLine 679
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                                                    ;
                                                                    // JavaLine 470 <== SourceLine 680
                                                                    new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)));
                                                                    ;
                                                                    // JavaLine 473 <== SourceLine 681
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                                                    ;
                                                                    // JavaLine 476 <== SourceLine 683
                                                                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                                                                    ;
                                                                    // JavaLine 479 <== SourceLine 684
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                    ;
                                                                    // JavaLine 482 <== SourceLine 685
                                                                    if(_inspect_448_4651.kind_1<((char)0) || _inspect_448_4651.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                    switch(_inspect_448_4651.kind_1) { // BEGIN SWITCH STATEMENT
                                                                        case 0: 
                                                                        // JavaLine 486 <== SourceLine 686
                                                                        {
                                                                            // JavaLine 488 <== SourceLine 688
                                                                            new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                            ;
                                                                            // JavaLine 491 <== SourceLine 689
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                                            ;
                                                                            // JavaLine 494 <== SourceLine 691
                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),ttag);
                                                                            ;
                                                                            // JavaLine 497 <== SourceLine 692
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                            ;
                                                                            // JavaLine 500 <== SourceLine 693
                                                                            if(_VALUE((_inspect_448_4651.type_1==(((char)7))))) {
                                                                                {
                                                                                    // JavaLine 503 <== SourceLine 694
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=_inspect_448_4651.prefqual_1;
                                                                                    ;
                                                                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 508 <== SourceLine 695
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=((CLASS_COMMON_quantity)_inspect_448_4651);
                                                                                    ;
                                                                                    // JavaLine 511 <== SourceLine 696
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                                    ;
                                                                                    // JavaLine 514 <== SourceLine 697
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 519 <== SourceLine 698
                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),698,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fpt_body.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)))._RESULT);
                                                                            ;
                                                                            // JavaLine 522 <== SourceLine 699
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(70);
                                                                            ;
                                                                            // JavaLine 525 <== SourceLine 700
                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fpt_body.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_448_4651.type_1)));
                                                                            ;
                                                                            // JavaLine 528 <== SourceLine 701
                                                                            if(_VALUE(saveEmit)) {
                                                                                {
                                                                                    // JavaLine 531 <== SourceLine 702
                                                                                    new CLASS_SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 534 <== SourceLine 703
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6);
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                        }
                                                                        break;
                                                                        case 1: 
                                                                        // JavaLine 543 <== SourceLine 706
                                                                        {
                                                                            // JavaLine 545 <== SourceLine 707
                                                                            if(_VALUE((_inspect_448_4651.type_1==(((char)7))))) {
                                                                                {
                                                                                    // JavaLine 548 <== SourceLine 708
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=_inspect_448_4651.prefqual_1;
                                                                                    ;
                                                                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 553 <== SourceLine 709
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=((CLASS_COMMON_quantity)_inspect_448_4651);
                                                                                    ;
                                                                                    // JavaLine 556 <== SourceLine 710
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                }
                                                                            } else {
                                                                                // JavaLine 560 <== SourceLine 711
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")));
                                                                            }
                                                                            ;
                                                                            // JavaLine 564 <== SourceLine 712
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                            ;
                                                                            // JavaLine 567 <== SourceLine 713
                                                                            new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),true);
                                                                            ;
                                                                            // JavaLine 570 <== SourceLine 714
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006\u009f")));
                                                                            ;
                                                                        }
                                                                        break;
                                                                        case 2: 
                                                                        // JavaLine 576 <== SourceLine 717
                                                                        {
                                                                            // JavaLine 578 <== SourceLine 718
                                                                            if(_VALUE((_inspect_448_4651.type_1==(((char)7))))) {
                                                                                {
                                                                                    // JavaLine 581 <== SourceLine 719
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=_inspect_448_4651.prefqual_1;
                                                                                    ;
                                                                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 586 <== SourceLine 720
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=((CLASS_COMMON_quantity)_inspect_448_4651);
                                                                                    ;
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                }
                                                                            } else {
                                                                                // JavaLine 592 <== SourceLine 721
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")));
                                                                            }
                                                                            ;
                                                                            // JavaLine 596 <== SourceLine 722
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(68);
                                                                            ;
                                                                            // JavaLine 599 <== SourceLine 723
                                                                            new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                            ;
                                                                            // JavaLine 602 <== SourceLine 724
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                                                            ;
                                                                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),ttag);
                                                                            ;
                                                                            // JavaLine 607 <== SourceLine 725
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006\u0098")));
                                                                            ;
                                                                            // JavaLine 610 <== SourceLine 727
                                                                            if(_VALUE(saveEmit)) {
                                                                                {
                                                                                    // JavaLine 613 <== SourceLine 728
                                                                                    new CLASS_SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 616 <== SourceLine 729
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6);
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                        }
                                                                        break;
                                                                        case 3: 
                                                                        // JavaLine 625 <== SourceLine 732
                                                                        {
                                                                            // JavaLine 627 <== SourceLine 733
                                                                            new CLASS_SCODER2_codegenerator2_get_LABQNT((_CUR._SL));
                                                                            ;
                                                                            // JavaLine 630 <== SourceLine 734
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006\u00a6")));
                                                                            ;
                                                                        }
                                                                        break;
                                                                        case 4: 
                                                                        // JavaLine 636 <== SourceLine 737
                                                                        {
                                                                            // JavaLine 638 <== SourceLine 738
                                                                            new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                                                            ;
                                                                            // JavaLine 641 <== SourceLine 739
                                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006\u00ac")));
                                                                            ;
                                                                        }
                                                                        break;
                                                                        default:
                                                                        // JavaLine 647 <== SourceLine 743
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4+(2));
                                                                        break;
                                                                    } // END SWITCH STATEMENT
                                                                    ;
                                                                    // JavaLine 652 <== SourceLine 745
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 663 <== SourceLine 750
                                                {
                                                    // JavaLine 665 <== SourceLine 756
                                                    if(_VALUE((RTS_UTIL._IS(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curcall_6,CLASS_COMMON_extquantity.class)&&((((CLASS_COMMON_extquantity)(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curcall_6)).clf_2!=(((char)0))))))) {
                                                        // JavaLine 667 <== SourceLine 759
                                                        new CLASS_SCODER3_codegenerator3_GADDRval((_CUR._SL));
                                                    } else {
                                                        // JavaLine 670 <== SourceLine 760
                                                        {
                                                            // JavaLine 672 <== SourceLine 761
                                                            if(_VALUE((_inspect_448_4651.categ_1==(((char)2))))) {
                                                                {
                                                                    // JavaLine 675 <== SourceLine 762
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("K")));
                                                                    ;
                                                                    // JavaLine 678 <== SourceLine 763
                                                                    ttag=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.ftag_1+(0));
                                                                    ;
                                                                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),ttag);
                                                                    ;
                                                                    // JavaLine 683 <== SourceLine 764
                                                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                    ;
                                                                    // JavaLine 686 <== SourceLine 765
                                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),765,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                                    ;
                                                                    // JavaLine 689 <== SourceLine 766
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                    ;
                                                                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                    ;
                                                                    // JavaLine 694 <== SourceLine 767
                                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),767,new RTS_TXT("ASSIGN"));
                                                                    ;
                                                                    // JavaLine 697 <== SourceLine 768
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                    ;
                                                                    // JavaLine 700 <== SourceLine 769
                                                                    new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),357);
                                                                    ;
                                                                    // JavaLine 703 <== SourceLine 770
                                                                    if(_VALUE(((((_inspect_448_4651.kind_1==(((char)0)))&&((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.kind_1==(((char)0)))))&&((_inspect_448_4651.type_1==(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.type_1))))&&((((_inspect_448_4651.type_1==(((char)7))))?((_inspect_448_4651.prefqual_1==(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.prefqual_1))):(true)))))) {
                                                                        // JavaLine 705 <== SourceLine 774
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\u001c")),new RTS_TXT("h")),new RTS_TXT("o")));
                                                                    } else {
                                                                        // JavaLine 708 <== SourceLine 777
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\u001d")),new RTS_TXT("h")),new RTS_TXT("o")));
                                                                    }
                                                                    ;
                                                                    // JavaLine 712 <== SourceLine 780
                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                                                                    ;
                                                                }
                                                            } else {
                                                                // JavaLine 717 <== SourceLine 782
                                                                if(_VALUE((_inspect_448_4651.categ_1==(((char)6))))) {
                                                                    {
                                                                        // JavaLine 720 <== SourceLine 786
                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),786,new RTS_TXT(""),new RTS_TXT("============================= new thunk"));
                                                                        ;
                                                                        // JavaLine 723 <== SourceLine 787
                                                                        new CLASS_SCODER3_codegenerator3_thunk((_CUR._SL))._STM();
                                                                        ;
                                                                        // JavaLine 726 <== SourceLine 789
                                                                        if(_VALUE((_inspect_448_4651.kind_1==(((char)1))))) {
                                                                            {
                                                                                // JavaLine 729 <== SourceLine 790
                                                                                new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),true);
                                                                                ;
                                                                                // JavaLine 732 <== SourceLine 791
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                                ;
                                                                            }
                                                                        } else {
                                                                            // JavaLine 737 <== SourceLine 796
                                                                            if(_VALUE((_inspect_448_4651.kind_1==(((char)3))))) {
                                                                                {
                                                                                    // JavaLine 740 <== SourceLine 797
                                                                                    new CLASS_SCODER2_codegenerator2_get_LABQNT((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 743 <== SourceLine 798
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                                    ;
                                                                                }
                                                                            } else {
                                                                                // JavaLine 748 <== SourceLine 803
                                                                                {
                                                                                    // JavaLine 750 <== SourceLine 804
                                                                                    new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                                                                    ;
                                                                                    // JavaLine 753 <== SourceLine 805
                                                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001x")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 760 <== SourceLine 810
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                        ;
                                                                        // JavaLine 763 <== SourceLine 812
                                                                        new CLASS_SCODER3_codegenerator3_thunk_endthunk(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9);
                                                                        ;
                                                                        // JavaLine 766 <== SourceLine 813
                                                                        new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),3,_inspect_448_4651.kind_1,_inspect_448_4651.type_1,_inspect_448_4651.prefqual_1,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklabel_9);
                                                                        ;
                                                                        // JavaLine 769 <== SourceLine 817
                                                                        new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                                                                        ;
                                                                        // JavaLine 772 <== SourceLine 818
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                                        ;
                                                                        // JavaLine 775 <== SourceLine 819
                                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                                                                        ;
                                                                        // JavaLine 778 <== SourceLine 820
                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),820,new RTS_TXT("ASSIGN"));
                                                                        ;
                                                                        // JavaLine 781 <== SourceLine 821
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                        ;
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                                                                        ;
                                                                        // JavaLine 786 <== SourceLine 822
                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                        ;
                                                                        // JavaLine 789 <== SourceLine 823
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("o")));
                                                                        ;
                                                                    }
                                                                } else {
                                                                    // JavaLine 794 <== SourceLine 827
                                                                    {
                                                                        // JavaLine 796 <== SourceLine 829
                                                                        new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),(((_inspect_448_4651.kind_1==(((char)0))))?(2):(1)),_inspect_448_4651.kind_1,_inspect_448_4651.type_1,_inspect_448_4651.prefqual_1,0);
                                                                        ;
                                                                        // JavaLine 799 <== SourceLine 836
                                                                        new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                                                                        ;
                                                                        // JavaLine 802 <== SourceLine 837
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                                        ;
                                                                        // JavaLine 805 <== SourceLine 838
                                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                                                                        ;
                                                                        // JavaLine 808 <== SourceLine 839
                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),839,new RTS_TXT("ASSIGN"));
                                                                        ;
                                                                        // JavaLine 811 <== SourceLine 840
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                        ;
                                                                        // JavaLine 814 <== SourceLine 841
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                        ;
                                                                        // JavaLine 817 <== SourceLine 843
                                                                        if(_inspect_448_4651.kind_1<((char)0) || _inspect_448_4651.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                        switch(_inspect_448_4651.kind_1) { // BEGIN SWITCH STATEMENT
                                                                            case 0: 
                                                                            // JavaLine 821 <== SourceLine 844
                                                                            {
                                                                                // JavaLine 823 <== SourceLine 845
                                                                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                ;
                                                                                // JavaLine 826 <== SourceLine 846
                                                                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                ;
                                                                                // JavaLine 829 <== SourceLine 847
                                                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),847,new RTS_TXT("ASSIGN"));
                                                                                ;
                                                                                // JavaLine 832 <== SourceLine 848
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                ;
                                                                                // JavaLine 835 <== SourceLine 850
                                                                                if(_VALUE((((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.kind_1==(((char)0)))&&((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.type_1==(_inspect_448_4651.type_1))))&&((((_inspect_448_4651.type_1==(((char)7))))?((_inspect_448_4651.prefqual_1==(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.prefqual_1))):(true)))))) {
                                                                                    // JavaLine 837 <== SourceLine 854
                                                                                    {
                                                                                        // JavaLine 839 <== SourceLine 855
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),357);
                                                                                        ;
                                                                                        // JavaLine 842 <== SourceLine 856
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u001c")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 845 <== SourceLine 857
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                        ;
                                                                                    }
                                                                                }
                                                                                ;
                                                                                // JavaLine 851 <== SourceLine 859
                                                                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),358);
                                                                                ;
                                                                                // JavaLine 854 <== SourceLine 860
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0011")));
                                                                                ;
                                                                                // JavaLine 857 <== SourceLine 861
                                                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                ;
                                                                                // JavaLine 860 <== SourceLine 862
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                ;
                                                                                // JavaLine 863 <== SourceLine 863
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(3));
                                                                                ;
                                                                            }
                                                                            break;
                                                                            case 2: 
                                                                            // JavaLine 869 <== SourceLine 866
                                                                            {
                                                                                // JavaLine 871 <== SourceLine 867
                                                                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                ;
                                                                                // JavaLine 874 <== SourceLine 868
                                                                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                ;
                                                                                // JavaLine 877 <== SourceLine 869
                                                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),869,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                                                ;
                                                                                // JavaLine 880 <== SourceLine 870
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                ;
                                                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                ;
                                                                                // JavaLine 885 <== SourceLine 871
                                                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),871,new RTS_TXT("ASSIGN"));
                                                                                ;
                                                                                // JavaLine 888 <== SourceLine 872
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                ;
                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                                                                                ;
                                                                            }
                                                                            break;
                                                                            case 1: 
                                                                            // JavaLine 896 <== SourceLine 875
                                                                            {
                                                                                // JavaLine 898 <== SourceLine 876
                                                                                if(_VALUE((_inspect_448_4651.categ_1==(((char)0))))) {
                                                                                    {
                                                                                        // JavaLine 901 <== SourceLine 878
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                        ;
                                                                                        // JavaLine 904 <== SourceLine 879
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 907 <== SourceLine 880
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),880,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                                                        ;
                                                                                        // JavaLine 910 <== SourceLine 881
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                        ;
                                                                                        // JavaLine 915 <== SourceLine 882
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001G")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 918 <== SourceLine 885
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),361);
                                                                                        ;
                                                                                        // JavaLine 921 <== SourceLine 886
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 924 <== SourceLine 887
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),887,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                                                        ;
                                                                                        // JavaLine 927 <== SourceLine 888
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                        ;
                                                                                        // JavaLine 932 <== SourceLine 889
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001H")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 935 <== SourceLine 892
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),362);
                                                                                        ;
                                                                                        // JavaLine 938 <== SourceLine 893
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 941 <== SourceLine 894
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),894,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_448_4651.ftag_1+(0)))._RESULT);
                                                                                        ;
                                                                                        // JavaLine 944 <== SourceLine 895
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                        ;
                                                                                        // JavaLine 949 <== SourceLine 896
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001I")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 952 <== SourceLine 898
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(6));
                                                                                        ;
                                                                                    }
                                                                                } else {
                                                                                    // JavaLine 957 <== SourceLine 900
                                                                                    {
                                                                                        // JavaLine 959 <== SourceLine 901
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                        ;
                                                                                        // JavaLine 962 <== SourceLine 902
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 965 <== SourceLine 903
                                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),903,new RTS_TXT("ASSIGN"));
                                                                                        ;
                                                                                        // JavaLine 968 <== SourceLine 904
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                        ;
                                                                                        // JavaLine 971 <== SourceLine 905
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),361);
                                                                                        ;
                                                                                        // JavaLine 974 <== SourceLine 906
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                                                        ;
                                                                                        // JavaLine 977 <== SourceLine 907
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(1)));
                                                                                        ;
                                                                                        // JavaLine 980 <== SourceLine 908
                                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),908,new RTS_TXT("ASSIGN"));
                                                                                        ;
                                                                                        // JavaLine 983 <== SourceLine 909
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                        ;
                                                                                        // JavaLine 986 <== SourceLine 910
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(3));
                                                                                        ;
                                                                                        // JavaLine 989 <== SourceLine 911
                                                                                        if(_VALUE((_inspect_448_4651.type_1==(((char)7))))) {
                                                                                            {
                                                                                                // JavaLine 992 <== SourceLine 912
                                                                                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),362);
                                                                                                ;
                                                                                                // JavaLine 995 <== SourceLine 913
                                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                                                                ;
                                                                                                // JavaLine 998 <== SourceLine 914
                                                                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.prefqual_1.ftag_1+(1)));
                                                                                                ;
                                                                                                // JavaLine 1001 <== SourceLine 915
                                                                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),915,new RTS_TXT("ASSIGN"));
                                                                                                ;
                                                                                                // JavaLine 1004 <== SourceLine 916
                                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                                ;
                                                                                                // JavaLine 1007 <== SourceLine 917
                                                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                                                ;
                                                                                            }
                                                                                        }
                                                                                        ;
                                                                                    }
                                                                                }
                                                                                ;
                                                                            }
                                                                            break;
                                                                            case 3: 
                                                                            // JavaLine 1019 <== SourceLine 922
                                                                            {
                                                                                // JavaLine 1021 <== SourceLine 923
                                                                                if(_VALUE((_inspect_448_4651.categ_1==(((char)0))))) {
                                                                                    {
                                                                                        // JavaLine 1024 <== SourceLine 925
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                        ;
                                                                                        // JavaLine 1027 <== SourceLine 926
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 1030 <== SourceLine 927
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),927,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),_inspect_448_4651.ftag_1)._RESULT);
                                                                                        ;
                                                                                        // JavaLine 1033 <== SourceLine 928
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),_inspect_448_4651.ftag_1);
                                                                                        ;
                                                                                        // JavaLine 1038 <== SourceLine 929
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("J"),new RTS_TXT("\u0001C")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 1041 <== SourceLine 932
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),359);
                                                                                        ;
                                                                                        // JavaLine 1044 <== SourceLine 933
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 1047 <== SourceLine 934
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),934,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),_inspect_448_4651.ftag_1)._RESULT);
                                                                                        ;
                                                                                        // JavaLine 1050 <== SourceLine 935
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),_inspect_448_4651.ftag_1);
                                                                                        ;
                                                                                        // JavaLine 1055 <== SourceLine 936
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("J"),new RTS_TXT("\u0001D")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 1058 <== SourceLine 939
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),360);
                                                                                        ;
                                                                                        // JavaLine 1061 <== SourceLine 940
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 1064 <== SourceLine 941
                                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),941,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),_inspect_448_4651.ftag_1)._RESULT);
                                                                                        ;
                                                                                        // JavaLine 1067 <== SourceLine 942
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                                                                        ;
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),_inspect_448_4651.ftag_1);
                                                                                        ;
                                                                                        // JavaLine 1072 <== SourceLine 943
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("J"),new RTS_TXT("\u0001E")),new RTS_TXT("o")));
                                                                                        ;
                                                                                        // JavaLine 1075 <== SourceLine 945
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(6));
                                                                                        ;
                                                                                    }
                                                                                } else {
                                                                                    // JavaLine 1080 <== SourceLine 947
                                                                                    {
                                                                                        // JavaLine 1082 <== SourceLine 948
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                                                        ;
                                                                                        // JavaLine 1085 <== SourceLine 949
                                                                                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                                                        ;
                                                                                        // JavaLine 1088 <== SourceLine 950
                                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),950,new RTS_TXT("ASSIGN"));
                                                                                        ;
                                                                                        // JavaLine 1091 <== SourceLine 951
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                        ;
                                                                                        // JavaLine 1094 <== SourceLine 952
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),359);
                                                                                        ;
                                                                                        // JavaLine 1097 <== SourceLine 953
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
                                                                                        ;
                                                                                        // JavaLine 1100 <== SourceLine 954
                                                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                                                        ;
                                                                                        // JavaLine 1103 <== SourceLine 955
                                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),955,new RTS_TXT("ASSIGN"));
                                                                                        ;
                                                                                        // JavaLine 1106 <== SourceLine 956
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                        ;
                                                                                        // JavaLine 1109 <== SourceLine 957
                                                                                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),360);
                                                                                        ;
                                                                                        // JavaLine 1112 <== SourceLine 958
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                                                                        ;
                                                                                        // JavaLine 1115 <== SourceLine 959
                                                                                        ttag=new CLASS_SCODER1_codegenerator1_conlevel((_CUR._SL),((CLASS_COMMON_quantity)_inspect_448_4651))._RESULT;
                                                                                        ;
                                                                                        // JavaLine 1118 <== SourceLine 960
                                                                                        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),ttag);
                                                                                        ;
                                                                                        // JavaLine 1121 <== SourceLine 961
                                                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),961,new RTS_TXT("ASSIGN"));
                                                                                        ;
                                                                                        // JavaLine 1124 <== SourceLine 962
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                                                        ;
                                                                                        // JavaLine 1127 <== SourceLine 963
                                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(4));
                                                                                        ;
                                                                                    }
                                                                                }
                                                                                ;
                                                                            }
                                                                            break;
                                                                            case 4: 
                                                                            ;
                                                                            break;
                                                                        } // END SWITCH STATEMENT
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 1152 <== SourceLine 974
                                        if(_VALUE((_inspect_448_4651.kind_1==(((char)1))))) {
                                            // JavaLine 1154 <== SourceLine 975
                                            new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),true);
                                        } else {
                                            // JavaLine 1157 <== SourceLine 976
                                            if(_VALUE((_inspect_448_4651.kind_1==(((char)2))))) {
                                                {
                                                    // JavaLine 1160 <== SourceLine 977
                                                    if(_VALUE((_inspect_448_4651.categ_1==(((char)2))))) {
                                                        new CLASS_SCODER3_codegenerator3_fnp_acc_arr((_CUR._SL));
                                                    } else {
                                                        // JavaLine 1164 <== SourceLine 978
                                                        {
                                                            // JavaLine 1166 <== SourceLine 979
                                                            new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                                            ;
                                                            // JavaLine 1169 <== SourceLine 981
                                                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                                            ;
                                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_448_4651.ftag_1+(0)));
                                                            ;
                                                        }
                                                    }
                                                }
                                            } else {
                                                // JavaLine 1178 <== SourceLine 984
                                                if(_VALUE((_inspect_448_4651.kind_1==(((char)4))))) {
                                                    new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                                } else {
                                                    // JavaLine 1182 <== SourceLine 985
                                                    new CLASS_BUILDER1_visiblegenerator_StopScode_1((_CUR._SL),((char)14),985);
                                                }
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 1189 <== SourceLine 986
                                    _inspect_446_4650.lastopc=((char)141);
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 procLISSWA",1,443,10,444,13,447,15,448,28,446,33,448,39,449,41,448,43,449,46,450,49,451,52,455,55,456,58,458,61,459,64,460,67,461,70,462,73,463,76,465,79,466,82,467,85,468,88,469,91,471,94,472,97,473,100,474,103,475,106,478,109,479,112,480,115,481,118,482,121,483,126,484,129,485,132,486,135,487,142,488,145,489,148,490,151,492,156,494,158,495,161,496,164,497,167,498,170,499,176,504,181,507,183,508,186,509,188,513,190,518,193,519,196,521,199,522,202,523,204,525,206,526,209,527,212,528,215,529,218,530,221,531,224,532,227,539,232,541,234,544,236,545,239,546,242,547,245,548,248,549,251,552,254,553,257,554,260,555,265,557,267,558,270,559,273,560,276,562,279,563,282,564,285,565,291,569,294,570,297,571,300,572,303,575,306,576,309,577,312,578,315,580,320,581,323,582,326,583,329,584,332,585,337,586,343,592,346,596,349,598,351,600,357,603,359,604,362,605,365,606,370,611,372,612,375,613,381,618,387,621,390,622,393,625,398,628,400,629,403,635,407,636,409,637,411,638,413,640,416,641,421,650,425,651,430,653,432,656,435,657,441,666,443,667,448,669,450,670,455,672,457,673,462,676,467,679,470,680,473,681,476,683,479,684,482,685,486,686,488,688,491,689,494,691,497,692,500,693,503,694,508,695,511,696,514,697,519,698,522,699,525,700,528,701,531,702,534,703,543,706,545,707,548,708,553,709,556,710,560,711,564,712,567,713,570,714,576,717,578,718,581,719,586,720,592,721,596,722,599,723,602,724,607,725,610,727,613,728,616,729,625,732,627,733,630,734,636,737,638,738,641,739,647,743,652,745,663,750,665,756,667,759,670,760,672,761,675,762,678,763,683,764,686,765,689,766,694,767,697,768,700,769,703,770,705,774,708,777,712,780,717,782,720,786,723,787,726,789,729,790,732,791,737,796,740,797,743,798,748,803,750,804,753,805,760,810,763,812,766,813,769,817,772,818,775,819,778,820,781,821,786,822,789,823,794,827,796,829,799,836,802,837,805,838,808,839,811,840,814,841,817,843,821,844,823,845,826,846,829,847,832,848,835,850,837,854,839,855,842,856,845,857,851,859,854,860,857,861,860,862,863,863,869,866,871,867,874,868,877,869,880,870,885,871,888,872,896,875,898,876,901,878,904,879,907,880,910,881,915,882,918,885,921,886,924,887,927,888,932,889,935,892,938,893,941,894,944,895,949,896,952,898,957,900,959,901,962,902,965,903,968,904,971,905,974,906,977,907,980,908,983,909,986,910,989,911,992,912,995,913,998,914,1001,915,1004,916,1007,917,1019,922,1021,923,1024,925,1027,926,1030,927,1033,928,1038,929,1041,932,1044,933,1047,934,1050,935,1055,936,1058,939,1061,940,1064,941,1067,942,1072,943,1075,945,1080,947,1082,948,1085,949,1088,950,1091,951,1094,952,1097,953,1100,954,1103,955,1106,956,1109,957,1112,958,1115,959,1118,960,1121,961,1124,962,1127,963,1152,974,1154,975,1157,976,1160,977,1164,978,1166,979,1169,981,1178,984,1182,985,1189,986,1202,988);
} // End of Procedure
