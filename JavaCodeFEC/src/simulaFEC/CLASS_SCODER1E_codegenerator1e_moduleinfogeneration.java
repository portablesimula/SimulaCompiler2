// JavaLine 1 <== SourceLine 284
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_moduleinfogeneration extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=284, lastLine=367, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 285
    public CLASS_COMMON_quantity q=null;
    public CLASS_BUILDER1_extmodule em=null;
    public RTS_TXT srcmod=null;
    // JavaLine 14 <== SourceLine 286
    public int sim_id_tag=0;
    public int source_tag=0;
    public int mod_id_tag=0;
    public int modvec_tag=0;
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_moduleinfogeneration(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_moduleinfogeneration _STM() {
        // JavaLine 30 <== SourceLine 288
        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).separatecomp)) {
            {
                // JavaLine 33 <== SourceLine 289
                q=((CLASS_SCODER1E)(_CUR._SL._SL)).display.getELEMENT(6).fpar;
                ;
                // JavaLine 36 <== SourceLine 290
                while((q.categ_1==(((char)4)))) {
                    q=((CLASS_COMMON_quantity)(q.next));
                }
                ;
                // JavaLine 41 <== SourceLine 292
                sim_id_tag=new CLASS_SCODER1E_codegenerator1e_identifiertag((_CUR._SL),q.symb_1)._RESULT;
                ;
            }
        }
        ;
        // JavaLine 47 <== SourceLine 294
        ((CLASS_SCODER1E)(_CUR._SL._SL)).simsymbol=RTS_ENVIRONMENT.getTextInfo(1);
        ;
        // JavaLine 50 <== SourceLine 295
        if(_VALUE(RTS_UTIL._TXTREL_NE(((CLASS_SCODER1E)(_CUR._SL._SL)).simsymbol,new RTS_TXT("sysin")))) {
            {
                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                ;
                // JavaLine 55 <== SourceLine 296
                source_tag=new CLASS_SCODER1E_codegenerator1e_identifiertag((_CUR._SL),new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_SCODER1E)(_CUR._SL._SL)).hashhi,((CLASS_SCODER1E)(_CUR._SL._SL)).hashlo)._RESULT)._RESULT;
                ;
            }
        }
        ;
        // JavaLine 61 <== SourceLine 297
        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).separatecomp)) {
            {
                // JavaLine 64 <== SourceLine 298
                ((CLASS_SCODER1E)(_CUR._SL._SL)).simsymbol=((CLASS_SCODER1E)(_CUR._SL._SL)).moduleident;
                ;
                new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
                ;
                // JavaLine 69 <== SourceLine 299
                mod_id_tag=new CLASS_SCODER1E_codegenerator1e_identifiertag((_CUR._SL),new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_SCODER1E)(_CUR._SL._SL)).hashhi,((CLASS_SCODER1E)(_CUR._SL._SL)).hashlo)._RESULT)._RESULT;
            }
        }
        ;
        // JavaLine 74 <== SourceLine 300
        if(_VALUE((((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6>(0)))) {
            // JavaLine 76 <== SourceLine 301
            {
                // JavaLine 78 <== SourceLine 302
                modvec_tag=new CLASS_BUILDER1_newTag((_CUR._SL._SL))._RESULT;
                ;
                // JavaLine 81 <== SourceLine 303
                modvec_tag=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("MODVEC"))._RESULT;
                // JavaLine 83 <== SourceLine 304
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(52);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),modvec_tag);
                ;
                // JavaLine 88 <== SourceLine 305
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0001\u008e"),new RTS_TXT("\b")));
                ;
                // JavaLine 91 <== SourceLine 306
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).out2byte(((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6);
                ;
            }
        }
        ;
        // JavaLine 97 <== SourceLine 309
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(53);
        ;
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).prototinfo_6);
        ;
        // JavaLine 102 <== SourceLine 310
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0001\u0085"),new RTS_TXT("\n")),new RTS_TXT("\u0001\u0085")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u0086")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 105 <== SourceLine 313
        if(_VALUE((((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6==(0)))) {
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        } else {
            // JavaLine 109 <== SourceLine 314
            {
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),modvec_tag);
            }
        }
        ;
        // JavaLine 117 <== SourceLine 315
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0087")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 120 <== SourceLine 316
        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).separatecomp)) {
            {
                // JavaLine 123 <== SourceLine 317
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),sim_id_tag);
            }
        } else {
            // JavaLine 129 <== SourceLine 318
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        }
        ;
        // JavaLine 133 <== SourceLine 319
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0088")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 136 <== SourceLine 320
        if(_VALUE((source_tag==(0)))) {
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        } else {
            // JavaLine 140 <== SourceLine 321
            {
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),source_tag);
            }
        }
        ;
        // JavaLine 148 <== SourceLine 322
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0089")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 151 <== SourceLine 323
        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).separatecomp)) {
            {
                // JavaLine 154 <== SourceLine 324
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),mod_id_tag);
            }
        } else {
            // JavaLine 160 <== SourceLine 325
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        }
        ;
        // JavaLine 164 <== SourceLine 327
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u008a")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u008b")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0003108")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u008c")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0003108")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u008d")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
        ;
        // JavaLine 167 <== SourceLine 336
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte((((CLASS_SCODER1E)(_CUR._SL._SL)).simob_level+(48)));
        ;
        // JavaLine 170 <== SourceLine 337
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(9);
        ;
        // JavaLine 173 <== SourceLine 339
        if(_VALUE((((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6>(0)))) {
            // JavaLine 175 <== SourceLine 340
            {
                // JavaLine 177 <== SourceLine 341
                em=((CLASS_SCODER1E)(_CUR._SL._SL)).firstextmodule_6;
                ;
                // JavaLine 180 <== SourceLine 342
                while((em!=(null))) {
                    {
                        // JavaLine 183 <== SourceLine 343
                        em.pptag=(em.qty.ftag_1+(1));
                        ;
                        em=em.next;
                        ;
                    }
                }
                ;
                // JavaLine 191 <== SourceLine 346
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(53);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),modvec_tag);
                ;
                // JavaLine 196 <== SourceLine 347
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0001\u008e"),new RTS_TXT("\b")));
                ;
                // JavaLine 199 <== SourceLine 348
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).out2byte(((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6);
                ;
                // JavaLine 202 <== SourceLine 349
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0001\u008e")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u008f")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                ;
                // JavaLine 205 <== SourceLine 352
                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),((CLASS_SCODER1E)(_CUR._SL._SL)).noofextmodules_6);
                ;
                // JavaLine 208 <== SourceLine 353
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0090")),new RTS_TXT("\u0001\u0091")));
                ;
                // JavaLine 211 <== SourceLine 354
                em=((CLASS_SCODER1E)(_CUR._SL._SL)).firstextmodule_6;
                ;
                // JavaLine 214 <== SourceLine 355
                while((em!=(null))) {
                    {
                        // JavaLine 217 <== SourceLine 356
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0001\u0091")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u0092")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
                        ;
                        // JavaLine 220 <== SourceLine 359
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),em.pptag);
                        ;
                        // JavaLine 223 <== SourceLine 360
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0093")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("\t")));
                        ;
                        // JavaLine 226 <== SourceLine 363
                        em=em.next;
                        ;
                    }
                }
                ;
                // JavaLine 232 <== SourceLine 365
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(9);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 moduleinfogeneration",1,284,10,285,14,286,30,288,33,289,36,290,41,292,47,294,50,295,55,296,61,297,64,298,69,299,74,300,76,301,78,302,81,303,83,304,88,305,91,306,97,309,102,310,105,313,109,314,117,315,120,316,123,317,129,318,133,319,136,320,140,321,148,322,151,323,154,324,160,325,164,327,167,336,170,337,173,339,175,340,177,341,180,342,183,343,191,346,196,347,199,348,202,349,205,352,208,353,211,354,214,355,217,356,220,359,223,360,226,363,232,365,240,367);
} // End of Procedure
