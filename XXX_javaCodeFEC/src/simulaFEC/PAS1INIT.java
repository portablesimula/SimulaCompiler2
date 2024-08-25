// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:25 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PAS1INIT extends PARSER {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=5, firstLine=3, lastLine=257, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 70
    final RTS_LABEL _LABEL_PAS1INIT_SETem_5=new RTS_LABEL(this,5,1,"SETem"); // Local Label #1=SETem At PrefixLevel 5
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 28
    public int i_5=0;
    public char cs_5=0;
    public RTS_TXT t_5=null;
    public RTS_TXT listname_5=null;
    public RTS_TXT feoptions_5=null;
    // JavaLine 19 <== SourceLine 54
    public RTS_Printfile _inspect_54_4511_5=null;
    // JavaLine 21 <== SourceLine 106
    public COMMON_identsymbol _inspect_106_4512_5=null;
    // JavaLine 23 <== SourceLine 113
    public RTS_Printfile _inspect_113_4513_5=null;
    // JavaLine 25 <== SourceLine 96
    public PARSER_grammer _inspect_96_4514_5=null;
    // JavaLine 27 <== SourceLine 185
    public SCANNER_recognizer _inspect_185_4515_5=null;
    // JavaLine 29 <== SourceLine 227
    public SCANNER_L2Coder _inspect_227_4516_5=null;
    // JavaLine 31 <== SourceLine 234
    public COMMON_brecord _inspect_234_4517_5=null;
    // JavaLine 33 <== SourceLine 236
    public COMMON_quantity _inspect_236_4518_5=null;
    // Normal Constructor
    public PAS1INIT(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PAS1INIT _STM() {
        PAS1INIT _THIS=(PAS1INIT)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 48 <== SourceLine 1322
                // BEGIN INNER PART
                // JavaLine 50 <== SourceLine 998
                // BEGIN INNER PART
                // JavaLine 52 <== SourceLine 2395
                // BEGIN INNER PART
                // JavaLine 54 <== SourceLine 89
                // BEGIN INNER PART
                // JavaLine 56 <== SourceLine 2697
                // BEGIN INNER PART
                // JavaLine 58 <== SourceLine 33
                L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 63 <== SourceLine 37
                recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 66 <== SourceLine 38
                GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 69 <== SourceLine 40
                timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 72 <== SourceLine 41
                maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 75 <== SourceLine 42
                GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 78 <== SourceLine 43
                simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 81 <== SourceLine 44
                simob_descr=(simob_level>(0));
                ;
                // JavaLine 84 <== SourceLine 45
                simob_entity=(simob_level>=(2));
                ;
                simob_const=(simob_level>=(3));
                ;
                // JavaLine 89 <== SourceLine 50
                listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 94 <== SourceLine 51
                if(_VALUE(TRF_NE(listname_5,null))) {
                    {
                        // JavaLine 97 <== SourceLine 52
                        t_5=RTS_ENVIRONMENT.copy(copy(listname_5));
                        ;
                        t_5=RTS_ENVIRONMENT.lowcase(t_5);
                        ;
                        // JavaLine 102 <== SourceLine 53
                        if(_VALUE(_TXTREL_EQ(t_5,new RTS_TXT("sysout")))) {
                            listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 106 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4511_5=new RTS_Printfile(_CTX,listname_5)._STM();
                                if(_inspect_54_4511_5!=null) { // INSPECT _inspect_54_4511_5
                                    // JavaLine 111 <== SourceLine 55
                                    {
                                        // JavaLine 113 <== SourceLine 54
                                        {
                                            // JavaLine 115 <== SourceLine 55
                                            listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            t_5=RTS_ENVIRONMENT.blanks(listlength);
                                            ;
                                            // JavaLine 120 <== SourceLine 56
                                            if(_VALUE((!(_inspect_54_4511_5.open(t_5))))) {
                                                {
                                                    // JavaLine 123 <== SourceLine 57
                                                    listlength=0;
                                                    ;
                                                    new ERRMSG_error1((_CUR),-366,listname_5);
                                                }
                                            } else {
                                                // JavaLine 129 <== SourceLine 58
                                                listfile=((RTS_Printfile)_inspect_54_4511_5);
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
                // JavaLine 142 <== SourceLine 61
                listingon=(listfile!=(null));
                ;
                // JavaLine 145 <== SourceLine 65
                t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 148 <== SourceLine 66
                while(RTS_TXT.more(t_5)) {
                    if(_VALUE((RTS_TXT.getchar(t_5)==(':')))) {
                        {
                            // JavaLine 152 <== SourceLine 67
                            if(_VALUE(RTS_TXT.more(t_5))) {
                                feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(t_5,RTS_TXT.pos(t_5),((RTS_TXT.length(t_5)-(RTS_TXT.pos(t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 157 <== SourceLine 68
                            t_5=RTS_TXT.sub(t_5,1,(RTS_TXT.pos(t_5)-(2)));
                            ;
                            _GOTO(_LABEL_PAS1INIT_SETem_5); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 166 <== SourceLine 70
                {
                    _SIM_LABEL(1); // DeclaredIn: PAS1INIT
                    new SCANNER_SetSelectors((_CUR),t_5,0);
                }
                ;
                // JavaLine 172 <== SourceLine 71
                while(RTS_TXT.more(feoptions_5)) {
                    new COMMON_setopt((_CUR),RTS_TXT.getchar(feoptions_5),'1');
                }
                ;
                // JavaLine 177 <== SourceLine 73
                termstatus='3';
                ;
                // JavaLine 180 <== SourceLine 74
                currentpass='1';
                ;
                // JavaLine 183 <== SourceLine 77
                leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 186 <== SourceLine 78
                leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 189 <== SourceLine 2
                TAGTAB=new COMMON_TAGTABLE((_CUR))._STM();
                ;
                // JavaLine 192 <== SourceLine 6
                dummyBox=new COMMON_identsymbol((_CUR))._STM();
                ;
                // JavaLine 195 <== SourceLine 8
                dummyGroup=new COMMON_symbolgroup((_CUR))._STM();
                ;
                for(i_5=0;i_5<=255;i_5++) {
                    // JavaLine 199 <== SourceLine 9
                    dummyGroup.val.putELEMENT(dummyGroup.val.index(i_5),dummyBox);
                }
                ;
                for(i_5=0;i_5<=127;i_5++) {
                    // JavaLine 204 <== SourceLine 10
                    symtab.putELEMENT(symtab.index(i_5),dummyGroup);
                }
                ;
                // JavaLine 208 <== SourceLine 13
                symtab.putELEMENT(symtab.index(0),new COMMON_symbolgroup((_CUR))._STM());
                ;
                symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(0),dummyBox);
                ;
                // JavaLine 213 <== SourceLine 14
                for(boolean CB_14:new FOR_List(
                new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("boolean")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("character")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("short")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("integer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("real")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("long")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ref")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("text")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" pointer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("value")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("label")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("procedure")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("array")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("no type")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("else")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("end")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eqv")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("external")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("for")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("go")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("goto")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("hidden")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("if")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("imp")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("in")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inner")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inspect")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("do")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("is")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("class")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("begin")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("name")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("new")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("not")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("or")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("otherwise")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("prior")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("delay")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("protected")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("qua")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("reactivate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("at")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("before")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("and")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("step")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("switch")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("activate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("then")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("this")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("to")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("until")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("after")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("virtual")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("when")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("while")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("lt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eq")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("le")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("gt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ne")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ge")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("comment")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("none")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("notext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("true")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("false")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("detach")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("printfile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("infile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ferrid")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ftext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005fpredefmodule")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("match stat")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("c")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("pascal")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("library")); }})
                   )) { if(!CB_14) continue;
                    // JavaLine 294 <== SourceLine 103
                    {
                        hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(simsymbol));
                        ;
                        // JavaLine 298 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512_5=new COMMON_identsymbol((_CUR))._STM();
                            if(_inspect_106_4512_5!=null) { // INSPECT _inspect_106_4512_5
                                // JavaLine 303 <== SourceLine 107
                                {
                                    // JavaLine 305 <== SourceLine 106
                                    {
                                        // JavaLine 307 <== SourceLine 107
                                        _inspect_106_4512_5.symbol=simsymbol;
                                        ;
                                        // JavaLine 310 <== SourceLine 108
                                        _inspect_106_4512_5.idlo=identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(identlo)+(1)));
                                        ;
                                        // JavaLine 313 <== SourceLine 109
                                        _inspect_106_4512_5.next=hashtab.getELEMENT(RTS_ENVIRONMENT.rank(hashlo));
                                        ;
                                        // JavaLine 316 <== SourceLine 110
                                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(identlo)),hashtab.putELEMENT(hashtab.index(RTS_ENVIRONMENT.rank(hashlo)),((COMMON_symbolbox)_inspect_106_4512_5)));
                                        ;
                                        // JavaLine 319 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512_5.next!=(null))&&((option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 321 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513_5=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513_5!=null) { // INSPECT _inspect_113_4513_5
                                                    // JavaLine 326 <== SourceLine 114
                                                    {
                                                        // JavaLine 328 <== SourceLine 113
                                                        {
                                                            // JavaLine 330 <== SourceLine 114
                                                            _inspect_113_4513_5.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),simsymbol),new RTS_TXT(" and ")),_inspect_106_4512_5.next.symbol));
                                                            ;
                                                            // JavaLine 333 <== SourceLine 116
                                                            _inspect_113_4513_5.outimage();
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
                // JavaLine 349 <== SourceLine 122
                i_5=(RTS_ENVIRONMENT.rank(identlo)+(1));
                ;
                // JavaLine 352 <== SourceLine 123
                while((i_5<=(255))) {
                    {
                        // JavaLine 355 <== SourceLine 124
                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(i_5),dummyBox);
                        ;
                        i_5=(i_5+(1));
                    }
                }
                ;
                // JavaLine 362 <== SourceLine 126
                consthi=((char)128);
                ;
                // JavaLine 365 <== SourceLine 128
                simsymbol=new RTS_TXT("0");
                ;
                new COMMON_DEFCONST((_CUR));
                ;
                // JavaLine 370 <== SourceLine 130
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 373 <== SourceLine 131
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 376 <== SourceLine 132
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 379 <== SourceLine 133
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 382 <== SourceLine 134
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 385 <== SourceLine 135
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 388 <== SourceLine 136
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 391 <== SourceLine 137
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 394 <== SourceLine 138
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 397 <== SourceLine 139
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 400 <== SourceLine 140
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 403 <== SourceLine 141
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 406 <== SourceLine 142
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 409 <== SourceLine 143
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 412 <== SourceLine 144
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 415 <== SourceLine 145
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 418 <== SourceLine 146
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 421 <== SourceLine 147
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 424 <== SourceLine 148
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 427 <== SourceLine 149
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 430 <== SourceLine 150
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 433 <== SourceLine 151
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 436 <== SourceLine 152
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 439 <== SourceLine 153
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 442 <== SourceLine 154
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 445 <== SourceLine 155
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 448 <== SourceLine 156
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 451 <== SourceLine 157
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 454 <== SourceLine 158
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 457 <== SourceLine 159
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 460 <== SourceLine 160
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 463 <== SourceLine 161
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 466 <== SourceLine 162
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 469 <== SourceLine 163
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 472 <== SourceLine 164
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 475 <== SourceLine 165
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 478 <== SourceLine 166
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 481 <== SourceLine 167
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 484 <== SourceLine 168
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 487 <== SourceLine 169
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 490 <== SourceLine 170
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 493 <== SourceLine 171
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 496 <== SourceLine 172
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 499 <== SourceLine 173
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 502 <== SourceLine 174
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 505 <== SourceLine 175
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 508 <== SourceLine 176
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 511 <== SourceLine 177
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 514 <== SourceLine 178
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 517 <== SourceLine 179
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 520 <== SourceLine 180
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 523 <== SourceLine 181
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 526 <== SourceLine 182
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 529 <== SourceLine 183
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 532 <== SourceLine 184
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 535 <== SourceLine 185
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 538 <== SourceLine 186
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 541 <== SourceLine 187
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 544 <== SourceLine 188
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 547 <== SourceLine 189
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 550 <== SourceLine 190
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 553 <== SourceLine 191
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 556 <== SourceLine 192
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 559 <== SourceLine 193
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 562 <== SourceLine 194
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 565 <== SourceLine 195
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 568 <== SourceLine 196
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 571 <== SourceLine 197
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 574 <== SourceLine 198
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 577 <== SourceLine 199
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 580 <== SourceLine 200
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 583 <== SourceLine 201
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 586 <== SourceLine 202
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 589 <== SourceLine 203
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 592 <== SourceLine 204
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 595 <== SourceLine 205
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 598 <== SourceLine 206
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 601 <== SourceLine 207
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 604 <== SourceLine 208
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 607 <== SourceLine 209
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 610 <== SourceLine 210
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 613 <== SourceLine 211
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 616 <== SourceLine 212
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 619 <== SourceLine 213
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 622 <== SourceLine 214
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 625 <== SourceLine 215
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 628 <== SourceLine 216
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 631 <== SourceLine 217
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 634 <== SourceLine 218
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 637 <== SourceLine 219
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 640 <== SourceLine 220
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 643 <== SourceLine 221
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 646 <== SourceLine 222
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 649 <== SourceLine 223
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 652 <== SourceLine 224
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 655 <== SourceLine 225
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 658 <== SourceLine 226
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 661 <== SourceLine 227
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 664 <== SourceLine 228
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 667 <== SourceLine 229
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 670 <== SourceLine 230
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 673 <== SourceLine 231
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 676 <== SourceLine 232
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 679 <== SourceLine 233
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 682 <== SourceLine 234
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 685 <== SourceLine 235
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 688 <== SourceLine 236
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 691 <== SourceLine 237
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 694 <== SourceLine 238
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 697 <== SourceLine 239
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 700 <== SourceLine 240
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 703 <== SourceLine 241
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 706 <== SourceLine 242
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 709 <== SourceLine 243
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 712 <== SourceLine 244
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 715 <== SourceLine 245
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 718 <== SourceLine 246
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 721 <== SourceLine 247
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 724 <== SourceLine 248
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 727 <== SourceLine 249
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 730 <== SourceLine 250
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 733 <== SourceLine 251
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 736 <== SourceLine 252
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 739 <== SourceLine 253
                    DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 742 <== SourceLine 254
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 745 <== SourceLine 255
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 748 <== SourceLine 256
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 751 <== SourceLine 257
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 754 <== SourceLine 258
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 757 <== SourceLine 259
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 760 <== SourceLine 260
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 763 <== SourceLine 261
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 766 <== SourceLine 262
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 769 <== SourceLine 263
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 772 <== SourceLine 264
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 775 <== SourceLine 265
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 778 <== SourceLine 266
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 781 <== SourceLine 267
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 784 <== SourceLine 268
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 787 <== SourceLine 269
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 790 <== SourceLine 270
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 793 <== SourceLine 271
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 796 <== SourceLine 272
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 799 <== SourceLine 273
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 802 <== SourceLine 274
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 805 <== SourceLine 275
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 808 <== SourceLine 276
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 811 <== SourceLine 277
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 814 <== SourceLine 89
                predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 817 <== SourceLine 91
                dummygen_2=false;
                ;
                // JavaLine 820 <== SourceLine 96
                {
                    // BEGIN INSPECTION 
                    _inspect_96_4514_5=((PARSER_grammer)new PARSER_grammer((_CUR))._START());
                    if(_inspect_96_4514_5!=null) { // INSPECT _inspect_96_4514_5
                        // JavaLine 825 <== SourceLine 97
                        {
                            // JavaLine 827 <== SourceLine 96
                            {
                                // JavaLine 829 <== SourceLine 98
                                parser=((COMMON_component)_inspect_96_4514_5);
                                ;
                                // JavaLine 832 <== SourceLine 100
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 835 <== SourceLine 101
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 838 <== SourceLine 102
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 841 <== SourceLine 103
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 844 <== SourceLine 104
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 847 <== SourceLine 105
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 850 <== SourceLine 106
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 853 <== SourceLine 107
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 856 <== SourceLine 108
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 859 <== SourceLine 109
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 862 <== SourceLine 110
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 865 <== SourceLine 111
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 868 <== SourceLine 112
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 871 <== SourceLine 113
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 874 <== SourceLine 118
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 877 <== SourceLine 119
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 880 <== SourceLine 120
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 883 <== SourceLine 121
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 886 <== SourceLine 122
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 889 <== SourceLine 123
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 892 <== SourceLine 124
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 895 <== SourceLine 125
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 898 <== SourceLine 126
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 901 <== SourceLine 127
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 904 <== SourceLine 128
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 907 <== SourceLine 129
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 910 <== SourceLine 130
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 913 <== SourceLine 131
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 916 <== SourceLine 132
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 919 <== SourceLine 133
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 922 <== SourceLine 134
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 925 <== SourceLine 135
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 928 <== SourceLine 136
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 931 <== SourceLine 137
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 934 <== SourceLine 138
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 937 <== SourceLine 147
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 940 <== SourceLine 148
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 943 <== SourceLine 149
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 946 <== SourceLine 150
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 949 <== SourceLine 151
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 952 <== SourceLine 152
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 955 <== SourceLine 153
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 958 <== SourceLine 157
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 961 <== SourceLine 158
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 964 <== SourceLine 159
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 967 <== SourceLine 160
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 970 <== SourceLine 161
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 973 <== SourceLine 162
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 976 <== SourceLine 163
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 979 <== SourceLine 164
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 982 <== SourceLine 168
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 985 <== SourceLine 169
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 988 <== SourceLine 170
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 991 <== SourceLine 171
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 994 <== SourceLine 172
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 997 <== SourceLine 173
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1005 <== SourceLine 179
                call(parser,179);
                ;
                // JavaLine 1008 <== SourceLine 185
                {
                    // BEGIN INSPECTION 
                    _inspect_185_4515_5=((SCANNER_recognizer)new SCANNER_recognizer((_CUR))._START());
                    if(_inspect_185_4515_5!=null) { // INSPECT _inspect_185_4515_5
                        // JavaLine 1013 <== SourceLine 186
                        {
                            // JavaLine 1015 <== SourceLine 185
                            {
                                // JavaLine 1017 <== SourceLine 186
                                lexScanner_2=((SCANNER_recognizer)(scanner=((COMMON_component)_inspect_185_4515_5)));
                                ;
                                _inspect_185_4515_5.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(i_5=35;i_5<=255;i_5++) {
                                    // JavaLine 1023 <== SourceLine 188
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)7));
                                }
                                ;
                                // JavaLine 1027 <== SourceLine 190
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(0),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(127),((char)9)));
                                ;
                                for(i_5=1;i_5<=7;i_5++) {
                                    // JavaLine 1031 <== SourceLine 192
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=14;i_5<=31;i_5++) {
                                    // JavaLine 1036 <== SourceLine 193
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=8;i_5<=13;i_5++) {
                                    // JavaLine 1041 <== SourceLine 195
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)6));
                                }
                                ;
                                // JavaLine 1045 <== SourceLine 196
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1048 <== SourceLine 198
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1051 <== SourceLine 200
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(34),((char)4));
                                ;
                                for(i_5=38;i_5<=47;i_5++) {
                                    // JavaLine 1055 <== SourceLine 201
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=58;i_5<=62;i_5++) {
                                    // JavaLine 1060 <== SourceLine 202
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=48;i_5<=57;i_5++) {
                                    // JavaLine 1065 <== SourceLine 204
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)2));
                                }
                                ;
                                for(i_5=65;i_5<=90;i_5++) {
                                    // JavaLine 1070 <== SourceLine 206
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                for(i_5=97;i_5<=122;i_5++) {
                                    // JavaLine 1075 <== SourceLine 207
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                // JavaLine 1079 <== SourceLine 209
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(67),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1082 <== SourceLine 211
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1085 <== SourceLine 213
                                _inspect_185_4515_5.IdScanner_1=((SCANNER_recognizer_identifierScanner)new SCANNER_recognizer_identifierScanner(_inspect_185_4515_5)._START());
                                ;
                                // JavaLine 1088 <== SourceLine 214
                                _inspect_185_4515_5.unsignedInt_1=((SCANNER_recognizer_unsignedInteger)new SCANNER_recognizer_unsignedInteger(_inspect_185_4515_5)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1096 <== SourceLine 220
                signiflength=255;
                ;
                // JavaLine 1099 <== SourceLine 221
                cursource_2=((SCANNER_SourceElt)new SCANNER_SourceElt((_CUR),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1102 <== SourceLine 222
                incrlnr_2=true;
                ;
                // JavaLine 1105 <== SourceLine 226
                if(_VALUE(TRF_EQ(L2NAME,null))) {
                    new ERRMSG_openerror((_CUR),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1110 <== SourceLine 227
                {
                    // BEGIN INSPECTION 
                    _inspect_227_4516_5=((SCANNER_L2Coder)new SCANNER_L2Coder((_CUR),L2NAME)._START());
                    if(_inspect_227_4516_5!=null) { // INSPECT _inspect_227_4516_5
                        // JavaLine 1115 <== SourceLine 228
                        {
                            // JavaLine 1117 <== SourceLine 227
                            {
                                // JavaLine 1119 <== SourceLine 228
                                P1coder_2=((SCANNER_L2Coder)_inspect_227_4516_5);
                                ;
                                coder=P1coder_2;
                                ;
                                // JavaLine 1124 <== SourceLine 232
                                brctab.putELEMENT(brctab.index(0),new COMMON_brctab2((_CUR))._STM());
                                ;
                                // JavaLine 1127 <== SourceLine 233
                                if(_VALUE((!((option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1130 <== SourceLine 234
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_234_4517_5=new COMMON_brecord((_CUR))._STM();
                                            if(_inspect_234_4517_5!=null) { // INSPECT _inspect_234_4517_5
                                                // JavaLine 1135 <== SourceLine 235
                                                {
                                                    // JavaLine 1137 <== SourceLine 234
                                                    {
                                                        // JavaLine 1139 <== SourceLine 235
                                                        _inspect_234_4517_5.kind=((char)13);
                                                        ;
                                                        brctab.getELEMENT(0).val.putELEMENT(brctab.getELEMENT(0).val.index(0),((COMMON_brecord)_inspect_234_4517_5));
                                                        ;
                                                        // JavaLine 1144 <== SourceLine 236
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_236_4518_5=new COMMON_quantity((_CUR))._STM();
                                                            if(_inspect_236_4518_5!=null) { // INSPECT _inspect_236_4518_5
                                                                // JavaLine 1149 <== SourceLine 237
                                                                {
                                                                    // JavaLine 1151 <== SourceLine 236
                                                                    {
                                                                        // JavaLine 1153 <== SourceLine 237
                                                                        _inspect_234_4517_5.fpar=((COMMON_quantity)_inspect_236_4518_5);
                                                                        ;
                                                                        // JavaLine 1156 <== SourceLine 238
                                                                        _inspect_236_4518_5.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1159 <== SourceLine 239
                                                                        _inspect_236_4518_5.type_1=((char)14);
                                                                        ;
                                                                        _inspect_236_4518_5.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1164 <== SourceLine 240
                                                                        _inspect_236_4518_5.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1167 <== SourceLine 244
                                                                        _inspect_236_4518_5.symb_1=new COMMON_boxof((_CUR),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1170 <== SourceLine 245
                                                                        new COMMON_QTRC((_CUR),new RTS_TXT("PAS1INIT"),245,new RTS_TXT("NEW Quantity: "),_inspect_234_4517_5.fpar);
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
                                // JavaLine 1186 <== SourceLine 252
                                nextbllo=((char)1);
                                ;
                                // JavaLine 1189 <== SourceLine 253
                                new SCANNER_L2Coder_brecinit(_inspect_227_4516_5,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1197 <== SourceLine 257
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PAS1INIT.sim","8 PAS1INIT",1,3,10,70,13,28,19,54,21,106,23,113,25,96,27,185,29,227,31,234,33,236,48,1322,50,998,52,2395,54,89,56,2697,58,33,63,37,66,38,69,40,72,41,75,42,78,43,81,44,84,45,89,50,94,51,97,52,102,53,106,54,111,55,113,54,115,55,120,56,123,57,129,58,142,61,145,65,148,66,152,67,157,68,166,70,172,71,177,73,180,74,183,77,186,78,189,2,192,6,195,8,199,9,204,10,208,13,213,14,294,103,298,106,303,107,305,106,307,107,310,108,313,109,316,110,319,112,321,113,326,114,328,113,330,114,333,116,349,122,352,123,355,124,362,126,365,128,370,130,373,131,376,132,379,133,382,134,385,135,388,136,391,137,394,138,397,139,400,140,403,141,406,142,409,143,412,144,415,145,418,146,421,147,424,148,427,149,430,150,433,151,436,152,439,153,442,154,445,155,448,156,451,157,454,158,457,159,460,160,463,161,466,162,469,163,472,164,475,165,478,166,481,167,484,168,487,169,490,170,493,171,496,172,499,173,502,174,505,175,508,176,511,177,514,178,517,179,520,180,523,181,526,182,529,183,532,184,535,185,538,186,541,187,544,188,547,189,550,190,553,191,556,192,559,193,562,194,565,195,568,196,571,197,574,198,577,199,580,200,583,201,586,202,589,203,592,204,595,205,598,206,601,207,604,208,607,209,610,210,613,211,616,212,619,213,622,214,625,215,628,216,631,217,634,218,637,219,640,220,643,221,646,222,649,223,652,224,655,225,658,226,661,227,664,228,667,229,670,230,673,231,676,232,679,233,682,234,685,235,688,236,691,237,694,238,697,239,700,240,703,241,706,242,709,243,712,244,715,245,718,246,721,247,724,248,727,249,730,250,733,251,736,252,739,253,742,254,745,255,748,256,751,257,754,258,757,259,760,260,763,261,766,262,769,263,772,264,775,265,778,266,781,267,784,268,787,269,790,270,793,271,796,272,799,273,802,274,805,275,808,276,811,277,814,89,817,91,820,96,825,97,827,96,829,98,832,100,835,101,838,102,841,103,844,104,847,105,850,106,853,107,856,108,859,109,862,110,865,111,868,112,871,113,874,118,877,119,880,120,883,121,886,122,889,123,892,124,895,125,898,126,901,127,904,128,907,129,910,130,913,131,916,132,919,133,922,134,925,135,928,136,931,137,934,138,937,147,940,148,943,149,946,150,949,151,952,152,955,153,958,157,961,158,964,159,967,160,970,161,973,162,976,163,979,164,982,168,985,169,988,170,991,171,994,172,997,173,1005,179,1008,185,1013,186,1015,185,1017,186,1023,188,1027,190,1031,192,1036,193,1041,195,1045,196,1048,198,1051,200,1055,201,1060,202,1065,204,1070,206,1075,207,1079,209,1082,211,1085,213,1088,214,1096,220,1099,221,1102,222,1105,226,1110,227,1115,228,1117,227,1119,228,1124,232,1127,233,1130,234,1135,235,1137,234,1139,235,1144,236,1149,237,1151,236,1153,237,1156,238,1159,239,1164,240,1167,244,1170,245,1186,252,1189,253,1197,257,1214,257);
} // End of Class
