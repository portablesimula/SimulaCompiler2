package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_Block870_Block872_Block1621 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=1621, lastLine=1624, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public RTS_TXT t=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_Block870_Block872_Block1621(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 1622
        new CLASS_CHECKER2_semchecker_getOpd((_CUR._SL));
        ;
        t=((CLASS_CHECKER2_semchecker)(_CUR._SL)).opdSymb_2.symbol;
        ;
        // JavaLine 23 <== SourceLine 1623
        while(RTS_TXT.more(t)) {
            ((CLASS_CHECKER2)(_CUR._SL._SL)).option.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).option.index((RTS_TXT.pos(t)-(1))),RTS_TXT.getchar(t));
        }
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","4 Block1621",18,1622,23,1623,30,1624);
} // End of SubBlock
