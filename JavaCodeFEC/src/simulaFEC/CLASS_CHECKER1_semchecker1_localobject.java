// JavaLine 1 <== SourceLine 610
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_localobject extends CLASS_CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=610, lastLine=651, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 651
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_localobject_EXIT_2=new RTS_LABEL(this,2,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 2
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 613
    public CLASS_COMMON_quantity L3opq_2=null;
    // JavaLine 15 <== SourceLine 632
    public CLASS_COMMON_quantity _inspect_631_4563=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_localobject_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_localobject_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_localobject(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_localobject _STM() {
        CLASS_CHECKER1_semchecker1_localobject _THIS=(CLASS_CHECKER1_semchecker1_localobject)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 32 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 34 <== SourceLine 223
                // BEGIN operation INNER PART
                // JavaLine 36 <== SourceLine 623
                cl=((char)1);
                ;
                // JavaLine 39 <== SourceLine 624
                type=((char)7);
                ;
                // JavaLine 42 <== SourceLine 625
                qual=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                ;
                // JavaLine 45 <== SourceLine 626
                if(_VALUE((qual==(null)))) {
                    qual=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                }
                ;
                // JavaLine 50 <== SourceLine 628
                if(_VALUE((qual.kind_1!=(((char)5))))) {
                    {
                        // JavaLine 53 <== SourceLine 629
                        new CLASS_ERRMSG_error1qlin((_CUR._SL._SL),328,qual);
                        ;
                        qual=null;
                    }
                } else {
                    // JavaLine 59 <== SourceLine 630
                    {
                        // JavaLine 61 <== SourceLine 631
                        {
                            // BEGIN INSPECTION 
                            _inspect_631_4563=new CLASS_BUILDER1_precheck0_getClass((_CUR._SL),qual,RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qual.encl_1.blev)+(1))))._RESULT;
                            if(_inspect_631_4563!=null) { // INSPECT _inspect_631_4563  type=ref(QUANTITY)
                                // JavaLine 66 <== SourceLine 633
                                {
                                    // JavaLine 68 <== SourceLine 632
                                    {
                                        // JavaLine 70 <== SourceLine 634
                                        if(_VALUE(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).inarraybound_2)) {
                                            {
                                                // JavaLine 73 <== SourceLine 635
                                                if(_VALUE((_inspect_631_4563.descr_1.blev==(((CLASS_CHECKER1)(_CUR._SL._SL)).cblev_6)))) {
                                                    // JavaLine 75 <== SourceLine 636
                                                    new CLASS_ERRMSG_error1id((_CUR._SL._SL),314,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 81 <== SourceLine 637
                                        L3opq_2=((CLASS_CHECKER1)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_631_4563.descr_1.blev)).declquant;
                                        ;
                                        // JavaLine 84 <== SourceLine 638
                                        while((L3opq_2.kind_1==(((char)11)))) {
                                            L3opq_2=L3opq_2.prefqual_1;
                                        }
                                        ;
                                        // JavaLine 89 <== SourceLine 641
                                        if(_VALUE((L3opq_2.kind_1==(((char)9))))) {
                                            new CLASS_ERRMSG_error1id((_CUR._SL._SL),315,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                        } else {
                                            // JavaLine 93 <== SourceLine 642
                                            if(_VALUE((L3opq_2.kind_1==(((char)5))))) {
                                                L3opq_2.descr_1.thisused=true;
                                            }
                                        }
                                        ;
                                        // JavaLine 99 <== SourceLine 643
                                        L3opq_2=((CLASS_COMMON_quantity)_inspect_631_4563);
                                        ;
                                    }
                                }
                            }
                            else { // OTHERWISE 
                                // JavaLine 106 <== SourceLine 645
                                {
                                    // JavaLine 108 <== SourceLine 646
                                    new CLASS_ERRMSG_error1id((_CUR._SL._SL),311,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                                    ;
                                    L3opq_2=qual;
                                    ;
                                }
                            } // END OTHERWISE 
                        } // END INSPECTION
                        ;
                    }
                }
                ;
                // JavaLine 120 <== SourceLine 651
                {
                    _SIM_LABEL(1); // DeclaredIn: localobject
                    ;
                }
                // BEGIN localobject INNER PART
                // ENDOF localobject INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 localobject",1,610,10,651,13,613,15,632,32,169,34,223,36,623,39,624,42,625,45,626,50,628,53,629,59,630,61,631,66,633,68,632,70,634,73,635,75,636,81,637,84,638,89,641,93,642,99,643,106,645,108,646,120,651,138,651);
} // End of Class
