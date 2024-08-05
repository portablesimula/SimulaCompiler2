// JavaLine 1 <== SourceLine 13
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst155 extends Pre155 {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=13, lastLine=39, hasLocalClasses=false, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 37
    final RTS_LABEL _LABEL_simtst155_FINI_2=new RTS_LABEL(this,2,1,"FINI"); // Local Label #1=FINI At PrefixLevel 2
    // Declare locals as attributes
    // Normal Constructor
    public simtst155(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst155");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst155 _STM() {
        simtst155 _THIS=(simtst155)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 16
                if(_VALUE(false)) {
                    {
                        // JavaLine 31 <== SourceLine 17
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("--- START Simula a.s. TEST"));
                        ;
                        RTS_BASICIO.sysout().outint(p_n,4);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 38 <== SourceLine 18
                        RTS_BASICIO.sysout().outtext(p_title);
                        ;
                        // JavaLine 41 <== SourceLine 19
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 49 <== SourceLine 22
                // BEGIN INNER PART
                // JavaLine 51 <== SourceLine 55
                // BEGIN INNER PART
                // BEGIN INNER PART
                // ENDOF INNER PART
                // JavaLine 55 <== SourceLine 18
                facit.putELEMENT(facit.index(0),new RTS_TXT("At START"));
                ;
                // JavaLine 58 <== SourceLine 21
                facit.putELEMENT(facit.index(4),new RTS_TXT("At END"));
                ;
                // JavaLine 61 <== SourceLine 25
                new Pre155_trace((_CUR),new RTS_TXT("At START"));
                ;
                // JavaLine 64 <== SourceLine 28
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("FECMAIN.main: =================== PASS 2 BEGIN"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 71 <== SourceLine 29
                RTS_BASICIO.sysout().outtext(new RTS_TXT("FECMAIN.main: =================== new ZZZZ(nscodename)"));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 76 <== SourceLine 31
                new Pre155_INIT((_CUR))._STM();
                ;
                // JavaLine 79 <== SourceLine 33
                call(checker_1,33);
                ;
                // JavaLine 82 <== SourceLine 35
                {
                    _SIM_LABEL(1); // DeclaredIn: simtst155
                    // JavaLine 85 <== SourceLine 37
                    new Pre155_trace((_CUR),new RTS_TXT("At END"));
                }
                ;
                // ENDOF INNER PART
                // ENDOF INNER PART
                ;
                // JavaLine 92 <== SourceLine 24
                if(_VALUE(noMessage)) {
                    ;
                } else {
                    {
                        // JavaLine 97 <== SourceLine 25
                        if(_VALUE(found_error)) {
                            {
                                // JavaLine 100 <== SourceLine 26
                                RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("--- "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" ERROR(S) FOUND IN TEST")));
                                ;
                                RTS_BASICIO.sysout().outint(p_n,4);
                                ;
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("  "));
                                ;
                                RTS_BASICIO.sysout().outtext(p_title);
                                ;
                                // JavaLine 109 <== SourceLine 27
                                RTS_ENVIRONMENT.error(CONC(CONC(new RTS_TXT("Test sample has "),RTS_ENVIRONMENT.edit(nFailed)),new RTS_TXT(" error(s)")));
                                ;
                            }
                        } else {
                            // JavaLine 114 <== SourceLine 28
                            {
                                // JavaLine 116 <== SourceLine 29
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
                        // JavaLine 128 <== SourceLine 32
                        if(_VALUE(false)) {
                            {
                                // JavaLine 131 <== SourceLine 33
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
        RTS_COMMON.setRuntimeOptions(args);
        RTS_RTObject prog = new simtst155(_CTX,155,new RTS_TXT("--- Test "));
        try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst155.sim","9 simtst155",1,13,11,37,28,16,31,17,38,18,41,19,49,22,51,55,55,18,58,21,61,25,64,28,71,29,76,31,79,33,82,35,85,37,92,24,97,25,100,26,109,27,114,28,116,29,128,32,131,33,160,39);
} // End of Class
