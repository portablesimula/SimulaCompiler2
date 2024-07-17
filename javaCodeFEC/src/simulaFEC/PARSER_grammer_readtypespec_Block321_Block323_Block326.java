package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readtypespec_Block321_Block323_Block326 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=326, lastLine=331, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public char opdhip=0;
    public char opdlop=0;
    // Normal Constructor
    public PARSER_grammer_readtypespec_Block321_Block323_Block326(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 327
        new PARSER_grammer_ParsErr((_CUR._SL._SL),185);
        ;
        opdhip=((PARSER)(_CUR._SL._SL._SL)).opdhi;
        ;
        opdlop=((PARSER)(_CUR._SL._SL._SL)).opdlo;
        ;
        // JavaLine 26 <== SourceLine 328
        ((PARSER)(_CUR._SL._SL._SL)).opn=((char)7);
        ;
        ((PARSER)(_CUR._SL._SL._SL)).opdhi=((char)0);
        ;
        ((PARSER)(_CUR._SL._SL._SL)).opdlo='G';
        ;
        // JavaLine 33 <== SourceLine 329
        call(((PARSER)(_CUR._SL._SL._SL)).coder,329);
        ;
        // JavaLine 36 <== SourceLine 330
        ((PARSER)(_CUR._SL._SL._SL)).opdhi=opdhip;
        ;
        ((PARSER)(_CUR._SL._SL._SL)).opdlo=opdlop;
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","4 Block326",19,327,26,328,33,329,36,330,43,331);
} // End of SubBlock
