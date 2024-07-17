// JavaLine 1 <== SourceLine 253
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER4_codegenerator4_procLISCST extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=253, lastLine=381, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 328
    final RTS_LABEL _LABEL_SCODER4_codegenerator4_procLISCST_Block258_Block321_outLitPar_0=new RTS_LABEL(this,0,1,"outLitPar"); // Local Label #1=outLitPar At PrefixLevel 0
    // JavaLine 12 <== SourceLine 380
    final RTS_LABEL _LABEL_SCODER4_codegenerator4_procLISCST_Block258_EXIT_0=new RTS_LABEL(this,0,2,"EXIT"); // Local Label #2=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 255
    public int jjj=0;
    // JavaLine 17 <== SourceLine 257
    public CHECKER2_semchecker _inspect_257_4659=null;
    // Normal Constructor
    public SCODER4_codegenerator4_procLISCST(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER4_codegenerator4_procLISCST _STM() {
        SCODER4_codegenerator4_procLISCST _THIS=(SCODER4_codegenerator4_procLISCST)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_257_4659=((SCODER4_codegenerator4)(_CUR._SL)).checker_5;
                    if(_inspect_257_4659!=null) { // INSPECT _inspect_257_4659
                        // JavaLine 38 <== SourceLine 258
                        {
                            // JavaLine 40 <== SourceLine 257
                            {
                                // JavaLine 42 <== SourceLine 258
                                if(_VALUE(_IS(((SCODER4_codegenerator4)(_CUR._SL)).curpar_6,COMMON_extquantity.class))) {
                                    {
                                        // JavaLine 45 <== SourceLine 259
                                        if(_VALUE((((COMMON_extquantity)(((SCODER4_codegenerator4)(_CUR._SL)).curpar_6)).clf_2==(((char)2))))) {
                                            {
                                                // JavaLine 48 <== SourceLine 260
                                                if(_VALUE(((((SCODER4)(_CUR._SL._SL)).opt==(((char)8)))||((((SCODER4)(_CUR._SL._SL)).opt==(((char)7))))))) {
                                                    {
                                                        // JavaLine 51 <== SourceLine 262
                                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u001a")));
                                                        ;
                                                        // JavaLine 54 <== SourceLine 263
                                                        ((SCODER4_codegenerator4)(_CUR._SL)).curpar_6=null;
                                                        ;
                                                        _GOTO(_LABEL_SCODER4_codegenerator4_procLISCST_Block258_EXIT_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                ;
                                // JavaLine 66 <== SourceLine 266
                                jjj=new BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("procLISCST"))._RESULT;
                                ;
                                // JavaLine 69 <== SourceLine 267
                                ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(53);
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),jjj);
                                ;
                                // JavaLine 74 <== SourceLine 268
                                if(((SCODER4)(_CUR._SL._SL)).opt<((char)0) || ((SCODER4)(_CUR._SL._SL)).opt>((char)8)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((SCODER4)(_CUR._SL._SL)).opt) { // BEGIN SWITCH STATEMENT
                                    case 8: 
                                    // JavaLine 78 <== SourceLine 270
                                    ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00018")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u005b")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")),new RTS_TXT("\u0000N")),new RTS_TXT("\t")));
                                    break;
                                    case 1: 
                                    // JavaLine 82 <== SourceLine 279
                                    ((SCODER4_codegenerator4)(_CUR._SL)).outtext((((((SCODER4)(_CUR._SL._SL)).opilo_6==('B')))?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001T")),new RTS_TXT("\u0000\u0001")),new RTS_TXT("\u001c")),new RTS_TXT("\t"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001T")),new RTS_TXT("\u0000\u0001")),new RTS_TXT("\u001d")),new RTS_TXT("\t")))));
                                    break;
                                    case 7: 
                                    // JavaLine 86 <== SourceLine 295
                                    ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00017")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001Z")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0019")),new RTS_TXT("\t")));
                                    break;
                                    case 2: 
                                    // JavaLine 90 <== SourceLine 302
                                    {
                                        // JavaLine 92 <== SourceLine 303
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00012")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001U")),new RTS_TXT("\u0000\u0002")),new RTS_TXT("\f")));
                                        ;
                                        // JavaLine 95 <== SourceLine 309
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(RTS_ENVIRONMENT.rank(((SCODER4)(_CUR._SL._SL)).opilo_6));
                                        ;
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(9);
                                        ;
                                    }
                                    break;
                                    case 3: 
                                    // JavaLine 103 <== SourceLine 311
                                    {
                                        // JavaLine 105 <== SourceLine 312
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00013")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001V")),new RTS_TXT("\u0000\u0004")),new RTS_TXT("\r")));
                                        ;
                                        // JavaLine 108 <== SourceLine 318
                                        _GOTO(_LABEL_SCODER4_codegenerator4_procLISCST_Block258_Block321_outLitPar_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 114 <== SourceLine 320
                                    {
                                        // JavaLine 116 <== SourceLine 321
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00014")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001W")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                                        ;
                                        // JavaLine 119 <== SourceLine 327
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: procLISCST -> procLISCST[externalIdent=SCODER4_codegenerator4_procLISCST] Kind=5, QUAL=ProcedureDeclaration, HashCode=685903371
                                            // JavaLine 122 <== SourceLine 328
                                            ((SCODER4_codegenerator4)(_CUR._SL)).literal_6=new COMMON_nameof((_CUR._SL._SL),((SCODER4)(_CUR._SL._SL)).opihi_6,((SCODER4)(_CUR._SL._SL)).opilo_6)._RESULT;
                                        }
                                        ;
                                        // JavaLine 126 <== SourceLine 329
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(RTS_TXT.length(((SCODER4_codegenerator4)(_CUR._SL)).literal_6));
                                        ;
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(((SCODER4_codegenerator4)(_CUR._SL)).literal_6);
                                        ;
                                        // JavaLine 131 <== SourceLine 330
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(9);
                                        ;
                                    }
                                    break;
                                    case 5: 
                                    // JavaLine 137 <== SourceLine 332
                                    {
                                        // JavaLine 139 <== SourceLine 333
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00015")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001X")),new RTS_TXT("\u0000\u0005")),new RTS_TXT("\u000f")));
                                        ;
                                        // JavaLine 142 <== SourceLine 339
                                        _GOTO(_LABEL_SCODER4_codegenerator4_procLISCST_Block258_Block321_outLitPar_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 6: 
                                    // JavaLine 148 <== SourceLine 341
                                    {
                                        // JavaLine 150 <== SourceLine 342
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001S"),new RTS_TXT("\n")),new RTS_TXT("\u0001S")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00016")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001Y")),new RTS_TXT("\u0000\u0006")),new RTS_TXT("\u0010")));
                                        ;
                                        // JavaLine 153 <== SourceLine 348
                                        _GOTO(_LABEL_SCODER4_codegenerator4_procLISCST_Block258_Block321_outLitPar_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 160 <== SourceLine 352
                                if(_VALUE((((SCODER4_codegenerator4)(_CUR._SL)).curpar_6==(null)))) {
                                    {
                                        // JavaLine 163 <== SourceLine 353
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("\u0088")));
                                        ;
                                        // JavaLine 166 <== SourceLine 354
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).fpt_profile.getELEMENT(RTS_ENVIRONMENT.rank(((SCODER4)(_CUR._SL._SL)).opt)));
                                        ;
                                        // JavaLine 169 <== SourceLine 355
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                        ;
                                        // JavaLine 172 <== SourceLine 356
                                        new SCODER0_codegenerator0_outsint((_CUR._SL),(((SCODER4_codegenerator4)(_CUR._SL)).curparno_6-(1)));
                                        ;
                                        // JavaLine 175 <== SourceLine 357
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                        ;
                                        // JavaLine 178 <== SourceLine 359
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),jjj);
                                        ;
                                        // JavaLine 181 <== SourceLine 360
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                        ;
                                        // JavaLine 184 <== SourceLine 362
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),jjj);
                                        ;
                                        // JavaLine 187 <== SourceLine 363
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                        ;
                                        // JavaLine 190 <== SourceLine 365
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).litpardesvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODER4)(_CUR._SL._SL)).opt)));
                                        ;
                                        // JavaLine 193 <== SourceLine 366
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(((((((SCODER4)(_CUR._SL._SL)).opilo_6==('@'))&&((((SCODER4)(_CUR._SL._SL)).opihi_6==(((char)0))))))?(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("D")),new RTS_TXT("F"))):(CONC(new RTS_TXT("D"),new RTS_TXT("F")))));
                                        ;
                                        // JavaLine 196 <== SourceLine 371
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).fpt_body.getELEMENT(RTS_ENVIRONMENT.rank(((SCODER4)(_CUR._SL._SL)).opt)));
                                        ;
                                    }
                                } else {
                                    // JavaLine 201 <== SourceLine 373
                                    {
                                        // JavaLine 203 <== SourceLine 374
                                        new SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                                        ;
                                        // JavaLine 206 <== SourceLine 375
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                        ;
                                        // JavaLine 209 <== SourceLine 376
                                        new SCODER0_codegenerator0_outtag((_CUR._SL),jjj);
                                        ;
                                        // JavaLine 212 <== SourceLine 377
                                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER4"),377,new RTS_TXT("ASSIGN"));
                                        ;
                                        // JavaLine 215 <== SourceLine 378
                                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(111);
                                        ;
                                        ((SCODER4_codegenerator4)(_CUR._SL)).asd_4=(((SCODER4_codegenerator4)(_CUR._SL)).asd_4-(1));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 223 <== SourceLine 380
                                {
                                    _SIM_LABEL(2); // DeclaredIn: procLISCST -> procLISCST[externalIdent=SCODER4_codegenerator4_procLISCST] Kind=5, QUAL=ProcedureDeclaration, HashCode=685903371
                                    ;
                                }
                            }
                        }
                    }
                } // END INSPECTION
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER4.sim","5 procLISCST",1,253,10,328,12,380,15,255,17,257,38,258,40,257,42,258,45,259,48,260,51,262,54,263,66,266,69,267,74,268,78,270,82,279,86,295,90,302,92,303,95,309,103,311,105,312,108,318,114,320,116,321,119,327,122,328,126,329,131,330,137,332,139,333,142,339,148,341,150,342,153,348,160,352,163,353,166,354,169,355,172,356,175,357,178,359,181,360,184,362,187,363,190,365,193,366,196,371,201,373,203,374,206,375,209,376,212,377,215,378,223,380,242,381);
} // End of Procedure
