package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readtypespec_Block322_Block324_Block327 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=327, lastLine=332, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public char opdhip=0;
    public char opdlop=0;
    // Normal Constructor
    public CLASS_PARSER_grammer_readtypespec_Block322_Block324_Block327(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 328
        new CLASS_PARSER_grammer_ParsErr((_CUR._SL._SL),185);
        ;
        opdhip=((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi;
        ;
        opdlop=((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo;
        ;
        // JavaLine 26 <== SourceLine 329
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)7);
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=((char)0);
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo='G';
        ;
        // JavaLine 33 <== SourceLine 330
        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,330);
        ;
        // JavaLine 36 <== SourceLine 331
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=opdhip;
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=opdlop;
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","4 Block327",19,328,26,329,33,330,36,331,43,332);
} // End of SubBlock
