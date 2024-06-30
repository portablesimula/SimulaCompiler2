// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 29 09:10:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst154 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=13, lastLine=61, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 14
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 12 <== SourceLine 15
    public int traceCase_1=0;
    // Normal Constructor
    public simtst154(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst154");
        // Declaration Code
        // JavaLine 20 <== SourceLine 14
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,15));
    }
    // Class Statements
    @Override
    public simtst154 _STM() {
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
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 51 <== SourceLine 45
        facit.putELEMENT(facit.index(0),new RTS_TXT("At START"));
        ;
        // JavaLine 54 <== SourceLine 47
        facit.putELEMENT(facit.index(1),new RTS_TXT("P3=3.14"));
        ;
        // JavaLine 57 <== SourceLine 48
        facit.putELEMENT(facit.index(2),new RTS_TXT("P2=4444"));
        ;
        // JavaLine 60 <== SourceLine 49
        facit.putELEMENT(facit.index(3),new RTS_TXT("P1(T)=Abracadabra"));
        ;
        // JavaLine 63 <== SourceLine 51
        facit.putELEMENT(facit.index(4),new RTS_TXT("At END"));
        ;
        // JavaLine 66 <== SourceLine 55
        new simtst154_trace((_CUR),new RTS_TXT("At START"));
        ;
        // JavaLine 69 <== SourceLine 57
        new simtst154_trace((_CUR),CONC(new RTS_TXT("P1(T)="),new simtst154_P1((_CUR),new RTS_TXT("cadabra"))._RESULT));
        ;
        // JavaLine 72 <== SourceLine 59
        new simtst154_trace((_CUR),new RTS_TXT("At END"));
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 77 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                // JavaLine 82 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 85 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 94 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 99 <== SourceLine 28
                    {
                        // JavaLine 101 <== SourceLine 29
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
                // JavaLine 113 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 116 <== SourceLine 33
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
        RTS_RTObject prog = new simtst154(_CTX,154,new RTS_TXT("--- Test function result assignment"));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst154.sim","9 simtst154",1,13,10,14,12,15,20,14,26,16,29,17,36,18,39,19,47,22,51,45,54,47,57,48,60,49,63,51,66,55,69,57,72,59,77,24,82,25,85,26,94,27,99,28,101,29,113,32,116,33,138,61);
} // End of Class
