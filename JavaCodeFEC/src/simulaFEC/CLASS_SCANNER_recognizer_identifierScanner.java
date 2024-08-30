// JavaLine 1 <== SourceLine 900
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCANNER_recognizer_identifierScanner extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=900, lastLine=932, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 912
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_TEST_0=new RTS_LABEL(this,0,1,"TEST"); // Local Label #1=TEST At PrefixLevel 0
    // JavaLine 13 <== SourceLine 915
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_Block914_SCAN_0=new RTS_LABEL(this,0,2,"SCAN"); // Local Label #2=SCAN At PrefixLevel 0
    // JavaLine 15 <== SourceLine 926
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_idterm_0=new RTS_LABEL(this,0,3,"idterm"); // Local Label #3=idterm At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 903
    public char atomcl=0;
    // JavaLine 20 <== SourceLine 904
    public int hashpos=0;
    // JavaLine 22 <== SourceLine 905
    public RTS_TXT hashbuf=null;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_identifierScanner(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_SCANNER_recognizer_identifierScanner _STM() {
        CLASS_SCANNER_recognizer_identifierScanner _THIS=(CLASS_SCANNER_recognizer_identifierScanner)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 38 <== SourceLine 907
                hashbuf=RTS_ENVIRONMENT.blanks(72);
                ;
                detach(907);
                ;
                // JavaLine 43 <== SourceLine 908
                while(true) {
                    {
                        // JavaLine 46 <== SourceLine 909
                        hashpos=0;
                        ;
                        // JavaLine 49 <== SourceLine 911
                        {
                            _SIM_LABEL(1); // DeclaredIn: identifierScanner -> identifierScanner[CLASS_SCANNER_recognizer_identifierScanner] DeclarationKind=Class
                            // JavaLine 52 <== SourceLine 912
                            if(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))<((char)0) || ((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))>((char)9)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))) { // BEGIN SWITCH STATEMENT
                                case 0: 
                                case 1: 
                                case 3: 
                                case 2: 
                                // JavaLine 59 <== SourceLine 913
                                {
                                    // JavaLine 61 <== SourceLine 914
                                    RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1,hashbuf,hashpos);
                                    ;
                                    hashpos=(hashpos+(1));
                                    ;
                                    // JavaLine 66 <== SourceLine 915
                                    {
                                        _SIM_LABEL(2); // DeclaredIn: identifierScanner -> identifierScanner[CLASS_SCANNER_recognizer_identifierScanner] DeclarationKind=Class
                                        ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1);
                                    }
                                    ;
                                    ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1+(1));
                                    ;
                                    // JavaLine 74 <== SourceLine 916
                                    if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1>(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                        new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)2),916);
                                    }
                                    ;
                                    // JavaLine 79 <== SourceLine 917
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_TEST_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 7: 
                                case 8: 
                                // JavaLine 86 <== SourceLine 919
                                {
                                    // JavaLine 88 <== SourceLine 920
                                    if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1==(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                        _GOTO(_LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_idterm_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 93 <== SourceLine 921
                                    new CLASS_SCANNER_recognizer_illegalChar((_CUR._SL));
                                    ;
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_Block914_SCAN_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 5: 
                                case 4: 
                                case 6: 
                                // JavaLine 102 <== SourceLine 922
                                _GOTO(_LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_idterm_0); // GOTO EVALUATED LABEL
                                break;
                                default:
                                // JavaLine 106 <== SourceLine 923
                                _GOTO(_LABEL_CLASS_SCANNER_recognizer_identifierScanner_Block909_Block914_SCAN_0); // GOTO EVALUATED LABEL
                                break;
                            } // END SWITCH STATEMENT
                        }
                        ;
                        // JavaLine 112 <== SourceLine 926
                        {
                            _SIM_LABEL(3); // DeclaredIn: identifierScanner -> identifierScanner[CLASS_SCANNER_recognizer_identifierScanner] DeclarationKind=Class
                            ((CLASS_SCANNER)(_CUR._SL._SL)).simsymbol=RTS_ENVIRONMENT.lowcase(RTS_TXT.sub(hashbuf,1,hashpos));
                        }
                        ;
                        // JavaLine 118 <== SourceLine 928
                        detach(928);
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 125 <== SourceLine 932
                // BEGIN identifierScanner INNER PART
                // ENDOF identifierScanner INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","8 identifierScanner",1,900,11,912,13,915,15,926,18,903,20,904,22,905,38,907,43,908,46,909,49,911,52,912,59,913,61,914,66,915,74,916,79,917,86,919,88,920,93,921,102,922,106,923,112,926,118,928,125,932,137,932);
} // End of Class
