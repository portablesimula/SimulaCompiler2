// JavaLine 1 <== SourceLine 18
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 10:00:08 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FECMAIN extends RTS_BASICIO {
    // SubBlock: Kind=10, BlockLevel=0, firstLine=18, lastLine=94, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // Normal Constructor
    public FECMAIN(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        BPRG("FECMAIN");
        // Declaration Code
    }
    // 10 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 27
        new FECMAIN_PBLK28(_CTX)._STM();
        ;
        EBLK();
        return(this);
    } // End of 10 Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        RTS_RTObject prog = new FECMAIN(_CTX);
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("FECMAIN.sim","10 FECMAIN",1,18,19,27,31,94);
} // End of SubBlock
