// JavaLine 1 <== SourceLine 870
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_ISOcode extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=870, lastLine=884, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 871
    public int oldpos=0;
    public int i=0;
    public int j=0;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_ISOcode(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_recognizer_ISOcode _STM() {
        // JavaLine 25 <== SourceLine 878
        oldpos=((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1;
        ;
        new CLASS_SCANNER_recognizer_scanahead((_CUR._SL));
        ;
        // JavaLine 30 <== SourceLine 880
        new CLASS_SCANNER_recognizer_ISOcode_getDigit((_CUR));
        ;
        new CLASS_SCANNER_recognizer_ISOcode_getDigit((_CUR));
        ;
        new CLASS_SCANNER_recognizer_ISOcode_getDigit((_CUR));
        ;
        // JavaLine 37 <== SourceLine 881
        if(_VALUE((((j==(0))||((i>(255))))||((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1!=('!')))))) {
            {
                // JavaLine 40 <== SourceLine 882
                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1='!';
                ;
                ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=oldpos;
            }
        } else {
            // JavaLine 46 <== SourceLine 883
            ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.isochar(i);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 ISOcode",1,870,10,871,25,878,30,880,37,881,40,882,46,883,52,884);
} // End of Procedure
