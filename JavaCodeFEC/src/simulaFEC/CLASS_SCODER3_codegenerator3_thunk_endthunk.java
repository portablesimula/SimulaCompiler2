// JavaLine 1 <== SourceLine 52
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_thunk_endthunk extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=52, lastLine=65, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_thunk_endthunk(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_thunk_endthunk _STM() {
        // JavaLine 21 <== SourceLine 53
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER3"),53,new RTS_TXT("PRECALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0005\u00a2"))._RESULT);
        ;
        // JavaLine 24 <== SourceLine 54
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER3"),54,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0005\u00a3"))._RESULT);
        ;
        // JavaLine 27 <== SourceLine 55
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER3"),55,new RTS_TXT("ESEG"),new RTS_TXT("============================= thunk.endthunk"));
        ;
        // JavaLine 30 <== SourceLine 56
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("C"),new RTS_TXT("\u0005\u00a2")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00a3")),new RTS_TXT("<")));
        ;
        // JavaLine 33 <== SourceLine 59
        new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL._SL));
        ;
        // JavaLine 36 <== SourceLine 60
        new CLASS_SCODER0_codegenerator0_popasd((_CUR._SL._SL));
        ;
        // JavaLine 39 <== SourceLine 61
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).thunklev_9=(((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).thunklev_9-(1));
        ;
        // JavaLine 42 <== SourceLine 62
        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).thunklev_9==(0)))) {
            ((CLASS_SCODER3)(_CUR._SL._SL._SL)).crtblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCODER3)(_CUR._SL._SL._SL)).crtblev_6)-(1)));
        }
        ;
        // JavaLine 47 <== SourceLine 63
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).thunklabel_9=((CLASS_SCODER3_codegenerator3_thunk)(_CUR._SL)).tlabel;
        ;
        // JavaLine 50 <== SourceLine 64
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL._SL)).lastThunk_9=((CLASS_SCODER3_codegenerator3_thunk)(_CUR._SL)).prev;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 endthunk",1,52,21,53,24,54,27,55,30,56,33,59,36,60,39,61,42,62,47,63,50,64,55,65);
} // End of Procedure
