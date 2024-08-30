// JavaLine 1 <== SourceLine 1691
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_L2Coder_chainVis extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1691, lastLine=1698, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_hidp;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1693
    public CLASS_COMMON_idpack _inspect_1693_4480=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_L2Coder_chainVis setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_hidp=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_L2Coder_chainVis(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_L2Coder_chainVis(RTS_RTObject _SL,boolean sp_hidp) {
        super(_SL);
        // Parameter assignment to locals
        this.p_hidp = sp_hidp;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_L2Coder_chainVis _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1693_4480=((p_hidp)?(new CLASS_COMMON_idpack((_CUR._SL._SL))._STM()):(new CLASS_SCANNER_protpack((_CUR._SL._SL))._STM()));
            if(_inspect_1693_4480!=null) { // INSPECT _inspect_1693_4480  type=ref(IDPACK)
                // JavaLine 45 <== SourceLine 1694
                {
                    // JavaLine 47 <== SourceLine 1693
                    {
                        // JavaLine 49 <== SourceLine 1694
                        _inspect_1693_4480.line=((CLASS_SCANNER)(_CUR._SL._SL)).linenr;
                        ;
                        _inspect_1693_4480.idhi=((CLASS_SCANNER)(_CUR._SL._SL)).opdhi;
                        ;
                        _inspect_1693_4480.idlo=((CLASS_SCANNER)(_CUR._SL._SL)).opdlo;
                        ;
                        // JavaLine 56 <== SourceLine 1695
                        if(_VALUE((((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4.hidlist==(null)))) {
                            // JavaLine 58 <== SourceLine 1696
                            ((CLASS_SCANNER_L2Coder)(_CUR._SL)).cvispack_4=((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4.hidlist=((CLASS_COMMON_idpack)_inspect_1693_4480);
                        } else {
                            // JavaLine 61 <== SourceLine 1697
                            ((CLASS_SCANNER_L2Coder)(_CUR._SL)).cvispack_4=((CLASS_SCANNER_L2Coder)(_CUR._SL)).cvispack_4.next=((CLASS_COMMON_idpack)_inspect_1693_4480);
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 chainVis",1,1691,11,1693,45,1694,47,1693,49,1694,56,1695,58,1696,61,1697,71,1698);
} // End of Procedure
