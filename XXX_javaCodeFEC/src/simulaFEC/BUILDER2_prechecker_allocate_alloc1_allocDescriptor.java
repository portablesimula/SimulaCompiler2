// JavaLine 1 <== SourceLine 1159
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_allocate_alloc1_allocDescriptor extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1159, lastLine=1170, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1163
    public COMMON_brecord _inspect_1161_4546=null;
    // Normal Constructor
    public BUILDER2_prechecker_allocate_alloc1_allocDescriptor(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_prechecker_allocate_alloc1_allocDescriptor _STM() {
        // JavaLine 23 <== SourceLine 1161
        {
            // BEGIN INSPECTION 
            _inspect_1161_4546=(((((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).Q.descr_1==(null)))?(((RTS_REF_ARRAY<COMMON_brecord>)((BUILDER2)(_CUR._SL._SL._SL._SL)).brctab.getELEMENT(0).val).getELEMENT(0)):(((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).Q.descr_1));
            if(_inspect_1161_4546!=null) { // INSPECT _inspect_1161_4546
                // JavaLine 28 <== SourceLine 1164
                {
                    // JavaLine 30 <== SourceLine 1163
                    {
                        // JavaLine 32 <== SourceLine 1164
                        ((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).QN.descr_1=((COMMON_brecord)_inspect_1161_4546);
                        ;
                        _inspect_1161_4546.declquant=((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).QN;
                        ;
                        // JavaLine 37 <== SourceLine 1165
                        _inspect_1161_4546.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).p_brc.blev)+(1)));
                        ;
                        // JavaLine 40 <== SourceLine 1166
                        _inspect_1161_4546.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER2_prechecker_allocate_alloc1)(_CUR._SL)).p_brc.rtblev)+(1)));
                        ;
                        // JavaLine 43 <== SourceLine 1168
                        new BUILDER2_prechecker_allocate_alloc1((_CUR._SL._SL),((COMMON_brecord)_inspect_1161_4546));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 allocDescriptor",1,1159,10,1163,23,1161,28,1164,30,1163,32,1164,37,1165,40,1166,43,1168,52,1170);
} // End of Procedure
