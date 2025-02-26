package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_Block33 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=2, firstLine=32, lastLine=216, hasLocalClasses=false, System=false
    // Declare local labels
    // JavaLine 8 <== SourceLine 83
    final RTS_LABEL _LABEL_simtst26_Block33_T0_0=new RTS_LABEL(this,0,1,"T0"); // Local Label #1=T0 At PrefixLevel 0
    // JavaLine 10 <== SourceLine 105
    final RTS_LABEL _LABEL_simtst26_Block33_T1_0=new RTS_LABEL(this,0,2,"T1"); // Local Label #2=T1 At PrefixLevel 0
    // JavaLine 12 <== SourceLine 129
    final RTS_LABEL _LABEL_simtst26_Block33_T2_0=new RTS_LABEL(this,0,3,"T2"); // Local Label #3=T2 At PrefixLevel 0
    // JavaLine 14 <== SourceLine 152
    final RTS_LABEL _LABEL_simtst26_Block33_L1_0=new RTS_LABEL(this,0,4,"L1"); // Local Label #4=L1 At PrefixLevel 0
    // JavaLine 16 <== SourceLine 177
    final RTS_LABEL _LABEL_simtst26_Block33_L2_0=new RTS_LABEL(this,0,5,"L2"); // Local Label #5=L2 At PrefixLevel 0
    // JavaLine 18 <== SourceLine 199
    final RTS_LABEL _LABEL_simtst26_Block33_L3_0=new RTS_LABEL(this,0,6,"L3"); // Local Label #6=L3 At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public simtst26_Block33(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        simtst26_Block33 _THIS=(simtst26_Block33)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 83
                {
                    _SIM_LABEL(1,"T0"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT T0 -- Should GOTO L1"));
                }
                ;
                // JavaLine 40 <== SourceLine 84
                if(_VALUE(((((((simtst26)(_CUR._SL)).t_1!=(0))|((((simtst26)(_CUR._SL)).i_1!=(5))))|((((simtst26)(_CUR._SL)).j_1!=(0))))|(((simtst26)(_CUR._SL)).b_1)))) {
                    // JavaLine 42 <== SourceLine 85
                    {
                        // JavaLine 44 <== SourceLine 86
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 47 <== SourceLine 87
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 50 <== SourceLine 88
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 53 <== SourceLine 89
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (1)."));
                        ;
                        // JavaLine 56 <== SourceLine 90
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 59 <== SourceLine 91
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 62 <== SourceLine 92
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 65 <== SourceLine 93
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 68 <== SourceLine 94
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 75 <== SourceLine 95
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 78 <== SourceLine 96
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 84 <== SourceLine 100
                ((simtst26)(_CUR._SL)).t_1=1;
                ;
                // JavaLine 87 <== SourceLine 101
                new simtst26_trace((_CUR._SL),CONC(new RTS_TXT("Should GOTO "),new simtst26_Block33_Pq((_CUR),((simtst26)(_CUR._SL)).i_1)._RESULT));
                ;
                // JavaLine 90 <== SourceLine 102
                _GOTO(new q((_CUR),((simtst26)(_CUR._SL)).i_1)._RESULT); // GOTO EVALUATED LABEL
                ;
                // JavaLine 93 <== SourceLine 105
                {
                    _SIM_LABEL(2,"T1"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT T1 -- Should GOTO L2"));
                }
                ;
                // JavaLine 99 <== SourceLine 106
                if(_VALUE((((simtst26)(_CUR._SL)).t_1!=(1)))) {
                    // JavaLine 101 <== SourceLine 107
                    {
                        // JavaLine 103 <== SourceLine 108
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 106 <== SourceLine 109
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 109 <== SourceLine 110
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 112 <== SourceLine 111
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (2)."));
                        ;
                        // JavaLine 115 <== SourceLine 112
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 118 <== SourceLine 113
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 121 <== SourceLine 114
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 124 <== SourceLine 115
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 127 <== SourceLine 116
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 134 <== SourceLine 117
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 137 <== SourceLine 118
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 143 <== SourceLine 122
                ((simtst26)(_CUR._SL)).t_1=2;
                ;
                // JavaLine 146 <== SourceLine 123
                ((simtst26)(_CUR._SL)).j_1=5;
                ;
                // JavaLine 149 <== SourceLine 124
                ((simtst26)(_CUR._SL)).b_1=true;
                ;
                // JavaLine 152 <== SourceLine 125
                new simtst26_trace((_CUR._SL),new RTS_TXT("Just before GOTO L2"));
                ;
                // JavaLine 155 <== SourceLine 126
                new simtst26_trace((_CUR._SL),CONC(new RTS_TXT("Should GOTO "),new simtst26_Block33_Ps((_CUR),4)._RESULT));
                ;
                // JavaLine 158 <== SourceLine 127
                _GOTO(new s((_CUR),4)._RESULT); // GOTO EVALUATED LABEL
                ;
                // JavaLine 161 <== SourceLine 129
                {
                    _SIM_LABEL(3,"T2"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT T2 -- Should GOTO L3"));
                }
                ;
                // JavaLine 167 <== SourceLine 130
                if(_VALUE(((((((simtst26)(_CUR._SL)).t_1!=(2))|((((simtst26)(_CUR._SL)).i_1!=(5))))|((((simtst26)(_CUR._SL)).j_1!=(5))))|((!(((simtst26)(_CUR._SL)).b_1)))))) {
                    // JavaLine 169 <== SourceLine 131
                    {
                        // JavaLine 171 <== SourceLine 132
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 174 <== SourceLine 133
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 177 <== SourceLine 134
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 180 <== SourceLine 135
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (3)."));
                        ;
                        // JavaLine 183 <== SourceLine 136
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 186 <== SourceLine 137
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 189 <== SourceLine 138
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 192 <== SourceLine 139
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 195 <== SourceLine 140
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 202 <== SourceLine 141
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 205 <== SourceLine 142
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 211 <== SourceLine 146
                ((simtst26)(_CUR._SL)).t_1=((simtst26)(_CUR._SL)).j_1=((simtst26)(_CUR._SL)).i_1=3;
                ;
                ((simtst26)(_CUR._SL)).b_1=false;
                ;
                // JavaLine 216 <== SourceLine 147
                new simtst26_trace((_CUR._SL),new RTS_TXT("Just before GOTO L3"));
                ;
                // JavaLine 219 <== SourceLine 149
                _GOTO(new s((_CUR),3)._RESULT); // GOTO EVALUATED LABEL
                ;
                // JavaLine 222 <== SourceLine 152
                {
                    _SIM_LABEL(4,"L1"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT L1 -- Should GOTO T1"));
                }
                ;
                // JavaLine 228 <== SourceLine 154
                if(_VALUE(((((((simtst26)(_CUR._SL)).t_1!=(1))|((((simtst26)(_CUR._SL)).i_1!=(5))))|((((simtst26)(_CUR._SL)).j_1!=(0))))|(((simtst26)(_CUR._SL)).b_1)))) {
                    // JavaLine 230 <== SourceLine 155
                    {
                        // JavaLine 232 <== SourceLine 156
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 235 <== SourceLine 157
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 238 <== SourceLine 158
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 241 <== SourceLine 159
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (4)."));
                        ;
                        // JavaLine 244 <== SourceLine 160
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 247 <== SourceLine 161
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 250 <== SourceLine 162
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 253 <== SourceLine 163
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 256 <== SourceLine 164
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 263 <== SourceLine 165
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 266 <== SourceLine 166
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 272 <== SourceLine 170
                new simtst26_Block33_Block170((_CUR))._STM();
                ;
                // JavaLine 275 <== SourceLine 177
                {
                    _SIM_LABEL(5,"L2"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT L2 -- Should GOTO T2"));
                }
                ;
                // JavaLine 281 <== SourceLine 179
                if(_VALUE(((((((simtst26)(_CUR._SL)).t_1!=(2))|((((simtst26)(_CUR._SL)).i_1!=(5))))|((((simtst26)(_CUR._SL)).j_1!=(5))))|((!(((simtst26)(_CUR._SL)).b_1)))))) {
                    // JavaLine 283 <== SourceLine 180
                    {
                        // JavaLine 285 <== SourceLine 181
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 288 <== SourceLine 182
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 291 <== SourceLine 183
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 294 <== SourceLine 184
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (5)."));
                        ;
                        // JavaLine 297 <== SourceLine 185
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 300 <== SourceLine 186
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 303 <== SourceLine 187
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 306 <== SourceLine 188
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 309 <== SourceLine 189
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 316 <== SourceLine 190
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 319 <== SourceLine 191
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 325 <== SourceLine 195
                ((simtst26)(_CUR._SL)).b_1=true;
                ;
                // JavaLine 328 <== SourceLine 196
                _GOTO(new st((_CUR),((simtst26)(_CUR._SL)).t_1)._RESULT); // GOTO EVALUATED LABEL
                ;
                // JavaLine 331 <== SourceLine 199
                {
                    _SIM_LABEL(6,"L3"); // DeclaredIn: Block33
                    new simtst26_trace((_CUR._SL),new RTS_TXT("AT L3 -- Should TERMINATE"));
                }
                ;
                // JavaLine 337 <== SourceLine 201
                if(_VALUE(((((((simtst26)(_CUR._SL)).t_1!=(3))|((((simtst26)(_CUR._SL)).i_1!=(3))))|((((simtst26)(_CUR._SL)).j_1!=(3))))|(((simtst26)(_CUR._SL)).b_1)))) {
                    // JavaLine 339 <== SourceLine 202
                    {
                        // JavaLine 341 <== SourceLine 203
                        new SimulaTest_err((_CUR._SL),new RTS_TXT("Evaluation of designational expression,"));
                        ;
                        // JavaLine 344 <== SourceLine 204
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 347 <== SourceLine 205
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           goto statement or program sequence "));
                        ;
                        // JavaLine 350 <== SourceLine 206
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("control (6)."));
                        ;
                        // JavaLine 353 <== SourceLine 207
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 356 <== SourceLine 208
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           Value of significant variables :"));
                        ;
                        // JavaLine 359 <== SourceLine 209
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 362 <== SourceLine 210
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("           "));
                        ;
                        // JavaLine 365 <== SourceLine 211
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).t_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).i_1,3);
                        ;
                        RTS_BASICIO.sysout().outint(((simtst26)(_CUR._SL)).j_1,3);
                        ;
                        // JavaLine 372 <== SourceLine 212
                        RTS_BASICIO.sysout().outtext(((((simtst26)(_CUR._SL)).b_1)?(new RTS_TXT(" true")):(new RTS_TXT(" false"))));
                        ;
                        // JavaLine 375 <== SourceLine 213
                        RTS_BASICIO.sysout().outimage();
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
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","4 Block33",8,83,10,105,12,129,14,152,16,177,18,199,34,83,40,84,42,85,44,86,47,87,50,88,53,89,56,90,59,91,62,92,65,93,68,94,75,95,78,96,84,100,87,101,90,102,93,105,99,106,101,107,103,108,106,109,109,110,112,111,115,112,118,113,121,114,124,115,127,116,134,117,137,118,143,122,146,123,149,124,152,125,155,126,158,127,161,129,167,130,169,131,171,132,174,133,177,134,180,135,183,136,186,137,189,138,192,139,195,140,202,141,205,142,211,146,216,147,219,149,222,152,228,154,230,155,232,156,235,157,238,158,241,159,244,160,247,161,250,162,253,163,256,164,263,165,266,166,272,170,275,177,281,179,283,180,285,181,288,182,291,183,294,184,297,185,300,186,303,187,306,188,309,189,316,190,319,191,325,195,328,196,331,199,337,201,339,202,341,203,344,204,347,205,350,206,353,207,356,208,359,209,362,210,365,211,372,212,375,213,390,216);
} // End of SubBlock
