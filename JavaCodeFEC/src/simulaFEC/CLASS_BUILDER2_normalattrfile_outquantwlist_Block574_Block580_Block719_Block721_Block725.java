package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block719_Block721_Block725 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=724, lastLine=737, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 725
    public RTS_TXT id1=null;
    public RTS_TXT id2=null;
    // Normal Constructor
    public CLASS_BUILDER2_normalattrfile_outquantwlist_Block574_Block580_Block719_Block721_Block725(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 20 <== SourceLine 729
        id1=new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_BUILDER2_normalattrfile_outquantwlist)(_CUR._SL))._inspect_724_4541.modulhi_1,((CLASS_BUILDER2_normalattrfile_outquantwlist)(_CUR._SL))._inspect_724_4541.modullo_1)._RESULT;
        ;
        // JavaLine 23 <== SourceLine 730
        id2=new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_BUILDER2_normalattrfile_outquantwlist)(_CUR._SL))._inspect_724_4541.checkhi_1,((CLASS_BUILDER2_normalattrfile_outquantwlist)(_CUR._SL))._inspect_724_4541.checklo_1)._RESULT;
        ;
        // JavaLine 26 <== SourceLine 731
        new CLASS_BUILDER2_normalattrfile_puttext((_CUR._SL._SL),id1);
        ;
        // JavaLine 29 <== SourceLine 732
        new CLASS_BUILDER2_normalattrfile_puttext((_CUR._SL._SL),id2);
        ;
        // JavaLine 32 <== SourceLine 733
        new CLASS_COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),733,CONC(new RTS_TXT("outquantwlist: id1="),id1));
        ;
        // JavaLine 35 <== SourceLine 734
        new CLASS_COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("BUILDER2"),734,CONC(new RTS_TXT("outquantwlist: id2="),id2));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","4 Block725",8,725,20,729,23,730,26,731,29,732,32,733,35,734,40,737);
} // End of SubBlock
