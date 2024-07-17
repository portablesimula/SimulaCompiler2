// JavaLine 1 <== SourceLine 200
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1_visiblegenerator extends COMMON_outcodefile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=4, firstLine=200, lastLine=268, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 202
    public int asd_4=0;
    public int curasd_4=0;
    // JavaLine 13 <== SourceLine 203
    public int curjump_4=0;
    public int saveindex_4=0;
    // JavaLine 16 <== SourceLine 205
    public RTS_BOOLEAN_ARRAY saveemitted=null;
    // JavaLine 18 <== SourceLine 207
    public int lastasd_4=0;
    public int lastcurasd_4=0;
    // JavaLine 21 <== SourceLine 208
    public int lastjmp_4=0;
    public int lastsav_4=0;
    // JavaLine 24 <== SourceLine 211
    public RTS_Outbytefile SCF_4=null;
    // JavaLine 26 <== SourceLine 213
    public RTS_REF_ARRAY<BUILDER1_visiblegenerator_module> moduletab=null;
    // Normal Constructor
    public BUILDER1_visiblegenerator(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 33 <== SourceLine 205
        saveemitted=new RTS_BOOLEAN_ARRAY(new RTS_BOUNDS(0,50));
        // JavaLine 35 <== SourceLine 213
        moduletab=new RTS_REF_ARRAY<BUILDER1_visiblegenerator_module>(new RTS_BOUNDS(0,20));
    }
    // Class Statements
    @Override
    public BUILDER1_visiblegenerator _STM() {
        // BEGIN INNER PART
        // BEGIN INNER PART
        // BEGIN INNER PART
        // JavaLine 44 <== SourceLine 868
        // BEGIN INNER PART
        // JavaLine 46 <== SourceLine 268
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 visiblegenerator",1,200,10,202,13,203,16,205,18,207,21,208,24,211,26,213,33,205,35,213,44,868,46,268,55,268);
} // End of Class
