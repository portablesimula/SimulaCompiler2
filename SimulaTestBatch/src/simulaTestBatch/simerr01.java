// JavaLine 1 <== SourceLine 10
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 31 15:50:59 CEST 2024
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
        if(_VALUE(((RT_ErrorTest)(_CUR)).verbose)) {
            new RT_ErrorTest_CompoundStatement49((_CUR))._STM();
        }
        ;
        // JavaLine 27 <== SourceLine 51
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 31 <== SourceLine 44
        facit.putELEMENT(facit.index(0),new RTS_TXT("--- START GOTO SAMPLE"));
        ;
        // JavaLine 34 <== SourceLine 45
        facit.putELEMENT(facit.index(1),new RTS_TXT("START SIMULATION"));
        ;
        // JavaLine 37 <== SourceLine 46
        facit.putELEMENT(facit.index(2),new RTS_TXT("Bil 1 is scheduled for 4.0"));
        ;
        // JavaLine 40 <== SourceLine 47
        facit.putELEMENT(facit.index(3),new RTS_TXT("Bil 1 is initiating"));
        ;
        // JavaLine 43 <== SourceLine 48
        facit.putELEMENT(facit.index(4),new RTS_TXT("Bil 1 is active 1"));
        ;
        // JavaLine 46 <== SourceLine 49
        facit.putELEMENT(facit.index(5),new RTS_TXT("Bil 1 is active 2"));
        ;
        // JavaLine 49 <== SourceLine 50
        facit.putELEMENT(facit.index(6),new RTS_TXT("ExceptionHandler got error: Illegal GOTO EXIT\u005fLABEL"));
        ;
        // JavaLine 52 <== SourceLine 52
        RTS_ENVIRONMENT.DEFEXCEPTION(new RTS_PRCQNT(((simerr01)(_CUR)),RT_ErrorTest_ExceptionHandler.class));
        ;
        // JavaLine 55 <== SourceLine 56
        new RT_ErrorTest_trace((_CUR),new RTS_TXT("--- START GOTO SAMPLE"));
        ;
        // JavaLine 58 <== SourceLine 58
        new simerr01_p((_CUR));
        ;
        // JavaLine 61 <== SourceLine 60
        new RT_ErrorTest_trace((_CUR),new RTS_TXT("THIS LINE SHOULD NEVER BE EXECUTED"));
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 66 <== SourceLine 53
        if(_VALUE(((RT_ErrorTest)(_CUR)).found_error)) {
            // JavaLine 68 <== SourceLine 54
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("GOT ERROR(S) IN"),((RT_ErrorTest)(_CUR)).fullTitle));
        } else {
            // JavaLine 71 <== SourceLine 55
            RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("--- NO ERRORS FOUND IN"),((RT_ErrorTest)(_CUR)).fullTitle));
        }
        ;
        // JavaLine 75 <== SourceLine 57
        if(_VALUE(((RT_ErrorTest)(_CUR)).verbose)) {
            new RT_ErrorTest_CompoundStatement61((_CUR))._STM();
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new simerr01(_CTX,new RTS_TXT("  1 --- ILLEGAL GOTO out of an operating Process and into the enclosing System."))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","9 simerr01",1,10,10,11,22,47,27,51,31,44,34,45,37,46,40,47,43,48,46,49,49,50,52,52,55,56,58,58,61,60,66,53,68,54,71,55,75,57,88,62);
} // End of Class
