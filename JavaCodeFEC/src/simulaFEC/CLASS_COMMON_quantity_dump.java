// JavaLine 1 <== SourceLine 702
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_quantity_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=702, lastLine=757, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 711
    public boolean linesh=false;
    // JavaLine 12 <== SourceLine 748
    public CLASS_COMMON_quantity _inspect_748_4454=null;
    // Normal Constructor
    public CLASS_COMMON_quantity_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_quantity_dump _STM() {
        // JavaLine 25 <== SourceLine 711
        linesh=true;
        ;
        // JavaLine 28 <== SourceLine 712
        RTS_BASICIO.sysout().outtext((((((CLASS_COMMON_quantity)(_CUR._SL)).kind_1==(((char)8))))?(new RTS_TXT("BLOCK")):((((((CLASS_COMMON_quantity)(_CUR._SL)).kind_1==(((char)9))))?(new RTS_TXT("PREFB")):((((((CLASS_COMMON_quantity)(_CUR._SL)).symb_1==(null)))?(new RTS_TXT("NOSYMB")):(((RTS_UTIL.TRF_EQ(((CLASS_COMMON_quantity)(_CUR._SL)).symb_1.symbol,null))?(new RTS_TXT("NONAME")):(((CLASS_COMMON_quantity)(_CUR._SL)).symb_1.symbol)))))))));
        ;
        // JavaLine 31 <== SourceLine 717
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1!=(null)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(":"));
                ;
                // JavaLine 36 <== SourceLine 718
                if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.symb_1!=(null)))) {
                    // JavaLine 38 <== SourceLine 719
                    RTS_BASICIO.sysout().outtext(((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.symb_1.symbol);
                } else {
                    // JavaLine 41 <== SourceLine 720
                    new CLASS_COMMON_quantity_dump_outblno((_CUR),((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.encl_1);
                }
                ;
            }
        }
        ;
        // JavaLine 48 <== SourceLine 722
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" l."));
        ;
        RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).line_1,0);
        ;
        new CLASS_COMMON_quantity_dump_outblno((_CUR),((CLASS_COMMON_quantity)(_CUR._SL)).encl_1);
        ;
        // JavaLine 55 <== SourceLine 723
        RTS_BASICIO.sysout().outchar(((char)32));
        ;
        RTS_BASICIO.sysout().outtext(((CLASS_COMMON)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_COMMON_quantity)(_CUR._SL)).type_1)));
        ;
        // JavaLine 60 <== SourceLine 724
        RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(new RTS_TXT(" "),new CLASS_COMMON_K_code((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).kind_1)._RESULT),new RTS_TXT(" ")),new CLASS_COMMON_C_code((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).categ_1)._RESULT));
        ;
        // JavaLine 63 <== SourceLine 725
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).plev_1!=(0)))) {
            {
                // JavaLine 66 <== SourceLine 726
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" plev:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).plev_1,0);
                ;
            }
        }
        ;
        // JavaLine 74 <== SourceLine 727
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).ftag_1!=(0)))) {
            {
                // JavaLine 77 <== SourceLine 728
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" tag:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).ftag_1,0);
                ;
            }
        }
        ;
        // JavaLine 85 <== SourceLine 729
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).dim_1!=(0)))) {
            {
                // JavaLine 88 <== SourceLine 730
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" dim:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).dim_1,0);
                ;
            }
        }
        ;
        // JavaLine 96 <== SourceLine 731
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).virtno_1!=(0)))) {
            {
                // JavaLine 99 <== SourceLine 732
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" vir:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).virtno_1,0);
                ;
            }
        }
        ;
        // JavaLine 107 <== SourceLine 733
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).protect_1==(((char)1))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" P"));
        }
        ;
        // JavaLine 112 <== SourceLine 734
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).visible_1!=(((char)0))))) {
            {
                // JavaLine 115 <== SourceLine 735
                if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).protect_1==(((char)0))))) {
                    RTS_BASICIO.sysout().outtext(new RTS_TXT(" V"));
                }
                ;
                // JavaLine 120 <== SourceLine 736
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_quantity)(_CUR._SL)).visible_1),0);
            }
        }
        ;
        // JavaLine 125 <== SourceLine 737
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).match_1!=(null)))) {
            {
                new CLASS_COMMON_quantity_dump_NL((_CUR));
                ;
                // JavaLine 130 <== SourceLine 738
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" MATCH:"));
                ;
                if(_VALUE(((((CLASS_COMMON_quantity)(_CUR._SL)).match_1.encl_1!=(null))&&((((CLASS_COMMON_quantity)(_CUR._SL)).match_1.encl_1.declquant!=(null)))))) {
                    // JavaLine 134 <== SourceLine 740
                    RTS_BASICIO.sysout().outtext(((CLASS_COMMON_quantity)(_CUR._SL)).match_1.encl_1.declquant.symb_1.symbol);
                } else {
                    // JavaLine 137 <== SourceLine 741
                    new CLASS_COMMON_quantity_dump_outblno((_CUR),((CLASS_COMMON_quantity)(_CUR._SL)).match_1.encl_1);
                }
                ;
            }
        }
        ;
        // JavaLine 144 <== SourceLine 743
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).descr_1!=(null)))) {
            {
                // JavaLine 147 <== SourceLine 744
                if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).special_1!=(((char)0))))) {
                    RTS_BASICIO.sysout().outtext(new RTS_TXT(" SPECIAL "));
                }
                ;
                // JavaLine 152 <== SourceLine 745
                if(_VALUE(((((CLASS_COMMON_quantity)(_CUR._SL)).kind_1!=(((char)1)))&((((CLASS_COMMON_quantity)(_CUR._SL)).kind_1!=(((char)5))))))) {
                    // JavaLine 154 <== SourceLine 746
                    new CLASS_COMMON_brecord_dump(((CLASS_COMMON_quantity)(_CUR._SL)).descr_1,new RTS_TXT(" DESCR "));
                } else {
                    new CLASS_COMMON_quantity_dump_outblno((_CUR),((CLASS_COMMON_quantity)(_CUR._SL)).descr_1);
                }
                ;
            }
        }
        ;
        // JavaLine 163 <== SourceLine 748
        {
            // BEGIN INSPECTION 
            _inspect_748_4454=((CLASS_COMMON_quantity)(_CUR._SL));
            if(_inspect_748_4454 instanceof CLASS_COMMON_extquantity) { // WHEN CLASS_COMMON_extquantity DO 
                {
                    {
                        new CLASS_COMMON_quantity_dump_NL((_CUR));
                        ;
                        // JavaLine 172 <== SourceLine 749
                        if(_VALUE((((CLASS_COMMON_extquantity)(_inspect_748_4454)).p2_module!=(null)))) {
                            // JavaLine 174 <== SourceLine 750
                            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" MODUL:"),((CLASS_COMMON_extquantity)(_inspect_748_4454)).p2_module.declquant.symb_1.symbol));
                        }
                        ;
                        // JavaLine 178 <== SourceLine 752
                        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" Clf:"),new CLASS_COMMON_Cl_code((_CUR._SL._SL),((CLASS_COMMON_extquantity)(_inspect_748_4454)).clf_2)._RESULT));
                        ;
                        // JavaLine 181 <== SourceLine 753
                        if(_VALUE((((CLASS_COMMON_extquantity)(_inspect_748_4454)).longindic_2!=(((char)0))))) {
                            {
                                RTS_BASICIO.sysout().outtext(new RTS_TXT(" LIX:"));
                                ;
                                // JavaLine 186 <== SourceLine 754
                                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_extquantity)(_inspect_748_4454)).longindic_2),0);
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 196 <== SourceLine 756
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 dump",1,702,10,711,12,748,25,711,28,712,31,717,36,718,38,719,41,720,48,722,55,723,60,724,63,725,66,726,74,727,77,728,85,729,88,730,96,731,99,732,107,733,112,734,115,735,120,736,125,737,130,738,134,740,137,741,144,743,147,744,152,745,154,746,163,748,172,749,174,750,178,752,181,753,186,754,196,756,201,757);
} // End of Procedure
