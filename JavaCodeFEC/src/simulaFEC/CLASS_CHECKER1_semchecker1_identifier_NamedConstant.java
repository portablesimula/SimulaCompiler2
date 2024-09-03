// JavaLine 1 <== SourceLine 1349
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_identifier_NamedConstant extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1349, lastLine=1381, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1378
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_identifier_NamedConstant_Block1378_NOTDEF_0=new RTS_LABEL(this,0,1,"NOTDEF"); // Local Label #1=NOTDEF At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1351
    public CLASS_CHECKER1_semchecker1__const Nconst=null;
    // JavaLine 15 <== SourceLine 1353
    public CLASS_COMMON_brecord _inspect_1353_4576=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_identifier_NamedConstant(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_identifier_NamedConstant _STM() {
        CLASS_CHECKER1_semchecker1_identifier_NamedConstant _THIS=(CLASS_CHECKER1_semchecker1_identifier_NamedConstant)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 32 <== SourceLine 1352
                if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.special_1==(((char)2))))) {
                    {
                        // JavaLine 35 <== SourceLine 1353
                        {
                            // BEGIN INSPECTION 
                            _inspect_1353_4576=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.descr_1;
                            if(_inspect_1353_4576!=null) { // INSPECT _inspect_1353_4576  type=ref(BRECORD)
                                // JavaLine 40 <== SourceLine 1354
                                {
                                    // JavaLine 42 <== SourceLine 1353
                                    {
                                        // JavaLine 44 <== SourceLine 1355
                                        if(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).type<((char)0) || ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).type>((char)8)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                        switch(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).type) { // BEGIN SWITCH STATEMENT
                                            case 1: 
                                            // JavaLine 48 <== SourceLine 1357
                                            Nconst=new CLASS_CHECKER1_semchecker1_boolconst((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred,'[')._STM();
                                            break;
                                            case 2: 
                                            // JavaLine 52 <== SourceLine 1359
                                            Nconst=new CLASS_CHECKER1_semchecker1_charconst((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred,'[')._STM();
                                            break;
                                            case 3: 
                                            case 4: 
                                            case 5: 
                                            case 6: 
                                            // JavaLine 59 <== SourceLine 1362
                                            Nconst=new CLASS_CHECKER1_semchecker1_arithconst((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred,'[')._STM();
                                            break;
                                            case 7: 
                                            // JavaLine 63 <== SourceLine 1364
                                            Nconst=new CLASS_CHECKER1_semchecker1_refconst((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred,'[')._STM();
                                            break;
                                            case 8: 
                                            // JavaLine 67 <== SourceLine 1365
                                            {
                                                // JavaLine 69 <== SourceLine 1366
                                                Nconst=new CLASS_CHECKER1_semchecker1_textconst((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred,'[')._STM();
                                                ;
                                                // JavaLine 72 <== SourceLine 1367
                                                Nconst.qual=((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).textclass_2;
                                                ;
                                                // JavaLine 75 <== SourceLine 1368
                                                ((CLASS_CHECKER1_semchecker1_textconst)(Nconst)).id_2=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL));
                                            }
                                            break;
                                        } // END SWITCH STATEMENT
                                        ;
                                        // JavaLine 81 <== SourceLine 1370
                                        Nconst.ixhi_1=_inspect_1353_4576.blnohi;
                                        ;
                                        Nconst.ixlo_1=_inspect_1353_4576.blnolo;
                                        ;
                                        // JavaLine 86 <== SourceLine 1371
                                        Nconst.type=Nconst.ctype=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).type;
                                        ;
                                        Nconst.cl=((char)1);
                                        ;
                                        // JavaLine 91 <== SourceLine 1372
                                        ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_pred=null;
                                        ;
                                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).exptop_2=Nconst;
                                        ;
                                    }
                                }
                            }
                            else { // OTHERWISE 
                                // JavaLine 100 <== SourceLine 1374
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_identifier_NamedConstant_Block1378_NOTDEF_0); // GOTO EVALUATED LABEL
                            } // END OTHERWISE 
                        } // END INSPECTION
                        ;
                    }
                } else {
                    // JavaLine 107 <== SourceLine 1376
                    if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.special_1==(((char)3))))) {
                        // JavaLine 109 <== SourceLine 1377
                        {
                            // JavaLine 111 <== SourceLine 1378
                            {
                                _SIM_LABEL(1); // DeclaredIn: NamedConstant -> NamedConstant[externalIdent=CLASS_CHECKER1_semchecker1_identifier_NamedConstant] Kind=5, QUAL=ProcedureDeclaration, HashCode=510536150
                                new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR._SL),332);
                            }
                            ;
                            // JavaLine 117 <== SourceLine 1379
                            ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.special_1=((char)0);
                            ;
                        }
                    }
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
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 NamedConstant",1,1349,10,1378,13,1351,15,1353,32,1352,35,1353,40,1354,42,1353,44,1355,48,1357,52,1359,59,1362,63,1364,67,1365,69,1366,72,1367,75,1368,81,1370,86,1371,91,1372,100,1374,107,1376,109,1377,111,1378,117,1379,132,1381);
} // End of Procedure
