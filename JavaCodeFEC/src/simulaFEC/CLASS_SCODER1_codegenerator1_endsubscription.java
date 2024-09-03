// JavaLine 1 <== SourceLine 598
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_endsubscription extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=598, lastLine=674, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 626
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_endsubscription_Block604_Block607_Block615_TRANS_0=new RTS_LABEL(this,0,1,"TRANS"); // Local Label #1=TRANS At PrefixLevel 0
    // JavaLine 12 <== SourceLine 673
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_endsubscription_Block604_INDEXOUT_0=new RTS_LABEL(this,0,2,"INDEXOUT"); // Local Label #2=INDEXOUT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 599
    public int alowb=0;
    // JavaLine 17 <== SourceLine 603
    public CLASS_COMMON_quantity _inspect_603_4627=null;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_endsubscription(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_endsubscription _STM() {
        CLASS_SCODER1_codegenerator1_endsubscription _THIS=(CLASS_SCODER1_codegenerator1_endsubscription)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_603_4627=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curcall_6;
                    if(_inspect_603_4627!=null) { // INSPECT _inspect_603_4627  type=ref(QUANTITY)
                        // JavaLine 38 <== SourceLine 604
                        {
                            // JavaLine 40 <== SourceLine 603
                            {
                                // JavaLine 42 <== SourceLine 604
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),604,new RTS_TXT(""),CONC(new RTS_TXT("========== Endsubscription, curparno="),RTS_ENVIRONMENT.edit(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6)));
                                ;
                                // JavaLine 45 <== SourceLine 605
                                if(_VALUE((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6==(1)))) {
                                    {
                                        // JavaLine 48 <== SourceLine 607
                                        if(_VALUE((_inspect_603_4627.kind_1==(((char)6))))) {
                                            {
                                                // JavaLine 51 <== SourceLine 608
                                                alowb=_inspect_603_4627.descr_1.npar;
                                                ;
                                                // JavaLine 54 <== SourceLine 609
                                                _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_endsubscription_Block604_Block607_Block615_TRANS_0); // GOTO EVALUATED LABEL
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 60 <== SourceLine 611
                                        if(_VALUE(((CLASS_SCODER1)(_CUR._SL._SL)).BoundCheck_6)) {
                                            ;
                                        } else {
                                            // JavaLine 64 <== SourceLine 612
                                            if(_VALUE((_inspect_603_4627.special_1!=(((char)0))))) {
                                                // JavaLine 66 <== SourceLine 613
                                                {
                                                    // JavaLine 68 <== SourceLine 615
                                                    alowb=new CLASS_BUILDER1_getSAFEint((_CUR._SL._SL),_inspect_603_4627.descr_1.blnohi,_inspect_603_4627.descr_1.blnolo)._RESULT;
                                                    ;
                                                    // JavaLine 71 <== SourceLine 616
                                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),616,new RTS_TXT(""),CONC(new RTS_TXT("========== Endsubscription alowb="),RTS_ENVIRONMENT.edit(alowb)));
                                                    ;
                                                    // JavaLine 74 <== SourceLine 617
                                                    if(_VALUE((alowb<(0)))) {
                                                        {
                                                            // JavaLine 77 <== SourceLine 618
                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),618,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((-(alowb)))));
                                                            ;
                                                            // JavaLine 80 <== SourceLine 619
                                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),619,new RTS_TXT("ADD"));
                                                            ;
                                                            // JavaLine 83 <== SourceLine 620
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                                            ;
                                                            // JavaLine 86 <== SourceLine 621
                                                            new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),(-(alowb)));
                                                            ;
                                                            // JavaLine 89 <== SourceLine 622
                                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(98);
                                                            ;
                                                            // JavaLine 92 <== SourceLine 623
                                                            _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_endsubscription_Block604_INDEXOUT_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 98 <== SourceLine 625
                                                    {
                                                        _SIM_LABEL(1); // DeclaredIn: endsubscription -> endsubscription[externalIdent=CLASS_SCODER1_codegenerator1_endsubscription] Kind=5, QUAL=ProcedureDeclaration, HashCode=569944732
                                                        // JavaLine 101 <== SourceLine 626
                                                        if(_VALUE((alowb!=(0)))) {
                                                            {
                                                                // JavaLine 104 <== SourceLine 627
                                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),627,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit((((alowb<(10)))?((alowb+(304))):(alowb)))));
                                                                ;
                                                                // JavaLine 107 <== SourceLine 628
                                                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),628,new RTS_TXT("SUB"));
                                                                ;
                                                                // JavaLine 110 <== SourceLine 629
                                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                                                ;
                                                                // JavaLine 113 <== SourceLine 630
                                                                if(_VALUE((alowb<(10)))) {
                                                                    ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).out2byte((alowb+(304)));
                                                                } else {
                                                                    // JavaLine 117 <== SourceLine 631
                                                                    new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),alowb);
                                                                }
                                                                ;
                                                                // JavaLine 121 <== SourceLine 632
                                                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(99);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 128 <== SourceLine 634
                                                    _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_endsubscription_Block604_INDEXOUT_0); // GOTO EVALUATED LABEL
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 135 <== SourceLine 636
                                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),636,new RTS_TXT("ASSPAR"));
                                        ;
                                        // JavaLine 138 <== SourceLine 637
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),637,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00bd"))._RESULT);
                                        ;
                                        // JavaLine 141 <== SourceLine 638
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),638,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr1elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)))._RESULT);
                                        ;
                                        // JavaLine 144 <== SourceLine 639
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0003\u00bd")),new RTS_TXT("K")));
                                        ;
                                        // JavaLine 147 <== SourceLine 642
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(1));
                                        ;
                                        // JavaLine 150 <== SourceLine 643
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr1elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)));
                                        ;
                                    }
                                } else {
                                    // JavaLine 155 <== SourceLine 645
                                    if(_VALUE((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6==(2)))) {
                                        {
                                            // JavaLine 158 <== SourceLine 647
                                            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),647,new RTS_TXT("ASSPAR"));
                                            ;
                                            // JavaLine 161 <== SourceLine 648
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),648,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00b8"))._RESULT);
                                            ;
                                            // JavaLine 164 <== SourceLine 649
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),649,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr2elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)))._RESULT);
                                            ;
                                            // JavaLine 167 <== SourceLine 650
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0003\u00b8")),new RTS_TXT("K")));
                                            ;
                                            // JavaLine 170 <== SourceLine 653
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(1));
                                            ;
                                            // JavaLine 173 <== SourceLine 654
                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr2elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)));
                                        }
                                    } else {
                                        // JavaLine 177 <== SourceLine 655
                                        {
                                            // JavaLine 179 <== SourceLine 656
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),656,new RTS_TXT("ASSREP"),RTS_ENVIRONMENT.edit(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6));
                                            ;
                                            // JavaLine 182 <== SourceLine 657
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),657,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0003\u00b3"))._RESULT);
                                            ;
                                            // JavaLine 185 <== SourceLine 658
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),658,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr3elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)))._RESULT);
                                            ;
                                            // JavaLine 188 <== SourceLine 659
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(69);
                                            ;
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6);
                                            ;
                                            // JavaLine 193 <== SourceLine 660
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4-(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6));
                                            ;
                                            // JavaLine 196 <== SourceLine 661
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("F"),new RTS_TXT("\u0003\u00b3")),new RTS_TXT("K")));
                                            ;
                                            // JavaLine 199 <== SourceLine 664
                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).arr3elttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_603_4627.type_1)));
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 206 <== SourceLine 667
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),667,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                ;
                                // JavaLine 209 <== SourceLine 668
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),668,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001p"))._RESULT);
                                ;
                                // JavaLine 212 <== SourceLine 669
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")));
                                ;
                                // JavaLine 215 <== SourceLine 672
                                {
                                    _SIM_LABEL(2); // DeclaredIn: endsubscription -> endsubscription[externalIdent=CLASS_SCODER1_codegenerator1_endsubscription] Kind=5, QUAL=ProcedureDeclaration, HashCode=569944732
                                    ;
                                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 endsubscription",1,598,10,626,12,673,15,599,17,603,38,604,40,603,42,604,45,605,48,607,51,608,54,609,60,611,64,612,66,613,68,615,71,616,74,617,77,618,80,619,83,620,86,621,89,622,92,623,98,625,101,626,104,627,107,628,110,629,113,630,117,631,121,632,128,634,135,636,138,637,141,638,144,639,147,642,150,643,155,645,158,647,161,648,164,649,167,650,170,653,173,654,177,655,179,656,182,657,185,658,188,659,193,660,196,661,199,664,206,667,209,668,212,669,215,672,234,674);
} // End of Procedure
