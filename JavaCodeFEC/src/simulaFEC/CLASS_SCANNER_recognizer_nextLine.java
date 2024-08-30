// JavaLine 1 <== SourceLine 627
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_nextLine extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=627, lastLine=634, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 629
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_nextLine_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    public CLASS_SCANNER_input _inspect_629_4471=null;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_nextLine(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_nextLine _STM() {
        CLASS_SCANNER_recognizer_nextLine _THIS=(CLASS_SCANNER_recognizer_nextLine)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    _SIM_LABEL(1); // DeclaredIn: nextLine
                    {
                        // BEGIN INSPECTION 
                        _inspect_629_4471=((CLASS_SCANNER)(_CUR._SL._SL)).cursource_2;
                        if(_inspect_629_4471!=null) { // INSPECT _inspect_629_4471  type=ref(INPUT)
                            {
                                call(((CLASS_SCANNER_input)_inspect_629_4471),629);
                            }
                        }
                        else { // OTHERWISE 
                            // JavaLine 40 <== SourceLine 630
                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).detach(630);
                        } // END OTHERWISE 
                    } // END INSPECTION
                }
                ;
                // JavaLine 46 <== SourceLine 631
                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,0);
                ;
                ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=1;
                ;
                // JavaLine 51 <== SourceLine 632
                while((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1==('%'))) {
                    {
                        // JavaLine 54 <== SourceLine 633
                        new CLASS_SCANNER_recognizer_directive((_CUR._SL));
                        ;
                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)7))))) {
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_nextLine_REP_0); // GOTO EVALUATED LABEL
                        }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 nextLine",1,627,10,629,40,630,46,631,51,632,54,633,72,634);
} // End of Procedure
