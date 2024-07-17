// JavaLine 1 <== SourceLine 661
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_statement extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=661, lastLine=711, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 665
    public boolean recovered=false;
    // JavaLine 12 <== SourceLine 666
    public boolean isblocklike=false;
    // JavaLine 14 <== SourceLine 669
    public char stmtreq=0;
    public char stmttype=0;
    // JavaLine 17 <== SourceLine 688
    public char blockstatus=0;
    // JavaLine 19 <== SourceLine 705
    public char rp=0;
    // JavaLine 21 <== SourceLine 706
    public int errorno=0;
    // JavaLine 23 <== SourceLine 707
    public PARSER_grammer_statement caller=null;
    public PARSER_grammer_statement next=null;
public RTS_PRCQNT recover_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: recover"); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,PARSER_grammer_statement_recoversetting.class)); }
    // Normal Constructor
    public PARSER_grammer_statement(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_statement _STM() {
        // JavaLine 38 <== SourceLine 711
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 statement",1,661,10,665,12,666,14,669,17,688,19,705,21,706,23,707,38,711,43,711);
} // End of Class
