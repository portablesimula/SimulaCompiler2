// JavaLine 1 <== SourceLine 238
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_syntaxerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=238, lastLine=257, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errorno;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 239
    public int c=0;
    public CLASS_PARSER_grammer_statement stmnt=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_syntaxerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_errorno=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_grammer_syntaxerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_syntaxerror(RTS_RTObject _SL,int sp_errorno) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errorno = sp_errorno;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_syntaxerror _STM() {
        // JavaLine 42 <== SourceLine 240
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('X')))) {
            {
                new CLASS_PARSER_grammer_setCurPos((_CUR._SL));
                ;
                // JavaLine 47 <== SourceLine 241
                new CLASS_ERRMSG_parserMessage((_CUR._SL._SL),((CLASS_PARSER_grammer)(_CUR._SL)).currentPos_1,p_errorno,((CLASS_PARSER_grammer)(_CUR._SL)).experrorno_1);
            }
        }
        ;
        // JavaLine 52 <== SourceLine 242
        ((CLASS_PARSER_grammer)(_CUR._SL)).experrorno_1=0;
        ;
        for(c=1;c<=150;c++) {
            // JavaLine 56 <== SourceLine 243
            ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(c),false);
        }
        ;
        // JavaLine 60 <== SourceLine 244
        new CLASS_PARSER_grammer_setbasicrecovery((_CUR._SL));
        ;
        // JavaLine 63 <== SourceLine 245
        stmnt=((CLASS_PARSER_grammer)(_CUR._SL)).first_1;
        ;
        // JavaLine 66 <== SourceLine 246
        while((stmnt!=(null))) {
            {
                // JavaLine 69 <== SourceLine 247
                stmnt.recoversetting_0().CPF();
                ;
                stmnt=stmnt.next;
            }
        }
        ;
        // JavaLine 76 <== SourceLine 248
        new CLASS_PARSER_grammer_search((_CUR._SL));
        ;
        // JavaLine 79 <== SourceLine 249
        while((!(((boolean)(((CLASS_PARSER_grammer)(_CUR._SL)).last_1.recover_0().CPF()._RESULT()))))) {
            {
                // JavaLine 82 <== SourceLine 250
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    // JavaLine 84 <== SourceLine 251
                    new CLASS_SCANNER_W1((_CUR._SL._SL),new RTS_TXT("UNSTACK - cs:"),RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL)).cs));
                }
                ;
                // JavaLine 88 <== SourceLine 252
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=((CLASS_PARSER_grammer)(_CUR._SL)).last_1.caller;
                ;
            }
        }
        ;
        // JavaLine 94 <== SourceLine 253
        ((CLASS_PARSER_grammer)(_CUR._SL)).last_1.next=null;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 syntaxerror",1,238,11,239,42,240,47,241,52,242,56,243,60,244,63,245,66,246,69,247,76,248,79,249,82,250,84,251,88,252,94,253,99,257);
} // End of Procedure
