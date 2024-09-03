// JavaLine 1 <== SourceLine 2616
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_enterblock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=2616, lastLine=2632, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 2619
    public CLASS_COMMON_brctab2 _inspect_2619_4584=null;
    // JavaLine 12 <== SourceLine 2620
    public CLASS_COMMON_brecord _inspect_2620_4585=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_enterblock(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_enterblock _STM() {
        // JavaLine 25 <== SourceLine 2617
        ((CLASS_CHECKER1)(_CUR._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_CHECKER1)(_CUR._SL._SL)).cblev_6)+(1)));
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_CHECKER1)(_CUR._SL._SL)).crtblev_6)+(1)));
        ;
        // JavaLine 30 <== SourceLine 2618
        if(_VALUE((RTS_ENVIRONMENT.rank(((CLASS_CHECKER1)(_CUR._SL._SL)).cblev_6)>(250)))) {
            new CLASS_ERRMSG_fatal0((_CUR._SL._SL),299);
        }
        ;
        // JavaLine 35 <== SourceLine 2619
        {
            // BEGIN INSPECTION 
            _inspect_2619_4584=((CLASS_CHECKER1)(_CUR._SL._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).lastblhi));
            if(_inspect_2619_4584!=null) { // INSPECT _inspect_2619_4584  type=ref(BRCTAB2)
                // JavaLine 40 <== SourceLine 2620
                {
                    // JavaLine 42 <== SourceLine 2619
                    {
                        // JavaLine 44 <== SourceLine 2620
                        {
                            // BEGIN INSPECTION 
                            _inspect_2620_4585=_inspect_2619_4584.val.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).lastbllo));
                            if(_inspect_2620_4585!=null) { // INSPECT _inspect_2620_4585  type=ref(BRECORD)
                                // JavaLine 49 <== SourceLine 2621
                                {
                                    // JavaLine 51 <== SourceLine 2620
                                    {
                                        // JavaLine 53 <== SourceLine 2621
                                        if(_VALUE((_inspect_2620_4585.kind==(((char)5))))) {
                                            {
                                                // JavaLine 56 <== SourceLine 2622
                                                if(_VALUE((_inspect_2620_4585.declquant.plev_1>(1)))) {
                                                    // JavaLine 58 <== SourceLine 2623
                                                    new CLASS_BUILDER1_precheck0_hide((_CUR._SL),_inspect_2620_4585.declquant.prefqual_1,false);
                                                }
                                                ;
                                                // JavaLine 62 <== SourceLine 2624
                                                new CLASS_BUILDER1_precheck0_unprotect((_CUR._SL),_inspect_2620_4585.declquant);
                                                ;
                                            }
                                        } else {
                                            // JavaLine 67 <== SourceLine 2626
                                            if(_VALUE((_inspect_2620_4585.kind==(((char)9))))) {
                                                new CLASS_BUILDER1_precheck0_hide((_CUR._SL),_inspect_2620_4585.declquant.prefqual_1,false);
                                            }
                                        }
                                        ;
                                        // JavaLine 73 <== SourceLine 2627
                                        new CLASS_BUILDER1_precheck0_makevisblock((_CUR._SL),((CLASS_COMMON_brecord)_inspect_2620_4585));
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                        // JavaLine 81 <== SourceLine 2629
                        _inspect_2619_4584.val.putELEMENT(_inspect_2619_4584.val.index(RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).lastbllo)),null);
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 enterblock",1,2616,10,2619,12,2620,25,2617,30,2618,35,2619,40,2620,42,2619,44,2620,49,2621,51,2620,53,2621,56,2622,58,2623,62,2624,67,2626,73,2627,81,2629,91,2632);
} // End of Procedure
