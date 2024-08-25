// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER2 extends BUILDER1 {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=7, firstLine=3, lastLine=1883, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 70
    final RTS_LABEL _LABEL_PAS1INIT_SETem_5=new RTS_LABEL(this,5,1,"SETem"); // Local Label #1=SETem At PrefixLevel 5
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 136
    public BUILDER2_normalattrfile Afile_7=null;
    // Normal Constructor
    public BUILDER2(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER2 _STM() {
        BUILDER2 _THIS=(BUILDER2)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 1322
                // BEGIN INNER PART
                // JavaLine 30 <== SourceLine 998
                // BEGIN INNER PART
                // JavaLine 32 <== SourceLine 2395
                // BEGIN INNER PART
                // JavaLine 34 <== SourceLine 89
                // BEGIN INNER PART
                // JavaLine 36 <== SourceLine 2697
                // BEGIN INNER PART
                // JavaLine 38 <== SourceLine 33
                L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 43 <== SourceLine 37
                recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 46 <== SourceLine 38
                GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 49 <== SourceLine 40
                timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 52 <== SourceLine 41
                maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 55 <== SourceLine 42
                GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 58 <== SourceLine 43
                simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 61 <== SourceLine 44
                simob_descr=(simob_level>(0));
                ;
                // JavaLine 64 <== SourceLine 45
                simob_entity=(simob_level>=(2));
                ;
                simob_const=(simob_level>=(3));
                ;
                // JavaLine 69 <== SourceLine 50
                listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 74 <== SourceLine 51
                if(_VALUE(TRF_NE(listname_5,null))) {
                    {
                        // JavaLine 77 <== SourceLine 52
                        t_5=RTS_ENVIRONMENT.copy(copy(listname_5));
                        ;
                        t_5=RTS_ENVIRONMENT.lowcase(t_5);
                        ;
                        // JavaLine 82 <== SourceLine 53
                        if(_VALUE(_TXTREL_EQ(t_5,new RTS_TXT("sysout")))) {
                            listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 86 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4511_5=new RTS_Printfile(_CTX,listname_5)._STM();
                                if(_inspect_54_4511_5!=null) { // INSPECT _inspect_54_4511_5
                                    // JavaLine 91 <== SourceLine 55
                                    {
                                        // JavaLine 93 <== SourceLine 54
                                        {
                                            // JavaLine 95 <== SourceLine 55
                                            listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            t_5=RTS_ENVIRONMENT.blanks(listlength);
                                            ;
                                            // JavaLine 100 <== SourceLine 56
                                            if(_VALUE((!(_inspect_54_4511_5.open(t_5))))) {
                                                {
                                                    // JavaLine 103 <== SourceLine 57
                                                    listlength=0;
                                                    ;
                                                    new ERRMSG_error1((_CUR),-366,listname_5);
                                                }
                                            } else {
                                                // JavaLine 109 <== SourceLine 58
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
                // JavaLine 122 <== SourceLine 61
                listingon=(listfile!=(null));
                ;
                // JavaLine 125 <== SourceLine 65
                t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 128 <== SourceLine 66
                while(RTS_TXT.more(t_5)) {
                    if(_VALUE((RTS_TXT.getchar(t_5)==(':')))) {
                        {
                            // JavaLine 132 <== SourceLine 67
                            if(_VALUE(RTS_TXT.more(t_5))) {
                                feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(t_5,RTS_TXT.pos(t_5),((RTS_TXT.length(t_5)-(RTS_TXT.pos(t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 137 <== SourceLine 68
                            t_5=RTS_TXT.sub(t_5,1,(RTS_TXT.pos(t_5)-(2)));
                            ;
                            _GOTO(_LABEL_PAS1INIT_SETem_5); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 146 <== SourceLine 70
                {
                    _SIM_LABEL(1); // DeclaredIn: PAS1INIT
                    new SCANNER_SetSelectors((_CUR),t_5,0);
                }
                ;
                // JavaLine 152 <== SourceLine 71
                while(RTS_TXT.more(feoptions_5)) {
                    new COMMON_setopt((_CUR),RTS_TXT.getchar(feoptions_5),'1');
                }
                ;
                // JavaLine 157 <== SourceLine 73
                termstatus='3';
                ;
                // JavaLine 160 <== SourceLine 74
                currentpass='1';
                ;
                // JavaLine 163 <== SourceLine 77
                leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 166 <== SourceLine 78
                leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 169 <== SourceLine 2
                TAGTAB=new COMMON_TAGTABLE((_CUR))._STM();
                ;
                // JavaLine 172 <== SourceLine 6
                dummyBox=new COMMON_identsymbol((_CUR))._STM();
                ;
                // JavaLine 175 <== SourceLine 8
                dummyGroup=new COMMON_symbolgroup((_CUR))._STM();
                ;
                for(i_5=0;i_5<=255;i_5++) {
                    // JavaLine 179 <== SourceLine 9
                    dummyGroup.val.putELEMENT(dummyGroup.val.index(i_5),dummyBox);
                }
                ;
                for(i_5=0;i_5<=127;i_5++) {
                    // JavaLine 184 <== SourceLine 10
                    symtab.putELEMENT(symtab.index(i_5),dummyGroup);
                }
                ;
                // JavaLine 188 <== SourceLine 13
                symtab.putELEMENT(symtab.index(0),new COMMON_symbolgroup((_CUR))._STM());
                ;
                symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(0),dummyBox);
                ;
                // JavaLine 193 <== SourceLine 14
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
                    // JavaLine 274 <== SourceLine 103
                    {
                        hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(simsymbol));
                        ;
                        // JavaLine 278 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512_5=new COMMON_identsymbol((_CUR))._STM();
                            if(_inspect_106_4512_5!=null) { // INSPECT _inspect_106_4512_5
                                // JavaLine 283 <== SourceLine 107
                                {
                                    // JavaLine 285 <== SourceLine 106
                                    {
                                        // JavaLine 287 <== SourceLine 107
                                        _inspect_106_4512_5.symbol=simsymbol;
                                        ;
                                        // JavaLine 290 <== SourceLine 108
                                        _inspect_106_4512_5.idlo=identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(identlo)+(1)));
                                        ;
                                        // JavaLine 293 <== SourceLine 109
                                        _inspect_106_4512_5.next=hashtab.getELEMENT(RTS_ENVIRONMENT.rank(hashlo));
                                        ;
                                        // JavaLine 296 <== SourceLine 110
                                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(identlo)),hashtab.putELEMENT(hashtab.index(RTS_ENVIRONMENT.rank(hashlo)),((COMMON_symbolbox)_inspect_106_4512_5)));
                                        ;
                                        // JavaLine 299 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512_5.next!=(null))&&((option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 301 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513_5=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513_5!=null) { // INSPECT _inspect_113_4513_5
                                                    // JavaLine 306 <== SourceLine 114
                                                    {
                                                        // JavaLine 308 <== SourceLine 113
                                                        {
                                                            // JavaLine 310 <== SourceLine 114
                                                            _inspect_113_4513_5.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),simsymbol),new RTS_TXT(" and ")),_inspect_106_4512_5.next.symbol));
                                                            ;
                                                            // JavaLine 313 <== SourceLine 116
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
                // JavaLine 329 <== SourceLine 122
                i_5=(RTS_ENVIRONMENT.rank(identlo)+(1));
                ;
                // JavaLine 332 <== SourceLine 123
                while((i_5<=(255))) {
                    {
                        // JavaLine 335 <== SourceLine 124
                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(i_5),dummyBox);
                        ;
                        i_5=(i_5+(1));
                    }
                }
                ;
                // JavaLine 342 <== SourceLine 126
                consthi=((char)128);
                ;
                // JavaLine 345 <== SourceLine 128
                simsymbol=new RTS_TXT("0");
                ;
                new COMMON_DEFCONST((_CUR));
                ;
                // JavaLine 350 <== SourceLine 130
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 353 <== SourceLine 131
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 356 <== SourceLine 132
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 359 <== SourceLine 133
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 362 <== SourceLine 134
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 365 <== SourceLine 135
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 368 <== SourceLine 136
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 371 <== SourceLine 137
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 374 <== SourceLine 138
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 377 <== SourceLine 139
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 380 <== SourceLine 140
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 383 <== SourceLine 141
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 386 <== SourceLine 142
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 389 <== SourceLine 143
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 392 <== SourceLine 144
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 395 <== SourceLine 145
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 398 <== SourceLine 146
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 401 <== SourceLine 147
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 404 <== SourceLine 148
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 407 <== SourceLine 149
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 410 <== SourceLine 150
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 413 <== SourceLine 151
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 416 <== SourceLine 152
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 419 <== SourceLine 153
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 422 <== SourceLine 154
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 425 <== SourceLine 155
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 428 <== SourceLine 156
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 431 <== SourceLine 157
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 434 <== SourceLine 158
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 437 <== SourceLine 159
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 440 <== SourceLine 160
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 443 <== SourceLine 161
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 446 <== SourceLine 162
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 449 <== SourceLine 163
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 452 <== SourceLine 164
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 455 <== SourceLine 165
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 458 <== SourceLine 166
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 461 <== SourceLine 167
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 464 <== SourceLine 168
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 467 <== SourceLine 169
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 470 <== SourceLine 170
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 473 <== SourceLine 171
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 476 <== SourceLine 172
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 479 <== SourceLine 173
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 482 <== SourceLine 174
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 485 <== SourceLine 175
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 488 <== SourceLine 176
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 491 <== SourceLine 177
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 494 <== SourceLine 178
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 497 <== SourceLine 179
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 500 <== SourceLine 180
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 503 <== SourceLine 181
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 506 <== SourceLine 182
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 509 <== SourceLine 183
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 512 <== SourceLine 184
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 515 <== SourceLine 185
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 518 <== SourceLine 186
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 521 <== SourceLine 187
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 524 <== SourceLine 188
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 527 <== SourceLine 189
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 530 <== SourceLine 190
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 533 <== SourceLine 191
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 536 <== SourceLine 192
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 539 <== SourceLine 193
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 542 <== SourceLine 194
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 545 <== SourceLine 195
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 548 <== SourceLine 196
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 551 <== SourceLine 197
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 554 <== SourceLine 198
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 557 <== SourceLine 199
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 560 <== SourceLine 200
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 563 <== SourceLine 201
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 566 <== SourceLine 202
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 569 <== SourceLine 203
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 572 <== SourceLine 204
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 575 <== SourceLine 205
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 578 <== SourceLine 206
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 581 <== SourceLine 207
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 584 <== SourceLine 208
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 587 <== SourceLine 209
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 590 <== SourceLine 210
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 593 <== SourceLine 211
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 596 <== SourceLine 212
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 599 <== SourceLine 213
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 602 <== SourceLine 214
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 605 <== SourceLine 215
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 608 <== SourceLine 216
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 611 <== SourceLine 217
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 614 <== SourceLine 218
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 617 <== SourceLine 219
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 620 <== SourceLine 220
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 623 <== SourceLine 221
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 626 <== SourceLine 222
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 629 <== SourceLine 223
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 632 <== SourceLine 224
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 635 <== SourceLine 225
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 638 <== SourceLine 226
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 641 <== SourceLine 227
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 644 <== SourceLine 228
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 647 <== SourceLine 229
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 650 <== SourceLine 230
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 653 <== SourceLine 231
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 656 <== SourceLine 232
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 659 <== SourceLine 233
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 662 <== SourceLine 234
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 665 <== SourceLine 235
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 668 <== SourceLine 236
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 671 <== SourceLine 237
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 674 <== SourceLine 238
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 677 <== SourceLine 239
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 680 <== SourceLine 240
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 683 <== SourceLine 241
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 686 <== SourceLine 242
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 689 <== SourceLine 243
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 692 <== SourceLine 244
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 695 <== SourceLine 245
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 698 <== SourceLine 246
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 701 <== SourceLine 247
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 704 <== SourceLine 248
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 707 <== SourceLine 249
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 710 <== SourceLine 250
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 713 <== SourceLine 251
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 716 <== SourceLine 252
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 719 <== SourceLine 253
                    DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 722 <== SourceLine 254
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 725 <== SourceLine 255
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 728 <== SourceLine 256
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 731 <== SourceLine 257
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 734 <== SourceLine 258
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 737 <== SourceLine 259
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 740 <== SourceLine 260
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 743 <== SourceLine 261
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 746 <== SourceLine 262
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 749 <== SourceLine 263
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 752 <== SourceLine 264
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 755 <== SourceLine 265
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 758 <== SourceLine 266
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 761 <== SourceLine 267
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 764 <== SourceLine 268
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 767 <== SourceLine 269
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 770 <== SourceLine 270
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 773 <== SourceLine 271
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 776 <== SourceLine 272
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 779 <== SourceLine 273
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 782 <== SourceLine 274
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 785 <== SourceLine 275
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 788 <== SourceLine 276
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 791 <== SourceLine 277
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 794 <== SourceLine 89
                predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 797 <== SourceLine 91
                dummygen_2=false;
                ;
                // JavaLine 800 <== SourceLine 96
                {
                    // BEGIN INSPECTION 
                    _inspect_96_4514_5=((PARSER_grammer)new PARSER_grammer((_CUR))._START());
                    if(_inspect_96_4514_5!=null) { // INSPECT _inspect_96_4514_5
                        // JavaLine 805 <== SourceLine 97
                        {
                            // JavaLine 807 <== SourceLine 96
                            {
                                // JavaLine 809 <== SourceLine 98
                                parser=((COMMON_component)_inspect_96_4514_5);
                                ;
                                // JavaLine 812 <== SourceLine 100
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 815 <== SourceLine 101
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 818 <== SourceLine 102
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 821 <== SourceLine 103
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 824 <== SourceLine 104
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 827 <== SourceLine 105
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 830 <== SourceLine 106
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 833 <== SourceLine 107
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 836 <== SourceLine 108
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 839 <== SourceLine 109
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 842 <== SourceLine 110
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 845 <== SourceLine 111
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 848 <== SourceLine 112
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 851 <== SourceLine 113
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 854 <== SourceLine 118
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 857 <== SourceLine 119
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 860 <== SourceLine 120
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 863 <== SourceLine 121
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 866 <== SourceLine 122
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 869 <== SourceLine 123
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 872 <== SourceLine 124
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 875 <== SourceLine 125
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 878 <== SourceLine 126
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 881 <== SourceLine 127
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 884 <== SourceLine 128
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 887 <== SourceLine 129
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 890 <== SourceLine 130
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 893 <== SourceLine 131
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 896 <== SourceLine 132
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 899 <== SourceLine 133
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 902 <== SourceLine 134
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 905 <== SourceLine 135
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 908 <== SourceLine 136
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 911 <== SourceLine 137
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 914 <== SourceLine 138
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 917 <== SourceLine 147
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 920 <== SourceLine 148
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 923 <== SourceLine 149
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 926 <== SourceLine 150
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 929 <== SourceLine 151
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 932 <== SourceLine 152
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 935 <== SourceLine 153
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 938 <== SourceLine 157
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 941 <== SourceLine 158
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 944 <== SourceLine 159
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 947 <== SourceLine 160
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 950 <== SourceLine 161
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 953 <== SourceLine 162
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 956 <== SourceLine 163
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 959 <== SourceLine 164
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 962 <== SourceLine 168
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 965 <== SourceLine 169
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 968 <== SourceLine 170
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 971 <== SourceLine 171
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 974 <== SourceLine 172
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 977 <== SourceLine 173
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 985 <== SourceLine 179
                call(parser,179);
                ;
                // JavaLine 988 <== SourceLine 185
                {
                    // BEGIN INSPECTION 
                    _inspect_185_4515_5=((SCANNER_recognizer)new SCANNER_recognizer((_CUR))._START());
                    if(_inspect_185_4515_5!=null) { // INSPECT _inspect_185_4515_5
                        // JavaLine 993 <== SourceLine 186
                        {
                            // JavaLine 995 <== SourceLine 185
                            {
                                // JavaLine 997 <== SourceLine 186
                                lexScanner_2=((SCANNER_recognizer)(scanner=((COMMON_component)_inspect_185_4515_5)));
                                ;
                                _inspect_185_4515_5.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(i_5=35;i_5<=255;i_5++) {
                                    // JavaLine 1003 <== SourceLine 188
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)7));
                                }
                                ;
                                // JavaLine 1007 <== SourceLine 190
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(0),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(127),((char)9)));
                                ;
                                for(i_5=1;i_5<=7;i_5++) {
                                    // JavaLine 1011 <== SourceLine 192
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=14;i_5<=31;i_5++) {
                                    // JavaLine 1016 <== SourceLine 193
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=8;i_5<=13;i_5++) {
                                    // JavaLine 1021 <== SourceLine 195
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)6));
                                }
                                ;
                                // JavaLine 1025 <== SourceLine 196
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1028 <== SourceLine 198
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1031 <== SourceLine 200
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(34),((char)4));
                                ;
                                for(i_5=38;i_5<=47;i_5++) {
                                    // JavaLine 1035 <== SourceLine 201
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=58;i_5<=62;i_5++) {
                                    // JavaLine 1040 <== SourceLine 202
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=48;i_5<=57;i_5++) {
                                    // JavaLine 1045 <== SourceLine 204
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)2));
                                }
                                ;
                                for(i_5=65;i_5<=90;i_5++) {
                                    // JavaLine 1050 <== SourceLine 206
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                for(i_5=97;i_5<=122;i_5++) {
                                    // JavaLine 1055 <== SourceLine 207
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                // JavaLine 1059 <== SourceLine 209
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(67),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1062 <== SourceLine 211
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1065 <== SourceLine 213
                                _inspect_185_4515_5.IdScanner_1=((SCANNER_recognizer_identifierScanner)new SCANNER_recognizer_identifierScanner(_inspect_185_4515_5)._START());
                                ;
                                // JavaLine 1068 <== SourceLine 214
                                _inspect_185_4515_5.unsignedInt_1=((SCANNER_recognizer_unsignedInteger)new SCANNER_recognizer_unsignedInteger(_inspect_185_4515_5)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1076 <== SourceLine 220
                signiflength=255;
                ;
                // JavaLine 1079 <== SourceLine 221
                cursource_2=((SCANNER_SourceElt)new SCANNER_SourceElt((_CUR),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1082 <== SourceLine 222
                incrlnr_2=true;
                ;
                // JavaLine 1085 <== SourceLine 226
                if(_VALUE(TRF_EQ(L2NAME,null))) {
                    new ERRMSG_openerror((_CUR),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1090 <== SourceLine 227
                {
                    // BEGIN INSPECTION 
                    _inspect_227_4516_5=((SCANNER_L2Coder)new SCANNER_L2Coder((_CUR),L2NAME)._START());
                    if(_inspect_227_4516_5!=null) { // INSPECT _inspect_227_4516_5
                        // JavaLine 1095 <== SourceLine 228
                        {
                            // JavaLine 1097 <== SourceLine 227
                            {
                                // JavaLine 1099 <== SourceLine 228
                                P1coder_2=((SCANNER_L2Coder)_inspect_227_4516_5);
                                ;
                                coder=P1coder_2;
                                ;
                                // JavaLine 1104 <== SourceLine 232
                                brctab.putELEMENT(brctab.index(0),new COMMON_brctab2((_CUR))._STM());
                                ;
                                // JavaLine 1107 <== SourceLine 233
                                if(_VALUE((!((option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1110 <== SourceLine 234
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_234_4517_5=new COMMON_brecord((_CUR))._STM();
                                            if(_inspect_234_4517_5!=null) { // INSPECT _inspect_234_4517_5
                                                // JavaLine 1115 <== SourceLine 235
                                                {
                                                    // JavaLine 1117 <== SourceLine 234
                                                    {
                                                        // JavaLine 1119 <== SourceLine 235
                                                        _inspect_234_4517_5.kind=((char)13);
                                                        ;
                                                        brctab.getELEMENT(0).val.putELEMENT(brctab.getELEMENT(0).val.index(0),((COMMON_brecord)_inspect_234_4517_5));
                                                        ;
                                                        // JavaLine 1124 <== SourceLine 236
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_236_4518_5=new COMMON_quantity((_CUR))._STM();
                                                            if(_inspect_236_4518_5!=null) { // INSPECT _inspect_236_4518_5
                                                                // JavaLine 1129 <== SourceLine 237
                                                                {
                                                                    // JavaLine 1131 <== SourceLine 236
                                                                    {
                                                                        // JavaLine 1133 <== SourceLine 237
                                                                        _inspect_234_4517_5.fpar=((COMMON_quantity)_inspect_236_4518_5);
                                                                        ;
                                                                        // JavaLine 1136 <== SourceLine 238
                                                                        _inspect_236_4518_5.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1139 <== SourceLine 239
                                                                        _inspect_236_4518_5.type_1=((char)14);
                                                                        ;
                                                                        _inspect_236_4518_5.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1144 <== SourceLine 240
                                                                        _inspect_236_4518_5.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1147 <== SourceLine 244
                                                                        _inspect_236_4518_5.symb_1=new COMMON_boxof((_CUR),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1150 <== SourceLine 245
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
                                // JavaLine 1166 <== SourceLine 252
                                nextbllo=((char)1);
                                ;
                                // JavaLine 1169 <== SourceLine 253
                                new SCANNER_L2Coder_brecinit(_inspect_227_4516_5,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1177 <== SourceLine 257
                // BEGIN INNER PART
                // JavaLine 1179 <== SourceLine 797
                // BEGIN INNER PART
                // JavaLine 1181 <== SourceLine 1883
                // BEGIN INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","8 BUILDER2",1,3,10,70,13,136,28,1322,30,998,32,2395,34,89,36,2697,38,33,43,37,46,38,49,40,52,41,55,42,58,43,61,44,64,45,69,50,74,51,77,52,82,53,86,54,91,55,93,54,95,55,100,56,103,57,109,58,122,61,125,65,128,66,132,67,137,68,146,70,152,71,157,73,160,74,163,77,166,78,169,2,172,6,175,8,179,9,184,10,188,13,193,14,274,103,278,106,283,107,285,106,287,107,290,108,293,109,296,110,299,112,301,113,306,114,308,113,310,114,313,116,329,122,332,123,335,124,342,126,345,128,350,130,353,131,356,132,359,133,362,134,365,135,368,136,371,137,374,138,377,139,380,140,383,141,386,142,389,143,392,144,395,145,398,146,401,147,404,148,407,149,410,150,413,151,416,152,419,153,422,154,425,155,428,156,431,157,434,158,437,159,440,160,443,161,446,162,449,163,452,164,455,165,458,166,461,167,464,168,467,169,470,170,473,171,476,172,479,173,482,174,485,175,488,176,491,177,494,178,497,179,500,180,503,181,506,182,509,183,512,184,515,185,518,186,521,187,524,188,527,189,530,190,533,191,536,192,539,193,542,194,545,195,548,196,551,197,554,198,557,199,560,200,563,201,566,202,569,203,572,204,575,205,578,206,581,207,584,208,587,209,590,210,593,211,596,212,599,213,602,214,605,215,608,216,611,217,614,218,617,219,620,220,623,221,626,222,629,223,632,224,635,225,638,226,641,227,644,228,647,229,650,230,653,231,656,232,659,233,662,234,665,235,668,236,671,237,674,238,677,239,680,240,683,241,686,242,689,243,692,244,695,245,698,246,701,247,704,248,707,249,710,250,713,251,716,252,719,253,722,254,725,255,728,256,731,257,734,258,737,259,740,260,743,261,746,262,749,263,752,264,755,265,758,266,761,267,764,268,767,269,770,270,773,271,776,272,779,273,782,274,785,275,788,276,791,277,794,89,797,91,800,96,805,97,807,96,809,98,812,100,815,101,818,102,821,103,824,104,827,105,830,106,833,107,836,108,839,109,842,110,845,111,848,112,851,113,854,118,857,119,860,120,863,121,866,122,869,123,872,124,875,125,878,126,881,127,884,128,887,129,890,130,893,131,896,132,899,133,902,134,905,135,908,136,911,137,914,138,917,147,920,148,923,149,926,150,929,151,932,152,935,153,938,157,941,158,944,159,947,160,950,161,953,162,956,163,959,164,962,168,965,169,968,170,971,171,974,172,977,173,985,179,988,185,993,186,995,185,997,186,1003,188,1007,190,1011,192,1016,193,1021,195,1025,196,1028,198,1031,200,1035,201,1040,202,1045,204,1050,206,1055,207,1059,209,1062,211,1065,213,1068,214,1076,220,1079,221,1082,222,1085,226,1090,227,1095,228,1097,227,1099,228,1104,232,1107,233,1110,234,1115,235,1117,234,1119,235,1124,236,1129,237,1131,236,1133,237,1136,238,1139,239,1144,240,1147,244,1150,245,1166,252,1169,253,1177,257,1179,797,1181,1883,1200,1883);
} // End of Class
