// JavaLine 1 <== SourceLine 206
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_outsint extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=206, lastLine=218, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_outsint setPar(Object param) {
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
    public CLASS_SCODER0_codegenerator0_outsint(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_outsint(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_outsint _STM() {
        // JavaLine 39 <== SourceLine 209
        if(_VALUE((p_i<(10)))) {
            ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).out2byte((p_i+(304)));
        } else {
            // JavaLine 43 <== SourceLine 210
            if(_VALUE((p_i<(100)))) {
                {
                    // JavaLine 46 <== SourceLine 211
                    ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outbyte(2);
                    ;
                    ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outbyte(((p_i/(10))+(48)));
                    ;
                    ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outbyte((RTS_ENVIRONMENT.rem(p_i,10)+(48)));
                    ;
                }
            } else {
                // JavaLine 55 <== SourceLine 212
                {
                    // JavaLine 57 <== SourceLine 213
                    RTS_TXT.putint(((CLASS_SCODER0)(_CUR._SL._SL)).leftsintbuf,p_i);
                    ;
                    p_i=6;
                    ;
                    // JavaLine 62 <== SourceLine 214
                    while((RTS_ENVIRONMENT.loadChar(((CLASS_SCODER0)(_CUR._SL._SL)).leftsintbuf,p_i)!=(((char)32)))) {
                        p_i=(p_i-(1));
                    }
                    ;
                    // JavaLine 67 <== SourceLine 215
                    p_i=(6-(p_i));
                    ;
                    // JavaLine 70 <== SourceLine 216
                    ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outbyte(p_i);
                    ;
                    ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).outtext(RTS_TXT.sub(((CLASS_SCODER0)(_CUR._SL._SL)).leftsintbuf,(8-(p_i)),p_i));
                    ;
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 outsint",1,206,39,209,43,210,46,211,55,212,57,213,62,214,67,215,70,216,81,218);
} // End of Procedure
