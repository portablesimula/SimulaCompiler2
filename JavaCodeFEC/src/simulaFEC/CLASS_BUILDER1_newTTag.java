// JavaLine 1 <== SourceLine 164
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_newTTag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=164, lastLine=168, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_ident;
    // Declare locals as attributes
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_newTTag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ident=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_newTTag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_newTTag(RTS_RTObject _SL,RTS_TXT sp_ident) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ident = sp_ident;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_newTTag _STM() {
        // JavaLine 42 <== SourceLine 165
        _RESULT=((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6=(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1));
        ;
        // JavaLine 45 <== SourceLine 166
        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),p_ident)._RESULT);
        ;
        // JavaLine 48 <== SourceLine 167
        new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),167,CONC(CONC(CONC(new RTS_TXT("newTTag "),p_ident),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 newTTag",1,164,42,165,45,166,48,167,53,168);
} // End of Procedure
