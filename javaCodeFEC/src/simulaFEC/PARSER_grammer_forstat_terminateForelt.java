// JavaLine 1 <== SourceLine 1459
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_forstat_terminateForelt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1459, lastLine=1496, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1473
    final RTS_LABEL _LABEL_PARSER_grammer_forstat_terminateForelt_Block1462_Block1473_termIF_0=new RTS_LABEL(this,0,1,"termIF"); // Local Label #1=termIF At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1461
    public PARSER_codebuffer _inspect_1461_4500=null;
    // Normal Constructor
    public PARSER_grammer_forstat_terminateForelt(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_forstat_terminateForelt _STM() {
        PARSER_grammer_forstat_terminateForelt _THIS=(PARSER_grammer_forstat_terminateForelt)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_1461_4500=((PARSER_grammer_forstat)(_CUR._SL)).forcoder_1;
                    if(_inspect_1461_4500!=null) { // INSPECT _inspect_1461_4500
                        // JavaLine 34 <== SourceLine 1462
                        {
                            // JavaLine 36 <== SourceLine 1461
                            {
                                // JavaLine 38 <== SourceLine 1462
                                if(((PARSER_grammer_forstat)(_CUR._SL)).ftype_1<((char)0) || ((PARSER_grammer_forstat)(_CUR._SL)).ftype_1>((char)4)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((PARSER_grammer_forstat)(_CUR._SL)).ftype_1) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    // JavaLine 42 <== SourceLine 1463
                                    {
                                        // JavaLine 44 <== SourceLine 1464
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.cvar_4);
                                        ;
                                        // JavaLine 47 <== SourceLine 1465
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1465);
                                        ;
                                        // JavaLine 52 <== SourceLine 1466
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.cvar_4);
                                        ;
                                        // JavaLine 55 <== SourceLine 1467
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='F';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1467);
                                        ;
                                        // JavaLine 60 <== SourceLine 1468
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.stepexpr_4);
                                        ;
                                        // JavaLine 63 <== SourceLine 1469
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='d';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1469);
                                        ;
                                        // JavaLine 68 <== SourceLine 1470
                                        _GOTO(_LABEL_PARSER_grammer_forstat_terminateForelt_Block1462_Block1473_termIF_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 2: 
                                    // JavaLine 74 <== SourceLine 1472
                                    {
                                        // JavaLine 76 <== SourceLine 1473
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: terminateForelt -> terminateForelt[externalIdent=PARSER_grammer_forstat_terminateForelt] Kind=5, QUAL=ProcedureDeclaration, HashCode=853972908
                                            ((PARSER)(_CUR._SL._SL._SL)).opn='C';
                                        }
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1473);
                                        ;
                                        // JavaLine 84 <== SourceLine 1474
                                        ((PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1474);
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 92 <== SourceLine 1478
                                    {
                                        // JavaLine 94 <== SourceLine 1479
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.deltavar_4);
                                        ;
                                        // JavaLine 97 <== SourceLine 1480
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1480);
                                        ;
                                        // JavaLine 102 <== SourceLine 1481
                                        new PARSER_codebuffer_copyexpr(_inspect_1461_4500,_inspect_1461_4500.stepexpr_4);
                                        ;
                                        // JavaLine 105 <== SourceLine 1483
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='.';
                                        ;
                                        ((PARSER)(_CUR._SL._SL._SL)).opdhi=_inspect_1461_4500.deltavar_4.opdhii;
                                        ;
                                        // JavaLine 110 <== SourceLine 1484
                                        ((PARSER)(_CUR._SL._SL._SL)).opdlo=_inspect_1461_4500.deltavar_4.opdloo;
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1484);
                                        ;
                                        // JavaLine 115 <== SourceLine 1485
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.cvar_4);
                                        ;
                                        // JavaLine 118 <== SourceLine 1486
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1486);
                                        ;
                                        // JavaLine 123 <== SourceLine 1487
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.cvar_4);
                                        ;
                                        // JavaLine 126 <== SourceLine 1488
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='F';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1488);
                                        ;
                                        // JavaLine 131 <== SourceLine 1489
                                        new PARSER_codebuffer_elt_emit(_inspect_1461_4500.deltavar_4);
                                        ;
                                        // JavaLine 134 <== SourceLine 1490
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='d';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1490);
                                        ;
                                        // JavaLine 139 <== SourceLine 1491
                                        ((PARSER)(_CUR._SL._SL._SL)).opn='C';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1491);
                                        ;
                                        // JavaLine 144 <== SourceLine 1492
                                        ((PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                                        ;
                                        call(((PARSER)(_CUR._SL._SL._SL)).coder,1492);
                                        ;
                                    }
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 153 <== SourceLine 1495
                                _inspect_1461_4500.stepexpr_4=null;
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 terminateForelt",1,1459,10,1473,13,1461,34,1462,36,1461,38,1462,42,1463,44,1464,47,1465,52,1466,55,1467,60,1468,63,1469,68,1470,74,1472,76,1473,84,1474,92,1478,94,1479,97,1480,102,1481,105,1483,110,1484,115,1485,118,1486,123,1487,126,1488,131,1489,134,1490,139,1491,144,1492,153,1495,169,1496);
} // End of Procedure
