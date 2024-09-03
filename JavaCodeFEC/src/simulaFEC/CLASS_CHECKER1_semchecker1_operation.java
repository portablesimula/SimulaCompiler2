// JavaLine 1 <== SourceLine 193
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_operation extends CLASS_CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=1, firstLine=193, lastLine=223, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p1_left;
    public CLASS_CHECKER1_semchecker1_exp p1_right;
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_operation_dump.class)); }
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_operation_sameAs.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_operation(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_left = sp1_left;
        this.p1_right = sp1_right;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_operation _STM() {
        // JavaLine 25 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 27 <== SourceLine 223
        // BEGIN operation INNER PART
        // ENDOF operation INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 operation",1,193,25,169,27,223,33,223);
} // End of Class
