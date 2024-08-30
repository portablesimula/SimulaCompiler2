// JavaLine 1 <== SourceLine 162
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_getnewindex extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=162, lastLine=168, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 168
    final RTS_LABEL _LABEL_CLASS_SCODER0_codegenerator0_getnewindex_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_getnewindex(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_getnewindex _STM() {
        CLASS_SCODER0_codegenerator0_getnewindex _THIS=(CLASS_SCODER0_codegenerator0_getnewindex)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 164
                if(_VALUE((((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5!=(0)))) {
                    {
                        // JavaLine 31 <== SourceLine 165
                        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curindex_5=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5;
                        ;
                        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).indexused.getELEMENT(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5);
                    }
                } else {
                    // JavaLine 37 <== SourceLine 167
                    new CLASS_ERRMSG_fatal0((_CUR._SL._SL),249);
                }
                ;
                // JavaLine 41 <== SourceLine 168
                {
                    _SIM_LABEL(1); // DeclaredIn: getnewindex
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 getnewindex",1,162,10,168,28,164,31,165,37,167,41,168,55,168);
} // End of Procedure
