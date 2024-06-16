// JavaLine 1 <== SourceLine 503
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_brecord_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=503, lastLine=554, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_dmpmess;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 504
    public COMMON_quantity q=null;
    public COMMON_extbrecord extbrc=null;
    // JavaLine 14 <== SourceLine 507
    public COMMON_quantity _inspect_507_4451=null;
    // JavaLine 16 <== SourceLine 543
    public COMMON_extquantity _inspect_543_4452=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_brecord_dump setPar(Object param) {
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
    public COMMON_brecord_dump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_brecord_dump(RTS_RTObject _SL,RTS_TXT sp_dmpmess) {
        super(_SL);
        // Parameter assignment to locals
        this.p_dmpmess = sp_dmpmess;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_brecord_dump _STM() {
        // JavaLine 46 <== SourceLine 505
        RTS_BASICIO.sysout().outtext(new RTS_TXT("**********  "));
        ;
        RTS_BASICIO.sysout().outtext(p_dmpmess);
        ;
        // JavaLine 51 <== SourceLine 506
        RTS_BASICIO.sysout().outtext(new RTS_TXT("  **********  "));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 56 <== SourceLine 507
        {
            // BEGIN INSPECTION 
            _inspect_507_4451=((COMMON_brecord)(_CUR._SL)).declquant;
            if(_inspect_507_4451!=null) { // INSPECT _inspect_507_4451
                // JavaLine 61 <== SourceLine 508
                {
                    // JavaLine 63 <== SourceLine 507
                    {
                        // JavaLine 65 <== SourceLine 508
                        RTS_BASICIO.sysout().outtext((((_inspect_507_4451.kind_1==(((char)8))))?(new RTS_TXT("BLOCK")):((((_inspect_507_4451.kind_1==(((char)9))))?(new RTS_TXT("PREFB")):((((_inspect_507_4451.symb_1==(null)))?(new RTS_TXT("NOSYMB")):(((TRF_EQ(_inspect_507_4451.symb_1.symbol,null))?(new RTS_TXT("NONAME")):(_inspect_507_4451.symb_1.symbol)))))))));
                        ;
                        // JavaLine 68 <== SourceLine 513
                        if(_VALUE(((_inspect_507_4451.prefqual_1!=(null))&&((_inspect_507_4451.prefqual_1!=(((COMMON_quantity)_inspect_507_4451))))))) {
                            // JavaLine 70 <== SourceLine 514
                            {
                                // JavaLine 72 <== SourceLine 515
                                q=_inspect_507_4451.prefqual_1.descr_1.declquant;
                                ;
                                // JavaLine 75 <== SourceLine 516
                                RTS_BASICIO.sysout().outchar(':');
                                ;
                                // JavaLine 78 <== SourceLine 517
                                if(_VALUE(((q!=(null))&&((_inspect_507_4451.symb_1!=(null)))))) {
                                    // JavaLine 80 <== SourceLine 518
                                    RTS_BASICIO.sysout().outtext(q.symb_1.symbol);
                                } else {
                                    // JavaLine 83 <== SourceLine 519
                                    new COMMON_brecord_outblno(_inspect_507_4451.prefqual_1.descr_1);
                                }
                                ;
                            }
                        }
                    }
                }
            }
            else { // OTHERWISE 
                // JavaLine 93 <== SourceLine 520
                RTS_BASICIO.sysout().outtext(new RTS_TXT("??????"));
            } // END OTHERWISE 
        } // END INSPECTION
        ;
        // JavaLine 98 <== SourceLine 521
        new COMMON_brecord_outblno((_CUR._SL));
        ;
        // JavaLine 101 <== SourceLine 522
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" blev="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_brecord)(_CUR._SL)).blev))));
        ;
        // JavaLine 104 <== SourceLine 523
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" rtblev="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_brecord)(_CUR._SL)).rtblev))));
        ;
        // JavaLine 107 <== SourceLine 524
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" kind="),new COMMON_K_code((_CUR._SL._SL),((COMMON_brecord)(_CUR._SL)).kind)._RESULT));
        ;
        // JavaLine 110 <== SourceLine 525
        RTS_BASICIO.sysout().outint(((COMMON_brecord)(_CUR._SL)).line1,5);
        ;
        // JavaLine 113 <== SourceLine 526
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).npar!=(0)))) {
            {
                // JavaLine 116 <== SourceLine 527
                RTS_BASICIO.sysout().outtext(new RTS_TXT(",NPAR:"));
                ;
                RTS_BASICIO.sysout().outint(((COMMON_brecord)(_CUR._SL)).npar,4);
                ;
            }
        }
        ;
        // JavaLine 124 <== SourceLine 530
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).navirt!=(0)))) {
            {
                // JavaLine 127 <== SourceLine 531
                RTS_BASICIO.sysout().outtext(new RTS_TXT(",NVIR:"));
                ;
                RTS_BASICIO.sysout().outint(((COMMON_brecord)(_CUR._SL)).navirt,4);
                ;
            }
        }
        ;
        // JavaLine 135 <== SourceLine 532
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).connests!=(0)))) {
            {
                // JavaLine 138 <== SourceLine 533
                RTS_BASICIO.sysout().outtext(new RTS_TXT(",Ncon:"));
                ;
                RTS_BASICIO.sysout().outint(((COMMON_brecord)(_CUR._SL)).connests,4);
                ;
            }
        }
        ;
        // JavaLine 146 <== SourceLine 534
        if(_VALUE(((COMMON_brecord)(_CUR._SL)).localclasses)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" LC"));
        }
        ;
        // JavaLine 151 <== SourceLine 535
        if(_VALUE(((COMMON_brecord)(_CUR._SL)).thisused)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" TU"));
        }
        ;
        // JavaLine 156 <== SourceLine 536
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).dcltag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" D"));
        }
        ;
        // JavaLine 161 <== SourceLine 537
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).stmtag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" S"));
        }
        ;
        // JavaLine 166 <== SourceLine 538
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).inrtag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" I"));
        }
        ;
        // JavaLine 171 <== SourceLine 539
        if(_VALUE(_IS(((COMMON_brecord)(_CUR._SL)),COMMON_extbrecord.class))) {
            {
                // JavaLine 174 <== SourceLine 540
                extbrc=((COMMON_extbrecord)(((COMMON_brecord)(_CUR._SL))));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("  EXTBRECORD "),new COMMON_nameof((_CUR._SL._SL),extbrc.checkhi_1,extbrc.checklo_1)._RESULT),new RTS_TXT("  ")));
                ;
                // JavaLine 181 <== SourceLine 542
                RTS_BASICIO.sysout().outchar(extbrc.status_1);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                ;
                // JavaLine 186 <== SourceLine 543
                {
                    // BEGIN INSPECTION 
                    _inspect_543_4452=extbrc.cause_1;
                    if(_inspect_543_4452!=null) { // INSPECT _inspect_543_4452
                        {
                            RTS_BASICIO.sysout().outtext(_inspect_543_4452.symb_1.symbol);
                        }
                    }
                } // END INSPECTION
                ;
            }
        }
        ;
        // JavaLine 200 <== SourceLine 545
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).fpar!=(null)))) {
            {
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 205 <== SourceLine 546
                RTS_BASICIO.sysout().outtext(new RTS_TXT("*** PAR:"));
                ;
                q=((COMMON_brecord)(_CUR._SL)).fpar;
                ;
                // JavaLine 210 <== SourceLine 547
                while((q!=(null))) {
                    {
                        new COMMON_quantity_dump(q);
                        ;
                        q=((COMMON_quantity)(q.next));
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 222 <== SourceLine 549
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).favirt!=(null)))) {
            {
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 227 <== SourceLine 550
                RTS_BASICIO.sysout().outtext(new RTS_TXT("*** VIR:"));
                ;
                q=((COMMON_brecord)(_CUR._SL)).favirt;
                ;
                // JavaLine 232 <== SourceLine 551
                while((q!=(null))) {
                    {
                        new COMMON_quantity_dump(q);
                        ;
                        q=((COMMON_quantity)(q.next));
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 244 <== SourceLine 553
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("*** END "),p_dmpmess));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 dump",1,503,11,504,14,507,16,543,46,505,51,506,56,507,61,508,63,507,65,508,68,513,70,514,72,515,75,516,78,517,80,518,83,519,93,520,98,521,101,522,104,523,107,524,110,525,113,526,116,527,124,530,127,531,135,532,138,533,146,534,151,535,156,536,161,537,166,538,171,539,174,540,181,542,186,543,200,545,205,546,210,547,222,549,227,550,232,551,244,553,251,554);
} // End of Procedure
