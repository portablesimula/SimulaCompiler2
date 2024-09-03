// JavaLine 1 <== SourceLine 224
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_select_PARQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=224, lastLine=232, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_att;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER3_codegenerator3_select_PARQNT setPar(Object param) {
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
    public CLASS_SCODER3_codegenerator3_select_PARQNT(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_select_PARQNT(RTS_RTObject _SL,int sp_att) {
        super(_SL);
        // Parameter assignment to locals
        this.p_att = sp_att;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_select_PARQNT _STM() {
        // JavaLine 39 <== SourceLine 226
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),226,new RTS_TXT("DUP"));
        ;
        // JavaLine 42 <== SourceLine 227
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),227,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.ftag_1+(0)))._RESULT);
        ;
        // JavaLine 45 <== SourceLine 228
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),228,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),p_att)._RESULT);
        ;
        // JavaLine 48 <== SourceLine 229
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("S"),new RTS_TXT("K")));
        ;
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4+(1));
        ;
        // JavaLine 53 <== SourceLine 230
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6.ftag_1+(0)));
        ;
        // JavaLine 56 <== SourceLine 231
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(74);
        ;
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),p_att);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 select_PARQNT",1,224,39,226,42,227,45,228,48,229,53,230,56,231,63,232);
} // End of Procedure
