// JavaLine 1 <== SourceLine 80
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_thunktounspecified extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=80, lastLine=131, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_type;
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 82
    public CLASS_COMMON_quantity oldopq=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER3_codegenerator3_thunktounspecified setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_type=(char)objectValue(param); break;
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER3_codegenerator3_thunktounspecified(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_thunktounspecified(RTS_RTObject _SL,char sp_type,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_type = sp_type;
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_thunktounspecified _STM() {
        // JavaLine 44 <== SourceLine 88
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),88,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006J"))._RESULT);
        ;
        // JavaLine 47 <== SourceLine 89
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),89,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
        ;
        // JavaLine 50 <== SourceLine 90
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),90,new RTS_TXT("ASSPAR"));
        ;
        // JavaLine 53 <== SourceLine 91
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),91,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9)._RESULT));
        ;
        // JavaLine 56 <== SourceLine 92
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006J")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("D")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
        ;
        // JavaLine 59 <== SourceLine 96
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
        ;
        // JavaLine 62 <== SourceLine 97
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),97,new RTS_TXT("ASSPAR"));
        ;
        // JavaLine 65 <== SourceLine 98
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),98,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)))));
        ;
        // JavaLine 68 <== SourceLine 99
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("Q")),new RTS_TXT("\r")));
        ;
        // JavaLine 71 <== SourceLine 101
        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)));
        ;
        // JavaLine 74 <== SourceLine 102
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),102,new RTS_TXT("ASSPAR"));
        ;
        // JavaLine 77 <== SourceLine 103
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),103,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006K"))._RESULT);
        ;
        // JavaLine 80 <== SourceLine 104
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),104,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)))));
        ;
        // JavaLine 83 <== SourceLine 105
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006K")),new RTS_TXT("Q")),new RTS_TXT("\r")));
        ;
        // JavaLine 86 <== SourceLine 108
        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curparno_6-(1)));
        ;
        // JavaLine 89 <== SourceLine 109
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),109,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006Q"))._RESULT);
        ;
        // JavaLine 92 <== SourceLine 110
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),110,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9)._RESULT));
        ;
        // JavaLine 95 <== SourceLine 111
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006Q")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
        ;
        // JavaLine 98 <== SourceLine 113
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
        ;
        // JavaLine 101 <== SourceLine 114
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),114,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006\u00b1"))._RESULT);
        ;
        // JavaLine 104 <== SourceLine 115
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),115,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006\u00b2"))._RESULT);
        ;
        // JavaLine 107 <== SourceLine 116
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),116,new RTS_TXT("ASSPAR"));
        ;
        // JavaLine 110 <== SourceLine 117
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006\u00b1")),new RTS_TXT("F")),new RTS_TXT("\u0006\u00b2")),new RTS_TXT("D")));
        ;
        // JavaLine 113 <== SourceLine 120
        if(_VALUE((p_type==(((char)7))))) {
            {
                // JavaLine 116 <== SourceLine 121
                oldopq=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
                ;
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=p_q;
                ;
                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                ;
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3=oldopq;
                ;
                // JavaLine 125 <== SourceLine 122
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
            }
        } else {
            // JavaLine 129 <== SourceLine 123
            {
                // JavaLine 131 <== SourceLine 124
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),124,new RTS_TXT("PUSHC"),new RTS_TXT("ONONE"));
                ;
                // JavaLine 134 <== SourceLine 125
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")));
                ;
            }
        }
        ;
        // JavaLine 140 <== SourceLine 127
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),127,new RTS_TXT("ASSPAR"));
        ;
        // JavaLine 143 <== SourceLine 128
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),128,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006R"))._RESULT);
        ;
        // JavaLine 146 <== SourceLine 129
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006R")));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 thunktounspecified",1,80,12,82,44,88,47,89,50,90,53,91,56,92,59,96,62,97,65,98,68,99,71,101,74,102,77,103,80,104,83,105,86,108,89,109,92,110,95,111,98,113,101,114,104,115,107,116,110,117,113,120,116,121,125,122,129,123,131,124,134,125,140,127,143,128,146,129,151,131);
} // End of Procedure
