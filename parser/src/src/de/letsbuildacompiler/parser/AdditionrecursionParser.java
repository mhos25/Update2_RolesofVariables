// Generated from Additionrecursion.g4 by ANTLR 4.7.1
package src.de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdditionrecursionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUM=25, NEWLINE=26, IDENTIFIER=27, WHITESPACE=28, STRING=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_varDeclaration = 3, 
		RULE_assignment = 4, RULE_println = 5, RULE_print = 6, RULE_branch = 7, 
		RULE_do_while = 8, RULE_while_statement = 9, RULE_block = 10, RULE_userInput = 11;
	public static final String[] ruleNames = {
		"program", "statement", "expression", "varDeclaration", "assignment", 
		"println", "print", "branch", "do_while", "while_statement", "block", 
		"userInput"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", 
		"'&&'", "'||'", "'int'", "'='", "'println('", "')'", "'print('", "'if'", 
		"'('", "'else'", "'do'", "'while'", "'{'", "'}'", "'UserInputReader.readInt()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUM", "NEWLINE", "IDENTIFIER", "WHITESPACE", "STRING"
	};
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
	public String getGrammarFileName() { return "Additionrecursion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdditionrecursionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << IDENTIFIER))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				println();
				setState(30);
				match(T__0);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				print();
				setState(33);
				match(T__0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				varDeclaration();
				setState(36);
				match(T__0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				assignment();
				setState(39);
				match(T__0);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				branch();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				do_while();
				setState(43);
				match(T__0);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				while_statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUM() { return getToken(AdditionrecursionParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMinus(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(49);
				((NumberContext)_localctx).number = match(NUM);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(55);
						match(T__1);
						setState(56);
						((DivContext)_localctx).rght = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(58);
						match(T__2);
						setState(59);
						((MultContext)_localctx).rght = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(61);
						match(T__3);
						setState(62);
						((MinusContext)_localctx).rght = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(64);
						match(T__4);
						setState(65);
						((PlusContext)_localctx).rght = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(67);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						((RelationalContext)_localctx).rght = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(70);
						match(T__9);
						setState(71);
						((AndContext)_localctx).rght = expression(6);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(73);
						match(T__10);
						setState(74);
						((OrContext)_localctx).rght = expression(5);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationAndAssignmentContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationAndAssignmentContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__11);
				setState(81);
				((VarDeclarationAndAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(82);
				match(T__12);
				setState(83);
				((VarDeclarationAndAssignmentContext)_localctx).exp = expression(0);
				}
				break;
			case 2:
				_localctx = new SimpleVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__11);
				setState(85);
				((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputVarContext extends AssignmentContext {
		public Token varName;
		public UserInputContext input;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public InputVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectVarAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DirectVarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDirectVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DirectVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((DirectVarAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(89);
				match(T__12);
				setState(90);
				((DirectVarAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new InputVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((InputVarContext)_localctx).varName = match(IDENTIFIER);
				setState(92);
				match(T__12);
				setState(93);
				((InputVarContext)_localctx).input = userInput();
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

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementAndVariableContext extends PrintlnContext {
		public Token txt;
		public Token varName;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public PrintStatementAndVariableContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrintStatementAndVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePrintStatementContext extends PrintlnContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplePrintStatementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimplePrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_println);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PrintStatementAndVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__13);
				setState(97);
				((PrintStatementAndVariableContext)_localctx).txt = match(STRING);
				setState(98);
				match(T__4);
				setState(99);
				((PrintStatementAndVariableContext)_localctx).varName = match(IDENTIFIER);
				setState(100);
				match(T__14);
				}
				break;
			case 2:
				_localctx = new SimplePrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__13);
				setState(102);
				((SimplePrintStatementContext)_localctx).argument = expression(0);
				setState(103);
				match(T__14);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__15);
			setState(108);
			((PrintContext)_localctx).argument = expression(0);
			setState(109);
			match(T__14);
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

	public static class BranchContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__16);
			setState(112);
			match(T__17);
			setState(113);
			((BranchContext)_localctx).condition = expression(0);
			setState(114);
			match(T__14);
			setState(115);
			((BranchContext)_localctx).onTrue = block();
			setState(116);
			match(T__18);
			setState(117);
			((BranchContext)_localctx).onFalse = block();
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

	public static class Do_whileContext extends ParserRuleContext {
		public BlockContext loop;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__19);
			setState(120);
			((Do_whileContext)_localctx).loop = block();
			setState(121);
			match(T__20);
			setState(122);
			match(T__17);
			setState(123);
			((Do_whileContext)_localctx).condition = expression(0);
			setState(124);
			match(T__14);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext loopCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__20);
			setState(127);
			match(T__17);
			setState(128);
			((While_statementContext)_localctx).condition = expression(0);
			setState(129);
			match(T__14);
			setState(130);
			((While_statementContext)_localctx).loopCondition = block();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__21);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(133);
				statement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__22);
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

	public static class UserInputContext extends ParserRuleContext {
		public UserInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputContext userInput() throws RecognitionException {
		UserInputContext _localctx = new UserInputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_userInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__23);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\f\3\f\3\r\3\r\3\r\2\3\6\16\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\2\3\3\2\b\13\2\u0099\2\33\3\2\2\2\4\60\3\2\2"+
		"\2\6\66\3\2\2\2\bX\3\2\2\2\n`\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20q\3\2\2"+
		"\2\22y\3\2\2\2\24\u0080\3\2\2\2\26\u0086\3\2\2\2\30\u008f\3\2\2\2\32\34"+
		"\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3"+
		"\3\2\2\2\37 \5\f\7\2 !\7\3\2\2!\61\3\2\2\2\"#\5\16\b\2#$\7\3\2\2$\61\3"+
		"\2\2\2%&\5\b\5\2&\'\7\3\2\2\'\61\3\2\2\2()\5\n\6\2)*\7\3\2\2*\61\3\2\2"+
		"\2+\61\5\20\t\2,-\5\22\n\2-.\7\3\2\2.\61\3\2\2\2/\61\5\24\13\2\60\37\3"+
		"\2\2\2\60\"\3\2\2\2\60%\3\2\2\2\60(\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60"+
		"/\3\2\2\2\61\5\3\2\2\2\62\63\b\4\1\2\63\67\7\33\2\2\64\67\7\37\2\2\65"+
		"\67\7\35\2\2\66\62\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67O\3\2\2\289\f"+
		"\f\2\29:\7\4\2\2:N\5\6\4\r;<\f\13\2\2<=\7\5\2\2=N\5\6\4\f>?\f\n\2\2?@"+
		"\7\6\2\2@N\5\6\4\13AB\f\t\2\2BC\7\7\2\2CN\5\6\4\nDE\f\b\2\2EF\t\2\2\2"+
		"FN\5\6\4\tGH\f\7\2\2HI\7\f\2\2IN\5\6\4\bJK\f\6\2\2KL\7\r\2\2LN\5\6\4\7"+
		"M8\3\2\2\2M;\3\2\2\2M>\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2"+
		"NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2\2RS\7\16\2\2ST\7\35"+
		"\2\2TU\7\17\2\2UY\5\6\4\2VW\7\16\2\2WY\7\35\2\2XR\3\2\2\2XV\3\2\2\2Y\t"+
		"\3\2\2\2Z[\7\35\2\2[\\\7\17\2\2\\a\5\6\4\2]^\7\35\2\2^_\7\17\2\2_a\5\30"+
		"\r\2`Z\3\2\2\2`]\3\2\2\2a\13\3\2\2\2bc\7\20\2\2cd\7\37\2\2de\7\7\2\2e"+
		"f\7\35\2\2fl\7\21\2\2gh\7\20\2\2hi\5\6\4\2ij\7\21\2\2jl\3\2\2\2kb\3\2"+
		"\2\2kg\3\2\2\2l\r\3\2\2\2mn\7\22\2\2no\5\6\4\2op\7\21\2\2p\17\3\2\2\2"+
		"qr\7\23\2\2rs\7\24\2\2st\5\6\4\2tu\7\21\2\2uv\5\26\f\2vw\7\25\2\2wx\5"+
		"\26\f\2x\21\3\2\2\2yz\7\26\2\2z{\5\26\f\2{|\7\27\2\2|}\7\24\2\2}~\5\6"+
		"\4\2~\177\7\21\2\2\177\23\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0082\7\24"+
		"\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\21\2\2\u0084\u0085\5\26\f\2\u0085"+
		"\25\3\2\2\2\u0086\u008a\7\30\2\2\u0087\u0089\5\4\3\2\u0088\u0087\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\31\2\2\u008e\27\3\2\2\2\u008f"+
		"\u0090\7\32\2\2\u0090\31\3\2\2\2\13\35\60\66MOX`k\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}