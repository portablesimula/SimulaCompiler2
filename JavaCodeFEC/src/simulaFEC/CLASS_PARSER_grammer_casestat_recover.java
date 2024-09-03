// JavaLine 1 <== SourceLine 1804
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_casestat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1804, lastLine=1821, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_casestat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_casestat_recover _STM() {
        // JavaLine 24 <== SourceLine 1805
        _RESULT=false;
        ;
        // JavaLine 27 <== SourceLine 1806
        if(_VALUE((((CLASS_PARSER_grammer_casestat)(_CUR._SL)).errorno==(1)))) {
            {
                // JavaLine 30 <== SourceLine 1807
                ((CLASS_PARSER_grammer_casestat)(_CUR._SL)).rp=((char)1);
                ;
            }
        } else {
            // JavaLine 35 <== SourceLine 1809
            if(_VALUE((((CLASS_PARSER_grammer_casestat)(_CUR._SL)).errorno==(2)))) {
                {
                    // JavaLine 38 <== SourceLine 1810
                    new CLASS_PARSER_grammer_casestat_L2output((_CUR._SL),'k');
                    ;
                }
            } else {
                // JavaLine 43 <== SourceLine 1812
                if(_VALUE((((CLASS_PARSER_grammer_casestat)(_CUR._SL)).errorno==(3)))) {
                    {
                    }
                } else {
                    // JavaLine 48 <== SourceLine 1816
                    {
                        // JavaLine 50 <== SourceLine 1817
                        new CLASS_PARSER_grammer_casestat_L2output((_CUR._SL),'l');
                        ;
                    }
                }
            }
        }
        ;
        // JavaLine 58 <== SourceLine 1819
        ((CLASS_PARSER_grammer_casestat)(_CUR._SL)).errorno=0;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,1804,24,1805,27,1806,30,1807,35,1809,38,1810,43,1812,48,1816,50,1817,58,1819,63,1821);
} // End of Procedure
