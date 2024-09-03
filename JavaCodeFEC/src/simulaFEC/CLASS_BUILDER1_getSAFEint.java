// JavaLine 1 <== SourceLine 296
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_getSAFEint extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=296, lastLine=305, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_hi;
    public char p_lo;
    // Declare local labels
    // JavaLine 14 <== SourceLine 302
    final RTS_LABEL _LABEL_CLASS_BUILDER1_getSAFEint_IOFLO_0=new RTS_LABEL(this,0,1,"IOFLO"); // Local Label #1=IOFLO At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 17 <== SourceLine 297
    public int EXC_NUMBER=0;
    public CLASS_COMMON_symbolbox symx=null;
    // JavaLine 20 <== SourceLine 296
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_getSAFEint setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_hi=(char)objectValue(param); break;
                case 1: p_lo=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_getSAFEint(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_getSAFEint(RTS_RTObject _SL,char sp_hi,char sp_lo) {
        super(_SL);
        // Parameter assignment to locals
        this.p_hi = sp_hi;
        this.p_lo = sp_lo;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_getSAFEint _STM() {
        CLASS_BUILDER1_getSAFEint _THIS=(CLASS_BUILDER1_getSAFEint)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 56 <== SourceLine 300
                symx=new CLASS_COMMON_boxof((_CUR._SL),p_hi,p_lo)._RESULT;
                ;
                // JavaLine 59 <== SourceLine 301
                _RESULT=RTS_TXT.getint(symx.symbol);
                ;
                // JavaLine 62 <== SourceLine 302
                if(_VALUE(false)) {
                    {
                        _SIM_LABEL(1); // DeclaredIn: getSAFEint
                        new CLASS_ERRMSG_error1id((_CUR._SL),398,symx);
                    }
                }
                ;
                // JavaLine 70 <== SourceLine 303
                new CLASS_COMMON_StandardException((_CUR._SL));
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 getSAFEint",1,296,14,302,17,297,20,296,56,300,59,301,62,302,70,303,82,305);
} // End of Procedure
