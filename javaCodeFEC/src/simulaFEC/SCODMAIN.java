// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 24 09:41:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class SCODMAIN extends PAS2INIT {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=17, firstLine=3, lastLine=178, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 70
    final RTS_LABEL _LABEL_PAS1INIT_SETem_5=new RTS_LABEL(this,5,1,"SETem"); // Local Label #1=SETem At PrefixLevel 5
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public SCODMAIN _STM() {
        SCODMAIN _THIS=(SCODMAIN)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 26 <== SourceLine 1323
                // BEGIN INNER PART
                // JavaLine 28 <== SourceLine 998
                // BEGIN INNER PART
                // JavaLine 30 <== SourceLine 2395
                // BEGIN INNER PART
                // JavaLine 32 <== SourceLine 89
                // BEGIN INNER PART
                // JavaLine 34 <== SourceLine 2697
                // BEGIN INNER PART
                // JavaLine 36 <== SourceLine 33
                L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 41 <== SourceLine 37
                recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 44 <== SourceLine 38
                GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 47 <== SourceLine 40
                timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 50 <== SourceLine 41
                maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 53 <== SourceLine 42
                GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 56 <== SourceLine 43
                simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 59 <== SourceLine 44
                simob_descr=(simob_level>(0));
                ;
                // JavaLine 62 <== SourceLine 45
                simob_entity=(simob_level>=(2));
                ;
                simob_const=(simob_level>=(3));
                ;
                // JavaLine 67 <== SourceLine 50
                listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 72 <== SourceLine 51
                if(_VALUE(TRF_NE(listname_5,null))) {
                    {
                        // JavaLine 75 <== SourceLine 52
                        t_5=RTS_ENVIRONMENT.copy(copy(listname_5));
                        ;
                        t_5=RTS_ENVIRONMENT.lowcase(t_5);
                        ;
                        // JavaLine 80 <== SourceLine 53
                        if(_VALUE(_TXTREL_EQ(t_5,new RTS_TXT("sysout")))) {
                            listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 84 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4511_5=new RTS_Printfile(_CTX,listname_5)._STM();
                                if(_inspect_54_4511_5!=null) { // INSPECT _inspect_54_4511_5
                                    // JavaLine 89 <== SourceLine 55
                                    {
                                        // JavaLine 91 <== SourceLine 54
                                        {
                                            // JavaLine 93 <== SourceLine 55
                                            listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            t_5=RTS_ENVIRONMENT.blanks(listlength);
                                            ;
                                            // JavaLine 98 <== SourceLine 56
                                            if(_VALUE((!(_inspect_54_4511_5.open(t_5))))) {
                                                {
                                                    // JavaLine 101 <== SourceLine 57
                                                    listlength=0;
                                                    ;
                                                    new ERRMSG_error1((_CUR),-366,listname_5);
                                                }
                                            } else {
                                                // JavaLine 107 <== SourceLine 58
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
                // JavaLine 120 <== SourceLine 61
                listingon=(listfile!=(null));
                ;
                // JavaLine 123 <== SourceLine 65
                t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 126 <== SourceLine 66
                while(RTS_TXT.more(t_5)) {
                    if(_VALUE((RTS_TXT.getchar(t_5)==(':')))) {
                        {
                            // JavaLine 130 <== SourceLine 67
                            if(_VALUE(RTS_TXT.more(t_5))) {
                                feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(t_5,RTS_TXT.pos(t_5),((RTS_TXT.length(t_5)-(RTS_TXT.pos(t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 135 <== SourceLine 68
                            t_5=RTS_TXT.sub(t_5,1,(RTS_TXT.pos(t_5)-(2)));
                            ;
                            _GOTO(_LABEL_PAS1INIT_SETem_5); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 144 <== SourceLine 70
                {
                    _SIM_LABEL(1); // DeclaredIn: PAS1INIT
                    new SCANNER_SetSelectors((_CUR),t_5,0);
                }
                ;
                // JavaLine 150 <== SourceLine 71
                while(RTS_TXT.more(feoptions_5)) {
                    new COMMON_setopt((_CUR),RTS_TXT.getchar(feoptions_5),'1');
                }
                ;
                // JavaLine 155 <== SourceLine 73
                termstatus='3';
                ;
                // JavaLine 158 <== SourceLine 74
                currentpass='1';
                ;
                // JavaLine 161 <== SourceLine 77
                leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 164 <== SourceLine 78
                leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 167 <== SourceLine 2
                TAGTAB=new COMMON_TAGTABLE((_CUR))._STM();
                ;
                // JavaLine 170 <== SourceLine 6
                dummyBox=new COMMON_identsymbol((_CUR))._STM();
                ;
                // JavaLine 173 <== SourceLine 8
                dummyGroup=new COMMON_symbolgroup((_CUR))._STM();
                ;
                for(i_5=0;i_5<=255;i_5++) {
                    // JavaLine 177 <== SourceLine 9
                    dummyGroup.val.putELEMENT(dummyGroup.val.index(i_5),dummyBox);
                }
                ;
                for(i_5=0;i_5<=127;i_5++) {
                    // JavaLine 182 <== SourceLine 10
                    symtab.putELEMENT(symtab.index(i_5),dummyGroup);
                }
                ;
                // JavaLine 186 <== SourceLine 13
                symtab.putELEMENT(symtab.index(0),new COMMON_symbolgroup((_CUR))._STM());
                ;
                symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(0),dummyBox);
                ;
                // JavaLine 191 <== SourceLine 14
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
                    // JavaLine 272 <== SourceLine 103
                    {
                        hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(simsymbol));
                        ;
                        // JavaLine 276 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512_5=new COMMON_identsymbol((_CUR))._STM();
                            if(_inspect_106_4512_5!=null) { // INSPECT _inspect_106_4512_5
                                // JavaLine 281 <== SourceLine 107
                                {
                                    // JavaLine 283 <== SourceLine 106
                                    {
                                        // JavaLine 285 <== SourceLine 107
                                        _inspect_106_4512_5.symbol=simsymbol;
                                        ;
                                        // JavaLine 288 <== SourceLine 108
                                        _inspect_106_4512_5.idlo=identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(identlo)+(1)));
                                        ;
                                        // JavaLine 291 <== SourceLine 109
                                        _inspect_106_4512_5.next=hashtab.getELEMENT(RTS_ENVIRONMENT.rank(hashlo));
                                        ;
                                        // JavaLine 294 <== SourceLine 110
                                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(identlo)),hashtab.putELEMENT(hashtab.index(RTS_ENVIRONMENT.rank(hashlo)),((COMMON_symbolbox)_inspect_106_4512_5)));
                                        ;
                                        // JavaLine 297 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512_5.next!=(null))&&((option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 299 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513_5=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513_5!=null) { // INSPECT _inspect_113_4513_5
                                                    // JavaLine 304 <== SourceLine 114
                                                    {
                                                        // JavaLine 306 <== SourceLine 113
                                                        {
                                                            // JavaLine 308 <== SourceLine 114
                                                            _inspect_113_4513_5.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),simsymbol),new RTS_TXT(" and ")),_inspect_106_4512_5.next.symbol));
                                                            ;
                                                            // JavaLine 311 <== SourceLine 116
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
                // JavaLine 327 <== SourceLine 122
                i_5=(RTS_ENVIRONMENT.rank(identlo)+(1));
                ;
                // JavaLine 330 <== SourceLine 123
                while((i_5<=(255))) {
                    {
                        // JavaLine 333 <== SourceLine 124
                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(i_5),dummyBox);
                        ;
                        i_5=(i_5+(1));
                    }
                }
                ;
                // JavaLine 340 <== SourceLine 126
                consthi=((char)128);
                ;
                // JavaLine 343 <== SourceLine 128
                simsymbol=new RTS_TXT("0");
                ;
                new COMMON_DEFCONST((_CUR));
                ;
                // JavaLine 348 <== SourceLine 130
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 351 <== SourceLine 131
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 354 <== SourceLine 132
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 357 <== SourceLine 133
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 360 <== SourceLine 134
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 363 <== SourceLine 135
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 366 <== SourceLine 136
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 369 <== SourceLine 137
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 372 <== SourceLine 138
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 375 <== SourceLine 139
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 378 <== SourceLine 140
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 381 <== SourceLine 141
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 384 <== SourceLine 142
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 387 <== SourceLine 143
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 390 <== SourceLine 144
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 393 <== SourceLine 145
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 396 <== SourceLine 146
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 399 <== SourceLine 147
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 402 <== SourceLine 148
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 405 <== SourceLine 149
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 408 <== SourceLine 150
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 411 <== SourceLine 151
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 414 <== SourceLine 152
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 417 <== SourceLine 153
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 420 <== SourceLine 154
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 423 <== SourceLine 155
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 426 <== SourceLine 156
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 429 <== SourceLine 157
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 432 <== SourceLine 158
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 435 <== SourceLine 159
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 438 <== SourceLine 160
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 441 <== SourceLine 161
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 444 <== SourceLine 162
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 447 <== SourceLine 163
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 450 <== SourceLine 164
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 453 <== SourceLine 165
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 456 <== SourceLine 166
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 459 <== SourceLine 167
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 462 <== SourceLine 168
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 465 <== SourceLine 169
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 468 <== SourceLine 170
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 471 <== SourceLine 171
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 474 <== SourceLine 172
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 477 <== SourceLine 173
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 480 <== SourceLine 174
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 483 <== SourceLine 175
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 486 <== SourceLine 176
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 489 <== SourceLine 177
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 492 <== SourceLine 178
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 495 <== SourceLine 179
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 498 <== SourceLine 180
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 501 <== SourceLine 181
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 504 <== SourceLine 182
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 507 <== SourceLine 183
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 510 <== SourceLine 184
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 513 <== SourceLine 185
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 516 <== SourceLine 186
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 519 <== SourceLine 187
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 522 <== SourceLine 188
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 525 <== SourceLine 189
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 528 <== SourceLine 190
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 531 <== SourceLine 191
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 534 <== SourceLine 192
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 537 <== SourceLine 193
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 540 <== SourceLine 194
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 543 <== SourceLine 195
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 546 <== SourceLine 196
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 549 <== SourceLine 197
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 552 <== SourceLine 198
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 555 <== SourceLine 199
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 558 <== SourceLine 200
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 561 <== SourceLine 201
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 564 <== SourceLine 202
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 567 <== SourceLine 203
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 570 <== SourceLine 204
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 573 <== SourceLine 205
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 576 <== SourceLine 206
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 579 <== SourceLine 207
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 582 <== SourceLine 208
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 585 <== SourceLine 209
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 588 <== SourceLine 210
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 591 <== SourceLine 211
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 594 <== SourceLine 212
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 597 <== SourceLine 213
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 600 <== SourceLine 214
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 603 <== SourceLine 215
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 606 <== SourceLine 216
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 609 <== SourceLine 217
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 612 <== SourceLine 218
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 615 <== SourceLine 219
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 618 <== SourceLine 220
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 621 <== SourceLine 221
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 624 <== SourceLine 222
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 627 <== SourceLine 223
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 630 <== SourceLine 224
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 633 <== SourceLine 225
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 636 <== SourceLine 226
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 639 <== SourceLine 227
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 642 <== SourceLine 228
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 645 <== SourceLine 229
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 648 <== SourceLine 230
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 651 <== SourceLine 231
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 654 <== SourceLine 232
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 657 <== SourceLine 233
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 660 <== SourceLine 234
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 663 <== SourceLine 235
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 666 <== SourceLine 236
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 669 <== SourceLine 237
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 672 <== SourceLine 238
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 675 <== SourceLine 239
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 678 <== SourceLine 240
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 681 <== SourceLine 241
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 684 <== SourceLine 242
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 687 <== SourceLine 243
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 690 <== SourceLine 244
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 693 <== SourceLine 245
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 696 <== SourceLine 246
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 699 <== SourceLine 247
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 702 <== SourceLine 248
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 705 <== SourceLine 249
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 708 <== SourceLine 250
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 711 <== SourceLine 251
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 714 <== SourceLine 252
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 717 <== SourceLine 253
                    DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 720 <== SourceLine 254
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 723 <== SourceLine 255
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 726 <== SourceLine 256
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 729 <== SourceLine 257
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 732 <== SourceLine 258
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 735 <== SourceLine 259
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 738 <== SourceLine 260
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 741 <== SourceLine 261
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 744 <== SourceLine 262
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 747 <== SourceLine 263
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 750 <== SourceLine 264
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 753 <== SourceLine 265
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 756 <== SourceLine 266
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 759 <== SourceLine 267
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 762 <== SourceLine 268
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 765 <== SourceLine 269
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 768 <== SourceLine 270
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 771 <== SourceLine 271
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 774 <== SourceLine 272
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 777 <== SourceLine 273
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 780 <== SourceLine 274
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 783 <== SourceLine 275
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 786 <== SourceLine 276
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 789 <== SourceLine 277
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 792 <== SourceLine 89
                predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 795 <== SourceLine 91
                dummygen_2=false;
                ;
                // JavaLine 798 <== SourceLine 96
                {
                    // BEGIN INSPECTION 
                    _inspect_96_4514_5=((PARSER_grammer)new PARSER_grammer((_CUR))._START());
                    if(_inspect_96_4514_5!=null) { // INSPECT _inspect_96_4514_5
                        // JavaLine 803 <== SourceLine 97
                        {
                            // JavaLine 805 <== SourceLine 96
                            {
                                // JavaLine 807 <== SourceLine 98
                                parser=((COMMON_component)_inspect_96_4514_5);
                                ;
                                // JavaLine 810 <== SourceLine 100
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 813 <== SourceLine 101
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 816 <== SourceLine 102
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 819 <== SourceLine 103
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 822 <== SourceLine 104
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 825 <== SourceLine 105
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 828 <== SourceLine 106
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 831 <== SourceLine 107
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 834 <== SourceLine 108
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 837 <== SourceLine 109
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 840 <== SourceLine 110
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 843 <== SourceLine 111
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 846 <== SourceLine 112
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 849 <== SourceLine 113
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 852 <== SourceLine 118
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 855 <== SourceLine 119
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 858 <== SourceLine 120
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 861 <== SourceLine 121
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 864 <== SourceLine 122
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 867 <== SourceLine 123
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 870 <== SourceLine 124
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 873 <== SourceLine 125
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 876 <== SourceLine 126
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 879 <== SourceLine 127
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 882 <== SourceLine 128
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 885 <== SourceLine 129
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 888 <== SourceLine 130
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 891 <== SourceLine 131
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 894 <== SourceLine 132
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 897 <== SourceLine 133
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 900 <== SourceLine 134
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 903 <== SourceLine 135
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 906 <== SourceLine 136
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 909 <== SourceLine 137
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 912 <== SourceLine 138
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 915 <== SourceLine 147
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 918 <== SourceLine 148
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 921 <== SourceLine 149
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 924 <== SourceLine 150
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 927 <== SourceLine 151
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 930 <== SourceLine 152
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 933 <== SourceLine 153
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 936 <== SourceLine 157
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 939 <== SourceLine 158
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 942 <== SourceLine 159
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 945 <== SourceLine 160
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 948 <== SourceLine 161
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 951 <== SourceLine 162
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 954 <== SourceLine 163
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 957 <== SourceLine 164
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 960 <== SourceLine 168
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 963 <== SourceLine 169
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 966 <== SourceLine 170
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 969 <== SourceLine 171
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 972 <== SourceLine 172
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 975 <== SourceLine 173
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 983 <== SourceLine 179
                call(parser,179);
                ;
                // JavaLine 986 <== SourceLine 185
                {
                    // BEGIN INSPECTION 
                    _inspect_185_4515_5=((SCANNER_recognizer)new SCANNER_recognizer((_CUR))._START());
                    if(_inspect_185_4515_5!=null) { // INSPECT _inspect_185_4515_5
                        // JavaLine 991 <== SourceLine 186
                        {
                            // JavaLine 993 <== SourceLine 185
                            {
                                // JavaLine 995 <== SourceLine 186
                                lexScanner_2=((SCANNER_recognizer)(scanner=((COMMON_component)_inspect_185_4515_5)));
                                ;
                                _inspect_185_4515_5.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(i_5=35;i_5<=255;i_5++) {
                                    // JavaLine 1001 <== SourceLine 188
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)7));
                                }
                                ;
                                // JavaLine 1005 <== SourceLine 190
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(0),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(127),((char)9)));
                                ;
                                for(i_5=1;i_5<=7;i_5++) {
                                    // JavaLine 1009 <== SourceLine 192
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=14;i_5<=31;i_5++) {
                                    // JavaLine 1014 <== SourceLine 193
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=8;i_5<=13;i_5++) {
                                    // JavaLine 1019 <== SourceLine 195
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)6));
                                }
                                ;
                                // JavaLine 1023 <== SourceLine 196
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1026 <== SourceLine 198
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1029 <== SourceLine 200
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(34),((char)4));
                                ;
                                for(i_5=38;i_5<=47;i_5++) {
                                    // JavaLine 1033 <== SourceLine 201
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=58;i_5<=62;i_5++) {
                                    // JavaLine 1038 <== SourceLine 202
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=48;i_5<=57;i_5++) {
                                    // JavaLine 1043 <== SourceLine 204
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)2));
                                }
                                ;
                                for(i_5=65;i_5<=90;i_5++) {
                                    // JavaLine 1048 <== SourceLine 206
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                for(i_5=97;i_5<=122;i_5++) {
                                    // JavaLine 1053 <== SourceLine 207
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                // JavaLine 1057 <== SourceLine 209
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(67),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1060 <== SourceLine 211
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1063 <== SourceLine 213
                                _inspect_185_4515_5.IdScanner_1=((SCANNER_recognizer_identifierScanner)new SCANNER_recognizer_identifierScanner(_inspect_185_4515_5)._START());
                                ;
                                // JavaLine 1066 <== SourceLine 214
                                _inspect_185_4515_5.unsignedInt_1=((SCANNER_recognizer_unsignedInteger)new SCANNER_recognizer_unsignedInteger(_inspect_185_4515_5)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1074 <== SourceLine 220
                signiflength=255;
                ;
                // JavaLine 1077 <== SourceLine 221
                cursource_2=((SCANNER_SourceElt)new SCANNER_SourceElt((_CUR),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1080 <== SourceLine 222
                incrlnr_2=true;
                ;
                // JavaLine 1083 <== SourceLine 226
                if(_VALUE(TRF_EQ(L2NAME,null))) {
                    new ERRMSG_openerror((_CUR),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1088 <== SourceLine 227
                {
                    // BEGIN INSPECTION 
                    _inspect_227_4516_5=((SCANNER_L2Coder)new SCANNER_L2Coder((_CUR),L2NAME)._START());
                    if(_inspect_227_4516_5!=null) { // INSPECT _inspect_227_4516_5
                        // JavaLine 1093 <== SourceLine 228
                        {
                            // JavaLine 1095 <== SourceLine 227
                            {
                                // JavaLine 1097 <== SourceLine 228
                                P1coder_2=((SCANNER_L2Coder)_inspect_227_4516_5);
                                ;
                                coder=P1coder_2;
                                ;
                                // JavaLine 1102 <== SourceLine 232
                                brctab.putELEMENT(brctab.index(0),new COMMON_brctab2((_CUR))._STM());
                                ;
                                // JavaLine 1105 <== SourceLine 233
                                if(_VALUE((!((option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1108 <== SourceLine 234
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_234_4517_5=new COMMON_brecord((_CUR))._STM();
                                            if(_inspect_234_4517_5!=null) { // INSPECT _inspect_234_4517_5
                                                // JavaLine 1113 <== SourceLine 235
                                                {
                                                    // JavaLine 1115 <== SourceLine 234
                                                    {
                                                        // JavaLine 1117 <== SourceLine 235
                                                        _inspect_234_4517_5.kind=((char)13);
                                                        ;
                                                        brctab.getELEMENT(0).val.putELEMENT(brctab.getELEMENT(0).val.index(0),((COMMON_brecord)_inspect_234_4517_5));
                                                        ;
                                                        // JavaLine 1122 <== SourceLine 236
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_236_4518_5=new COMMON_quantity((_CUR))._STM();
                                                            if(_inspect_236_4518_5!=null) { // INSPECT _inspect_236_4518_5
                                                                // JavaLine 1127 <== SourceLine 237
                                                                {
                                                                    // JavaLine 1129 <== SourceLine 236
                                                                    {
                                                                        // JavaLine 1131 <== SourceLine 237
                                                                        _inspect_234_4517_5.fpar=((COMMON_quantity)_inspect_236_4518_5);
                                                                        ;
                                                                        // JavaLine 1134 <== SourceLine 238
                                                                        _inspect_236_4518_5.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1137 <== SourceLine 239
                                                                        _inspect_236_4518_5.type_1=((char)14);
                                                                        ;
                                                                        _inspect_236_4518_5.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1142 <== SourceLine 240
                                                                        _inspect_236_4518_5.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1145 <== SourceLine 244
                                                                        _inspect_236_4518_5.symb_1=new COMMON_boxof((_CUR),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1148 <== SourceLine 245
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
                                // JavaLine 1164 <== SourceLine 252
                                nextbllo=((char)1);
                                ;
                                // JavaLine 1167 <== SourceLine 253
                                new SCANNER_L2Coder_brecinit(_inspect_227_4516_5,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1175 <== SourceLine 257
                // BEGIN INNER PART
                // JavaLine 1177 <== SourceLine 802
                // BEGIN INNER PART
                // JavaLine 1179 <== SourceLine 1883
                // BEGIN INNER PART
                // JavaLine 1181 <== SourceLine 2636
                // BEGIN INNER PART
                // JavaLine 1183 <== SourceLine 1664
                // BEGIN INNER PART
                // JavaLine 1185 <== SourceLine 311
                // BEGIN INNER PART
                // JavaLine 1187 <== SourceLine 903
                // BEGIN INNER PART
                // JavaLine 1189 <== SourceLine 371
                // BEGIN INNER PART
                // JavaLine 1191 <== SourceLine 1251
                // BEGIN INNER PART
                // JavaLine 1193 <== SourceLine 1444
                // BEGIN INNER PART
                // JavaLine 1195 <== SourceLine 499
                // BEGIN INNER PART
                // JavaLine 1197 <== SourceLine 656
                // BEGIN INNER PART
                // JavaLine 1199 <== SourceLine 178
                // BEGIN INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc01.sim","8 SCODMAIN",1,3,10,70,26,1323,28,998,30,2395,32,89,34,2697,36,33,41,37,44,38,47,40,50,41,53,42,56,43,59,44,62,45,67,50,72,51,75,52,80,53,84,54,89,55,91,54,93,55,98,56,101,57,107,58,120,61,123,65,126,66,130,67,135,68,144,70,150,71,155,73,158,74,161,77,164,78,167,2,170,6,173,8,177,9,182,10,186,13,191,14,272,103,276,106,281,107,283,106,285,107,288,108,291,109,294,110,297,112,299,113,304,114,306,113,308,114,311,116,327,122,330,123,333,124,340,126,343,128,348,130,351,131,354,132,357,133,360,134,363,135,366,136,369,137,372,138,375,139,378,140,381,141,384,142,387,143,390,144,393,145,396,146,399,147,402,148,405,149,408,150,411,151,414,152,417,153,420,154,423,155,426,156,429,157,432,158,435,159,438,160,441,161,444,162,447,163,450,164,453,165,456,166,459,167,462,168,465,169,468,170,471,171,474,172,477,173,480,174,483,175,486,176,489,177,492,178,495,179,498,180,501,181,504,182,507,183,510,184,513,185,516,186,519,187,522,188,525,189,528,190,531,191,534,192,537,193,540,194,543,195,546,196,549,197,552,198,555,199,558,200,561,201,564,202,567,203,570,204,573,205,576,206,579,207,582,208,585,209,588,210,591,211,594,212,597,213,600,214,603,215,606,216,609,217,612,218,615,219,618,220,621,221,624,222,627,223,630,224,633,225,636,226,639,227,642,228,645,229,648,230,651,231,654,232,657,233,660,234,663,235,666,236,669,237,672,238,675,239,678,240,681,241,684,242,687,243,690,244,693,245,696,246,699,247,702,248,705,249,708,250,711,251,714,252,717,253,720,254,723,255,726,256,729,257,732,258,735,259,738,260,741,261,744,262,747,263,750,264,753,265,756,266,759,267,762,268,765,269,768,270,771,271,774,272,777,273,780,274,783,275,786,276,789,277,792,89,795,91,798,96,803,97,805,96,807,98,810,100,813,101,816,102,819,103,822,104,825,105,828,106,831,107,834,108,837,109,840,110,843,111,846,112,849,113,852,118,855,119,858,120,861,121,864,122,867,123,870,124,873,125,876,126,879,127,882,128,885,129,888,130,891,131,894,132,897,133,900,134,903,135,906,136,909,137,912,138,915,147,918,148,921,149,924,150,927,151,930,152,933,153,936,157,939,158,942,159,945,160,948,161,951,162,954,163,957,164,960,168,963,169,966,170,969,171,972,172,975,173,983,179,986,185,991,186,993,185,995,186,1001,188,1005,190,1009,192,1014,193,1019,195,1023,196,1026,198,1029,200,1033,201,1038,202,1043,204,1048,206,1053,207,1057,209,1060,211,1063,213,1066,214,1074,220,1077,221,1080,222,1083,226,1088,227,1093,228,1095,227,1097,228,1102,232,1105,233,1108,234,1113,235,1115,234,1117,235,1122,236,1127,237,1129,236,1131,237,1134,238,1137,239,1142,240,1145,244,1148,245,1164,252,1167,253,1175,257,1177,802,1179,1883,1181,2636,1183,1664,1185,311,1187,903,1189,371,1191,1251,1193,1444,1195,499,1197,656,1199,178,1228,178);
} // End of Class
