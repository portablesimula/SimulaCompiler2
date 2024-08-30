// JavaLine 1 <== SourceLine 787
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_declaration_REGSEPCOMP extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=787, lastLine=809, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_declaration_REGSEPCOMP(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_declaration_REGSEPCOMP _STM() {
        // JavaLine 21 <== SourceLine 788
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).separatecomp=true;
        ;
        // JavaLine 24 <== SourceLine 790
        if(_VALUE(RTS_UTIL._IS(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,CLASS_PARSER_codebuffer.class))) {
            new CLASS_PARSER_codebuffer_termModul(((CLASS_PARSER_codebuffer)(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder)));
        }
        ;
        // JavaLine 29 <== SourceLine 791
        if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
            {
                // JavaLine 32 <== SourceLine 792
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).moduleident=((CLASS_PARSER)(_CUR._SL._SL._SL)).attrfilename=((((((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi==(((char)0)))&((((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo==('I')))))?(((CLASS_PARSER)(_CUR._SL._SL._SL)).predefname):(((RTS_UTIL._TXTREL_EQ(new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi,((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT,new RTS_TXT("simset")))?(((CLASS_PARSER)(_CUR._SL._SL._SL)).simsetname):(((RTS_UTIL._TXTREL_EQ(new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi,((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT,new RTS_TXT("simulation")))?(((CLASS_PARSER)(_CUR._SL._SL._SL)).simulaname):(((CLASS_PARSER)(_CUR._SL._SL._SL)).attrfilename))))));
                ;
                // JavaLine 35 <== SourceLine 797
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).checkcode=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYS")));
                ;
            }
        } else {
            // JavaLine 40 <== SourceLine 798
            {
                // JavaLine 42 <== SourceLine 799
                new CLASS_COMMON_TRC((_CUR._SL._SL._SL),new RTS_TXT("PARSER"),799,CONC(CONC(new RTS_TXT("REGSEPCOMP: giveTextInfo(1,\""),new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi,((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT),new RTS_TXT("\")")));
                ;
                // JavaLine 45 <== SourceLine 800
                RTS_ENVIRONMENT.giveTextInfo(1,new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi,((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT);
                ;
                // JavaLine 48 <== SourceLine 801
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).attrfilename=RTS_ENVIRONMENT.getTextInfo(11);
                ;
                // JavaLine 51 <== SourceLine 802
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).moduleident=RTS_ENVIRONMENT.getTextInfo(14);
                ;
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).checkcode=RTS_ENVIRONMENT.getTextInfo(15);
                ;
                // JavaLine 56 <== SourceLine 803
                if(_VALUE(RTS_UTIL.TRF_EQ(((CLASS_PARSER)(_CUR._SL._SL._SL)).checkcode,null))) {
                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).checkcode=((CLASS_PARSER)(_CUR._SL._SL._SL)).timestamp;
                }
                ;
                // JavaLine 61 <== SourceLine 804
                if(_VALUE(((!(((CLASS_PARSER)(_CUR._SL._SL._SL)).recomp))&(RTS_UTIL._TXTREL_EQ(((CLASS_PARSER)(_CUR._SL._SL._SL)).moduleident,null))))) {
                    {
                        // JavaLine 64 <== SourceLine 805
                        if(_VALUE(((CLASS_PARSER)(_CUR._SL._SL._SL)).GiveNotes)) {
                            new CLASS_ERRMSG_note1((_CUR._SL._SL._SL),397,((CLASS_PARSER)(_CUR._SL._SL._SL)).attrfilename);
                        }
                        ;
                        // JavaLine 69 <== SourceLine 806
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).moduleident=RTS_ENVIRONMENT.copy(copy(((CLASS_PARSER)(_CUR._SL._SL._SL)).attrfilename));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 REGSEPCOMP",1,787,21,788,24,790,29,791,32,792,35,797,40,798,42,799,45,800,48,801,51,802,56,803,61,804,64,805,69,806,80,809);
} // End of Procedure
