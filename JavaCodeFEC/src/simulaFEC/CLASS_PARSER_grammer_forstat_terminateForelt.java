// JavaLine 1 <== SourceLine 1460
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_forstat_terminateForelt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1460, lastLine=1497, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1474
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_forstat_terminateForelt_Block1463_Block1474_termIF_0=new RTS_LABEL(this,0,1,"termIF"); // Local Label #1=termIF At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1462
    public CLASS_PARSER_codebuffer _inspect_1462_4500=null;
    // Normal Constructor
    public CLASS_PARSER_grammer_forstat_terminateForelt(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_forstat_terminateForelt _STM() {
        CLASS_PARSER_grammer_forstat_terminateForelt _THIS=(CLASS_PARSER_grammer_forstat_terminateForelt)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_1462_4500=((CLASS_PARSER_grammer_forstat)(_CUR._SL)).forcoder_1;
                    if(_inspect_1462_4500!=null) { // INSPECT _inspect_1462_4500  type=ref(CODEBUFFER)
                        // JavaLine 34 <== SourceLine 1463
                        {
                            // JavaLine 36 <== SourceLine 1462
                            {
                                // JavaLine 38 <== SourceLine 1463
                                if(((CLASS_PARSER_grammer_forstat)(_CUR._SL)).ftype_1<((char)0) || ((CLASS_PARSER_grammer_forstat)(_CUR._SL)).ftype_1>((char)4)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CLASS_PARSER_grammer_forstat)(_CUR._SL)).ftype_1) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    // JavaLine 42 <== SourceLine 1464
                                    {
                                        // JavaLine 44 <== SourceLine 1465
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.cvar_4);
                                        ;
                                        // JavaLine 47 <== SourceLine 1466
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1466);
                                        ;
                                        // JavaLine 52 <== SourceLine 1467
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.cvar_4);
                                        ;
                                        // JavaLine 55 <== SourceLine 1468
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='F';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1468);
                                        ;
                                        // JavaLine 60 <== SourceLine 1469
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.stepexpr_4);
                                        ;
                                        // JavaLine 63 <== SourceLine 1470
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='d';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1470);
                                        ;
                                        // JavaLine 68 <== SourceLine 1471
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_forstat_terminateForelt_Block1463_Block1474_termIF_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                    break;
                                    case 2: 
                                    // JavaLine 74 <== SourceLine 1473
                                    {
                                        // JavaLine 76 <== SourceLine 1474
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: terminateForelt -> terminateForelt[externalIdent=CLASS_PARSER_grammer_forstat_terminateForelt] Kind=5, QUAL=ProcedureDeclaration, HashCode=1316735289
                                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='C';
                                        }
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1474);
                                        ;
                                        // JavaLine 84 <== SourceLine 1475
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1475);
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 92 <== SourceLine 1479
                                    {
                                        // JavaLine 94 <== SourceLine 1480
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.deltavar_4);
                                        ;
                                        // JavaLine 97 <== SourceLine 1481
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1481);
                                        ;
                                        // JavaLine 102 <== SourceLine 1482
                                        new CLASS_PARSER_codebuffer_copyexpr(_inspect_1462_4500,_inspect_1462_4500.stepexpr_4);
                                        ;
                                        // JavaLine 105 <== SourceLine 1484
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='.';
                                        ;
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=_inspect_1462_4500.deltavar_4.opdhii;
                                        ;
                                        // JavaLine 110 <== SourceLine 1485
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=_inspect_1462_4500.deltavar_4.opdloo;
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1485);
                                        ;
                                        // JavaLine 115 <== SourceLine 1486
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.cvar_4);
                                        ;
                                        // JavaLine 118 <== SourceLine 1487
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='R';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1487);
                                        ;
                                        // JavaLine 123 <== SourceLine 1488
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.cvar_4);
                                        ;
                                        // JavaLine 126 <== SourceLine 1489
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='F';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1489);
                                        ;
                                        // JavaLine 131 <== SourceLine 1490
                                        new CLASS_PARSER_codebuffer_elt_emit(_inspect_1462_4500.deltavar_4);
                                        ;
                                        // JavaLine 134 <== SourceLine 1491
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='d';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1491);
                                        ;
                                        // JavaLine 139 <== SourceLine 1492
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='C';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1492);
                                        ;
                                        // JavaLine 144 <== SourceLine 1493
                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1493);
                                        ;
                                    }
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 153 <== SourceLine 1496
                                _inspect_1462_4500.stepexpr_4=null;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 terminateForelt",1,1460,10,1474,13,1462,34,1463,36,1462,38,1463,42,1464,44,1465,47,1466,52,1467,55,1468,60,1469,63,1470,68,1471,74,1473,76,1474,84,1475,92,1479,94,1480,97,1481,102,1482,105,1484,110,1485,115,1486,118,1487,123,1488,126,1489,131,1490,134,1491,139,1492,144,1493,153,1496,169,1497);
} // End of Procedure
