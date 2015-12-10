// $ANTLR 3.5 ./org.coursera.aiplanning.pddl.g 2013-02-13 02:04:48
package org.coursera.aiplanning.pddl.antlr;

import java.util.BitSet;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;


/**
 * PDDL grammar for ANTLR v3
 * Zeyn Saigol
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: Pddl.g 120 2008-10-02 14:59:50Z zas $
 */
@SuppressWarnings("all")
public class pddlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND_EFFECT", "AND_GD", 
		"ANY_CHAR", "ASSIGN_EFFECT", "BINARY_OP", "COMPARISON_GD", "CONSTANTS", 
		"DIGIT", "DOMAIN", "DOMAIN_NAME", "DURATIVE_ACTION", "EFFECT", "EITHER_TYPE", 
		"EXISTS_GD", "FORALL_EFFECT", "FORALL_GD", "FUNCTIONS", "FUNC_HEAD", "GOAL", 
		"IMPLY_GD", "INIT", "INIT_AT", "INIT_EQ", "LETTER", "LINE_COMMENT", "NAME", 
		"NOT_EFFECT", "NOT_GD", "NOT_PRED_INIT", "NUMBER", "OBJECTS", "OR_GD", 
		"PRECONDITION", "PREDICATES", "PRED_HEAD", "PRED_INST", "PROBLEM", "PROBLEM_CONSTRAINT", 
		"PROBLEM_DOMAIN", "PROBLEM_METRIC", "PROBLEM_NAME", "REQUIREMENTS", "REQUIRE_KEY", 
		"TYPES", "UNARY_MINUS", "VARIABLE", "WHEN_EFFECT", "WHITESPACE", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "':action'", "':condition'", "':constants'", 
		"':constraints'", "':derived'", "':domain'", "':duration'", "':durative-action'", 
		"':effect'", "':functions'", "':goal'", "':init'", "':metric'", "':objects'", 
		"':parameters'", "':precondition'", "':predicates'", "':requirements'", 
		"':types'", "'<'", "'<='", "'='", "'>'", "'>='", "'?duration'", "'all'", 
		"'always'", "'always-within'", "'and'", "'assign'", "'at'", "'at-most-once'", 
		"'decrease'", "'define'", "'domain'", "'either'", "'end'", "'exists'", 
		"'forall'", "'hold-after'", "'hold-during'", "'imply'", "'increase'", 
		"'is-violated'", "'maximize'", "'minimize'", "'not'", "'number'", "'or'", 
		"'over'", "'preference'", "'problem'", "'scale-down'", "'scale-up'", "'sometime'", 
		"'sometime-after'", "'sometime-before'", "'start'", "'total-time'", "'when'", 
		"'within'"
	};
	public static final int EOF=-1;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int ACTION=4;
	public static final int AND_EFFECT=5;
	public static final int AND_GD=6;
	public static final int ANY_CHAR=7;
	public static final int ASSIGN_EFFECT=8;
	public static final int BINARY_OP=9;
	public static final int COMPARISON_GD=10;
	public static final int CONSTANTS=11;
	public static final int DIGIT=12;
	public static final int DOMAIN=13;
	public static final int DOMAIN_NAME=14;
	public static final int DURATIVE_ACTION=15;
	public static final int EFFECT=16;
	public static final int EITHER_TYPE=17;
	public static final int EXISTS_GD=18;
	public static final int FORALL_EFFECT=19;
	public static final int FORALL_GD=20;
	public static final int FUNCTIONS=21;
	public static final int FUNC_HEAD=22;
	public static final int GOAL=23;
	public static final int IMPLY_GD=24;
	public static final int INIT=25;
	public static final int INIT_AT=26;
	public static final int INIT_EQ=27;
	public static final int LETTER=28;
	public static final int LINE_COMMENT=29;
	public static final int NAME=30;
	public static final int NOT_EFFECT=31;
	public static final int NOT_GD=32;
	public static final int NOT_PRED_INIT=33;
	public static final int NUMBER=34;
	public static final int OBJECTS=35;
	public static final int OR_GD=36;
	public static final int PRECONDITION=37;
	public static final int PREDICATES=38;
	public static final int PRED_HEAD=39;
	public static final int PRED_INST=40;
	public static final int PROBLEM=41;
	public static final int PROBLEM_CONSTRAINT=42;
	public static final int PROBLEM_DOMAIN=43;
	public static final int PROBLEM_METRIC=44;
	public static final int PROBLEM_NAME=45;
	public static final int REQUIREMENTS=46;
	public static final int REQUIRE_KEY=47;
	public static final int TYPES=48;
	public static final int UNARY_MINUS=49;
	public static final int VARIABLE=50;
	public static final int WHEN_EFFECT=51;
	public static final int WHITESPACE=52;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public pddlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public pddlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return pddlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./org.coursera.aiplanning.pddl.g"; }


	private boolean wasError = false;
	public void reportError(RecognitionException e) {
		wasError = true;
		super.reportError(e);
	}
	public boolean invalidGrammar() {
		return wasError;
	}


	public static class pddlDoc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pddlDoc"
	// ./org.coursera.aiplanning.pddl.g:87:1: pddlDoc : ( domain | problem );
	public final pddlParser.pddlDoc_return pddlDoc() throws RecognitionException {
		pddlParser.pddlDoc_return retval = new pddlParser.pddlDoc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope domain1 =null;
		ParserRuleReturnScope problem2 =null;


		try {
			// ./org.coursera.aiplanning.pddl.g:87:9: ( domain | problem )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==53) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==92) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==53) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==93) ) {
							alt1=1;
						}
						else if ( (LA1_3==110) ) {
							alt1=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:87:11: domain
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_domain_in_pddlDoc305);
					domain1=domain();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, domain1.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:87:20: problem
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_problem_in_pddlDoc309);
					problem2=problem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, problem2.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pddlDoc"


	public static class domain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domain"
	// ./org.coursera.aiplanning.pddl.g:91:1: domain : '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) ;
	public final pddlParser.domain_return domain() throws RecognitionException {
		pddlParser.domain_return retval = new pddlParser.domain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		Token string_literal4=null;
		Token char_literal13=null;
		ParserRuleReturnScope domainName5 =null;
		ParserRuleReturnScope requireDef6 =null;
		ParserRuleReturnScope typesDef7 =null;
		ParserRuleReturnScope constantsDef8 =null;
		ParserRuleReturnScope predicatesDef9 =null;
		ParserRuleReturnScope functionsDef10 =null;
		ParserRuleReturnScope constraints11 =null;
		ParserRuleReturnScope structureDef12 =null;

		Object char_literal3_tree=null;
		Object string_literal4_tree=null;
		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_constantsDef=new RewriteRuleSubtreeStream(adaptor,"rule constantsDef");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_predicatesDef=new RewriteRuleSubtreeStream(adaptor,"rule predicatesDef");
		RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
		RewriteRuleSubtreeStream stream_structureDef=new RewriteRuleSubtreeStream(adaptor,"rule structureDef");
		RewriteRuleSubtreeStream stream_domainName=new RewriteRuleSubtreeStream(adaptor,"rule domainName");
		RewriteRuleSubtreeStream stream_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule functionsDef");
		RewriteRuleSubtreeStream stream_typesDef=new RewriteRuleSubtreeStream(adaptor,"rule typesDef");

		try {
			// ./org.coursera.aiplanning.pddl.g:92:5: ( '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) )
			// ./org.coursera.aiplanning.pddl.g:92:7: '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')'
			{
			char_literal3=(Token)match(input,53,FOLLOW_53_in_domain324); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal3);

			string_literal4=(Token)match(input,92,FOLLOW_92_in_domain326); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(string_literal4);

			pushFollow(FOLLOW_domainName_in_domain328);
			domainName5=domainName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_domainName.add(domainName5.getTree());
			// ./org.coursera.aiplanning.pddl.g:93:7: ( requireDef )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==53) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==76) ) {
					alt2=1;
				}
			}
			switch (alt2) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:93:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_domain336);
					requireDef6=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef6.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:94:7: ( typesDef )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==53) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==77) ) {
					alt3=1;
				}
			}
			switch (alt3) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:94:7: typesDef
					{
					pushFollow(FOLLOW_typesDef_in_domain345);
					typesDef7=typesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typesDef.add(typesDef7.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:95:7: ( constantsDef )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==53) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==61) ) {
					alt4=1;
				}
			}
			switch (alt4) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:95:7: constantsDef
					{
					pushFollow(FOLLOW_constantsDef_in_domain354);
					constantsDef8=constantsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constantsDef.add(constantsDef8.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:96:7: ( predicatesDef )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==53) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==75) ) {
					alt5=1;
				}
			}
			switch (alt5) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:96:7: predicatesDef
					{
					pushFollow(FOLLOW_predicatesDef_in_domain363);
					predicatesDef9=predicatesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicatesDef.add(predicatesDef9.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:97:7: ( functionsDef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==53) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==68) ) {
					alt6=1;
				}
			}
			switch (alt6) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:97:7: functionsDef
					{
					pushFollow(FOLLOW_functionsDef_in_domain372);
					functionsDef10=functionsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionsDef.add(functionsDef10.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:98:7: ( constraints )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==53) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==62) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:98:7: constraints
					{
					pushFollow(FOLLOW_constraints_in_domain381);
					constraints11=constraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constraints.add(constraints11.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:99:7: ( structureDef )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==53) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:99:7: structureDef
					{
					pushFollow(FOLLOW_structureDef_in_domain390);
					structureDef12=structureDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_structureDef.add(structureDef12.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			char_literal13=(Token)match(input,54,FOLLOW_54_in_domain399); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal13);

			// AST REWRITE
			// elements: structureDef, constantsDef, typesDef, requireDef, constraints, functionsDef, domainName, predicatesDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:7: -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
			{
				// ./org.coursera.aiplanning.pddl.g:101:10: ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN, "DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_domainName.nextTree());
				// ./org.coursera.aiplanning.pddl.g:101:30: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// ./org.coursera.aiplanning.pddl.g:101:42: ( typesDef )?
				if ( stream_typesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_typesDef.nextTree());
				}
				stream_typesDef.reset();

				// ./org.coursera.aiplanning.pddl.g:102:17: ( constantsDef )?
				if ( stream_constantsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_constantsDef.nextTree());
				}
				stream_constantsDef.reset();

				// ./org.coursera.aiplanning.pddl.g:102:31: ( predicatesDef )?
				if ( stream_predicatesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_predicatesDef.nextTree());
				}
				stream_predicatesDef.reset();

				// ./org.coursera.aiplanning.pddl.g:102:46: ( functionsDef )?
				if ( stream_functionsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_functionsDef.nextTree());
				}
				stream_functionsDef.reset();

				// ./org.coursera.aiplanning.pddl.g:103:17: ( constraints )?
				if ( stream_constraints.hasNext() ) {
					adaptor.addChild(root_1, stream_constraints.nextTree());
				}
				stream_constraints.reset();

				// ./org.coursera.aiplanning.pddl.g:103:30: ( structureDef )*
				while ( stream_structureDef.hasNext() ) {
					adaptor.addChild(root_1, stream_structureDef.nextTree());
				}
				stream_structureDef.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domain"


	public static class domainName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domainName"
	// ./org.coursera.aiplanning.pddl.g:106:1: domainName : '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) ;
	public final pddlParser.domainName_return domainName() throws RecognitionException {
		pddlParser.domainName_return retval = new pddlParser.domainName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal14=null;
		Token string_literal15=null;
		Token NAME16=null;
		Token char_literal17=null;

		Object char_literal14_tree=null;
		Object string_literal15_tree=null;
		Object NAME16_tree=null;
		Object char_literal17_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// ./org.coursera.aiplanning.pddl.g:107:5: ( '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) )
			// ./org.coursera.aiplanning.pddl.g:107:7: '(' 'domain' NAME ')'
			{
			char_literal14=(Token)match(input,53,FOLLOW_53_in_domainName483); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal14);

			string_literal15=(Token)match(input,93,FOLLOW_93_in_domainName485); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_93.add(string_literal15);

			NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_domainName487); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME16);

			char_literal17=(Token)match(input,54,FOLLOW_54_in_domainName489); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal17);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:6: -> ^( DOMAIN_NAME NAME )
			{
				// ./org.coursera.aiplanning.pddl.g:108:9: ^( DOMAIN_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN_NAME, "DOMAIN_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domainName"


	public static class requireDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "requireDef"
	// ./org.coursera.aiplanning.pddl.g:111:1: requireDef : '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) ;
	public final pddlParser.requireDef_return requireDef() throws RecognitionException {
		pddlParser.requireDef_return retval = new pddlParser.requireDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal18=null;
		Token string_literal19=null;
		Token REQUIRE_KEY20=null;
		Token char_literal21=null;

		Object char_literal18_tree=null;
		Object string_literal19_tree=null;
		Object REQUIRE_KEY20_tree=null;
		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_REQUIRE_KEY=new RewriteRuleTokenStream(adaptor,"token REQUIRE_KEY");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

		try {
			// ./org.coursera.aiplanning.pddl.g:112:2: ( '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) )
			// ./org.coursera.aiplanning.pddl.g:112:4: '(' ':requirements' ( REQUIRE_KEY )+ ')'
			{
			char_literal18=(Token)match(input,53,FOLLOW_53_in_requireDef516); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal18);

			string_literal19=(Token)match(input,76,FOLLOW_76_in_requireDef518); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_76.add(string_literal19);

			// ./org.coursera.aiplanning.pddl.g:112:24: ( REQUIRE_KEY )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==REQUIRE_KEY) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:112:24: REQUIRE_KEY
					{
					REQUIRE_KEY20=(Token)match(input,REQUIRE_KEY,FOLLOW_REQUIRE_KEY_in_requireDef520); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REQUIRE_KEY.add(REQUIRE_KEY20);

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			char_literal21=(Token)match(input,54,FOLLOW_54_in_requireDef523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal21);

			// AST REWRITE
			// elements: REQUIRE_KEY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 113:2: -> ^( REQUIREMENTS ( REQUIRE_KEY )+ )
			{
				// ./org.coursera.aiplanning.pddl.g:113:5: ^( REQUIREMENTS ( REQUIRE_KEY )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREMENTS, "REQUIREMENTS"), root_1);
				if ( !(stream_REQUIRE_KEY.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_REQUIRE_KEY.hasNext() ) {
					adaptor.addChild(root_1, stream_REQUIRE_KEY.nextNode());
				}
				stream_REQUIRE_KEY.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requireDef"


	public static class typesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typesDef"
	// ./org.coursera.aiplanning.pddl.g:116:1: typesDef : '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) ;
	public final pddlParser.typesDef_return typesDef() throws RecognitionException {
		pddlParser.typesDef_return retval = new pddlParser.typesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal22=null;
		Token string_literal23=null;
		Token char_literal25=null;
		ParserRuleReturnScope typedNameList24 =null;

		Object char_literal22_tree=null;
		Object string_literal23_tree=null;
		Object char_literal25_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// ./org.coursera.aiplanning.pddl.g:117:2: ( '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) )
			// ./org.coursera.aiplanning.pddl.g:117:4: '(' ':types' typedNameList ')'
			{
			char_literal22=(Token)match(input,53,FOLLOW_53_in_typesDef544); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal22);

			string_literal23=(Token)match(input,77,FOLLOW_77_in_typesDef546); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(string_literal23);

			pushFollow(FOLLOW_typedNameList_in_typesDef548);
			typedNameList24=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList24.getTree());
			char_literal25=(Token)match(input,54,FOLLOW_54_in_typesDef550); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal25);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:4: -> ^( TYPES typedNameList )
			{
				// ./org.coursera.aiplanning.pddl.g:118:7: ^( TYPES typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typesDef"


	public static class typedNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedNameList"
	// ./org.coursera.aiplanning.pddl.g:122:1: typedNameList : ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) ;
	public final pddlParser.typedNameList_return typedNameList() throws RecognitionException {
		pddlParser.typedNameList_return retval = new pddlParser.typedNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME26=null;
		Token NAME28=null;
		ParserRuleReturnScope singleTypeNameList27 =null;

		Object NAME26_tree=null;
		Object NAME28_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:123:5: ( ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) )
			// ./org.coursera.aiplanning.pddl.g:123:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			{
			root_0 = (Object)adaptor.nil();


			// ./org.coursera.aiplanning.pddl.g:123:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			int alt13=2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:123:8: ( NAME )*
					{
					// ./org.coursera.aiplanning.pddl.g:123:8: ( NAME )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==NAME) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:123:8: NAME
							{
							NAME26=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList577); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME26_tree = (Object)adaptor.create(NAME26);
							adaptor.addChild(root_0, NAME26_tree);
							}

							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:123:16: ( singleTypeNameList )+ ( NAME )*
					{
					// ./org.coursera.aiplanning.pddl.g:123:16: ( singleTypeNameList )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						alt11 = dfa11.predict(input);
						switch (alt11) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:123:16: singleTypeNameList
							{
							pushFollow(FOLLOW_singleTypeNameList_in_typedNameList582);
							singleTypeNameList27=singleTypeNameList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeNameList27.getTree());

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// ./org.coursera.aiplanning.pddl.g:123:36: ( NAME )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==NAME) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:123:36: NAME
							{
							NAME28=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList585); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME28_tree = (Object)adaptor.create(NAME28);
							adaptor.addChild(root_0, NAME28_tree);
							}

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedNameList"


	public static class singleTypeNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeNameList"
	// ./org.coursera.aiplanning.pddl.g:126:1: singleTypeNameList : ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ ;
	public final pddlParser.singleTypeNameList_return singleTypeNameList() throws RecognitionException {
		pddlParser.singleTypeNameList_return retval = new pddlParser.singleTypeNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME29=null;
		Token char_literal30=null;
		ParserRuleReturnScope t =null;

		Object NAME29_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// ./org.coursera.aiplanning.pddl.g:127:5: ( ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ )
			// ./org.coursera.aiplanning.pddl.g:127:7: ( ( NAME )+ '-' t= type )
			{
			// ./org.coursera.aiplanning.pddl.g:127:7: ( ( NAME )+ '-' t= type )
			// ./org.coursera.aiplanning.pddl.g:127:8: ( NAME )+ '-' t= type
			{
			// ./org.coursera.aiplanning.pddl.g:127:8: ( NAME )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==NAME) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:127:8: NAME
					{
					NAME29=(Token)match(input,NAME,FOLLOW_NAME_in_singleTypeNameList605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME29);

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			char_literal30=(Token)match(input,57,FOLLOW_57_in_singleTypeNameList608); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal30);

			pushFollow(FOLLOW_type_in_singleTypeNameList612);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, NAME
			// token labels: 
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:4: -> ( ^( NAME $t) )+
			{
				if ( !(stream_t.hasNext()||stream_NAME.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_NAME.hasNext() ) {
					// ./org.coursera.aiplanning.pddl.g:128:7: ^( NAME $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_NAME.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_NAME.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeNameList"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// ./org.coursera.aiplanning.pddl.g:131:1: type : ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType );
	public final pddlParser.type_return type() throws RecognitionException {
		pddlParser.type_return retval = new pddlParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		Token string_literal32=null;
		Token char_literal34=null;
		ParserRuleReturnScope primType33 =null;
		ParserRuleReturnScope primType35 =null;

		Object char_literal31_tree=null;
		Object string_literal32_tree=null;
		Object char_literal34_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_primType=new RewriteRuleSubtreeStream(adaptor,"rule primType");

		try {
			// ./org.coursera.aiplanning.pddl.g:132:2: ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==53) ) {
				alt16=1;
			}
			else if ( (LA16_0==NAME) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:132:4: ( '(' 'either' ( primType )+ ')' )
					{
					// ./org.coursera.aiplanning.pddl.g:132:4: ( '(' 'either' ( primType )+ ')' )
					// ./org.coursera.aiplanning.pddl.g:132:6: '(' 'either' ( primType )+ ')'
					{
					char_literal31=(Token)match(input,53,FOLLOW_53_in_type639); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal31);

					string_literal32=(Token)match(input,94,FOLLOW_94_in_type641); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_94.add(string_literal32);

					// ./org.coursera.aiplanning.pddl.g:132:19: ( primType )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==NAME) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:132:19: primType
							{
							pushFollow(FOLLOW_primType_in_type643);
							primType33=primType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primType.add(primType33.getTree());
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					char_literal34=(Token)match(input,54,FOLLOW_54_in_type646); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal34);

					}

					// AST REWRITE
					// elements: primType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:4: -> ^( EITHER_TYPE ( primType )+ )
					{
						// ./org.coursera.aiplanning.pddl.g:133:7: ^( EITHER_TYPE ( primType )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EITHER_TYPE, "EITHER_TYPE"), root_1);
						if ( !(stream_primType.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_primType.hasNext() ) {
							adaptor.addChild(root_1, stream_primType.nextTree());
						}
						stream_primType.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:134:4: primType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primType_in_type665);
					primType35=primType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primType35.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class primType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primType"
	// ./org.coursera.aiplanning.pddl.g:137:1: primType : NAME ;
	public final pddlParser.primType_return primType() throws RecognitionException {
		pddlParser.primType_return retval = new pddlParser.primType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME36=null;

		Object NAME36_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:137:10: ( NAME )
			// ./org.coursera.aiplanning.pddl.g:137:12: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME36=(Token)match(input,NAME,FOLLOW_NAME_in_primType675); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME36_tree = (Object)adaptor.create(NAME36);
			adaptor.addChild(root_0, NAME36_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primType"


	public static class functionsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionsDef"
	// ./org.coursera.aiplanning.pddl.g:139:1: functionsDef : '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) ;
	public final pddlParser.functionsDef_return functionsDef() throws RecognitionException {
		pddlParser.functionsDef_return retval = new pddlParser.functionsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal37=null;
		Token string_literal38=null;
		Token char_literal40=null;
		ParserRuleReturnScope functionList39 =null;

		Object char_literal37_tree=null;
		Object string_literal38_tree=null;
		Object char_literal40_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");

		try {
			// ./org.coursera.aiplanning.pddl.g:140:2: ( '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) )
			// ./org.coursera.aiplanning.pddl.g:140:4: '(' ':functions' functionList ')'
			{
			char_literal37=(Token)match(input,53,FOLLOW_53_in_functionsDef685); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal37);

			string_literal38=(Token)match(input,68,FOLLOW_68_in_functionsDef687); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(string_literal38);

			pushFollow(FOLLOW_functionList_in_functionsDef689);
			functionList39=functionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionList.add(functionList39.getTree());
			char_literal40=(Token)match(input,54,FOLLOW_54_in_functionsDef691); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal40);

			// AST REWRITE
			// elements: functionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 141:2: -> ^( FUNCTIONS functionList )
			{
				// ./org.coursera.aiplanning.pddl.g:141:5: ^( FUNCTIONS functionList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				adaptor.addChild(root_1, stream_functionList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionsDef"


	public static class functionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionList"
	// ./org.coursera.aiplanning.pddl.g:144:1: functionList : ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* ;
	public final pddlParser.functionList_return functionList() throws RecognitionException {
		pddlParser.functionList_return retval = new pddlParser.functionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal42=null;
		ParserRuleReturnScope atomicFunctionSkeleton41 =null;
		ParserRuleReturnScope functionType43 =null;

		Object char_literal42_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:145:2: ( ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* )
			// ./org.coursera.aiplanning.pddl.g:145:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
			{
			root_0 = (Object)adaptor.nil();


			// ./org.coursera.aiplanning.pddl.g:145:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==53) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:145:5: ( atomicFunctionSkeleton )+ ( '-' functionType )?
					{
					// ./org.coursera.aiplanning.pddl.g:145:5: ( atomicFunctionSkeleton )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==53) ) {
							int LA17_2 = input.LA(2);
							if ( (synpred17_pddl()) ) {
								alt17=1;
							}

						}

						switch (alt17) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:145:5: atomicFunctionSkeleton
							{
							pushFollow(FOLLOW_atomicFunctionSkeleton_in_functionList712);
							atomicFunctionSkeleton41=atomicFunctionSkeleton();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicFunctionSkeleton41.getTree());

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					// ./org.coursera.aiplanning.pddl.g:145:29: ( '-' functionType )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==57) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:145:30: '-' functionType
							{
							char_literal42=(Token)match(input,57,FOLLOW_57_in_functionList716); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal42_tree = (Object)adaptor.create(char_literal42);
							adaptor.addChild(root_0, char_literal42_tree);
							}

							pushFollow(FOLLOW_functionType_in_functionList718);
							functionType43=functionType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, functionType43.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop19;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionList"


	public static class atomicFunctionSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFunctionSkeleton"
	// ./org.coursera.aiplanning.pddl.g:148:1: atomicFunctionSkeleton : '(' ! functionSymbol ^ typedVariableList ')' !;
	public final pddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton() throws RecognitionException {
		pddlParser.atomicFunctionSkeleton_return retval = new pddlParser.atomicFunctionSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal44=null;
		Token char_literal47=null;
		ParserRuleReturnScope functionSymbol45 =null;
		ParserRuleReturnScope typedVariableList46 =null;

		Object char_literal44_tree=null;
		Object char_literal47_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:149:2: ( '(' ! functionSymbol ^ typedVariableList ')' !)
			// ./org.coursera.aiplanning.pddl.g:149:4: '(' ! functionSymbol ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal44=(Token)match(input,53,FOLLOW_53_in_atomicFunctionSkeleton734); if (state.failed) return retval;
			pushFollow(FOLLOW_functionSymbol_in_atomicFunctionSkeleton737);
			functionSymbol45=functionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(functionSymbol45.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFunctionSkeleton740);
			typedVariableList46=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList46.getTree());

			char_literal47=(Token)match(input,54,FOLLOW_54_in_atomicFunctionSkeleton742); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFunctionSkeleton"


	public static class functionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionSymbol"
	// ./org.coursera.aiplanning.pddl.g:152:1: functionSymbol : NAME ;
	public final pddlParser.functionSymbol_return functionSymbol() throws RecognitionException {
		pddlParser.functionSymbol_return retval = new pddlParser.functionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME48=null;

		Object NAME48_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:152:16: ( NAME )
			// ./org.coursera.aiplanning.pddl.g:152:18: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME48=(Token)match(input,NAME,FOLLOW_NAME_in_functionSymbol753); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME48_tree = (Object)adaptor.create(NAME48);
			adaptor.addChild(root_0, NAME48_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionSymbol"


	public static class functionType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionType"
	// ./org.coursera.aiplanning.pddl.g:154:1: functionType : 'number' ;
	public final pddlParser.functionType_return functionType() throws RecognitionException {
		pddlParser.functionType_return retval = new pddlParser.functionType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal49=null;

		Object string_literal49_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:154:14: ( 'number' )
			// ./org.coursera.aiplanning.pddl.g:154:16: 'number'
			{
			root_0 = (Object)adaptor.nil();


			string_literal49=(Token)match(input,106,FOLLOW_106_in_functionType762); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal49_tree = (Object)adaptor.create(string_literal49);
			adaptor.addChild(root_0, string_literal49_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionType"


	public static class constantsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantsDef"
	// ./org.coursera.aiplanning.pddl.g:156:1: constantsDef : '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) ;
	public final pddlParser.constantsDef_return constantsDef() throws RecognitionException {
		pddlParser.constantsDef_return retval = new pddlParser.constantsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal50=null;
		Token string_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope typedNameList52 =null;

		Object char_literal50_tree=null;
		Object string_literal51_tree=null;
		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// ./org.coursera.aiplanning.pddl.g:157:2: ( '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) )
			// ./org.coursera.aiplanning.pddl.g:157:4: '(' ':constants' typedNameList ')'
			{
			char_literal50=(Token)match(input,53,FOLLOW_53_in_constantsDef773); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal50);

			string_literal51=(Token)match(input,61,FOLLOW_61_in_constantsDef775); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(string_literal51);

			pushFollow(FOLLOW_typedNameList_in_constantsDef777);
			typedNameList52=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList52.getTree());
			char_literal53=(Token)match(input,54,FOLLOW_54_in_constantsDef779); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal53);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 158:2: -> ^( CONSTANTS typedNameList )
			{
				// ./org.coursera.aiplanning.pddl.g:158:5: ^( CONSTANTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantsDef"


	public static class predicatesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicatesDef"
	// ./org.coursera.aiplanning.pddl.g:161:1: predicatesDef : '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) ;
	public final pddlParser.predicatesDef_return predicatesDef() throws RecognitionException {
		pddlParser.predicatesDef_return retval = new pddlParser.predicatesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal54=null;
		Token string_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope atomicFormulaSkeleton56 =null;

		Object char_literal54_tree=null;
		Object string_literal55_tree=null;
		Object char_literal57_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_atomicFormulaSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFormulaSkeleton");

		try {
			// ./org.coursera.aiplanning.pddl.g:162:2: ( '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) )
			// ./org.coursera.aiplanning.pddl.g:162:4: '(' ':predicates' ( atomicFormulaSkeleton )+ ')'
			{
			char_literal54=(Token)match(input,53,FOLLOW_53_in_predicatesDef799); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal54);

			string_literal55=(Token)match(input,75,FOLLOW_75_in_predicatesDef801); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_75.add(string_literal55);

			// ./org.coursera.aiplanning.pddl.g:162:22: ( atomicFormulaSkeleton )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==53) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:162:22: atomicFormulaSkeleton
					{
					pushFollow(FOLLOW_atomicFormulaSkeleton_in_predicatesDef803);
					atomicFormulaSkeleton56=atomicFormulaSkeleton();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicFormulaSkeleton.add(atomicFormulaSkeleton56.getTree());
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			char_literal57=(Token)match(input,54,FOLLOW_54_in_predicatesDef806); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal57);

			// AST REWRITE
			// elements: atomicFormulaSkeleton
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:2: -> ^( PREDICATES ( atomicFormulaSkeleton )+ )
			{
				// ./org.coursera.aiplanning.pddl.g:163:5: ^( PREDICATES ( atomicFormulaSkeleton )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATES, "PREDICATES"), root_1);
				if ( !(stream_atomicFormulaSkeleton.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_atomicFormulaSkeleton.hasNext() ) {
					adaptor.addChild(root_1, stream_atomicFormulaSkeleton.nextTree());
				}
				stream_atomicFormulaSkeleton.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicatesDef"


	public static class atomicFormulaSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFormulaSkeleton"
	// ./org.coursera.aiplanning.pddl.g:166:1: atomicFormulaSkeleton : '(' ! predicate ^ typedVariableList ')' !;
	public final pddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton() throws RecognitionException {
		pddlParser.atomicFormulaSkeleton_return retval = new pddlParser.atomicFormulaSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal58=null;
		Token char_literal61=null;
		ParserRuleReturnScope predicate59 =null;
		ParserRuleReturnScope typedVariableList60 =null;

		Object char_literal58_tree=null;
		Object char_literal61_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:167:2: ( '(' ! predicate ^ typedVariableList ')' !)
			// ./org.coursera.aiplanning.pddl.g:167:4: '(' ! predicate ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal58=(Token)match(input,53,FOLLOW_53_in_atomicFormulaSkeleton827); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_atomicFormulaSkeleton830);
			predicate59=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(predicate59.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFormulaSkeleton833);
			typedVariableList60=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList60.getTree());

			char_literal61=(Token)match(input,54,FOLLOW_54_in_atomicFormulaSkeleton835); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFormulaSkeleton"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// ./org.coursera.aiplanning.pddl.g:170:1: predicate : NAME ;
	public final pddlParser.predicate_return predicate() throws RecognitionException {
		pddlParser.predicate_return retval = new pddlParser.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME62=null;

		Object NAME62_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:170:11: ( NAME )
			// ./org.coursera.aiplanning.pddl.g:170:13: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME62=(Token)match(input,NAME,FOLLOW_NAME_in_predicate846); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME62_tree = (Object)adaptor.create(NAME62);
			adaptor.addChild(root_0, NAME62_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class typedVariableList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedVariableList"
	// ./org.coursera.aiplanning.pddl.g:173:1: typedVariableList : ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) ;
	public final pddlParser.typedVariableList_return typedVariableList() throws RecognitionException {
		pddlParser.typedVariableList_return retval = new pddlParser.typedVariableList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE63=null;
		Token VARIABLE65=null;
		ParserRuleReturnScope singleTypeVarList64 =null;

		Object VARIABLE63_tree=null;
		Object VARIABLE65_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:174:5: ( ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) )
			// ./org.coursera.aiplanning.pddl.g:174:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			{
			root_0 = (Object)adaptor.nil();


			// ./org.coursera.aiplanning.pddl.g:174:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:174:8: ( VARIABLE )*
					{
					// ./org.coursera.aiplanning.pddl.g:174:8: ( VARIABLE )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==VARIABLE) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:174:8: VARIABLE
							{
							VARIABLE63=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList861); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE63_tree = (Object)adaptor.create(VARIABLE63);
							adaptor.addChild(root_0, VARIABLE63_tree);
							}

							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:174:20: ( singleTypeVarList )+ ( VARIABLE )*
					{
					// ./org.coursera.aiplanning.pddl.g:174:20: ( singleTypeVarList )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						alt22 = dfa22.predict(input);
						switch (alt22) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:174:20: singleTypeVarList
							{
							pushFollow(FOLLOW_singleTypeVarList_in_typedVariableList866);
							singleTypeVarList64=singleTypeVarList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeVarList64.getTree());

							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					// ./org.coursera.aiplanning.pddl.g:174:39: ( VARIABLE )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==VARIABLE) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:174:39: VARIABLE
							{
							VARIABLE65=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList869); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE65_tree = (Object)adaptor.create(VARIABLE65);
							adaptor.addChild(root_0, VARIABLE65_tree);
							}

							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedVariableList"


	public static class singleTypeVarList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeVarList"
	// ./org.coursera.aiplanning.pddl.g:177:1: singleTypeVarList : ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ ;
	public final pddlParser.singleTypeVarList_return singleTypeVarList() throws RecognitionException {
		pddlParser.singleTypeVarList_return retval = new pddlParser.singleTypeVarList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE66=null;
		Token char_literal67=null;
		ParserRuleReturnScope t =null;

		Object VARIABLE66_tree=null;
		Object char_literal67_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// ./org.coursera.aiplanning.pddl.g:178:5: ( ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ )
			// ./org.coursera.aiplanning.pddl.g:178:7: ( ( VARIABLE )+ '-' t= type )
			{
			// ./org.coursera.aiplanning.pddl.g:178:7: ( ( VARIABLE )+ '-' t= type )
			// ./org.coursera.aiplanning.pddl.g:178:8: ( VARIABLE )+ '-' t= type
			{
			// ./org.coursera.aiplanning.pddl.g:178:8: ( VARIABLE )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==VARIABLE) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:178:8: VARIABLE
					{
					VARIABLE66=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_singleTypeVarList889); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE66);

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			char_literal67=(Token)match(input,57,FOLLOW_57_in_singleTypeVarList892); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal67);

			pushFollow(FOLLOW_type_in_singleTypeVarList896);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, VARIABLE
			// token labels: 
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 179:7: -> ( ^( VARIABLE $t) )+
			{
				if ( !(stream_t.hasNext()||stream_VARIABLE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_VARIABLE.hasNext() ) {
					// ./org.coursera.aiplanning.pddl.g:179:10: ^( VARIABLE $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_VARIABLE.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_VARIABLE.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeVarList"


	public static class constraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraints"
	// ./org.coursera.aiplanning.pddl.g:182:1: constraints : '(' ! ':constraints' ^ conGD ')' !;
	public final pddlParser.constraints_return constraints() throws RecognitionException {
		pddlParser.constraints_return retval = new pddlParser.constraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		Token string_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope conGD70 =null;

		Object char_literal68_tree=null;
		Object string_literal69_tree=null;
		Object char_literal71_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:183:2: ( '(' ! ':constraints' ^ conGD ')' !)
			// ./org.coursera.aiplanning.pddl.g:183:4: '(' ! ':constraints' ^ conGD ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal68=(Token)match(input,53,FOLLOW_53_in_constraints927); if (state.failed) return retval;
			string_literal69=(Token)match(input,62,FOLLOW_62_in_constraints930); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal69_tree = (Object)adaptor.create(string_literal69);
			root_0 = (Object)adaptor.becomeRoot(string_literal69_tree, root_0);
			}

			pushFollow(FOLLOW_conGD_in_constraints933);
			conGD70=conGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD70.getTree());

			char_literal71=(Token)match(input,54,FOLLOW_54_in_constraints935); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraints"


	public static class structureDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "structureDef"
	// ./org.coursera.aiplanning.pddl.g:186:1: structureDef : ( actionDef | durativeActionDef | derivedDef );
	public final pddlParser.structureDef_return structureDef() throws RecognitionException {
		pddlParser.structureDef_return retval = new pddlParser.structureDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actionDef72 =null;
		ParserRuleReturnScope durativeActionDef73 =null;
		ParserRuleReturnScope derivedDef74 =null;


		try {
			// ./org.coursera.aiplanning.pddl.g:187:2: ( actionDef | durativeActionDef | derivedDef )
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==53) ) {
				switch ( input.LA(2) ) {
				case 59:
					{
					alt26=1;
					}
					break;
				case 66:
					{
					alt26=2;
					}
					break;
				case 63:
					{
					alt26=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:187:4: actionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_actionDef_in_structureDef947);
					actionDef72=actionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, actionDef72.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:188:4: durativeActionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_durativeActionDef_in_structureDef952);
					durativeActionDef73=durativeActionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durativeActionDef73.getTree());

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:189:4: derivedDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedDef_in_structureDef957);
					derivedDef74=derivedDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedDef74.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structureDef"


	public static class actionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDef"
	// ./org.coursera.aiplanning.pddl.g:195:1: actionDef : '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol typedVariableList actionDefBody ) ;
	public final pddlParser.actionDef_return actionDef() throws RecognitionException {
		pddlParser.actionDef_return retval = new pddlParser.actionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal75=null;
		Token string_literal76=null;
		Token string_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		Token char_literal83=null;
		ParserRuleReturnScope actionSymbol77 =null;
		ParserRuleReturnScope typedVariableList80 =null;
		ParserRuleReturnScope actionDefBody82 =null;

		Object char_literal75_tree=null;
		Object string_literal76_tree=null;
		Object string_literal78_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");

		try {
			// ./org.coursera.aiplanning.pddl.g:196:2: ( '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol typedVariableList actionDefBody ) )
			// ./org.coursera.aiplanning.pddl.g:196:4: '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')'
			{
			char_literal75=(Token)match(input,53,FOLLOW_53_in_actionDef972); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal75);

			string_literal76=(Token)match(input,59,FOLLOW_59_in_actionDef974); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_59.add(string_literal76);

			pushFollow(FOLLOW_actionSymbol_in_actionDef976);
			actionSymbol77=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol77.getTree());
			string_literal78=(Token)match(input,73,FOLLOW_73_in_actionDef985); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(string_literal78);

			char_literal79=(Token)match(input,53,FOLLOW_53_in_actionDef987); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal79);

			pushFollow(FOLLOW_typedVariableList_in_actionDef989);
			typedVariableList80=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList80.getTree());
			char_literal81=(Token)match(input,54,FOLLOW_54_in_actionDef991); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal81);

			pushFollow(FOLLOW_actionDefBody_in_actionDef1004);
			actionDefBody82=actionDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody82.getTree());
			char_literal83=(Token)match(input,54,FOLLOW_54_in_actionDef1006); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal83);

			// AST REWRITE
			// elements: typedVariableList, actionSymbol, actionDefBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 199:8: -> ^( ACTION actionSymbol typedVariableList actionDefBody )
			{
				// ./org.coursera.aiplanning.pddl.g:199:11: ^( ACTION actionSymbol typedVariableList actionDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				adaptor.addChild(root_1, stream_actionDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDef"


	public static class actionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionSymbol"
	// ./org.coursera.aiplanning.pddl.g:202:1: actionSymbol : NAME ;
	public final pddlParser.actionSymbol_return actionSymbol() throws RecognitionException {
		pddlParser.actionSymbol_return retval = new pddlParser.actionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME84=null;

		Object NAME84_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:202:14: ( NAME )
			// ./org.coursera.aiplanning.pddl.g:202:16: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME84=(Token)match(input,NAME,FOLLOW_NAME_in_actionSymbol1038); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME84_tree = (Object)adaptor.create(NAME84);
			adaptor.addChild(root_0, NAME84_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSymbol"


	public static class actionDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDefBody"
	// ./org.coursera.aiplanning.pddl.g:208:1: actionDefBody : ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) ;
	public final pddlParser.actionDefBody_return actionDefBody() throws RecognitionException {
		pddlParser.actionDefBody_return retval = new pddlParser.actionDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal85=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token string_literal89=null;
		Token char_literal90=null;
		Token char_literal91=null;
		ParserRuleReturnScope goalDesc88 =null;
		ParserRuleReturnScope effect92 =null;

		Object string_literal85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal87_tree=null;
		Object string_literal89_tree=null;
		Object char_literal90_tree=null;
		Object char_literal91_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");

		try {
			// ./org.coursera.aiplanning.pddl.g:209:2: ( ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) )
			// ./org.coursera.aiplanning.pddl.g:209:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )?
			{
			// ./org.coursera.aiplanning.pddl.g:209:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==74) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:209:6: ':precondition' ( ( '(' ')' ) | goalDesc )
					{
					string_literal85=(Token)match(input,74,FOLLOW_74_in_actionDefBody1054); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(string_literal85);

					// ./org.coursera.aiplanning.pddl.g:209:22: ( ( '(' ')' ) | goalDesc )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==53) ) {
						int LA27_1 = input.LA(2);
						if ( (LA27_1==54) ) {
							alt27=1;
						}
						else if ( (LA27_1==NAME||(LA27_1 >= 78 && LA27_1 <= 82)||LA27_1==87||(LA27_1 >= 96 && LA27_1 <= 97)||LA27_1==100||LA27_1==105||LA27_1==107) ) {
							alt27=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 27, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:209:23: ( '(' ')' )
							{
							// ./org.coursera.aiplanning.pddl.g:209:23: ( '(' ')' )
							// ./org.coursera.aiplanning.pddl.g:209:24: '(' ')'
							{
							char_literal86=(Token)match(input,53,FOLLOW_53_in_actionDefBody1058); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_53.add(char_literal86);

							char_literal87=(Token)match(input,54,FOLLOW_54_in_actionDefBody1060); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_54.add(char_literal87);

							}

							}
							break;
						case 2 :
							// ./org.coursera.aiplanning.pddl.g:209:35: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_actionDefBody1065);
							goalDesc88=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc88.getTree());
							}
							break;

					}

					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:210:4: ( ':effect' ( ( '(' ')' ) | effect ) )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==67) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:210:6: ':effect' ( ( '(' ')' ) | effect )
					{
					string_literal89=(Token)match(input,67,FOLLOW_67_in_actionDefBody1075); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(string_literal89);

					// ./org.coursera.aiplanning.pddl.g:210:16: ( ( '(' ')' ) | effect )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==53) ) {
						int LA29_1 = input.LA(2);
						if ( (LA29_1==54) ) {
							alt29=1;
						}
						else if ( (LA29_1==NAME||(LA29_1 >= 87 && LA29_1 <= 88)||LA29_1==91||LA29_1==97||LA29_1==101||LA29_1==105||(LA29_1 >= 111 && LA29_1 <= 112)||LA29_1==118) ) {
							alt29=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 29, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:210:17: ( '(' ')' )
							{
							// ./org.coursera.aiplanning.pddl.g:210:17: ( '(' ')' )
							// ./org.coursera.aiplanning.pddl.g:210:18: '(' ')'
							{
							char_literal90=(Token)match(input,53,FOLLOW_53_in_actionDefBody1079); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_53.add(char_literal90);

							char_literal91=(Token)match(input,54,FOLLOW_54_in_actionDefBody1081); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_54.add(char_literal91);

							}

							}
							break;
						case 2 :
							// ./org.coursera.aiplanning.pddl.g:210:29: effect
							{
							pushFollow(FOLLOW_effect_in_actionDefBody1086);
							effect92=effect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_effect.add(effect92.getTree());
							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: goalDesc, effect
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 211:4: -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? )
			{
				// ./org.coursera.aiplanning.pddl.g:211:7: ^( PRECONDITION ( goalDesc )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);
				// ./org.coursera.aiplanning.pddl.g:211:22: ( goalDesc )?
				if ( stream_goalDesc.hasNext() ) {
					adaptor.addChild(root_1, stream_goalDesc.nextTree());
				}
				stream_goalDesc.reset();

				adaptor.addChild(root_0, root_1);
				}

				// ./org.coursera.aiplanning.pddl.g:211:33: ^( EFFECT ( effect )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);
				// ./org.coursera.aiplanning.pddl.g:211:42: ( effect )?
				if ( stream_effect.hasNext() ) {
					adaptor.addChild(root_1, stream_effect.nextTree());
				}
				stream_effect.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDefBody"


	public static class goalDesc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "goalDesc"
	// ./org.coursera.aiplanning.pddl.g:225:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) );
	public final pddlParser.goalDesc_return goalDesc() throws RecognitionException {
		pddlParser.goalDesc_return retval = new pddlParser.goalDesc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal94=null;
		Token string_literal95=null;
		Token char_literal97=null;
		Token char_literal98=null;
		Token string_literal99=null;
		Token char_literal101=null;
		Token char_literal102=null;
		Token string_literal103=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token string_literal107=null;
		Token char_literal110=null;
		Token char_literal111=null;
		Token string_literal112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token char_literal117=null;
		Token char_literal118=null;
		Token string_literal119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token char_literal124=null;
		ParserRuleReturnScope atomicTermFormula93 =null;
		ParserRuleReturnScope goalDesc96 =null;
		ParserRuleReturnScope goalDesc100 =null;
		ParserRuleReturnScope goalDesc104 =null;
		ParserRuleReturnScope goalDesc108 =null;
		ParserRuleReturnScope goalDesc109 =null;
		ParserRuleReturnScope typedVariableList114 =null;
		ParserRuleReturnScope goalDesc116 =null;
		ParserRuleReturnScope typedVariableList121 =null;
		ParserRuleReturnScope goalDesc123 =null;
		ParserRuleReturnScope fComp125 =null;

		Object char_literal94_tree=null;
		Object string_literal95_tree=null;
		Object char_literal97_tree=null;
		Object char_literal98_tree=null;
		Object string_literal99_tree=null;
		Object char_literal101_tree=null;
		Object char_literal102_tree=null;
		Object string_literal103_tree=null;
		Object char_literal105_tree=null;
		Object char_literal106_tree=null;
		Object string_literal107_tree=null;
		Object char_literal110_tree=null;
		Object char_literal111_tree=null;
		Object string_literal112_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;
		Object char_literal117_tree=null;
		Object char_literal118_tree=null;
		Object string_literal119_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object char_literal124_tree=null;
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_fComp=new RewriteRuleSubtreeStream(adaptor,"rule fComp");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");

		try {
			// ./org.coursera.aiplanning.pddl.g:226:2: ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) )
			int alt33=8;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==53) ) {
				switch ( input.LA(2) ) {
				case 87:
					{
					alt33=2;
					}
					break;
				case 107:
					{
					alt33=3;
					}
					break;
				case 105:
					{
					alt33=4;
					}
					break;
				case 100:
					{
					alt33=5;
					}
					break;
				case 96:
					{
					alt33=6;
					}
					break;
				case 97:
					{
					alt33=7;
					}
					break;
				case NAME:
					{
					alt33=1;
					}
					break;
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
					{
					alt33=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:226:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_goalDesc1130);
					atomicTermFormula93=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula93.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:227:4: '(' 'and' ( goalDesc )* ')'
					{
					char_literal94=(Token)match(input,53,FOLLOW_53_in_goalDesc1135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal94);

					string_literal95=(Token)match(input,87,FOLLOW_87_in_goalDesc1137); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(string_literal95);

					// ./org.coursera.aiplanning.pddl.g:227:14: ( goalDesc )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==53) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:227:14: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_goalDesc1139);
							goalDesc96=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc96.getTree());
							}
							break;

						default :
							break loop31;
						}
					}

					char_literal97=(Token)match(input,54,FOLLOW_54_in_goalDesc1142); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal97);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 228:12: -> ^( AND_GD ( goalDesc )* )
					{
						// ./org.coursera.aiplanning.pddl.g:228:15: ^( AND_GD ( goalDesc )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_GD, "AND_GD"), root_1);
						// ./org.coursera.aiplanning.pddl.g:228:24: ( goalDesc )*
						while ( stream_goalDesc.hasNext() ) {
							adaptor.addChild(root_1, stream_goalDesc.nextTree());
						}
						stream_goalDesc.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:229:4: '(' 'or' ( goalDesc )* ')'
					{
					char_literal98=(Token)match(input,53,FOLLOW_53_in_goalDesc1167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal98);

					string_literal99=(Token)match(input,107,FOLLOW_107_in_goalDesc1169); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_107.add(string_literal99);

					// ./org.coursera.aiplanning.pddl.g:229:13: ( goalDesc )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==53) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:229:13: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_goalDesc1171);
							goalDesc100=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc100.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					char_literal101=(Token)match(input,54,FOLLOW_54_in_goalDesc1174); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal101);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 230:12: -> ^( OR_GD ( goalDesc )* )
					{
						// ./org.coursera.aiplanning.pddl.g:230:15: ^( OR_GD ( goalDesc )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_GD, "OR_GD"), root_1);
						// ./org.coursera.aiplanning.pddl.g:230:23: ( goalDesc )*
						while ( stream_goalDesc.hasNext() ) {
							adaptor.addChild(root_1, stream_goalDesc.nextTree());
						}
						stream_goalDesc.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:231:4: '(' 'not' goalDesc ')'
					{
					char_literal102=(Token)match(input,53,FOLLOW_53_in_goalDesc1199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal102);

					string_literal103=(Token)match(input,105,FOLLOW_105_in_goalDesc1201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal103);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1203);
					goalDesc104=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc104.getTree());
					char_literal105=(Token)match(input,54,FOLLOW_54_in_goalDesc1205); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal105);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 232:12: -> ^( NOT_GD goalDesc )
					{
						// ./org.coursera.aiplanning.pddl.g:232:15: ^( NOT_GD goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_GD, "NOT_GD"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// ./org.coursera.aiplanning.pddl.g:233:4: '(' 'imply' goalDesc goalDesc ')'
					{
					char_literal106=(Token)match(input,53,FOLLOW_53_in_goalDesc1229); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal106);

					string_literal107=(Token)match(input,100,FOLLOW_100_in_goalDesc1231); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_100.add(string_literal107);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1233);
					goalDesc108=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc108.getTree());
					pushFollow(FOLLOW_goalDesc_in_goalDesc1235);
					goalDesc109=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc109.getTree());
					char_literal110=(Token)match(input,54,FOLLOW_54_in_goalDesc1237); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal110);

					// AST REWRITE
					// elements: goalDesc, goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 234:12: -> ^( IMPLY_GD goalDesc goalDesc )
					{
						// ./org.coursera.aiplanning.pddl.g:234:15: ^( IMPLY_GD goalDesc goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLY_GD, "IMPLY_GD"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// ./org.coursera.aiplanning.pddl.g:235:4: '(' 'exists' '(' typedVariableList ')' goalDesc ')'
					{
					char_literal111=(Token)match(input,53,FOLLOW_53_in_goalDesc1263); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal111);

					string_literal112=(Token)match(input,96,FOLLOW_96_in_goalDesc1265); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_96.add(string_literal112);

					char_literal113=(Token)match(input,53,FOLLOW_53_in_goalDesc1267); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal113);

					pushFollow(FOLLOW_typedVariableList_in_goalDesc1269);
					typedVariableList114=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList114.getTree());
					char_literal115=(Token)match(input,54,FOLLOW_54_in_goalDesc1271); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal115);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1273);
					goalDesc116=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc116.getTree());
					char_literal117=(Token)match(input,54,FOLLOW_54_in_goalDesc1275); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal117);

					// AST REWRITE
					// elements: goalDesc, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 236:12: -> ^( EXISTS_GD typedVariableList goalDesc )
					{
						// ./org.coursera.aiplanning.pddl.g:236:15: ^( EXISTS_GD typedVariableList goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXISTS_GD, "EXISTS_GD"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// ./org.coursera.aiplanning.pddl.g:237:4: '(' 'forall' '(' typedVariableList ')' goalDesc ')'
					{
					char_literal118=(Token)match(input,53,FOLLOW_53_in_goalDesc1301); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal118);

					string_literal119=(Token)match(input,97,FOLLOW_97_in_goalDesc1303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(string_literal119);

					char_literal120=(Token)match(input,53,FOLLOW_53_in_goalDesc1305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal120);

					pushFollow(FOLLOW_typedVariableList_in_goalDesc1307);
					typedVariableList121=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList121.getTree());
					char_literal122=(Token)match(input,54,FOLLOW_54_in_goalDesc1309); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal122);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1311);
					goalDesc123=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc123.getTree());
					char_literal124=(Token)match(input,54,FOLLOW_54_in_goalDesc1313); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal124);

					// AST REWRITE
					// elements: goalDesc, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 238:12: -> ^( FORALL_GD typedVariableList goalDesc )
					{
						// ./org.coursera.aiplanning.pddl.g:238:15: ^( FORALL_GD typedVariableList goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_GD, "FORALL_GD"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// ./org.coursera.aiplanning.pddl.g:239:7: fComp
					{
					pushFollow(FOLLOW_fComp_in_goalDesc1342);
					fComp125=fComp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fComp.add(fComp125.getTree());
					// AST REWRITE
					// elements: fComp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 240:15: -> ^( COMPARISON_GD fComp )
					{
						// ./org.coursera.aiplanning.pddl.g:240:18: ^( COMPARISON_GD fComp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPARISON_GD, "COMPARISON_GD"), root_1);
						adaptor.addChild(root_1, stream_fComp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "goalDesc"


	public static class fComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fComp"
	// ./org.coursera.aiplanning.pddl.g:243:1: fComp : '(' ! binaryComp fExp fExp ')' !;
	public final pddlParser.fComp_return fComp() throws RecognitionException {
		pddlParser.fComp_return retval = new pddlParser.fComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token char_literal130=null;
		ParserRuleReturnScope binaryComp127 =null;
		ParserRuleReturnScope fExp128 =null;
		ParserRuleReturnScope fExp129 =null;

		Object char_literal126_tree=null;
		Object char_literal130_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:244:2: ( '(' ! binaryComp fExp fExp ')' !)
			// ./org.coursera.aiplanning.pddl.g:244:4: '(' ! binaryComp fExp fExp ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal126=(Token)match(input,53,FOLLOW_53_in_fComp1378); if (state.failed) return retval;
			pushFollow(FOLLOW_binaryComp_in_fComp1381);
			binaryComp127=binaryComp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryComp127.getTree());

			pushFollow(FOLLOW_fExp_in_fComp1383);
			fExp128=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp128.getTree());

			pushFollow(FOLLOW_fExp_in_fComp1385);
			fExp129=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp129.getTree());

			char_literal130=(Token)match(input,54,FOLLOW_54_in_fComp1387); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fComp"


	public static class atomicTermFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicTermFormula"
	// ./org.coursera.aiplanning.pddl.g:247:1: atomicTermFormula : '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) ;
	public final pddlParser.atomicTermFormula_return atomicTermFormula() throws RecognitionException {
		pddlParser.atomicTermFormula_return retval = new pddlParser.atomicTermFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal131=null;
		Token char_literal134=null;
		ParserRuleReturnScope predicate132 =null;
		ParserRuleReturnScope term133 =null;

		Object char_literal131_tree=null;
		Object char_literal134_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// ./org.coursera.aiplanning.pddl.g:248:2: ( '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) )
			// ./org.coursera.aiplanning.pddl.g:248:4: '(' predicate ( term )* ')'
			{
			char_literal131=(Token)match(input,53,FOLLOW_53_in_atomicTermFormula1399); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal131);

			pushFollow(FOLLOW_predicate_in_atomicTermFormula1401);
			predicate132=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate132.getTree());
			// ./org.coursera.aiplanning.pddl.g:248:18: ( term )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==NAME||LA34_0==VARIABLE) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:248:18: term
					{
					pushFollow(FOLLOW_term_in_atomicTermFormula1403);
					term133=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term133.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			char_literal134=(Token)match(input,54,FOLLOW_54_in_atomicTermFormula1406); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal134);

			// AST REWRITE
			// elements: predicate, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 248:28: -> ^( PRED_HEAD predicate ( term )* )
			{
				// ./org.coursera.aiplanning.pddl.g:248:31: ^( PRED_HEAD predicate ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_HEAD, "PRED_HEAD"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// ./org.coursera.aiplanning.pddl.g:248:53: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicTermFormula"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// ./org.coursera.aiplanning.pddl.g:251:1: term : ( NAME | VARIABLE );
	public final pddlParser.term_return term() throws RecognitionException {
		pddlParser.term_return retval = new pddlParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set135=null;

		Object set135_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:251:6: ( NAME | VARIABLE )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set135=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==VARIABLE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set135));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class durativeActionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durativeActionDef"
	// ./org.coursera.aiplanning.pddl.g:255:1: durativeActionDef : '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) ;
	public final pddlParser.durativeActionDef_return durativeActionDef() throws RecognitionException {
		pddlParser.durativeActionDef_return retval = new pddlParser.durativeActionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token string_literal137=null;
		Token string_literal139=null;
		Token char_literal140=null;
		Token char_literal142=null;
		Token char_literal144=null;
		ParserRuleReturnScope actionSymbol138 =null;
		ParserRuleReturnScope typedVariableList141 =null;
		ParserRuleReturnScope daDefBody143 =null;

		Object char_literal136_tree=null;
		Object string_literal137_tree=null;
		Object string_literal139_tree=null;
		Object char_literal140_tree=null;
		Object char_literal142_tree=null;
		Object char_literal144_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
		RewriteRuleSubtreeStream stream_daDefBody=new RewriteRuleSubtreeStream(adaptor,"rule daDefBody");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");

		try {
			// ./org.coursera.aiplanning.pddl.g:256:2: ( '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) )
			// ./org.coursera.aiplanning.pddl.g:256:4: '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')'
			{
			char_literal136=(Token)match(input,53,FOLLOW_53_in_durativeActionDef1444); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal136);

			string_literal137=(Token)match(input,66,FOLLOW_66_in_durativeActionDef1446); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(string_literal137);

			pushFollow(FOLLOW_actionSymbol_in_durativeActionDef1448);
			actionSymbol138=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol138.getTree());
			string_literal139=(Token)match(input,73,FOLLOW_73_in_durativeActionDef1457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(string_literal139);

			char_literal140=(Token)match(input,53,FOLLOW_53_in_durativeActionDef1459); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal140);

			pushFollow(FOLLOW_typedVariableList_in_durativeActionDef1461);
			typedVariableList141=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList141.getTree());
			char_literal142=(Token)match(input,54,FOLLOW_54_in_durativeActionDef1463); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal142);

			pushFollow(FOLLOW_daDefBody_in_durativeActionDef1476);
			daDefBody143=daDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_daDefBody.add(daDefBody143.getTree());
			char_literal144=(Token)match(input,54,FOLLOW_54_in_durativeActionDef1478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal144);

			// AST REWRITE
			// elements: typedVariableList, daDefBody, actionSymbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 259:8: -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
			{
				// ./org.coursera.aiplanning.pddl.g:259:11: ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATIVE_ACTION, "DURATIVE_ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				adaptor.addChild(root_1, stream_daDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durativeActionDef"


	public static class daDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daDefBody"
	// ./org.coursera.aiplanning.pddl.g:262:1: daDefBody : ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) );
	public final pddlParser.daDefBody_return daDefBody() throws RecognitionException {
		pddlParser.daDefBody_return retval = new pddlParser.daDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal145=null;
		Token string_literal147=null;
		Token char_literal148=null;
		Token char_literal149=null;
		Token string_literal151=null;
		Token char_literal152=null;
		Token char_literal153=null;
		ParserRuleReturnScope durationConstraint146 =null;
		ParserRuleReturnScope daGD150 =null;
		ParserRuleReturnScope daEffect154 =null;

		Object string_literal145_tree=null;
		Object string_literal147_tree=null;
		Object char_literal148_tree=null;
		Object char_literal149_tree=null;
		Object string_literal151_tree=null;
		Object char_literal152_tree=null;
		Object char_literal153_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:263:2: ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) )
			int alt37=3;
			switch ( input.LA(1) ) {
			case 65:
				{
				alt37=1;
				}
				break;
			case 60:
				{
				alt37=2;
				}
				break;
			case 67:
				{
				alt37=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:263:4: ':duration' durationConstraint
					{
					root_0 = (Object)adaptor.nil();


					string_literal145=(Token)match(input,65,FOLLOW_65_in_daDefBody1511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal145_tree = (Object)adaptor.create(string_literal145);
					adaptor.addChild(root_0, string_literal145_tree);
					}

					pushFollow(FOLLOW_durationConstraint_in_daDefBody1513);
					durationConstraint146=durationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durationConstraint146.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:264:4: ':condition' ( ( '(' ')' ) | daGD )
					{
					root_0 = (Object)adaptor.nil();


					string_literal147=(Token)match(input,60,FOLLOW_60_in_daDefBody1518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal147_tree = (Object)adaptor.create(string_literal147);
					adaptor.addChild(root_0, string_literal147_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:264:17: ( ( '(' ')' ) | daGD )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==53) ) {
						int LA35_1 = input.LA(2);
						if ( (LA35_1==54) ) {
							alt35=1;
						}
						else if ( (LA35_1==87||LA35_1==89||LA35_1==97||(LA35_1 >= 108 && LA35_1 <= 109)) ) {
							alt35=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 35, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:264:18: ( '(' ')' )
							{
							// ./org.coursera.aiplanning.pddl.g:264:18: ( '(' ')' )
							// ./org.coursera.aiplanning.pddl.g:264:19: '(' ')'
							{
							char_literal148=(Token)match(input,53,FOLLOW_53_in_daDefBody1522); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal148_tree = (Object)adaptor.create(char_literal148);
							adaptor.addChild(root_0, char_literal148_tree);
							}

							char_literal149=(Token)match(input,54,FOLLOW_54_in_daDefBody1524); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal149_tree = (Object)adaptor.create(char_literal149);
							adaptor.addChild(root_0, char_literal149_tree);
							}

							}

							}
							break;
						case 2 :
							// ./org.coursera.aiplanning.pddl.g:264:30: daGD
							{
							pushFollow(FOLLOW_daGD_in_daDefBody1529);
							daGD150=daGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD150.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:265:7: ':effect' ( ( '(' ')' ) | daEffect )
					{
					root_0 = (Object)adaptor.nil();


					string_literal151=(Token)match(input,67,FOLLOW_67_in_daDefBody1538); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal151_tree = (Object)adaptor.create(string_literal151);
					adaptor.addChild(root_0, string_literal151_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:265:17: ( ( '(' ')' ) | daEffect )
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==53) ) {
						int LA36_1 = input.LA(2);
						if ( (LA36_1==54) ) {
							alt36=1;
						}
						else if ( ((LA36_1 >= 87 && LA36_1 <= 89)||LA36_1==91||LA36_1==97||LA36_1==101||(LA36_1 >= 111 && LA36_1 <= 112)||LA36_1==118) ) {
							alt36=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 36, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}

					switch (alt36) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:265:18: ( '(' ')' )
							{
							// ./org.coursera.aiplanning.pddl.g:265:18: ( '(' ')' )
							// ./org.coursera.aiplanning.pddl.g:265:19: '(' ')'
							{
							char_literal152=(Token)match(input,53,FOLLOW_53_in_daDefBody1542); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal152_tree = (Object)adaptor.create(char_literal152);
							adaptor.addChild(root_0, char_literal152_tree);
							}

							char_literal153=(Token)match(input,54,FOLLOW_54_in_daDefBody1544); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal153_tree = (Object)adaptor.create(char_literal153);
							adaptor.addChild(root_0, char_literal153_tree);
							}

							}

							}
							break;
						case 2 :
							// ./org.coursera.aiplanning.pddl.g:265:30: daEffect
							{
							pushFollow(FOLLOW_daEffect_in_daDefBody1549);
							daEffect154=daEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect154.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daDefBody"


	public static class daGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daGD"
	// ./org.coursera.aiplanning.pddl.g:268:1: daGD : ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' );
	public final pddlParser.daGD_return daGD() throws RecognitionException {
		pddlParser.daGD_return retval = new pddlParser.daGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal156=null;
		Token string_literal157=null;
		Token char_literal159=null;
		Token char_literal160=null;
		Token string_literal161=null;
		Token char_literal162=null;
		Token char_literal164=null;
		Token char_literal166=null;
		ParserRuleReturnScope prefTimedGD155 =null;
		ParserRuleReturnScope daGD158 =null;
		ParserRuleReturnScope typedVariableList163 =null;
		ParserRuleReturnScope daGD165 =null;

		Object char_literal156_tree=null;
		Object string_literal157_tree=null;
		Object char_literal159_tree=null;
		Object char_literal160_tree=null;
		Object string_literal161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal164_tree=null;
		Object char_literal166_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:269:2: ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' )
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==53) ) {
				switch ( input.LA(2) ) {
				case 89:
				case 108:
				case 109:
					{
					alt39=1;
					}
					break;
				case 87:
					{
					alt39=2;
					}
					break;
				case 97:
					{
					alt39=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:269:4: prefTimedGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_prefTimedGD_in_daGD1564);
					prefTimedGD155=prefTimedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefTimedGD155.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:270:4: '(' 'and' ( daGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal156=(Token)match(input,53,FOLLOW_53_in_daGD1569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal156_tree = (Object)adaptor.create(char_literal156);
					adaptor.addChild(root_0, char_literal156_tree);
					}

					string_literal157=(Token)match(input,87,FOLLOW_87_in_daGD1571); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal157_tree = (Object)adaptor.create(string_literal157);
					adaptor.addChild(root_0, string_literal157_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:270:14: ( daGD )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==53) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:270:14: daGD
							{
							pushFollow(FOLLOW_daGD_in_daGD1573);
							daGD158=daGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD158.getTree());

							}
							break;

						default :
							break loop38;
						}
					}

					char_literal159=(Token)match(input,54,FOLLOW_54_in_daGD1576); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal159_tree = (Object)adaptor.create(char_literal159);
					adaptor.addChild(root_0, char_literal159_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:271:4: '(' 'forall' '(' typedVariableList ')' daGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal160=(Token)match(input,53,FOLLOW_53_in_daGD1581); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal160_tree = (Object)adaptor.create(char_literal160);
					adaptor.addChild(root_0, char_literal160_tree);
					}

					string_literal161=(Token)match(input,97,FOLLOW_97_in_daGD1583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal161_tree = (Object)adaptor.create(string_literal161);
					adaptor.addChild(root_0, string_literal161_tree);
					}

					char_literal162=(Token)match(input,53,FOLLOW_53_in_daGD1585); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal162_tree = (Object)adaptor.create(char_literal162);
					adaptor.addChild(root_0, char_literal162_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_daGD1587);
					typedVariableList163=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList163.getTree());

					char_literal164=(Token)match(input,54,FOLLOW_54_in_daGD1589); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal164_tree = (Object)adaptor.create(char_literal164);
					adaptor.addChild(root_0, char_literal164_tree);
					}

					pushFollow(FOLLOW_daGD_in_daGD1591);
					daGD165=daGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD165.getTree());

					char_literal166=(Token)match(input,54,FOLLOW_54_in_daGD1593); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal166_tree = (Object)adaptor.create(char_literal166);
					adaptor.addChild(root_0, char_literal166_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daGD"


	public static class prefTimedGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefTimedGD"
	// ./org.coursera.aiplanning.pddl.g:274:1: prefTimedGD : ( timedGD | '(' 'preference' ( NAME )? timedGD ')' );
	public final pddlParser.prefTimedGD_return prefTimedGD() throws RecognitionException {
		pddlParser.prefTimedGD_return retval = new pddlParser.prefTimedGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal168=null;
		Token string_literal169=null;
		Token NAME170=null;
		Token char_literal172=null;
		ParserRuleReturnScope timedGD167 =null;
		ParserRuleReturnScope timedGD171 =null;

		Object char_literal168_tree=null;
		Object string_literal169_tree=null;
		Object NAME170_tree=null;
		Object char_literal172_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:275:2: ( timedGD | '(' 'preference' ( NAME )? timedGD ')' )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==53) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==89||LA41_1==108) ) {
					alt41=1;
				}
				else if ( (LA41_1==109) ) {
					alt41=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:275:4: timedGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timedGD_in_prefTimedGD1604);
					timedGD167=timedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD167.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:276:4: '(' 'preference' ( NAME )? timedGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal168=(Token)match(input,53,FOLLOW_53_in_prefTimedGD1609); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal168_tree = (Object)adaptor.create(char_literal168);
					adaptor.addChild(root_0, char_literal168_tree);
					}

					string_literal169=(Token)match(input,109,FOLLOW_109_in_prefTimedGD1611); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal169_tree = (Object)adaptor.create(string_literal169);
					adaptor.addChild(root_0, string_literal169_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:276:21: ( NAME )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==NAME) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:276:21: NAME
							{
							NAME170=(Token)match(input,NAME,FOLLOW_NAME_in_prefTimedGD1613); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME170_tree = (Object)adaptor.create(NAME170);
							adaptor.addChild(root_0, NAME170_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_timedGD_in_prefTimedGD1616);
					timedGD171=timedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD171.getTree());

					char_literal172=(Token)match(input,54,FOLLOW_54_in_prefTimedGD1618); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal172_tree = (Object)adaptor.create(char_literal172);
					adaptor.addChild(root_0, char_literal172_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefTimedGD"


	public static class timedGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedGD"
	// ./org.coursera.aiplanning.pddl.g:279:1: timedGD : ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' );
	public final pddlParser.timedGD_return timedGD() throws RecognitionException {
		pddlParser.timedGD_return retval = new pddlParser.timedGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal173=null;
		Token string_literal174=null;
		Token char_literal177=null;
		Token char_literal178=null;
		Token string_literal179=null;
		Token char_literal182=null;
		ParserRuleReturnScope timeSpecifier175 =null;
		ParserRuleReturnScope goalDesc176 =null;
		ParserRuleReturnScope interval180 =null;
		ParserRuleReturnScope goalDesc181 =null;

		Object char_literal173_tree=null;
		Object string_literal174_tree=null;
		Object char_literal177_tree=null;
		Object char_literal178_tree=null;
		Object string_literal179_tree=null;
		Object char_literal182_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:280:2: ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==53) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==89) ) {
					alt42=1;
				}
				else if ( (LA42_1==108) ) {
					alt42=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:280:4: '(' 'at' timeSpecifier goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal173=(Token)match(input,53,FOLLOW_53_in_timedGD1629); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal173_tree = (Object)adaptor.create(char_literal173);
					adaptor.addChild(root_0, char_literal173_tree);
					}

					string_literal174=(Token)match(input,89,FOLLOW_89_in_timedGD1631); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal174_tree = (Object)adaptor.create(string_literal174);
					adaptor.addChild(root_0, string_literal174_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedGD1633);
					timeSpecifier175=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier175.getTree());

					pushFollow(FOLLOW_goalDesc_in_timedGD1635);
					goalDesc176=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc176.getTree());

					char_literal177=(Token)match(input,54,FOLLOW_54_in_timedGD1637); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal177_tree = (Object)adaptor.create(char_literal177);
					adaptor.addChild(root_0, char_literal177_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:281:4: '(' 'over' interval goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal178=(Token)match(input,53,FOLLOW_53_in_timedGD1642); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal178_tree = (Object)adaptor.create(char_literal178);
					adaptor.addChild(root_0, char_literal178_tree);
					}

					string_literal179=(Token)match(input,108,FOLLOW_108_in_timedGD1644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal179_tree = (Object)adaptor.create(string_literal179);
					adaptor.addChild(root_0, string_literal179_tree);
					}

					pushFollow(FOLLOW_interval_in_timedGD1646);
					interval180=interval();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interval180.getTree());

					pushFollow(FOLLOW_goalDesc_in_timedGD1648);
					goalDesc181=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc181.getTree());

					char_literal182=(Token)match(input,54,FOLLOW_54_in_timedGD1650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal182_tree = (Object)adaptor.create(char_literal182);
					adaptor.addChild(root_0, char_literal182_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedGD"


	public static class timeSpecifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeSpecifier"
	// ./org.coursera.aiplanning.pddl.g:284:1: timeSpecifier : ( 'start' | 'end' );
	public final pddlParser.timeSpecifier_return timeSpecifier() throws RecognitionException {
		pddlParser.timeSpecifier_return retval = new pddlParser.timeSpecifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set183=null;

		Object set183_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:284:15: ( 'start' | 'end' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set183=input.LT(1);
			if ( input.LA(1)==95||input.LA(1)==116 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set183));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeSpecifier"


	public static class interval_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interval"
	// ./org.coursera.aiplanning.pddl.g:285:1: interval : 'all' ;
	public final pddlParser.interval_return interval() throws RecognitionException {
		pddlParser.interval_return retval = new pddlParser.interval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal184=null;

		Object string_literal184_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:285:10: ( 'all' )
			// ./org.coursera.aiplanning.pddl.g:285:12: 'all'
			{
			root_0 = (Object)adaptor.nil();


			string_literal184=(Token)match(input,84,FOLLOW_84_in_interval1672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal184_tree = (Object)adaptor.create(string_literal184);
			adaptor.addChild(root_0, string_literal184_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interval"


	public static class derivedDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivedDef"
	// ./org.coursera.aiplanning.pddl.g:289:1: derivedDef : '(' ! ':derived' ^ typedVariableList goalDesc ')' !;
	public final pddlParser.derivedDef_return derivedDef() throws RecognitionException {
		pddlParser.derivedDef_return retval = new pddlParser.derivedDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal185=null;
		Token string_literal186=null;
		Token char_literal189=null;
		ParserRuleReturnScope typedVariableList187 =null;
		ParserRuleReturnScope goalDesc188 =null;

		Object char_literal185_tree=null;
		Object string_literal186_tree=null;
		Object char_literal189_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:290:2: ( '(' ! ':derived' ^ typedVariableList goalDesc ')' !)
			// ./org.coursera.aiplanning.pddl.g:290:4: '(' ! ':derived' ^ typedVariableList goalDesc ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal185=(Token)match(input,53,FOLLOW_53_in_derivedDef1685); if (state.failed) return retval;
			string_literal186=(Token)match(input,63,FOLLOW_63_in_derivedDef1688); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal186_tree = (Object)adaptor.create(string_literal186);
			root_0 = (Object)adaptor.becomeRoot(string_literal186_tree, root_0);
			}

			pushFollow(FOLLOW_typedVariableList_in_derivedDef1691);
			typedVariableList187=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList187.getTree());

			pushFollow(FOLLOW_goalDesc_in_derivedDef1693);
			goalDesc188=goalDesc();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc188.getTree());

			char_literal189=(Token)match(input,54,FOLLOW_54_in_derivedDef1695); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derivedDef"


	public static class fExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp"
	// ./org.coursera.aiplanning.pddl.g:295:1: fExp : ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead );
	public final pddlParser.fExp_return fExp() throws RecognitionException {
		pddlParser.fExp_return retval = new pddlParser.fExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER190=null;
		Token char_literal191=null;
		Token char_literal195=null;
		Token char_literal196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		ParserRuleReturnScope binaryOp192 =null;
		ParserRuleReturnScope fExp193 =null;
		ParserRuleReturnScope fExp2194 =null;
		ParserRuleReturnScope fExp198 =null;
		ParserRuleReturnScope fHead200 =null;

		Object NUMBER190_tree=null;
		Object char_literal191_tree=null;
		Object char_literal195_tree=null;
		Object char_literal196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_fExp2=new RewriteRuleSubtreeStream(adaptor,"rule fExp2");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");

		try {
			// ./org.coursera.aiplanning.pddl.g:296:2: ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead )
			int alt43=4;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt43=1;
				}
				break;
			case 53:
				{
				int LA43_2 = input.LA(2);
				if ( (synpred55_pddl()) ) {
					alt43=2;
				}
				else if ( (synpred56_pddl()) ) {
					alt43=3;
				}
				else if ( (true) ) {
					alt43=4;
				}

				}
				break;
			case NAME:
				{
				alt43=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:296:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER190=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fExp1710); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER190_tree = (Object)adaptor.create(NUMBER190);
					adaptor.addChild(root_0, NUMBER190_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:297:4: '(' binaryOp fExp fExp2 ')'
					{
					char_literal191=(Token)match(input,53,FOLLOW_53_in_fExp1715); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal191);

					pushFollow(FOLLOW_binaryOp_in_fExp1717);
					binaryOp192=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp192.getTree());
					pushFollow(FOLLOW_fExp_in_fExp1719);
					fExp193=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp193.getTree());
					pushFollow(FOLLOW_fExp2_in_fExp1721);
					fExp2194=fExp2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp2.add(fExp2194.getTree());
					char_literal195=(Token)match(input,54,FOLLOW_54_in_fExp1723); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal195);

					// AST REWRITE
					// elements: fExp2, fExp, binaryOp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 297:32: -> ^( BINARY_OP binaryOp fExp fExp2 )
					{
						// ./org.coursera.aiplanning.pddl.g:297:35: ^( BINARY_OP binaryOp fExp fExp2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_binaryOp.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_1, stream_fExp2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:298:4: '(' '-' fExp ')'
					{
					char_literal196=(Token)match(input,53,FOLLOW_53_in_fExp1740); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal196);

					char_literal197=(Token)match(input,57,FOLLOW_57_in_fExp1742); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal197);

					pushFollow(FOLLOW_fExp_in_fExp1744);
					fExp198=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp198.getTree());
					char_literal199=(Token)match(input,54,FOLLOW_54_in_fExp1746); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal199);

					// AST REWRITE
					// elements: fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 298:21: -> ^( UNARY_MINUS fExp )
					{
						// ./org.coursera.aiplanning.pddl.g:298:24: ^( UNARY_MINUS fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:299:4: fHead
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fHead_in_fExp1759);
					fHead200=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead200.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp"


	public static class fExp2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp2"
	// ./org.coursera.aiplanning.pddl.g:304:1: fExp2 : fExp ;
	public final pddlParser.fExp2_return fExp2() throws RecognitionException {
		pddlParser.fExp2_return retval = new pddlParser.fExp2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fExp201 =null;


		try {
			// ./org.coursera.aiplanning.pddl.g:304:7: ( fExp )
			// ./org.coursera.aiplanning.pddl.g:304:9: fExp
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fExp_in_fExp21771);
			fExp201=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp201.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp2"


	public static class fHead_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fHead"
	// ./org.coursera.aiplanning.pddl.g:306:1: fHead : ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) );
	public final pddlParser.fHead_return fHead() throws RecognitionException {
		pddlParser.fHead_return retval = new pddlParser.fHead_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal202=null;
		Token char_literal205=null;
		ParserRuleReturnScope functionSymbol203 =null;
		ParserRuleReturnScope term204 =null;
		ParserRuleReturnScope functionSymbol206 =null;

		Object char_literal202_tree=null;
		Object char_literal205_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");

		try {
			// ./org.coursera.aiplanning.pddl.g:307:2: ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==53) ) {
				alt45=1;
			}
			else if ( (LA45_0==NAME) ) {
				alt45=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:307:4: '(' functionSymbol ( term )* ')'
					{
					char_literal202=(Token)match(input,53,FOLLOW_53_in_fHead1781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal202);

					pushFollow(FOLLOW_functionSymbol_in_fHead1783);
					functionSymbol203=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol203.getTree());
					// ./org.coursera.aiplanning.pddl.g:307:23: ( term )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==NAME||LA44_0==VARIABLE) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:307:23: term
							{
							pushFollow(FOLLOW_term_in_fHead1785);
							term204=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term204.getTree());
							}
							break;

						default :
							break loop44;
						}
					}

					char_literal205=(Token)match(input,54,FOLLOW_54_in_fHead1788); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal205);

					// AST REWRITE
					// elements: functionSymbol, term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 307:33: -> ^( FUNC_HEAD functionSymbol ( term )* )
					{
						// ./org.coursera.aiplanning.pddl.g:307:36: ^( FUNC_HEAD functionSymbol ( term )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						// ./org.coursera.aiplanning.pddl.g:307:63: ( term )*
						while ( stream_term.hasNext() ) {
							adaptor.addChild(root_1, stream_term.nextTree());
						}
						stream_term.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:308:4: functionSymbol
					{
					pushFollow(FOLLOW_functionSymbol_in_fHead1804);
					functionSymbol206=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol206.getTree());
					// AST REWRITE
					// elements: functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 308:19: -> ^( FUNC_HEAD functionSymbol )
					{
						// ./org.coursera.aiplanning.pddl.g:308:22: ^( FUNC_HEAD functionSymbol )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fHead"


	public static class effect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "effect"
	// ./org.coursera.aiplanning.pddl.g:311:1: effect : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
	public final pddlParser.effect_return effect() throws RecognitionException {
		pddlParser.effect_return retval = new pddlParser.effect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal207=null;
		Token string_literal208=null;
		Token char_literal210=null;
		ParserRuleReturnScope cEffect209 =null;
		ParserRuleReturnScope cEffect211 =null;

		Object char_literal207_tree=null;
		Object string_literal208_tree=null;
		Object char_literal210_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");

		try {
			// ./org.coursera.aiplanning.pddl.g:312:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==53) ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1==87) ) {
					alt47=1;
				}
				else if ( (LA47_1==NAME||LA47_1==88||LA47_1==91||LA47_1==97||LA47_1==101||LA47_1==105||(LA47_1 >= 111 && LA47_1 <= 112)||LA47_1==118) ) {
					alt47=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:312:4: '(' 'and' ( cEffect )* ')'
					{
					char_literal207=(Token)match(input,53,FOLLOW_53_in_effect1823); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal207);

					string_literal208=(Token)match(input,87,FOLLOW_87_in_effect1825); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(string_literal208);

					// ./org.coursera.aiplanning.pddl.g:312:14: ( cEffect )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==53) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:312:14: cEffect
							{
							pushFollow(FOLLOW_cEffect_in_effect1827);
							cEffect209=cEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_cEffect.add(cEffect209.getTree());
							}
							break;

						default :
							break loop46;
						}
					}

					char_literal210=(Token)match(input,54,FOLLOW_54_in_effect1830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal210);

					// AST REWRITE
					// elements: cEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 312:27: -> ^( AND_EFFECT ( cEffect )* )
					{
						// ./org.coursera.aiplanning.pddl.g:312:30: ^( AND_EFFECT ( cEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// ./org.coursera.aiplanning.pddl.g:312:43: ( cEffect )*
						while ( stream_cEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_cEffect.nextTree());
						}
						stream_cEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:313:4: cEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cEffect_in_effect1844);
					cEffect211=cEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect211.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "effect"


	public static class cEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cEffect"
	// ./org.coursera.aiplanning.pddl.g:316:1: cEffect : ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect );
	public final pddlParser.cEffect_return cEffect() throws RecognitionException {
		pddlParser.cEffect_return retval = new pddlParser.cEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal212=null;
		Token string_literal213=null;
		Token char_literal214=null;
		Token char_literal216=null;
		Token char_literal218=null;
		Token char_literal219=null;
		Token string_literal220=null;
		Token char_literal223=null;
		ParserRuleReturnScope typedVariableList215 =null;
		ParserRuleReturnScope effect217 =null;
		ParserRuleReturnScope goalDesc221 =null;
		ParserRuleReturnScope condEffect222 =null;
		ParserRuleReturnScope pEffect224 =null;

		Object char_literal212_tree=null;
		Object string_literal213_tree=null;
		Object char_literal214_tree=null;
		Object char_literal216_tree=null;
		Object char_literal218_tree=null;
		Object char_literal219_tree=null;
		Object string_literal220_tree=null;
		Object char_literal223_tree=null;
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
		RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");

		try {
			// ./org.coursera.aiplanning.pddl.g:317:2: ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect )
			int alt48=3;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==53) ) {
				switch ( input.LA(2) ) {
				case 97:
					{
					alt48=1;
					}
					break;
				case 118:
					{
					alt48=2;
					}
					break;
				case NAME:
				case 88:
				case 91:
				case 101:
				case 105:
				case 111:
				case 112:
					{
					alt48=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:317:4: '(' 'forall' '(' typedVariableList ')' effect ')'
					{
					char_literal212=(Token)match(input,53,FOLLOW_53_in_cEffect1855); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal212);

					string_literal213=(Token)match(input,97,FOLLOW_97_in_cEffect1857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(string_literal213);

					char_literal214=(Token)match(input,53,FOLLOW_53_in_cEffect1859); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal214);

					pushFollow(FOLLOW_typedVariableList_in_cEffect1861);
					typedVariableList215=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList215.getTree());
					char_literal216=(Token)match(input,54,FOLLOW_54_in_cEffect1863); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal216);

					pushFollow(FOLLOW_effect_in_cEffect1865);
					effect217=effect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_effect.add(effect217.getTree());
					char_literal218=(Token)match(input,54,FOLLOW_54_in_cEffect1867); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal218);

					// AST REWRITE
					// elements: typedVariableList, effect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 318:4: -> ^( FORALL_EFFECT typedVariableList effect )
					{
						// ./org.coursera.aiplanning.pddl.g:318:7: ^( FORALL_EFFECT typedVariableList effect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EFFECT, "FORALL_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_effect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:319:4: '(' 'when' goalDesc condEffect ')'
					{
					char_literal219=(Token)match(input,53,FOLLOW_53_in_cEffect1885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal219);

					string_literal220=(Token)match(input,118,FOLLOW_118_in_cEffect1887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_118.add(string_literal220);

					pushFollow(FOLLOW_goalDesc_in_cEffect1889);
					goalDesc221=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc221.getTree());
					pushFollow(FOLLOW_condEffect_in_cEffect1891);
					condEffect222=condEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condEffect.add(condEffect222.getTree());
					char_literal223=(Token)match(input,54,FOLLOW_54_in_cEffect1893); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal223);

					// AST REWRITE
					// elements: goalDesc, condEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 320:4: -> ^( WHEN_EFFECT goalDesc condEffect )
					{
						// ./org.coursera.aiplanning.pddl.g:320:7: ^( WHEN_EFFECT goalDesc condEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EFFECT, "WHEN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_1, stream_condEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:321:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_cEffect1911);
					pEffect224=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect224.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cEffect"


	public static class pEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pEffect"
	// ./org.coursera.aiplanning.pddl.g:324:1: pEffect : ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula );
	public final pddlParser.pEffect_return pEffect() throws RecognitionException {
		pddlParser.pEffect_return retval = new pddlParser.pEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal225=null;
		Token char_literal229=null;
		Token char_literal230=null;
		Token string_literal231=null;
		Token char_literal233=null;
		ParserRuleReturnScope assignOp226 =null;
		ParserRuleReturnScope fHead227 =null;
		ParserRuleReturnScope fExp228 =null;
		ParserRuleReturnScope atomicTermFormula232 =null;
		ParserRuleReturnScope atomicTermFormula234 =null;

		Object char_literal225_tree=null;
		Object char_literal229_tree=null;
		Object char_literal230_tree=null;
		Object string_literal231_tree=null;
		Object char_literal233_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
		RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");

		try {
			// ./org.coursera.aiplanning.pddl.g:325:2: ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula )
			int alt49=3;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==53) ) {
				switch ( input.LA(2) ) {
				case 105:
					{
					alt49=2;
					}
					break;
				case 88:
				case 91:
				case 101:
				case 111:
				case 112:
					{
					alt49=1;
					}
					break;
				case NAME:
					{
					alt49=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:325:4: '(' assignOp fHead fExp ')'
					{
					char_literal225=(Token)match(input,53,FOLLOW_53_in_pEffect1922); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal225);

					pushFollow(FOLLOW_assignOp_in_pEffect1924);
					assignOp226=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOp.add(assignOp226.getTree());
					pushFollow(FOLLOW_fHead_in_pEffect1926);
					fHead227=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead227.getTree());
					pushFollow(FOLLOW_fExp_in_pEffect1928);
					fExp228=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp228.getTree());
					char_literal229=(Token)match(input,54,FOLLOW_54_in_pEffect1930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal229);

					// AST REWRITE
					// elements: fHead, fExp, assignOp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 326:4: -> ^( ASSIGN_EFFECT assignOp fHead fExp )
					{
						// ./org.coursera.aiplanning.pddl.g:326:7: ^( ASSIGN_EFFECT assignOp fHead fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOp.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:327:4: '(' 'not' atomicTermFormula ')'
					{
					char_literal230=(Token)match(input,53,FOLLOW_53_in_pEffect1950); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal230);

					string_literal231=(Token)match(input,105,FOLLOW_105_in_pEffect1952); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal231);

					pushFollow(FOLLOW_atomicTermFormula_in_pEffect1954);
					atomicTermFormula232=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula232.getTree());
					char_literal233=(Token)match(input,54,FOLLOW_54_in_pEffect1956); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal233);

					// AST REWRITE
					// elements: atomicTermFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 328:4: -> ^( NOT_EFFECT atomicTermFormula )
					{
						// ./org.coursera.aiplanning.pddl.g:328:7: ^( NOT_EFFECT atomicTermFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:329:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_pEffect1972);
					atomicTermFormula234=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula234.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pEffect"


	public static class condEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condEffect"
	// ./org.coursera.aiplanning.pddl.g:334:1: condEffect : ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect );
	public final pddlParser.condEffect_return condEffect() throws RecognitionException {
		pddlParser.condEffect_return retval = new pddlParser.condEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal235=null;
		Token string_literal236=null;
		Token char_literal238=null;
		ParserRuleReturnScope pEffect237 =null;
		ParserRuleReturnScope pEffect239 =null;

		Object char_literal235_tree=null;
		Object string_literal236_tree=null;
		Object char_literal238_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_pEffect=new RewriteRuleSubtreeStream(adaptor,"rule pEffect");

		try {
			// ./org.coursera.aiplanning.pddl.g:335:2: ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==53) ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1==87) ) {
					alt51=1;
				}
				else if ( (LA51_1==NAME||LA51_1==88||LA51_1==91||LA51_1==101||LA51_1==105||(LA51_1 >= 111 && LA51_1 <= 112)) ) {
					alt51=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:335:4: '(' 'and' ( pEffect )* ')'
					{
					char_literal235=(Token)match(input,53,FOLLOW_53_in_condEffect1985); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal235);

					string_literal236=(Token)match(input,87,FOLLOW_87_in_condEffect1987); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(string_literal236);

					// ./org.coursera.aiplanning.pddl.g:335:14: ( pEffect )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==53) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:335:14: pEffect
							{
							pushFollow(FOLLOW_pEffect_in_condEffect1989);
							pEffect237=pEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pEffect.add(pEffect237.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					char_literal238=(Token)match(input,54,FOLLOW_54_in_condEffect1992); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal238);

					// AST REWRITE
					// elements: pEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 335:27: -> ^( AND_EFFECT ( pEffect )* )
					{
						// ./org.coursera.aiplanning.pddl.g:335:30: ^( AND_EFFECT ( pEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// ./org.coursera.aiplanning.pddl.g:335:43: ( pEffect )*
						while ( stream_pEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_pEffect.nextTree());
						}
						stream_pEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:336:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_condEffect2006);
					pEffect239=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect239.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condEffect"


	public static class binaryOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryOp"
	// ./org.coursera.aiplanning.pddl.g:340:1: binaryOp : ( '*' | '+' | '-' | '/' );
	public final pddlParser.binaryOp_return binaryOp() throws RecognitionException {
		pddlParser.binaryOp_return retval = new pddlParser.binaryOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set240=null;

		Object set240_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:340:10: ( '*' | '+' | '-' | '/' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set240=input.LT(1);
			if ( (input.LA(1) >= 55 && input.LA(1) <= 58) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryOp"


	public static class binaryComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryComp"
	// ./org.coursera.aiplanning.pddl.g:342:1: binaryComp : ( '>' | '<' | '=' | '>=' | '<=' );
	public final pddlParser.binaryComp_return binaryComp() throws RecognitionException {
		pddlParser.binaryComp_return retval = new pddlParser.binaryComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set241=null;

		Object set241_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:342:12: ( '>' | '<' | '=' | '>=' | '<=' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set241=input.LT(1);
			if ( (input.LA(1) >= 78 && input.LA(1) <= 82) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set241));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryComp"


	public static class assignOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignOp"
	// ./org.coursera.aiplanning.pddl.g:344:1: assignOp : ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' );
	public final pddlParser.assignOp_return assignOp() throws RecognitionException {
		pddlParser.assignOp_return retval = new pddlParser.assignOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set242=null;

		Object set242_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:344:10: ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set242=input.LT(1);
			if ( input.LA(1)==88||input.LA(1)==91||input.LA(1)==101||(input.LA(1) >= 111 && input.LA(1) <= 112) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set242));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignOp"


	public static class durationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durationConstraint"
	// ./org.coursera.aiplanning.pddl.g:349:1: durationConstraint : ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint );
	public final pddlParser.durationConstraint_return durationConstraint() throws RecognitionException {
		pddlParser.durationConstraint_return retval = new pddlParser.durationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal243=null;
		Token string_literal244=null;
		Token char_literal246=null;
		Token char_literal247=null;
		Token char_literal248=null;
		ParserRuleReturnScope simpleDurationConstraint245 =null;
		ParserRuleReturnScope simpleDurationConstraint249 =null;

		Object char_literal243_tree=null;
		Object string_literal244_tree=null;
		Object char_literal246_tree=null;
		Object char_literal247_tree=null;
		Object char_literal248_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:350:2: ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint )
			int alt53=3;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==53) ) {
				switch ( input.LA(2) ) {
				case 87:
					{
					alt53=1;
					}
					break;
				case 54:
					{
					alt53=2;
					}
					break;
				case 79:
				case 80:
				case 82:
				case 89:
					{
					alt53=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:350:4: '(' 'and' ( simpleDurationConstraint )+ ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal243=(Token)match(input,53,FOLLOW_53_in_durationConstraint2093); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal243_tree = (Object)adaptor.create(char_literal243);
					adaptor.addChild(root_0, char_literal243_tree);
					}

					string_literal244=(Token)match(input,87,FOLLOW_87_in_durationConstraint2095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal244_tree = (Object)adaptor.create(string_literal244);
					adaptor.addChild(root_0, string_literal244_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:350:14: ( simpleDurationConstraint )+
					int cnt52=0;
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==53) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:350:14: simpleDurationConstraint
							{
							pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2097);
							simpleDurationConstraint245=simpleDurationConstraint();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint245.getTree());

							}
							break;

						default :
							if ( cnt52 >= 1 ) break loop52;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(52, input);
							throw eee;
						}
						cnt52++;
					}

					char_literal246=(Token)match(input,54,FOLLOW_54_in_durationConstraint2100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal246_tree = (Object)adaptor.create(char_literal246);
					adaptor.addChild(root_0, char_literal246_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:351:4: '(' ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal247=(Token)match(input,53,FOLLOW_53_in_durationConstraint2105); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal247_tree = (Object)adaptor.create(char_literal247);
					adaptor.addChild(root_0, char_literal247_tree);
					}

					char_literal248=(Token)match(input,54,FOLLOW_54_in_durationConstraint2107); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal248_tree = (Object)adaptor.create(char_literal248);
					adaptor.addChild(root_0, char_literal248_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:352:4: simpleDurationConstraint
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2112);
					simpleDurationConstraint249=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint249.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durationConstraint"


	public static class simpleDurationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleDurationConstraint"
	// ./org.coursera.aiplanning.pddl.g:355:1: simpleDurationConstraint : ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' );
	public final pddlParser.simpleDurationConstraint_return simpleDurationConstraint() throws RecognitionException {
		pddlParser.simpleDurationConstraint_return retval = new pddlParser.simpleDurationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal250=null;
		Token string_literal252=null;
		Token char_literal254=null;
		Token char_literal255=null;
		Token string_literal256=null;
		Token char_literal259=null;
		ParserRuleReturnScope durOp251 =null;
		ParserRuleReturnScope durValue253 =null;
		ParserRuleReturnScope timeSpecifier257 =null;
		ParserRuleReturnScope simpleDurationConstraint258 =null;

		Object char_literal250_tree=null;
		Object string_literal252_tree=null;
		Object char_literal254_tree=null;
		Object char_literal255_tree=null;
		Object string_literal256_tree=null;
		Object char_literal259_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:356:2: ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==53) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==89) ) {
					alt54=2;
				}
				else if ( ((LA54_1 >= 79 && LA54_1 <= 80)||LA54_1==82) ) {
					alt54=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:356:4: '(' durOp '?duration' durValue ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal250=(Token)match(input,53,FOLLOW_53_in_simpleDurationConstraint2123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal250_tree = (Object)adaptor.create(char_literal250);
					adaptor.addChild(root_0, char_literal250_tree);
					}

					pushFollow(FOLLOW_durOp_in_simpleDurationConstraint2125);
					durOp251=durOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durOp251.getTree());

					string_literal252=(Token)match(input,83,FOLLOW_83_in_simpleDurationConstraint2127); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal252_tree = (Object)adaptor.create(string_literal252);
					adaptor.addChild(root_0, string_literal252_tree);
					}

					pushFollow(FOLLOW_durValue_in_simpleDurationConstraint2129);
					durValue253=durValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durValue253.getTree());

					char_literal254=(Token)match(input,54,FOLLOW_54_in_simpleDurationConstraint2131); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal254_tree = (Object)adaptor.create(char_literal254);
					adaptor.addChild(root_0, char_literal254_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:357:4: '(' 'at' timeSpecifier simpleDurationConstraint ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal255=(Token)match(input,53,FOLLOW_53_in_simpleDurationConstraint2136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal255_tree = (Object)adaptor.create(char_literal255);
					adaptor.addChild(root_0, char_literal255_tree);
					}

					string_literal256=(Token)match(input,89,FOLLOW_89_in_simpleDurationConstraint2138); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal256_tree = (Object)adaptor.create(string_literal256);
					adaptor.addChild(root_0, string_literal256_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_simpleDurationConstraint2140);
					timeSpecifier257=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier257.getTree());

					pushFollow(FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2142);
					simpleDurationConstraint258=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint258.getTree());

					char_literal259=(Token)match(input,54,FOLLOW_54_in_simpleDurationConstraint2144); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal259_tree = (Object)adaptor.create(char_literal259);
					adaptor.addChild(root_0, char_literal259_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDurationConstraint"


	public static class durOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durOp"
	// ./org.coursera.aiplanning.pddl.g:360:1: durOp : ( '<=' | '>=' | '=' );
	public final pddlParser.durOp_return durOp() throws RecognitionException {
		pddlParser.durOp_return retval = new pddlParser.durOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set260=null;

		Object set260_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:360:7: ( '<=' | '>=' | '=' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set260=input.LT(1);
			if ( (input.LA(1) >= 79 && input.LA(1) <= 80)||input.LA(1)==82 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set260));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durOp"


	public static class durValue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durValue"
	// ./org.coursera.aiplanning.pddl.g:362:1: durValue : ( NUMBER | fExp );
	public final pddlParser.durValue_return durValue() throws RecognitionException {
		pddlParser.durValue_return retval = new pddlParser.durValue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER261=null;
		ParserRuleReturnScope fExp262 =null;

		Object NUMBER261_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:362:10: ( NUMBER | fExp )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==NUMBER) ) {
				int LA55_1 = input.LA(2);
				if ( (synpred84_pddl()) ) {
					alt55=1;
				}
				else if ( (true) ) {
					alt55=2;
				}

			}
			else if ( (LA55_0==NAME||LA55_0==53) ) {
				alt55=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:362:12: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER261=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_durValue2171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER261_tree = (Object)adaptor.create(NUMBER261);
					adaptor.addChild(root_0, NUMBER261_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:362:21: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_durValue2175);
					fExp262=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp262.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durValue"


	public static class daEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daEffect"
	// ./org.coursera.aiplanning.pddl.g:364:1: daEffect : ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' );
	public final pddlParser.daEffect_return daEffect() throws RecognitionException {
		pddlParser.daEffect_return retval = new pddlParser.daEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal263=null;
		Token string_literal264=null;
		Token char_literal266=null;
		Token char_literal268=null;
		Token string_literal269=null;
		Token char_literal270=null;
		Token char_literal272=null;
		Token char_literal274=null;
		Token char_literal275=null;
		Token string_literal276=null;
		Token char_literal279=null;
		Token char_literal280=null;
		Token char_literal284=null;
		ParserRuleReturnScope daEffect265 =null;
		ParserRuleReturnScope timedEffect267 =null;
		ParserRuleReturnScope typedVariableList271 =null;
		ParserRuleReturnScope daEffect273 =null;
		ParserRuleReturnScope daGD277 =null;
		ParserRuleReturnScope timedEffect278 =null;
		ParserRuleReturnScope assignOp281 =null;
		ParserRuleReturnScope fHead282 =null;
		ParserRuleReturnScope fExpDA283 =null;

		Object char_literal263_tree=null;
		Object string_literal264_tree=null;
		Object char_literal266_tree=null;
		Object char_literal268_tree=null;
		Object string_literal269_tree=null;
		Object char_literal270_tree=null;
		Object char_literal272_tree=null;
		Object char_literal274_tree=null;
		Object char_literal275_tree=null;
		Object string_literal276_tree=null;
		Object char_literal279_tree=null;
		Object char_literal280_tree=null;
		Object char_literal284_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:365:2: ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' )
			int alt57=5;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==53) ) {
				int LA57_1 = input.LA(2);
				if ( (synpred86_pddl()) ) {
					alt57=1;
				}
				else if ( (synpred87_pddl()) ) {
					alt57=2;
				}
				else if ( (synpred88_pddl()) ) {
					alt57=3;
				}
				else if ( (synpred89_pddl()) ) {
					alt57=4;
				}
				else if ( (true) ) {
					alt57=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:365:4: '(' 'and' ( daEffect )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal263=(Token)match(input,53,FOLLOW_53_in_daEffect2185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal263_tree = (Object)adaptor.create(char_literal263);
					adaptor.addChild(root_0, char_literal263_tree);
					}

					string_literal264=(Token)match(input,87,FOLLOW_87_in_daEffect2187); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal264_tree = (Object)adaptor.create(string_literal264);
					adaptor.addChild(root_0, string_literal264_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:365:14: ( daEffect )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==53) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:365:14: daEffect
							{
							pushFollow(FOLLOW_daEffect_in_daEffect2189);
							daEffect265=daEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect265.getTree());

							}
							break;

						default :
							break loop56;
						}
					}

					char_literal266=(Token)match(input,54,FOLLOW_54_in_daEffect2192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal266_tree = (Object)adaptor.create(char_literal266);
					adaptor.addChild(root_0, char_literal266_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:366:4: timedEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timedEffect_in_daEffect2197);
					timedEffect267=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect267.getTree());

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:367:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal268=(Token)match(input,53,FOLLOW_53_in_daEffect2202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal268_tree = (Object)adaptor.create(char_literal268);
					adaptor.addChild(root_0, char_literal268_tree);
					}

					string_literal269=(Token)match(input,97,FOLLOW_97_in_daEffect2204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal269_tree = (Object)adaptor.create(string_literal269);
					adaptor.addChild(root_0, string_literal269_tree);
					}

					char_literal270=(Token)match(input,53,FOLLOW_53_in_daEffect2206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal270_tree = (Object)adaptor.create(char_literal270);
					adaptor.addChild(root_0, char_literal270_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_daEffect2208);
					typedVariableList271=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList271.getTree());

					char_literal272=(Token)match(input,54,FOLLOW_54_in_daEffect2210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal272_tree = (Object)adaptor.create(char_literal272);
					adaptor.addChild(root_0, char_literal272_tree);
					}

					pushFollow(FOLLOW_daEffect_in_daEffect2212);
					daEffect273=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect273.getTree());

					char_literal274=(Token)match(input,54,FOLLOW_54_in_daEffect2214); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal274_tree = (Object)adaptor.create(char_literal274);
					adaptor.addChild(root_0, char_literal274_tree);
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:368:4: '(' 'when' daGD timedEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal275=(Token)match(input,53,FOLLOW_53_in_daEffect2219); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal275_tree = (Object)adaptor.create(char_literal275);
					adaptor.addChild(root_0, char_literal275_tree);
					}

					string_literal276=(Token)match(input,118,FOLLOW_118_in_daEffect2221); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal276_tree = (Object)adaptor.create(string_literal276);
					adaptor.addChild(root_0, string_literal276_tree);
					}

					pushFollow(FOLLOW_daGD_in_daEffect2223);
					daGD277=daGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD277.getTree());

					pushFollow(FOLLOW_timedEffect_in_daEffect2225);
					timedEffect278=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect278.getTree());

					char_literal279=(Token)match(input,54,FOLLOW_54_in_daEffect2227); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal279_tree = (Object)adaptor.create(char_literal279);
					adaptor.addChild(root_0, char_literal279_tree);
					}

					}
					break;
				case 5 :
					// ./org.coursera.aiplanning.pddl.g:369:4: '(' assignOp fHead fExpDA ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal280=(Token)match(input,53,FOLLOW_53_in_daEffect2232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal280_tree = (Object)adaptor.create(char_literal280);
					adaptor.addChild(root_0, char_literal280_tree);
					}

					pushFollow(FOLLOW_assignOp_in_daEffect2234);
					assignOp281=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp281.getTree());

					pushFollow(FOLLOW_fHead_in_daEffect2236);
					fHead282=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead282.getTree());

					pushFollow(FOLLOW_fExpDA_in_daEffect2238);
					fExpDA283=fExpDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA283.getTree());

					char_literal284=(Token)match(input,54,FOLLOW_54_in_daEffect2240); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal284_tree = (Object)adaptor.create(char_literal284);
					adaptor.addChild(root_0, char_literal284_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daEffect"


	public static class timedEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedEffect"
	// ./org.coursera.aiplanning.pddl.g:372:1: timedEffect : ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' );
	public final pddlParser.timedEffect_return timedEffect() throws RecognitionException {
		pddlParser.timedEffect_return retval = new pddlParser.timedEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal285=null;
		Token string_literal286=null;
		Token char_literal289=null;
		Token char_literal290=null;
		Token string_literal291=null;
		Token char_literal294=null;
		Token char_literal295=null;
		Token char_literal299=null;
		ParserRuleReturnScope timeSpecifier287 =null;
		ParserRuleReturnScope daEffect288 =null;
		ParserRuleReturnScope timeSpecifier292 =null;
		ParserRuleReturnScope fAssignDA293 =null;
		ParserRuleReturnScope assignOp296 =null;
		ParserRuleReturnScope fHead297 =null;
		ParserRuleReturnScope fExp298 =null;

		Object char_literal285_tree=null;
		Object string_literal286_tree=null;
		Object char_literal289_tree=null;
		Object char_literal290_tree=null;
		Object string_literal291_tree=null;
		Object char_literal294_tree=null;
		Object char_literal295_tree=null;
		Object char_literal299_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:373:2: ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' )
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==53) ) {
				int LA58_1 = input.LA(2);
				if ( (synpred90_pddl()) ) {
					alt58=1;
				}
				else if ( (synpred91_pddl()) ) {
					alt58=2;
				}
				else if ( (true) ) {
					alt58=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:373:4: '(' 'at' timeSpecifier daEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal285=(Token)match(input,53,FOLLOW_53_in_timedEffect2251); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal285_tree = (Object)adaptor.create(char_literal285);
					adaptor.addChild(root_0, char_literal285_tree);
					}

					string_literal286=(Token)match(input,89,FOLLOW_89_in_timedEffect2253); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal286_tree = (Object)adaptor.create(string_literal286);
					adaptor.addChild(root_0, string_literal286_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedEffect2255);
					timeSpecifier287=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier287.getTree());

					pushFollow(FOLLOW_daEffect_in_timedEffect2257);
					daEffect288=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect288.getTree());

					char_literal289=(Token)match(input,54,FOLLOW_54_in_timedEffect2259); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal289_tree = (Object)adaptor.create(char_literal289);
					adaptor.addChild(root_0, char_literal289_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:374:4: '(' 'at' timeSpecifier fAssignDA ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal290=(Token)match(input,53,FOLLOW_53_in_timedEffect2269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = (Object)adaptor.create(char_literal290);
					adaptor.addChild(root_0, char_literal290_tree);
					}

					string_literal291=(Token)match(input,89,FOLLOW_89_in_timedEffect2271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal291_tree = (Object)adaptor.create(string_literal291);
					adaptor.addChild(root_0, string_literal291_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedEffect2273);
					timeSpecifier292=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier292.getTree());

					pushFollow(FOLLOW_fAssignDA_in_timedEffect2275);
					fAssignDA293=fAssignDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fAssignDA293.getTree());

					char_literal294=(Token)match(input,54,FOLLOW_54_in_timedEffect2277); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal294_tree = (Object)adaptor.create(char_literal294);
					adaptor.addChild(root_0, char_literal294_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:375:4: '(' assignOp fHead fExp ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal295=(Token)match(input,53,FOLLOW_53_in_timedEffect2282); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal295_tree = (Object)adaptor.create(char_literal295);
					adaptor.addChild(root_0, char_literal295_tree);
					}

					pushFollow(FOLLOW_assignOp_in_timedEffect2284);
					assignOp296=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp296.getTree());

					pushFollow(FOLLOW_fHead_in_timedEffect2286);
					fHead297=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead297.getTree());

					pushFollow(FOLLOW_fExp_in_timedEffect2288);
					fExp298=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp298.getTree());

					char_literal299=(Token)match(input,54,FOLLOW_54_in_timedEffect2290); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal299_tree = (Object)adaptor.create(char_literal299);
					adaptor.addChild(root_0, char_literal299_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedEffect"


	public static class fAssignDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fAssignDA"
	// ./org.coursera.aiplanning.pddl.g:378:1: fAssignDA : '(' assignOp fHead fExpDA ')' ;
	public final pddlParser.fAssignDA_return fAssignDA() throws RecognitionException {
		pddlParser.fAssignDA_return retval = new pddlParser.fAssignDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal300=null;
		Token char_literal304=null;
		ParserRuleReturnScope assignOp301 =null;
		ParserRuleReturnScope fHead302 =null;
		ParserRuleReturnScope fExpDA303 =null;

		Object char_literal300_tree=null;
		Object char_literal304_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:379:2: ( '(' assignOp fHead fExpDA ')' )
			// ./org.coursera.aiplanning.pddl.g:379:4: '(' assignOp fHead fExpDA ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal300=(Token)match(input,53,FOLLOW_53_in_fAssignDA2310); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal300_tree = (Object)adaptor.create(char_literal300);
			adaptor.addChild(root_0, char_literal300_tree);
			}

			pushFollow(FOLLOW_assignOp_in_fAssignDA2312);
			assignOp301=assignOp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp301.getTree());

			pushFollow(FOLLOW_fHead_in_fAssignDA2314);
			fHead302=fHead();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead302.getTree());

			pushFollow(FOLLOW_fExpDA_in_fAssignDA2316);
			fExpDA303=fExpDA();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA303.getTree());

			char_literal304=(Token)match(input,54,FOLLOW_54_in_fAssignDA2318); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal304_tree = (Object)adaptor.create(char_literal304);
			adaptor.addChild(root_0, char_literal304_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fAssignDA"


	public static class fExpDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExpDA"
	// ./org.coursera.aiplanning.pddl.g:382:1: fExpDA : ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp );
	public final pddlParser.fExpDA_return fExpDA() throws RecognitionException {
		pddlParser.fExpDA_return retval = new pddlParser.fExpDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal305=null;
		Token char_literal309=null;
		Token char_literal311=null;
		Token string_literal312=null;
		ParserRuleReturnScope binaryOp306 =null;
		ParserRuleReturnScope fExpDA307 =null;
		ParserRuleReturnScope fExpDA308 =null;
		ParserRuleReturnScope fExpDA310 =null;
		ParserRuleReturnScope fExp313 =null;

		Object char_literal305_tree=null;
		Object char_literal309_tree=null;
		Object char_literal311_tree=null;
		Object string_literal312_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:383:2: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp )
			int alt60=3;
			switch ( input.LA(1) ) {
			case 53:
				{
				int LA60_1 = input.LA(2);
				if ( (synpred93_pddl()) ) {
					alt60=1;
				}
				else if ( (true) ) {
					alt60=3;
				}

				}
				break;
			case 83:
				{
				alt60=2;
				}
				break;
			case NAME:
			case NUMBER:
				{
				alt60=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:383:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal305=(Token)match(input,53,FOLLOW_53_in_fExpDA2329); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal305_tree = (Object)adaptor.create(char_literal305);
					adaptor.addChild(root_0, char_literal305_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:383:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==57) ) {
						int LA59_1 = input.LA(2);
						if ( (synpred92_pddl()) ) {
							alt59=1;
						}
						else if ( (true) ) {
							alt59=2;
						}

					}
					else if ( ((LA59_0 >= 55 && LA59_0 <= 56)||LA59_0==58) ) {
						alt59=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
							{
							// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
							// ./org.coursera.aiplanning.pddl.g:383:10: binaryOp fExpDA fExpDA
							{
							pushFollow(FOLLOW_binaryOp_in_fExpDA2333);
							binaryOp306=binaryOp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp306.getTree());

							pushFollow(FOLLOW_fExpDA_in_fExpDA2335);
							fExpDA307=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA307.getTree());

							pushFollow(FOLLOW_fExpDA_in_fExpDA2337);
							fExpDA308=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA308.getTree());

							}

							}
							break;
						case 2 :
							// ./org.coursera.aiplanning.pddl.g:383:36: ( '-' fExpDA )
							{
							// ./org.coursera.aiplanning.pddl.g:383:36: ( '-' fExpDA )
							// ./org.coursera.aiplanning.pddl.g:383:37: '-' fExpDA
							{
							char_literal309=(Token)match(input,57,FOLLOW_57_in_fExpDA2343); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal309_tree = (Object)adaptor.create(char_literal309);
							adaptor.addChild(root_0, char_literal309_tree);
							}

							pushFollow(FOLLOW_fExpDA_in_fExpDA2345);
							fExpDA310=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA310.getTree());

							}

							}
							break;

					}

					char_literal311=(Token)match(input,54,FOLLOW_54_in_fExpDA2349); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal311_tree = (Object)adaptor.create(char_literal311);
					adaptor.addChild(root_0, char_literal311_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:384:4: '?duration'
					{
					root_0 = (Object)adaptor.nil();


					string_literal312=(Token)match(input,83,FOLLOW_83_in_fExpDA2354); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal312_tree = (Object)adaptor.create(string_literal312);
					adaptor.addChild(root_0, string_literal312_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:385:4: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_fExpDA2359);
					fExp313=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp313.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExpDA"


	public static class problem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problem"
	// ./org.coursera.aiplanning.pddl.g:390:1: problem : '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) ;
	public final pddlParser.problem_return problem() throws RecognitionException {
		pddlParser.problem_return retval = new pddlParser.problem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal314=null;
		Token string_literal315=null;
		Token char_literal324=null;
		ParserRuleReturnScope problemDecl316 =null;
		ParserRuleReturnScope problemDomain317 =null;
		ParserRuleReturnScope requireDef318 =null;
		ParserRuleReturnScope objectDecl319 =null;
		ParserRuleReturnScope init320 =null;
		ParserRuleReturnScope goal321 =null;
		ParserRuleReturnScope probConstraints322 =null;
		ParserRuleReturnScope metricSpec323 =null;

		Object char_literal314_tree=null;
		Object string_literal315_tree=null;
		Object char_literal324_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_metricSpec=new RewriteRuleSubtreeStream(adaptor,"rule metricSpec");
		RewriteRuleSubtreeStream stream_objectDecl=new RewriteRuleSubtreeStream(adaptor,"rule objectDecl");
		RewriteRuleSubtreeStream stream_problemDecl=new RewriteRuleSubtreeStream(adaptor,"rule problemDecl");
		RewriteRuleSubtreeStream stream_probConstraints=new RewriteRuleSubtreeStream(adaptor,"rule probConstraints");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
		RewriteRuleSubtreeStream stream_problemDomain=new RewriteRuleSubtreeStream(adaptor,"rule problemDomain");
		RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");

		try {
			// ./org.coursera.aiplanning.pddl.g:391:2: ( '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) )
			// ./org.coursera.aiplanning.pddl.g:391:4: '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')'
			{
			char_literal314=(Token)match(input,53,FOLLOW_53_in_problem2373); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal314);

			string_literal315=(Token)match(input,92,FOLLOW_92_in_problem2375); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(string_literal315);

			pushFollow(FOLLOW_problemDecl_in_problem2377);
			problemDecl316=problemDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDecl.add(problemDecl316.getTree());
			pushFollow(FOLLOW_problemDomain_in_problem2382);
			problemDomain317=problemDomain();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDomain.add(problemDomain317.getTree());
			// ./org.coursera.aiplanning.pddl.g:393:7: ( requireDef )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==53) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==76) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:393:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_problem2390);
					requireDef318=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef318.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:394:7: ( objectDecl )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==53) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==72) ) {
					alt62=1;
				}
			}
			switch (alt62) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:394:7: objectDecl
					{
					pushFollow(FOLLOW_objectDecl_in_problem2399);
					objectDecl319=objectDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_objectDecl.add(objectDecl319.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_init_in_problem2408);
			init320=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init.add(init320.getTree());
			pushFollow(FOLLOW_goal_in_problem2416);
			goal321=goal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_goal.add(goal321.getTree());
			// ./org.coursera.aiplanning.pddl.g:397:7: ( probConstraints )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==53) ) {
				int LA63_1 = input.LA(2);
				if ( (LA63_1==62) ) {
					alt63=1;
				}
			}
			switch (alt63) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:397:7: probConstraints
					{
					pushFollow(FOLLOW_probConstraints_in_problem2424);
					probConstraints322=probConstraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_probConstraints.add(probConstraints322.getTree());
					}
					break;

			}

			// ./org.coursera.aiplanning.pddl.g:398:7: ( metricSpec )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==53) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:398:7: metricSpec
					{
					pushFollow(FOLLOW_metricSpec_in_problem2433);
					metricSpec323=metricSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricSpec.add(metricSpec323.getTree());
					}
					break;

			}

			char_literal324=(Token)match(input,54,FOLLOW_54_in_problem2449); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal324);

			// AST REWRITE
			// elements: metricSpec, probConstraints, goal, init, problemDecl, objectDecl, requireDef, problemDomain
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 401:7: -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
			{
				// ./org.coursera.aiplanning.pddl.g:401:10: ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM, "PROBLEM"), root_1);
				adaptor.addChild(root_1, stream_problemDecl.nextTree());
				adaptor.addChild(root_1, stream_problemDomain.nextTree());
				// ./org.coursera.aiplanning.pddl.g:401:46: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// ./org.coursera.aiplanning.pddl.g:401:58: ( objectDecl )?
				if ( stream_objectDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_objectDecl.nextTree());
				}
				stream_objectDecl.reset();

				adaptor.addChild(root_1, stream_init.nextTree());
				adaptor.addChild(root_1, stream_goal.nextTree());
				// ./org.coursera.aiplanning.pddl.g:402:19: ( probConstraints )?
				if ( stream_probConstraints.hasNext() ) {
					adaptor.addChild(root_1, stream_probConstraints.nextTree());
				}
				stream_probConstraints.reset();

				// ./org.coursera.aiplanning.pddl.g:402:36: ( metricSpec )?
				if ( stream_metricSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_metricSpec.nextTree());
				}
				stream_metricSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problem"


	public static class problemDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDecl"
	// ./org.coursera.aiplanning.pddl.g:405:1: problemDecl : '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) ;
	public final pddlParser.problemDecl_return problemDecl() throws RecognitionException {
		pddlParser.problemDecl_return retval = new pddlParser.problemDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal325=null;
		Token string_literal326=null;
		Token NAME327=null;
		Token char_literal328=null;

		Object char_literal325_tree=null;
		Object string_literal326_tree=null;
		Object NAME327_tree=null;
		Object char_literal328_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// ./org.coursera.aiplanning.pddl.g:406:5: ( '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) )
			// ./org.coursera.aiplanning.pddl.g:406:7: '(' 'problem' NAME ')'
			{
			char_literal325=(Token)match(input,53,FOLLOW_53_in_problemDecl2506); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal325);

			string_literal326=(Token)match(input,110,FOLLOW_110_in_problemDecl2508); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_110.add(string_literal326);

			NAME327=(Token)match(input,NAME,FOLLOW_NAME_in_problemDecl2510); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME327);

			char_literal328=(Token)match(input,54,FOLLOW_54_in_problemDecl2512); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal328);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 407:5: -> ^( PROBLEM_NAME NAME )
			{
				// ./org.coursera.aiplanning.pddl.g:407:8: ^( PROBLEM_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_NAME, "PROBLEM_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDecl"


	public static class problemDomain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDomain"
	// ./org.coursera.aiplanning.pddl.g:410:1: problemDomain : '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) ;
	public final pddlParser.problemDomain_return problemDomain() throws RecognitionException {
		pddlParser.problemDomain_return retval = new pddlParser.problemDomain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal329=null;
		Token string_literal330=null;
		Token NAME331=null;
		Token char_literal332=null;

		Object char_literal329_tree=null;
		Object string_literal330_tree=null;
		Object NAME331_tree=null;
		Object char_literal332_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// ./org.coursera.aiplanning.pddl.g:411:2: ( '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) )
			// ./org.coursera.aiplanning.pddl.g:411:4: '(' ':domain' NAME ')'
			{
			char_literal329=(Token)match(input,53,FOLLOW_53_in_problemDomain2538); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal329);

			string_literal330=(Token)match(input,64,FOLLOW_64_in_problemDomain2540); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(string_literal330);

			NAME331=(Token)match(input,NAME,FOLLOW_NAME_in_problemDomain2542); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME331);

			char_literal332=(Token)match(input,54,FOLLOW_54_in_problemDomain2544); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal332);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 412:2: -> ^( PROBLEM_DOMAIN NAME )
			{
				// ./org.coursera.aiplanning.pddl.g:412:5: ^( PROBLEM_DOMAIN NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_DOMAIN, "PROBLEM_DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDomain"


	public static class objectDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "objectDecl"
	// ./org.coursera.aiplanning.pddl.g:415:1: objectDecl : '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) ;
	public final pddlParser.objectDecl_return objectDecl() throws RecognitionException {
		pddlParser.objectDecl_return retval = new pddlParser.objectDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal333=null;
		Token string_literal334=null;
		Token char_literal336=null;
		ParserRuleReturnScope typedNameList335 =null;

		Object char_literal333_tree=null;
		Object string_literal334_tree=null;
		Object char_literal336_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// ./org.coursera.aiplanning.pddl.g:416:2: ( '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) )
			// ./org.coursera.aiplanning.pddl.g:416:4: '(' ':objects' typedNameList ')'
			{
			char_literal333=(Token)match(input,53,FOLLOW_53_in_objectDecl2564); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal333);

			string_literal334=(Token)match(input,72,FOLLOW_72_in_objectDecl2566); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(string_literal334);

			pushFollow(FOLLOW_typedNameList_in_objectDecl2568);
			typedNameList335=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList335.getTree());
			char_literal336=(Token)match(input,54,FOLLOW_54_in_objectDecl2570); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal336);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 417:2: -> ^( OBJECTS typedNameList )
			{
				// ./org.coursera.aiplanning.pddl.g:417:5: ^( OBJECTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECTS, "OBJECTS"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objectDecl"


	public static class init_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "init"
	// ./org.coursera.aiplanning.pddl.g:420:1: init : '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) ;
	public final pddlParser.init_return init() throws RecognitionException {
		pddlParser.init_return retval = new pddlParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal337=null;
		Token string_literal338=null;
		Token char_literal340=null;
		ParserRuleReturnScope initEl339 =null;

		Object char_literal337_tree=null;
		Object string_literal338_tree=null;
		Object char_literal340_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_initEl=new RewriteRuleSubtreeStream(adaptor,"rule initEl");

		try {
			// ./org.coursera.aiplanning.pddl.g:421:2: ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) )
			// ./org.coursera.aiplanning.pddl.g:421:4: '(' ':init' ( initEl )* ')'
			{
			char_literal337=(Token)match(input,53,FOLLOW_53_in_init2590); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal337);

			string_literal338=(Token)match(input,70,FOLLOW_70_in_init2592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_70.add(string_literal338);

			// ./org.coursera.aiplanning.pddl.g:421:16: ( initEl )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==53) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:421:16: initEl
					{
					pushFollow(FOLLOW_initEl_in_init2594);
					initEl339=initEl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initEl.add(initEl339.getTree());
					}
					break;

				default :
					break loop65;
				}
			}

			char_literal340=(Token)match(input,54,FOLLOW_54_in_init2597); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal340);

			// AST REWRITE
			// elements: initEl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 422:2: -> ^( INIT ( initEl )* )
			{
				// ./org.coursera.aiplanning.pddl.g:422:5: ^( INIT ( initEl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
				// ./org.coursera.aiplanning.pddl.g:422:12: ( initEl )*
				while ( stream_initEl.hasNext() ) {
					adaptor.addChild(root_1, stream_initEl.nextTree());
				}
				stream_initEl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init"


	public static class initEl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "initEl"
	// ./org.coursera.aiplanning.pddl.g:425:1: initEl : ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) );
	public final pddlParser.initEl_return initEl() throws RecognitionException {
		pddlParser.initEl_return retval = new pddlParser.initEl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal342=null;
		Token char_literal343=null;
		Token NUMBER345=null;
		Token char_literal346=null;
		Token char_literal347=null;
		Token string_literal348=null;
		Token NUMBER349=null;
		Token char_literal351=null;
		ParserRuleReturnScope nameLiteral341 =null;
		ParserRuleReturnScope fHead344 =null;
		ParserRuleReturnScope nameLiteral350 =null;

		Object char_literal342_tree=null;
		Object char_literal343_tree=null;
		Object NUMBER345_tree=null;
		Object char_literal346_tree=null;
		Object char_literal347_tree=null;
		Object string_literal348_tree=null;
		Object NUMBER349_tree=null;
		Object char_literal351_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_nameLiteral=new RewriteRuleSubtreeStream(adaptor,"rule nameLiteral");

		try {
			// ./org.coursera.aiplanning.pddl.g:426:2: ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) )
			int alt66=3;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==53) ) {
				switch ( input.LA(2) ) {
				case NAME:
				case 105:
					{
					alt66=1;
					}
					break;
				case 80:
					{
					alt66=2;
					}
					break;
				case 89:
					{
					alt66=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:426:4: nameLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nameLiteral_in_initEl2618);
					nameLiteral341=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameLiteral341.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:427:4: '(' '=' fHead NUMBER ')'
					{
					char_literal342=(Token)match(input,53,FOLLOW_53_in_initEl2623); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal342);

					char_literal343=(Token)match(input,80,FOLLOW_80_in_initEl2625); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(char_literal343);

					pushFollow(FOLLOW_fHead_in_initEl2627);
					fHead344=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead344.getTree());
					NUMBER345=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER345);

					char_literal346=(Token)match(input,54,FOLLOW_54_in_initEl2631); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal346);

					// AST REWRITE
					// elements: fHead, NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 427:37: -> ^( INIT_EQ fHead NUMBER )
					{
						// ./org.coursera.aiplanning.pddl.g:427:40: ^( INIT_EQ fHead NUMBER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:428:4: '(' 'at' NUMBER nameLiteral ')'
					{
					char_literal347=(Token)match(input,53,FOLLOW_53_in_initEl2654); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal347);

					string_literal348=(Token)match(input,89,FOLLOW_89_in_initEl2656); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_89.add(string_literal348);

					NUMBER349=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2658); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER349);

					pushFollow(FOLLOW_nameLiteral_in_initEl2660);
					nameLiteral350=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral350.getTree());
					char_literal351=(Token)match(input,54,FOLLOW_54_in_initEl2662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal351);

					// AST REWRITE
					// elements: nameLiteral, NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 428:37: -> ^( INIT_AT NUMBER nameLiteral )
					{
						// ./org.coursera.aiplanning.pddl.g:428:40: ^( INIT_AT NUMBER nameLiteral )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_AT, "INIT_AT"), root_1);
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_1, stream_nameLiteral.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initEl"


	public static class nameLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nameLiteral"
	// ./org.coursera.aiplanning.pddl.g:431:1: nameLiteral : ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) );
	public final pddlParser.nameLiteral_return nameLiteral() throws RecognitionException {
		pddlParser.nameLiteral_return retval = new pddlParser.nameLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal353=null;
		Token string_literal354=null;
		Token char_literal356=null;
		ParserRuleReturnScope atomicNameFormula352 =null;
		ParserRuleReturnScope atomicNameFormula355 =null;

		Object char_literal353_tree=null;
		Object string_literal354_tree=null;
		Object char_literal356_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");

		try {
			// ./org.coursera.aiplanning.pddl.g:432:2: ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==53) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==105) ) {
					alt67=2;
				}
				else if ( (LA67_1==NAME) ) {
					alt67=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:432:4: atomicNameFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2684);
					atomicNameFormula352=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicNameFormula352.getTree());

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:433:4: '(' 'not' atomicNameFormula ')'
					{
					char_literal353=(Token)match(input,53,FOLLOW_53_in_nameLiteral2689); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal353);

					string_literal354=(Token)match(input,105,FOLLOW_105_in_nameLiteral2691); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal354);

					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2693);
					atomicNameFormula355=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula355.getTree());
					char_literal356=(Token)match(input,54,FOLLOW_54_in_nameLiteral2695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal356);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 433:36: -> ^( NOT_PRED_INIT atomicNameFormula )
					{
						// ./org.coursera.aiplanning.pddl.g:433:39: ^( NOT_PRED_INIT atomicNameFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_PRED_INIT, "NOT_PRED_INIT"), root_1);
						adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameLiteral"


	public static class atomicNameFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicNameFormula"
	// ./org.coursera.aiplanning.pddl.g:436:1: atomicNameFormula : '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) ;
	public final pddlParser.atomicNameFormula_return atomicNameFormula() throws RecognitionException {
		pddlParser.atomicNameFormula_return retval = new pddlParser.atomicNameFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal357=null;
		Token NAME359=null;
		Token char_literal360=null;
		ParserRuleReturnScope predicate358 =null;

		Object char_literal357_tree=null;
		Object NAME359_tree=null;
		Object char_literal360_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// ./org.coursera.aiplanning.pddl.g:437:2: ( '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) )
			// ./org.coursera.aiplanning.pddl.g:437:4: '(' predicate ( NAME )* ')'
			{
			char_literal357=(Token)match(input,53,FOLLOW_53_in_atomicNameFormula2714); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal357);

			pushFollow(FOLLOW_predicate_in_atomicNameFormula2716);
			predicate358=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate358.getTree());
			// ./org.coursera.aiplanning.pddl.g:437:18: ( NAME )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==NAME) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:437:18: NAME
					{
					NAME359=(Token)match(input,NAME,FOLLOW_NAME_in_atomicNameFormula2718); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME359);

					}
					break;

				default :
					break loop68;
				}
			}

			char_literal360=(Token)match(input,54,FOLLOW_54_in_atomicNameFormula2721); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal360);

			// AST REWRITE
			// elements: NAME, predicate
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 437:28: -> ^( PRED_INST predicate ( NAME )* )
			{
				// ./org.coursera.aiplanning.pddl.g:437:31: ^( PRED_INST predicate ( NAME )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_INST, "PRED_INST"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// ./org.coursera.aiplanning.pddl.g:437:53: ( NAME )*
				while ( stream_NAME.hasNext() ) {
					adaptor.addChild(root_1, stream_NAME.nextNode());
				}
				stream_NAME.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicNameFormula"


	public static class goal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "goal"
	// ./org.coursera.aiplanning.pddl.g:444:1: goal : '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) ;
	public final pddlParser.goal_return goal() throws RecognitionException {
		pddlParser.goal_return retval = new pddlParser.goal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal361=null;
		Token string_literal362=null;
		Token char_literal364=null;
		ParserRuleReturnScope goalDesc363 =null;

		Object char_literal361_tree=null;
		Object string_literal362_tree=null;
		Object char_literal364_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");

		try {
			// ./org.coursera.aiplanning.pddl.g:444:6: ( '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) )
			// ./org.coursera.aiplanning.pddl.g:444:8: '(' ':goal' goalDesc ')'
			{
			char_literal361=(Token)match(input,53,FOLLOW_53_in_goal2746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal361);

			string_literal362=(Token)match(input,69,FOLLOW_69_in_goal2748); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal362);

			pushFollow(FOLLOW_goalDesc_in_goal2750);
			goalDesc363=goalDesc();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc363.getTree());
			char_literal364=(Token)match(input,54,FOLLOW_54_in_goal2752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal364);

			// AST REWRITE
			// elements: goalDesc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 444:33: -> ^( GOAL goalDesc )
			{
				// ./org.coursera.aiplanning.pddl.g:444:36: ^( GOAL goalDesc )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOAL, "GOAL"), root_1);
				adaptor.addChild(root_1, stream_goalDesc.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "goal"


	public static class probConstraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "probConstraints"
	// ./org.coursera.aiplanning.pddl.g:446:1: probConstraints : '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) ;
	public final pddlParser.probConstraints_return probConstraints() throws RecognitionException {
		pddlParser.probConstraints_return retval = new pddlParser.probConstraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal365=null;
		Token string_literal366=null;
		Token char_literal368=null;
		ParserRuleReturnScope prefConGD367 =null;

		Object char_literal365_tree=null;
		Object string_literal366_tree=null;
		Object char_literal368_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_prefConGD=new RewriteRuleSubtreeStream(adaptor,"rule prefConGD");

		try {
			// ./org.coursera.aiplanning.pddl.g:447:2: ( '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) )
			// ./org.coursera.aiplanning.pddl.g:447:4: '(' ':constraints' prefConGD ')'
			{
			char_literal365=(Token)match(input,53,FOLLOW_53_in_probConstraints2770); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal365);

			string_literal366=(Token)match(input,62,FOLLOW_62_in_probConstraints2772); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal366);

			pushFollow(FOLLOW_prefConGD_in_probConstraints2775);
			prefConGD367=prefConGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_prefConGD.add(prefConGD367.getTree());
			char_literal368=(Token)match(input,54,FOLLOW_54_in_probConstraints2777); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal368);

			// AST REWRITE
			// elements: prefConGD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 448:4: -> ^( PROBLEM_CONSTRAINT prefConGD )
			{
				// ./org.coursera.aiplanning.pddl.g:448:7: ^( PROBLEM_CONSTRAINT prefConGD )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_CONSTRAINT, "PROBLEM_CONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_prefConGD.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "probConstraints"


	public static class prefConGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefConGD"
	// ./org.coursera.aiplanning.pddl.g:451:1: prefConGD : ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD );
	public final pddlParser.prefConGD_return prefConGD() throws RecognitionException {
		pddlParser.prefConGD_return retval = new pddlParser.prefConGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal369=null;
		Token string_literal370=null;
		Token char_literal372=null;
		Token char_literal373=null;
		Token string_literal374=null;
		Token char_literal375=null;
		Token char_literal377=null;
		Token char_literal379=null;
		Token char_literal380=null;
		Token string_literal381=null;
		Token NAME382=null;
		Token char_literal384=null;
		ParserRuleReturnScope prefConGD371 =null;
		ParserRuleReturnScope typedVariableList376 =null;
		ParserRuleReturnScope prefConGD378 =null;
		ParserRuleReturnScope conGD383 =null;
		ParserRuleReturnScope conGD385 =null;

		Object char_literal369_tree=null;
		Object string_literal370_tree=null;
		Object char_literal372_tree=null;
		Object char_literal373_tree=null;
		Object string_literal374_tree=null;
		Object char_literal375_tree=null;
		Object char_literal377_tree=null;
		Object char_literal379_tree=null;
		Object char_literal380_tree=null;
		Object string_literal381_tree=null;
		Object NAME382_tree=null;
		Object char_literal384_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:452:2: ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD )
			int alt71=4;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==53) ) {
				int LA71_1 = input.LA(2);
				if ( (synpred105_pddl()) ) {
					alt71=1;
				}
				else if ( (synpred106_pddl()) ) {
					alt71=2;
				}
				else if ( (synpred108_pddl()) ) {
					alt71=3;
				}
				else if ( (true) ) {
					alt71=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:452:4: '(' 'and' ( prefConGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal369=(Token)match(input,53,FOLLOW_53_in_prefConGD2799); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal369_tree = (Object)adaptor.create(char_literal369);
					adaptor.addChild(root_0, char_literal369_tree);
					}

					string_literal370=(Token)match(input,87,FOLLOW_87_in_prefConGD2801); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal370_tree = (Object)adaptor.create(string_literal370);
					adaptor.addChild(root_0, string_literal370_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:452:14: ( prefConGD )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==53) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:452:14: prefConGD
							{
							pushFollow(FOLLOW_prefConGD_in_prefConGD2803);
							prefConGD371=prefConGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD371.getTree());

							}
							break;

						default :
							break loop69;
						}
					}

					char_literal372=(Token)match(input,54,FOLLOW_54_in_prefConGD2806); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal372_tree = (Object)adaptor.create(char_literal372);
					adaptor.addChild(root_0, char_literal372_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:453:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal373=(Token)match(input,53,FOLLOW_53_in_prefConGD2811); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal373_tree = (Object)adaptor.create(char_literal373);
					adaptor.addChild(root_0, char_literal373_tree);
					}

					string_literal374=(Token)match(input,97,FOLLOW_97_in_prefConGD2813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal374_tree = (Object)adaptor.create(string_literal374);
					adaptor.addChild(root_0, string_literal374_tree);
					}

					char_literal375=(Token)match(input,53,FOLLOW_53_in_prefConGD2815); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal375_tree = (Object)adaptor.create(char_literal375);
					adaptor.addChild(root_0, char_literal375_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_prefConGD2817);
					typedVariableList376=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList376.getTree());

					char_literal377=(Token)match(input,54,FOLLOW_54_in_prefConGD2819); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal377_tree = (Object)adaptor.create(char_literal377);
					adaptor.addChild(root_0, char_literal377_tree);
					}

					pushFollow(FOLLOW_prefConGD_in_prefConGD2821);
					prefConGD378=prefConGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD378.getTree());

					char_literal379=(Token)match(input,54,FOLLOW_54_in_prefConGD2823); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal379_tree = (Object)adaptor.create(char_literal379);
					adaptor.addChild(root_0, char_literal379_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:454:4: '(' 'preference' ( NAME )? conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal380=(Token)match(input,53,FOLLOW_53_in_prefConGD2828); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal380_tree = (Object)adaptor.create(char_literal380);
					adaptor.addChild(root_0, char_literal380_tree);
					}

					string_literal381=(Token)match(input,109,FOLLOW_109_in_prefConGD2830); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal381_tree = (Object)adaptor.create(string_literal381);
					adaptor.addChild(root_0, string_literal381_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:454:21: ( NAME )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==NAME) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:454:21: NAME
							{
							NAME382=(Token)match(input,NAME,FOLLOW_NAME_in_prefConGD2832); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME382_tree = (Object)adaptor.create(NAME382);
							adaptor.addChild(root_0, NAME382_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_conGD_in_prefConGD2835);
					conGD383=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD383.getTree());

					char_literal384=(Token)match(input,54,FOLLOW_54_in_prefConGD2837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal384_tree = (Object)adaptor.create(char_literal384);
					adaptor.addChild(root_0, char_literal384_tree);
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:455:4: conGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conGD_in_prefConGD2842);
					conGD385=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD385.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefConGD"


	public static class metricSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricSpec"
	// ./org.coursera.aiplanning.pddl.g:458:1: metricSpec : '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) ;
	public final pddlParser.metricSpec_return metricSpec() throws RecognitionException {
		pddlParser.metricSpec_return retval = new pddlParser.metricSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal386=null;
		Token string_literal387=null;
		Token char_literal390=null;
		ParserRuleReturnScope optimization388 =null;
		ParserRuleReturnScope metricFExp389 =null;

		Object char_literal386_tree=null;
		Object string_literal387_tree=null;
		Object char_literal390_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_optimization=new RewriteRuleSubtreeStream(adaptor,"rule optimization");
		RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");

		try {
			// ./org.coursera.aiplanning.pddl.g:459:2: ( '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) )
			// ./org.coursera.aiplanning.pddl.g:459:4: '(' ':metric' optimization metricFExp ')'
			{
			char_literal386=(Token)match(input,53,FOLLOW_53_in_metricSpec2853); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(char_literal386);

			string_literal387=(Token)match(input,71,FOLLOW_71_in_metricSpec2855); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(string_literal387);

			pushFollow(FOLLOW_optimization_in_metricSpec2857);
			optimization388=optimization();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_optimization.add(optimization388.getTree());
			pushFollow(FOLLOW_metricFExp_in_metricSpec2859);
			metricFExp389=metricFExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp389.getTree());
			char_literal390=(Token)match(input,54,FOLLOW_54_in_metricSpec2861); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(char_literal390);

			// AST REWRITE
			// elements: optimization, metricFExp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 460:4: -> ^( PROBLEM_METRIC optimization metricFExp )
			{
				// ./org.coursera.aiplanning.pddl.g:460:7: ^( PROBLEM_METRIC optimization metricFExp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_METRIC, "PROBLEM_METRIC"), root_1);
				adaptor.addChild(root_1, stream_optimization.nextTree());
				adaptor.addChild(root_1, stream_metricFExp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricSpec"


	public static class optimization_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optimization"
	// ./org.coursera.aiplanning.pddl.g:463:1: optimization : ( 'minimize' | 'maximize' );
	public final pddlParser.optimization_return optimization() throws RecognitionException {
		pddlParser.optimization_return retval = new pddlParser.optimization_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set391=null;

		Object set391_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:463:14: ( 'minimize' | 'maximize' )
			// ./org.coursera.aiplanning.pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set391=input.LT(1);
			if ( (input.LA(1) >= 103 && input.LA(1) <= 104) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set391));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optimization"


	public static class metricFExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricFExp"
	// ./org.coursera.aiplanning.pddl.g:465:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' );
	public final pddlParser.metricFExp_return metricFExp() throws RecognitionException {
		pddlParser.metricFExp_return retval = new pddlParser.metricFExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal392=null;
		Token char_literal396=null;
		Token char_literal397=null;
		Token set398=null;
		Token char_literal401=null;
		Token char_literal402=null;
		Token char_literal403=null;
		Token char_literal405=null;
		Token NUMBER406=null;
		Token char_literal407=null;
		Token NAME409=null;
		Token char_literal410=null;
		Token string_literal412=null;
		Token char_literal413=null;
		Token string_literal414=null;
		Token NAME415=null;
		Token char_literal416=null;
		ParserRuleReturnScope binaryOp393 =null;
		ParserRuleReturnScope metricFExp394 =null;
		ParserRuleReturnScope metricFExp395 =null;
		ParserRuleReturnScope metricFExp399 =null;
		ParserRuleReturnScope metricFExp400 =null;
		ParserRuleReturnScope metricFExp404 =null;
		ParserRuleReturnScope functionSymbol408 =null;
		ParserRuleReturnScope functionSymbol411 =null;

		Object char_literal392_tree=null;
		Object char_literal396_tree=null;
		Object char_literal397_tree=null;
		Object set398_tree=null;
		Object char_literal401_tree=null;
		Object char_literal402_tree=null;
		Object char_literal403_tree=null;
		Object char_literal405_tree=null;
		Object NUMBER406_tree=null;
		Object char_literal407_tree=null;
		Object NAME409_tree=null;
		Object char_literal410_tree=null;
		Object string_literal412_tree=null;
		Object char_literal413_tree=null;
		Object string_literal414_tree=null;
		Object NAME415_tree=null;
		Object char_literal416_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:466:2: ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' )
			int alt74=8;
			switch ( input.LA(1) ) {
			case 53:
				{
				int LA74_1 = input.LA(2);
				if ( (synpred110_pddl()) ) {
					alt74=1;
				}
				else if ( (synpred113_pddl()) ) {
					alt74=2;
				}
				else if ( (synpred114_pddl()) ) {
					alt74=3;
				}
				else if ( (synpred117_pddl()) ) {
					alt74=5;
				}
				else if ( (true) ) {
					alt74=8;
				}

				}
				break;
			case NUMBER:
				{
				alt74=4;
				}
				break;
			case NAME:
				{
				alt74=6;
				}
				break;
			case 117:
				{
				alt74=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:466:4: '(' binaryOp metricFExp metricFExp ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal392=(Token)match(input,53,FOLLOW_53_in_metricFExp2898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal392_tree = (Object)adaptor.create(char_literal392);
					adaptor.addChild(root_0, char_literal392_tree);
					}

					pushFollow(FOLLOW_binaryOp_in_metricFExp2900);
					binaryOp393=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp393.getTree());

					pushFollow(FOLLOW_metricFExp_in_metricFExp2902);
					metricFExp394=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp394.getTree());

					pushFollow(FOLLOW_metricFExp_in_metricFExp2904);
					metricFExp395=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp395.getTree());

					char_literal396=(Token)match(input,54,FOLLOW_54_in_metricFExp2906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal396_tree = (Object)adaptor.create(char_literal396);
					adaptor.addChild(root_0, char_literal396_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:467:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal397=(Token)match(input,53,FOLLOW_53_in_metricFExp2911); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal397_tree = (Object)adaptor.create(char_literal397);
					adaptor.addChild(root_0, char_literal397_tree);
					}

					set398=input.LT(1);
					if ( input.LA(1)==55||input.LA(1)==58 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set398));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_metricFExp_in_metricFExp2919);
					metricFExp399=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp399.getTree());

					// ./org.coursera.aiplanning.pddl.g:467:29: ( metricFExp )+
					int cnt72=0;
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==NAME||LA72_0==NUMBER||LA72_0==53||LA72_0==117) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:467:29: metricFExp
							{
							pushFollow(FOLLOW_metricFExp_in_metricFExp2921);
							metricFExp400=metricFExp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp400.getTree());

							}
							break;

						default :
							if ( cnt72 >= 1 ) break loop72;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(72, input);
							throw eee;
						}
						cnt72++;
					}

					char_literal401=(Token)match(input,54,FOLLOW_54_in_metricFExp2924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal401_tree = (Object)adaptor.create(char_literal401);
					adaptor.addChild(root_0, char_literal401_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:468:4: '(' '-' metricFExp ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal402=(Token)match(input,53,FOLLOW_53_in_metricFExp2929); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal402_tree = (Object)adaptor.create(char_literal402);
					adaptor.addChild(root_0, char_literal402_tree);
					}

					char_literal403=(Token)match(input,57,FOLLOW_57_in_metricFExp2931); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal403_tree = (Object)adaptor.create(char_literal403);
					adaptor.addChild(root_0, char_literal403_tree);
					}

					pushFollow(FOLLOW_metricFExp_in_metricFExp2933);
					metricFExp404=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp404.getTree());

					char_literal405=(Token)match(input,54,FOLLOW_54_in_metricFExp2935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal405_tree = (Object)adaptor.create(char_literal405);
					adaptor.addChild(root_0, char_literal405_tree);
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:469:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER406=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metricFExp2940); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER406_tree = (Object)adaptor.create(NUMBER406);
					adaptor.addChild(root_0, NUMBER406_tree);
					}

					}
					break;
				case 5 :
					// ./org.coursera.aiplanning.pddl.g:470:4: '(' functionSymbol ( NAME )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal407=(Token)match(input,53,FOLLOW_53_in_metricFExp2945); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal407_tree = (Object)adaptor.create(char_literal407);
					adaptor.addChild(root_0, char_literal407_tree);
					}

					pushFollow(FOLLOW_functionSymbol_in_metricFExp2947);
					functionSymbol408=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol408.getTree());

					// ./org.coursera.aiplanning.pddl.g:470:23: ( NAME )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==NAME) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:470:23: NAME
							{
							NAME409=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp2949); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME409_tree = (Object)adaptor.create(NAME409);
							adaptor.addChild(root_0, NAME409_tree);
							}

							}
							break;

						default :
							break loop73;
						}
					}

					char_literal410=(Token)match(input,54,FOLLOW_54_in_metricFExp2952); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal410_tree = (Object)adaptor.create(char_literal410);
					adaptor.addChild(root_0, char_literal410_tree);
					}

					}
					break;
				case 6 :
					// ./org.coursera.aiplanning.pddl.g:471:4: functionSymbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionSymbol_in_metricFExp2957);
					functionSymbol411=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol411.getTree());

					}
					break;
				case 7 :
					// ./org.coursera.aiplanning.pddl.g:472:7: 'total-time'
					{
					root_0 = (Object)adaptor.nil();


					string_literal412=(Token)match(input,117,FOLLOW_117_in_metricFExp2965); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal412_tree = (Object)adaptor.create(string_literal412);
					adaptor.addChild(root_0, string_literal412_tree);
					}

					}
					break;
				case 8 :
					// ./org.coursera.aiplanning.pddl.g:473:4: '(' 'is-violated' NAME ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal413=(Token)match(input,53,FOLLOW_53_in_metricFExp2970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal413_tree = (Object)adaptor.create(char_literal413);
					adaptor.addChild(root_0, char_literal413_tree);
					}

					string_literal414=(Token)match(input,102,FOLLOW_102_in_metricFExp2972); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal414_tree = (Object)adaptor.create(string_literal414);
					adaptor.addChild(root_0, string_literal414_tree);
					}

					NAME415=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp2974); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAME415_tree = (Object)adaptor.create(NAME415);
					adaptor.addChild(root_0, NAME415_tree);
					}

					char_literal416=(Token)match(input,54,FOLLOW_54_in_metricFExp2976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal416_tree = (Object)adaptor.create(char_literal416);
					adaptor.addChild(root_0, char_literal416_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricFExp"


	public static class conGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conGD"
	// ./org.coursera.aiplanning.pddl.g:478:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );
	public final pddlParser.conGD_return conGD() throws RecognitionException {
		pddlParser.conGD_return retval = new pddlParser.conGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal417=null;
		Token string_literal418=null;
		Token char_literal420=null;
		Token char_literal421=null;
		Token string_literal422=null;
		Token char_literal423=null;
		Token char_literal425=null;
		Token char_literal427=null;
		Token char_literal428=null;
		Token string_literal429=null;
		Token string_literal430=null;
		Token char_literal432=null;
		Token char_literal433=null;
		Token string_literal434=null;
		Token char_literal436=null;
		Token char_literal437=null;
		Token string_literal438=null;
		Token char_literal440=null;
		Token char_literal441=null;
		Token string_literal442=null;
		Token NUMBER443=null;
		Token char_literal445=null;
		Token char_literal446=null;
		Token string_literal447=null;
		Token char_literal449=null;
		Token char_literal450=null;
		Token string_literal451=null;
		Token char_literal454=null;
		Token char_literal455=null;
		Token string_literal456=null;
		Token char_literal459=null;
		Token char_literal460=null;
		Token string_literal461=null;
		Token NUMBER462=null;
		Token char_literal465=null;
		Token char_literal466=null;
		Token string_literal467=null;
		Token NUMBER468=null;
		Token NUMBER469=null;
		Token char_literal471=null;
		Token char_literal472=null;
		Token string_literal473=null;
		Token NUMBER474=null;
		Token char_literal476=null;
		ParserRuleReturnScope conGD419 =null;
		ParserRuleReturnScope typedVariableList424 =null;
		ParserRuleReturnScope conGD426 =null;
		ParserRuleReturnScope goalDesc431 =null;
		ParserRuleReturnScope goalDesc435 =null;
		ParserRuleReturnScope goalDesc439 =null;
		ParserRuleReturnScope goalDesc444 =null;
		ParserRuleReturnScope goalDesc448 =null;
		ParserRuleReturnScope goalDesc452 =null;
		ParserRuleReturnScope goalDesc453 =null;
		ParserRuleReturnScope goalDesc457 =null;
		ParserRuleReturnScope goalDesc458 =null;
		ParserRuleReturnScope goalDesc463 =null;
		ParserRuleReturnScope goalDesc464 =null;
		ParserRuleReturnScope goalDesc470 =null;
		ParserRuleReturnScope goalDesc475 =null;

		Object char_literal417_tree=null;
		Object string_literal418_tree=null;
		Object char_literal420_tree=null;
		Object char_literal421_tree=null;
		Object string_literal422_tree=null;
		Object char_literal423_tree=null;
		Object char_literal425_tree=null;
		Object char_literal427_tree=null;
		Object char_literal428_tree=null;
		Object string_literal429_tree=null;
		Object string_literal430_tree=null;
		Object char_literal432_tree=null;
		Object char_literal433_tree=null;
		Object string_literal434_tree=null;
		Object char_literal436_tree=null;
		Object char_literal437_tree=null;
		Object string_literal438_tree=null;
		Object char_literal440_tree=null;
		Object char_literal441_tree=null;
		Object string_literal442_tree=null;
		Object NUMBER443_tree=null;
		Object char_literal445_tree=null;
		Object char_literal446_tree=null;
		Object string_literal447_tree=null;
		Object char_literal449_tree=null;
		Object char_literal450_tree=null;
		Object string_literal451_tree=null;
		Object char_literal454_tree=null;
		Object char_literal455_tree=null;
		Object string_literal456_tree=null;
		Object char_literal459_tree=null;
		Object char_literal460_tree=null;
		Object string_literal461_tree=null;
		Object NUMBER462_tree=null;
		Object char_literal465_tree=null;
		Object char_literal466_tree=null;
		Object string_literal467_tree=null;
		Object NUMBER468_tree=null;
		Object NUMBER469_tree=null;
		Object char_literal471_tree=null;
		Object char_literal472_tree=null;
		Object string_literal473_tree=null;
		Object NUMBER474_tree=null;
		Object char_literal476_tree=null;

		try {
			// ./org.coursera.aiplanning.pddl.g:479:2: ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' )
			int alt76=12;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==53) ) {
				switch ( input.LA(2) ) {
				case 87:
					{
					alt76=1;
					}
					break;
				case 97:
					{
					alt76=2;
					}
					break;
				case 89:
					{
					alt76=3;
					}
					break;
				case 85:
					{
					alt76=4;
					}
					break;
				case 113:
					{
					alt76=5;
					}
					break;
				case 119:
					{
					alt76=6;
					}
					break;
				case 90:
					{
					alt76=7;
					}
					break;
				case 114:
					{
					alt76=8;
					}
					break;
				case 115:
					{
					alt76=9;
					}
					break;
				case 86:
					{
					alt76=10;
					}
					break;
				case 99:
					{
					alt76=11;
					}
					break;
				case 98:
					{
					alt76=12;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// ./org.coursera.aiplanning.pddl.g:479:4: '(' 'and' ( conGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal417=(Token)match(input,53,FOLLOW_53_in_conGD2990); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal417_tree = (Object)adaptor.create(char_literal417);
					adaptor.addChild(root_0, char_literal417_tree);
					}

					string_literal418=(Token)match(input,87,FOLLOW_87_in_conGD2992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal418_tree = (Object)adaptor.create(string_literal418);
					adaptor.addChild(root_0, string_literal418_tree);
					}

					// ./org.coursera.aiplanning.pddl.g:479:14: ( conGD )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==53) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// ./org.coursera.aiplanning.pddl.g:479:14: conGD
							{
							pushFollow(FOLLOW_conGD_in_conGD2994);
							conGD419=conGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD419.getTree());

							}
							break;

						default :
							break loop75;
						}
					}

					char_literal420=(Token)match(input,54,FOLLOW_54_in_conGD2997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal420_tree = (Object)adaptor.create(char_literal420);
					adaptor.addChild(root_0, char_literal420_tree);
					}

					}
					break;
				case 2 :
					// ./org.coursera.aiplanning.pddl.g:480:4: '(' 'forall' '(' typedVariableList ')' conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal421=(Token)match(input,53,FOLLOW_53_in_conGD3002); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal421_tree = (Object)adaptor.create(char_literal421);
					adaptor.addChild(root_0, char_literal421_tree);
					}

					string_literal422=(Token)match(input,97,FOLLOW_97_in_conGD3004); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal422_tree = (Object)adaptor.create(string_literal422);
					adaptor.addChild(root_0, string_literal422_tree);
					}

					char_literal423=(Token)match(input,53,FOLLOW_53_in_conGD3006); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal423_tree = (Object)adaptor.create(char_literal423);
					adaptor.addChild(root_0, char_literal423_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_conGD3008);
					typedVariableList424=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList424.getTree());

					char_literal425=(Token)match(input,54,FOLLOW_54_in_conGD3010); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal425_tree = (Object)adaptor.create(char_literal425);
					adaptor.addChild(root_0, char_literal425_tree);
					}

					pushFollow(FOLLOW_conGD_in_conGD3012);
					conGD426=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD426.getTree());

					char_literal427=(Token)match(input,54,FOLLOW_54_in_conGD3014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal427_tree = (Object)adaptor.create(char_literal427);
					adaptor.addChild(root_0, char_literal427_tree);
					}

					}
					break;
				case 3 :
					// ./org.coursera.aiplanning.pddl.g:481:4: '(' 'at' 'end' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal428=(Token)match(input,53,FOLLOW_53_in_conGD3019); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal428_tree = (Object)adaptor.create(char_literal428);
					adaptor.addChild(root_0, char_literal428_tree);
					}

					string_literal429=(Token)match(input,89,FOLLOW_89_in_conGD3021); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal429_tree = (Object)adaptor.create(string_literal429);
					adaptor.addChild(root_0, string_literal429_tree);
					}

					string_literal430=(Token)match(input,95,FOLLOW_95_in_conGD3023); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal430_tree = (Object)adaptor.create(string_literal430);
					adaptor.addChild(root_0, string_literal430_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3025);
					goalDesc431=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc431.getTree());

					char_literal432=(Token)match(input,54,FOLLOW_54_in_conGD3027); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal432_tree = (Object)adaptor.create(char_literal432);
					adaptor.addChild(root_0, char_literal432_tree);
					}

					}
					break;
				case 4 :
					// ./org.coursera.aiplanning.pddl.g:482:7: '(' 'always' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal433=(Token)match(input,53,FOLLOW_53_in_conGD3035); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal433_tree = (Object)adaptor.create(char_literal433);
					adaptor.addChild(root_0, char_literal433_tree);
					}

					string_literal434=(Token)match(input,85,FOLLOW_85_in_conGD3037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal434_tree = (Object)adaptor.create(string_literal434);
					adaptor.addChild(root_0, string_literal434_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3039);
					goalDesc435=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc435.getTree());

					char_literal436=(Token)match(input,54,FOLLOW_54_in_conGD3041); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal436_tree = (Object)adaptor.create(char_literal436);
					adaptor.addChild(root_0, char_literal436_tree);
					}

					}
					break;
				case 5 :
					// ./org.coursera.aiplanning.pddl.g:483:4: '(' 'sometime' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal437=(Token)match(input,53,FOLLOW_53_in_conGD3046); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal437_tree = (Object)adaptor.create(char_literal437);
					adaptor.addChild(root_0, char_literal437_tree);
					}

					string_literal438=(Token)match(input,113,FOLLOW_113_in_conGD3048); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal438_tree = (Object)adaptor.create(string_literal438);
					adaptor.addChild(root_0, string_literal438_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3050);
					goalDesc439=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc439.getTree());

					char_literal440=(Token)match(input,54,FOLLOW_54_in_conGD3052); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal440_tree = (Object)adaptor.create(char_literal440);
					adaptor.addChild(root_0, char_literal440_tree);
					}

					}
					break;
				case 6 :
					// ./org.coursera.aiplanning.pddl.g:484:5: '(' 'within' NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal441=(Token)match(input,53,FOLLOW_53_in_conGD3058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal441_tree = (Object)adaptor.create(char_literal441);
					adaptor.addChild(root_0, char_literal441_tree);
					}

					string_literal442=(Token)match(input,119,FOLLOW_119_in_conGD3060); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal442_tree = (Object)adaptor.create(string_literal442);
					adaptor.addChild(root_0, string_literal442_tree);
					}

					NUMBER443=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3062); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER443_tree = (Object)adaptor.create(NUMBER443);
					adaptor.addChild(root_0, NUMBER443_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3064);
					goalDesc444=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc444.getTree());

					char_literal445=(Token)match(input,54,FOLLOW_54_in_conGD3066); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal445_tree = (Object)adaptor.create(char_literal445);
					adaptor.addChild(root_0, char_literal445_tree);
					}

					}
					break;
				case 7 :
					// ./org.coursera.aiplanning.pddl.g:485:4: '(' 'at-most-once' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal446=(Token)match(input,53,FOLLOW_53_in_conGD3071); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal446_tree = (Object)adaptor.create(char_literal446);
					adaptor.addChild(root_0, char_literal446_tree);
					}

					string_literal447=(Token)match(input,90,FOLLOW_90_in_conGD3073); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal447_tree = (Object)adaptor.create(string_literal447);
					adaptor.addChild(root_0, string_literal447_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3075);
					goalDesc448=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc448.getTree());

					char_literal449=(Token)match(input,54,FOLLOW_54_in_conGD3077); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal449_tree = (Object)adaptor.create(char_literal449);
					adaptor.addChild(root_0, char_literal449_tree);
					}

					}
					break;
				case 8 :
					// ./org.coursera.aiplanning.pddl.g:486:4: '(' 'sometime-after' goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal450=(Token)match(input,53,FOLLOW_53_in_conGD3082); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal450_tree = (Object)adaptor.create(char_literal450);
					adaptor.addChild(root_0, char_literal450_tree);
					}

					string_literal451=(Token)match(input,114,FOLLOW_114_in_conGD3084); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal451_tree = (Object)adaptor.create(string_literal451);
					adaptor.addChild(root_0, string_literal451_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3086);
					goalDesc452=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc452.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3088);
					goalDesc453=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc453.getTree());

					char_literal454=(Token)match(input,54,FOLLOW_54_in_conGD3090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal454_tree = (Object)adaptor.create(char_literal454);
					adaptor.addChild(root_0, char_literal454_tree);
					}

					}
					break;
				case 9 :
					// ./org.coursera.aiplanning.pddl.g:487:4: '(' 'sometime-before' goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal455=(Token)match(input,53,FOLLOW_53_in_conGD3095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal455_tree = (Object)adaptor.create(char_literal455);
					adaptor.addChild(root_0, char_literal455_tree);
					}

					string_literal456=(Token)match(input,115,FOLLOW_115_in_conGD3097); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal456_tree = (Object)adaptor.create(string_literal456);
					adaptor.addChild(root_0, string_literal456_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3099);
					goalDesc457=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc457.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3101);
					goalDesc458=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc458.getTree());

					char_literal459=(Token)match(input,54,FOLLOW_54_in_conGD3103); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal459_tree = (Object)adaptor.create(char_literal459);
					adaptor.addChild(root_0, char_literal459_tree);
					}

					}
					break;
				case 10 :
					// ./org.coursera.aiplanning.pddl.g:488:4: '(' 'always-within' NUMBER goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal460=(Token)match(input,53,FOLLOW_53_in_conGD3108); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal460_tree = (Object)adaptor.create(char_literal460);
					adaptor.addChild(root_0, char_literal460_tree);
					}

					string_literal461=(Token)match(input,86,FOLLOW_86_in_conGD3110); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal461_tree = (Object)adaptor.create(string_literal461);
					adaptor.addChild(root_0, string_literal461_tree);
					}

					NUMBER462=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3112); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER462_tree = (Object)adaptor.create(NUMBER462);
					adaptor.addChild(root_0, NUMBER462_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3114);
					goalDesc463=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc463.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3116);
					goalDesc464=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc464.getTree());

					char_literal465=(Token)match(input,54,FOLLOW_54_in_conGD3118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal465_tree = (Object)adaptor.create(char_literal465);
					adaptor.addChild(root_0, char_literal465_tree);
					}

					}
					break;
				case 11 :
					// ./org.coursera.aiplanning.pddl.g:489:4: '(' 'hold-during' NUMBER NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal466=(Token)match(input,53,FOLLOW_53_in_conGD3123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal466_tree = (Object)adaptor.create(char_literal466);
					adaptor.addChild(root_0, char_literal466_tree);
					}

					string_literal467=(Token)match(input,99,FOLLOW_99_in_conGD3125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal467_tree = (Object)adaptor.create(string_literal467);
					adaptor.addChild(root_0, string_literal467_tree);
					}

					NUMBER468=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3127); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER468_tree = (Object)adaptor.create(NUMBER468);
					adaptor.addChild(root_0, NUMBER468_tree);
					}

					NUMBER469=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3129); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER469_tree = (Object)adaptor.create(NUMBER469);
					adaptor.addChild(root_0, NUMBER469_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3131);
					goalDesc470=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc470.getTree());

					char_literal471=(Token)match(input,54,FOLLOW_54_in_conGD3133); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal471_tree = (Object)adaptor.create(char_literal471);
					adaptor.addChild(root_0, char_literal471_tree);
					}

					}
					break;
				case 12 :
					// ./org.coursera.aiplanning.pddl.g:490:4: '(' 'hold-after' NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal472=(Token)match(input,53,FOLLOW_53_in_conGD3138); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal472_tree = (Object)adaptor.create(char_literal472);
					adaptor.addChild(root_0, char_literal472_tree);
					}

					string_literal473=(Token)match(input,98,FOLLOW_98_in_conGD3140); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal473_tree = (Object)adaptor.create(string_literal473);
					adaptor.addChild(root_0, string_literal473_tree);
					}

					NUMBER474=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3142); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER474_tree = (Object)adaptor.create(NUMBER474);
					adaptor.addChild(root_0, NUMBER474_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3144);
					goalDesc475=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc475.getTree());

					char_literal476=(Token)match(input,54,FOLLOW_54_in_conGD3146); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal476_tree = (Object)adaptor.create(char_literal476);
					adaptor.addChild(root_0, char_literal476_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conGD"

	// $ANTLR start synpred17_pddl
	public final void synpred17_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:145:5: ( atomicFunctionSkeleton )
		// ./org.coursera.aiplanning.pddl.g:145:5: atomicFunctionSkeleton
		{
		pushFollow(FOLLOW_atomicFunctionSkeleton_in_synpred17_pddl712);
		atomicFunctionSkeleton();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_pddl

	// $ANTLR start synpred55_pddl
	public final void synpred55_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:297:4: ( '(' binaryOp fExp fExp2 ')' )
		// ./org.coursera.aiplanning.pddl.g:297:4: '(' binaryOp fExp fExp2 ')'
		{
		match(input,53,FOLLOW_53_in_synpred55_pddl1715); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred55_pddl1717);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred55_pddl1719);
		fExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp2_in_synpred55_pddl1721);
		fExp2();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred55_pddl1723); if (state.failed) return;

		}

	}
	// $ANTLR end synpred55_pddl

	// $ANTLR start synpred56_pddl
	public final void synpred56_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:298:4: ( '(' '-' fExp ')' )
		// ./org.coursera.aiplanning.pddl.g:298:4: '(' '-' fExp ')'
		{
		match(input,53,FOLLOW_53_in_synpred56_pddl1740); if (state.failed) return;

		match(input,57,FOLLOW_57_in_synpred56_pddl1742); if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred56_pddl1744);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred56_pddl1746); if (state.failed) return;

		}

	}
	// $ANTLR end synpred56_pddl

	// $ANTLR start synpred84_pddl
	public final void synpred84_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:362:12: ( NUMBER )
		// ./org.coursera.aiplanning.pddl.g:362:12: NUMBER
		{
		match(input,NUMBER,FOLLOW_NUMBER_in_synpred84_pddl2171); if (state.failed) return;

		}

	}
	// $ANTLR end synpred84_pddl

	// $ANTLR start synpred86_pddl
	public final void synpred86_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:365:4: ( '(' 'and' ( daEffect )* ')' )
		// ./org.coursera.aiplanning.pddl.g:365:4: '(' 'and' ( daEffect )* ')'
		{
		match(input,53,FOLLOW_53_in_synpred86_pddl2185); if (state.failed) return;

		match(input,87,FOLLOW_87_in_synpred86_pddl2187); if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:365:14: ( daEffect )*
		loop92:
		while (true) {
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==53) ) {
				alt92=1;
			}

			switch (alt92) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:365:14: daEffect
				{
				pushFollow(FOLLOW_daEffect_in_synpred86_pddl2189);
				daEffect();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop92;
			}
		}

		match(input,54,FOLLOW_54_in_synpred86_pddl2192); if (state.failed) return;

		}

	}
	// $ANTLR end synpred86_pddl

	// $ANTLR start synpred87_pddl
	public final void synpred87_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:366:4: ( timedEffect )
		// ./org.coursera.aiplanning.pddl.g:366:4: timedEffect
		{
		pushFollow(FOLLOW_timedEffect_in_synpred87_pddl2197);
		timedEffect();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred87_pddl

	// $ANTLR start synpred88_pddl
	public final void synpred88_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:367:4: ( '(' 'forall' '(' typedVariableList ')' daEffect ')' )
		// ./org.coursera.aiplanning.pddl.g:367:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
		{
		match(input,53,FOLLOW_53_in_synpred88_pddl2202); if (state.failed) return;

		match(input,97,FOLLOW_97_in_synpred88_pddl2204); if (state.failed) return;

		match(input,53,FOLLOW_53_in_synpred88_pddl2206); if (state.failed) return;

		pushFollow(FOLLOW_typedVariableList_in_synpred88_pddl2208);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred88_pddl2210); if (state.failed) return;

		pushFollow(FOLLOW_daEffect_in_synpred88_pddl2212);
		daEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred88_pddl2214); if (state.failed) return;

		}

	}
	// $ANTLR end synpred88_pddl

	// $ANTLR start synpred89_pddl
	public final void synpred89_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:368:4: ( '(' 'when' daGD timedEffect ')' )
		// ./org.coursera.aiplanning.pddl.g:368:4: '(' 'when' daGD timedEffect ')'
		{
		match(input,53,FOLLOW_53_in_synpred89_pddl2219); if (state.failed) return;

		match(input,118,FOLLOW_118_in_synpred89_pddl2221); if (state.failed) return;

		pushFollow(FOLLOW_daGD_in_synpred89_pddl2223);
		daGD();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_timedEffect_in_synpred89_pddl2225);
		timedEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred89_pddl2227); if (state.failed) return;

		}

	}
	// $ANTLR end synpred89_pddl

	// $ANTLR start synpred90_pddl
	public final void synpred90_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:373:4: ( '(' 'at' timeSpecifier daEffect ')' )
		// ./org.coursera.aiplanning.pddl.g:373:4: '(' 'at' timeSpecifier daEffect ')'
		{
		match(input,53,FOLLOW_53_in_synpred90_pddl2251); if (state.failed) return;

		match(input,89,FOLLOW_89_in_synpred90_pddl2253); if (state.failed) return;

		pushFollow(FOLLOW_timeSpecifier_in_synpred90_pddl2255);
		timeSpecifier();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_daEffect_in_synpred90_pddl2257);
		daEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred90_pddl2259); if (state.failed) return;

		}

	}
	// $ANTLR end synpred90_pddl

	// $ANTLR start synpred91_pddl
	public final void synpred91_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:374:4: ( '(' 'at' timeSpecifier fAssignDA ')' )
		// ./org.coursera.aiplanning.pddl.g:374:4: '(' 'at' timeSpecifier fAssignDA ')'
		{
		match(input,53,FOLLOW_53_in_synpred91_pddl2269); if (state.failed) return;

		match(input,89,FOLLOW_89_in_synpred91_pddl2271); if (state.failed) return;

		pushFollow(FOLLOW_timeSpecifier_in_synpred91_pddl2273);
		timeSpecifier();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fAssignDA_in_synpred91_pddl2275);
		fAssignDA();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred91_pddl2277); if (state.failed) return;

		}

	}
	// $ANTLR end synpred91_pddl

	// $ANTLR start synpred92_pddl
	public final void synpred92_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:383:9: ( ( binaryOp fExpDA fExpDA ) )
		// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
		{
		// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
		// ./org.coursera.aiplanning.pddl.g:383:10: binaryOp fExpDA fExpDA
		{
		pushFollow(FOLLOW_binaryOp_in_synpred92_pddl2333);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred92_pddl2335);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred92_pddl2337);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred92_pddl

	// $ANTLR start synpred93_pddl
	public final void synpred93_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:383:4: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' )
		// ./org.coursera.aiplanning.pddl.g:383:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
		{
		match(input,53,FOLLOW_53_in_synpred93_pddl2329); if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:383:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
		int alt93=2;
		int LA93_0 = input.LA(1);
		if ( (LA93_0==57) ) {
			int LA93_1 = input.LA(2);
			if ( (synpred92_pddl()) ) {
				alt93=1;
			}
			else if ( (true) ) {
				alt93=2;
			}

		}
		else if ( ((LA93_0 >= 55 && LA93_0 <= 56)||LA93_0==58) ) {
			alt93=1;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 93, 0, input);
			throw nvae;
		}

		switch (alt93) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
				{
				// ./org.coursera.aiplanning.pddl.g:383:9: ( binaryOp fExpDA fExpDA )
				// ./org.coursera.aiplanning.pddl.g:383:10: binaryOp fExpDA fExpDA
				{
				pushFollow(FOLLOW_binaryOp_in_synpred93_pddl2333);
				binaryOp();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred93_pddl2335);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred93_pddl2337);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				}

				}
				break;
			case 2 :
				// ./org.coursera.aiplanning.pddl.g:383:36: ( '-' fExpDA )
				{
				// ./org.coursera.aiplanning.pddl.g:383:36: ( '-' fExpDA )
				// ./org.coursera.aiplanning.pddl.g:383:37: '-' fExpDA
				{
				match(input,57,FOLLOW_57_in_synpred93_pddl2343); if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred93_pddl2345);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				}

				}
				break;

		}

		match(input,54,FOLLOW_54_in_synpred93_pddl2349); if (state.failed) return;

		}

	}
	// $ANTLR end synpred93_pddl

	// $ANTLR start synpred105_pddl
	public final void synpred105_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:452:4: ( '(' 'and' ( prefConGD )* ')' )
		// ./org.coursera.aiplanning.pddl.g:452:4: '(' 'and' ( prefConGD )* ')'
		{
		match(input,53,FOLLOW_53_in_synpred105_pddl2799); if (state.failed) return;

		match(input,87,FOLLOW_87_in_synpred105_pddl2801); if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:452:14: ( prefConGD )*
		loop94:
		while (true) {
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==53) ) {
				alt94=1;
			}

			switch (alt94) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:452:14: prefConGD
				{
				pushFollow(FOLLOW_prefConGD_in_synpred105_pddl2803);
				prefConGD();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop94;
			}
		}

		match(input,54,FOLLOW_54_in_synpred105_pddl2806); if (state.failed) return;

		}

	}
	// $ANTLR end synpred105_pddl

	// $ANTLR start synpred106_pddl
	public final void synpred106_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:453:4: ( '(' 'forall' '(' typedVariableList ')' prefConGD ')' )
		// ./org.coursera.aiplanning.pddl.g:453:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
		{
		match(input,53,FOLLOW_53_in_synpred106_pddl2811); if (state.failed) return;

		match(input,97,FOLLOW_97_in_synpred106_pddl2813); if (state.failed) return;

		match(input,53,FOLLOW_53_in_synpred106_pddl2815); if (state.failed) return;

		pushFollow(FOLLOW_typedVariableList_in_synpred106_pddl2817);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred106_pddl2819); if (state.failed) return;

		pushFollow(FOLLOW_prefConGD_in_synpred106_pddl2821);
		prefConGD();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred106_pddl2823); if (state.failed) return;

		}

	}
	// $ANTLR end synpred106_pddl

	// $ANTLR start synpred108_pddl
	public final void synpred108_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:454:4: ( '(' 'preference' ( NAME )? conGD ')' )
		// ./org.coursera.aiplanning.pddl.g:454:4: '(' 'preference' ( NAME )? conGD ')'
		{
		match(input,53,FOLLOW_53_in_synpred108_pddl2828); if (state.failed) return;

		match(input,109,FOLLOW_109_in_synpred108_pddl2830); if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:454:21: ( NAME )?
		int alt95=2;
		int LA95_0 = input.LA(1);
		if ( (LA95_0==NAME) ) {
			alt95=1;
		}
		switch (alt95) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:454:21: NAME
				{
				match(input,NAME,FOLLOW_NAME_in_synpred108_pddl2832); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_conGD_in_synpred108_pddl2835);
		conGD();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred108_pddl2837); if (state.failed) return;

		}

	}
	// $ANTLR end synpred108_pddl

	// $ANTLR start synpred110_pddl
	public final void synpred110_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:466:4: ( '(' binaryOp metricFExp metricFExp ')' )
		// ./org.coursera.aiplanning.pddl.g:466:4: '(' binaryOp metricFExp metricFExp ')'
		{
		match(input,53,FOLLOW_53_in_synpred110_pddl2898); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred110_pddl2900);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred110_pddl2902);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred110_pddl2904);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred110_pddl2906); if (state.failed) return;

		}

	}
	// $ANTLR end synpred110_pddl

	// $ANTLR start synpred113_pddl
	public final void synpred113_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:467:4: ( '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' )
		// ./org.coursera.aiplanning.pddl.g:467:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
		{
		match(input,53,FOLLOW_53_in_synpred113_pddl2911); if (state.failed) return;

		if ( input.LA(1)==55||input.LA(1)==58 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_metricFExp_in_synpred113_pddl2919);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:467:29: ( metricFExp )+
		int cnt96=0;
		loop96:
		while (true) {
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==NAME||LA96_0==NUMBER||LA96_0==53||LA96_0==117) ) {
				alt96=1;
			}

			switch (alt96) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:467:29: metricFExp
				{
				pushFollow(FOLLOW_metricFExp_in_synpred113_pddl2921);
				metricFExp();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt96 >= 1 ) break loop96;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(96, input);
				throw eee;
			}
			cnt96++;
		}

		match(input,54,FOLLOW_54_in_synpred113_pddl2924); if (state.failed) return;

		}

	}
	// $ANTLR end synpred113_pddl

	// $ANTLR start synpred114_pddl
	public final void synpred114_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:468:4: ( '(' '-' metricFExp ')' )
		// ./org.coursera.aiplanning.pddl.g:468:4: '(' '-' metricFExp ')'
		{
		match(input,53,FOLLOW_53_in_synpred114_pddl2929); if (state.failed) return;

		match(input,57,FOLLOW_57_in_synpred114_pddl2931); if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred114_pddl2933);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,54,FOLLOW_54_in_synpred114_pddl2935); if (state.failed) return;

		}

	}
	// $ANTLR end synpred114_pddl

	// $ANTLR start synpred117_pddl
	public final void synpred117_pddl_fragment() throws RecognitionException {
		// ./org.coursera.aiplanning.pddl.g:470:4: ( '(' functionSymbol ( NAME )* ')' )
		// ./org.coursera.aiplanning.pddl.g:470:4: '(' functionSymbol ( NAME )* ')'
		{
		match(input,53,FOLLOW_53_in_synpred117_pddl2945); if (state.failed) return;

		pushFollow(FOLLOW_functionSymbol_in_synpred117_pddl2947);
		functionSymbol();
		state._fsp--;
		if (state.failed) return;

		// ./org.coursera.aiplanning.pddl.g:470:23: ( NAME )*
		loop97:
		while (true) {
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==NAME) ) {
				alt97=1;
			}

			switch (alt97) {
			case 1 :
				// ./org.coursera.aiplanning.pddl.g:470:23: NAME
				{
				match(input,NAME,FOLLOW_NAME_in_synpred117_pddl2949); if (state.failed) return;

				}
				break;

			default :
				break loop97;
			}
		}

		match(input,54,FOLLOW_54_in_synpred117_pddl2952); if (state.failed) return;

		}

	}
	// $ANTLR end synpred117_pddl

	// Delegated rules

	public final boolean synpred89_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred89_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred88_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred93_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred90_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred108_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred108_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred110_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred110_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred113_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred106_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred106_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred117_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred92_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred92_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred114_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred114_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA13_eotS =
		"\4\uffff";
	static final String DFA13_eofS =
		"\4\uffff";
	static final String DFA13_minS =
		"\2\36\2\uffff";
	static final String DFA13_maxS =
		"\1\66\1\71\2\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA13_specialS =
		"\4\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\27\uffff\1\2",
			"\1\1\27\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "123:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )";
		}
	}

	static final String DFA11_eotS =
		"\4\uffff";
	static final String DFA11_eofS =
		"\4\uffff";
	static final String DFA11_minS =
		"\2\36\2\uffff";
	static final String DFA11_maxS =
		"\1\66\1\71\2\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA11_specialS =
		"\4\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\27\uffff\1\2",
			"\1\1\27\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 123:16: ( singleTypeNameList )+";
		}
	}

	static final String DFA24_eotS =
		"\4\uffff";
	static final String DFA24_eofS =
		"\4\uffff";
	static final String DFA24_minS =
		"\2\62\2\uffff";
	static final String DFA24_maxS =
		"\1\66\1\71\2\uffff";
	static final String DFA24_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA24_specialS =
		"\4\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1\2\uffff\2\2",
			"\1\1\2\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "174:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )";
		}
	}

	static final String DFA22_eotS =
		"\4\uffff";
	static final String DFA22_eofS =
		"\4\uffff";
	static final String DFA22_minS =
		"\2\62\2\uffff";
	static final String DFA22_maxS =
		"\1\66\1\71\2\uffff";
	static final String DFA22_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA22_specialS =
		"\4\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\2\uffff\2\2",
			"\1\1\2\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 174:20: ( singleTypeVarList )+";
		}
	}

	public static final BitSet FOLLOW_domain_in_pddlDoc305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_problem_in_pddlDoc309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_domain324 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_domain326 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_domainName_in_domain328 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_requireDef_in_domain336 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_typesDef_in_domain345 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_constantsDef_in_domain354 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_predicatesDef_in_domain363 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_functionsDef_in_domain372 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_constraints_in_domain381 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_structureDef_in_domain390 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_domain399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_domainName483 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_domainName485 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NAME_in_domainName487 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_domainName489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_requireDef516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_requireDef518 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_REQUIRE_KEY_in_requireDef520 = new BitSet(new long[]{0x0040800000000000L});
	public static final BitSet FOLLOW_54_in_requireDef523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_typesDef544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_typesDef546 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_typedNameList_in_typesDef548 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_typesDef550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList577 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_singleTypeNameList_in_typedNameList582 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList585 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_NAME_in_singleTypeNameList605 = new BitSet(new long[]{0x0200000040000000L});
	public static final BitSet FOLLOW_57_in_singleTypeNameList608 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_type_in_singleTypeNameList612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_type639 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_type641 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_primType_in_type643 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_54_in_type646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primType_in_type665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_primType675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_functionsDef685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_functionsDef687 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_functionList_in_functionsDef689 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_functionsDef691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_functionList712 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_57_in_functionList716 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_functionType_in_functionList718 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_atomicFunctionSkeleton734 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_functionSymbol_in_atomicFunctionSkeleton737 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFunctionSkeleton740 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_atomicFunctionSkeleton742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_functionSymbol753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_functionType762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_constantsDef773 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_constantsDef775 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_typedNameList_in_constantsDef777 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_constantsDef779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_predicatesDef799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_predicatesDef801 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_atomicFormulaSkeleton_in_predicatesDef803 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_predicatesDef806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_atomicFormulaSkeleton827 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_predicate_in_atomicFormulaSkeleton830 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFormulaSkeleton833 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_atomicFormulaSkeleton835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList861 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_singleTypeVarList_in_typedVariableList866 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList869 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_singleTypeVarList889 = new BitSet(new long[]{0x0204000000000000L});
	public static final BitSet FOLLOW_57_in_singleTypeVarList892 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_type_in_singleTypeVarList896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_constraints927 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_constraints930 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_conGD_in_constraints933 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_constraints935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actionDef_in_structureDef947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durativeActionDef_in_structureDef952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedDef_in_structureDef957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_actionDef972 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_actionDef974 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_actionSymbol_in_actionDef976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_actionDef985 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_actionDef987 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_actionDef989 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_actionDef991 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_actionDefBody_in_actionDef1004 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_actionDef1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_actionSymbol1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_actionDefBody1054 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_actionDefBody1058 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_actionDefBody1060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_actionDefBody1065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_actionDefBody1075 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_actionDefBody1079 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_actionDefBody1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effect_in_actionDefBody1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_goalDesc1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_goalDesc1137 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1139 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1167 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_107_in_goalDesc1169 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1171 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1199 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_goalDesc1201 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1203 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1229 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_goalDesc1231 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1233 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1235 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_goalDesc1265 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_goalDesc1267 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_goalDesc1269 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1271 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1273 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goalDesc1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_goalDesc1303 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_goalDesc1305 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_goalDesc1307 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1309 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1311 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goalDesc1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fComp_in_goalDesc1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fComp1378 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
	public static final BitSet FOLLOW_binaryComp_in_fComp1381 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_fComp1383 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_fComp1385 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fComp1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_atomicTermFormula1399 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_predicate_in_atomicTermFormula1401 = new BitSet(new long[]{0x0044000040000000L});
	public static final BitSet FOLLOW_term_in_atomicTermFormula1403 = new BitSet(new long[]{0x0044000040000000L});
	public static final BitSet FOLLOW_54_in_atomicTermFormula1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_durativeActionDef1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_durativeActionDef1446 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_actionSymbol_in_durativeActionDef1448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_durativeActionDef1457 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_durativeActionDef1459 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_durativeActionDef1461 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_durativeActionDef1463 = new BitSet(new long[]{0x1000000000000000L,0x000000000000000AL});
	public static final BitSet FOLLOW_daDefBody_in_durativeActionDef1476 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_durativeActionDef1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_daDefBody1511 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_durationConstraint_in_daDefBody1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_daDefBody1518 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_daDefBody1522 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daDefBody1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_daGD_in_daDefBody1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daDefBody1538 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_daDefBody1542 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daDefBody1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_daEffect_in_daDefBody1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefTimedGD_in_daGD1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daGD1569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_daGD1571 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_daGD_in_daGD1573 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_daGD1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daGD1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_daGD1583 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_daGD1585 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_daGD1587 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daGD1589 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daGD_in_daGD1591 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daGD1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedGD_in_prefTimedGD1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_prefTimedGD1609 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_prefTimedGD1611 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_NAME_in_prefTimedGD1613 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_timedGD_in_prefTimedGD1616 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_prefTimedGD1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timedGD1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_timedGD1631 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedGD1633 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_timedGD1635 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_timedGD1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timedGD1642 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_timedGD1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_interval_in_timedGD1646 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_timedGD1648 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_timedGD1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_interval1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_derivedDef1685 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_derivedDef1688 = new BitSet(new long[]{0x0024000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_derivedDef1691 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_derivedDef1693 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_derivedDef1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fExp1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fExp1715 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_fExp1717 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_fExp1719 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp2_in_fExp1721 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fExp1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fExp1740 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_fExp1742 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_fExp1744 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fExp1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_fExp1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExp21771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fHead1781 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead1783 = new BitSet(new long[]{0x0044000040000000L});
	public static final BitSet FOLLOW_term_in_fHead1785 = new BitSet(new long[]{0x0044000040000000L});
	public static final BitSet FOLLOW_54_in_fHead1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_effect1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_effect1825 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_cEffect_in_effect1827 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_effect1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cEffect_in_effect1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_cEffect1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_cEffect1857 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_cEffect1859 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_cEffect1861 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_cEffect1863 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_effect_in_cEffect1865 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_cEffect1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_cEffect1885 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_cEffect1887 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_cEffect1889 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_condEffect_in_cEffect1891 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_cEffect1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_cEffect1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_pEffect1922 = new BitSet(new long[]{0x0000000000000000L,0x0001802009000000L});
	public static final BitSet FOLLOW_assignOp_in_pEffect1924 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_fHead_in_pEffect1926 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_pEffect1928 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_pEffect1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_pEffect1950 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_pEffect1952 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect1954 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_pEffect1956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect1972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_condEffect1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_condEffect1987 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_pEffect_in_condEffect1989 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_condEffect1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_condEffect2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_durationConstraint2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_durationConstraint2095 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2097 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_durationConstraint2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_durationConstraint2105 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_durationConstraint2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_simpleDurationConstraint2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000058000L});
	public static final BitSet FOLLOW_durOp_in_simpleDurationConstraint2125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_simpleDurationConstraint2127 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_durValue_in_simpleDurationConstraint2129 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_simpleDurationConstraint2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_simpleDurationConstraint2136 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_simpleDurationConstraint2138 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_simpleDurationConstraint2140 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2142 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_simpleDurationConstraint2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_durValue2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_durValue2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daEffect2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_daEffect2187 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2189 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_daEffect2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daEffect2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_daEffect2204 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_daEffect2206 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_daEffect2208 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daEffect2210 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2212 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daEffect2214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daEffect2219 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_daEffect2221 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daGD_in_daEffect2223 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2225 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daEffect2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_daEffect2232 = new BitSet(new long[]{0x0000000000000000L,0x0001802009000000L});
	public static final BitSet FOLLOW_assignOp_in_daEffect2234 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_fHead_in_daEffect2236 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_daEffect2238 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_daEffect2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timedEffect2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_timedEffect2253 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2255 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daEffect_in_timedEffect2257 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_timedEffect2259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timedEffect2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_timedEffect2271 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2273 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fAssignDA_in_timedEffect2275 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_timedEffect2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timedEffect2282 = new BitSet(new long[]{0x0000000000000000L,0x0001802009000000L});
	public static final BitSet FOLLOW_assignOp_in_timedEffect2284 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_fHead_in_timedEffect2286 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_timedEffect2288 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_timedEffect2290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fAssignDA2310 = new BitSet(new long[]{0x0000000000000000L,0x0001802009000000L});
	public static final BitSet FOLLOW_assignOp_in_fAssignDA2312 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_fHead_in_fAssignDA2314 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_fAssignDA2316 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fAssignDA2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_fExpDA2329 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_fExpDA2333 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2335 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2337 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_57_in_fExpDA2343 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2345 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fExpDA2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_fExpDA2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExpDA2359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_problem2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_problem2375 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_problemDecl_in_problem2377 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_problemDomain_in_problem2382 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_requireDef_in_problem2390 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_objectDecl_in_problem2399 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_init_in_problem2408 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goal_in_problem2416 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_probConstraints_in_problem2424 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_metricSpec_in_problem2433 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_problem2449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_problemDecl2506 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_problemDecl2508 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NAME_in_problemDecl2510 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_problemDecl2512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_problemDomain2538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_problemDomain2540 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NAME_in_problemDomain2542 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_problemDomain2544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_objectDecl2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_objectDecl2566 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_typedNameList_in_objectDecl2568 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_objectDecl2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_init2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_init2592 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_initEl_in_init2594 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_init2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl2618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_initEl2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_initEl2625 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_fHead_in_initEl2627 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl2629 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_initEl2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_initEl2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_initEl2656 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl2658 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl2660 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_initEl2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_nameLiteral2689 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_nameLiteral2691 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2693 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_nameLiteral2695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_atomicNameFormula2714 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_predicate_in_atomicNameFormula2716 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_NAME_in_atomicNameFormula2718 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_54_in_atomicNameFormula2721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_goal2746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_goal2748 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_goal2750 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_goal2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_probConstraints2770 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_probConstraints2772 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_prefConGD_in_probConstraints2775 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_probConstraints2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_prefConGD2799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_prefConGD2801 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD2803 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_prefConGD2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_prefConGD2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_prefConGD2813 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_prefConGD2815 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_prefConGD2817 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_prefConGD2819 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD2821 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_prefConGD2823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_prefConGD2828 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_prefConGD2830 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_NAME_in_prefConGD2832 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_conGD_in_prefConGD2835 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_prefConGD2837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conGD_in_prefConGD2842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricSpec2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_metricSpec2855 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
	public static final BitSet FOLLOW_optimization_in_metricSpec2857 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricSpec2859 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_metricSpec2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricFExp2898 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_metricFExp2900 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp2902 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp2904 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_metricFExp2906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricFExp2911 = new BitSet(new long[]{0x0480000000000000L});
	public static final BitSet FOLLOW_set_in_metricFExp2913 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp2919 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp2921 = new BitSet(new long[]{0x0060000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_54_in_metricFExp2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricFExp2929 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_metricFExp2931 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp2933 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_metricFExp2935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_metricFExp2940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricFExp2945 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_functionSymbol_in_metricFExp2947 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_NAME_in_metricFExp2949 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_54_in_metricFExp2952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionSymbol_in_metricFExp2957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_metricFExp2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_metricFExp2970 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_metricFExp2972 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NAME_in_metricFExp2974 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_metricFExp2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_conGD2992 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_conGD_in_conGD2994 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_conGD2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_conGD3004 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_conGD3006 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_conGD3008 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3010 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_conGD_in_conGD3012 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3019 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_conGD3021 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_conGD3023 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3025 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_conGD3037 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3039 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3046 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_conGD3048 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3050 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3058 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_conGD3060 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3062 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3064 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3071 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_conGD3073 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3075 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3082 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_conGD3084 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3086 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3088 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3095 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_conGD3097 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3099 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3101 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_conGD3110 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3112 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3114 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3116 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_conGD3125 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3127 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3129 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3131 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_conGD3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_conGD3140 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3142 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3144 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conGD3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_synpred17_pddl712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred55_pddl1715 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred55_pddl1717 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_synpred55_pddl1719 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp2_in_synpred55_pddl1721 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred55_pddl1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred56_pddl1740 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_synpred56_pddl1742 = new BitSet(new long[]{0x0020000440000000L});
	public static final BitSet FOLLOW_fExp_in_synpred56_pddl1744 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred56_pddl1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_synpred84_pddl2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred86_pddl2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_synpred86_pddl2187 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_daEffect_in_synpred86_pddl2189 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_synpred86_pddl2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedEffect_in_synpred87_pddl2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred88_pddl2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_synpred88_pddl2204 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_synpred88_pddl2206 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred88_pddl2208 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred88_pddl2210 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daEffect_in_synpred88_pddl2212 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred88_pddl2214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred89_pddl2219 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_synpred89_pddl2221 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daGD_in_synpred89_pddl2223 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_timedEffect_in_synpred89_pddl2225 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred89_pddl2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred90_pddl2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_synpred90_pddl2253 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_synpred90_pddl2255 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_daEffect_in_synpred90_pddl2257 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred90_pddl2259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred91_pddl2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_synpred91_pddl2271 = new BitSet(new long[]{0x0000000000000000L,0x0010000080000000L});
	public static final BitSet FOLLOW_timeSpecifier_in_synpred91_pddl2273 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fAssignDA_in_synpred91_pddl2275 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred91_pddl2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOp_in_synpred92_pddl2333 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred92_pddl2335 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred92_pddl2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred93_pddl2329 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred93_pddl2333 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred93_pddl2335 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred93_pddl2337 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_57_in_synpred93_pddl2343 = new BitSet(new long[]{0x0020000440000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred93_pddl2345 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred93_pddl2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred105_pddl2799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_synpred105_pddl2801 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_prefConGD_in_synpred105_pddl2803 = new BitSet(new long[]{0x0060000000000000L});
	public static final BitSet FOLLOW_54_in_synpred105_pddl2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred106_pddl2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_synpred106_pddl2813 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_synpred106_pddl2815 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred106_pddl2817 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred106_pddl2819 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_prefConGD_in_synpred106_pddl2821 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred106_pddl2823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred108_pddl2828 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_synpred108_pddl2830 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_NAME_in_synpred108_pddl2832 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_conGD_in_synpred108_pddl2835 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred108_pddl2837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred110_pddl2898 = new BitSet(new long[]{0x0780000000000000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred110_pddl2900 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred110_pddl2902 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred110_pddl2904 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred110_pddl2906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred113_pddl2911 = new BitSet(new long[]{0x0480000000000000L});
	public static final BitSet FOLLOW_set_in_synpred113_pddl2913 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred113_pddl2919 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred113_pddl2921 = new BitSet(new long[]{0x0060000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_54_in_synpred113_pddl2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred114_pddl2929 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_synpred114_pddl2931 = new BitSet(new long[]{0x0020000440000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred114_pddl2933 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred114_pddl2935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred117_pddl2945 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_functionSymbol_in_synpred117_pddl2947 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_NAME_in_synpred117_pddl2949 = new BitSet(new long[]{0x0040000040000000L});
	public static final BitSet FOLLOW_54_in_synpred117_pddl2952 = new BitSet(new long[]{0x0000000000000002L});
}
