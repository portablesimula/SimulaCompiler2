// JavaLine 1 <== SourceLine 50
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCODER3_codegenerator3_thunk extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=0, firstLine=50, lastLine=78, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 51
    public CLASS_SCODER3_codegenerator3_thunk prev=null;
    public int tlabel=0;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_thunk(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_SCODER3_codegenerator3_thunk _STM() {
        // JavaLine 23 <== SourceLine 67
        prev=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9;
        ;
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9=((CLASS_SCODER3_codegenerator3_thunk)(_CUR));
        ;
        // JavaLine 28 <== SourceLine 69
        new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("Thunk"));
        // JavaLine 30 <== SourceLine 70
        tlabel=((CLASS_SCODER3)(_CUR._SL._SL)).lastusedtag_6;
        ;
        // JavaLine 33 <== SourceLine 71
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),71,new RTS_TXT("BSEG"));
        ;
        // JavaLine 36 <== SourceLine 72
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),72,new RTS_TXT("LABEL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3)(_CUR._SL._SL)).lastusedtag_6)._RESULT);
        ;
        // JavaLine 39 <== SourceLine 73
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT(";"),new RTS_TXT("0")));
        ;
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3)(_CUR._SL._SL)).lastusedtag_6);
        ;
        // JavaLine 44 <== SourceLine 74
        new CLASS_SCODER0_codegenerator0_pushasd((_CUR._SL));
        ;
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=0;
        ;
        // JavaLine 49 <== SourceLine 75
        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklev_9==(0)))) {
            ((CLASS_SCODER3)(_CUR._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCODER3)(_CUR._SL._SL)).crtblev_6)+(1)));
        }
        ;
        // JavaLine 54 <== SourceLine 76
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklev_9=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklev_9+(1));
        ;
        // JavaLine 57 <== SourceLine 78
        // BEGIN thunk INNER PART
        // ENDOF thunk INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","9 thunk",1,50,10,51,23,67,28,69,30,70,33,71,36,72,39,73,44,74,49,75,54,76,57,78,62,78);
} // End of Class
