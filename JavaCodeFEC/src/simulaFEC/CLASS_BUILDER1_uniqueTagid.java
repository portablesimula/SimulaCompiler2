// JavaLine 1 <== SourceLine 152
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_uniqueTagid extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=152, lastLine=162, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_id;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 153
    public int i=0;
    // JavaLine 15 <== SourceLine 152
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_uniqueTagid setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_id=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_uniqueTagid(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_uniqueTagid(RTS_RTObject _SL,RTS_TXT sp_id) {
        super(_SL);
        // Parameter assignment to locals
        this.p_id = sp_id;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_uniqueTagid _STM() {
        // JavaLine 45 <== SourceLine 154
        if(_VALUE(new CLASS_BUILDER1_findTagid((_CUR._SL),p_id)._RESULT)) {
            {
                // JavaLine 48 <== SourceLine 155
                while(new CLASS_BUILDER1_findTagid((_CUR._SL),CONC(p_id,RTS_ENVIRONMENT.edit(i)))._RESULT) {
                    i=(i+(1));
                }
                ;
                // JavaLine 53 <== SourceLine 156
                p_id=RTS_ENVIRONMENT.copy(copy(CONC(p_id,RTS_ENVIRONMENT.edit(i))));
                ;
            }
        }
        ;
        // JavaLine 59 <== SourceLine 158
        new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),158,CONC(CONC(new RTS_TXT("uniqueTagid \""),p_id),new RTS_TXT("\"")));
        ;
        // JavaLine 62 <== SourceLine 160
        _RESULT=p_id;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 uniqueTagid",1,152,13,153,15,152,45,154,48,155,53,156,59,158,62,160,67,162);
} // End of Procedure
