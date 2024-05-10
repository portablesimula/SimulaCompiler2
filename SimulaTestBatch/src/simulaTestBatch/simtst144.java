// JavaLine 1 <== SourceLine 10
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 10 08:07:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst144 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=10, lastLine=17, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst144(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst144");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst144 _STM() {
        RTS_COMMON._LINE("9 simtst144",16); // JavaLine 20 <== SourceLine 16
        if(_VALUE(false)) {
            new SimulaTest_CompoundStatement20((_CUR))._STM();
        }
        ;
        RTS_COMMON._LINE("9 simtst144",22); // JavaLine 25 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        RTS_COMMON._LINE("9 simtst144",13); // JavaLine 29 <== SourceLine 13
        new simtst144_PBLK13((_CUR))._STM();
        ;
        // ENDOF INNER PART
        ;
        RTS_COMMON._LINE("9 simtst144",24); // JavaLine 34 <== SourceLine 24
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
        new simtst144(_CTX,144,new RTS_TXT("--- Test 'is', 'in', 'qua' and 'this' in precompiled attribute file"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst144.sim","9 simtst144",1,10,20,16,25,22,29,13,34,24,49,17);
} // End of Class
