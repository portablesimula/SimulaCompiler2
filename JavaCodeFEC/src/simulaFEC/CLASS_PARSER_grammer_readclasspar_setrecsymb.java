// JavaLine 1 <== SourceLine 447
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_readclasspar_setrecsymb extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=447, lastLine=469, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_b;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_readclasspar_setrecsymb setPar(Object param) {
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
    public CLASS_PARSER_grammer_readclasspar_setrecsymb(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_readclasspar_setrecsymb(RTS_RTObject _SL,boolean sp_b) {
        super(_SL);
        // Parameter assignment to locals
        this.p_b = sp_b;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_readclasspar_setrecsymb _STM() {
        // JavaLine 39 <== SourceLine 449
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)1))),p_b);
        ;
        // JavaLine 42 <== SourceLine 450
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)2))),p_b);
        ;
        // JavaLine 45 <== SourceLine 451
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)3))),p_b);
        ;
        // JavaLine 48 <== SourceLine 452
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)4))),p_b);
        ;
        // JavaLine 51 <== SourceLine 453
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)5))),p_b);
        ;
        // JavaLine 54 <== SourceLine 454
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)6))),p_b);
        ;
        // JavaLine 57 <== SourceLine 455
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)7))),p_b);
        ;
        // JavaLine 60 <== SourceLine 456
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)8))),p_b);
        ;
        // JavaLine 63 <== SourceLine 457
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)12))),p_b);
        ;
        // JavaLine 66 <== SourceLine 458
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)13))),p_b);
        ;
        // JavaLine 69 <== SourceLine 459
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),p_b);
        ;
        // JavaLine 72 <== SourceLine 460
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)22))),p_b);
        ;
        // JavaLine 75 <== SourceLine 461
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('(')),p_b);
        ;
        // JavaLine 78 <== SourceLine 462
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('/')),p_b);
        ;
        // JavaLine 81 <== SourceLine 463
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('3')),p_b);
        ;
        // JavaLine 84 <== SourceLine 464
        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('6')),p_b);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 setrecsymb",1,447,39,449,42,450,45,451,48,452,51,453,54,454,57,455,60,456,63,457,66,458,69,459,72,460,75,461,78,462,81,463,84,464,89,469);
} // End of Procedure
