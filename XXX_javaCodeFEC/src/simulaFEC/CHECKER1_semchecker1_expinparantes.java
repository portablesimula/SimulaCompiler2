// JavaLine 1 <== SourceLine 226
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_expinparantes extends CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=226, lastLine=240, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_expinparantes_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_expinparantes_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_expinparantes(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_exp sp1_left,CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_expinparantes _STM() {
        // JavaLine 21 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 23 <== SourceLine 223
        // BEGIN INNER PART
        // JavaLine 25 <== SourceLine 236
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_right)));
        }
        ;
        // JavaLine 30 <== SourceLine 237
        cl=((char)1);
        ;
        // JavaLine 33 <== SourceLine 238
        type=p1_right.type;
        ;
        qual=p1_right.qual;
        ;
        // JavaLine 38 <== SourceLine 240
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 expinparantes",1,226,21,169,23,223,25,236,30,237,33,238,38,240,45,240);
} // End of Class
