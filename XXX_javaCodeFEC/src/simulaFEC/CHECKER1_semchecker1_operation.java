// JavaLine 1 <== SourceLine 193
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_operation extends CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=193, lastLine=223, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CHECKER1_semchecker1_exp p1_left;
    public CHECKER1_semchecker1_exp p1_right;
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_operation_dump.class)); }
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_operation_sameAs.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_operation(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_exp sp1_left,CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_left = sp1_left;
        this.p1_right = sp1_right;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_operation _STM() {
        // JavaLine 25 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 27 <== SourceLine 223
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 operation",1,193,25,169,27,223,33,223);
} // End of Class
