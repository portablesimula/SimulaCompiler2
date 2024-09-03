// JavaLine 1 <== SourceLine 1779
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_main_program_of_allocate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1779, lastLine=1857, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1797
    public CLASS_COMMON_brecord _inspect_1797_4550=null;
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_main_program_of_allocate(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate_main_program_of_allocate _STM() {
        // JavaLine 23 <== SourceLine 1780
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc=new CLASS_COMMON_getBrc((_CUR._SL._SL._SL),((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).lastblhi,((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).lastbllo)._RESULT;
        ;
        // JavaLine 26 <== SourceLine 1781
        if(_VALUE((((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind==(((char)11))))) {
            {
                // JavaLine 29 <== SourceLine 1782
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.blev=((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6;
                ;
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.rtblev=((CLASS_BUILDER2)(_CUR._SL._SL._SL)).crtblev_6;
            }
        } else {
            // JavaLine 35 <== SourceLine 1783
            {
                // JavaLine 37 <== SourceLine 1784
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6)+(1)));
                ;
                // JavaLine 40 <== SourceLine 1785
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).crtblev_6)+(1)));
            }
        }
        ;
        // JavaLine 45 <== SourceLine 1787
        new CLASS_BUILDER2_prechecker_allocate_alloc1((_CUR._SL),((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc);
        ;
        // JavaLine 48 <== SourceLine 1789
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.declquant=new CLASS_COMMON_quantity((_CUR._SL._SL._SL))._STM();
        ;
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.descr_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc;
        ;
        // JavaLine 53 <== SourceLine 1790
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.kind_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind;
        ;
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.line_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.line1;
        ;
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.plev_1=1;
        ;
        // JavaLine 60 <== SourceLine 1791
        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.encl_1=((CLASS_BUILDER2)(_CUR._SL._SL._SL)).unknowns;
        ;
        // JavaLine 63 <== SourceLine 1793
        if(_VALUE((((CLASS_BUILDER2)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new CLASS_COMMON_brecord_dump(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc,new RTS_TXT("ALLOCATE"));
        }
        ;
        // JavaLine 68 <== SourceLine 1794
        if(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind<((char)0) || ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
        switch(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind) { // BEGIN SWITCH STATEMENT
            case 9: 
            // JavaLine 72 <== SourceLine 1795
            {
                // JavaLine 74 <== SourceLine 1796
                if(_VALUE((((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1==(null)))) {
                    ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.kind=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.kind_1=((char)8);
                } else {
                    // JavaLine 78 <== SourceLine 1797
                    {
                        // BEGIN INSPECTION 
                        _inspect_1797_4550=((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1.descr_1;
                        if(_inspect_1797_4550!=null) { // INSPECT _inspect_1797_4550  type=ref(BRECORD)
                            // JavaLine 83 <== SourceLine 1798
                            {
                                // JavaLine 85 <== SourceLine 1797
                                {
                                    // JavaLine 87 <== SourceLine 1798
                                    ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).TUchain=_inspect_1797_4550.declquant;
                                    ;
                                    // JavaLine 90 <== SourceLine 1799
                                    while((((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).TUchain.plev_1>(1))) {
                                        {
                                            // JavaLine 93 <== SourceLine 1800
                                            if(_VALUE(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).TUchain.descr_1.thisused)) {
                                                new CLASS_ERRMSG_error0((_CUR._SL._SL._SL),151);
                                            }
                                            ;
                                            // JavaLine 98 <== SourceLine 1801
                                            ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).TUchain=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).TUchain.prefqual_1;
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 104 <== SourceLine 1803
                                    if(_VALUE((_inspect_1797_4550.blev!=(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.blev)))) {
                                        {
                                            // JavaLine 107 <== SourceLine 1806
                                            if(_VALUE((RTS_UTIL._IS(((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1,CLASS_COMMON_extquantity.class)&&((((CLASS_COMMON_extquantity)(((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1)).clf_2==(((char)4))))))) {
                                                ;
                                            } else {
                                                // JavaLine 111 <== SourceLine 1808
                                                new CLASS_ERRMSG_error1qlin((_CUR._SL._SL._SL),331,((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1);
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 118 <== SourceLine 1810
                                    ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1=((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1;
                                    ;
                                    ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.plev_1=(((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1.plev_1+(1));
                                    ;
                                    // JavaLine 123 <== SourceLine 1811
                                    ((CLASS_BUILDER2_prechecker)(_CUR._SL._SL)).blockpref_1=null;
                                    ;
                                    // JavaLine 126 <== SourceLine 1812
                                    ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.npar=_inspect_1797_4550.npar;
                                    ;
                                    // JavaLine 129 <== SourceLine 1814
                                    if(_VALUE(_inspect_1797_4550.localclasses)) {
                                        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.localclasses=true;
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
            // JavaLine 143 <== SourceLine 1818
            {
                // JavaLine 145 <== SourceLine 1820
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1=new CLASS_COMMON_getBrc((_CUR._SL._SL._SL),((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.hidlist.idhi,((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.hidlist.idlo)._RESULT.declquant;
                ;
                // JavaLine 148 <== SourceLine 1822
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.hidlist=null;
                ;
                // JavaLine 151 <== SourceLine 1823
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.plev_1=2;
                ;
                // JavaLine 154 <== SourceLine 1824
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.symb_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1.symb_1;
                ;
                // JavaLine 157 <== SourceLine 1825
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.type_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1.type_1;
                ;
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.categ_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1.categ_1;
                ;
                // JavaLine 162 <== SourceLine 1826
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.npar=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1.descr_1.npar;
                ;
            }
            break;
            case 11: 
            // JavaLine 168 <== SourceLine 1831
            {
                // JavaLine 170 <== SourceLine 1834
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).B1=((CLASS_BUILDER2)(_CUR._SL._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER2)(_CUR._SL._SL._SL)).cblev_6));
                ;
                // JavaLine 173 <== SourceLine 1835
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).B1.declquant;
                ;
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.plev_1=(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1.plev_1+(1));
                ;
                // JavaLine 178 <== SourceLine 1836
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.categ_1=((char)7);
                ;
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.type_1=((char)14);
                ;
                // JavaLine 183 <== SourceLine 1837
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.npar=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).B1.npar;
                ;
                // JavaLine 186 <== SourceLine 1840
                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1;
                ;
                // JavaLine 189 <== SourceLine 1841
                if(_VALUE((((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.descr_1.inspected!=(((char)0))))) {
                    {
                        // JavaLine 192 <== SourceLine 1842
                        ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.descr_1.connests=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.connests;
                        ;
                        // JavaLine 195 <== SourceLine 1843
                        while((((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.plev_1!=(0))) {
                            {
                                // JavaLine 198 <== SourceLine 1844
                                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.prefqual_1;
                                ;
                                ((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).Q.descr_1.connests=((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc.connests;
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
        // JavaLine 213 <== SourceLine 1849
        if(_VALUE((((CLASS_BUILDER2)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new CLASS_COMMON_brecord_dump(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc,new RTS_TXT("- before ALLOC2"));
        }
        ;
        // JavaLine 218 <== SourceLine 1851
        new CLASS_BUILDER2_prechecker_allocate_alloc2((_CUR._SL),((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc);
        ;
        // JavaLine 221 <== SourceLine 1854
        if(_VALUE((((CLASS_BUILDER2)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('P'))!=(((char)0))))) {
            new CLASS_COMMON_brecord_dump(((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc,new RTS_TXT("- after ALLOC2"));
        }
        ;
        // JavaLine 226 <== SourceLine 1855
        new CLASS_BUILDER2_prechecker_allocate_LAYOUT((_CUR._SL),((CLASS_BUILDER2_prechecker_allocate)(_CUR._SL)).brc);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 main_program_of_allocate",1,1779,10,1797,23,1780,26,1781,29,1782,35,1783,37,1784,40,1785,45,1787,48,1789,53,1790,60,1791,63,1793,68,1794,72,1795,74,1796,78,1797,83,1798,85,1797,87,1798,90,1799,93,1800,98,1801,104,1803,107,1806,111,1808,118,1810,123,1811,126,1812,129,1814,143,1818,145,1820,148,1822,151,1823,154,1824,157,1825,162,1826,168,1831,170,1834,173,1835,178,1836,183,1837,186,1840,189,1841,192,1842,195,1843,198,1844,213,1849,218,1851,221,1854,226,1855,231,1857);
} // End of Procedure
