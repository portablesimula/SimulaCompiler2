// JavaLine 1 <== SourceLine 24
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Feb 04 10:50:30 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst05 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=24, lastLine=370, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 26
    public int i1_1=0;
    // JavaLine 12 <== SourceLine 27
    public int i2_1=0;
    // JavaLine 14 <== SourceLine 28
    public int s1_1=0;
    // JavaLine 16 <== SourceLine 29
    public int s2_1=0;
    // JavaLine 18 <== SourceLine 30
    public float r1_1=0.0f;
    // JavaLine 20 <== SourceLine 31
    public float r2_1=0.0f;
    // JavaLine 22 <== SourceLine 32
    public double l1_1=0.0d;
    // JavaLine 24 <== SourceLine 33
    public double l2_1=0.0d;
    // JavaLine 26 <== SourceLine 35
    public int maxpint_1=0;
    // JavaLine 28 <== SourceLine 36
    public int maxnint_1=0;
    // JavaLine 30 <== SourceLine 37
    public int maxpshort_1=0;
    // JavaLine 32 <== SourceLine 38
    public int maxnshort_1=0;
    // JavaLine 34 <== SourceLine 39
    public float maxpreal_1=0.0f;
    // JavaLine 36 <== SourceLine 40
    public float minpreal_1=0.0f;
    // JavaLine 38 <== SourceLine 41
    public float maxnreal_1=0.0f;
    // JavaLine 40 <== SourceLine 42
    public float minnreal_1=0.0f;
    // JavaLine 42 <== SourceLine 43
    public double maxplreal_1=0.0d;
    // JavaLine 44 <== SourceLine 44
    public double minplreal_1=0.0d;
    // JavaLine 46 <== SourceLine 45
    public double maxnlreal_1=0.0d;
    // JavaLine 48 <== SourceLine 46
    public double minnlreal_1=0.0d;
    // JavaLine 50 <== SourceLine 341
    public RTS_Printfile _inspect_341_0_1=null;
    // JavaLine 52 <== SourceLine 354
    public RTS_Printfile _inspect_354_1_1=null;
    // JavaLine 54 <== SourceLine 367
    public RTS_Printfile _inspect_367_2_1=null;
    // Normal Constructor
    public simtst05(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst05");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst05 _STM() {
        RTS_COMMON._LINE("PrefixedBlock simtst05",16); // JavaLine 66 <== SourceLine 16
        if(_VALUE(false)) {
            {
                RTS_COMMON._LINE("PrefixedBlock simtst05",17); // JavaLine 69 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst05",18); // JavaLine 76 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst05",19); // JavaLine 79 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",22); // JavaLine 87 <== SourceLine 22
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",24); // JavaLine 89 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                RTS_COMMON._LINE("PrefixedBlock simtst05",25); // JavaLine 94 <== SourceLine 25
                if(_VALUE(((SimulaTest)(_CUR)).found_error)) {
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst05",26); // JavaLine 97 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR)).nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_COMMON._LINE("PrefixedBlock simtst05",27); // JavaLine 108 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR)).nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    RTS_COMMON._LINE("PrefixedBlock simtst05",28); // JavaLine 113 <== SourceLine 28
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst05",29); // JavaLine 115 <== SourceLine 29
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                        ;
                    }
                }
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst05",32); // JavaLine 127 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst05",33); // JavaLine 130 <== SourceLine 33
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
            }
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",49); // JavaLine 143 <== SourceLine 49
        maxpint_1=2147483647;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",50); // JavaLine 146 <== SourceLine 50
        maxnint_1=-2147483648;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",52); // JavaLine 149 <== SourceLine 52
        maxpshort_1=32767;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",53); // JavaLine 152 <== SourceLine 53
        maxnshort_1=-32768;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",55); // JavaLine 155 <== SourceLine 55
        maxpreal_1=3.4028235E38f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",56); // JavaLine 158 <== SourceLine 56
        minpreal_1=RTS_ENVIRONMENT.addepsilon(0.0f);
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",57); // JavaLine 161 <== SourceLine 57
        maxnreal_1=-3.4028235E38f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",58); // JavaLine 164 <== SourceLine 58
        minnreal_1=RTS_ENVIRONMENT.subepsilon(0.0f);
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",60); // JavaLine 167 <== SourceLine 60
        maxplreal_1=1.7976931348623157E308d;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",61); // JavaLine 170 <== SourceLine 61
        minplreal_1=RTS_ENVIRONMENT.addepsilon(0.0d);
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",62); // JavaLine 173 <== SourceLine 62
        maxnlreal_1=-1.7976931348623157E308d;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",63); // JavaLine 176 <== SourceLine 63
        minnlreal_1=RTS_ENVIRONMENT.subepsilon(0.0d);
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",67); // JavaLine 179 <== SourceLine 67
        if(_VALUE(((((((i1_1==(0))&((!((i1_1<(i2_1))))))&((i1_1<=(i2_1))))&((!((i1_1>(i2_1))))))&((0>=(i2_1))))&((!((i1_1!=(i2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",70); // JavaLine 183 <== SourceLine 70
            new SimulaTest_err((_CUR),new RTS_TXT("INT.1 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",72); // JavaLine 187 <== SourceLine 72
        i1_1=50;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",74); // JavaLine 190 <== SourceLine 74
        if(_VALUE(((((((!((i1_1==(i2_1))))&((!((i1_1<(0))))))&((!((99<=(i2_1))))))&((i1_1>(i2_1))))&((i1_1>=(i2_1))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",77); // JavaLine 194 <== SourceLine 77
            new SimulaTest_err((_CUR),new RTS_TXT("INT.2 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",79); // JavaLine 198 <== SourceLine 79
        i1_1=i2_1;
        ;
        i2_1=100;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",81); // JavaLine 203 <== SourceLine 81
        if(_VALUE(((((((!((i1_1==(i2_1))))&((i1_1<(i2_1))))&((i1_1<=(1))))&((!((0>(i2_1))))))&((!((i1_1>=(i2_1))))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",84); // JavaLine 207 <== SourceLine 84
            new SimulaTest_err((_CUR),new RTS_TXT("INT.3 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",86); // JavaLine 211 <== SourceLine 86
        i1_1=i2_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",88); // JavaLine 214 <== SourceLine 88
        if(_VALUE(((((((i1_1==(i2_1))&((!((i1_1<(100))))))&((i1_1<=(i2_1))))&((!((i1_1>(i2_1))))))&((100>=(i2_1))))&((!((i1_1!=(i2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",91); // JavaLine 218 <== SourceLine 91
            new SimulaTest_err((_CUR),new RTS_TXT("INT.4 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",93); // JavaLine 222 <== SourceLine 93
        i2_1=maxpint_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",95); // JavaLine 225 <== SourceLine 95
        if(_VALUE(((((((!((i1_1==(i2_1))))&((i1_1<(101))))&((1<=(i2_1))))&((!((i1_1>(i2_1))))))&((!((i1_1>=(i2_1))))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",98); // JavaLine 229 <== SourceLine 98
            new SimulaTest_err((_CUR),new RTS_TXT("INT.5 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",100); // JavaLine 233 <== SourceLine 100
        i2_1=50;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",102); // JavaLine 236 <== SourceLine 102
        if(_VALUE(((((((!((i1_1==(49))))&((!((i1_1<(i2_1))))))&((!((i1_1<=(i2_1))))))&((i1_1>(3))))&((i1_1>=(i2_1))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",105); // JavaLine 240 <== SourceLine 105
            new SimulaTest_err((_CUR),new RTS_TXT("INT.6 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",107); // JavaLine 244 <== SourceLine 107
        i2_1=-1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",109); // JavaLine 247 <== SourceLine 109
        if(_VALUE(((((((!((i1_1==(-18))))&((!((i1_1<(i2_1))))))&((!((i1_1<=(i2_1))))))&((1>(i2_1))))&((i1_1>=(i2_1))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",112); // JavaLine 251 <== SourceLine 112
            new SimulaTest_err((_CUR),new RTS_TXT("INT.7 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",114); // JavaLine 255 <== SourceLine 114
        i1_1=-33;
        ;
        i2_1=1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",116); // JavaLine 260 <== SourceLine 116
        if(_VALUE(((((((!((i1_1==(i2_1))))&((i1_1<(i2_1))))&((i1_1<=(i2_1))))&((!((i1_1>(i2_1))))))&((!((-3>=(i2_1))))))&((i1_1!=(55)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",119); // JavaLine 264 <== SourceLine 119
            new SimulaTest_err((_CUR),new RTS_TXT("INT.8 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",121); // JavaLine 268 <== SourceLine 121
        i1_1=0;
        ;
        i2_1=-10;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",123); // JavaLine 273 <== SourceLine 123
        if(_VALUE(((((((!((0==(i2_1))))&((!((i1_1<(-23))))))&((!((i1_1<=(i2_1))))))&((i1_1>(i2_1))))&((i1_1>=(i2_1))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",126); // JavaLine 277 <== SourceLine 126
            new SimulaTest_err((_CUR),new RTS_TXT("INT.9 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",128); // JavaLine 281 <== SourceLine 128
        i2_1=i1_1;
        ;
        i1_1=-1003;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",130); // JavaLine 286 <== SourceLine 130
        if(_VALUE(((((((!((i1_1==(i2_1))))&((i1_1<(0))))&((i1_1<=(i2_1))))&((!((-4>(i2_1))))))&((!((i1_1>=(i2_1))))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",133); // JavaLine 290 <== SourceLine 133
            new SimulaTest_err((_CUR),new RTS_TXT("INT.10 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",135); // JavaLine 294 <== SourceLine 135
        i2_1=i1_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",137); // JavaLine 297 <== SourceLine 137
        if(_VALUE(((((((i1_1==(i2_1))&((!((i1_1<(-1003))))))&((i1_1<=(i2_1))))&((!((i1_1>(i2_1))))))&((i1_1>=(i2_1))))&((!((i1_1!=(i2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",140); // JavaLine 301 <== SourceLine 140
            new SimulaTest_err((_CUR),new RTS_TXT("INT.11 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",142); // JavaLine 305 <== SourceLine 142
        i2_1=-2000;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",144); // JavaLine 308 <== SourceLine 144
        if(_VALUE(((((((!((i1_1==(-3200))))&((!((i1_1<(i2_1))))))&((!((i1_1<=(i2_1))))))&((i1_1>(i2_1))))&((-1>=(i2_1))))&((i1_1!=(i2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",147); // JavaLine 312 <== SourceLine 147
            new SimulaTest_err((_CUR),new RTS_TXT("INT.12 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",154); // JavaLine 316 <== SourceLine 154
        s1_1=68;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",156); // JavaLine 319 <== SourceLine 156
        if(_VALUE(((((((!((s1_1==(s2_1))))&((!((s1_1<(s2_1))))))&((s1_1<=(100))))&((!((0>(s2_1))))))&((s1_1>=(s2_1))))&((s1_1!=(s2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",159); // JavaLine 323 <== SourceLine 159
            new SimulaTest_err((_CUR),new RTS_TXT("SINT.1 (comparing short INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",161); // JavaLine 327 <== SourceLine 161
        s1_1=10;
        ;
        s2_1=maxnshort_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",163); // JavaLine 332 <== SourceLine 163
        if(_VALUE(((((((!((68==(s2_1))))&((!((s1_1<(s2_1))))))&((!((i2_1<=(s2_1))))))&((s1_1>(s2_1))))&((s1_1>=(s2_1))))&((!((s1_1!=(10)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",166); // JavaLine 336 <== SourceLine 166
            new SimulaTest_err((_CUR),new RTS_TXT("SINT.2 (comparing short INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",168); // JavaLine 340 <== SourceLine 168
        s1_1=-5;
        ;
        s2_1=-800;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",170); // JavaLine 345 <== SourceLine 170
        if(_VALUE(((((((!((s1_1==(s2_1))))&((!((s1_1<(s2_1))))))&((s1_1<=(-5))))&((s1_1>(s2_1))))&((s1_1>=(s2_1))))&((s1_1!=(s2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",173); // JavaLine 349 <== SourceLine 173
            new SimulaTest_err((_CUR),new RTS_TXT("SINT.3 (comparing short INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",178); // JavaLine 353 <== SourceLine 178
        if(_VALUE(((((((r1_1==(0.0f))&((!((0.0f<(r2_1))))))&((r1_1<=(r2_1))))&((!((r1_1>(r2_1))))))&((r1_1>=(r2_1))))&((!((r1_1!=(r2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",181); // JavaLine 357 <== SourceLine 181
            new SimulaTest_err((_CUR),new RTS_TXT("real.1 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",183); // JavaLine 361 <== SourceLine 183
        r1_1=minpreal_1;
        ;
        r2_1=0.0f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",185); // JavaLine 366 <== SourceLine 185
        if(_VALUE(((((((r2_1==(0.0f))&((!((r1_1<(r2_1))))))&((!((r1_1<=(r2_1))))))&((r1_1>(r2_1))))&((r1_1>=(r2_1))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",188); // JavaLine 370 <== SourceLine 188
            new SimulaTest_err((_CUR),new RTS_TXT("real.2 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",190); // JavaLine 374 <== SourceLine 190
        r1_1=0.0f;
        ;
        r2_1=3.4567E7f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",192); // JavaLine 379 <== SourceLine 192
        if(_VALUE(((((((r1_1==(r1_1))&((r1_1<(88.0f))))&((r1_1<=(r2_1))))&((!((r1_1>(r2_1))))))&((!((0.0f>=(r2_1))))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",195); // JavaLine 383 <== SourceLine 195
            new SimulaTest_err((_CUR),new RTS_TXT("real.3 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",197); // JavaLine 387 <== SourceLine 197
        r2_1=r1_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",199); // JavaLine 390 <== SourceLine 199
        if(_VALUE(((((((r1_1==(r2_1))&((!((r1_1<(r2_1))))))&((r2_1<=(r1_1))))&((!((r1_1>(r2_1))))))&((r1_1>=(r2_1))))&((!((r2_1!=(r1_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",202); // JavaLine 394 <== SourceLine 202
            new SimulaTest_err((_CUR),new RTS_TXT("real.4 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",204); // JavaLine 398 <== SourceLine 204
        r2_1=3.4568E7f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",206); // JavaLine 401 <== SourceLine 206
        if(_VALUE(((((((r2_1==(r2_1))&((r1_1<(r2_1))))&((r1_1<=(r2_1))))&((!((r1_1>(r2_1))))))&((!((r1_1>=(3.4568E7f))))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",209); // JavaLine 405 <== SourceLine 209
            new SimulaTest_err((_CUR),new RTS_TXT("real.5 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",211); // JavaLine 409 <== SourceLine 211
        r1_1=20.0f;
        ;
        r2_1=2.0E11f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",213); // JavaLine 414 <== SourceLine 213
        if(_VALUE(((((((r1_1==(r1_1))&((r1_1<(r2_1))))&((0.1f<=(r2_1))))&((!((r1_1>(r2_1))))))&((!((r1_1>=(r2_1))))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",216); // JavaLine 418 <== SourceLine 216
            new SimulaTest_err((_CUR),new RTS_TXT("real.6 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",218); // JavaLine 422 <== SourceLine 218
        r1_1=maxnreal_1;
        ;
        r2_1=minpreal_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",220); // JavaLine 427 <== SourceLine 220
        if(_VALUE(((((((r1_1==(r1_1))&((r1_1<(r2_1))))&((-0.1f<=(r2_1))))&((!((r1_1>(2.0E-5f))))))&((!((r1_1>=(r2_1))))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",223); // JavaLine 431 <== SourceLine 223
            new SimulaTest_err((_CUR),new RTS_TXT("real.7 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",225); // JavaLine 435 <== SourceLine 225
        r1_1=maxpreal_1;
        ;
        r2_1=-0.00222222f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",227); // JavaLine 440 <== SourceLine 227
        if(_VALUE(((((((r2_1==(r2_1))&((!((23.456f<(r2_1))))))&((!((r1_1<=(r2_1))))))&((r1_1>(-1.1f))))&((r1_1>=(r2_1))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",230); // JavaLine 444 <== SourceLine 230
            new SimulaTest_err((_CUR),new RTS_TXT("real.8 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",232); // JavaLine 448 <== SourceLine 232
        r1_1=0.0f;
        ;
        r2_1=-58.9f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",234); // JavaLine 453 <== SourceLine 234
        if(_VALUE(((((((r1_1==(-0.0f))&((!((0.0f<(r2_1))))))&((!((r1_1<=(r2_1))))))&((r1_1>(r2_1))))&((r1_1>=(r2_1))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",237); // JavaLine 457 <== SourceLine 237
            new SimulaTest_err((_CUR),new RTS_TXT("real.9 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",239); // JavaLine 461 <== SourceLine 239
        r1_1=-58.9f;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",241); // JavaLine 464 <== SourceLine 241
        if(_VALUE(((((((r1_1==(r2_1))&((!((r2_1<(r1_1))))))&((r1_1<=(r2_1))))&((!((r1_1>(r2_1))))))&((r2_1>=(r1_1))))&((!((r1_1!=(r2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",244); // JavaLine 468 <== SourceLine 244
            new SimulaTest_err((_CUR),new RTS_TXT("real.10 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",246); // JavaLine 472 <== SourceLine 246
        r1_1=maxnreal_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",248); // JavaLine 475 <== SourceLine 248
        if(_VALUE(((((((r2_1==(r2_1))&((r1_1<(r2_1))))&((r1_1<=(-0.22f))))&((!((r1_1>(r2_1))))))&((!((r1_1>=(r2_1))))))&((r1_1!=(r2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",251); // JavaLine 479 <== SourceLine 251
            new SimulaTest_err((_CUR),new RTS_TXT("real.11 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",256); // JavaLine 483 <== SourceLine 256
        if(_VALUE(((((((l1_1==(l2_1))&((!((l1_1<(l2_1))))))&((0.0d<=(l2_1))))&((!((l1_1>(l2_1))))))&((l1_1>=(0.0d))))&((!((l1_1!=(l2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",259); // JavaLine 487 <== SourceLine 259
            new SimulaTest_err((_CUR),new RTS_TXT("long.1 (comparing long REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",261); // JavaLine 491 <== SourceLine 261
        l1_1=maxplreal_1;
        ;
        l2_1=280000.0d;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",263); // JavaLine 496 <== SourceLine 263
        if(_VALUE(((((((l1_1==(l1_1))&((!((281000.0d<(l2_1))))))&((!((l1_1<=(l2_1))))))&((l1_1>(l2_1))))&((l1_1>=(l2_1))))&((l1_1!=(l2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",266); // JavaLine 500 <== SourceLine 266
            new SimulaTest_err((_CUR),new RTS_TXT("long.2 (comparing long REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",268); // JavaLine 504 <== SourceLine 268
        l1_1=minnlreal_1;
        ;
        l2_1=0.0d;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",270); // JavaLine 509 <== SourceLine 270
        if(_VALUE(((((((l1_1==(l1_1))&((l1_1<(l2_1))))&((l1_1<=(l2_1))))&((!((l1_1>(l2_1))))))&((!((l1_1>=(l2_1))))))&((l1_1!=(l2_1)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",273); // JavaLine 513 <== SourceLine 273
            new SimulaTest_err((_CUR),new RTS_TXT("long.3 (comparing long REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",280); // JavaLine 517 <== SourceLine 280
        if(_VALUE(((((((l2_1==(0.0d))&((((double)(r1_1))<(l2_1))))&((!((l1_1<=(((double)(r2_1))))))))&((!((((double)(r1_1))>(l1_1))))))&((!((((double)(r1_1))>=(2.0E10d))))))&((!((r2_1!=(r2_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",283); // JavaLine 521 <== SourceLine 283
            new SimulaTest_err((_CUR),new RTS_TXT("RL.1 (comparing real and long real)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",290); // JavaLine 525 <== SourceLine 290
        if(_VALUE(((((((i2_1==(i2_1))&((!((((float)(i1_1))<(r1_1))))))&((!((r2_1<=(((float)(i2_1))))))))&((((float)(i2_1))>(r1_1))))&((!((r1_1>=(-100000.0f))))))&((r2_1!=(((float)(i1_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",293); // JavaLine 529 <== SourceLine 293
            new SimulaTest_err((_CUR),new RTS_TXT("RI.1 (comparing real and integer)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",300); // JavaLine 533 <== SourceLine 300
        if(_VALUE(((((((i2_1==(i2_1))&((!((l1_1<(((double)(i1_1))))))))&((!((l2_1<=(((double)(i2_1))))))))&((!((l1_1>(1.0d))))))&((!((((double)(i1_1))>=(l2_1))))))&((l2_1!=(((double)(i1_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",303); // JavaLine 537 <== SourceLine 303
            new SimulaTest_err((_CUR),new RTS_TXT("IL.1 (comparing integer and long real)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",310); // JavaLine 541 <== SourceLine 310
        if(_VALUE(((((((s2_1==(s2_1))&((!((((float)(s1_1))<(r1_1))))))&((r1_1<=(((float)(s2_1))))))&((r2_1>(((float)(s2_1))))))&((!((r2_1>=(((float)(s1_1))))))))&((!((r1_1!=(r1_1)))))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",313); // JavaLine 545 <== SourceLine 313
            new SimulaTest_err((_CUR),new RTS_TXT("SR.1 (comparing short integer and real)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",320); // JavaLine 549 <== SourceLine 320
        if(_VALUE(((((((l1_1==(l1_1))&((!((l2_1<(((double)(s1_1))))))))&((((double)(s2_1))<=(l2_1))))&((l1_1>(((double)(s2_1))))))&((!((l1_1>=(69.0d))))))&((((double)(s2_1))!=(-810.0d)))))) {
            ;
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",323); // JavaLine 553 <== SourceLine 323
            new SimulaTest_err((_CUR),new RTS_TXT("SL.1 (comparing short integer and long real)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",331); // JavaLine 557 <== SourceLine 331
        i1_1=maxnint_1;
        ;
        i2_1=maxpint_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",333); // JavaLine 562 <== SourceLine 333
        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** error: OVERFLOW in test MAX.1 (COMPARING maxint and minint)"));
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",334); // JavaLine 565 <== SourceLine 334
        if(_VALUE(((((((((((((((!((i1_1==(i2_1))))&((-2222<(i2_1))))&((i1_1==(i1_1))))&((i2_1==(i2_1))))&((i1_1<=(i2_1))))&((!((i1_1>(-1))))))&((!((i1_1>=(i2_1))))))&((i1_1!=(i2_1))))&((!((i2_1==(i1_1))))))&((-2222>(i1_1))))&((i2_1>=(i1_1))))&((!((i2_1<(-1))))))&((!((i2_1<=(i1_1))))))&((i2_1!=(i1_1)))))) {
            RTS_COMMON._LINE("PrefixedBlock simtst05",341); // JavaLine 567 <== SourceLine 341
            {
                {
                    // BEGIN INSPECTION 
                    _inspect_341_0_1=RTS_BASICIO.sysout();
                    if(_inspect_341_0_1!=null) { // INSPECT _inspect_341_0
                        {
                            {
                                _ASGTXT(_inspect_341_0_1.image,null);
                                ;
                                _inspect_341_0_1.setpos(1);
                            }
                        }
                    }
                } // END INSPECTION
            }
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",342); // JavaLine 584 <== SourceLine 342
            new SimulaTest_err((_CUR),new RTS_TXT("MAX.1 (comparing INTEGERs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",344); // JavaLine 588 <== SourceLine 344
        r1_1=maxnreal_1;
        ;
        r2_1=maxpreal_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",346); // JavaLine 593 <== SourceLine 346
        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** error: OVERFLOW in test MAX.2 (COMPARING maxreal and minreal)"));
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",347); // JavaLine 596 <== SourceLine 347
        if(_VALUE(((((((((((((((!((r1_1==(r2_1))))&((-2222.0f<(r2_1))))&((r1_1==(r1_1))))&((r2_1==(r2_1))))&((r1_1<=(r2_1))))&((!((r1_1>(-1.0f))))))&((!((r1_1>=(r2_1))))))&((r1_1!=(r2_1))))&((!((r2_1==(r1_1))))))&((-2222.0f>(r1_1))))&((r2_1>=(r1_1))))&((!((r2_1<(-1.0f))))))&((!((r2_1<=(r1_1))))))&((r2_1!=(r1_1)))))) {
            RTS_COMMON._LINE("PrefixedBlock simtst05",354); // JavaLine 598 <== SourceLine 354
            {
                {
                    // BEGIN INSPECTION 
                    _inspect_354_1_1=RTS_BASICIO.sysout();
                    if(_inspect_354_1_1!=null) { // INSPECT _inspect_354_1
                        {
                            {
                                _ASGTXT(_inspect_354_1_1.image,null);
                                ;
                                _inspect_354_1_1.setpos(1);
                            }
                        }
                    }
                } // END INSPECTION
            }
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",355); // JavaLine 615 <== SourceLine 355
            new SimulaTest_err((_CUR),new RTS_TXT("MAX.2 (comparing REALs)"));
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",357); // JavaLine 619 <== SourceLine 357
        l1_1=maxnlreal_1;
        ;
        l2_1=maxplreal_1;
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",359); // JavaLine 624 <== SourceLine 359
        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** error: OVERFLOW in test MAX.3 (COMPARING max- and minlongreal)"));
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst05",360); // JavaLine 627 <== SourceLine 360
        if(_VALUE(((((((((((((((!((l1_1==(l2_1))))&((-2222.0d<(l2_1))))&((l1_1==(l1_1))))&((l2_1==(l2_1))))&((l1_1<=(l2_1))))&((!((l1_1>(-1.0d))))))&((!((l1_1>=(l2_1))))))&((l1_1!=(l2_1))))&((!((l2_1==(l1_1))))))&((-2222.0d>(l1_1))))&((l2_1>=(l1_1))))&((!((l2_1<(-1.0d))))))&((!((l2_1<=(l1_1))))))&((l2_1!=(l1_1)))))) {
            RTS_COMMON._LINE("PrefixedBlock simtst05",367); // JavaLine 629 <== SourceLine 367
            {
                {
                    // BEGIN INSPECTION 
                    _inspect_367_2_1=RTS_BASICIO.sysout();
                    if(_inspect_367_2_1!=null) { // INSPECT _inspect_367_2
                        {
                            {
                                _ASGTXT(_inspect_367_2_1.image,null);
                                ;
                                _inspect_367_2_1.setpos(1);
                            }
                        }
                    }
                } // END INSPECTION
            }
        } else {
            RTS_COMMON._LINE("PrefixedBlock simtst05",368); // JavaLine 646 <== SourceLine 368
            new SimulaTest_err((_CUR),new RTS_TXT("MAX.3 (comparing long REALs)"));
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new simtst05(_CTX,5,new RTS_TXT("--- Test arithm. relations"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst05.sim","PrefixedBlock simtst05",1,24,10,26,12,27,14,28,16,29,18,30,20,31,22,32,24,33,26,35,28,36,30,37,32,38,34,39,36,40,38,41,40,42,42,43,44,44,46,45,48,46,50,341,52,354,54,367,66,16,69,17,76,18,79,19,87,22,89,24,94,25,97,26,108,27,113,28,115,29,127,32,130,33,143,49,146,50,149,52,152,53,155,55,158,56,161,57,164,58,167,60,170,61,173,62,176,63,179,67,183,70,187,72,190,74,194,77,198,79,203,81,207,84,211,86,214,88,218,91,222,93,225,95,229,98,233,100,236,102,240,105,244,107,247,109,251,112,255,114,260,116,264,119,268,121,273,123,277,126,281,128,286,130,290,133,294,135,297,137,301,140,305,142,308,144,312,147,316,154,319,156,323,159,327,161,332,163,336,166,340,168,345,170,349,173,353,178,357,181,361,183,366,185,370,188,374,190,379,192,383,195,387,197,390,199,394,202,398,204,401,206,405,209,409,211,414,213,418,216,422,218,427,220,431,223,435,225,440,227,444,230,448,232,453,234,457,237,461,239,464,241,468,244,472,246,475,248,479,251,483,256,487,259,491,261,496,263,500,266,504,268,509,270,513,273,517,280,521,283,525,290,529,293,533,300,537,303,541,310,545,313,549,320,553,323,557,331,562,333,565,334,567,341,584,342,588,344,593,346,596,347,598,354,615,355,619,357,624,359,627,360,629,367,646,368,658,370);
} // End of Class
