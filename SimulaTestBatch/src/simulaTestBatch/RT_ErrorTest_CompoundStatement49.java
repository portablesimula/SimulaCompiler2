// JavaLine 1 <== SourceLine 8
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:59 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RT_ErrorTest_CompoundStatement49 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=3, firstLine=8, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public RT_ErrorTest_CompoundStatement49(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 48
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- START "),((RT_ErrorTest)(_CUR._SL)).fullTitle));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","0 CompoundStatement49",1,8,18,48,27,0);
} // End of SubBlock
