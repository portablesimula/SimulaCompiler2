// JavaLine 1 <== SourceLine 92
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_W1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=92, lastLine=93, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    public int p_i;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 93
    public RTS_Printfile _inspect_92_4464=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_W1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_t=(RTS_TXT)objectValue(param); break;
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_W1(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_W1(RTS_RTObject _SL,RTS_TXT sp_t,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_W1 _STM() {
        // JavaLine 44 <== SourceLine 92
        {
            // BEGIN INSPECTION 
            _inspect_92_4464=RTS_BASICIO.sysout();
            if(_inspect_92_4464!=null) { // INSPECT _inspect_92_4464  type=ref(PRINTFILE)
                // JavaLine 49 <== SourceLine 93
                {
                    {
                        new CLASS_SCANNER_WWW((_CUR._SL),p_t);
                        ;
                        _inspect_92_4464.outint(p_i,5);
                        ;
                        _inspect_92_4464.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 W1",1,92,12,93,44,92,49,93,64,93);
} // End of Procedure
