// JavaLine 1 <== SourceLine 1047
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeEndBlock extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1047, lastLine=1223, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1183
    final RTS_LABEL _LABEL_SCODMAIN_codegenerator_doCodeEndBlock_Block1112_erecx_0=new RTS_LABEL(this,0,1,"erecx"); // Local Label #1=erecx At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeEndBlock(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeEndBlock _STM() {
        SCODMAIN_codegenerator_doCodeEndBlock _THIS=(SCODMAIN_codegenerator_doCodeEndBlock)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 1048
                if(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1<((char)0) || ((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1) { // BEGIN SWITCH STATEMENT
                    case 5: 
                    // JavaLine 32 <== SourceLine 1049
                    {
                        // JavaLine 34 <== SourceLine 1050
                        if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1.hasCode)) {
                            {
                                // JavaLine 37 <== SourceLine 1054
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1.inrtag!=(((char)0))))) {
                                    new SCODMAIN_codegenerator_doCodeEndBlock_Block1050_Block1054_Block1055((_CUR))._STM();
                                } else {
                                    // JavaLine 41 <== SourceLine 1064
                                    if(_VALUE(((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1.stmtag!=(((char)0)))||((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1.dcltag!=(((char)0))))))) {
                                        // JavaLine 43 <== SourceLine 1065
                                        {
                                            // JavaLine 45 <== SourceLine 1066
                                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("<"),new RTS_TXT("U")));
                                            ;
                                            // JavaLine 48 <== SourceLine 1067
                                            new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1067,new RTS_TXT("ESEG"));
                                            ;
                                            // JavaLine 51 <== SourceLine 1068
                                            new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1068,new RTS_TXT("EMPTY"));
                                            ;
                                        }
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 61 <== SourceLine 1071
                        new SCODER0_codegenerator0_popasd((_CUR._SL));
                        ;
                    }
                    break;
                    case 7: 
                    // JavaLine 67 <== SourceLine 1074
                    _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_Block3146_OUTPTP_0); // GOTO EVALUATED LABEL
                    break;
                    case 1: 
                    // JavaLine 71 <== SourceLine 1076
                    {
                        // JavaLine 73 <== SourceLine 1112
                        if(_VALUE(((SCODMAIN)(_CUR._SL._SL)).ReuseProc_6)) {
                            {
                                // JavaLine 76 <== SourceLine 1113
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.type_1==(((char)14))))) {
                                    {
                                        // JavaLine 79 <== SourceLine 1114
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1114,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b0"))._RESULT);
                                        ;
                                        // JavaLine 82 <== SourceLine 1115
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1115,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b1"))._RESULT);
                                        ;
                                        // JavaLine 85 <== SourceLine 1116
                                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1116,new RTS_TXT("ESEG"));
                                        ;
                                        // JavaLine 88 <== SourceLine 1117
                                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1117,new RTS_TXT("EMPTY"));
                                        ;
                                        // JavaLine 91 <== SourceLine 1118
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("C"),new RTS_TXT("\u0004\u00b0")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00b1")),new RTS_TXT("<")),new RTS_TXT("U")));
                                        ;
                                    }
                                } else {
                                    // JavaLine 96 <== SourceLine 1121
                                    {
                                        // JavaLine 98 <== SourceLine 1122
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1122,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b3"))._RESULT);
                                        ;
                                        // JavaLine 101 <== SourceLine 1123
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1123,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b4"))._RESULT);
                                        ;
                                        // JavaLine 104 <== SourceLine 1124
                                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1124,new RTS_TXT("ESEG"));
                                        ;
                                        // JavaLine 107 <== SourceLine 1125
                                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1125,new RTS_TXT("EMPTY"));
                                        ;
                                        // JavaLine 110 <== SourceLine 1126
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("C"),new RTS_TXT("\u0004\u00b3")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00b4")),new RTS_TXT("<")),new RTS_TXT("U")));
                                        ;
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 118 <== SourceLine 1130
                            if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.type_1!=(((char)14))))) {
                                {
                                    // JavaLine 121 <== SourceLine 1131
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0098")),new RTS_TXT("P")),new RTS_TXT("\u00009")),new RTS_TXT("\u0087")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0099")),new RTS_TXT("\u005e")),new RTS_TXT("<")),new RTS_TXT("U")));
                                    ;
                                }
                            } else {
                                // JavaLine 126 <== SourceLine 1141
                                {
                                    // JavaLine 128 <== SourceLine 1142
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0098")),new RTS_TXT("P")),new RTS_TXT("\u00009")),new RTS_TXT("\u0087")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0099")),new RTS_TXT("\u005e")),new RTS_TXT("<")),new RTS_TXT("U")));
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 135 <== SourceLine 1182
                        {
                            _SIM_LABEL(1); // DeclaredIn: doCodeEndBlock -> doCodeEndBlock[externalIdent=SCODMAIN_codegenerator_doCodeEndBlock] Kind=5, QUAL=ProcedureDeclaration, HashCode=1561290656
                            // JavaLine 138 <== SourceLine 1183
                            new SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                        }
                        ;
                        // JavaLine 142 <== SourceLine 1184
                        new SCODER0_codegenerator0_popasd((_CUR._SL));
                        ;
                    }
                    break;
                    case 8: 
                    // JavaLine 148 <== SourceLine 1187
                    {
                        // JavaLine 150 <== SourceLine 1191
                        if(_VALUE(((SCODMAIN)(_CUR._SL._SL)).ReuseProc_6)) {
                            {
                                // JavaLine 153 <== SourceLine 1192
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1192,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b0"))._RESULT);
                                ;
                                // JavaLine 156 <== SourceLine 1193
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1193,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00b1"))._RESULT);
                                ;
                            }
                        } else {
                            // JavaLine 161 <== SourceLine 1194
                            {
                                // JavaLine 163 <== SourceLine 1195
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1195,new RTS_TXT("PUSHV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                ;
                                // JavaLine 166 <== SourceLine 1196
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1196,new RTS_TXT("REMOTEV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0098"))._RESULT);
                                ;
                                // JavaLine 169 <== SourceLine 1197
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1197,new RTS_TXT("PUSH"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                ;
                                // JavaLine 172 <== SourceLine 1198
                                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1198,new RTS_TXT("POP"));
                                ;
                            }
                        }
                        ;
                        // JavaLine 178 <== SourceLine 1200
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((((SCODMAIN)(_CUR._SL._SL)).ReuseProc_6)?(CONC(CONC(CONC(new RTS_TXT("C"),new RTS_TXT("\u0004\u00b0")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00b1"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0098")),new RTS_TXT("P")),new RTS_TXT("\u00009")),new RTS_TXT("\u0087")),new RTS_TXT("T")))));
                        ;
                        // JavaLine 181 <== SourceLine 1207
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1207,new RTS_TXT("LABEL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(2)))._RESULT);
                        ;
                        // JavaLine 184 <== SourceLine 1208
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(48);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(2)));
                        ;
                    }
                    break;
                    case 9: 
                    // JavaLine 192 <== SourceLine 1211
                    {
                        // JavaLine 194 <== SourceLine 1215
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
                        ;
                        // JavaLine 197 <== SourceLine 1216
                        new SCODER1_codegenerator1_outINRtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).opq_3);
                        ;
                        // JavaLine 200 <== SourceLine 1217
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u005e"),new RTS_TXT("0")));
                        ;
                        // JavaLine 203 <== SourceLine 1218
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(RTS_ENVIRONMENT.isorank(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1.inrtag))));
                        ;
                    }
                    break;
                    default:
                    // JavaLine 209 <== SourceLine 1221
                    new BUILDER1_visiblegenerator_StopScode_1((_CUR._SL),((char)17),1221);
                    break;
                } // END SWITCH STATEMENT
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeEndBlock",1,1047,10,1183,28,1048,32,1049,34,1050,37,1054,41,1064,43,1065,45,1066,48,1067,51,1068,61,1071,67,1074,71,1076,73,1112,76,1113,79,1114,82,1115,85,1116,88,1117,91,1118,96,1121,98,1122,101,1123,104,1124,107,1125,110,1126,118,1130,121,1131,126,1141,128,1142,135,1182,138,1183,142,1184,148,1187,150,1191,153,1192,156,1193,161,1194,163,1195,166,1196,169,1197,172,1198,178,1200,181,1207,184,1208,192,1211,194,1215,197,1216,200,1217,203,1218,209,1221,223,1223);
} // End of Procedure
