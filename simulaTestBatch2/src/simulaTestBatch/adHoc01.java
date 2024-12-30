// JavaLine 1 <== SourceLine 1
package simulaTestBatch;
// Simula-2.0 Compiled at Mon Dec 30 08:44:23 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class adHoc01 extends RTS_BASICIO {
    // SubBlock: Kind=11, BlockLevel=0, firstLine=1, lastLine=25, hasLocalClasses=true, System=true
public boolean isQPSystemBlock() { return(true); }
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 3
    public RTS_TXT t=null;
    // JavaLine 12 <== SourceLine 12
    public adHoc01_A ra=null;
    // JavaLine 14 <== SourceLine 13
    public int l=0;
    // JavaLine 16 <== SourceLine 20
    public adHoc01_A _inspect_19_4444=null;
    // Normal Constructor
    public adHoc01(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 11 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 27 <== SourceLine 15
        ra=new adHoc01_A(_USR)._STM();
        ;
        // JavaLine 30 <== SourceLine 19
        {
            // BEGIN INSPECTION 
            _inspect_19_4444=ra;
            if(_inspect_19_4444 instanceof adHoc01_A) { // WHEN adHoc01_A DO 
                // JavaLine 35 <== SourceLine 20
                {
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("Case A"));
                }
            }
            else if(_inspect_19_4444 instanceof adHoc01_B) { // WHEN adHoc01_B DO 
                // JavaLine 41 <== SourceLine 21
                {
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("Wrong statement selected(3)."));
                }
            }
            else { // OTHERWISE 
                // JavaLine 47 <== SourceLine 22
                RTS_BASICIO.sysout().outtext(new RTS_TXT("Wrong statement selected(4)."));
            } // END OTHERWISE 
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of 11 Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_UTIL.BPRG("adHoc01", args);
        RTS_UTIL.RUN_STM(new adHoc01(_CTX));
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc01.sim","11 adHoc01",1,1,10,3,12,12,14,13,16,20,27,15,30,19,35,20,41,21,47,22,60,25);
} // End of SubBlock
