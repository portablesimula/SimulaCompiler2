// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCANNER extends CLASS_ERRMSG {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=2, firstLine=3, lastLine=2395, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 20
    public final char EOL_2=(char)(((char)7));
    // JavaLine 12 <== SourceLine 21
    public final int upcorr_2=(int)(32);
    // JavaLine 14 <== SourceLine 25
    public final char Skip_cl_2=(char)(((char)9));
    // JavaLine 16 <== SourceLine 26
    public final char Illegal_cl_2=(char)(((char)8));
    // JavaLine 18 <== SourceLine 27
    public final char Graphic_cl_2=(char)(((char)7));
    // JavaLine 20 <== SourceLine 28
    public final char Format_cl_2=(char)(((char)6));
    // JavaLine 22 <== SourceLine 29
    public final char Exclam_cl_2=(char)(((char)5));
    // JavaLine 24 <== SourceLine 30
    public final char Basic_cl_2=(char)(((char)4));
    // JavaLine 26 <== SourceLine 31
    public final char Uscore_cl_2=(char)(((char)3));
    // JavaLine 28 <== SourceLine 32
    public final char Digit_cl_2=(char)(((char)2));
    // JavaLine 30 <== SourceLine 33
    public final char LetterC_cl_2=(char)(((char)1));
    // JavaLine 32 <== SourceLine 34
    public final char Letter_cl_2=(char)(((char)0));
    // JavaLine 34 <== SourceLine 37
    public int extid_2=0;
    // JavaLine 36 <== SourceLine 38
    public int repcount_2=0;
    // JavaLine 38 <== SourceLine 39
    public CLASS_SCANNER_recognizer lexScanner_2=null;
    // JavaLine 40 <== SourceLine 462
    public boolean incrlnr_2=false;
    // JavaLine 42 <== SourceLine 463
    public CLASS_SCANNER_input cursource_2=null;
    // JavaLine 44 <== SourceLine 464
    public boolean dummygen_2=false;
    // JavaLine 46 <== SourceLine 466
    public RTS_BOOLEAN_ARRAY selector=null;
    // JavaLine 48 <== SourceLine 1557
    public CLASS_SCANNER_L2Coder P1coder_2=null;
    // Normal Constructor
    public CLASS_SCANNER(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 55 <== SourceLine 466
        selector=new RTS_BOOLEAN_ARRAY(new RTS_BOUNDS(0,127));
    }
    // Class Statements
    @Override
    public CLASS_SCANNER _STM() {
        // JavaLine 61 <== SourceLine 1323
        // BEGIN CLASS_COMMON INNER PART
        // JavaLine 63 <== SourceLine 998
        // BEGIN CLASS_ERRMSG INNER PART
        // JavaLine 65 <== SourceLine 2395
        // BEGIN CLASS_SCANNER INNER PART
        // ENDOF CLASS_SCANNER INNER PART
        // ENDOF CLASS_ERRMSG INNER PART
        // ENDOF CLASS_COMMON INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","8 CLASS_SCANNER",1,3,10,20,12,21,14,25,16,26,18,27,20,28,22,29,24,30,26,31,28,32,30,33,32,34,34,37,36,38,38,39,40,462,42,463,44,464,46,466,48,1557,55,466,61,1323,63,998,65,2395,72,2395);
} // End of Class
