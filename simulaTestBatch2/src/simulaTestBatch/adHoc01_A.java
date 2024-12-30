// JavaLine 1 <== SourceLine 5
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Dec 30 08:44:23 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class adHoc01_A extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=1, PrefixLevel=0, firstLine=5, lastLine=8, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 7
    public int i=0;
    public int j=0;
    public int k=0;
    // Normal Constructor
    public adHoc01_A(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public adHoc01_A _STM() {
        // JavaLine 24 <== SourceLine 8
        // BEGIN A INNER PART
        // ENDOF A INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc01.sim","9 A",1,5,10,7,24,8,29,8);
} // End of Class
