// JavaLine 1 <== SourceLine 1972
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_expression_exp_parexprecover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1972, lastLine=1986, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_expression_exp_parexprecover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_expression_exp_parexprecover _STM() {
        // JavaLine 21 <== SourceLine 1975
        ((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),true);
        ;
        // JavaLine 24 <== SourceLine 1976
        ((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('Q')),true);
        ;
        // JavaLine 27 <== SourceLine 1977
        new CLASS_PARSER_grammer_search((_CUR._SL._SL._SL));
        ;
        // JavaLine 30 <== SourceLine 1978
        ((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),false);
        ;
        // JavaLine 33 <== SourceLine 1979
        ((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('Q')),false);
        ;
        // JavaLine 36 <== SourceLine 1984
        _GOTO((((((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).cs==('N')))?(((CLASS_PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_Block2117_comarecover_0):((((((CLASS_PARSER_grammer)(_CUR._SL._SL._SL)).cs==('Q')))?(((CLASS_PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_rgparecover_0):(((CLASS_PARSER_grammer_expression_exp)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_Block2119_rgpaerror_0))))); // GOTO EVALUATED LABEL
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 parexprecover",1,1972,21,1975,24,1976,27,1977,30,1978,33,1979,36,1984,41,1986);
} // End of Procedure
