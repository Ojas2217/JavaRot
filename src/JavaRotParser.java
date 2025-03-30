package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaRotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, THS_SHI=8, TS_GON_WRK=9, 
		TS_PMO_GNG=10, JS_GIMME_MY_MONEY=11, PBLC=12, PRVT=13, STTC=14, FNLY=15, 
		FN=16, HUZZ=17, BRUZZ=18, EDGE=19, GOON=20, SYBAU=21, GO_ON=22, NEW=23, 
		PRNT=24, TAX=25, ONG=26, GONE=27, CHAT=28, SKIBIDI=29, TUAH=30, ADD_TS=31, 
		SUB_TS=32, MUL_TS=33, DIV_TS=34, MOD_TS=35, TS_EQL=36, TS_LES_OR_EQL=37, 
		TS_GRTR_OR_EQL=38, TS_LES=39, TS_GRTR=40, TS_NOT_EQL=41, LONG_AHH=42, 
		SMALL_AHH=43, TS_NT=44, ND=45, OR=46, TS=47, SEMI=48, PMO_HEART=49, TAX_LITERAL=50, 
		ONG_LITERAL=51, SKIBIDI_LITERAL=52, CHAT_LITERAL=53, TUAH_LITERAL=54, 
		IDENTIFIER=55, WS=56, COMMENT=57, LINE_COMMENT=58, ESC=59;
	public static final int
		RULE_program = 0, RULE_methodDeclaration = 1, RULE_parameterList = 2, 
		RULE_type = 3, RULE_statement = 4, RULE_variableDeclaration = 5, RULE_assignment = 6, 
		RULE_arrayIndex = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_forStatement = 10, 
		RULE_returnStatement = 11, RULE_printStatement = 12, RULE_expressionStatement = 13, 
		RULE_expression = 14, RULE_literal = 15, RULE_operator = 16, RULE_block = 17, 
		RULE_argumentList = 18, RULE_tryCatchStatement = 19, RULE_breakStatement = 20, 
		RULE_continueStatement = 21, RULE_statementEnd = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "methodDeclaration", "parameterList", "type", "statement", 
			"variableDeclaration", "assignment", "arrayIndex", "ifStatement", "whileStatement", 
			"forStatement", "returnStatement", "printStatement", "expressionStatement", 
			"expression", "literal", "operator", "block", "argumentList", "tryCatchStatement", 
			"breakStatement", "continueStatement", "statementEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "'ths shi'", "'ts gon wrk'", 
			"'ts pmo gng'", "'js gimme my money'", "'pblc'", "'prvt'", "'sttc'", 
			"'fnly'", "'fn'", "'huzz'", "'bruzz'", "'edge'", "'goon'", "'sybau'", 
			"'go on'", "'new'", "'prnt'", "'tax'", "'ong'", "'gone'", "'chat'", "'Skibidi'", 
			"'tuah'", "'add ts'", "'sub ts'", "'mul ts'", "'div ts'", "'mod ts'", 
			"'ts eql'", "'ts les or eql'", "'ts grtr or eql'", "'ts les'", "'ts grtr'", 
			"'ts not eql'", "'long ahh'", "'small ahh'", "'ts nt'", "'nd'", "'or'", 
			"'ts'", "';'", "'\\uD83D\uDC94'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "THS_SHI", "TS_GON_WRK", 
			"TS_PMO_GNG", "JS_GIMME_MY_MONEY", "PBLC", "PRVT", "STTC", "FNLY", "FN", 
			"HUZZ", "BRUZZ", "EDGE", "GOON", "SYBAU", "GO_ON", "NEW", "PRNT", "TAX", 
			"ONG", "GONE", "CHAT", "SKIBIDI", "TUAH", "ADD_TS", "SUB_TS", "MUL_TS", 
			"DIV_TS", "MOD_TS", "TS_EQL", "TS_LES_OR_EQL", "TS_GRTR_OR_EQL", "TS_LES", 
			"TS_GRTR", "TS_NOT_EQL", "LONG_AHH", "SMALL_AHH", "TS_NT", "ND", "OR", 
			"TS", "SEMI", "PMO_HEART", "TAX_LITERAL", "ONG_LITERAL", "SKIBIDI_LITERAL", 
			"CHAT_LITERAL", "TUAH_LITERAL", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", 
			"ESC"
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
	public String getGrammarFileName() { return "JavaRot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaRotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener) ((JavaRotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70949288464222722L) != 0) );
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			type();
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(T__0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028799132893184L) != 0)) {
				{
				setState(54);
				parameterList();
				}
			}

			setState(57);
			match(T__1);
			setState(58);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaRotParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaRotParser.IDENTIFIER, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(62);
				match(T__2);
				setState(63);
				type();
				setState(64);
				match(IDENTIFIER);
				}
				}
				setState(70);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TAX() { return getToken(JavaRotParser.TAX, 0); }
		public TerminalNode ONG() { return getToken(JavaRotParser.ONG, 0); }
		public TerminalNode GONE() { return getToken(JavaRotParser.GONE, 0); }
		public TerminalNode CHAT() { return getToken(JavaRotParser.CHAT, 0); }
		public TerminalNode SKIBIDI() { return getToken(JavaRotParser.SKIBIDI, 0); }
		public TerminalNode TUAH() { return getToken(JavaRotParser.TUAH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(TAX);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__3);
					setState(73);
					match(T__4);
					}
					break;
				}
				}
				break;
			case ONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ONG);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(77);
					match(T__3);
					setState(78);
					match(T__4);
					}
					break;
				}
				}
				break;
			case GONE:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(GONE);
				}
				break;
			case CHAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(CHAT);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(83);
					match(T__3);
					setState(84);
					match(T__4);
					}
					break;
				}
				}
				break;
			case SKIBIDI:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(SKIBIDI);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					match(T__3);
					setState(89);
					match(T__4);
					}
					break;
				}
				}
				break;
			case TUAH:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(TUAH);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(93);
					match(T__3);
					setState(94);
					match(T__4);
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				match(IDENTIFIER);
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				tryCatchStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(110);
				printStatement();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public TerminalNode TS() { return getToken(JavaRotParser.TS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JavaRotParser.NEW, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(IDENTIFIER);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(115);
				match(TS);
				setState(116);
				expression(0);
				}
				break;
			case 2:
				{
				setState(117);
				match(TS);
				setState(118);
				match(T__5);
				setState(119);
				expression(0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(120);
					match(T__2);
					setState(121);
					expression(0);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(129);
				match(TS);
				setState(130);
				match(NEW);
				setState(131);
				type();
				setState(132);
				match(T__3);
				setState(133);
				expression(0);
				setState(134);
				match(T__4);
				}
				break;
			}
			setState(138);
			statementEnd();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TS() { return getToken(JavaRotParser.TS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(140);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(141);
				arrayIndex();
				}
				break;
			}
			setState(144);
			match(TS);
			setState(145);
			expression(0);
			setState(146);
			statementEnd();
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
	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__3);
			setState(150);
			expression(0);
			setState(151);
			match(T__4);
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
		public TerminalNode HUZZ() { return getToken(JavaRotParser.HUZZ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BRUZZ() { return getToken(JavaRotParser.BRUZZ, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(HUZZ);
			setState(154);
			match(T__0);
			setState(155);
			expression(0);
			setState(156);
			match(T__1);
			setState(157);
			block();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRUZZ) {
				{
				setState(158);
				match(BRUZZ);
				setState(159);
				block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(JavaRotParser.EDGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(EDGE);
			setState(163);
			match(T__0);
			setState(164);
			expression(0);
			setState(165);
			match(T__1);
			setState(166);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode GOON() { return getToken(JavaRotParser.GOON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(GOON);
			setState(169);
			match(T__0);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(170);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(171);
				expressionStatement();
				}
				break;
			}
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(174);
				expressionStatement();
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518338L) != 0)) {
				{
				setState(177);
				expression(0);
				}
			}

			setState(180);
			match(T__1);
			setState(181);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode JS_GIMME_MY_MONEY() { return getToken(JavaRotParser.JS_GIMME_MY_MONEY, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(JS_GIMME_MY_MONEY);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518338L) != 0)) {
				{
				setState(184);
				expression(0);
				}
			}

			setState(187);
			statementEnd();
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRNT() { return getToken(JavaRotParser.PRNT, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PRNT);
			setState(190);
			match(T__0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518338L) != 0)) {
				{
				setState(191);
				argumentList();
				}
			}

			setState(194);
			match(T__1);
			setState(195);
			statementEnd();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			expression(0);
			setState(198);
			statementEnd();
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
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JavaRotParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TS_NT() { return getToken(JavaRotParser.TS_NT, 0); }
		public TerminalNode LONG_AHH() { return getToken(JavaRotParser.LONG_AHH, 0); }
		public TerminalNode SMALL_AHH() { return getToken(JavaRotParser.SMALL_AHH, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(201);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(202);
				match(IDENTIFIER);
				setState(203);
				match(T__0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518338L) != 0)) {
					{
					setState(204);
					argumentList();
					}
				}

				setState(207);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(208);
				literal();
				}
				break;
			case 4:
				{
				setState(209);
				match(T__0);
				setState(210);
				expression(0);
				setState(211);
				match(T__1);
				}
				break;
			case 5:
				{
				setState(213);
				match(NEW);
				setState(214);
				type();
				setState(215);
				match(T__3);
				setState(216);
				expression(0);
				setState(217);
				match(T__4);
				}
				break;
			case 6:
				{
				setState(219);
				match(TS_NT);
				setState(220);
				expression(4);
				}
				break;
			case 7:
				{
				setState(221);
				match(IDENTIFIER);
				setState(222);
				match(LONG_AHH);
				}
				break;
			case 8:
				{
				setState(223);
				match(IDENTIFIER);
				setState(224);
				match(SMALL_AHH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						operator();
						setState(229);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						match(T__3);
						setState(233);
						expression(0);
						setState(234);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TAX_LITERAL() { return getToken(JavaRotParser.TAX_LITERAL, 0); }
		public TerminalNode ONG_LITERAL() { return getToken(JavaRotParser.ONG_LITERAL, 0); }
		public TerminalNode SKIBIDI_LITERAL() { return getToken(JavaRotParser.SKIBIDI_LITERAL, 0); }
		public TerminalNode CHAT_LITERAL() { return getToken(JavaRotParser.CHAT_LITERAL, 0); }
		public TerminalNode TUAH_LITERAL() { return getToken(JavaRotParser.TUAH_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897112121344L) != 0)) ) {
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
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD_TS() { return getToken(JavaRotParser.ADD_TS, 0); }
		public TerminalNode SUB_TS() { return getToken(JavaRotParser.SUB_TS, 0); }
		public TerminalNode MUL_TS() { return getToken(JavaRotParser.MUL_TS, 0); }
		public TerminalNode DIV_TS() { return getToken(JavaRotParser.DIV_TS, 0); }
		public TerminalNode MOD_TS() { return getToken(JavaRotParser.MOD_TS, 0); }
		public TerminalNode TS_EQL() { return getToken(JavaRotParser.TS_EQL, 0); }
		public TerminalNode TS_NOT_EQL() { return getToken(JavaRotParser.TS_NOT_EQL, 0); }
		public TerminalNode TS_LES_OR_EQL() { return getToken(JavaRotParser.TS_LES_OR_EQL, 0); }
		public TerminalNode TS_GRTR_OR_EQL() { return getToken(JavaRotParser.TS_GRTR_OR_EQL, 0); }
		public TerminalNode TS_LES() { return getToken(JavaRotParser.TS_LES, 0); }
		public TerminalNode TS_GRTR() { return getToken(JavaRotParser.TS_GRTR, 0); }
		public TerminalNode ND() { return getToken(JavaRotParser.ND, 0); }
		public TerminalNode OR() { return getToken(JavaRotParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 109949015293952L) != 0)) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__5);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949288464222722L) != 0)) {
				{
				{
				setState(246);
				statement();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(T__6);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expression(0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(255);
				match(T__2);
				setState(256);
				expression(0);
				}
				}
				setState(261);
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
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TS_GON_WRK() { return getToken(JavaRotParser.TS_GON_WRK, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> TS_PMO_GNG() { return getTokens(JavaRotParser.TS_PMO_GNG); }
		public TerminalNode TS_PMO_GNG(int i) {
			return getToken(JavaRotParser.TS_PMO_GNG, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaRotParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaRotParser.IDENTIFIER, i);
		}
		public TerminalNode FNLY() { return getToken(JavaRotParser.FNLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TS_GON_WRK);
			setState(263);
			block();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_PMO_GNG) {
				{
				{
				setState(264);
				match(TS_PMO_GNG);
				setState(265);
				match(T__0);
				setState(266);
				match(IDENTIFIER);
				setState(267);
				match(T__1);
				setState(268);
				block();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FNLY) {
				{
				setState(274);
				match(FNLY);
				setState(275);
				block();
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode SYBAU() { return getToken(JavaRotParser.SYBAU, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(SYBAU);
			setState(279);
			statementEnd();
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode GO_ON() { return getToken(JavaRotParser.GO_ON, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(GO_ON);
			setState(282);
			statementEnd();
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
	public static class StatementEndContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaRotParser.SEMI, 0); }
		public TerminalNode PMO_HEART() { return getToken(JavaRotParser.PMO_HEART, 0); }
		public StatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRotVisitor) return ((JavaRotVisitor<? extends T>)visitor).visitStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementEndContext statementEnd() throws RecognitionException {
		StatementEndContext _localctx = new StatementEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==PMO_HEART) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002"+
		"\n\u0002\f\u0002F\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"K\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0003\u0003c\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"p\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005"+
		"\n\u0005\f\u0005~\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0089\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u008f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ad"+
		"\b\n\u0001\n\u0003\n\u00b0\b\n\u0001\n\u0003\n\u00b3\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00c1\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ce\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e2\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ed\b\u000e\n\u000e\f\u000e"+
		"\u00f0\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00f8\b\u0011\n\u0011\f\u0011\u00fb\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0102"+
		"\b\u0012\n\u0012\f\u0012\u0105\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010e\b\u0013"+
		"\n\u0013\f\u0013\u0111\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0115"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0001\u001c\u0017\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,\u0000\u0003\u0001\u000026\u0002\u0000\u001f)-.\u0001\u0000"+
		"01\u0139\u0000/\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000"+
		"\u0004<\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bo\u0001"+
		"\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000"+
		"\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000"+
		"\u0000\u0012\u00a2\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000"+
		"\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00bd\u0001\u0000\u0000"+
		"\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00e1\u0001\u0000\u0000"+
		"\u0000\u001e\u00f1\u0001\u0000\u0000\u0000 \u00f3\u0001\u0000\u0000\u0000"+
		"\"\u00f5\u0001\u0000\u0000\u0000$\u00fe\u0001\u0000\u0000\u0000&\u0106"+
		"\u0001\u0000\u0000\u0000(\u0116\u0001\u0000\u0000\u0000*\u0119\u0001\u0000"+
		"\u0000\u0000,\u011c\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000/.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0001\u0001\u0000\u0000\u000034\u0003\u0006"+
		"\u0003\u000045\u00057\u0000\u000057\u0005\u0001\u0000\u000068\u0003\u0004"+
		"\u0002\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0005\u0002\u0000\u0000:;\u0003\"\u0011\u0000;\u0003"+
		"\u0001\u0000\u0000\u0000<=\u0003\u0006\u0003\u0000=D\u00057\u0000\u0000"+
		">?\u0005\u0003\u0000\u0000?@\u0003\u0006\u0003\u0000@A\u00057\u0000\u0000"+
		"AC\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0005\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GJ\u0005\u0019\u0000\u0000"+
		"HI\u0005\u0004\u0000\u0000IK\u0005\u0005\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000Kc\u0001\u0000\u0000\u0000LO\u0005\u001a"+
		"\u0000\u0000MN\u0005\u0004\u0000\u0000NP\u0005\u0005\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000Pc\u0001\u0000\u0000\u0000"+
		"Qc\u0005\u001b\u0000\u0000RU\u0005\u001c\u0000\u0000ST\u0005\u0004\u0000"+
		"\u0000TV\u0005\u0005\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000Vc\u0001\u0000\u0000\u0000WZ\u0005\u001d\u0000\u0000XY\u0005"+
		"\u0004\u0000\u0000Y[\u0005\u0005\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[c\u0001\u0000\u0000\u0000\\_\u0005\u001e\u0000"+
		"\u0000]^\u0005\u0004\u0000\u0000^`\u0005\u0005\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0005"+
		"7\u0000\u0000bG\u0001\u0000\u0000\u0000bL\u0001\u0000\u0000\u0000bQ\u0001"+
		"\u0000\u0000\u0000bR\u0001\u0000\u0000\u0000bW\u0001\u0000\u0000\u0000"+
		"b\\\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0007\u0001\u0000"+
		"\u0000\u0000dp\u0003\n\u0005\u0000ep\u0003\f\u0006\u0000fp\u0003\u0010"+
		"\b\u0000gp\u0003\u0012\t\u0000hp\u0003\u0014\n\u0000ip\u0003\u0016\u000b"+
		"\u0000jp\u0003\u001a\r\u0000kp\u0003(\u0014\u0000lp\u0003*\u0015\u0000"+
		"mp\u0003&\u0013\u0000np\u0003\u0018\f\u0000od\u0001\u0000\u0000\u0000"+
		"oe\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000og\u0001\u0000\u0000"+
		"\u0000oh\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000oj\u0001\u0000"+
		"\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000"+
		"qr\u0003\u0006\u0003\u0000r\u0088\u00057\u0000\u0000st\u0005/\u0000\u0000"+
		"t\u0089\u0003\u001c\u000e\u0000uv\u0005/\u0000\u0000vw\u0005\u0006\u0000"+
		"\u0000w|\u0003\u001c\u000e\u0000xy\u0005\u0003\u0000\u0000y{\u0003\u001c"+
		"\u000e\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080"+
		"\u0089\u0001\u0000\u0000\u0000\u0081\u0082\u0005/\u0000\u0000\u0082\u0083"+
		"\u0005\u0017\u0000\u0000\u0083\u0084\u0003\u0006\u0003\u0000\u0084\u0085"+
		"\u0005\u0004\u0000\u0000\u0085\u0086\u0003\u001c\u000e\u0000\u0086\u0087"+
		"\u0005\u0005\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088s\u0001"+
		"\u0000\u0000\u0000\u0088u\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0003,\u0016\u0000\u008b\u000b\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u00057\u0000\u0000\u008d\u008f\u0003\u000e\u0007\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091"+
		"\u0092\u0003\u001c\u000e\u0000\u0092\u0093\u0003,\u0016\u0000\u0093\r"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u00057\u0000\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u0097\u0003\u001c\u000e\u0000\u0097\u0098\u0005"+
		"\u0005\u0000\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0011\u0000\u0000\u009a\u009b\u0005\u0001\u0000\u0000\u009b\u009c\u0003"+
		"\u001c\u000e\u0000\u009c\u009d\u0005\u0002\u0000\u0000\u009d\u00a0\u0003"+
		"\"\u0011\u0000\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u00a1\u0003\""+
		"\u0011\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0013"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4\u00a5\u0003\u001c"+
		"\u000e\u0000\u00a5\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0003\"\u0011"+
		"\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000"+
		"\u0000\u00a9\u00ac\u0005\u0001\u0000\u0000\u00aa\u00ad\u0003\n\u0005\u0000"+
		"\u00ab\u00ad\u0003\u001a\r\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u001a\r\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6"+
		"\u0003\"\u0011\u0000\u00b6\u0015\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005"+
		"\u000b\u0000\u0000\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003,\u0016\u0000\u00bc\u0017\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0018\u0000\u0000\u00be\u00c0\u0005\u0001"+
		"\u0000\u0000\u00bf\u00c1\u0003$\u0012\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00c4\u0003,\u0016\u0000"+
		"\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u001c\u000e\u0000"+
		"\u00c6\u00c7\u0003,\u0016\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0006\u000e\uffff\uffff\u0000\u00c9\u00e2\u00057\u0000\u0000\u00ca"+
		"\u00cb\u00057\u0000\u0000\u00cb\u00cd\u0005\u0001\u0000\u0000\u00cc\u00ce"+
		"\u0003$\u0012\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00e2\u0005"+
		"\u0002\u0000\u0000\u00d0\u00e2\u0003\u001e\u000f\u0000\u00d1\u00d2\u0005"+
		"\u0001\u0000\u0000\u00d2\u00d3\u0003\u001c\u000e\u0000\u00d3\u00d4\u0005"+
		"\u0002\u0000\u0000\u00d4\u00e2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0017\u0000\u0000\u00d6\u00d7\u0003\u0006\u0003\u0000\u00d7\u00d8\u0005"+
		"\u0004\u0000\u0000\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00da\u0005"+
		"\u0005\u0000\u0000\u00da\u00e2\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		",\u0000\u0000\u00dc\u00e2\u0003\u001c\u000e\u0004\u00dd\u00de\u00057\u0000"+
		"\u0000\u00de\u00e2\u0005*\u0000\u0000\u00df\u00e0\u00057\u0000\u0000\u00e0"+
		"\u00e2\u0005+\u0000\u0000\u00e1\u00c8\u0001\u0000\u0000\u0000\u00e1\u00ca"+
		"\u0001\u0000\u0000\u0000\u00e1\u00d0\u0001\u0000\u0000\u0000\u00e1\u00d1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00d5\u0001\u0000\u0000\u0000\u00e1\u00db"+
		"\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00ee\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\n\u0007\u0000\u0000\u00e4\u00e5\u0003 \u0010\u0000\u00e5\u00e6\u0003"+
		"\u001c\u000e\b\u00e6\u00ed\u0001\u0000\u0000\u0000\u00e7\u00e8\n\u0001"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00ea\u0003\u001c"+
		"\u000e\u0000\u00ea\u00eb\u0005\u0005\u0000\u0000\u00eb\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u001d\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0007\u0000"+
		"\u0000\u0000\u00f2\u001f\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007\u0001"+
		"\u0000\u0000\u00f4!\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005\u0006\u0000"+
		"\u0000\u00f6\u00f8\u0003\b\u0004\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0007\u0000\u0000"+
		"\u00fd#\u0001\u0000\u0000\u0000\u00fe\u0103\u0003\u001c\u000e\u0000\u00ff"+
		"\u0100\u0005\u0003\u0000\u0000\u0100\u0102\u0003\u001c\u000e\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"%\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005\t\u0000\u0000\u0107\u010f\u0003\"\u0011\u0000\u0108\u0109\u0005"+
		"\n\u0000\u0000\u0109\u010a\u0005\u0001\u0000\u0000\u010a\u010b\u00057"+
		"\u0000\u0000\u010b\u010c\u0005\u0002\u0000\u0000\u010c\u010e\u0003\"\u0011"+
		"\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0114\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u000f\u0000\u0000\u0113\u0115\u0003\"\u0011\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\'\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0015\u0000\u0000\u0117"+
		"\u0118\u0003,\u0016\u0000\u0118)\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"\u0016\u0000\u0000\u011a\u011b\u0003,\u0016\u0000\u011b+\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0007\u0002\u0000\u0000\u011d-\u0001\u0000\u0000\u0000"+
		"\u001b17DJOUZ_bo|\u0088\u008e\u00a0\u00ac\u00af\u00b2\u00b9\u00c0\u00cd"+
		"\u00e1\u00ec\u00ee\u00f9\u0103\u010f\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}