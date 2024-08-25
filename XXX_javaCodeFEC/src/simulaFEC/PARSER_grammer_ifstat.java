// JavaLine 1 <== SourceLine 1218
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_ifstat extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1218, lastLine=1290, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1240
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1242
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1250
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_Block1249_Block1250_recover1_0=new RTS_LABEL(this,1,3,"recover1"); // Local Label #3=recover1 At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1257
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1266
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_S1_1=new RTS_LABEL(this,1,5,"S1"); // Local Label #5=S1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1270
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_Block1270_recover2_0=new RTS_LABEL(this,1,6,"recover2"); // Local Label #6=recover2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 1275
    final RTS_LABEL _LABEL_PARSER_grammer_ifstat_S2_1=new RTS_LABEL(this,1,7,"S2"); // Local Label #7=S2 At PrefixLevel 1
    // Declare locals as attributes
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_ifstat_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,PARSER_grammer_ifstat_recoversetting.class)); }
    // Normal Constructor
    public PARSER_grammer_ifstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_ifstat _STM() {
        PARSER_grammer_ifstat _THIS=(PARSER_grammer_ifstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 41 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 43 <== SourceLine 1238
                detach(1238);
                ;
                // JavaLine 46 <== SourceLine 1239
                {
                    _SIM_LABEL(1); // DeclaredIn: ifstat
                    // JavaLine 49 <== SourceLine 1240
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("IF"));
                    }
                }
                ;
                // JavaLine 55 <== SourceLine 1242
                {
                    _SIM_LABEL(2); // DeclaredIn: ifstat
                    if(_VALUE((caller.stmtreq==(((char)1))))) {
                        new PARSER_grammer_ParsWarn((_CUR._SL),213);
                    }
                }
                ;
                // JavaLine 63 <== SourceLine 1243
                caller.stmttype=((char)1);
                ;
                // JavaLine 66 <== SourceLine 1244
                ((PARSER)(_CUR._SL._SL)).opn=((char)130);
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1244);
                ;
                // JavaLine 71 <== SourceLine 1245
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 74 <== SourceLine 1246
                call(((PARSER_grammer)(_CUR._SL)).ex_1,1246);
                ;
                // JavaLine 77 <== SourceLine 1247
                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    new PARSER_grammer_syntaxerror((_CUR._SL),205);
                } else {
                    // JavaLine 81 <== SourceLine 1248
                    {
                        // JavaLine 83 <== SourceLine 1249
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('1')))) {
                            {
                                // JavaLine 86 <== SourceLine 1250
                                {
                                    _SIM_LABEL(3); // DeclaredIn: ifstat -> ifstat[PARSER_grammer_ifstat] DeclarationKind=Class
                                    ((PARSER)(_CUR._SL._SL)).opn=((char)145);
                                }
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,1250);
                                ;
                                // JavaLine 94 <== SourceLine 1251
                                ((PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 97 <== SourceLine 1252
                                stmtreq=((char)1);
                                ;
                                rp=((char)1);
                                ;
                            }
                        } else {
                            // JavaLine 104 <== SourceLine 1253
                            new PARSER_grammer_syntaxerror((_CUR._SL),207);
                        }
                    }
                }
                ;
                // JavaLine 110 <== SourceLine 1257
                {
                    _SIM_LABEL(4); // DeclaredIn: ifstat
                    detach(1257);
                }
                ;
                // JavaLine 116 <== SourceLine 1259
                if(rp<((char)0) || rp>((char)4)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(rp) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    // JavaLine 120 <== SourceLine 1260
                    _GOTO(_LABEL_PARSER_grammer_ifstat_S2_1); // GOTO EVALUATED LABEL
                    break;
                    case 3: 
                    // JavaLine 124 <== SourceLine 1261
                    _GOTO(_LABEL_PARSER_grammer_ifstat_Block1249_Block1250_recover1_0); // GOTO EVALUATED LABEL
                    break;
                    case 4: 
                    // JavaLine 128 <== SourceLine 1262
                    _GOTO(_LABEL_PARSER_grammer_ifstat_Block1270_recover2_0); // GOTO EVALUATED LABEL
                    break;
                    case 0: 
                    // JavaLine 132 <== SourceLine 1263
                    _GOTO(_LABEL_PARSER_grammer_ifstat_S0_1); // GOTO EVALUATED LABEL
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 137 <== SourceLine 1266
                {
                    _SIM_LABEL(5); // DeclaredIn: ifstat
                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)15))))) {
                        {
                            // JavaLine 142 <== SourceLine 1270
                            {
                                _SIM_LABEL(6); // DeclaredIn: ifstat -> ifstat[PARSER_grammer_ifstat] DeclarationKind=Class
                                ((PARSER)(_CUR._SL._SL)).opn='w';
                            }
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1270);
                            ;
                            // JavaLine 150 <== SourceLine 1271
                            ((PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 153 <== SourceLine 1272
                            stmtreq=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            rp=((char)2);
                            ;
                            _GOTO(_LABEL_PARSER_grammer_ifstat_PARSE_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 164 <== SourceLine 1275
                {
                    _SIM_LABEL(7); // DeclaredIn: ifstat
                    ((PARSER)(_CUR._SL._SL)).opn=((char)131);
                }
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1275);
                ;
                // JavaLine 172 <== SourceLine 1276
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack if"));
                }
                ;
                // JavaLine 177 <== SourceLine 1278
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 182 <== SourceLine 1279
                ((PARSER_grammer)(_CUR._SL)).ifList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 185 <== SourceLine 1281
                detach(1281);
                ;
                // JavaLine 188 <== SourceLine 1284
                ((PARSER_grammer)(_CUR._SL)).ifList_1=null;
                ;
                // JavaLine 191 <== SourceLine 1285
                errorno=0;
                ;
                // JavaLine 194 <== SourceLine 1286
                recovered=isblocklike=false;
                ;
                // JavaLine 197 <== SourceLine 1287
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 200 <== SourceLine 1288
                _GOTO(_LABEL_PARSER_grammer_ifstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 203 <== SourceLine 1290
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 ifstat",1,1218,11,1240,13,1242,15,1250,17,1257,19,1266,21,1270,23,1275,41,711,43,1238,46,1239,49,1240,55,1242,63,1243,66,1244,71,1245,74,1246,77,1247,81,1248,83,1249,86,1250,94,1251,97,1252,104,1253,110,1257,116,1259,120,1260,124,1261,128,1262,132,1263,137,1266,142,1270,150,1271,153,1272,164,1275,172,1276,177,1278,182,1279,185,1281,188,1284,191,1285,194,1286,197,1287,200,1288,203,1290,216,1290);
} // End of Class
