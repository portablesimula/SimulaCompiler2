// JavaLine 1 <== SourceLine 100
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_exp extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=100, lastLine=169, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_pred;
    public char p_ch;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 110
    public char type=0;
    // JavaLine 14 <== SourceLine 111
    public char cl=0;
    // JavaLine 16 <== SourceLine 112
    public char ctype=0;
    // JavaLine 18 <== SourceLine 113
    public int issimple=0;
    // JavaLine 20 <== SourceLine 119
    public char kind=0;
    // JavaLine 22 <== SourceLine 120
    public CLASS_COMMON_quantity qual=null;
    // JavaLine 24 <== SourceLine 121
    public CLASS_COMMON_quantity meaning=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_exp_dump.class)); }
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_exp_sameAs.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_exp_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_exp(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_pred = sp_pred;
        this.p_ch = sp_ch;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_exp _STM() {
        // JavaLine 41 <== SourceLine 169
        // BEGIN exp INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 exp",1,100,12,110,14,111,16,112,18,113,20,119,22,120,24,121,41,169,46,169);
} // End of Class
