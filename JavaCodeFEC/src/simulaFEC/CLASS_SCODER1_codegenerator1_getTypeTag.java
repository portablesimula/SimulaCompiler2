// JavaLine 1 <== SourceLine 230
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_getTypeTag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=230, lastLine=254, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    // Declare locals as attributes
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1_codegenerator1_getTypeTag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1_codegenerator1_getTypeTag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_getTypeTag(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_getTypeTag _STM() {
        // JavaLine 42 <== SourceLine 232
        if(_VALUE((p_qty.categ_1==(((char)2))))) {
            _RESULT=353;
        } else {
            // JavaLine 46 <== SourceLine 233
            if(_VALUE((p_qty.kind_1==(((char)2))))) {
                _RESULT=8;
            } else {
                // JavaLine 50 <== SourceLine 235
                if(_VALUE(((p_qty.kind_1==(((char)0)))||((p_qty.kind_1==(((char)6))))))) {
                    // JavaLine 52 <== SourceLine 239
                    _RESULT=(((p_qty.special_1==(((char)0))))?(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).typetag.getELEMENT(RTS_ENVIRONMENT.rank(p_qty.type_1))):(0));
                } else {
                    // JavaLine 55 <== SourceLine 241
                    if(_VALUE(((p_qty.kind_1==(((char)3)))&&((p_qty.dim_1!=(0)))))) {
                        // JavaLine 57 <== SourceLine 242
                        _RESULT=10;
                    } else {
                        // JavaLine 60 <== SourceLine 247
                        if(_VALUE((p_qty.categ_1==(((char)0))))) {
                            {
                                // JavaLine 63 <== SourceLine 248
                                if(_VALUE((p_qty.kind_1==(((char)1))))) {
                                    _RESULT=326;
                                } else {
                                    // JavaLine 67 <== SourceLine 249
                                    if(_VALUE((p_qty.kind_1==(((char)3))))) {
                                        _RESULT=322;
                                    } else {
                                        // JavaLine 71 <== SourceLine 250
                                        if(_VALUE((p_qty.kind_1==(((char)4))))) {
                                            _RESULT=330;
                                        } else {
                                            // JavaLine 75 <== SourceLine 251
                                            _RESULT=0;
                                        }
                                    }
                                }
                            }
                        } else {
                            // JavaLine 82 <== SourceLine 253
                            _RESULT=0;
                        }
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 getTypeTag",1,230,42,232,46,233,50,235,52,239,55,241,57,242,60,247,63,248,67,249,71,250,75,251,82,253,92,254);
} // End of Procedure
