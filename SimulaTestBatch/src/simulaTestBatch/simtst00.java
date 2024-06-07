// JavaLine 1 <== SourceLine 4
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 01 12:00:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst00 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=4, lastLine=8, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst00(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst00");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst00 _STM() {
        // JavaLine 20 <== SourceLine 16
        if(_VALUE(false)) {
            new SimulaTest_CompoundStatement20((_CUR))._STM();
        }
        ;
        // JavaLine 25 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 29 <== SourceLine 6
        RTS_BASICIO.sysout().outtext(new RTS_TXT("IN EMPTY TEST"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 36 <== SourceLine 24
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
        new simtst00(_CTX,0,new RTS_TXT("--- Empty test"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst00.sim","9 simtst00",1,4,20,16,25,22,29,6,36,24,51,8);
} // End of Class
