// JavaLine 1 <== SourceLine 1602
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_L2Coder_NewQuant extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1602, lastLine=1616, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_qcateg;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1603
    public COMMON_quantity _inspect_1603_4477=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_L2Coder_NewQuant setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qcateg=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_L2Coder_NewQuant(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_L2Coder_NewQuant(RTS_RTObject _SL,char sp_qcateg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qcateg = sp_qcateg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_L2Coder_NewQuant _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1603_4477=new COMMON_quantity((_CUR._SL._SL))._STM();
            if(_inspect_1603_4477!=null) { // INSPECT _inspect_1603_4477
                // JavaLine 45 <== SourceLine 1604
                {
                    // JavaLine 47 <== SourceLine 1603
                    {
                        // JavaLine 49 <== SourceLine 1605
                        _inspect_1603_4477.type_1=((SCANNER_L2Coder)(_CUR._SL)).ctype_4;
                        ;
                        _inspect_1603_4477.kind_1=((SCANNER_L2Coder)(_CUR._SL)).ckind_4;
                        ;
                        // JavaLine 54 <== SourceLine 1606
                        _inspect_1603_4477.categ_1=p_qcateg;
                        ;
                        _inspect_1603_4477.line_1=((SCANNER)(_CUR._SL._SL)).linenr;
                        ;
                        // JavaLine 59 <== SourceLine 1607
                        _inspect_1603_4477.plev_1=1;
                        ;
                        // JavaLine 62 <== SourceLine 1608
                        _inspect_1603_4477.ftag_1=(-(((SCANNER_L2Coder)(_CUR._SL)).cqual_4));
                        ;
                        // JavaLine 65 <== SourceLine 1609
                        _inspect_1603_4477.symb_1=new COMMON_boxof((_CUR._SL._SL),((SCANNER)(_CUR._SL._SL)).opdhi,((SCANNER)(_CUR._SL._SL)).opdlo)._RESULT;
                        ;
                        // JavaLine 68 <== SourceLine 1610
                        if(_VALUE((p_qcateg!=(((char)6))))) {
                            // JavaLine 70 <== SourceLine 1611
                            ((SCANNER_L2Coder)(_CUR._SL)).cquant_4=((COMMON_quantity)(((SCANNER_L2Coder)(_CUR._SL)).cquant_4.next=((COMMON_quantity)_inspect_1603_4477)));
                        } else {
                            // JavaLine 73 <== SourceLine 1612
                            if(_VALUE((((SCANNER_L2Coder)(_CUR._SL)).cbrec_4.favirt==(null)))) {
                                // JavaLine 75 <== SourceLine 1613
                                ((SCANNER_L2Coder)(_CUR._SL)).cbrec_4.favirt=((SCANNER_L2Coder)(_CUR._SL)).vquant_4=((COMMON_quantity)_inspect_1603_4477);
                            } else {
                                // JavaLine 78 <== SourceLine 1614
                                ((SCANNER_L2Coder)(_CUR._SL)).vquant_4=((COMMON_quantity)(((SCANNER_L2Coder)(_CUR._SL)).vquant_4.next=((COMMON_quantity)_inspect_1603_4477)));
                            }
                        }
                        ;
                        // JavaLine 83 <== SourceLine 1615
                        new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("SCANNER"),1615,new RTS_TXT("NEW Quantity: "),((COMMON_quantity)_inspect_1603_4477));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 NewQuant",1,1602,11,1603,45,1604,47,1603,49,1605,54,1606,59,1607,62,1608,65,1609,68,1610,70,1611,73,1612,75,1613,78,1614,83,1615,92,1616);
} // End of Procedure
