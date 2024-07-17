package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=5, firstLine=1561, lastLine=1588, hasLocalClasses=false, System=false
    // Declare local labels
    // JavaLine 8 <== SourceLine 1587
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563_Actcnt_0=new RTS_LABEL(this,0,1,"Actcnt"); // Local Label #1=Actcnt At PrefixLevel 0
    // JavaLine 10 <== SourceLine 1588
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563_NoMoreChck_0=new RTS_LABEL(this,0,2,"NoMoreChck"); // Local Label #2=NoMoreChck At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1563
    public COMMON_quantity specPar=null;
    public COMMON_quantity actPar=null;
    // Normal Constructor
    public BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563 _THIS=(BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 29 <== SourceLine 1564
                if(_VALUE(((((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL))._inspect_1561_4549.declquant.type_1!=(((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).VA.type_1))||((((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL))._inspect_1561_4549.declquant.prefqual_1!=(((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).VA.prefqual_1)))))) {
                    // JavaLine 31 <== SourceLine 1566
                    new ERRMSG_errQT((_CUR._SL._SL._SL._SL),((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).VA,445);
                }
                ;
                // JavaLine 35 <== SourceLine 1572
                specPar=((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL))._inspect_1561_4549.fpar;
                ;
                actPar=((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).VA.descr_1.fpar;
                ;
                // JavaLine 40 <== SourceLine 1573
                while((specPar!=(null))) {
                    {
                        // JavaLine 43 <== SourceLine 1574
                        if(_VALUE((actPar==(null)))) {
                            _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563_Actcnt_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 48 <== SourceLine 1576
                        if(_VALUE(((((specPar.type_1!=(actPar.type_1))||((specPar.kind_1!=(actPar.kind_1))))||((specPar.categ_1!=(actPar.categ_1))))||((specPar.prefqual_1!=(actPar.prefqual_1)))))) {
                            // JavaLine 50 <== SourceLine 1580
                            {
                                new ERRMSG_errQT((_CUR._SL._SL._SL._SL),actPar,447);
                                ;
                                // JavaLine 54 <== SourceLine 1581
                                _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_Block1548_Block1549_Block1553_Block1561_Block1563_NoMoreChck_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 59 <== SourceLine 1583
                        specPar=((COMMON_quantity)(specPar.next));
                        ;
                        // JavaLine 62 <== SourceLine 1584
                        actPar=((COMMON_quantity)(actPar.next));
                        ;
                    }
                }
                ;
                // JavaLine 68 <== SourceLine 1586
                if(_VALUE((actPar!=(null)))) {
                    // JavaLine 70 <== SourceLine 1587
                    {
                        _SIM_LABEL(1); // DeclaredIn: Block1563
                        new ERRMSG_errQT((_CUR._SL._SL._SL._SL),((BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).VA,446);
                    }
                }
                ;
                // JavaLine 77 <== SourceLine 1588
                {
                    _SIM_LABEL(2); // DeclaredIn: Block1563
                    ;
                }
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","4 Block1563",8,1587,10,1588,13,1563,29,1564,31,1566,35,1572,40,1573,43,1574,48,1576,50,1580,54,1581,59,1583,62,1584,68,1586,70,1587,77,1588,91,1588);
} // End of SubBlock
