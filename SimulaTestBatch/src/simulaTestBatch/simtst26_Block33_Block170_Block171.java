package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 24 10:08:05 CET 2025
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst26_Block33_Block170_Block171 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=171, lastLine=174, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public char c=0;
    // Normal Constructor
    public simtst26_Block33_Block170_Block171(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 172
        new simtst26_trace((_CUR._SL._SL._SL),CONC(new RTS_TXT("Should GOTO "),new simtst26_Block33_Pst((_CUR._SL._SL),((simtst26)(_CUR._SL._SL._SL)).t_1)._RESULT));
        ;
        // JavaLine 21 <== SourceLine 173
        _GOTO(new st((_CUR._SL._SL),((simtst26)(_CUR._SL._SL._SL)).t_1)._RESULT); // GOTO EVALUATED LABEL
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst26.sim","4 Block171",18,172,21,173,25,174);
} // End of SubBlock
