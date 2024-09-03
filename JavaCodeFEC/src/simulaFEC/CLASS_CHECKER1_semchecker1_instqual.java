// JavaLine 1 <== SourceLine 565
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_instqual extends CLASS_CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=2, firstLine=565, lastLine=608, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 598
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_instqual_Block590_Block591_QERR_0=new RTS_LABEL(this,2,1,"QERR"); // Local Label #1=QERR At PrefixLevel 2
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 569
    public CLASS_COMMON_quantity L3opq_2=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_instqual_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_instqual_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_instqual(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_instqual _STM() {
        CLASS_CHECKER1_semchecker1_instqual _THIS=(CLASS_CHECKER1_semchecker1_instqual)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 30 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 32 <== SourceLine 223
                // BEGIN operation INNER PART
                // JavaLine 34 <== SourceLine 583
                if(_VALUE((p1_right.ctype==('Z')))) {
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
                }
                ;
                // JavaLine 39 <== SourceLine 584
                cl=((char)1);
                ;
                type=p1_right.type;
                ;
                // JavaLine 44 <== SourceLine 585
                if(_VALUE((type!=(((char)7))))) {
                    {
                        // JavaLine 47 <== SourceLine 586
                        if(_VALUE(((type!=(((char)15)))&((type!=(((char)9))))))) {
                            // JavaLine 49 <== SourceLine 587
                            new CLASS_ERRMSG_error1id((_CUR._SL._SL),313,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                        }
                    }
                }
                ;
                // JavaLine 55 <== SourceLine 588
                qual=new CLASS_CHECKER1_semchecker1_qualification((_CUR._SL))._RESULT;
                ;
                // JavaLine 58 <== SourceLine 589
                if(_VALUE((p1_right.qual!=(null)))) {
                    {
                        // JavaLine 61 <== SourceLine 590
                        if(_VALUE((qual.kind_1==(((char)5))))) {
                            {
                                // JavaLine 64 <== SourceLine 591
                                if(_VALUE((p1_right.qual==(qual)))) {
                                    {
                                        // JavaLine 67 <== SourceLine 592
                                        if(_VALUE(((CLASS_CHECKER1)(_CUR._SL._SL)).GiveNotes)) {
                                            new CLASS_ERRMSG_note1id((_CUR._SL._SL),395,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 74 <== SourceLine 594
                                    if(_VALUE(new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),p1_right.qual,qual)._RESULT)) {
                                        ;
                                    } else {
                                        // JavaLine 78 <== SourceLine 595
                                        if(_VALUE(new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),qual,p1_right.qual)._RESULT)) {
                                            {
                                                // JavaLine 81 <== SourceLine 596
                                                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL)).NoneCheck_6||(((CLASS_CHECKER1)(_CUR._SL._SL)).QuaCheck_6)))) {
                                                    L3opq_2=qual;
                                                }
                                            }
                                        } else {
                                            // JavaLine 87 <== SourceLine 598
                                            {
                                                _SIM_LABEL(1); // DeclaredIn: instqual -> instqual[CLASS_CHECKER1_semchecker1_instqual] DeclarationKind=Class
                                                new CLASS_ERRMSG_error2quants((_CUR._SL._SL),402,qual,p1_right.qual);
                                            }
                                        }
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 98 <== SourceLine 600
                            if(_VALUE((qual.kind_1==(((char)7))))) {
                                {
                                    // JavaLine 101 <== SourceLine 601
                                    if(_VALUE((p1_right.qual.kind_1==(((char)7))))) {
                                        {
                                            // JavaLine 104 <== SourceLine 602
                                            if(_VALUE((!(new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),p1_right.qual,qual)._RESULT)))) {
                                                // JavaLine 106 <== SourceLine 603
                                                new CLASS_ERRMSG_error1id((_CUR._SL._SL),-241,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 112 <== SourceLine 604
                                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_instqual_Block590_Block591_QERR_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                }
                            } else {
                                // JavaLine 118 <== SourceLine 606
                                {
                                    qual=p1_right.qual;
                                    ;
                                    new CLASS_ERRMSG_error1id((_CUR._SL._SL),335,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                }
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 608
                // BEGIN instqual INNER PART
                // ENDOF instqual INNER PART
                // ENDOF operation INNER PART
                // ENDOF exp INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 instqual",1,565,10,598,13,569,30,169,32,223,34,583,39,584,44,585,47,586,49,587,55,588,58,589,61,590,64,591,67,592,74,594,78,595,81,596,87,598,98,600,101,601,104,602,106,603,112,604,118,606,130,608,144,608);
} // End of Class
