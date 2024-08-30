// JavaLine 1 <== SourceLine 32
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_StopScode extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=32, lastLine=39, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 33
    public CLASS_COMMON_outcodefile _inspect_33_4519=null;
    // Normal Constructor
    public CLASS_BUILDER1_StopScode(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_StopScode _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_33_4519=((CLASS_BUILDER1)(_CUR._SL)).coder;
            if(_inspect_33_4519 instanceof CLASS_BUILDER1_visiblegenerator) { // WHEN CLASS_BUILDER1_visiblegenerator DO 
                // JavaLine 27 <== SourceLine 34
                {
                    // JavaLine 29 <== SourceLine 33
                    {
                        // JavaLine 31 <== SourceLine 34
                        ((CLASS_BUILDER1)(_CUR._SL)).coder=((CLASS_BUILDER1_dummygenerator)new CLASS_BUILDER1_dummygenerator((_CUR._SL),new RTS_TXT("$dum$"))._START());
                        ;
                        // JavaLine 34 <== SourceLine 35
                        ((CLASS_BUILDER1_visiblegenerator)(((CLASS_BUILDER1)(_CUR._SL)).coder)).SCF_4=((CLASS_BUILDER1_visiblegenerator)(_inspect_33_4519)).SCF_4;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 42 <== SourceLine 38
        ((CLASS_BUILDER1)(_CUR._SL)).termstatus=((char)6);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 StopScode",1,32,10,33,27,34,29,33,31,34,34,35,42,38,47,39);
} // End of Procedure
