// JavaLine 1 <== SourceLine 216
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1_visiblegenerator_module extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=0, firstLine=216, lastLine=219, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public RTS_TXT p_rtsmoduleid;
    public RTS_TXT p_checkcode;
    public int p_numoftags;
    public int p_basetag;
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_BUILDER1_visiblegenerator_module(RTS_RTObject staticLink,RTS_TXT sp_rtsmoduleid,RTS_TXT sp_checkcode,int sp_numoftags,int sp_basetag) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_rtsmoduleid = sp_rtsmoduleid;
        this.p_checkcode = sp_checkcode;
        this.p_numoftags = sp_numoftags;
        this.p_basetag = sp_basetag;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1_visiblegenerator_module _STM() {
        // JavaLine 28 <== SourceLine 219
        // BEGIN module INNER PART
        // ENDOF module INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","9 module",1,216,28,219,33,219);
} // End of Class
