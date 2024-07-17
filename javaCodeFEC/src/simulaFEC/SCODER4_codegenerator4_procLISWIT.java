// JavaLine 1 <== SourceLine 47
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER4_codegenerator4_procLISWIT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=47, lastLine=73, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 50
    public COMMON_quantity _inspect_49_4656=null;
    // Normal Constructor
    public SCODER4_codegenerator4_procLISWIT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER4_codegenerator4_procLISWIT _STM() {
        // JavaLine 23 <== SourceLine 49
        {
            // BEGIN INSPECTION 
            _inspect_49_4656=((SCODER4_codegenerator4)(_CUR._SL)).opq_3;
            if(_inspect_49_4656!=null) { // INSPECT _inspect_49_4656
                // JavaLine 28 <== SourceLine 50
                {
                    {
                        // JavaLine 31 <== SourceLine 52
                        _inspect_49_4656.plev_1=RTS_ENVIRONMENT.rank(((SCODER4)(_CUR._SL._SL)).opilo_6);
                        ;
                        // JavaLine 34 <== SourceLine 54
                        ((SCODER4)(_CUR._SL._SL)).inswitchdecl_6=true;
                        ;
                        // JavaLine 37 <== SourceLine 55
                        ((SCODER4)(_CUR._SL._SL)).notinconditional_6=true;
                        ;
                        // JavaLine 40 <== SourceLine 56
                        new SCODER1_codegenerator1_pushcall((_CUR._SL));
                        ;
                        // JavaLine 43 <== SourceLine 57
                        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(53);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_49_4656.ftag_1+(0)));
                        ;
                        // JavaLine 48 <== SourceLine 58
                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000\u0086"),new RTS_TXT("\b")));
                        ;
                        ((SCODER4_codegenerator4)(_CUR._SL)).out2byte((_inspect_49_4656.dim_1+(1)));
                        ;
                        // JavaLine 53 <== SourceLine 59
                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000\u0086")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0087")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 56 <== SourceLine 61
                        new SCODER0_codegenerator0_outinteger((_CUR._SL),_inspect_49_4656.dim_1);
                        ;
                        // JavaLine 59 <== SourceLine 62
                        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0088")),new RTS_TXT("\u0000\u0089")),new RTS_TXT("\n")),new RTS_TXT("\u0000\u0089")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008a")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u001b")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008b")),new RTS_TXT("\u0000\u0007")),new RTS_TXT("\u0018")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008c")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008d")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008e")),new RTS_TXT("\u0000\u0001")),new RTS_TXT("\u001d")),new RTS_TXT("\t")));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER4.sim","5 procLISWIT",1,47,10,50,23,49,28,50,31,52,34,54,37,55,40,56,43,57,48,58,53,59,56,61,59,62,68,73);
} // End of Procedure
