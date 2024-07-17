// JavaLine 1 <== SourceLine 678
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeUncheckedProc extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=678, lastLine=724, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeUncheckedProc(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeUncheckedProc _STM() {
        // JavaLine 21 <== SourceLine 684
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6!=(((char)0))))) {
            {
                // JavaLine 24 <== SourceLine 686
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),686,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00ac"))._RESULT);
                ;
                // JavaLine 27 <== SourceLine 687
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),687,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00ad"))._RESULT);
                ;
                // JavaLine 30 <== SourceLine 688
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00ac")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00ad")));
                ;
                // JavaLine 33 <== SourceLine 690
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
            }
        }
        ;
        // JavaLine 39 <== SourceLine 692
        if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4))) {
            {
                // JavaLine 42 <== SourceLine 693
                new SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                ;
                // JavaLine 45 <== SourceLine 694
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((SCODMAIN_codegenerator)(_CUR._SL)).restoreScheme_6);
                ;
                // JavaLine 48 <== SourceLine 695
                new SCODER0_codegenerator0_popasd((_CUR._SL));
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),false);
                ;
            }
        }
        ;
        // JavaLine 56 <== SourceLine 697
        ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4-(1));
        ;
        // JavaLine 59 <== SourceLine 698
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1!=(((char)14))))) {
            {
                // JavaLine 62 <== SourceLine 699
                if(_VALUE((((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.categ_1==(((char)2)))&&((((char)3)<=(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1))))&&((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1<=(((char)6))))))) {
                    // JavaLine 64 <== SourceLine 701
                    {
                        // JavaLine 66 <== SourceLine 702
                        ((SCODMAIN_codegenerator)(_CUR._SL)).opq_3=((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6;
                        ;
                        new SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 71 <== SourceLine 703
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),703,new RTS_TXT("SELECTV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001c"))._RESULT);
                        ;
                        // JavaLine 74 <== SourceLine 704
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),704,new RTS_TXT("REMOTEV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001P"))._RESULT);
                        ;
                        // JavaLine 77 <== SourceLine 705
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),705,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fnp_pro_1.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)))._RESULT);
                        ;
                        // JavaLine 80 <== SourceLine 706
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),706,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)))._RESULT);
                        ;
                        // JavaLine 83 <== SourceLine 707
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0001P")),new RTS_TXT("\u0088")));
                        ;
                        // JavaLine 86 <== SourceLine 710
                        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fnp_pro_1.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)));
                        ;
                        // JavaLine 89 <== SourceLine 711
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(70);
                        ;
                        // JavaLine 92 <== SourceLine 712
                        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fnp_pro_2.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)));
                        ;
                    }
                } else {
                    // JavaLine 97 <== SourceLine 714
                    {
                        // JavaLine 99 <== SourceLine 715
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0096")));
                        ;
                        // JavaLine 102 <== SourceLine 718
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                        ;
                        // JavaLine 105 <== SourceLine 719
                        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)));
                        ;
                        // JavaLine 108 <== SourceLine 720
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(125);
                        ;
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 117 <== SourceLine 723
        new SCODER1_codegenerator1_popcall((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeUncheckedProc",1,678,21,684,24,686,27,687,30,688,33,690,39,692,42,693,45,694,48,695,56,697,59,698,62,699,64,701,66,702,71,703,74,704,77,705,80,706,83,707,86,710,89,711,92,712,97,714,99,715,102,718,105,719,108,720,117,723,122,724);
} // End of Procedure
