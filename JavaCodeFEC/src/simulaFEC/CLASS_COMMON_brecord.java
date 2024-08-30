// JavaLine 1 <== SourceLine 393
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_brecord extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=393, lastLine=556, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 395
    public char blnohi=0;
    public char blnolo=0;
    public char blev=0;
    public char rtblev=0;
    // JavaLine 15 <== SourceLine 396
    public char dcltag=0;
    public char stmtag=0;
    public char inrtag=0;
    // JavaLine 19 <== SourceLine 397
    public char kind=0;
    // JavaLine 21 <== SourceLine 399
    public boolean thisused=false;
    // JavaLine 23 <== SourceLine 400
    public boolean localclasses=false;
    // JavaLine 25 <== SourceLine 401
    public boolean descriptorpr=false;
    // JavaLine 27 <== SourceLine 402
    public boolean hasCode=false;
    // JavaLine 29 <== SourceLine 403
    public char inspected=0;
    // JavaLine 31 <== SourceLine 404
    public int connests=0;
    // JavaLine 33 <== SourceLine 406
    public int npar=0;
    // JavaLine 35 <== SourceLine 408
    public int navirt=0;
    // JavaLine 37 <== SourceLine 409
    public int line1=0;
    // JavaLine 39 <== SourceLine 410
    public CLASS_COMMON_quantity declquant=null;
    // JavaLine 41 <== SourceLine 411
    public CLASS_COMMON_quantity fpar=null;
    // JavaLine 43 <== SourceLine 412
    public CLASS_COMMON_quantity favirt=null;
    // JavaLine 45 <== SourceLine 413
    public CLASS_COMMON_idpack hidlist=null;
    // JavaLine 47 <== SourceLine 416
    public CLASS_COMMON_stackedb preinsp=null;
    // Normal Constructor
    public CLASS_COMMON_brecord(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_brecord _STM() {
        // JavaLine 59 <== SourceLine 556
        // BEGIN brecord INNER PART
        // ENDOF brecord INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","8 brecord",1,393,10,395,15,396,19,397,21,399,23,400,25,401,27,402,29,403,31,404,33,406,35,408,37,409,39,410,41,411,43,412,45,413,47,416,59,556,64,556);
} // End of Class
