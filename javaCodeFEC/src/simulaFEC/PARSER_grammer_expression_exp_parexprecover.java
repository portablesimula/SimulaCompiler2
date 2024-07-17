// JavaLine 1 <== SourceLine 1971
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_expression_exp_parexprecover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1971, lastLine=1985, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_expression_exp_parexprecover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_expression_exp_parexprecover _STM() {
        // JavaLine 21 <== SourceLine 1974
        ((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),true);
        ;
        // JavaLine 24 <== SourceLine 1975
        ((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('Q')),true);
        ;
        // JavaLine 27 <== SourceLine 1976
        new PARSER_grammer_search((_CUR._SL._SL._SL));
        ;
        // JavaLine 30 <== SourceLine 1977
        ((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),false);
        ;
        // JavaLine 33 <== SourceLine 1978
        ((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('Q')),false);
        ;
        // JavaLine 36 <== SourceLine 1983
        _GOTO((((((PARSER_grammer)(_CUR._SL._SL._SL)).cs==('N')))?(((PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_PARSER_grammer_expression_exp_Block2107_Block2116_comarecover_0):((((((PARSER_grammer)(_CUR._SL._SL._SL)).cs==('Q')))?(((PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_PARSER_grammer_expression_exp_Block2107_rgparecover_0):(((PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_PARSER_grammer_expression_exp_Block2107_Block2118_rgpaerror_0))))); // GOTO EVALUATED LABEL
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 parexprecover",1,1971,21,1974,24,1975,27,1976,30,1977,33,1978,36,1983,41,1985);
} // End of Procedure
