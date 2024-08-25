// JavaLine 1 <== SourceLine 642
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_directive_linefield extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=642, lastLine=653, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 650
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_linefield_L1_0=new RTS_LABEL(this,0,1,"L1"); // Local Label #1=L1 At PrefixLevel 0
    // JavaLine 14 <== SourceLine 653
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_linefield_E_0=new RTS_LABEL(this,0,2,"E"); // Local Label #2=E At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 17 <== SourceLine 643
    public int i=0;
    // JavaLine 19 <== SourceLine 642
    public RTS_TXT _RESULT=null;
    // Normal Constructor
    public SCANNER_recognizer_directive_linefield(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_directive_linefield _STM() {
        SCANNER_recognizer_directive_linefield _THIS=(SCANNER_recognizer_directive_linefield)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 36 <== SourceLine 644
                while((((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1<(((SCANNER_recognizer)(_CUR._SL._SL)).linelength_1))) {
                    {
                        // JavaLine 39 <== SourceLine 645
                        new SCANNER_recognizer_directive_nextChar((_CUR._SL));
                        ;
                        // JavaLine 42 <== SourceLine 646
                        if(_VALUE((((SCANNER_recognizer)(_CUR._SL._SL)).atom_1!=(((char)32))))) {
                            _GOTO(_LABEL_SCANNER_recognizer_directive_linefield_L1_0); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 50 <== SourceLine 648
                if(_VALUE(_TXTREL_EQ(((SCANNER_recognizer_directive)(_CUR._SL)).u,new RTS_TXT("select")))) {
                    _GOTO(_LABEL_SCANNER_recognizer_directive_linefield_E_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 55 <== SourceLine 649
                _GOTO(((SCANNER_recognizer_directive)(_CUR._SL))._LABEL_SCANNER_recognizer_directive_Block798_DIRWARN_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 58 <== SourceLine 650
                {
                    _SIM_LABEL(1); // DeclaredIn: linefield
                    i=((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1;
                }
                ;
                // JavaLine 64 <== SourceLine 651
                while(((((SCANNER_recognizer)(_CUR._SL._SL)).atom_1!=(((char)32)))&((((SCANNER_recognizer)(_CUR._SL._SL)).atom_1!=(((char)7)))))) {
                    new SCANNER_recognizer_directive_nextChar((_CUR._SL));
                }
                ;
                // JavaLine 69 <== SourceLine 652
                _RESULT=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(((SCANNER_recognizer)(_CUR._SL._SL)).line_1,i,(((SCANNER_recognizer)(_CUR._SL._SL)).linepos_1-(i)))));
                ;
                // JavaLine 72 <== SourceLine 653
                {
                    _SIM_LABEL(2); // DeclaredIn: linefield
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 linefield",1,642,12,650,14,653,17,643,19,642,36,644,39,645,42,646,50,648,55,649,58,650,64,651,69,652,72,653,86,653);
} // End of Procedure
