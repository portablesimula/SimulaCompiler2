package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2037_Block2081 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=2080, lastLine=2092, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 2081
    public CLASS_CHECKER1_semchecker1_argument curarg=null;
    public CLASS_CHECKER1_semchecker1_argument arglist=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2037_Block2081(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 20 <== SourceLine 2082
        arglist=((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).lastarg;
        ;
        // JavaLine 23 <== SourceLine 2083
        while((((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).lastarg!=(((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).firstarg))) {
            {
                // JavaLine 26 <== SourceLine 2084
                curarg=((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).firstarg;
                ;
                // JavaLine 29 <== SourceLine 2085
                while((curarg.nextarg!=(((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).lastarg))) {
                    // JavaLine 31 <== SourceLine 2086
                    curarg=curarg.nextarg;
                }
                ;
                // JavaLine 35 <== SourceLine 2087
                ((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).lastarg.nextarg=(((curarg!=(((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).firstarg)))?(curarg):(null));
                ;
                // JavaLine 38 <== SourceLine 2089
                ((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).lastarg=curarg;
                ;
            }
        }
        ;
        // JavaLine 44 <== SourceLine 2091
        ((CLASS_CHECKER1_semchecker1_nextargumentproducer)(_CUR._SL)).firstarg.nextarg=arglist;
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","4 Block2081",8,2081,20,2082,23,2083,26,2084,29,2085,31,2086,35,2087,38,2089,44,2091,49,2092);
} // End of SubBlock
