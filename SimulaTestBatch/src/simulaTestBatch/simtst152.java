// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jun 16 07:55:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst152 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=13, lastLine=39, hasLocalClasses=true, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst152(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst152");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst152 _STM() {
        // JavaLine 21 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 24 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 31 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 34 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 42 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        ;
        // JavaLine 48 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                // JavaLine 53 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 56 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 65 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 70 <== SourceLine 28
                    {
                        // JavaLine 72 <== SourceLine 29
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
                // JavaLine 84 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 87 <== SourceLine 33
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
        RTS_COMMON.setRuntimeOptions(args);
        RTS_RTObject prog = new simtst152(_CTX,152,new RTS_TXT("--- Test nested connection statements"));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst152.sim","9 simtst152",1,13,21,16,24,17,31,18,34,19,42,22,48,24,53,25,56,26,65,27,70,28,72,29,84,32,87,33,109,39);
} // End of Class
