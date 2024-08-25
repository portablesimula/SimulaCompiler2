// JavaLine 1 <== SourceLine 558
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_extbinding extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=558, lastLine=574, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_extbinding(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_extbinding _STM() {
        // JavaLine 24 <== SourceLine 560
        ((PARSER_grammer)(_CUR._SL)).detach(560);
        ;
        new PARSER_grammer_readtypespec((_CUR._SL));
        ;
        _RESULT=false;
        ;
        // JavaLine 31 <== SourceLine 561
        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
            {
                // JavaLine 34 <== SourceLine 562
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                    {
                        ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                        ;
                        call(((PARSER)(_CUR._SL._SL)).coder,562);
                        ;
                    }
                }
                ;
                // JavaLine 44 <== SourceLine 563
                ((PARSER_grammer)(_CUR._SL)).detach(563);
                ;
                // JavaLine 47 <== SourceLine 564
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                    new PARSER_grammer_syntaxerror((_CUR._SL),185);
                } else {
                    // JavaLine 51 <== SourceLine 565
                    {
                        // JavaLine 53 <== SourceLine 566
                        ((PARSER)(_CUR._SL._SL)).opn=((((PARSER_grammer)(_CUR._SL)).specofvirtual_1)?('g'):('A'));
                        ;
                        // JavaLine 56 <== SourceLine 567
                        call(((PARSER)(_CUR._SL._SL)).coder,567);
                        ;
                        // JavaLine 59 <== SourceLine 568
                        ((PARSER_grammer)(_CUR._SL)).getopt=false;
                        ;
                        ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                        ;
                        // JavaLine 64 <== SourceLine 569
                        new PARSER_grammer_readprocpar((_CUR._SL),((char)137));
                        ;
                        _RESULT=true;
                        ;
                    }
                }
                ;
            }
        } else {
            // JavaLine 74 <== SourceLine 572
            new PARSER_grammer_syntaxerror((_CUR._SL),221);
        }
        ;
        // JavaLine 78 <== SourceLine 573
        ((PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 extbinding",1,558,24,560,31,561,34,562,44,563,47,564,51,565,53,566,56,567,59,568,64,569,74,572,78,573,83,574);
} // End of Procedure
