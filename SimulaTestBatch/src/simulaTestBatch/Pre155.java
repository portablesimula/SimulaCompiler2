// JavaLine 1 <== SourceLine 9
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Pre155 extends SimulaTest {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=1, firstLine=9, lastLine=55, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 11
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 12 <== SourceLine 12
    public int traceCase_1=0;
    // JavaLine 14 <== SourceLine 25
    public Pre155_XXXX checker0_1=null;
    public Pre155_XXXX checker_1=null;
    // Normal Constructor
    public Pre155(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 22 <== SourceLine 11
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,14));
    }
    // Class Statements
    @Override
    public Pre155 _STM() {
        // JavaLine 28 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 31 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 38 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 41 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 49 <== SourceLine 22
        // BEGIN INNER PART
        // JavaLine 51 <== SourceLine 55
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        ;
        // JavaLine 56 <== SourceLine 24
        if(_VALUE(noMessage)) {
            ;
        } else {
            {
                // JavaLine 61 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 64 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 73 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 78 <== SourceLine 28
                    {
                        // JavaLine 80 <== SourceLine 29
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
                // JavaLine 92 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 95 <== SourceLine 33
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Pre155.sim","8 Pre155",1,9,10,11,12,12,14,25,22,11,28,16,31,17,38,18,41,19,49,22,51,55,56,24,61,25,64,26,73,27,78,28,80,29,92,32,95,33,110,55);
} // End of Class
