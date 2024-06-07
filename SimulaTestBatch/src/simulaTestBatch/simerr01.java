// JavaLine 1 <== SourceLine 10
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 07 09:54:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simerr01 extends RT_ErrorTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=10, lastLine=62, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 11
    public final RTS_TXT _CASE_1=(RTS_TXT)(new RTS_TXT(" ERROR-TEST 01"));
    // Normal Constructor
    public simerr01(RTS_RTObject staticLink,RTS_TXT sp_title) {
        super(staticLink,sp_title);
        // Parameter assignment to locals
        BPRG("simerr01");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simerr01 _STM() {
        // JavaLine 22 <== SourceLine 47
        if(_VALUE(false)) {
            // JavaLine 24 <== SourceLine 8
            {
                // JavaLine 26 <== SourceLine 48
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- START "),fullTitle));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 36 <== SourceLine 51
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 40 <== SourceLine 44
        facit.putELEMENT(facit.index(0),new RTS_TXT("--- START GOTO SAMPLE"));
        ;
        // JavaLine 43 <== SourceLine 45
        facit.putELEMENT(facit.index(1),new RTS_TXT("START SIMULATION"));
        ;
        // JavaLine 46 <== SourceLine 46
        facit.putELEMENT(facit.index(2),new RTS_TXT("Bil 1 is scheduled for 4.0"));
        ;
        // JavaLine 49 <== SourceLine 47
        facit.putELEMENT(facit.index(3),new RTS_TXT("Bil 1 is initiating"));
        ;
        // JavaLine 52 <== SourceLine 48
        facit.putELEMENT(facit.index(4),new RTS_TXT("Bil 1 is active 1"));
        ;
        // JavaLine 55 <== SourceLine 49
        facit.putELEMENT(facit.index(5),new RTS_TXT("Bil 1 is active 2"));
        ;
        // JavaLine 58 <== SourceLine 50
        facit.putELEMENT(facit.index(6),new RTS_TXT("ExceptionHandler got error: Illegal GOTO EXIT\u005fLABEL"));
        ;
        // JavaLine 61 <== SourceLine 52
        RTS_ENVIRONMENT.DEFEXCEPTION(new RTS_PRCQNT(((simerr01)(_CUR)),RT_ErrorTest_ExceptionHandler.class));
        ;
        // JavaLine 64 <== SourceLine 56
        new RT_ErrorTest_trace((_CUR),new RTS_TXT("--- START GOTO SAMPLE"));
        ;
        // JavaLine 67 <== SourceLine 58
        new simerr01_p((_CUR));
        ;
        // JavaLine 70 <== SourceLine 60
        new RT_ErrorTest_trace((_CUR),new RTS_TXT("THIS LINE SHOULD NEVER BE EXECUTED"));
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 75 <== SourceLine 53
        if(_VALUE(((RT_ErrorTest)(_CUR)).found_error)) {
            // JavaLine 77 <== SourceLine 54
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("GOT ERROR(S) IN"),((RT_ErrorTest)(_CUR)).fullTitle));
        } else {
            // JavaLine 80 <== SourceLine 55
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- NO ERRORS FOUND IN"),((RT_ErrorTest)(_CUR)).fullTitle));
        }
        ;
        // JavaLine 84 <== SourceLine 57
        if(_VALUE(false)) {
            // JavaLine 86 <== SourceLine 8
            {
                // JavaLine 88 <== SourceLine 58
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 91 <== SourceLine 59
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- END SIMULA"),fullTitle));
                ;
                // JavaLine 94 <== SourceLine 60
                RTS_BASICIO.sysout().outimage();
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
        RTS_RTObject prog = new simerr01(_CTX,new RTS_TXT("  1 --- ILLEGAL GOTO out of an operating Process and into the enclosing System."));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","9 simerr01",1,10,10,11,22,47,24,8,26,48,36,51,40,44,43,45,46,46,49,47,52,48,55,49,58,50,61,52,64,56,67,58,70,60,75,53,77,54,80,55,84,57,86,8,88,58,91,59,94,60,109,62);
} // End of Class
