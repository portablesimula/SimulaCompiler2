// JavaLine 1 <== SourceLine 926
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_refassign_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=926, lastLine=986, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 970
    public CLASS_COMMON_quantity _inspect_970_4568=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_refassign_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_refassign_emit _STM() {
        // JavaLine 23 <== SourceLine 929
        if(_VALUE((((RTS_UTIL._IS(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source,CLASS_CHECKER1_semchecker1_dotIdent.class)&&((((CLASS_CHECKER1_semchecker1_dotIdent)(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source)).p2_dotexp!=(null))))&&((((CLASS_CHECKER1_semchecker1_dotIdent)(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source)).p2_dotexp.type!=(((char)8)))))&&(((boolean)(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.sameAs_0().CPF().setPar(((CLASS_CHECKER1_semchecker1_dotIdent)(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source)).p2_dotexp)._ENT()._RESULT())))))) {
            // JavaLine 25 <== SourceLine 936
            {
                // JavaLine 27 <== SourceLine 937
                ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.cl=((char)4);
                ;
                ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.emit_0().CPF();
                ;
                // JavaLine 32 <== SourceLine 938
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)27);
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,938);
                ;
                // JavaLine 37 <== SourceLine 939
                if(_VALUE(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).NoneCheck_6)) {
                    {
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
                        ;
                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,939);
                    }
                }
                ;
                // JavaLine 46 <== SourceLine 940
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='L';
                ;
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source.meaning;
                ;
                // JavaLine 51 <== SourceLine 941
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,941);
                ;
                // JavaLine 54 <== SourceLine 942
                ((CLASS_CHECKER1_semchecker1_dotIdent)(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source)).p2_dotexp=null;
                ;
                // JavaLine 57 <== SourceLine 943
                ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).issimple=0;
                ;
            }
        } else {
            // JavaLine 62 <== SourceLine 949
            {
                // JavaLine 64 <== SourceLine 950
                if(_VALUE((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).issimple==(0)))) {
                    {
                        // JavaLine 67 <== SourceLine 951
                        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.cl=((char)4);
                        ;
                        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.emit_0().CPF();
                        ;
                        // JavaLine 72 <== SourceLine 953
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='3';
                        ;
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 81 <== SourceLine 957
        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source.emit_0().CPF();
        ;
        // JavaLine 86 <== SourceLine 958
        if(_VALUE(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).implqua_1)) {
            {
                // JavaLine 89 <== SourceLine 959
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='@';
                ;
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).qual;
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,959);
                ;
            }
        }
        ;
        // JavaLine 99 <== SourceLine 965
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opt=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).type;
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='R';
        ;
        // JavaLine 104 <== SourceLine 966
        if(_VALUE((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.ctype==('Z')))) {
            {
                // JavaLine 107 <== SourceLine 967
                if(_VALUE(((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).issimple!=(0))&&(RTS_UTIL._IS(((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target,CLASS_CHECKER1_semchecker1_dotIdent.class))))) {
                    {
                        // JavaLine 110 <== SourceLine 968
                        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.cl=((char)4);
                        ;
                        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.emit_0().CPF();
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='3';
                    }
                } else {
                    // JavaLine 118 <== SourceLine 970
                    {
                        // BEGIN INSPECTION 
                        _inspect_970_4568=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.meaning;
                        if(_inspect_970_4568!=null) { // INSPECT _inspect_970_4568  type=ref(QUANTITY)
                            // JavaLine 123 <== SourceLine 971
                            {
                                // JavaLine 125 <== SourceLine 970
                                {
                                    // JavaLine 127 <== SourceLine 971
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_COMMON_quantity)_inspect_970_4568);
                                    ;
                                    // JavaLine 130 <== SourceLine 972
                                    if(_VALUE((_inspect_970_4568.categ_1==(((char)6))))) {
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=_inspect_970_4568.match_1;
                                    }
                                    ;
                                    // JavaLine 135 <== SourceLine 973
                                    if(_VALUE((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).issimple!=(0)))) {
                                        {
                                            // JavaLine 138 <== SourceLine 974
                                            if(_VALUE((_inspect_970_4568.kind_1==(((char)1))))) {
                                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='n';
                                            } else {
                                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)140);
                                            }
                                        }
                                    } else {
                                        // JavaLine 146 <== SourceLine 975
                                        if(_VALUE((_inspect_970_4568.categ_1==(((char)2))))) {
                                            ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='!';
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
            }
        } else {
            // JavaLine 159 <== SourceLine 978
            if(_VALUE((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).issimple!=(0)))) {
                {
                    // JavaLine 162 <== SourceLine 979
                    ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.cl=((char)4);
                    ;
                    ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target.emit_0().CPF();
                    ;
                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='3';
                    ;
                }
            }
        }
        ;
        // JavaLine 173 <== SourceLine 981
        if(_VALUE((((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).cl==(((char)1))))) {
            ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
        }
        ;
        // JavaLine 178 <== SourceLine 982
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,982);
        ;
        // JavaLine 181 <== SourceLine 983
        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_target=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).p1_source=null;
        ;
        // JavaLine 184 <== SourceLine 984
        ((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).qual=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL)).meaning=null;
        ;
        // JavaLine 187 <== SourceLine 985
        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).refassList_2=((CLASS_CHECKER1_semchecker1_refassign)(_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,926,10,970,23,929,25,936,27,937,32,938,37,939,46,940,51,941,54,942,57,943,62,949,64,950,67,951,72,953,81,957,86,958,89,959,99,965,104,966,107,967,110,968,118,970,123,971,125,970,127,971,130,972,135,973,138,974,146,975,159,978,162,979,173,981,178,982,181,983,184,984,187,985,192,986);
} // End of Procedure
