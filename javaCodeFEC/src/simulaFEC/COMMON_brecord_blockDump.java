// JavaLine 1 <== SourceLine 449
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_brecord_blockDump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=449, lastLine=499, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_dmpmess;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 454
    public COMMON_quantity q=null;
    // JavaLine 13 <== SourceLine 461
    public COMMON_quantity _inspect_461_4448=null;
    // JavaLine 15 <== SourceLine 484
    public COMMON_brecord _inspect_484_4449=null;
    // JavaLine 17 <== SourceLine 487
    public COMMON_extquantity _inspect_487_4450=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_brecord_blockDump setPar(Object param) {
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
    public COMMON_brecord_blockDump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_brecord_blockDump(RTS_RTObject _SL,RTS_TXT sp_dmpmess) {
        super(_SL);
        // Parameter assignment to locals
        this.p_dmpmess = sp_dmpmess;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_brecord_blockDump _STM() {
        // JavaLine 47 <== SourceLine 456
        RTS_BASICIO.sysout().outtext(CONC(CONC(p_dmpmess,new RTS_TXT("BLK ")),new RTS_TXT(" ")));
        ;
        // JavaLine 50 <== SourceLine 461
        {
            // BEGIN INSPECTION 
            _inspect_461_4448=((COMMON_brecord)(_CUR._SL)).declquant;
            if(_inspect_461_4448!=null) { // INSPECT _inspect_461_4448
                // JavaLine 55 <== SourceLine 462
                {
                    // JavaLine 57 <== SourceLine 461
                    {
                        // JavaLine 59 <== SourceLine 462
                        RTS_BASICIO.sysout().outtext(new COMMON_K_code((_CUR._SL._SL),_inspect_461_4448.kind_1)._RESULT);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                        ;
                        // JavaLine 64 <== SourceLine 463
                        if(_VALUE((_inspect_461_4448.symb_1!=(null)))) {
                            RTS_BASICIO.sysout().outtext(_inspect_461_4448.symb_1.symbol);
                        }
                        ;
                        // JavaLine 69 <== SourceLine 464
                        if(_VALUE((_inspect_461_4448.prefqual_1!=(null)))) {
                            {
                                RTS_BASICIO.sysout().outtext(new RTS_TXT(":"));
                                ;
                                // JavaLine 74 <== SourceLine 465
                                if(_VALUE((_inspect_461_4448.prefqual_1.symb_1!=(null)))) {
                                    // JavaLine 76 <== SourceLine 466
                                    RTS_BASICIO.sysout().outtext(_inspect_461_4448.prefqual_1.symb_1.symbol);
                                } else {
                                    // JavaLine 79 <== SourceLine 467
                                    new COMMON_brecord_blockDump_outblno((_CUR),_inspect_461_4448.prefqual_1.encl_1);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 86 <== SourceLine 469
                        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 94 <== SourceLine 472
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" blev="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_brecord)(_CUR._SL)).blev))));
        ;
        // JavaLine 97 <== SourceLine 473
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" rtblev="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_brecord)(_CUR._SL)).rtblev))));
        ;
        // JavaLine 100 <== SourceLine 474
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" npar="),RTS_ENVIRONMENT.edit(((COMMON_brecord)(_CUR._SL)).npar)));
        ;
        // JavaLine 103 <== SourceLine 476
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).navirt!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" navirt="),RTS_ENVIRONMENT.edit(((COMMON_brecord)(_CUR._SL)).navirt)));
        }
        ;
        // JavaLine 108 <== SourceLine 477
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).connests!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT(" connests="),RTS_ENVIRONMENT.edit(((COMMON_brecord)(_CUR._SL)).connests)));
        }
        ;
        // JavaLine 113 <== SourceLine 478
        if(_VALUE(((COMMON_brecord)(_CUR._SL)).localclasses)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" localclasses"));
        }
        ;
        // JavaLine 118 <== SourceLine 479
        if(_VALUE(((COMMON_brecord)(_CUR._SL)).thisused)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" thisused"));
        }
        ;
        // JavaLine 123 <== SourceLine 481
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).dcltag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" D"));
        }
        ;
        // JavaLine 128 <== SourceLine 482
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).stmtag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" S"));
        }
        ;
        // JavaLine 133 <== SourceLine 483
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).inrtag>(((char)0))))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT(" I"));
        }
        ;
        // JavaLine 138 <== SourceLine 484
        {
            // BEGIN INSPECTION 
            _inspect_484_4449=((COMMON_brecord)(_CUR._SL));
            if(_inspect_484_4449 instanceof COMMON_extbrecord) { // WHEN COMMON_extbrecord DO 
                // JavaLine 143 <== SourceLine 485
                {
                    // JavaLine 145 <== SourceLine 484
                    {
                        // JavaLine 147 <== SourceLine 485
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  EXTBRECORD "));
                        ;
                        // JavaLine 152 <== SourceLine 486
                        RTS_BASICIO.sysout().outchar(((COMMON_extbrecord)(_inspect_484_4449)).status_1);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        // JavaLine 157 <== SourceLine 487
                        {
                            // BEGIN INSPECTION 
                            _inspect_487_4450=((COMMON_extbrecord)(_inspect_484_4449)).cause_1;
                            if(_inspect_487_4450!=null) { // INSPECT _inspect_487_4450
                                {
                                    RTS_BASICIO.sysout().outtext(_inspect_487_4450.symb_1.symbol);
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 173 <== SourceLine 489
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).fpar!=(null)))) {
            {
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 178 <== SourceLine 490
                RTS_BASICIO.sysout().outtext(CONC(RTS_ENVIRONMENT.blanks((3*(((COMMON)(_CUR._SL._SL)).indent))),new RTS_TXT("*** PAR:")));
                ;
                q=((COMMON_brecord)(_CUR._SL)).fpar;
                ;
                // JavaLine 183 <== SourceLine 491
                while((q!=(null))) {
                    {
                        new COMMON_quantity_quantDump(q,p_dmpmess);
                        ;
                        q=((COMMON_quantity)(q.next));
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 195 <== SourceLine 493
        if(_VALUE((((COMMON_brecord)(_CUR._SL)).favirt!=(null)))) {
            {
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 200 <== SourceLine 494
                RTS_BASICIO.sysout().outtext(CONC(RTS_ENVIRONMENT.blanks((3*(((COMMON)(_CUR._SL._SL)).indent))),new RTS_TXT("*** VIR:")));
                ;
                q=((COMMON_brecord)(_CUR._SL)).favirt;
                ;
                // JavaLine 205 <== SourceLine 495
                while((q!=(null))) {
                    {
                        new COMMON_quantity_quantDump(q,p_dmpmess);
                        ;
                        q=((COMMON_quantity)(q.next));
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 217 <== SourceLine 498
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 blockDump",1,449,11,454,13,461,15,484,17,487,47,456,50,461,55,462,57,461,59,462,64,463,69,464,74,465,76,466,79,467,86,469,94,472,97,473,100,474,103,476,108,477,113,478,118,479,123,481,128,482,133,483,138,484,143,485,145,484,147,485,152,486,157,487,173,489,178,490,183,491,195,493,200,494,205,495,217,498,222,499);
} // End of Procedure
