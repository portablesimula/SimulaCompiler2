// JavaLine 1 <== SourceLine 408
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_makevisblock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=408, lastLine=453, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_brecord p_brc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 421
    final RTS_LABEL _LABEL_BUILDER1_precheck0_makevisblock_enter_0=new RTS_LABEL(this,0,1,"enter"); // Local Label #1=enter At PrefixLevel 0
    // JavaLine 13 <== SourceLine 439
    final RTS_LABEL _LABEL_BUILDER1_precheck0_makevisblock_Block423_Block425_Block429_Block439_STACK_0=new RTS_LABEL(this,0,2,"STACK"); // Local Label #2=STACK At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 411
    public COMMON_quantity qz=null;
    public COMMON_quantity q=null;
    // JavaLine 19 <== SourceLine 412
    public int lowpl=0;
    // JavaLine 21 <== SourceLine 414
    public char qblev=0;
    // JavaLine 23 <== SourceLine 424
    public COMMON_identsymbol _inspect_423_4529=null;
    // JavaLine 25 <== SourceLine 439
    public COMMON_sembox _inspect_439_4530=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_makevisblock setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_makevisblock(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_makevisblock(RTS_RTObject _SL,COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_makevisblock _STM() {
        BUILDER1_precheck0_makevisblock _THIS=(BUILDER1_precheck0_makevisblock)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 59 <== SourceLine 416
                ((BUILDER1)(_CUR._SL._SL)).display.putELEMENT(((BUILDER1)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((BUILDER1)(_CUR._SL._SL)).cblev_6)),p_brc);
                ;
                // JavaLine 62 <== SourceLine 417
                q=p_brc.declquant;
                ;
                qblev=p_brc.blev;
                ;
                // JavaLine 67 <== SourceLine 418
                if(_VALUE((q.kind_1==(((char)5))))) {
                    lowpl=0;
                } else {
                    // JavaLine 71 <== SourceLine 419
                    if(_VALUE((q.kind_1==(((char)9))))) {
                        lowpl=0;
                    } else {
                        lowpl=1;
                    }
                }
                ;
                // JavaLine 79 <== SourceLine 420
                new BUILDER1_precheck0_vischain((_CUR._SL),p_brc.favirt,qz);
                ;
                // JavaLine 82 <== SourceLine 421
                {
                    _SIM_LABEL(1); // DeclaredIn: makevisblock
                    qz=q.descr_1.fpar;
                }
                ;
                // JavaLine 88 <== SourceLine 422
                while((qz!=(null))) {
                    {
                        // JavaLine 91 <== SourceLine 423
                        if(_VALUE((qz.visible_1==(((char)0))))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_423_4529=((COMMON_identsymbol)(qz.symb_1));
                                if(_inspect_423_4529!=null) { // INSPECT _inspect_423_4529
                                    // JavaLine 97 <== SourceLine 425
                                    {
                                        // JavaLine 99 <== SourceLine 424
                                        {
                                            // JavaLine 101 <== SourceLine 425
                                            if(_VALUE((_inspect_423_4529.curmeaning_1==(null)))) {
                                                {
                                                    // JavaLine 104 <== SourceLine 426
                                                    _inspect_423_4529.curmeaning_1=qz;
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 109 <== SourceLine 428
                                                {
                                                    // JavaLine 111 <== SourceLine 429
                                                    if(_VALUE(((((COMMON_quantity)(_inspect_423_4529.curmeaning_1)).encl_1.blev!=(qblev))||((_inspect_423_4529.curmeaning_1==(qz)))))) {
                                                        // JavaLine 113 <== SourceLine 438
                                                        {
                                                            // JavaLine 115 <== SourceLine 439
                                                            {
                                                                _SIM_LABEL(2); // DeclaredIn: makevisblock -> makevisblock[externalIdent=BUILDER1_precheck0_makevisblock] Kind=5, QUAL=ProcedureDeclaration, HashCode=1966420092
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_439_4530=new COMMON_sembox((_CUR._SL._SL))._STM();
                                                                    if(_inspect_439_4530!=null) { // INSPECT _inspect_439_4530
                                                                        // JavaLine 122 <== SourceLine 440
                                                                        {
                                                                            // JavaLine 124 <== SourceLine 439
                                                                            {
                                                                                // JavaLine 126 <== SourceLine 440
                                                                                _inspect_439_4530.prevmeaning=qz.prevmeaning;
                                                                                ;
                                                                                // JavaLine 129 <== SourceLine 441
                                                                                _inspect_439_4530.next=_inspect_423_4529.curmeaning_1;
                                                                                ;
                                                                                // JavaLine 132 <== SourceLine 442
                                                                                qz.prevmeaning=((COMMON_sembox)_inspect_439_4530);
                                                                                ;
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                            }
                                                            ;
                                                            // JavaLine 141 <== SourceLine 444
                                                            _inspect_423_4529.curmeaning_1=qz;
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                        // JavaLine 156 <== SourceLine 448
                        qz=((COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 162 <== SourceLine 450
                if(_VALUE((q.plev_1>(lowpl)))) {
                    {
                        // JavaLine 165 <== SourceLine 451
                        q=q.prefqual_1;
                        ;
                        _GOTO(_LABEL_BUILDER1_precheck0_makevisblock_enter_0); // GOTO EVALUATED LABEL
                    }
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 makevisblock",1,408,11,421,13,439,16,411,19,412,21,414,23,424,25,439,59,416,62,417,67,418,71,419,79,420,82,421,88,422,91,423,97,425,99,424,101,425,104,426,109,428,111,429,113,438,115,439,122,440,124,439,126,440,129,441,132,442,141,444,156,448,162,450,165,451,181,453);
} // End of Procedure
