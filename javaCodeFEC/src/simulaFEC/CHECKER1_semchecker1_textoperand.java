// JavaLine 1 <== SourceLine 687
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_textoperand extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=687, lastLine=699, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CHECKER1_semchecker1_exp p_actual;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 688
    public CHECKER1_semchecker1_textoperand next=null;
    // Normal Constructor
    public CHECKER1_semchecker1_textoperand(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_actual) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_actual = sp_actual;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_textoperand _STM() {
        // JavaLine 24 <== SourceLine 693
        if(_VALUE((p_actual.ctype==('Z')))) {
            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p_actual)));
        }
        ;
        // JavaLine 29 <== SourceLine 694
        if(_VALUE((p_actual.type!=(((char)8))))) {
            {
                // JavaLine 32 <== SourceLine 695
                if(_VALUE((p_actual.type!=(((char)15))))) {
                    new ERRMSG_error0((_CUR._SL._SL),155);
                }
                ;
                // JavaLine 37 <== SourceLine 696
                p_actual=((CHECKER1_semchecker1)(_CUR._SL)).dummytxtop_2.p_actual;
                ;
            }
        }
        ;
        // JavaLine 43 <== SourceLine 699
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 textoperand",1,687,11,688,24,693,29,694,32,695,37,696,43,699,48,699);
} // End of Class
