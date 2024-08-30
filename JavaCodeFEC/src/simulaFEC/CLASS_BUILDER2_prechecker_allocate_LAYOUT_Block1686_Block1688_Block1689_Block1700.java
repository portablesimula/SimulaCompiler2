package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_LAYOUT_Block1686_Block1688_Block1689_Block1700 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=5, firstLine=1699, lastLine=1711, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 1700
    public int n=0;
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_LAYOUT_Block1686_Block1688_Block1689_Block1700(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 1702
        n=(((((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.inrtag!=(((char)0))))?(RTS_ENVIRONMENT.isorank(((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.inrtag)):((((((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.stmtag!=(((char)0))))?(RTS_ENVIRONMENT.isorank(((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.stmtag)):((((((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.dcltag!=(((char)0))))?(RTS_ENVIRONMENT.isorank(((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.dcltag)):(1))))));
        ;
        // JavaLine 22 <== SourceLine 1708
        new CLASS_BUILDER1_newQTags((_CUR._SL._SL._SL._SL),((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL)).p_brc.declquant,n);
        ;
        // JavaLine 25 <== SourceLine 1709
        _GOTO(((CLASS_BUILDER2_prechecker_allocate_LAYOUT)(_CUR._SL))._LABEL_CLASS_BUILDER2_prechecker_allocate_LAYOUT_Block1686_Block1688_Block1689_Block1712_SIMOBTAG_0); // GOTO EVALUATED LABEL
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","4 Block1700",8,1700,19,1702,22,1708,25,1709,30,1711);
} // End of SubBlock
