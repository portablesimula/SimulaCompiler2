// JavaLine 1 <== SourceLine 1109
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_update_PARQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1109, lastLine=1130, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_att;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1110
    public int basetag=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_update_PARQNT setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_att=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER2_codegenerator2_update_PARQNT(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_update_PARQNT(RTS_RTObject _SL,int sp_att) {
        super(_SL);
        // Parameter assignment to locals
        this.p_att = sp_att;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_update_PARQNT _STM() {
        // JavaLine 41 <== SourceLine 1111
        basetag=((CLASS_SCODER2_codegenerator2)(_CUR._SL)).curpar_6.ftag_1;
        ;
        // JavaLine 44 <== SourceLine 1112
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),1112,new RTS_TXT("DUP"));
        ;
        // JavaLine 47 <== SourceLine 1113
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1113,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(basetag+(0)))._RESULT);
        ;
        // JavaLine 50 <== SourceLine 1114
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1114,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001b"))._RESULT);
        ;
        // JavaLine 53 <== SourceLine 1115
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1115,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(basetag+(1)))._RESULT));
        ;
        // JavaLine 56 <== SourceLine 1116
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),1116,new RTS_TXT("ASSIGN"));
        ;
        // JavaLine 59 <== SourceLine 1117
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),1117,new RTS_TXT("DUP"));
        ;
        // JavaLine 62 <== SourceLine 1118
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1118,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(basetag+(0)))._RESULT);
        ;
        // JavaLine 65 <== SourceLine 1119
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1119,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(basetag+(p_att)))._RESULT);
        ;
        // JavaLine 68 <== SourceLine 1120
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("K")));
        ;
        // JavaLine 71 <== SourceLine 1121
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(basetag+(0)));
        ;
        // JavaLine 74 <== SourceLine 1122
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("J"),new RTS_TXT("\u0001b")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
        ;
        // JavaLine 77 <== SourceLine 1124
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(basetag+(1)));
        ;
        // JavaLine 80 <== SourceLine 1125
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("o"),new RTS_TXT("S")),new RTS_TXT("K")));
        ;
        // JavaLine 83 <== SourceLine 1127
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(basetag+(0)));
        ;
        // JavaLine 86 <== SourceLine 1128
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(74);
        ;
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),p_att);
        ;
        // JavaLine 91 <== SourceLine 1129
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).asd_4=(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).asd_4+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 update_PARQNT",1,1109,11,1110,41,1111,44,1112,47,1113,50,1114,53,1115,56,1116,59,1117,62,1118,65,1119,68,1120,71,1121,74,1122,77,1124,80,1125,83,1127,86,1128,91,1129,96,1130);
} // End of Procedure
