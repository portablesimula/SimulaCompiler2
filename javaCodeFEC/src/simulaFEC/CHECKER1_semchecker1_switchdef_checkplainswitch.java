// JavaLine 1 <== SourceLine 2532
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_switchdef_checkplainswitch extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2532, lastLine=2541, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 2541
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_switchdef_checkplainswitch_E_0=new RTS_LABEL(this,0,1,"E"); // Local Label #1=E At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 2533
    public CHECKER1_semchecker1_switchelement swel=null;
    // Normal Constructor
    public CHECKER1_semchecker1_switchdef_checkplainswitch(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_switchdef_checkplainswitch _STM() {
        CHECKER1_semchecker1_switchdef_checkplainswitch _THIS=(CHECKER1_semchecker1_switchdef_checkplainswitch)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 30 <== SourceLine 2534
                swel=((CHECKER1_semchecker1_switchdef)(_CUR._SL)).elements_1;
                ;
                // JavaLine 33 <== SourceLine 2535
                while((swel!=(null))) {
                    // JavaLine 35 <== SourceLine 2536
                    {
                        if(_VALUE((swel.blocklevel!=(((CHECKER1_semchecker1_switchdef)(_CUR._SL)).sw_1.encl_1.blev)))) {
                            // JavaLine 38 <== SourceLine 2537
                            {
                                _GOTO(_LABEL_CHECKER1_semchecker1_switchdef_checkplainswitch_E_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 45 <== SourceLine 2538
                        swel=swel.next;
                        ;
                    }
                }
                ;
                // JavaLine 51 <== SourceLine 2540
                ((CHECKER1_semchecker1_switchdef)(_CUR._SL)).plain_1=true;
                ;
                // JavaLine 54 <== SourceLine 2541
                {
                    _SIM_LABEL(1); // DeclaredIn: checkplainswitch
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 checkplainswitch",1,2532,10,2541,13,2533,30,2534,33,2535,35,2536,38,2537,45,2538,51,2540,54,2541,68,2541);
} // End of Procedure
