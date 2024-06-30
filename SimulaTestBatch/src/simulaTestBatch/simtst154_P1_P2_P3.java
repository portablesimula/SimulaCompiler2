// JavaLine 1 <== SourceLine 32
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 29 09:10:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst154_P1_P2_P3 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=32, lastLine=36, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public float _RESULT=0.0f;
    // Normal Constructor
    public simtst154_P1_P2_P3(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst154_P1_P2_P3 _STM() {
        // JavaLine 24 <== SourceLine 33
        _ASGTXT(((simtst154_P1)(_CUR._SL._SL))._RESULT,CONC(new RTS_TXT("Abra"),((simtst154_P1)(_CUR._SL._SL)).p_T));
        ;
        // JavaLine 27 <== SourceLine 34
        ((simtst154_P1_P2)(_CUR._SL))._RESULT=4444;
        ;
        // JavaLine 30 <== SourceLine 35
        _RESULT=3.14f;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst154.sim","5 P3",1,32,24,33,27,34,30,35,35,36);
} // End of Procedure
