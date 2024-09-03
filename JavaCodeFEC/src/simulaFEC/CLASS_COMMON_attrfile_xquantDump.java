// JavaLine 1 <== SourceLine 941
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_xquantDump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=941, lastLine=962, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_mess;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_attrfile_xquantDump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_mess=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_attrfile_xquantDump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_attrfile_xquantDump(RTS_RTObject _SL,RTS_TXT sp_mess) {
        super(_SL);
        // Parameter assignment to locals
        this.p_mess = sp_mess;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_xquantDump _STM() {
        // JavaLine 39 <== SourceLine 942
        RTS_BASICIO.sysout().outtext(p_mess);
        ;
        // JavaLine 42 <== SourceLine 944
        RTS_BASICIO.sysout().outtext(new CLASS_COMMON_K_code((_CUR._SL._SL),((CLASS_COMMON_attrfile)(_CUR._SL)).xkind)._RESULT);
        ;
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
        ;
        // JavaLine 47 <== SourceLine 945
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring!=(null)))) {
            RTS_BASICIO.sysout().outtext(CONC(((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring,new RTS_TXT(" ")));
        }
        ;
        // JavaLine 52 <== SourceLine 946
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xident!=(null)))) {
            RTS_BASICIO.sysout().outtext(CONC(((CLASS_COMMON_attrfile)(_CUR._SL)).xident.symbol,new RTS_TXT(" ")));
        }
        ;
        // JavaLine 57 <== SourceLine 948
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" "));
        ;
        // JavaLine 60 <== SourceLine 949
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xftag!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xftag="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xftag)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 65 <== SourceLine 950
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xtype!=(((char)14))))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xtype="),new CLASS_COMMON_edType((_CUR._SL._SL),((CLASS_COMMON_attrfile)(_CUR._SL)).xtype)._RESULT),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 70 <== SourceLine 952
        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xcateg="),new CLASS_COMMON_C_code((_CUR._SL._SL),((CLASS_COMMON_attrfile)(_CUR._SL)).xcateg)._RESULT),new RTS_TXT(" ")));
        ;
        // JavaLine 73 <== SourceLine 953
        RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xclf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).xclf))),new RTS_TXT(" ")));
        ;
        // JavaLine 76 <== SourceLine 954
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial!=(((char)0))))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xspecial="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xspecial)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 81 <== SourceLine 955
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xprotect!=(((char)0))))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xprotect="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xprotect)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 86 <== SourceLine 956
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xdim!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("xdim="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xdim)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 91 <== SourceLine 957
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xlongindic!=(((char)0))))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT(", xlongindic="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xlongindic)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 96 <== SourceLine 958
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xconnests!=(((char)0))))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT(", xconnests="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xconnests)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 101 <== SourceLine 959
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xlanguage!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT(" xlanguage="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xlanguage)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 106 <== SourceLine 960
        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).xextident!=(0)))) {
            RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT(" extident="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).xextident)),new RTS_TXT(" ")));
        }
        ;
        // JavaLine 111 <== SourceLine 961
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 xquantDump",1,941,39,942,42,944,47,945,52,946,57,948,60,949,65,950,70,952,73,953,76,954,81,955,86,956,91,957,96,958,101,959,106,960,111,961,116,962);
} // End of Procedure
