// JavaLine 1 <== SourceLine 559
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1_precheck0_ignore extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=559, lastLine=563, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public COMMON_idpack p_hp;
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 560
    public BUILDER1_precheck0_ignore prev=null;
    // Normal Constructor
    public BUILDER1_precheck0_ignore(RTS_RTObject staticLink,COMMON_idpack sp_hp,COMMON_quantity sp_q) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_hp = sp_hp;
        this.p_q = sp_q;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER1_precheck0_ignore _STM() {
        // JavaLine 26 <== SourceLine 561
        prev=((BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        ((BUILDER1_precheck0)(_CUR._SL)).curhp=((BUILDER1_precheck0_ignore)(_CUR));
        ;
        // JavaLine 31 <== SourceLine 562
        p_q.protect_1=((char)0);
        ;
        // JavaLine 34 <== SourceLine 563
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 ignore",1,559,12,560,26,561,31,562,34,563,39,563);
} // End of Class
