// JavaLine 1 <== SourceLine 58
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_dump_opd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=58, lastLine=72, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_opdhi;
    public char p_opdlo;
    public char p_optx;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 59
    public RTS_TXT t=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_dump_opd setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_opdhi=(char)objectValue(param); break;
                case 2: p_opdlo=(char)objectValue(param); break;
                case 1: p_optx=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_dump_opd(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public SCANNER_dump_opd(RTS_RTObject _SL,char sp_opdhi,char sp_opdlo,char sp_optx) {
        super(_SL);
        // Parameter assignment to locals
        this.p_opdhi = sp_opdhi;
        this.p_opdlo = sp_opdlo;
        this.p_optx = sp_optx;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_dump_opd _STM() {
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" OPD="));
        ;
        // JavaLine 49 <== SourceLine 60
        if(_VALUE((p_optx!=(((char)0))))) {
            {
                // JavaLine 52 <== SourceLine 61
                RTS_BASICIO.sysout().outtext(((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(p_optx)));
                ;
                RTS_BASICIO.sysout().outchar(((char)32));
                ;
                // JavaLine 57 <== SourceLine 62
                if(_VALUE((p_optx==(((char)2))))) {
                    {
                        // JavaLine 60 <== SourceLine 63
                        if(_VALUE(((p_opdlo>(((char)32)))&((p_opdlo<(((char)127))))))) {
                            RTS_BASICIO.sysout().outchar(p_opdlo);
                        } else {
                            // JavaLine 64 <== SourceLine 64
                            {
                                RTS_BASICIO.sysout().outchar('!');
                                ;
                                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(p_opdlo),0);
                                ;
                                // JavaLine 70 <== SourceLine 65
                                RTS_BASICIO.sysout().outchar('!');
                            }
                        }
                    }
                } else {
                    // JavaLine 76 <== SourceLine 66
                    {
                        t=new COMMON_nameof((_CUR._SL),p_opdhi,p_opdlo)._RESULT;
                        ;
                        // JavaLine 80 <== SourceLine 67
                        if(_VALUE((RTS_TXT.length(t)<=(13)))) {
                            RTS_BASICIO.sysout().outtext(t);
                        } else {
                            // JavaLine 84 <== SourceLine 68
                            {
                                RTS_BASICIO.sysout().outtext(RTS_TXT.sub(t,1,12));
                                ;
                                RTS_BASICIO.sysout().outchar('+');
                            }
                        }
                        ;
                    }
                }
                ;
            }
        } else {
            // JavaLine 97 <== SourceLine 70
            {
                // JavaLine 99 <== SourceLine 71
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(p_opdhi),0);
                ;
                RTS_BASICIO.sysout().outchar(',');
                ;
                RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(p_opdlo),0);
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 dump_opd",1,58,13,59,49,60,52,61,57,62,60,63,64,64,70,65,76,66,80,67,84,68,97,70,99,71,110,72);
} // End of Procedure
