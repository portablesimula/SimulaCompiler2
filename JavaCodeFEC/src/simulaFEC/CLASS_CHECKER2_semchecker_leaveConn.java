// JavaLine 1 <== SourceLine 203
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_leaveConn extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=203, lastLine=274, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 204
    public CLASS_COMMON_quantity q=null;
    public CLASS_COMMON_quantity qz=null;
    public CLASS_COMMON_stackedi chain=null;
    // JavaLine 14 <== SourceLine 206
    public int opi=0;
    public int opimax=0;
    // JavaLine 17 <== SourceLine 210
    public CLASS_COMMON_brecord _inspect_210_4593=null;
    // JavaLine 19 <== SourceLine 214
    public CLASS_COMMON_brecord _inspect_214_4594=null;
    // JavaLine 21 <== SourceLine 219
    public CLASS_COMMON_stackedb _inspect_219_4595=null;
    // JavaLine 23 <== SourceLine 236
    public CLASS_COMMON_brecord _inspect_236_4596=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_leaveConn(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_leaveConn _STM() {
        // JavaLine 36 <== SourceLine 210
        {
            // BEGIN INSPECTION 
            _inspect_210_4593=((CLASS_CHECKER2)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6));
            if(_inspect_210_4593!=null) { // INSPECT _inspect_210_4593  type=ref(BRECORD)
                // JavaLine 41 <== SourceLine 211
                {
                    // JavaLine 43 <== SourceLine 210
                    {
                        // JavaLine 45 <== SourceLine 211
                        q=_inspect_210_4593.fpar;
                        ;
                        new CLASS_BUILDER1_precheck0_invischain((_CUR._SL),q);
                        ;
                        // JavaLine 50 <== SourceLine 212
                        if(_VALUE((_inspect_210_4593.declquant.prefqual_1!=(null)))) {
                            {
                                // JavaLine 53 <== SourceLine 214
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_214_4594=_inspect_210_4593.declquant.prefqual_1.descr_1;
                                    if(_inspect_214_4594!=null) { // INSPECT _inspect_214_4594  type=ref(BRECORD)
                                        // JavaLine 58 <== SourceLine 215
                                        {
                                            // JavaLine 60 <== SourceLine 214
                                            {
                                                // JavaLine 62 <== SourceLine 215
                                                if(_VALUE((_inspect_214_4594.kind==(((char)8))))) {
                                                    {
                                                        // JavaLine 65 <== SourceLine 216
                                                        new CLASS_BUILDER1_precheck0_leaveblock((_CUR._SL));
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 70 <== SourceLine 218
                                                    {
                                                        // JavaLine 72 <== SourceLine 219
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_219_4595=_inspect_214_4594.preinsp;
                                                            if(_inspect_219_4595!=null) { // INSPECT _inspect_219_4595  type=ref(STACKEDB) declared in Connection block at line 214
                                                                // JavaLine 77 <== SourceLine 220
                                                                {
                                                                    // JavaLine 79 <== SourceLine 219
                                                                    {
                                                                        // JavaLine 81 <== SourceLine 220
                                                                        chain=_inspect_219_4595.redeclChain;
                                                                        ;
                                                                        // JavaLine 84 <== SourceLine 221
                                                                        while((chain!=(null))) {
                                                                            {
                                                                                // JavaLine 87 <== SourceLine 222
                                                                                ((CLASS_COMMON_identsymbol)(new CLASS_COMMON_boxof((_CUR._SL._SL),chain.p1_rehi,chain.p1_relo)._RESULT)).curmeaning_1=chain.prevmeaning;
                                                                                ;
                                                                                // JavaLine 90 <== SourceLine 224
                                                                                chain=((CLASS_COMMON_stackedi)(chain.next));
                                                                                ;
                                                                            }
                                                                        }
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                        ;
                                                        // JavaLine 101 <== SourceLine 227
                                                        ((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.index(1),q=_inspect_214_4594.declquant);
                                                        ;
                                                        opimax=1;
                                                        ;
                                                        // JavaLine 106 <== SourceLine 228
                                                        while((opimax<(_inspect_214_4594.declquant.plev_1))) {
                                                            // JavaLine 108 <== SourceLine 229
                                                            {
                                                                opimax=(opimax+(1));
                                                                ;
                                                                // JavaLine 112 <== SourceLine 230
                                                                ((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.index(opimax),q=q.prefqual_1);
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 118 <== SourceLine 232
                                                        q=_inspect_214_4594.declquant;
                                                        ;
                                                        // JavaLine 121 <== SourceLine 233
                                                        while((q!=(null))) {
                                                            {
                                                                // JavaLine 124 <== SourceLine 236
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_236_4596=q.descr_1;
                                                                    if(_inspect_236_4596!=null) { // INSPECT _inspect_236_4596  type=ref(BRECORD)
                                                                        {
                                                                            if(_VALUE((_inspect_236_4596.preinsp!=(null)))) {
                                                                                {
                                                                                    // JavaLine 132 <== SourceLine 237
                                                                                    _inspect_236_4596.blev=_inspect_236_4596.preinsp.p_oldblev;
                                                                                    ;
                                                                                    // JavaLine 135 <== SourceLine 238
                                                                                    _inspect_236_4596.rtblev=_inspect_236_4596.preinsp.p_oldrtblev;
                                                                                    ;
                                                                                    // JavaLine 138 <== SourceLine 239
                                                                                    _inspect_236_4596.connests=_inspect_236_4596.preinsp.p_oldconnests;
                                                                                    ;
                                                                                    // JavaLine 141 <== SourceLine 240
                                                                                    _inspect_236_4596.inspected=_inspect_236_4596.preinsp.p_oldinsp;
                                                                                    ;
                                                                                    // JavaLine 144 <== SourceLine 241
                                                                                    _inspect_236_4596.preinsp=_inspect_236_4596.preinsp.p_prev;
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                                ;
                                                                // JavaLine 153 <== SourceLine 243
                                                                q=q.prefqual_1;
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 159 <== SourceLine 247
                                                        opi=opimax;
                                                        ;
                                                        // JavaLine 162 <== SourceLine 248
                                                        while((opi!=(0))) {
                                                            {
                                                                // JavaLine 165 <== SourceLine 249
                                                                q=((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.getELEMENT(opi);
                                                                ;
                                                                ((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).prefixchain.index(opi),null);
                                                                ;
                                                                // JavaLine 170 <== SourceLine 250
                                                                qz=q.descr_1.favirt;
                                                                ;
                                                                // JavaLine 173 <== SourceLine 251
                                                                while((qz!=(null))) {
                                                                    {
                                                                        // JavaLine 176 <== SourceLine 252
                                                                        if(_VALUE((qz.protect_1==(((char)1))))) {
                                                                            {
                                                                                if(_VALUE((qz.visible_1!=(((char)0))))) {
                                                                                    // JavaLine 180 <== SourceLine 253
                                                                                    {
                                                                                        // JavaLine 182 <== SourceLine 254
                                                                                        qz.visible_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qz.visible_1)-(1)));
                                                                                        ;
                                                                                        // JavaLine 185 <== SourceLine 255
                                                                                        if(_VALUE((qz.match_1!=(null)))) {
                                                                                            // JavaLine 187 <== SourceLine 256
                                                                                            qz.match_1.visible_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qz.match_1.visible_1)-(1)));
                                                                                        }
                                                                                        ;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 196 <== SourceLine 259
                                                                        qz=((CLASS_COMMON_quantity)(qz.next));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 202 <== SourceLine 261
                                                                qz=q.descr_1.fpar;
                                                                ;
                                                                // JavaLine 205 <== SourceLine 262
                                                                while((qz!=(null))) {
                                                                    {
                                                                        // JavaLine 208 <== SourceLine 263
                                                                        if(_VALUE((qz.protect_1==(((char)1))))) {
                                                                            {
                                                                                if(_VALUE((qz.visible_1!=(((char)0))))) {
                                                                                    // JavaLine 212 <== SourceLine 264
                                                                                    qz.visible_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qz.visible_1)-(1)));
                                                                                }
                                                                            }
                                                                        }
                                                                        ;
                                                                        // JavaLine 218 <== SourceLine 265
                                                                        qz=((CLASS_COMMON_quantity)(qz.next));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 224 <== SourceLine 267
                                                                opi=(opi-(1));
                                                                ;
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 230 <== SourceLine 269
                                                        ((CLASS_CHECKER2)(_CUR._SL._SL)).display.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6)),null);
                                                        ;
                                                        // JavaLine 233 <== SourceLine 270
                                                        ((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6)-(1)));
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 leaveConn",1,203,10,204,14,206,17,210,19,214,21,219,23,236,36,210,41,211,43,210,45,211,50,212,53,214,58,215,60,214,62,215,65,216,70,218,72,219,77,220,79,219,81,220,84,221,87,222,90,224,101,227,106,228,108,229,112,230,118,232,121,233,124,236,132,237,135,238,138,239,141,240,144,241,153,243,159,247,162,248,165,249,170,250,173,251,176,252,180,253,182,254,185,255,187,256,196,259,202,261,205,262,208,263,212,264,218,265,224,267,230,269,233,270,253,274);
} // End of Procedure
