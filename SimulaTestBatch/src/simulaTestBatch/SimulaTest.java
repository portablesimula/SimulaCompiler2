// JavaLine 1 <== SourceLine 2
package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class SimulaTest extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=0, firstLine=2, lastLine=37, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public int p_n;
    public RTS_TXT p_title;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 5
    public boolean found_error=false;
    // JavaLine 14 <== SourceLine 6
    public int nFailed=0;
    // JavaLine 16 <== SourceLine 7
    public final boolean verbose=(boolean)(false);
    // JavaLine 18 <== SourceLine 8
    public boolean noMessage=false;
    // Normal Constructor
    public SimulaTest(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_title = sp_title;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public SimulaTest _STM() {
        // JavaLine 32 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 35 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 42 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 45 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 53 <== SourceLine 22
        // BEGIN SimulaTest INNER PART
        // ENDOF SimulaTest INNER PART
        ;
        // JavaLine 57 <== SourceLine 24
        if(_VALUE(noMessage)) {
            ;
        } else {
            {
                // JavaLine 62 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 65 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 74 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 79 <== SourceLine 28
                    {
                        // JavaLine 81 <== SourceLine 29
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                    }
                }
                ;
                // JavaLine 93 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 96 <== SourceLine 33
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SimulaTest.sim","8 SimulaTest",1,2,12,5,14,6,16,7,18,8,32,16,35,17,42,18,45,19,53,22,57,24,62,25,65,26,74,27,79,28,81,29,93,32,96,33,111,37);
} // End of Class
