// JavaLine 1 <== SourceLine 8
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:59 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RT_ErrorTest_CompoundStatement61 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=3, firstLine=8, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public RT_ErrorTest_CompoundStatement61(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 58
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 21 <== SourceLine 59
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- END SIMULA"),((RT_ErrorTest)(_CUR._SL)).fullTitle));
        ;
        // JavaLine 24 <== SourceLine 60
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","0 CompoundStatement61",1,8,18,58,21,59,24,60,29,0);
} // End of SubBlock
