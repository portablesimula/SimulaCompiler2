// JavaLine 1 <== SourceLine 522
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class SCANNER_recognizer extends COMMON_component {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=522, lastLine=1552, hasLocalClasses=true, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1051
    final RTS_LABEL _LABEL_SCANNER_recognizer_NxtChar_1=new RTS_LABEL(this,1,1,"NxtChar"); // Local Label #1=NxtChar At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1055
    final RTS_LABEL _LABEL_SCANNER_recognizer_ReadPC_1=new RTS_LABEL(this,1,2,"ReadPC"); // Local Label #2=ReadPC At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1057
    final RTS_LABEL _LABEL_SCANNER_recognizer_ParserC_1=new RTS_LABEL(this,1,3,"ParserC"); // Local Label #3=ParserC At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1068
    final RTS_LABEL _LABEL_SCANNER_recognizer_ASSESS_1=new RTS_LABEL(this,1,4,"ASSESS"); // Local Label #4=ASSESS At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1186
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1227_QUOTE_0=new RTS_LABEL(this,1,5,"QUOTE"); // Local Label #5=QUOTE At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1188
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1227_QREP1_0=new RTS_LABEL(this,1,6,"QREP1"); // Local Label #6=QREP1 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 1202
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1227_CompoundStatement1204_QWARN_0=new RTS_LABEL(this,1,7,"QWARN"); // Local Label #7=QWARN At PrefixLevel 1
    // JavaLine 25 <== SourceLine 1251
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1287_numr_0=new RTS_LABEL(this,1,8,"numr"); // Local Label #8=numr At PrefixLevel 1
    // JavaLine 27 <== SourceLine 1255
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1259_ndot_0=new RTS_LABEL(this,1,9,"ndot"); // Local Label #9=ndot At PrefixLevel 1
    // JavaLine 29 <== SourceLine 1262
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1283_nampsand_0=new RTS_LABEL(this,1,10,"nampsand"); // Local Label #10=nampsand At PrefixLevel 1
    // JavaLine 31 <== SourceLine 1277
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1283_CompoundStatement1282_numERR_0=new RTS_LABEL(this,1,11,"numERR"); // Local Label #11=numERR At PrefixLevel 1
    // JavaLine 33 <== SourceLine 1295
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_idscan_0=new RTS_LABEL(this,1,12,"idscan"); // Local Label #12=idscan At PrefixLevel 1
    // JavaLine 35 <== SourceLine 1297
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_idloop_0=new RTS_LABEL(this,1,13,"idloop"); // Local Label #13=idloop At PrefixLevel 1
    // JavaLine 37 <== SourceLine 1304
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_Lidi_0=new RTS_LABEL(this,1,14,"Lidi"); // Local Label #14=Lidi At PrefixLevel 1
    // JavaLine 39 <== SourceLine 1310
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1312_idterm_0=new RTS_LABEL(this,1,15,"idterm"); // Local Label #15=idterm At PrefixLevel 1
    // JavaLine 41 <== SourceLine 1356
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_IdentifierFound_0=new RTS_LABEL(this,1,16,"IdentifierFound"); // Local Label #16=IdentifierFound At PrefixLevel 1
    // JavaLine 43 <== SourceLine 1357
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_SAWRID_0=new RTS_LABEL(this,1,17,"SAWRID"); // Local Label #17=SAWRID At PrefixLevel 1
    // JavaLine 45 <== SourceLine 1359
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_RESKW_0=new RTS_LABEL(this,1,18,"RESKW"); // Local Label #18=RESKW At PrefixLevel 1
    // JavaLine 47 <== SourceLine 1360
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_OPERAND_0=new RTS_LABEL(this,1,19,"OPERAND"); // Local Label #19=OPERAND At PrefixLevel 1
    // JavaLine 49 <== SourceLine 1361
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_OPERAND2_0=new RTS_LABEL(this,1,20,"OPERAND2"); // Local Label #20=OPERAND2 At PrefixLevel 1
    // JavaLine 51 <== SourceLine 1370
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1376_SawComment_0=new RTS_LABEL(this,1,21,"SawComment"); // Local Label #21=SawComment At PrefixLevel 1
    // JavaLine 53 <== SourceLine 1459
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_FindEnd_0=new RTS_LABEL(this,1,22,"FindEnd"); // Local Label #22=FindEnd At PrefixLevel 1
    // JavaLine 55 <== SourceLine 1460
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_CompoundStatement1466_SawSMCL_0=new RTS_LABEL(this,1,23,"SawSMCL"); // Local Label #23=SawSMCL At PrefixLevel 1
    // JavaLine 57 <== SourceLine 1498
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_TESTENDCOUNT_0=new RTS_LABEL(this,1,24,"TESTENDCOUNT"); // Local Label #24=TESTENDCOUNT At PrefixLevel 1
    // JavaLine 59 <== SourceLine 1509
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1542_SawKeyW_0=new RTS_LABEL(this,1,25,"SawKeyW"); // Local Label #25=SawKeyW At PrefixLevel 1
    // JavaLine 61 <== SourceLine 1546
    final RTS_LABEL _LABEL_SCANNER_recognizer_CompoundStatement1546_Mill_0=new RTS_LABEL(this,1,26,"Mill"); // Local Label #26=Mill At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 64 <== SourceLine 528
    public boolean skipzeroes_1=false;
    // JavaLine 66 <== SourceLine 529
    public char atom_1=0;
    // JavaLine 68 <== SourceLine 530
    public char nxtsym_1=0;
    // JavaLine 70 <== SourceLine 531
    public char curidhi_1=0;
    public char curidlo_1=0;
    // JavaLine 73 <== SourceLine 532
    public int hashpos_1=0;
    // JavaLine 75 <== SourceLine 533
    public int linepos_1=0;
    // JavaLine 77 <== SourceLine 534
    public int linelength_1=0;
    // JavaLine 79 <== SourceLine 535
    public int opdpos_1=0;
    // JavaLine 81 <== SourceLine 536
    public int optpos_1=0;
    // JavaLine 83 <== SourceLine 537
    public int ampcount_1=0;
    // JavaLine 85 <== SourceLine 538
    public int textpos_1=0;
    // JavaLine 87 <== SourceLine 539
    public int eqopt_1=0;
    // JavaLine 89 <== SourceLine 540
    public int opdline_1=0;
    // JavaLine 91 <== SourceLine 541
    public int i_1=0;
    // JavaLine 93 <== SourceLine 542
    public int startpos_1=0;
    // JavaLine 95 <== SourceLine 543
    public int startline_1=0;
    // JavaLine 97 <== SourceLine 544
    public RTS_TXT hashbuf_1=null;
    // JavaLine 99 <== SourceLine 545
    public RTS_TXT line_1=null;
    // JavaLine 101 <== SourceLine 546
    public RTS_TXT curtitle_1=null;
    // JavaLine 103 <== SourceLine 547
    public RTS_TXT tempt_1=null;
    // JavaLine 105 <== SourceLine 620
    public RTS_CHARACTER_ARRAY InputClass=null;
    // JavaLine 107 <== SourceLine 898
    public SCANNER_recognizer_identifierScanner IdScanner_1=null;
    // JavaLine 109 <== SourceLine 935
    public SCANNER_recognizer_unsignedInteger unsignedInt_1=null;
    // JavaLine 111 <== SourceLine 1057
    public COMMON_component _inspect_1057_4474_1=null;
    // JavaLine 113 <== SourceLine 1447
    public COMMON_component _inspect_1447_4475_1=null;
    // JavaLine 115 <== SourceLine 1520
    public COMMON_component _inspect_1520_4476_1=null;
    // Normal Constructor
    public SCANNER_recognizer(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 122 <== SourceLine 620
        InputClass=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,255));
    }
    // Class Statements
    @Override
    public SCANNER_recognizer _STM() {
        SCANNER_recognizer _THIS=(SCANNER_recognizer)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,26); // For ByteCode Engineering
                // JavaLine 132 <== SourceLine 864
                // BEGIN INNER PART
                // JavaLine 134 <== SourceLine 1049
                detach(1049);
                ;
                // JavaLine 137 <== SourceLine 1050
                new SCANNER_recognizer_nextLine((_CUR));
                ;
                _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 142 <== SourceLine 1051
                {
                    _SIM_LABEL(1); // DeclaredIn: recognizer
                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                }
                ;
                linepos_1=(linepos_1+(1));
                ;
                // JavaLine 150 <== SourceLine 1052
                if(_VALUE((linepos_1>(linelength_1)))) {
                    new ERRMSG_internerr((_CUR._SL),((char)2),1052);
                }
                ;
                // JavaLine 155 <== SourceLine 1053
                _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 158 <== SourceLine 1055
                {
                    _SIM_LABEL(2); // DeclaredIn: recognizer
                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                }
                ;
                linepos_1=(linepos_1+(1));
                ;
                // JavaLine 166 <== SourceLine 1056
                if(_VALUE((linepos_1>(linelength_1)))) {
                    new ERRMSG_internerr((_CUR._SL),((char)2),1056);
                }
                ;
                // JavaLine 171 <== SourceLine 1057
                {
                    _SIM_LABEL(3); // DeclaredIn: recognizer
                    {
                        // BEGIN INSPECTION 
                        _inspect_1057_4474_1=((SCANNER)(_CUR._SL)).parser;
                        if(_inspect_1057_4474_1!=null) { // INSPECT _inspect_1057_4474_1
                            // JavaLine 178 <== SourceLine 1058
                            {
                                // JavaLine 180 <== SourceLine 1057
                                {
                                    // JavaLine 182 <== SourceLine 1058
                                    _inspect_1057_4474_1.getopt=true;
                                    ;
                                    // JavaLine 185 <== SourceLine 1059
                                    if(_VALUE((((SCANNER)(_CUR._SL)).optx==(((char)0))))) {
                                        {
                                            _inspect_1057_4474_1.cs=((SCANNER)(_CUR._SL)).opt;
                                            ;
                                            _inspect_1057_4474_1.getopt=false;
                                        }
                                    }
                                    ;
                                    // JavaLine 194 <== SourceLine 1061
                                    if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('1'))!=(((char)0))))) {
                                        new SCANNER_dump((_CUR._SL),new RTS_TXT("scanner:"));
                                    }
                                    ;
                                    // JavaLine 199 <== SourceLine 1062
                                    if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 201 <== SourceLine 1063
                                        new SCANNER_W1((_CUR._SL),CONC(new RTS_TXT("NEXT:"),((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1057_4474_1.cs))),RTS_ENVIRONMENT.rank(_inspect_1057_4474_1.cs));
                                    }
                                    ;
                                    // JavaLine 205 <== SourceLine 1064
                                    call(((COMMON_component)_inspect_1057_4474_1),1064);
                                    ;
                                    // JavaLine 208 <== SourceLine 1065
                                    ((SCANNER)(_CUR._SL)).opt=((SCANNER)(_CUR._SL)).optx=((SCANNER)(_CUR._SL)).opdhi=((SCANNER)(_CUR._SL)).opdlo=((char)0);
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
                // JavaLine 217 <== SourceLine 1068
                {
                    _SIM_LABEL(4); // DeclaredIn: recognizer
                    optpos_1=linepos_1;
                }
                ;
                // JavaLine 223 <== SourceLine 1070
                if(atom_1<((char)0) || atom_1>((char)255)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(atom_1) { // BEGIN SWITCH STATEMENT
                    case 59: 
                    // JavaLine 227 <== SourceLine 1072
                    {
                        // JavaLine 229 <== SourceLine 1073
                        ((SCANNER)(_CUR._SL)).opt='O';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 7: 
                    // JavaLine 236 <== SourceLine 1076
                    {
                        // JavaLine 238 <== SourceLine 1077
                        if(_VALUE((linepos_1==(linelength_1)))) {
                            {
                                new SCANNER_recognizer_nextLine((_CUR));
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 247 <== SourceLine 1078
                        new SCANNER_recognizer_illegalChar((_CUR));
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_NxtChar_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 58: 
                    // JavaLine 254 <== SourceLine 1080
                    {
                        // JavaLine 256 <== SourceLine 1081
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 259 <== SourceLine 1083
                        if(_VALUE((atom_1==('=')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt='R';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 268 <== SourceLine 1084
                        if(_VALUE((atom_1==('-')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt='S';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 277 <== SourceLine 1085
                        ((SCANNER)(_CUR._SL)).opt='M';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 44: 
                    // JavaLine 284 <== SourceLine 1087
                    {
                        // JavaLine 286 <== SourceLine 1088
                        ((SCANNER)(_CUR._SL)).opt='N';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 40: 
                    // JavaLine 293 <== SourceLine 1090
                    {
                        // JavaLine 295 <== SourceLine 1091
                        ((SCANNER)(_CUR._SL)).opt='P';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 41: 
                    // JavaLine 302 <== SourceLine 1093
                    {
                        // JavaLine 304 <== SourceLine 1094
                        ((SCANNER)(_CUR._SL)).opt='Q';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 46: 
                    // JavaLine 311 <== SourceLine 1096
                    {
                        // JavaLine 313 <== SourceLine 1097
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 316 <== SourceLine 1099
                        if(_VALUE((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))==(((char)2))))) {
                            {
                                // JavaLine 319 <== SourceLine 1100
                                if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                    new SCANNER_recognizer_OperandToParser((_CUR));
                                }
                                ;
                                // JavaLine 324 <== SourceLine 1101
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1259_ndot_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 329 <== SourceLine 1102
                        ((SCANNER)(_CUR._SL)).opt='L';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 33: 
                    // JavaLine 337 <== SourceLine 1104
                    {
                        // JavaLine 339 <== SourceLine 1105
                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1376_SawComment_0); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 38: 
                    // JavaLine 344 <== SourceLine 1107
                    {
                        // JavaLine 346 <== SourceLine 1108
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 349 <== SourceLine 1110
                        if(_VALUE(((((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))==(((char)2)))||((atom_1==('&'))))||((atom_1==('-'))))||((atom_1==('+')))))) {
                            // JavaLine 351 <== SourceLine 1112
                            {
                                // JavaLine 353 <== SourceLine 1113
                                if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                    new SCANNER_recognizer_OperandToParser((_CUR));
                                }
                                ;
                                // JavaLine 358 <== SourceLine 1114
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1283_nampsand_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 363 <== SourceLine 1115
                        ((SCANNER)(_CUR._SL)).opt='T';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 42: 
                    // JavaLine 371 <== SourceLine 1117
                    {
                        // JavaLine 373 <== SourceLine 1118
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 376 <== SourceLine 1120
                        if(_VALUE((atom_1==('*')))) {
                            ((SCANNER)(_CUR._SL)).opt='J';
                        } else {
                            // JavaLine 380 <== SourceLine 1121
                            {
                                ((SCANNER)(_CUR._SL)).opt='H';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                    }
                    break;
                    case 43: 
                    // JavaLine 391 <== SourceLine 1125
                    {
                        // JavaLine 393 <== SourceLine 1126
                        ((SCANNER)(_CUR._SL)).opt='F';
                        ;
                    }
                    break;
                    case 45: 
                    // JavaLine 399 <== SourceLine 1129
                    {
                        // JavaLine 401 <== SourceLine 1130
                        ((SCANNER)(_CUR._SL)).opt='G';
                        ;
                        // JavaLine 404 <== SourceLine 1131
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 407 <== SourceLine 1133
                        if(_VALUE((atom_1==('-')))) {
                            {
                                // JavaLine 410 <== SourceLine 1134
                                if(_VALUE((!(((SCANNER)(_CUR._SL)).SportOK)))) {
                                    new SCANNER_P1warn((_CUR._SL),233);
                                }
                                ;
                                // JavaLine 415 <== SourceLine 1135
                                new SCANNER_recognizer_nextLine((_CUR));
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 423 <== SourceLine 1137
                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 47: 
                    // JavaLine 429 <== SourceLine 1140
                    {
                        // JavaLine 431 <== SourceLine 1141
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 434 <== SourceLine 1143
                        if(_VALUE((atom_1!=('/')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt='I';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 443 <== SourceLine 1144
                        ((SCANNER)(_CUR._SL)).opt='K';
                    }
                    break;
                    case 60: 
                    // JavaLine 448 <== SourceLine 1147
                    {
                        // JavaLine 450 <== SourceLine 1148
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 453 <== SourceLine 1150
                        if(_VALUE((atom_1==('>')))) {
                            ((SCANNER)(_CUR._SL)).opt='=';
                        } else {
                            // JavaLine 457 <== SourceLine 1151
                            if(_VALUE((atom_1!=('=')))) {
                                {
                                    ((SCANNER)(_CUR._SL)).opt='9';
                                    ;
                                    _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                }
                            } else {
                                // JavaLine 465 <== SourceLine 1152
                                ((SCANNER)(_CUR._SL)).opt=';';
                            }
                        }
                        ;
                    }
                    break;
                    case 61: 
                    // JavaLine 473 <== SourceLine 1154
                    {
                        // JavaLine 475 <== SourceLine 1155
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 478 <== SourceLine 1158
                        if(_VALUE((atom_1==('=')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt='D';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 487 <== SourceLine 1159
                        if(_VALUE((atom_1!=('/')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt=':';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 496 <== SourceLine 1160
                        ((SCANNER)(_CUR._SL)).opt='E';
                        ;
                        // JavaLine 499 <== SourceLine 1161
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 502 <== SourceLine 1163
                        if(_VALUE((atom_1!=('=')))) {
                            {
                                new SCANNER_P1warn((_CUR._SL),273);
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                    }
                    break;
                    case 62: 
                    // JavaLine 514 <== SourceLine 1166
                    {
                        // JavaLine 516 <== SourceLine 1167
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 519 <== SourceLine 1169
                        if(_VALUE((atom_1!=('=')))) {
                            {
                                ((SCANNER)(_CUR._SL)).opt='<';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 528 <== SourceLine 1170
                        ((SCANNER)(_CUR._SL)).opt='>';
                    }
                    break;
                    case 0: 
                    case 127: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 32: 
                    // JavaLine 541 <== SourceLine 1179
                    _GOTO(_LABEL_SCANNER_recognizer_NxtChar_1); // GOTO EVALUATED LABEL
                    break;
                    case 34: 
                    // JavaLine 545 <== SourceLine 1183
                    {
                        // JavaLine 547 <== SourceLine 1184
                        if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                            new SCANNER_recognizer_OperandToParser((_CUR));
                        }
                        ;
                        // JavaLine 552 <== SourceLine 1185
                        opdline_1=((SCANNER)(_CUR._SL)).linenr;
                        ;
                        textpos_1=0;
                        ;
                        // JavaLine 557 <== SourceLine 1186
                        {
                            _SIM_LABEL(5); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            startpos_1=linepos_1;
                        }
                        ;
                        i_1=textpos_1;
                        ;
                        // JavaLine 565 <== SourceLine 1187
                        {
                            _SIM_LABEL(6); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            // JavaLine 568 <== SourceLine 1188
                            atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                        }
                        ;
                        linepos_1=(linepos_1+(1));
                        ;
                        // JavaLine 574 <== SourceLine 1189
                        if(_VALUE((atom_1!=('"')))) {
                            {
                                // JavaLine 577 <== SourceLine 1190
                                if(_VALUE(((atom_1!=(((char)7)))||((linepos_1<(linelength_1)))))) {
                                    {
                                        // JavaLine 580 <== SourceLine 1191
                                        if(_VALUE((atom_1==('!')))) {
                                            new SCANNER_recognizer_ISOcode((_CUR));
                                        }
                                        ;
                                        // JavaLine 585 <== SourceLine 1192
                                        RTS_ENVIRONMENT.storeChar(atom_1,hashbuf_1,textpos_1);
                                        ;
                                        textpos_1=(textpos_1+(1));
                                        ;
                                        // JavaLine 590 <== SourceLine 1193
                                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1227_QREP1_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 595 <== SourceLine 1196
                                linepos_1=startpos_1;
                                ;
                                textpos_1=i_1;
                                ;
                                // JavaLine 600 <== SourceLine 1197
                                while((linepos_1<(linelength_1))) {
                                    {
                                        // JavaLine 603 <== SourceLine 1198
                                        atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                        ;
                                        linepos_1=(linepos_1+(1));
                                        ;
                                        // JavaLine 608 <== SourceLine 1199
                                        if(_VALUE(((atom_1==(')'))|((atom_1==(';')))))) {
                                            _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1227_CompoundStatement1204_QWARN_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 613 <== SourceLine 1200
                                        textpos_1=(textpos_1+(1));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 619 <== SourceLine 1202
                                {
                                    _SIM_LABEL(7); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                    new SCANNER_P1warn((_CUR._SL),275);
                                }
                                ;
                            }
                        } else {
                            // JavaLine 627 <== SourceLine 1204
                            {
                                // JavaLine 629 <== SourceLine 1205
                                new SCANNER_recognizer_scanahead((_CUR));
                                ;
                                // JavaLine 632 <== SourceLine 1207
                                if(_VALUE((atom_1==('"')))) {
                                    {
                                        // JavaLine 635 <== SourceLine 1208
                                        RTS_ENVIRONMENT.storeChar(atom_1,hashbuf_1,textpos_1);
                                        ;
                                        textpos_1=(textpos_1+(1));
                                        ;
                                        // JavaLine 640 <== SourceLine 1209
                                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1227_QUOTE_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 648 <== SourceLine 1211
                        new SCANNER_recognizer_ScanPastFormat((_CUR));
                        ;
                        // JavaLine 651 <== SourceLine 1212
                        if(_VALUE((atom_1==('"')))) {
                            {
                                // JavaLine 654 <== SourceLine 1213
                                if(_VALUE(((RTS_TXT.length(hashbuf_1)-(textpos_1))<(80)))) {
                                    {
                                        // JavaLine 657 <== SourceLine 1215
                                        tempt_1=RTS_ENVIRONMENT.blanks(80);
                                        ;
                                        hashbuf_1=CONC(hashbuf_1,tempt_1);
                                    }
                                }
                                ;
                                // JavaLine 664 <== SourceLine 1216
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1227_QUOTE_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 670 <== SourceLine 1218
                        ((SCANNER)(_CUR._SL)).optx=((char)8);
                        ;
                        ((SCANNER)(_CUR._SL)).parser.cs='[';
                        ;
                        // JavaLine 675 <== SourceLine 1219
                        if(_VALUE((textpos_1==(0)))) {
                            ((SCANNER)(_CUR._SL)).opdlo='A';
                        } else {
                            // JavaLine 679 <== SourceLine 1220
                            {
                                // JavaLine 681 <== SourceLine 1221
                                ((SCANNER)(_CUR._SL)).simsymbol=RTS_TXT.sub(hashbuf_1,1,textpos_1);
                                ;
                                // JavaLine 684 <== SourceLine 1222
                                new COMMON_DEFCONST((_CUR._SL));
                                ;
                                // JavaLine 687 <== SourceLine 1223
                                ((SCANNER)(_CUR._SL)).opdhi=((SCANNER)(_CUR._SL)).hashhi;
                                ;
                                ((SCANNER)(_CUR._SL)).opdlo=((SCANNER)(_CUR._SL)).hashlo;
                                ;
                                // JavaLine 692 <== SourceLine 1224
                                if(_VALUE((RTS_TXT.length(hashbuf_1)>(80)))) {
                                    hashbuf_1=RTS_ENVIRONMENT.blanks(80);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 700 <== SourceLine 1227
                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_OPERAND2_0); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 39: 
                    // JavaLine 705 <== SourceLine 1229
                    {
                        // JavaLine 707 <== SourceLine 1230
                        if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                            new SCANNER_recognizer_OperandToParser((_CUR));
                        }
                        ;
                        // JavaLine 712 <== SourceLine 1231
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 715 <== SourceLine 1233
                        if(_VALUE((atom_1==(((char)7))))) {
                            {
                                // JavaLine 718 <== SourceLine 1234
                                new SCANNER_P1error((_CUR._SL),182);
                                ;
                                new SCANNER_recognizer_nextLine((_CUR));
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 727 <== SourceLine 1235
                        if(_VALUE((atom_1==('!')))) {
                            new SCANNER_recognizer_ISOcode((_CUR));
                        }
                        ;
                        // JavaLine 732 <== SourceLine 1236
                        ((SCANNER)(_CUR._SL)).opdlo=atom_1;
                        ;
                        ((SCANNER)(_CUR._SL)).optx=((char)2);
                        ;
                        ((SCANNER)(_CUR._SL)).parser.cs='[';
                        ;
                        // JavaLine 739 <== SourceLine 1237
                        new SCANNER_recognizer_scanahead((_CUR));
                        ;
                        // JavaLine 742 <== SourceLine 1239
                        if(_VALUE((atom_1==(((char)39))))) {
                            {
                                // JavaLine 745 <== SourceLine 1240
                                new SCANNER_recognizer_scanahead((_CUR));
                                ;
                                // JavaLine 748 <== SourceLine 1242
                                if(_VALUE((linepos_1>(linelength_1)))) {
                                    new ERRMSG_internerr((_CUR._SL),((char)2),1242);
                                }
                            }
                        } else {
                            // JavaLine 754 <== SourceLine 1243
                            {
                                // JavaLine 756 <== SourceLine 1244
                                new SCANNER_P1warn((_CUR._SL),274);
                                ;
                                if(_VALUE((atom_1==('!')))) {
                                    new SCANNER_recognizer_scanahead((_CUR));
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 766 <== SourceLine 1246
                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_OPERAND_0); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 48: 
                    case 49: 
                    case 50: 
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    // JavaLine 780 <== SourceLine 1250
                    {
                        // JavaLine 782 <== SourceLine 1251
                        {
                            _SIM_LABEL(8); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                new SCANNER_recognizer_OperandToParser((_CUR));
                            }
                        }
                        ;
                        // JavaLine 790 <== SourceLine 1252
                        skipzeroes_1=(atom_1==('0'));
                        ;
                        call(unsignedInt_1,1252);
                        ;
                        ((SCANNER)(_CUR._SL)).optx=((char)4);
                        ;
                        // JavaLine 797 <== SourceLine 1253
                        if(_VALUE((atom_1==('.')))) {
                            {
                                new SCANNER_recognizer_scanahead((_CUR));
                                ;
                                // JavaLine 802 <== SourceLine 1255
                                {
                                    _SIM_LABEL(9); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                    ((SCANNER)(_CUR._SL)).optx=((char)5);
                                }
                                ;
                                // JavaLine 808 <== SourceLine 1256
                                RTS_ENVIRONMENT.storeChar('.',hashbuf_1,hashpos_1);
                                ;
                                hashpos_1=(hashpos_1+(1));
                                ;
                                // JavaLine 813 <== SourceLine 1257
                                if(_VALUE((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))!=(((char)2))))) {
                                    _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1287_CompoundStatement1283_CompoundStatement1282_numERR_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 818 <== SourceLine 1258
                                call(unsignedInt_1,1258);
                                ;
                            }
                        }
                        ;
                        // JavaLine 824 <== SourceLine 1260
                        if(_VALUE((atom_1==('&')))) {
                            {
                                new SCANNER_recognizer_scanahead((_CUR));
                                ;
                                // JavaLine 829 <== SourceLine 1262
                                {
                                    _SIM_LABEL(10); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                    ((SCANNER)(_CUR._SL)).optx=((char)5);
                                }
                                ;
                                // JavaLine 835 <== SourceLine 1263
                                RTS_ENVIRONMENT.storeChar('&',hashbuf_1,hashpos_1);
                                ;
                                hashpos_1=(hashpos_1+(1));
                                ;
                                // JavaLine 840 <== SourceLine 1264
                                if(_VALUE((atom_1==('&')))) {
                                    {
                                        ((SCANNER)(_CUR._SL)).optx=((char)6);
                                        ;
                                        new SCANNER_recognizer_scanahead((_CUR));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 850 <== SourceLine 1267
                                if(_VALUE((atom_1==('+')))) {
                                    {
                                        new SCANNER_recognizer_scanahead((_CUR));
                                        ;
                                    }
                                } else {
                                    // JavaLine 857 <== SourceLine 1270
                                    if(_VALUE((atom_1==('-')))) {
                                        {
                                            // JavaLine 860 <== SourceLine 1271
                                            RTS_ENVIRONMENT.storeChar(atom_1,hashbuf_1,hashpos_1);
                                            ;
                                            hashpos_1=(hashpos_1+(1));
                                            ;
                                            // JavaLine 865 <== SourceLine 1273
                                            new SCANNER_recognizer_scanahead((_CUR));
                                        }
                                    }
                                }
                                ;
                                // JavaLine 871 <== SourceLine 1274
                                if(_VALUE((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))==(((char)2))))) {
                                    {
                                        // JavaLine 874 <== SourceLine 1275
                                        skipzeroes_1=(atom_1==('0'));
                                        ;
                                        call(unsignedInt_1,1275);
                                    }
                                } else {
                                    // JavaLine 880 <== SourceLine 1276
                                    {
                                        // JavaLine 882 <== SourceLine 1277
                                        {
                                            _SIM_LABEL(11); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                            RTS_ENVIRONMENT.storeChar('0',hashbuf_1,hashpos_1);
                                        }
                                        ;
                                        hashpos_1=(hashpos_1+(1));
                                        ;
                                        // JavaLine 890 <== SourceLine 1278
                                        new SCANNER_P1error((_CUR._SL),181);
                                        ;
                                        // JavaLine 893 <== SourceLine 1279
                                        while((((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))==(((char)2)))||((atom_1==('&'))))||((atom_1==('.'))))) {
                                            // JavaLine 895 <== SourceLine 1281
                                            new SCANNER_recognizer_scanahead((_CUR));
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 905 <== SourceLine 1284
                        ((SCANNER)(_CUR._SL)).simsymbol=RTS_TXT.sub(hashbuf_1,1,hashpos_1);
                        ;
                        hashpos_1=0;
                        ;
                        // JavaLine 910 <== SourceLine 1285
                        new COMMON_DEFCONST((_CUR._SL));
                        ;
                        ((SCANNER)(_CUR._SL)).opdhi=((SCANNER)(_CUR._SL)).hashhi;
                        ;
                        ((SCANNER)(_CUR._SL)).opdlo=((SCANNER)(_CUR._SL)).hashlo;
                        ;
                        // JavaLine 917 <== SourceLine 1286
                        ((SCANNER)(_CUR._SL)).parser.cs='[';
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_OPERAND_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 95: 
                    // JavaLine 925 <== SourceLine 1290
                    {
                        // JavaLine 927 <== SourceLine 1291
                        if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('X'))!=(((char)0))))) {
                            _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_idscan_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 932 <== SourceLine 1292
                        new SCANNER_recognizer_illegalChar((_CUR));
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_NxtChar_1); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 65: 
                    case 66: 
                    case 67: 
                    case 68: 
                    case 69: 
                    case 70: 
                    case 71: 
                    case 72: 
                    case 73: 
                    case 74: 
                    case 75: 
                    case 76: 
                    case 77: 
                    case 78: 
                    case 79: 
                    case 80: 
                    case 81: 
                    case 82: 
                    case 83: 
                    case 84: 
                    case 85: 
                    case 86: 
                    case 87: 
                    case 88: 
                    case 89: 
                    case 90: 
                    case 97: 
                    case 98: 
                    case 99: 
                    case 100: 
                    case 101: 
                    case 102: 
                    case 103: 
                    case 104: 
                    case 105: 
                    case 106: 
                    case 107: 
                    case 108: 
                    case 109: 
                    case 110: 
                    case 111: 
                    case 112: 
                    case 113: 
                    case 114: 
                    case 115: 
                    case 116: 
                    case 117: 
                    case 118: 
                    case 119: 
                    case 120: 
                    case 121: 
                    case 122: 
                    // JavaLine 990 <== SourceLine 1294
                    {
                        // JavaLine 992 <== SourceLine 1295
                        {
                            _SIM_LABEL(12); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            i_1=linepos_1;
                        }
                        ;
                        // JavaLine 998 <== SourceLine 1296
                        {
                            _SIM_LABEL(13); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            // JavaLine 1001 <== SourceLine 1297
                            if(_VALUE((linepos_1>(linelength_1)))) {
                                new ERRMSG_internerr((_CUR._SL),((char)2),1297);
                            }
                        }
                        ;
                        // JavaLine 1007 <== SourceLine 1298
                        if(RTS_ENVIRONMENT.loadChar(line_1,linepos_1)<((char)0) || RTS_ENVIRONMENT.loadChar(line_1,linepos_1)>((char)255)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(RTS_ENVIRONMENT.loadChar(line_1,linepos_1)) { // BEGIN SWITCH STATEMENT
                            case 48: 
                            case 49: 
                            case 50: 
                            case 51: 
                            case 52: 
                            case 53: 
                            case 54: 
                            case 55: 
                            case 56: 
                            case 57: 
                            case 97: 
                            case 98: 
                            case 99: 
                            case 100: 
                            case 101: 
                            case 102: 
                            case 103: 
                            case 104: 
                            case 105: 
                            case 106: 
                            case 107: 
                            case 108: 
                            case 109: 
                            case 110: 
                            case 111: 
                            case 112: 
                            case 113: 
                            case 114: 
                            case 115: 
                            case 116: 
                            case 117: 
                            case 118: 
                            case 119: 
                            case 120: 
                            case 121: 
                            case 122: 
                            case 65: 
                            case 66: 
                            case 67: 
                            case 68: 
                            case 69: 
                            case 70: 
                            case 71: 
                            case 72: 
                            case 73: 
                            case 74: 
                            case 75: 
                            case 76: 
                            case 77: 
                            case 78: 
                            case 79: 
                            case 80: 
                            case 81: 
                            case 82: 
                            case 83: 
                            case 84: 
                            case 85: 
                            case 86: 
                            case 87: 
                            case 88: 
                            case 89: 
                            case 90: 
                            case 95: 
                            // JavaLine 1073 <== SourceLine 1300
                            {
                                // JavaLine 1075 <== SourceLine 1301
                                linepos_1=(linepos_1+(1));
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_idloop_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 14: 
                            case 15: 
                            case 16: 
                            case 17: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: 
                            case 25: 
                            case 26: 
                            case 27: 
                            case 28: 
                            case 29: 
                            case 30: 
                            case 31: 
                            case 35: 
                            case 36: 
                            case 37: 
                            case 63: 
                            case 64: 
                            case 91: 
                            case 92: 
                            case 93: 
                            case 94: 
                            case 96: 
                            case 123: 
                            case 124: 
                            case 125: 
                            case 126: 
                            case 127: 
                            case 128: 
                            case 129: 
                            case 130: 
                            case 131: 
                            case 132: 
                            case 133: 
                            case 134: 
                            case 135: 
                            case 136: 
                            case 137: 
                            case 138: 
                            case 139: 
                            case 140: 
                            case 141: 
                            case 142: 
                            case 143: 
                            case 144: 
                            case 145: 
                            case 146: 
                            case 147: 
                            case 148: 
                            case 149: 
                            case 150: 
                            case 151: 
                            case 152: 
                            case 153: 
                            case 154: 
                            case 155: 
                            case 156: 
                            case 157: 
                            case 158: 
                            case 159: 
                            case 160: 
                            case 161: 
                            case 162: 
                            case 163: 
                            case 164: 
                            case 165: 
                            case 166: 
                            case 167: 
                            case 168: 
                            case 169: 
                            case 170: 
                            case 171: 
                            case 172: 
                            case 173: 
                            case 174: 
                            case 175: 
                            case 176: 
                            case 177: 
                            case 178: 
                            case 179: 
                            case 180: 
                            case 181: 
                            case 182: 
                            case 183: 
                            case 184: 
                            case 185: 
                            case 186: 
                            case 187: 
                            case 188: 
                            case 189: 
                            case 190: 
                            case 191: 
                            case 192: 
                            case 193: 
                            case 194: 
                            case 195: 
                            case 196: 
                            case 197: 
                            case 198: 
                            case 199: 
                            case 200: 
                            case 201: 
                            case 202: 
                            case 203: 
                            case 204: 
                            case 205: 
                            case 206: 
                            case 207: 
                            case 208: 
                            case 209: 
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: 
                            case 215: 
                            case 216: 
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: 
                            case 221: 
                            case 222: 
                            case 223: 
                            case 224: 
                            case 225: 
                            case 226: 
                            case 227: 
                            case 228: 
                            case 229: 
                            case 230: 
                            case 231: 
                            case 232: 
                            case 233: 
                            case 234: 
                            case 235: 
                            case 236: 
                            case 237: 
                            case 238: 
                            case 239: 
                            case 240: 
                            case 241: 
                            case 242: 
                            case 243: 
                            case 244: 
                            case 245: 
                            case 246: 
                            case 247: 
                            case 248: 
                            case 249: 
                            case 250: 
                            case 251: 
                            case 252: 
                            case 253: 
                            case 254: 
                            case 255: 
                            // JavaLine 1250 <== SourceLine 1304
                            {
                                {
                                    _SIM_LABEL(14);
                                    linepos_1=i_1;
                                    ;
                                    // JavaLine 1256 <== SourceLine 1305
                                    call(IdScanner_1,1305);
                                    ;
                                }
                            }
                            break;
                            case 7: 
                            // JavaLine 1263 <== SourceLine 1306
                            {
                                // JavaLine 1265 <== SourceLine 1307
                                if(_VALUE((linepos_1!=((linelength_1-(1)))))) {
                                    _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_Lidi_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1270 <== SourceLine 1308
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1312_idterm_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            default:
                            // JavaLine 1275 <== SourceLine 1309
                            {
                                // JavaLine 1277 <== SourceLine 1310
                                {
                                    _SIM_LABEL(15); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                }
                                ;
                                linepos_1=(linepos_1+(1));
                                ;
                                // JavaLine 1285 <== SourceLine 1311
                                ((SCANNER)(_CUR._SL)).simsymbol=RTS_TXT.sub(line_1,i_1,(linepos_1-(i_1)));
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 1292 <== SourceLine 1316
                        new COMMON_DEFIDENT((_CUR._SL));
                        ;
                        // JavaLine 1295 <== SourceLine 1317
                        curidhi_1=((SCANNER)(_CUR._SL)).hashhi;
                        ;
                        curidlo_1=((SCANNER)(_CUR._SL)).hashlo;
                        ;
                        // JavaLine 1300 <== SourceLine 1319
                        {
                            _SIM_LABEL(16); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            // JavaLine 1303 <== SourceLine 1356
                            if(_VALUE(((curidhi_1!=(((char)0)))||((curidlo_1>('C')))))) {
                                {
                                    // JavaLine 1306 <== SourceLine 1357
                                    {
                                        _SIM_LABEL(17); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                        if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                            new SCANNER_recognizer_OperandToParser((_CUR));
                                        }
                                    }
                                    ;
                                    // JavaLine 1314 <== SourceLine 1358
                                    ((SCANNER)(_CUR._SL)).optx=((char)14);
                                    ;
                                    ((SCANNER)(_CUR._SL)).parser.cs='Z';
                                    ;
                                    // JavaLine 1319 <== SourceLine 1359
                                    {
                                        _SIM_LABEL(18); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                        ((SCANNER)(_CUR._SL)).opdhi=curidhi_1;
                                    }
                                    ;
                                    ((SCANNER)(_CUR._SL)).opdlo=curidlo_1;
                                    ;
                                    // JavaLine 1327 <== SourceLine 1360
                                    {
                                        _SIM_LABEL(19); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                        opdline_1=((SCANNER)(_CUR._SL)).linenr;
                                    }
                                    ;
                                    // JavaLine 1333 <== SourceLine 1361
                                    {
                                        _SIM_LABEL(20); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                        opdpos_1=optpos_1;
                                    }
                                    ;
                                    _GOTO(_LABEL_SCANNER_recognizer_ASSESS_1); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 1345 <== SourceLine 1366
                        ((SCANNER)(_CUR._SL)).opt=curidlo_1;
                        ;
                        // JavaLine 1348 <== SourceLine 1367
                        if(curidlo_1<((char)0) || curidlo_1>'C') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(curidlo_1) { // BEGIN SWITCH STATEMENT
                            case 63: 
                            // JavaLine 1352 <== SourceLine 1369
                            {
                                // JavaLine 1354 <== SourceLine 1370
                                {
                                    _SIM_LABEL(21); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                    while((atom_1!=(';'))) {
                                        {
                                            // JavaLine 1359 <== SourceLine 1371
                                            if(_VALUE((linepos_1<(linelength_1)))) {
                                                {
                                                    // JavaLine 1362 <== SourceLine 1372
                                                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                                    ;
                                                    // JavaLine 1365 <== SourceLine 1373
                                                    linepos_1=(linepos_1+(1));
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 1370 <== SourceLine 1374
                                                new SCANNER_recognizer_nextLine((_CUR));
                                            }
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 1378 <== SourceLine 1376
                                _GOTO(_LABEL_SCANNER_recognizer_NxtChar_1); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 45: 
                            // JavaLine 1383 <== SourceLine 1378
                            {
                                // JavaLine 1385 <== SourceLine 1379
                                nxtsym_1='1';
                                ;
                                eqopt_1=RTS_ENVIRONMENT.rank('U');
                            }
                            break;
                            case 47: 
                            // JavaLine 1392 <== SourceLine 1381
                            {
                                // JavaLine 1394 <== SourceLine 1382
                                if(_VALUE(((SCANNER)(_CUR._SL)).SportOK)) {
                                    {
                                        new SCANNER_recognizer_ScanPastFormat((_CUR));
                                        ;
                                        // JavaLine 1399 <== SourceLine 1383
                                        if(_VALUE((atom_1==('(')))) {
                                            {
                                                ((SCANNER)(_CUR._SL)).opt='W';
                                                ;
                                                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1411 <== SourceLine 1385
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 55: 
                            // JavaLine 1417 <== SourceLine 1387
                            {
                                // JavaLine 1419 <== SourceLine 1388
                                if(_VALUE(((SCANNER)(_CUR._SL)).SportOK)) {
                                    {
                                        // JavaLine 1422 <== SourceLine 1389
                                        nxtsym_1='@';
                                        ;
                                        eqopt_1=RTS_ENVIRONMENT.rank(((char)147));
                                        ;
                                        _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_SawKeyW_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1432 <== SourceLine 1391
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 20: 
                            // JavaLine 1438 <== SourceLine 1393
                            {
                                // JavaLine 1440 <== SourceLine 1394
                                nxtsym_1='3';
                                ;
                                eqopt_1=-284;
                                ;
                                ((SCANNER)(_CUR._SL)).opt=((char)21);
                            }
                            break;
                            case 22: 
                            // JavaLine 1449 <== SourceLine 1396
                            {
                                // JavaLine 1451 <== SourceLine 1397
                                nxtsym_1='(';
                                ;
                                eqopt_1=RTS_ENVIRONMENT.rank('3');
                            }
                            break;
                            case 6: 
                            // JavaLine 1458 <== SourceLine 1399
                            {
                                // JavaLine 1460 <== SourceLine 1400
                                nxtsym_1=((char)5);
                                ;
                                eqopt_1=-281;
                            }
                            break;
                            case 36: 
                            // JavaLine 1467 <== SourceLine 1402
                            {
                                // JavaLine 1469 <== SourceLine 1403
                                nxtsym_1=((char)15);
                                ;
                                eqopt_1=RTS_ENVIRONMENT.rank('V');
                            }
                            break;
                            case 40: 
                            // JavaLine 1476 <== SourceLine 1405
                            {
                                // JavaLine 1478 <== SourceLine 1406
                                nxtsym_1=((char)22);
                                ;
                                eqopt_1=RTS_ENVIRONMENT.rank('3');
                            }
                            break;
                            case 3: 
                            // JavaLine 1485 <== SourceLine 1408
                            {
                                // JavaLine 1487 <== SourceLine 1409
                                nxtsym_1=((char)4);
                                ;
                                eqopt_1=-280;
                            }
                            break;
                            case 51: 
                            // JavaLine 1494 <== SourceLine 1411
                            {
                                // JavaLine 1496 <== SourceLine 1412
                                new SCANNER_P1warn((_CUR._SL),279);
                                ;
                                ((SCANNER)(_CUR._SL)).opt=((char)21);
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 31: 
                            // JavaLine 1505 <== SourceLine 1414
                            {
                                // JavaLine 1507 <== SourceLine 1415
                                if(_VALUE(((SCANNER)(_CUR._SL)).Simuletta)) {
                                    _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 1512 <== SourceLine 1416
                                ((SCANNER)(_CUR._SL)).opt=((char)0);
                                ;
                                curidlo_1='K';
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_SAWRID_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 54: 
                            // JavaLine 1521 <== SourceLine 1418
                            {
                                // JavaLine 1523 <== SourceLine 1419
                                new SCANNER_recognizer_ScanPastFormat((_CUR));
                                ;
                                if(_VALUE((atom_1!=(':')))) {
                                    {
                                        // JavaLine 1528 <== SourceLine 1420
                                        new SCANNER_P1warn((_CUR._SL),283);
                                        ;
                                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 1535 <== SourceLine 1421
                                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 64: 
                            case 65: 
                            case 66: 
                            case 67: 
                            // JavaLine 1543 <== SourceLine 1423
                            {
                                // JavaLine 1545 <== SourceLine 1425
                                if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
                                    new SCANNER_recognizer_OperandToParser((_CUR));
                                }
                                ;
                                // JavaLine 1550 <== SourceLine 1426
                                ((SCANNER)(_CUR._SL)).parser.cs='[';
                                ;
                                // JavaLine 1553 <== SourceLine 1427
                                ((SCANNER)(_CUR._SL)).optx=(((curidlo_1==('A')))?(((char)8)):((((curidlo_1==('@')))?(((char)7)):(((char)1)))));
                                ;
                                // JavaLine 1556 <== SourceLine 1435
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1362_RESKW_0); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 32: 
                            // JavaLine 1562 <== SourceLine 1440
                            {
                                // JavaLine 1564 <== SourceLine 1441
                                ((SCANNER)(_CUR._SL)).maxnumoftags=(((SCANNER)(_CUR._SL)).maxnumoftags+(1));
                                ;
                                // JavaLine 1567 <== SourceLine 1442
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            case 16: 
                            // JavaLine 1573 <== SourceLine 1444
                            {
                                // JavaLine 1575 <== SourceLine 1445
                                while((((SCANNER)(_CUR._SL)).opt==(((char)16)))) {
                                    {
                                        // JavaLine 1578 <== SourceLine 1446
                                        ((SCANNER)(_CUR._SL)).maxnumoftags=(((SCANNER)(_CUR._SL)).maxnumoftags-(1));
                                        ;
                                        // JavaLine 1581 <== SourceLine 1447
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1447_4475_1=((SCANNER)(_CUR._SL)).parser;
                                            if(_inspect_1447_4475_1!=null) { // INSPECT _inspect_1447_4475_1
                                                // JavaLine 1586 <== SourceLine 1448
                                                {
                                                    // JavaLine 1588 <== SourceLine 1447
                                                    {
                                                        // JavaLine 1590 <== SourceLine 1448
                                                        _inspect_1447_4475_1.getopt=true;
                                                        ;
                                                        // JavaLine 1593 <== SourceLine 1449
                                                        if(_VALUE((((SCANNER)(_CUR._SL)).optx==(((char)0))))) {
                                                            {
                                                                // JavaLine 1596 <== SourceLine 1450
                                                                _inspect_1447_4475_1.cs=((SCANNER)(_CUR._SL)).opt;
                                                                ;
                                                                _inspect_1447_4475_1.getopt=false;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 1603 <== SourceLine 1452
                                                        if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('1'))!=(((char)0))))) {
                                                            new SCANNER_dump((_CUR._SL),new RTS_TXT("scanner:"));
                                                        }
                                                        ;
                                                        // JavaLine 1608 <== SourceLine 1453
                                                        if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                                            // JavaLine 1610 <== SourceLine 1454
                                                            new SCANNER_W1((_CUR._SL),CONC(new RTS_TXT("NEXT:"),((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1447_4475_1.cs))),RTS_ENVIRONMENT.rank(_inspect_1447_4475_1.cs));
                                                        }
                                                        ;
                                                        // JavaLine 1614 <== SourceLine 1455
                                                        call(((COMMON_component)_inspect_1447_4475_1),1455);
                                                        ;
                                                        // JavaLine 1617 <== SourceLine 1456
                                                        _inspect_1447_4475_1.cs=((SCANNER)(_CUR._SL)).opt=((SCANNER)(_CUR._SL)).optx=((SCANNER)(_CUR._SL)).opdhi=((SCANNER)(_CUR._SL)).opdlo=((char)0);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                        // JavaLine 1625 <== SourceLine 1458
                                        {
                                            _SIM_LABEL(22); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                            // JavaLine 1628 <== SourceLine 1459
                                            if(_VALUE((atom_1==(';')))) {
                                                {
                                                    // JavaLine 1631 <== SourceLine 1460
                                                    {
                                                        _SIM_LABEL(23); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                                        ((SCANNER)(_CUR._SL)).opt='O';
                                                    }
                                                    ;
                                                    optpos_1=linepos_1;
                                                    ;
                                                    // JavaLine 1639 <== SourceLine 1461
                                                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                                    ;
                                                    // JavaLine 1642 <== SourceLine 1462
                                                    linepos_1=(linepos_1+(1));
                                                    ;
                                                    // JavaLine 1645 <== SourceLine 1463
                                                    if(_VALUE((linepos_1>(linelength_1)))) {
                                                        // JavaLine 1647 <== SourceLine 1464
                                                        new ERRMSG_internerr((_CUR._SL),((char)2),1464);
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 1653 <== SourceLine 1466
                                                {
                                                    // JavaLine 1655 <== SourceLine 1467
                                                    while((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))>(((char)1)))) {
                                                        // JavaLine 1657 <== SourceLine 1468
                                                        {
                                                            // JavaLine 1659 <== SourceLine 1470
                                                            if(_VALUE((atom_1==(((char)7))))) {
                                                                new SCANNER_recognizer_nextLine((_CUR));
                                                            } else {
                                                                // JavaLine 1663 <== SourceLine 1471
                                                                {
                                                                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                                                    ;
                                                                    // JavaLine 1667 <== SourceLine 1472
                                                                    linepos_1=(linepos_1+(1));
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 1672 <== SourceLine 1474
                                                            if(_VALUE((atom_1==(';')))) {
                                                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_CompoundStatement1466_SawSMCL_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 1680 <== SourceLine 1477
                                                    if(_VALUE(((((((atom_1==('e'))||((atom_1==('w'))))||((atom_1==('o'))))||((atom_1==('E'))))||((atom_1==('W'))))||((atom_1==('O')))))) {
                                                        // JavaLine 1682 <== SourceLine 1480
                                                        {
                                                            // JavaLine 1684 <== SourceLine 1481
                                                            call(IdScanner_1,1481);
                                                            ;
                                                            // JavaLine 1687 <== SourceLine 1483
                                                            if(_VALUE(_TXTREL_EQ(((SCANNER)(_CUR._SL)).simsymbol,new RTS_TXT("end")))) {
                                                                ((SCANNER)(_CUR._SL)).opt=((char)16);
                                                            } else {
                                                                // JavaLine 1691 <== SourceLine 1484
                                                                if(_VALUE(_TXTREL_EQ(((SCANNER)(_CUR._SL)).simsymbol,new RTS_TXT("else")))) {
                                                                    ((SCANNER)(_CUR._SL)).opt=((char)15);
                                                                } else {
                                                                    // JavaLine 1695 <== SourceLine 1485
                                                                    if(_VALUE(_TXTREL_EQ(((SCANNER)(_CUR._SL)).simsymbol,new RTS_TXT("when")))) {
                                                                        ((SCANNER)(_CUR._SL)).opt='7';
                                                                    } else {
                                                                        // JavaLine 1699 <== SourceLine 1486
                                                                        if(_VALUE(_TXTREL_EQ(((SCANNER)(_CUR._SL)).simsymbol,new RTS_TXT("otherwise")))) {
                                                                            ((SCANNER)(_CUR._SL)).opt='%';
                                                                        } else {
                                                                            // JavaLine 1703 <== SourceLine 1487
                                                                            _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_FindEnd_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 1712 <== SourceLine 1489
                                                        {
                                                            // JavaLine 1714 <== SourceLine 1490
                                                            while((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))<=(((char)3)))) {
                                                                // JavaLine 1716 <== SourceLine 1491
                                                                {
                                                                    // JavaLine 1718 <== SourceLine 1492
                                                                    atom_1=RTS_ENVIRONMENT.loadChar(line_1,linepos_1);
                                                                    ;
                                                                    // JavaLine 1721 <== SourceLine 1493
                                                                    linepos_1=(linepos_1+(1));
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 1727 <== SourceLine 1495
                                                            _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_CompoundStatement1505_CompoundStatement1504_FindEnd_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 1737 <== SourceLine 1498
                                        {
                                            _SIM_LABEL(24); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                                            if(_VALUE((((SCANNER)(_CUR._SL)).maxnumoftags==(0)))) {
                                                {
                                                    // JavaLine 1742 <== SourceLine 1499
                                                    if(_VALUE((((SCANNER)(_CUR._SL)).opt==('O')))) {
                                                        new SCANNER_recognizer_ScanPastFormat((_CUR));
                                                    }
                                                    ;
                                                    // JavaLine 1747 <== SourceLine 1501
                                                    if(_VALUE((atom_1!=(((char)26))))) {
                                                        new SCANNER_P1warn((_CUR._SL),288);
                                                    }
                                                    ;
                                                    // JavaLine 1752 <== SourceLine 1502
                                                    while(true) {
                                                        detach(1502);
                                                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1765 <== SourceLine 1505
                                _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                            default:
                            // JavaLine 1771 <== SourceLine 1507
                            _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 1776 <== SourceLine 1509
                        {
                            _SIM_LABEL(25); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            curidhi_1=curidlo_1=((char)0);
                        }
                        ;
                        // JavaLine 1782 <== SourceLine 1510
                        new SCANNER_recognizer_ScanPastFormat((_CUR));
                        ;
                        startpos_1=linepos_1;
                        ;
                        // JavaLine 1787 <== SourceLine 1511
                        if(_VALUE((InputClass.getELEMENT(RTS_ENVIRONMENT.rank(atom_1))<(((char)2))))) {
                            {
                                // JavaLine 1790 <== SourceLine 1512
                                call(IdScanner_1,1512);
                                ;
                                new COMMON_DEFIDENT((_CUR._SL));
                                ;
                                // JavaLine 1795 <== SourceLine 1513
                                if(_VALUE(((((SCANNER)(_CUR._SL)).hashlo==(nxtsym_1))&&((((SCANNER)(_CUR._SL)).hashhi==(((char)0))))))) {
                                    {
                                        // JavaLine 1798 <== SourceLine 1514
                                        if(_VALUE((eqopt_1>(0)))) {
                                            ((SCANNER)(_CUR._SL)).opt=RTS_ENVIRONMENT._char(eqopt_1);
                                        }
                                        ;
                                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1808 <== SourceLine 1516
                                curidhi_1=((SCANNER)(_CUR._SL)).hashhi;
                                ;
                                curidlo_1=((SCANNER)(_CUR._SL)).hashlo;
                                ;
                            }
                        }
                        ;
                        // JavaLine 1816 <== SourceLine 1518
                        if(_VALUE((eqopt_1<(0)))) {
                            new SCANNER_P1warn((_CUR._SL),(-(eqopt_1)));
                        }
                        ;
                        // JavaLine 1821 <== SourceLine 1519
                        if(_VALUE(((curidlo_1!=(((char)0)))||((curidhi_1!=(((char)0))))))) {
                            {
                                // JavaLine 1824 <== SourceLine 1520
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_1520_4476_1=((SCANNER)(_CUR._SL)).parser;
                                    if(_inspect_1520_4476_1!=null) { // INSPECT _inspect_1520_4476_1
                                        // JavaLine 1829 <== SourceLine 1521
                                        {
                                            // JavaLine 1831 <== SourceLine 1520
                                            {
                                                // JavaLine 1833 <== SourceLine 1521
                                                _inspect_1520_4476_1.getopt=true;
                                                ;
                                                // JavaLine 1836 <== SourceLine 1522
                                                if(_VALUE((((SCANNER)(_CUR._SL)).optx==(((char)0))))) {
                                                    {
                                                        _inspect_1520_4476_1.cs=((SCANNER)(_CUR._SL)).opt;
                                                        ;
                                                        _inspect_1520_4476_1.getopt=false;
                                                    }
                                                }
                                                ;
                                                // JavaLine 1845 <== SourceLine 1524
                                                if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('1'))!=(((char)0))))) {
                                                    new SCANNER_dump((_CUR._SL),new RTS_TXT("scanner:"));
                                                }
                                                ;
                                                // JavaLine 1850 <== SourceLine 1525
                                                if(_VALUE((((SCANNER)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                                    // JavaLine 1852 <== SourceLine 1526
                                                    new SCANNER_W1((_CUR._SL),CONC(new RTS_TXT("NEXT:"),((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1520_4476_1.cs))),RTS_ENVIRONMENT.rank(_inspect_1520_4476_1.cs));
                                                }
                                                ;
                                                // JavaLine 1856 <== SourceLine 1527
                                                call(((COMMON_component)_inspect_1520_4476_1),1527);
                                                ;
                                                // JavaLine 1859 <== SourceLine 1528
                                                _inspect_1520_4476_1.cs=((SCANNER)(_CUR._SL)).opt=((SCANNER)(_CUR._SL)).optx=((SCANNER)(_CUR._SL)).opdhi=((SCANNER)(_CUR._SL)).opdlo=((char)0);
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                                // JavaLine 1867 <== SourceLine 1530
                                optpos_1=startpos_1;
                                ;
                                _GOTO(_LABEL_SCANNER_recognizer_CompoundStatement1542_IdentifierFound_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 1875 <== SourceLine 1541
                        _GOTO(_LABEL_SCANNER_recognizer_ParserC_1); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    default:
                    // JavaLine 1881 <== SourceLine 1545
                    {
                        // JavaLine 1883 <== SourceLine 1546
                        {
                            _SIM_LABEL(26); // DeclaredIn: recognizer -> recognizer[SCANNER_recognizer] DeclarationKind=Class
                            new SCANNER_recognizer_illegalChar((_CUR));
                        }
                        ;
                        _GOTO(_LABEL_SCANNER_recognizer_NxtChar_1); // GOTO EVALUATED LABEL
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 1894 <== SourceLine 1550
                _GOTO(_LABEL_SCANNER_recognizer_ReadPC_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 1897 <== SourceLine 1552
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","8 recognizer",1,522,11,1051,13,1055,15,1057,17,1068,19,1186,21,1188,23,1202,25,1251,27,1255,29,1262,31,1277,33,1295,35,1297,37,1304,39,1310,41,1356,43,1357,45,1359,47,1360,49,1361,51,1370,53,1459,55,1460,57,1498,59,1509,61,1546,64,528,66,529,68,530,70,531,73,532,75,533,77,534,79,535,81,536,83,537,85,538,87,539,89,540,91,541,93,542,95,543,97,544,99,545,101,546,103,547,105,620,107,898,109,935,111,1057,113,1447,115,1520,122,620,132,864,134,1049,137,1050,142,1051,150,1052,155,1053,158,1055,166,1056,171,1057,178,1058,180,1057,182,1058,185,1059,194,1061,199,1062,201,1063,205,1064,208,1065,217,1068,223,1070,227,1072,229,1073,236,1076,238,1077,247,1078,254,1080,256,1081,259,1083,268,1084,277,1085,284,1087,286,1088,293,1090,295,1091,302,1093,304,1094,311,1096,313,1097,316,1099,319,1100,324,1101,329,1102,337,1104,339,1105,344,1107,346,1108,349,1110,351,1112,353,1113,358,1114,363,1115,371,1117,373,1118,376,1120,380,1121,391,1125,393,1126,399,1129,401,1130,404,1131,407,1133,410,1134,415,1135,423,1137,429,1140,431,1141,434,1143,443,1144,448,1147,450,1148,453,1150,457,1151,465,1152,473,1154,475,1155,478,1158,487,1159,496,1160,499,1161,502,1163,514,1166,516,1167,519,1169,528,1170,541,1179,545,1183,547,1184,552,1185,557,1186,565,1187,568,1188,574,1189,577,1190,580,1191,585,1192,590,1193,595,1196,600,1197,603,1198,608,1199,613,1200,619,1202,627,1204,629,1205,632,1207,635,1208,640,1209,648,1211,651,1212,654,1213,657,1215,664,1216,670,1218,675,1219,679,1220,681,1221,684,1222,687,1223,692,1224,700,1227,705,1229,707,1230,712,1231,715,1233,718,1234,727,1235,732,1236,739,1237,742,1239,745,1240,748,1242,754,1243,756,1244,766,1246,780,1250,782,1251,790,1252,797,1253,802,1255,808,1256,813,1257,818,1258,824,1260,829,1262,835,1263,840,1264,850,1267,857,1270,860,1271,865,1273,871,1274,874,1275,880,1276,882,1277,890,1278,893,1279,895,1281,905,1284,910,1285,917,1286,925,1290,927,1291,932,1292,990,1294,992,1295,998,1296,1001,1297,1007,1298,1073,1300,1075,1301,1250,1304,1256,1305,1263,1306,1265,1307,1270,1308,1275,1309,1277,1310,1285,1311,1292,1316,1295,1317,1300,1319,1303,1356,1306,1357,1314,1358,1319,1359,1327,1360,1333,1361,1345,1366,1348,1367,1352,1369,1354,1370,1359,1371,1362,1372,1365,1373,1370,1374,1378,1376,1383,1378,1385,1379,1392,1381,1394,1382,1399,1383,1411,1385,1417,1387,1419,1388,1422,1389,1432,1391,1438,1393,1440,1394,1449,1396,1451,1397,1458,1399,1460,1400,1467,1402,1469,1403,1476,1405,1478,1406,1485,1408,1487,1409,1494,1411,1496,1412,1505,1414,1507,1415,1512,1416,1521,1418,1523,1419,1528,1420,1535,1421,1543,1423,1545,1425,1550,1426,1553,1427,1556,1435,1562,1440,1564,1441,1567,1442,1573,1444,1575,1445,1578,1446,1581,1447,1586,1448,1588,1447,1590,1448,1593,1449,1596,1450,1603,1452,1608,1453,1610,1454,1614,1455,1617,1456,1625,1458,1628,1459,1631,1460,1639,1461,1642,1462,1645,1463,1647,1464,1653,1466,1655,1467,1657,1468,1659,1470,1663,1471,1667,1472,1672,1474,1680,1477,1682,1480,1684,1481,1687,1483,1691,1484,1695,1485,1699,1486,1703,1487,1712,1489,1714,1490,1716,1491,1718,1492,1721,1493,1727,1495,1737,1498,1742,1499,1747,1501,1752,1502,1765,1505,1771,1507,1776,1509,1782,1510,1787,1511,1790,1512,1795,1513,1798,1514,1808,1516,1816,1518,1821,1519,1824,1520,1829,1521,1831,1520,1833,1521,1836,1522,1845,1524,1850,1525,1852,1526,1856,1527,1859,1528,1867,1530,1875,1541,1881,1545,1883,1546,1894,1550,1897,1552,1910,1552);
} // End of Class
