// JavaLine 1 <== SourceLine 665
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_quantity_ident extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=665, lastLine=669, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Normal Constructor
    public CLASS_COMMON_quantity_ident(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_quantity_ident _STM() {
        // JavaLine 24 <== SourceLine 666
        _RESULT=RTS_ENVIRONMENT.copy(copy(((((((CLASS_COMMON_quantity)(_CUR._SL)).symb_1==(null))||(RTS_UTIL.TRF_EQ(((CLASS_COMMON_quantity)(_CUR._SL)).symb_1.symbol,null))))?(CONC(CONC(CONC(new CLASS_COMMON_K_code((_CUR._SL._SL),((CLASS_COMMON_quantity)(_CUR._SL)).kind_1)._RESULT,new RTS_TXT("\u005bline:")),RTS_ENVIRONMENT.edit(((CLASS_COMMON_quantity)(_CUR._SL)).line_1)),new RTS_TXT("\u005d"))):(((CLASS_COMMON_quantity)(_CUR._SL)).symb_1.symbol))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 ident",1,665,24,666,29,669);
} // End of Procedure
