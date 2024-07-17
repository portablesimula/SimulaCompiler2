package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_newQTags_Block131 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=130, lastLine=138, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 131
    public int i=0;
    // Normal Constructor
    public BUILDER1_newQTags_Block131(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        for(i=1;i<=((BUILDER1_newQTags)(_CUR._SL)).p_incr;i++) {
            // JavaLine 20 <== SourceLine 133
            {
                // JavaLine 22 <== SourceLine 134
                ((BUILDER1)(_CUR._SL._SL)).lastusedtag_6=(((BUILDER1)(_CUR._SL._SL)).lastusedtag_6+(1));
                ;
                // JavaLine 25 <== SourceLine 135
                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER1"),135,CONC(CONC(((RTS_TEXT_ARRAY)((BUILDER1)(_CUR._SL._SL)).TAGTAB.ident).getELEMENT(((BUILDER1)(_CUR._SL._SL)).lastusedtag_6),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit(((BUILDER1)(_CUR._SL._SL)).lastusedtag_6)));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","4 Block131",8,131,20,133,22,134,25,135,33,138);
} // End of SubBlock
