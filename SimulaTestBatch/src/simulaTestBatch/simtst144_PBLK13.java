package simulaTestBatch;
// Simula-2.0 Compiled at Fri May 10 08:07:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst144_PBLK13 extends Precompiled144 {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=2, firstLine=13, lastLine=17, hasLocalClasses=false, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public simtst144_PBLK13(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public simtst144_PBLK13 _STM() {
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",21); // JavaLine 19 <== SourceLine 21
        x=new Precompiled144_B((_CUR))._STM();
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",23); // JavaLine 22 <== SourceLine 23
        K=((Precompiled144_B)(x)).N_1;
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",25); // JavaLine 25 <== SourceLine 25
        if(_VALUE(_IS(x,Precompiled144_A.class))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x is A"));
        }
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",26); // JavaLine 30 <== SourceLine 26
        if(_VALUE(_IS(x,Precompiled144_B.class))) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x is B"));
        }
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",28); // JavaLine 35 <== SourceLine 28
        if(_VALUE(x instanceof Precompiled144_A)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x in A"));
        }
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",29); // JavaLine 40 <== SourceLine 29
        if(_VALUE(x instanceof Precompiled144_B)) {
            RTS_BASICIO.sysout().outtext(new RTS_TXT("  TEST: x in B"));
        }
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",31); // JavaLine 45 <== SourceLine 31
        new Precompiled144_PBLK31((_CUR))._STM();
        ;
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",34); // JavaLine 48 <== SourceLine 34
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        RTS_COMMON._LINE("9 simtst144.simtst144_PBLK13",15); // JavaLine 52 <== SourceLine 15
        RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("TEST: "),RTS_ENVIRONMENT.edit(K)));
        ;
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst144.sim","9 simtst144_PBLK13",19,21,22,23,25,25,30,26,35,28,40,29,45,31,48,34,52,15,58,17);
} // End of Class
