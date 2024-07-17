// JavaLine 1 <== SourceLine 321
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_expandexternals extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=321, lastLine=511, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_brecord p_b;
    // Declare local labels
    // JavaLine 11 <== SourceLine 338
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_restartloop_0=new RTS_LABEL(this,0,1,"restartloop"); // Local Label #1=restartloop At PrefixLevel 0
    // JavaLine 13 <== SourceLine 382
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_nextplev_0=new RTS_LABEL(this,0,2,"nextplev"); // Local Label #2=nextplev At PrefixLevel 0
    // JavaLine 15 <== SourceLine 400
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_found_0=new RTS_LABEL(this,0,3,"found"); // Local Label #3=found At PrefixLevel 0
    // JavaLine 17 <== SourceLine 443
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_addnewnature_0=new RTS_LABEL(this,0,4,"addnewnature"); // Local Label #4=addnewnature At PrefixLevel 0
    // JavaLine 19 <== SourceLine 461
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_newhead_0=new RTS_LABEL(this,0,5,"newhead"); // Local Label #5=newhead At PrefixLevel 0
    // JavaLine 21 <== SourceLine 464
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_littned_0=new RTS_LABEL(this,0,6,"littned"); // Local Label #6=littned At PrefixLevel 0
    // JavaLine 23 <== SourceLine 467
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_nonew_0=new RTS_LABEL(this,0,7,"nonew"); // Local Label #7=nonew At PrefixLevel 0
    // JavaLine 25 <== SourceLine 497
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandexternals_Block339_nextq_0=new RTS_LABEL(this,0,8,"nextq"); // Local Label #8=nextq At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 28 <== SourceLine 323
    public COMMON_extbrecord eb=null;
    public COMMON_quantity q=null;
    public COMMON_quantity qe=null;
    public COMMON_quantity qx=null;
    public COMMON_quantity qq=null;
    // JavaLine 34 <== SourceLine 324
    public BUILDER1_extmodule currentextmodule=null;
    // JavaLine 36 <== SourceLine 325
    public RTS_TXT t=null;
    // JavaLine 38 <== SourceLine 326
    public boolean markermade=false;
    // JavaLine 40 <== SourceLine 327
    public boolean generate=false;
    // JavaLine 42 <== SourceLine 347
    public BUILDER1_extmodule _inspect_347_4536=null;
    // JavaLine 44 <== SourceLine 431
    public COMMON_extbrecord _inspect_431_4537=null;
    // JavaLine 46 <== SourceLine 447
    public COMMON_brecord _inspect_447_4538=null;
    // JavaLine 48 <== SourceLine 488
    public RTS_Printfile _inspect_488_4539=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_expandexternals setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_b=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_expandexternals(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_expandexternals(RTS_RTObject _SL,COMMON_brecord sp_b) {
        super(_SL);
        // Parameter assignment to locals
        this.p_b = sp_b;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_expandexternals _STM() {
        BUILDER2_normalattrfile_expandexternals _THIS=(BUILDER2_normalattrfile_expandexternals)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,8); // For ByteCode Engineering
                // JavaLine 82 <== SourceLine 329
                q=p_b.fpar;
                ;
                // JavaLine 85 <== SourceLine 331
                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),331,new RTS_TXT("BEGIN expandexternals DUMPS ******************************????????????????"));
                ;
                // JavaLine 88 <== SourceLine 333
                new COMMON_brecord_blockDump(p_b,CONC(CONC(new RTS_TXT("BUILDER2.LINE "),RTS_ENVIRONMENT.edit(333)),new RTS_TXT(": ")));
                ;
                // JavaLine 91 <== SourceLine 334
                if(_VALUE((q!=(null)))) {
                    new COMMON_quantity_quantDump(q,CONC(CONC(new RTS_TXT("BUILDER2.LINE "),RTS_ENVIRONMENT.edit(334)),new RTS_TXT(": ")));
                }
                ;
                // JavaLine 96 <== SourceLine 335
                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),335,new RTS_TXT("ENDOF expandexternals DUMPS ******************************????????????????"));
                ;
                // JavaLine 99 <== SourceLine 337
                {
                    _SIM_LABEL(1); // DeclaredIn: expandexternals
                    // JavaLine 102 <== SourceLine 338
                    while((q!=(null))) {
                        {
                            // JavaLine 105 <== SourceLine 339
                            new COMMON_quantity_quantDump(q,CONC(CONC(new RTS_TXT("BUILDER2.LINE "),RTS_ENVIRONMENT.edit(339)),new RTS_TXT(": ")));
                            ;
                            // JavaLine 108 <== SourceLine 340
                            if(_VALUE(_IS(q.descr_1,COMMON_extbrecord.class))) {
                                {
                                    // JavaLine 111 <== SourceLine 341
                                    eb=((COMMON_extbrecord)(q.descr_1));
                                    ;
                                    // JavaLine 114 <== SourceLine 342
                                    new COMMON_brecord_blockDump(eb,CONC(CONC(new RTS_TXT("BUILDER2.LINE "),RTS_ENVIRONMENT.edit(342)),new RTS_TXT(": ")));
                                    ;
                                    // JavaLine 117 <== SourceLine 343
                                    if(_VALUE((eb.status_1!=('M')))) {
                                        {
                                            // JavaLine 120 <== SourceLine 345
                                            new COMMON_attrfile_openattributefile((_CUR._SL),q);
                                            ;
                                            // JavaLine 123 <== SourceLine 346
                                            new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),346,new RTS_TXT("OPEN AttributeFile: "),q);
                                            ;
                                            // JavaLine 126 <== SourceLine 347
                                            if(_VALUE((!(((BUILDER2_normalattrfile)(_CUR._SL)).sysattrfile)))) {
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_347_4536=new BUILDER1_extmodule((_CUR._SL._SL))._STM();
                                                    if(_inspect_347_4536!=null) { // INSPECT _inspect_347_4536
                                                        // JavaLine 132 <== SourceLine 348
                                                        {
                                                            // JavaLine 134 <== SourceLine 347
                                                            {
                                                                // JavaLine 136 <== SourceLine 348
                                                                if(_VALUE((((BUILDER2)(_CUR._SL._SL)).firstextmodule_6==(null)))) {
                                                                    // JavaLine 138 <== SourceLine 349
                                                                    currentextmodule=((BUILDER2)(_CUR._SL._SL)).firstextmodule_6=((BUILDER1_extmodule)_inspect_347_4536);
                                                                } else {
                                                                    // JavaLine 141 <== SourceLine 351
                                                                    {
                                                                        currentextmodule=((BUILDER2)(_CUR._SL._SL)).firstextmodule_6;
                                                                        ;
                                                                        // JavaLine 145 <== SourceLine 352
                                                                        while((currentextmodule.next!=(null))) {
                                                                            // JavaLine 147 <== SourceLine 353
                                                                            currentextmodule=currentextmodule.next;
                                                                        }
                                                                        ;
                                                                        // JavaLine 151 <== SourceLine 354
                                                                        currentextmodule.next=((BUILDER1_extmodule)_inspect_347_4536);
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 157 <== SourceLine 356
                                                                ((BUILDER2)(_CUR._SL._SL)).noofextmodules_6=(((BUILDER2)(_CUR._SL._SL)).noofextmodules_6+(1));
                                                                ;
                                                                // JavaLine 160 <== SourceLine 357
                                                                _inspect_347_4536.qty=q;
                                                                ;
                                                                _inspect_347_4536.checkhi=((BUILDER2_normalattrfile)(_CUR._SL)).attrckhi;
                                                                ;
                                                                _inspect_347_4536.checklo=((BUILDER2_normalattrfile)(_CUR._SL)).attrcklo;
                                                                ;
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                            }
                                            ;
                                            // JavaLine 173 <== SourceLine 360
                                            if(_VALUE((eb.status_1==('S')))) {
                                                {
                                                    // JavaLine 176 <== SourceLine 361
                                                    if(_VALUE((eb.checkhi_1==(((char)0))))) {
                                                        {
                                                            // JavaLine 179 <== SourceLine 362
                                                            eb.checkhi_1=((BUILDER2_normalattrfile)(_CUR._SL)).attrckhi;
                                                            ;
                                                            eb.checklo_1=((BUILDER2_normalattrfile)(_CUR._SL)).attrcklo;
                                                        }
                                                    } else {
                                                        // JavaLine 185 <== SourceLine 363
                                                        if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).attrcklo!=(eb.checklo_1))||((((BUILDER2_normalattrfile)(_CUR._SL)).attrckhi!=(eb.checkhi_1)))))) {
                                                            // JavaLine 187 <== SourceLine 364
                                                            {
                                                                ((BUILDER2)(_CUR._SL._SL)).messageLinenr=q.line_1;
                                                                ;
                                                                // JavaLine 191 <== SourceLine 365
                                                                new ERRMSG_error2quants((_CUR._SL._SL),406,q,eb.cause_1);
                                                            }
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 199 <== SourceLine 367
                                                if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).attrcklo!=(eb.checklo_1))||((((BUILDER2_normalattrfile)(_CUR._SL)).attrckhi!=(eb.checkhi_1)))))) {
                                                    // JavaLine 201 <== SourceLine 368
                                                    new ERRMSG_errQTN((_CUR._SL._SL),q,416,eb.cause_1);
                                                }
                                            }
                                            ;
                                            // JavaLine 206 <== SourceLine 371
                                            new COMMON_attrfile_nextKey((_CUR._SL));
                                            ;
                                            // JavaLine 209 <== SourceLine 372
                                            if(_VALUE((1>(2)))) {
                                                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),372,CONC(CONC(CONC(new RTS_TXT("TREAT EXTERNAL HEAD key="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).key))),new RTS_TXT(" ")),RTS_ENVIRONMENT.edit(((BUILDER2_normalattrfile)(_CUR._SL)).key)));
                                            }
                                            ;
                                            // JavaLine 214 <== SourceLine 374
                                            while((((BUILDER2_normalattrfile)(_CUR._SL)).key<(((char)240)))) {
                                                {
                                                    // JavaLine 217 <== SourceLine 375
                                                    generate=new COMMON_attrfile_fetchquant((_CUR._SL))._RESULT;
                                                    ;
                                                    // JavaLine 220 <== SourceLine 377
                                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xident==(null)))) {
                                                        {
                                                            // JavaLine 223 <== SourceLine 378
                                                            ((BUILDER2)(_CUR._SL._SL)).simsymbol=((BUILDER2_normalattrfile)(_CUR._SL)).xidentstring;
                                                            ;
                                                            new COMMON_DEFIDENT((_CUR._SL._SL));
                                                            ;
                                                            // JavaLine 228 <== SourceLine 379
                                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xident=new COMMON_boxof((_CUR._SL._SL),((BUILDER2)(_CUR._SL._SL)).hashhi,((BUILDER2)(_CUR._SL._SL)).hashlo)._RESULT;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 233 <== SourceLine 381
                                                    qx=p_b.declquant;
                                                    ;
                                                    // JavaLine 236 <== SourceLine 382
                                                    {
                                                        _SIM_LABEL(2); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        qe=qx.descr_1.fpar;
                                                    }
                                                    ;
                                                    // JavaLine 242 <== SourceLine 383
                                                    while((qe!=(null))) {
                                                        {
                                                            // JavaLine 245 <== SourceLine 384
                                                            if(_VALUE((qe.symb_1==(((BUILDER2_normalattrfile)(_CUR._SL)).xident)))) {
                                                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_found_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 250 <== SourceLine 385
                                                            qe=((COMMON_quantity)(qe.next));
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 256 <== SourceLine 387
                                                    if(_VALUE((qx.plev_1>(1)))) {
                                                        {
                                                            // JavaLine 259 <== SourceLine 388
                                                            qx=qx.prefqual_1;
                                                            ;
                                                            _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_nextplev_0); // GOTO EVALUATED LABEL
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 266 <== SourceLine 391
                                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xkind==(((char)5))))) {
                                                        _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_newhead_0); // GOTO EVALUATED LABEL
                                                    }
                                                    ;
                                                    // JavaLine 271 <== SourceLine 392
                                                    qe=new BUILDER1_meaningof((_CUR._SL._SL),((BUILDER2_normalattrfile)(_CUR._SL)).xident)._RESULT;
                                                    ;
                                                    // JavaLine 274 <== SourceLine 393
                                                    if(_VALUE((qe==(null)))) {
                                                        // JavaLine 276 <== SourceLine 394
                                                        qe=new ERRMSG_newnotseen((_CUR._SL._SL),((BUILDER2_normalattrfile)(_CUR._SL)).xident)._RESULT;
                                                    }
                                                    ;
                                                    // JavaLine 280 <== SourceLine 395
                                                    if(_VALUE((qe.categ_1==(((char)5))))) {
                                                        {
                                                            // JavaLine 283 <== SourceLine 396
                                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xclf==(((char)1))))) {
                                                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_addnewnature_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 288 <== SourceLine 397
                                                            _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_newhead_0); // GOTO EVALUATED LABEL
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 293 <== SourceLine 399
                                                    {
                                                        _SIM_LABEL(3); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        // JavaLine 296 <== SourceLine 400
                                                        new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),400,new RTS_TXT("FOUND: "),qe);
                                                    }
                                                    ;
                                                    // JavaLine 300 <== SourceLine 401
                                                    if(_VALUE((qe.encl_1!=(p_b)))) {
                                                        {
                                                            // JavaLine 303 <== SourceLine 402
                                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xclf==(((char)1))))) {
                                                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_addnewnature_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 308 <== SourceLine 403
                                                            if(_VALUE((!(_IS(qe.descr_1,COMMON_extbrecord.class))))) {
                                                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_newhead_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 313 <== SourceLine 404
                                                            if(_VALUE(((((BUILDER2_normalattrfile)(_CUR._SL)).xchecklo!=(((COMMON_extbrecord)(qe.descr_1)).checklo_1))&&((((BUILDER2_normalattrfile)(_CUR._SL)).xcheckhi!=(((COMMON_extbrecord)(qe.descr_1)).checkhi_1)))))) {
                                                                // JavaLine 315 <== SourceLine 406
                                                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_newhead_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 319 <== SourceLine 407
                                                            markermade=true;
                                                            ;
                                                            // JavaLine 322 <== SourceLine 408
                                                            qq=new BUILDER1_newextquantbrec((_CUR._SL._SL),p_b.blev,p_b.rtblev,'M',((COMMON_extquantity)(qe)))._RESULT;
                                                            ;
                                                            // JavaLine 325 <== SourceLine 409
                                                            _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_littned_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 331 <== SourceLine 412
                                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xclf==(((char)1))))) {
                                                        {
                                                            // JavaLine 334 <== SourceLine 413
                                                            if(_VALUE((qe.categ_1!=(((char)4))))) {
                                                                new ERRMSG_errQTN((_CUR._SL._SL),qe,417,q);
                                                            } else {
                                                                // JavaLine 338 <== SourceLine 414
                                                                if(_VALUE((((((COMMON_extquantity)(qe)).clf_2!=(((char)1)))||((qe.virtno_1!=(((BUILDER2_normalattrfile)(_CUR._SL)).xextident))))||((qe.dim_1!=(((BUILDER2_normalattrfile)(_CUR._SL)).xlanguage)))))) {
                                                                    // JavaLine 340 <== SourceLine 417
                                                                    new ERRMSG_errQTN((_CUR._SL._SL),qe,418,q);
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 345 <== SourceLine 419
                                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                                                {
                                                                    // JavaLine 348 <== SourceLine 420
                                                                    new COMMON_attrfile_nextKey((_CUR._SL));
                                                                    ;
                                                                    // JavaLine 351 <== SourceLine 422
                                                                    while((((BUILDER2_normalattrfile)(_CUR._SL)).key<(((char)240)))) {
                                                                        new COMMON_attrfile_fetchquant((_CUR._SL));
                                                                    }
                                                                    ;
                                                                    // JavaLine 356 <== SourceLine 424
                                                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key!=(((char)250))))) {
                                                                        new BUILDER2_normalattrfile_expxerr((_CUR._SL),'E');
                                                                    }
                                                                    ;
                                                                    // JavaLine 361 <== SourceLine 425
                                                                    new COMMON_attrfile_nextKey((_CUR._SL));
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 369 <== SourceLine 428
                                                        if(_VALUE((!(_IS(qe.descr_1,COMMON_extbrecord.class))))) {
                                                            new ERRMSG_errQTN((_CUR._SL._SL),qe,417,q);
                                                        } else {
                                                            // JavaLine 373 <== SourceLine 431
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_431_4537=((COMMON_extbrecord)(qe.descr_1));
                                                                if(_inspect_431_4537!=null) { // INSPECT _inspect_431_4537
                                                                    // JavaLine 378 <== SourceLine 432
                                                                    {
                                                                        // JavaLine 380 <== SourceLine 431
                                                                        {
                                                                            // JavaLine 382 <== SourceLine 432
                                                                            if(_VALUE(((_inspect_431_4537.checkhi_1!=(((char)0)))&&(((_inspect_431_4537.checkhi_1!=(((BUILDER2_normalattrfile)(_CUR._SL)).xcheckhi))||((_inspect_431_4537.checklo_1!=(((BUILDER2_normalattrfile)(_CUR._SL)).xchecklo)))))))) {
                                                                                // JavaLine 384 <== SourceLine 434
                                                                                new ERRMSG_errQTN((_CUR._SL._SL),qe,418,q);
                                                                            } else {
                                                                                // JavaLine 387 <== SourceLine 435
                                                                                {
                                                                                    // JavaLine 389 <== SourceLine 436
                                                                                    _inspect_431_4537.checkhi_1=((BUILDER2_normalattrfile)(_CUR._SL)).xcheckhi;
                                                                                    ;
                                                                                    _inspect_431_4537.checklo_1=((BUILDER2_normalattrfile)(_CUR._SL)).xchecklo;
                                                                                    ;
                                                                                    // JavaLine 394 <== SourceLine 437
                                                                                    _inspect_431_4537.cause_1=((COMMON_extquantity)(q));
                                                                                    ;
                                                                                }
                                                                            }
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                            } // END INSPECTION
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 407 <== SourceLine 440
                                                    _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_nonew_0); // GOTO EVALUATED LABEL
                                                    ;
                                                    // JavaLine 410 <== SourceLine 443
                                                    {
                                                        _SIM_LABEL(4); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        if(_VALUE(generate)) {
                                                            {
                                                                // JavaLine 415 <== SourceLine 444
                                                                qq=new COMMON_extquantity((_CUR._SL._SL),null)._STM();
                                                                ;
                                                                new BUILDER2_normalattrfile_fillextquantity((_CUR._SL),((COMMON_extquantity)(qq)));
                                                                ;
                                                                // JavaLine 420 <== SourceLine 445
                                                                qq.encl_1=p_b;
                                                                ;
                                                                // JavaLine 423 <== SourceLine 446
                                                                qq.next=q.next;
                                                                ;
                                                                q.next=qq;
                                                                ;
                                                                // JavaLine 428 <== SourceLine 447
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_447_4538=new COMMON_brecord((_CUR._SL._SL))._STM();
                                                                    if(_inspect_447_4538!=null) { // INSPECT _inspect_447_4538
                                                                        // JavaLine 433 <== SourceLine 448
                                                                        {
                                                                            // JavaLine 435 <== SourceLine 447
                                                                            {
                                                                                // JavaLine 437 <== SourceLine 448
                                                                                _inspect_447_4538.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_b.blev)+(1)));
                                                                                ;
                                                                                // JavaLine 440 <== SourceLine 449
                                                                                _inspect_447_4538.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_b.rtblev)+(1)));
                                                                                ;
                                                                                // JavaLine 443 <== SourceLine 450
                                                                                qq.descr_1=((COMMON_brecord)_inspect_447_4538);
                                                                                ;
                                                                                _inspect_447_4538.declquant=qq;
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                                ;
                                                                // JavaLine 452 <== SourceLine 451
                                                                q.descr_1.kind=((char)1);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 459 <== SourceLine 454
                                                    ((BUILDER2)(_CUR._SL._SL)).indent=(((BUILDER2)(_CUR._SL._SL)).indent+(1));
                                                    ;
                                                    // JavaLine 462 <== SourceLine 455
                                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                                        {
                                                            // JavaLine 465 <== SourceLine 456
                                                            if(_VALUE(generate)) {
                                                                new BUILDER2_normalattrfile_expandextlist((_CUR._SL),null,qq.descr_1);
                                                            } else {
                                                                // JavaLine 469 <== SourceLine 457
                                                                new BUILDER2_normalattrfile_skipList((_CUR._SL));
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 475 <== SourceLine 458
                                                    ((BUILDER2)(_CUR._SL._SL)).indent=(((BUILDER2)(_CUR._SL._SL)).indent-(1));
                                                    ;
                                                    // JavaLine 478 <== SourceLine 459
                                                    _GOTO(_LABEL_BUILDER2_normalattrfile_expandexternals_Block339_Block341_Block345_Block375_nonew_0); // GOTO EVALUATED LABEL
                                                    ;
                                                    // JavaLine 481 <== SourceLine 461
                                                    {
                                                        _SIM_LABEL(5); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        qq=new BUILDER1_newextquantbrec((_CUR._SL._SL),p_b.blev,p_b.rtblev,'H',((COMMON_extquantity)(q)))._RESULT;
                                                    }
                                                    ;
                                                    // JavaLine 487 <== SourceLine 463
                                                    if(_VALUE((qq.kind_1==(((char)5))))) {
                                                        p_b.localclasses=true;
                                                    }
                                                    ;
                                                    // JavaLine 492 <== SourceLine 464
                                                    {
                                                        _SIM_LABEL(6); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        qq.encl_1=p_b;
                                                    }
                                                    ;
                                                    // JavaLine 498 <== SourceLine 465
                                                    qq.next=q.next;
                                                    ;
                                                    q.next=qq;
                                                    ;
                                                    // JavaLine 503 <== SourceLine 466
                                                    new BUILDER2_normalattrfile_fillextquantity((_CUR._SL),((COMMON_extquantity)(qq)));
                                                    ;
                                                    // JavaLine 506 <== SourceLine 467
                                                    {
                                                        _SIM_LABEL(7); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                                        ;
                                                    }
                                                }
                                            }
                                            ;
                                            // JavaLine 514 <== SourceLine 470
                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key!=(((char)252))))) {
                                                new BUILDER2_normalattrfile_expxerr((_CUR._SL),'M');
                                            }
                                            ;
                                            // JavaLine 519 <== SourceLine 471
                                            new COMMON_attrfile_nextKey((_CUR._SL));
                                            ;
                                            // JavaLine 522 <== SourceLine 473
                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key>=(((char)240))))) {
                                                new BUILDER2_normalattrfile_expxerr((_CUR._SL),'Q');
                                            }
                                            ;
                                            // JavaLine 527 <== SourceLine 474
                                            generate=new COMMON_attrfile_fetchquant((_CUR._SL))._RESULT;
                                            ;
                                            // JavaLine 530 <== SourceLine 475
                                            if(_VALUE((q.symb_1!=(((BUILDER2_normalattrfile)(_CUR._SL)).xident)))) {
                                                new ERRMSG_errQT((_CUR._SL._SL),q,327);
                                            }
                                            ;
                                            // JavaLine 535 <== SourceLine 476
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xextident=q.virtno_1;
                                            ;
                                            // JavaLine 538 <== SourceLine 477
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xmodulhi=((BUILDER2_normalattrfile)(_CUR._SL)).attrmodhi;
                                            ;
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xmodullo=((BUILDER2_normalattrfile)(_CUR._SL)).attrmodlo;
                                            ;
                                            // JavaLine 543 <== SourceLine 478
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xcheckhi=((BUILDER2_normalattrfile)(_CUR._SL)).attrckhi;
                                            ;
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xchecklo=((BUILDER2_normalattrfile)(_CUR._SL)).attrcklo;
                                            ;
                                            // JavaLine 548 <== SourceLine 479
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xcateg=((char)4);
                                            ;
                                            // JavaLine 551 <== SourceLine 480
                                            new BUILDER2_normalattrfile_fillextquantity((_CUR._SL),((COMMON_extquantity)(q)));
                                            ;
                                            // JavaLine 554 <== SourceLine 482
                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                                new BUILDER2_normalattrfile_expandextlist((_CUR._SL),((COMMON_extbrecord)(q.descr_1)),q.descr_1);
                                            }
                                            ;
                                            // JavaLine 559 <== SourceLine 484
                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key!=(((char)252))))) {
                                                new BUILDER2_normalattrfile_expxerr((_CUR._SL),'T');
                                            }
                                            ;
                                            // JavaLine 564 <== SourceLine 485
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).xtagnum=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                            ;
                                            // JavaLine 567 <== SourceLine 486
                                            eb.exttagnum_1=((BUILDER2_normalattrfile)(_CUR._SL)).xtagnum;
                                            ;
                                            // JavaLine 570 <== SourceLine 487
                                            if(_VALUE((((BUILDER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('O'))!=(((char)0))))) {
                                                // JavaLine 572 <== SourceLine 488
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_488_4539=RTS_BASICIO.sysout();
                                                    if(_inspect_488_4539!=null) { // INSPECT _inspect_488_4539
                                                        // JavaLine 577 <== SourceLine 489
                                                        {
                                                            // JavaLine 579 <== SourceLine 488
                                                            {
                                                                // JavaLine 581 <== SourceLine 489
                                                                _inspect_488_4539.outtext(new RTS_TXT(" - end attr. file "));
                                                                ;
                                                                // JavaLine 584 <== SourceLine 490
                                                                t=((BUILDER2_normalattrfile)(_CUR._SL)).CURF.filename();
                                                                ;
                                                                _inspect_488_4539.outtext(t);
                                                                ;
                                                                // JavaLine 589 <== SourceLine 493
                                                                _inspect_488_4539.outimage();
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                            }
                                            ;
                                            // JavaLine 597 <== SourceLine 494
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).CURF.close();
                                            ;
                                            ((BUILDER2_normalattrfile)(_CUR._SL)).CURF=null;
                                            ;
                                        }
                                    }
                                    ;
                                }
                            }
                            ;
                            // JavaLine 608 <== SourceLine 497
                            {
                                _SIM_LABEL(8); // DeclaredIn: expandexternals -> expandexternals[externalIdent=BUILDER2_normalattrfile_expandexternals] Kind=5, QUAL=ProcedureDeclaration, HashCode=485301524
                                q=((COMMON_quantity)(q.next));
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 618 <== SourceLine 501
                if(_VALUE(markermade)) {
                    {
                        // JavaLine 621 <== SourceLine 502
                        q=p_b.fpar;
                        ;
                        qe=((COMMON_quantity)(q.next));
                        ;
                        // JavaLine 626 <== SourceLine 503
                        while((qe!=(null))) {
                            // JavaLine 628 <== SourceLine 504
                            {
                                // JavaLine 630 <== SourceLine 505
                                if(_VALUE((_IS(qe.descr_1,COMMON_extbrecord.class)&&((((COMMON_extbrecord)(qe.descr_1)).status_1==('M')))))) {
                                    // JavaLine 632 <== SourceLine 507
                                    q.next=qe=((COMMON_quantity)(qe.next));
                                } else {
                                    // JavaLine 635 <== SourceLine 508
                                    {
                                        q=qe;
                                        ;
                                        qe=((COMMON_quantity)(q.next));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 expandexternals",1,321,11,338,13,382,15,400,17,443,19,461,21,464,23,467,25,497,28,323,34,324,36,325,38,326,40,327,42,347,44,431,46,447,48,488,82,329,85,331,88,333,91,334,96,335,99,337,102,338,105,339,108,340,111,341,114,342,117,343,120,345,123,346,126,347,132,348,134,347,136,348,138,349,141,351,145,352,147,353,151,354,157,356,160,357,173,360,176,361,179,362,185,363,187,364,191,365,199,367,201,368,206,371,209,372,214,374,217,375,220,377,223,378,228,379,233,381,236,382,242,383,245,384,250,385,256,387,259,388,266,391,271,392,274,393,276,394,280,395,283,396,288,397,293,399,296,400,300,401,303,402,308,403,313,404,315,406,319,407,322,408,325,409,331,412,334,413,338,414,340,417,345,419,348,420,351,422,356,424,361,425,369,428,373,431,378,432,380,431,382,432,384,434,387,435,389,436,394,437,407,440,410,443,415,444,420,445,423,446,428,447,433,448,435,447,437,448,440,449,443,450,452,451,459,454,462,455,465,456,469,457,475,458,478,459,481,461,487,463,492,464,498,465,503,466,506,467,514,470,519,471,522,473,527,474,530,475,535,476,538,477,543,478,548,479,551,480,554,482,559,484,564,485,567,486,570,487,572,488,577,489,579,488,581,489,584,490,589,493,597,494,608,497,618,501,621,502,626,503,628,504,630,505,632,507,635,508,659,511);
} // End of Procedure
