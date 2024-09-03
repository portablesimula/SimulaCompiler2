// JavaLine 1 <== SourceLine 95
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_W3 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=95, lastLine=96, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    public char p_i1;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 96
    public RTS_Printfile _inspect_95_4465=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_W3 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_t=(RTS_TXT)objectValue(param); break;
                case 1: p_i1=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_W3(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_W3(RTS_RTObject _SL,RTS_TXT sp_t,char sp_i1) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        this.p_i1 = sp_i1;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_W3 _STM() {
        // JavaLine 44 <== SourceLine 95
        {
            // BEGIN INSPECTION 
            _inspect_95_4465=RTS_BASICIO.sysout();
            if(_inspect_95_4465!=null) { // INSPECT _inspect_95_4465  type=ref(PRINTFILE)
                // JavaLine 49 <== SourceLine 96
                {
                    {
                        new CLASS_SCANNER_WWW((_CUR._SL),p_t);
                        ;
                        _inspect_95_4465.outtext(((CLASS_SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(p_i1)));
                        ;
                        _inspect_95_4465.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 W3",1,95,12,96,44,95,49,96,64,96);
} // End of Procedure
