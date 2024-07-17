// JavaLine 1 <== SourceLine 683
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_protect extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=683, lastLine=703, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 11 <== SourceLine 688
    final RTS_LABEL _LABEL_BUILDER1_precheck0_protect_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 686
    public COMMON_quantity qz=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_protect setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_protect(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_protect(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_protect _STM() {
        BUILDER1_precheck0_protect _THIS=(BUILDER1_precheck0_protect)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 48 <== SourceLine 688
                {
                    _SIM_LABEL(1); // DeclaredIn: protect
                    qz=p_q.descr_1.fpar;
                }
                ;
                // JavaLine 54 <== SourceLine 689
                while((qz!=(null))) {
                    {
                        // JavaLine 57 <== SourceLine 690
                        if(_VALUE((qz.protect_1==(((char)1))))) {
                            qz.visible_1=((char)1);
                        }
                        ;
                        // JavaLine 62 <== SourceLine 691
                        qz=((COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 68 <== SourceLine 693
                qz=p_q.descr_1.favirt;
                ;
                // JavaLine 71 <== SourceLine 694
                while((qz!=(null))) {
                    {
                        // JavaLine 74 <== SourceLine 695
                        if(_VALUE((qz.protect_1==(((char)1))))) {
                            {
                                qz.visible_1=((char)1);
                                ;
                                // JavaLine 79 <== SourceLine 696
                                if(_VALUE((qz.match_1!=(null)))) {
                                    qz.match_1.visible_1=((char)1);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 87 <== SourceLine 698
                        qz=((COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 93 <== SourceLine 701
                if(_VALUE((p_q.plev_1>(1)))) {
                    {
                        p_q=p_q.prefqual_1;
                        ;
                        _GOTO(_LABEL_BUILDER1_precheck0_protect_REP_0); // GOTO EVALUATED LABEL
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 protect",1,683,11,688,14,686,48,688,54,689,57,690,62,691,68,693,71,694,74,695,79,696,87,698,93,701,111,703);
} // End of Procedure
