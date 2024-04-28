// JavaLine 1 <== SourceLine 8
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Apr 21 11:14:40 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SimulaTest_CompoundStatement35_CompoundStatement28 extends RTS_BASICIO {
    // SubBlock: Kind=0, BlockLevel=4, firstLine=8, lastLine=0, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public SimulaTest_CompoundStatement35_CompoundStatement28(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 0 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 26
        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR._SL._SL)).nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
        ;
        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR._SL._SL)).p_n,4);
        ;
        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
        ;
        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR._SL._SL)).p_title);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 29 <== SourceLine 27
        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR._SL._SL)).nFailed)),new RTS_TXT(" error(s)")));
        ;
        EBLK();
        return(this);
    } // End of 0 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst112.sim","0 CompoundStatement28",1,8,18,26,29,27,34,0);
} // End of SubBlock
