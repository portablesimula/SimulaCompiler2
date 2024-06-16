// JavaLine 1 <== SourceLine 887
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_OperandToParser extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=887, lastLine=896, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 889
    public COMMON_component _inspect_888_4473=null;
    // Normal Constructor
    public SCANNER_recognizer_OperandToParser(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_OperandToParser _STM() {
        // JavaLine 23 <== SourceLine 888
        {
            // BEGIN INSPECTION 
            _inspect_888_4473=((SCANNER)(_CUR._SL._SL)).parser;
            if(_inspect_888_4473!=null) { // INSPECT _inspect_888_4473
                // JavaLine 28 <== SourceLine 889
                {
                    {
                        ((SCANNER)(_CUR._SL._SL)).opt='Y';
                        ;
                        _inspect_888_4473.getopt=true;
                        ;
                        // JavaLine 35 <== SourceLine 891
                        if(_VALUE((((SCANNER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('1'))!=(((char)0))))) {
                            new SCANNER_dump((_CUR._SL._SL),new RTS_TXT("scanner:"));
                        }
                        ;
                        // JavaLine 40 <== SourceLine 892
                        if(_VALUE((((SCANNER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                            // JavaLine 42 <== SourceLine 893
                            new SCANNER_W1((_CUR._SL._SL),CONC(new RTS_TXT("NEXT:"),((SCANNER)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_888_4473.cs))),RTS_ENVIRONMENT.rank(_inspect_888_4473.cs));
                        }
                        ;
                        // JavaLine 46 <== SourceLine 894
                        call(((COMMON_component)_inspect_888_4473),894);
                        ;
                        // JavaLine 49 <== SourceLine 895
                        _inspect_888_4473.cs=((SCANNER)(_CUR._SL._SL)).opt=((SCANNER)(_CUR._SL._SL)).optx=((SCANNER)(_CUR._SL._SL)).opdhi=((SCANNER)(_CUR._SL._SL)).opdlo=((char)0);
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 OperandToParser",1,887,10,889,23,888,28,889,35,891,40,892,42,893,46,894,49,895,58,896);
} // End of Procedure
