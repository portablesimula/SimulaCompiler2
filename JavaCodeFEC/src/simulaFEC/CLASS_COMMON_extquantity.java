// JavaLine 1 <== SourceLine 802
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_extquantity extends CLASS_COMMON_quantity {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=2, firstLine=802, lastLine=816, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_COMMON_extbrecord p2_module;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 807
    public char clf_2=0;
    // JavaLine 13 <== SourceLine 808
    public char longindic_2=0;
    // Normal Constructor
    public CLASS_COMMON_extquantity(RTS_RTObject staticLink,CLASS_COMMON_extbrecord sp2_module) {
        super(staticLink);
        // Parameter assignment to locals
        this.p2_module = sp2_module;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_extquantity _STM() {
        // JavaLine 25 <== SourceLine 84
        // BEGIN sembox INNER PART
        // JavaLine 27 <== SourceLine 762
        // BEGIN quantity INNER PART
        // JavaLine 29 <== SourceLine 816
        // BEGIN extquantity INNER PART
        // ENDOF extquantity INNER PART
        // ENDOF quantity INNER PART
        // ENDOF sembox INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","8 extquantity",1,802,11,807,13,808,25,84,27,762,29,816,36,816);
} // End of Class
