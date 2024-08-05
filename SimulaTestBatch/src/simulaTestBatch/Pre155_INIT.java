// JavaLine 1 <== SourceLine 36
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Pre155_INIT extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=36, lastLine=51, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 42
    public Pre155_XXXX _inspect_42_4444=null;
    // Normal Constructor
    public Pre155_INIT(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public Pre155_INIT _STM() {
        // JavaLine 22 <== SourceLine 37
        RTS_BASICIO.sysout().outtext(new RTS_TXT("adHoc\u005fPAS2INIT: BEGIN class PAS2INIT/codegeneratorinit STATEMENTS"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 27 <== SourceLine 39
        new Pre155_INIT_Block40((_CUR))._STM();
        ;
        // JavaLine 30 <== SourceLine 51
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Pre155.sim","8 INIT",1,36,10,42,22,37,27,39,30,51,35,51);
} // End of Class
