// JavaLine 1 <== SourceLine 367
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_input_saveScannerState extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=367, lastLine=376, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 368
    public SCANNER_recognizer _inspect_368_4467=null;
    // Normal Constructor
    public SCANNER_input_saveScannerState(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_input_saveScannerState _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_368_4467=((SCANNER)(_CUR._SL._SL)).lexScanner_2;
            if(_inspect_368_4467!=null) { // INSPECT _inspect_368_4467
                // JavaLine 27 <== SourceLine 369
                {
                    {
                        ((SCANNER_input)(_CUR._SL)).lexatom=_inspect_368_4467.atom_1;
                        ;
                        ((SCANNER_input)(_CUR._SL)).lexline=_inspect_368_4467.line_1;
                        ;
                        // JavaLine 34 <== SourceLine 370
                        ((SCANNER_input)(_CUR._SL)).lexpos=_inspect_368_4467.linepos_1;
                        ;
                        ((SCANNER_input)(_CUR._SL)).lexlen=_inspect_368_4467.linelength_1;
                        ;
                        // JavaLine 39 <== SourceLine 371
                        ((SCANNER_input)(_CUR._SL)).liston=((SCANNER)(_CUR._SL._SL)).listingon;
                        ;
                        // JavaLine 42 <== SourceLine 372
                        if(_VALUE(((SCANNER_input)(_CUR._SL)).p_inserted)) {
                            ((SCANNER)(_CUR._SL._SL)).incrlnr_2=((SCANNER)(_CUR._SL._SL)).listingon=false;
                        }
                        ;
                        // JavaLine 47 <== SourceLine 373
                        ((SCANNER_input)(_CUR._SL)).prev=((SCANNER)(_CUR._SL._SL)).cursource_2;
                        ;
                        ((SCANNER)(_CUR._SL._SL)).cursource_2=((SCANNER_input)(_CUR._SL));
                        ;
                        // JavaLine 52 <== SourceLine 375
                        _inspect_368_4467.atom_1=((char)7);
                        ;
                        _inspect_368_4467.linepos_1=_inspect_368_4467.linelength_1;
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 saveScannerState",1,367,10,368,27,369,34,370,39,371,42,372,47,373,52,375,63,376);
} // End of Procedure
