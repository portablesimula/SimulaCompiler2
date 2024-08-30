// JavaLine 1 <== SourceLine 1602
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_L2Coder_NewQuant extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1602, lastLine=1616, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_qcateg;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1603
    public CLASS_COMMON_quantity _inspect_1603_4477=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_L2Coder_NewQuant setPar(Object param) {
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
    public CLASS_SCANNER_L2Coder_NewQuant(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_L2Coder_NewQuant(RTS_RTObject _SL,char sp_qcateg) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qcateg = sp_qcateg;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_L2Coder_NewQuant _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1603_4477=new CLASS_COMMON_quantity((_CUR._SL._SL))._STM();
            if(_inspect_1603_4477!=null) { // INSPECT _inspect_1603_4477  type=ref(QUANTITY)
                // JavaLine 45 <== SourceLine 1604
                {
                    // JavaLine 47 <== SourceLine 1603
                    {
                        // JavaLine 49 <== SourceLine 1605
                        _inspect_1603_4477.type_1=((CLASS_SCANNER_L2Coder)(_CUR._SL)).ctype_4;
                        ;
                        _inspect_1603_4477.kind_1=((CLASS_SCANNER_L2Coder)(_CUR._SL)).ckind_4;
                        ;
                        // JavaLine 54 <== SourceLine 1606
                        _inspect_1603_4477.categ_1=p_qcateg;
                        ;
                        _inspect_1603_4477.line_1=((CLASS_SCANNER)(_CUR._SL._SL)).linenr;
                        ;
                        // JavaLine 59 <== SourceLine 1607
                        _inspect_1603_4477.plev_1=1;
                        ;
                        // JavaLine 62 <== SourceLine 1608
                        _inspect_1603_4477.ftag_1=(-(((CLASS_SCANNER_L2Coder)(_CUR._SL)).cqual_4));
                        ;
                        // JavaLine 65 <== SourceLine 1609
                        _inspect_1603_4477.symb_1=new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_SCANNER)(_CUR._SL._SL)).opdhi,((CLASS_SCANNER)(_CUR._SL._SL)).opdlo)._RESULT;
                        ;
                        // JavaLine 68 <== SourceLine 1610
                        if(_VALUE((p_qcateg!=(((char)6))))) {
                            // JavaLine 70 <== SourceLine 1611
                            ((CLASS_SCANNER_L2Coder)(_CUR._SL)).cquant_4=((CLASS_COMMON_quantity)(((CLASS_SCANNER_L2Coder)(_CUR._SL)).cquant_4.next=((CLASS_COMMON_quantity)_inspect_1603_4477)));
                        } else {
                            // JavaLine 73 <== SourceLine 1612
                            if(_VALUE((((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4.favirt==(null)))) {
                                // JavaLine 75 <== SourceLine 1613
                                ((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4.favirt=((CLASS_SCANNER_L2Coder)(_CUR._SL)).vquant_4=((CLASS_COMMON_quantity)_inspect_1603_4477);
                            } else {
                                // JavaLine 78 <== SourceLine 1614
                                ((CLASS_SCANNER_L2Coder)(_CUR._SL)).vquant_4=((CLASS_COMMON_quantity)(((CLASS_SCANNER_L2Coder)(_CUR._SL)).vquant_4.next=((CLASS_COMMON_quantity)_inspect_1603_4477)));
                            }
                        }
                        ;
                        // JavaLine 83 <== SourceLine 1615
                        new CLASS_COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("SCANNER"),1615,new RTS_TXT("NEW Quantity: "),((CLASS_COMMON_quantity)_inspect_1603_4477));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 NewQuant",1,1602,11,1603,45,1604,47,1603,49,1605,54,1606,59,1607,62,1608,65,1609,68,1610,70,1611,73,1612,75,1613,78,1614,83,1615,92,1616);
} // End of Procedure
