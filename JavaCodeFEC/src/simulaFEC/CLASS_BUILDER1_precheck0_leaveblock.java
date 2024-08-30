// JavaLine 1 <== SourceLine 472
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_leaveblock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=472, lastLine=499, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 487
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_leaveblock_Block481_enter_0=new RTS_LABEL(this,0,1,"enter"); // Local Label #1=enter At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 474
    public CLASS_COMMON_quantity q=null;
    public CLASS_COMMON_quantity visq=null;
    // JavaLine 16 <== SourceLine 475
    public int insp=0;
    public int lowpl=0;
    // JavaLine 19 <== SourceLine 477
    public boolean invirts=false;
    // JavaLine 21 <== SourceLine 480
    public CLASS_COMMON_brecord _inspect_480_4531=null;
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_leaveblock(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_leaveblock _STM() {
        CLASS_BUILDER1_precheck0_leaveblock _THIS=(CLASS_BUILDER1_precheck0_leaveblock)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_480_4531=((CLASS_BUILDER1)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6));
                    if(_inspect_480_4531!=null) { // INSPECT _inspect_480_4531  type=ref(BRECORD)
                        // JavaLine 42 <== SourceLine 481
                        {
                            // JavaLine 44 <== SourceLine 480
                            {
                                // JavaLine 46 <== SourceLine 481
                                q=_inspect_480_4531.declquant;
                                ;
                                // JavaLine 49 <== SourceLine 482
                                if(_VALUE((q.kind_1==(((char)5))))) {
                                    lowpl=0;
                                } else {
                                    // JavaLine 53 <== SourceLine 483
                                    if(_VALUE((q.kind_1==(((char)9))))) {
                                        lowpl=0;
                                    } else {
                                        lowpl=1;
                                    }
                                }
                                ;
                                // JavaLine 61 <== SourceLine 484
                                ((CLASS_BUILDER1)(_CUR._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).crtblev_6)-(1)));
                                ;
                                // JavaLine 64 <== SourceLine 485
                                invirts=true;
                                ;
                                visq=_inspect_480_4531.favirt;
                                ;
                                // JavaLine 69 <== SourceLine 486
                                {
                                    _SIM_LABEL(1); // DeclaredIn: leaveblock -> leaveblock[externalIdent=CLASS_BUILDER1_precheck0_leaveblock] Kind=5, QUAL=ProcedureDeclaration, HashCode=2115824028
                                    // JavaLine 72 <== SourceLine 487
                                    new CLASS_BUILDER1_precheck0_invischain((_CUR._SL),visq);
                                }
                                ;
                                // JavaLine 76 <== SourceLine 488
                                if(_VALUE(invirts)) {
                                    {
                                        // JavaLine 79 <== SourceLine 489
                                        invirts=false;
                                        ;
                                        visq=_inspect_480_4531.fpar;
                                        ;
                                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_leaveblock_Block481_enter_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 88 <== SourceLine 490
                                if(_VALUE((q.plev_1>(lowpl)))) {
                                    {
                                        // JavaLine 91 <== SourceLine 492
                                        q=q.prefqual_1;
                                        ;
                                        visq=q.descr_1.fpar;
                                        ;
                                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_leaveblock_Block481_enter_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 100 <== SourceLine 494
                                if(_VALUE((_inspect_480_4531.kind==(((char)5))))) {
                                    new CLASS_BUILDER1_precheck0_protect((_CUR._SL),_inspect_480_4531.declquant);
                                } else {
                                    // JavaLine 104 <== SourceLine 495
                                    if(_VALUE((_inspect_480_4531.kind==(((char)9))))) {
                                        new CLASS_BUILDER1_precheck0_protect((_CUR._SL),_inspect_480_4531.declquant.prefqual_1);
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 115 <== SourceLine 497
                ((CLASS_BUILDER1)(_CUR._SL._SL)).display.putELEMENT(((CLASS_BUILDER1)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6)),null);
                ;
                ((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6)-(1)));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 leaveblock",1,472,10,487,13,474,16,475,19,477,21,480,42,481,44,480,46,481,49,482,53,483,61,484,64,485,69,486,72,487,76,488,79,489,88,490,91,492,100,494,104,495,115,497,129,499);
} // End of Procedure
