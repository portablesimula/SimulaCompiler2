// JavaLine 1 <== SourceLine 874
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_attrfile extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=874, lastLine=1293, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 875
    public final char layoutindex=(char)(((char)2));
    // JavaLine 12 <== SourceLine 877
    public final int bufsize=(int)(2048);
    public final int bufmax;
    // JavaLine 15 <== SourceLine 882
    public final char longSwap=(char)(((char)255));
    // JavaLine 17 <== SourceLine 883
    public final char bufSwap=(char)(((char)254));
    // JavaLine 19 <== SourceLine 884
    public final char longText=(char)(((char)253));
    // JavaLine 21 <== SourceLine 885
    public final char mainKey=(char)(((char)252));
    // JavaLine 23 <== SourceLine 886
    public final char begList=(char)(((char)251));
    // JavaLine 25 <== SourceLine 887
    public final char endlist=(char)(((char)250));
    // JavaLine 27 <== SourceLine 888
    public final char protMark=(char)(((char)249));
    // JavaLine 29 <== SourceLine 889
    public final char hidMark=(char)(((char)248));
    // JavaLine 31 <== SourceLine 890
    public final char nestMark=(char)(((char)247));
    // JavaLine 33 <== SourceLine 891
    public final char xMark=(char)(((char)246));
    // JavaLine 35 <== SourceLine 892
    public final char yMark=(char)(((char)245));
    // JavaLine 37 <== SourceLine 893
    public final char specMark=(char)(((char)244));
    // JavaLine 39 <== SourceLine 894
    public final char overMark=(char)(((char)243));
    // JavaLine 41 <== SourceLine 895
    public final char dimMark=(char)(((char)242));
    // JavaLine 43 <== SourceLine 896
    public final char forcMark=(char)(((char)241));
    // JavaLine 45 <== SourceLine 897
    public final char thisMark=(char)(((char)240));
    // JavaLine 47 <== SourceLine 898
    public final char lowKey=(char)(((char)240));
    public final char hikey=(char)(((char)255));
    // JavaLine 50 <== SourceLine 900
    public boolean sysattrfile=false;
    // JavaLine 52 <== SourceLine 901
    public boolean xthisused=false;
    public boolean xhascode=false;
    // JavaLine 55 <== SourceLine 902
    public char xprotect=0;
    public char xtype=0;
    public char xkind=0;
    public char xcateg=0;
    public char xspecial=0;
    public char xclf=0;
    public char xlongindic=0;
    // JavaLine 63 <== SourceLine 903
    public char xinrtag=0;
    public char xconnests=0;
    public char xprefqhi=0;
    public char xprefqlo=0;
    // JavaLine 68 <== SourceLine 904
    public char xarrhi=0;
    public char xarrlo=0;
    public char xcheckhi=0;
    public char xchecklo=0;
    public char attrckhi=0;
    public char attrcklo=0;
    // JavaLine 75 <== SourceLine 905
    public char xmodulhi=0;
    public char xmodullo=0;
    public char attrmodhi=0;
    public char attrmodlo=0;
    // JavaLine 80 <== SourceLine 906
    public char key=0;
    // JavaLine 82 <== SourceLine 907
    public int xdim=0;
    public int xlanguage=0;
    public int xextident=0;
    // JavaLine 86 <== SourceLine 908
    public int xtagnum=0;
    // JavaLine 88 <== SourceLine 909
    public int xftag=0;
    // JavaLine 90 <== SourceLine 910
    public int p=0;
    // JavaLine 92 <== SourceLine 911
    public RTS_Inbytefile CURF=null;
    // JavaLine 94 <== SourceLine 912
    public RTS_Outbytefile AOF=null;
    // JavaLine 96 <== SourceLine 913
    public COMMON_idpack xhidlist=null;
    // JavaLine 98 <== SourceLine 914
    public COMMON_symbolbox xident=null;
    // JavaLine 100 <== SourceLine 915
    public COMMON_quantity mainqnt=null;
    // JavaLine 102 <== SourceLine 916
    public RTS_TXT xidentstring=null;
    // JavaLine 104 <== SourceLine 917
    public RTS_TXT attrbuffer=null;
    // Normal Constructor
    public COMMON_attrfile(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        bufmax=(2048-(25));
    }
    // Class Statements
    @Override
    public COMMON_attrfile _STM() {
        // JavaLine 117 <== SourceLine 1293
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 attrfile",1,874,10,875,12,877,15,882,17,883,19,884,21,885,23,886,25,887,27,888,29,889,31,890,33,891,35,892,37,893,39,894,41,895,43,896,45,897,47,898,50,900,52,901,55,902,63,903,68,904,75,905,80,906,82,907,86,908,88,909,90,910,92,911,94,912,96,913,98,914,100,915,102,916,104,917,117,1293,122,1293);
} // End of Class
