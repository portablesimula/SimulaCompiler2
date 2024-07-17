package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_outdescriptors_Block932_Block934_Block937 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=936, lastLine=954, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 937
    public RTS_TXT iinfo=null;
    // Normal Constructor
    public SCODER2_codegenerator2_outdescriptors_Block932_Block934_Block937(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 938
        ((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=new COMMON_nameof((_CUR._SL._SL._SL),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.modulhi_1,((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.modullo_1)._RESULT;
        ;
        // JavaLine 22 <== SourceLine 939
        iinfo=RTS_ENVIRONMENT.copy(copy(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        // JavaLine 25 <== SourceLine 940
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 30 <== SourceLine 941
        ((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=new COMMON_nameof((_CUR._SL._SL._SL),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.checkhi_1,((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.checklo_1)._RESULT;
        ;
        // JavaLine 33 <== SourceLine 942
        iinfo=RTS_ENVIRONMENT.copy(copy(CONC(CONC(iinfo,new RTS_TXT(" ")),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt)));
        ;
        // JavaLine 36 <== SourceLine 943
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 41 <== SourceLine 944
        ((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt=(((((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).p_q.virtno_1!=(0)))?(new COMMON_getBox((_CUR._SL._SL._SL),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).p_q.virtno_1)._RESULT.symbol):(new RTS_TXT("?")));
        ;
        // JavaLine 44 <== SourceLine 947
        iinfo=RTS_ENVIRONMENT.copy(copy(CONC(CONC(iinfo,new RTS_TXT(" ")),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt)));
        ;
        // JavaLine 47 <== SourceLine 948
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(RTS_TXT.length(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt));
        ;
        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL)).txt);
        ;
        // JavaLine 52 <== SourceLine 949
        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),949,new RTS_TXT("INSERT"),CONC(CONC(CONC(CONC(iinfo,new RTS_TXT(" ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1)._RESULT),new RTS_TXT(" ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1+(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.exttagnum_1))-(1)))._RESULT));
        ;
        // JavaLine 55 <== SourceLine 950
        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1);
        ;
        // JavaLine 58 <== SourceLine 951
        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.ftag_1+(((SCODER2_codegenerator2_outdescriptors)(_CUR._SL))._inspect_936_4643.exttagnum_1))-(1)));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","4 Block937",8,937,19,938,22,939,25,940,30,941,33,942,36,943,41,944,44,947,47,948,52,949,55,950,58,951,63,954);
} // End of SubBlock
