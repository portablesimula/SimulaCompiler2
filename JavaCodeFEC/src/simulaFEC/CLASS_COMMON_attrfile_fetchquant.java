// JavaLine 1 <== SourceLine 1096
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_fetchquant extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1096, lastLine=1292, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 1162
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_Block1152_Block1161_SETID_0=new RTS_LABEL(this,0,1,"SETID"); // Local Label #1=SETID At PrefixLevel 0
    // JavaLine 14 <== SourceLine 1166
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_SETDID_0=new RTS_LABEL(this,0,2,"SETDID"); // Local Label #2=SETDID At PrefixLevel 0
    // JavaLine 16 <== SourceLine 1170
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0=new RTS_LABEL(this,0,3,"CHCKMARK"); // Local Label #3=CHCKMARK At PrefixLevel 0
    // JavaLine 18 <== SourceLine 1205
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_Block1173_Block1196_Block1205_GETARR_0=new RTS_LABEL(this,0,4,"GETARR"); // Local Label #4=GETARR At PrefixLevel 0
    // JavaLine 20 <== SourceLine 1218
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_Block1173_Block1212_xyMark_0=new RTS_LABEL(this,0,5,"xyMark"); // Local Label #5=xyMark At PrefixLevel 0
    // JavaLine 22 <== SourceLine 1289
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_fetchquant_NOMORE_0=new RTS_LABEL(this,0,6,"NOMORE"); // Local Label #6=NOMORE At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 1097
    public boolean seen=false;
    // JavaLine 27 <== SourceLine 1098
    public boolean forced=false;
    // JavaLine 29 <== SourceLine 1099
    public char nxtc=0;
    // JavaLine 31 <== SourceLine 1100
    public char t0=0;
    public char tn=0;
    // JavaLine 34 <== SourceLine 1101
    public CLASS_COMMON_idpack cvis=null;
    // JavaLine 36 <== SourceLine 1102
    public RTS_TXT t=null;
    // JavaLine 38 <== SourceLine 1096
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_COMMON_attrfile_fetchquant(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_fetchquant _STM() {
        CLASS_COMMON_attrfile_fetchquant _THIS=(CLASS_COMMON_attrfile_fetchquant)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 55 <== SourceLine 1105
                forced=_RESULT=((CLASS_COMMON_attrfile)(_CUR._SL)).xthisused=((CLASS_COMMON_attrfile)(_CUR._SL)).xhascode=false;
                ;
                // JavaLine 58 <== SourceLine 1107
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xftag=((CLASS_COMMON_attrfile)(_CUR._SL)).xdim=((CLASS_COMMON_attrfile)(_CUR._SL)).xlanguage=((CLASS_COMMON_attrfile)(_CUR._SL)).xextident=0;
                ;
                // JavaLine 61 <== SourceLine 1108
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xprotect=((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial=((CLASS_COMMON_attrfile)(_CUR._SL)).xconnests=((CLASS_COMMON_attrfile)(_CUR._SL)).xarrhi=((CLASS_COMMON_attrfile)(_CUR._SL)).xarrlo=((CLASS_COMMON_attrfile)(_CUR._SL)).xcheckhi=((CLASS_COMMON_attrfile)(_CUR._SL)).xchecklo=((CLASS_COMMON_attrfile)(_CUR._SL)).xmodulhi=((CLASS_COMMON_attrfile)(_CUR._SL)).xmodullo=((CLASS_COMMON_attrfile)(_CUR._SL)).xprefqhi=((CLASS_COMMON_attrfile)(_CUR._SL)).xprefqlo=((CLASS_COMMON_attrfile)(_CUR._SL)).xinrtag=((CLASS_COMMON_attrfile)(_CUR._SL)).xlongindic=((char)0);
                ;
                // JavaLine 64 <== SourceLine 1113
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xhidlist=null;
                ;
                // JavaLine 67 <== SourceLine 1116
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xcateg=((CLASS_COMMON_attrfile)(_CUR._SL)).key;
                ;
                // JavaLine 70 <== SourceLine 1117
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xcateg>=(((char)8))))) {
                    {
                        // JavaLine 73 <== SourceLine 1118
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xkind=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key)/(8)));
                        ;
                        // JavaLine 76 <== SourceLine 1119
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xcateg=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.mod(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key),8));
                        ;
                    }
                } else {
                    // JavaLine 81 <== SourceLine 1120
                    ((CLASS_COMMON_attrfile)(_CUR._SL)).xkind=((char)0);
                }
                ;
                // JavaLine 85 <== SourceLine 1121
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1121,CONC(new RTS_TXT("fetchquant: xkind="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xkind))));
                }
                ;
                // JavaLine 90 <== SourceLine 1122
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1122,CONC(new RTS_TXT("fetchquant: xcateg="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xcateg))));
                }
                ;
                // JavaLine 95 <== SourceLine 1124
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xtype=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 100 <== SourceLine 1125
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1125,CONC(new RTS_TXT("fetchquant: xtype="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xtype))));
                }
                ;
                // JavaLine 105 <== SourceLine 1126
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xtype>=(((char)128))))) {
                    {
                        // JavaLine 108 <== SourceLine 1127
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xtype=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xtype)-(128)));
                        ;
                        // JavaLine 111 <== SourceLine 1128
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                        ;
                        // JavaLine 114 <== SourceLine 1129
                        ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(2)),RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                        ;
                        // JavaLine 119 <== SourceLine 1130
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=((((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1))+(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 122 <== SourceLine 1131
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xprefqhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
                        ;
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xprefqlo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
                        ;
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 1134
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xclf=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 135 <== SourceLine 1135
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1135,CONC(new RTS_TXT("fetchquant: xclf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xclf))));
                }
                ;
                // JavaLine 140 <== SourceLine 1137
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xclf>=(((char)128))))) {
                    {
                        // JavaLine 143 <== SourceLine 1138
                        forced=_RESULT=true;
                        ;
                        // JavaLine 146 <== SourceLine 1140
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xclf=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xclf)-(128)));
                        ;
                        // JavaLine 149 <== SourceLine 1141
                        if(_VALUE(((CLASS_COMMON_attrfile)(_CUR._SL)).sysattrfile)) {
                            ;
                        } else {
                            // JavaLine 153 <== SourceLine 1142
                            ((CLASS_COMMON_attrfile)(_CUR._SL)).xftag=(new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT-(1));
                        }
                        ;
                        // JavaLine 157 <== SourceLine 1143
                        _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_SETDID_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 163 <== SourceLine 1146
                ((CLASS_COMMON_attrfile)(_CUR._SL)).xftag=(new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT-(1));
                ;
                // JavaLine 166 <== SourceLine 1147
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1147,CONC(new RTS_TXT("fetchquant: xftag="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xftag)));
                }
                ;
                // JavaLine 171 <== SourceLine 1149
                ((CLASS_COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 176 <== SourceLine 1150
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1150,CONC(new RTS_TXT("fetchquant: key="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key))));
                }
                ;
                // JavaLine 181 <== SourceLine 1151
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key!=(((char)0))))) {
                    {
                        // JavaLine 184 <== SourceLine 1152
                        ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring=RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1)),RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        // JavaLine 187 <== SourceLine 1153
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 190 <== SourceLine 1154
                        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xkind==(((char)5))))) {
                            {
                                // JavaLine 193 <== SourceLine 1155
                                if(_VALUE(((((CLASS_COMMON_attrfile)(_CUR._SL)).xclf==(((char)4)))|((((CLASS_COMMON_attrfile)(_CUR._SL)).xclf==(((char)9))))))) {
                                    ((CLASS_COMMON_attrfile)(_CUR._SL)).xhascode=true;
                                }
                                ;
                                // JavaLine 198 <== SourceLine 1157
                                forced=true;
                                ;
                                // JavaLine 201 <== SourceLine 1158
                                new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                ;
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_Block1152_Block1161_SETID_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 208 <== SourceLine 1159
                        if(_VALUE(new CLASS_COMMON_LOOKUPid((_CUR._SL._SL))._RESULT)) {
                            {
                                // JavaLine 211 <== SourceLine 1161
                                seen=true;
                                ;
                                // JavaLine 214 <== SourceLine 1162
                                {
                                    _SIM_LABEL(1); // DeclaredIn: fetchquant -> fetchquant[externalIdent=CLASS_COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=745160567
                                    _RESULT=true;
                                }
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xident=new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_COMMON)(_CUR._SL._SL)).hashhi,((CLASS_COMMON)(_CUR._SL._SL)).hashlo)._RESULT;
                                ;
                            }
                        } else {
                            // JavaLine 224 <== SourceLine 1164
                            {
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xident=null;
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 233 <== SourceLine 1166
                    {
                        _SIM_LABEL(2); // DeclaredIn: fetchquant
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xident=((CLASS_COMMON)(_CUR._SL._SL)).dummyBox;
                    }
                }
                ;
                // JavaLine 240 <== SourceLine 1167
                if(_VALUE((1>(3)))) {
                    new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1167,CONC(CONC(new RTS_TXT("fetchquant: xidentstring=\""),((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring),new RTS_TXT("\"")));
                }
                ;
                // JavaLine 245 <== SourceLine 1169
                {
                    _SIM_LABEL(3); // DeclaredIn: fetchquant
                    // JavaLine 248 <== SourceLine 1170
                    if(_VALUE((1>(3)))) {
                        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1170,CONC(new RTS_TXT("fetchquant: CHCKMARK-LOOP key="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key))));
                    }
                }
                ;
                // JavaLine 254 <== SourceLine 1171
                ((CLASS_COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                ;
                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 259 <== SourceLine 1172
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key>=(((char)240))))) {
                    {
                        // JavaLine 262 <== SourceLine 1173
                        if(((CLASS_COMMON_attrfile)(_CUR._SL)).key<((char)240) || ((CLASS_COMMON_attrfile)(_CUR._SL)).key>((char)255)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_COMMON_attrfile)(_CUR._SL)).key) { // BEGIN SWITCH STATEMENT
                            case 241: 
                            // JavaLine 266 <== SourceLine 1174
                            {
                                // JavaLine 268 <== SourceLine 1175
                                forced=_RESULT=true;
                                ;
                                // JavaLine 271 <== SourceLine 1177
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 249: 
                            // JavaLine 277 <== SourceLine 1180
                            {
                                // JavaLine 279 <== SourceLine 1181
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xprotect=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 284 <== SourceLine 1182
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 242: 
                            // JavaLine 290 <== SourceLine 1185
                            {
                                // JavaLine 292 <== SourceLine 1186
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xdim=RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p));
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 297 <== SourceLine 1187
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 243: 
                            // JavaLine 303 <== SourceLine 1190
                            {
                                // JavaLine 305 <== SourceLine 1191
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xlongindic=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 310 <== SourceLine 1192
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 244: 
                            // JavaLine 316 <== SourceLine 1195
                            {
                                // JavaLine 318 <== SourceLine 1196
                                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xkind==(((char)6))))) {
                                    {
                                        // JavaLine 321 <== SourceLine 1197
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xlanguage=new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                        ;
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xextident=new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                        ;
                                        // JavaLine 326 <== SourceLine 1198
                                        _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 332 <== SourceLine 1200
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 337 <== SourceLine 1201
                                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial>(((char)128))))) {
                                    {
                                        // JavaLine 340 <== SourceLine 1202
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial)-(128)));
                                        ;
                                        // JavaLine 343 <== SourceLine 1203
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xarrlo=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                        ;
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                    }
                                } else {
                                    // JavaLine 349 <== SourceLine 1204
                                    {
                                        // JavaLine 351 <== SourceLine 1205
                                        {
                                            _SIM_LABEL(4); // DeclaredIn: fetchquant -> fetchquant[externalIdent=CLASS_COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=745160567
                                            new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                        }
                                        ;
                                        new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                        ;
                                        // JavaLine 359 <== SourceLine 1206
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xarrhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
                                        ;
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xarrlo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
                                    }
                                }
                                ;
                                // JavaLine 366 <== SourceLine 1207
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 246: 
                            // JavaLine 372 <== SourceLine 1210
                            {
                                // JavaLine 374 <== SourceLine 1212
                                new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 379 <== SourceLine 1213
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xmodulhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xmodullo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
                                ;
                                // JavaLine 384 <== SourceLine 1215
                                new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 389 <== SourceLine 1216
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xcheckhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xchecklo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
                                ;
                                // JavaLine 394 <== SourceLine 1217
                                {
                                    _SIM_LABEL(5); // DeclaredIn: fetchquant -> fetchquant[externalIdent=CLASS_COMMON_attrfile_fetchquant] Kind=5, QUAL=ProcedureDeclaration, HashCode=745160567
                                    // JavaLine 397 <== SourceLine 1218
                                    new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                }
                                ;
                                new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                ;
                                // JavaLine 403 <== SourceLine 1219
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xlanguage=((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL._SL)).hashhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL._SL)).hashlo)));
                                ;
                                // JavaLine 406 <== SourceLine 1221
                                new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                ;
                                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                                ;
                                // JavaLine 411 <== SourceLine 1222
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xextident=((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL._SL)).hashhi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL._SL)).hashlo)));
                                ;
                                // JavaLine 414 <== SourceLine 1223
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 245: 
                            // JavaLine 420 <== SourceLine 1226
                            {
                                // JavaLine 422 <== SourceLine 1227
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_Block1173_Block1212_xyMark_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 247: 
                            // JavaLine 428 <== SourceLine 1230
                            {
                                // JavaLine 430 <== SourceLine 1231
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xconnests=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 435 <== SourceLine 1232
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 240: 
                            // JavaLine 441 <== SourceLine 1235
                            {
                                // JavaLine 443 <== SourceLine 1236
                                nxtc=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                                ;
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                                ;
                                // JavaLine 448 <== SourceLine 1237
                                if(_VALUE((nxtc>=('@')))) {
                                    {
                                        // JavaLine 451 <== SourceLine 1238
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xthisused=true;
                                        ;
                                        nxtc=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(nxtc)-(64)));
                                    }
                                }
                                ;
                                // JavaLine 458 <== SourceLine 1239
                                if(_VALUE((nxtc>=(((char)32))))) {
                                    {
                                        // JavaLine 461 <== SourceLine 1240
                                        ((CLASS_COMMON_attrfile)(_CUR._SL)).xhascode=true;
                                        ;
                                        nxtc=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(nxtc)-(32)));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 469 <== SourceLine 1242
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xinrtag=nxtc;
                                ;
                                // JavaLine 472 <== SourceLine 1243
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 254: 
                            // JavaLine 478 <== SourceLine 1246
                            {
                                // JavaLine 480 <== SourceLine 1247
                                new CLASS_COMMON_attrfile_swapIbuffer((_CUR._SL));
                                ;
                                _GOTO(_LABEL_CLASS_COMMON_attrfile_fetchquant_CHCKMARK_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 248: 
                            // JavaLine 488 <== SourceLine 1250
                            {
                                // JavaLine 490 <== SourceLine 1251
                                cvis=((CLASS_COMMON_attrfile)(_CUR._SL)).xhidlist=new CLASS_COMMON_idpack((_CUR._SL._SL))._STM();
                                ;
                                // JavaLine 493 <== SourceLine 1252
                                while((((CLASS_COMMON_attrfile)(_CUR._SL)).key==(((char)248)))) {
                                    {
                                        // JavaLine 496 <== SourceLine 1253
                                        cvis=cvis.next=new CLASS_COMMON_idpack((_CUR._SL._SL))._STM();
                                        ;
                                        // JavaLine 499 <== SourceLine 1254
                                        new CLASS_COMMON_attrfile_gettext((_CUR._SL));
                                        ;
                                        new CLASS_COMMON_DEFIDENT((_CUR._SL._SL));
                                        ;
                                        // JavaLine 504 <== SourceLine 1255
                                        cvis.idhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
                                        ;
                                        cvis.idlo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
                                        ;
                                        // JavaLine 509 <== SourceLine 1256
                                        cvis.line=1;
                                        ;
                                        // JavaLine 512 <== SourceLine 1257
                                        new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 518 <== SourceLine 1259
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).xhidlist=((CLASS_COMMON_attrfile)(_CUR._SL)).xhidlist.next;
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
                // JavaLine 531 <== SourceLine 1269
                {
                    _SIM_LABEL(6); // DeclaredIn: fetchquant
                    // JavaLine 534 <== SourceLine 1289
                    if(_VALUE((1>(0)))) {
                        new CLASS_COMMON_attrfile_xquantDump((_CUR._SL),CONC(CONC(new RTS_TXT("COMMON.LINE "),RTS_ENVIRONMENT.edit(1289)),RTS_ENVIRONMENT.blanks((3*(((CLASS_COMMON)(_CUR._SL._SL)).indent)))));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 fetchquant",1,1096,12,1162,14,1166,16,1170,18,1205,20,1218,22,1289,25,1097,27,1098,29,1099,31,1100,34,1101,36,1102,38,1096,55,1105,58,1107,61,1108,64,1113,67,1116,70,1117,73,1118,76,1119,81,1120,85,1121,90,1122,95,1124,100,1125,105,1126,108,1127,111,1128,114,1129,119,1130,122,1131,130,1134,135,1135,140,1137,143,1138,146,1140,149,1141,153,1142,157,1143,163,1146,166,1147,171,1149,176,1150,181,1151,184,1152,187,1153,190,1154,193,1155,198,1157,201,1158,208,1159,211,1161,214,1162,224,1164,233,1166,240,1167,245,1169,248,1170,254,1171,259,1172,262,1173,266,1174,268,1175,271,1177,277,1180,279,1181,284,1182,290,1185,292,1186,297,1187,303,1190,305,1191,310,1192,316,1195,318,1196,321,1197,326,1198,332,1200,337,1201,340,1202,343,1203,349,1204,351,1205,359,1206,366,1207,372,1210,374,1212,379,1213,384,1215,389,1216,394,1217,397,1218,403,1219,406,1221,411,1222,414,1223,420,1226,422,1227,428,1230,430,1231,435,1232,441,1235,443,1236,448,1237,451,1238,458,1239,461,1240,469,1242,472,1243,478,1246,480,1247,488,1250,490,1251,493,1252,496,1253,499,1254,504,1255,509,1256,512,1257,518,1259,531,1269,534,1289,549,1292);
} // End of Procedure
