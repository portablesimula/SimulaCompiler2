// JavaLine 1 <== SourceLine 226
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_expinparantes extends CLASS_CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=226, lastLine=240, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_expinparantes_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_expinparantes_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_expinparantes(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_expinparantes _STM() {
        // JavaLine 21 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 23 <== SourceLine 223
        // BEGIN operation INNER PART
        // JavaLine 25 <== SourceLine 236
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
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
        // BEGIN expinparantes INNER PART
        // ENDOF expinparantes INNER PART
        // ENDOF operation INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 expinparantes",1,226,21,169,23,223,25,236,30,237,33,238,38,240,45,240);
} // End of Class
