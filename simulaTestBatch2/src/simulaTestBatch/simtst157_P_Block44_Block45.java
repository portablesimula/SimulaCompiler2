package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst157_P_Block44_Block45 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=45, lastLine=55, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public int i4=0;
    // Normal Constructor
    public simtst157_P_Block44_Block45(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 46
        ((simtst157)(_CUR._SL._SL._SL)).i1_1=111;
        ;
        // JavaLine 21 <== SourceLine 47
        i4=444;
        ;
        // JavaLine 24 <== SourceLine 48
        ((simtst157_P_Block44)(_CUR._SL)).i3=222;
        ;
        // JavaLine 27 <== SourceLine 49
        ((simtst157_P)(_CUR._SL._SL)).p_np.put(123);
        ;
        // JavaLine 30 <== SourceLine 50
        ((simtst157_P)(_CUR._SL._SL)).p_pp=222;
        ;
        // JavaLine 33 <== SourceLine 51
        ((RTS_INTEGER_ARRAY)((simtst157_P)(_CUR._SL._SL)).p_arr).putELEMENT(((RTS_INTEGER_ARRAY)((simtst157_P)(_CUR._SL._SL)).p_arr).index(5),999);
        ;
        // JavaLine 36 <== SourceLine 52
        i4=intValue(((simtst157_P)(_CUR._SL._SL)).p_fnc.CPF()._RESULT());
        ;
        // JavaLine 39 <== SourceLine 53
        new simtst157_trace((_CUR._SL._SL._SL),CONC(new RTS_TXT("End P i4="),RTS_ENVIRONMENT.edit(i4)));
        ;
        // JavaLine 42 <== SourceLine 54
        _GOTO(((simtst157_P)(_CUR._SL._SL)).p_lab); // GOTO EVALUATED LABEL
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","4 Block45",18,46,21,47,24,48,27,49,30,50,33,51,36,52,39,53,42,54,47,55);
} // End of SubBlock
