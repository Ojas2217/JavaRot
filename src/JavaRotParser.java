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
		TAX=24, ONG=25, GONE=26, CHAT=27, SKIBIDI=28, TUAH=29, ADD_TS=30, SUB_TS=31, 
		MUL_TS=32, DIV_TS=33, MOD_TS=34, TS_EQL=35, TS_LES_OR_EQL=36, TS_GRTR_OR_EQL=37, 
		TS_LES=38, TS_GRTR=39, TS_NOT_EQL=40, LONG_AHH=41, SMALL_AHH=42, TS_NT=43, 
		ND=44, OR=45, TS=46, SEMI=47, PMO_HEART=48, TAX_LITERAL=49, ONG_LITERAL=50, 
		SKIBIDI_LITERAL=51, CHAT_LITERAL=52, TUAH_LITERAL=53, IDENTIFIER=54, WS=55, 
		COMMENT=56, LINE_COMMENT=57, ESC=58;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_constructorDeclaration = 2, 
		RULE_methodDeclaration = 3, RULE_parameterList = 4, RULE_type = 5, RULE_encapsulation = 6, 
		RULE_modifier = 7, RULE_statement = 8, RULE_fieldDeclaration = 9, RULE_variableDeclaration = 10, 
		RULE_assignment = 11, RULE_ifStatement = 12, RULE_whileStatement = 13, 
		RULE_forStatement = 14, RULE_returnStatement = 15, RULE_expressionStatement = 16, 
		RULE_expression = 17, RULE_literal = 18, RULE_operator = 19, RULE_block = 20, 
		RULE_argumentList = 21, RULE_tryCatchStatement = 22, RULE_breakStatement = 23, 
		RULE_continueStatement = 24, RULE_statementEnd = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "constructorDeclaration", "methodDeclaration", 
			"parameterList", "type", "encapsulation", "modifier", "statement", "fieldDeclaration", 
			"variableDeclaration", "assignment", "ifStatement", "whileStatement", 
			"forStatement", "returnStatement", "expressionStatement", "expression", 
			"literal", "operator", "block", "argumentList", "tryCatchStatement", 
			"breakStatement", "continueStatement", "statementEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "','", "'['", "']'", "'ths shi'", "'ts gon wrk'", 
			"'ts pmo gng'", "'js gimme my money'", "'pblc'", "'prvt'", "'sttc'", 
			"'fnly'", "'fn'", "'huzz'", "'bruzz'", "'edge'", "'goon'", "'sybau'", 
			"'go on'", "'new'", "'tax'", "'ong'", "'gone'", "'chat'", "'Skibidi'", 
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
			"HUZZ", "BRUZZ", "EDGE", "GOON", "SYBAU", "GO_ON", "NEW", "TAX", "ONG", 
			"GONE", "CHAT", "SKIBIDI", "TUAH", "ADD_TS", "SUB_TS", "MUL_TS", "DIV_TS", 
			"MOD_TS", "TS_EQL", "TS_LES_OR_EQL", "TS_GRTR_OR_EQL", "TS_LES", "TS_GRTR", 
			"TS_NOT_EQL", "LONG_AHH", "SMALL_AHH", "TS_NT", "ND", "OR", "TS", "SEMI", 
			"PMO_HEART", "TAX_LITERAL", "ONG_LITERAL", "SKIBIDI_LITERAL", "CHAT_LITERAL", 
			"TUAH_LITERAL", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", "ESC"
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
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					statement();
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35474644231928328L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(57);
						classDeclaration();
						}
						break;
					case 2:
						{
						setState(58);
						methodDeclaration();
						}
						break;
					case 3:
						{
						setState(59);
						constructorDeclaration();
						}
						break;
					case 4:
						{
						setState(60);
						statement();
						}
						break;
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35474644232010504L) != 0) );
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode THS_SHI() { return getToken(JavaRotParser.THS_SHI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public EncapsulationContext encapsulation() {
			return getRuleContext(EncapsulationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PBLC || _la==PRVT) {
				{
				setState(67);
				encapsulation();
				}
			}

			setState(70);
			match(THS_SHI);
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(T__0);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35474644232010248L) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(73);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(74);
					statement();
					}
					break;
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EncapsulationContext encapsulation() {
			return getRuleContext(EncapsulationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PBLC || _la==PRVT) {
				{
				setState(82);
				encapsulation();
				}
			}

			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(T__2);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014399566446592L) != 0)) {
				{
				setState(87);
				parameterList();
				}
			}

			setState(90);
			match(T__3);
			setState(91);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EncapsulationContext encapsulation() {
			return getRuleContext(EncapsulationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PBLC || _la==PRVT) {
				{
				setState(93);
				encapsulation();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STTC || _la==FN) {
				{
				{
				setState(96);
				modifier();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			type();
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(T__2);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014399566446592L) != 0)) {
				{
				setState(105);
				parameterList();
				}
			}

			setState(108);
			match(T__3);
			setState(109);
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
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			match(IDENTIFIER);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(113);
				match(T__4);
				setState(114);
				type();
				setState(115);
				match(IDENTIFIER);
				}
				}
				setState(121);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(TAX);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(123);
					match(T__5);
					setState(124);
					match(T__6);
					}
					break;
				}
				}
				break;
			case ONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ONG);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(128);
					match(T__5);
					setState(129);
					match(T__6);
					}
					break;
				}
				}
				break;
			case GONE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(GONE);
				}
				break;
			case CHAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(CHAT);
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(134);
					match(T__5);
					setState(135);
					match(T__6);
					}
					break;
				}
				}
				break;
			case SKIBIDI:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(SKIBIDI);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(139);
					match(T__5);
					setState(140);
					match(T__6);
					}
					break;
				}
				}
				break;
			case TUAH:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(TUAH);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(144);
					match(T__5);
					setState(145);
					match(T__6);
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
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
	public static class EncapsulationContext extends ParserRuleContext {
		public TerminalNode PRVT() { return getToken(JavaRotParser.PRVT, 0); }
		public TerminalNode PBLC() { return getToken(JavaRotParser.PBLC, 0); }
		public EncapsulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encapsulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterEncapsulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitEncapsulation(this);
		}
	}

	public final EncapsulationContext encapsulation() throws RecognitionException {
		EncapsulationContext _localctx = new EncapsulationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_encapsulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==PBLC || _la==PRVT) ) {
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode STTC() { return getToken(JavaRotParser.STTC, 0); }
		public TerminalNode FN() { return getToken(JavaRotParser.FN, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==STTC || _la==FN) ) {
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
	public static class StatementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				continueStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(165);
				tryCatchStatement();
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public EncapsulationContext encapsulation() {
			return getRuleContext(EncapsulationContext.class,0);
		}
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
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRotListener ) ((JavaRotListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			encapsulation();
			setState(169);
			type();
			setState(170);
			match(IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(171);
				match(TS);
				setState(172);
				expression(0);
				}
				break;
			case 2:
				{
				setState(173);
				match(TS);
				setState(174);
				match(T__0);
				setState(175);
				expression(0);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(176);
					match(T__4);
					setState(177);
					expression(0);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(185);
				match(TS);
				setState(186);
				match(NEW);
				setState(187);
				type();
				setState(188);
				match(T__5);
				setState(189);
				expression(0);
				setState(190);
				match(T__6);
				}
				break;
			}
			setState(194);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			type();
			setState(197);
			match(IDENTIFIER);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(198);
				match(TS);
				setState(199);
				expression(0);
				}
				break;
			case 2:
				{
				setState(200);
				match(TS);
				setState(201);
				match(T__0);
				setState(202);
				expression(0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(203);
					match(T__4);
					setState(204);
					expression(0);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(212);
				match(TS);
				setState(213);
				match(NEW);
				setState(214);
				type();
				setState(215);
				match(T__5);
				setState(216);
				expression(0);
				setState(217);
				match(T__6);
				}
				break;
			}
			setState(221);
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
		public TerminalNode IDENTIFIER() { return getToken(JavaRotParser.IDENTIFIER, 0); }
		public TerminalNode TS() { return getToken(JavaRotParser.TS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENTIFIER);
			setState(224);
			match(TS);
			setState(225);
			expression(0);
			setState(226);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(HUZZ);
			setState(229);
			match(T__2);
			setState(230);
			expression(0);
			setState(231);
			match(T__3);
			setState(232);
			block();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRUZZ) {
				{
				setState(233);
				match(BRUZZ);
				setState(234);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(EDGE);
			setState(238);
			match(T__2);
			setState(239);
			expression(0);
			setState(240);
			match(T__3);
			setState(241);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(GOON);
			setState(244);
			match(T__2);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(245);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(246);
				expressionStatement();
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(249);
				expressionStatement();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35474643166953480L) != 0)) {
				{
				setState(252);
				expression(0);
				}
			}

			setState(255);
			match(T__3);
			setState(256);
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(JS_GIMME_MY_MONEY);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35474643166953480L) != 0)) {
				{
				setState(259);
				expression(0);
				}
			}

			setState(262);
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
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expression(0);
			setState(265);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(268);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(269);
				match(IDENTIFIER);
				setState(270);
				match(T__2);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35474643166953480L) != 0)) {
					{
					setState(271);
					argumentList();
					}
				}

				setState(274);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(275);
				literal();
				}
				break;
			case 4:
				{
				setState(276);
				match(T__2);
				setState(277);
				expression(0);
				setState(278);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(280);
				match(NEW);
				setState(281);
				type();
				setState(282);
				match(T__5);
				setState(283);
				expression(0);
				setState(284);
				match(T__6);
				}
				break;
			case 6:
				{
				setState(286);
				match(TS_NT);
				setState(287);
				expression(4);
				}
				break;
			case 7:
				{
				setState(288);
				match(IDENTIFIER);
				setState(289);
				match(LONG_AHH);
				}
				break;
			case 8:
				{
				setState(290);
				match(IDENTIFIER);
				setState(291);
				match(SMALL_AHH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(295);
						operator();
						setState(296);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(299);
						match(T__5);
						setState(300);
						expression(0);
						setState(301);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060672L) != 0)) ) {
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
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 54974507646976L) != 0)) ) {
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35474644231928328L) != 0)) {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			expression(0);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(322);
				match(T__4);
				setState(323);
				expression(0);
				}
				}
				setState(328);
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
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(TS_GON_WRK);
			setState(330);
			block();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_PMO_GNG) {
				{
				{
				setState(331);
				match(TS_PMO_GNG);
				setState(332);
				match(T__2);
				setState(333);
				match(IDENTIFIER);
				setState(334);
				match(T__3);
				setState(335);
				block();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FNLY) {
				{
				setState(341);
				match(FNLY);
				setState(342);
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
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(SYBAU);
			setState(346);
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
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(GO_ON);
			setState(349);
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
	}

	public final StatementEndContext statementEnd() throws RecognitionException {
		StatementEndContext _localctx = new StatementEndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		case 17:
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
		"\u0004\u0001:\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		">\b\u0000\u000b\u0000\f\u0000?\u0003\u0000B\b\u0000\u0001\u0001\u0003"+
		"\u0001E\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002Y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0003\u0003_\b\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f"+
		"\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004v\b"+
		"\u0004\n\u0004\f\u0004y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005~\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0089"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0096\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b3\b\t\n\t\f\t\u00b6"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00c1\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00dc\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ec\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f8\b"+
		"\u000e\u0001\u000e\u0003\u000e\u00fb\b\u000e\u0001\u000e\u0003\u000e\u00fe"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0105\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0111\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0125\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0130\b\u0011\n\u0011\f\u0011\u0133\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u013b\b\u0014\n\u0014\f\u0014\u013e\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0145\b\u0015\n\u0015\f\u0015"+
		"\u0148\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0151\b\u0016\n\u0016\f\u0016\u0154"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0158\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0000\u0001\"\u001a\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"\u0000\u0005\u0001\u0000\f\r\u0002\u0000\u000e\u000e\u0010\u0010\u0001"+
		"\u000015\u0002\u0000\u001e(,-\u0001\u0000/0\u0187\u0000A\u0001\u0000\u0000"+
		"\u0000\u0002D\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000\u0000\u0006"+
		"^\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000"+
		"\u0000\u0010\u00a6\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000"+
		"\u0000\u0014\u00c4\u0001\u0000\u0000\u0000\u0016\u00df\u0001\u0000\u0000"+
		"\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000"+
		"\u0000\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u0102\u0001\u0000\u0000"+
		"\u0000 \u0108\u0001\u0000\u0000\u0000\"\u0124\u0001\u0000\u0000\u0000"+
		"$\u0134\u0001\u0000\u0000\u0000&\u0136\u0001\u0000\u0000\u0000(\u0138"+
		"\u0001\u0000\u0000\u0000*\u0141\u0001\u0000\u0000\u0000,\u0149\u0001\u0000"+
		"\u0000\u0000.\u0159\u0001\u0000\u0000\u00000\u015c\u0001\u0000\u0000\u0000"+
		"2\u015f\u0001\u0000\u0000\u000046\u0003\u0010\b\u000054\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008B\u0001\u0000\u0000\u00009>\u0003\u0002\u0001\u0000:>\u0003"+
		"\u0006\u0003\u0000;>\u0003\u0004\u0002\u0000<>\u0003\u0010\b\u0000=9\u0001"+
		"\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A5\u0001\u0000"+
		"\u0000\u0000A=\u0001\u0000\u0000\u0000B\u0001\u0001\u0000\u0000\u0000"+
		"CE\u0003\f\u0006\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0005\b\u0000\u0000GH\u00056\u0000\u0000"+
		"HM\u0005\u0001\u0000\u0000IL\u0003\u0006\u0003\u0000JL\u0003\u0010\b\u0000"+
		"KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000Q\u0003"+
		"\u0001\u0000\u0000\u0000RT\u0003\f\u0006\u0000SR\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u00056\u0000\u0000"+
		"VX\u0005\u0003\u0000\u0000WY\u0003\b\u0004\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u0004\u0000"+
		"\u0000[\\\u0003(\u0014\u0000\\\u0005\u0001\u0000\u0000\u0000]_\u0003\f"+
		"\u0006\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_c\u0001"+
		"\u0000\u0000\u0000`b\u0003\u000e\u0007\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003\n\u0005"+
		"\u0000gh\u00056\u0000\u0000hj\u0005\u0003\u0000\u0000ik\u0003\b\u0004"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0004\u0000\u0000mn\u0003(\u0014\u0000n\u0007\u0001"+
		"\u0000\u0000\u0000op\u0003\n\u0005\u0000pw\u00056\u0000\u0000qr\u0005"+
		"\u0005\u0000\u0000rs\u0003\n\u0005\u0000st\u00056\u0000\u0000tv\u0001"+
		"\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\t\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z}\u0005\u0018\u0000\u0000{|\u0005\u0006"+
		"\u0000\u0000|~\u0005\u0007\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0096\u0001\u0000\u0000\u0000\u007f\u0082\u0005\u0019"+
		"\u0000\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081\u0083\u0005\u0007"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0096\u0001\u0000\u0000\u0000\u0084\u0096\u0005\u001a"+
		"\u0000\u0000\u0085\u0088\u0005\u001b\u0000\u0000\u0086\u0087\u0005\u0006"+
		"\u0000\u0000\u0087\u0089\u0005\u0007\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0096\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0005\u001c\u0000\u0000\u008b\u008c\u0005\u0006"+
		"\u0000\u0000\u008c\u008e\u0005\u0007\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0096\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0005\u001d\u0000\u0000\u0090\u0091\u0005\u0006"+
		"\u0000\u0000\u0091\u0093\u0005\u0007\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u00056\u0000\u0000\u0095z\u0001\u0000\u0000\u0000"+
		"\u0095\u007f\u0001\u0000\u0000\u0000\u0095\u0084\u0001\u0000\u0000\u0000"+
		"\u0095\u0085\u0001\u0000\u0000\u0000\u0095\u008a\u0001\u0000\u0000\u0000"+
		"\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0000\u0000\u0000"+
		"\u0098\r\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a"+
		"\u000f\u0001\u0000\u0000\u0000\u009b\u00a7\u0003\u0012\t\u0000\u009c\u00a7"+
		"\u0003\u0014\n\u0000\u009d\u00a7\u0003\u0016\u000b\u0000\u009e\u00a7\u0003"+
		"\u0018\f\u0000\u009f\u00a7\u0003\u001a\r\u0000\u00a0\u00a7\u0003\u001c"+
		"\u000e\u0000\u00a1\u00a7\u0003\u001e\u000f\u0000\u00a2\u00a7\u0003 \u0010"+
		"\u0000\u00a3\u00a7\u0003.\u0017\u0000\u00a4\u00a7\u00030\u0018\u0000\u00a5"+
		"\u00a7\u0003,\u0016\u0000\u00a6\u009b\u0001\u0000\u0000\u0000\u00a6\u009c"+
		"\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u009e"+
		"\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000\u00a6\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u0011"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\f\u0006\u0000\u00a9\u00aa\u0003"+
		"\n\u0005\u0000\u00aa\u00c0\u00056\u0000\u0000\u00ab\u00ac\u0005.\u0000"+
		"\u0000\u00ac\u00c1\u0003\"\u0011\u0000\u00ad\u00ae\u0005.\u0000\u0000"+
		"\u00ae\u00af\u0005\u0001\u0000\u0000\u00af\u00b4\u0003\"\u0011\u0000\u00b0"+
		"\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b3\u0003\"\u0011\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0002\u0000\u0000\u00b8\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005.\u0000\u0000\u00ba\u00bb\u0005\u0017\u0000\u0000\u00bb\u00bc\u0003"+
		"\n\u0005\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\u00be\u0003\""+
		"\u0011\u0000\u00be\u00bf\u0005\u0007\u0000\u0000\u00bf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00ab\u0001\u0000\u0000\u0000\u00c0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u00032\u0019"+
		"\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\n\u0005\u0000"+
		"\u00c5\u00db\u00056\u0000\u0000\u00c6\u00c7\u0005.\u0000\u0000\u00c7\u00dc"+
		"\u0003\"\u0011\u0000\u00c8\u00c9\u0005.\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0001\u0000\u0000\u00ca\u00cf\u0003\"\u0011\u0000\u00cb\u00cc\u0005\u0005"+
		"\u0000\u0000\u00cc\u00ce\u0003\"\u0011\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0002\u0000"+
		"\u0000\u00d3\u00dc\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005.\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6\u00d7\u0003\n\u0005\u0000\u00d7"+
		"\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0003\"\u0011\u0000\u00d9\u00da"+
		"\u0005\u0007\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00c6"+
		"\u0001\u0000\u0000\u0000\u00db\u00c8\u0001\u0000\u0000\u0000\u00db\u00d4"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u00032\u0019\u0000\u00de\u0015\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u00056\u0000\u0000\u00e0\u00e1\u0005.\u0000"+
		"\u0000\u00e1\u00e2\u0003\"\u0011\u0000\u00e2\u00e3\u00032\u0019\u0000"+
		"\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0011\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6\u00e7\u0003\"\u0011\u0000\u00e7"+
		"\u00e8\u0005\u0004\u0000\u0000\u00e8\u00eb\u0003(\u0014\u0000\u00e9\u00ea"+
		"\u0005\u0012\u0000\u0000\u00ea\u00ec\u0003(\u0014\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0019\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005\u0013\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0003\u0000\u0000\u00ef\u00f0\u0003\"\u0011\u0000\u00f0\u00f1\u0005\u0004"+
		"\u0000\u0000\u00f1\u00f2\u0003(\u0014\u0000\u00f2\u001b\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0014\u0000\u0000\u00f4\u00f7\u0005\u0003\u0000"+
		"\u0000\u00f5\u00f8\u0003\u0014\n\u0000\u00f6\u00f8\u0003 \u0010\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0003 \u0010\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0003\"\u0011\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0004\u0000\u0000\u0100\u0101\u0003(\u0014\u0000\u0101\u001d\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0005\u000b\u0000\u0000\u0103\u0105\u0003"+
		"\"\u0011\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u00032\u0019"+
		"\u0000\u0107\u001f\u0001\u0000\u0000\u0000\u0108\u0109\u0003\"\u0011\u0000"+
		"\u0109\u010a\u00032\u0019\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0006\u0011\uffff\uffff\u0000\u010c\u0125\u00056\u0000\u0000\u010d\u010e"+
		"\u00056\u0000\u0000\u010e\u0110\u0005\u0003\u0000\u0000\u010f\u0111\u0003"+
		"*\u0015\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0125\u0005\u0004"+
		"\u0000\u0000\u0113\u0125\u0003$\u0012\u0000\u0114\u0115\u0005\u0003\u0000"+
		"\u0000\u0115\u0116\u0003\"\u0011\u0000\u0116\u0117\u0005\u0004\u0000\u0000"+
		"\u0117\u0125\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0017\u0000\u0000"+
		"\u0119\u011a\u0003\n\u0005\u0000\u011a\u011b\u0005\u0006\u0000\u0000\u011b"+
		"\u011c\u0003\"\u0011\u0000\u011c\u011d\u0005\u0007\u0000\u0000\u011d\u0125"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005+\u0000\u0000\u011f\u0125\u0003"+
		"\"\u0011\u0004\u0120\u0121\u00056\u0000\u0000\u0121\u0125\u0005)\u0000"+
		"\u0000\u0122\u0123\u00056\u0000\u0000\u0123\u0125\u0005*\u0000\u0000\u0124"+
		"\u010b\u0001\u0000\u0000\u0000\u0124\u010d\u0001\u0000\u0000\u0000\u0124"+
		"\u0113\u0001\u0000\u0000\u0000\u0124\u0114\u0001\u0000\u0000\u0000\u0124"+
		"\u0118\u0001\u0000\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124"+
		"\u0120\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125"+
		"\u0131\u0001\u0000\u0000\u0000\u0126\u0127\n\u0007\u0000\u0000\u0127\u0128"+
		"\u0003&\u0013\u0000\u0128\u0129\u0003\"\u0011\b\u0129\u0130\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\n\u0001\u0000\u0000\u012b\u012c\u0005\u0006\u0000"+
		"\u0000\u012c\u012d\u0003\"\u0011\u0000\u012d\u012e\u0005\u0007\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0126\u0001\u0000\u0000\u0000"+
		"\u012f\u012a\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132#\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0007\u0002\u0000\u0000\u0135%\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0007\u0003\u0000\u0000\u0137\'\u0001\u0000\u0000\u0000\u0138\u013c\u0005"+
		"\u0001\u0000\u0000\u0139\u013b\u0003\u0010\b\u0000\u013a\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0002"+
		"\u0000\u0000\u0140)\u0001\u0000\u0000\u0000\u0141\u0146\u0003\"\u0011"+
		"\u0000\u0142\u0143\u0005\u0005\u0000\u0000\u0143\u0145\u0003\"\u0011\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147+\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\t\u0000\u0000\u014a\u0152\u0003(\u0014\u0000\u014b\u014c"+
		"\u0005\n\u0000\u0000\u014c\u014d\u0005\u0003\u0000\u0000\u014d\u014e\u0005"+
		"6\u0000\u0000\u014e\u014f\u0005\u0004\u0000\u0000\u014f\u0151\u0003(\u0014"+
		"\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0157\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005\u000f\u0000\u0000\u0156\u0158\u0003(\u0014\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158-\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0015\u0000\u0000\u015a"+
		"\u015b\u00032\u0019\u0000\u015b/\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"\u0016\u0000\u0000\u015d\u015e\u00032\u0019\u0000\u015e1\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0007\u0004\u0000\u0000\u01603\u0001\u0000\u0000\u0000"+
		"%7=?ADKMSX^cjw}\u0082\u0088\u008d\u0092\u0095\u00a6\u00b4\u00c0\u00cf"+
		"\u00db\u00eb\u00f7\u00fa\u00fd\u0104\u0110\u0124\u012f\u0131\u013c\u0146"+
		"\u0152\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}