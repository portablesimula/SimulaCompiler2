// JavaLine 1 <== SourceLine 272
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_prototypegenerator_pointer extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=272, lastLine=290, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_qty;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER2_codegenerator2_prototypegenerator_pointer setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER2_codegenerator2_prototypegenerator_pointer(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER2_codegenerator2_prototypegenerator_pointer(RTS_RTObject _SL,COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_prototypegenerator_pointer _STM() {
        // JavaLine 42 <== SourceLine 275
        if(_VALUE((p_qty.categ_1==(((char)2))))) {
            _RESULT=true;
        } else {
            // JavaLine 46 <== SourceLine 276
            {
                // JavaLine 48 <== SourceLine 277
                if(p_qty.kind_1<((char)0) || p_qty.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(p_qty.kind_1) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    // JavaLine 52 <== SourceLine 278
                    _RESULT=true;
                    break;
                    case 0: 
                    // JavaLine 56 <== SourceLine 280
                    _RESULT=((p_qty.type_1==(((char)7)))||((p_qty.type_1==(((char)8)))));
                    break;
                    case 1: 
                    case 3: 
                    case 4: 
                    // JavaLine 62 <== SourceLine 282
                    _RESULT=(p_qty.categ_1==(((char)0)));
                    break;
                } // END SWITCH STATEMENT
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 pointer",1,272,42,275,46,276,48,277,52,278,56,280,62,282,71,290);
} // End of Procedure
