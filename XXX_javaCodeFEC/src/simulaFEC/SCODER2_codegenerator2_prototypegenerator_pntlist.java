// JavaLine 1 <== SourceLine 332
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_prototypegenerator_pntlist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=332, lastLine=413, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_qty;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 333
    public COMMON_quantity q=null;
    public int t=0;
    public int i=0;
    public int firstconntag=0;
    public int lastconntag=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER2_codegenerator2_prototypegenerator_pntlist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER2_codegenerator2_prototypegenerator_pntlist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER2_codegenerator2_prototypegenerator_pntlist(RTS_RTObject _SL,COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_prototypegenerator_pntlist _STM() {
        // JavaLine 45 <== SourceLine 340
        {
            // JavaLine 47 <== SourceLine 345
            if(_VALUE((p_qty.descr_1.connests!=(0)))) {
                {
                    // JavaLine 50 <== SourceLine 346
                    firstconntag=new SCODER1_codegenerator1_firstcontag((_CUR._SL._SL),p_qty)._RESULT;
                    ;
                    // JavaLine 53 <== SourceLine 347
                    lastconntag=((firstconntag+(p_qty.descr_1.connests))-(1));
                    ;
                    // JavaLine 56 <== SourceLine 348
                    while((firstconntag<=(lastconntag))) {
                        {
                            // JavaLine 59 <== SourceLine 349
                            ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(17);
                            ;
                            new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),firstconntag);
                            ;
                            // JavaLine 64 <== SourceLine 350
                            firstconntag=(firstconntag+(1));
                        }
                    }
                    ;
                }
            }
            ;
            // JavaLine 72 <== SourceLine 353
            if(_VALUE((p_qty.kind_1==(((char)1))))) {
                {
                    if(_VALUE((p_qty.plev_1==(2)))) {
                        // JavaLine 76 <== SourceLine 354
                        {
                            // JavaLine 78 <== SourceLine 355
                            new SCODER2_codegenerator2_prototypegenerator_pntlist((_CUR._SL),p_qty.prefqual_1);
                            ;
                            // JavaLine 81 <== SourceLine 356
                            if(_VALUE((p_qty.type_1==(((char)7))))) {
                                {
                                    // JavaLine 84 <== SourceLine 357
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),357,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000@"))._RESULT));
                                    ;
                                    // JavaLine 87 <== SourceLine 358
                                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0000\u00ae")));
                                }
                            } else {
                                // JavaLine 91 <== SourceLine 359
                                if(_VALUE((p_qty.type_1==(((char)8))))) {
                                    {
                                        // JavaLine 94 <== SourceLine 360
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),360,new RTS_TXT(""),CONC(new RTS_TXT("C-DOT "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u00b1"))._RESULT));
                                        ;
                                        // JavaLine 97 <== SourceLine 361
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),361,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001:"))._RESULT));
                                        ;
                                        // JavaLine 100 <== SourceLine 362
                                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0015"),new RTS_TXT("\u0000\u00b1")),new RTS_TXT("\u0011")),new RTS_TXT("\u0001:")));
                                        ;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ;
            // JavaLine 111 <== SourceLine 366
            q=p_qty.descr_1.fpar;
            ;
            // JavaLine 114 <== SourceLine 367
            while((q!=(null))) {
                {
                    // JavaLine 117 <== SourceLine 368
                    if(_VALUE((q.kind_1==(((char)6))))) {
                        ;
                    } else {
                        // JavaLine 121 <== SourceLine 376
                        if(_VALUE(new SCODER2_codegenerator2_prototypegenerator_pointer((_CUR._SL),q)._RESULT)) {
                            {
                                // JavaLine 124 <== SourceLine 377
                                if(_VALUE(((q.categ_1!=(((char)2)))&&(((q.kind_1==(((char)2)))||(((q.kind_1==(((char)0)))&&((q.type_1==(((char)7))))))))))) {
                                    // JavaLine 126 <== SourceLine 380
                                    {
                                        // JavaLine 128 <== SourceLine 381
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),381,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),(q.ftag_1+(0)))._RESULT));
                                        ;
                                        // JavaLine 131 <== SourceLine 382
                                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(17);
                                        ;
                                        // JavaLine 134 <== SourceLine 383
                                        new SCODER0_codegenerator0_outtag((_CUR._SL._SL),(q.ftag_1+(0)));
                                    }
                                } else {
                                    // JavaLine 138 <== SourceLine 384
                                    {
                                        // JavaLine 140 <== SourceLine 385
                                        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),385,new RTS_TXT(""),CONC(new RTS_TXT("C-DOT "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),(q.ftag_1+(0)))._RESULT));
                                        ;
                                        // JavaLine 143 <== SourceLine 386
                                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outbyte(21);
                                        ;
                                        new SCODER0_codegenerator0_outtag((_CUR._SL._SL),(q.ftag_1+(0)));
                                        ;
                                        // JavaLine 148 <== SourceLine 387
                                        if(_VALUE((q.categ_1==(((char)2))))) {
                                            {
                                                // JavaLine 151 <== SourceLine 388
                                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),388,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001d"))._RESULT));
                                                ;
                                                // JavaLine 154 <== SourceLine 389
                                                ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0001d")));
                                            }
                                        } else {
                                            // JavaLine 158 <== SourceLine 390
                                            if(_VALUE((q.kind_1==(((char)0))))) {
                                                {
                                                    // JavaLine 161 <== SourceLine 391
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),391,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001:"))._RESULT));
                                                    ;
                                                    // JavaLine 164 <== SourceLine 392
                                                    ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0001:")));
                                                }
                                            } else {
                                                // JavaLine 168 <== SourceLine 393
                                                if(_VALUE((q.categ_1==(((char)0))))) {
                                                    {
                                                        // JavaLine 171 <== SourceLine 395
                                                        if(_VALUE((q.kind_1==(((char)1))))) {
                                                            // JavaLine 173 <== SourceLine 396
                                                            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),396,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001G"))._RESULT));
                                                        } else {
                                                            // JavaLine 176 <== SourceLine 397
                                                            if(_VALUE((q.kind_1==(((char)3))))) {
                                                                // JavaLine 178 <== SourceLine 398
                                                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),398,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001C"))._RESULT));
                                                            } else {
                                                                // JavaLine 181 <== SourceLine 399
                                                                new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER2"),399,new RTS_TXT(""),CONC(new RTS_TXT("C-AADDR "),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0001K"))._RESULT));
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 186 <== SourceLine 402
                                                        ((SCODER2_codegenerator2)(_CUR._SL._SL)).outtext((((q.kind_1==(((char)1))))?(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0001G"))):((((q.kind_1==(((char)3))))?(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0001C"))):(CONC(new RTS_TXT("\u0011"),new RTS_TXT("\u0001K")))))));
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                ;
                            }
                        }
                    }
                    ;
                    // JavaLine 200 <== SourceLine 410
                    q=((COMMON_quantity)(q.next));
                    ;
                }
            }
            ;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 pntlist",1,332,11,333,45,340,47,345,50,346,53,347,56,348,59,349,64,350,72,353,76,354,78,355,81,356,84,357,87,358,91,359,94,360,97,361,100,362,111,366,114,367,117,368,121,376,124,377,126,380,128,381,131,382,134,383,138,384,140,385,143,386,148,387,151,388,154,389,158,390,161,391,164,392,168,393,171,395,173,396,176,397,178,398,181,399,186,402,200,410,210,413);
} // End of Procedure
