// JavaLine 1 <== SourceLine 513
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_normalattrfile_storebyte extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=513, lastLine=516, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ch;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_normalattrfile_storebyte setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ch=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_normalattrfile_storebyte(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_normalattrfile_storebyte(RTS_RTObject _SL,char sp_ch) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ch = sp_ch;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_normalattrfile_storebyte _STM() {
        // JavaLine 39 <== SourceLine 514
        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),514,CONC(new RTS_TXT("storebyte: "),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_ch))));
        ;
        // JavaLine 42 <== SourceLine 515
        RTS_ENVIRONMENT.storeChar(p_ch,((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p);
        ;
        ((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p=(((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 storebyte",1,513,39,514,42,515,49,516);
} // End of Procedure
