// JavaLine 1 <== SourceLine 1196
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_TAGTABLE_init_smst extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1196, lastLine=1229, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_TAGTABLE_init_smst(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_TAGTABLE_init_smst _STM() {
        // JavaLine 21 <== SourceLine 1198
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2086),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("smsRec"))));
        ;
        // JavaLine 24 <== SourceLine 1199
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2087),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("smsPtp"))));
        ;
        // JavaLine 27 <== SourceLine 1200
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2090),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("linkag1"))));
        ;
        // JavaLine 30 <== SourceLine 1201
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2091),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("prd"))));
        ;
        // JavaLine 33 <== SourceLine 1202
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2092),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("suc"))));
        ;
        // JavaLine 36 <== SourceLine 1203
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2088),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("linkag"))));
        ;
        // JavaLine 39 <== SourceLine 1204
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2089),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("lkaPtp"))));
        ;
        // JavaLine 42 <== SourceLine 1205
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2093),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("lnkRec"))));
        ;
        // JavaLine 45 <== SourceLine 1206
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2094),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("lnkPtp"))));
        ;
        // JavaLine 48 <== SourceLine 1207
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2095),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("hedRec"))));
        ;
        // JavaLine 51 <== SourceLine 1208
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2096),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("hedPtp"))));
        ;
        // JavaLine 54 <== SourceLine 1209
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2098),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("follow:body"))));
        ;
        // JavaLine 57 <== SourceLine 1210
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2097),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("follow"))));
        ;
        // JavaLine 60 <== SourceLine 1211
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2102),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("intoSS:body"))));
        ;
        // JavaLine 63 <== SourceLine 1212
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2101),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("intoSS"))));
        ;
        // JavaLine 66 <== SourceLine 1213
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2106),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("outSS:body"))));
        ;
        // JavaLine 69 <== SourceLine 1214
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2105),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("outSS"))));
        ;
        // JavaLine 72 <== SourceLine 1215
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2109),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("precSS:body"))));
        ;
        // JavaLine 75 <== SourceLine 1216
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2108),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("precSS"))));
        ;
        // JavaLine 78 <== SourceLine 1217
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2113),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("predSS:body"))));
        ;
        // JavaLine 81 <== SourceLine 1218
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2112),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("predSS"))));
        ;
        // JavaLine 84 <== SourceLine 1219
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2117),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("prevSS:body"))));
        ;
        // JavaLine 87 <== SourceLine 1220
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2116),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("prevSS"))));
        ;
        // JavaLine 90 <== SourceLine 1221
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2121),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("sucSS:body"))));
        ;
        // JavaLine 93 <== SourceLine 1222
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2120),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("sucSS"))));
        ;
        // JavaLine 96 <== SourceLine 1223
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2125),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("cardSS:body"))));
        ;
        // JavaLine 99 <== SourceLine 1224
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2124),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("cardSS"))));
        ;
        // JavaLine 102 <== SourceLine 1225
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2129),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("cleaSS:body"))));
        ;
        // JavaLine 105 <== SourceLine 1226
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2128),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("cleaSS"))));
        ;
        // JavaLine 108 <== SourceLine 1227
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2132),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("emptSS:body"))));
        ;
        // JavaLine 111 <== SourceLine 1228
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(2131),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("emptSS"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 init_smst",1,1196,21,1198,24,1199,27,1200,30,1201,33,1202,36,1203,39,1204,42,1205,45,1206,48,1207,51,1208,54,1209,57,1210,60,1211,63,1212,66,1213,69,1214,72,1215,75,1216,78,1217,81,1218,84,1219,87,1220,90,1221,93,1222,96,1223,99,1224,102,1225,105,1226,108,1227,111,1228,116,1229);
} // End of Procedure
