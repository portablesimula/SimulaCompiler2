// JavaLine 1 <== SourceLine 6
package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 10 08:07:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Precompiled144 extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=0, firstLine=6, lastLine=34, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 8
    public Precompiled144_A x=null;
    public int K=0;
    // Normal Constructor
    public Precompiled144(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public Precompiled144 _STM() {
        RTS_COMMON._LINE("8 Precompiled144",21); // JavaLine 23 <== SourceLine 21
        x=new Precompiled144_B((_CUR))._STM();
        ;
        RTS_COMMON._LINE("8 Precompiled144",23); // JavaLine 26 <== SourceLine 23
        K=((Precompiled144_B)(x)).N_1;
        ;
        RTS_COMMON._LINE("8 Precompiled144",25); // JavaLine 29 <== SourceLine 25
        if(_VALUE(_IS(x,Precompiled144_A.class))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x is A"));
        }
        ;
        RTS_COMMON._LINE("8 Precompiled144",26); // JavaLine 34 <== SourceLine 26
        if(_VALUE(_IS(x,Precompiled144_B.class))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x is B"));
        }
        ;
        RTS_COMMON._LINE("8 Precompiled144",28); // JavaLine 39 <== SourceLine 28
        if(_VALUE(x instanceof Precompiled144_A)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x in A"));
        }
        ;
        RTS_COMMON._LINE("8 Precompiled144",29); // JavaLine 44 <== SourceLine 29
        if(_VALUE(x instanceof Precompiled144_B)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x in B"));
        }
        ;
        RTS_COMMON._LINE("8 Precompiled144",31); // JavaLine 49 <== SourceLine 31
        new Precompiled144_PBLK31((_CUR))._STM();
        ;
        RTS_COMMON._LINE("8 Precompiled144",34); // JavaLine 52 <== SourceLine 34
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Precompiled144.sim","8 Precompiled144",1,6,10,8,23,21,26,23,29,25,34,26,39,28,44,29,49,31,52,34,57,34);
} // End of Class
