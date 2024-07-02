package simula.compiler.utilities;

public class ObjectKind {

	/** Standard Class */		public static final int StandardClass = 1;
	/** Connection Block */		public static final int ConnectionBlock = 2;
	/** Compound Statement */	public static final int CompoundStatement = 3;
	/** Subblock */				public static final int SubBlock = 4;
	/**
	 * Normal Simula Procedure implemented as a Java Class
	 */
	public static final int Procedure = 5;
	/**
	 * Procedure coded as a Java Member Method.
	 */
	public static final int MemberMethod = 6;
	/**
	 * Procedure treated as a Java Static Method.
	 */
	public static final int ContextFreeMethod = 7;
	/** Class */					public static final int Class = 8;
	/** Prefixed Block */			public static final int PrefixedBlock = 9;
	/** Simula Program */			public static final int SimulaProgram = 10;
	/** Array Declaration */		public static final int ArrayDeclaration = 11;
	/** Virtual Specification */	public static final int VirtualSpecification = 12;
	/** Virtual Match */			public static final int VirtualMatch = 13;
	/** Parameter */				public static final int Parameter = 14;
	/** Thunk */					public static final int Thunk = 15;
	/** Label Declaration */		public static final int LabelDeclaration = 16;
	/** Simple Variable */			public static final int SimpleVariableDeclaration = 17;
	/** External Declaration */		public static final int ExternalDeclaration = 18;
//	/** Switch Declaration */		public static final int Switch = 19;

	// *** Statements:

	/** ActivationStatement */		public static final int ActivationStatement = 21;
	/** BlockStatement */			public static final int BlockStatement = 22;
	/** ConditionalStatement */		public static final int ConditionalStatement = 23;
	/** ConnectionStatement */		public static final int ConnectionStatement = 24;
	/** DummyStatement */			public static final int DummyStatement = 25;
	/** ForStatement */				public static final int ForStatement = 26;
	/** GotoStatement */			public static final int GotoStatement = 27;
	/** InlineStatement */			public static final int InlineStatement = 28;
	/** InnerStatement */			public static final int InnerStatement = 29;
	/** LabeledStatement */			public static final int LabeledStatement = 30;
	/** ProgramModule */			public static final int ProgramModule = 31;
	/** StandaloneExpression */		public static final int StandaloneExpression = 32;
	/** SwitchStatement */			public static final int SwitchStatement = 33;
	/** WhileStatement */			public static final int WhileStatement = 34;

	// *** Expressions:

	/** ArithmeticExpression */		public static final int ArithmeticExpression = 41;
	/** AssignmentOperation */		public static final int AssignmentOperation = 42;
	/** BooleanExpression */		public static final int BooleanExpression = 43;
	/** ConditionalExpression */	public static final int ConditionalExpression = 44;
	/** Constant */					public static final int Constant = 45;
	/** LocalObject */				public static final int LocalObject = 46;
	/** ObjectGenerator */			public static final int ObjectGenerator = 47;
	/** ObjectRelation */			public static final int ObjectRelation = 48;
	/** QualifiedObject */			public static final int QualifiedObject = 49;
	/** RelationalOperation */		public static final int RelationalOperation = 50;
	/** RemoteVariable */			public static final int RemoteVariable = 51;
	/** TextExpression */			public static final int TextExpression = 52;
	/** TypeConversion */			public static final int TypeConversion = 53;
	/** UnaryOperation */			public static final int UnaryOperation = 54;
	/** VariableExpression */		public static final int VariableExpression = 55;

	// *** ObjectReferences:

	/** Null */						public static final int NULL = 0;
	/** Object Reference */			public static final int ObjectReference = 60;

	/** Max Value */				public static final int MAX_VALUE = 63;

	
	public static String edit(int kind) {
		switch(kind) {
			case NULL:						return "null";
			case ObjectReference:			return "ObjectReference";

			case StandardClass:				return "StandardClass";
			case ConnectionBlock:			return "ConnectionBlock";
			case CompoundStatement:			return "CompoundStatement";
			case SubBlock:					return "SubBlock";
			case Procedure:					return "Procedure";
			case MemberMethod:				return "MemberMethod";
			case ContextFreeMethod:			return "ContextFreeMethod";
			case Class:						return "Class";
			case PrefixedBlock:				return "PrefixedBlock";
			case SimulaProgram:				return "SimulaProgram";
			case ArrayDeclaration:			return "ArrayDeclaration";
			case VirtualSpecification:		return "VirtualSpecification";
			case VirtualMatch:				return "VirtualMatch";
			case Parameter:					return "Parameter";
			case Thunk:						return "Thunk";
			case LabelDeclaration:			return "LabelDeclaration";
			case SimpleVariableDeclaration:	return "SimpleVariableDeclaration";
			case ExternalDeclaration:		return "ExternalDeclaration";
			
			case ActivationStatement:		return "ActivationStatement";
			case BlockStatement:			return "BlockStatement";
			case ConditionalStatement:		return "ConditionalStatement";
			case ConnectionStatement:		return "ConnectionStatement";
			case DummyStatement:			return "DummyStatement";
			case ForStatement:				return "ForStatement";
			case GotoStatement:				return "GotoStatement";
			case InlineStatement:			return "InlineStatement";
			case InnerStatement:			return "InnerStatement";
			case LabeledStatement:			return "LabeledStatement";
			case ProgramModule:				return "ProgramModule";
			case StandaloneExpression:		return "StandaloneExpression";
			case SwitchStatement:			return "SwitchStatement";
			case WhileStatement:			return "WhileStatement";

			case ArithmeticExpression:		return "ArithmeticExpression";
			case AssignmentOperation:		return "AssignmentOperation";
			case BooleanExpression:			return "BooleanExpression";
			case ConditionalExpression:		return "ConditionalExpression";
			case Constant:					return "Constant";
			case LocalObject:				return "LocalObject";
			case ObjectGenerator:			return "ObjectGenerator";
			case ObjectRelation:			return "ObjectRelation";
			case QualifiedObject:			return "QualifiedObject";
			case RelationalOperation:		return "RelationalOperation";
			case RemoteVariable:			return "RemoteVariable";
			case TextExpression:			return "TextExpression";
			case TypeConversion:			return "TypeConversion";
			case UnaryOperation:			return "UnaryOperation";
			case VariableExpression:		return "VariableExpression";

		}
		Util.IERR();
		return(null);
	}

}
