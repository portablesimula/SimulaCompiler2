// JavaLine 1 <== SourceLine 2385
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_ClosePass1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=2385, lastLine=2393, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 2388
    public RTS_Outbytefile _inspect_2388_4494=null;
    // Normal Constructor
    public SCANNER_ClosePass1(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_ClosePass1 _STM() {
        // JavaLine 23 <== SourceLine 2386
        while((((SCANNER)(_CUR._SL)).cursource_2!=(null))) {
            ((SCANNER)(_CUR._SL)).cursource_2.close_0().CPF();
        }
        ;
        // JavaLine 28 <== SourceLine 2387
        ((SCANNER)(_CUR._SL)).scanner=((SCANNER)(_CUR._SL)).parser=null;
        ;
        ((SCANNER)(_CUR._SL)).lexScanner_2=null;
        ;
        // JavaLine 33 <== SourceLine 2388
        {
            // BEGIN INSPECTION 
            _inspect_2388_4494=((SCANNER)(_CUR._SL)).L2OUPT;
            if(_inspect_2388_4494!=null) { // INSPECT _inspect_2388_4494
                // JavaLine 38 <== SourceLine 2389
                {
                    // JavaLine 40 <== SourceLine 2388
                    {
                        // JavaLine 42 <== SourceLine 2390
                        _inspect_2388_4494.outtext(RTS_TXT.sub(((SCANNER)(_CUR._SL)).L2codebuffer,1,RTS_TXT.pos(((SCANNER)(_CUR._SL)).L2codebuffer)));
                        ;
                        _inspect_2388_4494.close();
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 52 <== SourceLine 2392
        ((SCANNER)(_CUR._SL)).P1coder_2=((SCANNER_L2Coder)(((SCANNER)(_CUR._SL)).coder=null));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 ClosePass1",1,2385,10,2388,23,2386,28,2387,33,2388,38,2389,40,2388,42,2390,52,2392,57,2393);
} // End of Procedure
