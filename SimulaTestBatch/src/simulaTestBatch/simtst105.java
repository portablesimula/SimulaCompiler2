// JavaLine 1 <== SourceLine 17
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:20:09 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst105 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=17, lastLine=55, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 19
    public double r_1=0.0d;
    // JavaLine 12 <== SourceLine 20
    public int n_1=0;
    // JavaLine 14 <== SourceLine 21
    public RTS_TXT result_1=null;
    // Normal Constructor
    public simtst105(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst105");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst105 _STM() {
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
        // JavaLine 51 <== SourceLine 50
    new simtst105_P((_CUR),new RTS_TXT("case 1"),new RTS_NAME<Double>(){ public Double get() { return(r_1); } public Double put(Double x_) { return(r_1=(double)x_); } },3.140000104904175d,new RTS_TXT("X=3.0000, i=3, Y=3.1400, F=3.1400"));
        ;
        // JavaLine 54 <== SourceLine 51
    new simtst105_P((_CUR),new RTS_TXT("case 2"),new RTS_NAME<Double>(){ public Double get() { return(((double)(n_1))); } public Double put(Double x_){ double y=x_; n_1=(int)Math.round(y);return(y); } },3.140000104904175d,new RTS_TXT("X=3.0000, i=3, Y=3.1400, F=3.0000"));
        ;
        // JavaLine 57 <== SourceLine 52
    new simtst105_P((_CUR),new RTS_TXT("case 3"),new RTS_NAME<Double>(){ public Double get() { return(r_1); } public Double put(Double x_) { return(r_1=(double)x_); } },3.5399999618530273d,new RTS_TXT("X=4.0000, i=4, Y=3.5400, F=3.5400"));
        ;
        // JavaLine 60 <== SourceLine 53
    new simtst105_P((_CUR),new RTS_TXT("case 4"),new RTS_NAME<Double>(){ public Double get() { return(((double)(n_1))); } public Double put(Double x_){ double y=x_; n_1=(int)Math.round(y);return(y); } },4.010000228881836d,new RTS_TXT("X=4.0000, i=4, Y=4.0100, F=4.0000"));
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 65 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            {
                // JavaLine 70 <== SourceLine 25
                if(_VALUE(found_error)) {
                    {
                        // JavaLine 73 <== SourceLine 26
                        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                        ;
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 82 <== SourceLine 27
                        RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                        ;
                    }
                } else {
                    // JavaLine 87 <== SourceLine 28
                    {
                        // JavaLine 89 <== SourceLine 29
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
                // JavaLine 101 <== SourceLine 32
                if(_VALUE(false)) {
                    {
                        // JavaLine 104 <== SourceLine 33
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
        RTS_RTObject prog = new simtst105(_CTX,105,new RTS_TXT("--- Test Multiple Assignments"));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst105.sim","9 simtst105",1,17,10,19,12,20,14,21,26,16,29,17,36,18,39,19,47,22,51,50,54,51,57,52,60,53,65,24,70,25,73,26,82,27,87,28,89,29,101,32,104,33,126,55);
} // End of Class
