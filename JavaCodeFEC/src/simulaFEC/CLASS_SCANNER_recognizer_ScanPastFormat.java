// JavaLine 1 <== SourceLine 806
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_ScanPastFormat extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=806, lastLine=838, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 810
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_SCN1_0=new RTS_LABEL(this,0,1,"SCN1"); // Local Label #1=SCN1 At PrefixLevel 0
    // JavaLine 12 <== SourceLine 825
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_Block824_L1_0=new RTS_LABEL(this,0,2,"L1"); // Local Label #2=L1 At PrefixLevel 0
    // JavaLine 14 <== SourceLine 832
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_Block832_SCAN_0=new RTS_LABEL(this,0,3,"SCAN"); // Local Label #3=SCAN At PrefixLevel 0
    // JavaLine 16 <== SourceLine 838
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_EXIT_0=new RTS_LABEL(this,0,4,"EXIT"); // Local Label #4=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 808
    public int startpos=0;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_ScanPastFormat(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_ScanPastFormat _STM() {
        CLASS_SCANNER_recognizer_ScanPastFormat _THIS=(CLASS_SCANNER_recognizer_ScanPastFormat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,4); // For ByteCode Engineering
                // JavaLine 36 <== SourceLine 810
                {
                    _SIM_LABEL(1); // DeclaredIn: ScanPastFormat
                    if(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))<((char)0) || ((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))>((char)9)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                    switch(((CLASS_SCANNER_recognizer)(_CUR._SL)).InputClass.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1))) { // BEGIN SWITCH STATEMENT
                        case 7: 
                        case 8: 
                        // JavaLine 43 <== SourceLine 811
                        {
                            // JavaLine 45 <== SourceLine 812
                            if(_VALUE(((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)7)))&&((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1==(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))))) {
                                // JavaLine 47 <== SourceLine 815
                                {
                                    new CLASS_SCANNER_recognizer_nextLine((_CUR._SL));
                                    ;
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_SCN1_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 55 <== SourceLine 816
                            if(_VALUE((((CLASS_SCANNER)(_CUR._SL._SL)).maxnumoftags>(0)))) {
                                new CLASS_SCANNER_recognizer_illegalChar((_CUR._SL));
                            }
                            ;
                            // JavaLine 60 <== SourceLine 818
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_Block832_SCAN_0); // GOTO EVALUATED LABEL
                        }
                        break;
                        case 1: 
                        // JavaLine 65 <== SourceLine 819
                        {
                            // JavaLine 67 <== SourceLine 820
                            startpos=((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1;
                            ;
                            call(((CLASS_SCANNER_recognizer)(_CUR._SL)).IdScanner_1,820);
                            ;
                            // JavaLine 72 <== SourceLine 821
                            if(_VALUE(RTS_UTIL._TXTREL_NE(((CLASS_SCANNER)(_CUR._SL._SL)).simsymbol,new RTS_TXT("comment")))) {
                                {
                                    // JavaLine 75 <== SourceLine 822
                                    ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=startpos;
                                    ;
                                    ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1='c';
                                    ;
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_EXIT_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 84 <== SourceLine 823
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_Block824_L1_0); // GOTO EVALUATED LABEL
                        }
                        break;
                        case 5: 
                        // JavaLine 89 <== SourceLine 824
                        {
                            {
                                _SIM_LABEL(2); // DeclaredIn: ScanPastFormat -> ScanPastFormat[externalIdent=CLASS_SCANNER_recognizer_ScanPastFormat] Kind=5, QUAL=ProcedureDeclaration, HashCode=1106488049
                                // JavaLine 93 <== SourceLine 825
                                while((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1!=(';'))) {
                                    {
                                        // JavaLine 96 <== SourceLine 826
                                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1<(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                            {
                                                // JavaLine 99 <== SourceLine 827
                                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1);
                                                ;
                                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1+(1));
                                            }
                                        } else {
                                            // JavaLine 105 <== SourceLine 828
                                            new CLASS_SCANNER_recognizer_nextLine((_CUR._SL));
                                        }
                                        ;
                                    }
                                }
                            }
                            ;
                            // JavaLine 113 <== SourceLine 830
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_Block832_SCAN_0); // GOTO EVALUATED LABEL
                        }
                        break;
                        case 9: 
                        case 6: 
                        // JavaLine 119 <== SourceLine 831
                        {
                            // JavaLine 121 <== SourceLine 832
                            {
                                _SIM_LABEL(3); // DeclaredIn: ScanPastFormat -> ScanPastFormat[externalIdent=CLASS_SCANNER_recognizer_ScanPastFormat] Kind=5, QUAL=ProcedureDeclaration, HashCode=1106488049
                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1);
                            }
                            ;
                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1+(1));
                            ;
                            // JavaLine 129 <== SourceLine 833
                            if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1>(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                // JavaLine 131 <== SourceLine 834
                                new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)2),834);
                            }
                            ;
                            // JavaLine 135 <== SourceLine 835
                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_ScanPastFormat_SCN1_0); // GOTO EVALUATED LABEL
                        }
                        break;
                    } // END SWITCH STATEMENT
                }
                ;
                // JavaLine 142 <== SourceLine 838
                {
                    _SIM_LABEL(4); // DeclaredIn: ScanPastFormat
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 ScanPastFormat",1,806,10,810,12,825,14,832,16,838,19,808,36,810,43,811,45,812,47,815,55,816,60,818,65,819,67,820,72,821,75,822,84,823,89,824,93,825,96,826,99,827,105,828,113,830,119,831,121,832,129,833,131,834,135,835,142,838,156,838);
} // End of Procedure
