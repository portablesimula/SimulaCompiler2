// JavaLine 1 <== SourceLine 1635
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_L2Coder_brecinit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1635, lastLine=1652, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_breckind;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1636
    public CLASS_COMMON_brctab2 tab2=null;
    // JavaLine 13 <== SourceLine 1637
    public CLASS_COMMON_brecord _inspect_1637_4478=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_L2Coder_brecinit setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_breckind=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_L2Coder_brecinit(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_L2Coder_brecinit(RTS_RTObject _SL,char sp_breckind) {
        super(_SL);
        // Parameter assignment to locals
        this.p_breckind = sp_breckind;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_L2Coder_brecinit _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1637_4478=new CLASS_COMMON_brecord((_CUR._SL._SL))._STM();
            if(_inspect_1637_4478!=null) { // INSPECT _inspect_1637_4478  type=ref(BRECORD)
                // JavaLine 47 <== SourceLine 1638
                {
                    // JavaLine 49 <== SourceLine 1637
                    {
                        // JavaLine 51 <== SourceLine 1638
                        _inspect_1637_4478.blnohi=((CLASS_SCANNER)(_CUR._SL._SL)).nextblhi;
                        ;
                        _inspect_1637_4478.blnolo=((CLASS_SCANNER)(_CUR._SL._SL)).nextbllo;
                        ;
                        // JavaLine 56 <== SourceLine 1639
                        _inspect_1637_4478.kind=p_breckind;
                        ;
                        _inspect_1637_4478.line1=((CLASS_SCANNER)(_CUR._SL._SL)).linenr;
                        ;
                        // JavaLine 61 <== SourceLine 1640
                        if(_VALUE((((CLASS_SCANNER)(_CUR._SL._SL)).nextbllo==(((char)255))))) {
                            {
                                // JavaLine 64 <== SourceLine 1641
                                ((CLASS_SCANNER)(_CUR._SL._SL)).nextbllo=((char)0);
                                ;
                                // JavaLine 67 <== SourceLine 1642
                                ((CLASS_SCANNER)(_CUR._SL._SL)).nextblhi=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL._SL)).nextblhi)+(1)));
                                ;
                            }
                        } else {
                            // JavaLine 72 <== SourceLine 1643
                            ((CLASS_SCANNER)(_CUR._SL._SL)).nextbllo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCANNER)(_CUR._SL._SL)).nextbllo)+(1)));
                        }
                        ;
                        // JavaLine 76 <== SourceLine 1644
                        ((CLASS_SCANNER_L2Coder)(_CUR._SL)).cquant_4=_inspect_1637_4478.fpar=new CLASS_COMMON_quantity((_CUR._SL._SL))._STM();
                        ;
                        _inspect_1637_4478.fpar.categ_1=((char)5);
                        ;
                        // JavaLine 81 <== SourceLine 1645
                        _inspect_1637_4478.fpar.encl_1=((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4;
                        ;
                        // JavaLine 84 <== SourceLine 1646
                        tab2=((CLASS_SCANNER)(_CUR._SL._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1637_4478.blnohi));
                        ;
                        // JavaLine 87 <== SourceLine 1647
                        if(_VALUE((tab2==(null)))) {
                            {
                                // JavaLine 90 <== SourceLine 1648
                                tab2=new CLASS_COMMON_brctab2((_CUR._SL._SL))._STM();
                                ;
                                ((CLASS_SCANNER)(_CUR._SL._SL)).brctab.putELEMENT(((CLASS_SCANNER)(_CUR._SL._SL)).brctab.index(RTS_ENVIRONMENT.rank(_inspect_1637_4478.blnohi)),tab2);
                            }
                        }
                        ;
                        // JavaLine 97 <== SourceLine 1649
                        tab2.val.putELEMENT(tab2.val.index(RTS_ENVIRONMENT.rank(_inspect_1637_4478.blnolo)),((CLASS_SCANNER_L2Coder)(_CUR._SL)).cbrec_4=((CLASS_COMMON_brecord)_inspect_1637_4478));
                        ;
                        // JavaLine 100 <== SourceLine 1650
                        new CLASS_COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("SCANNER"),1650,new RTS_TXT("NEW Quantity: "),_inspect_1637_4478.fpar);
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 brecinit",1,1635,11,1636,13,1637,47,1638,49,1637,51,1638,56,1639,61,1640,64,1641,67,1642,72,1643,76,1644,81,1645,84,1646,87,1647,90,1648,97,1649,100,1650,110,1652);
} // End of Procedure
