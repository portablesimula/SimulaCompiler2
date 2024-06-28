// JavaLine 1 <== SourceLine 9
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jun 25 08:48:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Precompiled144 extends SimulaTest {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=1, firstLine=9, lastLine=80, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 11
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 12 <== SourceLine 12
    public int traceCase_1=0;
    // JavaLine 14 <== SourceLine 13
    public Precompiled144_A x_1=null;
    public int K_1=0;
    // JavaLine 17 <== SourceLine 15
    public final int iConst_1=(int)(7531);
    // JavaLine 19 <== SourceLine 16
    public final float rConst_1=(float)(3.14f);
    // JavaLine 21 <== SourceLine 17
    public final double lrConst_1=(double)(4.130000114440918d);
    // JavaLine 23 <== SourceLine 18
    public final char cConst_1=(char)('Z');
    // JavaLine 25 <== SourceLine 19
    public final RTS_TXT tConst_1=(RTS_TXT)(new RTS_TXT("AbraCaDabra"));
    // JavaLine 27 <== SourceLine 20
    public final boolean bConst_1=(boolean)(true);
    // Normal Constructor
    public Precompiled144(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 34 <== SourceLine 11
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,14));
    }
    // Class Statements
    @Override
    public Precompiled144 _STM() {
        // JavaLine 40 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 43 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 50 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 53 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 61 <== SourceLine 22
        // BEGIN INNER PART
        // JavaLine 63 <== SourceLine 47
        facit.putELEMENT(facit.index(0),new RTS_TXT("At START"));
        ;
        // JavaLine 66 <== SourceLine 48
        facit.putELEMENT(facit.index(1),new RTS_TXT("TEST-1: OK"));
        ;
        // JavaLine 69 <== SourceLine 49
        facit.putELEMENT(facit.index(2),new RTS_TXT("TEST-2: x is'not A"));
        ;
        // JavaLine 72 <== SourceLine 50
        facit.putELEMENT(facit.index(3),new RTS_TXT("TEST-3: x is B"));
        ;
        // JavaLine 75 <== SourceLine 51
        facit.putELEMENT(facit.index(4),new RTS_TXT("TEST-4: x in A"));
        ;
        // JavaLine 78 <== SourceLine 52
        facit.putELEMENT(facit.index(5),new RTS_TXT("TEST-5: x in B"));
        ;
        // JavaLine 81 <== SourceLine 53
        facit.putELEMENT(facit.index(6),new RTS_TXT("TEST-6: In B with N = 567"));
        ;
        // JavaLine 84 <== SourceLine 54
        facit.putELEMENT(facit.index(7),new RTS_TXT("At Precompiled'END"));
        ;
        // JavaLine 87 <== SourceLine 55
        facit.putELEMENT(facit.index(8),new RTS_TXT("Check iConst = 7531"));
        ;
        // JavaLine 90 <== SourceLine 56
        facit.putELEMENT(facit.index(9),new RTS_TXT("Check rConst = 3.140"));
        ;
        // JavaLine 93 <== SourceLine 57
        facit.putELEMENT(facit.index(10),new RTS_TXT("Check lrConst = 4.130"));
        ;
        // JavaLine 96 <== SourceLine 58
        facit.putELEMENT(facit.index(11),new RTS_TXT("Check cConst = Z"));
        ;
        // JavaLine 99 <== SourceLine 59
        facit.putELEMENT(facit.index(12),new RTS_TXT("Check tConst = AbraCaDabra"));
        ;
        // JavaLine 102 <== SourceLine 60
        facit.putELEMENT(facit.index(13),new RTS_TXT("Check bConst = true"));
        ;
        // JavaLine 105 <== SourceLine 61
        facit.putELEMENT(facit.index(14),new RTS_TXT("At Main'END with K = 432"));
        ;
        // JavaLine 108 <== SourceLine 63
        new Precompiled144_trace((_CUR),new RTS_TXT("At START"));
        ;
        // JavaLine 111 <== SourceLine 64
        x_1=new Precompiled144_B((_CUR))._STM();
        ;
        // JavaLine 114 <== SourceLine 66
        if(_VALUE((((Precompiled144_B)(x_1)).N_1==(567)))) {
            new Precompiled144_trace((_CUR),new RTS_TXT("TEST-1: OK"));
        }
        ;
        // JavaLine 119 <== SourceLine 68
        if(_VALUE(_IS(x_1,Precompiled144_A.class))) {
            ;
        } else {
            new Precompiled144_trace((_CUR),new RTS_TXT("TEST-2: x is'not A"));
        }
        ;
        // JavaLine 126 <== SourceLine 69
        if(_VALUE(_IS(x_1,Precompiled144_B.class))) {
            new Precompiled144_trace((_CUR),new RTS_TXT("TEST-3: x is B"));
        }
        ;
        // JavaLine 131 <== SourceLine 71
        if(_VALUE(x_1 instanceof Precompiled144_A)) {
            new Precompiled144_trace((_CUR),new RTS_TXT("TEST-4: x in A"));
        }
        ;
        // JavaLine 136 <== SourceLine 72
        if(_VALUE(x_1 instanceof Precompiled144_B)) {
            new Precompiled144_trace((_CUR),new RTS_TXT("TEST-5: x in B"));
        }
        ;
        // JavaLine 141 <== SourceLine 74
        new Precompiled144_PBLK74((_CUR))._STM();
        ;
        // JavaLine 144 <== SourceLine 78
        new Precompiled144_trace((_CUR),new RTS_TXT("At Precompiled'END"));
        ;
        // JavaLine 147 <== SourceLine 80
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        ;
        // JavaLine 152 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                // JavaLine 157 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 160 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 169 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 174 <== SourceLine 28
                    {
                        // JavaLine 176 <== SourceLine 29
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                    }
                }
                ;
                // JavaLine 188 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 191 <== SourceLine 33
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Precompiled144.sim","8 Precompiled144",1,9,10,11,12,12,14,13,17,15,19,16,21,17,23,18,25,19,27,20,34,11,40,16,43,17,50,18,53,19,61,22,63,47,66,48,69,49,72,50,75,51,78,52,81,53,84,54,87,55,90,56,93,57,96,58,99,59,102,60,105,61,108,63,111,64,114,66,119,68,126,69,131,71,136,72,141,74,144,78,147,80,152,24,157,25,160,26,169,27,174,28,176,29,188,32,191,33,206,80);
} // End of Class
