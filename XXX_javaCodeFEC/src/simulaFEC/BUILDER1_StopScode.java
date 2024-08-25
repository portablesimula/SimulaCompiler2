// JavaLine 1 <== SourceLine 32
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_StopScode extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=32, lastLine=39, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 33
    public COMMON_outcodefile _inspect_33_4519=null;
    // Normal Constructor
    public BUILDER1_StopScode(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_StopScode _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_33_4519=((BUILDER1)(_CUR._SL)).coder;
            if(_inspect_33_4519 instanceof BUILDER1_visiblegenerator) { // WHEN BUILDER1_visiblegenerator DO 
                // JavaLine 27 <== SourceLine 34
                {
                    // JavaLine 29 <== SourceLine 33
                    {
                        // JavaLine 31 <== SourceLine 34
                        ((BUILDER1)(_CUR._SL)).coder=((BUILDER1_dummygenerator)new BUILDER1_dummygenerator((_CUR._SL),new RTS_TXT("$dum$"))._START());
                        ;
                        // JavaLine 34 <== SourceLine 35
                        ((BUILDER1_visiblegenerator)(((BUILDER1)(_CUR._SL)).coder)).SCF_4=((BUILDER1_visiblegenerator)(_inspect_33_4519)).SCF_4;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 42 <== SourceLine 38
        ((BUILDER1)(_CUR._SL)).termstatus=((char)6);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 StopScode",1,32,10,33,27,34,29,33,31,34,34,35,42,38,47,39);
} // End of Procedure
