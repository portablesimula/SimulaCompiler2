// JavaLine 1 <== SourceLine 678
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_outTextEntity extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=678, lastLine=715, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_tag;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 680
    public RTS_TXT literal=null;
    public int xxx=0;
    // JavaLine 14 <== SourceLine 683
    public CHECKER2_semchecker _inspect_683_4628=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER1_codegenerator1_outTextEntity setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_tag=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER1_codegenerator1_outTextEntity(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER1_codegenerator1_outTextEntity(RTS_RTObject _SL,int sp_tag) {
        super(_SL);
        // Parameter assignment to locals
        this.p_tag = sp_tag;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_outTextEntity _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_683_4628=((SCODER1_codegenerator1)(_CUR._SL)).checker_5;
            if(_inspect_683_4628!=null) { // INSPECT _inspect_683_4628
                // JavaLine 48 <== SourceLine 684
                {
                    // JavaLine 50 <== SourceLine 683
                    {
                        // JavaLine 52 <== SourceLine 684
                        literal=new COMMON_nameof((_CUR._SL._SL),((SCODER1)(_CUR._SL._SL)).opihi_6,((SCODER1)(_CUR._SL._SL)).opilo_6)._RESULT;
                        ;
                        xxx=((SCODER1_codegenerator1)(_CUR._SL)).litleng_6=RTS_TXT.length(literal);
                        ;
                        // JavaLine 57 <== SourceLine 685
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),685,new RTS_TXT("CONST"),CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL),p_tag)._RESULT,new RTS_TXT(" RTS.txtent FIXREP ")),RTS_ENVIRONMENT.edit(xxx)));
                        ;
                        // JavaLine 60 <== SourceLine 686
                        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(53);
                        ;
                        new SCODER0_codegenerator0_outtag((_CUR._SL),p_tag);
                        ;
                        // JavaLine 65 <== SourceLine 687
                        ((SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0001>"),new RTS_TXT("\b")));
                        ;
                        ((SCODER1_codegenerator1)(_CUR._SL)).out2byte(xxx);
                        ;
                        // JavaLine 70 <== SourceLine 689
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),689,new RTS_TXT("C\u005fRECORD"),CONC(CONC(new RTS_TXT("RTS.txtent\u005b"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001>"))._RESULT),new RTS_TXT("\u005d")));
                        ;
                        // JavaLine 73 <== SourceLine 690
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),690,new RTS_TXT("   ATTR"),new RTS_TXT("RTS.entity.SL   OADDR ONONE"));
                        ;
                        // JavaLine 76 <== SourceLine 691
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),691,new RTS_TXT("   ATTR"),new RTS_TXT("RTS.entity.SORT C-INT \"12\""));
                        ;
                        // JavaLine 79 <== SourceLine 692
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),692,new RTS_TXT("   ATTR"),new RTS_TXT("RTS.entity.MISC C-INT \"1\""));
                        ;
                        // JavaLine 82 <== SourceLine 693
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),693,new RTS_TXT("   ATTR"),CONC(CONC(new RTS_TXT("RTS.entity.NCHA C-INT \""),RTS_ENVIRONMENT.edit(xxx)),new RTS_TXT("\"")));
                        ;
                        // JavaLine 85 <== SourceLine 695
                        ((SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0001>")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0090")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0019")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0091")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u000212")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0092")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0094")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 88 <== SourceLine 704
                        new SCODER0_codegenerator0_outsint((_CUR._SL),xxx);
                        ;
                        // JavaLine 91 <== SourceLine 707
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),707,new RTS_TXT("   ATTR"),CONC(CONC(new RTS_TXT("RTS.entity.CHA CHAR TEXT "),RTS_ENVIRONMENT.edit(xxx)),new RTS_TXT(" ...")));
                        ;
                        // JavaLine 94 <== SourceLine 708
                        ((SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001?")),new RTS_TXT("\u0000\u0002")),new RTS_TXT("\u000b")));
                        ;
                        // JavaLine 97 <== SourceLine 710
                        ((SCODER1_codegenerator1)(_CUR._SL)).out2byte(xxx);
                        ;
                        ((SCODER1_codegenerator1)(_CUR._SL)).outtext(literal);
                        ;
                        // JavaLine 102 <== SourceLine 712
                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),712,new RTS_TXT("ENDRECORD"));
                        ;
                        // JavaLine 105 <== SourceLine 713
                        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(9);
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 outTextEntity",1,678,11,680,14,683,48,684,50,683,52,684,57,685,60,686,65,687,70,689,73,690,76,691,79,692,82,693,85,695,88,704,91,707,94,708,97,710,102,712,105,713,115,715);
} // End of Procedure
