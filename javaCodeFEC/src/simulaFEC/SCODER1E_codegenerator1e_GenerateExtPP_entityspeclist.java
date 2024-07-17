// JavaLine 1 <== SourceLine 138
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:40 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=138, lastLine=246, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 139
    public COMMON_quantity qty=null;
    public int i=0;
    public int kk=0;
    // JavaLine 14 <== SourceLine 140
    public RTS_INTEGER_ARRAY atrdestag=null;
    // JavaLine 16 <== SourceLine 188
    public COMMON_quantity _inspect_188_4638=null;
    // Normal Constructor
    public SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        // JavaLine 24 <== SourceLine 140
        atrdestag=new RTS_INTEGER_ARRAY(new RTS_BOUNDS(0,((SCODER1E_codegenerator1e)(_CUR._SL._SL)).nent_7));
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist _STM() {
        // JavaLine 31 <== SourceLine 188
        {
            // BEGIN INSPECTION 
            _inspect_188_4638=((SCODER1E_codegenerator1e_GenerateExtPP)(_CUR._SL)).p_q;
            if(_inspect_188_4638!=null) { // INSPECT _inspect_188_4638
                // JavaLine 36 <== SourceLine 189
                {
                    // JavaLine 38 <== SourceLine 188
                    {
                        // JavaLine 40 <== SourceLine 189
                        if(_VALUE(((_inspect_188_4638.kind_1==(((char)1)))&&((_inspect_188_4638.plev_1==(2)))))) {
                            {
                                // JavaLine 43 <== SourceLine 191
                                if(_VALUE((_inspect_188_4638.prefqual_1.type_1!=(((char)14))))) {
                                    {
                                        // JavaLine 46 <== SourceLine 193
                                        new SCODER1E_codegenerator1e_identifiertag((_CUR._SL._SL),_inspect_188_4638.symb_1);
                                        ;
                                        qty=((COMMON_quantity)_inspect_188_4638);
                                        ;
                                        // JavaLine 51 <== SourceLine 194
                                        new SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesHead((_CUR));
                                        ;
                                        // JavaLine 54 <== SourceLine 195
                                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(17);
                                        ;
                                        // JavaLine 57 <== SourceLine 196
                                        new SCODER0_codegenerator0_outtag((_CUR._SL._SL),((SCODER1E_codegenerator1e)(_CUR._SL._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_188_4638.type_1)));
                                        ;
                                        // JavaLine 60 <== SourceLine 197
                                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u007f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00013")));
                                        ;
                                        // JavaLine 63 <== SourceLine 200
                                        kk=RTS_ENVIRONMENT.rank(_inspect_188_4638.kind_1);
                                        ;
                                        new SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesTail((_CUR));
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 74 <== SourceLine 204
                        qty=_inspect_188_4638.descr_1.fpar;
                        ;
                        // JavaLine 77 <== SourceLine 205
                        while((qty!=(null))) {
                            {
                                // JavaLine 80 <== SourceLine 206
                                new SCODER1E_codegenerator1e_identifiertag((_CUR._SL._SL),qty.symb_1);
                                ;
                                qty=((COMMON_quantity)(qty.next));
                                ;
                            }
                        }
                        ;
                        // JavaLine 88 <== SourceLine 209
                        qty=_inspect_188_4638.descr_1.fpar;
                        ;
                        // JavaLine 91 <== SourceLine 210
                        while((qty!=(null))) {
                            {
                                // JavaLine 94 <== SourceLine 211
                                new SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesHead((_CUR));
                                ;
                                // JavaLine 97 <== SourceLine 212
                                kk=RTS_ENVIRONMENT.rank(qty.kind_1);
                                ;
                                // JavaLine 100 <== SourceLine 213
                                if(_VALUE((((qty.type_1==(((char)11)))||((kk==(RTS_ENVIRONMENT.rank(((char)5))))))||(((kk==(RTS_ENVIRONMENT.rank(((char)1))))&&((qty.categ_1==(((char)3))))))))) {
                                    // JavaLine 102 <== SourceLine 216
                                    ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(24);
                                } else {
                                    // JavaLine 105 <== SourceLine 219
                                    if(_VALUE(_IS(qty,COMMON_extquantity.class))) {
                                        // JavaLine 107 <== SourceLine 220
                                        {
                                            ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(24);
                                            ;
                                            kk=1;
                                        }
                                    } else {
                                        // JavaLine 114 <== SourceLine 221
                                        {
                                            ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(17);
                                            ;
                                            // JavaLine 118 <== SourceLine 222
                                            new SCODER0_codegenerator0_outtag((_CUR._SL._SL),(qty.ftag_1+(0)));
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 125 <== SourceLine 224
                                ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u007f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                                ;
                                // JavaLine 128 <== SourceLine 226
                                ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte((RTS_ENVIRONMENT.rank(qty.categ_1)+(48)));
                                ;
                                // JavaLine 131 <== SourceLine 227
                                new SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesTail((_CUR));
                                ;
                                // JavaLine 134 <== SourceLine 228
                                qty=((COMMON_quantity)(qty.next));
                                ;
                            }
                        }
                        ;
                        // JavaLine 140 <== SourceLine 233
                        ((SCODER1E_codegenerator1e_GenerateExtPP)(_CUR._SL)).atrvec_tag=new BUILDER1_newTTag((_CUR._SL._SL._SL),new RTS_TXT("atrvec"))._RESULT;
                        // JavaLine 142 <== SourceLine 234
                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(53);
                        ;
                        new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL),((SCODER1E_codegenerator1e_GenerateExtPP)(_CUR._SL)).atrvec_tag);
                        ;
                        // JavaLine 147 <== SourceLine 235
                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("\u0000y"),new RTS_TXT("\b")));
                        ;
                        // JavaLine 150 <== SourceLine 236
                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).out2byte(((SCODER1E_codegenerator1e)(_CUR._SL._SL)).nent_7);
                        ;
                        // JavaLine 153 <== SourceLine 237
                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000y")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000z")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                        ;
                        // JavaLine 156 <== SourceLine 240
                        new SCODER0_codegenerator0_outsint((_CUR._SL._SL),((SCODER1E_codegenerator1e)(_CUR._SL._SL)).nent_7);
                        ;
                        // JavaLine 159 <== SourceLine 241
                        ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000{")),new RTS_TXT("\u0000\b")));
                            ;
                            for(i=1;i<=((SCODER1E_codegenerator1e)(_CUR._SL._SL)).nent_7;i++) {
                                // JavaLine 163 <== SourceLine 242
                                {
                                    // JavaLine 165 <== SourceLine 243
                                    ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(18);
                                    ;
                                    new SCODER0_codegenerator0_outtag((_CUR._SL._SL),atrdestag.getELEMENT(i));
                                }
                            }
                            ;
                            // JavaLine 172 <== SourceLine 244
                            ((SCODER1E_codegenerator1e)(_CUR._SL._SL)).outbyte(9);
                            ;
                        }
                    }
                }
            } // END INSPECTION
            ;
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1E.sim","5 entityspeclist",1,138,10,139,14,140,16,188,24,140,31,188,36,189,38,188,40,189,43,191,46,193,51,194,54,195,57,196,60,197,63,200,74,204,77,205,80,206,88,209,91,210,94,211,97,212,100,213,102,216,105,219,107,220,114,221,118,222,125,224,128,226,131,227,134,228,140,233,142,234,147,235,150,236,153,237,156,240,159,241,163,242,165,243,172,244,182,246);
    } // End of Procedure
