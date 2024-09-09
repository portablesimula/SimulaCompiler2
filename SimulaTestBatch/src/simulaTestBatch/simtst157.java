// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst157 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=10, BlockLevel=1, firstLine=13, lastLine=79, hasLocalClasses=true, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 74
    final RTS_LABEL _LABEL_simtst157_L1_1=new RTS_LABEL(this,1,1,"L1"); // Local Label #1=L1 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 14
    public RTS_TEXT_ARRAY facit=null;
    // JavaLine 16 <== SourceLine 15
    public int traceCase_1=0;
    // JavaLine 18 <== SourceLine 28
    public int i1_1=0;
    // JavaLine 20 <== SourceLine 29
    public RTS_INTEGER_ARRAY iarr=null;
    // Normal Constructor
    public simtst157(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 27 <== SourceLine 14
        facit=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,15));
        // JavaLine 29 <== SourceLine 29
        iarr=new RTS_INTEGER_ARRAY(new RTS_BOUNDS(0,40));
    }
    // Class Statements
    @Override
    public simtst157 _STM() {
        simtst157 _THIS=(simtst157)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 39 <== SourceLine 16
                if(_VALUE(false)) {
                    {
                        // JavaLine 42 <== SourceLine 17
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 49 <== SourceLine 18
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 52 <== SourceLine 19
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 60 <== SourceLine 22
                // BEGIN SimulaTest INNER PART
                // BEGIN simtst157 INNER PART
                // ENDOF simtst157 INNER PART
                // JavaLine 64 <== SourceLine 59
                facit.putELEMENT(facit.index(0),new RTS_TXT("At START"));
                ;
                // JavaLine 67 <== SourceLine 61
                facit.putELEMENT(facit.index(1),new RTS_TXT("End P i4=888"));
                ;
                // JavaLine 70 <== SourceLine 62
                facit.putELEMENT(facit.index(2),new RTS_TXT("At L1  i1=123"));
                ;
                // JavaLine 73 <== SourceLine 63
                facit.putELEMENT(facit.index(3),new RTS_TXT("At L1  iarr(5)=999"));
                ;
                // JavaLine 76 <== SourceLine 65
                facit.putELEMENT(facit.index(4),new RTS_TXT("At END"));
                ;
                // JavaLine 79 <== SourceLine 69
                new simtst157_trace((_CUR),new RTS_TXT("At START"));
                ;
                // JavaLine 82 <== SourceLine 71
            new simtst157_P((_CUR),new RTS_NAME<Integer>(){ public Integer get() { return(i1_1); } public Integer put(Integer x_) { return(i1_1=(int)x_); } },i1_1,iarr,new RTS_PRCQNT(((simtst157)(_CUR)),simtst157_ifnc.class),_LABEL_simtst157_L1_1);
                ;
                // JavaLine 85 <== SourceLine 73
                {
                    _SIM_LABEL(1); // DeclaredIn: simtst157
                    // JavaLine 88 <== SourceLine 74
                    new simtst157_trace((_CUR),CONC(new RTS_TXT("At L1  i1="),RTS_ENVIRONMENT.edit(i1_1)));
                }
                ;
                // JavaLine 92 <== SourceLine 75
                new simtst157_trace((_CUR),CONC(new RTS_TXT("At L1  iarr(5)="),RTS_ENVIRONMENT.edit(iarr.getELEMENT(5))));
                ;
                // JavaLine 95 <== SourceLine 77
                new simtst157_trace((_CUR),new RTS_TXT("At END"));
                ;
                // ENDOF SimulaTest INNER PART
                ;
                // JavaLine 100 <== SourceLine 24
                if(_VALUE(noMessage)) {
                    ;
                } else {
                    {
                        // JavaLine 105 <== SourceLine 25
                        if(_VALUE(found_error)) {
                            {
                                // JavaLine 108 <== SourceLine 26
                                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                                ;
                                RTS_BASICIO.sysout().outint(p_n,4);
                                ;
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                                ;
                                RTS_BASICIO.sysout().outtext(p_title);
                                ;
                                // JavaLine 117 <== SourceLine 27
                                RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                                ;
                            }
                        } else {
                            // JavaLine 122 <== SourceLine 28
                            {
                                // JavaLine 124 <== SourceLine 29
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- NO ERRORS FOUND IN TEST"));
                                ;
                                RTS_BASICIO.sysout().outint(p_n,4);
                                ;
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                                ;
                                RTS_BASICIO.sysout().outtext(p_title);
                                ;
                            }
                        }
                        ;
                        // JavaLine 136 <== SourceLine 32
                        if(_VALUE(false)) {
                            {
                                // JavaLine 139 <== SourceLine 33
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("--- END Simula a.s. TEST"));
                                ;
                                RTS_BASICIO.sysout().outint(p_n,4);
                                ;
                                RTS_BASICIO.sysout().outimage();
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
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
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_UTIL.BPRG("simtst157", args);
        RTS_UTIL.RUN_STM(new simtst157(_CTX,157,new RTS_TXT("--- Test identifier access")));
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","10 simtst157",1,13,11,74,14,14,16,15,18,28,20,29,27,14,29,29,39,16,42,17,49,18,52,19,60,22,64,59,67,61,70,62,73,63,76,65,79,69,82,71,85,73,88,74,92,75,95,77,100,24,105,25,108,26,117,27,122,28,124,29,136,32,139,33,167,79);
} // End of Class
