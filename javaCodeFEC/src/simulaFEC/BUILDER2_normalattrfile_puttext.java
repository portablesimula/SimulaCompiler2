// JavaLine 1 <== SourceLine 529
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_puttext extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=529, lastLine=547, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare local labels
    // JavaLine 11 <== SourceLine 547
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_puttext_EX_0=new RTS_LABEL(this,0,1,"EX"); // Local Label #1=EX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 530
    public int tlength=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_puttext setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_puttext(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_puttext(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_puttext _STM() {
        BUILDER2_normalattrfile_puttext _THIS=(BUILDER2_normalattrfile_puttext)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 48 <== SourceLine 531
                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),531,CONC(CONC(new RTS_TXT("puttext: \""),p_t),new RTS_TXT("\"")));
                ;
                // JavaLine 51 <== SourceLine 532
                tlength=RTS_TXT.length(p_t);
                ;
                // JavaLine 54 <== SourceLine 533
                if(_VALUE((tlength==(0)))) {
                    new BUILDER2_normalattrfile_storebyte((_CUR._SL),((char)0));
                } else {
                    // JavaLine 58 <== SourceLine 534
                    {
                        // JavaLine 60 <== SourceLine 535
                        if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).p+(tlength))>(((BUILDER2_normalattrfile)(_CUR._SL)).bufmax)))) {
                            {
                                // JavaLine 63 <== SourceLine 536
                                if(_VALUE((tlength>(((BUILDER2_normalattrfile)(_CUR._SL)).bufmax)))) {
                                    {
                                        // JavaLine 66 <== SourceLine 537
                                        new BUILDER2_normalattrfile_storebyte((_CUR._SL),((char)255));
                                        ;
                                        new BUILDER2_normalattrfile_putNumber((_CUR._SL),tlength);
                                        ;
                                        // JavaLine 71 <== SourceLine 538
                                        new BUILDER2_normalattrfile_swapObuffer((_CUR._SL));
                                        ;
                                        ((BUILDER2_normalattrfile)(_CUR._SL)).AOF.outtext(p_t);
                                        ;
                                        _GOTO(_LABEL_BUILDER2_normalattrfile_puttext_EX_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 80 <== SourceLine 539
                                new BUILDER2_normalattrfile_swapObuffer((_CUR._SL));
                                ;
                            }
                        }
                        ;
                        // JavaLine 86 <== SourceLine 541
                        if(_VALUE((tlength>=(RTS_ENVIRONMENT.rank(((char)240)))))) {
                            {
                                // JavaLine 89 <== SourceLine 542
                                new BUILDER2_normalattrfile_storebyte((_CUR._SL),((char)253));
                                ;
                                new BUILDER2_normalattrfile_putNumber((_CUR._SL),tlength);
                            }
                        } else {
                            // JavaLine 95 <== SourceLine 543
                            new BUILDER2_normalattrfile_storebyte((_CUR._SL),RTS_ENVIRONMENT._char(tlength));
                        }
                        ;
                        // JavaLine 99 <== SourceLine 544
                        _ASGTXT(RTS_TXT.sub(((BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,(((BUILDER2_normalattrfile)(_CUR._SL)).p+(1)),tlength),p_t);
                        ;
                        ((BUILDER2_normalattrfile)(_CUR._SL)).p=(((BUILDER2_normalattrfile)(_CUR._SL)).p+(tlength));
                        ;
                        // JavaLine 104 <== SourceLine 545
                        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).p>(2048)))) {
                            new ERRMSG_internerr((_CUR._SL._SL),((char)7),545);
                        }
                        ;
                    }
                }
                ;
                // JavaLine 112 <== SourceLine 547
                {
                    _SIM_LABEL(1); // DeclaredIn: puttext
                    ;
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 puttext",1,529,11,547,14,530,48,531,51,532,54,533,58,534,60,535,63,536,66,537,71,538,80,539,86,541,89,542,95,543,99,544,104,545,112,547,126,547);
} // End of Procedure
