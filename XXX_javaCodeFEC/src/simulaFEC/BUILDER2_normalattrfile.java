// JavaLine 1 <== SourceLine 139
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER2_normalattrfile extends COMMON_attrfile {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=139, lastLine=906, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 146
    public RTS_TXT t_1=null;
    public COMMON_quantity q_1=null;
    // Normal Constructor
    public BUILDER2_normalattrfile(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER2_normalattrfile _STM() {
        // JavaLine 23 <== SourceLine 1293
        // BEGIN INNER PART
        // JavaLine 25 <== SourceLine 867
        detach(867);
        ;
        // JavaLine 28 <== SourceLine 868
        sysattrfile=(mainqnt.virtno_1!=(0));
        ;
        // JavaLine 31 <== SourceLine 869
        if(_VALUE(sysattrfile)) {
            {
                // JavaLine 34 <== SourceLine 870
                new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER2"),870,CONC(new RTS_TXT("sportid="),new RTS_TXT("S-port 108.1")));
                ;
                // JavaLine 37 <== SourceLine 871
                ((BUILDER2)(_CUR._SL)).attrfilename=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("C:/WorkSpaces/SPort-System/S-Port/Attrs/FEC/NEXT-PREDEF.atr")));
                ;
            }
        }
        ;
        // JavaLine 43 <== SourceLine 873
        AOF=new RTS_Outbytefile(_CTX,((BUILDER2)(_CUR._SL)).attrfilename)._STM();
        ;
        // JavaLine 46 <== SourceLine 874
        new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER2"),874,CONC(new RTS_TXT("OPEN ATTRIBUTE OUTPUT: "),((BUILDER2)(_CUR._SL)).attrfilename));
        ;
        // JavaLine 49 <== SourceLine 875
        if(_VALUE((!(AOF.open())))) {
            new ERRMSG_openerror((_CUR._SL),((BUILDER2)(_CUR._SL)).attrfilename);
        }
        ;
        // JavaLine 54 <== SourceLine 876
        AOF.outbyte(RTS_ENVIRONMENT.rank(((char)2)));
        ;
        // JavaLine 57 <== SourceLine 877
        new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER2"),877,CONC(new RTS_TXT("sportid="),new RTS_TXT("S-port 108.1")));
        ;
        // JavaLine 60 <== SourceLine 878
        if(_VALUE((RTS_TXT.length(new RTS_TXT("S-port 108.1"))!=(12)))) {
            new ERRMSG_internerr((_CUR._SL),((char)7),878);
        }
        ;
        // JavaLine 65 <== SourceLine 880
        if(_VALUE(sysattrfile)) {
            {
                // JavaLine 68 <== SourceLine 881
                t_1=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("S-port 108.1")));
                ;
                _ASGSTR(RTS_TXT.sub(t_1,11,1),":");
                ;
            }
        } else {
            // JavaLine 75 <== SourceLine 882
            t_1=new RTS_TXT("S-port 108.1");
        }
        ;
        _ASGTXT(RTS_TXT.sub(attrbuffer,3,12),t_1);
        ;
        p=14;
        ;
        // JavaLine 83 <== SourceLine 884
        new BUILDER2_normalattrfile_puttext((_CUR),((BUILDER2)(_CUR._SL)).checkcode);
        ;
        new BUILDER2_normalattrfile_puttext((_CUR),((BUILDER2)(_CUR._SL)).moduleident);
        ;
        // JavaLine 88 <== SourceLine 887
        ((BUILDER2)(_CUR._SL)).nextexttag_6=0;
        ;
        q_1=((BUILDER2)(_CUR._SL)).display.getELEMENT(6).fpar;
        ;
        // JavaLine 93 <== SourceLine 888
        while((q_1!=(null))) {
            // JavaLine 95 <== SourceLine 889
            {
                if(_VALUE(((q_1.categ_1==(((char)4)))&&((_IS(q_1.descr_1,COMMON_brecord.class)||((((COMMON_extbrecord)(q_1.descr_1)).status_1==('S')))))))) {
                    // JavaLine 98 <== SourceLine 892
                    new BUILDER2_normalattrfile_outquantwlist((_CUR),q_1);
                }
                ;
                // JavaLine 102 <== SourceLine 893
                q_1=((COMMON_quantity)(q_1.next));
                ;
            }
        }
        ;
        // JavaLine 108 <== SourceLine 897
        new BUILDER2_normalattrfile_outKey((_CUR),((char)252));
        ;
        new BUILDER2_normalattrfile_outquantwlist((_CUR),mainqnt);
        ;
        // JavaLine 113 <== SourceLine 898
        new BUILDER2_normalattrfile_outKey((_CUR),((char)252));
        ;
        new BUILDER2_normalattrfile_putNumber((_CUR),((BUILDER2)(_CUR._SL)).nextexttag_6);
        ;
        // JavaLine 118 <== SourceLine 899
        new BUILDER2_normalattrfile_outKey((_CUR),((char)252));
        ;
        // JavaLine 121 <== SourceLine 900
        new BUILDER2_normalattrfile_swapObuffer((_CUR));
        ;
        // JavaLine 124 <== SourceLine 903
        AOF.outtext(((BUILDER2)(_CUR._SL)).timestamp);
        ;
        // JavaLine 127 <== SourceLine 904
        new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER2"),904,CONC(new RTS_TXT("CLOSE ATTRIBUTE OUTPUT: "),((BUILDER2)(_CUR._SL)).attrfilename));
        ;
        // JavaLine 130 <== SourceLine 905
        AOF.close();
        ;
        AOF=null;
        ;
        // JavaLine 135 <== SourceLine 906
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","8 normalattrfile",1,139,11,146,23,1293,25,867,28,868,31,869,34,870,37,871,43,873,46,874,49,875,54,876,57,877,60,878,65,880,68,881,75,882,83,884,88,887,93,888,95,889,98,892,102,893,108,897,113,898,118,899,121,900,124,903,127,904,130,905,135,906,141,906);
} // End of Class
