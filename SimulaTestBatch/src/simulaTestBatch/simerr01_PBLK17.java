package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 07 09:54:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simerr01_PBLK17 extends RTS_Simulation {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=3, firstLine=17, lastLine=39, hasLocalClasses=true, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 37
    final RTS_LABEL _LABEL_simerr01_PBLK17_EXIT_LABEL_2=new RTS_LABEL(this,2,1,"EXIT_LABEL"); // Local Label #1=EXIT_LABEL At PrefixLevel 2
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 18
    public simerr01_p_simerr01_PBLK17_Car car1_2=null;
    // Normal Constructor
    public simerr01_PBLK17(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public simerr01_PBLK17 _STM() {
        simerr01_PBLK17 _THIS=(simerr01_PBLK17)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // BEGIN INNER PART
                // BEGIN INNER PART
                // BEGIN INNER PART
                // ENDOF INNER PART
                // JavaLine 33 <== SourceLine 32
                new RT_ErrorTest_trace((_CUR._SL._SL),new RTS_TXT("START SIMULATION"));
                ;
                // JavaLine 36 <== SourceLine 33
                car1_2=((simerr01_p_simerr01_PBLK17_Car)new simerr01_p_simerr01_PBLK17_Car((_CUR),new RTS_TXT("Bil 1"))._START());
                ;
                // JavaLine 39 <== SourceLine 34
                new RT_ErrorTest_trace((_CUR._SL._SL),CONC(car1_2.p3_pname,new RTS_TXT(" is scheduled for 4.0")));
                ;
                // JavaLine 42 <== SourceLine 35
                ((simerr01_PBLK17)(_CUR)).ActivateAt(false,(RTS_Process)car1_2,4.0f,false);
                ;
                // JavaLine 45 <== SourceLine 36
                hold(12.0d);
                ;
                // JavaLine 48 <== SourceLine 37
                {
                    _SIM_LABEL(1); // DeclaredIn: simerr01_PBLK17
                    RTS_BASICIO.sysout().outtext(new RTS_TXT("At OUT"));
                }
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // ENDOF INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simerr01.sim","9 simerr01_PBLK17",11,37,14,18,33,32,36,33,39,34,42,35,45,36,48,37,67,39);
} // End of Class
