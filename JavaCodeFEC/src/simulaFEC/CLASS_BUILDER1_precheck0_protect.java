// JavaLine 1 <== SourceLine 688
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_protect extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=688, lastLine=708, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 11 <== SourceLine 693
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_protect_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 691
    public CLASS_COMMON_quantity qz=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_protect setPar(Object param) {
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
    public CLASS_BUILDER1_precheck0_protect(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_protect(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_protect _STM() {
        CLASS_BUILDER1_precheck0_protect _THIS=(CLASS_BUILDER1_precheck0_protect)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 48 <== SourceLine 693
                {
                    _SIM_LABEL(1); // DeclaredIn: protect
                    qz=p_q.descr_1.fpar;
                }
                ;
                // JavaLine 54 <== SourceLine 694
                while((qz!=(null))) {
                    {
                        // JavaLine 57 <== SourceLine 695
                        if(_VALUE((qz.protect_1==(((char)1))))) {
                            qz.visible_1=((char)1);
                        }
                        ;
                        // JavaLine 62 <== SourceLine 696
                        qz=((CLASS_COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 68 <== SourceLine 698
                qz=p_q.descr_1.favirt;
                ;
                // JavaLine 71 <== SourceLine 699
                while((qz!=(null))) {
                    {
                        // JavaLine 74 <== SourceLine 700
                        if(_VALUE((qz.protect_1==(((char)1))))) {
                            {
                                qz.visible_1=((char)1);
                                ;
                                // JavaLine 79 <== SourceLine 701
                                if(_VALUE((qz.match_1!=(null)))) {
                                    qz.match_1.visible_1=((char)1);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 87 <== SourceLine 703
                        qz=((CLASS_COMMON_quantity)(qz.next));
                        ;
                    }
                }
                ;
                // JavaLine 93 <== SourceLine 706
                if(_VALUE((p_q.plev_1>(1)))) {
                    {
                        p_q=p_q.prefqual_1;
                        ;
                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_protect_REP_0); // GOTO EVALUATED LABEL
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 protect",1,688,11,693,14,691,48,693,54,694,57,695,62,696,68,698,71,699,74,700,79,701,87,703,93,706,111,708);
} // End of Procedure
