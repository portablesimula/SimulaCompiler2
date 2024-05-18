/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.utilities;

/**
 * Utility class Token.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/Token.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class Token {
	/**
	 * The Token's text attribute
	 */
	private String text;
	/**
	 * The Token's keyWord attribute
	 */
	public int keyWord;
	/**
	 * The Token's value attribute
	 */
	public Object value;
	/**
	 * The Token's line number
	 */
	public int lineNumber;

	/**
	 * The line number before scan basic.
	 */
	public static int lineNumberBeforeScanBasic;

	/**
	 * The style codes used by Simula Editor.
	 */
	public enum StyleCode {
		/** Regular */  regular,
		/** Keyword */  keyword,
		/** Comment */  comment,
		/** Constant */ constant
	};

	/**
	 * Create a new Token.
	 * 
	 * @param text    the Token's text attribute
	 * @param keyWord the Token's keyword attribute
	 * @param value   the Token's value attribute
	 */
	public Token(final String text, final int keyWord, final Object value) {
		this.text = text;
		this.keyWord = keyWord;
		this.value = value;
		this.lineNumber = lineNumberBeforeScanBasic;
	}

	/**
	 * Create a new Token.
	 * 
	 * @param text    the Token's text attribute
	 * @param keyWord the Token's keyword attribute
	 */
	public Token(final String text, final int keyWord) {
		this(text, keyWord, null);
	}

	/**
	 * Create a new Token.
	 * 
	 * @param keyWord the Token's keyword attribute
	 * @param value   the Token's value attribute
	 */
	public Token(final int keyWord, final Object value) {
		this(null, keyWord, value);
	}

	/**
	 * Create a new Token.
	 * 
	 * @param keyWord the Token's keyword attribute
	 */
	public Token(final int keyWord) {
		this(keyWord, null);
	}

	/**
	 * The default constructor used by Attribute File I/O
	 */
	public Token() {
	} // Externalization

	/**
	 * Set this Token's text attribute.
	 * 
	 * @param text new text attribute
	 */
	public void setText(final String text) {
		this.text = text;
	}

	/**
	 * Get this Token's text attribute.
	 * 
	 * @return this Token's text attribute
	 */
	public String getText() {
		if (text == null)
			return (toString());
		return (text);
	}

	/**
	 * Returns the style code for this Token's keyword.
	 * 
	 * @return the style code for this Token's keyword
	 */
	public StyleCode getStyleCode() {
		switch(keyWord) {
		    case KeyWord.ASSIGNVALUE: case KeyWord.ASSIGNREF: case KeyWord.COMMA: case KeyWord.COLON: case KeyWord.SEMICOLON:
		    case KeyWord.BEGPAR: case KeyWord.ENDPAR: case KeyWord.BEGBRACKET: case KeyWord.ENDBRACKET: case KeyWord.EQR: case KeyWord.NER:
		    case KeyWord.EQ: case KeyWord.GE: case KeyWord.GT: case KeyWord.LE: case KeyWord.LT: case KeyWord.NE:
		    case KeyWord.PLUS: case KeyWord.MINUS: case KeyWord.MUL: case KeyWord.DIV: case KeyWord.INTDIV: case KeyWord.EXP:
		    case KeyWord.IDENTIFIER: case KeyWord.DOT:
		    	 return(Token.StyleCode.regular);
		    	 
		    case KeyWord.BOOLEANKONST: case KeyWord.INTEGERKONST: case KeyWord.CHARACTERKONST:
		    case KeyWord.REALKONST: case KeyWord.TEXTKONST: case KeyWord.STRING:
		    	 return(Token.StyleCode.constant);
		    	 
		    case KeyWord.COMMENT:
		    	 return(Token.StyleCode.comment);
		    	 
		    default: return(Token.StyleCode.keyword);
		}
	}

	/**
	 * Get this Token's keyword attribute.
	 * 
	 * @return this Token's keyword attribute
	 */
	public int getKeyWord() {
		return (keyWord);
	}

	/**
	 * Get this Token's keyword code.
	 * 
	 * @return this Token's keyword code
	 */
	public int getKeyWordCode() {
		return (keyWord);
	}

	/**
	 * Get this Token's value attribute.
	 * 
	 * @return this Token's value attribute
	 */
	public Object getValue() {
		return (value);
	}

	/**
	 * Get this Token's value string.
	 * 
	 * @return this Token's value string
	 */
	public String getIdentifier() {
		return ((String) value);
	}

	public boolean equals(final Object other) {
		Token othr = (Token) other;
//		if (!this.keyWord.equals(othr.keyWord))
		if (this.keyWord != othr.keyWord)
			return (false);
		if (this.value == othr.value)
			return (true);
		if (this.value == null)
			return (false);
		if (othr.value == null)
			return (false);
		if (!this.value.equals(othr.value))
			return (false);
		return (true);
	}

	public String toString() {
		switch (keyWord) {
		case KeyWord.COMMA:			return (",");
		case KeyWord.COLON:			return (":");
		case KeyWord.SEMICOLON:		return (";");
		case KeyWord.BEGPAR:		return ("(");
		case KeyWord.ENDPAR:		return (")");
		case KeyWord.BEGBRACKET:	return ("[");
		case KeyWord.ENDBRACKET:	return ("]");
		case KeyWord.EXP:			return ("**");
		case KeyWord.DOT:			return (".");
		case KeyWord.CONC:			return ("&");

		case KeyWord.EQ:			return ("=");
		case KeyWord.GE:			return (">=");
		case KeyWord.GT:			return (">");
		case KeyWord.LE:			return ("<=");
		case KeyWord.LT:			return ("<");
		case KeyWord.NE:			return ("<>");
		case KeyWord.EQR:			return ("==");
		case KeyWord.NER:			return ("=/=");
		case KeyWord.IN:			return ("IN");
		case KeyWord.IS:			return ("IS");
		case KeyWord.PLUS:			return ("+");
		case KeyWord.MINUS:			return ("-");
		case KeyWord.MUL:			return ("*");
		case KeyWord.DIV:			return ("/");
		case KeyWord.INTDIV:		return ("//");
		case KeyWord.ASSIGNVALUE:	return (":=");
		case KeyWord.ASSIGNREF:		return (":-");

		case KeyWord.INTEGERKONST:	return ("INTEGERKONST(" + (Long) value + ")");
		case KeyWord.REALKONST:		return ("REALKONST(" + (Number) value + ")");
		case KeyWord.CHARACTERKONST:return ("CHARACTERKONST(" + (Character) value + ")");
		case KeyWord.TEXTKONST:		return ("TEXTKONST(" + (String) value + ")");
		case KeyWord.BOOLEANKONST:	return ("BOOLEANKONST(" + (Boolean) value + ")");
		case KeyWord.IDENTIFIER:	return ("" + value);

		case KeyWord.INTEGER: case KeyWord.REAL: {
			// Possible SHORT or LONG in value part
			String res = KeyWord.edit(keyWord);
			if (value != null)
				res = value.toString() + ' ' + res;
			return (res);
		}
		default:
			return (KeyWord.edit(keyWord).toLowerCase());
		}
	}

//	// ***********************************************************************************************
//	// *** Attribute File I/O
//	// ***********************************************************************************************
//
//	public void writeATTR(ObjectOutput oupt) throws IOException {
//		oupt.writeObject(keyWord);
//		oupt.writeObject(value);
//	}
//
//	public static Token readObject(ObjectInput inpt) throws IOException {
//		int keyWord = inpt.readShort();
//		Object value = inpt.readObject();
//		return(new Token("",keyWord,value));
//	}
//
//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		oupt.writeObject(keyWord);
//		oupt.writeObject(value);
//	}
//
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		keyWord = inpt.readShort();
//		value = inpt.readObject();
//	}

}
