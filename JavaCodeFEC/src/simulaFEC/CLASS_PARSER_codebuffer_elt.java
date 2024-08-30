// JavaLine 1 <== SourceLine 51
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_codebuffer_elt extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=51, lastLine=66, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 52
    public char opdhii=0;
    public char opdloo=0;
    public char optxx=0;
    public char opnn=0;
    // JavaLine 15 <== SourceLine 53
    public CLASS_PARSER_codebuffer_elt next=null;
    // Normal Constructor
    public CLASS_PARSER_codebuffer_elt(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_codebuffer_elt _STM() {
        // JavaLine 27 <== SourceLine 66
        // BEGIN elt INNER PART
        // ENDOF elt INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","8 elt",1,51,10,52,15,53,27,66,32,66);
} // End of Class
