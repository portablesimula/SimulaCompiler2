// JavaLine 1 <== SourceLine 1
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Feb 04 12:43:03 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class adHoc00 extends RTS_CLASS {
    // ClassDeclaration: Kind=Class, BlockLevel=1, PrefixLevel=0, firstLine=1, lastLine=5, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public adHoc00(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public adHoc00 _STM() {
        RTS_COMMON._LINE("Class adHoc00",2); // JavaLine 20 <== SourceLine 2
        RTS_BASICIO.sysout().outtext(new RTS_TXT("Hello World"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_COMMON._LINE("Class adHoc00",3); // JavaLine 25 <== SourceLine 3
        // BEGIN INNER PART
        // ENDOF INNER PART
        ;
        RTS_COMMON._LINE("Class adHoc00",4); // JavaLine 29 <== SourceLine 4
        RTS_BASICIO.sysout().outtext(new RTS_TXT("After INNER"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc00.sim","Class adHoc00",1,1,20,2,25,3,29,4,36,5);
} // End of Class
