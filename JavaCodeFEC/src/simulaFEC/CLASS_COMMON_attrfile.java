// JavaLine 1 <== SourceLine 875
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_attrfile extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=875, lastLine=1294, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 876
    public final char layoutindex=(char)(((char)2));
    // JavaLine 12 <== SourceLine 878
    public final int bufsize=(int)(2048);
    public final int bufmax;
    // JavaLine 15 <== SourceLine 883
    public final char longSwap=(char)(((char)255));
    // JavaLine 17 <== SourceLine 884
    public final char bufSwap=(char)(((char)254));
    // JavaLine 19 <== SourceLine 885
    public final char longText=(char)(((char)253));
    // JavaLine 21 <== SourceLine 886
    public final char mainKey=(char)(((char)252));
    // JavaLine 23 <== SourceLine 887
    public final char begList=(char)(((char)251));
    // JavaLine 25 <== SourceLine 888
    public final char endlist=(char)(((char)250));
    // JavaLine 27 <== SourceLine 889
    public final char protMark=(char)(((char)249));
    // JavaLine 29 <== SourceLine 890
    public final char hidMark=(char)(((char)248));
    // JavaLine 31 <== SourceLine 891
    public final char nestMark=(char)(((char)247));
    // JavaLine 33 <== SourceLine 892
    public final char xMark=(char)(((char)246));
    // JavaLine 35 <== SourceLine 893
    public final char yMark=(char)(((char)245));
    // JavaLine 37 <== SourceLine 894
    public final char specMark=(char)(((char)244));
    // JavaLine 39 <== SourceLine 895
    public final char overMark=(char)(((char)243));
    // JavaLine 41 <== SourceLine 896
    public final char dimMark=(char)(((char)242));
    // JavaLine 43 <== SourceLine 897
    public final char forcMark=(char)(((char)241));
    // JavaLine 45 <== SourceLine 898
    public final char thisMark=(char)(((char)240));
    // JavaLine 47 <== SourceLine 899
    public final char lowKey=(char)(((char)240));
    public final char hikey=(char)(((char)255));
    // JavaLine 50 <== SourceLine 901
    public boolean sysattrfile=false;
    // JavaLine 52 <== SourceLine 902
    public boolean xthisused=false;
    public boolean xhascode=false;
    // JavaLine 55 <== SourceLine 903
    public char xprotect=0;
    public char xtype=0;
    public char xkind=0;
    public char xcateg=0;
    public char xspecial=0;
    public char xclf=0;
    public char xlongindic=0;
    // JavaLine 63 <== SourceLine 904
    public char xinrtag=0;
    public char xconnests=0;
    public char xprefqhi=0;
    public char xprefqlo=0;
    // JavaLine 68 <== SourceLine 905
    public char xarrhi=0;
    public char xarrlo=0;
    public char xcheckhi=0;
    public char xchecklo=0;
    public char attrckhi=0;
    public char attrcklo=0;
    // JavaLine 75 <== SourceLine 906
    public char xmodulhi=0;
    public char xmodullo=0;
    public char attrmodhi=0;
    public char attrmodlo=0;
    // JavaLine 80 <== SourceLine 907
    public char key=0;
    // JavaLine 82 <== SourceLine 908
    public int xdim=0;
    public int xlanguage=0;
    public int xextident=0;
    // JavaLine 86 <== SourceLine 909
    public int xtagnum=0;
    // JavaLine 88 <== SourceLine 910
    public int xftag=0;
    // JavaLine 90 <== SourceLine 911
    public int p=0;
    // JavaLine 92 <== SourceLine 912
    public RTS_Inbytefile CURF=null;
    // JavaLine 94 <== SourceLine 913
    public RTS_Outbytefile AOF=null;
    // JavaLine 96 <== SourceLine 914
    public CLASS_COMMON_idpack xhidlist=null;
    // JavaLine 98 <== SourceLine 915
    public CLASS_COMMON_symbolbox xident=null;
    // JavaLine 100 <== SourceLine 916
    public CLASS_COMMON_quantity mainqnt=null;
    // JavaLine 102 <== SourceLine 917
    public RTS_TXT xidentstring=null;
    // JavaLine 104 <== SourceLine 918
    public RTS_TXT attrbuffer=null;
    // Normal Constructor
    public CLASS_COMMON_attrfile(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        bufmax=(2048-(25));
    }
    // Class Statements
    @Override
    public CLASS_COMMON_attrfile _STM() {
        // JavaLine 117 <== SourceLine 1294
        // BEGIN attrfile INNER PART
        // ENDOF attrfile INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","8 attrfile",1,875,10,876,12,878,15,883,17,884,19,885,21,886,23,887,25,888,27,889,29,890,31,891,33,892,35,893,37,894,39,895,41,896,43,897,45,898,47,899,50,901,52,902,55,903,63,904,68,905,75,906,80,907,82,908,86,909,88,910,90,911,92,912,94,913,96,914,98,915,100,916,102,917,104,918,117,1294,122,1294);
} // End of Class
