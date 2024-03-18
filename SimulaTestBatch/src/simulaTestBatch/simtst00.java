// JavaLine 1 <== SourceLine 4
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Feb 04 11:02:28 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst00 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=4, lastLine=8, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst00(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst00");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst00 _STM() {
        RTS_COMMON._LINE("PrefixedBlock simtst00",16); // JavaLine 20 <== SourceLine 16
        if(_VALUE(false)) {
            {
                RTS_COMMON._LINE("PrefixedBlock simtst00",17); // JavaLine 23 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst00",18); // JavaLine 30 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst00",19); // JavaLine 33 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst00",22); // JavaLine 41 <== SourceLine 22
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst00",24); // JavaLine 43 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                RTS_COMMON._LINE("PrefixedBlock simtst00",25); // JavaLine 48 <== SourceLine 25
                if(_VALUE(((SimulaTest)(_CUR)).found_error)) {
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst00",26); // JavaLine 51 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR)).nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_COMMON._LINE("PrefixedBlock simtst00",27); // JavaLine 62 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(((SimulaTest)(_CUR)).nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    RTS_COMMON._LINE("PrefixedBlock simtst00",28); // JavaLine 67 <== SourceLine 28
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst00",29); // JavaLine 69 <== SourceLine 29
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(((SimulaTest)(_CUR)).p_title);
                        ;
                    }
                }
                ;
                RTS_COMMON._LINE("PrefixedBlock simtst00",32); // JavaLine 81 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        RTS_COMMON._LINE("PrefixedBlock simtst00",33); // JavaLine 84 <== SourceLine 33
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(((SimulaTest)(_CUR)).p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
            }
        }
        ;
        RTS_COMMON._LINE("PrefixedBlock simtst00",6); // JavaLine 97 <== SourceLine 6
        RTS_BASICIO.sysout().outtext(new RTS_TXT("IN EMPTY TEST"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new simtst00(_CTX,0,new RTS_TXT("--- Empty test"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst00.sim","PrefixedBlock simtst00",1,4,20,16,23,17,30,18,33,19,41,22,43,24,48,25,51,26,62,27,67,28,69,29,81,32,84,33,97,6,110,8);
} // End of Class
