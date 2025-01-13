package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Pre155_INIT_Block40 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=39, lastLine=49, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 40
    public int dummy=0;
    // Normal Constructor
    public Pre155_INIT_Block40(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 42
        {
            // BEGIN INSPECTION 
            ((Pre155_INIT)(_CUR._SL))._inspect_42_4444=((Pre155_XXXX)new Pre155_XXXX((_CUR._SL._SL))._START());
            if(((Pre155_INIT)(_CUR._SL))._inspect_42_4444!=null) { // INSPECT _inspect_42_4444
                {
                    {
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Pre155.sim","4 Block40",8,40,19,42,26,43,31,45,34,46,37,47,49,49);
} // End of SubBlock
