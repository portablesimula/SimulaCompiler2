// JavaLine 1 <== SourceLine 559
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_extbinding extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=559, lastLine=575, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_extbinding(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_extbinding _STM() {
        // JavaLine 24 <== SourceLine 561
        ((CLASS_PARSER_grammer)(_CUR._SL)).detach(561);
        ;
        new CLASS_PARSER_grammer_readtypespec((_CUR._SL));
        ;
        _RESULT=false;
        ;
        // JavaLine 31 <== SourceLine 562
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
            {
                // JavaLine 34 <== SourceLine 563
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                    {
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,563);
                        ;
                    }
                }
                ;
                // JavaLine 44 <== SourceLine 564
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(564);
                ;
                // JavaLine 47 <== SourceLine 565
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                    new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),185);
                } else {
                    // JavaLine 51 <== SourceLine 566
                    {
                        // JavaLine 53 <== SourceLine 567
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((((CLASS_PARSER_grammer)(_CUR._SL)).specofvirtual_1)?('g'):('A'));
                        ;
                        // JavaLine 56 <== SourceLine 568
                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,568);
                        ;
                        // JavaLine 59 <== SourceLine 569
                        ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                        ;
                        // JavaLine 64 <== SourceLine 570
                        new CLASS_PARSER_grammer_readprocpar((_CUR._SL),((char)137));
                        ;
                        _RESULT=true;
                        ;
                    }
                }
                ;
            }
        } else {
            // JavaLine 74 <== SourceLine 573
            new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),221);
        }
        ;
        // JavaLine 78 <== SourceLine 574
        ((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 extbinding",1,559,24,561,31,562,34,563,44,564,47,565,51,566,53,567,56,568,59,569,64,570,74,573,78,574,83,575);
} // End of Procedure
