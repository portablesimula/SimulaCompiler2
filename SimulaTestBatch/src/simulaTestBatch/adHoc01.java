// JavaLine 1 <== SourceLine 6
package simulaTestBatch;
// Simula-2.0 Compiled at Sun Feb 04 12:43:04 CET 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class adHoc01 extends adHoc00 {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=6, lastLine=13, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 8
    public RTS_Printfile _inspect_8_0_1=null;
    // Normal Constructor
    public adHoc01(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BPRG("adHoc01");
        // Declaration Code
    }
    // Class Statements
    @Override
    public adHoc01 _STM() {
        RTS_COMMON._LINE("PrefixedBlock adHoc01",2); // JavaLine 22 <== SourceLine 2
        RTS_BASICIO.sysout().outtext(new RTS_TXT("Hello World"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_COMMON._LINE("PrefixedBlock adHoc01",3); // JavaLine 27 <== SourceLine 3
        // BEGIN INNER PART
        // BEGIN INNER PART
        // ENDOF INNER PART
        RTS_COMMON._LINE("PrefixedBlock adHoc01",8); // JavaLine 31 <== SourceLine 8
        {
            // BEGIN INSPECTION 
            _inspect_8_0_1=RTS_BASICIO.sysout();
            if(_inspect_8_0_1!=null) { // INSPECT _inspect_8_0
                {
                    {
                        RTS_COMMON._LINE("PrefixedBlock adHoc01",9); // JavaLine 38 <== SourceLine 9
                        _ASGTXT(_inspect_8_0_1.image,null);
                        ;
                    }
                }
            }
        } // END INSPECTION
        // ENDOF INNER PART
        ;
        RTS_COMMON._LINE("PrefixedBlock adHoc01",4); // JavaLine 47 <== SourceLine 4
        RTS_BASICIO.sysout().outtext(new RTS_TXT("After INNER"));
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RTS_COMMON.setRuntimeOptions(args);
        new adHoc01(_CTX)._STM();
    } // End of main
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc01.sim","PrefixedBlock adHoc01",1,6,10,8,22,2,27,3,31,8,38,9,47,4,60,13);
} // End of Class
