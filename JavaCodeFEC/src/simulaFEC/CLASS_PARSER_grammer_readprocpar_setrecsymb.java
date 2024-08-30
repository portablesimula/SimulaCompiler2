// JavaLine 1 <== SourceLine 366
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readprocpar_setrecsymb extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=366, lastLine=388, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_b;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_readprocpar_setrecsymb setPar(Object param) {
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
    public CLASS_PARSER_grammer_readprocpar_setrecsymb(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_readprocpar_setrecsymb(RTS_RTObject _SL,boolean sp_b) {
        super(_SL);
        // Parameter assignment to locals
        this.p_b = sp_b;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readprocpar_setrecsymb _STM() {
        // JavaLine 39 <== SourceLine 370
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)1))),p_b);
        ;
        // JavaLine 42 <== SourceLine 371
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)2))),p_b);
        ;
        // JavaLine 45 <== SourceLine 372
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)3))),p_b);
        ;
        // JavaLine 48 <== SourceLine 373
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)4))),p_b);
        ;
        // JavaLine 51 <== SourceLine 374
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)5))),p_b);
        ;
        // JavaLine 54 <== SourceLine 375
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)6))),p_b);
        ;
        // JavaLine 57 <== SourceLine 376
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)7))),p_b);
        ;
        // JavaLine 60 <== SourceLine 377
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)8))),p_b);
        ;
        // JavaLine 63 <== SourceLine 378
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)10))),p_b);
        ;
        // JavaLine 66 <== SourceLine 379
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)12))),p_b);
        ;
        // JavaLine 69 <== SourceLine 380
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)13))),p_b);
        ;
        // JavaLine 72 <== SourceLine 381
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),p_b);
        ;
        // JavaLine 75 <== SourceLine 382
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('!')),p_b);
        ;
        // JavaLine 78 <== SourceLine 383
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('/')),p_b);
        ;
        // JavaLine 81 <== SourceLine 384
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('N')),p_b);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 setrecsymb",1,366,39,370,42,371,45,372,48,373,51,374,54,375,57,376,60,377,63,378,66,379,69,380,72,381,75,382,78,383,81,384,86,388);
} // End of Procedure
