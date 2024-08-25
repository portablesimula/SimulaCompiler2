// JavaLine 1 <== SourceLine 2166
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_parameter extends CHECKER1_semchecker1_argument {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=2166, lastLine=2523, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public COMMON_quantity p1_formal;
    // Declare local labels
    // JavaLine 11 <== SourceLine 2450
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_parameter_Block2338_Block2417_Block2438_Block2439_ERRchk_0=new RTS_LABEL(this,1,1,"ERRchk"); // Local Label #1=ERRchk At PrefixLevel 1
    // JavaLine 13 <== SourceLine 2509
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_parameter_Block2338_Block2498_Block2499_Block2509_ER4_0=new RTS_LABEL(this,1,2,"ER4"); // Local Label #2=ER4 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 2523
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_parameter_parameterexit_1=new RTS_LABEL(this,1,3,"parameterexit"); // Local Label #3=parameterexit At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 2167
    public boolean implqua_1=false;
    // JavaLine 20 <== SourceLine 2168
    public char clf_1=0;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_parameter_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_parameter_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_parameter(RTS_RTObject staticLink,int sp_argno,CHECKER1_semchecker1_exp sp_actual,COMMON_quantity sp1_formal) {
        super(staticLink,sp_argno,sp_actual);
        // Parameter assignment to locals
        this.p1_formal = sp1_formal;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_parameter _STM() {
        CHECKER1_semchecker1_parameter _THIS=(CHECKER1_semchecker1_parameter)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 38 <== SourceLine 2130
                // BEGIN INNER PART
                // JavaLine 40 <== SourceLine 2293
                if(_VALUE((((CHECKER1)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                    {
                        // JavaLine 43 <== SourceLine 2294
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("begin parameter-checking: "));
                        ;
                        // JavaLine 48 <== SourceLine 2295
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("formal:"));
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 55 <== SourceLine 2296
                        if(_VALUE((p1_formal!=(null)))) {
                            new COMMON_quantity_dump(p1_formal);
                        } else {
                            RTS_BASICIO.sysout().outtext(new RTS_TXT("none"));
                        }
                        ;
                        // JavaLine 62 <== SourceLine 2297
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("actual:"));
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        p_actual.dump_0().CPF();
                        ;
                        // JavaLine 71 <== SourceLine 2298
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("stack picture"));
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 78 <== SourceLine 2299
                        for(boolean CB_2299:new FOR_List(
                        new FOR_SingleElt<CHECKER1_semchecker1_exp>(new RTS_NAME<CHECKER1_semchecker1_exp>(){ public CHECKER1_semchecker1_exp put(CHECKER1_semchecker1_exp x_){((CHECKER1_semchecker1)(_CUR._SL)).expv_2=x_; return(x_);};  public CHECKER1_semchecker1_exp get(){return((CHECKER1_semchecker1_exp)((CHECKER1_semchecker1)(_CUR._SL)).expv_2); }	},new RTS_NAME<CHECKER1_semchecker1_exp>() { public CHECKER1_semchecker1_exp get(){return(((CHECKER1_semchecker1)(_CUR._SL)).exptop_2); }})
                       ,new FOR_WhileElt<CHECKER1_semchecker1_exp>(new RTS_NAME<CHECKER1_semchecker1_exp>(){ public CHECKER1_semchecker1_exp put(CHECKER1_semchecker1_exp x_){((CHECKER1_semchecker1)(_CUR._SL)).expv_2=x_; return(x_);};  public CHECKER1_semchecker1_exp get(){return((CHECKER1_semchecker1_exp)((CHECKER1_semchecker1)(_CUR._SL)).expv_2); }	},new RTS_NAME<CHECKER1_semchecker1_exp>() { public CHECKER1_semchecker1_exp get(){return(((CHECKER1_semchecker1)(_CUR._SL)).expv_2.p_pred); }},new RTS_NAME<Boolean>() { public Boolean get(){return((((CHECKER1_semchecker1)(_CUR._SL)).expv_2!=(null))); }})
                           )) { if(!CB_2299) continue;
                            // JavaLine 83 <== SourceLine 2300
                            ((CHECKER1_semchecker1)(_CUR._SL)).expv_2.dump_0().CPF();
                        }
                        ;
                    }
                }
                ;
                // JavaLine 90 <== SourceLine 2305
                if(_VALUE((p1_formal==(null)))) {
                    {
                        // JavaLine 93 <== SourceLine 2306
                        if(_VALUE((p_actual.ctype==('Z')))) {
                            {
                                // JavaLine 96 <== SourceLine 2307
                                ((CHECKER1_semchecker1)(_CUR._SL)).cquant_2=p_actual.meaning;
                                ;
                                // JavaLine 99 <== SourceLine 2308
                                if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).cquant_2.kind_1==(((char)5))))) {
                                    {
                                        // JavaLine 102 <== SourceLine 2309
                                        new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p_actual)));
                                        ;
                                        // JavaLine 105 <== SourceLine 2310
                                        p_actual.cl=((char)1);
                                        ;
                                    }
                                } else {
                                    // JavaLine 110 <== SourceLine 2311
                                    if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).cquant_2.kind_1==(((char)1))))) {
                                        {
                                            // JavaLine 113 <== SourceLine 2313
                                            if(_VALUE((_IS(((CHECKER1_semchecker1)(_CUR._SL)).cquant_2,COMMON_extquantity.class)&&((((COMMON_extquantity)(((CHECKER1_semchecker1)(_CUR._SL)).cquant_2)).clf_2>(((char)1))))))) {
                                                // JavaLine 115 <== SourceLine 2315
                                                {
                                                    // JavaLine 117 <== SourceLine 2317
                                                    if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).cquant_2.type_1!=(((char)14)))&&((((CHECKER1_semchecker1)(_CUR._SL)).cquant_2.descr_1.npar==(0)))))) {
                                                        // JavaLine 119 <== SourceLine 2319
                                                        {
                                                            // JavaLine 121 <== SourceLine 2320
                                                            if(_VALUE(((CHECKER1)(_CUR._SL._SL)).GiveNotes)) {
                                                                new ERRMSG_note0((_CUR._SL._SL),294);
                                                            }
                                                            ;
                                                            // JavaLine 126 <== SourceLine 2321
                                                            p_actual.cl=((char)1);
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 131 <== SourceLine 2322
                                                        new CHECKER1_semchecker1_argument_errARG((_CUR),420);
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 137 <== SourceLine 2323
                                                p_actual.cl=((char)5);
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 143 <== SourceLine 2325
                                        p_actual.cl=((char)5);
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 150 <== SourceLine 2327
                            if(_VALUE((p_actual.ctype==(((char)129))))) {
                                {
                                    // JavaLine 153 <== SourceLine 2328
                                    p_actual.cl=(((((((CHECKER1_semchecker1_argumented)(p_actual)).p1_ident.kind==(((char)2)))||((((CHECKER1_semchecker1_argumented)(p_actual)).p1_ident.kind==(((char)6)))))||((((CHECKER1_semchecker1_argumented)(p_actual)).p1_ident.kind==(((char)4))))))?(((char)5)):(((char)1)));
                                    ;
                                }
                            } else {
                                // JavaLine 158 <== SourceLine 2334
                                p_actual.cl=((char)1);
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 165 <== SourceLine 2336
                    {
                        // JavaLine 167 <== SourceLine 2338
                        ((CHECKER1_semchecker1)(_CUR._SL)).ftype_2=p1_formal.type_1;
                        ;
                        ((CHECKER1_semchecker1)(_CUR._SL)).fkind_2=p1_formal.kind_1;
                        ;
                        // JavaLine 172 <== SourceLine 2340
                        clf_1=((_IS(p1_formal,COMMON_extquantity.class))?(((COMMON_extquantity)(p1_formal)).clf_2):(((char)3)));
                        ;
                        // JavaLine 175 <== SourceLine 2343
                        if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).fkind_2==(((char)10)))|((p_actual.type==(((char)15))))))) {
                            ;
                        } else {
                            // JavaLine 179 <== SourceLine 2344
                            {
                                // JavaLine 181 <== SourceLine 2345
                                if(_VALUE((p_actual.ctype==('Z')))) {
                                    {
                                        // JavaLine 184 <== SourceLine 2346
                                        ((CHECKER1_semchecker1)(_CUR._SL)).cquant_2=p_actual.meaning;
                                        ;
                                        // JavaLine 187 <== SourceLine 2347
                                        ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((CHECKER1_semchecker1)(_CUR._SL)).cquant_2.kind_1;
                                        ;
                                        // JavaLine 190 <== SourceLine 2348
                                        if(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2<((char)0) || ((CHECKER1_semchecker1)(_CUR._SL)).fkind_2>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                        switch(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2) { // BEGIN SWITCH STATEMENT
                                            case 0: 
                                            case 3: 
                                            // JavaLine 195 <== SourceLine 2349
                                            {
                                                // JavaLine 197 <== SourceLine 2350
                                                if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)0)))||((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)3))))))) {
                                                    // JavaLine 199 <== SourceLine 2352
                                                    p_actual.cl=(((p1_formal.categ_1==(((char)2))))?(((char)5)):(((char)1)));
                                                } else {
                                                    // JavaLine 202 <== SourceLine 2354
                                                    {
                                                        // JavaLine 204 <== SourceLine 2355
                                                        new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p_actual)));
                                                        ;
                                                        // JavaLine 207 <== SourceLine 2356
                                                        if(_VALUE((((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)1)))&&((p_actual.type!=(((char)14)))))||((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)5))))))) {
                                                            // JavaLine 209 <== SourceLine 2359
                                                            {
                                                                // JavaLine 211 <== SourceLine 2360
                                                                ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                                                ;
                                                                p_actual.cl=((char)1);
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                            break;
                                            case 1: 
                                            // JavaLine 225 <== SourceLine 2364
                                            {
                                                // JavaLine 227 <== SourceLine 2365
                                                if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2)))) {
                                                    {
                                                        // JavaLine 230 <== SourceLine 2367
                                                        if(_VALUE((_IS(((CHECKER1_semchecker1)(_CUR._SL)).cquant_2,COMMON_extquantity.class)&&((((COMMON_extquantity)(((CHECKER1_semchecker1)(_CUR._SL)).cquant_2)).clf_2>(((char)1))))))) {
                                                            // JavaLine 232 <== SourceLine 2369
                                                            new CHECKER1_semchecker1_argument_errARG((_CUR),420);
                                                        } else {
                                                            // JavaLine 235 <== SourceLine 2370
                                                            p_actual.cl=((char)5);
                                                        }
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                            break;
                                            case 2: 
                                            case 6: 
                                            case 4: 
                                            // JavaLine 247 <== SourceLine 2373
                                            {
                                                // JavaLine 249 <== SourceLine 2374
                                                if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2)))) {
                                                    p_actual.cl=((char)5);
                                                }
                                                ;
                                            }
                                            break;
                                            default:
                                            // JavaLine 257 <== SourceLine 2376
                                            p_actual.cl=((char)1);
                                            break;
                                        } // END SWITCH STATEMENT
                                        ;
                                    }
                                } else {
                                    // JavaLine 264 <== SourceLine 2379
                                    if(_VALUE((p_actual.ctype==(((char)129))))) {
                                        {
                                            // JavaLine 267 <== SourceLine 2380
                                            ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((CHECKER1_semchecker1_argumented)(p_actual)).p1_ident.kind;
                                            ;
                                            // JavaLine 270 <== SourceLine 2382
                                            p_actual.cl=((char)1);
                                            ;
                                            // JavaLine 273 <== SourceLine 2383
                                            if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).fkind_2==(((char)0))))) {
                                                {
                                                    // JavaLine 276 <== SourceLine 2384
                                                    if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)1)))||((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)5))))))) {
                                                        // JavaLine 278 <== SourceLine 2386
                                                        ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                                    } else {
                                                        // JavaLine 281 <== SourceLine 2388
                                                        if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)2)))|((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)6))))))) {
                                                            // JavaLine 283 <== SourceLine 2390
                                                            {
                                                                // JavaLine 285 <== SourceLine 2391
                                                                p_actual.cl=(((p1_formal.categ_1==(((char)2))))?(((char)5)):(((char)1)));
                                                                ;
                                                                // JavaLine 288 <== SourceLine 2393
                                                                ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 297 <== SourceLine 2396
                                                if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).fkind_2==(((char)3))))) {
                                                    {
                                                        // JavaLine 300 <== SourceLine 2397
                                                        if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)4))))) {
                                                            {
                                                                // JavaLine 303 <== SourceLine 2398
                                                                p_actual.cl=(((p1_formal.categ_1==(((char)2))))?(((char)5)):(((char)1)));
                                                                ;
                                                                // JavaLine 306 <== SourceLine 2400
                                                                ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)3);
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 314 <== SourceLine 2403
                                                    if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2!=(((char)10))))) {
                                                        ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                                    }
                                                }
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 323 <== SourceLine 2405
                                        if(_VALUE((p_actual.p_ch==('[')))) {
                                            ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                        } else {
                                            // JavaLine 327 <== SourceLine 2408
                                            if(_VALUE(p_actual instanceof CHECKER1_semchecker1_operation)) {
                                                // JavaLine 329 <== SourceLine 2409
                                                ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=(((p_actual.type==(((char)11))))?(((char)3)):(((char)0)));
                                            } else {
                                                // JavaLine 332 <== SourceLine 2412
                                                if(_VALUE((p_actual.p_ch==('T')))) {
                                                    // JavaLine 334 <== SourceLine 2413
                                                    ((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2=((char)0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 344 <== SourceLine 2416
                        if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).fkind_2==(((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2)))) {
                            {
                                // JavaLine 347 <== SourceLine 2417
                                if(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2<((char)0) || ((CHECKER1_semchecker1)(_CUR._SL)).fkind_2>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CHECKER1_semchecker1)(_CUR._SL)).fkind_2) { // BEGIN SWITCH STATEMENT
                                    case 10: 
                                    ;
                                    break;
                                    case 2: 
                                    // JavaLine 354 <== SourceLine 2419
                                    {
                                        // JavaLine 356 <== SourceLine 2420
                                        if(_VALUE((!((p_actual.ctype==('Z')))))) {
                                            // JavaLine 358 <== SourceLine 2421
                                            new ERRMSG_internerr((_CUR._SL._SL),((char)8),2421);
                                        }
                                        ;
                                        // JavaLine 362 <== SourceLine 2422
                                        if(_VALUE((((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2!=(p_actual.type))||(((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2==(((char)7)))&&((p_actual.meaning.prefqual_1!=(p1_formal.prefqual_1))))))&&((clf_1!=(((char)17))))))) {
                                            // JavaLine 364 <== SourceLine 2427
                                            new CHECKER1_semchecker1_argument_errARG((_CUR),422);
                                        }
                                        ;
                                    }
                                    break;
                                    case 1: 
                                    // JavaLine 371 <== SourceLine 2430
                                    if(_VALUE((p1_formal.categ_1==(((char)0))))) {
                                        {
                                            // JavaLine 374 <== SourceLine 2431
                                            if(_VALUE((!((p_actual.ctype==('Z')))))) {
                                                // JavaLine 376 <== SourceLine 2432
                                                new ERRMSG_internerr((_CUR._SL._SL),((char)8),2432);
                                            }
                                            ;
                                            // JavaLine 380 <== SourceLine 2433
                                            if(_VALUE((!(new BUILDER1_precheck0_subordinate((_CUR._SL),p_actual.meaning,p1_formal)._RESULT)))) {
                                                // JavaLine 382 <== SourceLine 2435
                                                new CHECKER1_semchecker1_argument_errARG((_CUR),423);
                                            }
                                            ;
                                        }
                                    }
                                    break;
                                    default:
                                    // JavaLine 390 <== SourceLine 2437
                                    {
                                        // JavaLine 392 <== SourceLine 2438
                                        if(_VALUE((p_actual.type!=(((CHECKER1_semchecker1)(_CUR._SL)).ftype_2)))) {
                                            {
                                                // JavaLine 395 <== SourceLine 2439
                                                if(p_actual.type<((char)0) || p_actual.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                switch(p_actual.type) { // BEGIN SWITCH STATEMENT
                                                    case 2: 
                                                    case 3: 
                                                    case 4: 
                                                    case 5: 
                                                    case 6: 
                                                    // JavaLine 403 <== SourceLine 2442
                                                    if(((CHECKER1_semchecker1)(_CUR._SL)).ftype_2<((char)0) || ((CHECKER1_semchecker1)(_CUR._SL)).ftype_2>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                    switch(((CHECKER1_semchecker1)(_CUR._SL)).ftype_2) { // BEGIN SWITCH STATEMENT
                                                        case 2: 
                                                        case 3: 
                                                        case 4: 
                                                        case 5: 
                                                        case 6: 
                                                        ;
                                                        break;
                                                        default:
                                                        // JavaLine 414 <== SourceLine 2445
                                                        _GOTO(_LABEL_CHECKER1_semchecker1_parameter_Block2338_Block2417_Block2438_Block2439_ERRchk_0); // GOTO EVALUATED LABEL
                                                        break;
                                                    } // END SWITCH STATEMENT
                                                    break;
                                                    case 14: 
                                                    // JavaLine 420 <== SourceLine 2447
                                                    new CHECKER1_semchecker1_argument_errARG((_CUR),424);
                                                    break;
                                                    case 1: 
                                                    case 7: 
                                                    case 8: 
                                                    // JavaLine 426 <== SourceLine 2450
                                                    {
                                                        _SIM_LABEL(1); // DeclaredIn: parameter -> parameter[CHECKER1_semchecker1_parameter] DeclarationKind=Class
                                                        if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2==(((char)15))))) {
                                                            ;
                                                        } else {
                                                            // JavaLine 432 <== SourceLine 2451
                                                            if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2==(((char)14))))) {
                                                                new CHECKER1_semchecker1_argument_errARG((_CUR),425);
                                                            } else {
                                                                // JavaLine 436 <== SourceLine 2452
                                                                if(_VALUE(((clf_1!=(((char)16)))&&((clf_1!=(((char)18))))))) {
                                                                    // JavaLine 438 <== SourceLine 2453
                                                                    new CHECKER1_semchecker1_argument_errARG((_CUR),426);
                                                                } else {
                                                                    // JavaLine 441 <== SourceLine 2455
                                                                    if(_VALUE((((COMMON_extquantity)(p1_formal.encl_1.declquant)).longindic_2==(((char)0))))) {
                                                                        // JavaLine 443 <== SourceLine 2457
                                                                        new CHECKER1_semchecker1_argument_errARG((_CUR),426);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } // END SWITCH STATEMENT
                                            }
                                        } else {
                                            // JavaLine 454 <== SourceLine 2460
                                            if(_VALUE(((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2==(((char)7)))||((((CHECKER1_semchecker1)(_CUR._SL)).ftype_2==(((char)9))))))) {
                                                // JavaLine 456 <== SourceLine 2462
                                                new CHECKER1_semchecker1_parameter_Block2338_Block2417_Block2438_Block2463((_CUR))._STM();
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                            }
                        } else {
                            // JavaLine 467 <== SourceLine 2490
                            if(_VALUE((((((CHECKER1_semchecker1)(_CUR._SL)).actualkind_2==(((char)10)))|((p_actual.type==(((char)15)))))|((((CHECKER1_semchecker1)(_CUR._SL)).fkind_2==(((char)10))))))) {
                                ;
                            } else {
                                // JavaLine 471 <== SourceLine 2492
                                new CHECKER1_semchecker1_argument_errARG((_CUR),421);
                            }
                        }
                        ;
                        // JavaLine 476 <== SourceLine 2497
                        if(_VALUE((clf_1==(((char)2))))) {
                            {
                                // JavaLine 479 <== SourceLine 2498
                                if(_VALUE((p1_formal.categ_1==(((char)2))))) {
                                    {
                                        // JavaLine 482 <== SourceLine 2499
                                        if(_VALUE((p_actual.ctype==('Z')))) {
                                            ;
                                        } else {
                                            // JavaLine 486 <== SourceLine 2500
                                            if(_VALUE((p_actual.ctype==(((char)129))))) {
                                                {
                                                    // JavaLine 489 <== SourceLine 2501
                                                    if(_VALUE((((CHECKER1_semchecker1_argumented)(p_actual)).p1_ident.meaning.kind_1==(((char)2))))) {
                                                        ;
                                                    } else {
                                                        // JavaLine 493 <== SourceLine 2502
                                                        _GOTO(_LABEL_CHECKER1_semchecker1_parameter_Block2338_Block2498_Block2499_Block2509_ER4_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            } else {
                                                // JavaLine 498 <== SourceLine 2503
                                                if(_VALUE((p_actual.p_ch==('[')))) {
                                                    {
                                                        // JavaLine 501 <== SourceLine 2504
                                                        if(_VALUE((p_actual.type==(((char)8))))) {
                                                            new CHECKER1_semchecker1_argument_errARG((_CUR),-245);
                                                        } else {
                                                            // JavaLine 505 <== SourceLine 2506
                                                            if(_VALUE((p_actual.type!=(((char)7))))) {
                                                                _GOTO(_LABEL_CHECKER1_semchecker1_parameter_Block2338_Block2498_Block2499_Block2509_ER4_0); // GOTO EVALUATED LABEL
                                                            }
                                                        }
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 513 <== SourceLine 2508
                                                    {
                                                        // JavaLine 515 <== SourceLine 2509
                                                        {
                                                            _SIM_LABEL(2); // DeclaredIn: parameter -> parameter[CHECKER1_semchecker1_parameter] DeclarationKind=Class
                                                            new ERRMSG_error0((_CUR._SL._SL),(((p_actual.p_ch==('[')))?(178):(179)));
                                                        }
                                                        ;
                                                        // JavaLine 521 <== SourceLine 2510
                                                        new BUILDER1_StopScode((_CUR._SL._SL));
                                                        ;
                                                    }
                                                }
                                            }
                                        }
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
                // JavaLine 538 <== SourceLine 2515
                if(_VALUE((((CHECKER1)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                    {
                        // JavaLine 541 <== SourceLine 2516
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("end parameter-checking"));
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 546 <== SourceLine 2517
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("stack picture"));
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 551 <== SourceLine 2518
                        for(boolean CB_2518:new FOR_List(
                        new FOR_SingleElt<CHECKER1_semchecker1_exp>(new RTS_NAME<CHECKER1_semchecker1_exp>(){ public CHECKER1_semchecker1_exp put(CHECKER1_semchecker1_exp x_){((CHECKER1_semchecker1)(_CUR._SL)).expv_2=x_; return(x_);};  public CHECKER1_semchecker1_exp get(){return((CHECKER1_semchecker1_exp)((CHECKER1_semchecker1)(_CUR._SL)).expv_2); }	},new RTS_NAME<CHECKER1_semchecker1_exp>() { public CHECKER1_semchecker1_exp get(){return(((CHECKER1_semchecker1)(_CUR._SL)).exptop_2); }})
                       ,new FOR_WhileElt<CHECKER1_semchecker1_exp>(new RTS_NAME<CHECKER1_semchecker1_exp>(){ public CHECKER1_semchecker1_exp put(CHECKER1_semchecker1_exp x_){((CHECKER1_semchecker1)(_CUR._SL)).expv_2=x_; return(x_);};  public CHECKER1_semchecker1_exp get(){return((CHECKER1_semchecker1_exp)((CHECKER1_semchecker1)(_CUR._SL)).expv_2); }	},new RTS_NAME<CHECKER1_semchecker1_exp>() { public CHECKER1_semchecker1_exp get(){return(((CHECKER1_semchecker1)(_CUR._SL)).expv_2.p_pred); }},new RTS_NAME<Boolean>() { public Boolean get(){return((((CHECKER1_semchecker1)(_CUR._SL)).expv_2!=(null))); }})
                           )) { if(!CB_2518) continue;
                            // JavaLine 556 <== SourceLine 2519
                            ((CHECKER1_semchecker1)(_CUR._SL)).expv_2.dump_0().CPF();
                        }
                        ;
                    }
                }
                ;
                // JavaLine 563 <== SourceLine 2522
                {
                    _SIM_LABEL(3); // DeclaredIn: parameter
                    ;
                }
                // JavaLine 568 <== SourceLine 2523
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 parameter",1,2166,11,2450,13,2509,15,2523,18,2167,20,2168,38,2130,40,2293,43,2294,48,2295,55,2296,62,2297,71,2298,78,2299,83,2300,90,2305,93,2306,96,2307,99,2308,102,2309,105,2310,110,2311,113,2313,115,2315,117,2317,119,2319,121,2320,126,2321,131,2322,137,2323,143,2325,150,2327,153,2328,158,2334,165,2336,167,2338,172,2340,175,2343,179,2344,181,2345,184,2346,187,2347,190,2348,195,2349,197,2350,199,2352,202,2354,204,2355,207,2356,209,2359,211,2360,225,2364,227,2365,230,2367,232,2369,235,2370,247,2373,249,2374,257,2376,264,2379,267,2380,270,2382,273,2383,276,2384,278,2386,281,2388,283,2390,285,2391,288,2393,297,2396,300,2397,303,2398,306,2400,314,2403,323,2405,327,2408,329,2409,332,2412,334,2413,344,2416,347,2417,354,2419,356,2420,358,2421,362,2422,364,2427,371,2430,374,2431,376,2432,380,2433,382,2435,390,2437,392,2438,395,2439,403,2442,414,2445,420,2447,426,2450,432,2451,436,2452,438,2453,441,2455,443,2457,454,2460,456,2462,467,2490,471,2492,476,2497,479,2498,482,2499,486,2500,489,2501,493,2502,498,2503,501,2504,505,2506,513,2508,515,2509,521,2510,538,2515,541,2516,546,2517,551,2518,556,2519,563,2522,568,2523,581,2523);
} // End of Class
