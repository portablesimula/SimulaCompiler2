// JavaLine 1 <== SourceLine 270
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_refrel extends CLASS_CHECKER1_semchecker1_relation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=3, firstLine=270, lastLine=337, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_refrel_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_refrel(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_refrel _STM() {
        // JavaLine 20 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 22 <== SourceLine 223
        // BEGIN operation INNER PART
        // JavaLine 24 <== SourceLine 268
        // BEGIN relation INNER PART
        // JavaLine 26 <== SourceLine 309
        if(_VALUE((p1_left==(null)))) {
            opttype_2=((char)8);
        } else {
            // JavaLine 30 <== SourceLine 310
            {
                // JavaLine 32 <== SourceLine 311
                opttype_2=p1_left.type;
                ;
                // JavaLine 35 <== SourceLine 312
                if(_VALUE((p1_left.ctype==('Z')))) {
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_left)));
                }
                ;
            }
        }
        ;
        // JavaLine 43 <== SourceLine 314
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
        }
        ;
        // JavaLine 48 <== SourceLine 315
        cl=((char)1);
        ;
        // JavaLine 51 <== SourceLine 316
        ctype=':';
        ;
        // JavaLine 54 <== SourceLine 318
        if(opttype_2<((char)0) || opttype_2>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
        switch(opttype_2) { // BEGIN SWITCH STATEMENT
            case 7: 
            case 8: 
            // JavaLine 59 <== SourceLine 320
            if(_VALUE((opttype_2!=(p1_right.type)))) {
                {
                    // JavaLine 62 <== SourceLine 321
                    if(_VALUE(((p1_right.type!=(((char)7)))&&((p1_right.type!=(((char)8))))))) {
                        // JavaLine 64 <== SourceLine 322
                        new CLASS_ERRMSG_error2xx((_CUR._SL._SL),432,p1_right.type,p_ch);
                    } else {
                        // JavaLine 67 <== SourceLine 323
                        new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),opttype_2,p1_right.type);
                    }
                    ;
                }
            }
            break;
            case 9: 
            // JavaLine 75 <== SourceLine 325
            {
                // JavaLine 77 <== SourceLine 327
                if(_VALUE((opttype_2!=(p1_right.type)))) {
                    {
                        // JavaLine 80 <== SourceLine 328
                        if(_VALUE((p1_right.type!=(((char)7))))) {
                            // JavaLine 82 <== SourceLine 329
                            new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),opttype_2,p1_right.type);
                        }
                        ;
                    }
                }
            }
            break;
            case 15: 
            ;
            break;
            default:
            // JavaLine 94 <== SourceLine 332
            {
                // JavaLine 96 <== SourceLine 333
                new CLASS_ERRMSG_error2xx((_CUR._SL._SL),431,opttype_2,p_ch);
                ;
                opttype_2=((char)15);
                ;
            }
            break;
        } // END SWITCH STATEMENT
        ;
        // JavaLine 105 <== SourceLine 336
        type=((char)1);
        ;
        // JavaLine 108 <== SourceLine 337
        // BEGIN refrel INNER PART
        // ENDOF refrel INNER PART
        // ENDOF relation INNER PART
        // ENDOF operation INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 refrel",1,270,20,169,22,223,24,268,26,309,30,310,32,311,35,312,43,314,48,315,51,316,54,318,59,320,62,321,64,322,67,323,75,325,77,327,80,328,82,329,94,332,96,333,105,336,108,337,116,337);
} // End of Class
