// JavaLine 1 <== SourceLine 30
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 29 09:10:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst154_P1_P2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=30, lastLine=40, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 30
    public int _RESULT=0;
    // Normal Constructor
    public simtst154_P1_P2(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst154_P1_P2 _STM() {
        // JavaLine 25 <== SourceLine 38
        ((simtst154_P1)(_CUR._SL))._RESULT=RTS_ENVIRONMENT.blanks((4+(RTS_TXT.length(((simtst154_P1)(_CUR._SL)).p_T))));
        ;
        // JavaLine 28 <== SourceLine 39
        new simtst154_trace((_CUR._SL._SL),CONC(new RTS_TXT("P3="),RTS_ENVIRONMENT.edfix(new simtst154_P1_P2_P3((_CUR))._RESULT,2)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst154.sim","5 P2",1,30,12,30,25,38,28,39,33,40);
} // End of Procedure
