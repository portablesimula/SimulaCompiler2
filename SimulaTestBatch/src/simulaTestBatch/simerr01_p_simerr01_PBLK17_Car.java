// JavaLine 1 <== SourceLine 20
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 07 09:54:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simerr01_p_simerr01_PBLK17_Car extends RTS_Process {
    // ClassDeclaration: Kind=8, BlockLevel=4, PrefixLevel=3, firstLine=20, lastLine=30, hasLocalClasses=false, System=false, detachUsed=false
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public RTS_TXT p3_pname;
    // Declare locals as attributes
    // Normal Constructor
    public simerr01_p_simerr01_PBLK17_Car(RTS_RTObject staticLink,RTS_TXT sp3_pname) {
        super(staticLink);
        // Parameter assignment to locals
        this.p3_pname = sp3_pname;
        // Declaration Code
    }
    // Class Statements
    @Override
    public simerr01_p_simerr01_PBLK17_Car _STM() {
        // BEGIN INNER PART
        // BEGIN INNER PART
        // JavaLine 24 <== SourceLine 1
        detach(); // Process'detach
        // BEGIN INNER PART
        // JavaLine 27 <== SourceLine 22
        new RT_ErrorTest_trace((_CUR._SL._SL._SL),CONC(p3_pname,new RTS_TXT(" is initiating")));
        ;
        // JavaLine 30 <== SourceLine 23
        while(true) {
            // JavaLine 32 <== SourceLine 24
            {
                // JavaLine 34 <== SourceLine 25
                new RT_ErrorTest_trace((_CUR._SL._SL._SL),CONC(p3_pname,new RTS_TXT(" is active 1")));
                ;
                // JavaLine 37 <== SourceLine 26
                ((simerr01_PBLK17)(_CUR._SL)).hold(4.0d);
                ;
                // JavaLine 40 <== SourceLine 27
                new RT_ErrorTest_trace((_CUR._SL._SL._SL),CONC(p3_pname,new RTS_TXT(" is active 2")));
                ;
                // JavaLine 43 <== SourceLine 28
                _GOTO(((simerr01_PBLK17)(_CUR._SL))._LABEL_simerr01_PBLK17_EXIT_LABEL_2); // GOTO EVALUATED LABEL
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 50 <== SourceLine 30
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // JavaLine 54 <== SourceLine 1
        terminate(); // Process'terminate
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","8 Car",1,20,24,1,27,22,30,23,32,24,34,25,37,26,40,27,43,28,50,30,54,1,60,30);
} // End of Class
