// JavaLine 1 <== SourceLine 18
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:39 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FECMAIN extends RTS_BASICIO {
    // SubBlock: Kind=10, BlockLevel=0, firstLine=18, lastLine=96, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public FECMAIN(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 10 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 27
        new FECMAIN_PBLK28(_USR)._STM();
        ;
        EBLK();
        return(this);
    } // End of 10 Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_UTIL.BPRG("FECMAIN", args);
        RTS_UTIL.RUN_STM(new FECMAIN(_CTX));
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("FECMAIN.sim","10 FECMAIN",1,18,18,27,29,96);
} // End of SubBlock
