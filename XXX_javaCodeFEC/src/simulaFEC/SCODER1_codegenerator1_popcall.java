// JavaLine 1 <== SourceLine 152
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_popcall extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=152, lastLine=166, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_popcall(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_popcall _STM() {
        // JavaLine 21 <== SourceLine 153
        if(_VALUE((((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6==(0)))) {
            new ERRMSG_internerr((_CUR._SL._SL),((char)11),153);
        } else {
            // JavaLine 25 <== SourceLine 154
            {
                ((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6=(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6-(1));
                ;
                // JavaLine 29 <== SourceLine 155
                if(_VALUE((((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6!=(0)))) {
                    {
                        // JavaLine 32 <== SourceLine 156
                        ((SCODER1_codegenerator1)(_CUR._SL)).curcall_6=((SCODER1_codegenerator1)(_CUR._SL)).callstack.getELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6);
                        ;
                        // JavaLine 35 <== SourceLine 157
                        ((SCODER1_codegenerator1)(_CUR._SL)).curpar_6=((SCODER1_codegenerator1)(_CUR._SL)).parstack.getELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6);
                        ;
                        // JavaLine 38 <== SourceLine 158
                        ((SCODER1_codegenerator1)(_CUR._SL)).parstack.putELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).parstack.index(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6),null);
                        ;
                        // JavaLine 41 <== SourceLine 159
                        ((SCODER1_codegenerator1)(_CUR._SL)).callstack.putELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).callstack.index(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6),null);
                        ;
                        // JavaLine 44 <== SourceLine 160
                        ((SCODER1_codegenerator1)(_CUR._SL)).curparno_6=((SCODER1_codegenerator1)(_CUR._SL)).parnostack.getELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).calldepth_6);
                        ;
                    }
                } else {
                    // JavaLine 49 <== SourceLine 162
                    {
                        // JavaLine 51 <== SourceLine 163
                        ((SCODER1_codegenerator1)(_CUR._SL)).curcall_6=((SCODER1_codegenerator1)(_CUR._SL)).curpar_6=null;
                        ;
                        // JavaLine 54 <== SourceLine 164
                        ((SCODER1_codegenerator1)(_CUR._SL)).curparno_6=0;
                        ;
                    }
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 popcall",1,152,21,153,25,154,29,155,32,156,35,157,38,158,41,159,44,160,49,162,51,163,54,164,64,166);
} // End of Procedure
