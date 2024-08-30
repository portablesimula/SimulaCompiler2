// JavaLine 1 <== SourceLine 1044
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_procLILFPA extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1044, lastLine=1200, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1052
    public CLASS_COMMON_quantity _inspect_1052_4652=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_procLILFPA(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_procLILFPA _STM() {
        // JavaLine 23 <== SourceLine 1049
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1049,new RTS_TXT(""),new RTS_TXT("============================= procLILFPA"));
        ;
        // JavaLine 26 <== SourceLine 1050
        if(_VALUE(((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6==(null))||((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.categ_1==(((char)2))))))) {
            {
                // JavaLine 29 <== SourceLine 1052
                {
                    // BEGIN INSPECTION 
                    _inspect_1052_4652=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
                    if(_inspect_1052_4652!=null) { // INSPECT _inspect_1052_4652  type=ref(QUANTITY)
                        // JavaLine 34 <== SourceLine 1053
                        {
                            // JavaLine 36 <== SourceLine 1052
                            {
                                // JavaLine 38 <== SourceLine 1053
                                if(_VALUE((RTS_UTIL._IS(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6,CLASS_COMMON_extquantity.class)&&((((CLASS_COMMON_extquantity)(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6)).clf_2!=(((char)0))))))) {
                                    // JavaLine 40 <== SourceLine 1055
                                    {
                                        // JavaLine 42 <== SourceLine 1057
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1057,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_1052_4652.ftag_1+(0)))._RESULT);
                                        ;
                                        // JavaLine 45 <== SourceLine 1058
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(75);
                                        ;
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1052_4652.ftag_1+(0)));
                                        ;
                                        // JavaLine 50 <== SourceLine 1059
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(73);
                                        ;
                                    }
                                } else {
                                    // JavaLine 55 <== SourceLine 1061
                                    {
                                        // JavaLine 57 <== SourceLine 1065
                                        if(_VALUE((_inspect_1052_4652.kind_1==(((char)0))))) {
                                            {
                                                // JavaLine 60 <== SourceLine 1068
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001y")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001z")),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                ;
                                                // JavaLine 63 <== SourceLine 1076
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1052_4652.ftag_1+(0)));
                                                ;
                                                // JavaLine 66 <== SourceLine 1077
                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1077,new RTS_TXT("ASSIGN"));
                                                ;
                                                // JavaLine 69 <== SourceLine 1078
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                ;
                                                // JavaLine 72 <== SourceLine 1079
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                ;
                                            }
                                        } else {
                                            // JavaLine 77 <== SourceLine 1082
                                            if(_VALUE((_inspect_1052_4652.kind_1==(((char)2))))) {
                                                {
                                                    // JavaLine 80 <== SourceLine 1084
                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                                    ;
                                                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1052_4652.ftag_1+(0)));
                                                    ;
                                                    // JavaLine 85 <== SourceLine 1085
                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001u")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                    ;
                                                    // JavaLine 88 <== SourceLine 1089
                                                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 93 <== SourceLine 1093
                                                if(_VALUE((_inspect_1052_4652.kind_1==(((char)1))))) {
                                                    {
                                                        // JavaLine 96 <== SourceLine 1097
                                                        new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),false);
                                                        ;
                                                        // JavaLine 99 <== SourceLine 1099
                                                        if(_VALUE(((_inspect_1052_4652.type_1!=(((char)14)))&&(((((_inspect_1052_4652.categ_1==(((char)6)))&&((_inspect_1052_4652.match_1!=(null)))))?((_inspect_1052_4652.match_1.descr_1.npar==(0))):((_inspect_1052_4652.descr_1.npar==(0)))))))) {
                                                            // JavaLine 101 <== SourceLine 1102
                                                            {
                                                                // JavaLine 103 <== SourceLine 1103
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u00b7")),new RTS_TXT("Q")),new RTS_TXT("\u001c")),new RTS_TXT("=")),new RTS_TXT("\u007c")),new RTS_TXT("\u0088")),new RTS_TXT("\u0006A")),new RTS_TXT("F")),new RTS_TXT("\u0006B")));
                                                                ;
                                                                // JavaLine 106 <== SourceLine 1110
                                                                new CLASS_SCODER0_codegenerator0_pushasd((_CUR._SL));
                                                                ;
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                ;
                                                                // JavaLine 111 <== SourceLine 1112
                                                                if(_VALUE((((_inspect_1052_4652.categ_1==(((char)0)))||((_inspect_1052_4652.categ_1==(((char)2)))))&&(((((char)3)<=(_inspect_1052_4652.type_1))&&((_inspect_1052_4652.type_1<=(((char)6))))))))) {
                                                                    // JavaLine 113 <== SourceLine 1115
                                                                    {
                                                                        // JavaLine 115 <== SourceLine 1116
                                                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                                                        ;
                                                                        // JavaLine 118 <== SourceLine 1117
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0088")));
                                                                        ;
                                                                        // JavaLine 121 <== SourceLine 1120
                                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_1.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1052_4652.type_1)));
                                                                        ;
                                                                        // JavaLine 124 <== SourceLine 1121
                                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1121,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1052_4652.type_1)))._RESULT);
                                                                        ;
                                                                        // JavaLine 127 <== SourceLine 1122
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(70);
                                                                        ;
                                                                        // JavaLine 130 <== SourceLine 1123
                                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1052_4652.type_1)));
                                                                        ;
                                                                    }
                                                                } else {
                                                                    // JavaLine 135 <== SourceLine 1125
                                                                    {
                                                                        // JavaLine 137 <== SourceLine 1126
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0096")));
                                                                        ;
                                                                        // JavaLine 140 <== SourceLine 1129
                                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4+(1));
                                                                        ;
                                                                        // JavaLine 143 <== SourceLine 1130
                                                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1052_4652.type_1)));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 149 <== SourceLine 1133
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")));
                                                                ;
                                                                // JavaLine 152 <== SourceLine 1136
                                                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).quantvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1052_4652.type_1)));
                                                                ;
                                                                // JavaLine 155 <== SourceLine 1137
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")),new RTS_TXT("Y")));
                                                                ;
                                                                // JavaLine 158 <== SourceLine 1139
                                                                new CLASS_SCODER0_codegenerator0_getnewindex((_CUR._SL));
                                                                ;
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).ll2_8=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curindex_5;
                                                                ;
                                                                // JavaLine 163 <== SourceLine 1140
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curindex_5);
                                                                ;
                                                                // JavaLine 166 <== SourceLine 1141
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(62);
                                                                ;
                                                                // JavaLine 169 <== SourceLine 1142
                                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                                ;
                                                                new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                                                                ;
                                                                // JavaLine 174 <== SourceLine 1143
                                                                new CLASS_SCODER0_codegenerator0_popasd((_CUR._SL));
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 180 <== SourceLine 1149
                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                                        ;
                                                        // JavaLine 183 <== SourceLine 1153
                                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                                        ;
                                                        // JavaLine 186 <== SourceLine 1155
                                                        if(_VALUE(((_inspect_1052_4652.type_1!=(((char)14)))&&(((((_inspect_1052_4652.categ_1==(((char)6)))&&((_inspect_1052_4652.match_1!=(null)))))?((_inspect_1052_4652.match_1.descr_1.npar==(0))):((_inspect_1052_4652.descr_1.npar==(0)))))))) {
                                                            // JavaLine 188 <== SourceLine 1158
                                                            new CLASS_SCODER1_codegenerator1_outfdest((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).ll2_8);
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 197 <== SourceLine 1162
                                        new CLASS_SCODER3_codegenerator3_thunk_endthunk(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9);
                                        ;
                                        // JavaLine 200 <== SourceLine 1163
                                        new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),(((_inspect_1052_4652.kind_1==(((char)0))))?(4):(3)),_inspect_1052_4652.kind_1,_inspect_1052_4652.type_1,_inspect_1052_4652.prefqual_1,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklabel_9);
                                        ;
                                        // JavaLine 203 <== SourceLine 1168
                                        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6!=(null)))) {
                                            {
                                                // JavaLine 206 <== SourceLine 1171
                                                new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                                                ;
                                                // JavaLine 209 <== SourceLine 1172
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                                ;
                                                // JavaLine 212 <== SourceLine 1173
                                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                                                ;
                                                // JavaLine 215 <== SourceLine 1174
                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1174,new RTS_TXT("ASSIGN"));
                                                ;
                                                // JavaLine 218 <== SourceLine 1175
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                                ;
                                                // JavaLine 221 <== SourceLine 1177
                                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                                ;
                                                // JavaLine 224 <== SourceLine 1178
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("o")));
                                                ;
                                                // JavaLine 227 <== SourceLine 1180
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                                                ;
                                            }
                                        } else {
                                            // JavaLine 232 <== SourceLine 1182
                                            {
                                                // JavaLine 234 <== SourceLine 1185
                                                new CLASS_SCODER3_codegenerator3_thunktounspecified((_CUR._SL),_inspect_1052_4652.type_1,_inspect_1052_4652.prefqual_1);
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
            }
        } else {
            // JavaLine 249 <== SourceLine 1194
            if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.kind_1==(((char)1))))) {
                new CLASS_SCODER3_codegenerator3_get_PROQNT((_CUR._SL),false);
            } else {
                // JavaLine 253 <== SourceLine 1195
                if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.kind_1==(((char)2))))) {
                    {
                        // JavaLine 256 <== SourceLine 1196
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                        ;
                        // JavaLine 259 <== SourceLine 1197
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                    }
                } else {
                    // JavaLine 264 <== SourceLine 1199
                    new CLASS_BUILDER1_visiblegenerator_StopScode_1((_CUR._SL),((char)14),1199);
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 procLILFPA",1,1044,10,1052,23,1049,26,1050,29,1052,34,1053,36,1052,38,1053,40,1055,42,1057,45,1058,50,1059,55,1061,57,1065,60,1068,63,1076,66,1077,69,1078,72,1079,77,1082,80,1084,85,1085,88,1089,93,1093,96,1097,99,1099,101,1102,103,1103,106,1110,111,1112,113,1115,115,1116,118,1117,121,1120,124,1121,127,1122,130,1123,135,1125,137,1126,140,1129,143,1130,149,1133,152,1136,155,1137,158,1139,163,1140,166,1141,169,1142,174,1143,180,1149,183,1153,186,1155,188,1158,197,1162,200,1163,203,1168,206,1171,209,1172,212,1173,215,1174,218,1175,221,1177,224,1178,227,1180,232,1182,234,1185,249,1194,253,1195,256,1196,259,1197,264,1199,272,1200);
} // End of Procedure
