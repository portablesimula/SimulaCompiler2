// JavaLine 1 <== SourceLine 866
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_outcodefile extends RTS_Outbytefile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=3, firstLine=866, lastLine=869, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 867
    public CLASS_COMMON_quantity opq_3=null;
    // Normal Constructor
    public CLASS_COMMON_outcodefile(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_outcodefile _STM() {
        // BEGIN File INNER PART
        // BEGIN Bytefile INNER PART
        // BEGIN Outbytefile INNER PART
        // JavaLine 24 <== SourceLine 868
        RTS_BASICIO.sysout().outtext(new RTS_TXT("COMMON: new outcodefile +++++++++++++++++++++++++++++++++++++++++++++++++"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 29 <== SourceLine 869
        // BEGIN outcodefile INNER PART
        // ENDOF outcodefile INNER PART
        // ENDOF Outbytefile INNER PART
        // ENDOF Bytefile INNER PART
        // ENDOF File INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","8 outcodefile",1,866,10,867,24,868,29,869,37,869);
} // End of Class
