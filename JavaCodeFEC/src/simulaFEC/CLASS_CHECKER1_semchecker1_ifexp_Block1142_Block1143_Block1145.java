package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_ifexp_Block1142_Block1143_Block1145 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=1144, lastLine=1153, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 1145
    public CLASS_COMMON_quantity qx=null;
    public CLASS_COMMON_quantity qy=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_ifexp_Block1142_Block1143_Block1145(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 20 <== SourceLine 1146
        qx=((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).qual;
        ;
        qy=((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.qual;
        ;
        // JavaLine 25 <== SourceLine 1147
        while((qx.plev_1>(qy.plev_1))) {
            qx=qx.prefqual_1;
        }
        ;
        // JavaLine 30 <== SourceLine 1148
        while((qy.plev_1>(qx.plev_1))) {
            qy=qy.prefqual_1;
        }
        ;
        // JavaLine 35 <== SourceLine 1149
        while(((qx!=(qy))&&((qx.plev_1>(1))))) {
            // JavaLine 37 <== SourceLine 1150
            {
                qx=qx.prefqual_1;
                ;
                qy=qy.prefqual_1;
            }
        }
        ;
        // JavaLine 45 <== SourceLine 1151
        if(_VALUE((qx==(qy)))) {
            ((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).qual=qx;
        } else {
            // JavaLine 49 <== SourceLine 1152
            new CLASS_ERRMSG_error2quants((_CUR._SL._SL._SL),404,((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.qual,((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.qual);
        }
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","4 Block1145",8,1145,20,1146,25,1147,30,1148,35,1149,37,1150,45,1151,49,1152,54,1153);
} // End of SubBlock
