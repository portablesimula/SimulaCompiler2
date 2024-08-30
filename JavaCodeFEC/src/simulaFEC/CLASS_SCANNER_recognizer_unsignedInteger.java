// JavaLine 1 <== SourceLine 937
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCANNER_recognizer_unsignedInteger extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=937, lastLine=1045, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 983
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block950_Block981_digit_0=new RTS_LABEL(this,0,1,"digit"); // Local Label #1=digit At PrefixLevel 0
    // JavaLine 13 <== SourceLine 1002
    final RTS_LABEL _LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0=new RTS_LABEL(this,0,2,"nterm"); // Local Label #2=nterm At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 941
    public char radix=0;
    // JavaLine 18 <== SourceLine 942
    public int startpos=0;
    public int i=0;
    // JavaLine 21 <== SourceLine 943
    public final char hexradix=(char)('@');
    // JavaLine 23 <== SourceLine 944
    public final char decradix=(char)(':');
    // Normal Constructor
    public CLASS_SCANNER_recognizer_unsignedInteger(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_SCANNER_recognizer_unsignedInteger _STM() {
        CLASS_SCANNER_recognizer_unsignedInteger _THIS=(CLASS_SCANNER_recognizer_unsignedInteger)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 39 <== SourceLine 946
                detach(946);
                ;
                // JavaLine 42 <== SourceLine 947
                while(true) {
                    {
                        // JavaLine 45 <== SourceLine 948
                        startpos=((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1;
                        ;
                        radix=':';
                        ;
                        // JavaLine 50 <== SourceLine 949
                        while(true) {
                            {
                                // JavaLine 53 <== SourceLine 950
                                if(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1<((char)0) || ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1>((char)255)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    case 2: 
                                    case 3: 
                                    case 4: 
                                    case 5: 
                                    case 6: 
                                    case 14: 
                                    case 15: 
                                    case 16: 
                                    case 17: 
                                    case 18: 
                                    case 19: 
                                    case 20: 
                                    case 21: 
                                    case 22: 
                                    case 23: 
                                    case 24: 
                                    case 25: 
                                    case 26: 
                                    case 27: 
                                    case 28: 
                                    case 29: 
                                    case 30: 
                                    case 31: 
                                    case 35: 
                                    case 36: 
                                    case 63: 
                                    case 64: 
                                    case 37: 
                                    case 91: 
                                    case 92: 
                                    case 93: 
                                    case 94: 
                                    case 96: 
                                    case 123: 
                                    case 124: 
                                    case 125: 
                                    case 126: 
                                    case 128: 
                                    case 129: 
                                    case 130: 
                                    case 131: 
                                    case 132: 
                                    case 133: 
                                    case 134: 
                                    case 135: 
                                    case 136: 
                                    case 137: 
                                    case 138: 
                                    case 139: 
                                    case 140: 
                                    case 141: 
                                    case 142: 
                                    case 143: 
                                    case 144: 
                                    case 145: 
                                    case 146: 
                                    case 147: 
                                    case 148: 
                                    case 149: 
                                    case 150: 
                                    case 151: 
                                    case 152: 
                                    case 153: 
                                    case 154: 
                                    case 155: 
                                    case 156: 
                                    case 157: 
                                    case 158: 
                                    case 159: 
                                    case 160: 
                                    case 161: 
                                    case 162: 
                                    case 163: 
                                    case 164: 
                                    case 165: 
                                    case 166: 
                                    case 167: 
                                    case 168: 
                                    case 169: 
                                    case 170: 
                                    case 171: 
                                    case 172: 
                                    case 173: 
                                    case 174: 
                                    case 175: 
                                    case 176: 
                                    case 177: 
                                    case 178: 
                                    case 179: 
                                    case 180: 
                                    case 181: 
                                    case 182: 
                                    case 183: 
                                    case 184: 
                                    case 185: 
                                    case 186: 
                                    case 187: 
                                    case 188: 
                                    case 189: 
                                    case 190: 
                                    case 191: 
                                    case 192: 
                                    case 193: 
                                    case 194: 
                                    case 195: 
                                    case 196: 
                                    case 197: 
                                    case 198: 
                                    case 199: 
                                    case 200: 
                                    case 201: 
                                    case 202: 
                                    case 203: 
                                    case 204: 
                                    case 205: 
                                    case 206: 
                                    case 207: 
                                    case 208: 
                                    case 209: 
                                    case 210: 
                                    case 211: 
                                    case 212: 
                                    case 213: 
                                    case 214: 
                                    case 215: 
                                    case 216: 
                                    case 217: 
                                    case 218: 
                                    case 219: 
                                    case 220: 
                                    case 221: 
                                    case 222: 
                                    case 223: 
                                    case 224: 
                                    case 225: 
                                    case 226: 
                                    case 227: 
                                    case 228: 
                                    case 229: 
                                    case 230: 
                                    case 231: 
                                    case 232: 
                                    case 233: 
                                    case 234: 
                                    case 235: 
                                    case 236: 
                                    case 237: 
                                    case 238: 
                                    case 239: 
                                    case 240: 
                                    case 241: 
                                    case 242: 
                                    case 243: 
                                    case 244: 
                                    case 245: 
                                    case 246: 
                                    case 247: 
                                    case 248: 
                                    case 249: 
                                    case 250: 
                                    case 251: 
                                    case 252: 
                                    case 253: 
                                    case 254: 
                                    case 255: 
                                    // JavaLine 222 <== SourceLine 956
                                    new CLASS_SCANNER_recognizer_illegalChar((_CUR._SL));
                                    break;
                                    case 0: 
                                    case 95: 
                                    case 127: 
                                    ;
                                    break;
                                    case 7: 
                                    // JavaLine 231 <== SourceLine 960
                                    {
                                        // JavaLine 233 <== SourceLine 961
                                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1==(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 238 <== SourceLine 962
                                        new CLASS_SCANNER_recognizer_illegalChar((_CUR._SL));
                                    }
                                    break;
                                    case 114: 
                                    case 82: 
                                    // JavaLine 244 <== SourceLine 964
                                    {
                                        // JavaLine 246 <== SourceLine 965
                                        i=(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1-(startpos));
                                        ;
                                        // JavaLine 249 <== SourceLine 966
                                        if(_VALUE((((i==(1))||((i==(2))))&&((radix==(':')))))) {
                                            // JavaLine 251 <== SourceLine 967
                                            {
                                                // JavaLine 253 <== SourceLine 968
                                                i=RTS_TXT.getint(RTS_TXT.sub(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashbuf_1,(startpos+(1)),i));
                                                ;
                                                // JavaLine 256 <== SourceLine 969
                                                if(_VALUE(((((i==(2))|((i==(4))))|((i==(8))))|((i==(16)))))) {
                                                    {
                                                        // JavaLine 259 <== SourceLine 970
                                                        radix=RTS_ENVIRONMENT._char((48+(i)));
                                                        ;
                                                        // JavaLine 262 <== SourceLine 971
                                                        ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1='R';
                                                        ;
                                                        _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block950_Block981_digit_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 272 <== SourceLine 973
                                        _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    case 48: 
                                    // JavaLine 277 <== SourceLine 976
                                    if(_VALUE((!(((CLASS_SCANNER_recognizer)(_CUR._SL)).skipzeroes_1)))) {
                                        {
                                            // JavaLine 280 <== SourceLine 977
                                            RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).hashbuf_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1);
                                            ;
                                            // JavaLine 283 <== SourceLine 978
                                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1+(1));
                                        }
                                    }
                                    break;
                                    case 49: 
                                    case 50: 
                                    case 51: 
                                    case 52: 
                                    case 53: 
                                    case 54: 
                                    case 55: 
                                    case 56: 
                                    case 57: 
                                    // JavaLine 297 <== SourceLine 980
                                    {
                                        // JavaLine 299 <== SourceLine 981
                                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1>=(radix)))) {
                                            {
                                                // JavaLine 302 <== SourceLine 982
                                                new CLASS_SCANNER_P1error((_CUR._SL._SL),183);
                                                ;
                                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1='0';
                                            }
                                        }
                                        ;
                                        // JavaLine 309 <== SourceLine 983
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: unsignedInteger -> unsignedInteger[CLASS_SCANNER_recognizer_unsignedInteger] DeclarationKind=Class
                                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).skipzeroes_1=false;
                                        }
                                        ;
                                        // JavaLine 315 <== SourceLine 984
                                        RTS_ENVIRONMENT.storeChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).hashbuf_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1);
                                        ;
                                        // JavaLine 318 <== SourceLine 985
                                        ((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1+(1));
                                        ;
                                    }
                                    break;
                                    case 97: 
                                    case 98: 
                                    case 99: 
                                    case 100: 
                                    case 101: 
                                    case 102: 
                                    case 65: 
                                    case 66: 
                                    case 67: 
                                    case 68: 
                                    case 69: 
                                    case 70: 
                                    // JavaLine 335 <== SourceLine 987
                                    {
                                        // JavaLine 337 <== SourceLine 988
                                        if(_VALUE((radix!=('@')))) {
                                            _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 342 <== SourceLine 989
                                        if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1>=('a')))) {
                                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1)-(32)));
                                        }
                                        ;
                                        // JavaLine 347 <== SourceLine 990
                                        _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block950_Block981_digit_0); // GOTO EVALUATED LABEL
                                    }
                                    break;
                                    default:
                                    // JavaLine 352 <== SourceLine 993
                                    _GOTO(_LABEL_CLASS_SCANNER_recognizer_unsignedInteger_Block948_nterm_0); // GOTO EVALUATED LABEL
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                                // JavaLine 357 <== SourceLine 997
                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).atom_1=RTS_ENVIRONMENT.loadChar(((CLASS_SCANNER_recognizer)(_CUR._SL)).line_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1);
                                ;
                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1+(1));
                                ;
                                // JavaLine 362 <== SourceLine 998
                                if(_VALUE((((CLASS_SCANNER_recognizer)(_CUR._SL)).linepos_1>(((CLASS_SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                    new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)2),998);
                                }
                            }
                            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                        }
                        ;
                        // JavaLine 370 <== SourceLine 1002
                        {
                            _SIM_LABEL(2); // DeclaredIn: unsignedInteger -> unsignedInteger[CLASS_SCANNER_recognizer_unsignedInteger] DeclarationKind=Class
                            ((CLASS_SCANNER_recognizer)(_CUR._SL)).skipzeroes_1=false;
                        }
                        ;
                        // JavaLine 376 <== SourceLine 1003
                        if(_VALUE((startpos==(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1)))) {
                            {
                                // JavaLine 379 <== SourceLine 1004
                                RTS_ENVIRONMENT.storeChar('0',((CLASS_SCANNER_recognizer)(_CUR._SL)).hashbuf_1,((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1);
                                ;
                                ((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1=(((CLASS_SCANNER_recognizer)(_CUR._SL)).hashpos_1+(1));
                            }
                        } else {
                            // JavaLine 385 <== SourceLine 1005
                            if(_VALUE((radix!=(':')))) {
                                new CLASS_SCANNER_recognizer_unsignedInteger_Block948_Block1006((_CUR))._STM();
                            }
                        }
                        ;
                        // JavaLine 391 <== SourceLine 1042
                        detach(1042);
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 398 <== SourceLine 1045
                // BEGIN unsignedInteger INNER PART
                // ENDOF unsignedInteger INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","8 unsignedInteger",1,937,11,983,13,1002,16,941,18,942,21,943,23,944,39,946,42,947,45,948,50,949,53,950,222,956,231,960,233,961,238,962,244,964,246,965,249,966,251,967,253,968,256,969,259,970,262,971,272,973,277,976,280,977,283,978,297,980,299,981,302,982,309,983,315,984,318,985,335,987,337,988,342,989,347,990,352,993,357,997,362,998,370,1002,376,1003,379,1004,385,1005,391,1042,398,1045,410,1045);
} // End of Class
