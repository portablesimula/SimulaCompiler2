package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:39 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FECMAIN_PBLK28 extends CLASS_SCODMAIN {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=27, lastLine=95, hasLocalClasses=false, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 49
    final RTS_LABEL _LABEL_FECMAIN_PBLK28_FINI_18=new RTS_LABEL(this,18,1,"FINI"); // Local Label #1=FINI At PrefixLevel 18
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 28
    public int numberoflines_18=0;
    // JavaLine 15 <== SourceLine 51
    public CLASS_COMMON_outcodefile _inspect_51_4683=null;
    // JavaLine 17 <== SourceLine 56
    public CLASS_BUILDER1_precheck0 _inspect_56_4684=null;
    public CLASS_BUILDER2_normalattrfile _inspect_56_4685=null;
    public RTS_PRCQNT ENDCOMP_0() { return(new RTS_PRCQNT(this,FECMAIN_PBLK28_ENDCOMP.class)); }
    // Normal Constructor
    public FECMAIN_PBLK28(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public FECMAIN_PBLK28 _STM() {
        FECMAIN_PBLK28 _THIS=(FECMAIN_PBLK28)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 1323
                // BEGIN CLASS_COMMON INNER PART
                // JavaLine 36 <== SourceLine 998
                // BEGIN CLASS_ERRMSG INNER PART
                // JavaLine 38 <== SourceLine 2395
                // BEGIN CLASS_SCANNER INNER PART
                // JavaLine 40 <== SourceLine 89
                // BEGIN CLASS_SCANINP INNER PART
                // JavaLine 42 <== SourceLine 2698
                // BEGIN CLASS_PARSER INNER PART
                // JavaLine 44 <== SourceLine 262
                new CLASS_PAS1INIT_main_statements_of_PAS1INIT((_CUR));
                ;
                // JavaLine 47 <== SourceLine 265
                // BEGIN CLASS_PAS1INIT INNER PART
                // JavaLine 49 <== SourceLine 802
                // BEGIN CLASS_BUILDER1 INNER PART
                // JavaLine 51 <== SourceLine 1887
                // BEGIN CLASS_BUILDER2 INNER PART
                // JavaLine 53 <== SourceLine 2636
                // BEGIN CLASS_CHECKER1 INNER PART
                // JavaLine 55 <== SourceLine 1664
                // BEGIN CLASS_CHECKER2 INNER PART
                // JavaLine 57 <== SourceLine 311
                // BEGIN CLASS_SCODER0 INNER PART
                // JavaLine 59 <== SourceLine 903
                // BEGIN CLASS_SCODER1 INNER PART
                // JavaLine 61 <== SourceLine 375
                // BEGIN CLASS_SCODER1E INNER PART
                // JavaLine 63 <== SourceLine 1255
                // BEGIN CLASS_SCODER2 INNER PART
                // JavaLine 65 <== SourceLine 1448
                // BEGIN CLASS_SCODER3 INNER PART
                // JavaLine 67 <== SourceLine 499
                // BEGIN CLASS_SCODER4 INNER PART
                // JavaLine 69 <== SourceLine 658
                // BEGIN CLASS_PAS2INIT INNER PART
                // JavaLine 71 <== SourceLine 3455
                // BEGIN CLASS_SCODMAIN INNER PART
                // BEGIN PBLK28 INNER PART
                // ENDOF PBLK28 INNER PART
                // JavaLine 75 <== SourceLine 32
                RTS_BASICIO.sysout().outtext(new RTS_TXT("FECMAIN.main: PASS 1 BEGIN"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 80 <== SourceLine 35
                numberoflines_18=new CLASS_SCANINP_Pass1((_CUR))._RESULT;
                ;
                // JavaLine 83 <== SourceLine 39
                RTS_BASICIO.sysout().outtext(new RTS_TXT("FECMAIN.main: PASS 2 BEGIN"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 88 <== SourceLine 42
                new CLASS_SCODMAIN_codegenerator((_CUR),nscodename)._START();
                ;
                // JavaLine 91 <== SourceLine 43
                call(checker0_6,43);
                ;
                // JavaLine 94 <== SourceLine 48
                {
                    _SIM_LABEL(1); // DeclaredIn: PBLK28
                    // JavaLine 97 <== SourceLine 49
                    if(_VALUE((currentpass==('1')))) {
                        new CLASS_SCANNER_ClosePass1((_CUR));
                    } else {
                        // JavaLine 101 <== SourceLine 50
                        {
                            // JavaLine 103 <== SourceLine 51
                            {
                                // BEGIN INSPECTION 
                                _inspect_51_4683=coder;
                                if(_inspect_51_4683 instanceof CLASS_BUILDER1_visiblegenerator) { // WHEN CLASS_BUILDER1_visiblegenerator DO 
                                    // JavaLine 108 <== SourceLine 52
                                    {
                                        // JavaLine 110 <== SourceLine 51
                                        {
                                            // JavaLine 112 <== SourceLine 52
                                            if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_inspect_51_4683)).SCF_4==(null)))) {
                                                {
                                                    // JavaLine 115 <== SourceLine 53
                                                    if(_VALUE((termstatus<('3')))) {
                                                        termstatus='3';
                                                    }
                                                }
                                            } else {
                                                // JavaLine 121 <== SourceLine 54
                                                ((CLASS_BUILDER1_visiblegenerator)(_inspect_51_4683)).SCF_4.close();
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                            ;
                            // JavaLine 130 <== SourceLine 56
                            {
                                // BEGIN INSPECTION 
                                _inspect_56_4684=checker0_6;
                                if(_inspect_56_4684 instanceof CLASS_CHECKER2_semchecker) { // WHEN CLASS_CHECKER2_semchecker DO 
                                    {
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_56_4685=Afile_7;
                                            if(_inspect_56_4685!=null) { // INSPECT _inspect_56_4685  type=ref(NORMALATTRFILE)
                                                // JavaLine 140 <== SourceLine 57
                                                {
                                                    // JavaLine 142 <== SourceLine 56
                                                    {
                                                        // JavaLine 144 <== SourceLine 57
                                                        if(_VALUE((_inspect_56_4685.AOF!=(null)))) {
                                                            _inspect_56_4685.AOF.close();
                                                        }
                                                        ;
                                                        // JavaLine 149 <== SourceLine 58
                                                        if(_VALUE((_inspect_56_4685.CURF!=(null)))) {
                                                            _inspect_56_4685.CURF.close();
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                }
                            } // END INSPECTION
                            ;
                        }
                    }
                }
                ;
                // JavaLine 166 <== SourceLine 62
                if(_VALUE((L2INPT!=(null)))) {
                    L2INPT.close();
                }
                ;
                // JavaLine 171 <== SourceLine 63
                if(_VALUE((listfile!=(null)))) {
                    {
                        if(_VALUE((listfile!=(RTS_BASICIO.sysout())))) {
                            // JavaLine 175 <== SourceLine 64
                            listfile.close();
                        }
                    }
                }
                ;
                // JavaLine 181 <== SourceLine 67
                if(_VALUE((numerrfound>(0)))) {
                    // JavaLine 183 <== SourceLine 68
                    {
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("   NUMBER OF ERRORS:   "));
                        ;
                        // JavaLine 189 <== SourceLine 69
                        RTS_BASICIO.sysout().outint(numerrfound,0);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 194 <== SourceLine 70
                        if(_VALUE((termstatus<('4')))) {
                            termstatus='4';
                        }
                        ;
                    }
                }
                ;
                // JavaLine 202 <== SourceLine 72
                if(_VALUE((numwarnfound_1>(0)))) {
                    // JavaLine 204 <== SourceLine 73
                    {
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("   NUMBER OF WARNINGS: "));
                        ;
                        // JavaLine 208 <== SourceLine 74
                        RTS_BASICIO.sysout().outint(numwarnfound_1,0);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 216 <== SourceLine 83
                if(_VALUE((ERRORFILE_1!=(null)))) {
                    ERRORFILE_1.close();
                }
                ;
                // JavaLine 221 <== SourceLine 86
                if(_VALUE(((listfile!=(null))&&((listfile!=(RTS_BASICIO.sysout())))))) {
                    // JavaLine 223 <== SourceLine 87
                    listfile.close();
                }
                ;
                // JavaLine 227 <== SourceLine 89
                RTS_ENVIRONMENT.giveIntInfo(1,(RTS_ENVIRONMENT.rank(termstatus)-(48)));
                ;
                // JavaLine 230 <== SourceLine 90
                RTS_ENVIRONMENT.giveIntInfo(2,maxnumoftags);
                ;
                RTS_ENVIRONMENT.giveIntInfo(3,numberoflines_18);
                ;
                // JavaLine 235 <== SourceLine 91
                RTS_ENVIRONMENT.giveIntInfo(4,numerrfound);
                ;
                // JavaLine 238 <== SourceLine 93
                RTS_ENVIRONMENT.giveIntInfo(5,numwarnfound_1);
                ;
                // ENDOF CLASS_SCODMAIN INNER PART
                // ENDOF CLASS_PAS2INIT INNER PART
                // ENDOF CLASS_SCODER4 INNER PART
                // ENDOF CLASS_SCODER3 INNER PART
                // ENDOF CLASS_SCODER2 INNER PART
                // ENDOF CLASS_SCODER1E INNER PART
                // ENDOF CLASS_SCODER1 INNER PART
                // ENDOF CLASS_SCODER0 INNER PART
                // ENDOF CLASS_CHECKER2 INNER PART
                // ENDOF CLASS_CHECKER1 INNER PART
                // ENDOF CLASS_BUILDER2 INNER PART
                // ENDOF CLASS_BUILDER1 INNER PART
                // ENDOF CLASS_PAS1INIT INNER PART
                // ENDOF CLASS_PARSER INNER PART
                // ENDOF CLASS_SCANINP INNER PART
                // ENDOF CLASS_SCANNER INNER PART
                // ENDOF CLASS_ERRMSG INNER PART
                // ENDOF CLASS_COMMON INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("FECMAIN.sim","9 PBLK28",10,49,13,28,15,51,17,56,34,1323,36,998,38,2395,40,89,42,2698,44,262,47,265,49,802,51,1887,53,2636,55,1664,57,311,59,903,61,375,63,1255,65,1448,67,499,69,658,71,3455,75,32,80,35,83,39,88,42,91,43,94,48,97,49,101,50,103,51,108,52,110,51,112,52,115,53,121,54,130,56,140,57,142,56,144,57,149,58,166,62,171,63,175,64,181,67,183,68,189,69,194,70,202,72,204,73,208,74,216,83,221,86,223,87,227,89,230,90,235,91,238,93,268,95);
} // End of Class
