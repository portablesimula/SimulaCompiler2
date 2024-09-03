// JavaLine 1 <== SourceLine 204
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_COMMONerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=204, lastLine=235, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_EXC_NUMBER;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_COMMONerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_EXC_NUMBER=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_COMMONerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_COMMONerror(RTS_RTObject _SL,int sp_EXC_NUMBER) {
        super(_SL);
        // Parameter assignment to locals
        this.p_EXC_NUMBER = sp_EXC_NUMBER;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_COMMONerror _STM() {
        // JavaLine 39 <== SourceLine 206
        if(_VALUE((p_EXC_NUMBER>(0)))) {
            new CLASS_ERRMSG_fatal0((_CUR._SL),p_EXC_NUMBER);
        } else {
            // JavaLine 43 <== SourceLine 207
            {
                p_EXC_NUMBER=(-(p_EXC_NUMBER));
                ;
                // JavaLine 47 <== SourceLine 208
                if(_VALUE((p_EXC_NUMBER==(106)))) {
                    {
                        // JavaLine 50 <== SourceLine 210
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** NO MORE DISK or FILE SPACE ***"));
                        ;
                    }
                } else {
                    // JavaLine 55 <== SourceLine 212
                    {
                        // JavaLine 57 <== SourceLine 213
                        if(_VALUE((p_EXC_NUMBER==(11)))) {
                            {
                                // JavaLine 60 <== SourceLine 214
                                RTS_BASICIO.sysout().outtext(new RTS_TXT("*** COMPILATION KILLED"));
                                ;
                            }
                        } else {
                            // JavaLine 65 <== SourceLine 216
                            {
                                // JavaLine 67 <== SourceLine 217
                                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).numerrfound==(0)))) {
                                    {
                                        // JavaLine 70 <== SourceLine 218
                                        RTS_BASICIO.sysout().outtext(new RTS_TXT("*** INTERNAL ERROR (RTS error #"));
                                        ;
                                        // JavaLine 73 <== SourceLine 219
                                        RTS_BASICIO.sysout().outint(p_EXC_NUMBER,0);
                                        ;
                                        RTS_BASICIO.sysout().outtext(new RTS_TXT(")"));
                                        ;
                                    }
                                } else {
                                    // JavaLine 80 <== SourceLine 221
                                    RTS_BASICIO.sysout().outtext(new RTS_TXT("*** Compiler cannot recover, ABORT"));
                                }
                                ;
                                // JavaLine 84 <== SourceLine 222
                                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).linenr>(0)))) {
                                    {
                                        // JavaLine 87 <== SourceLine 223
                                        RTS_BASICIO.sysout().outtext(new RTS_TXT(" at source line "));
                                        ;
                                        RTS_BASICIO.sysout().outint(((CLASS_ERRMSG)(_CUR._SL)).linenr,0);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 95 <== SourceLine 225
                                RTS_BASICIO.sysout().outtext((((((CLASS_ERRMSG)(_CUR._SL)).currentpass==('1')))?(new RTS_TXT(" (Pass1) ***")):(new RTS_TXT(" (Pass2) ***"))));
                                ;
                            }
                        }
                        ;
                        // JavaLine 101 <== SourceLine 228
                        if(_VALUE(((((CLASS_ERRMSG)(_CUR._SL)).listfile!=(null))&&((((CLASS_ERRMSG)(_CUR._SL)).listfile!=(RTS_BASICIO.sysout())))))) {
                            {
                                // JavaLine 104 <== SourceLine 229
                                ((CLASS_ERRMSG)(_CUR._SL)).listfile.outtext(RTS_TXT.strip(RTS_BASICIO.sysout().image));
                                ;
                                ((CLASS_ERRMSG)(_CUR._SL)).listfile.outimage();
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 115 <== SourceLine 232
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 118 <== SourceLine 233
                RTS_ENVIRONMENT.rts_utility(3,0);
                ;
                // JavaLine 121 <== SourceLine 234
                ((CLASS_ERRMSG)(_CUR._SL)).ENDCOMP_0().CPF();
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 COMMONerror",1,204,39,206,43,207,47,208,50,210,55,212,57,213,60,214,65,216,67,217,70,218,73,219,80,221,84,222,87,223,95,225,101,228,104,229,115,232,118,233,121,234,128,235);
} // End of Procedure
