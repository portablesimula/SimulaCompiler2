// JavaLine 1 <== SourceLine 2111
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_argument extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=2111, lastLine=2130, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public int p_argno;
    public CHECKER1_semchecker1_exp p_actual;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 2118
    public CHECKER1_semchecker1_argument nextarg=null;
public RTS_PRCQNT emit_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: emit"); }
public RTS_PRCQNT dump_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: dump"); }
    // Normal Constructor
    public CHECKER1_semchecker1_argument(RTS_RTObject staticLink,int sp_argno,CHECKER1_semchecker1_exp sp_actual) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_argno = sp_argno;
        this.p_actual = sp_actual;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_argument _STM() {
        // JavaLine 28 <== SourceLine 2130
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 argument",1,2111,12,2118,28,2130,33,2130);
} // End of Class
