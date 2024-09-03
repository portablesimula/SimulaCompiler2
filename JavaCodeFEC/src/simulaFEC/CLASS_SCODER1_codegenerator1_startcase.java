// JavaLine 1 <== SourceLine 820
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_startcase extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=820, lastLine=854, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 823
    public CLASS_BUILDER1_casedescr _inspect_823_4631=null;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_startcase(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_startcase _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_823_4631=((CLASS_SCODER1)(_CUR._SL._SL)).curcase_6;
            if(_inspect_823_4631!=null) { // INSPECT _inspect_823_4631  type=ref(CASEDESCR)
                // JavaLine 27 <== SourceLine 824
                {
                    // JavaLine 29 <== SourceLine 823
                    {
                        // JavaLine 31 <== SourceLine 824
                        if(_VALUE(((CLASS_SCODER1)(_CUR._SL._SL)).BoundCheck_6)) {
                            {
                                // JavaLine 34 <== SourceLine 826
                                _inspect_823_4631.errortag=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("error"))._RESULT;
                                // JavaLine 36 <== SourceLine 827
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(47);
                                ;
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_823_4631.errortag);
                                ;
                                // JavaLine 41 <== SourceLine 828
                                if(_VALUE(((_inspect_823_4631.p_type!=(((char)2)))||((_inspect_823_4631.p_lb!=(0)))))) {
                                    {
                                        // JavaLine 44 <== SourceLine 829
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                        ;
                                        // JavaLine 47 <== SourceLine 830
                                        new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),_inspect_823_4631.p_lb);
                                        ;
                                        // JavaLine 50 <== SourceLine 831
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("="),new RTS_TXT("z")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u0014")));
                                        ;
                                        // JavaLine 53 <== SourceLine 833
                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_823_4631.errortag);
                                        ;
                                        // JavaLine 56 <== SourceLine 834
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u005e"),new RTS_TXT(">")));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 62 <== SourceLine 836
                                if(_VALUE(((_inspect_823_4631.p_type!=(((char)2)))||((_inspect_823_4631.p_ub!=(255)))))) {
                                    {
                                        // JavaLine 65 <== SourceLine 837
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                        ;
                                        // JavaLine 68 <== SourceLine 838
                                        new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),_inspect_823_4631.p_ub);
                                        ;
                                        // JavaLine 71 <== SourceLine 839
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("="),new RTS_TXT("x")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u0014")));
                                        ;
                                        // JavaLine 74 <== SourceLine 841
                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_823_4631.errortag);
                                        ;
                                        // JavaLine 77 <== SourceLine 842
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u005e"),new RTS_TXT(">")));
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 86 <== SourceLine 845
                        if(_VALUE((_inspect_823_4631.p_lb!=(0)))) {
                            {
                                // JavaLine 89 <== SourceLine 846
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                ;
                                new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),_inspect_823_4631.p_lb);
                                ;
                                // JavaLine 94 <== SourceLine 847
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(new RTS_TXT("c"));
                            }
                        }
                        ;
                        // JavaLine 99 <== SourceLine 848
                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(93);
                        ;
                        // JavaLine 102 <== SourceLine 850
                        _inspect_823_4631.tag=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("switch"))._RESULT;
                        // JavaLine 104 <== SourceLine 851
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_823_4631.tag);
                        ;
                        // JavaLine 107 <== SourceLine 852
                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).out2byte(((CLASS_SCODER1)(_CUR._SL._SL)).curcase_6.p_ndests);
                        ;
                        // JavaLine 110 <== SourceLine 853
                        if(_VALUE((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4!=(1)))) {
                            new CLASS_BUILDER1_visiblegenerator_asderror((_CUR._SL),176);
                        }
                        ;
                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=0;
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 startcase",1,820,10,823,27,824,29,823,31,824,34,826,36,827,41,828,44,829,47,830,50,831,53,833,56,834,62,836,65,837,68,838,71,839,74,841,77,842,86,845,89,846,94,847,99,848,102,850,104,851,107,852,110,853,123,854);
} // End of Procedure
