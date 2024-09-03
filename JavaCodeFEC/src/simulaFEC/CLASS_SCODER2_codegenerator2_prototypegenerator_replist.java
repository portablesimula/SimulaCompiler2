// JavaLine 1 <== SourceLine 415
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_prototypegenerator_replist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=415, lastLine=462, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 416
    public CLASS_COMMON_quantity q=null;
    public int i=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qty=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_replist _STM() {
        // JavaLine 42 <== SourceLine 439
        q=p_qty.descr_1.fpar;
        ;
        // JavaLine 45 <== SourceLine 440
        i=0;
        ;
        // JavaLine 48 <== SourceLine 441
        while((q!=(null))) {
            {
                // JavaLine 51 <== SourceLine 442
                if(_VALUE((q.kind_1==(((char)6))))) {
                    {
                        // JavaLine 54 <== SourceLine 443
                        if(_VALUE(((q.type_1==(((char)8)))||((q.type_1==(((char)7))))))) {
                            {
                                // JavaLine 57 <== SourceLine 444
                                i=(i+(1));
                                ;
                                // JavaLine 60 <== SourceLine 445
                                new CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst((_CUR),q);
                                ;
                            }
                        }
                    }
                }
                ;
                // JavaLine 68 <== SourceLine 447
                q=((CLASS_COMMON_quantity)(q.next));
                ;
            }
        }
        ;
        // JavaLine 74 <== SourceLine 449
        if(_VALUE((i!=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).reppnt)))) {
            new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL),((char)13),449);
        }
        ;
        // JavaLine 79 <== SourceLine 451
        q=p_qty.descr_1.fpar;
        ;
        // JavaLine 82 <== SourceLine 452
        while((q!=(null))) {
            {
                // JavaLine 85 <== SourceLine 453
                if(_VALUE((q.kind_1==(((char)6))))) {
                    {
                        // JavaLine 88 <== SourceLine 454
                        if(_VALUE(((q.type_1==(((char)8)))||((q.type_1==(((char)7))))))) {
                            ;
                        } else {
                            // JavaLine 92 <== SourceLine 455
                            {
                                // JavaLine 94 <== SourceLine 456
                                i=(i+(1));
                                ;
                                // JavaLine 97 <== SourceLine 457
                                new CLASS_SCODER2_codegenerator2_prototypegenerator_replist_outRepdesConst((_CUR),q);
                                ;
                            }
                        }
                    }
                }
                ;
                // JavaLine 105 <== SourceLine 459
                q=((CLASS_COMMON_quantity)(q.next));
                ;
            }
        }
        ;
        // JavaLine 111 <== SourceLine 461
        if(_VALUE((i!=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).nrep)))) {
            new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL),((char)13),461);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 replist",1,415,11,416,42,439,45,440,48,441,51,442,54,443,57,444,60,445,68,447,74,449,79,451,82,452,85,453,88,454,92,455,94,456,97,457,105,459,111,461,118,462);
} // End of Procedure
