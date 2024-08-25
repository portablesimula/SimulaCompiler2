// JavaLine 1 <== SourceLine 170
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_newTag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=170, lastLine=174, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public int _RESULT=0;
    // Normal Constructor
    public BUILDER1_newTag(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_newTag _STM() {
        // JavaLine 24 <== SourceLine 171
        _RESULT=((BUILDER1)(_CUR._SL)).lastusedtag_6=(((BUILDER1)(_CUR._SL)).lastusedtag_6+(1));
        ;
        // JavaLine 27 <== SourceLine 172
        new COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),172,CONC(CONC(new RTS_TXT("newTag "),RTS_ENVIRONMENT.edit(((BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT("  -- Should be replaced by 'newTTag(ident)'")));
        ;
        // JavaLine 30 <== SourceLine 173
        RTS_ENVIRONMENT.rts_utility(5,0);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 newTag",1,170,24,171,27,172,30,173,35,174);
} // End of Procedure
