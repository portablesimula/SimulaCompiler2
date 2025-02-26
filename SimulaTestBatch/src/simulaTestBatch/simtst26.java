// JavaLine 1 <== SourceLine 15
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=10, BlockLevel=1, firstLine=15, lastLine=218, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 17
    public int i_1=0;
    public int j_1=0;
    public int t_1=0;
    // JavaLine 14 <== SourceLine 18
    public boolean b_1=false;
    public boolean BBB_1=false;
    // Normal Constructor
    public simtst26(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst26 _STM() {
        // JavaLine 26 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 29 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 36 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 39 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 47 <== SourceLine 22
        // BEGIN SimulaTest INNER PART
        // BEGIN simtst26 INNER PART
        // ENDOF simtst26 INNER PART
        // JavaLine 51 <== SourceLine 30
        i_1=5;
        ;
        // JavaLine 54 <== SourceLine 32
        new simtst26_Block33((_CUR))._STM();
        ;
        // ENDOF SimulaTest INNER PART
        ;
        // JavaLine 59 <== SourceLine 24
        if(_VALUE(noMessage)) {
            ;
        } else {
            {
                // JavaLine 64 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 67 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 76 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 81 <== SourceLine 28
                    {
                        // JavaLine 83 <== SourceLine 29
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
                // JavaLine 95 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 98 <== SourceLine 33
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
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_UTIL.BPRG("simtst26", args);
        RTS_UTIL.RUN_STM(new simtst26(_CTX,26,new RTS_TXT("--- Test designational expressions, the goto statement and switch declaration.")));
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","10 simtst26",1,15,10,17,14,18,26,16,29,17,36,18,39,19,47,22,51,30,54,32,59,24,64,25,67,26,76,27,81,28,83,29,95,32,98,33,119,218);
} // End of Class
