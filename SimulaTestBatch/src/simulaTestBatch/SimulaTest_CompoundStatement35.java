// JavaLine 1 <== SourceLine 8
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 10 08:07:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_CompoundStatement35 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=3, firstLine=8, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public SimulaTest_CompoundStatement35(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        RTS_COMMON._LINE("0 Connection block at line 7.SimulaTest.CompoundStatement20.CompoundStatement35",25); // JavaLine 18 <== SourceLine 25
        if(_VALUE(((SimulaTest)(_CUR._SL)).found_error)) {
            new SimulaTest_CompoundStatement35_CompoundStatement28((_CUR))._STM();
        } else {
            RTS_COMMON._LINE("0 Connection block at line 7.SimulaTest.CompoundStatement20.CompoundStatement35",28); // JavaLine 22 <== SourceLine 28
            new SimulaTest_CompoundStatement35_CompoundStatement30((_CUR))._STM();
        }
        ;
        RTS_COMMON._LINE("0 Connection block at line 7.SimulaTest.CompoundStatement20.CompoundStatement35",32); // JavaLine 26 <== SourceLine 32
        if(_VALUE(false)) {
            new SimulaTest_CompoundStatement35_CompoundStatement34((_CUR))._STM();
        }
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst144.sim","0 CompoundStatement35",1,8,18,25,22,28,26,32,33,0);
} // End of SubBlock
