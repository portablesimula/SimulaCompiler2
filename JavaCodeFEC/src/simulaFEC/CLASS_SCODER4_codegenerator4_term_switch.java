// JavaLine 1 <== SourceLine 80
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER4_codegenerator4_term_switch extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=80, lastLine=163, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 82
    public int xxx=0;
    // JavaLine 12 <== SourceLine 85
    public CLASS_CHECKER2_semchecker _inspect_85_4657=null;
    // Normal Constructor
    public CLASS_SCODER4_codegenerator4_term_switch(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER4_codegenerator4_term_switch _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_85_4657=((CLASS_SCODER4_codegenerator4)(_CUR._SL)).checker_5;
            if(_inspect_85_4657!=null) { // INSPECT _inspect_85_4657  type=ref(SEMCHECKER)
                // JavaLine 29 <== SourceLine 86
                {
                    // JavaLine 31 <== SourceLine 85
                    {
                        // JavaLine 33 <== SourceLine 86
                        ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).opq_3=((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6;
                        ;
                        // JavaLine 36 <== SourceLine 87
                        if(_VALUE(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).optmSwitch_10)) {
                            {
                                // JavaLine 39 <== SourceLine 88
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).optmSwitch_10=false;
                                ;
                                // JavaLine 42 <== SourceLine 89
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("P")));
                                ;
                                // JavaLine 45 <== SourceLine 90
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6.ftag_1+(0)));
                                ;
                                // JavaLine 48 <== SourceLine 91
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0000\u0087")),new RTS_TXT("=")),new RTS_TXT("x")),new RTS_TXT("C")),new RTS_TXT("\u0003\u0091")),new RTS_TXT("F")),new RTS_TXT("\u0003\u0092")),new RTS_TXT("\u008c")));
                                ;
                                // JavaLine 51 <== SourceLine 95
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outbyte(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4);
                                ;
                                // JavaLine 54 <== SourceLine 96
                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT(">"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("=")),new RTS_TXT("{")),new RTS_TXT("C")),new RTS_TXT("\u0003\u0091")),new RTS_TXT("F")),new RTS_TXT("\u0003\u0092")),new RTS_TXT("\u008c")));
                                    ;
                                    // JavaLine 57 <== SourceLine 102
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outbyte(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4);
                                    ;
                                    // JavaLine 60 <== SourceLine 103
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT(">"),new RTS_TXT("M")),new RTS_TXT("\u0095")),new RTS_TXT("\u0000\u008a")),new RTS_TXT("\u005e")));
                                    ;
                                    // JavaLine 63 <== SourceLine 107
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4=(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4-(2));
                                    ;
                                    // JavaLine 66 <== SourceLine 108
                                    new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                                    ;
                                }
                            } else {
                                // JavaLine 71 <== SourceLine 110
                                {
                                    // JavaLine 73 <== SourceLine 111
                                    ((CLASS_SCODER4)(_CUR._SL._SL)).generalgoto_6=((CLASS_SCODER4)(_CUR._SL._SL)).ingotostmt_6;
                                    ;
                                    // JavaLine 76 <== SourceLine 113
                                    if(_VALUE((((CLASS_SCODER4)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                        // JavaLine 78 <== SourceLine 114
                                        new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-SWT\u005fLAB"));
                                    }
                                    ;
                                    // JavaLine 82 <== SourceLine 115
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0087")),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00b4")));
                                    ;
                                    // JavaLine 85 <== SourceLine 122
                                    new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                    ;
                                    // JavaLine 88 <== SourceLine 123
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u00b5")),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).restoreScheme_6),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00b9")));
                                    ;
                                    // JavaLine 91 <== SourceLine 127
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4=(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4-(2));
                                    ;
                                    // JavaLine 94 <== SourceLine 130
                                    new CLASS_SCODER2_codegenerator2_get_SWTQNT((_CUR._SL));
                                    ;
                                    // JavaLine 97 <== SourceLine 131
                                    ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ba")));
                                    ;
                                    // JavaLine 100 <== SourceLine 133
                                    if(_VALUE(RTS_UTIL._IS(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6,CLASS_COMMON_extquantity.class))) {
                                        {
                                            // JavaLine 103 <== SourceLine 134
                                            if(_VALUE((((CLASS_COMMON_extquantity)(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6)).clf_2==(((char)1))))) {
                                                {
                                                    // JavaLine 106 <== SourceLine 135
                                                    new CLASS_ERRMSG_notimp((_CUR._SL._SL),new RTS_TXT("general actual label parameter to non-Simula"));
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                }
                            }
                            ;
                            // JavaLine 118 <== SourceLine 161
                            new CLASS_SCODER1_codegenerator1_popcall((_CUR._SL));
                            ;
                        }
                    }
                }
            } // END INSPECTION
            ;
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER4.sim","5 term_switch",1,80,10,82,12,85,29,86,31,85,33,86,36,87,39,88,42,89,45,90,48,91,51,95,54,96,57,102,60,103,63,107,66,108,71,110,73,111,76,113,78,114,82,115,85,122,88,123,91,127,94,130,97,131,100,133,103,134,106,135,118,161,128,163);
    } // End of Procedure
