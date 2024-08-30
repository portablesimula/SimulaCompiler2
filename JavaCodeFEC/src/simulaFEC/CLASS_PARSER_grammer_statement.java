// JavaLine 1 <== SourceLine 662
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_statement extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=662, lastLine=712, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 666
    public boolean recovered=false;
    // JavaLine 12 <== SourceLine 667
    public boolean isblocklike=false;
    // JavaLine 14 <== SourceLine 670
    public char stmtreq=0;
    public char stmttype=0;
    // JavaLine 17 <== SourceLine 689
    public char blockstatus=0;
    // JavaLine 19 <== SourceLine 706
    public char rp=0;
    // JavaLine 21 <== SourceLine 707
    public int errorno=0;
    // JavaLine 23 <== SourceLine 708
    public CLASS_PARSER_grammer_statement caller=null;
    public CLASS_PARSER_grammer_statement next=null;
public RTS_PRCQNT recover_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: recover"); }
    public RTS_PRCQNT recoversetting_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_statement_recoversetting.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_statement(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_statement _STM() {
        // JavaLine 38 <== SourceLine 712
        // BEGIN statement INNER PART
        // ENDOF statement INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 statement",1,662,10,666,12,667,14,670,17,689,19,706,21,707,23,708,38,712,43,712);
} // End of Class
