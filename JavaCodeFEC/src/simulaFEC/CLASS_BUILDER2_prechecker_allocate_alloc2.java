// JavaLine 1 <== SourceLine 1290
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_alloc2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1290, lastLine=1654, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1504
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_Block1469_Block1493_Block1502_NXTVA_0=new RTS_LABEL(this,0,1,"NXTVA"); // Local Label #1=NXTVA At PrefixLevel 0
    // JavaLine 13 <== SourceLine 1600
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_EXBIND_0=new RTS_LABEL(this,0,2,"EXBIND"); // Local Label #2=EXBIND At PrefixLevel 0
    // JavaLine 15 <== SourceLine 1638
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_Block1635_Block1636_CH_0=new RTS_LABEL(this,0,3,"CH"); // Local Label #3=CH At PrefixLevel 0
    // JavaLine 17 <== SourceLine 1651
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_LBL_0=new RTS_LABEL(this,0,4,"LBL"); // Local Label #4=LBL At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 20 <== SourceLine 1297
    public CLASS_COMMON_quantity Q=null;
    public CLASS_COMMON_quantity QX=null;
    public CLASS_COMMON_quantity VA=null;
    public CLASS_COMMON_quantity VB=null;
    public CLASS_COMMON_quantity VC=null;
    public CLASS_COMMON_brecord B=null;
    public CLASS_COMMON_idpack fvis=null;
    // JavaLine 28 <== SourceLine 1298
    public int VNO=0;
    // JavaLine 30 <== SourceLine 1547
    public CLASS_COMMON_quantity _inspect_1547_4548=null;
    // JavaLine 32 <== SourceLine 1561
    public CLASS_COMMON_brecord _inspect_1561_4549=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(CLASS_COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_prechecker_allocate_alloc2(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_alloc2(RTS_RTObject _SL,CLASS_COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2 _STM() {
        CLASS_BUILDER2_prechecker_allocate_alloc2 _THIS=(CLASS_BUILDER2_prechecker_allocate_alloc2)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,4); // For ByteCode Engineering
                // JavaLine 66 <== SourceLine 1428
                if(_VALUE(((p_brc.kind==(((char)5)))||((p_brc.kind==(((char)7))))))) {
                    {
                        // JavaLine 69 <== SourceLine 1429
                        p_brc.declquant.match_1=((CLASS_BUILDER2)(_CUR._SL._SL._SL)).alloc2called;
                        ;
                        // JavaLine 72 <== SourceLine 1430
                        if(_VALUE((p_brc.declquant.plev_1>(1)))) {
                            {
                                // JavaLine 75 <== SourceLine 1431
                                B=p_brc.declquant.prefqual_1.descr_1;
                                ;
                                // JavaLine 78 <== SourceLine 1432
                                if(_VALUE((B.declquant.match_1!=(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).alloc2called)))) {
                                    new CLASS_BUILDER2_prechecker_allocate_alloc2((_CUR._SL),B);
                                }
                                ;
                                // JavaLine 83 <== SourceLine 1433
                                p_brc.localclasses=(p_brc.localclasses|(B.localclasses));
                                ;
                                // JavaLine 86 <== SourceLine 1434
                                new CLASS_COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1434,CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("NPAR+PREFIX: "),p_brc.declquant.symb_1.symbol),new RTS_TXT(".npar=")),RTS_ENVIRONMENT.edit(p_brc.npar)),new RTS_TXT(", ")),B.declquant.symb_1.symbol),new RTS_TXT(".npar=")),RTS_ENVIRONMENT.edit(B.npar)));
                                ;
                                // JavaLine 89 <== SourceLine 1435
                                p_brc.npar=(p_brc.npar+(B.npar));
                                ;
                            }
                        } else {
                            // JavaLine 94 <== SourceLine 1437
                            {
                                // JavaLine 96 <== SourceLine 1438
                                Q=new CLASS_COMMON_quantity((_CUR._SL._SL._SL))._STM();
                                ;
                                // JavaLine 99 <== SourceLine 1439
                                new CLASS_BUILDER1_precheck0_makeequalto((_CUR._SL._SL),p_brc.declquant,Q);
                                ;
                                // JavaLine 102 <== SourceLine 1441
                                Q.plev_1=0;
                                ;
                                // JavaLine 105 <== SourceLine 1442
                                p_brc.declquant.prefqual_1=Q;
                                ;
                                // JavaLine 108 <== SourceLine 1443
                                B=new CLASS_COMMON_brecord((_CUR._SL._SL._SL))._STM();
                                ;
                                // JavaLine 111 <== SourceLine 1444
                                Q.descr_1=B;
                                ;
                                B.declquant=Q;
                                ;
                                B.kind=p_brc.kind;
                                ;
                                // JavaLine 118 <== SourceLine 1445
                                B.blnohi=((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).lastblhi;
                                ;
                                B.blnolo=((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).lastbllo;
                                ;
                                // JavaLine 123 <== SourceLine 1446
                                B.blev=p_brc.blev;
                                ;
                                B.rtblev=p_brc.rtblev;
                                ;
                                // JavaLine 128 <== SourceLine 1447
                                B.hasCode=p_brc.declquant.descr_1.hasCode;
                                ;
                                // JavaLine 131 <== SourceLine 1449
                                if(_VALUE((((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant!=(null)))) {
                                    {
                                        // JavaLine 134 <== SourceLine 1450
                                        if(_VALUE((p_brc.kind==(((char)5))))) {
                                            {
                                                // JavaLine 137 <== SourceLine 1451
                                                QX=new CLASS_COMMON_extquantity((_CUR._SL._SL._SL),null)._STM();
                                                ;
                                                // JavaLine 140 <== SourceLine 1452
                                                new CLASS_BUILDER1_precheck0_makeequalto((_CUR._SL._SL),((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant,QX);
                                                ;
                                                // JavaLine 143 <== SourceLine 1453
                                                QX.plev_1=0;
                                                ;
                                                // JavaLine 146 <== SourceLine 1454
                                                B.fpar=QX;
                                                ;
                                                QX.encl_1=B;
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 157 <== SourceLine 1457
                                new CLASS_COMMON_QTRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1457,new RTS_TXT("NEW Quantity: "),Q);
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 166 <== SourceLine 1461
                if(_VALUE((p_brc.fpar!=(null)))) {
                    {
                        // JavaLine 169 <== SourceLine 1462
                        new CLASS_BUILDER2_normalattrfile_expandexternals(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).Afile_7,p_brc);
                        ;
                        // JavaLine 172 <== SourceLine 1463
                        if(_VALUE((((CLASS_BUILDER2)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
                            // JavaLine 174 <== SourceLine 1464
                            new CLASS_SCANNER_dump((_CUR._SL._SL._SL),new RTS_TXT("- after exp.externals"));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 181 <== SourceLine 1468
                if(_VALUE(((p_brc.kind==(((char)5)))||((p_brc.kind==(((char)9))))))) {
                    {
                        // JavaLine 184 <== SourceLine 1469
                        if(_VALUE((p_brc.declquant.plev_1>(1)))) {
                            // JavaLine 186 <== SourceLine 1470
                            {
                                // JavaLine 188 <== SourceLine 1472
                                if(_VALUE(p_brc.declquant.prefqual_1.descr_1.hasCode)) {
                                    // JavaLine 190 <== SourceLine 1473
                                    p_brc.hasCode=true;
                                }
                                ;
                                // JavaLine 194 <== SourceLine 1476
                                new CLASS_BUILDER1_precheck0_hide((_CUR._SL._SL),p_brc.declquant.prefqual_1,false);
                                ;
                                // JavaLine 197 <== SourceLine 1477
                                VC=p_brc.declquant.prefqual_1.descr_1.favirt;
                                ;
                                // JavaLine 200 <== SourceLine 1478
                                while((VC!=(null))) {
                                    {
                                        // JavaLine 203 <== SourceLine 1480
                                        QX=((RTS_UTIL._IS(VC,CLASS_COMMON_quantity.class))?(new CLASS_COMMON_quantity((_CUR._SL._SL._SL))._STM()):(new CLASS_COMMON_extquantity((_CUR._SL._SL._SL),null)._STM()));
                                        ;
                                        // JavaLine 206 <== SourceLine 1482
                                        if(_VALUE((VA==(null)))) {
                                            VA=VB=QX;
                                        } else {
                                            // JavaLine 210 <== SourceLine 1483
                                            VB=((CLASS_COMMON_quantity)(VB.next=QX));
                                        }
                                        ;
                                        // JavaLine 214 <== SourceLine 1484
                                        new CLASS_BUILDER1_precheck0_makeequalto((_CUR._SL._SL),VC,VB);
                                        ;
                                        // JavaLine 217 <== SourceLine 1485
                                        new CLASS_COMMON_QTRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1485,new RTS_TXT("NEW Quantity: "),QX);
                                        ;
                                        // JavaLine 220 <== SourceLine 1486
                                        VB.encl_1=p_brc;
                                        ;
                                        // JavaLine 223 <== SourceLine 1487
                                        VB.dim_1=0;
                                        ;
                                        // JavaLine 226 <== SourceLine 1488
                                        VC=((CLASS_COMMON_quantity)(VC.next));
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 235 <== SourceLine 1491
                        QX=p_brc.favirt;
                        ;
                        // JavaLine 238 <== SourceLine 1492
                        if(_VALUE(((VA!=(null))||((QX!=(null)))))) {
                            {
                                // JavaLine 241 <== SourceLine 1493
                                VC=p_brc.favirt;
                                ;
                                // JavaLine 244 <== SourceLine 1494
                                if(_VALUE((VA!=(null)))) {
                                    {
                                        // JavaLine 247 <== SourceLine 1495
                                        VB.next=p_brc.favirt;
                                        ;
                                        p_brc.favirt=VA;
                                        ;
                                        // JavaLine 252 <== SourceLine 1496
                                        VNO=VB.virtno_1;
                                    }
                                } else {
                                    // JavaLine 256 <== SourceLine 1497
                                    VNO=0;
                                }
                                ;
                                // JavaLine 260 <== SourceLine 1500
                                while((VC!=(null))) {
                                    // JavaLine 262 <== SourceLine 1501
                                    {
                                        // JavaLine 264 <== SourceLine 1502
                                        VA=p_brc.favirt;
                                        ;
                                        // JavaLine 267 <== SourceLine 1503
                                        while(((VA!=(VC))&&((VA.symb_1!=(VC.symb_1))))) {
                                            // JavaLine 269 <== SourceLine 1504
                                            {
                                                _SIM_LABEL(1); // DeclaredIn: alloc2 -> alloc2[externalIdent=CLASS_BUILDER2_prechecker_allocate_alloc2] Kind=5, QUAL=ProcedureDeclaration, HashCode=1187152896
                                                VA=((CLASS_COMMON_quantity)(VA.next));
                                            }
                                        }
                                        ;
                                        // JavaLine 276 <== SourceLine 1505
                                        if(_VALUE((VA!=(VC)))) {
                                            {
                                                // JavaLine 279 <== SourceLine 1506
                                                if(_VALUE((VA.visible_1!=(((char)0))))) {
                                                    _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_Block1469_Block1493_Block1502_NXTVA_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 284 <== SourceLine 1508
                                                new CLASS_ERRMSG_errQTN((_CUR._SL._SL._SL),VC,414,VA);
                                                ;
                                                // JavaLine 287 <== SourceLine 1510
                                                while((VA.next!=(VC))) {
                                                    VA=((CLASS_COMMON_quantity)(VA.next));
                                                }
                                                ;
                                                // JavaLine 292 <== SourceLine 1511
                                                VA.next=VC.next;
                                                ;
                                                VC=VA;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 299 <== SourceLine 1513
                                            if(_VALUE(((VC.kind_1!=(((char)1)))&&((VC.type_1!=(((char)11))))))) {
                                                // JavaLine 301 <== SourceLine 1515
                                                {
                                                    new CLASS_ERRMSG_errQT((_CUR._SL._SL._SL),VC,326);
                                                    ;
                                                    // JavaLine 305 <== SourceLine 1516
                                                    VC.type_1=((char)15);
                                                    ;
                                                    VC.kind_1=((char)10);
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 314 <== SourceLine 1518
                                        VNO=(VNO+(1));
                                        ;
                                        VC.virtno_1=VNO;
                                        ;
                                        // JavaLine 319 <== SourceLine 1519
                                        VC.dim_1=1;
                                        ;
                                        // JavaLine 322 <== SourceLine 1520
                                        VC=((CLASS_COMMON_quantity)(VC.next));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 328 <== SourceLine 1522
                                p_brc.navirt=VNO;
                                ;
                            }
                        } else {
                            // JavaLine 333 <== SourceLine 1523
                            p_brc.navirt=0;
                        }
                        ;
                    }
                }
                ;
                // JavaLine 340 <== SourceLine 1527
                Q=p_brc.fpar;
                ;
                // JavaLine 343 <== SourceLine 1528
                if(_VALUE((Q!=(null)))) {
                    {
                        // JavaLine 346 <== SourceLine 1529
                        Q=new CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual((_CUR),Q,true)._RESULT;
                        ;
                    }
                }
                ;
                // JavaLine 352 <== SourceLine 1531
                if(_VALUE(((p_brc.kind==(((char)11)))||((p_brc.kind==(((char)7))))))) {
                    // JavaLine 354 <== SourceLine 1532
                    {
                        // JavaLine 356 <== SourceLine 1534
                        new CLASS_BUILDER1_precheck0_vischain((_CUR._SL._SL),p_brc.fpar,VC);
                        ;
                    }
                } else {
                    // JavaLine 361 <== SourceLine 1536
                    {
                        // JavaLine 363 <== SourceLine 1537
                        ((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6)+(1)));
                        ;
                        ((CLASS_BUILDER2)(_CUR._SL._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).crtblev_6)+(1)));
                        ;
                        // JavaLine 368 <== SourceLine 1538
                        if(_VALUE((RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6)>(250)))) {
                            new CLASS_ERRMSG_fatal0((_CUR._SL._SL._SL),299);
                        }
                        ;
                        // JavaLine 373 <== SourceLine 1539
                        new CLASS_BUILDER1_precheck0_makevisblock((_CUR._SL._SL),p_brc);
                        ;
                    }
                }
                ;
                // JavaLine 379 <== SourceLine 1542
                if(_VALUE((QX!=(null)))) {
                    new CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual((_CUR),QX,false);
                }
                ;
                // JavaLine 384 <== SourceLine 1543
                if(_VALUE((Q!=(null)))) {
                    new CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual((_CUR),Q,false);
                }
                ;
                // JavaLine 389 <== SourceLine 1546
                VC=p_brc.favirt;
                ;
                // JavaLine 392 <== SourceLine 1547
                while(true) {
                    {
                        // BEGIN INSPECTION 
                        _inspect_1547_4548=VC;
                        if(_inspect_1547_4548!=null) { // INSPECT _inspect_1547_4548  type=ref(QUANTITY)
                            // JavaLine 398 <== SourceLine 1548
                            {
                                // JavaLine 400 <== SourceLine 1547
                                {
                                    // JavaLine 402 <== SourceLine 1548
                                    if(_VALUE((_inspect_1547_4548.visible_1==(((char)0))))) {
                                        {
                                            // JavaLine 405 <== SourceLine 1549
                                            VA=p_brc.fpar;
                                            ;
                                            // JavaLine 408 <== SourceLine 1550
                                            while(((VA!=(null))&&((VA.symb_1!=(_inspect_1547_4548.symb_1))))) {
                                                // JavaLine 410 <== SourceLine 1551
                                                VA=((CLASS_COMMON_quantity)(VA.next));
                                            }
                                            ;
                                            // JavaLine 414 <== SourceLine 1552
                                            if(_VALUE((VA!=(null)))) {
                                                {
                                                    // JavaLine 417 <== SourceLine 1553
                                                    if(_VALUE((((((_inspect_1547_4548.type_1==(((char)15)))&&(((VA.kind_1==(((char)1)))||((VA.type_1==(((char)11)))))))||(((((_inspect_1547_4548.kind_1==(((char)1)))&&((VA.kind_1==(((char)1)))))&&((VA.categ_1!=(((char)4)))))&&(new CLASS_BUILDER1_precheck0_subordinate((_CUR._SL._SL),VA,((CLASS_COMMON_quantity)_inspect_1547_4548))._RESULT))))||(((_inspect_1547_4548.kind_1==(((char)3)))&&((VA.kind_1==(((char)3)))))))||(((_inspect_1547_4548.kind_1==(((char)4)))&&((VA.kind_1==(((char)4))))))))) {
                                                        // JavaLine 419 <== SourceLine 1560
                                                        {
                                                            // JavaLine 421 <== SourceLine 1561
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_1561_4549=_inspect_1547_4548.descr_1;
                                                                if(_inspect_1561_4549!=null) { // INSPECT _inspect_1561_4549  type=ref(BRECORD) declared in Connection block at line 1547
                                                                    // JavaLine 426 <== SourceLine 1562
                                                                    {
                                                                        // JavaLine 428 <== SourceLine 1561
                                                                        new CLASS_BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563((_CUR))._STM();
                                                                    }
                                                                }
                                                            } // END INSPECTION
                                                            ;
                                                            // JavaLine 434 <== SourceLine 1589
                                                            VA.match_1=((CLASS_COMMON_quantity)_inspect_1547_4548);
                                                            ;
                                                            _inspect_1547_4548.match_1=VA;
                                                            ;
                                                            // JavaLine 439 <== SourceLine 1591
                                                            _inspect_1547_4548.type_1=VA.type_1;
                                                            ;
                                                            _inspect_1547_4548.prefqual_1=VA.prefqual_1;
                                                            ;
                                                            // JavaLine 444 <== SourceLine 1592
                                                            VA.protect_1=_inspect_1547_4548.protect_1;
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 449 <== SourceLine 1593
                                                        new CLASS_ERRMSG_errQTN((_CUR._SL._SL._SL),VA,415,((CLASS_COMMON_quantity)_inspect_1547_4548));
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 458 <== SourceLine 1596
                                    VC=((CLASS_COMMON_quantity)(_inspect_1547_4548.next));
                                    ;
                                }
                            }
                        }
                        else { // OTHERWISE 
                            // JavaLine 465 <== SourceLine 1598
                            _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_EXBIND_0); // GOTO EVALUATED LABEL
                        } // END OTHERWISE 
                    } // END INSPECTION
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                {
                    _SIM_LABEL(2); // DeclaredIn: alloc2
                    // JavaLine 474 <== SourceLine 1600
                    if(_VALUE((((CLASS_BUILDER2)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
                        new CLASS_SCANNER_dump((_CUR._SL._SL._SL),new RTS_TXT("- after VIRT binding"));
                    }
                }
                ;
                // JavaLine 480 <== SourceLine 1603
                if(_VALUE(((((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant==(null))&&((p_brc.blev==(((char)2))))))) {
                    {
                        // JavaLine 483 <== SourceLine 1604
                        ((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant=((CLASS_COMMON_quantity)(((CLASS_COMMON_identsymbol)(new CLASS_COMMON_boxof((_CUR._SL._SL._SL),((char)0),'D')._RESULT)).curmeaning_1));
                        ;
                        // JavaLine 486 <== SourceLine 1606
                        if(_VALUE((((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant==(null)))) {
                            // JavaLine 488 <== SourceLine 1607
                            ((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).detachquant=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL._SL),new CLASS_COMMON_boxof((_CUR._SL._SL._SL),((char)0),'D')._RESULT)._RESULT;
                        }
                        ;
                    }
                }
                ;
                // JavaLine 495 <== SourceLine 1612
                Q=p_brc.fpar;
                ;
                // JavaLine 498 <== SourceLine 1613
                while((Q!=(null))) {
                    {
                        // JavaLine 501 <== SourceLine 1615
                        if(Q.kind_1<((char)0) || Q.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(Q.kind_1) { // BEGIN SWITCH STATEMENT
                            case 1: 
                            // JavaLine 505 <== SourceLine 1617
                            if(_VALUE(((Q.categ_1==(((char)3)))||((Q.categ_1==(((char)4))))))) {
                                // JavaLine 507 <== SourceLine 1618
                                new CLASS_BUILDER2_prechecker_allocate_alloc2((_CUR._SL),Q.descr_1);
                            }
                            break;
                            case 5: 
                            case 7: 
                            // JavaLine 513 <== SourceLine 1620
                            if(_VALUE((Q.match_1!=(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).alloc2called)))) {
                                new CLASS_BUILDER2_prechecker_allocate_alloc2((_CUR._SL),Q.descr_1);
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 520 <== SourceLine 1622
                        Q=((CLASS_COMMON_quantity)(Q.next));
                        ;
                    }
                }
                ;
                // JavaLine 526 <== SourceLine 1624
                if(p_brc.kind<((char)0) || p_brc.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(p_brc.kind) { // BEGIN SWITCH STATEMENT
                    case 11: 
                    case 7: 
                    // JavaLine 531 <== SourceLine 1631
                    {
                        // JavaLine 533 <== SourceLine 1632
                        Q=p_brc.fpar;
                        ;
                        new CLASS_BUILDER1_precheck0_invischain((_CUR._SL._SL),Q);
                        ;
                    }
                    break;
                    case 5: 
                    // JavaLine 541 <== SourceLine 1633
                    {
                        // JavaLine 543 <== SourceLine 1635
                        if(_VALUE((p_brc.hidlist!=(null)))) {
                            {
                                // JavaLine 546 <== SourceLine 1636
                                new CLASS_BUILDER1_precheck0_unprotect((_CUR._SL._SL),p_brc.declquant);
                                ;
                                B=p_brc;
                                ;
                                // JavaLine 551 <== SourceLine 1637
                                new CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid((_CUR),p_brc.favirt);
                                ;
                                // JavaLine 554 <== SourceLine 1638
                                {
                                    _SIM_LABEL(3); // DeclaredIn: alloc2 -> alloc2[externalIdent=CLASS_BUILDER2_prechecker_allocate_alloc2] Kind=5, QUAL=ProcedureDeclaration, HashCode=1187152896
                                    new CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid((_CUR),B.fpar);
                                }
                                ;
                                // JavaLine 560 <== SourceLine 1639
                                if(_VALUE((B.declquant.plev_1>(1)))) {
                                    {
                                        // JavaLine 563 <== SourceLine 1640
                                        B=B.declquant.prefqual_1.descr_1;
                                        ;
                                        // JavaLine 566 <== SourceLine 1641
                                        new CLASS_BUILDER1_precheck0_unprotect((_CUR._SL._SL),B.declquant);
                                        ;
                                        _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_Block1635_Block1636_CH_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 573 <== SourceLine 1643
                                fvis=p_brc.hidlist;
                                ;
                                // JavaLine 576 <== SourceLine 1644
                                while((fvis!=(null))) {
                                    {
                                        // JavaLine 579 <== SourceLine 1645
                                        if(_VALUE((fvis.line>(0)))) {
                                            new CLASS_ERRMSG_removeVis((_CUR._SL._SL._SL),p_brc,fvis,368);
                                        } else {
                                            // JavaLine 583 <== SourceLine 1646
                                            fvis.line=(-(fvis.line));
                                        }
                                        ;
                                        // JavaLine 587 <== SourceLine 1647
                                        fvis=fvis.next;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 595 <== SourceLine 1650
                        _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_LBL_0); // GOTO EVALUATED LABEL
                    }
                    break;
                    default:
                    // JavaLine 600 <== SourceLine 1651
                    {
                        _SIM_LABEL(4); // DeclaredIn: alloc2
                        new CLASS_BUILDER1_precheck0_leaveblock((_CUR._SL._SL));
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 608 <== SourceLine 1653
                new CLASS_COMMON_brecord_blockDump(p_brc,CONC(CONC(new RTS_TXT("Builder2.LINE "),RTS_ENVIRONMENT.edit(1653)),new RTS_TXT(": END Alloc2 ")));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 alloc2",1,1290,11,1504,13,1600,15,1638,17,1651,20,1297,28,1298,30,1547,32,1561,66,1428,69,1429,72,1430,75,1431,78,1432,83,1433,86,1434,89,1435,94,1437,96,1438,99,1439,102,1441,105,1442,108,1443,111,1444,118,1445,123,1446,128,1447,131,1449,134,1450,137,1451,140,1452,143,1453,146,1454,157,1457,166,1461,169,1462,172,1463,174,1464,181,1468,184,1469,186,1470,188,1472,190,1473,194,1476,197,1477,200,1478,203,1480,206,1482,210,1483,214,1484,217,1485,220,1486,223,1487,226,1488,235,1491,238,1492,241,1493,244,1494,247,1495,252,1496,256,1497,260,1500,262,1501,264,1502,267,1503,269,1504,276,1505,279,1506,284,1508,287,1510,292,1511,299,1513,301,1515,305,1516,314,1518,319,1519,322,1520,328,1522,333,1523,340,1527,343,1528,346,1529,352,1531,354,1532,356,1534,361,1536,363,1537,368,1538,373,1539,379,1542,384,1543,389,1546,392,1547,398,1548,400,1547,402,1548,405,1549,408,1550,410,1551,414,1552,417,1553,419,1560,421,1561,426,1562,428,1561,434,1589,439,1591,444,1592,449,1593,458,1596,465,1598,474,1600,480,1603,483,1604,486,1606,488,1607,495,1612,498,1613,501,1615,505,1617,507,1618,513,1620,520,1622,526,1624,531,1631,533,1632,541,1633,543,1635,546,1636,551,1637,554,1638,560,1639,563,1640,566,1641,573,1643,576,1644,579,1645,583,1646,587,1647,595,1650,600,1651,608,1653,620,1654);
} // End of Procedure
