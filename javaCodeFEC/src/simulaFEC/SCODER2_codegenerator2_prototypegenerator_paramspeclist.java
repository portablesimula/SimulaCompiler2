// JavaLine 1 <== SourceLine 465
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_prototypegenerator_paramspeclist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=465, lastLine=598, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 466
    public int i=0;
    public int ttag=0;
    // JavaLine 14 <== SourceLine 467
    public RTS_INTEGER_ARRAY atrdestag=null;
    // JavaLine 16 <== SourceLine 468
    public COMMON_quantity qty=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER2_codegenerator2_prototypegenerator_paramspeclist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER2_codegenerator2_prototypegenerator_paramspeclist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER2_codegenerator2_prototypegenerator_paramspeclist(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        // JavaLine 41 <== SourceLine 467
        atrdestag=new RTS_INTEGER_ARRAY(new RTS_BOUNDS(0,((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7));
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_prototypegenerator_paramspeclist _STM() {
        // JavaLine 48 <== SourceLine 478
        {
            // JavaLine 50 <== SourceLine 479
            if(_VALUE(((SCODER2)(_CUR._SL._SL._SL)).simob_entity)) {
                new SCODER1E_codegenerator1e_SetParamTags((_CUR._SL._SL),p_q);
            }
            ;
            // JavaLine 55 <== SourceLine 480
            qty=p_q.prefqual_1.descr_1.fpar;
            ;
            // JavaLine 58 <== SourceLine 481
            i=1;
            ;
            // JavaLine 61 <== SourceLine 482
            while((i<=(((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7))) {
                {
                    // JavaLine 64 <== SourceLine 483
                    if(_VALUE((qty.categ_1!=(((char)2))))) {
                        // JavaLine 66 <== SourceLine 485
                        atrdestag.putELEMENT(atrdestag.index(i),new BUILDER1_newTTag((_CUR._SL._SL._SL),CONC(CONC(new COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("\u005fpar")),RTS_ENVIRONMENT.edit(i)))._RESULT);
                    } else {
                        // JavaLine 69 <== SourceLine 486
                        atrdestag.putELEMENT(atrdestag.index(i),(qty.ftag_1+(1)));
                    }
                    ;
                    // JavaLine 73 <== SourceLine 488
                    if(_VALUE(((qty.type_1==(((char)7)))||((qty.type_1==(((char)9))))))) {
                        {
                            // JavaLine 76 <== SourceLine 489
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),489,new RTS_TXT("CONST"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),atrdestag.getELEMENT(i))._RESULT,new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0082"))._RESULT),new RTS_TXT(" C-RECORD ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0082"))._RESULT));
                            ;
                            // JavaLine 79 <== SourceLine 490
                            if(_VALUE(((SCODER2)(_CUR._SL._SL._SL)).simob_entity)) {
                                // JavaLine 81 <== SourceLine 491
                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),491,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007d"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),qty.symb_1.idtag)._RESULT));
                            } else {
                                // JavaLine 84 <== SourceLine 492
                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),492,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007d"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                            }
                        }
                    } else {
                        // JavaLine 89 <== SourceLine 493
                        {
                            // JavaLine 91 <== SourceLine 494
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),494,new RTS_TXT("CONST"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),atrdestag.getELEMENT(i))._RESULT,new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007c"))._RESULT),new RTS_TXT(" C-RECORD ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007c"))._RESULT));
                            ;
                            // JavaLine 94 <== SourceLine 495
                            if(_VALUE(((SCODER2)(_CUR._SL._SL._SL)).simob_entity)) {
                                // JavaLine 96 <== SourceLine 496
                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),496,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007d"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),qty.symb_1.idtag)._RESULT));
                            } else {
                                // JavaLine 99 <== SourceLine 497
                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),497,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007d"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                            }
                        }
                    }
                    ;
                    // JavaLine 105 <== SourceLine 500
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(53);
                    ;
                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),atrdestag.getELEMENT(i));
                    ;
                    // JavaLine 110 <== SourceLine 501
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(((((qty.type_1==(((char)7)))||((qty.type_1==(((char)9))))))?(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u0082"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u0082")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u007d")),new RTS_TXT("\u0000\b"))):(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u007c"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u007c")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u007d")),new RTS_TXT("\u0000\b")))));
                    ;
                    // JavaLine 113 <== SourceLine 510
                    if(_VALUE(((SCODER2)(_CUR._SL._SL._SL)).simob_entity)) {
                        {
                            // JavaLine 116 <== SourceLine 511
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(18);
                            ;
                            new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),qty.symb_1.idtag);
                            ;
                        }
                    } else {
                        // JavaLine 123 <== SourceLine 512
                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(25);
                    }
                    ;
                    // JavaLine 127 <== SourceLine 514
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),514,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007e"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0007"))._RESULT),new RTS_TXT("  C-AADDR ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),(qty.ftag_1+(0)))._RESULT));
                    ;
                    // JavaLine 130 <== SourceLine 515
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u007e")),new RTS_TXT("\u0000\u0007")),new RTS_TXT("\u0011")));
                    ;
                    // JavaLine 133 <== SourceLine 516
                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),(qty.ftag_1+(0)));
                    ;
                    // JavaLine 136 <== SourceLine 518
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),518,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u007f"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT categ=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(qty.categ_1))));
                    ;
                    // JavaLine 139 <== SourceLine 519
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u007f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                    ;
                    // JavaLine 142 <== SourceLine 520
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte((RTS_ENVIRONMENT.rank(qty.categ_1)+(48)));
                    ;
                    // JavaLine 145 <== SourceLine 522
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),522,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0080"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT kind=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(qty.kind_1))));
                    ;
                    // JavaLine 148 <== SourceLine 523
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0080")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                    ;
                    // JavaLine 151 <== SourceLine 524
                    if(_VALUE((qty.kind_1>(((char)7))))) {
                        new ERRMSG_internerr((_CUR._SL._SL._SL),((char)13),524);
                    }
                    ;
                    // JavaLine 156 <== SourceLine 525
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte((RTS_ENVIRONMENT.rank(qty.kind_1)+(48)));
                    ;
                    // JavaLine 159 <== SourceLine 527
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),527,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0081"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT type=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(qty.type_1))));
                    ;
                    // JavaLine 162 <== SourceLine 528
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0081")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                    ;
                    // JavaLine 165 <== SourceLine 529
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte((((qty.type_1>=(((char)10))))?(48):((RTS_ENVIRONMENT.rank(qty.type_1)+(48)))));
                    ;
                    // JavaLine 168 <== SourceLine 530
                    if(_VALUE(((qty.type_1==(((char)7)))||((qty.type_1==(((char)9))))))) {
                        {
                            // JavaLine 171 <== SourceLine 552
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),552,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0083"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),(qty.prefqual_1.ftag_1+(1)))._RESULT));
                            ;
                            // JavaLine 174 <== SourceLine 553
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0083")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
                            ;
                            // JavaLine 177 <== SourceLine 554
                            new SCODER0_codegenerator0_outtag((_CUR._SL._SL),(qty.prefqual_1.ftag_1+(1)));
                            ;
                        }
                    }
                    ;
                    // JavaLine 183 <== SourceLine 556
                    new SCODER0_codegenerator0_STRC2((_CUR._SL._SL),new RTS_TXT("SCODER2"),556,new RTS_TXT("ENDRECORD"));
                    ;
                    // JavaLine 186 <== SourceLine 557
                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(9);
                    ;
                    // JavaLine 189 <== SourceLine 559
                    qty=((COMMON_quantity)(qty.next));
                    ;
                    // JavaLine 192 <== SourceLine 560
                    i=(i+(1));
                    ;
                }
            }
            ;
            // JavaLine 198 <== SourceLine 565
            ((SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).atrvirvec=new BUILDER1_newTTag((_CUR._SL._SL._SL),CONC(new COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("\u005fatrvirvec")))._RESULT;
            // JavaLine 200 <== SourceLine 567
            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(53);
            ;
            new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).atrvirvec);
            ;
            // JavaLine 205 <== SourceLine 568
            if(_VALUE((((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7==(0)))) {
                {
                    // JavaLine 208 <== SourceLine 569
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),569,new RTS_TXT("CONST"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).atrvirvec)._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000y"))._RESULT),new RTS_TXT("  FIXREP 0")));
                    ;
                    // JavaLine 211 <== SourceLine 570
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),570,new RTS_TXT("C-RECORD"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000y"))._RESULT);
                    ;
                    // JavaLine 214 <== SourceLine 571
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),571,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000z"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT 0")));
                    ;
                    // JavaLine 217 <== SourceLine 572
                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),572,new RTS_TXT("   ATTR"),CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000{"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT));
                        ;
                        // JavaLine 220 <== SourceLine 573
                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000y"),new RTS_TXT("\b")),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\n")),new RTS_TXT("\u0000y")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000z")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000{")),new RTS_TXT("\u0000\b")));
                        }
                    } else {
                        // JavaLine 224 <== SourceLine 578
                        {
                            // JavaLine 226 <== SourceLine 579
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),579,new RTS_TXT("CONST"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),((SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).atrvirvec)._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000y"))._RESULT),new RTS_TXT("  FIXREP ")),RTS_ENVIRONMENT.edit(((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7)));
                            ;
                            // JavaLine 229 <== SourceLine 580
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),580,new RTS_TXT("C-RECORD"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000y"))._RESULT);
                            ;
                            // JavaLine 232 <== SourceLine 581
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),581,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000z"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT ")),RTS_ENVIRONMENT.edit(((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7)));
                            ;
                            // JavaLine 235 <== SourceLine 582
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("\u0000y"),new RTS_TXT("\b")));
                            ;
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).out2byte(((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7);
                            ;
                            // JavaLine 240 <== SourceLine 583
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000y")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000z")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                            ;
                            // JavaLine 243 <== SourceLine 586
                            new SCODER0_codegenerator0_outsint((_CUR._SL._SL),((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7);
                            ;
                            // JavaLine 246 <== SourceLine 587
                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),587,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000{"))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  -- Value(s) on following lines")));
                                ;
                                // JavaLine 249 <== SourceLine 588
                                ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000{")),new RTS_TXT("\u0000\b")));
                                    ;
                                }
                            }
                            ;
                            for(i=1;i<=((SCODER2_codegenerator2)(_CUR._SL._SL)).npar_7;i++) {
                                // JavaLine 256 <== SourceLine 591
                                {
                                    // JavaLine 258 <== SourceLine 592
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),592,new RTS_TXT(""),CONC(new RTS_TXT("  C-OADDR  "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),atrdestag.getELEMENT(i))._RESULT));
                                    ;
                                    // JavaLine 261 <== SourceLine 593
                                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(18);
                                    ;
                                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),atrdestag.getELEMENT(i));
                                }
                            }
                            ;
                            // JavaLine 268 <== SourceLine 595
                            new SCODER0_codegenerator0_STRC2((_CUR._SL._SL),new RTS_TXT("SCODER2"),595,new RTS_TXT("ENDRECORD"));
                            ;
                            // JavaLine 271 <== SourceLine 596
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(9);
                            ;
                        }
                        ;
                        EBLK();
                        return(this);
                    } // End of Procedure BODY
                    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 paramspeclist",1,465,11,466,14,467,16,468,41,467,48,478,50,479,55,480,58,481,61,482,64,483,66,485,69,486,73,488,76,489,79,490,81,491,84,492,89,493,91,494,94,495,96,496,99,497,105,500,110,501,113,510,116,511,123,512,127,514,130,515,133,516,136,518,139,519,142,520,145,522,148,523,151,524,156,525,159,527,162,528,165,529,168,530,171,552,174,553,177,554,183,556,186,557,189,559,192,560,198,565,200,567,205,568,208,569,211,570,214,571,217,572,220,573,224,578,226,579,229,580,232,581,235,582,240,583,243,586,246,587,249,588,256,591,258,592,261,593,268,595,271,596,278,598);
                } // End of Procedure
