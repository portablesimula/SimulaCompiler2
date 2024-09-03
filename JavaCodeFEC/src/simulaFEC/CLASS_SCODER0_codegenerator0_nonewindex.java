// JavaLine 1 <== SourceLine 171
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_nonewindex extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=171, lastLine=184, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 184
    final RTS_LABEL _LABEL_CLASS_SCODER0_codegenerator0_nonewindex_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 173
    public int i=0;
    public int j=0;
    // JavaLine 18 <== SourceLine 171
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_nonewindex(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_nonewindex _STM() {
        CLASS_SCODER0_codegenerator0_nonewindex _THIS=(CLASS_SCODER0_codegenerator0_nonewindex)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 176
                j=10;
                ;
                // JavaLine 38 <== SourceLine 177
                i=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5;
                ;
                // JavaLine 41 <== SourceLine 178
                while((j!=(0))) {
                    {
                        // JavaLine 44 <== SourceLine 179
                        if(_VALUE((i==(0)))) {
                            {
                                _RESULT=true;
                                ;
                                _GOTO(_LABEL_CLASS_SCODER0_codegenerator0_nonewindex_EXIT_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 53 <== SourceLine 180
                        j=(j-(1));
                        ;
                        i=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).indexused.getELEMENT(i);
                        ;
                    }
                }
                ;
                // JavaLine 61 <== SourceLine 182
                _RESULT=false;
                ;
                // JavaLine 64 <== SourceLine 183
                ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curindex_5=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5;
                ;
                ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).indexused.getELEMENT(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).freeindex_5);
                ;
                // JavaLine 69 <== SourceLine 184
                {
                    _SIM_LABEL(1); // DeclaredIn: nonewindex
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 nonewindex",1,171,12,184,15,173,18,171,35,176,38,177,41,178,44,179,53,180,61,182,64,183,69,184,83,184);
} // End of Procedure
