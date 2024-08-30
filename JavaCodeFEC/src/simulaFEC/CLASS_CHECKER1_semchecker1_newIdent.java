// JavaLine 1 <== SourceLine 1697
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_newIdent extends CLASS_CHECKER1_semchecker1_identifier {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=1697, lastLine=1704, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_newIdent(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_newIdent _STM() {
        // JavaLine 19 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 21 <== SourceLine 1480
        // BEGIN identifier INNER PART
        // JavaLine 23 <== SourceLine 1699
        ctype='Z';
        ;
        // JavaLine 26 <== SourceLine 1700
        qual=meaning=new CLASS_CHECKER1_semchecker1_qualification((_CUR._SL))._RESULT;
        ;
        // JavaLine 29 <== SourceLine 1701
        type=((char)7);
        ;
        kind=((char)5);
        ;
        // JavaLine 34 <== SourceLine 1702
        if(_VALUE((qual.kind_1!=(((char)5))))) {
            {
                // JavaLine 37 <== SourceLine 1703
                type=((char)15);
                ;
                new CLASS_ERRMSG_error1id((_CUR._SL._SL),335,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                ;
            }
        }
        ;
        // JavaLine 45 <== SourceLine 1704
        // BEGIN newIdent INNER PART
        // ENDOF newIdent INNER PART
        // ENDOF identifier INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 newIdent",1,1697,19,169,21,1480,23,1699,26,1700,29,1701,34,1702,37,1703,45,1704,52,1704);
} // End of Class
