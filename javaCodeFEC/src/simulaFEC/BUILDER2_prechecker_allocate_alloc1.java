// JavaLine 1 <== SourceLine 1138
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_allocate_alloc1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1138, lastLine=1288, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_brecord p_brc;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1195
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc1_Block1177_Block1193_copytoext_0=new RTS_LABEL(this,0,1,"copytoext"); // Local Label #1=copytoext At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 1144
    public COMMON_quantity Q=null;
    public COMMON_quantity QP=null;
    public COMMON_quantity QN=null;
    public COMMON_quantity QX=null;
    // JavaLine 19 <== SourceLine 1145
    public COMMON_brctab2 tab2=null;
    // JavaLine 21 <== SourceLine 1146
    public boolean extbinding=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_prechecker_allocate_alloc1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_prechecker_allocate_alloc1(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_prechecker_allocate_alloc1(RTS_RTObject _SL,COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_prechecker_allocate_alloc1 _STM() {
        BUILDER2_prechecker_allocate_alloc1 _THIS=(BUILDER2_prechecker_allocate_alloc1)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 55 <== SourceLine 1173
                if(_VALUE((RTS_ENVIRONMENT.rank(p_brc.blev)>(250)))) {
                    new ERRMSG_fatal0((_CUR._SL._SL._SL),299);
                }
                ;
                // JavaLine 60 <== SourceLine 1174
                extbinding=_IS(p_brc.declquant,COMMON_extquantity.class);
                ;
                // JavaLine 63 <== SourceLine 1175
                Q=p_brc.fpar;
                ;
                // JavaLine 66 <== SourceLine 1176
                while((Q!=(null))) {
                    {
                        // JavaLine 69 <== SourceLine 1177
                        if(_VALUE(extbinding)) {
                            {
                                // JavaLine 72 <== SourceLine 1179
                                QX=new COMMON_extquantity((_CUR._SL._SL._SL),null)._STM();
                                ;
                                // JavaLine 75 <== SourceLine 1180
                                ((COMMON_extquantity)(QX)).clf_2=((char)2);
                                ;
                                // JavaLine 78 <== SourceLine 1181
                                _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc1_Block1177_Block1193_copytoext_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 84 <== SourceLine 1183
                        if(_VALUE((Q.categ_1!=(((char)4))))) {
                            QX=Q;
                        } else {
                            // JavaLine 88 <== SourceLine 1184
                            if(_VALUE((Q.descr_1==(null)))) {
                                {
                                    // JavaLine 91 <== SourceLine 1186
                                    QX=new BUILDER1_newextquantbrec((_CUR._SL._SL._SL),p_brc.blev,p_brc.rtblev,'S',null)._RESULT;
                                    ;
                                    // JavaLine 94 <== SourceLine 1187
                                    new BUILDER2_prechecker_copyfromto((_CUR._SL._SL),Q,QX);
                                    ;
                                    QX.next=Q.next;
                                    ;
                                    // JavaLine 99 <== SourceLine 1188
                                    if(_VALUE((QP==(null)))) {
                                        QP=p_brc.fpar=QX;
                                    } else {
                                        // JavaLine 103 <== SourceLine 1189
                                        QP.next=QX;
                                    }
                                    ;
                                }
                            } else {
                                // JavaLine 109 <== SourceLine 1191
                                {
                                    // JavaLine 111 <== SourceLine 1193
                                    QX=new COMMON_extquantity((_CUR._SL._SL._SL),null)._STM();
                                    ;
                                    // JavaLine 114 <== SourceLine 1194
                                    ((COMMON_extquantity)(QX)).clf_2=((char)1);
                                    ;
                                    // JavaLine 117 <== SourceLine 1195
                                    {
                                        _SIM_LABEL(1); // DeclaredIn: alloc1 -> alloc1[externalIdent=BUILDER2_prechecker_allocate_alloc1] Kind=5, QUAL=ProcedureDeclaration, HashCode=2099834837
                                        new BUILDER2_prechecker_copyfromto((_CUR._SL._SL),Q,QX);
                                    }
                                    ;
                                    // JavaLine 123 <== SourceLine 1196
                                    QX.next=Q.next;
                                    ;
                                    // JavaLine 126 <== SourceLine 1197
                                    if(_VALUE((QP==(null)))) {
                                        p_brc.fpar=QX;
                                    } else {
                                        // JavaLine 130 <== SourceLine 1198
                                        QP.next=QX;
                                    }
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 138 <== SourceLine 1201
                        QN=QX;
                        ;
                        QX=((COMMON_quantity)(QX.next));
                        ;
                        // JavaLine 143 <== SourceLine 1202
                        while((QX!=(null))) {
                            {
                                // JavaLine 146 <== SourceLine 1204
                                if(_VALUE((QX.symb_1==(QN.symb_1)))) {
                                    new ERRMSG_errQTN((_CUR._SL._SL._SL),QX,411,QN);
                                }
                                ;
                                // JavaLine 151 <== SourceLine 1205
                                QX=((COMMON_quantity)(QX.next));
                                ;
                            }
                        }
                        ;
                        // JavaLine 157 <== SourceLine 1207
                        QN.encl_1=p_brc;
                        ;
                        // JavaLine 160 <== SourceLine 1208
                        if(_VALUE((QN.kind_1==(((char)12))))) {
                            {
                                // JavaLine 163 <== SourceLine 1209
                                new ERRMSG_errQT((_CUR._SL._SL._SL),QN,319);
                                ;
                                QN.type_1=((char)15);
                                ;
                                QN.kind_1=((char)10);
                            }
                        } else {
                            // JavaLine 171 <== SourceLine 1210
                            {
                                // JavaLine 173 <== SourceLine 1211
                                if(QN.categ_1<((char)0) || QN.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(QN.categ_1) { // BEGIN SWITCH STATEMENT
                                    case 3: 
                                    // JavaLine 177 <== SourceLine 1212
                                    {
                                        // JavaLine 179 <== SourceLine 1214
                                        if(_VALUE((Q.descr_1!=(p_brc)))) {
                                            {
                                                // JavaLine 182 <== SourceLine 1215
                                                if(_VALUE((((QN.kind_1==(((char)1)))||((QN.kind_1==(((char)5)))))||((QN.kind_1==(((char)7))))))) {
                                                    // JavaLine 184 <== SourceLine 1217
                                                    new BUILDER2_prechecker_allocate_alloc1_allocDescriptor((_CUR));
                                                }
                                            }
                                        }
                                    }
                                    break;
                                    case 0: 
                                    // JavaLine 192 <== SourceLine 1219
                                    {
                                        // JavaLine 194 <== SourceLine 1220
                                        if(_VALUE((p_brc.kind==(((char)5))))) {
                                            // JavaLine 196 <== SourceLine 1222
                                            {
                                                // JavaLine 198 <== SourceLine 1223
                                                if(_VALUE(((QN.kind_1==(((char)1)))|((QN.type_1==(((char)11))))))) {
                                                    // JavaLine 200 <== SourceLine 1224
                                                    new ERRMSG_errQT((_CUR._SL._SL._SL),QN,320);
                                                }
                                                ;
                                            }
                                        } else {
                                            // JavaLine 206 <== SourceLine 1226
                                            if(_VALUE(extbinding)) {
                                                {
                                                    // JavaLine 209 <== SourceLine 1227
                                                    if(_VALUE(((QN.kind_1==(((char)1)))|((QN.kind_1==(((char)4))))))) {
                                                        // JavaLine 211 <== SourceLine 1229
                                                        new ERRMSG_error1id((_CUR._SL._SL._SL),-321,QN.symb_1);
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 219 <== SourceLine 1231
                                        new COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1231,new RTS_TXT("NPAR+1 ????????????????????????????????????????????"));
                                        ;
                                        // JavaLine 222 <== SourceLine 1232
                                        p_brc.npar=(p_brc.npar+(1));
                                        ;
                                    }
                                    break;
                                    case 1: 
                                    // JavaLine 228 <== SourceLine 1234
                                    {
                                        // JavaLine 230 <== SourceLine 1235
                                        if(_VALUE((((QN.type_1<=(((char)6)))||((QN.type_1==(((char)15)))))&&(((QN.kind_1==(((char)0)))||((QN.kind_1==(((char)2))))))))) {
                                            // JavaLine 232 <== SourceLine 1237
                                            {
                                                // JavaLine 234 <== SourceLine 1238
                                                if(_VALUE((QN.kind_1==(((char)0))))) {
                                                    QN.categ_1=((char)0);
                                                }
                                            }
                                        } else {
                                            // JavaLine 240 <== SourceLine 1239
                                            if(_VALUE(((QN.type_1!=(((char)8)))||((QN.kind_1!=(((char)0))))))) {
                                                // JavaLine 242 <== SourceLine 1240
                                                new ERRMSG_errQT((_CUR._SL._SL._SL),QN,322);
                                            }
                                        }
                                        ;
                                        // JavaLine 247 <== SourceLine 1241
                                        new COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1241,new RTS_TXT("NPAR+1 ????????????????????????????????????????????"));
                                        ;
                                        // JavaLine 250 <== SourceLine 1242
                                        p_brc.npar=(p_brc.npar+(1));
                                        ;
                                    }
                                    break;
                                    case 2: 
                                    // JavaLine 256 <== SourceLine 1244
                                    {
                                        // JavaLine 258 <== SourceLine 1245
                                        if(_VALUE((p_brc.kind==(((char)5))))) {
                                            // JavaLine 260 <== SourceLine 1247
                                            new ERRMSG_errQT((_CUR._SL._SL._SL),QN,323);
                                        } else {
                                            // JavaLine 263 <== SourceLine 1248
                                            if(_VALUE(extbinding)) {
                                                {
                                                    // JavaLine 266 <== SourceLine 1250
                                                    if(_VALUE((QN.type_1==(((char)11))))) {
                                                        // JavaLine 268 <== SourceLine 1251
                                                        new ERRMSG_errQT((_CUR._SL._SL._SL),QN,321);
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 275 <== SourceLine 1252
                                        new COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),1252,new RTS_TXT("NPAR+1 ????????????????????????????????????????????"));
                                        ;
                                        // JavaLine 278 <== SourceLine 1253
                                        p_brc.npar=(p_brc.npar+(1));
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 284 <== SourceLine 1255
                                    {
                                        // JavaLine 286 <== SourceLine 1259
                                        if(_VALUE((Q.descr_1!=(null)))) {
                                            // JavaLine 288 <== SourceLine 1260
                                            {
                                                // JavaLine 290 <== SourceLine 1261
                                                if(_VALUE((QN.dim_1==(0)))) {
                                                    new ERRMSG_errQT((_CUR._SL._SL._SL),Q,324);
                                                }
                                                ;
                                                // JavaLine 295 <== SourceLine 1264
                                                new BUILDER2_prechecker_allocate_alloc1_allocDescriptor((_CUR));
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    default:
                                    // JavaLine 304 <== SourceLine 1269
                                    new ERRMSG_internerr((_CUR._SL._SL._SL),((char)7),1269);
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                            }
                        }
                        ;
                        // JavaLine 312 <== SourceLine 1272
                        if(_VALUE((QN.kind_1==(((char)5))))) {
                            p_brc.localclasses=true;
                        }
                        ;
                        // JavaLine 317 <== SourceLine 1273
                        QP=QN;
                        ;
                        Q=((COMMON_quantity)(Q.next));
                        ;
                    }
                }
                ;
                // JavaLine 325 <== SourceLine 1277
                Q=p_brc.favirt;
                ;
                // JavaLine 328 <== SourceLine 1278
                while((Q!=(null))) {
                    {
                        // JavaLine 331 <== SourceLine 1279
                        Q.encl_1=p_brc;
                        ;
                        // JavaLine 334 <== SourceLine 1280
                        if(_VALUE((Q.descr_1!=(null)))) {
                            // JavaLine 336 <== SourceLine 1282
                            {
                                QN=Q;
                                ;
                                new BUILDER2_prechecker_allocate_alloc1_allocDescriptor((_CUR));
                            }
                        }
                        ;
                        // JavaLine 344 <== SourceLine 1283
                        Q=((COMMON_quantity)(Q.next));
                        ;
                    }
                }
                ;
                // JavaLine 350 <== SourceLine 1286
                new COMMON_brecord_blockDump(p_brc,CONC(CONC(new RTS_TXT("Builder2.LINE "),RTS_ENVIRONMENT.edit(1286)),new RTS_TXT(": END Alloc1 ")));
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 alloc1",1,1138,11,1195,14,1144,19,1145,21,1146,55,1173,60,1174,63,1175,66,1176,69,1177,72,1179,75,1180,78,1181,84,1183,88,1184,91,1186,94,1187,99,1188,103,1189,109,1191,111,1193,114,1194,117,1195,123,1196,126,1197,130,1198,138,1201,143,1202,146,1204,151,1205,157,1207,160,1208,163,1209,171,1210,173,1211,177,1212,179,1214,182,1215,184,1217,192,1219,194,1220,196,1222,198,1223,200,1224,206,1226,209,1227,211,1229,219,1231,222,1232,228,1234,230,1235,232,1237,234,1238,240,1239,242,1240,247,1241,250,1242,256,1244,258,1245,260,1247,263,1248,266,1250,268,1251,275,1252,278,1253,284,1255,286,1259,288,1260,290,1261,295,1264,304,1269,312,1272,317,1273,325,1277,328,1278,331,1279,334,1280,336,1282,344,1283,350,1286,362,1288);
} // End of Procedure
