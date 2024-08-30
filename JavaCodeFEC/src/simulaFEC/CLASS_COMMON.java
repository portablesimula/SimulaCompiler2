// JavaLine 1 <== SourceLine 1
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=0, firstLine=1, lastLine=1323, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 26
    public final char NUL=(char)(((char)0));
    // JavaLine 12 <== SourceLine 28
    public char identhi=0;
    public char identlo=0;
    public char consthi=0;
    public char constlo=0;
    // JavaLine 17 <== SourceLine 29
    public char hashhi=0;
    public char hashlo=0;
    // JavaLine 20 <== SourceLine 30
    public RTS_TXT simsymbol=null;
    // JavaLine 22 <== SourceLine 41
    public RTS_REF_ARRAY<CLASS_COMMON_symbolgroup> symtab=null;
    // JavaLine 24 <== SourceLine 46
    public RTS_REF_ARRAY<CLASS_COMMON_symbolbox> hashtab=null;
    // JavaLine 26 <== SourceLine 51
    public CLASS_COMMON_symbolgroup dummyGroup=null;
    public CLASS_COMMON_identsymbol dummyBox=null;
    // JavaLine 29 <== SourceLine 245
    public RTS_CHARACTER_ARRAY option=null;
    // JavaLine 31 <== SourceLine 4
    public final RTS_TXT sportid=(RTS_TXT)(new RTS_TXT("S-port 108.1"));
    // JavaLine 33 <== SourceLine 5
    public final RTS_TXT smlid=(RTS_TXT)(new RTS_TXT("Simuletta 1.0"));
    // JavaLine 35 <== SourceLine 43
    public final int TRACE_ATTRIBUTE_OUTPUT=(int)(1);
    // JavaLine 37 <== SourceLine 44
    public final int TRACE_ATTRIBUTE_INPUT=(int)(1);
    // JavaLine 39 <== SourceLine 45
    public int indent=0;
    // JavaLine 41 <== SourceLine 75
    public final int maxasd=(int)(30);
    // JavaLine 43 <== SourceLine 76
    public final int maxplev=(int)(63);
    // JavaLine 45 <== SourceLine 77
    public final int maxblev=(int)(250);
    // JavaLine 47 <== SourceLine 78
    public final int maxdepth=(int)(100);
    // JavaLine 49 <== SourceLine 79
    public final int maxcalldepth=(int)(15);
    // JavaLine 51 <== SourceLine 80
    public final int maxjumpdepth=(int)(100);
    // JavaLine 53 <== SourceLine 89
    public final int SbufferMax=(int)(750);
    // JavaLine 55 <== SourceLine 90
    public final int L2max=(int)(256);
    // JavaLine 57 <== SourceLine 91
    public final int RepeatMax=(int)(256);
    // JavaLine 59 <== SourceLine 22
    public final char IBOOL=(char)(((char)1));
    // JavaLine 61 <== SourceLine 23
    public final char ICHAR=(char)(((char)2));
    // JavaLine 63 <== SourceLine 24
    public final char ISHOR=(char)(((char)3));
    // JavaLine 65 <== SourceLine 25
    public final char IINTG=(char)(((char)4));
    // JavaLine 67 <== SourceLine 26
    public final char IREAL=(char)(((char)5));
    // JavaLine 69 <== SourceLine 27
    public final char ILONG=(char)(((char)6));
    // JavaLine 71 <== SourceLine 28
    public final char IREF=(char)(((char)7));
    // JavaLine 73 <== SourceLine 29
    public final char ITEXT=(char)(((char)8));
    // JavaLine 75 <== SourceLine 30
    public final char IPTR=(char)(((char)9));
    // JavaLine 77 <== SourceLine 31
    public final char IVALU=(char)(((char)10));
    // JavaLine 79 <== SourceLine 32
    public final char ILABE=(char)(((char)11));
    // JavaLine 81 <== SourceLine 33
    public final char IPROC=(char)(((char)12));
    // JavaLine 83 <== SourceLine 34
    public final char IARRA=(char)(((char)13));
    // JavaLine 85 <== SourceLine 35
    public final char INOTY=(char)(((char)14));
    // JavaLine 87 <== SourceLine 36
    public final char IELSE=(char)(((char)15));
    // JavaLine 89 <== SourceLine 37
    public final char IEND=(char)(((char)16));
    // JavaLine 91 <== SourceLine 38
    public final char IEQV=(char)(((char)17));
    // JavaLine 93 <== SourceLine 39
    public final char IEXTR=(char)(((char)18));
    // JavaLine 95 <== SourceLine 40
    public final char IFOR=(char)(((char)19));
    // JavaLine 97 <== SourceLine 41
    public final char IGO=(char)(((char)20));
    // JavaLine 99 <== SourceLine 42
    public final char IGOTO=(char)(((char)21));
    // JavaLine 101 <== SourceLine 43
    public final char IHIDD=(char)(((char)22));
    // JavaLine 103 <== SourceLine 44
    public final char IIF=(char)(((char)23));
    // JavaLine 105 <== SourceLine 45
    public final char IIMP=(char)(((char)24));
    // JavaLine 107 <== SourceLine 46
    public final char IIN=(char)(((char)25));
    // JavaLine 109 <== SourceLine 47
    public final char IINNE=(char)(((char)26));
    // JavaLine 111 <== SourceLine 48
    public final char IINSP=(char)(((char)27));
    // JavaLine 113 <== SourceLine 49
    public final char IDO=(char)(((char)28));
    // JavaLine 115 <== SourceLine 50
    public final char IIS=(char)(((char)29));
    // JavaLine 117 <== SourceLine 51
    public final char ICLAS=(char)(((char)30));
    // JavaLine 119 <== SourceLine 52
    public final char IRCRD=(char)(((char)31));
    // JavaLine 121 <== SourceLine 53
    public final char IBEGI=(char)(((char)32));
    // JavaLine 123 <== SourceLine 54
    public final char INAME=(char)('!');
    // JavaLine 125 <== SourceLine 55
    public final char INEW=(char)('"');
    // JavaLine 127 <== SourceLine 56
    public final char INOT=(char)('#');
    // JavaLine 129 <== SourceLine 57
    public final char IOR=(char)('$');
    // JavaLine 131 <== SourceLine 58
    public final char IOTHW=(char)('%');
    // JavaLine 133 <== SourceLine 59
    public final char IPRIO=(char)('&');
    // JavaLine 135 <== SourceLine 60
    public final char IDELA=(char)(((char)39));
    // JavaLine 137 <== SourceLine 61
    public final char IPRTC=(char)('(');
    // JavaLine 139 <== SourceLine 62
    public final char IQUA=(char)(')');
    // JavaLine 141 <== SourceLine 63
    public final char IREAC=(char)('*');
    // JavaLine 143 <== SourceLine 64
    public final char IAT=(char)('+');
    // JavaLine 145 <== SourceLine 65
    public final char IBEFO=(char)(',');
    // JavaLine 147 <== SourceLine 66
    public final char IAND=(char)('-');
    // JavaLine 149 <== SourceLine 67
    public final char ISTEP=(char)('.');
    // JavaLine 151 <== SourceLine 68
    public final char ISWIT=(char)('/');
    // JavaLine 153 <== SourceLine 69
    public final char IACTV=(char)('0');
    // JavaLine 155 <== SourceLine 70
    public final char ITHEN=(char)('1');
    // JavaLine 157 <== SourceLine 71
    public final char ITHIS=(char)('2');
    // JavaLine 159 <== SourceLine 72
    public final char ITO=(char)('3');
    // JavaLine 161 <== SourceLine 73
    public final char IUNTI=(char)('4');
    // JavaLine 163 <== SourceLine 74
    public final char IAFTR=(char)('5');
    // JavaLine 165 <== SourceLine 75
    public final char IVIRT=(char)('6');
    // JavaLine 167 <== SourceLine 76
    public final char IWHEN=(char)('7');
    // JavaLine 169 <== SourceLine 77
    public final char IWHIL=(char)('8');
    // JavaLine 171 <== SourceLine 78
    public final char ILT=(char)('9');
    // JavaLine 173 <== SourceLine 79
    public final char IEQ=(char)(':');
    // JavaLine 175 <== SourceLine 80
    public final char ILE=(char)(';');
    // JavaLine 177 <== SourceLine 81
    public final char IGT=(char)('<');
    // JavaLine 179 <== SourceLine 82
    public final char INE=(char)('=');
    // JavaLine 181 <== SourceLine 83
    public final char IGE=(char)('>');
    // JavaLine 183 <== SourceLine 84
    public final char ICOMN=(char)('?');
    // JavaLine 185 <== SourceLine 85
    public final char INONE=(char)('@');
    // JavaLine 187 <== SourceLine 86
    public final char INOTE=(char)('A');
    // JavaLine 189 <== SourceLine 87
    public final char ITRUE=(char)('B');
    // JavaLine 191 <== SourceLine 88
    public final char IFALS=(char)('C');
    // JavaLine 193 <== SourceLine 90
    public final char detachident=(char)('D');
    // JavaLine 195 <== SourceLine 91
    public final char printfileindex=(char)('E');
    // JavaLine 197 <== SourceLine 92
    public final char infileindex=(char)('F');
    // JavaLine 199 <== SourceLine 93
    public final char errorident=(char)('G');
    // JavaLine 201 <== SourceLine 94
    public final char textclassindex=(char)('H');
    // JavaLine 203 <== SourceLine 95
    public final char predefindex=(char)('I');
    // JavaLine 205 <== SourceLine 96
    public final char alloc2index=(char)('J');
    // JavaLine 207 <== SourceLine 97
    public final char recordindex=(char)('K');
    // JavaLine 209 <== SourceLine 98
    public final char Cindex=(char)('L');
    // JavaLine 211 <== SourceLine 99
    public final char Pascalindex=(char)('M');
    // JavaLine 213 <== SourceLine 100
    public final char Libraryindex=(char)('N');
    // JavaLine 215 <== SourceLine 102
    public final char IRFEQ=(char)('D');
    // JavaLine 217 <== SourceLine 103
    public final char IRFNE=(char)('E');
    // JavaLine 219 <== SourceLine 104
    public final char IPLUS=(char)('F');
    // JavaLine 221 <== SourceLine 105
    public final char IMINU=(char)('G');
    // JavaLine 223 <== SourceLine 106
    public final char IMULT=(char)('H');
    // JavaLine 225 <== SourceLine 107
    public final char ISLAS=(char)('I');
    // JavaLine 227 <== SourceLine 108
    public final char IPOWE=(char)('J');
    // JavaLine 229 <== SourceLine 109
    public final char IIDIV=(char)('K');
    // JavaLine 231 <== SourceLine 110
    public final char IDOT=(char)('L');
    // JavaLine 233 <== SourceLine 111
    public final char ICL=(char)('M');
    // JavaLine 235 <== SourceLine 112
    public final char ICOMA=(char)('N');
    // JavaLine 237 <== SourceLine 113
    public final char ISMCL=(char)('O');
    // JavaLine 239 <== SourceLine 114
    public final char ILFPA=(char)('P');
    // JavaLine 241 <== SourceLine 115
    public final char IRGPA=(char)('Q');
    // JavaLine 243 <== SourceLine 116
    public final char IASSG=(char)('R');
    // JavaLine 245 <== SourceLine 117
    public final char IDENO=(char)('S');
    // JavaLine 247 <== SourceLine 118
    public final char ICONC=(char)('T');
    // JavaLine 249 <== SourceLine 119
    public final char ICAND=(char)('U');
    // JavaLine 251 <== SourceLine 120
    public final char ICOR=(char)('V');
    // JavaLine 253 <== SourceLine 121
    public final char ICASE=(char)('W');
    // JavaLine 255 <== SourceLine 122
    public final char IEOP=(char)('X');
    // JavaLine 257 <== SourceLine 123
    public final char IROPD=(char)('Y');
    // JavaLine 259 <== SourceLine 124
    public final char IIDN=(char)('Z');
    // JavaLine 261 <== SourceLine 125
    public final char ICONS=(char)('[');
    // JavaLine 263 <== SourceLine 129
    public final char IBLKB=(char)('\\');
    // JavaLine 265 <== SourceLine 130
    public final char IBPRF=(char)(']');
    // JavaLine 267 <== SourceLine 131
    public final char IDCLI=(char)('^');
    // JavaLine 269 <== SourceLine 132
    public final char IFRMP=(char)('_');
    // JavaLine 271 <== SourceLine 133
    public final char IABTE=(char)('`');
    // JavaLine 273 <== SourceLine 134
    public final char IACTE=(char)('a');
    // JavaLine 275 <== SourceLine 135
    public final char IARGE=(char)('b');
    // JavaLine 277 <== SourceLine 136
    public final char IARDE=(char)('c');
    // JavaLine 279 <== SourceLine 137
    public final char IASGE=(char)('d');
    // JavaLine 281 <== SourceLine 138
    public final char IBLNO=(char)('e');
    // JavaLine 283 <== SourceLine 139
    public final char IBNDE=(char)('f');
    // JavaLine 285 <== SourceLine 140
    public final char IBREC=(char)('g');
    // JavaLine 287 <== SourceLine 141
    public final char ICAPE=(char)('h');
    // JavaLine 289 <== SourceLine 142
    public final char ICONB=(char)('i');
    // JavaLine 291 <== SourceLine 143
    public final char ICONE=(char)('j');
    // JavaLine 293 <== SourceLine 144
    public final char ICPRF=(char)('k');
    // JavaLine 295 <== SourceLine 145
    public final char ICSPC=(char)('l');
    // JavaLine 297 <== SourceLine 146
    public final char IDCLA=(char)('m');
    // JavaLine 299 <== SourceLine 147
    public final char IDCLC=(char)('n');
    // JavaLine 301 <== SourceLine 148
    public final char IDCLE=(char)('o');
    // JavaLine 303 <== SourceLine 149
    public final char IDCLP=(char)('p');
    // JavaLine 305 <== SourceLine 150
    public final char IDCLS=(char)('q');
    // JavaLine 307 <== SourceLine 151
    public final char IDIME=(char)('r');
    // JavaLine 309 <== SourceLine 152
    public final char IDOTP=(char)('s');
    // JavaLine 311 <== SourceLine 153
    public final char IEEXP=(char)('t');
    // JavaLine 313 <== SourceLine 154
    public final char IECWI=(char)('u');
    // JavaLine 315 <== SourceLine 155
    public final char IELME=(char)('v');
    // JavaLine 317 <== SourceLine 156
    public final char IELSB=(char)('w');
    // JavaLine 319 <== SourceLine 157
    public final char IEPRM=(char)('x');
    // JavaLine 321 <== SourceLine 158
    public final char IEREC=(char)('y');
    // JavaLine 323 <== SourceLine 159
    public final char IESTM=(char)('z');
    // JavaLine 325 <== SourceLine 160
    public final char IEXNM=(char)('{');
        // JavaLine 327 <== SourceLine 161
        public final char IFASG=(char)('|');
        // JavaLine 329 <== SourceLine 162
    public final char IFDNO=(char)('}');
    // JavaLine 331 <== SourceLine 163
    public final char IFORE=(char)('~');
    // JavaLine 333 <== SourceLine 164
    public final char IFWHN=(char)(((char)127));
    // JavaLine 335 <== SourceLine 165
    public final char IGOE=(char)(((char)128));
    // JavaLine 337 <== SourceLine 166
    public final char IIDNP=(char)(((char)129));
    // JavaLine 339 <== SourceLine 167
    public final char IIFSB=(char)(((char)130));
    // JavaLine 341 <== SourceLine 168
    public final char IIFSE=(char)(((char)131));
    // JavaLine 343 <== SourceLine 169
    public final char ILANG=(char)(((char)132));
    // JavaLine 345 <== SourceLine 170
    public final char ILINE=(char)(((char)133));
    // JavaLine 347 <== SourceLine 171
    public final char INEWP=(char)(((char)134));
    // JavaLine 349 <== SourceLine 172
    public final char IOTHE=(char)(((char)135));
    // JavaLine 351 <== SourceLine 173
    public final char IPRHI=(char)(((char)136));
    // JavaLine 353 <== SourceLine 174
    public final char IPSPC=(char)(((char)137));
    // JavaLine 355 <== SourceLine 175
    public final char ISCST=(char)(((char)138));
    // JavaLine 357 <== SourceLine 176
    public final char ISIDN=(char)(((char)139));
    // JavaLine 359 <== SourceLine 177
    public final char ISIMU=(char)(((char)140));
    // JavaLine 361 <== SourceLine 178
    public final char ISSWA=(char)(((char)141));
    // JavaLine 363 <== SourceLine 179
    public final char ISSWB=(char)(((char)142));
    // JavaLine 365 <== SourceLine 180
    public final char ISWDE=(char)(((char)143));
    // JavaLine 367 <== SourceLine 181
    public final char ISWEE=(char)(((char)144));
    // JavaLine 369 <== SourceLine 182
    public final char ITHSB=(char)(((char)145));
    // JavaLine 371 <== SourceLine 183
    public final char IUMNS=(char)(((char)146));
    // JavaLine 373 <== SourceLine 184
    public final char IUPLS=(char)(((char)147));
    // JavaLine 375 <== SourceLine 185
    public final char IVSPC=(char)(((char)148));
    // JavaLine 377 <== SourceLine 186
    public final char IMXMX=(char)(((char)148));
    // JavaLine 379 <== SourceLine 187
    public final char zerohi=(char)(((char)127));
    // JavaLine 381 <== SourceLine 188
    public final char zerolo=(char)(((char)255));
    // JavaLine 383 <== SourceLine 97
    public final int zero=(int)(0);
    public final int one=(int)(1);
    // JavaLine 386 <== SourceLine 103
    public final char C_unspec=(char)(((char)0));
    // JavaLine 388 <== SourceLine 104
    public final char C_value=(char)(((char)1));
    // JavaLine 390 <== SourceLine 105
    public final char C_name=(char)(((char)2));
    // JavaLine 392 <== SourceLine 106
    public final char C_local=(char)(((char)3));
    // JavaLine 394 <== SourceLine 107
    public final char C_extnal=(char)(((char)4));
    // JavaLine 396 <== SourceLine 108
    public final char C_unknwn=(char)(((char)5));
    // JavaLine 398 <== SourceLine 109
    public final char C_virt=(char)(((char)6));
    // JavaLine 400 <== SourceLine 110
    public final char C_block=(char)(((char)7));
    // JavaLine 402 <== SourceLine 112
    public final char C_max=(char)(((char)7));
    // JavaLine 404 <== SourceLine 150
    public final char K_ident=(char)(((char)0));
    // JavaLine 406 <== SourceLine 151
    public final char K_proc=(char)(((char)1));
    // JavaLine 408 <== SourceLine 152
    public final char K_array=(char)(((char)2));
    // JavaLine 410 <== SourceLine 153
    public final char K_label=(char)(((char)3));
    // JavaLine 412 <== SourceLine 154
    public final char K_switch=(char)(((char)4));
    // JavaLine 414 <== SourceLine 155
    public final char K_class=(char)(((char)5));
    // JavaLine 416 <== SourceLine 156
    public final char K_rep=(char)(((char)6));
    // JavaLine 418 <== SourceLine 157
    public final char K_record=(char)(((char)7));
    // JavaLine 420 <== SourceLine 158
    public final char K_subbl=(char)(((char)8));
    // JavaLine 422 <== SourceLine 159
    public final char K_prefbl=(char)(((char)9));
    // JavaLine 424 <== SourceLine 160
    public final char K_error=(char)(((char)10));
    // JavaLine 426 <== SourceLine 161
    public final char K_labbl=(char)(((char)11));
    // JavaLine 428 <== SourceLine 162
    public final char K_unknwn=(char)(((char)12));
    // JavaLine 430 <== SourceLine 163
    public final char K_extnal=(char)(((char)13));
    // JavaLine 432 <== SourceLine 165
    public final char K_max=(char)(((char)13));
    // JavaLine 434 <== SourceLine 189
    public final char Clf000=(char)(((char)0));
    // JavaLine 436 <== SourceLine 191
    public final char Clf001=(char)(((char)1));
    // JavaLine 438 <== SourceLine 192
    public final char Clf002=(char)(((char)2));
    // JavaLine 440 <== SourceLine 196
    public final char Clf003=(char)(((char)3));
    // JavaLine 442 <== SourceLine 197
    public final char Clf004=(char)(((char)4));
    // JavaLine 444 <== SourceLine 199
    public final char Clf005=(char)(((char)5));
    // JavaLine 446 <== SourceLine 207
    public final char Clf006=(char)(((char)6));
    // JavaLine 448 <== SourceLine 211
    public final char Clf007=(char)(((char)7));
    // JavaLine 450 <== SourceLine 214
    public final char Clf008=(char)(((char)8));
    // JavaLine 452 <== SourceLine 221
    public final char Clf009=(char)(((char)9));
    // JavaLine 454 <== SourceLine 224
    public final char Clf010=(char)(((char)10));
    // JavaLine 456 <== SourceLine 227
    public final char Clf011=(char)(((char)11));
    // JavaLine 458 <== SourceLine 232
    public final char Clf012=(char)(((char)12));
    // JavaLine 460 <== SourceLine 236
    public final char Clf013=(char)(((char)13));
    // JavaLine 462 <== SourceLine 239
    public final char Clf014=(char)(((char)14));
    // JavaLine 464 <== SourceLine 245
    public final char Clf015=(char)(((char)15));
    // JavaLine 466 <== SourceLine 252
    public final char Clf016=(char)(((char)16));
    // JavaLine 468 <== SourceLine 257
    public final char Clf017=(char)(((char)17));
    // JavaLine 470 <== SourceLine 258
    public final char Clf018=(char)(((char)18));
    // JavaLine 472 <== SourceLine 259
    public final char Clf019=(char)(((char)19));
    // JavaLine 474 <== SourceLine 262
    public final char Clf020=(char)(((char)20));
    // JavaLine 476 <== SourceLine 263
    public final char Clf021=(char)(((char)21));
    // JavaLine 478 <== SourceLine 264
    public final char Clf022=(char)(((char)22));
    // JavaLine 480 <== SourceLine 265
    public final char Clf023=(char)(((char)23));
    // JavaLine 482 <== SourceLine 266
    public final char Clf024=(char)(((char)24));
    // JavaLine 484 <== SourceLine 267
    public final char Clf025=(char)(((char)25));
    // JavaLine 486 <== SourceLine 268
    public final char Clf026=(char)(((char)26));
    // JavaLine 488 <== SourceLine 269
    public final char Clf027=(char)(((char)27));
    // JavaLine 490 <== SourceLine 270
    public final char Clf028=(char)(((char)28));
    // JavaLine 492 <== SourceLine 271
    public final char Clf029=(char)(((char)29));
    // JavaLine 494 <== SourceLine 272
    public final char Clf030=(char)(((char)30));
    // JavaLine 496 <== SourceLine 273
    public final char Clf031=(char)(((char)31));
    // JavaLine 498 <== SourceLine 274
    public final char Clf032=(char)(((char)32));
    // JavaLine 500 <== SourceLine 275
    public final char Clf033=(char)('!');
    // JavaLine 502 <== SourceLine 276
    public final char Clf034=(char)('"');
    // JavaLine 504 <== SourceLine 277
    public final char Clf035=(char)('#');
    // JavaLine 506 <== SourceLine 278
    public final char Clf036=(char)('$');
    // JavaLine 508 <== SourceLine 279
    public final char Clf037=(char)('%');
    // JavaLine 510 <== SourceLine 280
    public final char Clf038=(char)('&');
    // JavaLine 512 <== SourceLine 281
    public final char Clf039=(char)(((char)39));
    // JavaLine 514 <== SourceLine 282
    public final char Clf040=(char)('(');
    // JavaLine 516 <== SourceLine 283
    public final char Clf041=(char)(')');
    // JavaLine 518 <== SourceLine 284
    public final char Clf042=(char)('*');
    // JavaLine 520 <== SourceLine 285
    public final char Clf043=(char)('+');
    // JavaLine 522 <== SourceLine 286
    public final char Clf044=(char)(',');
    // JavaLine 524 <== SourceLine 287
    public final char Clf045=(char)('-');
    // JavaLine 526 <== SourceLine 288
    public final char Clf046=(char)('.');
    // JavaLine 528 <== SourceLine 289
    public final char Clf047=(char)('/');
    // JavaLine 530 <== SourceLine 290
    public final char Clf048=(char)('0');
    // JavaLine 532 <== SourceLine 292
    public final char Clfmax=(char)('0');
    // JavaLine 534 <== SourceLine 315
    public int numerrfound=0;
    // JavaLine 536 <== SourceLine 318
    public int simob_level=0;
    // JavaLine 538 <== SourceLine 319
    public int linelength=0;
    public int signiflength=0;
    public int listlength=0;
    // JavaLine 542 <== SourceLine 320
    public int maxnumoftags=0;
    // JavaLine 544 <== SourceLine 321
    public char nextblhi=0;
    public char nextbllo=0;
    // JavaLine 547 <== SourceLine 322
    public boolean simob_descr=false;
    public boolean simob_entity=false;
    public boolean simob_const=false;
    // JavaLine 551 <== SourceLine 323
    public boolean RealCap=false;
    // JavaLine 553 <== SourceLine 324
    public boolean definition=false;
    // JavaLine 555 <== SourceLine 325
    public boolean recomp=false;
    // JavaLine 557 <== SourceLine 326
    public boolean separatecomp=false;
    // JavaLine 559 <== SourceLine 327
    public boolean listingon=false;
    public boolean GiveNotes=false;
    // JavaLine 562 <== SourceLine 328
    public boolean SportOK=false;
    // JavaLine 564 <== SourceLine 329
    public boolean Simuletta=false;
    // JavaLine 566 <== SourceLine 330
    public boolean GenerateScode=false;
    // JavaLine 568 <== SourceLine 332
    public char opt=0;
    public char opn=0;
    public char optx=0;
    // JavaLine 572 <== SourceLine 333
    public char opdhi=0;
    public char opdlo=0;
    // JavaLine 575 <== SourceLine 334
    public char ltype=0;
    public char rtype=0;
    // JavaLine 578 <== SourceLine 335
    public char currentpass=0;
    // JavaLine 580 <== SourceLine 336
    public char termstatus=0;
    // JavaLine 582 <== SourceLine 338
    public RTS_Printfile listfile=null;
    // JavaLine 584 <== SourceLine 339
    public RTS_Outbytefile L2OUPT=null;
    // JavaLine 586 <== SourceLine 340
    public RTS_Inbytefile L2INPT=null;
    // JavaLine 588 <== SourceLine 341
    public CLASS_COMMON_component scanner=null;
    public CLASS_COMMON_component parser=null;
    // JavaLine 591 <== SourceLine 342
    public CLASS_COMMON_outcodefile coder=null;
    // JavaLine 593 <== SourceLine 344
    public CLASS_COMMON_quantity setprefgoing=null;
    public CLASS_COMMON_quantity alloc2called=null;
    // JavaLine 596 <== SourceLine 345
    public CLASS_COMMON_brecord unknowns=null;
    // JavaLine 598 <== SourceLine 347
    public int linenr=0;
    // JavaLine 600 <== SourceLine 348
    public int messageLinenr=0;
    // JavaLine 602 <== SourceLine 349
    public int EXC_NUMBER=0;
    // JavaLine 604 <== SourceLine 352
    public RTS_TXT listpart=null;
    // JavaLine 606 <== SourceLine 353
    public RTS_TXT line=null;
    // JavaLine 608 <== SourceLine 354
    public RTS_TXT L2NAME=null;
    public RTS_TXT nscodename=null;
    // JavaLine 611 <== SourceLine 355
    public RTS_TXT timestamp=null;
    // JavaLine 613 <== SourceLine 356
    public RTS_TXT progheadstring=null;
    // JavaLine 615 <== SourceLine 357
    public RTS_TXT L2codebuffer=null;
    // JavaLine 617 <== SourceLine 358
    public RTS_TXT predefname=null;
    // JavaLine 619 <== SourceLine 359
    public RTS_TXT simsetname=null;
    public RTS_TXT simulaname=null;
    // JavaLine 622 <== SourceLine 360
    public RTS_TXT attrfilename=null;
    public RTS_TXT moduleident=null;
    public RTS_TXT checkcode=null;
    // JavaLine 626 <== SourceLine 362
    public RTS_TXT leftintbuf=null;
    // JavaLine 628 <== SourceLine 363
    public RTS_TXT leftsintbuf=null;
    // JavaLine 630 <== SourceLine 364
    public RTS_TXT permt=null;
    // JavaLine 632 <== SourceLine 368
    public RTS_REF_ARRAY<CLASS_COMMON_brctab2> brctab=null;
    // JavaLine 634 <== SourceLine 369
    public RTS_REF_ARRAY<CLASS_COMMON_quantity> prefixchain=null;
    // JavaLine 636 <== SourceLine 370
    public RTS_REF_ARRAY<CLASS_COMMON_brecord> display=null;
    // JavaLine 638 <== SourceLine 371
    public RTS_TEXT_ARRAY diag=null;
    // JavaLine 640 <== SourceLine 383
    public RTS_TEXT_ARRAY DB=null;
    // JavaLine 642 <== SourceLine 6
    public CLASS_COMMON_TAGTABLE TAGTAB=null;
