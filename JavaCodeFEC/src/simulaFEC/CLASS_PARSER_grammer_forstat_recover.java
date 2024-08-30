// JavaLine 1 <== SourceLine 1440
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_forstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1440, lastLine=1458, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 1458
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_recover_exit_0=new RTS_LABEL(this,0,1,"exit"); // Local Label #1=exit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 1440
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_forstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_forstat_recover _STM() {
        CLASS_PARSER_grammer_forstat_recover _THIS=(CLASS_PARSER_grammer_forstat_recover)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 32 <== SourceLine 1458
                {
                    _SIM_LABEL(1); // DeclaredIn: recover
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,1440,12,1458,15,1440,32,1458,46,1458);
} // End of Procedure
