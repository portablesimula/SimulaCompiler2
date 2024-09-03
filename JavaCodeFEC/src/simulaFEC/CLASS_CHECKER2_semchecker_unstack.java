// JavaLine 1 <== SourceLine 385
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER2_semchecker_unstack extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=0, firstLine=385, lastLine=844, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 607
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block605_Block606_Block607_refcom1_0=new RTS_LABEL(this,0,1,"refcom1"); // Local Label #1=refcom1 At PrefixLevel 0
    // JavaLine 13 <== SourceLine 611
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block605_Block610_Block611_refcom2_0=new RTS_LABEL(this,0,2,"refcom2"); // Local Label #2=refcom2 At PrefixLevel 0
    // JavaLine 15 <== SourceLine 631
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_valcom_0=new RTS_LABEL(this,0,3,"valcom"); // Local Label #3=valcom At PrefixLevel 0
    // JavaLine 17 <== SourceLine 637
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_SETX_0=new RTS_LABEL(this,0,4,"SETX"); // Local Label #4=SETX At PrefixLevel 0
    // JavaLine 19 <== SourceLine 644
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_CONX_0=new RTS_LABEL(this,0,5,"CONX"); // Local Label #5=CONX At PrefixLevel 0
    // JavaLine 21 <== SourceLine 676
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_VALRELX_0=new RTS_LABEL(this,0,6,"VALRELX"); // Local Label #6=VALRELX At PrefixLevel 0
    // JavaLine 23 <== SourceLine 703
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block685_GEN_0=new RTS_LABEL(this,0,7,"GEN"); // Local Label #7=GEN At PrefixLevel 0
    // JavaLine 25 <== SourceLine 831
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0=new RTS_LABEL(this,0,8,"popoperator"); // Local Label #8=popoperator At PrefixLevel 0
    // JavaLine 27 <== SourceLine 839
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_REPEAT_0=new RTS_LABEL(this,0,9,"REPEAT"); // Local Label #9=REPEAT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 30 <== SourceLine 388
    public int lhi=0;
    public int rhi=0;
    // JavaLine 33 <== SourceLine 389
    public int lhs=0;
    public int rhs=0;
    // JavaLine 36 <== SourceLine 390
    public RTS_TXT lht=null;
    public RTS_TXT rht=null;
    // JavaLine 39 <== SourceLine 391
    public boolean lhb=false;
    public boolean rhb=false;
    // JavaLine 42 <== SourceLine 392
    public char lhc=0;
    public char copt=0;
    public char contype=0;
    // JavaLine 46 <== SourceLine 393
    public CLASS_CHECKER1_semchecker1_exp sos=null;
    public CLASS_CHECKER1_semchecker1_exp tos=null;
    public CLASS_CHECKER1_semchecker1_exp tmp=null;
    // JavaLine 50 <== SourceLine 395
    public RTS_CHARACTER_ARRAY optstack=null;
    // JavaLine 52 <== SourceLine 399
    public RTS_CHARACTER_ARRAY priority=null;
    // JavaLine 54 <== SourceLine 400
    public RTS_CHARACTER_ARRAY comprior=null;
    // JavaLine 56 <== SourceLine 457
    public RTS_Printfile _inspect_456_4598=null;
    // JavaLine 58 <== SourceLine 477
    public RTS_Printfile _inspect_476_4599=null;
    // JavaLine 60 <== SourceLine 510
    public CLASS_CHECKER1_semchecker1_exp _inspect_509_4600=null;
    // JavaLine 62 <== SourceLine 646
    public CLASS_CHECKER1_semchecker1__const _inspect_646_4601=null;
    // JavaLine 64 <== SourceLine 760
    public CLASS_CHECKER1_semchecker1_textconc _inspect_760_4602=null;
    // JavaLine 66 <== SourceLine 832
    public RTS_Printfile _inspect_832_4603=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_unstack(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        // JavaLine 74 <== SourceLine 395
        optstack=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,100));
        // JavaLine 76 <== SourceLine 399
        priority=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,150));
        // JavaLine 78 <== SourceLine 400
        comprior=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,150));
    }
    // Class Statements
    @Override
    public CLASS_CHECKER2_semchecker_unstack _STM() {
        CLASS_CHECKER2_semchecker_unstack _THIS=(CLASS_CHECKER2_semchecker_unstack)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,9); // For ByteCode Engineering
                // JavaLine 88 <== SourceLine 450
                detach(450);
                ;
                // JavaLine 91 <== SourceLine 451
                while(true) {
                    {
                        // JavaLine 94 <== SourceLine 454
                        copt=optstack.getELEMENT(((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2);
                        ;
                        // JavaLine 97 <== SourceLine 456
                        if(_VALUE((((CLASS_CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('S'))!=(((char)0))))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_456_4598=RTS_BASICIO.sysout();
                                if(_inspect_456_4598!=null) { // INSPECT _inspect_456_4598  type=ref(PRINTFILE)
                                    // JavaLine 103 <== SourceLine 457
                                    {
                                        {
                                            _inspect_456_4598.outimage();
                                            ;
                                            _inspect_456_4598.outtext(new RTS_TXT("-->UST, insymbol= "));
                                            ;
                                            // JavaLine 110 <== SourceLine 458
                                            _inspect_456_4598.outtext(((CLASS_CHECKER2)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).opn)));
                                            ;
                                            _inspect_456_4598.outtext(new RTS_TXT(":comprior:"));
                                            ;
                                            // JavaLine 115 <== SourceLine 459
                                            _inspect_456_4598.outint(RTS_ENVIRONMENT.rank(comprior.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).opn))),0);
                                            ;
                                            // JavaLine 118 <== SourceLine 460
                                            _inspect_456_4598.outtext(new RTS_TXT(", opttop= "));
                                            ;
                                            // JavaLine 121 <== SourceLine 461
                                            _inspect_456_4598.outtext(((CLASS_CHECKER2)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(copt)));
                                            ;
                                            _inspect_456_4598.outtext(new RTS_TXT(":prior:"));
                                            ;
                                            // JavaLine 126 <== SourceLine 462
                                            _inspect_456_4598.outint(RTS_ENVIRONMENT.rank(priority.getELEMENT(RTS_ENVIRONMENT.rank(copt))),0);
                                            ;
                                            // JavaLine 129 <== SourceLine 463
                                            _inspect_456_4598.outtext(new RTS_TXT(", srcline "));
                                            ;
                                            _inspect_456_4598.outint(((CLASS_CHECKER2)(_CUR._SL._SL)).linenr,0);
                                            ;
                                            _inspect_456_4598.outimage();
                                            ;
                                            // JavaLine 136 <== SourceLine 464
                                            tos=((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2;
                                            ;
                                            sos=tos.p_pred;
                                            ;
                                            // JavaLine 141 <== SourceLine 465
                                            while(((sos!=(null))&&((sos.p_pred!=(null))))) {
                                                {
                                                    // JavaLine 144 <== SourceLine 466
                                                    if(_VALUE((tos==(sos)))) {
                                                        new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),466);
                                                    }
                                                    ;
                                                    // JavaLine 149 <== SourceLine 467
                                                    tos.dump_0().CPF();
                                                    ;
                                                    tos=sos;
                                                    ;
                                                    sos=tos.p_pred;
                                                }
                                            }
                                            ;
                                            // JavaLine 158 <== SourceLine 468
                                            _inspect_456_4598.outtext(new RTS_TXT("---- end stackdump"));
                                            ;
                                            _inspect_456_4598.outimage();
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                        // JavaLine 169 <== SourceLine 471
                        while((priority.getELEMENT(RTS_ENVIRONMENT.rank(copt))>=(comprior.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).opn))))) {
                            // JavaLine 171 <== SourceLine 472
                            {
                                // JavaLine 173 <== SourceLine 474
                                tos=((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2;
                                ;
                                sos=tos.p_pred;
                                ;
                                // JavaLine 178 <== SourceLine 476
                                if(_VALUE((((CLASS_CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('S'))!=(((char)0))))) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_476_4599=RTS_BASICIO.sysout();
                                        if(_inspect_476_4599!=null) { // INSPECT _inspect_476_4599  type=ref(PRINTFILE)
                                            // JavaLine 184 <== SourceLine 477
                                            {
                                                {
                                                    _inspect_476_4599.outtext(new RTS_TXT("  try pop "));
                                                    ;
                                                    // JavaLine 189 <== SourceLine 478
                                                    _inspect_476_4599.outtext(((CLASS_CHECKER2)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(copt)));
                                                    ;
                                                    _inspect_476_4599.outtext(new RTS_TXT(", prior:"));
                                                    ;
                                                    // JavaLine 194 <== SourceLine 479
                                                    _inspect_476_4599.outint(RTS_ENVIRONMENT.rank(priority.getELEMENT(RTS_ENVIRONMENT.rank(copt))),0);
                                                    ;
                                                    _inspect_476_4599.outimage();
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                                ;
                                // JavaLine 205 <== SourceLine 482
                                if(copt<((char)0) || copt>((char)148)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(copt) { // BEGIN SWITCH STATEMENT
                                    case 148: 
                                    // JavaLine 209 <== SourceLine 485
                                    {
                                        // JavaLine 211 <== SourceLine 486
                                        new CLASS_CHECKER2_semchecker_unstack_casePair((_CUR));
                                        ;
                                        // JavaLine 214 <== SourceLine 487
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER2_semchecker_caseexp((_CUR._SL),((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2,'W',rhi,lhi,lhc)._STM();
                                        ;
                                    }
                                    break;
                                    case 11: 
                                    // JavaLine 220 <== SourceLine 490
                                    {
                                        // JavaLine 222 <== SourceLine 491
                                        new CLASS_CHECKER2_semchecker_unstack_caseSingle((_CUR));
                                        ;
                                        // JavaLine 225 <== SourceLine 492
                                        if(_VALUE((!(RTS_UTIL._IS(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2,CLASS_CHECKER2_semchecker_caseexp.class))))) {
                                            new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),492);
                                        }
                                        ;
                                        // JavaLine 230 <== SourceLine 493
                                        if(_VALUE((lhc!=(((CLASS_CHECKER2_semchecker_caseexp)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).p1_casetype)))) {
                                            new CLASS_ERRMSG_error0((_CUR._SL._SL),443);
                                        }
                                        ;
                                        // JavaLine 235 <== SourceLine 494
                                        new CLASS_CHECKER2_semchecker_caseexp_whenvalue(((CLASS_CHECKER2_semchecker_caseexp)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)),rhi);
                                        ;
                                        // JavaLine 238 <== SourceLine 495
                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_REPEAT_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 94: 
                                    // JavaLine 244 <== SourceLine 498
                                    {
                                        // JavaLine 246 <== SourceLine 499
                                        new CLASS_CHECKER2_semchecker_unstack_casePair((_CUR));
                                        ;
                                        // JavaLine 249 <== SourceLine 500
                                        if(_VALUE((!(RTS_UTIL._IS(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2,CLASS_CHECKER2_semchecker_caseexp.class))))) {
                                            new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),500);
                                        }
                                        ;
                                        // JavaLine 254 <== SourceLine 501
                                        if(_VALUE((lhc!=(((CLASS_CHECKER2_semchecker_caseexp)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).p1_casetype)))) {
                                            new CLASS_ERRMSG_error0((_CUR._SL._SL),443);
                                        }
                                        ;
                                        // JavaLine 259 <== SourceLine 502
                                        new CLASS_CHECKER2_semchecker_caseexp_whenrange(((CLASS_CHECKER2_semchecker_caseexp)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)),rhi,lhi);
                                        ;
                                        // JavaLine 262 <== SourceLine 503
                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_REPEAT_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 15: 
                                    case 116: 
                                    // JavaLine 269 <== SourceLine 507
                                    {
                                        // JavaLine 271 <== SourceLine 509
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_509_4600=sos.p_pred;
                                            if(_inspect_509_4600!=null) { // INSPECT _inspect_509_4600  type=ref(EXP)
                                                // JavaLine 276 <== SourceLine 510
                                                {
                                                    if(_VALUE((_inspect_509_4600.ctype==(((char)1))))) {
                                                        {
                                                            // JavaLine 280 <== SourceLine 511
                                                            if(_VALUE((((CLASS_CHECKER1_semchecker1_boolconst)(((CLASS_CHECKER1_semchecker1_exp)_inspect_509_4600))).ixlo_1==('B')))) {
                                                                // JavaLine 282 <== SourceLine 512
                                                                ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                            }
                                                            ;
                                                            // JavaLine 286 <== SourceLine 513
                                                            ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2.p_pred=_inspect_509_4600.p_pred;
                                                        }
                                                    } else {
                                                        // JavaLine 290 <== SourceLine 515
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_ifexp((_CUR._SL),_inspect_509_4600.p_pred,((char)15),sos,tos,((CLASS_CHECKER1_semchecker1_exp)_inspect_509_4600))._STM();
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                    }
                                    break;
                                    case 71: 
                                    case 70: 
                                    case 72: 
                                    // JavaLine 302 <== SourceLine 519
                                    {
                                        // JavaLine 304 <== SourceLine 520
                                        if(_VALUE((sos.ctype==(((char)4))))) {
                                            // JavaLine 306 <== SourceLine 521
                                            {
                                                // JavaLine 308 <== SourceLine 522
                                                if(_VALUE((tos.ctype==(((char)4))))) {
                                                    {
                                                        // JavaLine 311 <== SourceLine 523
                                                        lhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixlo_1)._RESULT;
                                                        ;
                                                        // JavaLine 314 <== SourceLine 525
                                                        rhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixlo_1)._RESULT;
                                                        ;
                                                        // JavaLine 317 <== SourceLine 527
                                                        new CLASS_CHECKER2_semchecker_unstack_ReplaceByConst((_CUR),(((copt==('F')))?((lhs+(rhs))):((((copt==('G')))?((lhs-(rhs))):((lhs*(rhs)))))));
                                                        ;
                                                        // JavaLine 320 <== SourceLine 530
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 326 <== SourceLine 532
                                                if(_VALUE(((((CLASS_CHECKER1_semchecker1__const)(sos)).ixlo_1==(((char)255)))&((((CLASS_CHECKER1_semchecker1__const)(sos)).ixhi_1==(((char)127))))))) {
                                                    // JavaLine 328 <== SourceLine 534
                                                    {
                                                        // JavaLine 330 <== SourceLine 535
                                                        if(_VALUE((copt==('H')))) {
                                                            ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                        } else {
                                                            // JavaLine 334 <== SourceLine 536
                                                            if(_VALUE((copt==('G')))) {
                                                                // JavaLine 336 <== SourceLine 537
                                                                ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_unary((_CUR._SL),sos.p_pred,((char)146),tos,tos)._STM();
                                                            } else {
                                                                // JavaLine 339 <== SourceLine 538
                                                                tos.p_pred=sos.p_pred;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 344 <== SourceLine 539
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        } else {
                                            // JavaLine 352 <== SourceLine 542
                                            if(_VALUE((tos.ctype==(((char)4))))) {
                                                {
                                                    // JavaLine 355 <== SourceLine 543
                                                    if(_VALUE((((CLASS_CHECKER1_semchecker1__const)(tos)).ixlo_1==(((char)255))))) {
                                                        {
                                                            // JavaLine 358 <== SourceLine 544
                                                            if(_VALUE((((CLASS_CHECKER1_semchecker1__const)(tos)).ixhi_1==(((char)127))))) {
                                                                {
                                                                    // JavaLine 361 <== SourceLine 545
                                                                    if(_VALUE((copt!=('H')))) {
                                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                                    } else {
                                                                        // JavaLine 365 <== SourceLine 546
                                                                        tos.p_pred=sos.p_pred;
                                                                    }
                                                                    ;
                                                                    // JavaLine 369 <== SourceLine 547
                                                                    _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                                    ;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 381 <== SourceLine 550
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_arithop((_CUR._SL),sos.p_pred,copt,sos,tos)._STM();
                                        ;
                                    }
                                    break;
                                    case 146: 
                                    // JavaLine 387 <== SourceLine 554
                                    {
                                        // JavaLine 389 <== SourceLine 556
                                        if(_VALUE(RTS_UTIL._IS(tos,CLASS_CHECKER1_semchecker1_arithconst.class))) {
                                            {
                                                // JavaLine 392 <== SourceLine 557
                                                lht=new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1__const)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1__const)(tos)).ixlo_1)._RESULT.symbol;
                                                ;
                                                // JavaLine 395 <== SourceLine 559
                                                ((CLASS_CHECKER2)(_CUR._SL._SL)).simsymbol=(((RTS_ENVIRONMENT.loadChar(lht,0)==('-')))?(RTS_TXT.sub(lht,2,(RTS_TXT.length(lht)-(1)))):(CONC(new RTS_TXT("-"),lht)));
                                                ;
                                                // JavaLine 398 <== SourceLine 562
                                                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                                ;
                                                // JavaLine 401 <== SourceLine 563
                                                ((CLASS_CHECKER1_semchecker1__const)(tos)).ixhi_1=((CLASS_CHECKER2)(_CUR._SL._SL)).hashhi;
                                                ;
                                                ((CLASS_CHECKER1_semchecker1__const)(tos)).ixlo_1=((CLASS_CHECKER2)(_CUR._SL._SL)).hashlo;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 408 <== SourceLine 565
                                            ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_unary((_CUR._SL),sos,((char)146),tos,tos)._STM();
                                        }
                                        ;
                                    }
                                    break;
                                    case 75: 
                                    // JavaLine 415 <== SourceLine 569
                                    {
                                        // JavaLine 417 <== SourceLine 570
                                        if(_VALUE(((sos.ctype==(((char)4)))&&((tos.ctype==(((char)4))))))) {
                                            // JavaLine 419 <== SourceLine 571
                                            {
                                                // JavaLine 421 <== SourceLine 572
                                                lhi=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixlo_1)._RESULT;
                                                ;
                                                // JavaLine 424 <== SourceLine 574
                                                rhi=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixlo_1)._RESULT;
                                                ;
                                                // JavaLine 427 <== SourceLine 576
                                                if(_VALUE((rhi==(0)))) {
                                                    new CLASS_ERRMSG_error0((_CUR._SL._SL),-268);
                                                } else {
                                                    // JavaLine 431 <== SourceLine 577
                                                    {
                                                        // JavaLine 433 <== SourceLine 578
                                                        new CLASS_CHECKER2_semchecker_unstack_ReplaceByConst((_CUR),(lhi/(rhi)));
                                                        ;
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 444 <== SourceLine 581
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_integerdivide((_CUR._SL),sos.p_pred,'K',sos,tos)._STM();
                                        ;
                                    }
                                    break;
                                    case 73: 
                                    // JavaLine 450 <== SourceLine 585
                                    {
                                        // JavaLine 452 <== SourceLine 586
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_divide((_CUR._SL),sos.p_pred,'I',sos,tos)._STM();
                                        ;
                                    }
                                    break;
                                    case 74: 
                                    // JavaLine 458 <== SourceLine 589
                                    {
                                        // JavaLine 460 <== SourceLine 590
                                        if(_VALUE((sos.ctype==(((char)4))))) {
                                            {
                                                if(_VALUE((tos.ctype==(((char)4))))) {
                                                    // JavaLine 464 <== SourceLine 591
                                                    {
                                                        // JavaLine 466 <== SourceLine 592
                                                        lhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixlo_1)._RESULT;
                                                        ;
                                                        // JavaLine 469 <== SourceLine 594
                                                        rhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixlo_1)._RESULT;
                                                        ;
                                                        // JavaLine 472 <== SourceLine 596
                                                        if(_VALUE(((rhs<(0))||(((lhs==(0))&((rhs==(0)))))))) {
                                                            // JavaLine 474 <== SourceLine 597
                                                            new CLASS_ERRMSG_error0((_CUR._SL._SL),-198);
                                                        } else {
                                                            // JavaLine 477 <== SourceLine 598
                                                            {
                                                                // JavaLine 479 <== SourceLine 599
                                                                new CLASS_CHECKER2_semchecker_unstack_ReplaceByConst((_CUR),RTS_UTIL._IPOW(lhs,rhs));
                                                                ;
                                                                _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                            }
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 491 <== SourceLine 601
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_power((_CUR._SL),sos.p_pred,'J',sos,tos)._STM();
                                        ;
                                    }
                                    break;
                                    case 68: 
                                    case 69: 
                                    // JavaLine 498 <== SourceLine 604
                                    {
                                        // JavaLine 500 <== SourceLine 605
                                        if(_VALUE((tos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 503 <== SourceLine 606
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 506 <== SourceLine 607
                                                        {
                                                            _SIM_LABEL(1); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                            ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_refrel((_CUR._SL),sos.p_pred,copt,null,sos)._STM();
                                                        }
                                                        ;
                                                        // JavaLine 512 <== SourceLine 608
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 519 <== SourceLine 609
                                        if(_VALUE((sos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 522 <== SourceLine 610
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 525 <== SourceLine 611
                                                        {
                                                            _SIM_LABEL(2); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                            ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_refrel((_CUR._SL),sos.p_pred,copt,null,tos)._STM();
                                                        }
                                                        ;
                                                        // JavaLine 531 <== SourceLine 612
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 538 <== SourceLine 613
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_refrel((_CUR._SL),sos.p_pred,copt,sos,tos)._STM();
                                        ;
                                    }
                                    break;
                                    case 58: 
                                    case 61: 
                                    // JavaLine 545 <== SourceLine 617
                                    {
                                        // JavaLine 547 <== SourceLine 618
                                        if(_VALUE((tos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 550 <== SourceLine 619
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 553 <== SourceLine 620
                                                        copt=(((copt==(':')))?('D'):('E'));
                                                        ;
                                                        // JavaLine 556 <== SourceLine 621
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block605_Block606_Block607_refcom1_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 563 <== SourceLine 622
                                        if(_VALUE((sos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 566 <== SourceLine 623
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 569 <== SourceLine 624
                                                        copt=(((copt==(':')))?('D'):('E'));
                                                        ;
                                                        // JavaLine 572 <== SourceLine 625
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block605_Block610_Block611_refcom2_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 579 <== SourceLine 626
                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_valcom_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 62: 
                                    case 60: 
                                    case 59: 
                                    case 57: 
                                    // JavaLine 588 <== SourceLine 629
                                    {
                                        // JavaLine 590 <== SourceLine 630
                                        {
                                            _SIM_LABEL(3); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                            // JavaLine 593 <== SourceLine 631
                                            if(_VALUE(((sos.ctype==(((char)4)))&&((tos.ctype==(((char)4))))))) {
                                                // JavaLine 595 <== SourceLine 632
                                                {
                                                    // JavaLine 597 <== SourceLine 633
                                                    lhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(sos)).ixlo_1)._RESULT;
                                                    ;
                                                    // JavaLine 600 <== SourceLine 635
                                                    rhs=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_arithconst)(tos)).ixlo_1)._RESULT;
                                                    ;
                                                    // JavaLine 603 <== SourceLine 637
                                                    {
                                                        _SIM_LABEL(4); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                        lhc=(((((((((copt==(':'))&&((lhs==(rhs))))||(((copt==('='))&&((lhs!=(rhs))))))||(((copt==(';'))&&((lhs<=(rhs))))))||(((copt==('>'))&&((lhs>=(rhs))))))||(((copt==('9'))&&((lhs<(rhs))))))||(((copt==('<'))&&((lhs>(rhs)))))))?('B'):('C'));
                                                    }
                                                    ;
                                                    // JavaLine 609 <== SourceLine 644
                                                    {
                                                        _SIM_LABEL(5); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_boolconst((_CUR._SL),sos.p_pred,'[')._STM();
                                                    }
                                                    ;
                                                    // JavaLine 615 <== SourceLine 646
                                                    {
                                                        // BEGIN INSPECTION 
                                                        _inspect_646_4601=((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2));
                                                        if(_inspect_646_4601!=null) { // INSPECT _inspect_646_4601  type=ref(_CONST)
                                                            // JavaLine 620 <== SourceLine 647
                                                            {
                                                                // JavaLine 622 <== SourceLine 646
                                                                {
                                                                    // JavaLine 624 <== SourceLine 647
                                                                    _inspect_646_4601.ixhi_1=((char)0);
                                                                    ;
                                                                    _inspect_646_4601.ixlo_1=lhc;
                                                                    ;
                                                                    _inspect_646_4601.type=_inspect_646_4601.ctype=((char)1);
                                                                    ;
                                                                    // JavaLine 631 <== SourceLine 648
                                                                    _inspect_646_4601.cl=((char)1);
                                                                }
                                                            }
                                                        }
                                                    } // END INSPECTION
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 640 <== SourceLine 651
                                                if(_VALUE(((sos.ctype==(((char)8)))&&((tos.ctype==(((char)8))))))) {
                                                    // JavaLine 642 <== SourceLine 652
                                                    {
                                                        // JavaLine 644 <== SourceLine 653
                                                        lht=(((((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1==(((char)0))))?(null):(new CLASS_COMMON_nameof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixlo_1)._RESULT));
                                                        ;
                                                        // JavaLine 647 <== SourceLine 656
                                                        rht=(((((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1==(((char)0))))?(null):(new CLASS_COMMON_nameof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixlo_1)._RESULT));
                                                        ;
                                                        // JavaLine 650 <== SourceLine 659
                                                        lhc=(((((((((copt==(':'))&&(RTS_UTIL._TXTREL_EQ(lht,rht)))||(((copt==('='))&&(RTS_UTIL._TXTREL_NE(lht,rht)))))||(((copt==(';'))&&(RTS_UTIL._TXTREL_LE(lht,rht)))))||(((copt==('>'))&&(RTS_UTIL._TXTREL_GE(lht,rht)))))||(((copt==('9'))&&(RTS_UTIL._TXTREL_LT(lht,rht)))))||(((copt==('<'))&&(RTS_UTIL._TXTREL_GT(lht,rht))))))?('B'):('C'));
                                                        ;
                                                        // JavaLine 653 <== SourceLine 666
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_CONX_0); // GOTO EVALUATED LABEL
                                                    }
                                                } else {
                                                    // JavaLine 657 <== SourceLine 669
                                                    if(_VALUE(((sos.ctype==(((char)2)))&&((((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2.ctype==(((char)2))))))) {
                                                        // JavaLine 659 <== SourceLine 670
                                                        {
                                                            // JavaLine 661 <== SourceLine 671
                                                            lhs=RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_charconst)(sos)).ixlo_1);
                                                            ;
                                                            // JavaLine 664 <== SourceLine 672
                                                            rhs=RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_charconst)(tos)).ixlo_1);
                                                            ;
                                                            // JavaLine 667 <== SourceLine 673
                                                            _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_SETX_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 672 <== SourceLine 676
                                                        {
                                                            _SIM_LABEL(6); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                            if(_VALUE((((CLASS_CHECKER2_semchecker)(_CUR._SL)).valrelList_2==(null)))) {
                                                                // JavaLine 676 <== SourceLine 677
                                                                new CLASS_CHECKER1_semchecker1_valuerel((_CUR._SL),sos.p_pred,copt,sos,tos)._START();
                                                            } else {
                                                                // JavaLine 679 <== SourceLine 678
                                                                {
                                                                    ((CLASS_CHECKER2_semchecker)(_CUR._SL)).valrelList_2.p_ch=copt;
                                                                    ;
                                                                    call(((CLASS_CHECKER2_semchecker)(_CUR._SL)).valrelList_2,678);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    case 85: 
                                    case 86: 
                                    case 45: 
                                    case 17: 
                                    case 24: 
                                    case 36: 
                                    // JavaLine 700 <== SourceLine 684
                                    {
                                        // JavaLine 702 <== SourceLine 685
                                        if(_VALUE((sos.ctype==(((char)1))))) {
                                            {
                                                // JavaLine 705 <== SourceLine 686
                                                lhb=(((CLASS_CHECKER1_semchecker1_boolconst)(sos)).ixlo_1==('B'));
                                                ;
                                                // JavaLine 708 <== SourceLine 687
                                                if(_VALUE((copt==(((lhb)?('V'):('U')))))) {
                                                    // JavaLine 710 <== SourceLine 688
                                                    ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                } else {
                                                    // JavaLine 713 <== SourceLine 689
                                                    if(_VALUE((tos.ctype==(((char)1))))) {
                                                        {
                                                            // JavaLine 716 <== SourceLine 690
                                                            rhb=(((CLASS_CHECKER1_semchecker1_boolconst)(tos)).ixlo_1==('B'));
                                                            ;
                                                            // JavaLine 719 <== SourceLine 691
                                                            if(_VALUE(((((((((copt==('-'))&&((lhb&(rhb))))||(((copt==('$'))&&((lhb|(rhb))))))||((((copt==('U'))|((copt==('V'))))&(rhb))))||(((copt==(((char)17)))&&(((lhb) == (rhb))))))||(((copt==(((char)24)))&&(((!lhb) | rhb)))))) == (lhb)))) {
                                                                // JavaLine 721 <== SourceLine 696
                                                                ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                            } else {
                                                                // JavaLine 724 <== SourceLine 697
                                                                {
                                                                    // JavaLine 726 <== SourceLine 698
                                                                    lhc=((rhb)?('C'):('B'));
                                                                    ;
                                                                    // JavaLine 729 <== SourceLine 699
                                                                    _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_CONX_0); // GOTO EVALUATED LABEL
                                                                    ;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        // JavaLine 736 <== SourceLine 701
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block685_GEN_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        } else {
                                            // JavaLine 742 <== SourceLine 703
                                            {
                                                _SIM_LABEL(7); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                                if(_VALUE(((copt==('V'))||((copt==('U')))))) {
                                                    {
                                                        // JavaLine 747 <== SourceLine 704
                                                        tos=new CLASS_CHECKER1_semchecker1_ifexp((_CUR._SL),sos.p_pred,((char)15),(((copt==('U')))?(tos):(((CLASS_CHECKER2_semchecker)(_CUR._SL)).true_const_2)),(((copt==('U')))?(((CLASS_CHECKER2_semchecker)(_CUR._SL)).false_const_2):(tos)),sos)._STM();
                                                        ;
                                                        // JavaLine 750 <== SourceLine 708
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_expinparantes((_CUR._SL),sos.p_pred,'Q',null,tos)._STM();
                                                    }
                                                } else {
                                                    // JavaLine 754 <== SourceLine 709
                                                    if(_VALUE((copt==(((char)17))))) {
                                                        {
                                                            // JavaLine 757 <== SourceLine 710
                                                            if(_VALUE((tos.type!=(((char)1))))) {
                                                                {
                                                                    // JavaLine 760 <== SourceLine 711
                                                                    new CLASS_ERRMSG_error2xx((_CUR._SL._SL),432,tos.type,((char)17));
                                                                    ;
                                                                    tos.type=((char)15);
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 767 <== SourceLine 712
                                                            if(_VALUE((sos.type!=(((char)1))))) {
                                                                {
                                                                    // JavaLine 770 <== SourceLine 713
                                                                    new CLASS_ERRMSG_error2xx((_CUR._SL._SL),431,sos.type,((char)17));
                                                                    ;
                                                                    // JavaLine 773 <== SourceLine 714
                                                                    tos.type=sos.type=((char)15);
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 778 <== SourceLine 715
                                                            _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_VALRELX_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 783 <== SourceLine 717
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_boolop((_CUR._SL),sos.p_pred,copt,sos,tos)._STM();
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    case 35: 
                                    // JavaLine 793 <== SourceLine 721
                                    {
                                        // JavaLine 795 <== SourceLine 722
                                        if(_VALUE((tos.ctype==(((char)1))))) {
                                            {
                                                // JavaLine 798 <== SourceLine 723
                                                lhc=(((((CLASS_CHECKER1_semchecker1_boolconst)(tos)).ixlo_1==('B')))?('C'):('B'));
                                                ;
                                                // JavaLine 801 <== SourceLine 724
                                                sos=tos;
                                                ;
                                                _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_Block630_Block633_CONX_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 808 <== SourceLine 726
                                        if(_VALUE((tos.type!=(((char)1))))) {
                                            {
                                                // JavaLine 811 <== SourceLine 727
                                                new CLASS_ERRMSG_error2xx((_CUR._SL._SL),432,tos.type,copt);
                                                ;
                                                // JavaLine 814 <== SourceLine 728
                                                tos.type=((char)15);
                                            }
                                        }
                                        ;
                                        // JavaLine 819 <== SourceLine 729
                                        new CLASS_CHECKER1_semchecker1_valuerel((_CUR._SL),sos,((char)17),tos,((CLASS_CHECKER2_semchecker)(_CUR._SL)).false_const_2)._START();
                                        ;
                                    }
                                    break;
                                    case 84: 
                                    // JavaLine 825 <== SourceLine 733
                                    {
                                        // JavaLine 827 <== SourceLine 734
                                        if(_VALUE((sos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 830 <== SourceLine 735
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 833 <== SourceLine 736
                                                        tos.p_pred=sos.p_pred;
                                                        ;
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                                ;
                                                // JavaLine 840 <== SourceLine 737
                                                if(_VALUE((tos.ctype==(((char)8))))) {
                                                    {
                                                        // JavaLine 843 <== SourceLine 738
                                                        if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1!=(((char)0))))) {
                                                            // JavaLine 845 <== SourceLine 739
                                                            {
                                                                // JavaLine 847 <== SourceLine 740
                                                                ((CLASS_CHECKER2)(_CUR._SL._SL)).simsymbol=CONC(new CLASS_COMMON_nameof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1,((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixlo_1)._RESULT,new CLASS_COMMON_nameof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1,((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixlo_1)._RESULT);
                                                                ;
                                                                // JavaLine 850 <== SourceLine 744
                                                                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                                                ;
                                                                // JavaLine 853 <== SourceLine 745
                                                                ((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixhi_1=((CLASS_CHECKER2)(_CUR._SL._SL)).hashhi;
                                                                ;
                                                                // JavaLine 856 <== SourceLine 746
                                                                ((CLASS_CHECKER1_semchecker1_textconst)(sos)).ixlo_1=((CLASS_CHECKER2)(_CUR._SL._SL)).hashlo;
                                                                ;
                                                                // JavaLine 859 <== SourceLine 747
                                                                ((CLASS_CHECKER1_semchecker1_textconst)(sos)).type=((char)8);
                                                                ;
                                                                // JavaLine 862 <== SourceLine 748
                                                                ((CLASS_CHECKER1_semchecker1_textconst)(sos)).id_2=null;
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 868 <== SourceLine 750
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                        ;
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 879 <== SourceLine 753
                                        if(_VALUE((tos.ctype==(((char)8))))) {
                                            {
                                                // JavaLine 882 <== SourceLine 754
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(tos)).ixhi_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 885 <== SourceLine 755
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                        ;
                                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 894 <== SourceLine 757
                                        if(_VALUE(RTS_UTIL._IS(sos,CLASS_CHECKER1_semchecker1_textconc.class))) {
                                            {
                                                // JavaLine 897 <== SourceLine 758
                                                new CLASS_CHECKER1_semchecker1_textconc_insert(((CLASS_CHECKER1_semchecker1_textconc)(sos)));
                                                ;
                                                // JavaLine 900 <== SourceLine 759
                                                ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=sos;
                                                ;
                                                _GOTO(_LABEL_CLASS_CHECKER2_semchecker_unstack_Block454_Block474_popoperator_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 907 <== SourceLine 760
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_760_4602=new CLASS_CHECKER1_semchecker1_textconc((_CUR._SL),sos.p_pred,'T')._STM();
                                            if(_inspect_760_4602!=null) { // INSPECT _inspect_760_4602  type=ref(TEXTCONC)
                                                // JavaLine 912 <== SourceLine 761
                                                {
                                                    // JavaLine 914 <== SourceLine 760
                                                    {
                                                        // JavaLine 916 <== SourceLine 761
                                                        _inspect_760_4602.first_1=_inspect_760_4602.last_1=new CLASS_CHECKER1_semchecker1_textoperand((_CUR._SL),sos)._STM();
                                                        ;
                                                        // JavaLine 919 <== SourceLine 762
                                                        _inspect_760_4602.type=((char)8);
                                                        ;
                                                        _inspect_760_4602.qual=((CLASS_CHECKER2_semchecker)(_CUR._SL)).textclass_2;
                                                        ;
                                                        _inspect_760_4602.ntext_1=1;
                                                        ;
                                                        new CLASS_CHECKER1_semchecker1_textconc_insert(_inspect_760_4602);
                                                        ;
                                                        // JavaLine 928 <== SourceLine 763
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_textconc)_inspect_760_4602);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                    }
                                    break;
                                    case 82: 
                                    // JavaLine 939 <== SourceLine 774
                                    {
                                        // JavaLine 941 <== SourceLine 775
                                        if(_VALUE((((CLASS_CHECKER2_semchecker)(_CUR._SL)).valassList_2==(null)))) {
                                            // JavaLine 943 <== SourceLine 776
                                            new CLASS_CHECKER1_semchecker1_valassign((_CUR._SL),sos.p_pred,'R',sos,tos)._START();
                                        } else {
                                            // JavaLine 946 <== SourceLine 777
                                            call(((CLASS_CHECKER2_semchecker)(_CUR._SL)).valassList_2,777);
                                        }
                                    }
                                    break;
                                    case 83: 
                                    // JavaLine 952 <== SourceLine 780
                                    {
                                        // JavaLine 954 <== SourceLine 781
                                        if(_VALUE((((CLASS_CHECKER2_semchecker)(_CUR._SL)).refassList_2==(null)))) {
                                            // JavaLine 956 <== SourceLine 782
                                            new CLASS_CHECKER1_semchecker1_refassign((_CUR._SL),sos.p_pred,'S',sos,tos)._START();
                                        } else {
                                            // JavaLine 959 <== SourceLine 783
                                            call(((CLASS_CHECKER2_semchecker)(_CUR._SL)).refassList_2,783);
                                        }
                                    }
                                    break;
                                    case 51: 
                                    // JavaLine 965 <== SourceLine 792
                                    {
                                        // JavaLine 967 <== SourceLine 793
                                        call(((CLASS_CHECKER2_semchecker)(_CUR._SL)).constantelt_3,793);
                                        ;
                                    }
                                    break;
                                    default:
                                    // JavaLine 973 <== SourceLine 826
                                    new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),826);
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 978 <== SourceLine 830
                                {
                                    _SIM_LABEL(8); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                                    // JavaLine 981 <== SourceLine 831
                                    if(_VALUE(((((CLASS_CHECKER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('S'))!=(((char)0)))&((tos!=(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)))))) {
                                        // JavaLine 983 <== SourceLine 832
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_832_4603=RTS_BASICIO.sysout();
                                            if(_inspect_832_4603!=null) { // INSPECT _inspect_832_4603  type=ref(PRINTFILE)
                                                // JavaLine 988 <== SourceLine 833
                                                {
                                                    // JavaLine 990 <== SourceLine 832
                                                    {
                                                        // JavaLine 992 <== SourceLine 833
                                                        _inspect_832_4603.outtext(new RTS_TXT(" *stack* "));
                                                        ;
                                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2.dump_0().CPF();
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                }
                                ;
                                // JavaLine 1004 <== SourceLine 834
                                if(_VALUE((((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2>(0)))) {
                                    {
                                        // JavaLine 1007 <== SourceLine 835
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).expexptop.putELEMENT(((CLASS_CHECKER2_semchecker)(_CUR._SL)).expexptop.index(((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2),null);
                                        ;
                                        ((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2=(((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2-(1));
                                        ;
                                    }
                                } else {
                                    // JavaLine 1014 <== SourceLine 836
                                    new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),836);
                                }
                                ;
                                // JavaLine 1018 <== SourceLine 837
                                copt=optstack.getELEMENT(((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2);
                                ;
                            }
                        }
                        ;
                        // JavaLine 1024 <== SourceLine 839
                        {
                            _SIM_LABEL(9); // DeclaredIn: unstack -> unstack[CLASS_CHECKER2_semchecker_unstack] DeclarationKind=Class
                            tos=sos=null;
                        }
                        ;
                        // JavaLine 1030 <== SourceLine 841
                        detach(841);
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 1037 <== SourceLine 844
                // BEGIN unstack INNER PART
                // ENDOF unstack INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","9 unstack",1,385,11,607,13,611,15,631,17,637,19,644,21,676,23,703,25,831,27,839,30,388,33,389,36,390,39,391,42,392,46,393,50,395,52,399,54,400,56,457,58,477,60,510,62,646,64,760,66,832,74,395,76,399,78,400,88,450,91,451,94,454,97,456,103,457,110,458,115,459,118,460,121,461,126,462,129,463,136,464,141,465,144,466,149,467,158,468,169,471,171,472,173,474,178,476,184,477,189,478,194,479,205,482,209,485,211,486,214,487,220,490,222,491,225,492,230,493,235,494,238,495,244,498,246,499,249,500,254,501,259,502,262,503,269,507,271,509,276,510,280,511,282,512,286,513,290,515,302,519,304,520,306,521,308,522,311,523,314,525,317,527,320,530,326,532,328,534,330,535,334,536,336,537,339,538,344,539,352,542,355,543,358,544,361,545,365,546,369,547,381,550,387,554,389,556,392,557,395,559,398,562,401,563,408,565,415,569,417,570,419,571,421,572,424,574,427,576,431,577,433,578,444,581,450,585,452,586,458,589,460,590,464,591,466,592,469,594,472,596,474,597,477,598,479,599,491,601,498,604,500,605,503,606,506,607,512,608,519,609,522,610,525,611,531,612,538,613,545,617,547,618,550,619,553,620,556,621,563,622,566,623,569,624,572,625,579,626,588,629,590,630,593,631,595,632,597,633,600,635,603,637,609,644,615,646,620,647,622,646,624,647,631,648,640,651,642,652,644,653,647,656,650,659,653,666,657,669,659,670,661,671,664,672,667,673,672,676,676,677,679,678,700,684,702,685,705,686,708,687,710,688,713,689,716,690,719,691,721,696,724,697,726,698,729,699,736,701,742,703,747,704,750,708,754,709,757,710,760,711,767,712,770,713,773,714,778,715,783,717,793,721,795,722,798,723,801,724,808,726,811,727,814,728,819,729,825,733,827,734,830,735,833,736,840,737,843,738,845,739,847,740,850,744,853,745,856,746,859,747,862,748,868,750,879,753,882,754,885,755,894,757,897,758,900,759,907,760,912,761,914,760,916,761,919,762,928,763,939,774,941,775,943,776,946,777,952,780,954,781,956,782,959,783,965,792,967,793,973,826,978,830,981,831,983,832,988,833,990,832,992,833,1004,834,1007,835,1014,836,1018,837,1024,839,1030,841,1037,844,1049,844);
} // End of Class
