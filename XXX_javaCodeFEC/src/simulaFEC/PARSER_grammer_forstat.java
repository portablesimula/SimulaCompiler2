// JavaLine 1 <== SourceLine 1431
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_forstat extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1431, lastLine=1695, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1508
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1514
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_Block1514_S0_0=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1529
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_Block1514_forelem_0=new RTS_LABEL(this,1,3,"forelem"); // Local Label #3=forelem At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1618
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_Block1514_Block1610_Block1618_exprErr_0=new RTS_LABEL(this,1,4,"exprErr"); // Local Label #4=exprErr At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1662
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0=new RTS_LABEL(this,1,5,"PARSE"); // Local Label #5=PARSE At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1671
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_Block1514_S1_0=new RTS_LABEL(this,1,6,"S1"); // Local Label #6=S1 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 24 <== SourceLine 1432
    public boolean enclgen_1=false;
    // JavaLine 26 <== SourceLine 1433
    public boolean commaSeen_1=false;
    // JavaLine 28 <== SourceLine 1434
    public char ftype_1=0;
    // JavaLine 30 <== SourceLine 1435
    public char forass_1=0;
    // JavaLine 32 <== SourceLine 1436
    public int oldUniq_1=0;
    // JavaLine 34 <== SourceLine 1437
    public PARSER_codebuffer forcoder_1=null;
    // JavaLine 36 <== SourceLine 1511
    public PARSER_codebuffer _inspect_1511_4503_1=null;
    // JavaLine 38 <== SourceLine 1548
    public PARSER_codebuffer_elt _inspect_1548_4504_1=null;
    // JavaLine 40 <== SourceLine 1567
    public PARSER_codebuffer_elt _inspect_1567_4505_1=null;
    // JavaLine 42 <== SourceLine 1591
    public PARSER_codebuffer_elt _inspect_1591_4506_1=null;
    // JavaLine 44 <== SourceLine 1642
    public PARSER_codebuffer_elt _inspect_1642_4507_1=null;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_forstat_recover.class)); }
    // Normal Constructor
    public PARSER_grammer_forstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_forstat _STM() {
        PARSER_grammer_forstat _THIS=(PARSER_grammer_forstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 60 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 62 <== SourceLine 1505
                detach(1505);
                ;
                // JavaLine 65 <== SourceLine 1506
                forcoder_1=((PARSER_codebuffer)new PARSER_codebuffer((_CUR._SL._SL),new RTS_TXT("$for$"))._START());
                ;
                // JavaLine 68 <== SourceLine 1507
                {
                    _SIM_LABEL(1); // DeclaredIn: forstat
                    // JavaLine 71 <== SourceLine 1508
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("FOR"));
                    }
                }
                ;
                // JavaLine 77 <== SourceLine 1511
                {
                    // BEGIN INSPECTION 
                    _inspect_1511_4503_1=forcoder_1;
                    if(_inspect_1511_4503_1!=null) { // INSPECT _inspect_1511_4503_1
                        // JavaLine 82 <== SourceLine 1512
                        {
                            // JavaLine 84 <== SourceLine 1511
                            {
                                // JavaLine 86 <== SourceLine 1514
                                {
                                    _SIM_LABEL(2); // DeclaredIn: forstat -> forstat[PARSER_grammer_forstat] DeclarationKind=Class
                                    caller.stmttype=((char)1);
                                }
                                ;
                                // JavaLine 92 <== SourceLine 1515
                                ((PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 95 <== SourceLine 1516
                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                    {
                                        // JavaLine 98 <== SourceLine 1518
                                        errorno=185;
                                        ;
                                        _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 105 <== SourceLine 1519
                                ((PARSER)(_CUR._SL._SL)).opn=((char)19);
                                ;
                                call(forcoder_1,1519);
                                ;
                                // JavaLine 110 <== SourceLine 1520
                                _inspect_1511_4503_1.wheeler_4=_inspect_1511_4503_1.curelt_4;
                                ;
                                // JavaLine 113 <== SourceLine 1521
                                if(_VALUE(((((PARSER)(_CUR._SL._SL)).opt!=('R'))&&((((PARSER)(_CUR._SL._SL)).opt!=('S')))))) {
                                    {
                                        // JavaLine 116 <== SourceLine 1522
                                        ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                        ;
                                        ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                        ;
                                        // JavaLine 121 <== SourceLine 1524
                                        errorno=209;
                                        ;
                                        _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 128 <== SourceLine 1525
                                ((PARSER)(_CUR._SL._SL)).opn='Z';
                                ;
                                call(forcoder_1,1525);
                                ;
                                _inspect_1511_4503_1.cvar_4=_inspect_1511_4503_1.curelt_4;
                                ;
                                // JavaLine 135 <== SourceLine 1526
                                forass_1=((PARSER)(_CUR._SL._SL)).opt;
                                ;
                                // JavaLine 138 <== SourceLine 1527
                                ((PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 141 <== SourceLine 1528
                                {
                                    _SIM_LABEL(3); // DeclaredIn: forstat -> forstat[PARSER_grammer_forstat] DeclarationKind=Class
                                    // JavaLine 144 <== SourceLine 1529
                                    new PARSER_grammer_forstat_new_elt((_CUR),forass_1);
                                }
                                ;
                                // JavaLine 148 <== SourceLine 1530
                                call(((PARSER_grammer)(_CUR._SL)).ex_1,1530);
                                ;
                                // JavaLine 151 <== SourceLine 1531
                                new PARSER_grammer_forstat_new_elt((_CUR),'d');
                                ;
                                // JavaLine 154 <== SourceLine 1532
                                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                    {
                                        // JavaLine 157 <== SourceLine 1534
                                        errorno=205;
                                        ;
                                        _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 164 <== SourceLine 1535
                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('.')))) {
                                    {
                                        ftype_1=((char)1);
                                        ;
                                        // JavaLine 169 <== SourceLine 1536
                                        _inspect_1511_4503_1.forvar_4=_inspect_1511_4503_1.curelt_4;
                                        ;
                                        // JavaLine 172 <== SourceLine 1537
                                        new PARSER_grammer_forstat_new_elt((_CUR),'B');
                                        ;
                                        new PARSER_grammer_forstat_new_elt((_CUR),((char)130));
                                        ;
                                        _inspect_1511_4503_1.stepexpr_4=_inspect_1511_4503_1.curelt_4;
                                        ;
                                        // JavaLine 179 <== SourceLine 1539
                                        ((PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 182 <== SourceLine 1540
                                        call(((PARSER_grammer)(_CUR._SL)).ex_1,1540);
                                        ;
                                        // JavaLine 185 <== SourceLine 1541
                                        if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                            {
                                                // JavaLine 188 <== SourceLine 1543
                                                _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1610_Block1618_exprErr_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 193 <== SourceLine 1544
                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('4')))) {
                                            {
                                                // JavaLine 196 <== SourceLine 1546
                                                errorno=210;
                                                ;
                                                _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 203 <== SourceLine 1548
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1548_4504_1=_inspect_1511_4503_1.stepexpr_4.next;
                                            if(_inspect_1548_4504_1!=null) { // INSPECT _inspect_1548_4504_1
                                                // JavaLine 208 <== SourceLine 1549
                                                {
                                                    // JavaLine 210 <== SourceLine 1548
                                                    {
                                                        // JavaLine 212 <== SourceLine 1549
                                                        if(_VALUE(((_inspect_1511_4503_1.curelt_4!=(((PARSER_codebuffer_elt)_inspect_1548_4504_1)))||(((_inspect_1548_4504_1.opnn!=(((char)138)))&&((_inspect_1548_4504_1.opnn!=('[')))))))) {
                                                            // JavaLine 214 <== SourceLine 1551
                                                            {
                                                                // JavaLine 216 <== SourceLine 1552
                                                                ftype_1=((char)4);
                                                                ;
                                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.stepexpr_4;
                                                                ;
                                                                _inspect_1511_4503_1.curelt_4.next=null;
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 225 <== SourceLine 1553
                                                            _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.stepexpr_4;
                                                        }
                                                        ;
                                                        // JavaLine 229 <== SourceLine 1554
                                                        _inspect_1511_4503_1.stepexpr_4=((PARSER_codebuffer_elt)_inspect_1548_4504_1);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                        // JavaLine 237 <== SourceLine 1556
                                        if(_VALUE((ftype_1==(((char)4))))) {
                                            {
                                                // JavaLine 240 <== SourceLine 1557
                                                if(_VALUE((_inspect_1511_4503_1.deltavar_4==(null)))) {
                                                    {
                                                        // JavaLine 243 <== SourceLine 1558
                                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).blockfound_1==(0)))) {
                                                            {
                                                                // JavaLine 246 <== SourceLine 1559
                                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.firstelt_4;
                                                                ;
                                                                // JavaLine 249 <== SourceLine 1560
                                                                new PARSER_grammer_forstat_new_elt((_CUR),'\\');
                                                                ;
                                                                new PARSER_grammer_forstat_new_elt((_CUR),'o');
                                                                ;
                                                                // JavaLine 254 <== SourceLine 1561
                                                                ((PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                                                                ;
                                                                enclgen_1=true;
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 262 <== SourceLine 1563
                                                        _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.firstelt_4.next;
                                                        ;
                                                        // JavaLine 265 <== SourceLine 1564
                                                        ((PARSER)(_CUR._SL._SL)).simsymbol=new COMMON_leftint((_CUR._SL._SL),((PARSER_grammer)(_CUR._SL)).uniqueindex_1)._RESULT;
                                                        ;
                                                        // JavaLine 268 <== SourceLine 1565
                                                        ((PARSER)(_CUR._SL._SL)).simsymbol=CONC(new RTS_TXT("$int"),((PARSER)(_CUR._SL._SL)).simsymbol);
                                                        ;
                                                        new COMMON_DEFIDENT((_CUR._SL._SL));
                                                        ;
                                                        // JavaLine 273 <== SourceLine 1566
                                                        ((PARSER_grammer)(_CUR._SL)).uniqueindex_1=(((PARSER_grammer)(_CUR._SL)).uniqueindex_1+(1));
                                                        ;
                                                        // JavaLine 276 <== SourceLine 1567
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_1567_4505_1=new PARSER_codebuffer_elt(_inspect_1511_4503_1)._STM();
                                                            if(_inspect_1567_4505_1!=null) { // INSPECT _inspect_1567_4505_1
                                                                // JavaLine 281 <== SourceLine 1568
                                                                {
                                                                    // JavaLine 283 <== SourceLine 1567
                                                                    {
                                                                        // JavaLine 285 <== SourceLine 1568
                                                                        _inspect_1511_4503_1.deltavar_4=((PARSER_codebuffer_elt)_inspect_1567_4505_1);
                                                                        ;
                                                                        // JavaLine 288 <== SourceLine 1569
                                                                        _inspect_1567_4505_1.opdhii=((PARSER)(_CUR._SL._SL)).hashhi;
                                                                        ;
                                                                        _inspect_1567_4505_1.opdloo=((PARSER)(_CUR._SL._SL)).hashlo;
                                                                        ;
                                                                        // JavaLine 293 <== SourceLine 1570
                                                                        _inspect_1567_4505_1.opnn='8';
                                                                        ;
                                                                        _inspect_1567_4505_1.optxx=((char)4);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                        ;
                                                        // JavaLine 303 <== SourceLine 1572
                                                        new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.deltavar_4);
                                                        ;
                                                        // JavaLine 306 <== SourceLine 1573
                                                        _inspect_1511_4503_1.deltavar_4.opnn='Z';
                                                        ;
                                                        // JavaLine 309 <== SourceLine 1574
                                                        _ASGSTR(RTS_TXT.sub(((PARSER)(_CUR._SL._SL)).simsymbol,2,3),"lrl");
                                                        ;
                                                        new COMMON_DEFIDENT((_CUR._SL._SL));
                                                        ;
                                                        // JavaLine 314 <== SourceLine 1575
                                                        ((PARSER)(_CUR._SL._SL)).opdhi=((PARSER)(_CUR._SL._SL)).hashhi;
                                                        ;
                                                        ((PARSER)(_CUR._SL._SL)).opdlo=((PARSER)(_CUR._SL._SL)).hashlo;
                                                        ;
                                                        // JavaLine 319 <== SourceLine 1576
                                                        ((PARSER)(_CUR._SL._SL)).opn='8';
                                                        ;
                                                        ((PARSER)(_CUR._SL._SL)).optx=((char)6);
                                                        ;
                                                        call(forcoder_1,1576);
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 329 <== SourceLine 1578
                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.forvar_4;
                                                ;
                                                // JavaLine 332 <== SourceLine 1579
                                                new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.deltavar_4);
                                                ;
                                                // JavaLine 335 <== SourceLine 1580
                                                ((PARSER)(_CUR._SL._SL)).opn='R';
                                                ;
                                                call(forcoder_1,1580);
                                                ;
                                                // JavaLine 340 <== SourceLine 1581
                                                new PARSER_codebuffer_copyexpr(_inspect_1511_4503_1,_inspect_1511_4503_1.stepexpr_4);
                                                ;
                                                // JavaLine 343 <== SourceLine 1583
                                                new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.deltavar_4);
                                                ;
                                                _inspect_1511_4503_1.curelt_4.opnn='.';
                                                ;
                                                // JavaLine 348 <== SourceLine 1584
                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.curelt_4.next.next;
                                                ;
                                                // JavaLine 351 <== SourceLine 1585
                                                new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.deltavar_4);
                                                ;
                                                // JavaLine 354 <== SourceLine 1586
                                                new PARSER_grammer_forstat_new_elt((_CUR),'H');
                                                ;
                                                new PARSER_grammer_forstat_new_elt((_CUR),'P');
                                                ;
                                                // JavaLine 359 <== SourceLine 1587
                                                new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.cvar_4);
                                                ;
                                                // JavaLine 362 <== SourceLine 1588
                                                new PARSER_grammer_forstat_new_elt((_CUR),'G');
                                                ;
                                                new PARSER_grammer_forstat_new_elt((_CUR),'P');
                                                ;
                                            }
                                        } else {
                                            // JavaLine 369 <== SourceLine 1591
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_1591_4506_1=_inspect_1511_4503_1.stepexpr_4;
                                                if(_inspect_1591_4506_1!=null) { // INSPECT _inspect_1591_4506_1
                                                    // JavaLine 374 <== SourceLine 1592
                                                    {
                                                        // JavaLine 376 <== SourceLine 1591
                                                        {
                                                            // JavaLine 378 <== SourceLine 1592
                                                            new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.cvar_4);
                                                            ;
                                                            // JavaLine 381 <== SourceLine 1593
                                                            new PARSER_grammer_forstat_new_elt((_CUR),(((RTS_ENVIRONMENT.loadChar(new COMMON_nameof((_CUR._SL._SL),_inspect_1591_4506_1.opdhii,_inspect_1591_4506_1.opdloo)._RESULT,0)==('-')))?('>'):(';')));
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                        ;
                                        // JavaLine 390 <== SourceLine 1596
                                        ((PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 393 <== SourceLine 1597
                                        call(((PARSER_grammer)(_CUR._SL)).ex_1,1597);
                                        ;
                                        // JavaLine 396 <== SourceLine 1598
                                        if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                            {
                                                // JavaLine 399 <== SourceLine 1600
                                                _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1610_Block1618_exprErr_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 404 <== SourceLine 1601
                                        if(_VALUE((ftype_1==(((char)4))))) {
                                            {
                                                // JavaLine 407 <== SourceLine 1602
                                                new PARSER_grammer_forstat_new_elt((_CUR),'Q');
                                                ;
                                                new PARSER_grammer_forstat_new_elt((_CUR),'Q');
                                                ;
                                                // JavaLine 412 <== SourceLine 1603
                                                new PARSER_grammer_forstat_new_elt((_CUR),';');
                                                ;
                                                // JavaLine 415 <== SourceLine 1604
                                                ((PARSER)(_CUR._SL._SL)).opn=((char)138);
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).opdhi=((char)127);
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).opdlo=((char)255);
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).optx=((char)4);
                                                ;
                                                // JavaLine 424 <== SourceLine 1605
                                                call(forcoder_1,1605);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 430 <== SourceLine 1607
                                        new PARSER_grammer_forstat_new_elt((_CUR),((char)145));
                                        ;
                                    }
                                } else {
                                    // JavaLine 435 <== SourceLine 1610
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('8')))) {
                                        {
                                            ftype_1=((char)2);
                                            ;
                                            // JavaLine 440 <== SourceLine 1611
                                            new PARSER_grammer_forstat_new_elt((_CUR),((char)130));
                                            ;
                                            // JavaLine 443 <== SourceLine 1612
                                            _inspect_1511_4503_1.forvar_4=_inspect_1511_4503_1.curelt_4;
                                            ;
                                            // JavaLine 446 <== SourceLine 1613
                                            _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.wheeler_4;
                                            ;
                                            new PARSER_grammer_forstat_new_elt((_CUR),'B');
                                            ;
                                            _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.forvar_4;
                                            ;
                                            // JavaLine 453 <== SourceLine 1614
                                            ((PARSER_grammer)(_CUR._SL)).detach();
                                            ;
                                            // JavaLine 456 <== SourceLine 1615
                                            call(((PARSER_grammer)(_CUR._SL)).ex_1,1615);
                                            ;
                                            // JavaLine 459 <== SourceLine 1616
                                            if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                                                {
                                                    // JavaLine 462 <== SourceLine 1618
                                                    {
                                                        _SIM_LABEL(4); // DeclaredIn: forstat -> forstat[PARSER_grammer_forstat] DeclarationKind=Class
                                                        errorno=205;
                                                    }
                                                    ;
                                                    _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_Block1661_PARSE_0); // GOTO EVALUATED LABEL
                                                }
                                            }
                                            ;
                                            // JavaLine 472 <== SourceLine 1619
                                            new PARSER_grammer_forstat_new_elt((_CUR),((char)145));
                                            ;
                                        }
                                    } else {
                                        // JavaLine 477 <== SourceLine 1621
                                        ftype_1=((char)3);
                                    }
                                }
                                ;
                                // JavaLine 482 <== SourceLine 1622
                                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==('N'))||(commaSeen_1)))) {
                                    {
                                        // JavaLine 485 <== SourceLine 1623
                                        if(_VALUE((!(commaSeen_1)))) {
                                            {
                                                commaSeen_1=true;
                                                ;
                                                // JavaLine 490 <== SourceLine 1624
                                                _inspect_1511_4503_1.statlabel_4=_inspect_1511_4503_1.curelt_4;
                                                ;
                                                // JavaLine 493 <== SourceLine 1625
                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.firstelt_4;
                                                ;
                                                // JavaLine 496 <== SourceLine 1626
                                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).blockfound_1==(0)))) {
                                                    {
                                                        // JavaLine 499 <== SourceLine 1627
                                                        new PARSER_grammer_forstat_new_elt((_CUR),'\\');
                                                        ;
                                                        new PARSER_grammer_forstat_new_elt((_CUR),'o');
                                                        ;
                                                        // JavaLine 504 <== SourceLine 1628
                                                        ((PARSER_grammer)(_CUR._SL)).blockfound_1=1;
                                                        ;
                                                        enclgen_1=true;
                                                        ;
                                                        // JavaLine 509 <== SourceLine 1629
                                                        _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.firstelt_4.next;
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 514 <== SourceLine 1631
                                                    while((_inspect_1511_4503_1.curelt_4.next.opnn!=(((enclgen_1)?('o'):(((char)19)))))) {
                                                        // JavaLine 516 <== SourceLine 1634
                                                        _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.curelt_4.next;
                                                    }
                                                }
                                                ;
                                                // JavaLine 521 <== SourceLine 1635
                                                ((PARSER)(_CUR._SL._SL)).simsymbol=new COMMON_leftint((_CUR._SL._SL),((PARSER_grammer)(_CUR._SL)).fornests_1)._RESULT;
                                                ;
                                                // JavaLine 524 <== SourceLine 1636
                                                ((PARSER)(_CUR._SL._SL)).simsymbol=CONC(new RTS_TXT("$for"),((PARSER)(_CUR._SL._SL)).simsymbol);
                                                ;
                                                new COMMON_DEFIDENT((_CUR._SL._SL));
                                                ;
                                                // JavaLine 529 <== SourceLine 1637
                                                ((PARSER_grammer)(_CUR._SL)).fornests_1=(((PARSER_grammer)(_CUR._SL)).fornests_1+(1));
                                                ;
                                                // JavaLine 532 <== SourceLine 1638
                                                ((PARSER)(_CUR._SL._SL)).opn='8';
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).opdhi=((PARSER)(_CUR._SL._SL)).hashhi;
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).opdlo=((PARSER)(_CUR._SL._SL)).hashlo;
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).optx=((char)11);
                                                ;
                                                // JavaLine 541 <== SourceLine 1639
                                                call(forcoder_1,1639);
                                                ;
                                                // JavaLine 544 <== SourceLine 1640
                                                _inspect_1511_4503_1.curelt_4=_inspect_1511_4503_1.statlabel_4;
                                                ;
                                                // JavaLine 547 <== SourceLine 1641
                                                _ASGSTR(RTS_TXT.sub(((PARSER)(_CUR._SL._SL)).simsymbol,2,3),"stm");
                                                ;
                                                new COMMON_DEFIDENT((_CUR._SL._SL));
                                                ;
                                                // JavaLine 552 <== SourceLine 1642
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_1642_4507_1=new PARSER_codebuffer_elt(_inspect_1511_4503_1)._STM();
                                                    if(_inspect_1642_4507_1!=null) { // INSPECT _inspect_1642_4507_1
                                                        // JavaLine 557 <== SourceLine 1643
                                                        {
                                                            // JavaLine 559 <== SourceLine 1642
                                                            {
                                                                // JavaLine 561 <== SourceLine 1643
                                                                _inspect_1511_4503_1.statlabel_4=((PARSER_codebuffer_elt)_inspect_1642_4507_1);
                                                                ;
                                                                // JavaLine 564 <== SourceLine 1644
                                                                _inspect_1642_4507_1.opdhii=((PARSER)(_CUR._SL._SL)).hashhi;
                                                                ;
                                                                _inspect_1642_4507_1.opdloo=((PARSER)(_CUR._SL._SL)).hashlo;
                                                                ;
                                                                _inspect_1642_4507_1.opnn='v';
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 578 <== SourceLine 1646
                                        new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.statlabel_4);
                                        ;
                                        new PARSER_grammer_forstat_terminateForelt((_CUR));
                                        ;
                                        // JavaLine 583 <== SourceLine 1647
                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('N')))) {
                                            {
                                                // JavaLine 586 <== SourceLine 1648
                                                _inspect_1511_4503_1.wheeler_4=_inspect_1511_4503_1.curelt_4;
                                                ;
                                                // JavaLine 589 <== SourceLine 1649
                                                new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.cvar_4);
                                                ;
                                                // JavaLine 592 <== SourceLine 1650
                                                ((PARSER_grammer)(_CUR._SL)).detach();
                                                ;
                                                _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_forelem_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 599 <== SourceLine 1651
                                        new PARSER_grammer_forstat_new_elt((_CUR),((char)28));
                                        ;
                                        // JavaLine 602 <== SourceLine 1652
                                        new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.statlabel_4);
                                        ;
                                        _inspect_1511_4503_1.curelt_4.opnn='M';
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 610 <== SourceLine 1654
                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)28))))) {
                                    {
                                        // JavaLine 613 <== SourceLine 1655
                                        new PARSER_codebuffer_terminate(_inspect_1511_4503_1);
                                        ;
                                        // JavaLine 616 <== SourceLine 1656
                                        ((PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 619 <== SourceLine 1657
                                        stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                                        ;
                                        rp=((char)1);
                                        ;
                                    }
                                } else {
                                    // JavaLine 626 <== SourceLine 1659
                                    {
                                        // JavaLine 628 <== SourceLine 1661
                                        errorno=206;
                                        ;
                                        // JavaLine 631 <== SourceLine 1662
                                        {
                                            _SIM_LABEL(5); // DeclaredIn: forstat -> forstat[PARSER_grammer_forstat] DeclarationKind=Class
                                            _inspect_1511_4503_1.firstelt_4.next=null;
                                        }
                                        ;
                                        ftype_1=((char)0);
                                        ;
                                        // JavaLine 639 <== SourceLine 1663
                                        new PARSER_codebuffer_terminate(_inspect_1511_4503_1);
                                        ;
                                        // JavaLine 642 <== SourceLine 1664
                                        new PARSER_grammer_syntaxerror((_CUR._SL),errorno);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 648 <== SourceLine 1667
                                ((PARSER_grammer_forstat)(_CUR)).detach();
                                ;
                                // JavaLine 651 <== SourceLine 1669
                                if(_VALUE((rp==(((char)0))))) {
                                    _GOTO(_LABEL_PARSER_grammer_forstat_Block1514_S0_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 656 <== SourceLine 1670
                                {
                                    _SIM_LABEL(6); // DeclaredIn: forstat -> forstat[PARSER_grammer_forstat] DeclarationKind=Class
                                    // JavaLine 659 <== SourceLine 1671
                                    if(_VALUE(commaSeen_1)) {
                                        {
                                            commaSeen_1=false;
                                            ;
                                            // JavaLine 664 <== SourceLine 1672
                                            ((PARSER_grammer)(_CUR._SL)).fornests_1=(((PARSER_grammer)(_CUR._SL)).fornests_1-(1));
                                            ;
                                            // JavaLine 667 <== SourceLine 1673
                                            _inspect_1511_4503_1.statlabel_4.opnn='4';
                                            ;
                                            new PARSER_codebuffer_elt_emit(_inspect_1511_4503_1.statlabel_4);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 674 <== SourceLine 1675
                                        new PARSER_grammer_forstat_terminateForelt((_CUR));
                                    }
                                }
                                ;
                                // JavaLine 679 <== SourceLine 1676
                                ((PARSER)(_CUR._SL._SL)).opn='~';
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,1676);
                                ;
                                // JavaLine 684 <== SourceLine 1677
                                if(_VALUE(enclgen_1)) {
                                    {
                                        enclgen_1=false;
                                        ;
                                        // JavaLine 689 <== SourceLine 1678
                                        ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                                        ;
                                        ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                                        ;
                                        call(((PARSER)(_CUR._SL._SL)).coder,1678);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 699 <== SourceLine 1680
                                _inspect_1511_4503_1.statlabel_4=_inspect_1511_4503_1.deltavar_4=_inspect_1511_4503_1.forvar_4=_inspect_1511_4503_1.wheeler_4=_inspect_1511_4503_1.cvar_4=null;
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 707 <== SourceLine 1682
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack for"));
                }
                ;
                // JavaLine 712 <== SourceLine 1684
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 717 <== SourceLine 1685
                ((PARSER_grammer)(_CUR._SL)).foList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 720 <== SourceLine 1686
                detach(1686);
                ;
                // JavaLine 723 <== SourceLine 1688
                ((PARSER_grammer)(_CUR._SL)).foList_1=null;
                ;
                // JavaLine 726 <== SourceLine 1689
                forcoder_1.prev_4=((PARSER)(_CUR._SL._SL)).coder;
                ;
                ((PARSER)(_CUR._SL._SL)).coder=forcoder_1;
                ;
                // JavaLine 731 <== SourceLine 1690
                errorno=0;
                ;
                // JavaLine 734 <== SourceLine 1691
                recovered=isblocklike=false;
                ;
                // JavaLine 737 <== SourceLine 1692
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 740 <== SourceLine 1693
                _GOTO(_LABEL_PARSER_grammer_forstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 743 <== SourceLine 1695
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 forstat",1,1431,11,1508,13,1514,15,1529,17,1618,19,1662,21,1671,24,1432,26,1433,28,1434,30,1435,32,1436,34,1437,36,1511,38,1548,40,1567,42,1591,44,1642,60,711,62,1505,65,1506,68,1507,71,1508,77,1511,82,1512,84,1511,86,1514,92,1515,95,1516,98,1518,105,1519,110,1520,113,1521,116,1522,121,1524,128,1525,135,1526,138,1527,141,1528,144,1529,148,1530,151,1531,154,1532,157,1534,164,1535,169,1536,172,1537,179,1539,182,1540,185,1541,188,1543,193,1544,196,1546,203,1548,208,1549,210,1548,212,1549,214,1551,216,1552,225,1553,229,1554,237,1556,240,1557,243,1558,246,1559,249,1560,254,1561,262,1563,265,1564,268,1565,273,1566,276,1567,281,1568,283,1567,285,1568,288,1569,293,1570,303,1572,306,1573,309,1574,314,1575,319,1576,329,1578,332,1579,335,1580,340,1581,343,1583,348,1584,351,1585,354,1586,359,1587,362,1588,369,1591,374,1592,376,1591,378,1592,381,1593,390,1596,393,1597,396,1598,399,1600,404,1601,407,1602,412,1603,415,1604,424,1605,430,1607,435,1610,440,1611,443,1612,446,1613,453,1614,456,1615,459,1616,462,1618,472,1619,477,1621,482,1622,485,1623,490,1624,493,1625,496,1626,499,1627,504,1628,509,1629,514,1631,516,1634,521,1635,524,1636,529,1637,532,1638,541,1639,544,1640,547,1641,552,1642,557,1643,559,1642,561,1643,564,1644,578,1646,583,1647,586,1648,589,1649,592,1650,599,1651,602,1652,610,1654,613,1655,616,1656,619,1657,626,1659,628,1661,631,1662,639,1663,642,1664,648,1667,651,1669,656,1670,659,1671,664,1672,667,1673,674,1675,679,1676,684,1677,689,1678,699,1680,707,1682,712,1684,717,1685,720,1686,723,1688,726,1689,731,1690,734,1691,737,1692,740,1693,743,1695,756,1695);
} // End of Class
