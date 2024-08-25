// JavaLine 1 <== SourceLine 159
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 24 09:41:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PAS2INIT_codegeneratorinit_Block157_regnewmodule extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=159, lastLine=0, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_n;
    public RTS_TXT p_cc;
    public int p_numtag;
    // Declare locals as attributes
    public BUILDER1_visiblegenerator_module _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PAS2INIT_codegeneratorinit_Block157_regnewmodule setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n=(RTS_TXT)objectValue(param); break;
                case 2: p_cc=(RTS_TXT)objectValue(param); break;
                case 1: p_numtag=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PAS2INIT_codegeneratorinit_Block157_regnewmodule(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public PAS2INIT_codegeneratorinit_Block157_regnewmodule(RTS_RTObject _SL,RTS_TXT sp_n,RTS_TXT sp_cc,int sp_numtag) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_cc = sp_cc;
        this.p_numtag = sp_numtag;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PAS2INIT_codegeneratorinit_Block157_regnewmodule _STM() {
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("adHoc01.sim","5 regnewmodule",1,159,50,0);
} // End of Procedure
