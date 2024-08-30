// JavaLine 1 <== SourceLine 1139
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_whilstat extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=1139, lastLine=1198, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1153
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_whilstat_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1155
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_whilstat_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1167
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_whilstat_Block1162_recover1_0=new RTS_LABEL(this,1,3,"recover1"); // Local Label #3=recover1 At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1172
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_whilstat_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // Declare locals as attributes
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_whilstat_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_whilstat_recoversetting.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_whilstat(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_whilstat _STM() {
        CLASS_PARSER_grammer_whilstat _THIS=(CLASS_PARSER_grammer_whilstat)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,4); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 37 <== SourceLine 1151
                detach(1151);
                ;
                // JavaLine 40 <== SourceLine 1152
                {
                    _SIM_LABEL(1); // DeclaredIn: whilstat
                    // JavaLine 43 <== SourceLine 1153
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("WHILE"));
                    }
                }
                ;
                // JavaLine 49 <== SourceLine 1155
                {
                    _SIM_LABEL(2); // DeclaredIn: whilstat
                    caller.stmttype=((char)1);
                }
                ;
                // JavaLine 55 <== SourceLine 1156
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 58 <== SourceLine 1157
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='B';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1157);
                ;
                // JavaLine 63 <== SourceLine 1158
                if(_VALUE(((((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('['))&&((((CLASS_PARSER)(_CUR._SL._SL)).opdhi==(((char)0)))))&&((((CLASS_PARSER)(_CUR._SL._SL)).opdlo==('B'))))&&((((CLASS_PARSER)(_CUR._SL._SL)).opt==(((char)28))))))) {
                    // JavaLine 65 <== SourceLine 1160
                    rp=((char)3);
                } else {
                    // JavaLine 68 <== SourceLine 1161
                    {
                        // JavaLine 70 <== SourceLine 1162
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)130);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1162);
                        ;
                        // JavaLine 75 <== SourceLine 1163
                        call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,1163);
                        ;
                        // JavaLine 78 <== SourceLine 1164
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr||((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))))) {
                            {
                                // JavaLine 81 <== SourceLine 1165
                                new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),(((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)28))))?(206):(205)));
                                ;
                                // JavaLine 84 <== SourceLine 1166
                                _GOTO(_LABEL_CLASS_PARSER_grammer_whilstat_PARSE_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 89 <== SourceLine 1167
                        {
                            _SIM_LABEL(3); // DeclaredIn: whilstat -> whilstat[CLASS_PARSER_grammer_whilstat] DeclarationKind=Class
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)145);
                        }
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1167);
                        ;
                        // JavaLine 97 <== SourceLine 1168
                        rp=((char)1);
                        ;
                    }
                }
                ;
                // JavaLine 103 <== SourceLine 1170
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 106 <== SourceLine 1172
                {
                    _SIM_LABEL(4); // DeclaredIn: whilstat
                    detach(1172);
                }
                ;
                // JavaLine 112 <== SourceLine 1174
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='C';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1174);
                ;
                // JavaLine 117 <== SourceLine 1175
                if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(rp) { // BEGIN SWITCH STATEMENT
                    case 0: 
                    // JavaLine 121 <== SourceLine 1177
                    _GOTO(_LABEL_CLASS_PARSER_grammer_whilstat_S0_1); // GOTO EVALUATED LABEL
                    break;
                    case 2: 
                    // JavaLine 125 <== SourceLine 1179
                    _GOTO(_LABEL_CLASS_PARSER_grammer_whilstat_Block1162_recover1_0); // GOTO EVALUATED LABEL
                    break;
                    case 1: 
                    // JavaLine 129 <== SourceLine 1180
                    {
                        // JavaLine 131 <== SourceLine 1181
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)131);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1181);
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 139 <== SourceLine 1184
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack while"));
                }
                ;
                // JavaLine 144 <== SourceLine 1186
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 149 <== SourceLine 1187
                ((CLASS_PARSER_grammer)(_CUR._SL)).whList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 152 <== SourceLine 1189
                detach(1189);
                ;
                // JavaLine 155 <== SourceLine 1192
                ((CLASS_PARSER_grammer)(_CUR._SL)).whList_1=null;
                ;
                // JavaLine 158 <== SourceLine 1193
                errorno=0;
                ;
                // JavaLine 161 <== SourceLine 1194
                recovered=isblocklike=false;
                ;
                // JavaLine 164 <== SourceLine 1195
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 167 <== SourceLine 1196
                _GOTO(_LABEL_CLASS_PARSER_grammer_whilstat_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 170 <== SourceLine 1198
                // BEGIN whilstat INNER PART
                // ENDOF whilstat INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 whilstat",1,1139,11,1153,13,1155,15,1167,17,1172,35,712,37,1151,40,1152,43,1153,49,1155,55,1156,58,1157,63,1158,65,1160,68,1161,70,1162,75,1163,78,1164,81,1165,84,1166,89,1167,97,1168,103,1170,106,1172,112,1174,117,1175,121,1177,125,1179,129,1180,131,1181,139,1184,144,1186,149,1187,152,1189,155,1192,158,1193,161,1194,164,1195,167,1196,170,1198,183,1198);
} // End of Class
