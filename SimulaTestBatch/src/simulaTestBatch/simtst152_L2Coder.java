// JavaLine 1 <== SourceLine 24
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jun 16 07:55:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst152_L2Coder extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=24, lastLine=37, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 25
    public simtst152_quantity pq=null;
    // JavaLine 12 <== SourceLine 26
    public simtst152_brecord cbrec=null;
    // JavaLine 14 <== SourceLine 28
    public simtst152_brecord _inspect_28_4444=null;
    // JavaLine 16 <== SourceLine 29
    public simtst152_quantity _inspect_29_4445=null;
    // Normal Constructor
    public simtst152_L2Coder(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst152_L2Coder _STM() {
        // JavaLine 28 <== SourceLine 28
        {
            // BEGIN INSPECTION 
            _inspect_28_4444=cbrec;
            if(_inspect_28_4444!=null) { // INSPECT _inspect_28_4444
                // JavaLine 33 <== SourceLine 29
                {
                    // JavaLine 35 <== SourceLine 28
                    {
                        // JavaLine 37 <== SourceLine 29
                        {
                            // BEGIN INSPECTION 
                            _inspect_29_4445=_inspect_28_4444.favirt;
                            if(_inspect_29_4445!=null) { // INSPECT _inspect_29_4445
                                // JavaLine 42 <== SourceLine 30
                                {
                                    // JavaLine 44 <== SourceLine 29
                                    {
                                        // JavaLine 46 <== SourceLine 32
                                        pq=_inspect_28_4444.fpar;
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 59 <== SourceLine 37
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst152.sim","8 L2Coder",1,24,10,25,12,26,14,28,16,29,28,28,33,29,35,28,37,29,42,30,44,29,46,32,59,37,64,37);
} // End of Class
