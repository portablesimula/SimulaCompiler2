// JavaLine 1 <== SourceLine 1707
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_prefIdent extends CHECKER1_semchecker1_identifier {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=1707, lastLine=1718, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CHECKER1_semchecker1_prefIdent(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_prefIdent _STM() {
        // JavaLine 19 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 21 <== SourceLine 1480
        // BEGIN INNER PART
        // JavaLine 23 <== SourceLine 1710
        ctype='Z';
        ;
        // JavaLine 26 <== SourceLine 1711
        meaning=new BUILDER1_meaningof((_CUR._SL._SL),((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        ;
        // JavaLine 29 <== SourceLine 1712
        if(_VALUE((meaning==(null)))) {
            meaning=new ERRMSG_newnotseen((_CUR._SL._SL),((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
        }
        ;
        // JavaLine 34 <== SourceLine 1713
        if(_VALUE((meaning.kind_1!=(((char)5))))) {
            {
                // JavaLine 37 <== SourceLine 1714
                new CHECKER1_semchecker1_identifier_identError((_CUR),333);
                ;
                meaning=null;
            }
        } else {
            // JavaLine 43 <== SourceLine 1715
            if(_VALUE((meaning.descr_1.npar>(0)))) {
                new CHECKER1_semchecker1_identifier_identError((_CUR),352);
            }
        }
        ;
        // JavaLine 49 <== SourceLine 1716
        cl=((char)1);
        ;
        // JavaLine 52 <== SourceLine 1718
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 prefIdent",1,1707,19,169,21,1480,23,1710,26,1711,29,1712,34,1713,37,1714,43,1715,49,1716,52,1718,59,1718);
} // End of Class
