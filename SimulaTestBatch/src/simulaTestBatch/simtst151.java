// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=13, lastLine=146, hasLocalClasses=true, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 14
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 13 <== SourceLine 15
    public int traceCase_1=0;
    // JavaLine 15 <== SourceLine 85
    public boolean b_1=false;
    public boolean b1_1=false;
    // JavaLine 18 <== SourceLine 86
    public char c_1=0;
    public char c1_1=0;
    // JavaLine 21 <== SourceLine 87
    public int i_1=0;
    public int i1_1=0;
    // JavaLine 24 <== SourceLine 88
    public float r_1=0.0f;
    public float r1_1=0.0f;
    // JavaLine 27 <== SourceLine 89
    public double lr_1=0.0d;
    public double lr1_1=0.0d;
    // JavaLine 30 <== SourceLine 90
    public RTS_TXT t_1=null;
    public RTS_TXT t1_1=null;
    // JavaLine 33 <== SourceLine 91
    public simtst151_A x_1=null;
    // Normal Constructor
    public simtst151(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst151");
        // Declaration Code
        // JavaLine 41 <== SourceLine 14
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,15));
    }
    // Class Statements
    @Override
    public simtst151 _STM() {
        // JavaLine 47 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 50 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 57 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 60 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 72 <== SourceLine 93
        facit.putELEMENT(facit.index(0),new RTS_TXT("At START"));
        ;
        // JavaLine 75 <== SourceLine 95
        facit.putELEMENT(facit.index(1),new RTS_TXT("P\u005fB=true, par\u005fB=true"));
        ;
        // JavaLine 78 <== SourceLine 96
        facit.putELEMENT(facit.index(2),new RTS_TXT("x.A\u005fB=true, b1=true"));
        ;
        // JavaLine 81 <== SourceLine 98
        facit.putELEMENT(facit.index(3),new RTS_TXT("P\u005fC=Z, par\u005fC=Z"));
        ;
        // JavaLine 84 <== SourceLine 99
        facit.putELEMENT(facit.index(4),new RTS_TXT("x.A\u005fC=Z, c1=Z"));
        ;
        // JavaLine 87 <== SourceLine 101
        facit.putELEMENT(facit.index(5),new RTS_TXT("P\u005fI=5632, par\u005fI=5632"));
        ;
        // JavaLine 90 <== SourceLine 102
        facit.putELEMENT(facit.index(6),new RTS_TXT("x.A\u005fI=5632, i1=5632"));
        ;
        // JavaLine 93 <== SourceLine 104
        facit.putELEMENT(facit.index(7),new RTS_TXT("P\u005fR=7353.00, par\u005fR=7353.00"));
        ;
        // JavaLine 96 <== SourceLine 105
        facit.putELEMENT(facit.index(8),new RTS_TXT("x.A\u005fR=7353.00, r1=7353.00"));
        ;
        // JavaLine 99 <== SourceLine 107
        facit.putELEMENT(facit.index(9),new RTS_TXT("P\u005fL=6731.45, par\u005fL=6731.45"));
        ;
        // JavaLine 102 <== SourceLine 108
        facit.putELEMENT(facit.index(10),new RTS_TXT("x.A\u005fL=6731.45, lr1=6731.45"));
        ;
        // JavaLine 105 <== SourceLine 110
        facit.putELEMENT(facit.index(11),new RTS_TXT("P\u005fT=Abra, par\u005fT=Abra"));
        ;
        // JavaLine 108 <== SourceLine 111
        facit.putELEMENT(facit.index(12),new RTS_TXT("x.A\u005fT=Abra, t1=Abra"));
        ;
        // JavaLine 111 <== SourceLine 113
        facit.putELEMENT(facit.index(13),new RTS_TXT("P\u005fT=Cadab     , par\u005fT=Cadab     "));
        ;
        // JavaLine 114 <== SourceLine 114
        facit.putELEMENT(facit.index(14),new RTS_TXT("x.A\u005fT=Cadab     , t1=Cadab     "));
        ;
        // JavaLine 117 <== SourceLine 116
        facit.putELEMENT(facit.index(15),new RTS_TXT("At END"));
        ;
        // JavaLine 120 <== SourceLine 120
        new simtst151_trace((_CUR),new RTS_TXT("At START"));
        ;
        // JavaLine 123 <== SourceLine 122
        x_1=new simtst151_A((_CUR))._STM();
        ;
        // JavaLine 126 <== SourceLine 123
        b1_1=new simtst151_A_P_BOOL(x_1,b_1)._RESULT;
        ;
        // JavaLine 129 <== SourceLine 124
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fB="),RTS_ENVIRONMENT.edit(x_1.A_B)),new RTS_TXT(", b1=")),RTS_ENVIRONMENT.edit(b1_1)));
        ;
        // JavaLine 132 <== SourceLine 126
        c1_1=new simtst151_A_P_CHAR(x_1,c_1)._RESULT;
        ;
        // JavaLine 135 <== SourceLine 127
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fC="),RTS_ENVIRONMENT.edit(x_1.A_C)),new RTS_TXT(", c1=")),RTS_ENVIRONMENT.edit(c1_1)));
        ;
        // JavaLine 138 <== SourceLine 129
        i1_1=new simtst151_A_P_INT(x_1,i_1)._RESULT;
        ;
        // JavaLine 141 <== SourceLine 130
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fI="),RTS_ENVIRONMENT.edit(x_1.A_I)),new RTS_TXT(", i1=")),RTS_ENVIRONMENT.edit(i1_1)));
        ;
        // JavaLine 144 <== SourceLine 132
        r1_1=new simtst151_A_P_REA(x_1,r_1)._RESULT;
        ;
        // JavaLine 147 <== SourceLine 133
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fR="),RTS_ENVIRONMENT.edfix(x_1.A_R,2)),new RTS_TXT(", r1=")),RTS_ENVIRONMENT.edfix(r1_1,2)));
        ;
        // JavaLine 150 <== SourceLine 135
        lr1_1=new simtst151_A_P_LRL(x_1,lr_1)._RESULT;
        ;
        // JavaLine 153 <== SourceLine 136
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fL="),RTS_ENVIRONMENT.edfix(x_1.A_L,2)),new RTS_TXT(", lr1=")),RTS_ENVIRONMENT.edfix(lr1_1,2)));
        ;
        // JavaLine 156 <== SourceLine 138
        t1_1=new simtst151_A_P_TXT1(x_1,t_1)._RESULT;
        ;
        // JavaLine 159 <== SourceLine 139
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fT="),x_1.A_T),new RTS_TXT(", t1=")),t1_1));
        ;
        // JavaLine 162 <== SourceLine 141
        t1_1=new simtst151_A_P_TXT2(x_1,t_1)._RESULT;
        ;
        // JavaLine 165 <== SourceLine 142
        new simtst151_trace((_CUR),CONC(CONC(CONC(new RTS_TXT("x.A\u005fT="),x_1.A_T),new RTS_TXT(", t1=")),t1_1));
        ;
        // JavaLine 168 <== SourceLine 144
        new simtst151_trace((_CUR),new RTS_TXT("At END"));
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 173 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                // JavaLine 178 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 181 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 190 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 195 <== SourceLine 28
                    {
                        // JavaLine 197 <== SourceLine 29
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
                // JavaLine 209 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 212 <== SourceLine 33
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
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        RTS_RTObject prog = new simtst151(_CTX,151,new RTS_TXT("--- Test multiple assignments"));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","9 simtst151",1,13,11,14,13,15,15,85,18,86,21,87,24,88,27,89,30,90,33,91,41,14,47,16,50,17,57,18,60,19,68,22,72,93,75,95,78,96,81,98,84,99,87,101,90,102,93,104,96,105,99,107,102,108,105,110,108,111,111,113,114,114,117,116,120,120,123,122,126,123,129,124,132,126,135,127,138,129,141,130,144,132,147,133,150,135,153,136,156,138,159,139,162,141,165,142,168,144,173,24,178,25,181,26,190,27,195,28,197,29,209,32,212,33,234,146);
} // End of Class
