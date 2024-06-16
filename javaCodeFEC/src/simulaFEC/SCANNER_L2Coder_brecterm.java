// JavaLine 1 <== SourceLine 1655
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_L2Coder_brecterm extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1655, lastLine=1688, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1656
    public COMMON_brecord _inspect_1656_4479=null;
    // Normal Constructor
    public SCANNER_L2Coder_brecterm(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_L2Coder_brecterm _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1656_4479=((SCANNER_L2Coder)(_CUR._SL)).cbrec_4;
            if(_inspect_1656_4479!=null) { // INSPECT _inspect_1656_4479
                // JavaLine 27 <== SourceLine 1657
                {
                    // JavaLine 29 <== SourceLine 1656
                    {
                        // JavaLine 31 <== SourceLine 1664
                        ((SCANNER_L2Coder)(_CUR._SL)).xquant_4=_inspect_1656_4479.fpar;
                        ;
                        // JavaLine 34 <== SourceLine 1665
                        _inspect_1656_4479.fpar=((COMMON_quantity)(_inspect_1656_4479.fpar.next));
                        ;
                        // JavaLine 37 <== SourceLine 1666
                        if(_VALUE((((SCANNER_L2Coder)(_CUR._SL)).xquant_4.encl_1==(null)))) {
                            // JavaLine 39 <== SourceLine 1667
                            {
                                ((SCANNER_L2Coder)(_CUR._SL)).cquant_4=null;
                                ;
                                ((SCANNER_L2Coder)(_CUR._SL)).cbrec_4=null;
                            }
                        } else {
                            // JavaLine 46 <== SourceLine 1668
                            {
                                // JavaLine 48 <== SourceLine 1669
                                ((SCANNER_L2Coder)(_CUR._SL)).cbrec_4=((SCANNER_L2Coder)(_CUR._SL)).xquant_4.encl_1;
                                ;
                                // JavaLine 51 <== SourceLine 1670
                                ((SCANNER_L2Coder)(_CUR._SL)).cquant_4=((SCANNER_L2Coder)(_CUR._SL)).cbrec_4.fpar;
                                ;
                                // JavaLine 54 <== SourceLine 1671
                                while((((SCANNER_L2Coder)(_CUR._SL)).cquant_4.next!=(null))) {
                                    ((SCANNER_L2Coder)(_CUR._SL)).cquant_4=((COMMON_quantity)(((SCANNER_L2Coder)(_CUR._SL)).cquant_4.next));
                                }
                                ;
                                // JavaLine 59 <== SourceLine 1672
                                ((SCANNER_L2Coder)(_CUR._SL)).vquant_4=((SCANNER_L2Coder)(_CUR._SL)).cbrec_4.favirt;
                                ;
                                // JavaLine 62 <== SourceLine 1673
                                if(_VALUE((((SCANNER_L2Coder)(_CUR._SL)).vquant_4!=(null)))) {
                                    // JavaLine 64 <== SourceLine 1674
                                    while((((SCANNER_L2Coder)(_CUR._SL)).vquant_4.next!=(null))) {
                                        ((SCANNER_L2Coder)(_CUR._SL)).vquant_4=((COMMON_quantity)(((SCANNER_L2Coder)(_CUR._SL)).vquant_4.next));
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 73 <== SourceLine 1677
                        if(_VALUE((((_inspect_1656_4479.stmtag!=(((char)0)))||((_inspect_1656_4479.dcltag!=(((char)0)))))||((_inspect_1656_4479.inrtag!=(((char)0))))))) {
                            // JavaLine 75 <== SourceLine 1679
                            {
                                _inspect_1656_4479.hasCode=true;
                                ;
                                // JavaLine 79 <== SourceLine 1680
                                if(_VALUE(((_inspect_1656_4479.stmtag!=(((char)0)))&&((_inspect_1656_4479.dcltag!=(((char)0))))))) {
                                    // JavaLine 81 <== SourceLine 1681
                                    _inspect_1656_4479.stmtag=((char)3);
                                }
                                ;
                                // JavaLine 85 <== SourceLine 1682
                                if(_VALUE((_inspect_1656_4479.inrtag!=(((char)0))))) {
                                    {
                                        // JavaLine 88 <== SourceLine 1683
                                        if(_VALUE((_inspect_1656_4479.stmtag!=(((char)0))))) {
                                            // JavaLine 90 <== SourceLine 1684
                                            _inspect_1656_4479.inrtag=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(_inspect_1656_4479.stmtag)+(1)));
                                        } else {
                                            // JavaLine 93 <== SourceLine 1685
                                            if(_VALUE((_inspect_1656_4479.dcltag!=(((char)0))))) {
                                                _inspect_1656_4479.inrtag=((char)3);
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 brecterm",1,1655,10,1656,27,1657,29,1656,31,1664,34,1665,37,1666,39,1667,46,1668,48,1669,51,1670,54,1671,59,1672,62,1673,64,1674,73,1677,75,1679,79,1680,81,1681,85,1682,88,1683,90,1684,93,1685,111,1688);
} // End of Procedure
