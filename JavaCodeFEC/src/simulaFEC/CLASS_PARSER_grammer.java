// JavaLine 1 <== SourceLine 125
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer extends CLASS_COMMON_component {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=125, lastLine=2696, hasLocalClasses=true, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 2245
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_MarkPush_1=new RTS_LABEL(this,1,1,"MarkPush"); // Local Label #1=MarkPush At PrefixLevel 1
    // JavaLine 13 <== SourceLine 2257
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Push_1=new RTS_LABEL(this,1,2,"Push"); // Local Label #2=Push At PrefixLevel 1
    // JavaLine 15 <== SourceLine 2259
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_PARSE_1=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 2265
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_BlockHead_1=new RTS_LABEL(this,1,4,"BlockHead"); // Local Label #4=BlockHead At PrefixLevel 1
    // JavaLine 19 <== SourceLine 2294
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2272_XorB_0=new RTS_LABEL(this,1,5,"XorB"); // Local Label #5=XorB At PrefixLevel 1
    // JavaLine 21 <== SourceLine 2328
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2272_Block2328_AssStm_0=new RTS_LABEL(this,1,6,"AssStm"); // Local Label #6=AssStm At PrefixLevel 1
    // JavaLine 23 <== SourceLine 2351
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2272_Block2351_testcallorobjgen_0=new RTS_LABEL(this,1,7,"testcallorobjgen"); // Local Label #7=testcallorobjgen At PrefixLevel 1
    // JavaLine 25 <== SourceLine 2367
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2360_d1_0=new RTS_LABEL(this,1,8,"d1"); // Local Label #8=d1 At PrefixLevel 1
    // JavaLine 27 <== SourceLine 2394
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2360_Block2389_ROattr_0=new RTS_LABEL(this,1,9,"ROattr"); // Local Label #9=ROattr At PrefixLevel 1
    // JavaLine 29 <== SourceLine 2410
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2360_Block2401_Block2402_Block2408_reper1_0=new RTS_LABEL(this,1,10,"reper1"); // Local Label #10=reper1 At PrefixLevel 1
    // JavaLine 31 <== SourceLine 2429
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2360_testSmcl_0=new RTS_LABEL(this,1,11,"testSmcl"); // Local Label #11=testSmcl At PrefixLevel 1
    // JavaLine 33 <== SourceLine 2436
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_arrdcl_0=new RTS_LABEL(this,1,12,"arrdcl"); // Local Label #12=arrdcl At PrefixLevel 1
    // JavaLine 35 <== SourceLine 2452
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A1_0=new RTS_LABEL(this,1,13,"A1"); // Local Label #13=A1 At PrefixLevel 1
    // JavaLine 37 <== SourceLine 2463
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A2_0=new RTS_LABEL(this,1,14,"A2"); // Local Label #14=A2 At PrefixLevel 1
    // JavaLine 39 <== SourceLine 2464
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2464_A21_0=new RTS_LABEL(this,1,15,"A21"); // Local Label #15=A21 At PrefixLevel 1
    // JavaLine 41 <== SourceLine 2470
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2470_A30_0=new RTS_LABEL(this,1,16,"A30"); // Local Label #16=A30 At PrefixLevel 1
    // JavaLine 43 <== SourceLine 2471
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2470_A3_0=new RTS_LABEL(this,1,17,"A3"); // Local Label #17=A3 At PrefixLevel 1
    // JavaLine 45 <== SourceLine 2497
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2480_SW1_0=new RTS_LABEL(this,1,18,"SW1"); // Local Label #18=SW1 At PrefixLevel 1
    // JavaLine 47 <== SourceLine 2507
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2507_newdcl_0=new RTS_LABEL(this,1,19,"newdcl"); // Local Label #19=newdcl At PrefixLevel 1
    // JavaLine 49 <== SourceLine 2618
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2616_actv_0=new RTS_LABEL(this,1,20,"actv"); // Local Label #20=actv At PrefixLevel 1
    // JavaLine 51 <== SourceLine 2623
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_Block2616_Block2622_Block2623_actError_0=new RTS_LABEL(this,1,21,"actError"); // Local Label #21=actError At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 54 <== SourceLine 138
    public CLASS_PARSER_grammer_statement first_1=null;
    public CLASS_PARSER_grammer_statement last_1=null;
    // JavaLine 57 <== SourceLine 139
    public CLASS_PARSER_grammer_statement exList_1=null;
    public CLASS_PARSER_grammer_statement foList_1=null;
    public CLASS_PARSER_grammer_statement whList_1=null;
    public CLASS_PARSER_grammer_statement itList_1=null;
    public CLASS_PARSER_grammer_statement ifList_1=null;
    // JavaLine 63 <== SourceLine 140
    public CLASS_PARSER_grammer_statement deList_1=null;
    // JavaLine 65 <== SourceLine 141
    public CLASS_PARSER_grammer_statement newstat_1=null;
    // JavaLine 67 <== SourceLine 142
    public char stmtwnt_1=0;
    // JavaLine 69 <== SourceLine 143
    public char readtype_1=0;
    // JavaLine 71 <== SourceLine 144
    public boolean specofvirtual_1=false;
    // JavaLine 73 <== SourceLine 145
    public boolean labelused_1=false;
    // JavaLine 75 <== SourceLine 147
    public char reac_1=0;
    // JavaLine 77 <== SourceLine 148
    public int fornests_1=0;
    // JavaLine 79 <== SourceLine 149
    public int experrorno_1=0;
    // JavaLine 81 <== SourceLine 150
    public int uniqueindex_1=0;
    // JavaLine 83 <== SourceLine 151
    public int lastDECLnr_1=0;
    // JavaLine 85 <== SourceLine 152
    public int lastSTMTnr_1=0;
    // JavaLine 87 <== SourceLine 154
    public int blockfound_1=0;
    // JavaLine 89 <== SourceLine 155
    public CLASS_PARSER_grammer_expression ex_1=null;
    // JavaLine 91 <== SourceLine 157
    public RTS_BOOLEAN_ARRAY recoversymbol=null;
    // JavaLine 93 <== SourceLine 158
    public RTS_CHARACTER_ARRAY symboltype=null;
    // JavaLine 95 <== SourceLine 166
    public final char declsymbol_1=(char)(((char)1));
    // JavaLine 97 <== SourceLine 167
    public final char exprtermin_1=(char)(((char)2));
    // JavaLine 99 <== SourceLine 168
    public final char arithop_1=(char)(((char)3));
    // JavaLine 101 <== SourceLine 169
    public final char relop_1=(char)(((char)4));
    // JavaLine 103 <== SourceLine 170
    public final char logop_1=(char)(((char)5));
    // JavaLine 105 <== SourceLine 173
    public final char allstmt_1;
    // JavaLine 107 <== SourceLine 174
    public final char allbutif_1=(char)(((char)1));
    // JavaLine 109 <== SourceLine 175
    public final char outermost_1=(char)(((char)2));
    // JavaLine 111 <== SourceLine 177
    public final char classbody_1=(char)(((char)3));
    // JavaLine 113 <== SourceLine 178
    public final char stmtorinner_1=(char)(((char)4));
    // JavaLine 115 <== SourceLine 179
    public final char procbody_1=(char)(((char)5));
    // JavaLine 117 <== SourceLine 182
    public final char basicstmt_1;
    // JavaLine 119 <== SourceLine 183
    public final char openstmt_1=(char)(((char)1));
    // JavaLine 121 <== SourceLine 184
    public final char innerstmt_1=(char)(((char)2));
    // JavaLine 123 <== SourceLine 186
    public final char declunit_1=(char)(((char)3));
    // JavaLine 125 <== SourceLine 187
    public final char dummystmt_1=(char)(((char)4));
    // JavaLine 127 <== SourceLine 191
    public final char compstmt_1;
    // JavaLine 129 <== SourceLine 192
    public final char usualblock_1=(char)(((char)1));
    // JavaLine 131 <== SourceLine 193
    public final char prefixblock_1=(char)(((char)2));
    // JavaLine 133 <== SourceLine 196
    public final char stmtnotseen_1=(char)(((char)1));
    // JavaLine 135 <== SourceLine 197
    public final char lastwasstmt_1=(char)(((char)2));
    // JavaLine 137 <== SourceLine 198
    public final char lastwasdecl_1=(char)(((char)3));
    // JavaLine 139 <== SourceLine 226
    public int currentPos_1=0;
    // JavaLine 141 <== SourceLine 2586
    public CLASS_PARSER_grammer_blockOrComp _inspect_2586_4509=null;
    // JavaLine 143 <== SourceLine 2621
    public CLASS_PARSER_codebuffer _inspect_2621_4510=null;
    // Normal Constructor
    public CLASS_PARSER_grammer(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 150 <== SourceLine 157
        recoversymbol=new RTS_BOOLEAN_ARRAY(new RTS_BOUNDS(0,150));
        // JavaLine 152 <== SourceLine 158
        symboltype=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,150));
        allstmt_1=((char)0);
        basicstmt_1=((char)0);
        compstmt_1=((char)0);
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer _STM() {
        CLASS_PARSER_grammer _THIS=(CLASS_PARSER_grammer)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,21); // For ByteCode Engineering
                // JavaLine 165 <== SourceLine 864
                // BEGIN component INNER PART
                // JavaLine 167 <== SourceLine 2237
                new CLASS_PARSER_grammer_setbasicrecovery((_CUR));
                ;
                // JavaLine 170 <== SourceLine 2238
                detach(2238);
                ;
                // JavaLine 173 <== SourceLine 2239
                ex_1=((CLASS_PARSER_grammer_expression)new CLASS_PARSER_grammer_expression((_CUR))._START());
                ;
                first_1=last_1=((CLASS_PARSER_grammer_module)new CLASS_PARSER_grammer_module((_CUR))._START());
                ;
                // JavaLine 178 <== SourceLine 2241
                detach(2241);
                ;
                // JavaLine 181 <== SourceLine 2242
                _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 184 <== SourceLine 2244
                {
                    _SIM_LABEL(1); // DeclaredIn: grammer
                    // JavaLine 187 <== SourceLine 2245
                    if(_VALUE(((last_1.blockstatus==(((char)1)))||(((stmtwnt_1==(((char)3)))||((stmtwnt_1==(((char)5))))))))) {
                        // JavaLine 189 <== SourceLine 2248
                        {
                            // JavaLine 191 <== SourceLine 2249
                            last_1.blockstatus=((char)3);
                            ;
                            // JavaLine 194 <== SourceLine 2250
                            ((CLASS_PARSER)(_CUR._SL)).opn='o';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL)).coder,2250);
                            ;
                        }
                    }
                }
                ;
                // JavaLine 203 <== SourceLine 2253
                ((CLASS_PARSER)(_CUR._SL)).opn='Y';
                ;
                call(((CLASS_PARSER)(_CUR._SL)).coder,2253);
                ;
                // JavaLine 208 <== SourceLine 2256
                {
                    _SIM_LABEL(2); // DeclaredIn: grammer
                    // JavaLine 211 <== SourceLine 2257
                    newstat_1.caller=last_1;
                }
                ;
                last_1=last_1.next=newstat_1;
                ;
                // JavaLine 217 <== SourceLine 2259
                {
                    _SIM_LABEL(3); // DeclaredIn: grammer
                    call(last_1,2259);
                }
                ;
                // JavaLine 223 <== SourceLine 2260
                if(_VALUE(last_1.recovered)) {
                    {
                        // JavaLine 226 <== SourceLine 2261
                        last_1.recovered=false;
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 233 <== SourceLine 2262
                stmtwnt_1=last_1.stmtreq;
                ;
                labelused_1=false;
                ;
                // JavaLine 238 <== SourceLine 2264
                {
                    _SIM_LABEL(4); // DeclaredIn: grammer
                    // JavaLine 241 <== SourceLine 2265
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W3((_CUR._SL),new RTS_TXT("Head, cs="),cs);
                    }
                }
                ;
                // JavaLine 247 <== SourceLine 2266
                if(cs<((char)0) || cs>'[') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(cs) { // BEGIN SWITCH STATEMENT
                    case 79: 
                    case 15: 
                    case 55: 
                    case 37: 
                    case 88: 
                    // JavaLine 255 <== SourceLine 2267
                    {
                        // JavaLine 257 <== SourceLine 2269
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 90: 
                    // JavaLine 263 <== SourceLine 2271
                    {
                        // JavaLine 265 <== SourceLine 2272
                        if(((CLASS_PARSER)(_CUR._SL)).opt<((char)0) || ((CLASS_PARSER)(_CUR._SL)).opt>'[') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_PARSER)(_CUR._SL)).opt) { // BEGIN SWITCH STATEMENT
                            case 30: 
                            case 31: 
                            // JavaLine 270 <== SourceLine 2273
                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2507_newdcl_0); // GOTO EVALUATED LABEL
                            break;
                            case 0: 
                            // JavaLine 274 <== SourceLine 2275
                            {
                                new CLASS_PARSER_grammer_skip((_CUR),236);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 77: 
                            // JavaLine 282 <== SourceLine 2276
                            {
                                // JavaLine 284 <== SourceLine 2277
                                labelused_1=true;
                                ;
                                // JavaLine 287 <== SourceLine 2278
                                if(_VALUE((((last_1.blockstatus==(((char)1)))||((stmtwnt_1==(((char)3)))))||((stmtwnt_1==(((char)5))))))) {
                                    // JavaLine 289 <== SourceLine 2280
                                    {
                                        // JavaLine 291 <== SourceLine 2281
                                        last_1.blockstatus=((char)3);
                                        ;
                                        // JavaLine 294 <== SourceLine 2282
                                        ((CLASS_PARSER)(_CUR._SL)).opn='o';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2282);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 302 <== SourceLine 2287
                                while(((((CLASS_PARSER)(_CUR._SL)).opt==('M'))&&((cs==('Z'))))) {
                                    {
                                        // JavaLine 305 <== SourceLine 2288
                                        ((CLASS_PARSER)(_CUR._SL)).opn='M';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2288);
                                        ;
                                        // JavaLine 310 <== SourceLine 2289
                                        detach(2289);
                                    }
                                }
                                ;
                                // JavaLine 315 <== SourceLine 2290
                                _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 322 <== SourceLine 2293
                        {
                            _SIM_LABEL(5); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            // JavaLine 325 <== SourceLine 2294
                            if(_VALUE((((last_1.blockstatus==(((char)1)))||((stmtwnt_1==(((char)3)))))||((stmtwnt_1==(((char)5))))))) {
                                // JavaLine 327 <== SourceLine 2296
                                {
                                    // JavaLine 329 <== SourceLine 2297
                                    last_1.blockstatus=((char)3);
                                    ;
                                    // JavaLine 332 <== SourceLine 2298
                                    ((CLASS_PARSER)(_CUR._SL)).opn='o';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL)).coder,2298);
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 341 <== SourceLine 2301
                        ((CLASS_PARSER)(_CUR._SL)).opn='Y';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2301);
                        ;
                        // JavaLine 346 <== SourceLine 2304
                        last_1.stmttype=basicstmt_1;
                        ;
                        // JavaLine 349 <== SourceLine 2306
                        ex_1.startexprstmt=true;
                        ;
                        call(ex_1,2306);
                        ;
                        // JavaLine 354 <== SourceLine 2307
                        ex_1.startexprstmt=false;
                        ;
                        // JavaLine 357 <== SourceLine 2308
                        if(cs<((char)0) || cs>'[') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(cs) { // BEGIN SWITCH STATEMENT
                            case 32: 
                            // JavaLine 361 <== SourceLine 2312
                            {
                                // JavaLine 363 <== SourceLine 2313
                                if(_VALUE(ex_1.NOTblockprefix)) {
                                    {
                                        // JavaLine 366 <== SourceLine 2314
                                        new CLASS_PARSER_grammer_ParsErr((_CUR),197);
                                        ;
                                        // JavaLine 369 <== SourceLine 2316
                                        ex_1.startexprstmt=false;
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2272_Block2351_testcallorobjgen_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 377 <== SourceLine 2318
                                newstat_1=exList_1;
                                ;
                                // JavaLine 380 <== SourceLine 2319
                                if(_VALUE((newstat_1==(null)))) {
                                    newstat_1=((CLASS_PARSER_grammer_blockOrComp)new CLASS_PARSER_grammer_blockOrComp((_CUR))._START());
                                }
                                ;
                                // JavaLine 385 <== SourceLine 2320
                                ex_1.startexprstmt=true;
                                ;
                                // JavaLine 388 <== SourceLine 2322
                                newstat_1.caller=last_1;
                                ;
                                last_1=last_1.next=newstat_1;
                                ;
                                // JavaLine 393 <== SourceLine 2323
                                _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 58: 
                            // JavaLine 399 <== SourceLine 2324
                            {
                                // JavaLine 401 <== SourceLine 2325
                                new CLASS_PARSER_grammer_ParsWarn((_CUR),232);
                                ;
                                cs='R';
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_Block2272_Block2328_AssStm_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 82: 
                            // JavaLine 410 <== SourceLine 2326
                            {
                                // JavaLine 412 <== SourceLine 2328
                                {
                                    _SIM_LABEL(6); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                    while((cs==('R'))) {
                                        {
                                            // JavaLine 417 <== SourceLine 2329
                                            if(_VALUE(ex_1.NOTlhsassig)) {
                                                new CLASS_PARSER_grammer_ParsErr((_CUR),150);
                                            }
                                            ;
                                            // JavaLine 422 <== SourceLine 2330
                                            ((CLASS_PARSER)(_CUR._SL)).opn='R';
                                            ;
                                            call(((CLASS_PARSER)(_CUR._SL)).coder,2330);
                                            ;
                                            // JavaLine 427 <== SourceLine 2331
                                            detach(2331);
                                            ;
                                            // JavaLine 430 <== SourceLine 2332
                                            call(ex_1,2332);
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 437 <== SourceLine 2334
                                if(_VALUE(ex_1.wasNotexpr)) {
                                    new CLASS_PARSER_grammer_skip((_CUR),199);
                                }
                                ;
                                // JavaLine 442 <== SourceLine 2335
                                ((CLASS_PARSER)(_CUR._SL)).opn='d';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL)).coder,2335);
                                ;
                                // JavaLine 447 <== SourceLine 2336
                                _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 83: 
                            // JavaLine 453 <== SourceLine 2338
                            {
                                // JavaLine 455 <== SourceLine 2340
                                while((cs==('S'))) {
                                    {
                                        // JavaLine 458 <== SourceLine 2341
                                        if(_VALUE(ex_1.NOTrefexpr)) {
                                            new CLASS_PARSER_grammer_ParsErr((_CUR),200);
                                        }
                                        ;
                                        // JavaLine 463 <== SourceLine 2342
                                        ((CLASS_PARSER)(_CUR._SL)).opn='S';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2342);
                                        ;
                                        // JavaLine 468 <== SourceLine 2343
                                        detach(2343);
                                        ;
                                        // JavaLine 471 <== SourceLine 2344
                                        call(ex_1,2344);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 477 <== SourceLine 2346
                                if(_VALUE(ex_1.wasNotexpr)) {
                                    new CLASS_PARSER_grammer_ParsErr((_CUR),201);
                                }
                                ;
                                // JavaLine 482 <== SourceLine 2347
                                ((CLASS_PARSER)(_CUR._SL)).opn='d';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL)).coder,2347);
                                ;
                                // JavaLine 487 <== SourceLine 2348
                                _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            default:
                            // JavaLine 493 <== SourceLine 2350
                            {
                                // JavaLine 495 <== SourceLine 2351
                                {
                                    _SIM_LABEL(7); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                    if(_VALUE(ex_1.NOTrefexpr)) {
                                        new CLASS_PARSER_grammer_ParsErr((_CUR),202);
                                    }
                                }
                                ;
                                // JavaLine 503 <== SourceLine 2353
                                ((CLASS_PARSER)(_CUR._SL)).opn='z';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL)).coder,2353);
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        ;
                        // JavaLine 513 <== SourceLine 2356
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    // JavaLine 526 <== SourceLine 2359
                    {
                        // JavaLine 528 <== SourceLine 2360
                        new CLASS_PARSER_grammer_readtypespec((_CUR));
                        ;
                        // JavaLine 531 <== SourceLine 2362
                        if(_VALUE((cs!=('Z')))) {
                            {
                                // JavaLine 534 <== SourceLine 2363
                                if(_VALUE((cs==(((char)12))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_Block2507_newdcl_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 539 <== SourceLine 2364
                                if(_VALUE((cs==(((char)13))))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_arrdcl_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 544 <== SourceLine 2365
                                readtype_1=((char)0);
                                ;
                                new CLASS_PARSER_grammer_skip((_CUR),185);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 554 <== SourceLine 2367
                        {
                            _SIM_LABEL(8); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            if(_VALUE((cs!=('Z')))) {
                                {
                                    new CLASS_PARSER_grammer_skip((_CUR),185);
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                                }
                            }
                        }
                        ;
                        // JavaLine 566 <== SourceLine 2369
                        if(_VALUE(((!(last_1.isblocklike))||((last_1.blockstatus==(((char)2))))))) {
                            // JavaLine 568 <== SourceLine 2371
                            {
                                // JavaLine 570 <== SourceLine 2372
                                new CLASS_PARSER_grammer_ParsErr((_CUR),289);
                                ;
                                last_1.blockstatus=((char)1);
                                ;
                            }
                        }
                        ;
                        // JavaLine 578 <== SourceLine 2373
                        last_1.stmttype=((char)3);
                        ;
                        // JavaLine 581 <== SourceLine 2377
                        ((CLASS_PARSER)(_CUR._SL)).opn='^';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2377);
                        ;
                        // JavaLine 586 <== SourceLine 2378
                        getopt=false;
                        ;
                        cs=((CLASS_PARSER)(_CUR._SL)).opt;
                        ;
                        // JavaLine 591 <== SourceLine 2379
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                            new CLASS_PARSER_grammer_lookforstring((_CUR));
                        } else {
                            // JavaLine 595 <== SourceLine 2380
                            if(_VALUE((cs==(':')))) {
                                {
                                    // JavaLine 598 <== SourceLine 2381
                                    if(_VALUE(((readtype_1==(((char)5)))|((readtype_1==(((char)6))))))) {
                                        {
                                            // JavaLine 601 <== SourceLine 2382
                                            cs='R';
                                            ;
                                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_Block2389_ROattr_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                    // JavaLine 608 <== SourceLine 2383
                                    ((CLASS_PARSER)(_CUR._SL)).opn='3';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL)).coder,2383);
                                    ;
                                    // JavaLine 613 <== SourceLine 2384
                                    detach(2384);
                                    ;
                                    // JavaLine 616 <== SourceLine 2385
                                    call(ex_1,2385);
                                    ;
                                    ((CLASS_PARSER)(_CUR._SL)).opn='O';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL)).coder,2385);
                                    ;
                                    // JavaLine 623 <== SourceLine 2386
                                    if(_VALUE(ex_1.wasNotexpr)) {
                                        new CLASS_PARSER_grammer_skip((_CUR),188);
                                    }
                                    ;
                                }
                            } else {
                                // JavaLine 630 <== SourceLine 2388
                                if(_VALUE(((cs==('R'))||((cs==('S')))))) {
                                    {
                                        // JavaLine 633 <== SourceLine 2389
                                        if(_VALUE((!(((CLASS_PARSER)(_CUR._SL)).SportOK)))) {
                                            new CLASS_PARSER_grammer_ParsWarn((_CUR),254);
                                        }
                                        ;
                                        // JavaLine 638 <== SourceLine 2392
                                        ((CLASS_PARSER)(_CUR._SL)).opn='?';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2392);
                                        ;
                                        // JavaLine 643 <== SourceLine 2394
                                        {
                                            _SIM_LABEL(9); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                            ((CLASS_PARSER)(_CUR._SL)).opn='Z';
                                        }
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2394);
                                        ;
                                        // JavaLine 651 <== SourceLine 2395
                                        ((CLASS_PARSER)(_CUR._SL)).opn='|';
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL)).opdlo=cs;
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2395);
                                        ;
                                        // JavaLine 658 <== SourceLine 2396
                                        detach(2396);
                                        ;
                                        // JavaLine 661 <== SourceLine 2397
                                        call(ex_1,2397);
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL)).opn='d';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2397);
                                        ;
                                        // JavaLine 668 <== SourceLine 2398
                                        if(_VALUE(ex_1.wasNotexpr)) {
                                            new CLASS_PARSER_grammer_skip((_CUR),188);
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 675 <== SourceLine 2400
                                    if(_VALUE((cs==('P')))) {
                                        {
                                            // JavaLine 678 <== SourceLine 2401
                                            if(_VALUE(((CLASS_PARSER)(_CUR._SL)).Simuletta)) {
                                                {
                                                    // JavaLine 681 <== SourceLine 2402
                                                    detach(2402);
                                                    ;
                                                    // JavaLine 684 <== SourceLine 2403
                                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL)).opt!=('Q')))) {
                                                        {
                                                            // JavaLine 687 <== SourceLine 2404
                                                            new CLASS_PARSER_grammer_ParsWarn((_CUR),227);
                                                            ;
                                                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A2_0); // GOTO EVALUATED LABEL
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 694 <== SourceLine 2405
                                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL)).optx!=(((char)4))))) {
                                                        {
                                                            // JavaLine 697 <== SourceLine 2408
                                                            {
                                                                _SIM_LABEL(10); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                                                // JavaLine 700 <== SourceLine 2410
                                                                ((CLASS_PARSER)(_CUR._SL)).opn='?';
                                                            }
                                                            ;
                                                            call(((CLASS_PARSER)(_CUR._SL)).coder,2410);
                                                            ;
                                                            // JavaLine 706 <== SourceLine 2412
                                                            ((CLASS_PARSER)(_CUR._SL)).opn='a';
                                                            ;
                                                            call(((CLASS_PARSER)(_CUR._SL)).coder,2412);
                                                            ;
                                                            // JavaLine 711 <== SourceLine 2413
                                                            call(ex_1,2413);
                                                            ;
                                                            // JavaLine 714 <== SourceLine 2414
                                                            if(_VALUE(ex_1.wasNotexpr)) {
                                                                _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2470_A30_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2464_A21_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 724 <== SourceLine 2416
                                                    ((CLASS_PARSER)(_CUR._SL)).repcount_2=(RTS_TXT.getint(new CLASS_COMMON_nameof((_CUR._SL),((CLASS_PARSER)(_CUR._SL)).opdhi,((CLASS_PARSER)(_CUR._SL)).opdlo)._RESULT)+(1));
                                                    ;
                                                    // JavaLine 727 <== SourceLine 2417
                                                    if(_VALUE(((((CLASS_PARSER)(_CUR._SL)).repcount_2<=(0))||((((CLASS_PARSER)(_CUR._SL)).repcount_2>(256)))))) {
                                                        // JavaLine 729 <== SourceLine 2418
                                                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_Block2401_Block2402_Block2408_reper1_0); // GOTO EVALUATED LABEL
                                                    }
                                                    ;
                                                    // JavaLine 733 <== SourceLine 2419
                                                    ((CLASS_PARSER)(_CUR._SL)).opn=((char)140);
                                                    ;
                                                    call(((CLASS_PARSER)(_CUR._SL)).coder,2419);
                                                    ;
                                                    // JavaLine 738 <== SourceLine 2420
                                                    detach(2420);
                                                    ;
                                                    _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_testSmcl_0); // GOTO EVALUATED LABEL
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 746 <== SourceLine 2422
                                            getopt=false;
                                            ;
                                            new CLASS_PARSER_grammer_ParsWarn((_CUR),227);
                                            ;
                                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A1_0); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 759 <== SourceLine 2424
                        if(_VALUE((cs==('N')))) {
                            {
                                // JavaLine 762 <== SourceLine 2425
                                detach(2425);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_d1_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 769 <== SourceLine 2426
                        readtype_1=((char)0);
                        ;
                        // JavaLine 772 <== SourceLine 2427
                        {
                            _SIM_LABEL(11); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            // JavaLine 775 <== SourceLine 2429
                            if(_VALUE(((cs!=('O'))&&((cs!=('X')))))) {
                                new CLASS_PARSER_grammer_skip((_CUR),300);
                            } else {
                                // JavaLine 779 <== SourceLine 2430
                                detach(2430);
                            }
                        }
                        ;
                        // JavaLine 784 <== SourceLine 2431
                        _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 13: 
                    // JavaLine 790 <== SourceLine 2433
                    {
                        // JavaLine 792 <== SourceLine 2434
                        if(_VALUE((stmtwnt_1==(((char)2))))) {
                            new CLASS_PARSER_grammer_ParsErr((_CUR),216);
                        }
                        ;
                        // JavaLine 797 <== SourceLine 2435
                        {
                            _SIM_LABEL(12); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            // JavaLine 800 <== SourceLine 2436
                            if(_VALUE(((!(last_1.isblocklike))||((last_1.blockstatus==(((char)2))))))) {
                                // JavaLine 802 <== SourceLine 2438
                                {
                                    // JavaLine 804 <== SourceLine 2439
                                    new CLASS_PARSER_grammer_ParsErr((_CUR),289);
                                    ;
                                    last_1.blockstatus=((char)1);
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 813 <== SourceLine 2440
                        last_1.stmttype=((char)3);
                        ;
                        // JavaLine 816 <== SourceLine 2442
                        ((CLASS_PARSER)(_CUR._SL)).opn='?';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2442);
                        ;
                        // JavaLine 821 <== SourceLine 2444
                        if(_VALUE((readtype_1==(((char)0))))) {
                            {
                                // JavaLine 824 <== SourceLine 2445
                                ((CLASS_PARSER)(_CUR._SL)).opn=((char)5);
                                ;
                                call(((CLASS_PARSER)(_CUR._SL)).coder,2445);
                            }
                        }
                        ;
                        // JavaLine 831 <== SourceLine 2446
                        readtype_1=((char)0);
                        ;
                        // JavaLine 834 <== SourceLine 2447
                        cs='N';
                        ;
                        // JavaLine 837 <== SourceLine 2448
                        while((cs==('N'))) {
                            {
                                // JavaLine 840 <== SourceLine 2449
                                detach(2449);
                                ;
                                // JavaLine 843 <== SourceLine 2450
                                if(_VALUE((cs!=('Z')))) {
                                    {
                                        // JavaLine 846 <== SourceLine 2451
                                        new CLASS_PARSER_grammer_skip((_CUR),185);
                                        ;
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 853 <== SourceLine 2452
                                {
                                    _SIM_LABEL(13); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                    getopt=false;
                                }
                                ;
                                cs=((CLASS_PARSER)(_CUR._SL)).opt;
                                ;
                                // JavaLine 861 <== SourceLine 2453
                                if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                    new CLASS_PARSER_grammer_lookforstring((_CUR));
                                }
                                ;
                                // JavaLine 866 <== SourceLine 2454
                                ((CLASS_PARSER)(_CUR._SL)).opn='m';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL)).coder,2454);
                                ;
                                // JavaLine 871 <== SourceLine 2455
                                if(_VALUE((cs!=('P')))) {
                                    {
                                        // JavaLine 874 <== SourceLine 2456
                                        if(_VALUE((cs==('N')))) {
                                            {
                                                // JavaLine 877 <== SourceLine 2457
                                                detach(2457);
                                                ;
                                                // JavaLine 880 <== SourceLine 2458
                                                if(_VALUE((cs==('Z')))) {
                                                    _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A1_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                new CLASS_PARSER_grammer_skip((_CUR),185);
                                            }
                                        } else {
                                            // JavaLine 888 <== SourceLine 2459
                                            new CLASS_PARSER_grammer_skip((_CUR),187);
                                        }
                                        ;
                                        // JavaLine 892 <== SourceLine 2460
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_Block2470_A3_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 898 <== SourceLine 2463
                                {
                                    _SIM_LABEL(14); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                    if(_VALUE((new CLASS_PARSER_grammer_notBoundPair((_CUR),'f')._RESULT==(0)))) {
                                        {
                                            // JavaLine 903 <== SourceLine 2464
                                            {
                                                _SIM_LABEL(15); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                                if(_VALUE((cs==('N')))) {
                                                    {
                                                        // JavaLine 908 <== SourceLine 2465
                                                        ((CLASS_PARSER)(_CUR._SL)).opn='r';
                                                        ;
                                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2465);
                                                        ;
                                                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2434_Block2449_A2_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                            ;
                                            // JavaLine 918 <== SourceLine 2467
                                            ((CLASS_PARSER)(_CUR._SL)).opn='c';
                                            ;
                                            call(((CLASS_PARSER)(_CUR._SL)).coder,2467);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 925 <== SourceLine 2469
                                        {
                                            // JavaLine 927 <== SourceLine 2470
                                            {
                                                _SIM_LABEL(16); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                                new CLASS_PARSER_grammer_skip((_CUR),0);
                                            }
                                            ;
                                            // JavaLine 933 <== SourceLine 2471
                                            {
                                                _SIM_LABEL(17); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                                ((CLASS_PARSER)(_CUR._SL)).opn='c';
                                            }
                                            ;
                                            call(((CLASS_PARSER)(_CUR._SL)).coder,2471);
                                            ;
                                            // JavaLine 941 <== SourceLine 2472
                                            _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 948 <== SourceLine 2474
                                if(_VALUE((cs!=('Q')))) {
                                    new CLASS_PARSER_grammer_ParsErr((_CUR),186);
                                } else {
                                    // JavaLine 952 <== SourceLine 2475
                                    detach(2475);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 959 <== SourceLine 2477
                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_testSmcl_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 47: 
                    // JavaLine 965 <== SourceLine 2479
                    {
                        // JavaLine 967 <== SourceLine 2480
                        detach(2480);
                        ;
                        // JavaLine 970 <== SourceLine 2481
                        if(_VALUE((cs!=('Z')))) {
                            {
                                // JavaLine 973 <== SourceLine 2482
                                new CLASS_PARSER_grammer_skip((_CUR),185);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 980 <== SourceLine 2483
                        if(_VALUE((stmtwnt_1==(((char)2))))) {
                            new CLASS_PARSER_grammer_ParsErr((_CUR),216);
                        }
                        ;
                        // JavaLine 985 <== SourceLine 2485
                        if(_VALUE(((!(last_1.isblocklike))||((last_1.blockstatus==(((char)2))))))) {
                            // JavaLine 987 <== SourceLine 2487
                            {
                                // JavaLine 989 <== SourceLine 2488
                                new CLASS_PARSER_grammer_ParsErr((_CUR),289);
                                ;
                                last_1.blockstatus=((char)1);
                                ;
                            }
                        }
                        ;
                        // JavaLine 997 <== SourceLine 2489
                        last_1.stmttype=((char)3);
                        ;
                        // JavaLine 1000 <== SourceLine 2491
                        ((CLASS_PARSER)(_CUR._SL)).opn='?';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2491);
                        ;
                        // JavaLine 1005 <== SourceLine 2493
                        ((CLASS_PARSER)(_CUR._SL)).opn='q';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2493);
                        ;
                        // JavaLine 1010 <== SourceLine 2494
                        getopt=false;
                        ;
                        cs=((CLASS_PARSER)(_CUR._SL)).opt;
                        ;
                        // JavaLine 1015 <== SourceLine 2495
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                            new CLASS_PARSER_grammer_lookforstring((_CUR));
                        }
                        ;
                        // JavaLine 1020 <== SourceLine 2496
                        if(_VALUE((cs!=('R')))) {
                            new CLASS_PARSER_grammer_ParsErr((_CUR),190);
                        } else {
                            // JavaLine 1024 <== SourceLine 2497
                            {
                                _SIM_LABEL(18); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                detach(2497);
                            }
                        }
                        ;
                        // JavaLine 1031 <== SourceLine 2498
                        call(ex_1,2498);
                        ;
                        // JavaLine 1034 <== SourceLine 2499
                        if(_VALUE(ex_1.wasNotexpr)) {
                            new CLASS_PARSER_grammer_syntaxerror((_CUR),205);
                        } else {
                            // JavaLine 1038 <== SourceLine 2500
                            if(_VALUE(ex_1.NOTdesig)) {
                                new CLASS_PARSER_grammer_ParsErr((_CUR),191);
                            }
                        }
                        ;
                        // JavaLine 1044 <== SourceLine 2501
                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)144);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2501);
                        ;
                        // JavaLine 1049 <== SourceLine 2502
                        if(_VALUE((cs==('N')))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2480_SW1_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 1054 <== SourceLine 2503
                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)143);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2503);
                        ;
                        // JavaLine 1059 <== SourceLine 2504
                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2360_testSmcl_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 30: 
                    case 31: 
                    case 12: 
                    case 18: 
                    // JavaLine 1068 <== SourceLine 2506
                    {
                        // JavaLine 1070 <== SourceLine 2507
                        {
                            _SIM_LABEL(19); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            newstat_1=deList_1;
                        }
                        ;
                        // JavaLine 1076 <== SourceLine 2508
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_declaration)new CLASS_PARSER_grammer_declaration((_CUR))._START());
                        }
                        ;
                        // JavaLine 1081 <== SourceLine 2510
                        newstat_1.caller=last_1;
                        ;
                        last_1=last_1.next=newstat_1;
                        ;
                        // JavaLine 1086 <== SourceLine 2511
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 34: 
                    case 50: 
                    case 91: 
                    case 80: 
                    // JavaLine 1095 <== SourceLine 2513
                    {
                        // JavaLine 1097 <== SourceLine 2514
                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2272_XorB_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 32: 
                    // JavaLine 1103 <== SourceLine 2516
                    {
                        // JavaLine 1105 <== SourceLine 2517
                        last_1.stmttype=basicstmt_1;
                        ;
                        // JavaLine 1108 <== SourceLine 2519
                        newstat_1=exList_1;
                        ;
                        // JavaLine 1111 <== SourceLine 2520
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_blockOrComp)new CLASS_PARSER_grammer_blockOrComp((_CUR))._START());
                        }
                        ;
                        // JavaLine 1116 <== SourceLine 2521
                        if(_VALUE((!(labelused_1)))) {
                            {
                                // JavaLine 1119 <== SourceLine 2522
                                if(_VALUE(((stmtwnt_1!=(((char)5)))&&((stmtwnt_1!=(((char)3))))))) {
                                    // JavaLine 1121 <== SourceLine 2523
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 1128 <== SourceLine 2525
                        if(_VALUE((last_1.isblocklike&&((last_1.blockstatus==(((char)1))))))) {
                            // JavaLine 1130 <== SourceLine 2527
                            {
                                // JavaLine 1132 <== SourceLine 2528
                                last_1.blockstatus=((char)3);
                                ;
                                // JavaLine 1135 <== SourceLine 2529
                                if(_VALUE(((stmtwnt_1!=(((char)2)))||((!(((CLASS_PARSER)(_CUR._SL)).separatecomp)))))) {
                                    // JavaLine 1137 <== SourceLine 2530
                                    {
                                        ((CLASS_PARSER)(_CUR._SL)).opn='o';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2530);
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 1148 <== SourceLine 2533
                        newstat_1.caller=last_1;
                        ;
                        last_1=last_1.next=newstat_1;
                        ;
                        // JavaLine 1153 <== SourceLine 2534
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 56: 
                    // JavaLine 1159 <== SourceLine 2536
                    {
                        // JavaLine 1161 <== SourceLine 2538
                        newstat_1=whList_1;
                        ;
                        // JavaLine 1164 <== SourceLine 2539
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_whilstat)new CLASS_PARSER_grammer_whilstat((_CUR))._START());
                        }
                        ;
                        // JavaLine 1169 <== SourceLine 2540
                        _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 27: 
                    // JavaLine 1175 <== SourceLine 2542
                    {
                        // JavaLine 1177 <== SourceLine 2544
                        newstat_1=itList_1;
                        ;
                        // JavaLine 1180 <== SourceLine 2545
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_inspectstat)new CLASS_PARSER_grammer_inspectstat((_CUR))._START());
                        }
                        ;
                        // JavaLine 1185 <== SourceLine 2546
                        _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 87: 
                    // JavaLine 1191 <== SourceLine 2548
                    {
                        // JavaLine 1193 <== SourceLine 2550
                        newstat_1=((CLASS_PARSER_grammer_casestat)new CLASS_PARSER_grammer_casestat((_CUR))._START());
                        ;
                        // JavaLine 1196 <== SourceLine 2553
                        _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 19: 
                    // JavaLine 1202 <== SourceLine 2555
                    {
                        // JavaLine 1204 <== SourceLine 2557
                        newstat_1=foList_1;
                        ;
                        // JavaLine 1207 <== SourceLine 2558
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_forstat)new CLASS_PARSER_grammer_forstat((_CUR))._START());
                        }
                        ;
                        // JavaLine 1212 <== SourceLine 2559
                        _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 23: 
                    // JavaLine 1218 <== SourceLine 2561
                    {
                        // JavaLine 1220 <== SourceLine 2563
                        newstat_1=ifList_1;
                        ;
                        // JavaLine 1223 <== SourceLine 2564
                        if(_VALUE((newstat_1==(null)))) {
                            newstat_1=((CLASS_PARSER_grammer_ifstat)new CLASS_PARSER_grammer_ifstat((_CUR))._START());
                        }
                        ;
                        // JavaLine 1228 <== SourceLine 2565
                        _GOTO(_LABEL_CLASS_PARSER_grammer_MarkPush_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 21: 
                    // JavaLine 1234 <== SourceLine 2567
                    {
                        // JavaLine 1236 <== SourceLine 2570
                        new CLASS_PARSER_grammer_markStmt((_CUR));
                        ;
                        // JavaLine 1239 <== SourceLine 2571
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                            new CLASS_SCANNER_W0((_CUR._SL),new RTS_TXT("gotostat"));
                        }
                        ;
                        // JavaLine 1244 <== SourceLine 2572
                        last_1.stmttype=basicstmt_1;
                        ;
                        // JavaLine 1247 <== SourceLine 2573
                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)21);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2573);
                        ;
                        // JavaLine 1252 <== SourceLine 2574
                        detach(2574);
                        ;
                        // JavaLine 1255 <== SourceLine 2575
                        call(ex_1,2575);
                        ;
                        // JavaLine 1258 <== SourceLine 2576
                        if(_VALUE(ex_1.NOTdesig)) {
                            new CLASS_PARSER_grammer_syntaxerror((_CUR),191);
                        }
                        ;
                        // JavaLine 1263 <== SourceLine 2577
                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)128);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL)).coder,2577);
                        ;
                        // JavaLine 1268 <== SourceLine 2578
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 26: 
                    // JavaLine 1274 <== SourceLine 2580
                    {
                        // JavaLine 1276 <== SourceLine 2583
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                            new CLASS_SCANNER_W1((_CUR._SL),new RTS_TXT("innerstat"),RTS_ENVIRONMENT.rank(stmtwnt_1));
                        }
                        ;
                        // JavaLine 1281 <== SourceLine 2584
                        if(_VALUE((stmtwnt_1==(((char)4))))) {
                            {
                                // JavaLine 1284 <== SourceLine 2586
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2586_4509=((CLASS_PARSER_grammer_blockOrComp)(last_1));
                                    if(_inspect_2586_4509!=null) { // INSPECT _inspect_2586_4509  type=ref(BLOCKORCOMP)
                                        // JavaLine 1289 <== SourceLine 2587
                                        {
                                            // JavaLine 1291 <== SourceLine 2586
                                            {
                                                // JavaLine 1293 <== SourceLine 2587
                                                if(_VALUE(_inspect_2586_4509.innerseen_1)) {
                                                    new CLASS_PARSER_grammer_ParsErr((_CUR),203);
                                                } else {
                                                    // JavaLine 1297 <== SourceLine 2588
                                                    {
                                                        // JavaLine 1299 <== SourceLine 2589
                                                        _inspect_2586_4509.stmttype=basicstmt_1;
                                                        ;
                                                        // JavaLine 1302 <== SourceLine 2591
                                                        if(_VALUE((last_1.isblocklike&&((last_1.blockstatus==(((char)1))))))) {
                                                            // JavaLine 1304 <== SourceLine 2593
                                                            {
                                                                // JavaLine 1306 <== SourceLine 2594
                                                                last_1.blockstatus=((char)3);
                                                                ;
                                                                // JavaLine 1309 <== SourceLine 2597
                                                                ((CLASS_PARSER)(_CUR._SL)).opn='o';
                                                                ;
                                                                call(((CLASS_PARSER)(_CUR._SL)).coder,2597);
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 1317 <== SourceLine 2600
                                                        ((CLASS_PARSER)(_CUR._SL)).opn='Y';
                                                        ;
                                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2600);
                                                        ;
                                                        // JavaLine 1322 <== SourceLine 2603
                                                        ((CLASS_PARSER)(_CUR._SL)).opdlo=((((_inspect_2586_4509.blockstatus==(((char)2)))||(labelused_1)))?(((char)1)):(((char)0)));
                                                        ;
                                                        // JavaLine 1325 <== SourceLine 2605
                                                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)26);
                                                        ;
                                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2605);
                                                        ;
                                                        _inspect_2586_4509.innerseen_1=true;
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                            }
                        } else {
                            // JavaLine 1342 <== SourceLine 2608
                            new CLASS_PARSER_grammer_ParsWarn((_CUR),287);
                        }
                        ;
                        // JavaLine 1346 <== SourceLine 2609
                        detach(2609);
                        ;
                        // JavaLine 1349 <== SourceLine 2610
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 42: 
                    // JavaLine 1355 <== SourceLine 2612
                    {
                        // JavaLine 1357 <== SourceLine 2613
                        reac_1='B';
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2616_actv_0); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 48: 
                    // JavaLine 1364 <== SourceLine 2614
                    {
                        // JavaLine 1366 <== SourceLine 2616
                        reac_1='C';
                        ;
                        // JavaLine 1369 <== SourceLine 2617
                        {
                            _SIM_LABEL(20); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                            // JavaLine 1372 <== SourceLine 2618
                            new CLASS_PARSER_grammer_markStmt((_CUR));
                        }
                        ;
                        // JavaLine 1376 <== SourceLine 2619
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                            new CLASS_SCANNER_W0((_CUR._SL),new RTS_TXT("activate"));
                        }
                        ;
                        // JavaLine 1381 <== SourceLine 2620
                        last_1.stmttype=basicstmt_1;
                        ;
                        // JavaLine 1384 <== SourceLine 2621
                        {
                            // BEGIN INSPECTION 
                            _inspect_2621_4510=((CLASS_PARSER_codebuffer)new CLASS_PARSER_codebuffer((_CUR._SL),new RTS_TXT("$act$"))._START());
                            if(_inspect_2621_4510!=null) { // INSPECT _inspect_2621_4510  type=ref(CODEBUFFER)
                                // JavaLine 1389 <== SourceLine 2622
                                {
                                    // JavaLine 1391 <== SourceLine 2621
                                    {
                                        // JavaLine 1393 <== SourceLine 2622
                                        if(_VALUE(false)) {
                                            {
                                                // JavaLine 1396 <== SourceLine 2623
                                                {
                                                    _SIM_LABEL(21); // DeclaredIn: grammer -> grammer[CLASS_PARSER_grammer] DeclarationKind=Class
                                                    new CLASS_PARSER_grammer_syntaxerror((_CUR),205);
                                                }
                                                ;
                                                _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                        // JavaLine 1406 <== SourceLine 2624
                                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)129);
                                        ;
                                        call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2624);
                                        ;
                                        // JavaLine 1411 <== SourceLine 2625
                                        ((CLASS_PARSER_grammer)(_CUR)).detach();
                                        ;
                                        call(ex_1,2625);
                                        ;
                                        // JavaLine 1416 <== SourceLine 2626
                                        if(_VALUE(ex_1.wasNotexpr)) {
                                            _GOTO(_LABEL_CLASS_PARSER_grammer_Block2616_Block2622_Block2623_actError_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 1421 <== SourceLine 2627
                                        ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                        ;
                                        call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2627);
                                        ;
                                        // JavaLine 1426 <== SourceLine 2628
                                        ((CLASS_PARSER)(_CUR._SL)).opn=((char)138);
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL)).opdlo=reac_1;
                                        ;
                                        // JavaLine 1431 <== SourceLine 2629
                                        ((CLASS_PARSER)(_CUR._SL)).optx=((char)1);
                                        ;
                                        call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2629);
                                        ;
                                        // JavaLine 1436 <== SourceLine 2630
                                        if(_VALUE(((cs==('+'))|((cs==(((char)39))))))) {
                                            {
                                                // JavaLine 1439 <== SourceLine 2631
                                                ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                                ;
                                                call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2631);
                                                ;
                                                // JavaLine 1444 <== SourceLine 2632
                                                ((CLASS_PARSER)(_CUR._SL)).opn=((char)138);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL)).opdlo=(((cs==(((char)39))))?('B'):('C'));
                                                ;
                                                // JavaLine 1449 <== SourceLine 2633
                                                ((CLASS_PARSER)(_CUR._SL)).optx=((char)1);
                                                ;
                                                call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2633);
                                                ;
                                                // JavaLine 1454 <== SourceLine 2634
                                                ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                                ;
                                                call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2634);
                                                ;
                                                // JavaLine 1459 <== SourceLine 2635
                                                ((CLASS_PARSER_grammer)(_CUR)).detach();
                                                ;
                                                call(ex_1,2635);
                                                ;
                                                // JavaLine 1464 <== SourceLine 2636
                                                if(_VALUE(ex_1.wasNotexpr)) {
                                                    _GOTO(_LABEL_CLASS_PARSER_grammer_Block2616_Block2622_Block2623_actError_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 1469 <== SourceLine 2637
                                                ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                                ;
                                                call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2637);
                                                ;
                                                // JavaLine 1474 <== SourceLine 2638
                                                ((CLASS_PARSER)(_CUR._SL)).opn=((char)138);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL)).opdlo=(((cs==('&')))?('B'):('C'));
                                                ;
                                                // JavaLine 1479 <== SourceLine 2639
                                                ((CLASS_PARSER)(_CUR._SL)).optx=((char)1);
                                                ;
                                                call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2639);
                                                ;
                                                // JavaLine 1484 <== SourceLine 2640
                                                ((CLASS_PARSER)(_CUR._SL)).simsymbol=new RTS_TXT("\u005f\u005f2");
                                                ;
                                            }
                                        } else {
                                            // JavaLine 1489 <== SourceLine 2642
                                            if(_VALUE(((cs==(','))|((cs==('5')))))) {
                                                {
                                                    // JavaLine 1492 <== SourceLine 2643
                                                    ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                                    ;
                                                    call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2643);
                                                    ;
                                                    // JavaLine 1497 <== SourceLine 2644
                                                    ((CLASS_PARSER)(_CUR._SL)).opn=((char)138);
                                                    ;
                                                    ((CLASS_PARSER)(_CUR._SL)).opdlo=(((cs==('5')))?('B'):('C'));
                                                    ;
                                                    // JavaLine 1502 <== SourceLine 2645
                                                    ((CLASS_PARSER)(_CUR._SL)).optx=((char)1);
                                                    ;
                                                    call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2645);
                                                    ;
                                                    // JavaLine 1507 <== SourceLine 2646
                                                    ((CLASS_PARSER)(_CUR._SL)).opn='N';
                                                    ;
                                                    call(((CLASS_PARSER_codebuffer)_inspect_2621_4510),2646);
                                                    ;
                                                    // JavaLine 1512 <== SourceLine 2647
                                                    ((CLASS_PARSER_grammer)(_CUR)).detach();
                                                    ;
                                                    call(ex_1,2647);
                                                    ;
                                                    // JavaLine 1517 <== SourceLine 2648
                                                    if(_VALUE(ex_1.wasNotexpr)) {
                                                        _GOTO(_LABEL_CLASS_PARSER_grammer_Block2616_Block2622_Block2623_actError_0); // GOTO EVALUATED LABEL
                                                    }
                                                    ;
                                                    // JavaLine 1522 <== SourceLine 2649
                                                    ((CLASS_PARSER)(_CUR._SL)).simsymbol=new RTS_TXT("\u005f\u005f1");
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 1527 <== SourceLine 2651
                                                {
                                                    // JavaLine 1529 <== SourceLine 2652
                                                    ((CLASS_PARSER)(_CUR._SL)).simsymbol=new RTS_TXT("\u005f\u005f3");
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 1536 <== SourceLine 2654
                                        new CLASS_COMMON_DEFIDENT((_CUR._SL));
                                        ;
                                        _inspect_2621_4510.curelt_4=_inspect_2621_4510.firstelt_4.next;
                                        ;
                                        // JavaLine 1541 <== SourceLine 2655
                                        _inspect_2621_4510.curelt_4.opdhii=((CLASS_PARSER)(_CUR._SL)).hashhi;
                                        ;
                                        _inspect_2621_4510.curelt_4.opdloo=((CLASS_PARSER)(_CUR._SL)).hashlo;
                                        ;
                                        // JavaLine 1546 <== SourceLine 2656
                                        new CLASS_PARSER_codebuffer_terminate(_inspect_2621_4510);
                                        ;
                                        // JavaLine 1549 <== SourceLine 2657
                                        ((CLASS_PARSER)(_CUR._SL)).opn='b';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2657);
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL)).opn='z';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2657);
                                        ;
                                        // JavaLine 1558 <== SourceLine 2658
                                        if(_VALUE((cs==('&')))) {
                                            // JavaLine 1560 <== SourceLine 2659
                                            ((CLASS_PARSER_grammer)(_CUR)).detach();
                                        }
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                        // JavaLine 1569 <== SourceLine 2661
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 16: 
                    // JavaLine 1575 <== SourceLine 2663
                    {
                        // JavaLine 1577 <== SourceLine 2664
                        if(_VALUE((last_1.isblocklike&&((last_1.blockstatus==(((char)1))))))) {
                            // JavaLine 1579 <== SourceLine 2666
                            {
                                // JavaLine 1581 <== SourceLine 2667
                                last_1.blockstatus=((char)3);
                                ;
                                // JavaLine 1584 <== SourceLine 2668
                                if(_VALUE(((stmtwnt_1!=(((char)2)))||((!(((CLASS_PARSER)(_CUR._SL)).separatecomp)))))) {
                                    // JavaLine 1586 <== SourceLine 2669
                                    {
                                        ((CLASS_PARSER)(_CUR._SL)).opn='o';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL)).coder,2669);
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 1597 <== SourceLine 2674
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 0: 
                    // JavaLine 1603 <== SourceLine 2676
                    {
                        // JavaLine 1605 <== SourceLine 2677
                        new CLASS_PARSER_grammer_NEXTSYMBOL((_CUR));
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_BlockHead_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    default:
                    // JavaLine 1613 <== SourceLine 2689
                    {
                        // JavaLine 1615 <== SourceLine 2691
                        new CLASS_PARSER_grammer_ParsErr((_CUR),202);
                        ;
                        cs='O';
                        ;
                        // JavaLine 1620 <== SourceLine 2692
                        _GOTO(_LABEL_CLASS_PARSER_grammer_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 1627 <== SourceLine 2696
                // BEGIN grammer INNER PART
                // ENDOF grammer INNER PART
                // ENDOF component INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 grammer",1,125,11,2245,13,2257,15,2259,17,2265,19,2294,21,2328,23,2351,25,2367,27,2394,29,2410,31,2429,33,2436,35,2452,37,2463,39,2464,41,2470,43,2471,45,2497,47,2507,49,2618,51,2623,54,138,57,139,63,140,65,141,67,142,69,143,71,144,73,145,75,147,77,148,79,149,81,150,83,151,85,152,87,154,89,155,91,157,93,158,95,166,97,167,99,168,101,169,103,170,105,173,107,174,109,175,111,177,113,178,115,179,117,182,119,183,121,184,123,186,125,187,127,191,129,192,131,193,133,196,135,197,137,198,139,226,141,2586,143,2621,150,157,152,158,165,864,167,2237,170,2238,173,2239,178,2241,181,2242,184,2244,187,2245,189,2248,191,2249,194,2250,203,2253,208,2256,211,2257,217,2259,223,2260,226,2261,233,2262,238,2264,241,2265,247,2266,255,2267,257,2269,263,2271,265,2272,270,2273,274,2275,282,2276,284,2277,287,2278,289,2280,291,2281,294,2282,302,2287,305,2288,310,2289,315,2290,322,2293,325,2294,327,2296,329,2297,332,2298,341,2301,346,2304,349,2306,354,2307,357,2308,361,2312,363,2313,366,2314,369,2316,377,2318,380,2319,385,2320,388,2322,393,2323,399,2324,401,2325,410,2326,412,2328,417,2329,422,2330,427,2331,430,2332,437,2334,442,2335,447,2336,453,2338,455,2340,458,2341,463,2342,468,2343,471,2344,477,2346,482,2347,487,2348,493,2350,495,2351,503,2353,513,2356,526,2359,528,2360,531,2362,534,2363,539,2364,544,2365,554,2367,566,2369,568,2371,570,2372,578,2373,581,2377,586,2378,591,2379,595,2380,598,2381,601,2382,608,2383,613,2384,616,2385,623,2386,630,2388,633,2389,638,2392,643,2394,651,2395,658,2396,661,2397,668,2398,675,2400,678,2401,681,2402,684,2403,687,2404,694,2405,697,2408,700,2410,706,2412,711,2413,714,2414,724,2416,727,2417,729,2418,733,2419,738,2420,746,2422,759,2424,762,2425,769,2426,772,2427,775,2429,779,2430,784,2431,790,2433,792,2434,797,2435,800,2436,802,2438,804,2439,813,2440,816,2442,821,2444,824,2445,831,2446,834,2447,837,2448,840,2449,843,2450,846,2451,853,2452,861,2453,866,2454,871,2455,874,2456,877,2457,880,2458,888,2459,892,2460,898,2463,903,2464,908,2465,918,2467,925,2469,927,2470,933,2471,941,2472,948,2474,952,2475,959,2477,965,2479,967,2480,970,2481,973,2482,980,2483,985,2485,987,2487,989,2488,997,2489,1000,2491,1005,2493,1010,2494,1015,2495,1020,2496,1024,2497,1031,2498,1034,2499,1038,2500,1044,2501,1049,2502,1054,2503,1059,2504,1068,2506,1070,2507,1076,2508,1081,2510,1086,2511,1095,2513,1097,2514,1103,2516,1105,2517,1108,2519,1111,2520,1116,2521,1119,2522,1121,2523,1128,2525,1130,2527,1132,2528,1135,2529,1137,2530,1148,2533,1153,2534,1159,2536,1161,2538,1164,2539,1169,2540,1175,2542,1177,2544,1180,2545,1185,2546,1191,2548,1193,2550,1196,2553,1202,2555,1204,2557,1207,2558,1212,2559,1218,2561,1220,2563,1223,2564,1228,2565,1234,2567,1236,2570,1239,2571,1244,2572,1247,2573,1252,2574,1255,2575,1258,2576,1263,2577,1268,2578,1274,2580,1276,2583,1281,2584,1284,2586,1289,2587,1291,2586,1293,2587,1297,2588,1299,2589,1302,2591,1304,2593,1306,2594,1309,2597,1317,2600,1322,2603,1325,2605,1342,2608,1346,2609,1349,2610,1355,2612,1357,2613,1364,2614,1366,2616,1369,2617,1372,2618,1376,2619,1381,2620,1384,2621,1389,2622,1391,2621,1393,2622,1396,2623,1406,2624,1411,2625,1416,2626,1421,2627,1426,2628,1431,2629,1436,2630,1439,2631,1444,2632,1449,2633,1454,2634,1459,2635,1464,2636,1469,2637,1474,2638,1479,2639,1484,2640,1489,2642,1492,2643,1497,2644,1502,2645,1507,2646,1512,2647,1517,2648,1522,2649,1527,2651,1529,2652,1536,2654,1541,2655,1546,2656,1549,2657,1558,2658,1560,2659,1569,2661,1575,2663,1577,2664,1579,2666,1581,2667,1584,2668,1586,2669,1597,2674,1603,2676,1605,2677,1613,2689,1615,2691,1620,2692,1627,2696,1640,2696);
} // End of Class
