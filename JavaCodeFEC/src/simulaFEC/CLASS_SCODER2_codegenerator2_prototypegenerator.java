// JavaLine 1 <== SourceLine 253
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_prototypegenerator extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=253, lastLine=896, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 258
    public CLASS_COMMON_quantity qty=null;
    // JavaLine 13 <== SourceLine 259
    public int navirt=0;
    // JavaLine 15 <== SourceLine 260
    public int npnt=0;
    // JavaLine 17 <== SourceLine 261
    public int reppnt=0;
    // JavaLine 19 <== SourceLine 262
    public int nrep=0;
    // JavaLine 21 <== SourceLine 263
    public int pntvec=0;
    // JavaLine 23 <== SourceLine 264
    public int rptvec=0;
    // JavaLine 25 <== SourceLine 265
    public int atrvirvec=0;
    // JavaLine 27 <== SourceLine 266
    public int ttag=0;
    // JavaLine 29 <== SourceLine 267
    public int pl=0;
    // JavaLine 31 <== SourceLine 268
    public int nconn=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER2_codegenerator2_prototypegenerator(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_prototypegenerator(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator _STM() {
        // JavaLine 61 <== SourceLine 601
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).noofprototypes_8=(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).noofprototypes_8+(1));
        ;
        // JavaLine 64 <== SourceLine 603
        {
            // JavaLine 66 <== SourceLine 604
            nconn=((((p_q.kind_1==(((char)1)))&&((p_q.plev_1==(2)))))?(p_q.prefqual_1.descr_1.connests):(p_q.descr_1.connests));
            ;
            // JavaLine 69 <== SourceLine 606
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).npar_7=p_q.descr_1.npar;
            ;
            navirt=p_q.descr_1.navirt;
            ;
            // JavaLine 74 <== SourceLine 607
            npnt=((CLASS_SCODER2_codegenerator2)(_CUR._SL)).nent_7=reppnt=nrep=0;
            ;
            new CLASS_SCODER2_codegenerator2_prototypegenerator_count((_CUR),p_q);
            ;
            // JavaLine 79 <== SourceLine 609
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).xpp_tag_7=0;
            ;
            // JavaLine 82 <== SourceLine 610
            if(_VALUE(((CLASS_SCODER2)(_CUR._SL._SL)).simob_descr)) {
                new CLASS_SCODER1E_codegenerator1e_GenerateExtPP((_CUR._SL),p_q);
            }
            ;
            // JavaLine 87 <== SourceLine 612
            if(_VALUE((npnt>(0)))) {
                {
                    // JavaLine 90 <== SourceLine 614
                    pntvec=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'pntvec")))._RESULT;
                    ;
                    // JavaLine 93 <== SourceLine 615
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),615,new RTS_TXT("CONST"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),pntvec)._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000e"))._RESULT),new RTS_TXT("  FIXREP ")),RTS_ENVIRONMENT.edit(npnt)));
                    ;
                    // JavaLine 96 <== SourceLine 616
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(53);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),pntvec);
                    ;
                    // JavaLine 101 <== SourceLine 617
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000e"),new RTS_TXT("\b")));
                    ;
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).out2byte(npnt);
                    ;
                    // JavaLine 106 <== SourceLine 618
                    if(_VALUE((nconn==(0)))) {
                        {
                            // JavaLine 109 <== SourceLine 619
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),619,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000e"))._RESULT);
                            ;
                            // JavaLine 112 <== SourceLine 620
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),620,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000f"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT 0")));
                            ;
                            // JavaLine 115 <== SourceLine 621
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000e")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000g")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        }
                    } else {
                        // JavaLine 119 <== SourceLine 626
                        {
                            // JavaLine 121 <== SourceLine 627
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),627,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000e"))._RESULT);
                            ;
                            // JavaLine 124 <== SourceLine 628
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),628,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000f"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT ")),RTS_ENVIRONMENT.edit(nconn)));
                            ;
                            // JavaLine 127 <== SourceLine 629
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000e")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                            ;
                            // JavaLine 130 <== SourceLine 632
                            new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),nconn);
                            ;
                            // JavaLine 133 <== SourceLine 633
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000g")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                            ;
                        }
                    }
                    ;
                    // JavaLine 139 <== SourceLine 636
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),636,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000g"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT ")),RTS_ENVIRONMENT.edit(npnt)));
                    ;
                    // JavaLine 142 <== SourceLine 637
                    new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),npnt);
                    ;
                    // JavaLine 145 <== SourceLine 638
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),638,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000h"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0007"))._RESULT),new RTS_TXT("  ... list of pointers")));
                    ;
                    // JavaLine 148 <== SourceLine 639
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000h")),new RTS_TXT("\u0000\u0007")));
                    ;
                    // JavaLine 151 <== SourceLine 640
                    new CLASS_SCODER2_codegenerator2_prototypegenerator_pntlist((_CUR),p_q);
                    ;
                    // JavaLine 154 <== SourceLine 641
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
                    ;
                    // JavaLine 157 <== SourceLine 642
                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),642,new RTS_TXT("ENDRECORD"));
                    ;
                }
            }
            ;
            // JavaLine 163 <== SourceLine 645
            if(_VALUE((nrep>(0)))) {
                {
                    // JavaLine 166 <== SourceLine 647
                    rptvec=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("rptvec"))._RESULT;
                    ;
                    // JavaLine 169 <== SourceLine 648
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(53);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),rptvec);
                    ;
                    // JavaLine 174 <== SourceLine 649
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000i"),new RTS_TXT("\b")));
                    ;
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).out2byte(nrep);
                    ;
                    // JavaLine 179 <== SourceLine 650
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000i")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000j")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                    ;
                    // JavaLine 182 <== SourceLine 652
                    new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),reppnt);
                    ;
                    // JavaLine 185 <== SourceLine 653
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000k")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                    ;
                    // JavaLine 188 <== SourceLine 654
                    new CLASS_SCODER0_codegenerator0_outinteger((_CUR._SL),nrep);
                    ;
                    // JavaLine 191 <== SourceLine 655
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000l")),new RTS_TXT("\u0000m")));
                    ;
                    // JavaLine 194 <== SourceLine 656
                    new CLASS_SCODER2_codegenerator2_prototypegenerator_replist((_CUR),p_q);
                    ;
                    // JavaLine 197 <== SourceLine 657
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
                    ;
                    // JavaLine 200 <== SourceLine 658
                    new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),658,new RTS_TXT(" +++++++++++++++++++++++ FORTSETT HER SEINERE !!!"));
                    ;
                    RTS_BASICIO.terminate_program();
                    ;
                }
            }
            ;
            // JavaLine 208 <== SourceLine 661
            if(_VALUE(((p_q.kind_1==(((char)1)))&&((((CLASS_SCODER2_codegenerator2)(_CUR._SL)).npar_7>(0)))))) {
                // JavaLine 210 <== SourceLine 662
                new CLASS_SCODER2_codegenerator2_prototypegenerator_paramspeclist((_CUR),p_q);
            } else {
                // JavaLine 213 <== SourceLine 664
                if(_VALUE((navirt>(0)))) {
                    {
                        // JavaLine 216 <== SourceLine 666
                        atrvirvec=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("atrvirvec"))._RESULT;
                        ;
                        // JavaLine 219 <== SourceLine 668
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),668,new RTS_TXT("CONST"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),atrvirvec)._RESULT,new RTS_TXT(" ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000q"))._RESULT),new RTS_TXT("FIXREP ")),RTS_ENVIRONMENT.edit(navirt)));
                        ;
                        // JavaLine 222 <== SourceLine 669
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),669,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000q"))._RESULT);
                        ;
                        // JavaLine 225 <== SourceLine 670
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),670,new RTS_TXT("  ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000r"))._RESULT,new RTS_TXT(" INT C-INT ")),RTS_ENVIRONMENT.edit(navirt)));
                        ;
                        // JavaLine 228 <== SourceLine 671
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),671,new RTS_TXT("  ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000s"))._RESULT,new RTS_TXT(" ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000t"))._RESULT));
                        ;
                        // JavaLine 231 <== SourceLine 672
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(53);
                        ;
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),atrvirvec);
                        ;
                        // JavaLine 236 <== SourceLine 673
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000q"),new RTS_TXT("\b")));
                        ;
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).out2byte(navirt);
                        ;
                        // JavaLine 241 <== SourceLine 674
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000q")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000r")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 244 <== SourceLine 677
                        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),navirt);
                        ;
                        // JavaLine 247 <== SourceLine 678
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000s")),new RTS_TXT("\u0000t")));
                        ;
                        // JavaLine 250 <== SourceLine 679
                        qty=p_q.descr_1.favirt;
                        ;
                        // JavaLine 253 <== SourceLine 680
                        while((qty!=(null))) {
                            {
                                // JavaLine 256 <== SourceLine 681
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),681,new RTS_TXT("  C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000t"))._RESULT);
                                ;
                                // JavaLine 259 <== SourceLine 682
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000t")));
                                ;
                                // JavaLine 262 <== SourceLine 683
                                if(qty.kind_1<((char)0) || qty.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(qty.kind_1) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    // JavaLine 266 <== SourceLine 684
                                    {
                                        // JavaLine 268 <== SourceLine 685
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000u")),new RTS_TXT("\u0000\b")));
                                        ;
                                        // JavaLine 271 <== SourceLine 686
                                        if(_VALUE((qty.match_1==(null)))) {
                                            {
                                                // JavaLine 274 <== SourceLine 687
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),687,new RTS_TXT("    ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000u"))._RESULT,new RTS_TXT(" OADDR ONONE")));
                                                ;
                                                // JavaLine 277 <== SourceLine 688
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                                            }
                                        } else {
                                            // JavaLine 281 <== SourceLine 689
                                            {
                                                // JavaLine 283 <== SourceLine 690
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),690,new RTS_TXT("    ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000u"))._RESULT,new RTS_TXT(" OADDR C-OADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.match_1.ftag_1+(1)))._RESULT));
                                                ;
                                                // JavaLine 286 <== SourceLine 691
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                                ;
                                                // JavaLine 289 <== SourceLine 692
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(qty.match_1.ftag_1+(1)));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 295 <== SourceLine 694
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000v")),new RTS_TXT("\u0000\b")));
                                        ;
                                        // JavaLine 298 <== SourceLine 695
                                        if(_VALUE(((qty.match_1==(null))||((qty.type_1!=(((char)7))))))) {
                                            {
                                                // JavaLine 301 <== SourceLine 696
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),696,new RTS_TXT("    ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000v"))._RESULT,new RTS_TXT(" OADDR ONONE")));
                                                ;
                                                // JavaLine 304 <== SourceLine 697
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                                            }
                                        } else {
                                            // JavaLine 308 <== SourceLine 698
                                            {
                                                // JavaLine 310 <== SourceLine 699
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),699,new RTS_TXT("    ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000v"))._RESULT,new RTS_TXT(" OADDR C-OADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.match_1.prefqual_1.ftag_1+(1)))._RESULT));
                                                ;
                                                // JavaLine 313 <== SourceLine 700
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                                ;
                                                // JavaLine 316 <== SourceLine 701
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(qty.match_1.prefqual_1.ftag_1+(1)));
                                            }
                                        }
                                    }
                                    break;
                                    case 3: 
                                    // JavaLine 323 <== SourceLine 704
                                    {
                                        // JavaLine 325 <== SourceLine 705
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000w")),new RTS_TXT("\u0000\n")));
                                        ;
                                        // JavaLine 328 <== SourceLine 706
                                        if(_VALUE((qty.match_1==(null)))) {
                                            {
                                                // JavaLine 331 <== SourceLine 707
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),707,new RTS_TXT("    ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000w"))._RESULT,new RTS_TXT(" PADDR NOWHERE")));
                                                ;
                                                // JavaLine 334 <== SourceLine 708
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(27);
                                            }
                                        } else {
                                            // JavaLine 338 <== SourceLine 709
                                            {
                                                // JavaLine 340 <== SourceLine 710
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),710,new RTS_TXT("    ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000w"))._RESULT,new RTS_TXT(" PADDR C-PADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.match_1.ftag_1+(0)))._RESULT));
                                                ;
                                                // JavaLine 343 <== SourceLine 711
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(20);
                                                ;
                                                // JavaLine 346 <== SourceLine 712
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(qty.match_1.ftag_1+(0)));
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 354 <== SourceLine 714
                                    {
                                        // JavaLine 356 <== SourceLine 715
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000x")),new RTS_TXT("\u0000\b")));
                                        ;
                                        // JavaLine 359 <== SourceLine 716
                                        if(_VALUE((qty.match_1==(null)))) {
                                            {
                                                // JavaLine 362 <== SourceLine 717
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),717,new RTS_TXT("    ATTR"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000x"))._RESULT,new RTS_TXT(" OADDR ONONE")));
                                                ;
                                                // JavaLine 365 <== SourceLine 718
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                                            }
                                        } else {
                                            // JavaLine 369 <== SourceLine 719
                                            {
                                                // JavaLine 371 <== SourceLine 720
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODE2"),720,new RTS_TXT("    ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000w"))._RESULT,new RTS_TXT(" OADDR C-OADDR ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.match_1.ftag_1+(0)))._RESULT));
                                                ;
                                                // JavaLine 374 <== SourceLine 721
                                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                                ;
                                                // JavaLine 377 <== SourceLine 722
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(qty.match_1.ftag_1+(0)));
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    default:
                                    // JavaLine 385 <== SourceLine 724
                                    new CLASS_BUILDER1_visiblegenerator_StopScode_1((_CUR._SL),((char)13),724);
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 390 <== SourceLine 727
                                qty=((CLASS_COMMON_quantity)(qty.next));
                                ;
                                // JavaLine 393 <== SourceLine 728
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODE2"),728,new RTS_TXT("  ENDRECORD"));
                                ;
                                // JavaLine 396 <== SourceLine 729
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
                                ;
                            }
                        }
                        ;
                        // JavaLine 402 <== SourceLine 731
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODE2"),731,new RTS_TXT("ENDRECORD"));
                        ;
                        // JavaLine 405 <== SourceLine 732
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
                        ;
                    }
                }
            }
            ;
            // JavaLine 412 <== SourceLine 737
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(53);
            ;
            // JavaLine 415 <== SourceLine 738
            if(_VALUE((p_q.kind_1==(((char)1))))) {
                {
                    // JavaLine 418 <== SourceLine 739
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),739,new RTS_TXT("CONST"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.prefqual_1.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005b"))._RESULT));
                    ;
                    // JavaLine 421 <== SourceLine 740
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),740,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005b"))._RESULT);
                    ;
                    // JavaLine 424 <== SourceLine 742
                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.prefqual_1.ftag_1+(1)));
                    ;
                    // JavaLine 427 <== SourceLine 743
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u005b"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u005b")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000U")),new RTS_TXT("\u0000\b")));
                }
            } else {
                // JavaLine 431 <== SourceLine 746
                {
                    // JavaLine 433 <== SourceLine 747
                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                    ;
                    // JavaLine 436 <== SourceLine 748
                    if(_VALUE((p_q.kind_1==(((char)8))))) {
                        {
                            // JavaLine 439 <== SourceLine 749
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),749,new RTS_TXT("CONST"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000Y"))._RESULT));
                            ;
                            // JavaLine 442 <== SourceLine 750
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),750,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000Y"))._RESULT);
                            ;
                            // JavaLine 445 <== SourceLine 751
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000Y"),new RTS_TXT("\n")),new RTS_TXT("\u0000Y")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000U")),new RTS_TXT("\u0000\b")));
                        }
                    } else {
                        // JavaLine 449 <== SourceLine 754
                        {
                            // JavaLine 451 <== SourceLine 755
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),755,new RTS_TXT("CONST"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005e"))._RESULT),new RTS_TXT(" FIXREP ")),RTS_ENVIRONMENT.edit((p_q.plev_1+(1)))));
                            ;
                            // JavaLine 454 <== SourceLine 756
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000\u005e"),new RTS_TXT("\b")));
                            ;
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).out2byte((p_q.plev_1+(1)));
                            ;
                            // JavaLine 459 <== SourceLine 757
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),757,new RTS_TXT("C-RECORD"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005e"))._RESULT);
                            ;
                            // JavaLine 462 <== SourceLine 759
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000\u005e")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000U")),new RTS_TXT("\u0000\b")));
                            ;
                        }
                    }
                    ;
                }
            }
            ;
            // JavaLine 471 <== SourceLine 764
            if(_VALUE((npnt!=(0)))) {
                // JavaLine 473 <== SourceLine 765
                {
                    // JavaLine 475 <== SourceLine 766
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),766,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000U"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  OADDR")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),pntvec)._RESULT));
                    ;
                    // JavaLine 478 <== SourceLine 767
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),pntvec);
                }
            } else {
                // JavaLine 484 <== SourceLine 768
                {
                    // JavaLine 486 <== SourceLine 769
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),769,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000U"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                    ;
                    // JavaLine 489 <== SourceLine 771
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                    ;
                }
            }
            ;
            // JavaLine 495 <== SourceLine 774
            if(_VALUE((nrep!=(0)))) {
                {
                    // JavaLine 498 <== SourceLine 775
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),775,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000V"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  OADDR")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),rptvec)._RESULT));
                    ;
                    // JavaLine 501 <== SourceLine 776
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000V")),new RTS_TXT("\u0000\b")));
                    ;
                    // JavaLine 504 <== SourceLine 777
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),rptvec);
                    ;
                    // JavaLine 509 <== SourceLine 778
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),778,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000W"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT));
                    ;
                    // JavaLine 512 <== SourceLine 779
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000W")),new RTS_TXT("\u0000\b")));
                    ;
                }
            } else {
                // JavaLine 517 <== SourceLine 780
                {
                    // JavaLine 519 <== SourceLine 782
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),782,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000V"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                    ;
                    // JavaLine 522 <== SourceLine 783
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000V")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0019")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000W")),new RTS_TXT("\u0000\b")));
                    ;
                }
            }
            ;
            // JavaLine 528 <== SourceLine 787
            if(_VALUE(((CLASS_SCODER2)(_CUR._SL._SL)).simob_descr)) {
                // JavaLine 530 <== SourceLine 788
                {
                    // JavaLine 532 <== SourceLine 789
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),789,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000W"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER2_codegenerator2)(_CUR._SL)).xpp_tag_7)._RESULT));
                    ;
                    // JavaLine 535 <== SourceLine 790
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                    ;
                    new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER2_codegenerator2)(_CUR._SL)).xpp_tag_7);
                }
            } else {
                // JavaLine 541 <== SourceLine 791
                {
                    // JavaLine 543 <== SourceLine 792
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),792,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000W"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                    ;
                    // JavaLine 546 <== SourceLine 793
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                    ;
                }
            }
            ;
            // JavaLine 552 <== SourceLine 796
            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),796,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000X"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\f"))._RESULT),new RTS_TXT("  C-SIZE  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(0)))._RESULT));
            ;
            // JavaLine 555 <== SourceLine 797
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000X")),new RTS_TXT("\u0000\f")),new RTS_TXT("\u000e")));
            ;
            // JavaLine 558 <== SourceLine 798
            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(0)));
            ;
            // JavaLine 561 <== SourceLine 800
            if(_VALUE((p_q.kind_1==(((char)8))))) {
                {
                    // JavaLine 564 <== SourceLine 801
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),801,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000Z"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(2)))._RESULT));
                    ;
                    // JavaLine 567 <== SourceLine 802
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000Z")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                    ;
                    // JavaLine 570 <== SourceLine 803
                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(2)));
                    ;
                }
            } else {
                // JavaLine 575 <== SourceLine 805
                if(_VALUE((p_q.kind_1==(((char)1))))) {
                    {
                        // JavaLine 578 <== SourceLine 806
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),806,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\\"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.prefqual_1.ftag_1+(2)))._RESULT));
                        ;
                        // JavaLine 581 <== SourceLine 807
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\\")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                        ;
                        // JavaLine 584 <== SourceLine 809
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),(p_q.prefqual_1.ftag_1+(2)));
                        ;
                        // JavaLine 587 <== SourceLine 811
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u005d")),new RTS_TXT("\u0000\b")));
                        ;
                        // JavaLine 590 <== SourceLine 812
                        if(_VALUE((((CLASS_SCODER2_codegenerator2)(_CUR._SL)).npar_7>(0)))) {
                            // JavaLine 592 <== SourceLine 813
                            {
                                // JavaLine 594 <== SourceLine 814
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),814,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005d"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),atrvirvec)._RESULT));
                                ;
                                // JavaLine 597 <== SourceLine 815
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                ;
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),atrvirvec);
                            }
                        } else {
                            // JavaLine 603 <== SourceLine 816
                            {
                                // JavaLine 605 <== SourceLine 817
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),817,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005d"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                                ;
                                // JavaLine 608 <== SourceLine 818
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 616 <== SourceLine 820
                    {
                        // JavaLine 618 <== SourceLine 823
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),823,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005f"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0003"))._RESULT),new RTS_TXT("  C-INT  ")),RTS_ENVIRONMENT.edit((p_q.plev_1-(1)))));
                        ;
                        // JavaLine 621 <== SourceLine 824
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u005f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 624 <== SourceLine 825
                        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(p_q.plev_1-(1)));
                        ;
                        // JavaLine 627 <== SourceLine 827
                        if(_VALUE((p_q.descr_1.dcltag!=(((char)0))))) {
                            {
                                // JavaLine 630 <== SourceLine 828
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),828,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0060"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(2)))._RESULT));
                                ;
                                // JavaLine 633 <== SourceLine 829
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0060")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                                ;
                                // JavaLine 636 <== SourceLine 830
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(2)));
                            }
                        } else {
                            // JavaLine 640 <== SourceLine 831
                            {
                                // JavaLine 642 <== SourceLine 832
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),832,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0060"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  NOWHERE")));
                                ;
                                // JavaLine 645 <== SourceLine 833
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0060")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u001b")));
                                ;
                            }
                        }
                        ;
                        // JavaLine 651 <== SourceLine 835
                        if(_VALUE((p_q.descr_1.stmtag!=(((char)0))))) {
                            {
                                // JavaLine 654 <== SourceLine 836
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),836,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000a"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.stmtag))))._RESULT));
                                ;
                                // JavaLine 657 <== SourceLine 837
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000a")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                                ;
                                // JavaLine 660 <== SourceLine 838
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.stmtag))));
                                ;
                            }
                        } else {
                            // JavaLine 665 <== SourceLine 839
                            {
                                // JavaLine 667 <== SourceLine 840
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),840,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000a"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  NOWHERE")));
                                ;
                                // JavaLine 670 <== SourceLine 841
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000a")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u001b")));
                                ;
                            }
                        }
                        ;
                        // JavaLine 676 <== SourceLine 844
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000b")),new RTS_TXT("\u0000\n")),new RTS_TXT("\u0014")));
                        ;
                        // JavaLine 679 <== SourceLine 845
                        if(_VALUE((p_q.descr_1.inrtag!=(((char)0))))) {
                            {
                                // JavaLine 682 <== SourceLine 846
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),846,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000b"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.inrtag))))._RESULT));
                                ;
                                // JavaLine 685 <== SourceLine 847
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.inrtag))));
                                ;
                            }
                        } else {
                            // JavaLine 690 <== SourceLine 848
                            {
                                // JavaLine 692 <== SourceLine 849
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),849,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000b"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\n"))._RESULT),new RTS_TXT("  C-PADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),new CLASS_SCODER1_codegenerator1_getINRtag((_CUR._SL),p_q)._RESULT)._RESULT));
                                ;
                                // JavaLine 695 <== SourceLine 850
                                new CLASS_SCODER1_codegenerator1_outINRtag((_CUR._SL),p_q);
                                ;
                            }
                        }
                        ;
                        // JavaLine 701 <== SourceLine 853
                        if(_VALUE((navirt>(0)))) {
                            {
                                // JavaLine 704 <== SourceLine 854
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),854,new RTS_TXT("   ATTR"),CONC(CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000c"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  C-OADDR  ")),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),atrvirvec)._RESULT));
                                ;
                                // JavaLine 707 <== SourceLine 855
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000c")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
                                ;
                                // JavaLine 710 <== SourceLine 856
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),atrvirvec);
                                ;
                            }
                        } else {
                            // JavaLine 715 <== SourceLine 857
                            {
                                // JavaLine 717 <== SourceLine 858
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),858,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000c"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  ONONE")));
                                ;
                                // JavaLine 720 <== SourceLine 859
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000c")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0019")));
                                ;
                            }
                        }
                        ;
                        // JavaLine 726 <== SourceLine 862
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),862,new RTS_TXT("   ATTR"),CONC(CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000d"))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\b"))._RESULT),new RTS_TXT("  -- List on following lines")));
                        ;
                        // JavaLine 729 <== SourceLine 863
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000d")),new RTS_TXT("\u0000\b")));
                        ;
                        // JavaLine 732 <== SourceLine 866
                        ttag=(p_q.plev_1-(1));
                        ;
                        // JavaLine 735 <== SourceLine 867
                        if(_VALUE((ttag!=(0)))) {
                            {
                                // JavaLine 738 <== SourceLine 868
                                qty=p_q.prefqual_1;
                                ;
                                // JavaLine 741 <== SourceLine 869
                                while((qty.plev_1>(1))) {
                                    {
                                        // JavaLine 744 <== SourceLine 870
                                        ((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.index(qty.plev_1),qty);
                                        ;
                                        // JavaLine 747 <== SourceLine 871
                                        qty=qty.prefqual_1;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 753 <== SourceLine 872
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),872,new RTS_TXT(""),CONC(new RTS_TXT("  C-OADDR  "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.ftag_1+(1)))._RESULT));
                                ;
                                // JavaLine 756 <== SourceLine 873
                                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                ;
                                // JavaLine 759 <== SourceLine 874
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(qty.ftag_1+(1)));
                                ;
                                for(pl=2;pl<=ttag;pl++) {
                                    // JavaLine 763 <== SourceLine 875
                                    {
                                        // JavaLine 765 <== SourceLine 876
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),876,new RTS_TXT(""),CONC(new RTS_TXT("  C-OADDR  "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.getELEMENT(pl).ftag_1+(1)))._RESULT));
                                        ;
                                        // JavaLine 768 <== SourceLine 877
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                                        ;
                                        // JavaLine 771 <== SourceLine 878
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.getELEMENT(pl).ftag_1+(1)));
                                        ;
                                        // JavaLine 774 <== SourceLine 879
                                        ((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_SCODER2)(_CUR._SL._SL)).prefixchain.index(pl),null);
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 783 <== SourceLine 883
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),883,new RTS_TXT(""),CONC(new RTS_TXT("  C-OADDR  "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT));
                        ;
                        // JavaLine 786 <== SourceLine 884
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),884,new RTS_TXT(""),new RTS_TXT("  ONONE"));
                        ;
                        // JavaLine 789 <== SourceLine 885
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(18);
                        ;
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                        ;
                        // JavaLine 794 <== SourceLine 886
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(25);
                        ;
                    }
                }
            }
            ;
            // JavaLine 801 <== SourceLine 891
            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),891,new RTS_TXT("ENDRECORD"));
            ;
            // JavaLine 804 <== SourceLine 892
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
            ;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 prototypegenerator",1,253,11,258,13,259,15,260,17,261,19,262,21,263,23,264,25,265,27,266,29,267,31,268,61,601,64,603,66,604,69,606,74,607,79,609,82,610,87,612,90,614,93,615,96,616,101,617,106,618,109,619,112,620,115,621,119,626,121,627,124,628,127,629,130,632,133,633,139,636,142,637,145,638,148,639,151,640,154,641,157,642,163,645,166,647,169,648,174,649,179,650,182,652,185,653,188,654,191,655,194,656,197,657,200,658,208,661,210,662,213,664,216,666,219,668,222,669,225,670,228,671,231,672,236,673,241,674,244,677,247,678,250,679,253,680,256,681,259,682,262,683,266,684,268,685,271,686,274,687,277,688,281,689,283,690,286,691,289,692,295,694,298,695,301,696,304,697,308,698,310,699,313,700,316,701,323,704,325,705,328,706,331,707,334,708,338,709,340,710,343,711,346,712,354,714,356,715,359,716,362,717,365,718,369,719,371,720,374,721,377,722,385,724,390,727,393,728,396,729,402,731,405,732,412,737,415,738,418,739,421,740,424,742,427,743,431,746,433,747,436,748,439,749,442,750,445,751,449,754,451,755,454,756,459,757,462,759,471,764,473,765,475,766,478,767,484,768,486,769,489,771,495,774,498,775,501,776,504,777,509,778,512,779,517,780,519,782,522,783,528,787,530,788,532,789,535,790,541,791,543,792,546,793,552,796,555,797,558,798,561,800,564,801,567,802,570,803,575,805,578,806,581,807,584,809,587,811,590,812,592,813,594,814,597,815,603,816,605,817,608,818,616,820,618,823,621,824,624,825,627,827,630,828,633,829,636,830,640,831,642,832,645,833,651,835,654,836,657,837,660,838,665,839,667,840,670,841,676,844,679,845,682,846,685,847,690,848,692,849,695,850,701,853,704,854,707,855,710,856,715,857,717,858,720,859,726,862,729,863,732,866,735,867,738,868,741,869,744,870,747,871,753,872,756,873,759,874,763,875,765,876,768,877,771,878,774,879,783,883,786,884,789,885,794,886,801,891,804,892,811,896);
} // End of Procedure
