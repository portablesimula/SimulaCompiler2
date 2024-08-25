// JavaLine 1 <== SourceLine 1803
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_casestat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1803, lastLine=1820, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_casestat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_casestat_recover _STM() {
        // JavaLine 24 <== SourceLine 1804
        _RESULT=false;
        ;
        // JavaLine 27 <== SourceLine 1805
        if(_VALUE((((PARSER_grammer_casestat)(_CUR._SL)).errorno==(1)))) {
            {
                // JavaLine 30 <== SourceLine 1806
                ((PARSER_grammer_casestat)(_CUR._SL)).rp=((char)1);
                ;
            }
        } else {
            // JavaLine 35 <== SourceLine 1808
            if(_VALUE((((PARSER_grammer_casestat)(_CUR._SL)).errorno==(2)))) {
                {
                    // JavaLine 38 <== SourceLine 1809
                    new PARSER_grammer_casestat_L2output((_CUR._SL),'k');
                    ;
                }
            } else {
                // JavaLine 43 <== SourceLine 1811
                if(_VALUE((((PARSER_grammer_casestat)(_CUR._SL)).errorno==(3)))) {
                    {
                    }
                } else {
                    // JavaLine 48 <== SourceLine 1815
                    {
                        // JavaLine 50 <== SourceLine 1816
                        new PARSER_grammer_casestat_L2output((_CUR._SL),'l');
                        ;
                    }
                }
            }
        }
        ;
        // JavaLine 58 <== SourceLine 1818
        ((PARSER_grammer_casestat)(_CUR._SL)).errorno=0;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,1803,24,1804,27,1805,30,1806,35,1808,38,1809,43,1811,48,1815,50,1816,58,1818,63,1820);
} // End of Procedure
