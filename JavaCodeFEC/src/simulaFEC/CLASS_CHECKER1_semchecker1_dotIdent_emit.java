// JavaLine 1 <== SourceLine 1560
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_dotIdent_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1560, lastLine=1636, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1562
    public CLASS_CHECKER1_semchecker1_exp _inspect_1562_4577=null;
    // JavaLine 12 <== SourceLine 1580
    public CLASS_CHECKER1_semchecker1_exp _inspect_1580_4578=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_dotIdent_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_dotIdent_emit _STM() {
        // JavaLine 25 <== SourceLine 1562
        {
            // BEGIN INSPECTION 
            _inspect_1562_4577=((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).p2_dotexp;
            if(_inspect_1562_4577!=null) { // INSPECT _inspect_1562_4577  type=ref(EXP)
                // JavaLine 30 <== SourceLine 1563
                {
                    // JavaLine 32 <== SourceLine 1562
                    {
                        // JavaLine 34 <== SourceLine 1563
                        _inspect_1562_4577.cl=((char)1);
                        ;
                        // JavaLine 37 <== SourceLine 1564
                        if(_VALUE((_inspect_1562_4577.type==(((char)8))))) {
                            {
                                // JavaLine 40 <== SourceLine 1565
                                if(_VALUE((_inspect_1562_4577.ctype==(((char)129))))) {
                                    {
                                        // JavaLine 43 <== SourceLine 1566
                                        if(_VALUE(((((CLASS_CHECKER1_semchecker1_argumented)(((CLASS_CHECKER1_semchecker1_exp)_inspect_1562_4577))).p1_ident.kind==(((char)2)))|((((CLASS_CHECKER1_semchecker1_argumented)(((CLASS_CHECKER1_semchecker1_exp)_inspect_1562_4577))).p1_ident.kind==(((char)6))))))) {
                                            // JavaLine 45 <== SourceLine 1568
                                            _inspect_1562_4577.cl=((char)4);
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 51 <== SourceLine 1570
                                    if(_VALUE((_inspect_1562_4577.ctype==('Z')))) {
                                        {
                                            // JavaLine 54 <== SourceLine 1571
                                            if(_VALUE((_inspect_1562_4577.kind!=(((char)1))))) {
                                                {
                                                    // JavaLine 57 <== SourceLine 1572
                                                    _inspect_1562_4577.cl=((char)6);
                                                    ;
                                                    ((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).cl=((char)1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 69 <== SourceLine 1576
                        _inspect_1562_4577.emit_0().CPF();
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 77 <== SourceLine 1579
        if(_VALUE((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).cl==(((char)1))))) {
            {
                // JavaLine 80 <== SourceLine 1580
                {
                    // BEGIN INSPECTION 
                    _inspect_1580_4578=((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).p2_dotexp;
                    if(_inspect_1580_4578!=null) { // INSPECT _inspect_1580_4578  type=ref(EXP)
                        // JavaLine 85 <== SourceLine 1581
                        {
                            // JavaLine 87 <== SourceLine 1580
                            {
                                // JavaLine 89 <== SourceLine 1582
                                if(_VALUE((_inspect_1580_4578.type==(((char)8))))) {
                                    // JavaLine 91 <== SourceLine 1583
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((((_inspect_1580_4578.cl==(((char)4)))||((_inspect_1580_4578.cl==(((char)6))))))?(((char)14)):('A'));
                                } else {
                                    // JavaLine 94 <== SourceLine 1587
                                    {
                                        // JavaLine 96 <== SourceLine 1588
                                        if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6!=(')')))) {
                                            {
                                                if(_VALUE(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).NoneCheck_6)) {
                                                    // JavaLine 100 <== SourceLine 1589
                                                    {
                                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
                                                        ;
                                                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1589);
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 110 <== SourceLine 1590
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='L';
                                    }
                                }
                                ;
                                // JavaLine 115 <== SourceLine 1592
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning;
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1592);
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 125 <== SourceLine 1594
                if(_VALUE((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).p_ch==('L')))) {
                    {
                        // JavaLine 128 <== SourceLine 1596
                        if(((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).kind<((char)0) || ((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).kind) { // BEGIN SWITCH STATEMENT
                            case 1: 
                            // JavaLine 132 <== SourceLine 1597
                            {
                                // JavaLine 134 <== SourceLine 1598
                                ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6;
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)12);
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1598);
                                ;
                                // JavaLine 141 <== SourceLine 1599
                                ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((char)12);
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='x';
                                ;
                                // JavaLine 146 <== SourceLine 1600
                                if(((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning.categ_1<((char)0) || ((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning.categ_1) { // BEGIN SWITCH STATEMENT
                                    case 3: 
                                    case 4: 
                                    ;
                                    break;
                                    case 6: 
                                    // JavaLine 154 <== SourceLine 1603
                                    if(_VALUE((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning.descr_1==(null)))) {
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)147);
                                    }
                                    break;
                                    default:
                                    // JavaLine 160 <== SourceLine 1604
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)147);
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 165 <== SourceLine 1613
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1613);
                                ;
                            }
                            break;
                            case 5: 
                            // JavaLine 171 <== SourceLine 1615
                            {
                                // JavaLine 173 <== SourceLine 1617
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='+';
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1617);
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
                ;
            }
        } else {
            // JavaLine 187 <== SourceLine 1622
            {
                // JavaLine 189 <== SourceLine 1623
                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6!=(')')))) {
                    {
                        if(_VALUE(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).NoneCheck_6)) {
                            // JavaLine 193 <== SourceLine 1624
                            {
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=')';
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1624);
                            }
                        }
                    }
                }
                ;
                // JavaLine 203 <== SourceLine 1625
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).meaning;
                ;
                // JavaLine 206 <== SourceLine 1626
                if(_VALUE(((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).cl==(((char)6)))||((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).cl==(((char)4))))))) {
                    {
                        // JavaLine 209 <== SourceLine 1628
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='s';
                        ;
                    }
                } else {
                    // JavaLine 214 <== SourceLine 1630
                    if(_VALUE((((CLASS_CHECKER1_semchecker1_dotIdent)(_CUR._SL)).cl==(((char)5))))) {
                        {
                            // JavaLine 217 <== SourceLine 1631
                            ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='P';
                            ;
                        }
                    } else {
                        // JavaLine 222 <== SourceLine 1633
                        new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL),((char)8),1633);
                    }
                }
                ;
                // JavaLine 227 <== SourceLine 1634
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1634);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,1560,10,1562,12,1580,25,1562,30,1563,32,1562,34,1563,37,1564,40,1565,43,1566,45,1568,51,1570,54,1571,57,1572,69,1576,77,1579,80,1580,85,1581,87,1580,89,1582,91,1583,94,1587,96,1588,100,1589,110,1590,115,1592,125,1594,128,1596,132,1597,134,1598,141,1599,146,1600,154,1603,160,1604,165,1613,171,1615,173,1617,187,1622,189,1623,193,1624,203,1625,206,1626,209,1628,214,1630,217,1631,222,1633,227,1634,235,1636);
} // End of Procedure
