// JavaLine 1 <== SourceLine 1051
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_forwardGOTO extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1051, lastLine=1068, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1056
    public COMMON_sembox _inspect_1056_4644=null;
    // JavaLine 12 <== SourceLine 1065
    public COMMON_stackedi _inspect_1065_4645=null;
    // Normal Constructor
    public SCODER2_codegenerator2_forwardGOTO(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_forwardGOTO _STM() {
        // JavaLine 25 <== SourceLine 1053
        if(_VALUE(new SCODER0_codegenerator0_nonewindex((_CUR._SL))._RESULT)) {
            {
                // JavaLine 28 <== SourceLine 1054
                if(_VALUE((((SCODER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                    new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("step GOTO"));
                }
                ;
                // JavaLine 33 <== SourceLine 1055
                while((((SCODER2_codegenerator2)(_CUR._SL)).opq_3.dim_1>(0))) {
                    // JavaLine 35 <== SourceLine 1056
                    {
                        // BEGIN INSPECTION 
                        _inspect_1056_4644=((SCODER2_codegenerator2)(_CUR._SL)).opq_3.prevmeaning;
                        if(_inspect_1056_4644!=null) { // INSPECT _inspect_1056_4644
                            // JavaLine 40 <== SourceLine 1057
                            {
                                // JavaLine 42 <== SourceLine 1056
                                {
                                    // JavaLine 44 <== SourceLine 1057
                                    ((SCODER2_codegenerator2)(_CUR._SL)).opq_3.prevmeaning=_inspect_1056_4644.prevmeaning;
                                    ;
                                    // JavaLine 47 <== SourceLine 1059
                                    new SCODER1_codegenerator1_outfdest((_CUR._SL),RTS_ENVIRONMENT.rank(((COMMON_stackedi)(((COMMON_sembox)_inspect_1056_4644))).p1_rehi));
                                    ;
                                    // JavaLine 50 <== SourceLine 1060
                                    ((SCODER2_codegenerator2)(_CUR._SL)).opq_3.dim_1=(((SCODER2_codegenerator2)(_CUR._SL)).opq_3.dim_1-(1));
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
            }
        }
        ;
        // JavaLine 61 <== SourceLine 1062
        new SCODER0_codegenerator0_getnewindex((_CUR._SL));
        ;
        ((SCODER2_codegenerator2)(_CUR._SL)).opq_3.dim_1=(((SCODER2_codegenerator2)(_CUR._SL)).opq_3.dim_1+(1));
        ;
        // JavaLine 66 <== SourceLine 1063
        ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(89);
        ;
        ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(((SCODER2_codegenerator2)(_CUR._SL)).curindex_5);
        ;
        // JavaLine 71 <== SourceLine 1065
        {
            // BEGIN INSPECTION 
            _inspect_1065_4645=new COMMON_stackedi((_CUR._SL._SL),RTS_ENVIRONMENT._char(((SCODER2_codegenerator2)(_CUR._SL)).curindex_5),((char)0))._STM();
            if(_inspect_1065_4645!=null) { // INSPECT _inspect_1065_4645
                // JavaLine 76 <== SourceLine 1066
                {
                    // JavaLine 78 <== SourceLine 1065
                    {
                        // JavaLine 80 <== SourceLine 1066
                        _inspect_1065_4645.prevmeaning=((SCODER2_codegenerator2)(_CUR._SL)).opq_3.prevmeaning;
                        ;
                        ((SCODER2_codegenerator2)(_CUR._SL)).opq_3.prevmeaning=((COMMON_stackedi)_inspect_1065_4645);
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 forwardGOTO",1,1051,10,1056,12,1065,25,1053,28,1054,33,1055,35,1056,40,1057,42,1056,44,1057,47,1059,50,1060,61,1062,66,1063,71,1065,76,1066,78,1065,80,1066,92,1068);
} // End of Procedure
