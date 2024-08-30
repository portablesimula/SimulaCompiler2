// JavaLine 1 <== SourceLine 15
package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst66_InputFile extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=15, lastLine=66, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public simtst66_InputFile p_neste;
    public RTS_TXT p_navn;
    public int p_a;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 21
    public RTS_Infile fil=null;
    // JavaLine 16 <== SourceLine 22
    public int lnr=0;
    // JavaLine 18 <== SourceLine 23
    public RTS_TEXT_ARRAY linjer=null;
    // Normal Constructor
    public simtst66_InputFile(RTS_RTObject staticLink,simtst66_InputFile sp_neste,RTS_TXT sp_navn,int sp_a) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_neste = sp_neste;
        this.p_navn = sp_navn;
        this.p_a = sp_a;
        BBLK(); // Iff no prefix
        // Declaration Code
        // JavaLine 29 <== SourceLine 23
        linjer=new RTS_TEXT_ARRAY(new RTS_BOUNDS(1,200));
    }
    // Class Statements
    @Override
    public simtst66_InputFile _STM() {
        // JavaLine 35 <== SourceLine 37
        fil=new RTS_Infile(_USR,p_navn)._STM();
        ;
        // JavaLine 38 <== SourceLine 38
        if(_VALUE((!(fil.open(RTS_ENVIRONMENT.blanks(100)))))) {
            // JavaLine 40 <== SourceLine 39
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT("The file does not exist,"));
                ;
                // JavaLine 44 <== SourceLine 40
                RTS_BASICIO.sysout().outtext(new RTS_TXT("or cannot be opened as infile."));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 49 <== SourceLine 42
                new SimulaTest_err((_CUR._SL),CONC(new RTS_TXT("Can't open infile: "),p_navn));
                ;
            }
        }
        ;
        // JavaLine 55 <== SourceLine 45
        new simtst66_InputFile_trace((_CUR),new RTS_TXT("RETT F\u00d8R F\u00d8RSTE DETACH I INFILE: "));
        ;
        // JavaLine 58 <== SourceLine 46
        detach(46);
        ;
        // JavaLine 61 <== SourceLine 48
        new simtst66_InputFile_trace((_CUR),new RTS_TXT("RETT F\u00d8R F\u00d8RSTE INIMAGE I INFILE: "));
        ;
        // JavaLine 64 <== SourceLine 49
        fil.inimage();
        ;
        // JavaLine 67 <== SourceLine 50
        new simtst66_InputFile_trace((_CUR),CONC(CONC(new RTS_TXT("RETT ETTER F\u00d8RSTE INIMAGE("),RTS_ENVIRONMENT.copy(copy(fil.image))),new RTS_TXT(") I INFILE: ")));
        ;
        // JavaLine 70 <== SourceLine 52
        while((!(fil.endfile()))) {
            // JavaLine 72 <== SourceLine 53
            {
                lnr=(lnr+(1));
                while(((!(fil.endfile()))&((lnr<(201))))) {
                    // JavaLine 76 <== SourceLine 55
                    {
                        // JavaLine 78 <== SourceLine 56
                        linjer.putELEMENT(linjer.index(lnr),RTS_ENVIRONMENT.copy(copy(fil.image)));
                        ;
                        // JavaLine 81 <== SourceLine 57
                        fil.inimage();
                        ;
                        // JavaLine 84 <== SourceLine 58
                        new simtst66_InputFile_trace((_CUR),CONC(CONC(new RTS_TXT("RETT ETTER NESTE INIMAGE("),RTS_ENVIRONMENT.copy(copy(fil.image))),new RTS_TXT(") I INFILE: ")));
                        ;
                    }
                    lnr=(lnr+(1));
                }
                ;
                // JavaLine 91 <== SourceLine 61
                resume(p_neste,61);
            }
        }
        ;
        // JavaLine 96 <== SourceLine 64
        while((!(p_neste.fil.endfile()))) {
            resume(p_neste,64);
        }
        ;
        // JavaLine 101 <== SourceLine 66
        // BEGIN InputFile INNER PART
        // ENDOF InputFile INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst66.sim","8 InputFile",1,15,14,21,16,22,18,23,29,23,35,37,38,38,40,39,44,40,49,42,55,45,58,46,61,48,64,49,67,50,70,52,72,53,76,55,78,56,81,57,84,58,91,61,96,64,101,66,106,66);
} // End of Class
