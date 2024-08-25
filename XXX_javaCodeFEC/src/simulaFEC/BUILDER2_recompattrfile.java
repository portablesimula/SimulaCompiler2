// JavaLine 1 <== SourceLine 910
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER2_recompattrfile extends COMMON_attrfile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=910, lastLine=1107, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1076
    public COMMON_quantity q_1=null;
    // Normal Constructor
    public BUILDER2_recompattrfile(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER2_recompattrfile _STM() {
        // JavaLine 22 <== SourceLine 1293
        // BEGIN INNER PART
        // JavaLine 24 <== SourceLine 1078
        detach(1078);
        ;
        attrbuffer=((BUILDER2)(_CUR._SL)).Afile_7.attrbuffer;
        ;
        // JavaLine 29 <== SourceLine 1079
        new COMMON_attrfile_openattributefile((_CUR),null);
        ;
        // JavaLine 32 <== SourceLine 1080
        if(_VALUE(_TXTREL_NE(((BUILDER2)(_CUR._SL)).simsymbol,((BUILDER2)(_CUR._SL)).moduleident))) {
            // JavaLine 34 <== SourceLine 1081
            new ERRMSG_error2((_CUR._SL),401,((BUILDER2)(_CUR._SL)).simsymbol,((BUILDER2)(_CUR._SL)).moduleident);
        }
        ;
        // JavaLine 38 <== SourceLine 1084
        if(_VALUE(sysattrfile)) {
            new COMMON_attrfile_wrongLayout((_CUR));
        }
        ;
        // JavaLine 43 <== SourceLine 1086
        new COMMON_attrfile_nextKey((_CUR));
        ;
        // JavaLine 46 <== SourceLine 1087
        ((BUILDER2)(_CUR._SL)).nextexttag_6=0;
        ;
        q_1=((BUILDER2)(_CUR._SL)).display.getELEMENT(6).fpar;
        ;
        // JavaLine 51 <== SourceLine 1088
        while((q_1!=(null))) {
            // JavaLine 53 <== SourceLine 1089
            {
                if(_VALUE(((q_1.categ_1==(((char)4)))&&((_IS(q_1.descr_1,COMMON_brecord.class)||((((COMMON_extbrecord)(q_1.descr_1)).status_1==('S')))))))) {
                    // JavaLine 56 <== SourceLine 1092
                    new BUILDER2_recompattrfile_outquantwlist((_CUR),q_1);
                }
                ;
                // JavaLine 60 <== SourceLine 1093
                q_1=((COMMON_quantity)(q_1.next));
                ;
            }
        }
        ;
        // JavaLine 66 <== SourceLine 1097
        if(_VALUE((key!=(((char)252))))) {
            new COMMON_attrfile_wrongLayout((_CUR));
        }
        ;
        // JavaLine 71 <== SourceLine 1098
        new COMMON_attrfile_nextKey((_CUR));
        ;
        new BUILDER2_recompattrfile_outquantwlist((_CUR),mainqnt);
        ;
        // JavaLine 76 <== SourceLine 1101
        if(_VALUE(((key!=(((char)252)))||((new COMMON_attrfile_nextNumber((_CUR))._RESULT!=(((BUILDER2)(_CUR._SL)).nextexttag_6)))))) {
            // JavaLine 78 <== SourceLine 1102
            new COMMON_attrfile_wrongLayout((_CUR));
        }
        ;
        // JavaLine 82 <== SourceLine 1105
        CURF.close();
        ;
        CURF=null;
        ;
        // JavaLine 87 <== SourceLine 1107
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","8 recompattrfile",1,910,11,1076,22,1293,24,1078,29,1079,32,1080,34,1081,38,1084,43,1086,46,1087,51,1088,53,1089,56,1092,60,1093,66,1097,71,1098,76,1101,78,1102,82,1105,87,1107,93,1107);
} // End of Class
