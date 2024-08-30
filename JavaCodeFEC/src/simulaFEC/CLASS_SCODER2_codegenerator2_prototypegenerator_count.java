// JavaLine 1 <== SourceLine 293
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_prototypegenerator_count extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=293, lastLine=330, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    // Declare local labels
    // JavaLine 11 <== SourceLine 304
    final RTS_LABEL _LABEL_CLASS_SCODER2_codegenerator2_prototypegenerator_count_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 294
    public CLASS_COMMON_quantity q=null;
    public boolean isnohead=false;
    public int pct=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_count setPar(Object param) {
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
    public CLASS_SCODER2_codegenerator2_prototypegenerator_count(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_prototypegenerator_count(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_prototypegenerator_count _STM() {
        CLASS_SCODER2_codegenerator2_prototypegenerator_count _THIS=(CLASS_SCODER2_codegenerator2_prototypegenerator_count)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 50 <== SourceLine 304
                {
                    _SIM_LABEL(1); // DeclaredIn: count
                    ((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt+(p_qty.descr_1.connests));
                }
                ;
                // JavaLine 56 <== SourceLine 305
                isnohead=((((p_qty.kind_1==(((char)1)))&&((p_qty.plev_1<(2)))))?(false):(((CLASS_SCODER2)(_CUR._SL._SL._SL)).simob_entity));
                ;
                // JavaLine 59 <== SourceLine 309
                q=p_qty.descr_1.fpar;
                ;
                // JavaLine 62 <== SourceLine 310
                while((q!=(null))) {
                    {
                        // JavaLine 65 <== SourceLine 311
                        if(_VALUE(isnohead)) {
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).nent_7=(((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).nent_7+(1));
                        }
                        ;
                        // JavaLine 70 <== SourceLine 312
                        if(_VALUE((q.kind_1==(((char)6))))) {
                            {
                                // JavaLine 73 <== SourceLine 313
                                ((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).nrep=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).nrep+(1));
                                ;
                                // JavaLine 76 <== SourceLine 314
                                if(_VALUE(((q.type_1==(((char)7)))||((q.type_1==(((char)8))))))) {
                                    // JavaLine 78 <== SourceLine 315
                                    ((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).reppnt=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).reppnt+(1));
                                }
                                ;
                            }
                        } else {
                            // JavaLine 84 <== SourceLine 317
                            if(_VALUE(new CLASS_SCODER2_codegenerator2_prototypegenerator_pointer((_CUR._SL),q)._RESULT)) {
                                ((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt+(1));
                            }
                        }
                        ;
                        // JavaLine 90 <== SourceLine 318
                        q=((CLASS_COMMON_quantity)(q.next));
                        ;
                    }
                }
                ;
                // JavaLine 96 <== SourceLine 321
                if(_VALUE((p_qty.kind_1==(((char)1))))) {
                    {
                        if(_VALUE((p_qty.plev_1==(2)))) {
                            // JavaLine 100 <== SourceLine 322
                            {
                                // JavaLine 102 <== SourceLine 323
                                if(_VALUE(((CLASS_SCODER2)(_CUR._SL._SL._SL)).simob_entity)) {
                                    {
                                        if(_VALUE((p_qty.type_1!=(((char)14))))) {
                                            // JavaLine 106 <== SourceLine 324
                                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).nent_7=(((CLASS_SCODER2_codegenerator2)(_CUR._SL._SL)).nent_7+(1));
                                        }
                                    }
                                }
                                ;
                                // JavaLine 112 <== SourceLine 325
                                if(_VALUE(((p_qty.type_1==(((char)7)))||((p_qty.type_1==(((char)8))))))) {
                                    // JavaLine 114 <== SourceLine 326
                                    ((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt=(((CLASS_SCODER2_codegenerator2_prototypegenerator)(_CUR._SL)).npnt+(1));
                                }
                                ;
                                // JavaLine 118 <== SourceLine 327
                                p_qty=p_qty.prefqual_1;
                                ;
                                _GOTO(_LABEL_CLASS_SCODER2_codegenerator2_prototypegenerator_count_REP_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                    }
                }
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 count",1,293,11,304,14,294,50,304,56,305,59,309,62,310,65,311,70,312,73,313,76,314,78,315,84,317,90,318,96,321,100,322,102,323,106,324,112,325,114,326,118,327,137,330);
} // End of Procedure
