// Generated from C:/Users/gusta/IdeaProjects/Mini_Pascal_Compiler/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, VAR=2, INTEGER=3, CHAR=4, CHR=5, STRING=6, BOOLEAN=7, ARRAY=8, 
		IN=9, OF=10, FUNCTION=11, PROCEDURE=12, PROGRAM=13, BEGIN=14, END=15, 
		IF=16, THEN=17, ELSE=18, WHILE=19, DO=20, FOR=21, TO=22, DOWNTO=23, REPEAT=24, 
		UNTIL=25, WRITE=26, WRITELN=27, READ=28, NOT=29, AND=30, OR=31, PLUS=32, 
		MINUS=33, STAR=34, SLASH=35, DIV=36, MOD=37, ASSIGN=38, EQUAL=39, NOT_EQUAL=40, 
		LT=41, LE=42, GT=43, GE=44, LPAREN=45, RPAREN=46, LBRACK=47, RBRACK=48, 
		COMMA=49, SEMI=50, COLON=51, DOT=52, DOTDOT=53, NUM_INT=54, STRING_LITERAL=55, 
		IDENT=56, NUM_REAL=57, WS=58, COMMENT=59;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_variableDeclarationPart = 2, RULE_variableDeclaration = 3, 
		RULE_procedureAndFunctionDeclarationPart = 4, RULE_procedureDeclaration = 5, 
		RULE_resultType = 6, RULE_functionDeclaration = 7, RULE_formalParameterList = 8, 
		RULE_formalParameterSection = 9, RULE_typeIdentifier = 10, RULE_arrayType = 11, 
		RULE_constant = 12, RULE_sign = 13, RULE_constantChr = 14, RULE_unsignedNumber = 15, 
		RULE_unsignedInteger = 16, RULE_unsignedReal = 17, RULE_string = 18, RULE_compoundStatement = 19, 
		RULE_blockEnd = 20, RULE_statements = 21, RULE_statement = 22, RULE_writelnStatement = 23, 
		RULE_assignmentStatement = 24, RULE_procedureStatement = 25, RULE_actualParameterList = 26, 
		RULE_actualParameter = 27, RULE_ifStatement = 28, RULE_whileStatement = 29, 
		RULE_forStatement = 30, RULE_repeatStatement = 31, RULE_writeStatement = 32, 
		RULE_readStatement = 33, RULE_expression = 34, RULE_relationaloperator = 35, 
		RULE_simpleExpression = 36, RULE_additiveoperator = 37, RULE_term = 38, 
		RULE_multiplicativeoperator = 39, RULE_factor = 40, RULE_variable = 41, 
		RULE_identifierList = 42, RULE_conststr = 43, RULE_identifier = 44, RULE_number = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "variableDeclarationPart", "variableDeclaration", 
			"procedureAndFunctionDeclarationPart", "procedureDeclaration", "resultType", 
			"functionDeclaration", "formalParameterList", "formalParameterSection", 
			"typeIdentifier", "arrayType", "constant", "sign", "constantChr", "unsignedNumber", 
			"unsignedInteger", "unsignedReal", "string", "compoundStatement", "blockEnd", 
			"statements", "statement", "writelnStatement", "assignmentStatement", 
			"procedureStatement", "actualParameterList", "actualParameter", "ifStatement", 
			"whileStatement", "forStatement", "repeatStatement", "writeStatement", 
			"readStatement", "expression", "relationaloperator", "simpleExpression", 
			"additiveoperator", "term", "multiplicativeoperator", "factor", "variable", 
			"identifierList", "conststr", "identifier", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Const'", "'var'", "'Integer'", "'Char'", "'CHR'", "'String'", 
			"'Boolean'", "'Array'", "'In'", "'of'", "'Function'", "'Procedure'", 
			"'program'", "'begin'", "'end'", "'If'", "'Then'", "'Else'", "'While'", 
			"'Do'", "'For'", "'To'", "'Downto'", "'Repeat'", "'Until'", "'write'", 
			"'writeln'", "'read'", "'Not'", "'And'", "'Or'", "'+'", "'-'", "'*'", 
			"'/'", "'div'", "'mod'", "':='", "'='", "'<>'", "'<'", "'<='", "'>'", 
			"'>='", "'('", "')'", "'['", "']'", "','", "';'", "':'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "VAR", "INTEGER", "CHAR", "CHR", "STRING", "BOOLEAN", 
			"ARRAY", "IN", "OF", "FUNCTION", "PROCEDURE", "PROGRAM", "BEGIN", "END", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", "REPEAT", 
			"UNTIL", "WRITE", "WRITELN", "READ", "NOT", "AND", "OR", "PLUS", "MINUS", 
			"STAR", "SLASH", "DIV", "MOD", "ASSIGN", "EQUAL", "NOT_EQUAL", "LT", 
			"LE", "GT", "GE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "SEMI", 
			"COLON", "DOT", "DOTDOT", "NUM_INT", "STRING_LITERAL", "IDENT", "NUM_REAL", 
			"WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniPascalParser.SEMI, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PROGRAM);
			setState(93);
			identifier();
			setState(94);
			match(SEMI);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22532L) != 0)) {
				{
				{
				setState(95);
				block();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public VariableDeclarationPartContext variableDeclarationPart() {
			return getRuleContext(VariableDeclarationPartContext.class,0);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(101);
				variableDeclarationPart();
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==PROCEDURE) {
				{
				setState(104);
				procedureAndFunctionDeclarationPart();
				}
			}

			setState(107);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MiniPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MiniPascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariableDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(VAR);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				variableDeclaration();
				setState(111);
				match(SEMI);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			identifierList();
			setState(118);
			match(COLON);
			setState(119);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MiniPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MiniPascalParser.SEMI, i);
		}
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureAndFunctionDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(121);
					procedureDeclaration();
					}
					break;
				case FUNCTION:
					{
					setState(122);
					functionDeclaration();
					setState(123);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION || _la==PROCEDURE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniPascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PROCEDURE);
			setState(130);
			identifier();
			setState(131);
			match(SEMI);
			setState(132);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MiniPascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(FUNCTION);
			setState(137);
			identifier();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(138);
				match(LPAREN);
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(139);
					formalParameterList();
					}
					break;
				}
				setState(142);
				match(RPAREN);
				}
			}

			setState(145);
			match(COLON);
			setState(146);
			resultType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MiniPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MiniPascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENT) {
				{
				setState(148);
				formalParameterSection();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(149);
					match(SEMI);
					setState(150);
					formalParameterSection();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameterSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(158);
				match(VAR);
				}
			}

			setState(161);
			identifierList();
			setState(162);
			match(COLON);
			setState(163);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentifierContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeIdentifier);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(INTEGER);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(BOOLEAN);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(MiniPascalParser.LBRACK, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> DOTDOT() { return getTokens(MiniPascalParser.DOTDOT); }
		public TerminalNode DOTDOT(int i) {
			return getToken(MiniPascalParser.DOTDOT, i);
		}
		public TerminalNode RBRACK() { return getToken(MiniPascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ARRAY);
				setState(173);
				match(LBRACK);
				setState(174);
				constant();
				setState(175);
				match(DOTDOT);
				setState(176);
				constant();
				setState(177);
				match(RBRACK);
				setState(178);
				match(OF);
				setState(179);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ARRAY);
				setState(182);
				match(LBRACK);
				setState(183);
				constant();
				setState(184);
				match(DOTDOT);
				setState(185);
				constant();
				setState(186);
				match(COMMA);
				setState(187);
				constant();
				setState(188);
				match(DOTDOT);
				setState(189);
				constant();
				setState(190);
				match(RBRACK);
				setState(191);
				match(OF);
				setState(192);
				typeIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				sign();
				setState(198);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				sign();
				setState(202);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				constantChr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(MiniPascalParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConstantChr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConstantChr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CHR);
			setState(211);
			match(LPAREN);
			setState(212);
			unsignedInteger();
			setState(213);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unsignedNumber);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				unsignedReal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(MiniPascalParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(MiniPascalParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MiniPascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(BEGIN);
			setState(226);
			statements();
			setState(227);
			blockEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockEndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public BlockEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBlockEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBlockEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBlockEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockEndContext blockEnd() throws RecognitionException {
		BlockEndContext _localctx = new BlockEndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MiniPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MiniPascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			statement();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(SEMI);
					setState(233);
					statement();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(239);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public WritelnStatementContext writelnStatement() {
			return getRuleContext(WritelnStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				writeStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				writelnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				readStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WritelnStatementContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(MiniPascalParser.WRITELN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ConststrContext conststr() {
			return getRuleContext(ConststrContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public WritelnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writelnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWritelnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWritelnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWritelnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnStatementContext writelnStatement() throws RecognitionException {
		WritelnStatementContext _localctx = new WritelnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_writelnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WRITELN);
			setState(254);
			match(LPAREN);
			setState(255);
			conststr();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(256);
				match(COMMA);
				setState(257);
				variable();
				}
			}

			setState(260);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			variable();
			setState(263);
			match(ASSIGN);
			setState(264);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			identifier();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(267);
				match(LPAREN);
				setState(268);
				actualParameterList();
				setState(269);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			actualParameter();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				actualParameter();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IF);
			setState(284);
			expression();
			setState(285);
			match(THEN);
			setState(286);
			statement();
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(287);
				match(ELSE);
				setState(288);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(WHILE);
			setState(292);
			expression();
			setState(293);
			match(DO);
			setState(294);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TO() { return getToken(MiniPascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(MiniPascalParser.DOWNTO, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FOR);
			setState(297);
			identifier();
			setState(298);
			match(ASSIGN);
			setState(299);
			expression();
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			expression();
			setState(302);
			match(DO);
			setState(303);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(MiniPascalParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(MiniPascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(REPEAT);
			setState(306);
			statements();
			setState(307);
			match(UNTIL);
			setState(308);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ConststrContext conststr() {
			return getRuleContext(ConststrContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WRITE);
			setState(311);
			match(LPAREN);
			setState(312);
			conststr();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(313);
				match(COMMA);
				setState(314);
				variable();
				}
			}

			setState(317);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(READ);
			setState(320);
			match(LPAREN);
			setState(321);
			variable();
			setState(322);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			simpleExpression();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616275456L) != 0)) {
				{
				setState(325);
				relationaloperator();
				setState(326);
				simpleExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MiniPascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MiniPascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(MiniPascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(MiniPascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniPascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(MiniPascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(MiniPascalParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRelationaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRelationaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616275456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AdditiveoperatorContext> additiveoperator() {
			return getRuleContexts(AdditiveoperatorContext.class);
		}
		public AdditiveoperatorContext additiveoperator(int i) {
			return getRuleContext(AdditiveoperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			term();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) {
				{
				{
				setState(333);
				additiveoperator();
				setState(334);
				term();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAdditiveoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAdditiveoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplicativeoperatorContext> multiplicativeoperator() {
			return getRuleContexts(MultiplicativeoperatorContext.class);
		}
		public MultiplicativeoperatorContext multiplicativeoperator(int i) {
			return getRuleContext(MultiplicativeoperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			factor();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 258771779584L) != 0)) {
				{
				{
				setState(344);
				multiplicativeoperator();
				setState(345);
				factor();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MiniPascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(MiniPascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitMultiplicativeoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMultiplicativeoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258771779584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConststrContext conststr() {
			return getRuleContext(ConststrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				variable();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				number();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				conststr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(LPAREN);
				setState(358);
				expression();
				setState(359);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(NOT);
				setState(362);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(MiniPascalParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(MiniPascalParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variable);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				identifier();
				setState(367);
				match(LBRACK);
				setState(368);
				expression();
				setState(369);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				identifier();
				setState(372);
				match(LBRACK);
				setState(373);
				expression();
				setState(374);
				match(COMMA);
				setState(375);
				expression();
				setState(376);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			identifier();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				identifier();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConststrContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MiniPascalParser.STRING_LITERAL, 0); }
		public ConststrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conststr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConststr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConststr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConststr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConststrContext conststr() throws RecognitionException {
		ConststrContext _localctx = new ConststrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conststr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MiniPascalParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(MiniPascalParser.NUM_INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000a"+
		"\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0001\u0003\u0001g\b\u0001\u0001"+
		"\u0001\u0003\u0001j\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002r\b\u0002\u000b\u0002\f\u0002"+
		"s\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004~\b\u0004\u000b\u0004\f\u0004\u007f"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008d\b\u0007\u0001\u0007\u0003\u0007\u0090\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0098\b\b\n\b\f\b\u009b"+
		"\t\b\u0003\b\u009d\b\b\u0001\t\u0003\t\u00a0\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ab\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c3\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00cf\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00da\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00eb\b\u0015\n\u0015"+
		"\f\u0015\u00ee\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0103\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0110\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0115\b\u001a\n\u001a"+
		"\f\u001a\u0118\t\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0122\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u013c\b \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0149\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$"+
		"\u0151\b$\n$\f$\u0154\t$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u015c\b&\n&\f&\u015f\t&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u016c\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u017b\b)\u0001*\u0001*\u0001*\u0005*\u0180\b*\n*\f*\u0183\t*"+
		"\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0000\u0000.\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0005\u0001\u0000 !\u0001\u0000"+
		"\u0016\u0017\u0002\u0000\t\t\',\u0001\u0000\u001f!\u0002\u0000\u001e\u001e"+
		"\"%\u018b\u0000\\\u0001\u0000\u0000\u0000\u0002f\u0001\u0000\u0000\u0000"+
		"\u0004m\u0001\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\b}\u0001"+
		"\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000"+
		"\u0000\u0000\u000e\u0088\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000"+
		"\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000"+
		"\u0000\u0000\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00ce\u0001\u0000"+
		"\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00d2\u0001\u0000"+
		"\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000"+
		"\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u00df\u0001\u0000\u0000\u0000"+
		"&\u00e1\u0001\u0000\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00e7"+
		"\u0001\u0000\u0000\u0000,\u00fb\u0001\u0000\u0000\u0000.\u00fd\u0001\u0000"+
		"\u0000\u00000\u0106\u0001\u0000\u0000\u00002\u010a\u0001\u0000\u0000\u0000"+
		"4\u0111\u0001\u0000\u0000\u00006\u0119\u0001\u0000\u0000\u00008\u011b"+
		"\u0001\u0000\u0000\u0000:\u0123\u0001\u0000\u0000\u0000<\u0128\u0001\u0000"+
		"\u0000\u0000>\u0131\u0001\u0000\u0000\u0000@\u0136\u0001\u0000\u0000\u0000"+
		"B\u013f\u0001\u0000\u0000\u0000D\u0144\u0001\u0000\u0000\u0000F\u014a"+
		"\u0001\u0000\u0000\u0000H\u014c\u0001\u0000\u0000\u0000J\u0155\u0001\u0000"+
		"\u0000\u0000L\u0157\u0001\u0000\u0000\u0000N\u0160\u0001\u0000\u0000\u0000"+
		"P\u016b\u0001\u0000\u0000\u0000R\u017a\u0001\u0000\u0000\u0000T\u017c"+
		"\u0001\u0000\u0000\u0000V\u0184\u0001\u0000\u0000\u0000X\u0186\u0001\u0000"+
		"\u0000\u0000Z\u0188\u0001\u0000\u0000\u0000\\]\u0005\r\u0000\u0000]^\u0003"+
		"X,\u0000^b\u00052\u0000\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000c\u0001\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000eg\u0003\u0004\u0002\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003"+
		"&\u0013\u0000l\u0003\u0001\u0000\u0000\u0000mq\u0005\u0002\u0000\u0000"+
		"no\u0003\u0006\u0003\u0000op\u00052\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qn\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u0005\u0001\u0000\u0000\u0000uv\u0003"+
		"T*\u0000vw\u00053\u0000\u0000wx\u0003\u0014\n\u0000x\u0007\u0001\u0000"+
		"\u0000\u0000y~\u0003\n\u0005\u0000z{\u0003\u000e\u0007\u0000{|\u00052"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}z\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\f\u0000\u0000\u0082\u0083\u0003X,\u0000\u0083\u0084"+
		"\u00052\u0000\u0000\u0084\u0085\u0003\u0002\u0001\u0000\u0085\u000b\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087\r\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\u000b\u0000\u0000\u0089\u008f\u0003X,\u0000"+
		"\u008a\u008c\u0005-\u0000\u0000\u008b\u008d\u0003\u0010\b\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0005.\u0000\u0000\u008f\u008a"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u00053\u0000\u0000\u0092\u0093\u0003"+
		"\f\u0006\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0099\u0003\u0012"+
		"\t\u0000\u0095\u0096\u00052\u0000\u0000\u0096\u0098\u0003\u0012\t\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u0011\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u0002\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003T*\u0000\u00a2\u00a3"+
		"\u00053\u0000\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u0013\u0001"+
		"\u0000\u0000\u0000\u00a5\u00ab\u0005\u0003\u0000\u0000\u00a6\u00ab\u0005"+
		"\u0004\u0000\u0000\u00a7\u00ab\u0005\u0006\u0000\u0000\u00a8\u00ab\u0005"+
		"\u0007\u0000\u0000\u00a9\u00ab\u0003\u0016\u000b\u0000\u00aa\u00a5\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\b\u0000\u0000\u00ad\u00ae\u0005/\u0000\u0000\u00ae\u00af\u0003\u0018"+
		"\f\u0000\u00af\u00b0\u00055\u0000\u0000\u00b0\u00b1\u0003\u0018\f\u0000"+
		"\u00b1\u00b2\u00050\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3"+
		"\u00b4\u0003\u0014\n\u0000\u00b4\u00c3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\b\u0000\u0000\u00b6\u00b7\u0005/\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0018\f\u0000\u00b8\u00b9\u00055\u0000\u0000\u00b9\u00ba\u0003\u0018"+
		"\f\u0000\u00ba\u00bb\u00051\u0000\u0000\u00bb\u00bc\u0003\u0018\f\u0000"+
		"\u00bc\u00bd\u00055\u0000\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be"+
		"\u00bf\u00050\u0000\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0\u00c1"+
		"\u0003\u0014\n\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00ac\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000\u0000\u00c3\u0017\u0001"+
		"\u0000\u0000\u0000\u00c4\u00cf\u0003\u001e\u000f\u0000\u00c5\u00c6\u0003"+
		"\u001a\r\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u00cf\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cf\u0003X,\u0000\u00c9\u00ca\u0003\u001a\r\u0000"+
		"\u00ca\u00cb\u0003X,\u0000\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0003$\u0012\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce\u00c4\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u0019\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0007\u0000\u0000\u0000\u00d1\u001b\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d4\u0005"+
		"-\u0000\u0000\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00d6\u0005.\u0000"+
		"\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00da\u0003 \u0010\u0000"+
		"\u00d8\u00da\u0003\"\u0011\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u00056\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"9\u0000\u0000\u00de#\u0001\u0000\u0000\u0000\u00df\u00e0\u00057\u0000"+
		"\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u000e\u0000\u0000"+
		"\u00e2\u00e3\u0003*\u0015\u0000\u00e3\u00e4\u0003(\u0014\u0000\u00e4\'"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u000f\u0000\u0000\u00e6)\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ec\u0003,\u0016\u0000\u00e8\u00e9\u00052\u0000"+
		"\u0000\u00e9\u00eb\u0003,\u0016\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u00052\u0000\u0000\u00f0"+
		"+\u0001\u0000\u0000\u0000\u00f1\u00fc\u00030\u0018\u0000\u00f2\u00fc\u0003"+
		"2\u0019\u0000\u00f3\u00fc\u0003&\u0013\u0000\u00f4\u00fc\u00038\u001c"+
		"\u0000\u00f5\u00fc\u0003:\u001d\u0000\u00f6\u00fc\u0003<\u001e\u0000\u00f7"+
		"\u00fc\u0003>\u001f\u0000\u00f8\u00fc\u0003@ \u0000\u00f9\u00fc\u0003"+
		".\u0017\u0000\u00fa\u00fc\u0003B!\u0000\u00fb\u00f1\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc-\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005\u001b\u0000\u0000\u00fe\u00ff\u0005-\u0000\u0000\u00ff"+
		"\u0102\u0003V+\u0000\u0100\u0101\u00051\u0000\u0000\u0101\u0103\u0003"+
		"R)\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005.\u0000\u0000"+
		"\u0105/\u0001\u0000\u0000\u0000\u0106\u0107\u0003R)\u0000\u0107\u0108"+
		"\u0005&\u0000\u0000\u0108\u0109\u0003D\"\u0000\u01091\u0001\u0000\u0000"+
		"\u0000\u010a\u010f\u0003X,\u0000\u010b\u010c\u0005-\u0000\u0000\u010c"+
		"\u010d\u00034\u001a\u0000\u010d\u010e\u0005.\u0000\u0000\u010e\u0110\u0001"+
		"\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u01103\u0001\u0000\u0000\u0000\u0111\u0116\u00036\u001b"+
		"\u0000\u0112\u0113\u00051\u0000\u0000\u0113\u0115\u00036\u001b\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"5\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0003D\"\u0000\u011a7\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0010"+
		"\u0000\u0000\u011c\u011d\u0003D\"\u0000\u011d\u011e\u0005\u0011\u0000"+
		"\u0000\u011e\u0121\u0003,\u0016\u0000\u011f\u0120\u0005\u0012\u0000\u0000"+
		"\u0120\u0122\u0003,\u0016\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u01229\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u0013\u0000\u0000\u0124\u0125\u0003D\"\u0000\u0125\u0126\u0005"+
		"\u0014\u0000\u0000\u0126\u0127\u0003,\u0016\u0000\u0127;\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005\u0015\u0000\u0000\u0129\u012a\u0003X,\u0000\u012a"+
		"\u012b\u0005&\u0000\u0000\u012b\u012c\u0003D\"\u0000\u012c\u012d\u0007"+
		"\u0001\u0000\u0000\u012d\u012e\u0003D\"\u0000\u012e\u012f\u0005\u0014"+
		"\u0000\u0000\u012f\u0130\u0003,\u0016\u0000\u0130=\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0005\u0018\u0000\u0000\u0132\u0133\u0003*\u0015\u0000\u0133"+
		"\u0134\u0005\u0019\u0000\u0000\u0134\u0135\u0003D\"\u0000\u0135?\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u001a\u0000\u0000\u0137\u0138\u0005"+
		"-\u0000\u0000\u0138\u013b\u0003V+\u0000\u0139\u013a\u00051\u0000\u0000"+
		"\u013a\u013c\u0003R)\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005.\u0000\u0000\u013eA\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u001c"+
		"\u0000\u0000\u0140\u0141\u0005-\u0000\u0000\u0141\u0142\u0003R)\u0000"+
		"\u0142\u0143\u0005.\u0000\u0000\u0143C\u0001\u0000\u0000\u0000\u0144\u0148"+
		"\u0003H$\u0000\u0145\u0146\u0003F#\u0000\u0146\u0147\u0003H$\u0000\u0147"+
		"\u0149\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149E\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0007\u0002\u0000\u0000\u014bG\u0001\u0000\u0000\u0000\u014c\u0152\u0003"+
		"L&\u0000\u014d\u014e\u0003J%\u0000\u014e\u014f\u0003L&\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0151\u0154"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153I\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0007\u0003\u0000\u0000\u0156K\u0001\u0000"+
		"\u0000\u0000\u0157\u015d\u0003P(\u0000\u0158\u0159\u0003N\'\u0000\u0159"+
		"\u015a\u0003P(\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0158\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015eM\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0007\u0004"+
		"\u0000\u0000\u0161O\u0001\u0000\u0000\u0000\u0162\u016c\u0003R)\u0000"+
		"\u0163\u016c\u0003Z-\u0000\u0164\u016c\u0003V+\u0000\u0165\u0166\u0005"+
		"-\u0000\u0000\u0166\u0167\u0003D\"\u0000\u0167\u0168\u0005.\u0000\u0000"+
		"\u0168\u016c\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u001d\u0000\u0000"+
		"\u016a\u016c\u0003P(\u0000\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u0163"+
		"\u0001\u0000\u0000\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b\u0165"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016cQ\u0001"+
		"\u0000\u0000\u0000\u016d\u017b\u0003X,\u0000\u016e\u016f\u0003X,\u0000"+
		"\u016f\u0170\u0005/\u0000\u0000\u0170\u0171\u0003D\"\u0000\u0171\u0172"+
		"\u00050\u0000\u0000\u0172\u017b\u0001\u0000\u0000\u0000\u0173\u0174\u0003"+
		"X,\u0000\u0174\u0175\u0005/\u0000\u0000\u0175\u0176\u0003D\"\u0000\u0176"+
		"\u0177\u00051\u0000\u0000\u0177\u0178\u0003D\"\u0000\u0178\u0179\u0005"+
		"0\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u016d\u0001\u0000"+
		"\u0000\u0000\u017a\u016e\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000"+
		"\u0000\u0000\u017bS\u0001\u0000\u0000\u0000\u017c\u0181\u0003X,\u0000"+
		"\u017d\u017e\u00051\u0000\u0000\u017e\u0180\u0003X,\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182U\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"7\u0000\u0000\u0185W\u0001\u0000\u0000\u0000\u0186\u0187\u00058\u0000"+
		"\u0000\u0187Y\u0001\u0000\u0000\u0000\u0188\u0189\u00056\u0000\u0000\u0189"+
		"[\u0001\u0000\u0000\u0000\u001cbfis}\u007f\u008c\u008f\u0099\u009c\u009f"+
		"\u00aa\u00c2\u00ce\u00d9\u00ec\u00fb\u0102\u010f\u0116\u0121\u013b\u0148"+
		"\u0152\u015d\u016b\u017a\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}