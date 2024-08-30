// JavaLine 1 <== SourceLine 30
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PAS1INIT_main_statements_of_PAS1INIT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=30, lastLine=260, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 73
    final RTS_LABEL _LABEL_CLASS_PAS1INIT_main_statements_of_PAS1INIT_SETem_0=new RTS_LABEL(this,0,1,"SETem"); // Local Label #1=SETem At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 57
    public RTS_Printfile _inspect_57_4511=null;
    // JavaLine 15 <== SourceLine 106
    public CLASS_COMMON_identsymbol _inspect_106_4512=null;
    // JavaLine 17 <== SourceLine 113
    public RTS_Printfile _inspect_113_4513=null;
    // JavaLine 19 <== SourceLine 99
    public CLASS_PARSER_grammer _inspect_99_4514=null;
    // JavaLine 21 <== SourceLine 188
    public CLASS_SCANNER_recognizer _inspect_188_4515=null;
    // JavaLine 23 <== SourceLine 230
    public CLASS_SCANNER_L2Coder _inspect_230_4516=null;
    // JavaLine 25 <== SourceLine 237
    public CLASS_COMMON_brecord _inspect_237_4517=null;
    // JavaLine 27 <== SourceLine 239
    public CLASS_COMMON_quantity _inspect_239_4518=null;
    // Normal Constructor
    public CLASS_PAS1INIT_main_statements_of_PAS1INIT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PAS1INIT_main_statements_of_PAS1INIT _STM() {
        CLASS_PAS1INIT_main_statements_of_PAS1INIT _THIS=(CLASS_PAS1INIT_main_statements_of_PAS1INIT)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 44 <== SourceLine 36
                ((CLASS_PAS1INIT)(_CUR._SL)).L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                ((CLASS_PAS1INIT)(_CUR._SL)).nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 49 <== SourceLine 40
                ((CLASS_PAS1INIT)(_CUR._SL)).recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 52 <== SourceLine 41
                ((CLASS_PAS1INIT)(_CUR._SL)).GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 55 <== SourceLine 43
                ((CLASS_PAS1INIT)(_CUR._SL)).timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 58 <== SourceLine 44
                ((CLASS_PAS1INIT)(_CUR._SL)).maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 61 <== SourceLine 45
                ((CLASS_PAS1INIT)(_CUR._SL)).GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 64 <== SourceLine 46
                ((CLASS_PAS1INIT)(_CUR._SL)).simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 67 <== SourceLine 47
                ((CLASS_PAS1INIT)(_CUR._SL)).simob_descr=(((CLASS_PAS1INIT)(_CUR._SL)).simob_level>(0));
                ;
                // JavaLine 70 <== SourceLine 48
                ((CLASS_PAS1INIT)(_CUR._SL)).simob_entity=(((CLASS_PAS1INIT)(_CUR._SL)).simob_level>=(2));
                ;
                ((CLASS_PAS1INIT)(_CUR._SL)).simob_const=(((CLASS_PAS1INIT)(_CUR._SL)).simob_level>=(3));
                ;
                // JavaLine 75 <== SourceLine 53
                ((CLASS_PAS1INIT)(_CUR._SL)).listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                ((CLASS_PAS1INIT)(_CUR._SL)).listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 80 <== SourceLine 54
                if(_VALUE(RTS_UTIL.TRF_NE(((CLASS_PAS1INIT)(_CUR._SL)).listname_5,null))) {
                    {
                        // JavaLine 83 <== SourceLine 55
                        ((CLASS_PAS1INIT)(_CUR._SL)).t_5=RTS_ENVIRONMENT.copy(copy(((CLASS_PAS1INIT)(_CUR._SL)).listname_5));
                        ;
                        ((CLASS_PAS1INIT)(_CUR._SL)).t_5=RTS_ENVIRONMENT.lowcase(((CLASS_PAS1INIT)(_CUR._SL)).t_5);
                        ;
                        // JavaLine 88 <== SourceLine 56
                        if(_VALUE(RTS_UTIL._TXTREL_EQ(((CLASS_PAS1INIT)(_CUR._SL)).t_5,new RTS_TXT("sysout")))) {
                            ((CLASS_PAS1INIT)(_CUR._SL)).listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 92 <== SourceLine 57
                            {
                                // BEGIN INSPECTION 
                                _inspect_57_4511=new RTS_Printfile(_USR,((CLASS_PAS1INIT)(_CUR._SL)).listname_5)._STM();
                                if(_inspect_57_4511!=null) { // INSPECT _inspect_57_4511  type=ref(PRINTFILE)
                                    // JavaLine 97 <== SourceLine 58
                                    {
                                        // JavaLine 99 <== SourceLine 57
                                        {
                                            // JavaLine 101 <== SourceLine 58
                                            ((CLASS_PAS1INIT)(_CUR._SL)).listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            ((CLASS_PAS1INIT)(_CUR._SL)).t_5=RTS_ENVIRONMENT.blanks(((CLASS_PAS1INIT)(_CUR._SL)).listlength);
                                            ;
                                            // JavaLine 106 <== SourceLine 59
                                            if(_VALUE((!(_inspect_57_4511.open(((CLASS_PAS1INIT)(_CUR._SL)).t_5))))) {
                                                {
                                                    // JavaLine 109 <== SourceLine 60
                                                    ((CLASS_PAS1INIT)(_CUR._SL)).listlength=0;
                                                    ;
                                                    new CLASS_ERRMSG_error1((_CUR._SL),-366,((CLASS_PAS1INIT)(_CUR._SL)).listname_5);
                                                }
                                            } else {
                                                // JavaLine 115 <== SourceLine 61
                                                ((CLASS_PAS1INIT)(_CUR._SL)).listfile=((RTS_Printfile)_inspect_57_4511);
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                    }
                }
                ;
                // JavaLine 128 <== SourceLine 64
                ((CLASS_PAS1INIT)(_CUR._SL)).listingon=(((CLASS_PAS1INIT)(_CUR._SL)).listfile!=(null));
                ;
                // JavaLine 131 <== SourceLine 68
                ((CLASS_PAS1INIT)(_CUR._SL)).t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 134 <== SourceLine 69
                while(RTS_TXT.more(((CLASS_PAS1INIT)(_CUR._SL)).t_5)) {
                    if(_VALUE((RTS_TXT.getchar(((CLASS_PAS1INIT)(_CUR._SL)).t_5)==(':')))) {
                        {
                            // JavaLine 138 <== SourceLine 70
                            if(_VALUE(RTS_TXT.more(((CLASS_PAS1INIT)(_CUR._SL)).t_5))) {
                                ((CLASS_PAS1INIT)(_CUR._SL)).feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(((CLASS_PAS1INIT)(_CUR._SL)).t_5,RTS_TXT.pos(((CLASS_PAS1INIT)(_CUR._SL)).t_5),((RTS_TXT.length(((CLASS_PAS1INIT)(_CUR._SL)).t_5)-(RTS_TXT.pos(((CLASS_PAS1INIT)(_CUR._SL)).t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 143 <== SourceLine 71
                            ((CLASS_PAS1INIT)(_CUR._SL)).t_5=RTS_TXT.sub(((CLASS_PAS1INIT)(_CUR._SL)).t_5,1,(RTS_TXT.pos(((CLASS_PAS1INIT)(_CUR._SL)).t_5)-(2)));
                            ;
                            _GOTO(_LABEL_CLASS_PAS1INIT_main_statements_of_PAS1INIT_SETem_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 152 <== SourceLine 73
                {
                    _SIM_LABEL(1); // DeclaredIn: main_statements_of_PAS1INIT
                    new CLASS_SCANNER_SetSelectors((_CUR._SL),((CLASS_PAS1INIT)(_CUR._SL)).t_5,0);
                }
                ;
                // JavaLine 158 <== SourceLine 74
                while(RTS_TXT.more(((CLASS_PAS1INIT)(_CUR._SL)).feoptions_5)) {
                    new CLASS_COMMON_setopt((_CUR._SL),RTS_TXT.getchar(((CLASS_PAS1INIT)(_CUR._SL)).feoptions_5),'1');
                }
                ;
                // JavaLine 163 <== SourceLine 76
                ((CLASS_PAS1INIT)(_CUR._SL)).termstatus='3';
                ;
                // JavaLine 166 <== SourceLine 77
                ((CLASS_PAS1INIT)(_CUR._SL)).currentpass='1';
                ;
                // JavaLine 169 <== SourceLine 80
                ((CLASS_PAS1INIT)(_CUR._SL)).leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 172 <== SourceLine 81
                ((CLASS_PAS1INIT)(_CUR._SL)).leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 175 <== SourceLine 2
                ((CLASS_PAS1INIT)(_CUR._SL)).TAGTAB=new CLASS_COMMON_TAGTABLE((_CUR._SL))._STM();
                ;
                // JavaLine 178 <== SourceLine 6
                ((CLASS_PAS1INIT)(_CUR._SL)).dummyBox=new CLASS_COMMON_identsymbol((_CUR._SL))._STM();
                ;
                // JavaLine 181 <== SourceLine 8
                ((CLASS_PAS1INIT)(_CUR._SL)).dummyGroup=new CLASS_COMMON_symbolgroup((_CUR._SL))._STM();
                ;
                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=0;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=255;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                    // JavaLine 185 <== SourceLine 9
                    ((CLASS_PAS1INIT)(_CUR._SL)).dummyGroup.val.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).dummyGroup.val.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((CLASS_PAS1INIT)(_CUR._SL)).dummyBox);
                }
                ;
                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=0;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=127;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                    // JavaLine 190 <== SourceLine 10
                    ((CLASS_PAS1INIT)(_CUR._SL)).symtab.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).symtab.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((CLASS_PAS1INIT)(_CUR._SL)).dummyGroup);
                }
                ;
                // JavaLine 194 <== SourceLine 13
                ((CLASS_PAS1INIT)(_CUR._SL)).symtab.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).symtab.index(0),new CLASS_COMMON_symbolgroup((_CUR._SL))._STM());
                ;
                ((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.index(0),((CLASS_PAS1INIT)(_CUR._SL)).dummyBox);
                ;
                // JavaLine 199 <== SourceLine 14
                for(boolean CB_14:new FOR_List(
                new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("boolean")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("character")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("short")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("integer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("real")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("long")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ref")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("text")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" pointer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("value")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("label")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("procedure")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("array")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("no type")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("else")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("end")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eqv")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("external")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("for")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("go")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("goto")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("hidden")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("if")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("imp")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("in")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inner")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inspect")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("do")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("is")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("class")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("begin")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("name")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("new")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("not")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("or")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("otherwise")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("prior")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("delay")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("protected")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("qua")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("reactivate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("at")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("before")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("and")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("step")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("switch")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("activate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("then")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("this")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("to")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("until")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("after")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("virtual")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("when")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("while")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("lt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eq")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("le")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("gt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ne")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ge")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("comment")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("none")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("notext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("true")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("false")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("detach")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("printfile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("infile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ferrid")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ftext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005fpredefmodule")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("match stat")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("c")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("pascal")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)((CLASS_PAS1INIT)(_CUR._SL)).simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("library")); }})
                   )) { if(!CB_14) continue;
                    // JavaLine 280 <== SourceLine 103
                    {
                        ((CLASS_PAS1INIT)(_CUR._SL)).hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(((CLASS_PAS1INIT)(_CUR._SL)).simsymbol));
                        ;
                        // JavaLine 284 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512=new CLASS_COMMON_identsymbol((_CUR._SL))._STM();
                            if(_inspect_106_4512!=null) { // INSPECT _inspect_106_4512  type=ref(IDENTSYMBOL)
                                // JavaLine 289 <== SourceLine 107
                                {
                                    // JavaLine 291 <== SourceLine 106
                                    {
                                        // JavaLine 293 <== SourceLine 107
                                        _inspect_106_4512.symbol=((CLASS_PAS1INIT)(_CUR._SL)).simsymbol;
                                        ;
                                        // JavaLine 296 <== SourceLine 108
                                        _inspect_106_4512.idlo=((CLASS_PAS1INIT)(_CUR._SL)).identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_PAS1INIT)(_CUR._SL)).identlo)+(1)));
                                        ;
                                        // JavaLine 299 <== SourceLine 109
                                        _inspect_106_4512.next=((CLASS_PAS1INIT)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PAS1INIT)(_CUR._SL)).hashlo));
                                        ;
                                        // JavaLine 302 <== SourceLine 110
                                        ((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(((CLASS_PAS1INIT)(_CUR._SL)).identlo)),((CLASS_PAS1INIT)(_CUR._SL)).hashtab.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).hashtab.index(RTS_ENVIRONMENT.rank(((CLASS_PAS1INIT)(_CUR._SL)).hashlo)),((CLASS_COMMON_symbolbox)_inspect_106_4512)));
                                        ;
                                        // JavaLine 305 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512.next!=(null))&&((((CLASS_PAS1INIT)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 307 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513!=null) { // INSPECT _inspect_113_4513  type=ref(PRINTFILE)
                                                    // JavaLine 312 <== SourceLine 114
                                                    {
                                                        // JavaLine 314 <== SourceLine 113
                                                        {
                                                            // JavaLine 316 <== SourceLine 114
                                                            _inspect_113_4513.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),((CLASS_PAS1INIT)(_CUR._SL)).simsymbol),new RTS_TXT(" and ")),_inspect_106_4512.next.symbol));
                                                            ;
                                                            // JavaLine 319 <== SourceLine 116
                                                            _inspect_113_4513.outimage();
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                }
                ;
                // JavaLine 335 <== SourceLine 122
                ((CLASS_PAS1INIT)(_CUR._SL)).i_5=(RTS_ENVIRONMENT.rank(((CLASS_PAS1INIT)(_CUR._SL)).identlo)+(1));
                ;
                // JavaLine 338 <== SourceLine 123
                while((((CLASS_PAS1INIT)(_CUR._SL)).i_5<=(255))) {
                    {
                        // JavaLine 341 <== SourceLine 124
                        ((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).symtab.getELEMENT(0).val.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((CLASS_PAS1INIT)(_CUR._SL)).dummyBox);
                        ;
                        ((CLASS_PAS1INIT)(_CUR._SL)).i_5=(((CLASS_PAS1INIT)(_CUR._SL)).i_5+(1));
                    }
                }
                ;
                // JavaLine 348 <== SourceLine 126
                ((CLASS_PAS1INIT)(_CUR._SL)).consthi=((char)128);
                ;
                // JavaLine 351 <== SourceLine 128
                ((CLASS_PAS1INIT)(_CUR._SL)).simsymbol=new RTS_TXT("0");
                ;
                new CLASS_COMMON_DEFCONST((_CUR._SL));
                ;
                // JavaLine 356 <== SourceLine 130
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 359 <== SourceLine 131
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 362 <== SourceLine 132
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 365 <== SourceLine 133
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 368 <== SourceLine 134
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 371 <== SourceLine 135
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 374 <== SourceLine 136
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 377 <== SourceLine 137
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 380 <== SourceLine 138
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 383 <== SourceLine 139
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 386 <== SourceLine 140
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 389 <== SourceLine 141
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 392 <== SourceLine 142
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 395 <== SourceLine 143
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 398 <== SourceLine 144
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 401 <== SourceLine 145
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 404 <== SourceLine 146
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 407 <== SourceLine 147
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 410 <== SourceLine 148
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 413 <== SourceLine 149
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 416 <== SourceLine 150
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 419 <== SourceLine 151
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 422 <== SourceLine 152
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 425 <== SourceLine 153
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 428 <== SourceLine 154
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 431 <== SourceLine 155
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 434 <== SourceLine 156
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 437 <== SourceLine 157
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 440 <== SourceLine 158
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 443 <== SourceLine 159
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 446 <== SourceLine 160
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 449 <== SourceLine 161
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 452 <== SourceLine 162
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 455 <== SourceLine 163
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 458 <== SourceLine 164
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 461 <== SourceLine 165
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 464 <== SourceLine 166
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 467 <== SourceLine 167
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 470 <== SourceLine 168
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 473 <== SourceLine 169
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 476 <== SourceLine 170
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 479 <== SourceLine 171
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 482 <== SourceLine 172
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 485 <== SourceLine 173
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 488 <== SourceLine 174
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 491 <== SourceLine 175
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 494 <== SourceLine 176
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 497 <== SourceLine 177
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 500 <== SourceLine 178
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 503 <== SourceLine 179
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 506 <== SourceLine 180
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 509 <== SourceLine 181
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 512 <== SourceLine 182
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 515 <== SourceLine 183
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 518 <== SourceLine 184
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 521 <== SourceLine 185
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 524 <== SourceLine 186
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 527 <== SourceLine 187
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 530 <== SourceLine 188
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 533 <== SourceLine 189
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 536 <== SourceLine 190
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 539 <== SourceLine 191
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 542 <== SourceLine 192
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 545 <== SourceLine 193
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 548 <== SourceLine 194
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 551 <== SourceLine 195
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 554 <== SourceLine 196
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 557 <== SourceLine 197
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 560 <== SourceLine 198
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 563 <== SourceLine 199
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 566 <== SourceLine 200
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 569 <== SourceLine 201
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 572 <== SourceLine 202
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 575 <== SourceLine 203
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 578 <== SourceLine 204
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 581 <== SourceLine 205
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 584 <== SourceLine 206
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 587 <== SourceLine 207
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 590 <== SourceLine 208
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 593 <== SourceLine 209
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 596 <== SourceLine 210
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 599 <== SourceLine 211
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 602 <== SourceLine 212
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 605 <== SourceLine 213
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 608 <== SourceLine 214
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 611 <== SourceLine 215
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 614 <== SourceLine 216
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 617 <== SourceLine 217
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 620 <== SourceLine 218
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 623 <== SourceLine 219
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 626 <== SourceLine 220
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 629 <== SourceLine 221
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 632 <== SourceLine 222
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 635 <== SourceLine 223
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 638 <== SourceLine 224
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 641 <== SourceLine 225
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 644 <== SourceLine 226
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 647 <== SourceLine 227
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 650 <== SourceLine 228
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 653 <== SourceLine 229
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 656 <== SourceLine 230
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 659 <== SourceLine 231
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 662 <== SourceLine 232
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 665 <== SourceLine 233
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 668 <== SourceLine 234
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 671 <== SourceLine 235
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 674 <== SourceLine 236
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 677 <== SourceLine 237
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 680 <== SourceLine 238
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 683 <== SourceLine 239
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 686 <== SourceLine 240
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 689 <== SourceLine 241
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 692 <== SourceLine 242
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 695 <== SourceLine 243
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 698 <== SourceLine 244
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 701 <== SourceLine 245
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 704 <== SourceLine 246
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 707 <== SourceLine 247
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 710 <== SourceLine 248
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 713 <== SourceLine 249
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 716 <== SourceLine 250
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 719 <== SourceLine 251
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 722 <== SourceLine 252
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 725 <== SourceLine 253
                    ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 728 <== SourceLine 254
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 731 <== SourceLine 255
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 734 <== SourceLine 256
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 737 <== SourceLine 257
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 740 <== SourceLine 258
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 743 <== SourceLine 259
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 746 <== SourceLine 260
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 749 <== SourceLine 261
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 752 <== SourceLine 262
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 755 <== SourceLine 263
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 758 <== SourceLine 264
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 761 <== SourceLine 265
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 764 <== SourceLine 266
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 767 <== SourceLine 267
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 770 <== SourceLine 268
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 773 <== SourceLine 269
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 776 <== SourceLine 270
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 779 <== SourceLine 271
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 782 <== SourceLine 272
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 785 <== SourceLine 273
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 788 <== SourceLine 274
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 791 <== SourceLine 275
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 794 <== SourceLine 276
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 797 <== SourceLine 277
                ((CLASS_PAS1INIT)(_CUR._SL)).DB.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 800 <== SourceLine 92
                ((CLASS_PAS1INIT)(_CUR._SL)).predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 803 <== SourceLine 94
                ((CLASS_PAS1INIT)(_CUR._SL)).dummygen_2=false;
                ;
                // JavaLine 806 <== SourceLine 99
                {
                    // BEGIN INSPECTION 
                    _inspect_99_4514=((CLASS_PARSER_grammer)new CLASS_PARSER_grammer((_CUR._SL))._START());
                    if(_inspect_99_4514!=null) { // INSPECT _inspect_99_4514  type=ref(GRAMMER)
                        // JavaLine 811 <== SourceLine 100
                        {
                            // JavaLine 813 <== SourceLine 99
                            {
                                // JavaLine 815 <== SourceLine 101
                                ((CLASS_PAS1INIT)(_CUR._SL)).parser=((CLASS_COMMON_component)_inspect_99_4514);
                                ;
                                // JavaLine 818 <== SourceLine 103
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 821 <== SourceLine 104
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 824 <== SourceLine 105
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 827 <== SourceLine 106
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 830 <== SourceLine 107
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 833 <== SourceLine 108
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 836 <== SourceLine 109
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 839 <== SourceLine 110
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 842 <== SourceLine 111
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 845 <== SourceLine 112
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 848 <== SourceLine 113
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 851 <== SourceLine 114
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 854 <== SourceLine 115
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 857 <== SourceLine 116
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 860 <== SourceLine 121
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 863 <== SourceLine 122
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 866 <== SourceLine 123
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 869 <== SourceLine 124
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 872 <== SourceLine 125
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 875 <== SourceLine 126
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 878 <== SourceLine 127
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 881 <== SourceLine 128
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 884 <== SourceLine 129
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 887 <== SourceLine 130
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 890 <== SourceLine 131
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 893 <== SourceLine 132
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 896 <== SourceLine 133
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 899 <== SourceLine 134
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 902 <== SourceLine 135
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 905 <== SourceLine 136
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 908 <== SourceLine 137
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 911 <== SourceLine 138
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 914 <== SourceLine 139
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 917 <== SourceLine 140
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 920 <== SourceLine 141
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 923 <== SourceLine 150
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 926 <== SourceLine 151
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 929 <== SourceLine 152
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 932 <== SourceLine 153
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 935 <== SourceLine 154
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 938 <== SourceLine 155
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 941 <== SourceLine 156
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 944 <== SourceLine 160
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 947 <== SourceLine 161
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 950 <== SourceLine 162
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 953 <== SourceLine 163
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 956 <== SourceLine 164
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 959 <== SourceLine 165
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 962 <== SourceLine 166
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 965 <== SourceLine 167
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 968 <== SourceLine 171
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 971 <== SourceLine 172
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 974 <== SourceLine 173
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 977 <== SourceLine 174
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 980 <== SourceLine 175
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 983 <== SourceLine 176
                                _inspect_99_4514.symboltype.putELEMENT(_inspect_99_4514.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 991 <== SourceLine 182
                call(((CLASS_PAS1INIT)(_CUR._SL)).parser,182);
                ;
                // JavaLine 994 <== SourceLine 188
                {
                    // BEGIN INSPECTION 
                    _inspect_188_4515=((CLASS_SCANNER_recognizer)new CLASS_SCANNER_recognizer((_CUR._SL))._START());
                    if(_inspect_188_4515!=null) { // INSPECT _inspect_188_4515  type=ref(RECOGNIZER)
                        // JavaLine 999 <== SourceLine 189
                        {
                            // JavaLine 1001 <== SourceLine 188
                            {
                                // JavaLine 1003 <== SourceLine 189
                                ((CLASS_PAS1INIT)(_CUR._SL)).lexScanner_2=((CLASS_SCANNER_recognizer)(((CLASS_PAS1INIT)(_CUR._SL)).scanner=((CLASS_COMMON_component)_inspect_188_4515)));
                                ;
                                _inspect_188_4515.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=35;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=255;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1009 <== SourceLine 191
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)7));
                                }
                                ;
                                // JavaLine 1013 <== SourceLine 193
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(0),_inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(127),((char)9)));
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=1;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=7;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1017 <== SourceLine 195
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)8));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=14;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=31;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1022 <== SourceLine 196
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)8));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=8;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=13;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1027 <== SourceLine 198
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)6));
                                }
                                ;
                                // JavaLine 1031 <== SourceLine 199
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1034 <== SourceLine 201
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1037 <== SourceLine 203
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(34),((char)4));
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=38;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=47;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1041 <== SourceLine 204
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)4));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=58;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=62;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1046 <== SourceLine 205
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)4));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=48;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=57;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1051 <== SourceLine 207
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)2));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=65;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=90;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1056 <== SourceLine 209
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)0));
                                }
                                ;
                                for(((CLASS_PAS1INIT)(_CUR._SL)).i_5=97;((CLASS_PAS1INIT)(_CUR._SL)).i_5<=122;((CLASS_PAS1INIT)(_CUR._SL)).i_5++) {
                                    // JavaLine 1061 <== SourceLine 210
                                    _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(((CLASS_PAS1INIT)(_CUR._SL)).i_5),((char)0));
                                }
                                ;
                                // JavaLine 1065 <== SourceLine 212
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(67),_inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1068 <== SourceLine 214
                                _inspect_188_4515.InputClass.putELEMENT(_inspect_188_4515.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1071 <== SourceLine 216
                                _inspect_188_4515.IdScanner_1=((CLASS_SCANNER_recognizer_identifierScanner)new CLASS_SCANNER_recognizer_identifierScanner(_inspect_188_4515)._START());
                                ;
                                // JavaLine 1074 <== SourceLine 217
                                _inspect_188_4515.unsignedInt_1=((CLASS_SCANNER_recognizer_unsignedInteger)new CLASS_SCANNER_recognizer_unsignedInteger(_inspect_188_4515)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1082 <== SourceLine 223
                ((CLASS_PAS1INIT)(_CUR._SL)).signiflength=255;
                ;
                // JavaLine 1085 <== SourceLine 224
                ((CLASS_PAS1INIT)(_CUR._SL)).cursource_2=((CLASS_SCANNER_SourceElt)new CLASS_SCANNER_SourceElt((_CUR._SL),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1088 <== SourceLine 225
                ((CLASS_PAS1INIT)(_CUR._SL)).incrlnr_2=true;
                ;
                // JavaLine 1091 <== SourceLine 229
                if(_VALUE(RTS_UTIL.TRF_EQ(((CLASS_PAS1INIT)(_CUR._SL)).L2NAME,null))) {
                    new CLASS_ERRMSG_openerror((_CUR._SL),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1096 <== SourceLine 230
                {
                    // BEGIN INSPECTION 
                    _inspect_230_4516=((CLASS_SCANNER_L2Coder)new CLASS_SCANNER_L2Coder((_CUR._SL),((CLASS_PAS1INIT)(_CUR._SL)).L2NAME)._START());
                    if(_inspect_230_4516!=null) { // INSPECT _inspect_230_4516  type=ref(L2CODER)
                        // JavaLine 1101 <== SourceLine 231
                        {
                            // JavaLine 1103 <== SourceLine 230
                            {
                                // JavaLine 1105 <== SourceLine 231
                                ((CLASS_PAS1INIT)(_CUR._SL)).P1coder_2=((CLASS_SCANNER_L2Coder)_inspect_230_4516);
                                ;
                                ((CLASS_PAS1INIT)(_CUR._SL)).coder=((CLASS_PAS1INIT)(_CUR._SL)).P1coder_2;
                                ;
                                // JavaLine 1110 <== SourceLine 235
                                ((CLASS_PAS1INIT)(_CUR._SL)).brctab.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).brctab.index(0),new CLASS_COMMON_brctab2((_CUR._SL))._STM());
                                ;
                                // JavaLine 1113 <== SourceLine 236
                                if(_VALUE((!((((CLASS_PAS1INIT)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1116 <== SourceLine 237
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_237_4517=new CLASS_COMMON_brecord((_CUR._SL))._STM();
                                            if(_inspect_237_4517!=null) { // INSPECT _inspect_237_4517  type=ref(BRECORD)
                                                // JavaLine 1121 <== SourceLine 238
                                                {
                                                    // JavaLine 1123 <== SourceLine 237
                                                    {
                                                        // JavaLine 1125 <== SourceLine 238
                                                        _inspect_237_4517.kind=((char)13);
                                                        ;
                                                        ((CLASS_PAS1INIT)(_CUR._SL)).brctab.getELEMENT(0).val.putELEMENT(((CLASS_PAS1INIT)(_CUR._SL)).brctab.getELEMENT(0).val.index(0),((CLASS_COMMON_brecord)_inspect_237_4517));
                                                        ;
                                                        // JavaLine 1130 <== SourceLine 239
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_239_4518=new CLASS_COMMON_quantity((_CUR._SL))._STM();
                                                            if(_inspect_239_4518!=null) { // INSPECT _inspect_239_4518  type=ref(QUANTITY)
                                                                // JavaLine 1135 <== SourceLine 240
                                                                {
                                                                    // JavaLine 1137 <== SourceLine 239
                                                                    {
                                                                        // JavaLine 1139 <== SourceLine 240
                                                                        _inspect_237_4517.fpar=((CLASS_COMMON_quantity)_inspect_239_4518);
                                                                        ;
                                                                        // JavaLine 1142 <== SourceLine 241
                                                                        _inspect_239_4518.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1145 <== SourceLine 242
                                                                        _inspect_239_4518.type_1=((char)14);
                                                                        ;
                                                                        _inspect_239_4518.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1150 <== SourceLine 243
                                                                        _inspect_239_4518.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1153 <== SourceLine 247
                                                                        _inspect_239_4518.symb_1=new CLASS_COMMON_boxof((_CUR._SL),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1156 <== SourceLine 248
                                                                        new CLASS_COMMON_QTRC((_CUR._SL),new RTS_TXT("PAS1INIT"),248,new RTS_TXT("NEW Quantity: "),_inspect_237_4517.fpar);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1172 <== SourceLine 255
                                ((CLASS_PAS1INIT)(_CUR._SL)).nextbllo=((char)1);
                                ;
                                // JavaLine 1175 <== SourceLine 256
                                new CLASS_SCANNER_L2Coder_brecinit(_inspect_230_4516,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PAS1INIT.sim","5 main_statements_of_PAS1INIT",1,30,10,73,13,57,15,106,17,113,19,99,21,188,23,230,25,237,27,239,44,36,49,40,52,41,55,43,58,44,61,45,64,46,67,47,70,48,75,53,80,54,83,55,88,56,92,57,97,58,99,57,101,58,106,59,109,60,115,61,128,64,131,68,134,69,138,70,143,71,152,73,158,74,163,76,166,77,169,80,172,81,175,2,178,6,181,8,185,9,190,10,194,13,199,14,280,103,284,106,289,107,291,106,293,107,296,108,299,109,302,110,305,112,307,113,312,114,314,113,316,114,319,116,335,122,338,123,341,124,348,126,351,128,356,130,359,131,362,132,365,133,368,134,371,135,374,136,377,137,380,138,383,139,386,140,389,141,392,142,395,143,398,144,401,145,404,146,407,147,410,148,413,149,416,150,419,151,422,152,425,153,428,154,431,155,434,156,437,157,440,158,443,159,446,160,449,161,452,162,455,163,458,164,461,165,464,166,467,167,470,168,473,169,476,170,479,171,482,172,485,173,488,174,491,175,494,176,497,177,500,178,503,179,506,180,509,181,512,182,515,183,518,184,521,185,524,186,527,187,530,188,533,189,536,190,539,191,542,192,545,193,548,194,551,195,554,196,557,197,560,198,563,199,566,200,569,201,572,202,575,203,578,204,581,205,584,206,587,207,590,208,593,209,596,210,599,211,602,212,605,213,608,214,611,215,614,216,617,217,620,218,623,219,626,220,629,221,632,222,635,223,638,224,641,225,644,226,647,227,650,228,653,229,656,230,659,231,662,232,665,233,668,234,671,235,674,236,677,237,680,238,683,239,686,240,689,241,692,242,695,243,698,244,701,245,704,246,707,247,710,248,713,249,716,250,719,251,722,252,725,253,728,254,731,255,734,256,737,257,740,258,743,259,746,260,749,261,752,262,755,263,758,264,761,265,764,266,767,267,770,268,773,269,776,270,779,271,782,272,785,273,788,274,791,275,794,276,797,277,800,92,803,94,806,99,811,100,813,99,815,101,818,103,821,104,824,105,827,106,830,107,833,108,836,109,839,110,842,111,845,112,848,113,851,114,854,115,857,116,860,121,863,122,866,123,869,124,872,125,875,126,878,127,881,128,884,129,887,130,890,131,893,132,896,133,899,134,902,135,905,136,908,137,911,138,914,139,917,140,920,141,923,150,926,151,929,152,932,153,935,154,938,155,941,156,944,160,947,161,950,162,953,163,956,164,959,165,962,166,965,167,968,171,971,172,974,173,977,174,980,175,983,176,991,182,994,188,999,189,1001,188,1003,189,1009,191,1013,193,1017,195,1022,196,1027,198,1031,199,1034,201,1037,203,1041,204,1046,205,1051,207,1056,209,1061,210,1065,212,1068,214,1071,216,1074,217,1082,223,1085,224,1088,225,1091,229,1096,230,1101,231,1103,230,1105,231,1110,235,1113,236,1116,237,1121,238,1123,237,1125,238,1130,239,1135,240,1137,239,1139,240,1142,241,1145,242,1150,243,1153,247,1156,248,1172,255,1175,256,1192,260);
} // End of Procedure
