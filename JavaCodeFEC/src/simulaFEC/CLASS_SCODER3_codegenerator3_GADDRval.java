// JavaLine 1 <== SourceLine 135
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_GADDRval extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=135, lastLine=220, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 142
    public boolean saveEmit=false;
    // JavaLine 12 <== SourceLine 144
    public CLASS_COMMON_quantity _inspect_144_4648=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_GADDRval(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_GADDRval _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_144_4648=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
            if(_inspect_144_4648!=null) { // INSPECT _inspect_144_4648  type=ref(QUANTITY)
                // JavaLine 29 <== SourceLine 145
                {
                    // JavaLine 31 <== SourceLine 144
                    {
                        // JavaLine 33 <== SourceLine 145
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 36 <== SourceLine 147
                        if(_VALUE((_inspect_144_4648.categ_1!=(((char)2))))) {
                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(73);
                        } else {
                            // JavaLine 40 <== SourceLine 148
                            {
                                // JavaLine 42 <== SourceLine 149
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001e")),new RTS_TXT("Q")),new RTS_TXT("\u001c")),new RTS_TXT("?")),new RTS_TXT("y")));
                                ;
                                // JavaLine 45 <== SourceLine 152
                                new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                ;
                                // JavaLine 48 <== SourceLine 153
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001d")));
                                ;
                                // JavaLine 51 <== SourceLine 154
                                new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                ;
                                // JavaLine 54 <== SourceLine 155
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001f")),new RTS_TXT("L")),new RTS_TXT("@")));
                                ;
                                // JavaLine 57 <== SourceLine 159
                                if(_VALUE(((_inspect_144_4648.kind_1==(((char)0)))&&((_inspect_144_4648.type_1==(((char)8))))))) {
                                    {
                                        // JavaLine 60 <== SourceLine 160
                                        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4>(2)))) {
                                            {
                                                // JavaLine 63 <== SourceLine 161
                                                if(_VALUE((((CLASS_SCODER3)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                    // JavaLine 65 <== SourceLine 162
                                                    new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-npTA"));
                                                }
                                                ;
                                                // JavaLine 69 <== SourceLine 163
                                                new CLASS_SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                                ;
                                                // JavaLine 72 <== SourceLine 164
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6);
                                                ;
                                                saveEmit=true;
                                            }
                                        }
                                        ;
                                        // JavaLine 79 <== SourceLine 165
                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                        ;
                                        // JavaLine 82 <== SourceLine 166
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u00065")),new RTS_TXT("F")),new RTS_TXT("\u00066")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6)):(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u00065")),new RTS_TXT("F")),new RTS_TXT("\u00066")))));
                                        ;
                                        // JavaLine 85 <== SourceLine 174
                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                        ;
                                        // JavaLine 88 <== SourceLine 175
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u00069")),new RTS_TXT("F")),new RTS_TXT("\u0006:")),new RTS_TXT("A")));
                                        ;
                                    }
                                } else {
                                    // JavaLine 93 <== SourceLine 180
                                    {
                                        // JavaLine 95 <== SourceLine 181
                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                        ;
                                        // JavaLine 98 <== SourceLine 182
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0001N")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00014")),new RTS_TXT("?")),new RTS_TXT("\u007c")));
                                        ;
                                        // JavaLine 101 <== SourceLine 186
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                        ;
                                        // JavaLine 104 <== SourceLine 187
                                        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4>(2)))) {
                                            {
                                                // JavaLine 107 <== SourceLine 188
                                                if(_VALUE((((CLASS_SCODER3)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                    // JavaLine 109 <== SourceLine 189
                                                    new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-FNP\u005fASS"));
                                                }
                                                ;
                                                // JavaLine 113 <== SourceLine 190
                                                new CLASS_SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                                ;
                                                // JavaLine 116 <== SourceLine 191
                                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6);
                                                ;
                                                saveEmit=true;
                                            }
                                        }
                                        ;
                                        // JavaLine 123 <== SourceLine 192
                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                        ;
                                        // JavaLine 126 <== SourceLine 194
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00be")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00bf")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("@")),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("A")),new RTS_TXT("T"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00be")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00bf")),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("@")),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("A")),new RTS_TXT("T")))));
                                        ;
                                        // JavaLine 129 <== SourceLine 210
                                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                                        ;
                                        // JavaLine 132 <== SourceLine 211
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00e6")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00e7")),new RTS_TXT("A")));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 138 <== SourceLine 217
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(4));
                                ;
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 GADDRval",1,135,10,142,12,144,29,145,31,144,33,145,36,147,40,148,42,149,45,152,48,153,51,154,54,155,57,159,60,160,63,161,65,162,69,163,72,164,79,165,82,166,85,174,88,175,93,180,95,181,98,182,101,186,104,187,107,188,109,189,113,190,116,191,123,192,126,194,129,210,132,211,138,217,151,220);
} // End of Procedure
