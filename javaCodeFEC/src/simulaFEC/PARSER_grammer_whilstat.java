// JavaLine 1 <== SourceLine 1138
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_whilstat extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1138, lastLine=1197, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1152
    final RTS_LABEL _LABEL_PARSER_grammer_whilstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1154
    final RTS_LABEL _LABEL_PARSER_grammer_whilstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1166
    final RTS_LABEL _LABEL_PARSER_grammer_whilstat_Block1161_recover1_0=new RTS_LABEL(this,1,3,"recover1"); // Local Label #3=recover1 At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1171
    final RTS_LABEL _LABEL_PARSER_grammer_whilstat_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // Declare locals as attributes
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_whilstat_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,PARSER_grammer_whilstat_recoversetting.class)); }
    // Normal Constructor
    public PARSER_grammer_whilstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_whilstat _STM() {
        PARSER_grammer_whilstat _THIS=(PARSER_grammer_whilstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,4); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 37 <== SourceLine 1150
                detach(1150);
                ;
                // JavaLine 40 <== SourceLine 1151
                {
                    _SIM_LABEL(1); // DeclaredIn: whilstat
                    // JavaLine 43 <== SourceLine 1152
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("WHILE"));
                    }
                }
                ;
                // JavaLine 49 <== SourceLine 1154
                {
                    _SIM_LABEL(2); // DeclaredIn: whilstat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 55 <== SourceLine 1155
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 58 <== SourceLine 1156
                ((PARSER)(_CUR._SL._SL)).opn='B';
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1156);
                ;
                // JavaLine 63 <== SourceLine 1157
                if(_VALUE(((((((PARSER_grammer)(_CUR._SL)).cs==('['))&&((((PARSER)(_CUR._SL._SL)).opdhi==(((char)0)))))&&((((PARSER)(_CUR._SL._SL)).opdlo==('B'))))&&((((PARSER)(_CUR._SL._SL)).opt==(((char)28))))))) {
                    // JavaLine 65 <== SourceLine 1159
                    rp=((char)3);
                } else {
                    // JavaLine 68 <== SourceLine 1160
                    {
                        // JavaLine 70 <== SourceLine 1161
                        ((PARSER)(_CUR._SL._SL)).opn=((char)130);
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,1161);
                        ;
                        // JavaLine 75 <== SourceLine 1162
                        call(((PARSER_grammer)(_CUR._SL)).ex_1,1162);
                        ;
                        // JavaLine 78 <== SourceLine 1163
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr||((((PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))))) {
                            {
                                // JavaLine 81 <== SourceLine 1164
                                new PARSER_grammer_syntaxerror((_CUR._SL),(((((PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))?(206):(205)));
                                ;
                                // JavaLine 84 <== SourceLine 1165
                                _GOTO(_LABEL_PARSER_grammer_whilstat_PARSE_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 89 <== SourceLine 1166
                        {
                            _SIM_LABEL(3); // DeclaredIn: whilstat -> whilstat[PARSER_grammer_whilstat] DeclarationKind=Class
                            ((PARSER)(_CUR._SL._SL)).opn=((char)145);
                        }
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,1166);
                        ;
                        // JavaLine 97 <== SourceLine 1167
                        rp=((char)1);
                        ;
                    }
                }
                ;
                // JavaLine 103 <== SourceLine 1169
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 106 <== SourceLine 1171
                {
                    _SIM_LABEL(4); // DeclaredIn: whilstat
                    detach(1171);
                }
                ;
                // JavaLine 112 <== SourceLine 1173
                ((PARSER)(_CUR._SL._SL)).opn='C';
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,1173);
                ;
                // JavaLine 117 <== SourceLine 1174
                if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(rp) { // BEGIN SWITCH STATEMENT
                    case 0: 
                    // JavaLine 121 <== SourceLine 1176
                    _GOTO(_LABEL_PARSER_grammer_whilstat_S0_1); // GOTO EVALUATED LABEL
                    break;
                    case 2: 
                    // JavaLine 125 <== SourceLine 1178
                    _GOTO(_LABEL_PARSER_grammer_whilstat_Block1161_recover1_0); // GOTO EVALUATED LABEL
                    break;
                    case 1: 
                    // JavaLine 129 <== SourceLine 1179
                    {
                        // JavaLine 131 <== SourceLine 1180
                        ((PARSER)(_CUR._SL._SL)).opn=((char)131);
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,1180);
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 139 <== SourceLine 1183
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack while"));
                }
                ;
                // JavaLine 144 <== SourceLine 1185
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 149 <== SourceLine 1186
                ((PARSER_grammer)(_CUR._SL)).whList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 152 <== SourceLine 1188
                detach(1188);
                ;
                // JavaLine 155 <== SourceLine 1191
                ((PARSER_grammer)(_CUR._SL)).whList_1=null;
                ;
                // JavaLine 158 <== SourceLine 1192
                errorno=0;
                ;
                // JavaLine 161 <== SourceLine 1193
                recovered=isblocklike=false;
                ;
                // JavaLine 164 <== SourceLine 1194
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 167 <== SourceLine 1195
                _GOTO(_LABEL_PARSER_grammer_whilstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 170 <== SourceLine 1197
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 whilstat",1,1138,11,1152,13,1154,15,1166,17,1171,35,711,37,1150,40,1151,43,1152,49,1154,55,1155,58,1156,63,1157,65,1159,68,1160,70,1161,75,1162,78,1163,81,1164,84,1165,89,1166,97,1167,103,1169,106,1171,112,1173,117,1174,121,1176,125,1178,129,1179,131,1180,139,1183,144,1185,149,1186,152,1188,155,1191,158,1192,161,1193,164,1194,167,1195,170,1197,183,1197);
} // End of Class
