// JavaLine 1 <== SourceLine 270
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1_dummygenerator extends BUILDER1_visiblegenerator {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=5, firstLine=270, lastLine=286, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public BUILDER1_dummygenerator(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER1_dummygenerator _STM() {
        // BEGIN INNER PART
        // BEGIN INNER PART
        // BEGIN INNER PART
        // JavaLine 23 <== SourceLine 868
        // BEGIN INNER PART
        // JavaLine 25 <== SourceLine 268
        // BEGIN INNER PART
        // JavaLine 27 <== SourceLine 275
        while(true) {
            {
                // JavaLine 30 <== SourceLine 277
                detach(277);
                ;
                // JavaLine 33 <== SourceLine 279
                if(_VALUE((SCF_4!=(null)))) {
                    {
                        SCF_4.close();
                        ;
                        SCF_4=null;
                    }
                }
                ;
                // JavaLine 42 <== SourceLine 280
                if(_VALUE((((BUILDER1)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Z'))!=(((char)0))))) {
                    // JavaLine 44 <== SourceLine 281
                    {
                        new BUILDER1_visiblegenerator_beforeDump((_CUR));
                        ;
                        new BUILDER1_visiblegenerator_afterDump((_CUR));
                    }
                }
                ;
                // JavaLine 52 <== SourceLine 282
                opq_3=null;
                ;
                // JavaLine 55 <== SourceLine 283
                ((BUILDER1)(_CUR._SL)).opihi_6=((BUILDER1)(_CUR._SL)).opilo_6=((char)0);
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 62 <== SourceLine 286
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 dummygenerator",1,270,23,868,25,268,27,275,30,277,33,279,42,280,44,281,52,282,55,283,62,286,72,286);
} // End of Class
