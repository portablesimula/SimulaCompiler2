// JavaLine 1 <== SourceLine 50
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_codebuffer_elt extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=50, lastLine=65, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 51
    public char opdhii=0;
    public char opdloo=0;
    public char optxx=0;
    public char opnn=0;
    // JavaLine 15 <== SourceLine 52
    public PARSER_codebuffer_elt next=null;
    // Normal Constructor
    public PARSER_codebuffer_elt(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_codebuffer_elt _STM() {
        // JavaLine 27 <== SourceLine 65
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 elt",1,50,10,51,15,52,27,65,32,65);
} // End of Class
