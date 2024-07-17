// JavaLine 1 <== SourceLine 242
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_boolop extends CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=242, lastLine=264, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_boolop_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_boolop(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_exp sp1_left,CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_boolop _STM() {
        // JavaLine 20 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 22 <== SourceLine 223
        // BEGIN INNER PART
        // JavaLine 24 <== SourceLine 257
        if(_VALUE((p1_left.ctype==('Z')))) {
            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_left)));
        }
        ;
        // JavaLine 29 <== SourceLine 258
        if(_VALUE((p1_left.type!=(((char)1))))) {
            new ERRMSG_error2xx((_CUR._SL._SL),429,p1_left.type,p_ch);
        }
        ;
        // JavaLine 34 <== SourceLine 260
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_right)));
        }
        ;
        // JavaLine 39 <== SourceLine 261
        cl=((char)1);
        ;
        // JavaLine 42 <== SourceLine 262
        if(_VALUE((p1_right.type!=(((char)1))))) {
            new ERRMSG_error2xx((_CUR._SL._SL),430,p1_right.type,p_ch);
        }
        ;
        // JavaLine 47 <== SourceLine 263
        type=((char)1);
        // JavaLine 49 <== SourceLine 264
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 boolop",1,242,20,169,22,223,24,257,29,258,34,260,39,261,42,262,47,263,49,264,56,264);
} // End of Class
