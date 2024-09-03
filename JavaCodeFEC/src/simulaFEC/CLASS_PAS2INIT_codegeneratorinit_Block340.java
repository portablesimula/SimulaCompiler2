package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PAS2INIT_codegeneratorinit_Block340 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=339, lastLine=552, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 340
    public RTS_TXT t=null;
    public RTS_TXT feoptions=null;
    public int i=0;
    // JavaLine 12 <== SourceLine 378
    public CLASS_COMMON_brecord _inspect_378_4665=null;
    // JavaLine 14 <== SourceLine 453
    public CLASS_CHECKER2_semchecker_unstack _inspect_453_4666=null;
    // Normal Constructor
    public CLASS_PAS2INIT_codegeneratorinit_Block340(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 25 <== SourceLine 342
        RTS_BASICIO.sysout().outtext(new RTS_TXT("PAS2INIT.main: "));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 30 <== SourceLine 343
        ((CLASS_PAS2INIT)(_CUR._SL._SL)).checker0_6=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).checker_5=((CLASS_CHECKER2_semchecker)((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664);
        ;
        // JavaLine 33 <== SourceLine 344
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("PAS2INIT.main: "),RTS_ENVIRONMENT.edit(((CLASS_PAS2INIT)(_CUR._SL._SL)).checker0_6.lowplev)));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 38 <== SourceLine 346
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.L2buf_3=((CLASS_PAS2INIT)(_CUR._SL._SL)).L2codebuffer;
        ;
        // JavaLine 41 <== SourceLine 347
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.implNone_2=true;
        ;
        // JavaLine 44 <== SourceLine 349
        t=RTS_ENVIRONMENT.getTextInfo(16);
        ;
        for(i=0;i<=95;i++) {
            // JavaLine 48 <== SourceLine 350
            ((CLASS_PAS2INIT)(_CUR._SL._SL)).option.putELEMENT(((CLASS_PAS2INIT)(_CUR._SL._SL)).option.index(i),((char)0));
        }
        ;
        // JavaLine 52 <== SourceLine 351
        while(RTS_TXT.more(t)) {
            {
                // JavaLine 55 <== SourceLine 352
                if(_VALUE((RTS_TXT.getchar(t)==(':')))) {
                    {
                        // JavaLine 58 <== SourceLine 353
                        while(RTS_TXT.more(t)) {
                            new CLASS_COMMON_setopt((_CUR._SL._SL),RTS_TXT.getchar(t),'1');
                        }
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 356
        ((CLASS_PAS2INIT)(_CUR._SL._SL)).Afile_7=((CLASS_BUILDER2_normalattrfile)new CLASS_BUILDER2_normalattrfile((_CUR._SL._SL))._START());
        ;
        // JavaLine 71 <== SourceLine 357
        ((CLASS_PAS2INIT)(_CUR._SL._SL)).Afile_7.attrbuffer=RTS_ENVIRONMENT.blanks(2048);
        ;
        // JavaLine 74 <== SourceLine 360
        if(_VALUE((((CLASS_PAS2INIT)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('F'))==(((char)0))))) {
            {
                // JavaLine 77 <== SourceLine 365
                if(_VALUE(((((CLASS_PAS2INIT)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0)))&((((CLASS_PAS2INIT)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Q'))==(((char)0))))))) {
                    // JavaLine 79 <== SourceLine 366
                    {
                        ((CLASS_PAS2INIT)(_CUR._SL._SL)).option.putELEMENT(((CLASS_PAS2INIT)(_CUR._SL._SL)).option.index(RTS_ENVIRONMENT.rank('P')),((char)0));
                        ;
                        // JavaLine 83 <== SourceLine 367
                        new CLASS_BUILDER2_prechecker_allocate(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664);
                        ;
                        // JavaLine 86 <== SourceLine 368
                        ((CLASS_PAS2INIT)(_CUR._SL._SL)).option.putELEMENT(((CLASS_PAS2INIT)(_CUR._SL._SL)).option.index(RTS_ENVIRONMENT.rank('P')),'1');
                    }
                } else {
                    // JavaLine 90 <== SourceLine 369
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("PAS2INIT.main: (1)"));
                }
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 96 <== SourceLine 370
                new CLASS_BUILDER2_prechecker_allocate(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664);
                ;
                // JavaLine 99 <== SourceLine 371
                RTS_BASICIO.sysout().outtext(new RTS_TXT("PAS2INIT.main: (2)"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 104 <== SourceLine 374
                ((CLASS_PAS2INIT)(_CUR._SL._SL)).display.putELEMENT(((CLASS_PAS2INIT)(_CUR._SL._SL)).display.index(1),((RTS_REF_ARRAY<CLASS_COMMON_brecord>)((CLASS_PAS2INIT)(_CUR._SL._SL)).brctab.getELEMENT(0).val).getELEMENT(0));
                ;
                ((CLASS_PAS2INIT)(_CUR._SL._SL)).brctab.getELEMENT(0).val.putELEMENT(((CLASS_PAS2INIT)(_CUR._SL._SL)).brctab.getELEMENT(0).val.index(0),null);
                ;
                // JavaLine 109 <== SourceLine 377
                ((CLASS_PAS2INIT)(_CUR._SL._SL)).cblev_6=((char)2);
                ;
                // JavaLine 112 <== SourceLine 378
                {
                    // BEGIN INSPECTION 
                    _inspect_378_4665=((CLASS_PAS2INIT)(_CUR._SL._SL)).display.getELEMENT(1).fpar.descr_1;
                    if(_inspect_378_4665!=null) { // INSPECT _inspect_378_4665  type=ref(BRECORD)
                        {
                            new CLASS_BUILDER1_precheck0_makevisblock(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,((CLASS_COMMON_brecord)_inspect_378_4665));
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 123 <== SourceLine 381
                new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,new CLASS_BUILDER1_meaningof((_CUR._SL._SL),new CLASS_COMMON_boxof((_CUR._SL._SL),((char)0),'F')._RESULT)._RESULT);
                ;
                // JavaLine 126 <== SourceLine 384
                new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,new CLASS_BUILDER1_meaningof((_CUR._SL._SL),new CLASS_COMMON_boxof((_CUR._SL._SL),((char)0),'E')._RESULT)._RESULT);
                ;
            }
        } else {
            // JavaLine 131 <== SourceLine 387
            {
                ((CLASS_PAS2INIT)(_CUR._SL._SL)).cblev_6=((char)1);
                ;
                // JavaLine 135 <== SourceLine 388
                new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null);
                ;
                new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null);
                ;
                // JavaLine 140 <== SourceLine 389
                new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null);
                ;
            }
        }
        ;
        // JavaLine 146 <== SourceLine 391
        if(_VALUE(((CLASS_PAS2INIT)(_CUR._SL._SL)).separatecomp)) {
            new CLASS_CHECKER2_semchecker_enterconn(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null);
        }
        ;
        // JavaLine 151 <== SourceLine 393
        ((CLASS_PAS2INIT)(_CUR._SL._SL)).crtblev_6=((CLASS_PAS2INIT)(_CUR._SL._SL)).cblev_6;
        ;
        // JavaLine 154 <== SourceLine 395
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastbllo=((char)1);
        ;
        new CLASS_BUILDER2_prechecker_allocate(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664);
        ;
        // JavaLine 159 <== SourceLine 400
        new CLASS_CHECKER1_semchecker1_enterblock(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664);
        ;
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastblhi=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastbllo=((char)0);
        ;
        // JavaLine 164 <== SourceLine 408
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.constantelt_3=((CLASS_CHECKER2_semchecker_ConstEltChecker)new CLASS_CHECKER2_semchecker_ConstEltChecker(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664)._START());
        ;
        // JavaLine 167 <== SourceLine 409
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.true_const_2=new CLASS_CHECKER1_semchecker1_boolconst(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null,'[')._STM();
        ;
        // JavaLine 170 <== SourceLine 410
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.true_const_2.type=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.true_const_2.ctype=((char)1);
        ;
        // JavaLine 173 <== SourceLine 411
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.true_const_2.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1__const)(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.true_const_2)).ixlo_1='B';
        ;
        // JavaLine 178 <== SourceLine 412
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.false_const_2=new CLASS_CHECKER1_semchecker1_boolconst(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null,'[')._STM();
        ;
        // JavaLine 181 <== SourceLine 413
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.false_const_2.type=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.false_const_2.ctype=((char)1);
        ;
        // JavaLine 184 <== SourceLine 414
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.false_const_2.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1__const)(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.false_const_2)).ixlo_1='C';
        ;
        // JavaLine 189 <== SourceLine 415
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2=new CLASS_CHECKER1_semchecker1_textconst(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null,'[')._STM();
        ;
        // JavaLine 192 <== SourceLine 416
        ((CLASS_CHECKER1_semchecker1__const)(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2)).ixlo_1='A';
        ;
        // JavaLine 195 <== SourceLine 417
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2.type=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2.ctype=((char)8);
        ;
        // JavaLine 198 <== SourceLine 418
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2.qual=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.textclass_2;
        ;
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2.cl=((char)1);
        ;
        // JavaLine 203 <== SourceLine 419
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.dummytxtop_2=new CLASS_CHECKER1_semchecker1_textoperand(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.notext_const_2)._STM();
        ;
        // JavaLine 206 <== SourceLine 434
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.expexptop.putELEMENT(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.expexptop.index(0),((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.exptop_2=new CLASS_CHECKER1_semchecker1_rockBottom(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664,null,((char)14))._STM());
        ;
        // JavaLine 209 <== SourceLine 436
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.exptop_2.p_pred=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.exptop_2;
        ;
        // JavaLine 212 <== SourceLine 437
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.exptop_2.cl='t';
        ;
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.exptop_2.type=((char)15);
        ;
        // JavaLine 217 <== SourceLine 438
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastnap_2=((CLASS_CHECKER1_semchecker1_nextargumentproducer)new CLASS_CHECKER1_semchecker1_nextargumentproducer(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664)._START());
        ;
        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastnap_2.pred=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.lastnap_2;
        ;
        // JavaLine 222 <== SourceLine 453
        {
            // BEGIN INSPECTION 
            _inspect_453_4666=((CLASS_CHECKER2_semchecker_unstack)new CLASS_CHECKER2_semchecker_unstack(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664)._START());
            if(_inspect_453_4666!=null) { // INSPECT _inspect_453_4666  type=ref(UNSTACK)
                // JavaLine 227 <== SourceLine 454
                {
                    // JavaLine 229 <== SourceLine 453
                    {
                        // JavaLine 231 <== SourceLine 454
                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.ust_3=((CLASS_CHECKER2_semchecker_unstack)_inspect_453_4666);
                        ;
                        // JavaLine 234 <== SourceLine 455
                        _inspect_453_4666.optstack.putELEMENT(_inspect_453_4666.optstack.index(0),((char)14));
                        ;
                        // JavaLine 237 <== SourceLine 456
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)14))),((char)0));
                        ;
                        // JavaLine 240 <== SourceLine 458
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('W')),((char)1));
                        ;
                        // JavaLine 243 <== SourceLine 459
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)137))),((char)1));
                        ;
                        // JavaLine 246 <== SourceLine 460
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)130))),((char)1));
                        ;
                        // JavaLine 249 <== SourceLine 461
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)148))),((char)2));
                        ;
                        // JavaLine 252 <== SourceLine 462
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)11))),((char)2));
                        ;
                        // JavaLine 255 <== SourceLine 463
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('^')),((char)2));
                        ;
                        // JavaLine 258 <== SourceLine 464
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)137))),((char)2));
                        ;
                        // JavaLine 261 <== SourceLine 465
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)148))),((char)2));
                        ;
                        // JavaLine 264 <== SourceLine 466
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('l')),((char)2));
                        ;
                        // JavaLine 267 <== SourceLine 467
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('k')),((char)2));
                        ;
                        // JavaLine 270 <== SourceLine 468
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)145))),((char)2));
                        ;
                        // JavaLine 273 <== SourceLine 469
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('^')),((char)3));
                        ;
                        // JavaLine 276 <== SourceLine 470
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('_')),((char)1));
                        ;
                        // JavaLine 279 <== SourceLine 471
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)21))),((char)1));
                        ;
                        // JavaLine 282 <== SourceLine 472
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)128))),((char)2));
                        ;
                        // JavaLine 285 <== SourceLine 473
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)27))),((char)1));
                        ;
                        // JavaLine 288 <== SourceLine 474
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('7')),((char)1));
                        ;
                        // JavaLine 291 <== SourceLine 475
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('%')),((char)1));
                        ;
                        // JavaLine 294 <== SourceLine 476
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('i')),((char)1));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('i')),((char)2));
                        ;
                        // JavaLine 299 <== SourceLine 477
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)127))),((char)2));
                        ;
                        // JavaLine 302 <== SourceLine 478
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)32))),((char)2));
                        ;
                        // JavaLine 305 <== SourceLine 479
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('f')),((char)2));
                        ;
                        // JavaLine 308 <== SourceLine 480
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('r')),((char)2));
                        ;
                        // JavaLine 311 <== SourceLine 481
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('c')),((char)2));
                        ;
                        // JavaLine 314 <== SourceLine 482
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                        ;
                        // JavaLine 317 <== SourceLine 483
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('b')),((char)2));
                        ;
                        // JavaLine 320 <== SourceLine 484
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('h')),((char)2));
                        ;
                        // JavaLine 323 <== SourceLine 485
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)144))),((char)2));
                        ;
                        // JavaLine 326 <== SourceLine 486
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('v')),((char)5));
                        ;
                        // JavaLine 329 <== SourceLine 487
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('P')),((char)2));
                        ;
                        // JavaLine 332 <== SourceLine 488
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('Q')),((char)3));
                        ;
                        // JavaLine 335 <== SourceLine 489
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('8')),((char)4));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('8')),((char)5));
                        ;
                        // JavaLine 340 <== SourceLine 490
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('4')),((char)4));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('4')),((char)6));
                        ;
                        // JavaLine 345 <== SourceLine 491
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('.')),((char)5));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('.')),((char)5));
                        ;
                        // JavaLine 350 <== SourceLine 492
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)28))),((char)5));
                        ;
                        // JavaLine 353 <== SourceLine 493
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)23))),((char)5));
                        ;
                        // JavaLine 356 <== SourceLine 494
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('1')),((char)5));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('1')),((char)6));
                        ;
                        // JavaLine 361 <== SourceLine 495
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)15))),((char)6));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)15))),((char)6));
                        ;
                        // JavaLine 366 <== SourceLine 496
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('t')),((char)6));
                        ;
                        // JavaLine 369 <== SourceLine 503
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('R')),((char)5));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('R')),((char)5));
                        ;
                        // JavaLine 374 <== SourceLine 504
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('S')),((char)5));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('S')),((char)5));
                        ;
                        // JavaLine 379 <== SourceLine 505
                        _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('|')),((char)5));
                        ;
                        _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('|')),((char)5));
                        ;
                        // JavaLine 384 <== SourceLine 506
                    _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('}')),((char)5));
                    ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('}')),((char)5));
                ;
                // JavaLine 389 <== SourceLine 507
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('3')),((char)5));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('3')),((char)5));
                ;
                // JavaLine 394 <== SourceLine 508
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('d')),((char)2));
                ;
                // JavaLine 397 <== SourceLine 509
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                ;
                // JavaLine 400 <== SourceLine 512
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('T')),((char)6));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('T')),((char)6));
                ;
                // JavaLine 405 <== SourceLine 513
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('V')),((char)6));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('V')),((char)6));
                ;
                // JavaLine 410 <== SourceLine 514
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('U')),((char)7));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('U')),((char)7));
                ;
                // JavaLine 415 <== SourceLine 515
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)17))),((char)8));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)17))),((char)8));
                ;
                // JavaLine 420 <== SourceLine 516
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)24))),((char)9));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)24))),((char)9));
                ;
                // JavaLine 425 <== SourceLine 517
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('$')),((char)10));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('$')),((char)10));
                ;
                // JavaLine 430 <== SourceLine 518
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('-')),((char)11));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('-')),((char)11));
                ;
                // JavaLine 435 <== SourceLine 519
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('#')),((char)12));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('#')),((char)12));
                ;
                // JavaLine 440 <== SourceLine 522
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(':')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(':')),((char)13));
                ;
                // JavaLine 445 <== SourceLine 523
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(';')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(';')),((char)13));
                ;
                // JavaLine 450 <== SourceLine 524
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('9')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('9')),((char)13));
                ;
                // JavaLine 455 <== SourceLine 525
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('>')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('>')),((char)13));
                ;
                // JavaLine 460 <== SourceLine 526
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('<')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('<')),((char)13));
                ;
                // JavaLine 465 <== SourceLine 527
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('=')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('=')),((char)13));
                ;
                // JavaLine 470 <== SourceLine 528
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('E')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('E')),((char)13));
                ;
                // JavaLine 475 <== SourceLine 529
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('D')),((char)13));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('D')),((char)13));
                ;
                // JavaLine 480 <== SourceLine 531
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('F')),((char)14));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('F')),((char)14));
                ;
                // JavaLine 485 <== SourceLine 532
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('G')),((char)14));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('G')),((char)14));
                ;
                // JavaLine 490 <== SourceLine 535
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('H')),((char)15));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('H')),((char)15));
                ;
                // JavaLine 495 <== SourceLine 536
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('I')),((char)15));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('I')),((char)15));
                ;
                // JavaLine 500 <== SourceLine 537
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('K')),((char)15));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('K')),((char)15));
                ;
                // JavaLine 505 <== SourceLine 538
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank(((char)146))),((char)15));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank(((char)146))),((char)15));
                ;
                // JavaLine 510 <== SourceLine 540
                _inspect_453_4666.priority.putELEMENT(_inspect_453_4666.priority.index(RTS_ENVIRONMENT.rank('J')),((char)16));
                ;
                _inspect_453_4666.comprior.putELEMENT(_inspect_453_4666.comprior.index(RTS_ENVIRONMENT.rank('J')),((char)16));
                ;
            }
        }
    }
} // END INSPECTION
;
// JavaLine 520 <== SourceLine 543
if(_VALUE((((CLASS_PAS2INIT)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('F'))==(((char)0))))) {
    // JavaLine 522 <== SourceLine 544
    ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL))._inspect_339_4664.textclass_2=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),new CLASS_COMMON_boxof((_CUR._SL._SL),((char)0),'H')._RESULT)._RESULT;
}
;
EBLK();
return(this);
} // End of 4 Statements
public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PAS2INIT.sim","4 Block340",8,340,12,378,14,453,25,342,30,343,33,344,38,346,41,347,44,349,48,350,52,351,55,352,58,353,68,356,71,357,74,360,77,365,79,366,83,367,86,368,90,369,96,370,99,371,104,374,109,377,112,378,123,381,126,384,131,387,135,388,140,389,146,391,151,393,154,395,159,400,164,408,167,409,170,410,173,411,178,412,181,413,184,414,189,415,192,416,195,417,198,418,203,419,206,434,209,436,212,437,217,438,222,453,227,454,229,453,231,454,234,455,237,456,240,458,243,459,246,460,249,461,252,462,255,463,258,464,261,465,264,466,267,467,270,468,273,469,276,470,279,471,282,472,285,473,288,474,291,475,294,476,299,477,302,478,305,479,308,480,311,481,314,482,317,483,320,484,323,485,326,486,329,487,332,488,335,489,340,490,345,491,350,492,353,493,356,494,361,495,366,496,369,503,374,504,379,505,384,506,389,507,394,508,397,509,400,512,405,513,410,514,415,515,420,516,425,517,430,518,435,519,440,522,445,523,450,524,455,525,460,526,465,527,470,528,475,529,480,531,485,532,490,535,495,536,500,537,505,538,510,540,520,543,522,544,528,552);
} // End of SubBlock
