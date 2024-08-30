// JavaLine 1 <== SourceLine 773
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_declaration_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=773, lastLine=782, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_declaration_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_declaration_recover _STM() {
        // JavaLine 24 <== SourceLine 774
        if(_VALUE((((CLASS_PARSER_grammer_declaration)(_CUR._SL)).errorno==(2)))) {
            {
                // JavaLine 27 <== SourceLine 777
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('X')))) {
                    {
                        // JavaLine 30 <== SourceLine 778
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((((((CLASS_PARSER_grammer_declaration)(_CUR._SL)).rp<=(((char)1)))||(((((CLASS_PARSER_grammer_declaration)(_CUR._SL)).rp==(((char)2)))&(((CLASS_PARSER_grammer_declaration)(_CUR._SL)).innerseen_1)))))?(((char)16)):('u'));
                        ;
                        // JavaLine 33 <== SourceLine 780
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=((char)1);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,780);
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL._SL)).blockfound_1-(1));
                        ;
                    }
                } else {
                    // JavaLine 42 <== SourceLine 781
                    ((CLASS_PARSER_grammer_declaration)(_CUR._SL)).recovered=_RESULT=true;
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,773,24,774,27,777,30,778,33,780,42,781,50,782);
} // End of Procedure
