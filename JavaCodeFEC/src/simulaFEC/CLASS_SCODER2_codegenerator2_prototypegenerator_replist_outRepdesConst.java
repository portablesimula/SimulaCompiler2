// JavaLine 1 <== SourceLine 422
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=422, lastLine=437, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst _STM() {
        // JavaLine 39 <== SourceLine 424
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000m")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000n")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
        ;
        // JavaLine 42 <== SourceLine 427
        if(_VALUE(((p_q.descr_1==(null))||((p_q.descr_1.line1<=(0)))))) {
            // JavaLine 44 <== SourceLine 428
            new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL._SL),((char)13),428);
        }
        ;
        // JavaLine 48 <== SourceLine 429
        new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL._SL._SL),(p_q.descr_1.line1-(1)));
        ;
        // JavaLine 51 <== SourceLine 430
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000o")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
        ;
        // JavaLine 54 <== SourceLine 432
        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL._SL._SL),RTS_ENVIRONMENT.rank(p_q.type_1));
        ;
        // JavaLine 57 <== SourceLine 433
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000p")),new RTS_TXT("\u0000\u0007")),new RTS_TXT("\u0011")));
        ;
        // JavaLine 60 <== SourceLine 435
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL._SL._SL),(p_q.ftag_1+(0)));
        ;
        // JavaLine 63 <== SourceLine 436
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL._SL)).outbyte(9);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 outRepdesConst",1,422,39,424,42,427,44,428,48,429,51,430,54,432,57,433,60,435,63,436,68,437);
} // End of Procedure
