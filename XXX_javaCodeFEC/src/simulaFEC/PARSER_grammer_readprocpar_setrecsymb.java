// JavaLine 1 <== SourceLine 365
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readprocpar_setrecsymb extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=365, lastLine=387, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_b;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readprocpar_setrecsymb setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_b=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_readprocpar_setrecsymb(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readprocpar_setrecsymb(RTS_RTObject _SL,boolean sp_b) {
        super(_SL);
        // Parameter assignment to locals
        this.p_b = sp_b;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readprocpar_setrecsymb _STM() {
        // JavaLine 39 <== SourceLine 369
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)1))),p_b);
        ;
        // JavaLine 42 <== SourceLine 370
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)2))),p_b);
        ;
        // JavaLine 45 <== SourceLine 371
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)3))),p_b);
        ;
        // JavaLine 48 <== SourceLine 372
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)4))),p_b);
        ;
        // JavaLine 51 <== SourceLine 373
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)5))),p_b);
        ;
        // JavaLine 54 <== SourceLine 374
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)6))),p_b);
        ;
        // JavaLine 57 <== SourceLine 375
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)7))),p_b);
        ;
        // JavaLine 60 <== SourceLine 376
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)8))),p_b);
        ;
        // JavaLine 63 <== SourceLine 377
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)10))),p_b);
        ;
        // JavaLine 66 <== SourceLine 378
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)12))),p_b);
        ;
        // JavaLine 69 <== SourceLine 379
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)13))),p_b);
        ;
        // JavaLine 72 <== SourceLine 380
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),p_b);
        ;
        // JavaLine 75 <== SourceLine 381
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('!')),p_b);
        ;
        // JavaLine 78 <== SourceLine 382
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('/')),p_b);
        ;
        // JavaLine 81 <== SourceLine 383
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),p_b);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 setrecsymb",1,365,39,369,42,370,45,371,48,372,51,373,54,374,57,375,60,376,63,377,66,378,69,379,72,380,75,381,78,382,81,383,86,387);
} // End of Procedure
