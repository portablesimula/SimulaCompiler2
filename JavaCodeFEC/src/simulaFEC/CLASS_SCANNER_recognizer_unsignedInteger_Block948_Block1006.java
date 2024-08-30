package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block1006 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=1005, lastLine=1039, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 1006
    public RTS_INTEGER_ARRAY Dec=null;
    // JavaLine 10 <== SourceLine 1008
    public int carry=0;
    public int j=0;
    public char k=0;
    public char N=0;
    // Normal Constructor
    public CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block1006(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
        // JavaLine 20 <== SourceLine 1006
        Dec=new RTS_INTEGER_ARRAY(new RTS_BOUNDS(0,100));
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 26 <== SourceLine 1009
        if(_VALUE((RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashbuf_1,(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1-(1)))==('R')))) {
            {
                // JavaLine 29 <== SourceLine 1012
                ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1-(1));
                ;
                ((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).radix=':';
                ;
                _GOTO(((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL))._LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0); // GOTO EVALUATED LABEL
                ;
            }
        }
        ;
        // JavaLine 39 <== SourceLine 1017
        N=RTS_ENVIRONMENT._char(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1);
        ;
        // JavaLine 42 <== SourceLine 1018
        ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1=(((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).startpos+((((((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).radix==('@')))?(3):(2))));
        ;
        // JavaLine 45 <== SourceLine 1019
        N=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(N)-(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1)));
        ;
        ((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).radix=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).radix)-(48)));
        ;
        // JavaLine 50 <== SourceLine 1020
        while((N!=(((char)0)))) {
            {
                N=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(N)-(1)));
                ;
                // JavaLine 55 <== SourceLine 1021
                carry=(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashbuf_1,((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1))-(48));
                ;
                // JavaLine 58 <== SourceLine 1022
                if(_VALUE((carry>(9)))) {
                    carry=(carry-(7));
                }
                ;
                // JavaLine 63 <== SourceLine 1023
                ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1+(1));
                ;
                for(j=0;j<=RTS_ENVIRONMENT.rank(k);j++) {
                    // JavaLine 67 <== SourceLine 1024
                    {
                        // JavaLine 69 <== SourceLine 1025
                        carry=(carry+((Dec.getELEMENT(j)*(RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).radix)))));
                        ;
                        // JavaLine 72 <== SourceLine 1026
                        Dec.putELEMENT(Dec.index(j),RTS_ENVIRONMENT.rem(carry,10));
                        ;
                        carry=(carry/(10));
                        ;
                    }
                }
                ;
                // JavaLine 80 <== SourceLine 1028
                while((carry!=(0))) {
                    {
                        k=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(k)+(1)));
                        ;
                        // JavaLine 85 <== SourceLine 1029
                        Dec.putELEMENT(Dec.index(RTS_ENVIRONMENT.rank(k)),RTS_ENVIRONMENT.rem(carry,10));
                        ;
                        carry=(carry/(10));
                        ;
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 96 <== SourceLine 1032
        ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1=((CLASS_SCANNER_recognizer_unsignedInteger)(_CUR._SL)).startpos;
        ;
        k=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(k)+(1)));
        ;
        // JavaLine 101 <== SourceLine 1033
        while((k!=(((char)0)))) {
            {
                k=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(k)-(1)));
                ;
                // JavaLine 106 <== SourceLine 1034
                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((Dec.getELEMENT(RTS_ENVIRONMENT.rank(k))+(48))),((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashbuf_1,((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1);
                ;
                // JavaLine 109 <== SourceLine 1035
                ((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL._SL)).hashpos_1+(1));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","4 Block1006",8,1006,10,1008,20,1006,26,1009,29,1012,39,1017,42,1018,45,1019,50,1020,55,1021,58,1022,63,1023,67,1024,69,1025,72,1026,80,1028,85,1029,96,1032,101,1033,106,1034,109,1035,117,1039);
} // End of SubBlock
