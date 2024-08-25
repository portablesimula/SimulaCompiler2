// JavaLine 1 <== SourceLine 531
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_classcomparator extends CHECKER1_semchecker1_relation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=3, firstLine=531, lastLine=563, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 553
    public COMMON_quantity _inspect_553_4561_3=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_classcomparator_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_classcomparator_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_classcomparator(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_exp sp1_left,CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_classcomparator _STM() {
        // JavaLine 23 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 25 <== SourceLine 223
        // BEGIN INNER PART
        // JavaLine 27 <== SourceLine 268
        // BEGIN INNER PART
        // JavaLine 29 <== SourceLine 547
        if(_VALUE((p1_right.ctype==('Z')))) {
            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_right)));
        }
        ;
        // JavaLine 34 <== SourceLine 548
        cl=((char)1);
        ;
        ctype=':';
        ;
        // JavaLine 39 <== SourceLine 549
        qual=new CHECKER1_semchecker1_qualification((_CUR._SL))._RESULT;
        ;
        // JavaLine 42 <== SourceLine 550
        if(_VALUE((qual.kind_1!=(((char)5))))) {
            new ERRMSG_error1id((_CUR._SL._SL),243,((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
        } else {
            // JavaLine 46 <== SourceLine 551
            if(_VALUE((p1_right.type!=(((char)7))))) {
                {
                    if(_VALUE((p1_right.type!=(((char)15))))) {
                        // JavaLine 50 <== SourceLine 552
                        new ERRMSG_error0((_CUR._SL._SL),(((p_ch==(((char)25))))?(153):(154)));
                    }
                }
            }
        }
        ;
        // JavaLine 57 <== SourceLine 553
        {
            // BEGIN INSPECTION 
            _inspect_553_4561_3=p1_right.qual;
            if(_inspect_553_4561_3!=null) { // INSPECT _inspect_553_4561_3
                // JavaLine 62 <== SourceLine 554
                {
                    // JavaLine 64 <== SourceLine 553
                    {
                        // JavaLine 66 <== SourceLine 554
                        if(_VALUE((_inspect_553_4561_3.kind_1==(((char)7))))) {
                            new ERRMSG_error1id((_CUR._SL._SL),243,((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                        } else {
                            // JavaLine 70 <== SourceLine 555
                            if(_VALUE(((CHECKER1)(_CUR._SL._SL)).GiveNotes)) {
                                {
                                    // JavaLine 73 <== SourceLine 556
                                    if(_VALUE(new BUILDER1_precheck0_subclass((_CUR._SL),p1_right.qual,qual)._RESULT)) {
                                        {
                                            // JavaLine 76 <== SourceLine 557
                                            if(_VALUE((p_ch==(((char)25))))) {
                                                new ERRMSG_note1id((_CUR._SL._SL),394,((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 83 <== SourceLine 559
                                        if(_VALUE(new BUILDER1_precheck0_subclass((_CUR._SL),qual,p1_right.qual)._RESULT)) {
                                            ;
                                        } else {
                                            // JavaLine 87 <== SourceLine 560
                                            new ERRMSG_note1id((_CUR._SL._SL),(((p_ch==(((char)25))))?(392):(393)),((CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 100 <== SourceLine 562
        type=((char)1);
        ;
        // JavaLine 103 <== SourceLine 563
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 classcomparator",1,531,10,553,23,169,25,223,27,268,29,547,34,548,39,549,42,550,46,551,50,552,57,553,62,554,64,553,66,554,70,555,73,556,76,557,83,559,87,560,100,562,103,563,111,563);
} // End of Class
