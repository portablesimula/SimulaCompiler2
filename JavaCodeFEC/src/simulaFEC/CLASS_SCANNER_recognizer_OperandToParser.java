// JavaLine 1 <== SourceLine 887
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_OperandToParser extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=887, lastLine=896, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 889
    public CLASS_COMMON_component _inspect_888_4473=null;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_OperandToParser(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_OperandToParser _STM() {
        // JavaLine 23 <== SourceLine 888
        {
            // BEGIN INSPECTION 
            _inspect_888_4473=((CLASS_SCANNER)(_CUR._SL._SL)).parser;
            if(_inspect_888_4473!=null) { // INSPECT _inspect_888_4473  type=ref(COMPONENT)
                // JavaLine 28 <== SourceLine 889
                {
                    {
                        ((CLASS_SCANNER)(_CUR._SL._SL)).opt='Y';
                        ;
                        _inspect_888_4473.getopt=true;
                        ;
                        // JavaLine 35 <== SourceLine 891
                        if(_VALUE((((CLASS_SCANNER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('1'))!=(((char)0))))) {
                            new CLASS_SCANNER_dump((_CUR._SL._SL),new RTS_TXT("scanner:"));
                        }
                        ;
                        // JavaLine 40 <== SourceLine 892
                        if(_VALUE((((CLASS_SCANNER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                            // JavaLine 42 <== SourceLine 893
                            new CLASS_SCANNER_W1((_CUR._SL._SL),CONC(new RTS_TXT("NEXT:"),((CLASS_SCANNER)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_888_4473.cs))),RTS_ENVIRONMENT.rank(_inspect_888_4473.cs));
                        }
                        ;
                        // JavaLine 46 <== SourceLine 894
                        call(((CLASS_COMMON_component)_inspect_888_4473),894);
                        ;
                        // JavaLine 49 <== SourceLine 895
                        _inspect_888_4473.cs=((CLASS_SCANNER)(_CUR._SL._SL)).opt=((CLASS_SCANNER)(_CUR._SL._SL)).optx=((CLASS_SCANNER)(_CUR._SL._SL)).opdhi=((CLASS_SCANNER)(_CUR._SL._SL)).opdlo=((char)0);
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 OperandToParser",1,887,10,889,23,888,28,889,35,891,40,892,42,893,46,894,49,895,58,896);
} // End of Procedure
