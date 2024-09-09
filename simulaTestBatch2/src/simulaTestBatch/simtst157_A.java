// JavaLine 1 <== SourceLine 32
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst157_A extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=32, lastLine=41, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public int p_ap;
    // Declare locals as attributes
    // Normal Constructor
    public simtst157_A(RTS_RTObject staticLink,int sp_ap) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_ap = sp_ap;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst157_A _STM() {
        // JavaLine 22 <== SourceLine 33
        new simtst157_A_Block33((_CUR))._STM();
        ;
        // JavaLine 25 <== SourceLine 41
        // BEGIN A INNER PART
        // ENDOF A INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","9 A",1,32,22,33,25,41,30,41);
} // End of Class
