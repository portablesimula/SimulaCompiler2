// JavaLine 1 <== SourceLine 974
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_blockOrComp extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=974, lastLine=1126, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 1022
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 1030
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1066
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1=new RTS_LABEL(this,1,3,"unitmore"); // Local Label #3=unitmore At PrefixLevel 1
    // JavaLine 17 <== SourceLine 1068
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_PARSE_1=new RTS_LABEL(this,1,4,"PARSE"); // Local Label #4=PARSE At PrefixLevel 1
    // JavaLine 19 <== SourceLine 1074
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_recoverfromhere_1=new RTS_LABEL(this,1,5,"recoverfromhere"); // Local Label #5=recoverfromhere At PrefixLevel 1
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_S1_1=new RTS_LABEL(this,1,6,"S1"); // Local Label #6=S1 At PrefixLevel 1
    // JavaLine 22 <== SourceLine 1092
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_blockOrComp_endrecover_1=new RTS_LABEL(this,1,7,"endrecover"); // Local Label #7=endrecover At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 976
    public boolean innerseen_1=false;
    // JavaLine 27 <== SourceLine 977
    public boolean labels_1=false;
    public boolean type_1=false;
    public boolean unlabbody_1=false;
    // JavaLine 31 <== SourceLine 978
    public char blocktype_1=0;
    // JavaLine 33 <== SourceLine 981
    public char R_1=0;
    // JavaLine 35 <== SourceLine 982
    public int recovernox_1=0;
    public int recoverno_1=0;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_blockOrComp_recover.class)); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_blockOrComp_recoversetting.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_blockOrComp(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_blockOrComp _STM() {
        CLASS_PARSER_grammer_blockOrComp _THIS=(CLASS_PARSER_grammer_blockOrComp)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,7); // For ByteCode Engineering
                // JavaLine 53 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 55 <== SourceLine 1020
                detach(1020);
                ;
                // JavaLine 58 <== SourceLine 1021
                {
                    _SIM_LABEL(1); // DeclaredIn: blockOrComp
                    // JavaLine 61 <== SourceLine 1022
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W1((_CUR._SL._SL),new RTS_TXT("blockOrComp"),RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).last_1.stmtreq));
                    }
                }
                ;
                // JavaLine 67 <== SourceLine 1023
                labels_1=((CLASS_PARSER_grammer)(_CUR._SL)).labelused_1;
                ;
                // JavaLine 70 <== SourceLine 1024
                if(_VALUE((caller.stmtreq==(((char)2))))) {
                    {
                        // JavaLine 73 <== SourceLine 1025
                        ((CLASS_PARSER_grammer_module)(caller)).SepOK_1=true;
                        ;
                        // JavaLine 76 <== SourceLine 1027
                        if(_VALUE(RTS_UTIL._IS(((CLASS_PARSER)(_CUR._SL._SL)).coder,CLASS_PARSER_codebuffer.class))) {
                            // JavaLine 78 <== SourceLine 1028
                            new CLASS_PARSER_codebuffer_termModul(((CLASS_PARSER_codebuffer)(((CLASS_PARSER)(_CUR._SL._SL)).coder)));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 85 <== SourceLine 1030
                {
                    _SIM_LABEL(2); // DeclaredIn: blockOrComp
                    if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.startexprstmt)) {
                        {
                            // JavaLine 90 <== SourceLine 1031
                            ((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.startexprstmt=false;
                            ;
                            // JavaLine 93 <== SourceLine 1033
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=(((((CLASS_PARSER)(_CUR._SL._SL)).optx!=(((char)0))))?(']'):(((char)32)));
                            ;
                            // JavaLine 96 <== SourceLine 1035
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1035);
                            ;
                            // JavaLine 99 <== SourceLine 1036
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 102 <== SourceLine 1037
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                                {
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1037);
                                    ;
                                }
                            }
                            ;
                            // JavaLine 112 <== SourceLine 1038
                            isblocklike=true;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                            ;
                            // JavaLine 117 <== SourceLine 1039
                            blocktype_1=((char)2);
                            ;
                            blockstatus=((char)1);
                            ;
                            // JavaLine 122 <== SourceLine 1040
                            R_1=((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1;
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 131 <== SourceLine 1043
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 134 <== SourceLine 1044
                unlabbody_1=((!(labels_1))&&(((caller.stmtreq==(((char)3)))|((caller.stmtreq==(((char)5)))))));
                ;
                // JavaLine 137 <== SourceLine 1046
                isblocklike=true;
                ;
                // JavaLine 140 <== SourceLine 1047
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs))==(((char)1)))||(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('Z'))&&(((((CLASS_PARSER)(_CUR._SL._SL)).opt==(((char)30)))||((((CLASS_PARSER)(_CUR._SL._SL)).opt==(((char)31))))))))))) {
                    // JavaLine 142 <== SourceLine 1050
                    {
                        // JavaLine 144 <== SourceLine 1052
                        blocktype_1=((char)1);
                        ;
                        blockstatus=((char)1);
                        ;
                        // JavaLine 149 <== SourceLine 1053
                        if(_VALUE((!(unlabbody_1)))) {
                            {
                                // JavaLine 152 <== SourceLine 1054
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='\\';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1054);
                                ;
                                // JavaLine 157 <== SourceLine 1055
                                ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 165 <== SourceLine 1058
                    {
                        // JavaLine 167 <== SourceLine 1059
                        blocktype_1=((CLASS_PARSER_grammer)(_CUR._SL)).compstmt_1;
                        ;
                        blockstatus=((char)2);
                        ;
                        // JavaLine 172 <== SourceLine 1060
                        if(_VALUE(unlabbody_1)) {
                            {
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1060);
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 184 <== SourceLine 1063
                R_1=((((caller.stmtreq==(((char)3)))&&((!(labels_1)))))?(((char)4)):(((CLASS_PARSER_grammer)(_CUR._SL)).allstmt_1));
                ;
                // JavaLine 187 <== SourceLine 1066
                {
                    _SIM_LABEL(3); // DeclaredIn: blockOrComp
                    rp=((char)1);
                }
                ;
                stmtreq=R_1;
                ;
                // JavaLine 195 <== SourceLine 1068
                {
                    _SIM_LABEL(4); // DeclaredIn: blockOrComp
                    detach(1068);
                }
                ;
                // JavaLine 201 <== SourceLine 1070
                if(_VALUE((rp==(((char)0))))) {
                    _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_S0_1); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 206 <== SourceLine 1073
                {
                    _SIM_LABEL(5); // DeclaredIn: blockOrComp
                    _SIM_LABEL(6); // DeclaredIn: blockOrComp
                    // JavaLine 210 <== SourceLine 1074
                    if(_VALUE((stmttype==(((char)3))))) {
                        {
                            // JavaLine 213 <== SourceLine 1075
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                                {
                                    // JavaLine 216 <== SourceLine 1076
                                    stmttype=((char)4);
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 223 <== SourceLine 1077
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                                _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            }
                            ;
                        }
                    } else {
                        // JavaLine 230 <== SourceLine 1079
                        if(_VALUE((stmttype!=(((char)4))))) {
                            blockstatus=((char)2);
                        }
                    }
                }
                ;
                // JavaLine 237 <== SourceLine 1081
                if(_VALUE((recoverno_1!=(0)))) {
                    {
                        // JavaLine 240 <== SourceLine 1082
                        recovernox_1=recoverno_1;
                        ;
                        recoverno_1=0;
                        ;
                        // JavaLine 245 <== SourceLine 1083
                        if(_VALUE((recovernox_1==(2)))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_endrecover_1); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 250 <== SourceLine 1084
                        if(_VALUE((recovernox_1==(3)))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 258 <== SourceLine 1087
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)16))))) {
                    {
                        // JavaLine 261 <== SourceLine 1088
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                            {
                                // JavaLine 264 <== SourceLine 1089
                                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_unitmore_1); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 271 <== SourceLine 1090
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),204);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_PARSE_1); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 279 <== SourceLine 1092
                {
                    _SIM_LABEL(7); // DeclaredIn: blockOrComp
                    if(_VALUE(((blocktype_1==(((char)2)))|(((blocktype_1==(((char)1)))&((!(unlabbody_1)))))))) {
                        // JavaLine 283 <== SourceLine 1094
                        {
                            // JavaLine 285 <== SourceLine 1097
                            ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=(((innerseen_1||((blockstatus!=(((char)2))))))?(((char)0)):(((char)1)));
                            ;
                            // JavaLine 288 <== SourceLine 1099
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,1099);
                            ;
                            // JavaLine 293 <== SourceLine 1100
                            ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                        }
                    }
                }
                ;
                // JavaLine 299 <== SourceLine 1101
                if(_VALUE((caller.stmtreq==(((char)3))))) {
                    {
                        // JavaLine 302 <== SourceLine 1102
                        if(_VALUE(innerseen_1)) {
                            // JavaLine 304 <== SourceLine 1103
                            ((CLASS_PARSER_grammer_declaration)(caller)).innerseen_1=true;
                        } else {
                            // JavaLine 307 <== SourceLine 1104
                            ((CLASS_PARSER_grammer_declaration)(caller)).priorseen_1=(blockstatus!=(((char)2)));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 314 <== SourceLine 1108
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                ;
                // JavaLine 317 <== SourceLine 1109
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack blockOrComp"));
                }
                ;
                // JavaLine 322 <== SourceLine 1111
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 327 <== SourceLine 1112
                ((CLASS_PARSER_grammer)(_CUR._SL)).exList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 330 <== SourceLine 1114
                detach(1114);
                ;
                // JavaLine 333 <== SourceLine 1117
                ((CLASS_PARSER_grammer)(_CUR._SL)).exList_1=null;
                ;
                // JavaLine 336 <== SourceLine 1118
                recovernox_1=recoverno_1=errorno=0;
                ;
                // JavaLine 339 <== SourceLine 1120
                innerseen_1=labels_1=type_1=unlabbody_1=recovered=isblocklike=false;
                ;
                // JavaLine 342 <== SourceLine 1122
                blocktype_1=R_1=rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 345 <== SourceLine 1124
                _GOTO(_LABEL_CLASS_PARSER_grammer_blockOrComp_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 348 <== SourceLine 1126
                // BEGIN blockOrComp INNER PART
                // ENDOF blockOrComp INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 blockOrComp",1,974,11,1022,13,1030,15,1066,17,1068,19,1074,22,1092,25,976,27,977,31,978,33,981,35,982,53,712,55,1020,58,1021,61,1022,67,1023,70,1024,73,1025,76,1027,78,1028,85,1030,90,1031,93,1033,96,1035,99,1036,102,1037,112,1038,117,1039,122,1040,131,1043,134,1044,137,1046,140,1047,142,1050,144,1052,149,1053,152,1054,157,1055,165,1058,167,1059,172,1060,184,1063,187,1066,195,1068,201,1070,206,1073,210,1074,213,1075,216,1076,223,1077,230,1079,237,1081,240,1082,245,1083,250,1084,258,1087,261,1088,264,1089,271,1090,279,1092,283,1094,285,1097,288,1099,293,1100,299,1101,302,1102,304,1103,307,1104,314,1108,317,1109,322,1111,327,1112,330,1114,333,1117,336,1118,339,1120,342,1122,345,1124,348,1126,361,1126);
} // End of Class
