// JavaLine 1 <== SourceLine 161
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesTail extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=161, lastLine=186, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 162
    public CLASS_COMMON_quantity _inspect_162_4637=null;
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesTail(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesTail _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_162_4637=((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).qty;
            if(_inspect_162_4637!=null) { // INSPECT _inspect_162_4637  type=ref(QUANTITY)
                // JavaLine 27 <== SourceLine 163
                {
                    // JavaLine 29 <== SourceLine 162
                    {
                        // JavaLine 31 <== SourceLine 163
                        if(_VALUE((((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).kk>(RTS_ENVIRONMENT.rank(((char)7)))))) {
                            // JavaLine 33 <== SourceLine 164
                            new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL._SL),((char)12),164);
                        }
                        ;
                        // JavaLine 37 <== SourceLine 165
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0080")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                        ;
                        // JavaLine 40 <== SourceLine 167
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte((((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).kk+(48)));
                        ;
                        // JavaLine 43 <== SourceLine 168
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0081")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
                        ;
                        // JavaLine 46 <== SourceLine 170
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte((((_inspect_162_4637.type_1>=(((char)10))))?(48):((RTS_ENVIRONMENT.rank(_inspect_162_4637.type_1)+(48)))));
                        ;
                        // JavaLine 49 <== SourceLine 172
                        if(_VALUE(((((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).qty.type_1==(((char)7)))||((_inspect_162_4637.type_1==(((char)9))))))) {
                            {
                                // JavaLine 52 <== SourceLine 173
                                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0083")),new RTS_TXT("\u0000\b")));
                                ;
                                // JavaLine 55 <== SourceLine 180
                                if(_VALUE((_inspect_162_4637.prefqual_1==(null)))) {
                                    ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte(25);
                                } else {
                                    // JavaLine 59 <== SourceLine 181
                                    {
                                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte(18);
                                        ;
                                        // JavaLine 63 <== SourceLine 182
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL._SL._SL),(_inspect_162_4637.prefqual_1.ftag_1+(1)));
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 72 <== SourceLine 185
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte(9);
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 atrdesTail",1,161,10,162,27,163,29,162,31,163,33,164,37,165,40,167,43,168,46,170,49,172,52,173,55,180,59,181,63,182,72,185,81,186);
} // End of Procedure