public RTS_PRCQNT COMMONerror_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: COMMONerror"); }
public RTS_PRCQNT ENDCOMP_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: ENDCOMP"); }
    // Normal Constructor
    public CLASS_COMMON(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        // JavaLine 652 <== SourceLine 41
        symtab=new RTS_REF_ARRAY<CLASS_COMMON_symbolgroup>(new RTS_BOUNDS(0,127));
        // JavaLine 654 <== SourceLine 46
        hashtab=new RTS_REF_ARRAY<CLASS_COMMON_symbolbox>(new RTS_BOUNDS(0,255));
        // JavaLine 656 <== SourceLine 245
        option=new RTS_CHARACTER_ARRAY(new RTS_BOUNDS(0,95));
        // JavaLine 658 <== SourceLine 368
        brctab=new RTS_REF_ARRAY<CLASS_COMMON_brctab2>(new RTS_BOUNDS(0,127));
        // JavaLine 660 <== SourceLine 369
        prefixchain=new RTS_REF_ARRAY<CLASS_COMMON_quantity>(new RTS_BOUNDS(0,64));
        // JavaLine 662 <== SourceLine 370
        display=new RTS_REF_ARRAY<CLASS_COMMON_brecord>(new RTS_BOUNDS(0,63));
        // JavaLine 664 <== SourceLine 371
        diag=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,5));
        // JavaLine 666 <== SourceLine 383
        DB=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,256));
    }
    // Class Statements
    @Override
    public CLASS_COMMON _STM() {
        // JavaLine 672 <== SourceLine 1323
        // BEGIN CLASS_COMMON INNER PART
        // ENDOF CLASS_COMMON INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","8 CLASS_COMMON",1,1,10,26,12,28,17,29,20,30,22,41,24,46,26,51,29,245,31,4,33,5,35,43,37,44,39,45,41,75,43,76,45,77,47,78,49,79,51,80,53,89,55,90,57,91,59,22,61,23,63,24,65,25,67,26,69,27,71,28,73,29,75,30,77,31,79,32,81,33,83,34,85,35,87,36,89,37,91,38,93,39,95,40,97,41,99,42,101,43,103,44,105,45,107,46,109,47,111,48,113,49,115,50,117,51,119,52,121,53,123,54,125,55,127,56,129,57,131,58,133,59,135,60,137,61,139,62,141,63,143,64,145,65,147,66,149,67,151,68,153,69,155,70,157,71,159,72,161,73,163,74,165,75,167,76,169,77,171,78,173,79,175,80,177,81,179,82,181,83,183,84,185,85,187,86,189,87,191,88,193,90,195,91,197,92,199,93,201,94,203,95,205,96,207,97,209,98,211,99,213,100,215,102,217,103,219,104,221,105,223,106,225,107,227,108,229,109,231,110,233,111,235,112,237,113,239,114,241,115,243,116,245,117,247,118,249,119,251,120,253,121,255,122,257,123,259,124,261,125,263,129,265,130,267,131,269,132,271,133,273,134,275,135,277,136,279,137,281,138,283,139,285,140,287,141,289,142,291,143,293,144,295,145,297,146,299,147,301,148,303,149,305,150,307,151,309,152,311,153,313,154,315,155,317,156,319,157,321,158,323,159,325,160,327,161,329,162,331,163,333,164,335,165,337,166,339,167,341,168,343,169,345,170,347,171,349,172,351,173,353,174,355,175,357,176,359,177,361,178,363,179,365,180,367,181,369,182,371,183,373,184,375,185,377,186,379,187,381,188,383,97,386,103,388,104,390,105,392,106,394,107,396,108,398,109,400,110,402,112,404,150,406,151,408,152,410,153,412,154,414,155,416,156,418,157,420,158,422,159,424,160,426,161,428,162,430,163,432,165,434,189,436,191,438,192,440,196,442,197,444,199,446,207,448,211,450,214,452,221,454,224,456,227,458,232,460,236,462,239,464,245,466,252,468,257,470,258,472,259,474,262,476,263,478,264,480,265,482,266,484,267,486,268,488,269,490,270,492,271,494,272,496,273,498,274,500,275,502,276,504,277,506,278,508,279,510,280,512,281,514,282,516,283,518,284,520,285,522,286,524,287,526,288,528,289,530,290,532,292,534,315,536,318,538,319,542,320,544,321,547,322,551,323,553,324,555,325,557,326,559,327,562,328,564,329,566,330,568,332,572,333,575,334,578,335,580,336,582,338,584,339,586,340,588,341,591,342,593,344,596,345,598,347,600,348,602,349,604,352,606,353,608,354,611,355,613,356,615,357,617,358,619,359,622,360,626,362,628,363,630,364,632,368,634,369,636,370,638,371,640,383,642,6,652,41,654,46,656,245,658,368,660,369,662,370,664,371,666,383,672,1323,677,1323);
} // End of Class
