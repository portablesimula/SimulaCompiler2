// JavaLine 1 <== SourceLine 469
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_staticencl extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=469, lastLine=560, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 505
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_staticencl_Block479_Block499_BIOob_0=new RTS_LABEL(this,0,1,"BIOob"); // Local Label #1=BIOob At PrefixLevel 0
    // JavaLine 12 <== SourceLine 531
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_staticencl_Block479_Block525_pushit_0=new RTS_LABEL(this,0,2,"pushit"); // Local Label #2=pushit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 474
    public int ttag=0;
    public int st_rblev=0;
    public int blevel=0;
    // JavaLine 19 <== SourceLine 475
    public CLASS_COMMON_quantity qty=null;
    // JavaLine 21 <== SourceLine 478
    public CLASS_COMMON_brecord _inspect_478_4626=null;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_staticencl(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_staticencl _STM() {
        CLASS_SCODER1_codegenerator1_staticencl _THIS=(CLASS_SCODER1_codegenerator1_staticencl)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_478_4626=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).opq_3.encl_1;
                    if(_inspect_478_4626!=null) { // INSPECT _inspect_478_4626  type=ref(BRECORD)
                        // JavaLine 42 <== SourceLine 479
                        {
                            // JavaLine 44 <== SourceLine 478
                            {
                                // JavaLine 46 <== SourceLine 479
                                if(_VALUE((_inspect_478_4626.preinsp!=(null)))) {
                                    {
                                        // JavaLine 49 <== SourceLine 480
                                        blevel=RTS_ENVIRONMENT.rank(((CLASS_SCODER1)(_CUR._SL._SL)).cblev_6);
                                        ;
                                        // JavaLine 52 <== SourceLine 481
                                        while((blevel!=(0))) {
                                            {
                                                // JavaLine 55 <== SourceLine 482
                                                qty=((CLASS_SCODER1)(_CUR._SL._SL)).display.getELEMENT(blevel).declquant;
                                                ;
                                                // JavaLine 58 <== SourceLine 483
                                                while((qty!=(null))) {
                                                    {
                                                        // JavaLine 61 <== SourceLine 484
                                                        if(_VALUE((qty.descr_1==(((CLASS_COMMON_brecord)_inspect_478_4626))))) {
                                                            {
                                                                // JavaLine 64 <== SourceLine 486
                                                                if(_VALUE((blevel<(5)))) {
                                                                    _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_staticencl_Block479_Block499_BIOob_0); // GOTO EVALUATED LABEL
                                                                }
                                                                ;
                                                                // JavaLine 69 <== SourceLine 487
                                                                st_rblev=(RTS_ENVIRONMENT.rank(((CLASS_SCODER1)(_CUR._SL._SL)).crtblev_6)-(RTS_ENVIRONMENT.rank(((CLASS_SCODER1)(_CUR._SL._SL)).display.getELEMENT(blevel).rtblev)));
                                                                ;
                                                                // JavaLine 72 <== SourceLine 489
                                                                _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_staticencl_Block479_Block525_pushit_0); // GOTO EVALUATED LABEL
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 78 <== SourceLine 491
                                                        qty=qty.prefqual_1;
                                                        ;
                                                    }
                                                }
                                                ;
                                                // JavaLine 84 <== SourceLine 493
                                                blevel=(blevel-(1));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 90 <== SourceLine 495
                                        new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)11),495);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 96 <== SourceLine 497
                                blevel=RTS_ENVIRONMENT.rank(_inspect_478_4626.blev);
                                ;
                                // JavaLine 99 <== SourceLine 498
                                if(_VALUE((blevel<(5)))) {
                                    {
                                        // JavaLine 102 <== SourceLine 499
                                        if(_VALUE((new CLASS_BUILDER1_precheck0_getClass(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).checker_5,_inspect_478_4626.declquant,((char)5))._RESULT!=(null)))) {
                                            // JavaLine 104 <== SourceLine 500
                                            {
                                                // JavaLine 106 <== SourceLine 501
                                                st_rblev=(RTS_ENVIRONMENT.rank(((CLASS_SCODER1)(_CUR._SL._SL)).crtblev_6)-(RTS_ENVIRONMENT.rank(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).checker_5.enclLevel)));
                                                ;
                                                // JavaLine 109 <== SourceLine 502
                                                _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_staticencl_Block479_Block525_pushit_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 114 <== SourceLine 503
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: staticencl -> staticencl[externalIdent=CLASS_SCODER1_codegenerator1_staticencl] Kind=5, QUAL=ProcedureDeclaration, HashCode=1548840107
                                            // JavaLine 117 <== SourceLine 505
                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),505,CONC(new RTS_TXT("================================== staticencl: blevel="),RTS_ENVIRONMENT.edit(blevel)));
                                        }
                                        ;
                                        // JavaLine 121 <== SourceLine 506
                                        if(_VALUE((blevel==(4)))) {
                                            {
                                                // JavaLine 124 <== SourceLine 507
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),507,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000S"))._RESULT);
                                                ;
                                                // JavaLine 127 <== SourceLine 508
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),508,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00cf"))._RESULT);
                                                ;
                                            }
                                        } else {
                                            // JavaLine 132 <== SourceLine 509
                                            if(_VALUE((blevel==(3)))) {
                                                {
                                                    // JavaLine 135 <== SourceLine 510
                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),510,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000S"))._RESULT);
                                                    ;
                                                    // JavaLine 138 <== SourceLine 511
                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),511,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00d0"))._RESULT);
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 143 <== SourceLine 513
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),513,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000?"))._RESULT);
                                            }
                                        }
                                        ;
                                        // JavaLine 148 <== SourceLine 515
                                        if(_VALUE((blevel==(4)))) {
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000S")),new RTS_TXT("\u0095")),new RTS_TXT("\u0000\u00cf")));
                                        } else {
                                            // JavaLine 152 <== SourceLine 518
                                            if(_VALUE((blevel==(3)))) {
                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000S")),new RTS_TXT("\u0095")),new RTS_TXT("\u0000\u00d0")));
                                            } else {
                                                // JavaLine 156 <== SourceLine 521
                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u0000?")));
                                            }
                                        }
                                    }
                                } else {
                                    // JavaLine 162 <== SourceLine 524
                                    {
                                        // JavaLine 164 <== SourceLine 525
                                        st_rblev=(RTS_ENVIRONMENT.rank(((CLASS_SCODER1)(_CUR._SL._SL)).crtblev_6)-(RTS_ENVIRONMENT.rank(_inspect_478_4626.rtblev)));
                                        ;
                                        // JavaLine 167 <== SourceLine 526
                                        {
                                            _SIM_LABEL(2); // DeclaredIn: staticencl -> staticencl[externalIdent=CLASS_SCODER1_codegenerator1_staticencl] Kind=5, QUAL=ProcedureDeclaration, HashCode=1548840107
                                            // JavaLine 170 <== SourceLine 531
                                            if(_VALUE((st_rblev<=(5)))) {
                                                // JavaLine 172 <== SourceLine 532
                                                new CLASS_SCODER1_codegenerator1_staticencl_Block479_Block525_Block533((_CUR))._STM();
                                            } else {
                                                // JavaLine 175 <== SourceLine 538
                                                {
                                                    // JavaLine 177 <== SourceLine 539
                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),539,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                                    ;
                                                    // JavaLine 180 <== SourceLine 540
                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")));
                                                    ;
                                                    // JavaLine 183 <== SourceLine 541
                                                    while((st_rblev!=(0))) {
                                                        {
                                                            // JavaLine 186 <== SourceLine 542
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),542,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0090"))._RESULT);
                                                            ;
                                                            // JavaLine 189 <== SourceLine 543
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0096"),new RTS_TXT("\u0000\u0090")));
                                                            ;
                                                            // JavaLine 192 <== SourceLine 544
                                                            st_rblev=(st_rblev-(1));
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 201 <== SourceLine 550
                                        if(_VALUE((_inspect_478_4626.kind==(((char)5))))) {
                                            {
                                                // JavaLine 204 <== SourceLine 551
                                                if(_VALUE((_inspect_478_4626.inspected==(RTS_ENVIRONMENT._char(blevel))))) {
                                                    {
                                                        // JavaLine 207 <== SourceLine 552
                                                        ttag=new CLASS_SCODER1_codegenerator1_conpointtag((_CUR._SL),((CLASS_COMMON_brecord)_inspect_478_4626))._RESULT;
                                                        ;
                                                        // JavaLine 210 <== SourceLine 553
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),553,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),ttag)._RESULT);
                                                        ;
                                                        // JavaLine 213 <== SourceLine 554
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(150);
                                                        ;
                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),ttag);
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                    }
                    else { // OTHERWISE 
                        // JavaLine 230 <== SourceLine 558
                        new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)11),558);
                    } // END OTHERWISE 
                } // END INSPECTION
                ;
                // JavaLine 235 <== SourceLine 559
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4+(1));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 staticencl",1,469,10,505,12,531,15,474,19,475,21,478,42,479,44,478,46,479,49,480,52,481,55,482,58,483,61,484,64,486,69,487,72,489,78,491,84,493,90,495,96,497,99,498,102,499,104,500,106,501,109,502,114,503,117,505,121,506,124,507,127,508,132,509,135,510,138,511,143,513,148,515,152,518,156,521,162,524,164,525,167,526,170,531,172,532,175,538,177,539,180,540,183,541,186,542,189,543,192,544,201,550,204,551,207,552,210,553,213,554,230,558,235,559,247,560);
} // End of Procedure
