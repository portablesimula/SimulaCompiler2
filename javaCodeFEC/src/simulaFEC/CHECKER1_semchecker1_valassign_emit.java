// JavaLine 1 <== SourceLine 739
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_valassign_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=739, lastLine=808, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 794
    public COMMON_quantity _inspect_794_4565=null;
    // Normal Constructor
    public CHECKER1_semchecker1_valassign_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_valassign_emit _STM() {
        // JavaLine 23 <== SourceLine 744
        if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).type==(((char)8))))) {
            {
                // JavaLine 26 <== SourceLine 745
                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.emit_0().CPF();
                ;
                // JavaLine 29 <== SourceLine 747
                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)18);
                ;
                // JavaLine 32 <== SourceLine 748
                ((CHECKER1)(_CUR._SL._SL._SL)).opt=(((((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.cl==(((char)1))))?('A'):(((char)14)));
                ;
                // JavaLine 35 <== SourceLine 749
                if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).cl==(((char)1))))) {
                    ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
                }
                ;
                // JavaLine 40 <== SourceLine 750
                call(((CHECKER1)(_CUR._SL._SL._SL)).coder,750);
                ;
                // JavaLine 43 <== SourceLine 752
                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.cl=((char)1);
                ;
                // JavaLine 46 <== SourceLine 753
                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.emit_0().CPF();
                ;
                // JavaLine 49 <== SourceLine 755
                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)10);
                ;
                // JavaLine 52 <== SourceLine 756
                ((CHECKER1)(_CUR._SL._SL._SL)).opt=(((((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.cl==(((char)1))))?('A'):(((char)14)));
                ;
            }
        } else {
            // JavaLine 57 <== SourceLine 761
            {
                // JavaLine 59 <== SourceLine 762
                if(_VALUE((((((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.ctype==(((char)147)))&&((((CHECKER1_semchecker1_operation)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source)).p1_left!=(null))))&&(((boolean)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.sameAs_0().CPF().setPar(((CHECKER1_semchecker1_operation)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source)).p1_left)._ENT()._RESULT())))))) {
                    // JavaLine 61 <== SourceLine 767
                    {
                        // JavaLine 63 <== SourceLine 768
                        ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.emit_0().CPF();
                        ;
                        // JavaLine 66 <== SourceLine 769
                        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)27);
                        ;
                        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,769);
                        ;
                        // JavaLine 71 <== SourceLine 770
                        if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.type!=(((CHECKER1_semchecker1_operation)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source)).p1_left.type)))) {
                            // JavaLine 73 <== SourceLine 771
                            new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.type,((CHECKER1_semchecker1_operation)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source)).p1_left.type);
                        }
                        ;
                        // JavaLine 77 <== SourceLine 773
                        ((CHECKER1_semchecker1_operation)(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source)).p1_left=null;
                        ;
                        // JavaLine 80 <== SourceLine 774
                        ((CHECKER1_semchecker1_valassign)(_CUR._SL)).issimple=0;
                        ;
                    }
                } else {
                    // JavaLine 85 <== SourceLine 776
                    {
                        // JavaLine 87 <== SourceLine 777
                        if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).issimple==(0)))) {
                            {
                                // JavaLine 90 <== SourceLine 778
                                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.emit_0().CPF();
                                ;
                                // JavaLine 93 <== SourceLine 780
                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='3';
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 102 <== SourceLine 783
                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.cl=((char)1);
                ;
                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.emit_0().CPF();
                ;
                // JavaLine 107 <== SourceLine 784
                if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).type!=(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.type)))) {
                    new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_valassign)(_CUR._SL)).type,((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source.type);
                }
                ;
                // JavaLine 112 <== SourceLine 789
                ((CHECKER1)(_CUR._SL._SL._SL)).opt=((CHECKER1_semchecker1_valassign)(_CUR._SL)).type;
                ;
                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='R';
                ;
                // JavaLine 117 <== SourceLine 790
                if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.ctype==('Z')))) {
                    {
                        // JavaLine 120 <== SourceLine 791
                        if(_VALUE(((((CHECKER1_semchecker1_valassign)(_CUR._SL)).issimple!=(0))&&(_IS(((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target,CHECKER1_semchecker1_dotIdent.class))))) {
                            {
                                // JavaLine 123 <== SourceLine 792
                                ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.emit_0().CPF();
                                ;
                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='3';
                            }
                        } else {
                            // JavaLine 129 <== SourceLine 794
                            {
                                // BEGIN INSPECTION 
                                _inspect_794_4565=((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target.meaning;
                                if(_inspect_794_4565!=null) { // INSPECT _inspect_794_4565
                                    // JavaLine 134 <== SourceLine 795
                                    {
                                        // JavaLine 136 <== SourceLine 794
                                        {
                                            // JavaLine 138 <== SourceLine 795
                                            ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((COMMON_quantity)_inspect_794_4565);
                                            ;
                                            // JavaLine 141 <== SourceLine 796
                                            if(_VALUE((_inspect_794_4565.categ_1==(((char)6))))) {
                                                ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=_inspect_794_4565.match_1;
                                            }
                                            ;
                                            // JavaLine 146 <== SourceLine 797
                                            if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).issimple!=(0)))) {
                                                {
                                                    // JavaLine 149 <== SourceLine 798
                                                    if(_VALUE((_inspect_794_4565.kind_1==(((char)1))))) {
                                                        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='n';
                                                    } else {
                                                        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)140);
                                                    }
                                                }
                                            } else {
                                                // JavaLine 157 <== SourceLine 799
                                                if(_VALUE((_inspect_794_4565.categ_1==(((char)2))))) {
                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='!';
                                                }
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 174 <== SourceLine 803
        if(_VALUE((((CHECKER1_semchecker1_valassign)(_CUR._SL)).cl==(((char)1))))) {
            ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
        }
        ;
        // JavaLine 179 <== SourceLine 804
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,804);
        ;
        // JavaLine 182 <== SourceLine 805
        ((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_target=((CHECKER1_semchecker1_valassign)(_CUR._SL)).p1_source=null;
        ;
        // JavaLine 185 <== SourceLine 806
        ((CHECKER1_semchecker1_valassign)(_CUR._SL)).qual=((CHECKER1_semchecker1_valassign)(_CUR._SL)).meaning=null;
        ;
        // JavaLine 188 <== SourceLine 807
        ((CHECKER1_semchecker1)(_CUR._SL._SL)).valassList_2=((CHECKER1_semchecker1_valassign)(_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,739,10,794,23,744,26,745,29,747,32,748,35,749,40,750,43,752,46,753,49,755,52,756,57,761,59,762,61,767,63,768,66,769,71,770,73,771,77,773,80,774,85,776,87,777,90,778,93,780,102,783,107,784,112,789,117,790,120,791,123,792,129,794,134,795,136,794,138,795,141,796,146,797,149,798,157,799,174,803,179,804,182,805,185,806,188,807,193,808);
} // End of Procedure
