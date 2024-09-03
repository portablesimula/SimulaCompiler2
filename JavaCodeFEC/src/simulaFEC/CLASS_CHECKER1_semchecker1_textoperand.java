// JavaLine 1 <== SourceLine 687
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_textoperand extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=0, firstLine=687, lastLine=699, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_actual;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 688
    public CLASS_CHECKER1_semchecker1_textoperand next=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_textoperand(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_actual) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_actual = sp_actual;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_textoperand _STM() {
        // JavaLine 24 <== SourceLine 693
        if(_VALUE((p_actual.ctype==('Z')))) {
            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p_actual)));
        }
        ;
        // JavaLine 29 <== SourceLine 694
        if(_VALUE((p_actual.type!=(((char)8))))) {
            {
                // JavaLine 32 <== SourceLine 695
                if(_VALUE((p_actual.type!=(((char)15))))) {
                    new CLASS_ERRMSG_error0((_CUR._SL._SL),155);
                }
                ;
                // JavaLine 37 <== SourceLine 696
                p_actual=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).dummytxtop_2.p_actual;
                ;
            }
        }
        ;
        // JavaLine 43 <== SourceLine 699
        // BEGIN textoperand INNER PART
        // ENDOF textoperand INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 textoperand",1,687,11,688,24,693,29,694,32,695,37,696,43,699,48,699);
} // End of Class
