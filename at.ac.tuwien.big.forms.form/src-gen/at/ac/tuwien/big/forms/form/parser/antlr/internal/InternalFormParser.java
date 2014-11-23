package at.ac.tuwien.big.forms.form.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'welcome'", "'form'", "'('", "')'", "'handles'", "'{'", "'}'", "'page'", "','", "'edits'", "'table'", "'column'", "'list'", "'text-field'", "'format'", "'text-area'", "'selection-field'", "'date-selection-field'", "'time-selection-field'", "'with'", "'attribute-condition'", "':'", "'=='", "'?'", "'composite-condition'", "'Show'", "'Hide'", "'Disable'", "'Enable'", "'None'", "'or'", "'and'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFormParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g"; }



     	private FormGrammarAccess grammarAccess;
     	
        public InternalFormParser(TokenStream input, FormGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FormModel";	
       	}
       	
       	@Override
       	protected FormGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFormModel"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:68:1: entryRuleFormModel returns [EObject current=null] : iv_ruleFormModel= ruleFormModel EOF ;
    public final EObject entryRuleFormModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormModel = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:69:2: (iv_ruleFormModel= ruleFormModel EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:70:2: iv_ruleFormModel= ruleFormModel EOF
            {
             newCompositeNode(grammarAccess.getFormModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormModel_in_entryRuleFormModel75);
            iv_ruleFormModel=ruleFormModel();

            state._fsp--;

             current =iv_ruleFormModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormModel"


    // $ANTLR start "ruleFormModel"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:77:1: ruleFormModel returns [EObject current=null] : ( (lv_forms_0_0= ruleForm ) )* ;
    public final EObject ruleFormModel() throws RecognitionException {
        EObject current = null;

        EObject lv_forms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:80:28: ( ( (lv_forms_0_0= ruleForm ) )* )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( (lv_forms_0_0= ruleForm ) )*
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( (lv_forms_0_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:82:1: (lv_forms_0_0= ruleForm )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:82:1: (lv_forms_0_0= ruleForm )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:83:3: lv_forms_0_0= ruleForm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleForm_in_ruleFormModel130);
            	    lv_forms_0_0=ruleForm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"forms",
            	            		lv_forms_0_0, 
            	            		"Form");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormModel"


    // $ANTLR start "entryRuleForm"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:107:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:108:2: (iv_ruleForm= ruleForm EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:109:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_entryRuleForm166);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForm176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:116:1: ruleForm returns [EObject current=null] : ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )? otherlv_7= 'handles' ( (otherlv_8= RULE_ID ) ) otherlv_9= '{' ( (lv_pages_10_0= rulePage ) )* otherlv_11= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token lv_welcomeForm_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_title_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_pages_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:119:28: ( ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )? otherlv_7= 'handles' ( (otherlv_8= RULE_ID ) ) otherlv_9= '{' ( (lv_pages_10_0= rulePage ) )* otherlv_11= '}' ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:120:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )? otherlv_7= 'handles' ( (otherlv_8= RULE_ID ) ) otherlv_9= '{' ( (lv_pages_10_0= rulePage ) )* otherlv_11= '}' )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:120:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )? otherlv_7= 'handles' ( (otherlv_8= RULE_ID ) ) otherlv_9= '{' ( (lv_pages_10_0= rulePage ) )* otherlv_11= '}' )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:120:2: ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )? otherlv_7= 'handles' ( (otherlv_8= RULE_ID ) ) otherlv_9= '{' ( (lv_pages_10_0= rulePage ) )* otherlv_11= '}'
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:120:2: ( (lv_welcomeForm_0_0= 'welcome' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:121:1: (lv_welcomeForm_0_0= 'welcome' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:121:1: (lv_welcomeForm_0_0= 'welcome' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:122:3: lv_welcomeForm_0_0= 'welcome'
                    {
                    lv_welcomeForm_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleForm219); 

                            newLeafNode(lv_welcomeForm_0_0, grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormRule());
                    	        }
                           		setWithLastConsumed(current, "welcomeForm", true, "welcome");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleForm245); 

                	newLeafNode(otherlv_1, grammarAccess.getFormAccess().getFormKeyword_1());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:139:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:140:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:140:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:141:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForm262); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:157:2: ( (lv_title_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:158:1: (lv_title_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:158:1: (lv_title_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:159:3: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleForm284); 

            			newLeafNode(lv_title_3_0, grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:175:2: (otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:175:4: otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleForm302); 

                        	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getLeftParenthesisKeyword_4_0());
                        
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:179:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:180:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:180:1: (lv_description_5_0= RULE_STRING )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:181:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleForm319); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getFormAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleForm336); 

                        	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getRightParenthesisKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForm350); 

                	newLeafNode(otherlv_7, grammarAccess.getFormAccess().getHandlesKeyword_5());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:205:1: ( (otherlv_8= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:206:1: (otherlv_8= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:206:1: (otherlv_8= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:207:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForm370); 

            		newLeafNode(otherlv_8, grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForm382); 

                	newLeafNode(otherlv_9, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:222:1: ( (lv_pages_10_0= rulePage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:223:1: (lv_pages_10_0= rulePage )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:223:1: (lv_pages_10_0= rulePage )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:224:3: lv_pages_10_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleForm403);
            	    lv_pages_10_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_10_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleForm416); 

                	newLeafNode(otherlv_11, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRulePage"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:252:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:253:2: (iv_rulePage= rulePage EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:254:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage452);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:261:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )? otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pageElements_3_0 = null;

        EObject lv_pageElements_5_0 = null;

        EObject lv_condition_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:264:28: ( (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )? otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:1: (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )? otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:1: (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )? otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:3: otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )? otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePage499); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:269:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:270:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:270:1: (lv_title_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:271:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePage516); 

            			newLeafNode(lv_title_1_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePage533); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:291:1: ( ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21||(LA6_0>=23 && LA6_0<=24)||(LA6_0>=26 && LA6_0<=29)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:291:2: ( (lv_pageElements_3_0= rulePageElement ) ) (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )*
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:291:2: ( (lv_pageElements_3_0= rulePageElement ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:292:1: (lv_pageElements_3_0= rulePageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:292:1: (lv_pageElements_3_0= rulePageElement )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:293:3: lv_pageElements_3_0= rulePageElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rulePage555);
                    lv_pageElements_3_0=rulePageElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		add(
                           			current, 
                           			"pageElements",
                            		lv_pageElements_3_0, 
                            		"PageElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:309:2: (otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:309:4: otherlv_4= ',' ( (lv_pageElements_5_0= rulePageElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePage568); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:313:1: ( (lv_pageElements_5_0= rulePageElement ) )
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:314:1: (lv_pageElements_5_0= rulePageElement )
                    	    {
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:314:1: (lv_pageElements_5_0= rulePageElement )
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:315:3: lv_pageElements_5_0= rulePageElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rulePage589);
                    	    lv_pageElements_5_0=rulePageElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pageElements",
                    	            		lv_pageElements_5_0, 
                    	            		"PageElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage605); 

                	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:335:1: ( (lv_condition_7_0= ruleCondition ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:336:1: (lv_condition_7_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:336:1: (lv_condition_7_0= ruleCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:337:3: lv_condition_7_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rulePage626);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_7_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRulePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:361:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:362:2: (iv_rulePageElement= rulePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:363:2: iv_rulePageElement= rulePageElement EOF
            {
             newCompositeNode(grammarAccess.getPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_entryRulePageElement663);
            iv_rulePageElement=rulePageElement();

            state._fsp--;

             current =iv_rulePageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageElement673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageElement"


    // $ANTLR start "rulePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:370:1: rulePageElement returns [EObject current=null] : ( (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement ) ( (lv_condition_2_0= ruleCondition ) )? ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipPageElement_0 = null;

        EObject this_AttributePageElement_1 = null;

        EObject lv_condition_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:373:28: ( ( (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement ) ( (lv_condition_2_0= ruleCondition ) )? ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:374:1: ( (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement ) ( (lv_condition_2_0= ruleCondition ) )? )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:374:1: ( (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement ) ( (lv_condition_2_0= ruleCondition ) )? )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:374:2: (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement ) ( (lv_condition_2_0= ruleCondition ) )?
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:374:2: (this_RelationshipPageElement_0= ruleRelationshipPageElement | this_AttributePageElement_1= ruleAttributePageElement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21||LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24||(LA8_0>=26 && LA8_0<=29)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:375:5: this_RelationshipPageElement_0= ruleRelationshipPageElement
                    {
                     
                            newCompositeNode(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rulePageElement721);
                    this_RelationshipPageElement_0=ruleRelationshipPageElement();

                    state._fsp--;

                     
                            current = this_RelationshipPageElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:385:5: this_AttributePageElement_1= ruleAttributePageElement
                    {
                     
                            newCompositeNode(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rulePageElement748);
                    this_AttributePageElement_1=ruleAttributePageElement();

                    state._fsp--;

                     
                            current = this_AttributePageElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:393:2: ( (lv_condition_2_0= ruleCondition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:394:1: (lv_condition_2_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:394:1: (lv_condition_2_0= ruleCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:395:3: lv_condition_2_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rulePageElement769);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageElementRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_2_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageElement"


    // $ANTLR start "entryRuleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:419:1: entryRuleRelationshipPageElement returns [EObject current=null] : iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF ;
    public final EObject entryRuleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipPageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:420:2: (iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:421:2: iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF
            {
             newCompositeNode(grammarAccess.getRelationshipPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement806);
            iv_ruleRelationshipPageElement=ruleRelationshipPageElement();

            state._fsp--;

             current =iv_ruleRelationshipPageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipPageElement816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationshipPageElement"


    // $ANTLR start "ruleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:428:1: ruleRelationshipPageElement returns [EObject current=null] : ( (this_List_0= ruleList | this_Table_1= ruleTable ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_List_0 = null;

        EObject this_Table_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:431:28: ( ( (this_List_0= ruleList | this_Table_1= ruleTable ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:432:1: ( (this_List_0= ruleList | this_Table_1= ruleTable ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:432:1: ( (this_List_0= ruleList | this_Table_1= ruleTable ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:432:2: (this_List_0= ruleList | this_Table_1= ruleTable ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:432:2: (this_List_0= ruleList | this_Table_1= ruleTable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:433:5: this_List_0= ruleList
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleRelationshipPageElement864);
                    this_List_0=ruleList();

                    state._fsp--;

                     
                            current = this_List_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:443:5: this_Table_1= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleRelationshipPageElement891);
                    this_Table_1=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRelationshipPageElement903); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:455:1: ( (otherlv_3= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:456:1: (otherlv_3= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:456:1: (otherlv_3= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:457:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipPageElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelationshipPageElement923); 

            		newLeafNode(otherlv_3, grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipPageElement"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:476:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:477:2: (iv_ruleTable= ruleTable EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:478:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable959);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:485:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_columns_6_0 = null;

        EObject lv_columns_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:488:28: ( (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )? otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:489:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )? otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:489:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )? otherlv_9= '}' )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:489:3: otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTable1006); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:493:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:494:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:494:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:495:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable1023); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:511:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:512:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:512:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:513:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable1045); 

            			newLeafNode(lv_label_2_0, grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable1062); 

                	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getHandlesKeyword_3());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:533:1: ( (otherlv_4= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:534:1: (otherlv_4= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:534:1: (otherlv_4= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:535:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable1082); 

            		newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable1094); 

                	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:550:1: ( ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:550:2: ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )*
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:550:2: ( (lv_columns_6_0= ruleColumn ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:551:1: (lv_columns_6_0= ruleColumn )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:551:1: (lv_columns_6_0= ruleColumn )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:552:3: lv_columns_6_0= ruleColumn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable1116);
                    lv_columns_6_0=ruleColumn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		add(
                           			current, 
                           			"columns",
                            		lv_columns_6_0, 
                            		"Column");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:568:2: (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:568:4: otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTable1129); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:572:1: ( (lv_columns_8_0= ruleColumn ) )
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:573:1: (lv_columns_8_0= ruleColumn )
                    	    {
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:573:1: (lv_columns_8_0= ruleColumn )
                    	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:574:3: lv_columns_8_0= ruleColumn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable1150);
                    	    lv_columns_8_0=ruleColumn();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"columns",
                    	            		lv_columns_8_0, 
                    	            		"Column");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable1166); 

                	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:602:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:603:2: (iv_ruleColumn= ruleColumn EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:604:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn1202);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn1212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:611:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:614:28: ( (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:615:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:615:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:615:3: otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleColumn1249); 

                	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:619:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:620:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:620:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:621:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleColumn1266); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:637:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:638:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:638:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:639:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleColumn1288); 

            			newLeafNode(lv_label_2_0, grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleColumn1305); 

                	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getHandlesKeyword_3());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:659:1: ( (otherlv_4= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:660:1: (otherlv_4= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:660:1: (otherlv_4= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:661:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleColumn1325); 

            		newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:680:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:681:2: (iv_ruleList= ruleList EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:682:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList1361);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList1371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:689:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:692:28: ( (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:693:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:693:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:693:3: otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleList1408); 

                	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:697:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:698:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:698:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:699:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList1425); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:715:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:716:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:716:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:717:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleList1447); 

            			newLeafNode(lv_label_2_0, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleList1464); 

                	newLeafNode(otherlv_3, grammarAccess.getListAccess().getHandlesKeyword_3());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:737:1: ( (otherlv_4= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:738:1: (otherlv_4= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:738:1: (otherlv_4= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:739:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList1484); 

            		newLeafNode(otherlv_4, grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:758:1: entryRuleAttributePageElement returns [EObject current=null] : iv_ruleAttributePageElement= ruleAttributePageElement EOF ;
    public final EObject entryRuleAttributePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:759:2: (iv_ruleAttributePageElement= ruleAttributePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:760:2: iv_ruleAttributePageElement= ruleAttributePageElement EOF
            {
             newCompositeNode(grammarAccess.getAttributePageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement1520);
            iv_ruleAttributePageElement=ruleAttributePageElement();

            state._fsp--;

             current =iv_ruleAttributePageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributePageElement1530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributePageElement"


    // $ANTLR start "ruleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:767:1: ruleAttributePageElement returns [EObject current=null] : ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField ) otherlv_5= 'handles' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleAttributePageElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_TextField_0 = null;

        EObject this_TextArea_1 = null;

        EObject this_SelectionField_2 = null;

        EObject this_DateSelectionField_3 = null;

        EObject this_TimeSelectionField_4 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:770:28: ( ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField ) otherlv_5= 'handles' ( (otherlv_6= RULE_ID ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:1: ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField ) otherlv_5= 'handles' ( (otherlv_6= RULE_ID ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:1: ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField ) otherlv_5= 'handles' ( (otherlv_6= RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:2: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField ) otherlv_5= 'handles' ( (otherlv_6= RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:2: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_DateSelectionField_3= ruleDateSelectionField | this_TimeSelectionField_4= ruleTimeSelectionField )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:772:5: this_TextField_0= ruleTextField
                    {
                     
                            newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_ruleAttributePageElement1578);
                    this_TextField_0=ruleTextField();

                    state._fsp--;

                     
                            current = this_TextField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:782:5: this_TextArea_1= ruleTextArea
                    {
                     
                            newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_ruleAttributePageElement1605);
                    this_TextArea_1=ruleTextArea();

                    state._fsp--;

                     
                            current = this_TextArea_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:792:5: this_SelectionField_2= ruleSelectionField
                    {
                     
                            newCompositeNode(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_0_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_ruleAttributePageElement1632);
                    this_SelectionField_2=ruleSelectionField();

                    state._fsp--;

                     
                            current = this_SelectionField_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:802:5: this_DateSelectionField_3= ruleDateSelectionField
                    {
                     
                            newCompositeNode(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_0_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement1659);
                    this_DateSelectionField_3=ruleDateSelectionField();

                    state._fsp--;

                     
                            current = this_DateSelectionField_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:812:5: this_TimeSelectionField_4= ruleTimeSelectionField
                    {
                     
                            newCompositeNode(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_0_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement1686);
                    this_TimeSelectionField_4=ruleTimeSelectionField();

                    state._fsp--;

                     
                            current = this_TimeSelectionField_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttributePageElement1698); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:824:1: ( (otherlv_6= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:825:1: (otherlv_6= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:825:1: (otherlv_6= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:826:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributePageElementRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributePageElement1718); 

            		newLeafNode(otherlv_6, grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributePageElement"


    // $ANTLR start "entryRuleTextField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:845:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:846:2: (iv_ruleTextField= ruleTextField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:847:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextField_in_entryRuleTextField1754);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextField1764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:854:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token lv_format_4_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:857:28: ( (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:858:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:858:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:858:3: otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTextField1801); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:862:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:863:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:863:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:864:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextField1818); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:880:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:881:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:881:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:882:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextField1840); 

            			newLeafNode(lv_label_2_0, grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:898:2: (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:898:4: otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTextField1858); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getFormatKeyword_3_0());
                        
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:902:1: ( (lv_format_4_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:903:1: (lv_format_4_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:903:1: (lv_format_4_0= RULE_STRING )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:904:3: lv_format_4_0= RULE_STRING
                    {
                    lv_format_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextField1875); 

                    			newLeafNode(lv_format_4_0, grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"format",
                            		lv_format_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTextArea"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:928:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:929:2: (iv_ruleTextArea= ruleTextArea EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:930:2: iv_ruleTextArea= ruleTextArea EOF
            {
             newCompositeNode(grammarAccess.getTextAreaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_entryRuleTextArea1918);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;

             current =iv_ruleTextArea; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextArea1928); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:937:1: ruleTextArea returns [EObject current=null] : (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:940:28: ( (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:941:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:941:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:941:3: otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTextArea1965); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:945:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:946:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:946:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:947:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextArea1982); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextAreaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:963:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:964:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:964:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:965:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextArea2004); 

            			newLeafNode(lv_label_2_0, grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextAreaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:989:1: entryRuleSelectionField returns [EObject current=null] : iv_ruleSelectionField= ruleSelectionField EOF ;
    public final EObject entryRuleSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:990:2: (iv_ruleSelectionField= ruleSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:991:2: iv_ruleSelectionField= ruleSelectionField EOF
            {
             newCompositeNode(grammarAccess.getSelectionFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_entryRuleSelectionField2045);
            iv_ruleSelectionField=ruleSelectionField();

            state._fsp--;

             current =iv_ruleSelectionField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionField2055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionField"


    // $ANTLR start "ruleSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:998:1: ruleSelectionField returns [EObject current=null] : (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1001:28: ( (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1002:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1002:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1002:3: otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSelectionField2092); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1006:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1007:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1007:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1008:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSelectionField2109); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1024:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1025:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1025:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1026:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelectionField2131); 

            			newLeafNode(lv_label_2_0, grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionField"


    // $ANTLR start "entryRuleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1050:1: entryRuleDateSelectionField returns [EObject current=null] : iv_ruleDateSelectionField= ruleDateSelectionField EOF ;
    public final EObject entryRuleDateSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1051:2: (iv_ruleDateSelectionField= ruleDateSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1052:2: iv_ruleDateSelectionField= ruleDateSelectionField EOF
            {
             newCompositeNode(grammarAccess.getDateSelectionFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2172);
            iv_ruleDateSelectionField=ruleDateSelectionField();

            state._fsp--;

             current =iv_ruleDateSelectionField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateSelectionField2182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateSelectionField"


    // $ANTLR start "ruleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1059:1: ruleDateSelectionField returns [EObject current=null] : (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDateSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1062:28: ( (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1063:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1063:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1063:3: otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDateSelectionField2219); 

                	newLeafNode(otherlv_0, grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1067:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1068:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1068:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1069:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDateSelectionField2236); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1085:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1086:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1086:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1087:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateSelectionField2258); 

            			newLeafNode(lv_label_2_0, grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateSelectionField"


    // $ANTLR start "entryRuleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1111:1: entryRuleTimeSelectionField returns [EObject current=null] : iv_ruleTimeSelectionField= ruleTimeSelectionField EOF ;
    public final EObject entryRuleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1112:2: (iv_ruleTimeSelectionField= ruleTimeSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1113:2: iv_ruleTimeSelectionField= ruleTimeSelectionField EOF
            {
             newCompositeNode(grammarAccess.getTimeSelectionFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2299);
            iv_ruleTimeSelectionField=ruleTimeSelectionField();

            state._fsp--;

             current =iv_ruleTimeSelectionField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSelectionField2309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSelectionField"


    // $ANTLR start "ruleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1120:1: ruleTimeSelectionField returns [EObject current=null] : (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1123:28: ( (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1124:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1124:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1124:3: otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTimeSelectionField2346); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1128:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1129:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1129:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1130:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTimeSelectionField2363); 

            			newLeafNode(lv_elementID_1_0, grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"elementID",
                    		lv_elementID_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1146:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1147:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1147:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1148:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTimeSelectionField2385); 

            			newLeafNode(lv_label_2_0, grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSelectionField"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1172:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1173:2: (iv_ruleCondition= ruleCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1174:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition2426);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition2436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1181:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'with' (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AttributeValueCondition_1 = null;

        EObject this_CompositeCondition_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1184:28: ( (otherlv_0= 'with' (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1185:1: (otherlv_0= 'with' (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1185:1: (otherlv_0= 'with' (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1185:3: otherlv_0= 'with' (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCondition2473); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWithKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1189:1: (this_AttributeValueCondition_1= ruleAttributeValueCondition | this_CompositeCondition_2= ruleCompositeCondition )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1190:5: this_AttributeValueCondition_1= ruleAttributeValueCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCondition2496);
                    this_AttributeValueCondition_1=ruleAttributeValueCondition();

                    state._fsp--;

                     
                            current = this_AttributeValueCondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1200:5: this_CompositeCondition_2= ruleCompositeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleCondition2523);
                    this_CompositeCondition_2=ruleCompositeCondition();

                    state._fsp--;

                     
                            current = this_CompositeCondition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1216:1: entryRuleAttributeValueCondition returns [EObject current=null] : iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF ;
    public final EObject entryRuleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1217:2: (iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1218:2: iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition2559);
            iv_ruleAttributeValueCondition=ruleAttributeValueCondition();

            state._fsp--;

             current =iv_ruleAttributeValueCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeValueCondition2569); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValueCondition"


    // $ANTLR start "ruleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1225:1: ruleAttributeValueCondition returns [EObject current=null] : (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) ;
    public final EObject ruleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1228:28: ( (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1229:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1229:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1229:3: otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttributeValueCondition2606); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1233:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1234:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1234:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1235:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeValueCondition2623); 

            			newLeafNode(lv_conditionID_1_0, grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionID",
                    		lv_conditionID_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAttributeValueCondition2640); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1255:1: ( (otherlv_3= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1256:1: (otherlv_3= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1256:1: (otherlv_3= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1257:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeValueCondition2660); 

            		newLeafNode(otherlv_3, grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAttributeValueCondition2672); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1272:1: ( (lv_value_5_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1273:1: (lv_value_5_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1273:1: (lv_value_5_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1274:3: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeValueCondition2689); 

            			newLeafNode(lv_value_5_0, grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAttributeValueCondition2706); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1294:1: ( (lv_type_7_0= ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1295:1: (lv_type_7_0= ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1295:1: (lv_type_7_0= ruleConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1296:3: lv_type_7_0= ruleConditionType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_ruleAttributeValueCondition2727);
            lv_type_7_0=ruleConditionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeValueConditionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"ConditionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValueCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1320:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1321:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1322:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition2763);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition2773); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1329:1: ruleCompositeCondition returns [EObject current=null] : (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_composedConditions_4_0 = null;

        Enumerator lv_compositionType_5_0 = null;

        EObject lv_composedConditions_6_0 = null;

        Enumerator lv_type_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1332:28: ( (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1333:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1333:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1333:3: otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCompositeCondition2810); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1337:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1338:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1338:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1339:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompositeCondition2827); 

            			newLeafNode(lv_conditionID_1_0, grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionID",
                    		lv_conditionID_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompositeCondition2844); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeCondition2856); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1363:1: ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1364:1: (lv_composedConditions_4_0= ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1364:1: (lv_composedConditions_4_0= ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1365:3: lv_composedConditions_4_0= ruleAttributeValueCondition
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition2877);
            lv_composedConditions_4_0=ruleAttributeValueCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	        }
                   		add(
                   			current, 
                   			"composedConditions",
                    		lv_composedConditions_4_0, 
                    		"AttributeValueCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1381:2: ( (lv_compositionType_5_0= ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1382:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1382:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1383:3: lv_compositionType_5_0= ruleCompositeConditionType
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition2898);
            lv_compositionType_5_0=ruleCompositeConditionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	        }
                   		set(
                   			current, 
                   			"compositionType",
                    		lv_compositionType_5_0, 
                    		"CompositeConditionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1399:2: ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1400:1: (lv_composedConditions_6_0= ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1400:1: (lv_composedConditions_6_0= ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1401:3: lv_composedConditions_6_0= ruleAttributeValueCondition
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition2919);
            lv_composedConditions_6_0=ruleAttributeValueCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	        }
                   		add(
                   			current, 
                   			"composedConditions",
                    		lv_composedConditions_6_0, 
                    		"AttributeValueCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeCondition2931); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCompositeCondition2943); 

                	newLeafNode(otherlv_8, grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8());
                
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1425:1: ( (lv_type_9_0= ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1426:1: (lv_type_9_0= ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1426:1: (lv_type_9_0= ruleConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1427:3: lv_type_9_0= ruleConditionType
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_ruleCompositeCondition2964);
            lv_type_9_0=ruleConditionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_9_0, 
                    		"ConditionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "ruleConditionType"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1455:1: ruleConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Show' ) | (enumLiteral_1= 'Hide' ) | (enumLiteral_2= 'Disable' ) | (enumLiteral_3= 'Enable' ) | (enumLiteral_4= 'None' ) ) ;
    public final Enumerator ruleConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1457:28: ( ( (enumLiteral_0= 'Show' ) | (enumLiteral_1= 'Hide' ) | (enumLiteral_2= 'Disable' ) | (enumLiteral_3= 'Enable' ) | (enumLiteral_4= 'None' ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1458:1: ( (enumLiteral_0= 'Show' ) | (enumLiteral_1= 'Hide' ) | (enumLiteral_2= 'Disable' ) | (enumLiteral_3= 'Enable' ) | (enumLiteral_4= 'None' ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1458:1: ( (enumLiteral_0= 'Show' ) | (enumLiteral_1= 'Hide' ) | (enumLiteral_2= 'Disable' ) | (enumLiteral_3= 'Enable' ) | (enumLiteral_4= 'None' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1458:2: (enumLiteral_0= 'Show' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1458:2: (enumLiteral_0= 'Show' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1458:4: enumLiteral_0= 'Show'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConditionType3018); 

                            current = grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1464:6: (enumLiteral_1= 'Hide' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1464:6: (enumLiteral_1= 'Hide' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1464:8: enumLiteral_1= 'Hide'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConditionType3035); 

                            current = grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1470:6: (enumLiteral_2= 'Disable' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1470:6: (enumLiteral_2= 'Disable' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1470:8: enumLiteral_2= 'Disable'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConditionType3052); 

                            current = grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1476:6: (enumLiteral_3= 'Enable' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1476:6: (enumLiteral_3= 'Enable' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1476:8: enumLiteral_3= 'Enable'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConditionType3069); 

                            current = grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1482:6: (enumLiteral_4= 'None' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1482:6: (enumLiteral_4= 'None' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1482:8: enumLiteral_4= 'None'
                    {
                    enumLiteral_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConditionType3086); 

                            current = grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1492:1: ruleCompositeConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleCompositeConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1494:28: ( ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1495:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1495:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1495:2: (enumLiteral_0= 'or' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1495:2: (enumLiteral_0= 'or' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1495:4: enumLiteral_0= 'or'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCompositeConditionType3131); 

                            current = grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1501:6: (enumLiteral_1= 'and' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1501:6: (enumLiteral_1= 'and' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1501:8: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCompositeConditionType3148); 

                            current = grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeConditionType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormModel_in_entryRuleFormModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_ruleFormModel130 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleForm_in_entryRuleForm166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForm176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleForm219 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleForm245 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForm262 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleForm284 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleForm302 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleForm319 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleForm336 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleForm350 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForm370 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleForm382 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rulePage_in_ruleForm403 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleForm416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulePage499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePage516 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePage533 = new BitSet(new long[]{0x000000003DA20000L});
        public static final BitSet FOLLOW_rulePageElement_in_rulePage555 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_19_in_rulePage568 = new BitSet(new long[]{0x000000003DA00000L});
        public static final BitSet FOLLOW_rulePageElement_in_rulePage589 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_rulePage605 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rulePage626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageElement673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rulePageElement721 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rulePageElement748 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rulePageElement769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipPageElement816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_ruleRelationshipPageElement864 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleTable_in_ruleRelationshipPageElement891 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRelationshipPageElement903 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipPageElement923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTable1006 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable1023 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable1045 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable1062 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable1082 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTable1094 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable1116 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_19_in_ruleTable1129 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable1150 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleTable1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn1202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleColumn1249 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleColumn1266 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleColumn1288 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleColumn1305 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleColumn1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList1361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleList1408 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList1425 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleList1447 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleList1464 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement1520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributePageElement1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_ruleAttributePageElement1578 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleTextArea_in_ruleAttributePageElement1605 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleSelectionField_in_ruleAttributePageElement1632 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement1659 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement1686 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAttributePageElement1698 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributePageElement1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField1754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextField1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleTextField1801 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextField1818 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField1840 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleTextField1858 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea1918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextArea1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTextArea1965 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextArea1982 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextArea2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_entryRuleSelectionField2045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionField2055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSelectionField2092 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionField2109 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelectionField2131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateSelectionField2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDateSelectionField2219 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDateSelectionField2236 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateSelectionField2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSelectionField2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTimeSelectionField2346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTimeSelectionField2363 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTimeSelectionField2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCondition2473 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCondition2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleCondition2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition2559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueCondition2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAttributeValueCondition2606 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValueCondition2623 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAttributeValueCondition2640 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValueCondition2660 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAttributeValueCondition2672 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeValueCondition2689 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAttributeValueCondition2706 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_ruleConditionType_in_ruleAttributeValueCondition2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition2763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition2773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCompositeCondition2810 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeCondition2827 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCompositeCondition2844 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeCondition2856 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition2877 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition2898 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition2919 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCompositeCondition2931 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCompositeCondition2943 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_ruleConditionType_in_ruleCompositeCondition2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleConditionType3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleConditionType3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleConditionType3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleConditionType3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleConditionType3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleCompositeConditionType3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleCompositeConditionType3148 = new BitSet(new long[]{0x0000000000000002L});
    }


}