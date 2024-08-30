// JavaLine 1 <== SourceLine 11
package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst66 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=11, lastLine=102, hasLocalClasses=true, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 13
    public final RTS_TXT fileName_1=(RTS_TXT)(new RTS_TXT("C:/GitHub/SimulaCompiler/SimulaTestBatch/src/simulaTestBatch/files/any66"));
    // JavaLine 13 <== SourceLine 68
    public simtst66_InputFile fil1_1=null;
    public simtst66_InputFile fil2_1=null;
    // Normal Constructor
    public simtst66(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst66 _STM() {
        // JavaLine 25 <== SourceLine 16
        if(_VALUE(false)) {
            {
                // JavaLine 28 <== SourceLine 17
                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                ;
                RTS_BASICIO.sysout().outint(p_n,4);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 35 <== SourceLine 18
                RTS_BASICIO.sysout().outtext(p_title);
                ;
                // JavaLine 38 <== SourceLine 19
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 46 <== SourceLine 22
        // BEGIN SimulaTest INNER PART
        // BEGIN simtst66 INNER PART
        // ENDOF simtst66 INNER PART
        // JavaLine 50 <== SourceLine 81
        fil1_1=((simtst66_InputFile)new simtst66_InputFile((_CUR),((simtst66_InputFile)new simtst66_InputFile((_CUR),null,copy(new RTS_TXT("C:/GitHub/SimulaCompiler/SimulaTestBatch/src/simulaTestBatch/files/any66")),5)._START()),copy(new RTS_TXT("C:/GitHub/SimulaCompiler/SimulaTestBatch/src/simulaTestBatch/files/any66")),13)._START());
        ;
        // JavaLine 53 <== SourceLine 82
        fil2_1=fil1_1.p_neste;
        ;
        // JavaLine 56 <== SourceLine 83
        fil2_1.p_neste=fil1_1;
        ;
        // JavaLine 59 <== SourceLine 85
        resume(fil1_1,85);
        ;
        // JavaLine 62 <== SourceLine 87
        if(_VALUE((!(new simtst66_OK((_CUR),fil1_1,fil2_1,1)._RESULT)))) {
            // JavaLine 64 <== SourceLine 88
            new simtst66_Block89((_CUR))._STM();
        }
        ;
        // ENDOF SimulaTest INNER PART
        ;
        // JavaLine 70 <== SourceLine 24
        if(_VALUE(noMessage)) {
            ;
        } else {
            {
                // JavaLine 75 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 78 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 87 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 92 <== SourceLine 28
                    {
                        // JavaLine 94 <== SourceLine 29
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
                // JavaLine 106 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 109 <== SourceLine 33
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
        RTS_UTIL.BPRG("simtst66", args);
        RTS_RTObject prog = new simtst66(_CTX,66,new RTS_TXT("--- Test corutines and two infiles which read from the same file."));
        try { prog._STM(); } catch(Throwable e) { RTS_UTIL.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst66.sim","9 simtst66",1,11,11,13,13,68,25,16,28,17,35,18,38,19,46,22,50,81,53,82,56,83,59,85,62,87,64,88,70,24,75,25,78,26,87,27,92,28,94,29,106,32,109,33,131,102);
} // End of Class
