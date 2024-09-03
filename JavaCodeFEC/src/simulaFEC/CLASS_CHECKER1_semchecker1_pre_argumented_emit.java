// JavaLine 1 <== SourceLine 1731
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_pre_argumented_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1731, lastLine=1776, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1749
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_pre_argumented_emit_Block1734_LOUT_0=new RTS_LABEL(this,0,1,"LOUT"); // Local Label #1=LOUT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1733
    public CLASS_CHECKER1_semchecker1_identifier _inspect_1733_4580=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_pre_argumented_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_pre_argumented_emit _STM() {
        CLASS_CHECKER1_semchecker1_pre_argumented_emit _THIS=(CLASS_CHECKER1_semchecker1_pre_argumented_emit)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_1733_4580=((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident;
                    if(_inspect_1733_4580!=null) { // INSPECT _inspect_1733_4580  type=ref(IDENTIFIER)
                        // JavaLine 34 <== SourceLine 1734
                        {
                            // JavaLine 36 <== SourceLine 1733
                            {
                                // JavaLine 38 <== SourceLine 1734
                                _inspect_1733_4580.cl=((char)1);
                                ;
                                _inspect_1733_4580.emit_0().CPF();
                                ;
                                // JavaLine 43 <== SourceLine 1735
                                if(_inspect_1733_4580.kind<((char)0) || _inspect_1733_4580.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(_inspect_1733_4580.kind) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    // JavaLine 47 <== SourceLine 1736
                                    {
                                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6;
                                        ;
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)12);
                                    }
                                    break;
                                    case 5: 
                                    // JavaLine 55 <== SourceLine 1738
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=(((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p_ch==(']')))?(','):('+'));
                                    break;
                                    case 6: 
                                    // JavaLine 59 <== SourceLine 1740
                                    {
                                        // JavaLine 61 <== SourceLine 1741
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)144);
                                        ;
                                    }
                                    break;
                                    case 2: 
                                    // JavaLine 67 <== SourceLine 1742
                                    {
                                        // JavaLine 69 <== SourceLine 1743
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='h';
                                        ;
                                    }
                                    break;
                                    case 4: 
                                    // JavaLine 75 <== SourceLine 1744
                                    {
                                        // JavaLine 77 <== SourceLine 1745
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='h';
                                        ;
                                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_pre_argumented_emit_Block1734_LOUT_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    default:
                                    // JavaLine 84 <== SourceLine 1746
                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_pre_argumented_emit_Block1734_LOUT_0); // GOTO EVALUATED LABEL
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 89 <== SourceLine 1748
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=RTS_ENVIRONMENT._char(((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_noofactargs);
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1748);
                                ;
                                ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6;
                                ;
                                // JavaLine 96 <== SourceLine 1749
                                {
                                    _SIM_LABEL(1); // DeclaredIn: emit -> emit[externalIdent=CLASS_CHECKER1_semchecker1_pre_argumented_emit] Kind=5, QUAL=ProcedureDeclaration, HashCode=1526336282
                                    if(_VALUE(((_inspect_1733_4580.meaning!=(null))||((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p_ch!=(']')))))) {
                                        // JavaLine 100 <== SourceLine 1751
                                        ((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_arguments.emit_0().CPF();
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 110 <== SourceLine 1755
                if(_VALUE((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident.kind==(((char)10))))) {
                    ;
                } else {
                    // JavaLine 114 <== SourceLine 1756
                    if(_VALUE((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p_ch==(']')))) {
                        {
                            // JavaLine 117 <== SourceLine 1757
                            ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)32);
                            ;
                            call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1757);
                            ;
                            // JavaLine 122 <== SourceLine 1758
                            new CLASS_CHECKER1_semchecker1_enterblock((_CUR._SL._SL));
                            ;
                        }
                    } else {
                        // JavaLine 127 <== SourceLine 1760
                        {
                            // JavaLine 129 <== SourceLine 1761
                            if(((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident.kind<((char)0) || ((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident.kind) { // BEGIN SWITCH STATEMENT
                                case 2: 
                                case 6: 
                                // JavaLine 134 <== SourceLine 1763
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=(((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).cl==(((char)5))))?(((char)13)):((((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).cl==(((char)1))))?('b'):(((char)134)))));
                                break;
                                case 4: 
                                // JavaLine 138 <== SourceLine 1766
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=(((((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).cl==(((char)5))))?(((char)13)):('5'));
                                break;
                                case 1: 
                                // JavaLine 142 <== SourceLine 1768
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=(((((CLASS_CHECKER1_semchecker1_parameter)(((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_arguments)).p1_formal==(null)))?(((char)147)):('x'));
                                break;
                                case 5: 
                                // JavaLine 146 <== SourceLine 1770
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='0';
                                break;
                                default:
                                // JavaLine 150 <== SourceLine 1771
                                new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL),((char)8),1771);
                                break;
                            } // END SWITCH STATEMENT
                            ;
                            // JavaLine 155 <== SourceLine 1774
                            ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=RTS_ENVIRONMENT._char(((CLASS_CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_noofactargs);
                            ;
                            call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1774);
                            ;
                        }
                    }
                }
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,1731,10,1749,13,1733,34,1734,36,1733,38,1734,43,1735,47,1736,55,1738,59,1740,61,1741,67,1742,69,1743,75,1744,77,1745,84,1746,89,1748,96,1749,100,1751,110,1755,114,1756,117,1757,122,1758,127,1760,129,1761,134,1763,138,1766,142,1768,146,1770,150,1771,155,1774,173,1776);
} // End of Procedure
