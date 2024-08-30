// JavaLine 1 <== SourceLine 564
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1_precheck0_ignore extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=564, lastLine=568, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_COMMON_idpack p_hp;
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 565
    public CLASS_BUILDER1_precheck0_ignore prev=null;
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_ignore(RTS_RTObject staticLink,CLASS_COMMON_idpack sp_hp,CLASS_COMMON_quantity sp_q) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_hp = sp_hp;
        this.p_q = sp_q;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1_precheck0_ignore _STM() {
        // JavaLine 26 <== SourceLine 566
        prev=((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp;
        ;
        ((CLASS_BUILDER1_precheck0)(_CUR._SL)).curhp=((CLASS_BUILDER1_precheck0_ignore)(_CUR));
        ;
        // JavaLine 31 <== SourceLine 567
        p_q.protect_1=((char)0);
        ;
        // JavaLine 34 <== SourceLine 568
        // BEGIN ignore INNER PART
        // ENDOF ignore INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","8 ignore",1,564,12,565,26,566,31,567,34,568,39,568);
} // End of Class
