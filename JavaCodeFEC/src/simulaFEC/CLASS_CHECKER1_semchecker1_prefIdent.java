// JavaLine 1 <== SourceLine 1707
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_prefIdent extends CLASS_CHECKER1_semchecker1_identifier {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=2, firstLine=1707, lastLine=1718, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_prefIdent(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_prefIdent _STM() {
        // JavaLine 19 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 21 <== SourceLine 1480
        // BEGIN identifier INNER PART
        // JavaLine 23 <== SourceLine 1710
        ctype='Z';
        ;
        // JavaLine 26 <== SourceLine 1711
        meaning=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        ;
        // JavaLine 29 <== SourceLine 1712
        if(_VALUE((meaning==(null)))) {
            meaning=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        }
        ;
        // JavaLine 34 <== SourceLine 1713
        if(_VALUE((meaning.kind_1!=(((char)5))))) {
            {
                // JavaLine 37 <== SourceLine 1714
                new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),333);
                ;
                meaning=null;
            }
        } else {
            // JavaLine 43 <== SourceLine 1715
            if(_VALUE((meaning.descr_1.npar>(0)))) {
                new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),352);
            }
        }
        ;
        // JavaLine 49 <== SourceLine 1716
        cl=((char)1);
        ;
        // JavaLine 52 <== SourceLine 1718
        // BEGIN prefIdent INNER PART
        // ENDOF prefIdent INNER PART
        // ENDOF identifier INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 prefIdent",1,1707,19,169,21,1480,23,1710,26,1711,29,1712,34,1713,37,1714,43,1715,49,1716,52,1718,59,1718);
} // End of Class
