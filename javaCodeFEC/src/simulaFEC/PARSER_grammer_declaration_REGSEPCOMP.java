// JavaLine 1 <== SourceLine 786
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_declaration_REGSEPCOMP extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=786, lastLine=808, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_declaration_REGSEPCOMP(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_declaration_REGSEPCOMP _STM() {
        // JavaLine 21 <== SourceLine 787
        ((PARSER)(_CUR._SL._SL._SL)).separatecomp=true;
        ;
        // JavaLine 24 <== SourceLine 789
        if(_VALUE(_IS(((PARSER)(_CUR._SL._SL._SL)).coder,PARSER_codebuffer.class))) {
            new PARSER_codebuffer_termModul(((PARSER_codebuffer)(((PARSER)(_CUR._SL._SL._SL)).coder)));
        }
        ;
        // JavaLine 29 <== SourceLine 790
        if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
            {
                // JavaLine 32 <== SourceLine 791
                ((PARSER)(_CUR._SL._SL._SL)).moduleident=((PARSER)(_CUR._SL._SL._SL)).attrfilename=((((((PARSER)(_CUR._SL._SL._SL)).opdhi==(((char)0)))&((((PARSER)(_CUR._SL._SL._SL)).opdlo==('I')))))?(((PARSER)(_CUR._SL._SL._SL)).predefname):(((_TXTREL_EQ(new COMMON_nameof((_CUR._SL._SL._SL),((PARSER)(_CUR._SL._SL._SL)).opdhi,((PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT,new RTS_TXT("simset")))?(((PARSER)(_CUR._SL._SL._SL)).simsetname):(((_TXTREL_EQ(new COMMON_nameof((_CUR._SL._SL._SL),((PARSER)(_CUR._SL._SL._SL)).opdhi,((PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT,new RTS_TXT("simulation")))?(((PARSER)(_CUR._SL._SL._SL)).simulaname):(((PARSER)(_CUR._SL._SL._SL)).attrfilename))))));
                ;
                // JavaLine 35 <== SourceLine 796
                ((PARSER)(_CUR._SL._SL._SL)).checkcode=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYS")));
                ;
            }
        } else {
            // JavaLine 40 <== SourceLine 797
            {
                // JavaLine 42 <== SourceLine 798
                new COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("PARSER"),798,CONC(CONC(new RTS_TXT("REGSEPCOMP: giveTextInfo(1,\""),new COMMON_nameof((_CUR._SL._SL._SL),((PARSER)(_CUR._SL._SL._SL)).opdhi,((PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT),new RTS_TXT("\")")));
                ;
                // JavaLine 45 <== SourceLine 799
                RTS_ENVIRONMENT.giveTextInfo(1,new COMMON_nameof((_CUR._SL._SL._SL),((PARSER)(_CUR._SL._SL._SL)).opdhi,((PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT);
                ;
                // JavaLine 48 <== SourceLine 800
                ((PARSER)(_CUR._SL._SL._SL)).attrfilename=RTS_ENVIRONMENT.getTextInfo(11);
                ;
                // JavaLine 51 <== SourceLine 801
                ((PARSER)(_CUR._SL._SL._SL)).moduleident=RTS_ENVIRONMENT.getTextInfo(14);
                ;
                ((PARSER)(_CUR._SL._SL._SL)).checkcode=RTS_ENVIRONMENT.getTextInfo(15);
                ;
                // JavaLine 56 <== SourceLine 802
                if(_VALUE(TRF_EQ(((PARSER)(_CUR._SL._SL._SL)).checkcode,null))) {
                    ((PARSER)(_CUR._SL._SL._SL)).checkcode=((PARSER)(_CUR._SL._SL._SL)).timestamp;
                }
                ;
                // JavaLine 61 <== SourceLine 803
                if(_VALUE(((!(((PARSER)(_CUR._SL._SL._SL)).recomp))&(_TXTREL_EQ(((PARSER)(_CUR._SL._SL._SL)).moduleident,null))))) {
                    {
                        // JavaLine 64 <== SourceLine 804
                        if(_VALUE(((PARSER)(_CUR._SL._SL._SL)).GiveNotes)) {
                            new ERRMSG_note1((_CUR._SL._SL._SL),397,((PARSER)(_CUR._SL._SL._SL)).attrfilename);
                        }
                        ;
                        // JavaLine 69 <== SourceLine 805
                        ((PARSER)(_CUR._SL._SL._SL)).moduleident=RTS_ENVIRONMENT.copy(copy(((PARSER)(_CUR._SL._SL._SL)).attrfilename));
                        ;
                    }
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 REGSEPCOMP",1,786,21,787,24,789,29,790,32,791,35,796,40,797,42,798,45,799,48,800,51,801,56,802,61,803,64,804,69,805,80,808);
} // End of Procedure
