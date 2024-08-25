// JavaLine 1 <== SourceLine 74
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=74, lastLine=82, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_who;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_dump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_who=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_dump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_dump(RTS_RTObject _SL,RTS_TXT sp_who) {
        super(_SL);
        // Parameter assignment to locals
        this.p_who = sp_who;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_dump _STM() {
        // JavaLine 39 <== SourceLine 75
        if(_VALUE((RTS_BASICIO.sysout().pos()>(1)))) {
            RTS_BASICIO.sysout().outimage();
        }
        ;
        RTS_BASICIO.sysout().outtext(p_who);
        ;
        // JavaLine 46 <== SourceLine 76
        if(_VALUE((((SCANNER)(_CUR._SL)).optx!=(((char)0))))) {
            {
                // JavaLine 49 <== SourceLine 77
                new SCANNER_dump_opd((_CUR._SL),((SCANNER)(_CUR._SL)).opdhi,((SCANNER)(_CUR._SL)).opdlo,((SCANNER)(_CUR._SL)).optx);
                ;
                // JavaLine 52 <== SourceLine 78
                if(_VALUE((((SCANNER)(_CUR._SL)).lexScanner_2.opdline_1!=(((SCANNER)(_CUR._SL)).linenr)))) {
                    {
                        // JavaLine 55 <== SourceLine 79
                        RTS_BASICIO.sysout().outtext(new RTS_TXT(" (l."));
                        ;
                        RTS_BASICIO.sysout().outint(((SCANNER)(_CUR._SL)).lexScanner_2.opdline_1,5);
                        ;
                        RTS_BASICIO.sysout().outchar(')');
                        ;
                    }
                }
            }
        }
        ;
        // JavaLine 67 <== SourceLine 81
        new SCANNER_dump_opt((_CUR._SL),((SCANNER)(_CUR._SL)).opt);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 dump",1,74,39,75,46,76,49,77,52,78,55,79,67,81,74,82);
} // End of Procedure
