// JavaLine 1 <== SourceLine 1095
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_fetchquant extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1095, lastLine=1291, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 1161
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_Block1151_Block1160_SETID_0=new RTS_LABEL(this,0,1,"SETID"); // Local Label #1=SETID At PrefixLevel 0
    // JavaLine 14 <== SourceLine 1165
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_SETDID_0=new RTS_LABEL(this,0,2,"SETDID"); // Local Label #2=SETDID At PrefixLevel 0
    // JavaLine 16 <== SourceLine 1169
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0=new RTS_LABEL(this,0,3,"CHCKMARK"); // Local Label #3=CHCKMARK At PrefixLevel 0
    // JavaLine 18 <== SourceLine 1204
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_Block1172_Block1195_Block1204_GETARR_0=new RTS_LABEL(this,0,4,"GETARR"); // Local Label #4=GETARR At PrefixLevel 0
    // JavaLine 20 <== SourceLine 1217
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_Block1172_Block1211_xyMark_0=new RTS_LABEL(this,0,5,"xyMark"); // Local Label #5=xyMark At PrefixLevel 0
    // JavaLine 22 <== SourceLine 1288
    final RTS_LABEL _LABEL_COMMON_attrfile_fetchquant_NOMORE_0=new RTS_LABEL(this,0,6,"NOMORE"); // Local Label #6=NOMORE At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 1096
    public boolean seen=false;
    // JavaLine 27 <== SourceLine 1097
    public boolean forced=false;
    // JavaLine 29 <== SourceLine 1098
    public char nxtc=0;
    // JavaLine 31 <== SourceLine 1099
    public char t0=0;
    public char tn=0;
    // JavaLine 34 <== SourceLine 1100
    public COMMON_idpack cvis=null;
    // JavaLine 36 <== SourceLine 1101
    public RTS_TXT t=null;
    // JavaLine 38 <== SourceLine 1095
    public boolean _RESULT=false;
    // Normal Constructor
    public COMMON_attrfile_fetchquant(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_fetchquant _STM() {
        COMMON_attrfile_fetchquant _THIS=(COMMON_attrfile_fetchquant)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 55 <== SourceLine 1104
                forced=_RESULT=((COMMON_attrfile)(_CUR._SL)).xthisused=((COMMON_attrfile)(_CUR._SL)).xhascode=false;
                ;
                // JavaLine 58 <== SourceLine 1106
                ((COMMON_attrfile)(_CUR._SL)).xftag=((COMMON_attrfile)(_CUR._SL)).xdim=((COMMON_attrfile)(_CUR._SL)).xlanguage=((COMMON_attrfile)(_CUR._SL)).xextident=0;
                ;
                // JavaLine 61 <== SourceLine 1107
                ((COMMON_attrfile)(_CUR._SL)).xprotect=((COMMON_attrfile)(_CUR._SL)).xspecial=((COMMON_attrfile)(_CUR._SL)).xconnests=((COMMON_attrfile)(_CUR._SL)).xarrhi=((COMMON_attrfile)(_CUR._SL)).xarrlo=((COMMON_attrfile)(_CUR._SL)).xcheckhi=((COMMON_attrfile)(_CUR._SL)).xchecklo=((COMMON_attrfile)(_CUR._SL)).xmodulhi=((COMMON_attrfile)(_CUR._SL)).xmodullo=((COMMON_attrfile)(_CUR._SL)).xprefqhi=((COMMON_attrfile)(_CUR._SL)).xprefqlo=((COMMON_attrfile)(_CUR._SL)).xinrtag=((COMMON_attrfile)(_CUR._SL)).xlongindic=((char)0);
                ;
                // JavaLine 64 <== SourceLine 1112
                ((COMMON_attrfile)(_CUR._SL)).xhidlist=null;
                ;
                // JavaLine 67 <== SourceLine 1115
                ((COMMON_attrfile)(_CUR._SL)).xcateg=((COMMON_attrfile)(_CUR._SL)).key;
                ;
                // JavaLine 70 <== SourceLine 1116
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xcateg>=(((char)8))))) {
                    {
                        // JavaLine 73 <== SourceLine 1117
                        ((COMMON_attrfile)(_CUR._SL)).xkind=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key)/(8)));
                        ;
                        // JavaLine 76 <== SourceLine 1118
                        ((COMMON_attrfile)(_CUR._SL)).xcateg=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.mod(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key),8));
                        ;
                    }
                } else {
                    // JavaLine 81 <== SourceLine 1119
                    ((COMMON_attrfile)(_CUR._SL)).xkind=((char)0);
                }
                ;
                // JavaLine 85 <== SourceLine 1120
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1120,CONC(new RTS_TXT("fetchquant: xkind="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xkind))));
                }
                ;
                // JavaLine 90 <== SourceLine 1121
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1121,CONC(new RTS_TXT("fetchquant: xcateg="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xcateg))));
                }
                ;
                // JavaLine 95 <== SourceLine 1123
                ((COMMON_attrfile)(_CUR._SL)).xtype=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 100 <== SourceLine 1124
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1124,CONC(new RTS_TXT("fetchquant: xtype="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xtype))));
                }
                ;
                // JavaLine 105 <== SourceLine 1125
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xtype>=(((char)128))))) {
                    {
                        // JavaLine 108 <== SourceLine 1126
                        ((COMMON_attrfile)(_CUR._SL)).xtype=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xtype)-(128)));
                        ;
                        // JavaLine 111 <== SourceLine 1127
                        ((COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                        ;
                        // JavaLine 114 <== SourceLine 1128
                        ((COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,(((COMMON_attrfile)(_CUR._SL)).p+(2)),RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        new COMMON_DEFIDENT((_CUR._SL._SL));
                        ;
                        // JavaLine 119 <== SourceLine 1129
                        ((COMMON_attrfile)(_CUR._SL)).p=((((COMMON_attrfile)(_CUR._SL)).p+(1))+(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 122 <== SourceLine 1130
                        ((COMMON_attrfile)(_CUR._SL)).xprefqhi=((COMMON)(_CUR._SL._SL)).hashhi;
                        ;
                        ((COMMON_attrfile)(_CUR._SL)).xprefqlo=((COMMON)(_CUR._SL._SL)).hashlo;
                        ;
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 1133
                ((COMMON_attrfile)(_CUR._SL)).xclf=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 135 <== SourceLine 1134
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1134,CONC(new RTS_TXT("fetchquant: xclf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xclf))));
                }
                ;
                // JavaLine 140 <== SourceLine 1136
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xclf>=(((char)128))))) {
                    {
                        // JavaLine 143 <== SourceLine 1137
                        forced=_RESULT=true;
                        ;
                        // JavaLine 146 <== SourceLine 1139
                        ((COMMON_attrfile)(_CUR._SL)).xclf=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xclf)-(128)));
                        ;
                        // JavaLine 149 <== SourceLine 1140
                        if(_VALUE(((COMMON_attrfile)(_CUR._SL)).sysattrfile)) {
                            ;
                        } else {
                            // JavaLine 153 <== SourceLine 1141
                            ((COMMON_attrfile)(_CUR._SL)).xftag=(new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT-(1));
                        }
                        ;
                        // JavaLine 157 <== SourceLine 1142
                        _GOTO(_LABEL_COMMON_attrfile_fetchquant_SETDID_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 163 <== SourceLine 1145
                ((COMMON_attrfile)(_CUR._SL)).xftag=(new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT-(1));
                ;
                // JavaLine 166 <== SourceLine 1146
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1146,CONC(new RTS_TXT("fetchquant: xftag="),RTS_ENVIRONMENT.edit(((COMMON_attrfile)(_CUR._SL)).xftag)));
                }
                ;
                // JavaLine 171 <== SourceLine 1148
                ((COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 176 <== SourceLine 1149
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1149,CONC(new RTS_TXT("fetchquant: key="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key))));
                }
                ;
                // JavaLine 181 <== SourceLine 1150
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key!=(((char)0))))) {
                    {
                        // JavaLine 184 <== SourceLine 1151
                        ((COMMON)(_CUR._SL._SL)).simsymbol=((COMMON_attrfile)(_CUR._SL)).xidentstring=RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,(((COMMON_attrfile)(_CUR._SL)).p+(1)),RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        // JavaLine 187 <== SourceLine 1152
                        ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 190 <== SourceLine 1153
                        if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xkind==(((char)5))))) {
                            {
                                // JavaLine 193 <== SourceLine 1154
                                if(_VALUE(((((COMMON_attrfile)(_CUR._SL)).xclf==(((char)4)))|((((COMMON_attrfile)(_CUR._SL)).xclf==(((char)9))))))) {
                                    ((COMMON_attrfile)(_CUR._SL)).xhascode=true;
                                }
                                ;
                                // JavaLine 198 <== SourceLine 1156
                                forced=true;
                                ;
                                // JavaLine 201 <== SourceLine 1157
                                new COMMON_DEFIDENT((_CUR._SL._SL));
                                ;
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_Block1151_Block1160_SETID_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 208 <== SourceLine 1158
                        if(_VALUE(new COMMON_LOOKUPid((_CUR._SL._SL))._RESULT)) {
                            {
                                // JavaLine 211 <== SourceLine 1160
                                seen=true;
                                ;
                                // JavaLine 214 <== SourceLine 1161
                                {
                                    _SIM_LABEL(1); // DeclaredIn: fetchquant -> fetchquant[externalIdent=COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=41903949
                                    _RESULT=true;
                                }
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).xident=new COMMON_boxof((_CUR._SL._SL),((COMMON)(_CUR._SL._SL)).hashhi,((COMMON)(_CUR._SL._SL)).hashlo)._RESULT;
                                ;
                            }
                        } else {
                            // JavaLine 224 <== SourceLine 1163
                            {
                                ((COMMON_attrfile)(_CUR._SL)).xident=null;
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 233 <== SourceLine 1165
                    {
                        _SIM_LABEL(2); // DeclaredIn: fetchquant
                        ((COMMON_attrfile)(_CUR._SL)).xident=((COMMON)(_CUR._SL._SL)).dummyBox;
                    }
                }
                ;
                // JavaLine 240 <== SourceLine 1166
                if(_VALUE((1>(3)))) {
                    new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1166,CONC(CONC(new RTS_TXT("fetchquant: xidentstring=\""),((COMMON_attrfile)(_CUR._SL)).xidentstring),new RTS_TXT("\"")));
                }
                ;
                // JavaLine 245 <== SourceLine 1168
                {
                    _SIM_LABEL(3); // DeclaredIn: fetchquant
                    // JavaLine 248 <== SourceLine 1169
                    if(_VALUE((1>(3)))) {
                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1169,CONC(new RTS_TXT("fetchquant: CHCKMARK-LOOP key="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key))));
                    }
                }
                ;
                // JavaLine 254 <== SourceLine 1170
                ((COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 259 <== SourceLine 1171
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key>=(((char)240))))) {
                    {
                        // JavaLine 262 <== SourceLine 1172
                        if(((COMMON_attrfile)(_CUR._SL)).key<((char)240) || ((COMMON_attrfile)(_CUR._SL)).key>((char)255)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((COMMON_attrfile)(_CUR._SL)).key) { // BEGIN SWITCH STATEMENT
                            case 241: 
                            // JavaLine 266 <== SourceLine 1173
                            {
                                // JavaLine 268 <== SourceLine 1174
                                forced=_RESULT=true;
                                ;
                                // JavaLine 271 <== SourceLine 1176
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 249: 
                            // JavaLine 277 <== SourceLine 1179
                            {
                                // JavaLine 279 <== SourceLine 1180
                                ((COMMON_attrfile)(_CUR._SL)).xprotect=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 284 <== SourceLine 1181
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 242: 
                            // JavaLine 290 <== SourceLine 1184
                            {
                                // JavaLine 292 <== SourceLine 1185
                                ((COMMON_attrfile)(_CUR._SL)).xdim=RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p));
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 297 <== SourceLine 1186
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 243: 
                            // JavaLine 303 <== SourceLine 1189
                            {
                                // JavaLine 305 <== SourceLine 1190
                                ((COMMON_attrfile)(_CUR._SL)).xlongindic=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 310 <== SourceLine 1191
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 244: 
                            // JavaLine 316 <== SourceLine 1194
                            {
                                // JavaLine 318 <== SourceLine 1195
                                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xkind==(((char)6))))) {
                                    {
                                        // JavaLine 321 <== SourceLine 1196
                                        ((COMMON_attrfile)(_CUR._SL)).xlanguage=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                        ;
                                        ((COMMON_attrfile)(_CUR._SL)).xextident=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                        ;
                                        // JavaLine 326 <== SourceLine 1197
                                        _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 332 <== SourceLine 1199
                                ((COMMON_attrfile)(_CUR._SL)).xspecial=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 337 <== SourceLine 1200
                                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).xspecial>(((char)128))))) {
                                    {
                                        // JavaLine 340 <== SourceLine 1201
                                        ((COMMON_attrfile)(_CUR._SL)).xspecial=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).xspecial)-(128)));
                                        ;
                                        // JavaLine 343 <== SourceLine 1202
                                        ((COMMON_attrfile)(_CUR._SL)).xarrlo=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                        ;
                                        ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                    }
                                } else {
                                    // JavaLine 349 <== SourceLine 1203
                                    {
                                        // JavaLine 351 <== SourceLine 1204
                                        {
                                            _SIM_LABEL(4); // DeclaredIn: fetchquant -> fetchquant[externalIdent=COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=41903949
                                            new COMMON_attrfile_gettext((_CUR._SL));
                                        }
                                        ;
                                        new COMMON_DEFCONST((_CUR._SL._SL));
                                        ;
                                        // JavaLine 359 <== SourceLine 1205
                                        ((COMMON_attrfile)(_CUR._SL)).xarrhi=((COMMON)(_CUR._SL._SL)).hashhi;
                                        ;
                                        ((COMMON_attrfile)(_CUR._SL)).xarrlo=((COMMON)(_CUR._SL._SL)).hashlo;
                                    }
                                }
                                ;
                                // JavaLine 366 <== SourceLine 1206
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 246: 
                            // JavaLine 372 <== SourceLine 1209
                            {
                                // JavaLine 374 <== SourceLine 1211
                                new COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 379 <== SourceLine 1212
                                ((COMMON_attrfile)(_CUR._SL)).xmodulhi=((COMMON)(_CUR._SL._SL)).hashhi;
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).xmodullo=((COMMON)(_CUR._SL._SL)).hashlo;
                                ;
                                // JavaLine 384 <== SourceLine 1214
                                new COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 389 <== SourceLine 1215
                                ((COMMON_attrfile)(_CUR._SL)).xcheckhi=((COMMON)(_CUR._SL._SL)).hashhi;
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).xchecklo=((COMMON)(_CUR._SL._SL)).hashlo;
                                ;
                                // JavaLine 394 <== SourceLine 1216
                                {
                                    _SIM_LABEL(5); // DeclaredIn: fetchquant -> fetchquant[externalIdent=COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=41903949
                                    // JavaLine 397 <== SourceLine 1217
                                    new COMMON_attrfile_gettext((_CUR._SL));
                                }
                                ;
                                new COMMON_DEFIDENT((_CUR._SL._SL));
                                ;
                                // JavaLine 403 <== SourceLine 1218
                                ((COMMON_attrfile)(_CUR._SL)).xlanguage=((RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL._SL)).hashhi)*(256))+(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL._SL)).hashlo)));
                                ;
                                // JavaLine 406 <== SourceLine 1220
                                new COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 411 <== SourceLine 1221
                                ((COMMON_attrfile)(_CUR._SL)).xextident=((RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL._SL)).hashhi)*(256))+(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL._SL)).hashlo)));
                                ;
                                // JavaLine 414 <== SourceLine 1222
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 245: 
                            // JavaLine 420 <== SourceLine 1225
                            {
                                // JavaLine 422 <== SourceLine 1226
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_Block1172_Block1211_xyMark_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 247: 
                            // JavaLine 428 <== SourceLine 1229
                            {
                                // JavaLine 430 <== SourceLine 1230
                                ((COMMON_attrfile)(_CUR._SL)).xconnests=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 435 <== SourceLine 1231
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 240: 
                            // JavaLine 441 <== SourceLine 1234
                            {
                                // JavaLine 443 <== SourceLine 1235
                                nxtc=RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 448 <== SourceLine 1236
                                if(_VALUE((nxtc>=('@')))) {
                                    {
                                        // JavaLine 451 <== SourceLine 1237
                                        ((COMMON_attrfile)(_CUR._SL)).xthisused=true;
                                        ;
                                        nxtc=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(nxtc)-(64)));
                                    }
                                }
                                ;
                                // JavaLine 458 <== SourceLine 1238
                                if(_VALUE((nxtc>=(((char)32))))) {
                                    {
                                        // JavaLine 461 <== SourceLine 1239
                                        ((COMMON_attrfile)(_CUR._SL)).xhascode=true;
                                        ;
                                        nxtc=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(nxtc)-(32)));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 469 <== SourceLine 1241
                                ((COMMON_attrfile)(_CUR._SL)).xinrtag=nxtc;
                                ;
                                // JavaLine 472 <== SourceLine 1242
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 254: 
                            // JavaLine 478 <== SourceLine 1245
                            {
                                // JavaLine 480 <== SourceLine 1246
                                new COMMON_attrfile_swapIbuffer((_CUR._SL));
                                ;
                                _GOTO(_LABEL_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 248: 
                            // JavaLine 488 <== SourceLine 1249
                            {
                                // JavaLine 490 <== SourceLine 1250
                                cvis=((COMMON_attrfile)(_CUR._SL)).xhidlist=new COMMON_idpack((_CUR._SL._SL))._STM();
                                ;
                                // JavaLine 493 <== SourceLine 1251
                                while((((COMMON_attrfile)(_CUR._SL)).key==(((char)248)))) {
                                    {
                                        // JavaLine 496 <== SourceLine 1252
                                        cvis=cvis.next=new COMMON_idpack((_CUR._SL._SL))._STM();
                                        ;
                                        // JavaLine 499 <== SourceLine 1253
                                        new COMMON_attrfile_gettext((_CUR._SL));
                                        ;
                                        new COMMON_DEFIDENT((_CUR._SL._SL));
                                        ;
                                        // JavaLine 504 <== SourceLine 1254
                                        cvis.idhi=((COMMON)(_CUR._SL._SL)).hashhi;
                                        ;
                                        cvis.idlo=((COMMON)(_CUR._SL._SL)).hashlo;
                                        ;
                                        // JavaLine 509 <== SourceLine 1255
                                        cvis.line=1;
                                        ;
                                        // JavaLine 512 <== SourceLine 1256
                                        new COMMON_attrfile_nextKey((_CUR._SL));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 518 <== SourceLine 1258
                                ((COMMON_attrfile)(_CUR._SL)).xhidlist=((COMMON_attrfile)(_CUR._SL)).xhidlist.next;
                                ;
                            }
                            break;
                            default:
                            ;
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
                ;
                // JavaLine 531 <== SourceLine 1268
                {
                    _SIM_LABEL(6); // DeclaredIn: fetchquant
                    // JavaLine 534 <== SourceLine 1288
                    if(_VALUE((1>(0)))) {
                        new COMMON_attrfile_xquantDump((_CUR._SL),CONC(CONC(new RTS_TXT("COMMON.LINE "),RTS_ENVIRONMENT.edit(1288)),RTS_ENVIRONMENT.blanks((3*(((COMMON)(_CUR._SL._SL)).indent)))));
                    }
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 fetchquant",1,1095,12,1161,14,1165,16,1169,18,1204,20,1217,22,1288,25,1096,27,1097,29,1098,31,1099,34,1100,36,1101,38,1095,55,1104,58,1106,61,1107,64,1112,67,1115,70,1116,73,1117,76,1118,81,1119,85,1120,90,1121,95,1123,100,1124,105,1125,108,1126,111,1127,114,1128,119,1129,122,1130,130,1133,135,1134,140,1136,143,1137,146,1139,149,1140,153,1141,157,1142,163,1145,166,1146,171,1148,176,1149,181,1150,184,1151,187,1152,190,1153,193,1154,198,1156,201,1157,208,1158,211,1160,214,1161,224,1163,233,1165,240,1166,245,1168,248,1169,254,1170,259,1171,262,1172,266,1173,268,1174,271,1176,277,1179,279,1180,284,1181,290,1184,292,1185,297,1186,303,1189,305,1190,310,1191,316,1194,318,1195,321,1196,326,1197,332,1199,337,1200,340,1201,343,1202,349,1203,351,1204,359,1205,366,1206,372,1209,374,1211,379,1212,384,1214,389,1215,394,1216,397,1217,403,1218,406,1220,411,1221,414,1222,420,1225,422,1226,428,1229,430,1230,435,1231,441,1234,443,1235,448,1236,451,1237,458,1238,461,1239,469,1241,472,1242,478,1245,480,1246,488,1249,490,1250,493,1251,496,1252,499,1253,504,1254,509,1255,512,1256,518,1258,531,1268,534,1288,549,1291);
} // End of Procedure
