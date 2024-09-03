// JavaLine 1 <== SourceLine 93
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_outINRtag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=93, lastLine=107, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 13 <== SourceLine 105
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_outINRtag_found_0=new RTS_LABEL(this,0,1,"found"); // Local Label #1=found At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 94
    public int inrtag=0;
    // JavaLine 18 <== SourceLine 93
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1_codegenerator1_outINRtag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1_codegenerator1_outINRtag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_outINRtag(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_outINRtag _STM() {
        CLASS_SCODER1_codegenerator1_outINRtag _THIS=(CLASS_SCODER1_codegenerator1_outINRtag)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 52 <== SourceLine 96
                while((p_q.plev_1>(1))) {
                    {
                        // JavaLine 55 <== SourceLine 97
                        p_q=p_q.prefqual_1;
                        ;
                        inrtag=RTS_ENVIRONMENT.rank(p_q.descr_1.inrtag);
                        ;
                        // JavaLine 60 <== SourceLine 98
                        if(_VALUE((inrtag!=(0)))) {
                            {
                                // JavaLine 63 <== SourceLine 99
                                inrtag=(p_q.ftag_1+(inrtag));
                                ;
                                // JavaLine 66 <== SourceLine 101
                                _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_outINRtag_found_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 103
                inrtag=1369;
                ;
                // JavaLine 77 <== SourceLine 104
                {
                    _SIM_LABEL(1); // DeclaredIn: outINRtag
                    // JavaLine 80 <== SourceLine 105
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),inrtag);
                }
                ;
                // JavaLine 84 <== SourceLine 106
                _RESULT=inrtag;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 outINRtag",1,93,13,105,16,94,18,93,52,96,55,97,60,98,63,99,66,101,74,103,77,104,80,105,84,106,96,107);
} // End of Procedure
