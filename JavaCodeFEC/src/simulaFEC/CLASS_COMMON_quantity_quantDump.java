// JavaLine 1 <== SourceLine 671
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_quantity_quantDump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=671, lastLine=700, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_dmpmess;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 694
    public CLASS_COMMON_quantity _inspect_694_4453=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_quantity_quantDump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_dmpmess=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_quantity_quantDump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_quantity_quantDump(RTS_RTObject _SL,RTS_TXT sp_dmpmess) {
        super(_SL);
        // Parameter assignment to locals
        this.p_dmpmess = sp_dmpmess;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_quantity_quantDump _STM() {
        // JavaLine 41 <== SourceLine 677
        RTS_BASICIO.sysout().outtext(CONC(CONC(p_dmpmess,new RTS_TXT("QNT ")),new RTS_TXT(" ")));
        ;
        // JavaLine 44 <== SourceLine 678
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("kind="),new CLASS_COMMON_K_code((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).kind_1)._RESULT));
        ;
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
        ;
        // JavaLine 49 <== SourceLine 679
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).symb_1!=(null)))) {
            RTS_BASICIO.sysout().outtext(((CLASS_COMMON_quantity)(_CUR._SL)).symb_1.symbol);
        }
        ;
        // JavaLine 54 <== SourceLine 680
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1!=(null)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(":"));
                ;
                // JavaLine 59 <== SourceLine 681
                if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.symb_1!=(null)))) {
                    // JavaLine 61 <== SourceLine 682
                    RTS_BASICIO.sysout().outtext(((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.symb_1.symbol);
                } else {
                    // JavaLine 64 <== SourceLine 683
                    new CLASS_COMMON_quantity_quantDump_outblno((_CUR),((CLASS_COMMON_quantity)(_CUR._SL)).prefqual_1.encl_1);
                }
                ;
            }
        }
        ;
        // JavaLine 71 <== SourceLine 685
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
        ;
        // JavaLine 74 <== SourceLine 686
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).ftag_1!=(0)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" ftag="));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).ftag_1,0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 86 <== SourceLine 687
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).type_1!=(((char)14))))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" type="));
                ;
                RTS_BASICIO.sysout().outtext(new CLASS_COMMON_edType((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).type_1)._RESULT);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 98 <== SourceLine 688
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).categ_1!=(((char)0))))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" categ="));
                ;
                RTS_BASICIO.sysout().outtext(new CLASS_COMMON_C_code((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).categ_1)._RESULT);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 110 <== SourceLine 689
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).special_1!=(((char)0))))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" special=:"));
                ;
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_quantity)(_CUR._SL)).special_1),0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 122 <== SourceLine 690
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).protect_1!=(((char)0))))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" protect:"));
                ;
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_quantity)(_CUR._SL)).protect_1),0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 134 <== SourceLine 691
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).visible_1!=(((char)0))))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" visible:"));
                ;
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_quantity)(_CUR._SL)).visible_1),0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 146 <== SourceLine 692
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).dim_1!=(0)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" dim:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).dim_1,0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 158 <== SourceLine 693
        if(_VALUE((((CLASS_COMMON_quantity)(_CUR._SL)).virtno_1!=(0)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" virtno:"));
                ;
                RTS_BASICIO.sysout().outint(((CLASS_COMMON_quantity)(_CUR._SL)).virtno_1,0);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                ;
            }
        }
        ;
        // JavaLine 170 <== SourceLine 694
        {
            // BEGIN INSPECTION 
            _inspect_694_4453=((CLASS_COMMON_quantity)(_CUR._SL));
            if(_inspect_694_4453 instanceof CLASS_COMMON_extquantity) { // WHEN CLASS_COMMON_extquantity DO 
                // JavaLine 175 <== SourceLine 695
                {
                    // JavaLine 177 <== SourceLine 694
                    {
                        // JavaLine 179 <== SourceLine 695
                        if(_VALUE((((CLASS_COMMON_extquantity)(_inspect_694_4453)).clf_2!=(((char)0))))) {
                            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT(" clf="),new CLASS_COMMON_Cl_code((_CUR._SL._SL),((CLASS_COMMON_extquantity)(_inspect_694_4453)).clf_2)._RESULT),new RTS_TXT(" ")));
                        }
                        ;
                        // JavaLine 184 <== SourceLine 696
                        if(_VALUE((((CLASS_COMMON_extquantity)(_inspect_694_4453)).longindic_2!=(((char)0))))) {
                            {
                                RTS_BASICIO.sysout().outtext(new RTS_TXT(" longindic="));
                                ;
                                // JavaLine 189 <== SourceLine 697
                                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(((CLASS_COMMON_extquantity)(_inspect_694_4453)).longindic_2),0);
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 199 <== SourceLine 699
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 quantDump",1,671,11,694,41,677,44,678,49,679,54,680,59,681,61,682,64,683,71,685,74,686,86,687,98,688,110,689,122,690,134,691,146,692,158,693,170,694,175,695,177,694,179,695,184,696,189,697,199,699,204,700);
} // End of Procedure
