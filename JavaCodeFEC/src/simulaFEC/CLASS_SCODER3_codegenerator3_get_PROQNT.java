// JavaLine 1 <== SourceLine 234
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_get_PROQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=234, lastLine=319, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_callmode;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 237
    public CLASS_COMMON_quantity _inspect_237_4649=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER3_codegenerator3_get_PROQNT setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_callmode=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER3_codegenerator3_get_PROQNT(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_get_PROQNT(RTS_RTObject _SL,boolean sp_callmode) {
        super(_SL);
        // Parameter assignment to locals
        this.p_callmode = sp_callmode;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_get_PROQNT _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_237_4649=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
            if(_inspect_237_4649!=null) { // INSPECT _inspect_237_4649  type=ref(QUANTITY)
                // JavaLine 45 <== SourceLine 238
                {
                    // JavaLine 47 <== SourceLine 237
                    {
                        // JavaLine 49 <== SourceLine 238
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),238,new RTS_TXT(""),new RTS_TXT("============================= get\u005fPROQNT"));
                        ;
                        // JavaLine 52 <== SourceLine 242
                        if(_inspect_237_4649.categ_1<((char)0) || _inspect_237_4649.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(_inspect_237_4649.categ_1) { // BEGIN SWITCH STATEMENT
                            case 3: 
                            case 4: 
                            // JavaLine 57 <== SourceLine 243
                            {
                                // JavaLine 59 <== SourceLine 244
                                if(_VALUE(p_callmode)) {
                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                }
                                ;
                                // JavaLine 64 <== SourceLine 246
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),246,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                ;
                                // JavaLine 67 <== SourceLine 247
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),247,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001v"))._RESULT);
                                ;
                                // JavaLine 70 <== SourceLine 248
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),248,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001G"))._RESULT);
                                ;
                                // JavaLine 73 <== SourceLine 249
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),249,new RTS_TXT("RUPDATE"));
                                ;
                                // JavaLine 76 <== SourceLine 250
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),250,new RTS_TXT("POP"));
                                ;
                                // JavaLine 79 <== SourceLine 251
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),251,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_237_4649.ftag_1+(1)))._RESULT));
                                ;
                                // JavaLine 82 <== SourceLine 252
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("J")),new RTS_TXT("\u0001G")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
                                ;
                                // JavaLine 85 <== SourceLine 257
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_237_4649.ftag_1+(1)));
                                ;
                                // JavaLine 88 <== SourceLine 258
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),258,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                ;
                                // JavaLine 91 <== SourceLine 259
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),259,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001v"))._RESULT);
                                ;
                                // JavaLine 94 <== SourceLine 260
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),260,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001H"))._RESULT);
                                ;
                                // JavaLine 97 <== SourceLine 261
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),261,new RTS_TXT("RUPDATE"));
                                ;
                                // JavaLine 100 <== SourceLine 262
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),262,new RTS_TXT("POP"));
                                ;
                                // JavaLine 103 <== SourceLine 263
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("J")),new RTS_TXT("\u0001H")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                ;
                                // JavaLine 106 <== SourceLine 267
                                if(_VALUE((_inspect_237_4649.type_1==(((char)7))))) {
                                    {
                                        // JavaLine 109 <== SourceLine 268
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),268,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_237_4649.prefqual_1.ftag_1+(1)))._RESULT));
                                        ;
                                        // JavaLine 112 <== SourceLine 269
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                        ;
                                        // JavaLine 115 <== SourceLine 270
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_237_4649.prefqual_1.ftag_1+(1)));
                                        ;
                                        // JavaLine 118 <== SourceLine 271
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("J")),new RTS_TXT("\u0001I")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001v")));
                                        ;
                                    }
                                } else {
                                    // JavaLine 123 <== SourceLine 277
                                    {
                                        // JavaLine 125 <== SourceLine 278
                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),278,new RTS_TXT("PUSHC"),new RTS_TXT("ONONE"));
                                        ;
                                        // JavaLine 128 <== SourceLine 279
                                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001v")),new RTS_TXT("J")),new RTS_TXT("\u0001I")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001v")));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 134 <== SourceLine 287
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),287,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                ;
                                // JavaLine 137 <== SourceLine 288
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),288,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001v"))._RESULT);
                                ;
                                // JavaLine 140 <== SourceLine 289
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),289,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001I"))._RESULT);
                                ;
                                // JavaLine 143 <== SourceLine 290
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),290,new RTS_TXT("RUPDATE"));
                                ;
                                // JavaLine 146 <== SourceLine 291
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),291,new RTS_TXT("POP"));
                                ;
                                // JavaLine 149 <== SourceLine 292
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),292,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(_inspect_237_4649.ftag_1+(1)))._RESULT));
                                ;
                                // JavaLine 152 <== SourceLine 293
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),293,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                                ;
                                // JavaLine 155 <== SourceLine 294
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),294,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001v"))._RESULT);
                                ;
                            }
                            break;
                            case 6: 
                            // JavaLine 161 <== SourceLine 297
                            {
                                // JavaLine 163 <== SourceLine 298
                                if(_VALUE(p_callmode)) {
                                    new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                }
                                ;
                                // JavaLine 168 <== SourceLine 299
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005\u00aa")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 171 <== SourceLine 301
                                new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),(_inspect_237_4649.virtno_1-(1)));
                                ;
                                // JavaLine 174 <== SourceLine 302
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ab")));
                                ;
                            }
                            break;
                            case 0: 
                            // JavaLine 180 <== SourceLine 306
                            {
                                // JavaLine 182 <== SourceLine 307
                                new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                                ;
                                // JavaLine 185 <== SourceLine 308
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(150);
                                ;
                                // JavaLine 188 <== SourceLine 309
                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_237_4649.ftag_1+(0)));
                                ;
                            }
                            break;
                            case 2: 
                            // JavaLine 194 <== SourceLine 312
                            {
                                // JavaLine 196 <== SourceLine 313
                                new CLASS_SCODER2_codegenerator2_addrNAMEQNT((_CUR._SL));
                                ;
                                // JavaLine 199 <== SourceLine 314
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u0019")),new RTS_TXT("F")),new RTS_TXT("\u0006\u001a")));
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 get_PROQNT",1,234,11,237,45,238,47,237,49,238,52,242,57,243,59,244,64,246,67,247,70,248,73,249,76,250,79,251,82,252,85,257,88,258,91,259,94,260,97,261,100,262,103,263,106,267,109,268,112,269,115,270,118,271,123,277,125,278,128,279,134,287,137,288,140,289,143,290,146,291,149,292,152,293,155,294,161,297,163,298,168,299,171,301,174,302,180,306,182,307,185,308,188,309,194,312,196,313,199,314,212,319);
} // End of Procedure
