// JavaLine 1 <== SourceLine 245
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeSUBSCRIPT_BEGIN extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=245, lastLine=282, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeSUBSCRIPT_BEGIN(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeSUBSCRIPT_BEGIN _STM() {
        // JavaLine 21 <== SourceLine 249
        ((SCODMAIN_codegenerator)(_CUR._SL)).curparno_6=RTS_ENVIRONMENT.rank(((SCODMAIN)(_CUR._SL._SL)).opilo_6);
        ;
        // JavaLine 24 <== SourceLine 251
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)1))))) {
            {
                // JavaLine 27 <== SourceLine 252
                if(_VALUE(((SCODMAIN)(_CUR._SL._SL)).BoundCheck_6)) {
                    ;
                } else {
                    // JavaLine 31 <== SourceLine 253
                    if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.special_1!=(((char)0))))) {
                        {
                            // JavaLine 34 <== SourceLine 254
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(75);
                            ;
                            // JavaLine 37 <== SourceLine 255
                            new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).arr1elttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)));
                            ;
                            // JavaLine 40 <== SourceLine 256
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),256,new RTS_TXT("REMOTE"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).arr1elttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)))._RESULT);
                            ;
                            // JavaLine 43 <== SourceLine 257
                            _GOTO(((SCODMAIN_codegenerator)(_CUR._SL))._LABEL_SCODMAIN_codegenerator_Block1731_Block1735_NXT_0); // GOTO EVALUATED LABEL
                        }
                    }
                }
                ;
                // JavaLine 49 <== SourceLine 258
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),258,new RTS_TXT("DUP"));
                ;
                // JavaLine 52 <== SourceLine 259
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),259,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00bc"))._RESULT);
                ;
                // JavaLine 55 <== SourceLine 260
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")),new RTS_TXT("\u0003\u00bc")));
            }
        } else {
            // JavaLine 59 <== SourceLine 263
            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)2))))) {
                {
                    // JavaLine 62 <== SourceLine 264
                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),264,new RTS_TXT("DUP"));
                    ;
                    // JavaLine 65 <== SourceLine 265
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),265,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00b7"))._RESULT);
                    ;
                    // JavaLine 68 <== SourceLine 266
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")),new RTS_TXT("\u0003\u00b7")));
                }
            } else {
                // JavaLine 72 <== SourceLine 268
                {
                    // JavaLine 74 <== SourceLine 269
                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),269,new RTS_TXT("DUP"));
                    ;
                    // JavaLine 77 <== SourceLine 270
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),270,new RTS_TXT("REMOTE"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00ef"))._RESULT);
                    ;
                    // JavaLine 80 <== SourceLine 271
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),271,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00b2"))._RESULT);
                    ;
                    // JavaLine 83 <== SourceLine 272
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),272,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((SCODMAIN)(_CUR._SL._SL)).opilo_6))));
                    ;
                    // JavaLine 86 <== SourceLine 273
                    new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),273,new RTS_TXT("ASSPAR"));
                    ;
                    // JavaLine 89 <== SourceLine 274
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("K")),new RTS_TXT("\u0000\u00ef")),new RTS_TXT("\u0088")),new RTS_TXT("\u0003\u00b2")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                    ;
                    // JavaLine 92 <== SourceLine 278
                    new SCODER0_codegenerator0_outsint((_CUR._SL),RTS_ENVIRONMENT.rank(((SCODMAIN)(_CUR._SL._SL)).opilo_6));
                    ;
                    // JavaLine 95 <== SourceLine 279
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(68);
                    ;
                }
            }
        }
        ;
        // JavaLine 102 <== SourceLine 281
        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeSUBSCRIPT_BEGIN",1,245,21,249,24,251,27,252,31,253,34,254,37,255,40,256,43,257,49,258,52,259,55,260,59,263,62,264,65,265,68,266,72,268,74,269,77,270,80,271,83,272,86,273,89,274,92,278,95,279,102,281,107,282);
} // End of Procedure
