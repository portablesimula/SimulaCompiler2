// JavaLine 1 <== SourceLine 802
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_extquantity extends COMMON_quantity {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=2, firstLine=802, lastLine=816, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public COMMON_extbrecord p2_module;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 807
    public char clf_2=0;
    // JavaLine 13 <== SourceLine 808
    public char longindic_2=0;
    // Normal Constructor
    public COMMON_extquantity(RTS_RTObject staticLink,COMMON_extbrecord sp2_module) {
        super(staticLink);
        // Parameter assignment to locals
        this.p2_module = sp2_module;
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_extquantity _STM() {
        // JavaLine 25 <== SourceLine 84
        // BEGIN INNER PART
        // JavaLine 27 <== SourceLine 762
        // BEGIN INNER PART
        // JavaLine 29 <== SourceLine 816
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 extquantity",1,802,11,807,13,808,25,84,27,762,29,816,36,816);
} // End of Class
