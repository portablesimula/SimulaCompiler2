// JavaLine 1 <== SourceLine 14
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 07 09:54:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simerr01_p extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=14, lastLine=40, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 16
    public int i=0;
    // Normal Constructor
    public simerr01_p(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simerr01_p _STM() {
        // JavaLine 23 <== SourceLine 17
        new simerr01_PBLK17((_CUR))._START();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","5 p",1,14,10,16,23,17,28,40);
} // End of Procedure
