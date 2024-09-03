// JavaLine 1 <== SourceLine 252
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_visiblegenerator_afterDump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=252, lastLine=266, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 253
    public RTS_Printfile _inspect_253_4523=null;
    // Normal Constructor
    public CLASS_BUILDER1_visiblegenerator_afterDump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_visiblegenerator_afterDump _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_253_4523=RTS_BASICIO.sysout();
            if(_inspect_253_4523!=null) { // INSPECT _inspect_253_4523  type=ref(PRINTFILE)
                // JavaLine 27 <== SourceLine 254
                {
                    // JavaLine 29 <== SourceLine 253
                    {
                        // JavaLine 31 <== SourceLine 254
                        if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).asd_4!=(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastasd_4)))) {
                            {
                                // JavaLine 34 <== SourceLine 255
                                _inspect_253_4523.outtext(new RTS_TXT(" asd => "));
                                ;
                                _inspect_253_4523.outint(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).asd_4,0);
                                ;
                                ((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastasd_4=((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).asd_4;
                            }
                        }
                        ;
                        // JavaLine 43 <== SourceLine 256
                        if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curasd_4!=(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastcurasd_4)))) {
                            {
                                // JavaLine 46 <== SourceLine 257
                                _inspect_253_4523.outtext(new RTS_TXT(" curasd => "));
                                ;
                                _inspect_253_4523.outint(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curasd_4,0);
                                ;
                                // JavaLine 51 <== SourceLine 258
                                ((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastcurasd_4=((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curasd_4;
                            }
                        }
                        ;
                        // JavaLine 56 <== SourceLine 259
                        if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).saveindex_4!=(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastsav_4)))) {
                            {
                                // JavaLine 59 <== SourceLine 260
                                _inspect_253_4523.outtext(((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).saveemitted.getELEMENT(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).saveindex_4))?(new RTS_TXT("SAVE: ")):(new RTS_TXT(" sav: "))));
                                ;
                                // JavaLine 62 <== SourceLine 261
                                _inspect_253_4523.outint(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).saveindex_4,0);
                                ;
                                // JavaLine 65 <== SourceLine 262
                                ((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastsav_4=((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).saveindex_4;
                            }
                        }
                        ;
                        // JavaLine 70 <== SourceLine 263
                        if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curjump_4!=(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastjmp_4)))) {
                            {
                                // JavaLine 73 <== SourceLine 264
                                _inspect_253_4523.outtext(new RTS_TXT(" jmp: "));
                                ;
                                _inspect_253_4523.outint(((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curjump_4,0);
                                ;
                                // JavaLine 78 <== SourceLine 265
                                ((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).lastjmp_4=((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).curjump_4;
                            }
                        }
                        ;
                        // JavaLine 83 <== SourceLine 266
                        _inspect_253_4523.outimage();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 afterDump",1,252,10,253,27,254,29,253,31,254,34,255,43,256,46,257,51,258,56,259,59,260,62,261,65,262,70,263,73,264,78,265,83,266,91,266);
} // End of Procedure
