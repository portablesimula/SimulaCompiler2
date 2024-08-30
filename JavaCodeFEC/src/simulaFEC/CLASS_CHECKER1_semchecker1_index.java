// JavaLine 1 <== SourceLine 2133
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_index extends CLASS_CHECKER1_semchecker1_argument {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=2133, lastLine=2164, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_index_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_index_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_index(RTS_RTObject staticLink,int sp_argno,CLASS_CHECKER1_semchecker1_exp sp_actual) {
        super(staticLink,sp_argno,sp_actual);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_index _STM() {
        // JavaLine 21 <== SourceLine 2130
        // BEGIN argument INNER PART
        // JavaLine 23 <== SourceLine 2152
        if(_VALUE((p_actual==(null)))) {
            ;
        } else {
            // JavaLine 27 <== SourceLine 2153
            {
                // JavaLine 29 <== SourceLine 2155
                if(p_actual.type<((char)0) || p_actual.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(p_actual.type) { // BEGIN SWITCH STATEMENT
                    case 1: 
                    case 7: 
                    case 9: 
                    case 8: 
                    case 14: 
                    // JavaLine 37 <== SourceLine 2158
                    new CLASS_CHECKER1_semchecker1_argument_errARG((_CUR),419);
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 42 <== SourceLine 2161
                if(_VALUE((p_actual.ctype==('Z')))) {
                    // JavaLine 44 <== SourceLine 2162
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p_actual)));
                }
                ;
            }
        }
        ;
        // JavaLine 51 <== SourceLine 2164
        // BEGIN index INNER PART
        // ENDOF index INNER PART
        // ENDOF argument INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 index",1,2133,21,2130,23,2152,27,2153,29,2155,37,2158,42,2161,44,2162,51,2164,57,2164);
} // End of Class
