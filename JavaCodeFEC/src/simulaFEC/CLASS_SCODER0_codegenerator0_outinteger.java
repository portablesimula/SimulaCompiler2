// JavaLine 1 <== SourceLine 220
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_outinteger extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=220, lastLine=227, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_outinteger setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_outinteger(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_outinteger(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_outinteger _STM() {
        // JavaLine 39 <== SourceLine 223
        RTS_TXT.putint(((CLASS_SCODER0)(_CUR._SL._SL)).leftintbuf,p_i);
        ;
        p_i=11;
        ;
        // JavaLine 44 <== SourceLine 224
        while((RTS_ENVIRONMENT.loadChar(((CLASS_SCODER0)(_CUR._SL._SL)).leftintbuf,p_i)!=(((char)32)))) {
            p_i=(p_i-(1));
        }
        ;
        // JavaLine 49 <== SourceLine 225
        p_i=(11-(p_i));
        ;
        // JavaLine 52 <== SourceLine 226
        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outbyte(p_i);
        ;
        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outtext(RTS_TXT.sub(((CLASS_SCODER0)(_CUR._SL._SL)).leftintbuf,(13-(p_i)),p_i));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 outinteger",1,220,39,223,44,224,49,225,52,226,59,227);
} // End of Procedure
