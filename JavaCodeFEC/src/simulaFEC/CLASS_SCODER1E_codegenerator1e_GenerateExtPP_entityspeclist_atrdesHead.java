// JavaLine 1 <== SourceLine 142
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesHead extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=142, lastLine=159, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 143
    public CLASS_COMMON_quantity _inspect_143_4636=null;
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesHead(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist_atrdesHead _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_143_4636=((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).qty;
            if(_inspect_143_4636!=null) { // INSPECT _inspect_143_4636  type=ref(QUANTITY)
                // JavaLine 27 <== SourceLine 144
                {
                    // JavaLine 29 <== SourceLine 143
                    {
                        // JavaLine 31 <== SourceLine 144
                        ((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).i=(((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).i+(1));
                        ;
                        // JavaLine 34 <== SourceLine 146
                        ((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).atrdestag.putELEMENT(((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).atrdestag.index(((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).i),new CLASS_BUILDER1_newTTag((_CUR._SL._SL._SL._SL),new RTS_TXT("atrdestag(i)"))._RESULT);
                        // JavaLine 36 <== SourceLine 147
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outbyte(53);
                        ;
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL._SL),((CLASS_SCODER1E)(_CUR._SL._SL._SL._SL)).lastusedtag_6);
                        ;
                        // JavaLine 41 <== SourceLine 148
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outtext(((((_inspect_143_4636.type_1==(((char)7)))||((_inspect_143_4636.type_1==(((char)9))))))?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u0082"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u0082")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u007d")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012"))):(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u007c"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u007c")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u007d")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")))));
                        ;
                        // JavaLine 44 <== SourceLine 157
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL._SL._SL),((CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist)(_CUR._SL)).qty.symb_1.idtag);
                        ;
                        // JavaLine 47 <== SourceLine 158
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL._SL._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u007e")),new RTS_TXT("\u0000\u0007")));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 atrdesHead",1,142,10,143,27,144,29,143,31,144,34,146,36,147,41,148,44,157,47,158,56,159);
} // End of Procedure
