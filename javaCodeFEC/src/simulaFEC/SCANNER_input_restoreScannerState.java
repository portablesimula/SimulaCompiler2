// JavaLine 1 <== SourceLine 378
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_input_restoreScannerState extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=378, lastLine=388, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 379
    public SCANNER_recognizer _inspect_379_4468=null;
    // Normal Constructor
    public SCANNER_input_restoreScannerState(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_input_restoreScannerState _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_379_4468=((SCANNER)(_CUR._SL._SL)).lexScanner_2;
            if(_inspect_379_4468!=null) { // INSPECT _inspect_379_4468
                // JavaLine 27 <== SourceLine 380
                {
                    // JavaLine 29 <== SourceLine 379
                    {
                        // JavaLine 31 <== SourceLine 380
                        _inspect_379_4468.linepos_1=((SCANNER_input)(_CUR._SL)).lexpos;
                        ;
                        _inspect_379_4468.linelength_1=((SCANNER_input)(_CUR._SL)).lexlen;
                        ;
                        // JavaLine 36 <== SourceLine 381
                        _inspect_379_4468.atom_1=((SCANNER_input)(_CUR._SL)).lexatom;
                        ;
                        _inspect_379_4468.line_1=((SCANNER_input)(_CUR._SL)).lexline;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 46 <== SourceLine 383
        ((SCANNER)(_CUR._SL._SL)).listingon=((SCANNER_input)(_CUR._SL)).liston;
        ;
        // JavaLine 49 <== SourceLine 384
        ((SCANNER)(_CUR._SL._SL)).line=((SCANNER)(_CUR._SL._SL)).lexScanner_2.line_1;
        ;
        // JavaLine 52 <== SourceLine 385
        ((SCANNER)(_CUR._SL._SL)).cursource_2=((SCANNER_input)(_CUR._SL)).prev;
        ;
        ((SCANNER_input)(_CUR._SL)).prev=null;
        ;
        // JavaLine 57 <== SourceLine 386
        if(_VALUE((((SCANNER)(_CUR._SL._SL)).cursource_2!=(null)))) {
            // JavaLine 59 <== SourceLine 387
            ((SCANNER)(_CUR._SL._SL)).incrlnr_2=(!(((SCANNER)(_CUR._SL._SL)).cursource_2.p_inserted));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 restoreScannerState",1,378,10,379,27,380,29,379,31,380,36,381,46,383,49,384,52,385,57,386,59,387,65,388);
} // End of Procedure
