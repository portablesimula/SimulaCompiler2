// JavaLine 1 <== SourceLine 1199
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_get_SWTQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1199, lastLine=1247, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1204
    public CLASS_COMMON_quantity _inspect_1204_4647=null;
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_get_SWTQNT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_get_SWTQNT _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1204_4647=((CLASS_SCODER2_codegenerator2)(_CUR._SL)).opq_3;
            if(_inspect_1204_4647!=null) { // INSPECT _inspect_1204_4647  type=ref(QUANTITY)
                // JavaLine 27 <== SourceLine 1205
                {
                    // JavaLine 29 <== SourceLine 1204
                    {
                        // JavaLine 31 <== SourceLine 1205
                        if(_inspect_1204_4647.categ_1<((char)0) || _inspect_1204_4647.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(_inspect_1204_4647.categ_1) { // BEGIN SWITCH STATEMENT
                            case 3: 
                            // JavaLine 35 <== SourceLine 1206
                            {
                                // JavaLine 37 <== SourceLine 1207
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 40 <== SourceLine 1208
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001x")),new RTS_TXT("J")),new RTS_TXT("\u0001K")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                ;
                                // JavaLine 43 <== SourceLine 1213
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1204_4647.ftag_1+(0)));
                                ;
                                // JavaLine 46 <== SourceLine 1214
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001x")),new RTS_TXT("J")),new RTS_TXT("\u0001L")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001x")));
                                ;
                            }
                            break;
                            case 0: 
                            // JavaLine 52 <== SourceLine 1227
                            {
                                // JavaLine 54 <== SourceLine 1228
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 57 <== SourceLine 1229
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(150);
                                ;
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1204_4647.ftag_1+(0)));
                                ;
                            }
                            break;
                            case 6: 
                            // JavaLine 65 <== SourceLine 1231
                            {
                                // JavaLine 67 <== SourceLine 1232
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 70 <== SourceLine 1233
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\u00af")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 73 <== SourceLine 1235
                                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(_inspect_1204_4647.virtno_1-(1)));
                                ;
                                // JavaLine 76 <== SourceLine 1236
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u00b0")));
                                ;
                            }
                            break;
                            case 2: 
                            // JavaLine 82 <== SourceLine 1239
                            {
                                // JavaLine 84 <== SourceLine 1240
                                new CLASS_SCODER2_codegenerator2_addrNAMEQNT((_CUR._SL));
                                ;
                                // JavaLine 87 <== SourceLine 1241
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006!")),new RTS_TXT("F")),new RTS_TXT("\u0006\"")));
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 get_SWTQNT",1,1199,10,1204,27,1205,29,1204,31,1205,35,1206,37,1207,40,1208,43,1213,46,1214,52,1227,54,1228,57,1229,65,1231,67,1232,70,1233,73,1235,76,1236,82,1239,84,1240,87,1241,101,1247);
} // End of Procedure
