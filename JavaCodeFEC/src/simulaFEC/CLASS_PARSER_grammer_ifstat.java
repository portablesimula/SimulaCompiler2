// JavaLine 1 <== SourceLine 1219
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_ifstat extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1219, lastLine=1291, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1241
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1243
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1251
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_Block1250_Block1251_recover1_0=new RTS_LABEL(this,1,3,"recover1"); // Local Label #3=recover1 At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1258
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1267
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_S1_1=new RTS_LABEL(this,1,5,"S1"); // Local Label #5=S1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 1271
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_Block1271_recover2_0=new RTS_LABEL(this,1,6,"recover2"); // Local Label #6=recover2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 1276
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_ifstat_S2_1=new RTS_LABEL(this,1,7,"S2"); // Local Label #7=S2 At PrefixLevel 1
    // Declare locals as attributes
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_ifstat_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_ifstat_recoversetting.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_ifstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_ifstat _STM() {
        CLASS_PARSER_grammer_ifstat _THIS=(CLASS_PARSER_grammer_ifstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 41 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 43 <== SourceLine 1239
                detach(1239);
                ;
                // JavaLine 46 <== SourceLine 1240
                {
                    _SIM_LABEL(1); // DeclaredIn: ifstat
                    // JavaLine 49 <== SourceLine 1241
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("IF"));
                    }
                }
                ;
                // JavaLine 55 <== SourceLine 1243
                {
                    _SIM_LABEL(2); // DeclaredIn: ifstat
                    if(_VALUE((caller.stmtreq==(((char)1))))) {
                        new CLASS_PARSER_grammer_ParsWarn((_CUR._SL),213);
                    }
                }
                ;
                // JavaLine 63 <== SourceLine 1244
                caller.stmttype=((char)1);
                ;
                // JavaLine 66 <== SourceLine 1245
                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)130);
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1245);
                ;
                // JavaLine 71 <== SourceLine 1246
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 74 <== SourceLine 1247
                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1247);
                ;
                // JavaLine 77 <== SourceLine 1248
                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),205);
                } else {
                    // JavaLine 81 <== SourceLine 1249
                    {
                        // JavaLine 83 <== SourceLine 1250
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('1')))) {
                            {
                                // JavaLine 86 <== SourceLine 1251
                                {
                                    _SIM_LABEL(3); // DeclaredIn: ifstat -> ifstat[CLASS_PARSER_grammer_ifstat] DeclarationKind=Class
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)145);
                                }
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1251);
                                ;
                                // JavaLine 94 <== SourceLine 1252
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                // JavaLine 97 <== SourceLine 1253
                                stmtreq=((char)1);
                                ;
                                rp=((char)1);
                                ;
                            }
                        } else {
                            // JavaLine 104 <== SourceLine 1254
                            new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),207);
                        }
                    }
                }
                ;
                // JavaLine 110 <== SourceLine 1258
                {
                    _SIM_LABEL(4); // DeclaredIn: ifstat
                    detach(1258);
                }
                ;
                // JavaLine 116 <== SourceLine 1260
                if(rp<((char)0) || rp>((char)4)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(rp) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    // JavaLine 120 <== SourceLine 1261
                    _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_S2_1); // GOTO EVALUATED LABEL
                    break;
                    case 3: 
                    // JavaLine 124 <== SourceLine 1262
                    _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_Block1250_Block1251_recover1_0); // GOTO EVALUATED LABEL
                    break;
                    case 4: 
                    // JavaLine 128 <== SourceLine 1263
                    _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_Block1271_recover2_0); // GOTO EVALUATED LABEL
                    break;
                    case 0: 
                    // JavaLine 132 <== SourceLine 1264
                    _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_S0_1); // GOTO EVALUATED LABEL
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 137 <== SourceLine 1267
                {
                    _SIM_LABEL(5); // DeclaredIn: ifstat
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)15))))) {
                        {
                            // JavaLine 142 <== SourceLine 1271
                            {
                                _SIM_LABEL(6); // DeclaredIn: ifstat -> ifstat[CLASS_PARSER_grammer_ifstat] DeclarationKind=Class
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='w';
                            }
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1271);
                            ;
                            // JavaLine 150 <== SourceLine 1272
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 153 <== SourceLine 1273
                            stmtreq=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            rp=((char)2);
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_PARSE_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 164 <== SourceLine 1276
                {
                    _SIM_LABEL(7); // DeclaredIn: ifstat
                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)131);
                }
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1276);
                ;
                // JavaLine 172 <== SourceLine 1277
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack if"));
                }
                ;
                // JavaLine 177 <== SourceLine 1279
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 182 <== SourceLine 1280
                ((CLASS_PARSER_grammer)(_CUR._SL)).ifList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 185 <== SourceLine 1282
                detach(1282);
                ;
                // JavaLine 188 <== SourceLine 1285
                ((CLASS_PARSER_grammer)(_CUR._SL)).ifList_1=null;
                ;
                // JavaLine 191 <== SourceLine 1286
                errorno=0;
                ;
                // JavaLine 194 <== SourceLine 1287
                recovered=isblocklike=false;
                ;
                // JavaLine 197 <== SourceLine 1288
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 200 <== SourceLine 1289
                _GOTO(_LABEL_CLASS_PARSER_grammer_ifstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 203 <== SourceLine 1291
                // BEGIN ifstat INNER PART
                // ENDOF ifstat INNER PART
                // ENDOF statement INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 ifstat",1,1219,11,1241,13,1243,15,1251,17,1258,19,1267,21,1271,23,1276,41,712,43,1239,46,1240,49,1241,55,1243,63,1244,66,1245,71,1246,74,1247,77,1248,81,1249,83,1250,86,1251,94,1252,97,1253,104,1254,110,1258,116,1260,120,1261,124,1262,128,1263,132,1264,137,1267,142,1271,150,1272,153,1273,164,1276,172,1277,177,1279,182,1280,185,1282,188,1285,191,1286,194,1287,197,1288,200,1289,203,1291,216,1291);
} // End of Class
