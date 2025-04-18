package src;// Generated from grammar/Jort.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JortParser extends Parser {
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
		RULE_program = 0, RULE_type = 1, RULE_statement = 2, RULE_methodDeclaration = 3, 
		RULE_parameterList = 4, RULE_variableDeclaration = 5, RULE_assignment = 6, 
		RULE_arrayIndex = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_forStatement = 10, 
		RULE_returnStatement = 11, RULE_printStatement = 12, RULE_expressionStatement = 13, 
		RULE_expression = 14, RULE_literal = 15, RULE_operator = 16, RULE_block = 17, 
		RULE_argumentList = 18, RULE_tryCatchStatement = 19, RULE_breakStatement = 20, 
		RULE_continueStatement = 21, RULE_statementEnd = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "statement", "methodDeclaration", "parameterList", 
			"variableDeclaration", "assignment", "arrayIndex", "ifStatement", "whileStatement", 
			"forStatement", "returnStatement", "printStatement", "expressionStatement", 
			"expression", "literal", "operator", "block", "argumentList", "tryCatchStatement", 
			"breakStatement", "continueStatement", "statementEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'ths shi'", "'ts gon wrk'", 
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
	public String getGrammarFileName() { return "Jort.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JortParser(TokenStream input) {
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
			if ( listener instanceof JortListener) ((JortListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitProgram(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70949288464222728L) != 0) );
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
		public TerminalNode TAX() { return getToken(JortParser.TAX, 0); }
		public TerminalNode ONG() { return getToken(JortParser.ONG, 0); }
		public TerminalNode GONE() { return getToken(JortParser.GONE, 0); }
		public TerminalNode CHAT() { return getToken(JortParser.CHAT, 0); }
		public TerminalNode SKIBIDI() { return getToken(JortParser.SKIBIDI, 0); }
		public TerminalNode TUAH() { return getToken(JortParser.TUAH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(TAX);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(52);
					match(T__0);
					setState(53);
					match(T__1);
					}
					break;
				}
				}
				break;
			case ONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ONG);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(57);
					match(T__0);
					setState(58);
					match(T__1);
					}
					break;
				}
				}
				break;
			case GONE:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(GONE);
				}
				break;
			case CHAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(CHAT);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(63);
					match(T__0);
					setState(64);
					match(T__1);
					}
					break;
				}
				}
				break;
			case SKIBIDI:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(SKIBIDI);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(68);
					match(T__0);
					setState(69);
					match(T__1);
					}
					break;
				}
				}
				break;
			case TUAH:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(TUAH);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(73);
					match(T__0);
					setState(74);
					match(T__1);
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				tryCatchStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				printStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				methodDeclaration();
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(T__2);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028799132893184L) != 0)) {
				{
				setState(97);
				parameterList();
				}
			}

			setState(100);
			match(T__3);
			setState(101);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JortParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JortParser.IDENTIFIER, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(105);
				match(T__4);
				setState(106);
				type();
				setState(107);
				match(IDENTIFIER);
				}
				}
				setState(113);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public TerminalNode TS() { return getToken(JortParser.TS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JortParser.NEW, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitVariableDeclaration(this);
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
			setState(114);
			type();
			setState(115);
			match(IDENTIFIER);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(116);
				match(TS);
				setState(117);
				expression(0);
				}
				break;
			case 2:
				{
				setState(118);
				match(TS);
				setState(119);
				match(T__5);
				setState(120);
				expression(0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(121);
					match(T__4);
					setState(122);
					expression(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(130);
				match(TS);
				setState(131);
				match(NEW);
				setState(132);
				type();
				setState(133);
				match(T__0);
				setState(134);
				expression(0);
				setState(135);
				match(T__1);
				}
				break;
			}
			setState(139);
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
		public TerminalNode TS() { return getToken(JortParser.TS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(142);
				arrayIndex();
				}
				break;
			}
			setState(145);
			match(TS);
			setState(146);
			expression(0);
			setState(147);
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
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(T__0);
			setState(151);
			expression(0);
			setState(152);
			match(T__1);
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
		public TerminalNode HUZZ() { return getToken(JortParser.HUZZ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BRUZZ() { return getToken(JortParser.BRUZZ, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitIfStatement(this);
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
			setState(154);
			match(HUZZ);
			setState(155);
			match(T__2);
			setState(156);
			expression(0);
			setState(157);
			match(T__3);
			setState(158);
			block();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRUZZ) {
				{
				setState(159);
				match(BRUZZ);
				setState(160);
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
		public TerminalNode EDGE() { return getToken(JortParser.EDGE, 0); }
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(EDGE);
			setState(164);
			match(T__2);
			setState(165);
			expression(0);
			setState(166);
			match(T__3);
			setState(167);
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
		public TerminalNode GOON() { return getToken(JortParser.GOON, 0); }
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitForStatement(this);
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
			setState(169);
			match(GOON);
			setState(170);
			match(T__2);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(171);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(172);
				expressionStatement();
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(175);
				expressionStatement();
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518344L) != 0)) {
				{
				setState(178);
				expression(0);
				}
			}

			setState(181);
			match(T__3);
			setState(182);
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
		public TerminalNode JS_GIMME_MY_MONEY() { return getToken(JortParser.JS_GIMME_MY_MONEY, 0); }
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitReturnStatement(this);
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
			setState(184);
			match(JS_GIMME_MY_MONEY);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518344L) != 0)) {
				{
				setState(185);
				expression(0);
				}
			}

			setState(188);
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
		public TerminalNode PRNT() { return getToken(JortParser.PRNT, 0); }
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitPrintStatement(this);
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
			setState(190);
			match(PRNT);
			setState(191);
			match(T__2);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518344L) != 0)) {
				{
				setState(192);
				argumentList();
				}
			}

			setState(195);
			match(T__3);
			setState(196);
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			expression(0);
			setState(199);
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
		public TerminalNode IDENTIFIER() { return getToken(JortParser.IDENTIFIER, 0); }
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
		public TerminalNode NEW() { return getToken(JortParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TS_NT() { return getToken(JortParser.TS_NT, 0); }
		public TerminalNode LONG_AHH() { return getToken(JortParser.LONG_AHH, 0); }
		public TerminalNode SMALL_AHH() { return getToken(JortParser.SMALL_AHH, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(202);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(203);
				match(IDENTIFIER);
				setState(204);
				match(T__2);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949286325518344L) != 0)) {
					{
					setState(205);
					argumentList();
					}
				}

				setState(208);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(209);
				literal();
				}
				break;
			case 4:
				{
				setState(210);
				match(T__2);
				setState(211);
				expression(0);
				setState(212);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(214);
				match(NEW);
				setState(215);
				type();
				setState(216);
				match(T__0);
				setState(217);
				expression(0);
				setState(218);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(220);
				match(TS_NT);
				setState(221);
				expression(4);
				}
				break;
			case 7:
				{
				setState(222);
				match(IDENTIFIER);
				setState(223);
				match(LONG_AHH);
				}
				break;
			case 8:
				{
				setState(224);
				match(IDENTIFIER);
				setState(225);
				match(SMALL_AHH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(229);
						operator();
						setState(230);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(233);
						match(T__0);
						setState(234);
						expression(0);
						setState(235);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(241);
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
		public TerminalNode TAX_LITERAL() { return getToken(JortParser.TAX_LITERAL, 0); }
		public TerminalNode ONG_LITERAL() { return getToken(JortParser.ONG_LITERAL, 0); }
		public TerminalNode SKIBIDI_LITERAL() { return getToken(JortParser.SKIBIDI_LITERAL, 0); }
		public TerminalNode CHAT_LITERAL() { return getToken(JortParser.CHAT_LITERAL, 0); }
		public TerminalNode TUAH_LITERAL() { return getToken(JortParser.TUAH_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitLiteral(this);
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
			setState(242);
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
		public TerminalNode ADD_TS() { return getToken(JortParser.ADD_TS, 0); }
		public TerminalNode SUB_TS() { return getToken(JortParser.SUB_TS, 0); }
		public TerminalNode MUL_TS() { return getToken(JortParser.MUL_TS, 0); }
		public TerminalNode DIV_TS() { return getToken(JortParser.DIV_TS, 0); }
		public TerminalNode MOD_TS() { return getToken(JortParser.MOD_TS, 0); }
		public TerminalNode TS_EQL() { return getToken(JortParser.TS_EQL, 0); }
		public TerminalNode TS_NOT_EQL() { return getToken(JortParser.TS_NOT_EQL, 0); }
		public TerminalNode TS_LES_OR_EQL() { return getToken(JortParser.TS_LES_OR_EQL, 0); }
		public TerminalNode TS_GRTR_OR_EQL() { return getToken(JortParser.TS_GRTR_OR_EQL, 0); }
		public TerminalNode TS_LES() { return getToken(JortParser.TS_LES, 0); }
		public TerminalNode TS_GRTR() { return getToken(JortParser.TS_GRTR, 0); }
		public TerminalNode ND() { return getToken(JortParser.ND, 0); }
		public TerminalNode OR() { return getToken(JortParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitOperator(this);
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
			setState(244);
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(246);
			match(T__5);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70949288464222728L) != 0)) {
				{
				{
				setState(247);
				statement();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
			if ( listener instanceof JortListener ) ((JortListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitArgumentList(this);
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
			setState(255);
			expression(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(256);
				match(T__4);
				setState(257);
				expression(0);
				}
				}
				setState(262);
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
		public TerminalNode TS_GON_WRK() { return getToken(JortParser.TS_GON_WRK, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> TS_PMO_GNG() { return getTokens(JortParser.TS_PMO_GNG); }
		public TerminalNode TS_PMO_GNG(int i) {
			return getToken(JortParser.TS_PMO_GNG, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JortParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JortParser.IDENTIFIER, i);
		}
		public TerminalNode FNLY() { return getToken(JortParser.FNLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitTryCatchStatement(this);
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
			setState(263);
			match(TS_GON_WRK);
			setState(264);
			block();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_PMO_GNG) {
				{
				{
				setState(265);
				match(TS_PMO_GNG);
				setState(266);
				match(T__2);
				setState(267);
				match(IDENTIFIER);
				setState(268);
				match(T__3);
				setState(269);
				block();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FNLY) {
				{
				setState(275);
				match(FNLY);
				setState(276);
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
		public TerminalNode SYBAU() { return getToken(JortParser.SYBAU, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SYBAU);
			setState(280);
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
		public TerminalNode GO_ON() { return getToken(JortParser.GO_ON, 0); }
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(GO_ON);
			setState(283);
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
		public TerminalNode SEMI() { return getToken(JortParser.SEMI, 0); }
		public TerminalNode PMO_HEART() { return getToken(JortParser.PMO_HEART, 0); }
		public StatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).enterStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JortListener ) ((JortListener)listener).exitStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JortVisitor) return ((JortVisitor<? extends T>)visitor).visitStatementEnd(this);
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
			setState(285);
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
		"\u0004\u0001;\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001L\b\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004n\b\u0004"+
		"\n\u0004\f\u0004q\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0090\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ae\b\n\u0001\n\u0003\n\u00b1\b\n\u0001\n\u0003\n\u00b4\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00bb\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00c2\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cf\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00e3\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ee\b\u000e"+
		"\n\u000e\f\u000e\u00f1\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00f9\b\u0011\n\u0011\f\u0011"+
		"\u00fc\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0103\b\u0012\n\u0012\f\u0012\u0106\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u010f\b\u0013\n\u0013\f\u0013\u0112\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0116\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0001"+
		"\u001c\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0001\u000026\u0002\u0000"+
		"\u001f)-.\u0001\u000001\u013b\u0000/\u0001\u0000\u0000\u0000\u0002N\u0001"+
		"\u0000\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006^\u0001\u0000"+
		"\u0000\u0000\bg\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\f\u008f"+
		"\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u009a"+
		"\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a9"+
		"\u0001\u0000\u0000\u0000\u0016\u00b8\u0001\u0000\u0000\u0000\u0018\u00be"+
		"\u0001\u0000\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000\u001c\u00e2"+
		"\u0001\u0000\u0000\u0000\u001e\u00f2\u0001\u0000\u0000\u0000 \u00f4\u0001"+
		"\u0000\u0000\u0000\"\u00f6\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000"+
		"\u0000\u0000&\u0107\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000\u0000"+
		"*\u011a\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000.0\u0003"+
		"\u0004\u0002\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0001\u0001\u0000"+
		"\u0000\u000036\u0005\u0019\u0000\u000045\u0005\u0001\u0000\u000057\u0005"+
		"\u0002\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7O\u0001\u0000\u0000\u00008;\u0005\u001a\u0000\u00009:\u0005\u0001\u0000"+
		"\u0000:<\u0005\u0002\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<O\u0001\u0000\u0000\u0000=O\u0005\u001b\u0000\u0000>A\u0005"+
		"\u001c\u0000\u0000?@\u0005\u0001\u0000\u0000@B\u0005\u0002\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BO\u0001\u0000\u0000"+
		"\u0000CF\u0005\u001d\u0000\u0000DE\u0005\u0001\u0000\u0000EG\u0005\u0002"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GO\u0001"+
		"\u0000\u0000\u0000HK\u0005\u001e\u0000\u0000IJ\u0005\u0001\u0000\u0000"+
		"JL\u0005\u0002\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MO\u00057\u0000\u0000N3\u0001\u0000\u0000"+
		"\u0000N8\u0001\u0000\u0000\u0000N=\u0001\u0000\u0000\u0000N>\u0001\u0000"+
		"\u0000\u0000NC\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000O\u0003\u0001\u0000\u0000\u0000P]\u0003\n\u0005\u0000"+
		"Q]\u0003\f\u0006\u0000R]\u0003\u0010\b\u0000S]\u0003\u0012\t\u0000T]\u0003"+
		"\u0014\n\u0000U]\u0003\u0016\u000b\u0000V]\u0003\u001a\r\u0000W]\u0003"+
		"(\u0014\u0000X]\u0003*\u0015\u0000Y]\u0003&\u0013\u0000Z]\u0003\u0018"+
		"\f\u0000[]\u0003\u0006\u0003\u0000\\P\u0001\u0000\u0000\u0000\\Q\u0001"+
		"\u0000\u0000\u0000\\R\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\V\u0001\u0000"+
		"\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y"+
		"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0005"+
		"7\u0000\u0000`b\u0005\u0003\u0000\u0000ac\u0003\b\u0004\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0005\u0004\u0000\u0000ef\u0003\"\u0011\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gh\u0003\u0002\u0001\u0000ho\u00057\u0000\u0000ij\u0005\u0005\u0000"+
		"\u0000jk\u0003\u0002\u0001\u0000kl\u00057\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mi\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0003\u0002\u0001\u0000s\u0089\u00057\u0000\u0000"+
		"tu\u0005/\u0000\u0000u\u008a\u0003\u001c\u000e\u0000vw\u0005/\u0000\u0000"+
		"wx\u0005\u0006\u0000\u0000x}\u0003\u001c\u000e\u0000yz\u0005\u0005\u0000"+
		"\u0000z|\u0003\u001c\u000e\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0007\u0000\u0000\u0081\u008a\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005/\u0000\u0000\u0083\u0084\u0005\u0017\u0000\u0000\u0084\u0085\u0003"+
		"\u0002\u0001\u0000\u0085\u0086\u0005\u0001\u0000\u0000\u0086\u0087\u0003"+
		"\u001c\u000e\u0000\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089t\u0001\u0000\u0000\u0000\u0089v\u0001\u0000\u0000"+
		"\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0003,\u0016\u0000"+
		"\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u0090\u00057\u0000\u0000\u008e"+
		"\u0090\u0003\u000e\u0007\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005/\u0000\u0000\u0092\u0093\u0003\u001c\u000e\u0000\u0093\u0094"+
		"\u0003,\u0016\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"7\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0098\u0003\u001c"+
		"\u000e\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u000f\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0011\u0000\u0000\u009b\u009c\u0005\u0003"+
		"\u0000\u0000\u009c\u009d\u0003\u001c\u000e\u0000\u009d\u009e\u0005\u0004"+
		"\u0000\u0000\u009e\u00a1\u0003\"\u0011\u0000\u009f\u00a0\u0005\u0012\u0000"+
		"\u0000\u00a0\u00a2\u0003\"\u0011\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0011\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000"+
		"\u00a7\u00a8\u0003\"\u0011\u0000\u00a8\u0013\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ad\u0005\u0003\u0000\u0000\u00ab"+
		"\u00ae\u0003\n\u0005\u0000\u00ac\u00ae\u0003\u001a\r\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u0003\u001a\r\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003"+
		"\u001c\u000e\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0004\u0000\u0000\u00b6\u00b7\u0003\"\u0011\u0000\u00b7\u0015\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0005\u000b\u0000\u0000\u00b9\u00bb\u0003\u001c"+
		"\u000e\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003,\u0016"+
		"\u0000\u00bd\u0017\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0018\u0000"+
		"\u0000\u00bf\u00c1\u0005\u0003\u0000\u0000\u00c0\u00c2\u0003$\u0012\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000"+
		"\u00c4\u00c5\u0003,\u0016\u0000\u00c5\u0019\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0003\u001c\u000e\u0000\u00c7\u00c8\u0003,\u0016\u0000\u00c8\u001b"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\u000e\uffff\uffff\u0000\u00ca"+
		"\u00e3\u00057\u0000\u0000\u00cb\u00cc\u00057\u0000\u0000\u00cc\u00ce\u0005"+
		"\u0003\u0000\u0000\u00cd\u00cf\u0003$\u0012\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00e3\u0005\u0004\u0000\u0000\u00d1\u00e3\u0003\u001e"+
		"\u000f\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0003\u001c"+
		"\u000e\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000\u00d7\u00d8\u0003\u0002"+
		"\u0001\u0000\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9\u00da\u0003\u001c"+
		"\u000e\u0000\u00da\u00db\u0005\u0002\u0000\u0000\u00db\u00e3\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005,\u0000\u0000\u00dd\u00e3\u0003\u001c\u000e"+
		"\u0004\u00de\u00df\u00057\u0000\u0000\u00df\u00e3\u0005*\u0000\u0000\u00e0"+
		"\u00e1\u00057\u0000\u0000\u00e1\u00e3\u0005+\u0000\u0000\u00e2\u00c9\u0001"+
		"\u0000\u0000\u0000\u00e2\u00cb\u0001\u0000\u0000\u0000\u00e2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00d2\u0001\u0000\u0000\u0000\u00e2\u00d6\u0001"+
		"\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2\u00de\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\n\u0007\u0000\u0000\u00e5\u00e6\u0003 "+
		"\u0010\u0000\u00e6\u00e7\u0003\u001c\u000e\b\u00e7\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\n\u0001\u0000\u0000\u00e9\u00ea\u0005\u0001\u0000\u0000"+
		"\u00ea\u00eb\u0003\u001c\u000e\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0007\u0001\u0000\u0000\u00f5!\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fa\u0005\u0006\u0000\u0000\u00f7\u00f9\u0003\u0004\u0002\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u0007\u0000\u0000\u00fe#\u0001\u0000\u0000\u0000\u00ff\u0104"+
		"\u0003\u001c\u000e\u0000\u0100\u0101\u0005\u0005\u0000\u0000\u0101\u0103"+
		"\u0003\u001c\u000e\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\t\u0000\u0000\u0108\u0110\u0003\""+
		"\u0011\u0000\u0109\u010a\u0005\n\u0000\u0000\u010a\u010b\u0005\u0003\u0000"+
		"\u0000\u010b\u010c\u00057\u0000\u0000\u010c\u010d\u0005\u0004\u0000\u0000"+
		"\u010d\u010f\u0003\"\u0011\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0115\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u000f\u0000\u0000\u0114"+
		"\u0116\u0003\"\u0011\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117\u0118\u0005"+
		"\u0015\u0000\u0000\u0118\u0119\u0003,\u0016\u0000\u0119)\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005\u0016\u0000\u0000\u011b\u011c\u0003,\u0016\u0000"+
		"\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0007\u0002\u0000\u0000\u011e"+
		"-\u0001\u0000\u0000\u0000\u001b16;AFKN\\bo}\u0089\u008f\u00a1\u00ad\u00b0"+
		"\u00b3\u00ba\u00c1\u00ce\u00e2\u00ed\u00ef\u00fa\u0104\u0110\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}