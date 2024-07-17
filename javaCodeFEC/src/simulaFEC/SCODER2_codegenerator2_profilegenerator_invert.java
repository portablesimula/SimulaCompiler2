// JavaLine 1 <== SourceLine 44
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_profilegenerator_invert extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=44, lastLine=54, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 45
    public COMMON_quantity lastq=null;
    public COMMON_quantity firstq=null;
    public COMMON_quantity cq=null;
    // Normal Constructor
    public SCODER2_codegenerator2_profilegenerator_invert(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_profilegenerator_invert _STM() {
        // JavaLine 25 <== SourceLine 46
        firstq=((SCODER2_codegenerator2_profilegenerator)(_CUR._SL)).p_extq.descr_1.fpar;
        ;
        // JavaLine 28 <== SourceLine 47
        while((lastq!=(firstq))) {
            {
                // JavaLine 31 <== SourceLine 48
                cq=firstq;
                ;
                // JavaLine 34 <== SourceLine 49
                while((cq.next!=(lastq))) {
                    cq=((COMMON_quantity)(cq.next));
                }
                ;
                // JavaLine 39 <== SourceLine 50
                if(_VALUE((lastq==(null)))) {
                    ((SCODER2_codegenerator2_profilegenerator)(_CUR._SL)).p_extq.descr_1.fpar=lastq=cq;
                } else {
                    // JavaLine 43 <== SourceLine 51
                    lastq=((COMMON_quantity)(lastq.next=cq));
                }
                ;
                // JavaLine 47 <== SourceLine 52
                cq.next=null;
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 invert",1,44,10,45,25,46,28,47,31,48,34,49,39,50,43,51,47,52,55,54);
} // End of Procedure
