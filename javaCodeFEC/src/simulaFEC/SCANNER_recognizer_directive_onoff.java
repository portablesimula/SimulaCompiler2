// JavaLine 1 <== SourceLine 669
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_directive_onoff extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=669, lastLine=673, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 670
    public RTS_TXT t=null;
    // JavaLine 14 <== SourceLine 669
    public boolean _RESULT=false;
    // Normal Constructor
    public SCANNER_recognizer_directive_onoff(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_directive_onoff _STM() {
        // JavaLine 27 <== SourceLine 670
        t=new SCANNER_recognizer_directive_linefield((_CUR._SL))._RESULT;
        ;
        RTS_ENVIRONMENT.lowcase(t);
        ;
        // JavaLine 32 <== SourceLine 671
        if(_VALUE(_TXTREL_EQ(t,new RTS_TXT("on")))) {
            _RESULT=true;
        } else {
            // JavaLine 36 <== SourceLine 672
            if(_VALUE(_TXTREL_NE(t,new RTS_TXT("off")))) {
                _GOTO(((SCANNER_recognizer_directive)(_CUR._SL))._LABEL_SCANNER_recognizer_directive_CompoundStatement798_DIRWARN_0); // GOTO EVALUATED LABEL
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 onoff",1,669,12,670,14,669,27,670,32,671,36,672,44,673);
} // End of Procedure
