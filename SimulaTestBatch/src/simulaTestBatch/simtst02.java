// JavaLine 1 <== SourceLine 15
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 01 12:00:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst02 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=15, lastLine=122, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 17
    public boolean result_1=false;
    // JavaLine 12 <== SourceLine 19
    public boolean b1_1=false;
    public boolean b2_1=false;
    public boolean b3_1=false;
    // JavaLine 16 <== SourceLine 20
    public boolean b4_1=false;
    public boolean b5_1=false;
    public boolean b6_1=false;
    // Normal Constructor
    public simtst02(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst02");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst02 _STM() {
        // JavaLine 30 <== SourceLine 16
        if(_VALUE(false)) {
            new SimulaTest_CompoundStatement20((_CUR))._STM();
        }
        ;
        // JavaLine 35 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        b1_1=true;
        ;
        // JavaLine 41 <== SourceLine 23
        b2_1=((b1_1)?(b1_1):(false));
        ;
        // JavaLine 44 <== SourceLine 24
        b3_1=((b2_1)?(b1_1):(false));
        ;
        // JavaLine 47 <== SourceLine 27
        if(_VALUE((!(b1_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b1."));
        }
        ;
        // JavaLine 52 <== SourceLine 28
        if(_VALUE((!(b2_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b2."));
        }
        ;
        // JavaLine 57 <== SourceLine 29
        if(_VALUE((!(b3_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b3."));
        }
        ;
        // JavaLine 62 <== SourceLine 30
        if(_VALUE(b4_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b4."));
        }
        ;
        // JavaLine 67 <== SourceLine 31
        if(_VALUE(b5_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b5."));
        }
        ;
        // JavaLine 72 <== SourceLine 32
        if(_VALUE(b6_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  Wrong value assigned to the variable b6."));
        }
        ;
        // JavaLine 77 <== SourceLine 35
        result_1=(b1_1&(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'and' (1)."));
        }
        ;
        // JavaLine 84 <== SourceLine 36
        result_1=(b1_1&(b4_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'and' (2)."));
        }
        ;
        // JavaLine 91 <== SourceLine 37
        result_1=(b6_1&(b3_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'and' (3)."));
        }
        ;
        // JavaLine 98 <== SourceLine 38
        result_1=(b4_1&(b5_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'and' (4)."));
        }
        ;
        // JavaLine 105 <== SourceLine 41
        result_1=(b1_1|(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'or' (1)."));
        }
        ;
        // JavaLine 112 <== SourceLine 42
        result_1=(b1_1|(b4_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'or' (2)."));
        }
        ;
        // JavaLine 119 <== SourceLine 43
        result_1=(b6_1|(b3_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'or' (3)."));
        }
        ;
        // JavaLine 126 <== SourceLine 44
        result_1=(b4_1|(b5_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'or' (4)."));
        }
        ;
        // JavaLine 133 <== SourceLine 47
        result_1=(!(b1_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'not' (1)."));
        }
        ;
        // JavaLine 140 <== SourceLine 48
        result_1=(!(b6_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'not' (2)."));
        }
        ;
        // JavaLine 147 <== SourceLine 51
        result_1=((!b1_1) | b2_1);
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'imp' (1)."));
        }
        ;
        // JavaLine 154 <== SourceLine 52
        result_1=((!b1_1) | b4_1);
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'imp' (2)."));
        }
        ;
        // JavaLine 161 <== SourceLine 53
        result_1=((!b6_1) | b3_1);
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'imp' (3)."));
        }
        ;
        // JavaLine 168 <== SourceLine 54
        result_1=((!b4_1) | b5_1);
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'imp' (4)."));
        }
        ;
        // JavaLine 175 <== SourceLine 57
        result_1=((b1_1) == (b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'eqv' (1)."));
        }
        ;
        // JavaLine 182 <== SourceLine 58
        result_1=((b1_1) == (b4_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'eqv' (2)."));
        }
        ;
        // JavaLine 189 <== SourceLine 59
        result_1=((b6_1) == (b3_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'eqv' (3)."));
        }
        ;
        // JavaLine 196 <== SourceLine 60
        result_1=((b4_1) == (b5_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error :  'eqv' (4)."));
        }
        ;
        // JavaLine 203 <== SourceLine 63
        result_1=(b1_1&&(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'and then' (1)."));
        }
        ;
        // JavaLine 210 <== SourceLine 64
        result_1=(b1_1&&(b6_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'and then' (2)."));
        }
        ;
        // JavaLine 217 <== SourceLine 65
        result_1=(b4_1&&(b2_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'and then' (3)."));
        }
        ;
        // JavaLine 224 <== SourceLine 66
        result_1=(b5_1&&(b6_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'and then' (4)."));
        }
        ;
        // JavaLine 231 <== SourceLine 69
        result_1=(b1_1||(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'or else' (1)."));
        }
        ;
        // JavaLine 238 <== SourceLine 70
        result_1=(b3_1||(b6_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'or else' (2)."));
        }
        ;
        // JavaLine 245 <== SourceLine 71
        result_1=(b4_1||(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'or else' (3)."));
        }
        ;
        // JavaLine 252 <== SourceLine 72
        result_1=(b6_1||(b5_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : 'or else' (4)."));
        }
        ;
        // JavaLine 259 <== SourceLine 75
        result_1=((b1_1&(b2_1))|((b3_1&(b4_1))));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (1)."));
        }
        ;
        // JavaLine 266 <== SourceLine 76
        result_1=((!(b1_1))|(b2_1));
        ;
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (2)."));
        }
        ;
        // JavaLine 273 <== SourceLine 77
        result_1=((!(b6_1))&(b5_1));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (3)."));
        }
        ;
        // JavaLine 280 <== SourceLine 78
        result_1=((b4_1) == (((!b5_1) | b1_1)));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (4)."));
        }
        ;
        // JavaLine 287 <== SourceLine 79
        result_1=(((b1_1&(b5_1))) == ((b6_1|(b1_1))));
        ;
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (5)."));
        }
        ;
        // JavaLine 294 <== SourceLine 83
        result_1=(!((!((!((!((!((!((!(b6_1))))))))))))));
        ;
        // JavaLine 297 <== SourceLine 84
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (6)."));
        }
        ;
        // JavaLine 302 <== SourceLine 86
        result_1=((!((!((!b1_1) | b2_1)) | b3_1)) | b4_1);
        ;
        // JavaLine 305 <== SourceLine 87
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (7)."));
        }
        ;
        // JavaLine 310 <== SourceLine 89
        result_1=((!(((b4_1&(b1_1))) == ((b5_1|(b6_1))))) | (b1_1&((!(b6_1)))));
        ;
        // JavaLine 313 <== SourceLine 90
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (8)."));
        }
        ;
        // JavaLine 318 <== SourceLine 92
        result_1=((b1_1)?(((b6_1)?(b1_1):(((b1_1)?(b6_1):(b1_1))))):(b1_1));
        ;
        // JavaLine 321 <== SourceLine 102
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (9)."));
        }
        ;
        // JavaLine 326 <== SourceLine 104
        result_1=((b1_1)?(b2_1):((b5_1&(b6_1))));
        ;
        // JavaLine 329 <== SourceLine 105
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (10)."));
        }
        ;
        // JavaLine 334 <== SourceLine 107
        result_1=(((!(b1_1))) == (((!(b2_1&(b3_1))) | ((((b1_1)?(b1_1):(b6_1)))?(((!((b1_1&(b2_1))|((b1_1&(b6_1))))) | b2_1)):(((b1_1) == ((!(((!(b1_1&(b2_1))) | b2_1))))))))));
        ;
        // JavaLine 337 <== SourceLine 111
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (11)."));
        }
        ;
        // JavaLine 342 <== SourceLine 113
        result_1=(b4_1||((b2_1&(b6_1))));
        ;
        // JavaLine 345 <== SourceLine 114
        if(_VALUE(result_1)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (12)."));
        }
        ;
        // JavaLine 350 <== SourceLine 116
        result_1=((b3_1&&((!(b2_1))))||(((!b6_1) | b5_1)));
        ;
        // JavaLine 353 <== SourceLine 117
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (13)."));
        }
        ;
        // JavaLine 358 <== SourceLine 119
        result_1=(b2_1||(((((!(!(b6_1))) | (b2_1&(b2_1)))) == ((!(b5_1))))));
        ;
        // JavaLine 361 <== SourceLine 120
        if(_VALUE((!(result_1)))) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error : Boolean expr. (14)."));
        }
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 368 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            new SimulaTest_CompoundStatement35((_CUR))._STM();
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new simtst02(_CTX,2,new RTS_TXT("--- Test Boolean operators"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst02.sim","9 simtst02",1,15,10,17,12,19,16,20,30,16,35,22,41,23,44,24,47,27,52,28,57,29,62,30,67,31,72,32,77,35,84,36,91,37,98,38,105,41,112,42,119,43,126,44,133,47,140,48,147,51,154,52,161,53,168,54,175,57,182,58,189,59,196,60,203,63,210,64,217,65,224,66,231,69,238,70,245,71,252,72,259,75,266,76,273,77,280,78,287,79,294,83,297,84,302,86,305,87,310,89,313,90,318,92,321,102,326,104,329,105,334,107,337,111,342,113,345,114,350,116,353,117,358,119,361,120,368,24,383,122);
} // End of Class
