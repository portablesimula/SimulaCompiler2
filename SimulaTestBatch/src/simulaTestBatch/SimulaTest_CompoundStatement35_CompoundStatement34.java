// JavaLine 1 <== SourceLine 8
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Apr 21 11:14:40 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_CompoundStatement35_CompoundStatement34 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=4, firstLine=8, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public SimulaTest_CompoundStatement35_CompoundStatement34(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 33
        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
        ;
        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR._SL._SL)).p_n,4);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst112.sim","0 CompoundStatement34",1,8,18,33,27,0);
} // End of SubBlock