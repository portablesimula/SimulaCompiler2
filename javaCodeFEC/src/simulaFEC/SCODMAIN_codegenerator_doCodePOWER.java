// JavaLine 1 <== SourceLine 819
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodePOWER extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=819, lastLine=891, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodePOWER(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodePOWER _STM() {
        // JavaLine 21 <== SourceLine 826
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)1))))) {
            {
                // JavaLine 24 <== SourceLine 827
                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opt<(((char)5))))) {
                    // JavaLine 26 <== SourceLine 828
                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))) {
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),828,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00f3"))._RESULT);
                    } else {
                        // JavaLine 30 <== SourceLine 829
                        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))) {
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),829,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00f8"))._RESULT);
                        } else {
                            // JavaLine 34 <== SourceLine 830
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),830,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0007"))._RESULT);
                        }
                    }
                } else {
                    // JavaLine 39 <== SourceLine 831
                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opt==(((char)5))))) {
                        // JavaLine 41 <== SourceLine 832
                        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))) {
                            {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),832,new RTS_TXT("CONVERT"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0005"))._RESULT);
                                ;
                                // JavaLine 46 <== SourceLine 833
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),833,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00fd"))._RESULT);
                                ;
                            }
                        } else {
                            // JavaLine 51 <== SourceLine 834
                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))) {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),834,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00fd"))._RESULT);
                            } else {
                                // JavaLine 55 <== SourceLine 835
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),835,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\f"))._RESULT);
                            }
                        }
                    } else {
                        // JavaLine 60 <== SourceLine 837
                        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))) {
                            {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),837,new RTS_TXT("CONVERT"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0005"))._RESULT);
                                ;
                                // JavaLine 65 <== SourceLine 838
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),838,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0002"))._RESULT);
                                ;
                            }
                        } else {
                            // JavaLine 70 <== SourceLine 839
                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))) {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),839,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0002"))._RESULT);
                            } else {
                                // JavaLine 74 <== SourceLine 840
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),840,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0011"))._RESULT);
                            }
                        }
                    }
                }
                // JavaLine 80 <== SourceLine 841
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN)(_CUR._SL._SL)).opt<(((char)5))))?((((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))?(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0003\u00f3"))):((((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))?(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0003\u00f8"))):(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u0007"))))))):((((((SCODMAIN)(_CUR._SL._SL)).opt==(((char)5))))?((((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))?(CONC(CONC(CONC(new RTS_TXT("q"),new RTS_TXT("\u0000\u0005")),new RTS_TXT("\u0088")),new RTS_TXT("\u0003\u00fd"))):((((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))?(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0003\u00fd"))):(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\f"))))))):((((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))?(CONC(CONC(CONC(new RTS_TXT("q"),new RTS_TXT("\u0000\u0005")),new RTS_TXT("\u0088")),new RTS_TXT("\u0004\u0002"))):((((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))?(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u0002"))):(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u0011")))))))))));
            }
        } else {
            // JavaLine 84 <== SourceLine 857
            {
                // JavaLine 86 <== SourceLine 858
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),858,new RTS_TXT("ASSPAR"));
                ;
                // JavaLine 89 <== SourceLine 859
                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opt<(((char)5))))) {
                    {
                        // JavaLine 92 <== SourceLine 860
                        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))) {
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),860,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00f4"))._RESULT);
                        } else {
                            // JavaLine 96 <== SourceLine 861
                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))) {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),861,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00f9"))._RESULT);
                            } else {
                                // JavaLine 100 <== SourceLine 862
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),862,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\b"))._RESULT);
                            }
                        }
                    }
                } else {
                    // JavaLine 106 <== SourceLine 863
                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opt==(((char)5))))) {
                        {
                            // JavaLine 109 <== SourceLine 864
                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<=(((char)5))))) {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),864,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00fe"))._RESULT);
                            } else {
                                // JavaLine 113 <== SourceLine 865
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),865,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\r"))._RESULT);
                            }
                        }
                    } else {
                        // JavaLine 118 <== SourceLine 866
                        {
                            // JavaLine 120 <== SourceLine 867
                            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).optx<=(((char)5))))) {
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),867,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0003"))._RESULT);
                            } else {
                                // JavaLine 124 <== SourceLine 868
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),868,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u0012"))._RESULT);
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 132 <== SourceLine 870
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN)(_CUR._SL._SL)).opt<(((char)5))))?((((((SCODMAIN)(_CUR._SL._SL)).optx<(((char)5))))?(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0003\u00f4"))):((((((SCODMAIN)(_CUR._SL._SL)).optx==(((char)5))))?(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0003\u00f9"))):(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\b"))))))):((((((SCODMAIN)(_CUR._SL._SL)).opt==(((char)5))))?((((((SCODMAIN)(_CUR._SL._SL)).optx<=(((char)5))))?(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0003\u00fe"))):(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\r"))))):((((((SCODMAIN)(_CUR._SL._SL)).optx<=(((char)5))))?(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u0003"))):(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0004\u0012")))))))));
                ;
                // JavaLine 135 <== SourceLine 888
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
            }
        }
        ;
        // JavaLine 141 <== SourceLine 890
        ((SCODMAIN)(_CUR._SL._SL)).optx='6';
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodePOWER",1,819,21,826,24,827,26,828,30,829,34,830,39,831,41,832,46,833,51,834,55,835,60,837,65,838,70,839,74,840,80,841,84,857,86,858,89,859,92,860,96,861,100,862,106,863,109,864,113,865,118,866,120,867,124,868,132,870,135,888,141,890,146,891);
} // End of Procedure
