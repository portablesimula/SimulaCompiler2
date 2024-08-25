// JavaLine 1 <== SourceLine 1120
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_allocate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1120, lastLine=1857, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1135
    public COMMON_brecord B1=null;
    public COMMON_quantity Q=null;
    public COMMON_quantity TUchain=null;
    public COMMON_brecord brc=null;
    // JavaLine 15 <== SourceLine 1797
    public COMMON_brecord _inspect_1797_4550=null;
    // Normal Constructor
    public BUILDER2_prechecker_allocate(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_prechecker_allocate _STM() {
        // JavaLine 28 <== SourceLine 1780
        brc=new COMMON_getBrc((_CUR._SL._SL),((BUILDER2_prechecker)(_CUR._SL)).lastblhi,((BUILDER2_prechecker)(_CUR._SL)).lastbllo)._RESULT;
        ;
        // JavaLine 31 <== SourceLine 1781
        if(_VALUE((brc.kind==(((char)11))))) {
            {
                // JavaLine 34 <== SourceLine 1782
                brc.blev=((BUILDER2)(_CUR._SL._SL)).cblev_6;
                ;
                brc.rtblev=((BUILDER2)(_CUR._SL._SL)).crtblev_6;
            }
        } else {
            // JavaLine 40 <== SourceLine 1783
            {
                // JavaLine 42 <== SourceLine 1784
                brc.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER2)(_CUR._SL._SL)).cblev_6)+(1)));
                ;
                // JavaLine 45 <== SourceLine 1785
                brc.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((BUILDER2)(_CUR._SL._SL)).crtblev_6)+(1)));
            }
        }
        ;
        // JavaLine 50 <== SourceLine 1787
        new BUILDER2_prechecker_allocate_alloc1((_CUR),brc);
        ;
        // JavaLine 53 <== SourceLine 1789
        Q=brc.declquant=new COMMON_quantity((_CUR._SL._SL))._STM();
        ;
        Q.descr_1=brc;
        ;
        // JavaLine 58 <== SourceLine 1790
        Q.kind_1=brc.kind;
        ;
        Q.line_1=brc.line1;
        ;
        Q.plev_1=1;
        ;
        // JavaLine 65 <== SourceLine 1791
        Q.encl_1=((BUILDER2)(_CUR._SL._SL)).unknowns;
        ;
        // JavaLine 68 <== SourceLine 1793
        if(_VALUE((((BUILDER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new COMMON_brecord_dump(brc,new RTS_TXT("ALLOCATE"));
        }
        ;
        // JavaLine 73 <== SourceLine 1794
        if(brc.kind<((char)0) || brc.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
        switch(brc.kind) { // BEGIN SWITCH STATEMENT
            case 9: 
            // JavaLine 77 <== SourceLine 1795
            {
                // JavaLine 79 <== SourceLine 1796
                if(_VALUE((((BUILDER2_prechecker)(_CUR._SL)).blockpref_1==(null)))) {
                    brc.kind=Q.kind_1=((char)8);
                } else {
                    // JavaLine 83 <== SourceLine 1797
                    {
                        // BEGIN INSPECTION 
                        _inspect_1797_4550=((BUILDER2_prechecker)(_CUR._SL)).blockpref_1.descr_1;
                        if(_inspect_1797_4550!=null) { // INSPECT _inspect_1797_4550
                            // JavaLine 88 <== SourceLine 1798
                            {
                                // JavaLine 90 <== SourceLine 1797
                                {
                                    // JavaLine 92 <== SourceLine 1798
                                    TUchain=_inspect_1797_4550.declquant;
                                    ;
                                    // JavaLine 95 <== SourceLine 1799
                                    while((TUchain.plev_1>(1))) {
                                        {
                                            // JavaLine 98 <== SourceLine 1800
                                            if(_VALUE(TUchain.descr_1.thisused)) {
                                                new ERRMSG_error0((_CUR._SL._SL),151);
                                            }
                                            ;
                                            // JavaLine 103 <== SourceLine 1801
                                            TUchain=TUchain.prefqual_1;
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 109 <== SourceLine 1803
                                    if(_VALUE((_inspect_1797_4550.blev!=(brc.blev)))) {
                                        {
                                            // JavaLine 112 <== SourceLine 1806
                                            if(_VALUE((_IS(((BUILDER2_prechecker)(_CUR._SL)).blockpref_1,COMMON_extquantity.class)&&((((COMMON_extquantity)(((BUILDER2_prechecker)(_CUR._SL)).blockpref_1)).clf_2==(((char)4))))))) {
                                                ;
                                            } else {
                                                // JavaLine 116 <== SourceLine 1808
                                                new ERRMSG_error1qlin((_CUR._SL._SL),331,((BUILDER2_prechecker)(_CUR._SL)).blockpref_1);
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 123 <== SourceLine 1810
                                    Q.prefqual_1=((BUILDER2_prechecker)(_CUR._SL)).blockpref_1;
                                    ;
                                    Q.plev_1=(((BUILDER2_prechecker)(_CUR._SL)).blockpref_1.plev_1+(1));
                                    ;
                                    // JavaLine 128 <== SourceLine 1811
                                    ((BUILDER2_prechecker)(_CUR._SL)).blockpref_1=null;
                                    ;
                                    // JavaLine 131 <== SourceLine 1812
                                    brc.npar=_inspect_1797_4550.npar;
                                    ;
                                    // JavaLine 134 <== SourceLine 1814
                                    if(_VALUE(_inspect_1797_4550.localclasses)) {
                                        brc.localclasses=true;
                                    }
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
            }
            break;
            case 1: 
            // JavaLine 148 <== SourceLine 1818
            {
                // JavaLine 150 <== SourceLine 1820
                Q.prefqual_1=new COMMON_getBrc((_CUR._SL._SL),brc.hidlist.idhi,brc.hidlist.idlo)._RESULT.declquant;
                ;
                // JavaLine 153 <== SourceLine 1822
                brc.hidlist=null;
                ;
                // JavaLine 156 <== SourceLine 1823
                Q.plev_1=2;
                ;
                // JavaLine 159 <== SourceLine 1824
                Q.symb_1=Q.prefqual_1.symb_1;
                ;
                // JavaLine 162 <== SourceLine 1825
                Q.type_1=Q.prefqual_1.type_1;
                ;
                Q.categ_1=Q.prefqual_1.categ_1;
                ;
                // JavaLine 167 <== SourceLine 1826
                brc.npar=Q.prefqual_1.descr_1.npar;
                ;
            }
            break;
            case 11: 
            // JavaLine 173 <== SourceLine 1831
            {
                // JavaLine 175 <== SourceLine 1834
                B1=((BUILDER2)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((BUILDER2)(_CUR._SL._SL)).cblev_6));
                ;
                // JavaLine 178 <== SourceLine 1835
                Q.prefqual_1=B1.declquant;
                ;
                Q.plev_1=(Q.prefqual_1.plev_1+(1));
                ;
                // JavaLine 183 <== SourceLine 1836
                Q.categ_1=((char)7);
                ;
                Q.type_1=((char)14);
                ;
                // JavaLine 188 <== SourceLine 1837
                brc.npar=B1.npar;
                ;
                // JavaLine 191 <== SourceLine 1840
                Q=Q.prefqual_1;
                ;
                // JavaLine 194 <== SourceLine 1841
                if(_VALUE((Q.descr_1.inspected!=(((char)0))))) {
                    {
                        // JavaLine 197 <== SourceLine 1842
                        Q.descr_1.connests=brc.connests;
                        ;
                        // JavaLine 200 <== SourceLine 1843
                        while((Q.plev_1!=(0))) {
                            {
                                // JavaLine 203 <== SourceLine 1844
                                Q=Q.prefqual_1;
                                ;
                                Q.descr_1.connests=brc.connests;
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
            }
            break;
        } // END SWITCH STATEMENT
        ;
        // JavaLine 218 <== SourceLine 1849
        if(_VALUE((((BUILDER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new COMMON_brecord_dump(brc,new RTS_TXT("- before ALLOC2"));
        }
        ;
        // JavaLine 223 <== SourceLine 1851
        new BUILDER2_prechecker_allocate_alloc2((_CUR),brc);
        ;
        // JavaLine 226 <== SourceLine 1854
        if(_VALUE((((BUILDER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new COMMON_brecord_dump(brc,new RTS_TXT("- after ALLOC2"));
        }
        ;
        // JavaLine 231 <== SourceLine 1855
        new BUILDER2_prechecker_allocate_LAYOUT((_CUR),brc);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 allocate",1,1120,10,1135,15,1797,28,1780,31,1781,34,1782,40,1783,42,1784,45,1785,50,1787,53,1789,58,1790,65,1791,68,1793,73,1794,77,1795,79,1796,83,1797,88,1798,90,1797,92,1798,95,1799,98,1800,103,1801,109,1803,112,1806,116,1808,123,1810,128,1811,131,1812,134,1814,148,1818,150,1820,153,1822,156,1823,159,1824,162,1825,167,1826,173,1831,175,1834,178,1835,183,1836,188,1837,191,1840,194,1841,197,1842,200,1843,203,1844,218,1849,223,1851,226,1854,231,1855,236,1857);
} // End of Procedure
