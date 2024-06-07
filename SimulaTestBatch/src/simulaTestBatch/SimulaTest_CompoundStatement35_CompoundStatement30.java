// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 01 12:00:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_CompoundStatement35_CompoundStatement30 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=4, firstLine=13, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public SimulaTest_CompoundStatement35_CompoundStatement30(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 29
        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
        ;
        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR._SL._SL)).p_n,4);
        ;
        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
        ;
        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR._SL._SL)).p_title);
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst02.sim","0 CompoundStatement30",1,13,18,29,29,0);
} // End of SubBlock
