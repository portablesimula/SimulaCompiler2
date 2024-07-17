// JavaLine 1 <== SourceLine 563
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_outquantwlist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=563, lastLine=865, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 11 <== SourceLine 839
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block807_Block808_Block838_UTQ_0=new RTS_LABEL(this,0,1,"UTQ"); // Local Label #1=UTQ At PrefixLevel 0
    // JavaLine 13 <== SourceLine 845
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block807_Block808_Block838_Block840_Block845_UTP_0=new RTS_LABEL(this,0,2,"UTP"); // Local Label #2=UTP At PrefixLevel 0
    // JavaLine 15 <== SourceLine 858
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_SPECX_0=new RTS_LABEL(this,0,3,"SPECX"); // Local Label #3=SPECX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 565
    public char ch=0;
    public char clf=0;
    public boolean inrflag=false;
    // JavaLine 22 <== SourceLine 566
    public char quallength=0;
    public char idlength=0;
    // JavaLine 25 <== SourceLine 567
    public int k=0;
    public int l=0;
    public int xtag=0;
    public int overload=0;
    // JavaLine 30 <== SourceLine 568
    public int basetag=0;
    public RTS_TXT u=null;
    // JavaLine 33 <== SourceLine 569
    public COMMON_quantity qq=null;
    public COMMON_idpack cvis=null;
    // JavaLine 36 <== SourceLine 570
    public RTS_TXT idddd1=null;
    public RTS_TXT idddd2=null;
    // JavaLine 39 <== SourceLine 573
    public COMMON_quantity _inspect_573_4540=null;
    // JavaLine 41 <== SourceLine 724
    public COMMON_extbrecord _inspect_724_4541=null;
    // JavaLine 43 <== SourceLine 788
    public COMMON_brecord _inspect_788_4542=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_outquantwlist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_outquantwlist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_outquantwlist(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_outquantwlist _STM() {
        BUILDER2_normalattrfile_outquantwlist _THIS=(BUILDER2_normalattrfile_outquantwlist)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 77 <== SourceLine 572
                new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),572,new RTS_TXT("outquantwlist:"),p_q);
                ;
                // JavaLine 80 <== SourceLine 573
                {
                    // BEGIN INSPECTION 
                    _inspect_573_4540=p_q;
                    if(_inspect_573_4540!=null) { // INSPECT _inspect_573_4540
                        // JavaLine 85 <== SourceLine 574
                        {
                            // JavaLine 87 <== SourceLine 573
                            {
                                // JavaLine 89 <== SourceLine 574
                                xtag=(new BUILDER1_exttag((_CUR._SL._SL),((COMMON_quantity)_inspect_573_4540))._RESULT+(1));
                                ;
                                // JavaLine 92 <== SourceLine 576
                                if(_VALUE((xtag>=(0)))) {
                                    {
                                        // JavaLine 95 <== SourceLine 580
                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),580,CONC(CONC(CONC(CONC(new RTS_TXT("outquantwlist: *** BEGIN OutputQuant: "),_inspect_573_4540.symb_1.symbol),new RTS_TXT(", xtag=")),RTS_ENVIRONMENT.edit(xtag)),new RTS_TXT(" *****************")));
                                        ;
                                        // JavaLine 98 <== SourceLine 583
                                        if(_VALUE(((_inspect_573_4540.prefqual_1!=(null))&&(((_inspect_573_4540.kind_1!=(((char)5)))||((_inspect_573_4540.plev_1>(1)))))))) {
                                            // JavaLine 100 <== SourceLine 584
                                            quallength=RTS_ENVIRONMENT._char((RTS_TXT.length(_inspect_573_4540.prefqual_1.symb_1.symbol)+(1)));
                                        }
                                        ;
                                        // JavaLine 104 <== SourceLine 586
                                        if(_VALUE(((_inspect_573_4540.encl_1.kind==(((char)1)))&&((_inspect_573_4540.categ_1<(((char)3))))))) {
                                            ;
                                        } else {
                                            // JavaLine 108 <== SourceLine 588
                                            {
                                                // JavaLine 110 <== SourceLine 589
                                                idlength=RTS_ENVIRONMENT._char(((((((_inspect_573_4540.kind_1!=(((char)5)))&&((RTS_TXT.length(_inspect_573_4540.symb_1.symbol)>(1))))&&((RTS_ENVIRONMENT.loadChar(_inspect_573_4540.symb_1.symbol,1)!=('_'))))&&((RTS_ENVIRONMENT.loadChar(_inspect_573_4540.symb_1.symbol,0)==('_')))))?(1):((RTS_TXT.length(_inspect_573_4540.symb_1.symbol)+(1)))));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 116 <== SourceLine 596
                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),596,new RTS_TXT("outquantwlist: *** TEST 3"));
                                        ;
                                        // JavaLine 119 <== SourceLine 598
                                        if(_VALUE((((((BUILDER2_normalattrfile)(_CUR._SL)).p+(RTS_ENVIRONMENT.rank(idlength)))+(RTS_ENVIRONMENT.rank(quallength)))>((((BUILDER2_normalattrfile)(_CUR._SL)).bufmax-(5)))))) {
                                            // JavaLine 121 <== SourceLine 599
                                            new BUILDER2_normalattrfile_swapObuffer((_CUR._SL));
                                        }
                                        ;
                                        // JavaLine 125 <== SourceLine 601
                                        if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).sysattrfile&&((_inspect_573_4540.categ_1!=(((char)6)))))&&((_inspect_573_4540.categ_1!=(((char)4))))))) {
                                            // JavaLine 127 <== SourceLine 603
                                            {
                                                // JavaLine 129 <== SourceLine 604
                                                ((BUILDER2)(_CUR._SL._SL)).permt=new COMMON_nameof((_CUR._SL._SL),RTS_ENVIRONMENT._char((_inspect_573_4540.virtno_1/(256))),RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(_inspect_573_4540.virtno_1,256)))._RESULT;
                                                ;
                                                // JavaLine 132 <== SourceLine 606
                                                RTS_TXT.setpos(((BUILDER2)(_CUR._SL._SL)).permt,1);
                                                ;
                                                // JavaLine 135 <== SourceLine 607
                                                clf=RTS_TXT.getchar(((BUILDER2)(_CUR._SL._SL)).permt);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 141 <== SourceLine 610
                                        if(_VALUE((idlength==(((char)0))))) {
                                            RTS_BASICIO.sysout().outtext(new RTS_TXT("PROCEDURE PARAMETER: "));
                                        }
                                        ;
                                        // JavaLine 146 <== SourceLine 611
                                        RTS_BASICIO.sysout().outtext(CONC(CONC(new COMMON_K_code((_CUR._SL._SL),_inspect_573_4540.kind_1)._RESULT,new RTS_TXT(" ")),_inspect_573_4540.symb_1.symbol));
                                        ;
                                        // JavaLine 149 <== SourceLine 612
                                        RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(new RTS_TXT(", exttag="),RTS_ENVIRONMENT.edit(xtag)),new RTS_TXT(", type=")),new COMMON_edType((_CUR._SL._SL),_inspect_573_4540.type_1)._RESULT));
                                        ;
                                        // JavaLine 152 <== SourceLine 613
                                        RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT(", kind="),new COMMON_K_code((_CUR._SL._SL),_inspect_573_4540.kind_1)._RESULT),new RTS_TXT(", categ=")),new COMMON_C_code((_CUR._SL._SL),_inspect_573_4540.categ_1)._RESULT),new RTS_TXT(", clf=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(clf))));
                                        ;
                                        // JavaLine 155 <== SourceLine 615
                                        RTS_BASICIO.sysout().outimage();
                                        ;
                                        // JavaLine 158 <== SourceLine 621
                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(((RTS_ENVIRONMENT.rank(_inspect_573_4540.kind_1)*(8))+(RTS_ENVIRONMENT.rank(_inspect_573_4540.categ_1)))));
                                        ;
                                        // JavaLine 161 <== SourceLine 624
                                        if(_VALUE((quallength!=(((char)0))))) {
                                            {
                                                // JavaLine 164 <== SourceLine 626
                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(_inspect_573_4540.type_1)+(128))));
                                                ;
                                                // JavaLine 167 <== SourceLine 627
                                                new BUILDER2_normalattrfile_puttext((_CUR._SL),_inspect_573_4540.prefqual_1.symb_1.symbol);
                                            }
                                        } else {
                                            // JavaLine 171 <== SourceLine 628
                                            {
                                                // JavaLine 173 <== SourceLine 630
                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),_inspect_573_4540.type_1);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 179 <== SourceLine 635
                                        if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).sysattrfile&&((_inspect_573_4540.categ_1!=(((char)6)))))&&((_inspect_573_4540.categ_1!=(((char)4))))))) {
                                            // JavaLine 181 <== SourceLine 637
                                            {
                                                // JavaLine 183 <== SourceLine 644
                                                if(_VALUE((idlength==(((char)0))))) {
                                                    {
                                                        // JavaLine 186 <== SourceLine 645
                                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),645,CONC(new RTS_TXT("outquantwlist: PROCEDURE PARAMETER: clf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(clf))));
                                                        ;
                                                        // JavaLine 189 <== SourceLine 646
                                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(clf)+(128))));
                                                        ;
                                                        // JavaLine 192 <== SourceLine 647
                                                        new BUILDER2_normalattrfile_putNumber((_CUR._SL),xtag);
                                                        ;
                                                        // JavaLine 195 <== SourceLine 648
                                                        _GOTO(_LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_SPECX_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 201 <== SourceLine 650
                                                k=RTS_TXT.getint(new COMMON_attrfile_nextitemoft((_CUR._SL))._RESULT);
                                                ;
                                                // JavaLine 204 <== SourceLine 651
                                                if(_VALUE((k<(0)))) {
                                                    {
                                                        // JavaLine 207 <== SourceLine 652
                                                        overload=(-(k));
                                                        ;
                                                        k=RTS_TXT.getint(new COMMON_attrfile_nextitemoft((_CUR._SL))._RESULT);
                                                    }
                                                }
                                                ;
                                                // JavaLine 214 <== SourceLine 653
                                                if(_VALUE((k==(3)))) {
                                                    inrflag=true;
                                                }
                                                ;
                                                // JavaLine 219 <== SourceLine 655
                                                if(_VALUE((k==(1)))) {
                                                    {
                                                        // JavaLine 222 <== SourceLine 656
                                                        idddd1=new COMMON_attrfile_nextitemoft((_CUR._SL))._RESULT;
                                                        ;
                                                        // JavaLine 225 <== SourceLine 657
                                                        idddd1=RTS_TXT.sub(idddd1,2,(RTS_TXT.length(idddd1)-(1)));
                                                        ;
                                                        // JavaLine 228 <== SourceLine 658
                                                        idddd2=null;
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 233 <== SourceLine 659
                                                    if(_VALUE((k==(2)))) {
                                                        {
                                                            // JavaLine 236 <== SourceLine 660
                                                            idddd1=new COMMON_attrfile_nextitemoft((_CUR._SL))._RESULT;
                                                            ;
                                                            // JavaLine 239 <== SourceLine 661
                                                            idddd1=RTS_TXT.sub(idddd1,2,(RTS_TXT.length(idddd1)-(1)));
                                                            ;
                                                            // JavaLine 242 <== SourceLine 662
                                                            idddd2=new COMMON_attrfile_nextitemoft((_CUR._SL))._RESULT;
                                                            ;
                                                            // JavaLine 245 <== SourceLine 663
                                                            idddd2=RTS_TXT.sub(idddd2,2,(RTS_TXT.length(idddd2)-(1)));
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 250 <== SourceLine 664
                                                        {
                                                            // JavaLine 252 <== SourceLine 665
                                                            idddd1=null;
                                                            ;
                                                            // JavaLine 255 <== SourceLine 666
                                                            idddd2=null;
                                                            ;
                                                        }
                                                    }
                                                }
                                                ;
                                                // JavaLine 262 <== SourceLine 670
                                                xtag=1;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 267 <== SourceLine 697
                                            clf=((_IS(((COMMON_quantity)_inspect_573_4540),COMMON_extquantity.class))?(((COMMON_extquantity)(((COMMON_quantity)_inspect_573_4540))).clf_2):(((char)0)));
                                        }
                                        ;
                                        // JavaLine 271 <== SourceLine 699
                                        if(_VALUE((idlength==(((char)0))))) {
                                            {
                                                // JavaLine 274 <== SourceLine 700
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),700,CONC(CONC(CONC(new RTS_TXT("outquantwlist: clf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(clf))),new RTS_TXT(", xtag=")),RTS_ENVIRONMENT.edit(xtag)));
                                                ;
                                                // JavaLine 277 <== SourceLine 701
                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(clf)+(128))));
                                                ;
                                                new BUILDER2_normalattrfile_putNumber((_CUR._SL),xtag);
                                                ;
                                                // JavaLine 282 <== SourceLine 702
                                                _GOTO(_LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_SPECX_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 288 <== SourceLine 704
                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),clf);
                                        ;
                                        new BUILDER2_normalattrfile_putNumber((_CUR._SL),xtag);
                                        ;
                                        // JavaLine 293 <== SourceLine 706
                                        if(_VALUE((idlength==(((char)1))))) {
                                            new BUILDER2_normalattrfile_storebyte((_CUR._SL),((char)0));
                                        } else {
                                            // JavaLine 297 <== SourceLine 707
                                            new BUILDER2_normalattrfile_puttext((_CUR._SL),_inspect_573_4540.symb_1.symbol);
                                        }
                                        ;
                                        // JavaLine 301 <== SourceLine 710
                                        if(_VALUE((overload!=(0)))) {
                                            {
                                                // JavaLine 304 <== SourceLine 711
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),711,CONC(new RTS_TXT("outquantwlist: overMark="),RTS_ENVIRONMENT.edit(overload)));
                                                ;
                                                // JavaLine 307 <== SourceLine 712
                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)243));
                                                ;
                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(overload));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 315 <== SourceLine 714
                                        if(_VALUE((_inspect_573_4540.protect_1!=(((char)0))))) {
                                            {
                                                // JavaLine 318 <== SourceLine 715
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),715,CONC(new RTS_TXT("outquantwlist: protMark="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(_inspect_573_4540.protect_1))));
                                                ;
                                                // JavaLine 321 <== SourceLine 716
                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)249));
                                                ;
                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),_inspect_573_4540.protect_1);
                                            }
                                        }
                                        ;
                                        // JavaLine 328 <== SourceLine 718
                                        if(_VALUE((_inspect_573_4540.categ_1==(((char)4))))) {
                                            {
                                                // JavaLine 331 <== SourceLine 719
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),719,new RTS_TXT("outquantwlist: categ=C\u005fextnal"));
                                                ;
                                                // JavaLine 334 <== SourceLine 720
                                                if(_VALUE(_IS(_inspect_573_4540.descr_1,COMMON_extbrecord.class))) {
                                                    // JavaLine 336 <== SourceLine 721
                                                    {
                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)246));
                                                        ;
                                                        // JavaLine 340 <== SourceLine 723
                                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),723,CONC(new RTS_TXT("outquantwlist: xMARK="),RTS_ENVIRONMENT.edit(((char)246))));
                                                        ;
                                                        // JavaLine 343 <== SourceLine 724
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_724_4541=((COMMON_extbrecord)(_inspect_573_4540.descr_1));
                                                            if(_inspect_724_4541!=null) { // INSPECT _inspect_724_4541
                                                                // JavaLine 348 <== SourceLine 725
                                                                {
                                                                    // JavaLine 350 <== SourceLine 724
                                                                    new BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block719_Block721_Block725((_CUR))._STM();
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                    }
                                                } else {
                                                    // JavaLine 357 <== SourceLine 737
                                                    {
                                                        // JavaLine 359 <== SourceLine 738
                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)245));
                                                        ;
                                                        // JavaLine 362 <== SourceLine 739
                                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),739,CONC(new RTS_TXT("outquantwlist: yMARK="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)245)))));
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 368 <== SourceLine 742
                                                new BUILDER2_normalattrfile_putstring((_CUR._SL),RTS_ENVIRONMENT._char((_inspect_573_4540.dim_1/(256))),RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(_inspect_573_4540.dim_1,256)));
                                                ;
                                                // JavaLine 371 <== SourceLine 743
                                                new BUILDER2_normalattrfile_putstring((_CUR._SL),RTS_ENVIRONMENT._char((_inspect_573_4540.virtno_1/(256))),RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(_inspect_573_4540.virtno_1,256)));
                                                ;
                                            }
                                        } else {
                                            // JavaLine 376 <== SourceLine 745
                                            {
                                                // JavaLine 378 <== SourceLine 746
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),746,new RTS_TXT("outquantwlist: categ <> C\u005fextnal"));
                                                ;
                                                // JavaLine 381 <== SourceLine 748
                                                if(_VALUE(TRF_EQ(idddd2,null))) {
                                                    idddd2=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("MISSING")));
                                                }
                                                ;
                                                // JavaLine 386 <== SourceLine 749
                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)245));
                                                ;
                                                // JavaLine 389 <== SourceLine 750
                                                new BUILDER2_normalattrfile_puttext((_CUR._SL),idddd1);
                                                ;
                                                // JavaLine 392 <== SourceLine 751
                                                new BUILDER2_normalattrfile_puttext((_CUR._SL),idddd2);
                                                ;
                                                // JavaLine 395 <== SourceLine 753
                                                if(_VALUE(((_inspect_573_4540.encl_1!=(null))&&(((_inspect_573_4540.categ_1!=(((char)3)))||(((_inspect_573_4540.match_1!=(null))&&((_inspect_573_4540.match_1.categ_1==(((char)6))))))))))) {
                                                    // JavaLine 397 <== SourceLine 756
                                                    {
                                                        // JavaLine 399 <== SourceLine 757
                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)241));
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 405 <== SourceLine 760
                                                if(_VALUE((_inspect_573_4540.dim_1>(0)))) {
                                                    {
                                                        // JavaLine 408 <== SourceLine 761
                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)242));
                                                        ;
                                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(_inspect_573_4540.dim_1));
                                                    }
                                                }
                                                ;
                                                // JavaLine 415 <== SourceLine 762
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),762,CONC(CONC(CONC(new RTS_TXT("outquantwlist: dimMark="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)242)))),new RTS_TXT(", dim=")),RTS_ENVIRONMENT.edit(_inspect_573_4540.dim_1)));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 421 <== SourceLine 765
                                        if(_VALUE(((_inspect_573_4540.special_1!=(((char)0)))||((_inspect_573_4540.kind_1==(((char)6))))))) {
                                            // JavaLine 423 <== SourceLine 767
                                            {
                                                // JavaLine 425 <== SourceLine 769
                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)244));
                                                ;
                                                // JavaLine 428 <== SourceLine 770
                                                if(_VALUE((_inspect_573_4540.kind_1==(((char)6))))) {
                                                    {
                                                        // JavaLine 431 <== SourceLine 771
                                                        new BUILDER2_normalattrfile_putNumber((_CUR._SL),_inspect_573_4540.descr_1.line1);
                                                        ;
                                                        // JavaLine 434 <== SourceLine 772
                                                        new BUILDER2_normalattrfile_putNumber((_CUR._SL),_inspect_573_4540.descr_1.npar);
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 439 <== SourceLine 773
                                                    {
                                                        // JavaLine 441 <== SourceLine 774
                                                        if(_VALUE((_inspect_573_4540.descr_1.blnohi!=(((char)0))))) {
                                                            // JavaLine 443 <== SourceLine 775
                                                            {
                                                                // JavaLine 445 <== SourceLine 776
                                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),_inspect_573_4540.special_1);
                                                                ;
                                                                // JavaLine 448 <== SourceLine 777
                                                                new BUILDER2_normalattrfile_putstring((_CUR._SL),_inspect_573_4540.descr_1.blnohi,_inspect_573_4540.descr_1.blnolo);
                                                            }
                                                        } else {
                                                            // JavaLine 452 <== SourceLine 778
                                                            {
                                                                // JavaLine 454 <== SourceLine 779
                                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(_inspect_573_4540.special_1)+(128))));
                                                                ;
                                                                // JavaLine 457 <== SourceLine 780
                                                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),_inspect_573_4540.descr_1.blnolo);
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 466 <== SourceLine 783
                                                _GOTO(_LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_SPECX_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 472 <== SourceLine 786
                                        if(_VALUE((!(((BUILDER2_normalattrfile)(_CUR._SL)).sysattrfile)))) {
                                            {
                                                // JavaLine 475 <== SourceLine 788
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_788_4542=_inspect_573_4540.descr_1;
                                                    if(_inspect_788_4542!=null) { // INSPECT _inspect_788_4542
                                                        // JavaLine 480 <== SourceLine 789
                                                        {
                                                            // JavaLine 482 <== SourceLine 788
                                                            {
                                                                // JavaLine 484 <== SourceLine 789
                                                                if(_VALUE((_inspect_788_4542.connests!=(0)))) {
                                                                    {
                                                                        // JavaLine 487 <== SourceLine 790
                                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)247));
                                                                        ;
                                                                        // JavaLine 490 <== SourceLine 791
                                                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(_inspect_788_4542.connests));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 496 <== SourceLine 794
                                                                if(_VALUE(_inspect_788_4542.thisused)) {
                                                                    k=64;
                                                                } else {
                                                                    k=0;
                                                                }
                                                                ;
                                                                // JavaLine 503 <== SourceLine 795
                                                                if(_VALUE(_inspect_788_4542.hasCode)) {
                                                                    k=(k+(32));
                                                                }
                                                                ;
                                                                // JavaLine 508 <== SourceLine 797
                                                                if(_VALUE((_inspect_788_4542.inrtag!=(((char)0))))) {
                                                                    k=(k+(2));
                                                                }
                                                                ;
                                                                // JavaLine 513 <== SourceLine 798
                                                                if(_VALUE((k!=(0)))) {
                                                                    {
                                                                        // JavaLine 516 <== SourceLine 799
                                                                        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)240));
                                                                        ;
                                                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(k));
                                                                    }
                                                                }
                                                                ;
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                                ;
                                            }
                                        } else {
                                            // JavaLine 530 <== SourceLine 802
                                            if(_VALUE((((clf==(((char)4)))||((clf==(((char)9)))))&&(inrflag)))) {
                                                // JavaLine 532 <== SourceLine 803
                                                {
                                                    // JavaLine 534 <== SourceLine 804
                                                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),804,CONC(new RTS_TXT("outquantwlist: thisMark="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)240)))));
                                                    ;
                                                    // JavaLine 537 <== SourceLine 805
                                                    new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)240));
                                                    ;
                                                    new BUILDER2_normalattrfile_storebyte((_CUR._SL),((char)2));
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 545 <== SourceLine 807
                                        if(_VALUE(_IS(_inspect_573_4540.descr_1,COMMON_brecord.class))) {
                                            {
                                                if(_VALUE((_inspect_573_4540.special_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 550 <== SourceLine 808
                                                        if(_VALUE((_inspect_573_4540.descr_1.kind==(((char)5))))) {
                                                            {
                                                                // JavaLine 553 <== SourceLine 809
                                                                cvis=_inspect_573_4540.descr_1.hidlist;
                                                                ;
                                                                // JavaLine 556 <== SourceLine 810
                                                                while((cvis!=(null))) {
                                                                    {
                                                                        // JavaLine 559 <== SourceLine 811
                                                                        if(_VALUE((cvis.line>(0)))) {
                                                                            {
                                                                                // JavaLine 562 <== SourceLine 812
                                                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)248));
                                                                                ;
                                                                                // JavaLine 565 <== SourceLine 813
                                                                                new BUILDER2_normalattrfile_putstring((_CUR._SL),cvis.idhi,cvis.idlo);
                                                                                ;
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 571 <== SourceLine 815
                                                                        cvis=cvis.next;
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 580 <== SourceLine 818
                                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),818,new RTS_TXT("outquantwlist: !*** end of OutputQuant ***************************************************"));
                                                        ;
                                                        // JavaLine 583 <== SourceLine 821
                                                        l=k=0;
                                                        ;
                                                        // JavaLine 586 <== SourceLine 822
                                                        if(_VALUE(((_inspect_573_4540.categ_1==(((char)6)))&&((_inspect_573_4540.kind_1==(((char)1))))))) {
                                                            {
                                                                // JavaLine 589 <== SourceLine 825
                                                                qq=_inspect_573_4540.descr_1.fpar;
                                                                ;
                                                                // JavaLine 592 <== SourceLine 826
                                                                if(_VALUE((qq!=(null)))) {
                                                                    {
                                                                        k=1;
                                                                        ;
                                                                        _GOTO(_LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block807_Block808_Block838_Block840_Block845_UTP_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 601 <== SourceLine 828
                                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),828,CONC(new RTS_TXT("outquantwlist: begList="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)251)))));
                                                                ;
                                                                // JavaLine 604 <== SourceLine 829
                                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)251));
                                                                ;
                                                                l=1;
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 611 <== SourceLine 831
                                                            {
                                                                // JavaLine 613 <== SourceLine 838
                                                                qq=_inspect_573_4540.descr_1.favirt;
                                                                ;
                                                                // JavaLine 616 <== SourceLine 839
                                                                {
                                                                    _SIM_LABEL(1); // DeclaredIn: outquantwlist -> outquantwlist[externalIdent=BUILDER2_normalattrfile_outquantwlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=595285180
                                                                    while((qq!=(null))) {
                                                                        {
                                                                            // JavaLine 621 <== SourceLine 840
                                                                            if(_VALUE((((k==(0)))?((qq.dim_1>(0))):(((_IS(qq.descr_1,COMMON_extbrecord.class))?((((COMMON_extbrecord)(qq.descr_1)).status_1==('S'))):(true)))))) {
                                                                                // JavaLine 623 <== SourceLine 844
                                                                                {
                                                                                    // JavaLine 625 <== SourceLine 845
                                                                                    {
                                                                                        _SIM_LABEL(2); // DeclaredIn: outquantwlist -> outquantwlist[externalIdent=BUILDER2_normalattrfile_outquantwlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=595285180
                                                                                        if(_VALUE((l==(0)))) {
                                                                                            {
                                                                                                // JavaLine 630 <== SourceLine 846
                                                                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)251));
                                                                                                ;
                                                                                                l=1;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 638 <== SourceLine 847
                                                                                    new BUILDER2_normalattrfile_outquantwlist((_CUR._SL),qq);
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 644 <== SourceLine 849
                                                                            if(_VALUE((qq!=(null)))) {
                                                                                qq=((COMMON_quantity)(qq.next));
                                                                            }
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 653 <== SourceLine 851
                                                                if(_VALUE((k==(0)))) {
                                                                    {
                                                                        qq=_inspect_573_4540.descr_1.fpar;
                                                                        ;
                                                                        k=1;
                                                                        ;
                                                                        _GOTO(_LABEL_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block807_Block808_Block838_UTQ_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 667 <== SourceLine 853
                                                        if(_VALUE((l!=(0)))) {
                                                            {
                                                                // JavaLine 670 <== SourceLine 854
                                                                new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)250));
                                                                ;
                                                                // JavaLine 673 <== SourceLine 855
                                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),855,CONC(new RTS_TXT("outquantwlist: endList="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)250)))));
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 684 <== SourceLine 858
                                        {
                                            _SIM_LABEL(3); // DeclaredIn: outquantwlist -> outquantwlist[externalIdent=BUILDER2_normalattrfile_outquantwlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=595285180
                                            ;
                                        }
                                    }
                                }
                                ;
                            }
                        }
                    }
                    else { // OTHERWISE 
                        // JavaLine 696 <== SourceLine 860
                        new ERRMSG_internerr((_CUR._SL._SL),((char)7),860);
                    } // END OTHERWISE 
                } // END INSPECTION
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 outquantwlist",1,563,11,839,13,845,15,858,18,565,22,566,25,567,30,568,33,569,36,570,39,573,41,724,43,788,77,572,80,573,85,574,87,573,89,574,92,576,95,580,98,583,100,584,104,586,108,588,110,589,116,596,119,598,121,599,125,601,127,603,129,604,132,606,135,607,141,610,146,611,149,612,152,613,155,615,158,621,161,624,164,626,167,627,171,628,173,630,179,635,181,637,183,644,186,645,189,646,192,647,195,648,201,650,204,651,207,652,214,653,219,655,222,656,225,657,228,658,233,659,236,660,239,661,242,662,245,663,250,664,252,665,255,666,262,670,267,697,271,699,274,700,277,701,282,702,288,704,293,706,297,707,301,710,304,711,307,712,315,714,318,715,321,716,328,718,331,719,334,720,336,721,340,723,343,724,348,725,350,724,357,737,359,738,362,739,368,742,371,743,376,745,378,746,381,748,386,749,389,750,392,751,395,753,397,756,399,757,405,760,408,761,415,762,421,765,423,767,425,769,428,770,431,771,434,772,439,773,441,774,443,775,445,776,448,777,452,778,454,779,457,780,466,783,472,786,475,788,480,789,482,788,484,789,487,790,490,791,496,794,503,795,508,797,513,798,516,799,530,802,532,803,534,804,537,805,545,807,550,808,553,809,556,810,559,811,562,812,565,813,571,815,580,818,583,821,586,822,589,825,592,826,601,828,604,829,611,831,613,838,616,839,621,840,623,844,625,845,630,846,638,847,644,849,653,851,667,853,670,854,673,855,684,858,696,860,711,865);
} // End of Procedure
