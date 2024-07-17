// JavaLine 1 <== SourceLine 728
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeIN_Relation extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=728, lastLine=778, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_NAME<Boolean> p_implNone;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODMAIN_codegenerator_doCodeIN_Relation setPar(Object param) {
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
    public SCODMAIN_codegenerator_doCodeIN_Relation(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeIN_Relation(RTS_RTObject _SL,RTS_NAME<Boolean> sp_implNone) {
        super(_SL);
        // Parameter assignment to locals
        this.p_implNone = sp_implNone;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeIN_Relation _STM() {
        // JavaLine 39 <== SourceLine 730
        ((SCODMAIN_codegenerator)(_CUR._SL)).iii_11=(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.plev_1-(1));
        ;
        // JavaLine 42 <== SourceLine 732
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((!(p_implNone.get())))?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0096"),new RTS_TXT("\u0000\u0093")),new RTS_TXT("S")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u005f")),new RTS_TXT("Q")),new RTS_TXT("\r"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("?")),new RTS_TXT("\u007c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("S")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u005f")),new RTS_TXT("Q")),new RTS_TXT("\r")))));
        ;
        // JavaLine 45 <== SourceLine 745
        new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
        ;
        // JavaLine 48 <== SourceLine 746
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("?"),new RTS_TXT("{")),new RTS_TXT("K")),new RTS_TXT("\u0000d")),new RTS_TXT("Q")),new RTS_TXT("\r")));
            ;
            // JavaLine 51 <== SourceLine 749
            new SCODER0_codegenerator0_outsint((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).iii_11);
            ;
            // JavaLine 54 <== SourceLine 750
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((!(p_implNone.get())))?(CONC(CONC(CONC(new RTS_TXT("\u0097"),new RTS_TXT("A")),new RTS_TXT("Q")),new RTS_TXT("\u0012"))):(CONC(CONC(CONC(CONC(new RTS_TXT("\u0097"),new RTS_TXT("A")),new RTS_TXT("A")),new RTS_TXT("Q")),new RTS_TXT("\u0012")))));
            ;
            // JavaLine 57 <== SourceLine 760
            p_implNone.put(true);
            ;
            // JavaLine 60 <== SourceLine 761
            new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(1)));
            ;
            // JavaLine 63 <== SourceLine 765
            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)3))))) {
                {
                    // JavaLine 66 <== SourceLine 766
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u005b"),new RTS_TXT("\u007c")));
                    ;
                    // JavaLine 69 <== SourceLine 767
                    new SCODER1_codegenerator1_pushnewjump((_CUR._SL));
                    ;
                    // JavaLine 72 <== SourceLine 768
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(((SCODMAIN_codegenerator)(_CUR._SL)).curindex_5);
                    ;
                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                    ;
                }
            } else {
                // JavaLine 79 <== SourceLine 773
                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opilo_6==(((char)2))))) {
                    {
                        // JavaLine 82 <== SourceLine 774
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                        ;
                        new SCODER0_codegenerator0_pushasd((_CUR._SL));
                        ;
                        // JavaLine 87 <== SourceLine 775
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("?"),new RTS_TXT("y")));
                        ;
                    }
                } else {
                    // JavaLine 92 <== SourceLine 777
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("v"),new RTS_TXT("y")));
                }
            }
            ;
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeIN_Relation",1,728,39,730,42,732,45,745,48,746,51,749,54,750,57,760,60,761,63,765,66,766,69,767,72,768,79,773,82,774,87,775,92,777,99,778);
    } // End of Procedure
