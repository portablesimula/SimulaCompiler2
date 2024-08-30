// JavaLine 1 <== SourceLine 138
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:34 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_pushcall extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=138, lastLine=149, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_pushcall(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_pushcall _STM() {
        // JavaLine 21 <== SourceLine 139
        if(_VALUE((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6>(15)))) {
            new CLASS_ERRMSG_fatal0((_CUR._SL._SL),247);
        } else {
            // JavaLine 25 <== SourceLine 140
            {
                // JavaLine 27 <== SourceLine 143
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).callstack.putELEMENT(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).callstack.index(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curcall_6);
                ;
                // JavaLine 30 <== SourceLine 144
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).parstack.putELEMENT(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).parstack.index(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curpar_6);
                ;
                // JavaLine 33 <== SourceLine 145
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).parnostack.putELEMENT(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).parnostack.index(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6);
                ;
                // JavaLine 36 <== SourceLine 147
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).calldepth_6+(1));
                ;
                // JavaLine 39 <== SourceLine 148
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curcall_6=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).opq_3;
                ;
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curpar_6=null;
                ;
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curparno_6=0;
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 pushcall",1,138,21,139,25,140,27,143,30,144,33,145,36,147,39,148,50,149);
} // End of Procedure
