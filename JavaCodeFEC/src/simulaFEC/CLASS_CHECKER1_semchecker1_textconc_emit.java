// JavaLine 1 <== SourceLine 673
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_textconc_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=673, lastLine=683, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 677
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_textconc_emit_Block675_NXT_0=new RTS_LABEL(this,0,1,"NXT"); // Local Label #1=NXT At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_textconc_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_textconc_emit _STM() {
        CLASS_CHECKER1_semchecker1_textconc_emit _THIS=(CLASS_CHECKER1_semchecker1_textconc_emit)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 674
                if(_VALUE((((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1>(0)))) {
                    {
                        // JavaLine 31 <== SourceLine 675
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='T';
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opihi_6=RTS_ENVIRONMENT._char(((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1);
                        ;
                        // JavaLine 36 <== SourceLine 676
                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,676);
                        ;
                        // JavaLine 39 <== SourceLine 677
                        {
                            _SIM_LABEL(1); // DeclaredIn: emit -> emit[externalIdent=CLASS_CHECKER1_semchecker1_textconc_emit] Kind=5, QUAL=ProcedureDeclaration, HashCode=1500512598
                            new CLASS_CHECKER1_semchecker1_textoperand_emit(((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).first_1);
                        }
                        ;
                        ((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).first_1=((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).first_1.next;
                        ;
                        // JavaLine 47 <== SourceLine 678
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='T';
                        ;
                        // JavaLine 50 <== SourceLine 679
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_textconc)(_CUR._SL)).first_1!=(null)))) {
                            {
                                // JavaLine 53 <== SourceLine 680
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,680);
                                ;
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_textconc_emit_Block675_NXT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 61 <== SourceLine 681
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
                        ;
                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,681);
                        ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,673,10,677,28,674,31,675,36,676,39,677,47,678,50,679,53,680,61,681,78,683);
} // End of Procedure
