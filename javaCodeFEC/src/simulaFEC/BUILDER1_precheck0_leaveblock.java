// JavaLine 1 <== SourceLine 467
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_leaveblock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=467, lastLine=494, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 482
    final RTS_LABEL _LABEL_BUILDER1_precheck0_leaveblock_Block476_enter_0=new RTS_LABEL(this,0,1,"enter"); // Local Label #1=enter At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 469
    public COMMON_quantity q=null;
    public COMMON_quantity visq=null;
    // JavaLine 16 <== SourceLine 470
    public int insp=0;
    public int lowpl=0;
    // JavaLine 19 <== SourceLine 472
    public boolean invirts=false;
    // JavaLine 21 <== SourceLine 475
    public COMMON_brecord _inspect_475_4531=null;
    // Normal Constructor
    public BUILDER1_precheck0_leaveblock(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_leaveblock _STM() {
        BUILDER1_precheck0_leaveblock _THIS=(BUILDER1_precheck0_leaveblock)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_475_4531=((BUILDER1)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((BUILDER1)(_CUR._SL._SL)).cblev_6));
                    if(_inspect_475_4531!=null) { // INSPECT _inspect_475_4531
                        // JavaLine 42 <== SourceLine 476
                        {
                            // JavaLine 44 <== SourceLine 475
                            {
                                // JavaLine 46 <== SourceLine 476
                                q=_inspect_475_4531.declquant;
                                ;
                                // JavaLine 49 <== SourceLine 477
                                if(_VALUE((q.kind_1==(((char)5))))) {
                                    lowpl=0;
                                } else {
                                    // JavaLine 53 <== SourceLine 478
                                    if(_VALUE((q.kind_1==(((char)9))))) {
                                        lowpl=0;
                                    } else {
                                        lowpl=1;
                                    }
                                }
                                ;
                                // JavaLine 61 <== SourceLine 479
                                ((BUILDER1)(_CUR._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER1)(_CUR._SL._SL)).crtblev_6)-(1)));
                                ;
                                // JavaLine 64 <== SourceLine 480
                                invirts=true;
                                ;
                                visq=_inspect_475_4531.favirt;
                                ;
                                // JavaLine 69 <== SourceLine 481
                                {
                                    _SIM_LABEL(1); // DeclaredIn: leaveblock -> leaveblock[externalIdent=BUILDER1_precheck0_leaveblock] Kind=5, QUAL=ProcedureDeclaration, HashCode=1433035552
                                    // JavaLine 72 <== SourceLine 482
                                    new BUILDER1_precheck0_invischain((_CUR._SL),visq);
                                }
                                ;
                                // JavaLine 76 <== SourceLine 483
                                if(_VALUE(invirts)) {
                                    {
                                        // JavaLine 79 <== SourceLine 484
                                        invirts=false;
                                        ;
                                        visq=_inspect_475_4531.fpar;
                                        ;
                                        _GOTO(_LABEL_BUILDER1_precheck0_leaveblock_Block476_enter_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 88 <== SourceLine 485
                                if(_VALUE((q.plev_1>(lowpl)))) {
                                    {
                                        // JavaLine 91 <== SourceLine 487
                                        q=q.prefqual_1;
                                        ;
                                        visq=q.descr_1.fpar;
                                        ;
                                        _GOTO(_LABEL_BUILDER1_precheck0_leaveblock_Block476_enter_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 100 <== SourceLine 489
                                if(_VALUE((_inspect_475_4531.kind==(((char)5))))) {
                                    new BUILDER1_precheck0_protect((_CUR._SL),_inspect_475_4531.declquant);
                                } else {
                                    // JavaLine 104 <== SourceLine 490
                                    if(_VALUE((_inspect_475_4531.kind==(((char)9))))) {
                                        new BUILDER1_precheck0_protect((_CUR._SL),_inspect_475_4531.declquant.prefqual_1);
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 115 <== SourceLine 492
                ((BUILDER1)(_CUR._SL._SL)).display.putELEMENT(((BUILDER1)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((BUILDER1)(_CUR._SL._SL)).cblev_6)),null);
                ;
                ((BUILDER1)(_CUR._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER1)(_CUR._SL._SL)).cblev_6)-(1)));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 leaveblock",1,467,10,482,13,469,16,470,19,472,21,475,42,476,44,475,46,476,49,477,53,478,61,479,64,480,69,481,72,482,76,483,79,484,88,485,91,487,100,489,104,490,115,492,129,494);
} // End of Procedure
