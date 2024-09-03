// JavaLine 1 <== SourceLine 40
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_codebuffer extends CLASS_COMMON_outcodefile {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=4, firstLine=40, lastLine=113, hasLocalClasses=true, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 41
    public CLASS_COMMON_outcodefile prev_4=null;
    // JavaLine 13 <== SourceLine 42
    public CLASS_PARSER_codebuffer_elt curelt_4=null;
    public CLASS_PARSER_codebuffer_elt firstelt_4=null;
    // JavaLine 16 <== SourceLine 44
    public CLASS_PARSER_codebuffer_elt cvar_4=null;
    // JavaLine 18 <== SourceLine 45
    public CLASS_PARSER_codebuffer_elt stepexpr_4=null;
    // JavaLine 20 <== SourceLine 46
    public CLASS_PARSER_codebuffer_elt forvar_4=null;
    // JavaLine 22 <== SourceLine 47
    public CLASS_PARSER_codebuffer_elt wheeler_4=null;
    // JavaLine 24 <== SourceLine 48
    public CLASS_PARSER_codebuffer_elt deltavar_4=null;
    // JavaLine 26 <== SourceLine 49
    public CLASS_PARSER_codebuffer_elt statlabel_4=null;
    // JavaLine 28 <== SourceLine 104
    public CLASS_PARSER_codebuffer_elt _inspect_104_4498=null;
    // Normal Constructor
    public CLASS_PARSER_codebuffer(RTS_RTObject staticLink,RTS_TXT sp_FILENAME_) {
        super(staticLink,sp_FILENAME_);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_codebuffer _STM() {
        // BEGIN File INNER PART
        // BEGIN Bytefile INNER PART
        // BEGIN Outbytefile INNER PART
        // JavaLine 42 <== SourceLine 868
        RTS_BASICIO.sysout().outtext(new RTS_TXT("COMMON: new outcodefile +++++++++++++++++++++++++++++++++++++++++++++++++"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 47 <== SourceLine 869
        // BEGIN outcodefile INNER PART
        // JavaLine 49 <== SourceLine 99
        prev_4=((CLASS_PARSER)(_CUR._SL)).coder;
        ;
        ((CLASS_PARSER)(_CUR._SL)).coder=((CLASS_COMMON_outcodefile)(_CUR));
        ;
        // JavaLine 54 <== SourceLine 100
        firstelt_4=curelt_4=new CLASS_PARSER_codebuffer_elt((_CUR))._STM();
        ;
        // JavaLine 57 <== SourceLine 101
        detach(101);
        ;
        // JavaLine 60 <== SourceLine 103
        while(true) {
            {
                // JavaLine 63 <== SourceLine 104
                {
                    // BEGIN INSPECTION 
                    _inspect_104_4498=new CLASS_PARSER_codebuffer_elt((_CUR))._STM();
                    if(_inspect_104_4498!=null) { // INSPECT _inspect_104_4498  type=ref(ELT)
                        {
                            {
                                _inspect_104_4498.opnn=((CLASS_PARSER)(_CUR._SL)).opn;
                                ;
                                // JavaLine 72 <== SourceLine 105
                                _inspect_104_4498.opdhii=((CLASS_PARSER)(_CUR._SL)).opdhi;
                                ;
                                _inspect_104_4498.opdloo=((CLASS_PARSER)(_CUR._SL)).opdlo;
                                ;
                                _inspect_104_4498.optxx=((CLASS_PARSER)(_CUR._SL)).optx;
                                ;
                                // JavaLine 79 <== SourceLine 106
                                _inspect_104_4498.next=curelt_4.next;
                                ;
                                curelt_4=curelt_4.next=((CLASS_PARSER_codebuffer_elt)_inspect_104_4498);
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 89 <== SourceLine 109
                detach(109);
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 96 <== SourceLine 113
        // BEGIN codebuffer INNER PART
        // ENDOF codebuffer INNER PART
        // ENDOF outcodefile INNER PART
        // ENDOF Outbytefile INNER PART
        // ENDOF Bytefile INNER PART
        // ENDOF File INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","9 codebuffer",1,40,11,41,13,42,16,44,18,45,20,46,22,47,24,48,26,49,28,104,42,868,47,869,49,99,54,100,57,101,60,103,63,104,72,105,79,106,89,109,96,113,105,113);
} // End of Class
