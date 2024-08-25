// JavaLine 1 <== SourceLine 39
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_codebuffer extends COMMON_outcodefile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=4, firstLine=39, lastLine=112, hasLocalClasses=true, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 40
    public COMMON_outcodefile prev_4=null;
    // JavaLine 13 <== SourceLine 41
    public PARSER_codebuffer_elt curelt_4=null;
    public PARSER_codebuffer_elt firstelt_4=null;
    // JavaLine 16 <== SourceLine 43
    public PARSER_codebuffer_elt cvar_4=null;
    // JavaLine 18 <== SourceLine 44
    public PARSER_codebuffer_elt stepexpr_4=null;
    // JavaLine 20 <== SourceLine 45
    public PARSER_codebuffer_elt forvar_4=null;
    // JavaLine 22 <== SourceLine 46
    public PARSER_codebuffer_elt wheeler_4=null;
    // JavaLine 24 <== SourceLine 47
    public PARSER_codebuffer_elt deltavar_4=null;
    // JavaLine 26 <== SourceLine 48
    public PARSER_codebuffer_elt statlabel_4=null;
    // JavaLine 28 <== SourceLine 103
    public PARSER_codebuffer_elt _inspect_103_4498_4=null;
    // Normal Constructor
    public PARSER_codebuffer(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_codebuffer _STM() {
        // BEGIN INNER PART
        // BEGIN INNER PART
        // BEGIN INNER PART
        // JavaLine 42 <== SourceLine 868
        // BEGIN INNER PART
        // JavaLine 44 <== SourceLine 98
        prev_4=((PARSER)(_CUR._SL)).coder;
        ;
        ((PARSER)(_CUR._SL)).coder=((COMMON_outcodefile)(_CUR));
        ;
        // JavaLine 49 <== SourceLine 99
        firstelt_4=curelt_4=new PARSER_codebuffer_elt((_CUR))._STM();
        ;
        // JavaLine 52 <== SourceLine 100
        detach(100);
        ;
        // JavaLine 55 <== SourceLine 102
        while(true) {
            {
                // JavaLine 58 <== SourceLine 103
                {
                    // BEGIN INSPECTION 
                    _inspect_103_4498_4=new PARSER_codebuffer_elt((_CUR))._STM();
                    if(_inspect_103_4498_4!=null) { // INSPECT _inspect_103_4498_4
                        {
                            {
                                _inspect_103_4498_4.opnn=((PARSER)(_CUR._SL)).opn;
                                ;
                                // JavaLine 67 <== SourceLine 104
                                _inspect_103_4498_4.opdhii=((PARSER)(_CUR._SL)).opdhi;
                                ;
                                _inspect_103_4498_4.opdloo=((PARSER)(_CUR._SL)).opdlo;
                                ;
                                _inspect_103_4498_4.optxx=((PARSER)(_CUR._SL)).optx;
                                ;
                                // JavaLine 74 <== SourceLine 105
                                _inspect_103_4498_4.next=curelt_4.next;
                                ;
                                curelt_4=curelt_4.next=((PARSER_codebuffer_elt)_inspect_103_4498_4);
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 84 <== SourceLine 108
                detach(108);
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 91 <== SourceLine 112
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 codebuffer",1,39,11,40,13,41,16,43,18,44,20,45,22,46,24,47,26,48,28,103,42,868,44,98,49,99,52,100,55,102,58,103,67,104,74,105,84,108,91,112,100,112);
} // End of Class
