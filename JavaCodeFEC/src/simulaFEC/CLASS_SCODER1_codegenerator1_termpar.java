// JavaLine 1 <== SourceLine 276
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:34 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_termpar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=276, lastLine=462, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 290
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_termpar_Block281_Block284_O2C_0=new RTS_LABEL(this,0,1,"O2C"); // Local Label #1=O2C At PrefixLevel 0
    // JavaLine 12 <== SourceLine 358
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_termpar_Block281_Block356_normal_0=new RTS_LABEL(this,0,2,"normal"); // Local Label #2=normal At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 277
    public boolean saveEmit=false;
    public int ttag=0;
    // JavaLine 18 <== SourceLine 280
    public CLASS_COMMON_quantity _inspect_280_4625=null;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_termpar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_termpar _STM() {
        CLASS_SCODER1_codegenerator1_termpar _THIS=(CLASS_SCODER1_codegenerator1_termpar)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_280_4625=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curpar_6;
                    if(_inspect_280_4625!=null) { // INSPECT _inspect_280_4625  type=ref(QUANTITY)
                        // JavaLine 39 <== SourceLine 281
                        {
                            // JavaLine 41 <== SourceLine 280
                            {
                                // JavaLine 43 <== SourceLine 281
                                if(((RTS_UTIL._IS(((CLASS_COMMON_quantity)_inspect_280_4625),CLASS_COMMON_extquantity.class))?(((CLASS_COMMON_extquantity)(((CLASS_COMMON_quantity)_inspect_280_4625))).clf_2):(((char)0)))<((char)0) || ((RTS_UTIL._IS(((CLASS_COMMON_quantity)_inspect_280_4625),CLASS_COMMON_extquantity.class))?(((CLASS_COMMON_extquantity)(((CLASS_COMMON_quantity)_inspect_280_4625))).clf_2):(((char)0)))>'0') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((RTS_UTIL._IS(((CLASS_COMMON_quantity)_inspect_280_4625),CLASS_COMMON_extquantity.class))?(((CLASS_COMMON_extquantity)(((CLASS_COMMON_quantity)_inspect_280_4625))).clf_2):(((char)0)))) { // BEGIN SWITCH STATEMENT
                                    case 2: 
                                    // JavaLine 47 <== SourceLine 283
                                    {
                                        // JavaLine 49 <== SourceLine 284
                                        if(_VALUE(((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curcall_6.dim_1!=(RTS_ENVIRONMENT.rank('L')))&&((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curcall_6.dim_1!=(RTS_ENVIRONMENT.rank('M'))))))) {
                                            // JavaLine 51 <== SourceLine 285
                                            _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_termpar_Block281_Block356_normal_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 55 <== SourceLine 287
                                        if(_inspect_280_4625.categ_1<((char)0) || _inspect_280_4625.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                        switch(_inspect_280_4625.categ_1) { // BEGIN SWITCH STATEMENT
                                            case 1: 
                                            case 0: 
                                            // JavaLine 60 <== SourceLine 289
                                            if(_VALUE((_inspect_280_4625.kind_1==(((char)2))))) {
                                                // JavaLine 62 <== SourceLine 290
                                                {
                                                    _SIM_LABEL(1); // DeclaredIn: termpar -> termpar[externalIdent=CLASS_SCODER1_codegenerator1_termpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1579489605
                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\u0060")),new RTS_TXT("F")),new RTS_TXT("\u0005a")));
                                                }
                                            } else {
                                                // JavaLine 68 <== SourceLine 292
                                                if(_VALUE((_inspect_280_4625.type_1==(((char)7))))) {
                                                    {
                                                        // JavaLine 71 <== SourceLine 293
                                                        if(_VALUE((new CLASS_SCODER1_codegenerator1_getFirstAttr((_CUR._SL))._RESULT!=(0)))) {
                                                            _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_termpar_Block281_Block284_O2C_0); // GOTO EVALUATED LABEL
                                                        }
                                                        ;
                                                        // JavaLine 76 <== SourceLine 294
                                                        new CLASS_ERRMSG_error0((_CUR._SL._SL),-251);
                                                        ;
                                                        // JavaLine 79 <== SourceLine 295
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("T"),new RTS_TXT("Q")),new RTS_TXT("\u0019")));
                                                    }
                                                } else {
                                                    // JavaLine 83 <== SourceLine 298
                                                    if(_VALUE((_inspect_280_4625.type_1==(((char)8))))) {
                                                        // JavaLine 85 <== SourceLine 299
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\\")),new RTS_TXT("F")),new RTS_TXT("\u0005\u005d")));
                                                    }
                                                }
                                            }
                                            break;
                                            case 2: 
                                            // JavaLine 92 <== SourceLine 302
                                            if(_VALUE((_inspect_280_4625.kind_1==(((char)2))))) {
                                                // JavaLine 94 <== SourceLine 303
                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005l")),new RTS_TXT("F")),new RTS_TXT("\u0005m")));
                                            } else {
                                                // JavaLine 97 <== SourceLine 305
                                                if(_VALUE((_inspect_280_4625.type_1==(((char)7))))) {
                                                    {
                                                        // JavaLine 100 <== SourceLine 306
                                                        ttag=new CLASS_SCODER1_codegenerator1_getFirstAttr((_CUR._SL))._RESULT;
                                                        ;
                                                        // JavaLine 103 <== SourceLine 307
                                                        if(_VALUE((ttag!=(0)))) {
                                                            {
                                                                // JavaLine 106 <== SourceLine 308
                                                                if(_VALUE(((CLASS_SCODER1)(_CUR._SL._SL)).NoneCheck_6)) {
                                                                    {
                                                                        // JavaLine 109 <== SourceLine 309
                                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("H"),new RTS_TXT("\u0000\b")),new RTS_TXT("G")),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).prenoneScheme_6));
                                                                        ;
                                                                        // JavaLine 112 <== SourceLine 310
                                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4);
                                                                        ;
                                                                        // JavaLine 115 <== SourceLine 311
                                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT(">"),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                                        ;
                                                                    }
                                                                } else {
                                                                    // JavaLine 120 <== SourceLine 314
                                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("H"),new RTS_TXT("\u0000\b")),new RTS_TXT("G")),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                                }
                                                                ;
                                                                // JavaLine 124 <== SourceLine 316
                                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),ttag);
                                                                ;
                                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(76);
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 131 <== SourceLine 317
                                                            {
                                                                // JavaLine 133 <== SourceLine 318
                                                                new CLASS_ERRMSG_error0((_CUR._SL._SL),-251);
                                                                ;
                                                                // JavaLine 136 <== SourceLine 319
                                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("T"),new RTS_TXT("Q")),new RTS_TXT("\u001a")));
                                                            }
                                                        }
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 143 <== SourceLine 323
                                                    if(_VALUE((_inspect_280_4625.type_1==(((char)8))))) {
                                                        // JavaLine 145 <== SourceLine 324
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(((((CLASS_SCODER1)(_CUR._SL._SL)).NoneCheck_6)?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("H")),new RTS_TXT("\u00019")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001:")),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("?")),new RTS_TXT("y")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u001a")),new RTS_TXT("@")),new RTS_TXT("H")),new RTS_TXT("\u00019")),new RTS_TXT("G")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001:")),new RTS_TXT("K")),new RTS_TXT("\u0001?")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001<")),new RTS_TXT("M")),new RTS_TXT("I")),new RTS_TXT("A"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("H"),new RTS_TXT("\u00019")),new RTS_TXT("G")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001:")),new RTS_TXT("K")),new RTS_TXT("\u0001?")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001<")),new RTS_TXT("M")),new RTS_TXT("I")))));
                                                    }
                                                }
                                            }
                                            break;
                                        } // END SWITCH STATEMENT
                                        ;
                                        // JavaLine 153 <== SourceLine 352
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(68);
                                        ;
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(1));
                                        ;
                                    }
                                    break;
                                    case 18: 
                                    ;
                                    break;
                                    case 16: 
                                    case 17: 
                                    // JavaLine 165 <== SourceLine 355
                                    {
                                        // JavaLine 167 <== SourceLine 356
                                        {
                                            _SIM_LABEL(2); // DeclaredIn: termpar -> termpar[externalIdent=CLASS_SCODER1_codegenerator1_termpar] Kind=5, QUAL=ProcedureDeclaration, HashCode=1579489605
                                            // JavaLine 170 <== SourceLine 358
                                            if(_VALUE((_inspect_280_4625.categ_1==(((char)1))))) {
                                                {
                                                    // JavaLine 173 <== SourceLine 360
                                                    saveEmit=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4>(1));
                                                    ;
                                                    // JavaLine 176 <== SourceLine 361
                                                    if(_VALUE((_inspect_280_4625.kind_1==(((char)2))))) {
                                                        {
                                                            // JavaLine 179 <== SourceLine 362
                                                            if(_VALUE(((((CLASS_SCODER1)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0)))&(saveEmit)))) {
                                                                // JavaLine 181 <== SourceLine 363
                                                                new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-ARR\u005fCOPY"));
                                                            }
                                                            ;
                                                            // JavaLine 185 <== SourceLine 364
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001u")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).saveScheme_6),new RTS_TXT("C")),new RTS_TXT("\u0005\u0091")),new RTS_TXT("F")),new RTS_TXT("\u0005\u0092")),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).restoreScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001u"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001u")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("C")),new RTS_TXT("\u0005\u0091")),new RTS_TXT("F")),new RTS_TXT("\u0005\u0092")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001u")))));
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 190 <== SourceLine 383
                                                        if(_VALUE((_inspect_280_4625.type_1==(((char)8))))) {
                                                            {
                                                                // JavaLine 193 <== SourceLine 384
                                                                if(_VALUE(((((CLASS_SCODER1)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0)))&(saveEmit)))) {
                                                                    // JavaLine 195 <== SourceLine 385
                                                                    new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-COPY"));
                                                                }
                                                                ;
                                                                // JavaLine 199 <== SourceLine 386
                                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001t")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001t")),new RTS_TXT("\u0088")),new RTS_TXT("\u0004\u00f8")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00f9")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001t")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).restoreScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001t"))):(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00f8")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00f9")))));
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 210 <== SourceLine 406
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),406,new RTS_TXT("ASSPAR"));
                                        ;
                                        // JavaLine 213 <== SourceLine 407
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(68);
                                        ;
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(1));
                                        ;
                                    }
                                    break;
                                    case 19: 
                                    // JavaLine 221 <== SourceLine 409
                                    {
                                        // JavaLine 223 <== SourceLine 412
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001t")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001t")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001:")),new RTS_TXT("K")),new RTS_TXT("\u0001?")));
                                        ;
                                    }
                                    break;
                                    default:
                                    // JavaLine 229 <== SourceLine 430
                                    {
                                        // JavaLine 231 <== SourceLine 431
                                        if(_VALUE((_inspect_280_4625.categ_1==(((char)1))))) {
                                            {
                                                // JavaLine 234 <== SourceLine 432
                                                if(_VALUE(((_inspect_280_4625.type_1==(((char)8)))&&((_inspect_280_4625.kind_1==(((char)0))))))) {
                                                    {
                                                        // JavaLine 237 <== SourceLine 433
                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),433,new RTS_TXT("ASSIGN"));
                                                        ;
                                                        // JavaLine 240 <== SourceLine 434
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),434,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00eb"))._RESULT);
                                                        ;
                                                        // JavaLine 243 <== SourceLine 435
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),435,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-AADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_280_4625.ftag_1+(0)))._RESULT));
                                                        ;
                                                        // JavaLine 246 <== SourceLine 436
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("o"),new RTS_TXT("\u0088")),new RTS_TXT("\u0004\u00eb")),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                        ;
                                                        // JavaLine 249 <== SourceLine 439
                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_280_4625.ftag_1+(0)));
                                                        ;
                                                        // JavaLine 252 <== SourceLine 440
                                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),440,new RTS_TXT("ASSPAR"));
                                                        ;
                                                        // JavaLine 255 <== SourceLine 441
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),441,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00ec"))._RESULT);
                                                        ;
                                                        // JavaLine 258 <== SourceLine 442
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u00ec")));
                                                        ;
                                                        // JavaLine 261 <== SourceLine 444
                                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(2));
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 266 <== SourceLine 446
                                                    if(_VALUE((_inspect_280_4625.kind_1==(((char)2))))) {
                                                        {
                                                            // JavaLine 269 <== SourceLine 447
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("o"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u008c")),new RTS_TXT("Q")),new RTS_TXT("\u0011")));
                                                            ;
                                                            // JavaLine 272 <== SourceLine 450
                                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_280_4625.ftag_1+(0)));
                                                            ;
                                                            // JavaLine 275 <== SourceLine 451
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u008d")));
                                                            ;
                                                            // JavaLine 278 <== SourceLine 453
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(2));
                                                            ;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            // JavaLine 286 <== SourceLine 456
                                            if(_VALUE((_inspect_280_4625.categ_1!=(((char)2))))) {
                                                {
                                                    // JavaLine 289 <== SourceLine 457
                                                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),457,new RTS_TXT("ASSIGN"));
                                                    ;
                                                    // JavaLine 292 <== SourceLine 458
                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(111);
                                                    ;
                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(2));
                                                }
                                            }
                                        }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 termpar",1,276,10,290,12,358,15,277,18,280,39,281,41,280,43,281,47,283,49,284,51,285,55,287,60,289,62,290,68,292,71,293,76,294,79,295,83,298,85,299,92,302,94,303,97,305,100,306,103,307,106,308,109,309,112,310,115,311,120,314,124,316,131,317,133,318,136,319,143,323,145,324,153,352,165,355,167,356,170,358,173,360,176,361,179,362,181,363,185,364,190,383,193,384,195,385,199,386,210,406,213,407,221,409,223,412,229,430,231,431,234,432,237,433,240,434,243,435,246,436,249,439,252,440,255,441,258,442,261,444,266,446,269,447,272,450,275,451,278,453,286,456,289,457,292,458,318,462);
} // End of Procedure
