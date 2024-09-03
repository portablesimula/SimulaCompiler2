// JavaLine 1 <== SourceLine 1700
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_L2Coder_storecharint extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1700, lastLine=1702, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ch;
    public int p__int;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_L2Coder_storecharint setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_ch=(char)objectValue(param); break;
                case 1: p__int=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_L2Coder_storecharint(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_L2Coder_storecharint(RTS_RTObject _SL,char sp_ch,int sp__int) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ch = sp_ch;
        this.p__int = sp__int;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_L2Coder_storecharint _STM() {
        // JavaLine 42 <== SourceLine 1702
        new CLASS_SCANNER_L2Coder_store3chars((_CUR._SL),p_ch,RTS_ENVIRONMENT._char((p__int/(256))),RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.rem(p__int,256)));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 storecharint",1,1700,42,1702,46,1702);
} // End of Procedure
