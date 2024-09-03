// JavaLine 1 <== SourceLine 242
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_boolop extends CLASS_CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=2, firstLine=242, lastLine=264, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_boolop_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_boolop(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_boolop _STM() {
        // JavaLine 20 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 22 <== SourceLine 223
        // BEGIN operation INNER PART
        // JavaLine 24 <== SourceLine 257
        if(_VALUE((p1_left.ctype==('Z')))) {
            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_left)));
        }
        ;
        // JavaLine 29 <== SourceLine 258
        if(_VALUE((p1_left.type!=(((char)1))))) {
            new CLASS_ERRMSG_error2xx((_CUR._SL._SL),429,p1_left.type,p_ch);
        }
        ;
        // JavaLine 34 <== SourceLine 260
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
        }
        ;
        // JavaLine 39 <== SourceLine 261
        cl=((char)1);
        ;
        // JavaLine 42 <== SourceLine 262
        if(_VALUE((p1_right.type!=(((char)1))))) {
            new CLASS_ERRMSG_error2xx((_CUR._SL._SL),430,p1_right.type,p_ch);
        }
        ;
        // JavaLine 47 <== SourceLine 263
        type=((char)1);
        // JavaLine 49 <== SourceLine 264
        // BEGIN boolop INNER PART
        // ENDOF boolop INNER PART
        // ENDOF operation INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 boolop",1,242,20,169,22,223,24,257,29,258,34,260,39,261,42,262,47,263,49,264,56,264);
} // End of Class
