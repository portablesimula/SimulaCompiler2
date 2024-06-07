// JavaLine 1 <== SourceLine 14
package simulaTestBatch;
// Simula-2.0 Compiled at Sat Jun 01 12:00:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst01 extends SimulaTest {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=14, lastLine=52, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst01(RTS_RTObject staticLink,int sp_n,RTS_TXT sp_title) {
        super(staticLink,sp_n,sp_title);
        // Parameter assignment to locals
        BPRG("simtst01");
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst01 _STM() {
        // JavaLine 20 <== SourceLine 16
        if(_VALUE(false)) {
            new SimulaTest_CompoundStatement20((_CUR))._STM();
        }
        ;
        // JavaLine 25 <== SourceLine 22
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        // JavaLine 29 <== SourceLine 16
        if(_VALUE(true)) {
            ;
        } else {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (1)"));
        }
        ;
        // JavaLine 36 <== SourceLine 17
        if(_VALUE(false)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (2)"));
        }
        ;
        // JavaLine 41 <== SourceLine 18
        if(_VALUE(false)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (3)"));
        } else {
            ;
        }
        // JavaLine 47 <== SourceLine 20
        if(_VALUE(true)) {
            {
                // JavaLine 50 <== SourceLine 21
                if(_VALUE(true)) {
                    {
                        // JavaLine 53 <== SourceLine 22
                        if(_VALUE(true)) {
                            {
                                // JavaLine 56 <== SourceLine 23
                                if(_VALUE(false)) {
                                    new SimulaTest_err((_CUR),new RTS_TXT("*** error: (4)"));
                                }
                                ;
                            }
                        } else {
                            // JavaLine 63 <== SourceLine 25
                            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (5)"));
                        }
                        ;
                    }
                } else {
                    // JavaLine 69 <== SourceLine 27
                    new SimulaTest_err((_CUR),new RTS_TXT("*** error: (6)"));
                }
                ;
            }
        } else {
            // JavaLine 75 <== SourceLine 30
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (7)"));
        }
        ;
        ;
        // JavaLine 80 <== SourceLine 33
        if(_VALUE(false)) {
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (8)"));
        } else {
            // JavaLine 84 <== SourceLine 34
            if(_VALUE(true)) {
                {
                    // JavaLine 87 <== SourceLine 35
                    if(_VALUE(false)) {
                        new SimulaTest_err((_CUR),new RTS_TXT("*** error: (9)"));
                    }
                    ;
                }
            } else {
                // JavaLine 94 <== SourceLine 37
                new SimulaTest_err((_CUR),new RTS_TXT("*** error: (10)"));
            }
        }
        ;
        ;
        // JavaLine 100 <== SourceLine 40
        if(_VALUE(((((true)?(false):(true)))?(true):(false)))) {
            // JavaLine 102 <== SourceLine 41
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (11)"));
        }
        ;
        ;
        // JavaLine 107 <== SourceLine 44
        if(_VALUE(((true)?(((true)?(true):(false))):(((false)?(true):(false)))))) {
            ;
        } else {
            // JavaLine 111 <== SourceLine 49
            new SimulaTest_err((_CUR),new RTS_TXT("*** error: (12)"));
        }
        ;
        ;
        // ENDOF INNER PART
        ;
        // JavaLine 118 <== SourceLine 24
        if(_VALUE(((SimulaTest)(_CUR)).noMessage)) {
            ;
        } else {
            new SimulaTest_CompoundStatement35((_CUR))._STM();
        }
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new simtst01(_CTX,1,new RTS_TXT("--- Simple test of conditional statements"))._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst01.sim","9 simtst01",1,14,20,16,25,22,29,16,36,17,41,18,47,20,50,21,53,22,56,23,63,25,69,27,75,30,80,33,84,34,87,35,94,37,100,40,102,41,107,44,111,49,118,24,133,52);
} // End of Class
