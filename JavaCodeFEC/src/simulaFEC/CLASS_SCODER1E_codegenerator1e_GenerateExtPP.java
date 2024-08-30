// JavaLine 1 <== SourceLine 133
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_GenerateExtPP extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=133, lastLine=281, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 135
    public int prototidenttag=0;
    // JavaLine 13 <== SourceLine 136
    public int atrvec_tag=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP setPar(Object param) {
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
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateExtPP _STM() {
        // JavaLine 43 <== SourceLine 248
        if(_VALUE((p_q.kind_1!=(((char)8))))) {
            {
                if(_VALUE((p_q.kind_1!=(((char)9))))) {
                    // JavaLine 47 <== SourceLine 249
                    prototidenttag=new CLASS_SCODER1E_codegenerator1e_identifiertag((_CUR._SL),p_q.symb_1)._RESULT;
                }
            }
        }
        ;
        // JavaLine 53 <== SourceLine 253
        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).simob_entity)) {
            {
                if(_VALUE((((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).nent_7>(0)))) {
                    new CLASS_SCODER1E_codegenerator1e_GenerateExtPP_entityspeclist((_CUR));
                }
            }
        }
        ;
        // JavaLine 62 <== SourceLine 257
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).xpp_tag_7=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("XPP"))._RESULT;
        // JavaLine 64 <== SourceLine 259
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(53);
        ;
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).xpp_tag_7);
        ;
        // JavaLine 69 <== SourceLine 260
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0000\u0000"),new RTS_TXT("\n")),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 72 <== SourceLine 263
        if(_VALUE((prototidenttag==(0)))) {
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        } else {
            // JavaLine 76 <== SourceLine 264
            {
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),prototidenttag);
            }
        }
        ;
        // JavaLine 84 <== SourceLine 265
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0012")));
        ;
        // JavaLine 87 <== SourceLine 267
        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).prototinfo_6);
        ;
        // JavaLine 90 <== SourceLine 268
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\u0000\b")));
        ;
        // JavaLine 93 <== SourceLine 269
        if(_VALUE((((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).nent_7==(0)))) {
            ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(25);
        } else {
            // JavaLine 97 <== SourceLine 270
            {
                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(18);
                ;
                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),atrvec_tag);
            }
        }
        ;
        // JavaLine 105 <== SourceLine 271
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u0000")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")),new RTS_TXT("\u0001")));
        ;
        // JavaLine 108 <== SourceLine 273
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte((((p_q.kind_1==(((char)5))))?(51):((((p_q.kind_1==(((char)9))))?(52):((((p_q.kind_1==(((char)1))))?((((((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).npar_7>(0)))?(50):(49))):((((p_q.kind_1==(((char)7))))?(54):(48)))))))));
        ;
        // JavaLine 111 <== SourceLine 280
        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(9);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 GenerateExtPP",1,133,11,135,13,136,43,248,47,249,53,253,62,257,64,259,69,260,72,263,76,264,84,265,87,267,90,268,93,269,97,270,105,271,108,273,111,280,116,281);
} // End of Procedure
