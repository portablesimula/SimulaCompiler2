// JavaLine 1 <== SourceLine 2561
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_switchelement extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=0, firstLine=2561, lastLine=2581, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_labelexp;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 2563
    public char blocklevel=0;
    // JavaLine 13 <== SourceLine 2569
    public CLASS_CHECKER1_semchecker1_switchelement next=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_switchelement(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_labelexp) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_labelexp = sp_labelexp;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_switchelement _STM() {
        // JavaLine 26 <== SourceLine 2574
        if(_VALUE((p_labelexp.type!=(((char)11))))) {
            {
                if(_VALUE((p_labelexp.type!=(((char)15))))) {
                    // JavaLine 30 <== SourceLine 2575
                    new CLASS_ERRMSG_error0((_CUR._SL._SL),164);
                }
            }
        }
        ;
        // JavaLine 36 <== SourceLine 2576
        if(_VALUE((p_labelexp.ctype==('Z')))) {
            {
                // JavaLine 39 <== SourceLine 2577
                new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p_labelexp)));
                ;
                // JavaLine 42 <== SourceLine 2578
                if(_VALUE((p_labelexp.meaning.categ_1==(((char)3))))) {
                    // JavaLine 44 <== SourceLine 2579
                    blocklevel=p_labelexp.meaning.encl_1.blev;
                }
                ;
            }
        }
        ;
        // JavaLine 51 <== SourceLine 2581
        // BEGIN switchelement INNER PART
        // ENDOF switchelement INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 switchelement",1,2561,11,2563,13,2569,26,2574,30,2575,36,2576,39,2577,42,2578,44,2579,51,2581,56,2581);
} // End of Class
