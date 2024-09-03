// JavaLine 1 <== SourceLine 1432
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_forstat extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=1, firstLine=1432, lastLine=1696, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1509
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1515
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_Block1515_S0_0=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1530
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_Block1515_forelem_0=new RTS_LABEL(this,1,3,"forelem"); // Local Label #3=forelem At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1619
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1611_Block1619_exprErr_0=new RTS_LABEL(this,1,4,"exprErr"); // Local Label #4=exprErr At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1663
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0=new RTS_LABEL(this,1,5,"PARSE"); // Local Label #5=PARSE At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1672
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_Block1515_S1_0=new RTS_LABEL(this,1,6,"S1"); // Local Label #6=S1 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 1433
    public boolean enclgen_1=false;
    // JavaLine 26 <== SourceLine 1434
    public boolean commaSeen_1=false;
    // JavaLine 28 <== SourceLine 1435
    public char ftype_1=0;
    // JavaLine 30 <== SourceLine 1436
    public char forass_1=0;
    // JavaLine 32 <== SourceLine 1437
    public int oldUniq_1=0;
    // JavaLine 34 <== SourceLine 1438
    public CLASS_PARSER_codebuffer forcoder_1=null;
    // JavaLine 36 <== SourceLine 1512
    public CLASS_PARSER_codebuffer _inspect_1512_4503=null;
    // JavaLine 38 <== SourceLine 1549
    public CLASS_PARSER_codebuffer_elt _inspect_1549_4504=null;
    // JavaLine 40 <== SourceLine 1568
    public CLASS_PARSER_codebuffer_elt _inspect_1568_4505=null;
    // JavaLine 42 <== SourceLine 1592
    public CLASS_PARSER_codebuffer_elt _inspect_1592_4506=null;
    // JavaLine 44 <== SourceLine 1643
    public CLASS_PARSER_codebuffer_elt _inspect_1643_4507=null;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_forstat_recover.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_forstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_forstat _STM() {
        CLASS_PARSER_grammer_forstat _THIS=(CLASS_PARSER_grammer_forstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 60 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 62 <== SourceLine 1506
                detach(1506);
                ;
                // JavaLine 65 <== SourceLine 1507
                forcoder_1=((CLASS_PARSER_codebuffer)new CLASS_PARSER_codebuffer((_CUR._SL._SL),new RTS_TXT("$for$"))._START());
                ;
                // JavaLine 68 <== SourceLine 1508
                {
                    _SIM_LABEL(1); // DeclaredIn: forstat
                    // JavaLine 71 <== SourceLine 1509
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("FOR"));
                    }
                }
                ;
                // JavaLine 77 <== SourceLine 1512
                {
                    // BEGIN INSPECTION 
                    _inspect_1512_4503=forcoder_1;
                    if(_inspect_1512_4503!=null) { // INSPECT _inspect_1512_4503  type=ref(CODEBUFFER)
                        // JavaLine 82 <== SourceLine 1513
                        {
                            // JavaLine 84 <== SourceLine 1512
                            {
                                // JavaLine 86 <== SourceLine 1515
                                {
                                    _SIM_LABEL(2); // DeclaredIn: forstat -> forstat[CLASS_PARSER_grammer_forstat] DeclarationKind=Class
                                    caller.stmttype=((char)1);
                                }
                                ;
                                // JavaLine 92 <== SourceLine 1516
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 95 <== SourceLine 1517
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                    {
                                        // JavaLine 98 <== SourceLine 1519
                                        errorno=185;
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 105 <== SourceLine 1520
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)19);
                                ;
                                call(forcoder_1,1520);
                                ;
                                // JavaLine 110 <== SourceLine 1521
                                _inspect_1512_4503.wheeler_4=_inspect_1512_4503.curelt_4;
                                ;
                                // JavaLine 113 <== SourceLine 1522
                                if(_VALUE(((((CLASS_PARSER)(_CUR._SL._SL)).opt!=('R'))&&((((CLASS_PARSER)(_CUR._SL._SL)).opt!=('S')))))) {
                                    {
                                        // JavaLine 116 <== SourceLine 1523
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                        ;
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                        ;
                                        // JavaLine 121 <== SourceLine 1525
                                        errorno=209;
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 128 <== SourceLine 1526
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='Z';
                                ;
                                call(forcoder_1,1526);
                                ;
                                _inspect_1512_4503.cvar_4=_inspect_1512_4503.curelt_4;
                                ;
                                // JavaLine 135 <== SourceLine 1527
                                forass_1=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                ;
                                // JavaLine 138 <== SourceLine 1528
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 141 <== SourceLine 1529
                                {
                                    _SIM_LABEL(3); // DeclaredIn: forstat -> forstat[CLASS_PARSER_grammer_forstat] DeclarationKind=Class
                                    // JavaLine 144 <== SourceLine 1530
                                    new CLASS_PARSER_grammer_forstat_new_elt((_CUR),forass_1);
                                }
                                ;
                                // JavaLine 148 <== SourceLine 1531
                                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1531);
                                ;
                                // JavaLine 151 <== SourceLine 1532
                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'d');
                                ;
                                // JavaLine 154 <== SourceLine 1533
                                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                    {
                                        // JavaLine 157 <== SourceLine 1535
                                        errorno=205;
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 164 <== SourceLine 1536
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('.')))) {
                                    {
                                        ftype_1=((char)1);
                                        ;
                                        // JavaLine 169 <== SourceLine 1537
                                        _inspect_1512_4503.forvar_4=_inspect_1512_4503.curelt_4;
                                        ;
                                        // JavaLine 172 <== SourceLine 1538
                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'B');
                                        ;
                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),((char)130));
                                        ;
                                        _inspect_1512_4503.stepexpr_4=_inspect_1512_4503.curelt_4;
                                        ;
                                        // JavaLine 179 <== SourceLine 1540
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 182 <== SourceLine 1541
                                        call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1541);
                                        ;
                                        // JavaLine 185 <== SourceLine 1542
                                        if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                            {
                                                // JavaLine 188 <== SourceLine 1544
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1611_Block1619_exprErr_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 193 <== SourceLine 1545
                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('4')))) {
                                            {
                                                // JavaLine 196 <== SourceLine 1547
                                                errorno=210;
                                                ;
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 203 <== SourceLine 1549
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1549_4504=_inspect_1512_4503.stepexpr_4.next;
                                            if(_inspect_1549_4504!=null) { // INSPECT _inspect_1549_4504  type=ref(ELT)
                                                // JavaLine 208 <== SourceLine 1550
                                                {
                                                    // JavaLine 210 <== SourceLine 1549
                                                    {
                                                        // JavaLine 212 <== SourceLine 1550
                                                        if(_VALUE(((_inspect_1512_4503.curelt_4!=(((CLASS_PARSER_codebuffer_elt)_inspect_1549_4504)))||(((_inspect_1549_4504.opnn!=(((char)138)))&&((_inspect_1549_4504.opnn!=('[')))))))) {
                                                            // JavaLine 214 <== SourceLine 1552
                                                            {
                                                                // JavaLine 216 <== SourceLine 1553
                                                                ftype_1=((char)4);
                                                                ;
                                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.stepexpr_4;
                                                                ;
                                                                _inspect_1512_4503.curelt_4.next=null;
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 225 <== SourceLine 1554
                                                            _inspect_1512_4503.curelt_4=_inspect_1512_4503.stepexpr_4;
                                                        }
                                                        ;
                                                        // JavaLine 229 <== SourceLine 1555
                                                        _inspect_1512_4503.stepexpr_4=((CLASS_PARSER_codebuffer_elt)_inspect_1549_4504);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                        // JavaLine 237 <== SourceLine 1557
                                        if(_VALUE((ftype_1==(((char)4))))) {
                                            {
                                                // JavaLine 240 <== SourceLine 1558
                                                if(_VALUE((_inspect_1512_4503.deltavar_4==(null)))) {
                                                    {
                                                        // JavaLine 243 <== SourceLine 1559
                                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1==(0)))) {
                                                            {
                                                                // JavaLine 246 <== SourceLine 1560
                                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.firstelt_4;
                                                                ;
                                                                // JavaLine 249 <== SourceLine 1561
                                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'\\');
                                                                ;
                                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'o');
                                                                ;
                                                                // JavaLine 254 <== SourceLine 1562
                                                                ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                                                                ;
                                                                enclgen_1=true;
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 262 <== SourceLine 1564
                                                        _inspect_1512_4503.curelt_4=_inspect_1512_4503.firstelt_4.next;
                                                        ;
                                                        // JavaLine 265 <== SourceLine 1565
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).simsymbol=new CLASS_COMMON_leftint((_CUR._SL._SL),((CLASS_PARSER_grammer)(_CUR._SL)).uniqueindex_1)._RESULT;
                                                        ;
                                                        // JavaLine 268 <== SourceLine 1566
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).simsymbol=CONC(new RTS_TXT("$int"),((CLASS_PARSER)(_CUR._SL._SL)).simsymbol);
                                                        ;
                                                        new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                                        ;
                                                        // JavaLine 273 <== SourceLine 1567
                                                        ((CLASS_PARSER_grammer)(_CUR._SL)).uniqueindex_1=(((CLASS_PARSER_grammer)(_CUR._SL)).uniqueindex_1+(1));
                                                        ;
                                                        // JavaLine 276 <== SourceLine 1568
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_1568_4505=new CLASS_PARSER_codebuffer_elt(_inspect_1512_4503)._STM();
                                                            if(_inspect_1568_4505!=null) { // INSPECT _inspect_1568_4505  type=ref(ELT)
                                                                // JavaLine 281 <== SourceLine 1569
                                                                {
                                                                    // JavaLine 283 <== SourceLine 1568
                                                                    {
                                                                        // JavaLine 285 <== SourceLine 1569
                                                                        _inspect_1512_4503.deltavar_4=((CLASS_PARSER_codebuffer_elt)_inspect_1568_4505);
                                                                        ;
                                                                        // JavaLine 288 <== SourceLine 1570
                                                                        _inspect_1568_4505.opdhii=((CLASS_PARSER)(_CUR._SL._SL)).hashhi;
                                                                        ;
                                                                        _inspect_1568_4505.opdloo=((CLASS_PARSER)(_CUR._SL._SL)).hashlo;
                                                                        ;
                                                                        // JavaLine 293 <== SourceLine 1571
                                                                        _inspect_1568_4505.opnn='8';
                                                                        ;
                                                                        _inspect_1568_4505.optxx=((char)4);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                        ;
                                                        // JavaLine 303 <== SourceLine 1573
                                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.deltavar_4);
                                                        ;
                                                        // JavaLine 306 <== SourceLine 1574
                                                        _inspect_1512_4503.deltavar_4.opnn='Z';
                                                        ;
                                                        // JavaLine 309 <== SourceLine 1575
                                                        RTS_UTIL._ASGSTR(RTS_TXT.sub(((CLASS_PARSER)(_CUR._SL._SL)).simsymbol,2,3),"lrl");
                                                        ;
                                                        new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                                        ;
                                                        // JavaLine 314 <== SourceLine 1576
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).opdhi=((CLASS_PARSER)(_CUR._SL._SL)).hashhi;
                                                        ;
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((CLASS_PARSER)(_CUR._SL._SL)).hashlo;
                                                        ;
                                                        // JavaLine 319 <== SourceLine 1577
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='8';
                                                        ;
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).optx=((char)6);
                                                        ;
                                                        call(forcoder_1,1577);
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 329 <== SourceLine 1579
                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.forvar_4;
                                                ;
                                                // JavaLine 332 <== SourceLine 1580
                                                new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.deltavar_4);
                                                ;
                                                // JavaLine 335 <== SourceLine 1581
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='R';
                                                ;
                                                call(forcoder_1,1581);
                                                ;
                                                // JavaLine 340 <== SourceLine 1582
                                                new CLASS_PARSER_codebuffer_copyexpr(_inspect_1512_4503,_inspect_1512_4503.stepexpr_4);
                                                ;
                                                // JavaLine 343 <== SourceLine 1584
                                                new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.deltavar_4);
                                                ;
                                                _inspect_1512_4503.curelt_4.opnn='.';
                                                ;
                                                // JavaLine 348 <== SourceLine 1585
                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.curelt_4.next.next;
                                                ;
                                                // JavaLine 351 <== SourceLine 1586
                                                new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.deltavar_4);
                                                ;
                                                // JavaLine 354 <== SourceLine 1587
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'H');
                                                ;
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'P');
                                                ;
                                                // JavaLine 359 <== SourceLine 1588
                                                new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.cvar_4);
                                                ;
                                                // JavaLine 362 <== SourceLine 1589
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'G');
                                                ;
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'P');
                                                ;
                                            }
                                        } else {
                                            // JavaLine 369 <== SourceLine 1592
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_1592_4506=_inspect_1512_4503.stepexpr_4;
                                                if(_inspect_1592_4506!=null) { // INSPECT _inspect_1592_4506  type=ref(ELT) declared in Connection block at line 1512
                                                    // JavaLine 374 <== SourceLine 1593
                                                    {
                                                        // JavaLine 376 <== SourceLine 1592
                                                        {
                                                            // JavaLine 378 <== SourceLine 1593
                                                            new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.cvar_4);
                                                            ;
                                                            // JavaLine 381 <== SourceLine 1594
                                                            new CLASS_PARSER_grammer_forstat_new_elt((_CUR),(((RTS_ENVIRONMENT.loadChar(new CLASS_COMMON_nameof((_CUR._SL._SL),_inspect_1592_4506.opdhii,_inspect_1592_4506.opdloo)._RESULT,0)==('-')))?('>'):(';')));
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                        ;
                                        // JavaLine 390 <== SourceLine 1597
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 393 <== SourceLine 1598
                                        call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1598);
                                        ;
                                        // JavaLine 396 <== SourceLine 1599
                                        if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                            {
                                                // JavaLine 399 <== SourceLine 1601
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1611_Block1619_exprErr_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 404 <== SourceLine 1602
                                        if(_VALUE((ftype_1==(((char)4))))) {
                                            {
                                                // JavaLine 407 <== SourceLine 1603
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'Q');
                                                ;
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'Q');
                                                ;
                                                // JavaLine 412 <== SourceLine 1604
                                                new CLASS_PARSER_grammer_forstat_new_elt((_CUR),';');
                                                ;
                                                // JavaLine 415 <== SourceLine 1605
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)138);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdhi=((char)127);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((char)255);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).optx=((char)4);
                                                ;
                                                // JavaLine 424 <== SourceLine 1606
                                                call(forcoder_1,1606);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 430 <== SourceLine 1608
                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),((char)145));
                                        ;
                                    }
                                } else {
                                    // JavaLine 435 <== SourceLine 1611
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('8')))) {
                                        {
                                            ftype_1=((char)2);
                                            ;
                                            // JavaLine 440 <== SourceLine 1612
                                            new CLASS_PARSER_grammer_forstat_new_elt((_CUR),((char)130));
                                            ;
                                            // JavaLine 443 <== SourceLine 1613
                                            _inspect_1512_4503.forvar_4=_inspect_1512_4503.curelt_4;
                                            ;
                                            // JavaLine 446 <== SourceLine 1614
                                            _inspect_1512_4503.curelt_4=_inspect_1512_4503.wheeler_4;
                                            ;
                                            new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'B');
                                            ;
                                            _inspect_1512_4503.curelt_4=_inspect_1512_4503.forvar_4;
                                            ;
                                            // JavaLine 453 <== SourceLine 1615
                                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                            ;
                                            // JavaLine 456 <== SourceLine 1616
                                            call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1616);
                                            ;
                                            // JavaLine 459 <== SourceLine 1617
                                            if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                                {
                                                    // JavaLine 462 <== SourceLine 1619
                                                    {
                                                        _SIM_LABEL(4); // DeclaredIn: forstat -> forstat[CLASS_PARSER_grammer_forstat] DeclarationKind=Class
                                                        errorno=205;
                                                    }
                                                    ;
                                                    _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_Block1662_PARSE_0); // GOTO EVALUATED LABEL
                                                }
                                            }
                                            ;
                                            // JavaLine 472 <== SourceLine 1620
                                            new CLASS_PARSER_grammer_forstat_new_elt((_CUR),((char)145));
                                            ;
                                        }
                                    } else {
                                        // JavaLine 477 <== SourceLine 1622
                                        ftype_1=((char)3);
                                    }
                                }
                                ;
                                // JavaLine 482 <== SourceLine 1623
                                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N'))||(commaSeen_1)))) {
                                    {
                                        // JavaLine 485 <== SourceLine 1624
                                        if(_VALUE((!(commaSeen_1)))) {
                                            {
                                                commaSeen_1=true;
                                                ;
                                                // JavaLine 490 <== SourceLine 1625
                                                _inspect_1512_4503.statlabel_4=_inspect_1512_4503.curelt_4;
                                                ;
                                                // JavaLine 493 <== SourceLine 1626
                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.firstelt_4;
                                                ;
                                                // JavaLine 496 <== SourceLine 1627
                                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1==(0)))) {
                                                    {
                                                        // JavaLine 499 <== SourceLine 1628
                                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'\\');
                                                        ;
                                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),'o');
                                                        ;
                                                        // JavaLine 504 <== SourceLine 1629
                                                        ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                                                        ;
                                                        enclgen_1=true;
                                                        ;
                                                        // JavaLine 509 <== SourceLine 1630
                                                        _inspect_1512_4503.curelt_4=_inspect_1512_4503.firstelt_4.next;
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 514 <== SourceLine 1632
                                                    while((_inspect_1512_4503.curelt_4.next.opnn!=(((enclgen_1)?('o'):(((char)19)))))) {
                                                        // JavaLine 516 <== SourceLine 1635
                                                        _inspect_1512_4503.curelt_4=_inspect_1512_4503.curelt_4.next;
                                                    }
                                                }
                                                ;
                                                // JavaLine 521 <== SourceLine 1636
                                                ((CLASS_PARSER)(_CUR._SL._SL)).simsymbol=new CLASS_COMMON_leftint((_CUR._SL._SL),((CLASS_PARSER_grammer)(_CUR._SL)).fornests_1)._RESULT;
                                                ;
                                                // JavaLine 524 <== SourceLine 1637
                                                ((CLASS_PARSER)(_CUR._SL._SL)).simsymbol=CONC(new RTS_TXT("$for"),((CLASS_PARSER)(_CUR._SL._SL)).simsymbol);
                                                ;
                                                new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                                ;
                                                // JavaLine 529 <== SourceLine 1638
                                                ((CLASS_PARSER_grammer)(_CUR._SL)).fornests_1=(((CLASS_PARSER_grammer)(_CUR._SL)).fornests_1+(1));
                                                ;
                                                // JavaLine 532 <== SourceLine 1639
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='8';
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdhi=((CLASS_PARSER)(_CUR._SL._SL)).hashhi;
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((CLASS_PARSER)(_CUR._SL._SL)).hashlo;
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).optx=((char)11);
                                                ;
                                                // JavaLine 541 <== SourceLine 1640
                                                call(forcoder_1,1640);
                                                ;
                                                // JavaLine 544 <== SourceLine 1641
                                                _inspect_1512_4503.curelt_4=_inspect_1512_4503.statlabel_4;
                                                ;
                                                // JavaLine 547 <== SourceLine 1642
                                                RTS_UTIL._ASGSTR(RTS_TXT.sub(((CLASS_PARSER)(_CUR._SL._SL)).simsymbol,2,3),"stm");
                                                ;
                                                new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                                ;
                                                // JavaLine 552 <== SourceLine 1643
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_1643_4507=new CLASS_PARSER_codebuffer_elt(_inspect_1512_4503)._STM();
                                                    if(_inspect_1643_4507!=null) { // INSPECT _inspect_1643_4507  type=ref(ELT)
                                                        // JavaLine 557 <== SourceLine 1644
                                                        {
                                                            // JavaLine 559 <== SourceLine 1643
                                                            {
                                                                // JavaLine 561 <== SourceLine 1644
                                                                _inspect_1512_4503.statlabel_4=((CLASS_PARSER_codebuffer_elt)_inspect_1643_4507);
                                                                ;
                                                                // JavaLine 564 <== SourceLine 1645
                                                                _inspect_1643_4507.opdhii=((CLASS_PARSER)(_CUR._SL._SL)).hashhi;
                                                                ;
                                                                _inspect_1643_4507.opdloo=((CLASS_PARSER)(_CUR._SL._SL)).hashlo;
                                                                ;
                                                                _inspect_1643_4507.opnn='v';
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 578 <== SourceLine 1647
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.statlabel_4);
                                        ;
                                        new CLASS_PARSER_grammer_forstat_terminateForelt((_CUR));
                                        ;
                                        // JavaLine 583 <== SourceLine 1648
                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                            {
                                                // JavaLine 586 <== SourceLine 1649
                                                _inspect_1512_4503.wheeler_4=_inspect_1512_4503.curelt_4;
                                                ;
                                                // JavaLine 589 <== SourceLine 1650
                                                new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.cvar_4);
                                                ;
                                                // JavaLine 592 <== SourceLine 1651
                                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                                ;
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_forelem_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 599 <== SourceLine 1652
                                        new CLASS_PARSER_grammer_forstat_new_elt((_CUR),((char)28));
                                        ;
                                        // JavaLine 602 <== SourceLine 1653
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.statlabel_4);
                                        ;
                                        _inspect_1512_4503.curelt_4.opnn='M';
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 610 <== SourceLine 1655
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)28))))) {
                                    {
                                        // JavaLine 613 <== SourceLine 1656
                                        new CLASS_PARSER_codebuffer_terminate(_inspect_1512_4503);
                                        ;
                                        // JavaLine 616 <== SourceLine 1657
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 619 <== SourceLine 1658
                                        stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                                        ;
                                        rp=((char)1);
                                        ;
                                    }
                                } else {
                                    // JavaLine 626 <== SourceLine 1660
                                    {
                                        // JavaLine 628 <== SourceLine 1662
                                        errorno=206;
                                        ;
                                        // JavaLine 631 <== SourceLine 1663
                                        {
                                            _SIM_LABEL(5); // DeclaredIn: forstat -> forstat[CLASS_PARSER_grammer_forstat] DeclarationKind=Class
                                            _inspect_1512_4503.firstelt_4.next=null;
                                        }
                                        ;
                                        ftype_1=((char)0);
                                        ;
                                        // JavaLine 639 <== SourceLine 1664
                                        new CLASS_PARSER_codebuffer_terminate(_inspect_1512_4503);
                                        ;
                                        // JavaLine 642 <== SourceLine 1665
                                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),errorno);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 648 <== SourceLine 1668
                                ((CLASS_PARSER_grammer_forstat)(_CUR)).detach();
                                ;
                                // JavaLine 651 <== SourceLine 1670
                                if(_VALUE((rp==(((char)0))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_Block1515_S0_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 656 <== SourceLine 1671
                                {
                                    _SIM_LABEL(6); // DeclaredIn: forstat -> forstat[CLASS_PARSER_grammer_forstat] DeclarationKind=Class
                                    // JavaLine 659 <== SourceLine 1672
                                    if(_VALUE(commaSeen_1)) {
                                        {
                                            commaSeen_1=false;
                                            ;
                                            // JavaLine 664 <== SourceLine 1673
                                            ((CLASS_PARSER_grammer)(_CUR._SL)).fornests_1=(((CLASS_PARSER_grammer)(_CUR._SL)).fornests_1-(1));
                                            ;
                                            // JavaLine 667 <== SourceLine 1674
                                            _inspect_1512_4503.statlabel_4.opnn='4';
                                            ;
                                            new CLASS_PARSER_codebuffer_elt_emit(_inspect_1512_4503.statlabel_4);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 674 <== SourceLine 1676
                                        new CLASS_PARSER_grammer_forstat_terminateForelt((_CUR));
                                    }
                                }
                                ;
                                // JavaLine 679 <== SourceLine 1677
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='~';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1677);
                                ;
                                // JavaLine 684 <== SourceLine 1678
                                if(_VALUE(enclgen_1)) {
                                    {
                                        enclgen_1=false;
                                        ;
                                        // JavaLine 689 <== SourceLine 1679
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1679);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 699 <== SourceLine 1681
                                _inspect_1512_4503.statlabel_4=_inspect_1512_4503.deltavar_4=_inspect_1512_4503.forvar_4=_inspect_1512_4503.wheeler_4=_inspect_1512_4503.cvar_4=null;
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 707 <== SourceLine 1683
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack for"));
                }
                ;
                // JavaLine 712 <== SourceLine 1685
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 717 <== SourceLine 1686
                ((CLASS_PARSER_grammer)(_CUR._SL)).foList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 720 <== SourceLine 1687
                detach(1687);
                ;
                // JavaLine 723 <== SourceLine 1689
                ((CLASS_PARSER_grammer)(_CUR._SL)).foList_1=null;
                ;
                // JavaLine 726 <== SourceLine 1690
                forcoder_1.prev_4=((CLASS_PARSER)(_CUR._SL._SL)).coder;
                ;
                ((CLASS_PARSER)(_CUR._SL._SL)).coder=forcoder_1;
                ;
                // JavaLine 731 <== SourceLine 1691
                errorno=0;
                ;
                // JavaLine 734 <== SourceLine 1692
                recovered=isblocklike=false;
                ;
                // JavaLine 737 <== SourceLine 1693
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 740 <== SourceLine 1694
                _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 743 <== SourceLine 1696
                // BEGIN forstat INNER PART
                // ENDOF forstat INNER PART
                // ENDOF statement INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","9 forstat",1,1432,11,1509,13,1515,15,1530,17,1619,19,1663,21,1672,24,1433,26,1434,28,1435,30,1436,32,1437,34,1438,36,1512,38,1549,40,1568,42,1592,44,1643,60,712,62,1506,65,1507,68,1508,71,1509,77,1512,82,1513,84,1512,86,1515,92,1516,95,1517,98,1519,105,1520,110,1521,113,1522,116,1523,121,1525,128,1526,135,1527,138,1528,141,1529,144,1530,148,1531,151,1532,154,1533,157,1535,164,1536,169,1537,172,1538,179,1540,182,1541,185,1542,188,1544,193,1545,196,1547,203,1549,208,1550,210,1549,212,1550,214,1552,216,1553,225,1554,229,1555,237,1557,240,1558,243,1559,246,1560,249,1561,254,1562,262,1564,265,1565,268,1566,273,1567,276,1568,281,1569,283,1568,285,1569,288,1570,293,1571,303,1573,306,1574,309,1575,314,1576,319,1577,329,1579,332,1580,335,1581,340,1582,343,1584,348,1585,351,1586,354,1587,359,1588,362,1589,369,1592,374,1593,376,1592,378,1593,381,1594,390,1597,393,1598,396,1599,399,1601,404,1602,407,1603,412,1604,415,1605,424,1606,430,1608,435,1611,440,1612,443,1613,446,1614,453,1615,456,1616,459,1617,462,1619,472,1620,477,1622,482,1623,485,1624,490,1625,493,1626,496,1627,499,1628,504,1629,509,1630,514,1632,516,1635,521,1636,524,1637,529,1638,532,1639,541,1640,544,1641,547,1642,552,1643,557,1644,559,1643,561,1644,564,1645,578,1647,583,1648,586,1649,589,1650,592,1651,599,1652,602,1653,610,1655,613,1656,616,1657,619,1658,626,1660,628,1662,631,1663,639,1664,642,1665,648,1668,651,1670,656,1671,659,1672,664,1673,667,1674,674,1676,679,1677,684,1678,689,1679,699,1681,707,1683,712,1685,717,1686,720,1687,723,1689,726,1690,731,1691,734,1692,737,1693,740,1694,743,1696,756,1696);
} // End of Class
