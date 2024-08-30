// JavaLine 1 <== SourceLine 98
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_W8 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=98, lastLine=102, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    public int p_i1;
    public int p_i2;
    public int p_i3;
    public int p_i4;
    public int p_i5;
    public int p_i6;
    public int p_i7;
    public int p_i8;
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 100
    public RTS_Printfile _inspect_99_4466=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_W8 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 9: p_t=(RTS_TXT)objectValue(param); break;
                case 8: p_i1=intValue(param); break;
                case 7: p_i2=intValue(param); break;
                case 6: p_i3=intValue(param); break;
                case 5: p_i4=intValue(param); break;
                case 4: p_i5=intValue(param); break;
                case 3: p_i6=intValue(param); break;
                case 2: p_i7=intValue(param); break;
                case 1: p_i8=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_W8(RTS_RTObject _SL) {
        super(_SL,9); // Expecting 9 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_W8(RTS_RTObject _SL,RTS_TXT sp_t,int sp_i1,int sp_i2,int sp_i3,int sp_i4,int sp_i5,int sp_i6,int sp_i7,int sp_i8) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        this.p_i1 = sp_i1;
        this.p_i2 = sp_i2;
        this.p_i3 = sp_i3;
        this.p_i4 = sp_i4;
        this.p_i5 = sp_i5;
        this.p_i6 = sp_i6;
        this.p_i7 = sp_i7;
        this.p_i8 = sp_i8;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_W8 _STM() {
        // JavaLine 65 <== SourceLine 99
        {
            // BEGIN INSPECTION 
            _inspect_99_4466=RTS_BASICIO.sysout();
            if(_inspect_99_4466!=null) { // INSPECT _inspect_99_4466  type=ref(PRINTFILE)
                // JavaLine 70 <== SourceLine 100
                {
                    {
                        new CLASS_SCANNER_WWW((_CUR._SL),p_t);
                        ;
                        _inspect_99_4466.outint(p_i1,2);
                        ;
                        _inspect_99_4466.outint(p_i2,2);
                        ;
                        _inspect_99_4466.outint(p_i3,2);
                        ;
                        // JavaLine 81 <== SourceLine 101
                        _inspect_99_4466.outint(p_i4,2);
                        ;
                        _inspect_99_4466.outint(p_i5,2);
                        ;
                        _inspect_99_4466.outint(p_i6,2);
                        ;
                        // JavaLine 88 <== SourceLine 102
                        _inspect_99_4466.outint(p_i7,2);
                        ;
                        _inspect_99_4466.outint(p_i8,2);
                        ;
                        _inspect_99_4466.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 W8",1,98,19,100,65,99,70,100,81,101,88,102,101,102);
} // End of Procedure
