// JavaLine 1 <== SourceLine 166
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER4_codegenerator4_swteltconst extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=166, lastLine=190, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_thk;
    public int p_pad;
    public int p_rbl;
    public int p_fld;
    public int p_clv;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER4_codegenerator4_swteltconst setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 5: p_thk=(boolean)objectValue(param); break;
                case 4: p_pad=intValue(param); break;
                case 3: p_rbl=intValue(param); break;
                case 2: p_fld=intValue(param); break;
                case 1: p_clv=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER4_codegenerator4_swteltconst(RTS_RTObject _SL) {
        super(_SL,5); // Expecting 5 parameters
    }
    // Normal Constructor
    public SCODER4_codegenerator4_swteltconst(RTS_RTObject _SL,boolean sp_thk,int sp_pad,int sp_rbl,int sp_fld,int sp_clv) {
        super(_SL);
        // Parameter assignment to locals
        this.p_thk = sp_thk;
        this.p_pad = sp_pad;
        this.p_rbl = sp_rbl;
        this.p_fld = sp_fld;
        this.p_clv = sp_clv;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER4_codegenerator4_swteltconst _STM() {
        // JavaLine 51 <== SourceLine 174
        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0000\u0089")),new RTS_TXT("\u0004")),new RTS_TXT("\u0000\u008a")),new RTS_TXT("\u0000\n")));
        ;
        // JavaLine 54 <== SourceLine 176
        if(_VALUE((p_pad==(0)))) {
            ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(27);
        } else {
            // JavaLine 58 <== SourceLine 177
            {
                ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(20);
                ;
                new SCODER0_codegenerator0_outtag((_CUR._SL),p_pad);
            }
        }
        ;
        // JavaLine 66 <== SourceLine 178
        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u008b")),new RTS_TXT("\u0000\u0007")));
        ;
        // JavaLine 69 <== SourceLine 179
        if(_VALUE((p_fld==(0)))) {
            ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(24);
        } else {
            // JavaLine 73 <== SourceLine 180
            {
                ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(17);
                ;
                new SCODER0_codegenerator0_outtag((_CUR._SL),p_fld);
            }
        }
        ;
        // JavaLine 81 <== SourceLine 181
        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u008c")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
        ;
        // JavaLine 84 <== SourceLine 183
        new SCODER0_codegenerator0_outsint((_CUR._SL),p_rbl);
        ;
        // JavaLine 87 <== SourceLine 184
        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u008d")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
        ;
        // JavaLine 90 <== SourceLine 186
        new SCODER0_codegenerator0_outsint((_CUR._SL),p_clv);
        ;
        // JavaLine 93 <== SourceLine 187
        ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0000\u008e")),new RTS_TXT("\u0000\u0001")));
        ;
        // JavaLine 96 <== SourceLine 188
        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(((p_thk)?(28):(29)));
        ;
        // JavaLine 99 <== SourceLine 189
        ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(9);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER4.sim","5 swteltconst",1,166,51,174,54,176,58,177,66,178,69,179,73,180,81,181,84,183,87,184,90,186,93,187,96,188,99,189,104,190);
} // End of Procedure
