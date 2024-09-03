// JavaLine 1 <== SourceLine 275
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1_dummygenerator extends CLASS_BUILDER1_visiblegenerator {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=5, firstLine=275, lastLine=291, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_BUILDER1_dummygenerator(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1_dummygenerator _STM() {
        // BEGIN File INNER PART
        // BEGIN Bytefile INNER PART
        // BEGIN Outbytefile INNER PART
        // JavaLine 23 <== SourceLine 868
        RTS_BASICIO.sysout().outtext(new RTS_TXT("COMMON: new outcodefile +++++++++++++++++++++++++++++++++++++++++++++++++"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 28 <== SourceLine 869
        // BEGIN outcodefile INNER PART
        // JavaLine 30 <== SourceLine 269
        RTS_BASICIO.sysout().outtext(new RTS_TXT("BUILDER1.main: BEGIN visiblegenerator STATEMENTS"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 35 <== SourceLine 273
        // BEGIN visiblegenerator INNER PART
        // JavaLine 37 <== SourceLine 280
        while(true) {
            {
                // JavaLine 40 <== SourceLine 282
                detach(282);
                ;
                // JavaLine 43 <== SourceLine 284
                if(_VALUE((SCF_4!=(null)))) {
                    {
                        SCF_4.close();
                        ;
                        SCF_4=null;
                    }
                }
                ;
                // JavaLine 52 <== SourceLine 285
                if(_VALUE((((CLASS_BUILDER1)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Z'))!=(((char)0))))) {
                    // JavaLine 54 <== SourceLine 286
                    {
                        new CLASS_BUILDER1_visiblegenerator_beforeDump((_CUR));
                        ;
                        new CLASS_BUILDER1_visiblegenerator_afterDump((_CUR));
                    }
                }
                ;
                // JavaLine 62 <== SourceLine 287
                opq_3=null;
                ;
                // JavaLine 65 <== SourceLine 288
                ((CLASS_BUILDER1)(_CUR._SL)).opihi_6=((CLASS_BUILDER1)(_CUR._SL)).opilo_6=((char)0);
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 72 <== SourceLine 291
        // BEGIN dummygenerator INNER PART
        // ENDOF dummygenerator INNER PART
        // ENDOF visiblegenerator INNER PART
        // ENDOF outcodefile INNER PART
        // ENDOF Outbytefile INNER PART
        // ENDOF Bytefile INNER PART
        // ENDOF File INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","9 dummygenerator",1,275,23,868,28,869,30,269,35,273,37,280,40,282,43,284,52,285,54,286,62,287,65,288,72,291,82,291);
} // End of Class
