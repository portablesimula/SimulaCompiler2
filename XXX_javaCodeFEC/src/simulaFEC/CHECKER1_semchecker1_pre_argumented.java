// JavaLine 1 <== SourceLine 1720
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_pre_argumented extends CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1720, lastLine=1778, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CHECKER1_semchecker1_identifier p1_ident;
    public CHECKER1_semchecker1_argument p1_arguments;
    public int p1_noofexpargs;
    public int p1_noofactargs;
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_pre_argumented_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_pre_argumented_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_pre_argumented(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_identifier sp1_ident,CHECKER1_semchecker1_argument sp1_arguments,int sp1_noofexpargs,int sp1_noofactargs) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_ident = sp1_ident;
        this.p1_arguments = sp1_arguments;
        this.p1_noofexpargs = sp1_noofexpargs;
        this.p1_noofactargs = sp1_noofactargs;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_pre_argumented _STM() {
        // JavaLine 29 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 31 <== SourceLine 1778
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 pre_argumented",1,1720,29,169,31,1778,37,1778);
} // End of Class
