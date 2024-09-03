// JavaLine 1 <== SourceLine 1135
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_get_LABQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1135, lastLine=1196, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1139
    public int conlvl=0;
    // JavaLine 12 <== SourceLine 1142
    public CLASS_COMMON_quantity _inspect_1142_4646=null;
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_get_LABQNT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_get_LABQNT _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1142_4646=((CLASS_SCODER2_codegenerator2)(_CUR._SL)).opq_3;
            if(_inspect_1142_4646!=null) { // INSPECT _inspect_1142_4646  type=ref(QUANTITY)
                // JavaLine 29 <== SourceLine 1143
                {
                    // JavaLine 31 <== SourceLine 1142
                    {
                        // JavaLine 33 <== SourceLine 1143
                        if(_inspect_1142_4646.categ_1<((char)0) || _inspect_1142_4646.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(_inspect_1142_4646.categ_1) { // BEGIN SWITCH STATEMENT
                            case 3: 
                            // JavaLine 37 <== SourceLine 1144
                            {
                                // JavaLine 39 <== SourceLine 1145
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 42 <== SourceLine 1148
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("J")),new RTS_TXT("\u0001C")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u0014")));
                                ;
                                // JavaLine 45 <== SourceLine 1153
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1142_4646.ftag_1+(0)));
                                ;
                                // JavaLine 48 <== SourceLine 1154
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("J")),new RTS_TXT("\u0001D")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 51 <== SourceLine 1159
                                conlvl=new CLASS_SCODER1_codegenerator1_conlevel((_CUR._SL),((CLASS_COMMON_quantity)_inspect_1142_4646))._RESULT;
                                ;
                                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),conlvl);
                                ;
                                // JavaLine 56 <== SourceLine 1160
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("J")),new RTS_TXT("\u0001E")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001w")));
                                ;
                            }
                            break;
                            case 0: 
                            // JavaLine 62 <== SourceLine 1176
                            {
                                // JavaLine 64 <== SourceLine 1177
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 67 <== SourceLine 1178
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(150);
                                ;
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_1142_4646.ftag_1+(0)));
                                ;
                            }
                            break;
                            case 6: 
                            // JavaLine 75 <== SourceLine 1180
                            {
                                // JavaLine 77 <== SourceLine 1181
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 80 <== SourceLine 1182
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\u00a5")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 83 <== SourceLine 1184
                                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(_inspect_1142_4646.virtno_1-(1)));
                                ;
                                // JavaLine 86 <== SourceLine 1185
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u00a6")));
                                ;
                            }
                            break;
                            case 2: 
                            // JavaLine 92 <== SourceLine 1188
                            {
                                // JavaLine 94 <== SourceLine 1189
                                new CLASS_SCODER2_codegenerator2_addrNAMEQNT((_CUR._SL));
                                ;
                                // JavaLine 97 <== SourceLine 1190
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u001d")),new RTS_TXT("F")),new RTS_TXT("\u0006\u001e")));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 get_LABQNT",1,1135,10,1139,12,1142,29,1143,31,1142,33,1143,37,1144,39,1145,42,1148,45,1153,48,1154,51,1159,56,1160,62,1176,64,1177,67,1178,75,1180,77,1181,80,1182,83,1184,86,1185,92,1188,94,1189,97,1190,111,1196);
} // End of Procedure
