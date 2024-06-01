// JavaLine 1 <== SourceLine 2
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:58 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class RT_ErrorTest extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=0, firstLine=2, lastLine=63, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public RTS_TXT p_title;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 6
    public int traceCase=0;
    // JavaLine 13 <== SourceLine 7
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 15 <== SourceLine 9
    public boolean found_error=false;
    // JavaLine 17 <== SourceLine 11
    public boolean verbose=false;
    // JavaLine 19 <== SourceLine 46
    public final RTS_TXT fullTitle;
    // Normal Constructor
    public RT_ErrorTest(RTS_RTObject staticLink,RTS_TXT sp_title) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_title = sp_title;
        BBLK(); // Iff no prefix
        // Declaration Code
        // JavaLine 28 <== SourceLine 7
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,100));
        fullTitle=CONC(new RTS_TXT(" Simula RT\u005fError TEST"),p_title);
    }
    // Class Statements
    @Override
    public RT_ErrorTest _STM() {
        // JavaLine 35 <== SourceLine 47
        if(_VALUE(verbose)) {
            {
                // JavaLine 38 <== SourceLine 48
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- START "),fullTitle));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 48 <== SourceLine 51
        // BEGIN INNER PART
        // ENDOF INNER PART
        ;
        // JavaLine 52 <== SourceLine 53
        if(_VALUE(found_error)) {
            // JavaLine 54 <== SourceLine 54
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("GOT ERROR(S) IN"),fullTitle));
        } else {
            // JavaLine 57 <== SourceLine 55
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- NO ERRORS FOUND IN"),fullTitle));
        }
        ;
        // JavaLine 61 <== SourceLine 57
        if(_VALUE(verbose)) {
            {
                // JavaLine 64 <== SourceLine 58
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 67 <== SourceLine 59
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- END SIMULA"),fullTitle));
                ;
                // JavaLine 70 <== SourceLine 60
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("RT_ErrorTest.sim","8 RT_ErrorTest",1,2,11,6,13,7,15,9,17,11,19,46,28,7,35,47,38,48,48,51,52,53,54,54,57,55,61,57,64,58,67,59,70,60,78,63);
} // End of Class
