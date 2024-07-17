// JavaLine 1 <== SourceLine 186
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeEND_ARRAY_DECL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=186, lastLine=241, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeEND_ARRAY_DECL(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeEND_ARRAY_DECL _STM() {
        // JavaLine 21 <== SourceLine 187
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(1)))) {
            {
                // JavaLine 24 <== SourceLine 188
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),188,new RTS_TXT("ASSPAR"));
                ;
                // JavaLine 27 <== SourceLine 189
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),189,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00e6"))._RESULT);
                ;
                // JavaLine 30 <== SourceLine 190
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u00e6")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
                ;
            }
        } else {
            // JavaLine 35 <== SourceLine 195
            if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(2)))) {
                {
                    // JavaLine 38 <== SourceLine 196
                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),196,new RTS_TXT("ASSPAR"));
                    ;
                    // JavaLine 41 <== SourceLine 197
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),197,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u0081"))._RESULT);
                    ;
                    // JavaLine 44 <== SourceLine 198
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u0081")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
                    ;
                }
            } else {
                // JavaLine 49 <== SourceLine 203
                {
                    // JavaLine 51 <== SourceLine 204
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),204,new RTS_TXT("ASSREP"),RTS_ENVIRONMENT.edit((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1+(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1))));
                    ;
                    // JavaLine 54 <== SourceLine 205
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),205,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005{"))._RESULT);
                        ;
                        // JavaLine 57 <== SourceLine 206
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(69);
                        ;
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1+(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1)));
                        ;
                        // JavaLine 62 <== SourceLine 207
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("F"),new RTS_TXT("\u0005{")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
                            ;
                            // JavaLine 65 <== SourceLine 210
                            ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1))-(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1))-(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1));
                            ;
                        }
                    }
                }
                ;
                // JavaLine 72 <== SourceLine 212
                ((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12=(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(0));
                ;
                // JavaLine 75 <== SourceLine 213
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),213,new RTS_TXT("PUSHV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                ;
                // JavaLine 78 <== SourceLine 214
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),214,new RTS_TXT("REMOTE"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT);
                ;
                // JavaLine 81 <== SourceLine 215
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),215,new RTS_TXT("RUPDATE"));
                ;
                // JavaLine 84 <== SourceLine 216
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),216,new RTS_TXT("POP"));
                ;
                // JavaLine 87 <== SourceLine 217
                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                ;
                // JavaLine 90 <== SourceLine 218
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")));
                ;
                // JavaLine 93 <== SourceLine 219
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(2));
                ;
                // JavaLine 96 <== SourceLine 221
                while((((SCODMAIN_codegenerator)(_CUR._SL)).narr_12!=(0))) {
                    {
                        // JavaLine 99 <== SourceLine 222
                        ((SCODMAIN_codegenerator)(_CUR._SL)).narr_12=(((SCODMAIN_codegenerator)(_CUR._SL)).narr_12-(1));
                        ;
                        // JavaLine 102 <== SourceLine 223
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),223,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT));
                        ;
                        // JavaLine 105 <== SourceLine 224
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0011")));
                        ;
                        // JavaLine 108 <== SourceLine 225
                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                        ;
                        // JavaLine 111 <== SourceLine 226
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),226,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u0088"))._RESULT);
                        ;
                        // JavaLine 114 <== SourceLine 227
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\u0088")));
                        ;
                        // JavaLine 117 <== SourceLine 228
                        ((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6=((COMMON_quantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.next));
                        ;
                        // JavaLine 120 <== SourceLine 229
                        ((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12=(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(0));
                        ;
                        // JavaLine 123 <== SourceLine 230
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),230,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12)._RESULT));
                        ;
                        // JavaLine 126 <== SourceLine 231
                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),231,new RTS_TXT("ASSPAR"));
                        ;
                        // JavaLine 129 <== SourceLine 232
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),232,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u0089"))._RESULT);
                        ;
                        // JavaLine 132 <== SourceLine 233
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0011")));
                        ;
                        // JavaLine 135 <== SourceLine 234
                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).ttag_12);
                        ;
                        // JavaLine 138 <== SourceLine 235
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u0089")));
                        ;
                    }
                }
                ;
                // JavaLine 144 <== SourceLine 238
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),238,new RTS_TXT("EMPTY"));
                ;
                // JavaLine 147 <== SourceLine 239
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(85);
                ;
                // JavaLine 150 <== SourceLine 240
                new SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                ;
                new SCODER1_codegenerator1_popcall((_CUR._SL));
                ;
                EBLK();
                return(this);
            } // End of Procedure BODY
            public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeEND_ARRAY_DECL",1,186,21,187,24,188,27,189,30,190,35,195,38,196,41,197,44,198,49,203,51,204,54,205,57,206,62,207,65,210,72,212,75,213,78,214,81,215,84,216,87,217,90,218,93,219,96,221,99,222,102,223,105,224,108,225,111,226,114,227,117,228,120,229,123,230,126,231,129,232,132,233,135,234,138,235,144,238,147,239,150,240,157,241);
        } // End of Procedure
