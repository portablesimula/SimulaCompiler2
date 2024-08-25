// JavaLine 1 <== SourceLine 555
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_swapObuffer extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=555, lastLine=561, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public BUILDER2_normalattrfile_swapObuffer(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_swapObuffer _STM() {
        // JavaLine 21 <== SourceLine 556
        new BUILDER2_normalattrfile_outKey((_CUR._SL),((char)254));
        ;
        // JavaLine 24 <== SourceLine 557
        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((((BUILDER2_normalattrfile)(_CUR._SL)).p/(256))),((BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,0);
        ;
        // JavaLine 27 <== SourceLine 558
        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.mod(((BUILDER2_normalattrfile)(_CUR._SL)).p,256)),((BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,1);
        ;
        // JavaLine 30 <== SourceLine 559
        ((BUILDER2_normalattrfile)(_CUR._SL)).AOF.outtext(RTS_TXT.sub(((BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,1,((BUILDER2_normalattrfile)(_CUR._SL)).p));
        ;
        // JavaLine 33 <== SourceLine 560
        ((BUILDER2_normalattrfile)(_CUR._SL)).p=2;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 swapObuffer",1,555,21,556,24,557,27,558,30,559,33,560,38,561);
} // End of Procedure
