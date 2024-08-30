package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_outdescriptors_Block932_Block934_Block937 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=936, lastLine=954, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 937
    public RTS_TXT iinfo=null;
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_outdescriptors_Block932_Block934_Block937(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 938
        ((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.modulhi_1,((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.modullo_1)._RESULT;
        ;
        // JavaLine 22 <== SourceLine 939
        iinfo=RTS_ENVIRONMENT.copy(copy(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        // JavaLine 25 <== SourceLine 940
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 30 <== SourceLine 941
        ((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.checkhi_1,((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.checklo_1)._RESULT;
        ;
        // JavaLine 33 <== SourceLine 942
        iinfo=RTS_ENVIRONMENT.copy(copy(CONC(CONC(iinfo,new RTS_TXT(" ")),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt)));
        ;
        // JavaLine 36 <== SourceLine 943
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 41 <== SourceLine 944
        ((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=(((((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).p_q.virtno_1!=(0)))?(new CLASS_COMMON_getBox((_CUR._SL._SL._SL),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).p_q.virtno_1)._RESULT.symbol):(new RTS_TXT("?")));
        ;
        // JavaLine 44 <== SourceLine 947
        iinfo=RTS_ENVIRONMENT.copy(copy(CONC(CONC(iinfo,new RTS_TXT(" ")),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt)));
        ;
        // JavaLine 47 <== SourceLine 948
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 52 <== SourceLine 949
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),949,new RTS_TXT("INSERT"),CONC(CONC(CONC(CONC(iinfo,new RTS_TXT(" ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1)._RESULT),new RTS_TXT(" ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1+(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.exttagnum_1))-(1)))._RESULT));
        ;
        // JavaLine 55 <== SourceLine 950
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1);
        ;
        // JavaLine 58 <== SourceLine 951
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1+(((CLASS_SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.exttagnum_1))-(1)));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","4 Block937",8,937,19,938,22,939,25,940,30,941,33,942,36,943,41,944,44,947,47,948,52,949,55,950,58,951,63,954);
} // End of SubBlock
