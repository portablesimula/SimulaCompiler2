// JavaLine 1 <== SourceLine 1319
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_identifier_result extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1319, lastLine=1347, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 1320
    public COMMON_quantity blquant=null;
    // JavaLine 14 <== SourceLine 1321
    public int procblev=0;
    // JavaLine 16 <== SourceLine 1319
    public boolean _RESULT=false;
    // Normal Constructor
    public CHECKER1_semchecker1_identifier_result(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_identifier_result _STM() {
        // JavaLine 29 <== SourceLine 1323
        _RESULT=false;
        ;
        // JavaLine 32 <== SourceLine 1331
        if(_VALUE((((CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==('Z')))) {
            {
                if(_VALUE((((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning!=(null)))) {
                    {
                        // JavaLine 37 <== SourceLine 1332
                        procblev=(RTS_ENVIRONMENT.rank(((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.encl_1.blev)+(1));
                        ;
                        // JavaLine 40 <== SourceLine 1336
                        if(_VALUE(((procblev>(5))&((procblev<=(RTS_ENVIRONMENT.rank(((CHECKER1)(_CUR._SL._SL._SL)).cblev_6))))))) {
                            {
                                // JavaLine 43 <== SourceLine 1337
                                blquant=((CHECKER1)(_CUR._SL._SL._SL)).display.getELEMENT(procblev).declquant;
                                ;
                                // JavaLine 46 <== SourceLine 1340
                                while((blquant.kind_1==(((char)11)))) {
                                    // JavaLine 48 <== SourceLine 1341
                                    blquant=blquant.prefqual_1;
                                }
                                ;
                                // JavaLine 52 <== SourceLine 1342
                                if(_VALUE((blquant.kind_1==(((char)1))))) {
                                    blquant=blquant.prefqual_1;
                                }
                                ;
                                // JavaLine 57 <== SourceLine 1343
                                _RESULT=((((((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.categ_1==(((char)6))))?(((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.match_1):(((CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning))==(blquant));
                                ;
                            }
                        }
                        ;
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 result",1,1319,12,1320,14,1321,16,1319,29,1323,32,1331,37,1332,40,1336,43,1337,46,1340,48,1341,52,1342,57,1343,70,1347);
} // End of Procedure
