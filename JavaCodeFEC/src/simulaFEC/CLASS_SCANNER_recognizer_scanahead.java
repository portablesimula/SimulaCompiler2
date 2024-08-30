// JavaLine 1 <== SourceLine 842
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_scanahead extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=842, lastLine=856, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 856
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_scanahead_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCANNER_recognizer_scanahead(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_scanahead _STM() {
        CLASS_SCANNER_recognizer_scanahead _THIS=(CLASS_SCANNER_recognizer_scanahead)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 844
                while(true) {
                    {
                        // JavaLine 31 <== SourceLine 845
                        ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1);
                        ;
                        ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1+(1));
                        ;
                        // JavaLine 36 <== SourceLine 846
                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1>(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                            new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)2),846);
                        }
                        ;
                        // JavaLine 41 <== SourceLine 847
                        if(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))<((char)0) || ((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))>((char)9)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))) { // BEGIN SWITCH STATEMENT
                            case 9: 
                            ;
                            break;
                            case 4: 
                            case 0: 
                            case 2: 
                            case 5: 
                            case 6: 
                            case 1: 
                            case 3: 
                            case 7: 
                            // JavaLine 55 <== SourceLine 850
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_scanahead_EXIT_0); // GOTO EVALUATED LABEL
                            break;
                            case 8: 
                            // JavaLine 59 <== SourceLine 851
                            {
                                // JavaLine 61 <== SourceLine 852
                                if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)7))))) {
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_scanahead_EXIT_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 66 <== SourceLine 853
                                new CLASS_SCANNER_recognizer_illegalChar((_CUR._SL));
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 76 <== SourceLine 856
                {
                    _SIM_LABEL(1); // DeclaredIn: scanahead
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 scanahead",1,842,10,856,28,844,31,845,36,846,41,847,55,850,59,851,61,852,66,853,76,856,90,856);
} // End of Procedure
