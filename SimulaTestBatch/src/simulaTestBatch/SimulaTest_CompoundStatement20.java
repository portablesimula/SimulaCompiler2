// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 01 12:00:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_CompoundStatement20 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=3, firstLine=13, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public SimulaTest_CompoundStatement20(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 17
        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
        ;
        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR._SL)).p_n,4);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 25 <== SourceLine 18
        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR._SL)).p_title);
        ;
        // JavaLine 28 <== SourceLine 19
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst02.sim","0 CompoundStatement20",1,13,18,17,25,18,28,19,35,0);
} // End of SubBlock
