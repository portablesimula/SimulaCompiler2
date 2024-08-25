// JavaLine 1 <== SourceLine 973
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_blockOrComp extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=973, lastLine=1125, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1021
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1029
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1065
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_unitmore_1=new RTS_LABEL(this,1,3,"unitmore"); // Local Label #3=unitmore At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1067
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1073
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_recoverfromhere_1=new RTS_LABEL(this,1,5,"recoverfromhere"); // Local Label #5=recoverfromhere At PrefixLevel 1
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_S1_1=new RTS_LABEL(this,1,6,"S1"); // Local Label #6=S1 At PrefixLevel 1
    // JavaLine 22 <== SourceLine 1091
    final RTS_LABEL _LABEL_PARSER_grammer_blockOrComp_endrecover_1=new RTS_LABEL(this,1,7,"endrecover"); // Local Label #7=endrecover At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 975
    public boolean innerseen_1=false;
    // JavaLine 27 <== SourceLine 976
    public boolean labels_1=false;
    public boolean type_1=false;
    public boolean unlabbody_1=false;
    // JavaLine 31 <== SourceLine 977
    public char blocktype_1=0;
    // JavaLine 33 <== SourceLine 980
    public char R_1=0;
    // JavaLine 35 <== SourceLine 981
    public int recovernox_1=0;
    public int recoverno_1=0;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_blockOrComp_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,PARSER_grammer_blockOrComp_recoversetting.class)); }
    // Normal Constructor
    public PARSER_grammer_blockOrComp(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_blockOrComp _STM() {
        PARSER_grammer_blockOrComp _THIS=(PARSER_grammer_blockOrComp)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 53 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 55 <== SourceLine 1019
                detach(1019);
                ;
                // JavaLine 58 <== SourceLine 1020
                {
                    _SIM_LABEL(1); // DeclaredIn: blockOrComp
                    // JavaLine 61 <== SourceLine 1021
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W1((_CUR._SL._SL),new RTS_TXT("blockOrComp"),RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).last_1.stmtreq));
                    }
                }
                ;
                // JavaLine 67 <== SourceLine 1022
                labels_1=((PARSER_grammer)(_CUR._SL)).labelused_1;
                ;
                // JavaLine 70 <== SourceLine 1023
                if(_VALUE((caller.stmtreq==(((char)2))))) {
                    {
                        // JavaLine 73 <== SourceLine 1024
                        ((PARSER_grammer_module)(caller)).SepOK_1=true;
                        ;
                        // JavaLine 76 <== SourceLine 1026
                        if(_VALUE(_IS(((PARSER)(_CUR._SL._SL)).coder,PARSER_codebuffer.class))) {
                            // JavaLine 78 <== SourceLine 1027
                            new PARSER_codebuffer_termModul(((PARSER_codebuffer)(((PARSER)(_CUR._SL._SL)).coder)));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 85 <== SourceLine 1029
                {
                    _SIM_LABEL(2); // DeclaredIn: blockOrComp
                    if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.startexprstmt)) {
                        {
                            // JavaLine 90 <== SourceLine 1030
                            ((PARSER_grammer)(_CUR._SL)).ex_1.startexprstmt=false;
                            ;
                            // JavaLine 93 <== SourceLine 1032
                            ((PARSER)(_CUR._SL._SL)).opn=(((((PARSER)(_CUR._SL._SL)).optx!=(((char)0))))?(']'):(((char)32)));
                            ;
                            // JavaLine 96 <== SourceLine 1034
                            call(((PARSER)(_CUR._SL._SL)).coder,1034);
                            ;
                            // JavaLine 99 <== SourceLine 1035
                            ((PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 102 <== SourceLine 1036
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                                {
                                    ((PARSER)(_CUR._SL._SL)).opn='o';
                                    ;
                                    call(((PARSER)(_CUR._SL._SL)).coder,1036);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 112 <== SourceLine 1037
                            isblocklike=true;
                            ;
                            ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                            ;
                            // JavaLine 117 <== SourceLine 1038
                            blocktype_1=((char)2);
                            ;
                            blockstatus=((char)1);
                            ;
                            // JavaLine 122 <== SourceLine 1039
                            R_1=((PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            _GOTO(_LABEL_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 131 <== SourceLine 1042
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 134 <== SourceLine 1043
                unlabbody_1=((!(labels_1))&&(((caller.stmtreq==(((char)3)))|((caller.stmtreq==(((char)5)))))));
                ;
                // JavaLine 137 <== SourceLine 1045
                isblocklike=true;
                ;
                // JavaLine 140 <== SourceLine 1046
                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs))==(((char)1)))||(((((PARSER_grammer)(_CUR._SL)).cs==('Z'))&&(((((PARSER)(_CUR._SL._SL)).opt==(((char)30)))||((((PARSER)(_CUR._SL._SL)).opt==(((char)31))))))))))) {
                    // JavaLine 142 <== SourceLine 1049
                    {
                        // JavaLine 144 <== SourceLine 1051
                        blocktype_1=((char)1);
                        ;
                        blockstatus=((char)1);
                        ;
                        // JavaLine 149 <== SourceLine 1052
                        if(_VALUE((!(unlabbody_1)))) {
                            {
                                // JavaLine 152 <== SourceLine 1053
                                ((PARSER)(_CUR._SL._SL)).opn='\\';
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,1053);
                                ;
                                // JavaLine 157 <== SourceLine 1054
                                ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 165 <== SourceLine 1057
                    {
                        // JavaLine 167 <== SourceLine 1058
                        blocktype_1=((PARSER_grammer)(_CUR._SL)).compstmt_1;
                        ;
                        blockstatus=((char)2);
                        ;
                        // JavaLine 172 <== SourceLine 1059
                        if(_VALUE(unlabbody_1)) {
                            {
                                ((PARSER)(_CUR._SL._SL)).opn='o';
                                ;
                                call(((PARSER)(_CUR._SL._SL)).coder,1059);
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 184 <== SourceLine 1062
                R_1=((((caller.stmtreq==(((char)3)))&&((!(labels_1)))))?(((char)4)):(((PARSER_grammer)(_CUR._SL)).allstmt_1));
                ;
                // JavaLine 187 <== SourceLine 1065
                {
                    _SIM_LABEL(3); // DeclaredIn: blockOrComp
                    rp=((char)1);
                }
                ;
                stmtreq=R_1;
                ;
                // JavaLine 195 <== SourceLine 1067
                {
                    _SIM_LABEL(4); // DeclaredIn: blockOrComp
                    detach(1067);
                }
                ;
                // JavaLine 201 <== SourceLine 1069
                if(_VALUE((rp==(((char)0))))) {
                    _GOTO(_LABEL_PARSER_grammer_blockOrComp_S0_1); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 206 <== SourceLine 1072
                {
                    _SIM_LABEL(5); // DeclaredIn: blockOrComp
                    _SIM_LABEL(6); // DeclaredIn: blockOrComp
                    // JavaLine 210 <== SourceLine 1073
                    if(_VALUE((stmttype==(((char)3))))) {
                        {
                            // JavaLine 213 <== SourceLine 1074
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                                {
                                    // JavaLine 216 <== SourceLine 1075
                                    stmttype=((char)4);
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 223 <== SourceLine 1076
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                                _GOTO(_LABEL_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            }
                            ;
                        }
                    } else {
                        // JavaLine 230 <== SourceLine 1078
                        if(_VALUE((stmttype!=(((char)4))))) {
                            blockstatus=((char)2);
                        }
                    }
                }
                ;
                // JavaLine 237 <== SourceLine 1080
                if(_VALUE((recoverno_1!=(0)))) {
                    {
                        // JavaLine 240 <== SourceLine 1081
                        recovernox_1=recoverno_1;
                        ;
                        recoverno_1=0;
                        ;
                        // JavaLine 245 <== SourceLine 1082
                        if(_VALUE((recovernox_1==(2)))) {
                            _GOTO(_LABEL_PARSER_grammer_blockOrComp_endrecover_1); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 250 <== SourceLine 1083
                        if(_VALUE((recovernox_1==(3)))) {
                            _GOTO(_LABEL_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 258 <== SourceLine 1086
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                    {
                        // JavaLine 261 <== SourceLine 1087
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                            {
                                // JavaLine 264 <== SourceLine 1088
                                ((PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                _GOTO(_LABEL_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 271 <== SourceLine 1089
                        new PARSER_grammer_syntaxerror((_CUR._SL),204);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_blockOrComp_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 279 <== SourceLine 1091
                {
                    _SIM_LABEL(7); // DeclaredIn: blockOrComp
                    if(_VALUE(((blocktype_1==(((char)2)))|(((blocktype_1==(((char)1)))&((!(unlabbody_1)))))))) {
                        // JavaLine 283 <== SourceLine 1093
                        {
                            // JavaLine 285 <== SourceLine 1096
                            ((PARSER)(_CUR._SL._SL)).opdlo=(((innerseen_1||((blockstatus!=(((char)2))))))?(((char)0)):(((char)1)));
                            ;
                            // JavaLine 288 <== SourceLine 1098
                            ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,1098);
                            ;
                            // JavaLine 293 <== SourceLine 1099
                            ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                        }
                    }
                }
                ;
                // JavaLine 299 <== SourceLine 1100
                if(_VALUE((caller.stmtreq==(((char)3))))) {
                    {
                        // JavaLine 302 <== SourceLine 1101
                        if(_VALUE(innerseen_1)) {
                            // JavaLine 304 <== SourceLine 1102
                            ((PARSER_grammer_declaration)(caller)).innerseen_1=true;
                        } else {
                            // JavaLine 307 <== SourceLine 1103
                            ((PARSER_grammer_declaration)(caller)).priorseen_1=(blockstatus!=(((char)2)));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 314 <== SourceLine 1107
                ((PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 317 <== SourceLine 1108
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack blockOrComp"));
                }
                ;
                // JavaLine 322 <== SourceLine 1110
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 327 <== SourceLine 1111
                ((PARSER_grammer)(_CUR._SL)).exList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 330 <== SourceLine 1113
                detach(1113);
                ;
                // JavaLine 333 <== SourceLine 1116
                ((PARSER_grammer)(_CUR._SL)).exList_1=null;
                ;
                // JavaLine 336 <== SourceLine 1117
                recovernox_1=recoverno_1=errorno=0;
                ;
                // JavaLine 339 <== SourceLine 1119
                innerseen_1=labels_1=type_1=unlabbody_1=recovered=isblocklike=false;
                ;
                // JavaLine 342 <== SourceLine 1121
                blocktype_1=R_1=rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 345 <== SourceLine 1123
                _GOTO(_LABEL_PARSER_grammer_blockOrComp_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 348 <== SourceLine 1125
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 blockOrComp",1,973,11,1021,13,1029,15,1065,17,1067,19,1073,22,1091,25,975,27,976,31,977,33,980,35,981,53,711,55,1019,58,1020,61,1021,67,1022,70,1023,73,1024,76,1026,78,1027,85,1029,90,1030,93,1032,96,1034,99,1035,102,1036,112,1037,117,1038,122,1039,131,1042,134,1043,137,1045,140,1046,142,1049,144,1051,149,1052,152,1053,157,1054,165,1057,167,1058,172,1059,184,1062,187,1065,195,1067,201,1069,206,1072,210,1073,213,1074,216,1075,223,1076,230,1078,237,1080,240,1081,245,1082,250,1083,258,1086,261,1087,264,1088,271,1089,279,1091,283,1093,285,1096,288,1098,293,1099,299,1100,302,1101,304,1102,307,1103,314,1107,317,1108,322,1110,327,1111,330,1113,333,1116,336,1117,339,1119,342,1121,345,1123,348,1125,361,1125);
} // End of Class
