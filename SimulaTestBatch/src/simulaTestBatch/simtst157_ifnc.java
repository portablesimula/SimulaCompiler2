// JavaLine 1 <== SourceLine 30
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst157_ifnc extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=30, lastLine=30, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public int _RESULT=0;
    // Normal Constructor
    public simtst157_ifnc(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst157_ifnc _STM() {
        _RESULT=888;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","5 ifnc",1,30,28,30);
} // End of Procedure
