// JavaLine 1 <== SourceLine 413
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_makevisblock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=413, lastLine=458, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 426
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_makevisblock_enter_0=new RTS_LABEL(this,0,1,"enter"); // Local Label #1=enter At PrefixLevel 0
    // JavaLine 13 <== SourceLine 444
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_makevisblock_Block428_Block430_Block434_Block444_STACK_0=new RTS_LABEL(this,0,2,"STACK"); // Local Label #2=STACK At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 416
    public CLASS_COMMON_quantity qz=null;
    public CLASS_COMMON_quantity q=null;
    // JavaLine 19 <== SourceLine 417
    public int lowpl=0;
    // JavaLine 21 <== SourceLine 419
    public char qblev=0;
    // JavaLine 23 <== SourceLine 429
    public CLASS_COMMON_identsymbol _inspect_428_4529=null;
    // JavaLine 25 <== SourceLine 444
    public CLASS_COMMON_sembox _inspect_444_4530=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_makevisblock setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(CLASS_COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_makevisblock(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_makevisblock(RTS_RTObject _SL,CLASS_COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_makevisblock _STM() {
        CLASS_BUILDER1_precheck0_makevisblock _THIS=(CLASS_BUILDER1_precheck0_makevisblock)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 59 <== SourceLine 421
                ((CLASS_BUILDER1)(_CUR._SL._SL)).display.putELEMENT(((CLASS_BUILDER1)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6)),p_brc);
                ;
                // JavaLine 62 <== SourceLine 422
                q=p_brc.declquant;
                ;
                qblev=p_brc.blev;
                ;
                // JavaLine 67 <== SourceLine 423
                if(_VALUE((q.kind_1==(((char)5))))) {
                    lowpl=0;
                } else {
                    // JavaLine 71 <== SourceLine 424
                    if(_VALUE((q.kind_1==(((char)9))))) {
                        lowpl=0;
                    } else {
                        lowpl=1;
                    }
                }
                ;
                // JavaLine 79 <== SourceLine 425
                new CLASS_BUILDER1_precheck0_vischain((_CUR._SL),p_brc.favirt,qz);
                ;
                // JavaLine 82 <== SourceLine 426
                {
                    _SIM_LABEL(1); // DeclaredIn: makevisblock
                    qz=q.descr_1.fpar;
                }
                ;
                // JavaLine 88 <== SourceLine 427
                while((qz!=(null))) {
                    {
                        // JavaLine 91 <== SourceLine 428
                        if(_VALUE((qz.visible_1==(((char)0))))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_428_4529=((CLASS_COMMON_identsymbol)(qz.symb_1));
                                if(_inspect_428_4529!=null) { // INSPECT _inspect_428_4529  type=ref(IDENTSYMBOL)
                                    // JavaLine 97 <== SourceLine 430
                                    {
                                        // JavaLine 99 <== SourceLine 429
                                        {
                                            // JavaLine 101 <== SourceLine 430
                                            if(_VALUE((_inspect_428_4529.curmeaning_1==(null)))) {
                                                {
                                                    // JavaLine 104 <== SourceLine 431
                                                    _inspect_428_4529.curmeaning_1=qz;
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 109 <== SourceLine 433
                                                {
                                                    // JavaLine 111 <== SourceLine 434
                                                    if(_VALUE(((((CLASS_COMMON_quantity)(_inspect_428_4529.curmeaning_1)).encl_1.blev!=(qblev))||((_inspect_428_4529.curmeaning_1==(qz)))))) {
                                                        // JavaLine 113 <== SourceLine 443
                                                        {
                                                            // JavaLine 115 <== SourceLine 444
                                                            {
                                                                _SIM_LABEL(2); // DeclaredIn: makevisblock -> makevisblock[externalIdent=CLASS_BUILDER1_precheck0_makevisblock] Kind=5, QUAL=ProcedureDeclaration, HashCode=240931578
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_444_4530=new CLASS_COMMON_sembox((_CUR._SL._SL))._STM();
                                                                    if(_inspect_444_4530!=null) { // INSPECT _inspect_444_4530  type=ref(SEMBOX)
                                                                        // JavaLine 122 <== SourceLine 445
                                                                        {
                                                                            // JavaLine 124 <== SourceLine 444
                                                                            {
                                                                                // JavaLine 126 <== SourceLine 445
                                                                                _inspect_444_4530.prevmeaning=qz.prevmeaning;
                                                                                ;
                                                                                // JavaLine 129 <== SourceLine 446
                                                                                _inspect_444_4530.next=_inspect_428_4529.curmeaning_1;
                                                                                ;
                                                                                // JavaLine 132 <== SourceLine 447
                                                                                qz.prevmeaning=((CLASS_COMMON_sembox)_inspect_444_4530);
                                                                                ;
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                            }
                                                            ;
                                                            // JavaLine 141 <== SourceLine 449
                                                            _inspect_428_4529.curmeaning_1=qz;
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
                        // JavaLine 156 <== SourceLine 453
                        qz=((CLASS_COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 162 <== SourceLine 455
                if(_VALUE((q.plev_1>(lowpl)))) {
                    {
                        // JavaLine 165 <== SourceLine 456
                        q=q.prefqual_1;
                        ;
                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_makevisblock_enter_0); // GOTO EVALUATED LABEL
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 makevisblock",1,413,11,426,13,444,16,416,19,417,21,419,23,429,25,444,59,421,62,422,67,423,71,424,79,425,82,426,88,427,91,428,97,430,99,429,101,430,104,431,109,433,111,434,113,443,115,444,122,445,124,444,126,445,129,446,132,447,141,449,156,453,162,455,165,456,181,458);
} // End of Procedure
