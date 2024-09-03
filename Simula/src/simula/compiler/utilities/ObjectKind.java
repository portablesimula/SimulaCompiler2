package simula.compiler.utilities;

public class ObjectKind {

	/** Standard Class */		public static final int StandardClass = 1;
	/** Connection Block */		public static final int ConnectionBlock = 2;
	/** Compound Statement */	public static final int CompoundStatement = 3;
	/** Subblock */				public static final int SubBlock = 4;
	/** Normal Simula Procedure implemented as a Java Class */	public static final int Procedure = 5;
//	/** Prior Procedure implemented as a Member Method */		public static final int PriorProcedure = 6;
	/** Procedure coded as a Java Member Method. */				public static final int MemberMethod = 7;
	/** Procedure treated as a Java Static Method. */			public static final int ContextFreeMethod = 8;
	/** Class */					public static final int Class = 9;
	/** Prefixed Block */			public static final int PrefixedBlock = 10;
	/** Simula Program */			public static final int SimulaProgram = 11;
	/** Array Declaration */		public static final int ArrayDeclaration = 12;
	/** Virtual Specification */	public static final int VirtualSpecification = 13;
	/** Virtual Match */			public static final int VirtualMatch = 14;
	/** Parameter */				public static final int Parameter = 15;
	/** Thunk */					public static final int Thunk = 16;
	/** Label Declaration */		public static final int LabelDeclaration = 17;
	/** Simple Variable */			public static final int SimpleVariableDeclaration = 18;
	/** Inspect Variable */			public static final int InspectVariableDeclaration = 19;
	/** External Declaration */		public static final int ExternalDeclaration = 20;
	/** Hidden Specification */		public static final int HiddenSpecification = 21;
	/** Protected Specification */	public static final int ProtectedSpecification = 22;

	// *** Statements:

	/** BlockStatement */			public static final int BlockStatement = 23;
	/** ConditionalStatement */		public static final int ConditionalStatement = 24;
	/** ConnectionStatement */		public static final int ConnectionStatement = 25;
	/** ConnectionDoPart */			public static final int ConnectionDoPart = 26;
	/** ConnectionWhenPart */		public static final int ConnectionWhenPart = 27;
	/** DummyStatement */			public static final int DummyStatement = 28;
	/** ForStatement */				public static final int ForStatement = 29;
	/** ForWhileElement */			public static final int ForListElement = 30;
	/** ForStatement */				public static final int ForWhileElement = 31;
	/** StepUntilElement */			public static final int StepUntilElement = 32;
	/** GotoStatement */			public static final int GotoStatement = 33;
	/** InlineStatement */			public static final int InlineStatement = 34;
	/** InnerStatement */			public static final int InnerStatement = 35;
	/** LabeledStatement */			public static final int LabeledStatement = 36;
	/** ProgramModule */			public static final int ProgramModule = 37;
	/** StandaloneExpression */		public static final int StandaloneExpression = 38;
	/** SwitchStatement */			public static final int SwitchStatement = 39;
	/** WhileStatement */			public static final int WhileStatement = 40;
	/** ActivationStatement */		public static final int ActivationStatement = 41;

	// *** Expressions:

	/** ArithmeticExpression */		public static final int ArithmeticExpression = 42;
	/** AssignmentOperation */		public static final int AssignmentOperation = 43;
	/** BooleanExpression */		public static final int BooleanExpression = 44;
	/** ConditionalExpression */	public static final int ConditionalExpression = 45;
	/** Constant */					public static final int Constant = 46;
	/** LocalObject */				public static final int LocalObject = 47;
	/** ObjectGenerator */			public static final int ObjectGenerator = 48;
	/** ObjectRelation */			public static final int ObjectRelation = 49;
	/** QualifiedObject */			public static final int QualifiedObject = 50;
	/** RelationalOperation */		public static final int RelationalOperation = 51;
	/** RemoteVariable */			public static final int RemoteVariable = 52;
	/** TextExpression */			public static final int TextExpression = 53;
	/** TypeConversion */			public static final int TypeConversion = 54;
	/** UnaryOperation */			public static final int UnaryOperation = 55;
	/** VariableExpression */		public static final int VariableExpression = 56;

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
//			case PriorProcedure:			return "PriorProcedure";
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
			case InspectVariableDeclaration:return "InspectVariableDeclaration";
			case ExternalDeclaration:		return "ExternalDeclaration";
			case HiddenSpecification:		return "HiddenSpecification";
			case ProtectedSpecification:	return "ProtectedSpecification";
			
			case ActivationStatement:		return "ActivationStatement";
			case BlockStatement:			return "BlockStatement";
			case ConditionalStatement:		return "ConditionalStatement";
			case ConnectionStatement:		return "ConnectionStatement";
			case ConnectionDoPart:			return "ConnectionDoPart";
			case ConnectionWhenPart:		return "ConnectionWhenPart";
			case DummyStatement:			return "DummyStatement";
			case ForStatement:				return "ForStatement";
			case ForListElement:			return "ForListElement";
			case ForWhileElement:			return "ForWhileElement";
			case StepUntilElement:			return "StepUntilElement";
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
