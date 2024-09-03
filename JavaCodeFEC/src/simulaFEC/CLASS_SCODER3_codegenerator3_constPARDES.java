// JavaLine 1 <== SourceLine 326
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_constPARDES extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=326, lastLine=433, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_code;
    public char p_kind;
    public char p_type;
    public CLASS_COMMON_quantity p_q;
    public int p_pad;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER3_codegenerator3_constPARDES setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 5: p_code=intValue(param); break;
                case 4: p_kind=(char)objectValue(param); break;
                case 3: p_type=(char)objectValue(param); break;
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_pad=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER3_codegenerator3_constPARDES(RTS_RTObject _SL) {
        super(_SL,5); // Expecting 5 parameters
    }
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_constPARDES(RTS_RTObject _SL,int sp_code,char sp_kind,char sp_type,CLASS_COMMON_quantity sp_q,int sp_pad) {
        super(_SL);
        // Parameter assignment to locals
        this.p_code = sp_code;
        this.p_kind = sp_kind;
        this.p_type = sp_type;
        this.p_q = sp_q;
        this.p_pad = sp_pad;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_constPARDES _STM() {
        // JavaLine 51 <== SourceLine 331
        if(_VALUE((p_kind==(((char)6))))) {
            new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)13),331);
        }
        ;
        // JavaLine 56 <== SourceLine 333
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("PDC"))._RESULT;
        // JavaLine 58 <== SourceLine 334
        if(_VALUE((p_code==(0)))) {
            // JavaLine 60 <== SourceLine 335
            {
            }
        } else {
            // JavaLine 64 <== SourceLine 337
            if(_VALUE(((p_code==(1))||((p_code==(2)))))) {
                // JavaLine 66 <== SourceLine 338
                {
                    // JavaLine 68 <== SourceLine 339
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),339,new RTS_TXT("CONST"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9)._RESULT);
                    ;
                    // JavaLine 71 <== SourceLine 340
                    if(_VALUE((p_type==(((char)7))))) {
                        // JavaLine 73 <== SourceLine 341
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),341,new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001Q"))._RESULT,CONC(new RTS_TXT("C-RECORD "),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001Q"))._RESULT));
                    } else {
                        // JavaLine 76 <== SourceLine 342
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),342,new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001M"))._RESULT,CONC(new RTS_TXT("C-RECORD "),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001M"))._RESULT));
                    }
                    ;
                    // JavaLine 80 <== SourceLine 343
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),343,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001N"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ")),RTS_ENVIRONMENT.edit(p_code)));
                    ;
                    // JavaLine 83 <== SourceLine 344
                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(53);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                    ;
                    // JavaLine 88 <== SourceLine 345
                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext((((p_type==(((char)7))))?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001Q"),new RTS_TXT("\n")),new RTS_TXT("\u0001Q")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r"))):(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001M"),new RTS_TXT("\n")),new RTS_TXT("\u0001M")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")))));
                    ;
                    // JavaLine 91 <== SourceLine 352
                    new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),p_code);
                    ;
                    // JavaLine 94 <== SourceLine 354
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),354,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001O"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_kind))));
                    ;
                    // JavaLine 97 <== SourceLine 355
                    ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                    ;
                    // JavaLine 100 <== SourceLine 357
                    new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),RTS_ENVIRONMENT.rank(p_kind));
                    ;
                    // JavaLine 103 <== SourceLine 359
                    if(_VALUE((p_type==(((char)7))))) {
                        {
                            // JavaLine 106 <== SourceLine 360
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),360,new RTS_TXT("   ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT,new RTS_TXT(" T\u005fINT C-INT 7")));
                            ;
                            // JavaLine 109 <== SourceLine 361
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),361,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001R"))._RESULT,new RTS_TXT(" T\u005fOADDR C-OADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT));
                            ;
                        }
                    } else {
                        // JavaLine 114 <== SourceLine 362
                        {
                            // JavaLine 116 <== SourceLine 363
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),363,new RTS_TXT("   ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ???")));
                            ;
                        }
                    }
                    ;
                    // JavaLine 122 <== SourceLine 365
                    if(_VALUE((p_type==(((char)7))))) {
                        {
                            // JavaLine 125 <== SourceLine 366
                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00017")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001R")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
                            ;
                            // JavaLine 128 <== SourceLine 370
                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                            ;
                        }
                    } else {
                        // JavaLine 133 <== SourceLine 372
                        {
                            // JavaLine 135 <== SourceLine 373
                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                            ;
                            // JavaLine 138 <== SourceLine 375
                            ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte((((p_type>(((char)10))))?(48):((RTS_ENVIRONMENT.rank(p_type)+(48)))));
                            ;
                        }
                    }
                    ;
                }
            } else {
                // JavaLine 146 <== SourceLine 380
                if(_VALUE(((p_code==(3))||((p_code==(4)))))) {
                    // JavaLine 148 <== SourceLine 381
                    {
                        // JavaLine 150 <== SourceLine 382
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),382,new RTS_TXT("CONST"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9)._RESULT);
                        ;
                        // JavaLine 153 <== SourceLine 383
                        if(_VALUE((p_type==(((char)7))))) {
                            // JavaLine 155 <== SourceLine 384
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),384,new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u005f"))._RESULT,CONC(new RTS_TXT("C-RECORD "),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u005f"))._RESULT));
                        } else {
                            // JavaLine 158 <== SourceLine 385
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),385,new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u005d"))._RESULT,CONC(new RTS_TXT("C-RECORD "),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u005d"))._RESULT));
                        }
                        ;
                        // JavaLine 162 <== SourceLine 386
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),386,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001N"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ")),RTS_ENVIRONMENT.edit(p_code)));
                        ;
                        // JavaLine 165 <== SourceLine 387
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(53);
                        ;
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                        ;
                        // JavaLine 170 <== SourceLine 388
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext((((p_type==(((char)7))))?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001\u005f"),new RTS_TXT("\n")),new RTS_TXT("\u0001\u005f")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r"))):(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001\u005d"),new RTS_TXT("\n")),new RTS_TXT("\u0001\u005d")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001N")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")))));
                        ;
                        // JavaLine 173 <== SourceLine 395
                        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),p_code);
                        ;
                        // JavaLine 176 <== SourceLine 397
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),397,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001O"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_kind))));
                        ;
                        // JavaLine 179 <== SourceLine 398
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001O")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 182 <== SourceLine 400
                        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),RTS_ENVIRONMENT.rank(p_kind));
                        ;
                        // JavaLine 185 <== SourceLine 402
                        if(_VALUE((p_type==(((char)7))))) {
                            {
                                // JavaLine 188 <== SourceLine 403
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),403,new RTS_TXT("   ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT,new RTS_TXT(" T\u005fINT C-INT 7")));
                                ;
                                // JavaLine 191 <== SourceLine 404
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),404,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001R"))._RESULT,new RTS_TXT(" T\u005fOADDR C-OADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT));
                                ;
                                // JavaLine 194 <== SourceLine 405
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),405,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u0060"))._RESULT,new RTS_TXT(" T\u005fPADDR C-PADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),p_pad)._RESULT));
                                ;
                            }
                        } else {
                            // JavaLine 199 <== SourceLine 406
                            {
                                // JavaLine 201 <== SourceLine 407
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),407,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT,new RTS_TXT(" T\u005fINT C-INT ")),RTS_ENVIRONMENT.edit((((p_type>(((char)10))))?(0):(RTS_ENVIRONMENT.rank(p_type))))));
                                ;
                                // JavaLine 204 <== SourceLine 408
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),408,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001\u0060"))._RESULT,new RTS_TXT(" T\u005fPADDR C-PADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),p_pad)._RESULT));
                                ;
                            }
                        }
                        ;
                        // JavaLine 210 <== SourceLine 410
                        if(_VALUE((p_type==(((char)7))))) {
                            {
                                // JavaLine 213 <== SourceLine 411
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00017")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001R")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
                                ;
                                // JavaLine 216 <== SourceLine 415
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                                ;
                                // JavaLine 219 <== SourceLine 416
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0060")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                                ;
                            }
                        } else {
                            // JavaLine 224 <== SourceLine 419
                            {
                                // JavaLine 226 <== SourceLine 420
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001P")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                                ;
                                // JavaLine 229 <== SourceLine 422
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte((((p_type>(((char)10))))?(48):((RTS_ENVIRONMENT.rank(p_type)+(48)))));
                                ;
                                // JavaLine 232 <== SourceLine 423
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u005e")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                                ;
                            }
                        }
                        ;
                        // JavaLine 238 <== SourceLine 426
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),p_pad);
                        ;
                    }
                } else {
                    ;
                }
            }
        }
        // JavaLine 247 <== SourceLine 430
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),430,new RTS_TXT("ENDRECORD"));
        ;
        // JavaLine 250 <== SourceLine 431
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(9);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 constPARDES",1,326,51,331,56,333,58,334,60,335,64,337,66,338,68,339,71,340,73,341,76,342,80,343,83,344,88,345,91,352,94,354,97,355,100,357,103,359,106,360,109,361,114,362,116,363,122,365,125,366,128,370,133,372,135,373,138,375,146,380,148,381,150,382,153,383,155,384,158,385,162,386,165,387,170,388,173,395,176,397,179,398,182,400,185,402,188,403,191,404,194,405,199,406,201,407,204,408,210,410,213,411,216,415,219,416,224,419,226,420,229,422,232,423,238,426,247,430,250,431,255,433);
} // End of Procedure
