// JavaLine 1 <== SourceLine 781
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeIS_Relation extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=781, lastLine=816, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_NAME<Boolean> p_implNone;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODMAIN_codegenerator_doCodeIS_Relation setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_implNone=(RTS_NAME<Boolean>)param; break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODMAIN_codegenerator_doCodeIS_Relation(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeIS_Relation(RTS_RTObject _SL,RTS_NAME<Boolean> sp_implNone) {
        super(_SL);
        // Parameter assignment to locals
        this.p_implNone = sp_implNone;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeIS_Relation _STM() {
        // JavaLine 39 <== SourceLine 786
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((!(p_implNone.get())))?(CONC(CONC(CONC(new RTS_TXT("\u0096"),new RTS_TXT("\u0000\u0093")),new RTS_TXT("Q")),new RTS_TXT("\u0012"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("?")),new RTS_TXT("\u007c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("A")),new RTS_TXT("Q")),new RTS_TXT("\u0012")))));
        ;
        // JavaLine 42 <== SourceLine 797
        p_implNone.put(true);
        ;
        // JavaLine 45 <== SourceLine 798
        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(1)));
        ;
        // JavaLine 48 <== SourceLine 802
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)3))))) {
            {
                // JavaLine 51 <== SourceLine 803
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u005b"),new RTS_TXT("\u007c")));
                ;
                // JavaLine 54 <== SourceLine 804
                new SCODER1_codegenerator1_pushnewjump((_CUR._SL));
                ;
                // JavaLine 57 <== SourceLine 805
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(((SCODMAIN_codegenerator)(_CUR._SL)).curindex_5);
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
            }
        } else {
            // JavaLine 64 <== SourceLine 811
            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)2))))) {
                {
                    // JavaLine 67 <== SourceLine 812
                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                    ;
                    new SCODER0_codegenerator0_pushasd((_CUR._SL));
                    ;
                    // JavaLine 72 <== SourceLine 813
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("?"),new RTS_TXT("y")));
                    ;
                }
            } else {
                // JavaLine 77 <== SourceLine 815
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("v"),new RTS_TXT("y")));
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeIS_Relation",1,781,39,786,42,797,45,798,48,802,51,803,54,804,57,805,64,811,67,812,72,813,77,815,84,816);
} // End of Procedure
