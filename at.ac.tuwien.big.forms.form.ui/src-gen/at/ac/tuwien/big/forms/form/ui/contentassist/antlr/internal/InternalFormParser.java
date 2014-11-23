package at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Show'", "'Hide'", "'Disable'", "'Enable'", "'None'", "'or'", "'and'", "'form'", "'handles'", "'{'", "'}'", "'('", "')'", "'page'", "','", "'edits'", "'table'", "'column'", "'list'", "'text-field'", "'format'", "'text-area'", "'selection-field'", "'date-selection-field'", "'time-selection-field'", "'with'", "'attribute-condition'", "':'", "'=='", "'?'", "'composite-condition'", "'welcome'"
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g"; }


     
     	private FormGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FormGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFormModel"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:61:1: entryRuleFormModel : ruleFormModel EOF ;
    public final void entryRuleFormModel() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:62:1: ( ruleFormModel EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:63:1: ruleFormModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormModel_in_entryRuleFormModel67);
            ruleFormModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormModel"


    // $ANTLR start "ruleFormModel"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:70:1: ruleFormModel : ( ( rule__FormModel__FormsAssignment )* ) ;
    public final void ruleFormModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:74:2: ( ( ( rule__FormModel__FormsAssignment )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:75:1: ( ( rule__FormModel__FormsAssignment )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:75:1: ( ( rule__FormModel__FormsAssignment )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:76:1: ( rule__FormModel__FormsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsAssignment()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:77:1: ( rule__FormModel__FormsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:77:2: rule__FormModel__FormsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FormModel__FormsAssignment_in_ruleFormModel100);
            	    rule__FormModel__FormsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormModel"


    // $ANTLR start "entryRuleForm"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:89:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:90:1: ( ruleForm EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:91:1: ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_entryRuleForm128);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForm135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:98:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:102:2: ( ( ( rule__Form__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:103:1: ( ( rule__Form__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:103:1: ( ( rule__Form__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:104:1: ( rule__Form__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:105:1: ( rule__Form__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:105:2: rule__Form__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__0_in_ruleForm161);
            rule__Form__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRulePage"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:117:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:118:1: ( rulePage EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:119:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage188);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:126:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:130:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:131:1: ( ( rule__Page__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:131:1: ( ( rule__Page__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:132:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:133:1: ( rule__Page__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:133:2: rule__Page__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0_in_rulePage221);
            rule__Page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRulePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:145:1: entryRulePageElement : rulePageElement EOF ;
    public final void entryRulePageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:146:1: ( rulePageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:147:1: rulePageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_entryRulePageElement248);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageElement255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageElement"


    // $ANTLR start "rulePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:154:1: rulePageElement : ( ( rule__PageElement__Group__0 ) ) ;
    public final void rulePageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:158:2: ( ( ( rule__PageElement__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:159:1: ( ( rule__PageElement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:159:1: ( ( rule__PageElement__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:160:1: ( rule__PageElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:161:1: ( rule__PageElement__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:161:2: rule__PageElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__0_in_rulePageElement281);
            rule__PageElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageElement"


    // $ANTLR start "entryRuleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:173:1: entryRuleRelationshipPageElement : ruleRelationshipPageElement EOF ;
    public final void entryRuleRelationshipPageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:174:1: ( ruleRelationshipPageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:175:1: ruleRelationshipPageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement308);
            ruleRelationshipPageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipPageElement315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationshipPageElement"


    // $ANTLR start "ruleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:182:1: ruleRelationshipPageElement : ( ( rule__RelationshipPageElement__Group__0 ) ) ;
    public final void ruleRelationshipPageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:186:2: ( ( ( rule__RelationshipPageElement__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:187:1: ( ( rule__RelationshipPageElement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:187:1: ( ( rule__RelationshipPageElement__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:188:1: ( rule__RelationshipPageElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:189:1: ( rule__RelationshipPageElement__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:189:2: rule__RelationshipPageElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__0_in_ruleRelationshipPageElement341);
            rule__RelationshipPageElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipPageElement"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:201:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:202:1: ( ruleTable EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:203:1: ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable368);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:210:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:214:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:215:1: ( ( rule__Table__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:215:1: ( ( rule__Table__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:216:1: ( rule__Table__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:217:1: ( rule__Table__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:217:2: rule__Table__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0_in_ruleTable401);
            rule__Table__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:229:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:230:1: ( ruleColumn EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:231:1: ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn428);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn435); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:238:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:242:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:243:1: ( ( rule__Column__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:243:1: ( ( rule__Column__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:244:1: ( rule__Column__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:245:1: ( rule__Column__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:245:2: rule__Column__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0_in_ruleColumn461);
            rule__Column__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:257:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:258:1: ( ruleList EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:259:1: ruleList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList488);
            ruleList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList495); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:266:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:270:2: ( ( ( rule__List__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:271:1: ( ( rule__List__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:271:1: ( ( rule__List__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:272:1: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:273:1: ( rule__List__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:273:2: rule__List__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0_in_ruleList521);
            rule__List__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:285:1: entryRuleAttributePageElement : ruleAttributePageElement EOF ;
    public final void entryRuleAttributePageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:286:1: ( ruleAttributePageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:287:1: ruleAttributePageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement548);
            ruleAttributePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributePageElement555); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributePageElement"


    // $ANTLR start "ruleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:294:1: ruleAttributePageElement : ( ( rule__AttributePageElement__Group__0 ) ) ;
    public final void ruleAttributePageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:298:2: ( ( ( rule__AttributePageElement__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:299:1: ( ( rule__AttributePageElement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:299:1: ( ( rule__AttributePageElement__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:300:1: ( rule__AttributePageElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:301:1: ( rule__AttributePageElement__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:301:2: rule__AttributePageElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__0_in_ruleAttributePageElement581);
            rule__AttributePageElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributePageElement"


    // $ANTLR start "entryRuleTextField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:313:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:314:1: ( ruleTextField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:315:1: ruleTextField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextField_in_entryRuleTextField608);
            ruleTextField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextField615); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:322:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:326:2: ( ( ( rule__TextField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:327:1: ( ( rule__TextField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:327:1: ( ( rule__TextField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:328:1: ( rule__TextField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:329:1: ( rule__TextField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:329:2: rule__TextField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0_in_ruleTextField641);
            rule__TextField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTextArea"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:341:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:342:1: ( ruleTextArea EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:343:1: ruleTextArea EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_entryRuleTextArea668);
            ruleTextArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextArea675); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:350:1: ruleTextArea : ( ( rule__TextArea__Group__0 ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:354:2: ( ( ( rule__TextArea__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:355:1: ( ( rule__TextArea__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:355:1: ( ( rule__TextArea__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:356:1: ( rule__TextArea__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:357:1: ( rule__TextArea__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:357:2: rule__TextArea__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0_in_ruleTextArea701);
            rule__TextArea__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:369:1: entryRuleSelectionField : ruleSelectionField EOF ;
    public final void entryRuleSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:370:1: ( ruleSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:371:1: ruleSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_entryRuleSelectionField728);
            ruleSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionField735); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionField"


    // $ANTLR start "ruleSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:378:1: ruleSelectionField : ( ( rule__SelectionField__Group__0 ) ) ;
    public final void ruleSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:382:2: ( ( ( rule__SelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:383:1: ( ( rule__SelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:383:1: ( ( rule__SelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:384:1: ( rule__SelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:385:1: ( rule__SelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:385:2: rule__SelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0_in_ruleSelectionField761);
            rule__SelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionField"


    // $ANTLR start "entryRuleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:397:1: entryRuleDateSelectionField : ruleDateSelectionField EOF ;
    public final void entryRuleDateSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:398:1: ( ruleDateSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:399:1: ruleDateSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField788);
            ruleDateSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateSelectionField795); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateSelectionField"


    // $ANTLR start "ruleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:406:1: ruleDateSelectionField : ( ( rule__DateSelectionField__Group__0 ) ) ;
    public final void ruleDateSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:410:2: ( ( ( rule__DateSelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:411:1: ( ( rule__DateSelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:411:1: ( ( rule__DateSelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:412:1: ( rule__DateSelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:413:1: ( rule__DateSelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:413:2: rule__DateSelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0_in_ruleDateSelectionField821);
            rule__DateSelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateSelectionField"


    // $ANTLR start "entryRuleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:425:1: entryRuleTimeSelectionField : ruleTimeSelectionField EOF ;
    public final void entryRuleTimeSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:426:1: ( ruleTimeSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:427:1: ruleTimeSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField848);
            ruleTimeSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSelectionField855); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSelectionField"


    // $ANTLR start "ruleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:434:1: ruleTimeSelectionField : ( ( rule__TimeSelectionField__Group__0 ) ) ;
    public final void ruleTimeSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:438:2: ( ( ( rule__TimeSelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:439:1: ( ( rule__TimeSelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:439:1: ( ( rule__TimeSelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:440:1: ( rule__TimeSelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:441:1: ( rule__TimeSelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:441:2: rule__TimeSelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0_in_ruleTimeSelectionField881);
            rule__TimeSelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSelectionField"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:453:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:454:1: ( ruleCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:455:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition908);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition915); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:462:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:466:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:467:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:467:1: ( ( rule__Condition__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:468:1: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:469:1: ( rule__Condition__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:469:2: rule__Condition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__0_in_ruleCondition941);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:481:1: entryRuleAttributeValueCondition : ruleAttributeValueCondition EOF ;
    public final void entryRuleAttributeValueCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:482:1: ( ruleAttributeValueCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:483:1: ruleAttributeValueCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition968);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeValueCondition975); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValueCondition"


    // $ANTLR start "ruleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:490:1: ruleAttributeValueCondition : ( ( rule__AttributeValueCondition__Group__0 ) ) ;
    public final void ruleAttributeValueCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:494:2: ( ( ( rule__AttributeValueCondition__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:495:1: ( ( rule__AttributeValueCondition__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:495:1: ( ( rule__AttributeValueCondition__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:496:1: ( rule__AttributeValueCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:497:1: ( rule__AttributeValueCondition__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:497:2: rule__AttributeValueCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0_in_ruleAttributeValueCondition1001);
            rule__AttributeValueCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValueCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:509:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:510:1: ( ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:511:1: ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1028);
            ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition1035); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:518:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:522:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:523:1: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:523:1: ( ( rule__CompositeCondition__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:524:1: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:525:1: ( rule__CompositeCondition__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:525:2: rule__CompositeCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1061);
            rule__CompositeCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "ruleConditionType"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:542:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:546:1: ( ( ( rule__ConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:547:1: ( ( rule__ConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:547:1: ( ( rule__ConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:548:1: ( rule__ConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:549:1: ( rule__ConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:549:2: rule__ConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1102);
            rule__ConditionType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:561:1: ruleCompositeConditionType : ( ( rule__CompositeConditionType__Alternatives ) ) ;
    public final void ruleCompositeConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:565:1: ( ( ( rule__CompositeConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:566:1: ( ( rule__CompositeConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:566:1: ( ( rule__CompositeConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:567:1: ( rule__CompositeConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:568:1: ( rule__CompositeConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:568:2: rule__CompositeConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1138);
            rule__CompositeConditionType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeConditionType"


    // $ANTLR start "rule__PageElement__Alternatives_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:579:1: rule__PageElement__Alternatives_0 : ( ( ruleRelationshipPageElement ) | ( ruleAttributePageElement ) );
    public final void rule__PageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:583:1: ( ( ruleRelationshipPageElement ) | ( ruleAttributePageElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27||LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==30||(LA2_0>=32 && LA2_0<=35)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:584:1: ( ruleRelationshipPageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:584:1: ( ruleRelationshipPageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:585:1: ruleRelationshipPageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives_01173);
                    ruleRelationshipPageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:590:6: ( ruleAttributePageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:590:6: ( ruleAttributePageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:591:1: ruleAttributePageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives_01190);
                    ruleAttributePageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Alternatives_0"


    // $ANTLR start "rule__RelationshipPageElement__Alternatives_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:601:1: rule__RelationshipPageElement__Alternatives_0 : ( ( ruleList ) | ( ruleTable ) );
    public final void rule__RelationshipPageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:605:1: ( ( ruleList ) | ( ruleTable ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:606:1: ( ruleList )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:606:1: ( ruleList )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:607:1: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives_01222);
                    ruleList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:612:6: ( ruleTable )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:612:6: ( ruleTable )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:613:1: ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives_01239);
                    ruleTable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Alternatives_0"


    // $ANTLR start "rule__AttributePageElement__Alternatives_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:623:1: rule__AttributePageElement__Alternatives_0 : ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) );
    public final void rule__AttributePageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:627:1: ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:628:1: ( ruleTextField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:628:1: ( ruleTextField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:629:1: ruleTextField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives_01271);
                    ruleTextField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:634:6: ( ruleTextArea )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:634:6: ( ruleTextArea )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:635:1: ruleTextArea
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives_01288);
                    ruleTextArea();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:640:6: ( ruleSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:640:6: ( ruleSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:641:1: ruleSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_0_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives_01305);
                    ruleSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:646:6: ( ruleDateSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:646:6: ( ruleDateSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:647:1: ruleDateSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_0_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives_01322);
                    ruleDateSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:652:6: ( ruleTimeSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:652:6: ( ruleTimeSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:653:1: ruleTimeSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_0_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives_01339);
                    ruleTimeSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Alternatives_0"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:663:1: rule__Condition__Alternatives_1 : ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:667:1: ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==41) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:668:1: ( ruleAttributeValueCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:668:1: ( ruleAttributeValueCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:669:1: ruleAttributeValueCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_1_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives_11371);
                    ruleAttributeValueCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:674:6: ( ruleCompositeCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:674:6: ( ruleCompositeCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:675:1: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives_11388);
                    ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__ConditionType__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:685:1: rule__ConditionType__Alternatives : ( ( ( 'Show' ) ) | ( ( 'Hide' ) ) | ( ( 'Disable' ) ) | ( ( 'Enable' ) ) | ( ( 'None' ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:689:1: ( ( ( 'Show' ) ) | ( ( 'Hide' ) ) | ( ( 'Disable' ) ) | ( ( 'Enable' ) ) | ( ( 'None' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:690:1: ( ( 'Show' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:690:1: ( ( 'Show' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:691:1: ( 'Show' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:692:1: ( 'Show' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:692:3: 'Show'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__ConditionType__Alternatives1421); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:697:6: ( ( 'Hide' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:697:6: ( ( 'Hide' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:698:1: ( 'Hide' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:699:1: ( 'Hide' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:699:3: 'Hide'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ConditionType__Alternatives1442); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:704:6: ( ( 'Disable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:704:6: ( ( 'Disable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:705:1: ( 'Disable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:706:1: ( 'Disable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:706:3: 'Disable'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConditionType__Alternatives1463); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:711:6: ( ( 'Enable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:711:6: ( ( 'Enable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:712:1: ( 'Enable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:713:1: ( 'Enable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:713:3: 'Enable'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConditionType__Alternatives1484); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:718:6: ( ( 'None' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:718:6: ( ( 'None' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:719:1: ( 'None' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:720:1: ( 'None' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:720:3: 'None'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConditionType__Alternatives1505); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Alternatives"


    // $ANTLR start "rule__CompositeConditionType__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:730:1: rule__CompositeConditionType__Alternatives : ( ( ( 'or' ) ) | ( ( 'and' ) ) );
    public final void rule__CompositeConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:734:1: ( ( ( 'or' ) ) | ( ( 'and' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:735:1: ( ( 'or' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:735:1: ( ( 'or' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:736:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:737:1: ( 'or' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:737:3: 'or'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__CompositeConditionType__Alternatives1541); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:742:6: ( ( 'and' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:742:6: ( ( 'and' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:743:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:744:1: ( 'and' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:744:3: 'and'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__CompositeConditionType__Alternatives1562); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConditionType__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:756:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:760:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:761:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01595);
            rule__Form__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01598);
            rule__Form__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:768:1: rule__Form__Group__0__Impl : ( ( rule__Form__WelcomeFormAssignment_0 )? ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:772:1: ( ( ( rule__Form__WelcomeFormAssignment_0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:773:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:773:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:774:1: ( rule__Form__WelcomeFormAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:775:1: ( rule__Form__WelcomeFormAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:775:2: rule__Form__WelcomeFormAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1625);
                    rule__Form__WelcomeFormAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:785:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:789:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:790:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11656);
            rule__Form__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11659);
            rule__Form__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:797:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:801:1: ( ( 'form' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:802:1: ( 'form' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:802:1: ( 'form' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:803:1: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Form__Group__1__Impl1687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getFormKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:816:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:820:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:821:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__21718);
            rule__Form__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3_in_rule__Form__Group__21721);
            rule__Form__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:828:1: rule__Form__Group__2__Impl : ( ( rule__Form__NameAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:832:1: ( ( ( rule__Form__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:833:1: ( ( rule__Form__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:833:1: ( ( rule__Form__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:834:1: ( rule__Form__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:835:1: ( rule__Form__NameAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:835:2: rule__Form__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl1748);
            rule__Form__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:845:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:849:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:850:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__31778);
            rule__Form__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4_in_rule__Form__Group__31781);
            rule__Form__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:857:1: rule__Form__Group__3__Impl : ( ( rule__Form__TitleAssignment_3 ) ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:861:1: ( ( ( rule__Form__TitleAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:862:1: ( ( rule__Form__TitleAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:862:1: ( ( rule__Form__TitleAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:863:1: ( rule__Form__TitleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:864:1: ( rule__Form__TitleAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:864:2: rule__Form__TitleAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl1808);
            rule__Form__TitleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getTitleAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:874:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:878:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:879:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__41838);
            rule__Form__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5_in_rule__Form__Group__41841);
            rule__Form__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:886:1: rule__Form__Group__4__Impl : ( ( rule__Form__Group_4__0 )? ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:890:1: ( ( ( rule__Form__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:891:1: ( ( rule__Form__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:891:1: ( ( rule__Form__Group_4__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:892:1: ( rule__Form__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getGroup_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:893:1: ( rule__Form__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:893:2: rule__Form__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__0_in_rule__Form__Group__4__Impl1868);
                    rule__Form__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:903:1: rule__Form__Group__5 : rule__Form__Group__5__Impl rule__Form__Group__6 ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:907:1: ( rule__Form__Group__5__Impl rule__Form__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:908:2: rule__Form__Group__5__Impl rule__Form__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51899);
            rule__Form__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51902);
            rule__Form__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:915:1: rule__Form__Group__5__Impl : ( 'handles' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:919:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:920:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:920:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:921:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getHandlesKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Form__Group__5__Impl1930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getHandlesKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__Form__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:934:1: rule__Form__Group__6 : rule__Form__Group__6__Impl rule__Form__Group__7 ;
    public final void rule__Form__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:938:1: ( rule__Form__Group__6__Impl rule__Form__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:939:2: rule__Form__Group__6__Impl rule__Form__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61961);
            rule__Form__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61964);
            rule__Form__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6"


    // $ANTLR start "rule__Form__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:946:1: rule__Form__Group__6__Impl : ( ( rule__Form__EntityAssignment_6 ) ) ;
    public final void rule__Form__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:950:1: ( ( ( rule__Form__EntityAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:951:1: ( ( rule__Form__EntityAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:951:1: ( ( rule__Form__EntityAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:952:1: ( rule__Form__EntityAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:953:1: ( rule__Form__EntityAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:953:2: rule__Form__EntityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__EntityAssignment_6_in_rule__Form__Group__6__Impl1991);
            rule__Form__EntityAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6__Impl"


    // $ANTLR start "rule__Form__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:963:1: rule__Form__Group__7 : rule__Form__Group__7__Impl rule__Form__Group__8 ;
    public final void rule__Form__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:967:1: ( rule__Form__Group__7__Impl rule__Form__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:968:2: rule__Form__Group__7__Impl rule__Form__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72021);
            rule__Form__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72024);
            rule__Form__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__7"


    // $ANTLR start "rule__Form__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:975:1: rule__Form__Group__7__Impl : ( '{' ) ;
    public final void rule__Form__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:979:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:980:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:980:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:981:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Form__Group__7__Impl2052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__7__Impl"


    // $ANTLR start "rule__Form__Group__8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:994:1: rule__Form__Group__8 : rule__Form__Group__8__Impl rule__Form__Group__9 ;
    public final void rule__Form__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:998:1: ( rule__Form__Group__8__Impl rule__Form__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:999:2: rule__Form__Group__8__Impl rule__Form__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82083);
            rule__Form__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__9_in_rule__Form__Group__82086);
            rule__Form__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__8"


    // $ANTLR start "rule__Form__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1006:1: rule__Form__Group__8__Impl : ( ( rule__Form__PagesAssignment_8 )* ) ;
    public final void rule__Form__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1010:1: ( ( ( rule__Form__PagesAssignment_8 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1011:1: ( ( rule__Form__PagesAssignment_8 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1011:1: ( ( rule__Form__PagesAssignment_8 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1012:1: ( rule__Form__PagesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesAssignment_8()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1013:1: ( rule__Form__PagesAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1013:2: rule__Form__PagesAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Form__PagesAssignment_8_in_rule__Form__Group__8__Impl2113);
            	    rule__Form__PagesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__8__Impl"


    // $ANTLR start "rule__Form__Group__9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1023:1: rule__Form__Group__9 : rule__Form__Group__9__Impl ;
    public final void rule__Form__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1027:1: ( rule__Form__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1028:2: rule__Form__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__9__Impl_in_rule__Form__Group__92144);
            rule__Form__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__9"


    // $ANTLR start "rule__Form__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1034:1: rule__Form__Group__9__Impl : ( '}' ) ;
    public final void rule__Form__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1038:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1039:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1039:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1040:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Form__Group__9__Impl2172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__9__Impl"


    // $ANTLR start "rule__Form__Group_4__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1073:1: rule__Form__Group_4__0 : rule__Form__Group_4__0__Impl rule__Form__Group_4__1 ;
    public final void rule__Form__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1077:1: ( rule__Form__Group_4__0__Impl rule__Form__Group_4__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1078:2: rule__Form__Group_4__0__Impl rule__Form__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__0__Impl_in_rule__Form__Group_4__02223);
            rule__Form__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__1_in_rule__Form__Group_4__02226);
            rule__Form__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__0"


    // $ANTLR start "rule__Form__Group_4__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1085:1: rule__Form__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1089:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1090:1: ( '(' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1090:1: ( '(' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1091:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Form__Group_4__0__Impl2254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__0__Impl"


    // $ANTLR start "rule__Form__Group_4__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1104:1: rule__Form__Group_4__1 : rule__Form__Group_4__1__Impl rule__Form__Group_4__2 ;
    public final void rule__Form__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1108:1: ( rule__Form__Group_4__1__Impl rule__Form__Group_4__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1109:2: rule__Form__Group_4__1__Impl rule__Form__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__1__Impl_in_rule__Form__Group_4__12285);
            rule__Form__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__2_in_rule__Form__Group_4__12288);
            rule__Form__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__1"


    // $ANTLR start "rule__Form__Group_4__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1116:1: rule__Form__Group_4__1__Impl : ( ( rule__Form__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Form__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1120:1: ( ( ( rule__Form__DescriptionAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1121:1: ( ( rule__Form__DescriptionAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1121:1: ( ( rule__Form__DescriptionAssignment_4_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1122:1: ( rule__Form__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getDescriptionAssignment_4_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1123:1: ( rule__Form__DescriptionAssignment_4_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1123:2: rule__Form__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__DescriptionAssignment_4_1_in_rule__Form__Group_4__1__Impl2315);
            rule__Form__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__1__Impl"


    // $ANTLR start "rule__Form__Group_4__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1133:1: rule__Form__Group_4__2 : rule__Form__Group_4__2__Impl ;
    public final void rule__Form__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1137:1: ( rule__Form__Group_4__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1138:2: rule__Form__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group_4__2__Impl_in_rule__Form__Group_4__22345);
            rule__Form__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__2"


    // $ANTLR start "rule__Form__Group_4__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1144:1: rule__Form__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1148:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1149:1: ( ')' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1149:1: ( ')' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1150:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Form__Group_4__2__Impl2373); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_4__2__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1169:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1173:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1174:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02410);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02413);
            rule__Page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1181:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1185:1: ( ( 'page' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1186:1: ( 'page' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1186:1: ( 'page' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1187:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Page__Group__0__Impl2441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1200:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1204:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1205:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12472);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12475);
            rule__Page__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1212:1: rule__Page__Group__1__Impl : ( ( rule__Page__TitleAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1216:1: ( ( ( rule__Page__TitleAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1217:1: ( ( rule__Page__TitleAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1217:1: ( ( rule__Page__TitleAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1218:1: ( rule__Page__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1219:1: ( rule__Page__TitleAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1219:2: rule__Page__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2502);
            rule__Page__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1229:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1233:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1234:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22532);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22535);
            rule__Page__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1241:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1245:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1246:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1246:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1247:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Page__Group__2__Impl2563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1260:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1264:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1265:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32594);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32597);
            rule__Page__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1272:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1276:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1277:1: ( ( rule__Page__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1277:1: ( ( rule__Page__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1278:1: ( rule__Page__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1279:1: ( rule__Page__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27||(LA11_0>=29 && LA11_0<=30)||(LA11_0>=32 && LA11_0<=35)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1279:2: rule__Page__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2624);
                    rule__Page__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1289:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1293:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1294:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42655);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42658);
            rule__Page__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1301:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1305:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1306:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1306:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1307:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Page__Group__4__Impl2686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1320:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1324:1: ( rule__Page__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1325:2: rule__Page__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52717);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1331:1: rule__Page__Group__5__Impl : ( ( rule__Page__ConditionAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1335:1: ( ( ( rule__Page__ConditionAssignment_5 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1336:1: ( ( rule__Page__ConditionAssignment_5 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1336:1: ( ( rule__Page__ConditionAssignment_5 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1337:1: ( rule__Page__ConditionAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1338:1: ( rule__Page__ConditionAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1338:2: rule__Page__ConditionAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__ConditionAssignment_5_in_rule__Page__Group__5__Impl2744);
                    rule__Page__ConditionAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group_3__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1360:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1364:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1365:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02787);
            rule__Page__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02790);
            rule__Page__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0"


    // $ANTLR start "rule__Page__Group_3__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1372:1: rule__Page__Group_3__0__Impl : ( ( rule__Page__PageElementsAssignment_3_0 ) ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1376:1: ( ( ( rule__Page__PageElementsAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1377:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1377:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1378:1: ( rule__Page__PageElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1379:1: ( rule__Page__PageElementsAssignment_3_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1379:2: rule__Page__PageElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2817);
            rule__Page__PageElementsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0__Impl"


    // $ANTLR start "rule__Page__Group_3__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1389:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1393:1: ( rule__Page__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1394:2: rule__Page__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12847);
            rule__Page__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1"


    // $ANTLR start "rule__Page__Group_3__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1400:1: rule__Page__Group_3__1__Impl : ( ( rule__Page__Group_3_1__0 )* ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1404:1: ( ( ( rule__Page__Group_3_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1405:1: ( ( rule__Page__Group_3_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1405:1: ( ( rule__Page__Group_3_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1406:1: ( rule__Page__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:1: ( rule__Page__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:2: rule__Page__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2874);
            	    rule__Page__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1__Impl"


    // $ANTLR start "rule__Page__Group_3_1__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1421:1: rule__Page__Group_3_1__0 : rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 ;
    public final void rule__Page__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1425:1: ( rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1426:2: rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02909);
            rule__Page__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02912);
            rule__Page__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3_1__0"


    // $ANTLR start "rule__Page__Group_3_1__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1433:1: rule__Page__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1437:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1438:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1438:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1439:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Page__Group_3_1__0__Impl2940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3_1__0__Impl"


    // $ANTLR start "rule__Page__Group_3_1__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1452:1: rule__Page__Group_3_1__1 : rule__Page__Group_3_1__1__Impl ;
    public final void rule__Page__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1456:1: ( rule__Page__Group_3_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1457:2: rule__Page__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12971);
            rule__Page__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3_1__1"


    // $ANTLR start "rule__Page__Group_3_1__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1463:1: rule__Page__Group_3_1__1__Impl : ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) ;
    public final void rule__Page__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1467:1: ( ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1468:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1468:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1469:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1470:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1470:2: rule__Page__PageElementsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2998);
            rule__Page__PageElementsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3_1__1__Impl"


    // $ANTLR start "rule__PageElement__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1484:1: rule__PageElement__Group__0 : rule__PageElement__Group__0__Impl rule__PageElement__Group__1 ;
    public final void rule__PageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1488:1: ( rule__PageElement__Group__0__Impl rule__PageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1489:2: rule__PageElement__Group__0__Impl rule__PageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__03032);
            rule__PageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__03035);
            rule__PageElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Group__0"


    // $ANTLR start "rule__PageElement__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1496:1: rule__PageElement__Group__0__Impl : ( ( rule__PageElement__Alternatives_0 ) ) ;
    public final void rule__PageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1500:1: ( ( ( rule__PageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1501:1: ( ( rule__PageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1501:1: ( ( rule__PageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1502:1: ( rule__PageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1503:1: ( rule__PageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1503:2: rule__PageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl3062);
            rule__PageElement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Group__0__Impl"


    // $ANTLR start "rule__PageElement__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1513:1: rule__PageElement__Group__1 : rule__PageElement__Group__1__Impl ;
    public final void rule__PageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1517:1: ( rule__PageElement__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1518:2: rule__PageElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__13092);
            rule__PageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Group__1"


    // $ANTLR start "rule__PageElement__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1524:1: rule__PageElement__Group__1__Impl : ( ( rule__PageElement__ConditionAssignment_1 )? ) ;
    public final void rule__PageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1528:1: ( ( ( rule__PageElement__ConditionAssignment_1 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1529:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1529:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1530:1: ( rule__PageElement__ConditionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1531:1: ( rule__PageElement__ConditionAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1531:2: rule__PageElement__ConditionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl3119);
                    rule__PageElement__ConditionAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Group__1__Impl"


    // $ANTLR start "rule__RelationshipPageElement__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1545:1: rule__RelationshipPageElement__Group__0 : rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 ;
    public final void rule__RelationshipPageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1549:1: ( rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1550:2: rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__03154);
            rule__RelationshipPageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__03157);
            rule__RelationshipPageElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__0"


    // $ANTLR start "rule__RelationshipPageElement__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1557:1: rule__RelationshipPageElement__Group__0__Impl : ( ( rule__RelationshipPageElement__Alternatives_0 ) ) ;
    public final void rule__RelationshipPageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1561:1: ( ( ( rule__RelationshipPageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1562:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1562:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1563:1: ( rule__RelationshipPageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1564:1: ( rule__RelationshipPageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1564:2: rule__RelationshipPageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl3184);
            rule__RelationshipPageElement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__0__Impl"


    // $ANTLR start "rule__RelationshipPageElement__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1574:1: rule__RelationshipPageElement__Group__1 : rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 ;
    public final void rule__RelationshipPageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1578:1: ( rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1579:2: rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__13214);
            rule__RelationshipPageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__13217);
            rule__RelationshipPageElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__1"


    // $ANTLR start "rule__RelationshipPageElement__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1586:1: rule__RelationshipPageElement__Group__1__Impl : ( 'edits' ) ;
    public final void rule__RelationshipPageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1590:1: ( ( 'edits' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:1: ( 'edits' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:1: ( 'edits' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1592:1: 'edits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RelationshipPageElement__Group__1__Impl3245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__1__Impl"


    // $ANTLR start "rule__RelationshipPageElement__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1605:1: rule__RelationshipPageElement__Group__2 : rule__RelationshipPageElement__Group__2__Impl ;
    public final void rule__RelationshipPageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1609:1: ( rule__RelationshipPageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1610:2: rule__RelationshipPageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23276);
            rule__RelationshipPageElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__2"


    // $ANTLR start "rule__RelationshipPageElement__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1616:1: rule__RelationshipPageElement__Group__2__Impl : ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) ;
    public final void rule__RelationshipPageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1620:1: ( ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1622:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1623:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1623:2: rule__RelationshipPageElement__EditingFormAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3303);
            rule__RelationshipPageElement__EditingFormAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getEditingFormAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1639:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1643:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1644:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03339);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03342);
            rule__Table__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1651:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1655:1: ( ( 'table' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1656:1: ( 'table' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1656:1: ( 'table' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1657:1: 'table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Table__Group__0__Impl3370); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1670:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1674:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1675:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13401);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13404);
            rule__Table__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1682:1: rule__Table__Group__1__Impl : ( ( rule__Table__ElementIDAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1686:1: ( ( ( rule__Table__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1687:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1687:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1688:1: ( rule__Table__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1689:1: ( rule__Table__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1689:2: rule__Table__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3431);
            rule__Table__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1699:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1703:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1704:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23461);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23464);
            rule__Table__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1711:1: rule__Table__Group__2__Impl : ( ( rule__Table__LabelAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1715:1: ( ( ( rule__Table__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1716:1: ( ( rule__Table__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1716:1: ( ( rule__Table__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1717:1: ( rule__Table__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1718:1: ( rule__Table__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1718:2: rule__Table__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3491);
            rule__Table__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1728:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1732:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1733:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33521);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33524);
            rule__Table__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1740:1: rule__Table__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1744:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1745:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1745:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1746:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Table__Group__3__Impl3552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1759:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1763:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1764:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43583);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43586);
            rule__Table__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1771:1: rule__Table__Group__4__Impl : ( ( rule__Table__RelationshipAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1775:1: ( ( ( rule__Table__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1776:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1776:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1777:1: ( rule__Table__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1778:1: ( rule__Table__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1778:2: rule__Table__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3613);
            rule__Table__RelationshipAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1788:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1792:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1793:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53643);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53646);
            rule__Table__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1800:1: rule__Table__Group__5__Impl : ( '{' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1804:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1805:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1805:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1806:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Table__Group__5__Impl3674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1819:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1823:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1824:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63705);
            rule__Table__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63708);
            rule__Table__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1831:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1835:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1836:1: ( ( rule__Table__Group_6__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1836:1: ( ( rule__Table__Group_6__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1837:1: ( rule__Table__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1838:1: ( rule__Table__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1838:2: rule__Table__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3735);
                    rule__Table__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1848:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1852:1: ( rule__Table__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1853:2: rule__Table__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73766);
            rule__Table__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1859:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1863:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1864:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1864:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1865:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Table__Group__7__Impl3794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group_6__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1894:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1898:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1899:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03841);
            rule__Table__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03844);
            rule__Table__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0"


    // $ANTLR start "rule__Table__Group_6__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1906:1: rule__Table__Group_6__0__Impl : ( ( rule__Table__ColumnsAssignment_6_0 ) ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1910:1: ( ( ( rule__Table__ColumnsAssignment_6_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1911:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1911:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1912:1: ( rule__Table__ColumnsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1913:1: ( rule__Table__ColumnsAssignment_6_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1913:2: rule__Table__ColumnsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3871);
            rule__Table__ColumnsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0__Impl"


    // $ANTLR start "rule__Table__Group_6__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1923:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1927:1: ( rule__Table__Group_6__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1928:2: rule__Table__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13901);
            rule__Table__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1"


    // $ANTLR start "rule__Table__Group_6__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1934:1: rule__Table__Group_6__1__Impl : ( ( rule__Table__Group_6_1__0 )* ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1938:1: ( ( ( rule__Table__Group_6_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1939:1: ( ( rule__Table__Group_6_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1939:1: ( ( rule__Table__Group_6_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1940:1: ( rule__Table__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:1: ( rule__Table__Group_6_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:2: rule__Table__Group_6_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3928);
            	    rule__Table__Group_6_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1__Impl"


    // $ANTLR start "rule__Table__Group_6_1__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1955:1: rule__Table__Group_6_1__0 : rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 ;
    public final void rule__Table__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1959:1: ( rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1960:2: rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03963);
            rule__Table__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03966);
            rule__Table__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_1__0"


    // $ANTLR start "rule__Table__Group_6_1__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1967:1: rule__Table__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1971:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1972:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1972:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1973:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Table__Group_6_1__0__Impl3994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getCommaKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_1__0__Impl"


    // $ANTLR start "rule__Table__Group_6_1__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1986:1: rule__Table__Group_6_1__1 : rule__Table__Group_6_1__1__Impl ;
    public final void rule__Table__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1990:1: ( rule__Table__Group_6_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1991:2: rule__Table__Group_6_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__14025);
            rule__Table__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_1__1"


    // $ANTLR start "rule__Table__Group_6_1__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1997:1: rule__Table__Group_6_1__1__Impl : ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) ;
    public final void rule__Table__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2001:1: ( ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2002:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2002:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2003:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2004:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2004:2: rule__Table__ColumnsAssignment_6_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl4052);
            rule__Table__ColumnsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_1__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2018:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2022:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2023:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__04086);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1_in_rule__Column__Group__04089);
            rule__Column__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2030:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2034:1: ( ( 'column' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2035:1: ( 'column' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2035:1: ( 'column' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2036:1: 'column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Column__Group__0__Impl4117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2049:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2053:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2054:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__14148);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2_in_rule__Column__Group__14151);
            rule__Column__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2061:1: rule__Column__Group__1__Impl : ( ( rule__Column__ElementIDAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2065:1: ( ( ( rule__Column__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2066:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2066:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2067:1: ( rule__Column__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2068:1: ( rule__Column__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2068:2: rule__Column__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl4178);
            rule__Column__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2078:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2082:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2083:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__24208);
            rule__Column__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3_in_rule__Column__Group__24211);
            rule__Column__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2090:1: rule__Column__Group__2__Impl : ( ( rule__Column__LabelAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2094:1: ( ( ( rule__Column__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2095:1: ( ( rule__Column__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2095:1: ( ( rule__Column__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2096:1: ( rule__Column__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2097:1: ( rule__Column__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2097:2: rule__Column__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl4238);
            rule__Column__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2107:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2111:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2112:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34268);
            rule__Column__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34271);
            rule__Column__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2119:1: rule__Column__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2123:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2124:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2124:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2125:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Column__Group__3__Impl4299); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2138:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2142:1: ( rule__Column__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2143:2: rule__Column__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44330);
            rule__Column__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2149:1: rule__Column__Group__4__Impl : ( ( rule__Column__AttributeAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2153:1: ( ( ( rule__Column__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2154:1: ( ( rule__Column__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2154:1: ( ( rule__Column__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2155:1: ( rule__Column__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2156:1: ( rule__Column__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2156:2: rule__Column__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4357);
            rule__Column__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2176:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2180:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2181:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04397);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1_in_rule__List__Group__04400);
            rule__List__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2188:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2192:1: ( ( 'list' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2193:1: ( 'list' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2193:1: ( 'list' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2194:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__List__Group__0__Impl4428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2207:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2211:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2212:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14459);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2_in_rule__List__Group__14462);
            rule__List__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2219:1: rule__List__Group__1__Impl : ( ( rule__List__ElementIDAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2223:1: ( ( ( rule__List__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__List__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__List__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2225:1: ( rule__List__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:1: ( rule__List__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:2: rule__List__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4489);
            rule__List__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2236:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2240:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2241:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24519);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3_in_rule__List__Group__24522);
            rule__List__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2248:1: rule__List__Group__2__Impl : ( ( rule__List__LabelAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2252:1: ( ( ( rule__List__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( ( rule__List__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( ( rule__List__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2254:1: ( rule__List__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2255:1: ( rule__List__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2255:2: rule__List__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4549);
            rule__List__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2265:1: rule__List__Group__3 : rule__List__Group__3__Impl rule__List__Group__4 ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2269:1: ( rule__List__Group__3__Impl rule__List__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2270:2: rule__List__Group__3__Impl rule__List__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34579);
            rule__List__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4_in_rule__List__Group__34582);
            rule__List__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2277:1: rule__List__Group__3__Impl : ( 'handles' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2281:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2282:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2282:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2283:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__List__Group__3__Impl4610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__List__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2296:1: rule__List__Group__4 : rule__List__Group__4__Impl ;
    public final void rule__List__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2300:1: ( rule__List__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2301:2: rule__List__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44641);
            rule__List__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4"


    // $ANTLR start "rule__List__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2307:1: rule__List__Group__4__Impl : ( ( rule__List__RelationshipAssignment_4 ) ) ;
    public final void rule__List__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2311:1: ( ( ( rule__List__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2312:1: ( ( rule__List__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2312:1: ( ( rule__List__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2313:1: ( rule__List__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2314:1: ( rule__List__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2314:2: rule__List__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4668);
            rule__List__RelationshipAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4__Impl"


    // $ANTLR start "rule__AttributePageElement__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2334:1: rule__AttributePageElement__Group__0 : rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 ;
    public final void rule__AttributePageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2338:1: ( rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2339:2: rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04708);
            rule__AttributePageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04711);
            rule__AttributePageElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__0"


    // $ANTLR start "rule__AttributePageElement__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2346:1: rule__AttributePageElement__Group__0__Impl : ( ( rule__AttributePageElement__Alternatives_0 ) ) ;
    public final void rule__AttributePageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2350:1: ( ( ( rule__AttributePageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2351:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2351:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2352:1: ( rule__AttributePageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2353:1: ( rule__AttributePageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2353:2: rule__AttributePageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4738);
            rule__AttributePageElement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__0__Impl"


    // $ANTLR start "rule__AttributePageElement__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2363:1: rule__AttributePageElement__Group__1 : rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 ;
    public final void rule__AttributePageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2367:1: ( rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2368:2: rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14768);
            rule__AttributePageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14771);
            rule__AttributePageElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__1"


    // $ANTLR start "rule__AttributePageElement__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2375:1: rule__AttributePageElement__Group__1__Impl : ( 'handles' ) ;
    public final void rule__AttributePageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2379:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2380:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2380:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2381:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__1__Impl"


    // $ANTLR start "rule__AttributePageElement__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2394:1: rule__AttributePageElement__Group__2 : rule__AttributePageElement__Group__2__Impl ;
    public final void rule__AttributePageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2398:1: ( rule__AttributePageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2399:2: rule__AttributePageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24830);
            rule__AttributePageElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__2"


    // $ANTLR start "rule__AttributePageElement__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2405:1: rule__AttributePageElement__Group__2__Impl : ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) ;
    public final void rule__AttributePageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2409:1: ( ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2410:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2410:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2411:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2412:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2412:2: rule__AttributePageElement__AttributeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4857);
            rule__AttributePageElement__AttributeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getAttributeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2428:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2432:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2433:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04893);
            rule__TextField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04896);
            rule__TextField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2440:1: rule__TextField__Group__0__Impl : ( 'text-field' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2444:1: ( ( 'text-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2445:1: ( 'text-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2445:1: ( 'text-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2446:1: 'text-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextField__Group__0__Impl4924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2459:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2463:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2464:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14955);
            rule__TextField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14958);
            rule__TextField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2471:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__ElementIDAssignment_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2475:1: ( ( ( rule__TextField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2476:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2476:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2477:1: ( rule__TextField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2478:1: ( rule__TextField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2478:2: rule__TextField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4985);
            rule__TextField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2488:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2492:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2493:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__25015);
            rule__TextField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__25018);
            rule__TextField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2"


    // $ANTLR start "rule__TextField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2500:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__LabelAssignment_2 ) ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2504:1: ( ( ( rule__TextField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2505:1: ( ( rule__TextField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2505:1: ( ( rule__TextField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2506:1: ( rule__TextField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2507:1: ( rule__TextField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2507:2: rule__TextField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl5045);
            rule__TextField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2517:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2521:1: ( rule__TextField__Group__3__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2522:2: rule__TextField__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__35075);
            rule__TextField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3"


    // $ANTLR start "rule__TextField__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2528:1: rule__TextField__Group__3__Impl : ( ( rule__TextField__Group_3__0 )? ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2532:1: ( ( ( rule__TextField__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2533:1: ( ( rule__TextField__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2533:1: ( ( rule__TextField__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2534:1: ( rule__TextField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2535:1: ( rule__TextField__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2535:2: rule__TextField__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl5102);
                    rule__TextField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3__Impl"


    // $ANTLR start "rule__TextField__Group_3__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2553:1: rule__TextField__Group_3__0 : rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 ;
    public final void rule__TextField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2557:1: ( rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2558:2: rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__05141);
            rule__TextField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__05144);
            rule__TextField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__0"


    // $ANTLR start "rule__TextField__Group_3__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2565:1: rule__TextField__Group_3__0__Impl : ( 'format' ) ;
    public final void rule__TextField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2569:1: ( ( 'format' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2570:1: ( 'format' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2570:1: ( 'format' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2571:1: 'format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextField__Group_3__0__Impl5172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__0__Impl"


    // $ANTLR start "rule__TextField__Group_3__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2584:1: rule__TextField__Group_3__1 : rule__TextField__Group_3__1__Impl ;
    public final void rule__TextField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2588:1: ( rule__TextField__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2589:2: rule__TextField__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__15203);
            rule__TextField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__1"


    // $ANTLR start "rule__TextField__Group_3__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2595:1: rule__TextField__Group_3__1__Impl : ( ( rule__TextField__FormatAssignment_3_1 ) ) ;
    public final void rule__TextField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2599:1: ( ( ( rule__TextField__FormatAssignment_3_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2600:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2600:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2601:1: ( rule__TextField__FormatAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2602:1: ( rule__TextField__FormatAssignment_3_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2602:2: rule__TextField__FormatAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl5230);
            rule__TextField__FormatAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__1__Impl"


    // $ANTLR start "rule__TextArea__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2616:1: rule__TextArea__Group__0 : rule__TextArea__Group__0__Impl rule__TextArea__Group__1 ;
    public final void rule__TextArea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2620:1: ( rule__TextArea__Group__0__Impl rule__TextArea__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2621:2: rule__TextArea__Group__0__Impl rule__TextArea__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05264);
            rule__TextArea__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05267);
            rule__TextArea__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0"


    // $ANTLR start "rule__TextArea__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2628:1: rule__TextArea__Group__0__Impl : ( 'text-area' ) ;
    public final void rule__TextArea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2632:1: ( ( 'text-area' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2633:1: ( 'text-area' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2633:1: ( 'text-area' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2634:1: 'text-area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TextArea__Group__0__Impl5295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0__Impl"


    // $ANTLR start "rule__TextArea__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2647:1: rule__TextArea__Group__1 : rule__TextArea__Group__1__Impl rule__TextArea__Group__2 ;
    public final void rule__TextArea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2651:1: ( rule__TextArea__Group__1__Impl rule__TextArea__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2652:2: rule__TextArea__Group__1__Impl rule__TextArea__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15326);
            rule__TextArea__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15329);
            rule__TextArea__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1"


    // $ANTLR start "rule__TextArea__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2659:1: rule__TextArea__Group__1__Impl : ( ( rule__TextArea__ElementIDAssignment_1 ) ) ;
    public final void rule__TextArea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2663:1: ( ( ( rule__TextArea__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2664:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2664:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2665:1: ( rule__TextArea__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2666:1: ( rule__TextArea__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2666:2: rule__TextArea__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5356);
            rule__TextArea__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1__Impl"


    // $ANTLR start "rule__TextArea__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2676:1: rule__TextArea__Group__2 : rule__TextArea__Group__2__Impl ;
    public final void rule__TextArea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2680:1: ( rule__TextArea__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2681:2: rule__TextArea__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25386);
            rule__TextArea__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__2"


    // $ANTLR start "rule__TextArea__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2687:1: rule__TextArea__Group__2__Impl : ( ( rule__TextArea__LabelAssignment_2 ) ) ;
    public final void rule__TextArea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2691:1: ( ( ( rule__TextArea__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2692:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2692:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2693:1: ( rule__TextArea__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2694:1: ( rule__TextArea__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2694:2: rule__TextArea__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5413);
            rule__TextArea__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__2__Impl"


    // $ANTLR start "rule__SelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2710:1: rule__SelectionField__Group__0 : rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 ;
    public final void rule__SelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2714:1: ( rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2715:2: rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05449);
            rule__SelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05452);
            rule__SelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__0"


    // $ANTLR start "rule__SelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2722:1: rule__SelectionField__Group__0__Impl : ( 'selection-field' ) ;
    public final void rule__SelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2726:1: ( ( 'selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:1: ( 'selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:1: ( 'selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2728:1: 'selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SelectionField__Group__0__Impl5480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__0__Impl"


    // $ANTLR start "rule__SelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2741:1: rule__SelectionField__Group__1 : rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 ;
    public final void rule__SelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2745:1: ( rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2746:2: rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15511);
            rule__SelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15514);
            rule__SelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__1"


    // $ANTLR start "rule__SelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2753:1: rule__SelectionField__Group__1__Impl : ( ( rule__SelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__SelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2757:1: ( ( ( rule__SelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2759:1: ( rule__SelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2760:1: ( rule__SelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2760:2: rule__SelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5541);
            rule__SelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__1__Impl"


    // $ANTLR start "rule__SelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2770:1: rule__SelectionField__Group__2 : rule__SelectionField__Group__2__Impl ;
    public final void rule__SelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2774:1: ( rule__SelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2775:2: rule__SelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25571);
            rule__SelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__2"


    // $ANTLR start "rule__SelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2781:1: rule__SelectionField__Group__2__Impl : ( ( rule__SelectionField__LabelAssignment_2 ) ) ;
    public final void rule__SelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2785:1: ( ( ( rule__SelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2786:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2786:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2787:1: ( rule__SelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2788:1: ( rule__SelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2788:2: rule__SelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5598);
            rule__SelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__2__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2804:1: rule__DateSelectionField__Group__0 : rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 ;
    public final void rule__DateSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2808:1: ( rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2809:2: rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05634);
            rule__DateSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05637);
            rule__DateSelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__0"


    // $ANTLR start "rule__DateSelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2816:1: rule__DateSelectionField__Group__0__Impl : ( 'date-selection-field' ) ;
    public final void rule__DateSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2820:1: ( ( 'date-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2821:1: ( 'date-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2821:1: ( 'date-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2822:1: 'date-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__DateSelectionField__Group__0__Impl5665); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__0__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2835:1: rule__DateSelectionField__Group__1 : rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 ;
    public final void rule__DateSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2839:1: ( rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2840:2: rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15696);
            rule__DateSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15699);
            rule__DateSelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__1"


    // $ANTLR start "rule__DateSelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2847:1: rule__DateSelectionField__Group__1__Impl : ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__DateSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2851:1: ( ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2852:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2852:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2853:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2854:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2854:2: rule__DateSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5726);
            rule__DateSelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__1__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2864:1: rule__DateSelectionField__Group__2 : rule__DateSelectionField__Group__2__Impl ;
    public final void rule__DateSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2868:1: ( rule__DateSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2869:2: rule__DateSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25756);
            rule__DateSelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__2"


    // $ANTLR start "rule__DateSelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2875:1: rule__DateSelectionField__Group__2__Impl : ( ( rule__DateSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__DateSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2879:1: ( ( ( rule__DateSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2880:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2880:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2881:1: ( rule__DateSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2882:1: ( rule__DateSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2882:2: rule__DateSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5783);
            rule__DateSelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__2__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2898:1: rule__TimeSelectionField__Group__0 : rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 ;
    public final void rule__TimeSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2902:1: ( rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2903:2: rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05819);
            rule__TimeSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05822);
            rule__TimeSelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__0"


    // $ANTLR start "rule__TimeSelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2910:1: rule__TimeSelectionField__Group__0__Impl : ( 'time-selection-field' ) ;
    public final void rule__TimeSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2914:1: ( ( 'time-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2915:1: ( 'time-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2915:1: ( 'time-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2916:1: 'time-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TimeSelectionField__Group__0__Impl5850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__0__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2929:1: rule__TimeSelectionField__Group__1 : rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 ;
    public final void rule__TimeSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2933:1: ( rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2934:2: rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15881);
            rule__TimeSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15884);
            rule__TimeSelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__1"


    // $ANTLR start "rule__TimeSelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2941:1: rule__TimeSelectionField__Group__1__Impl : ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__TimeSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2945:1: ( ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2946:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2946:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2947:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2948:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2948:2: rule__TimeSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5911);
            rule__TimeSelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__1__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2958:1: rule__TimeSelectionField__Group__2 : rule__TimeSelectionField__Group__2__Impl ;
    public final void rule__TimeSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2962:1: ( rule__TimeSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2963:2: rule__TimeSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25941);
            rule__TimeSelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__2"


    // $ANTLR start "rule__TimeSelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2969:1: rule__TimeSelectionField__Group__2__Impl : ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__TimeSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2973:1: ( ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2974:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2974:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2975:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2976:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2976:2: rule__TimeSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5968);
            rule__TimeSelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2992:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2996:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2997:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06004);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06007);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3004:1: rule__Condition__Group__0__Impl : ( 'with' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3008:1: ( ( 'with' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3009:1: ( 'with' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3009:1: ( 'with' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3010:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getWithKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Condition__Group__0__Impl6035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getWithKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3023:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3027:1: ( rule__Condition__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3028:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16066);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3034:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3038:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3039:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3039:1: ( ( rule__Condition__Alternatives_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3040:1: ( rule__Condition__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3041:1: ( rule__Condition__Alternatives_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3041:2: rule__Condition__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6093);
            rule__Condition__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3055:1: rule__AttributeValueCondition__Group__0 : rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 ;
    public final void rule__AttributeValueCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3059:1: ( rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3060:2: rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__06127);
            rule__AttributeValueCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__06130);
            rule__AttributeValueCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__0"


    // $ANTLR start "rule__AttributeValueCondition__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3067:1: rule__AttributeValueCondition__Group__0__Impl : ( 'attribute-condition' ) ;
    public final void rule__AttributeValueCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3071:1: ( ( 'attribute-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3072:1: ( 'attribute-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3072:1: ( 'attribute-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3073:1: 'attribute-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AttributeValueCondition__Group__0__Impl6158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__0__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3086:1: rule__AttributeValueCondition__Group__1 : rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 ;
    public final void rule__AttributeValueCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3090:1: ( rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3091:2: rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__16189);
            rule__AttributeValueCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__16192);
            rule__AttributeValueCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__1"


    // $ANTLR start "rule__AttributeValueCondition__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3098:1: rule__AttributeValueCondition__Group__1__Impl : ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__AttributeValueCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3102:1: ( ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3103:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3103:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3104:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3105:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3105:2: rule__AttributeValueCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl6219);
            rule__AttributeValueCondition__ConditionIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__1__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3115:1: rule__AttributeValueCondition__Group__2 : rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 ;
    public final void rule__AttributeValueCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3119:1: ( rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3120:2: rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__26249);
            rule__AttributeValueCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26252);
            rule__AttributeValueCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__2"


    // $ANTLR start "rule__AttributeValueCondition__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3127:1: rule__AttributeValueCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeValueCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3131:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3132:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3132:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3133:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AttributeValueCondition__Group__2__Impl6280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__2__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3146:1: rule__AttributeValueCondition__Group__3 : rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 ;
    public final void rule__AttributeValueCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3150:1: ( rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3151:2: rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36311);
            rule__AttributeValueCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36314);
            rule__AttributeValueCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__3"


    // $ANTLR start "rule__AttributeValueCondition__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3158:1: rule__AttributeValueCondition__Group__3__Impl : ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) ;
    public final void rule__AttributeValueCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3162:1: ( ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3163:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3163:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3164:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3165:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3165:2: rule__AttributeValueCondition__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6341);
            rule__AttributeValueCondition__AttributeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__3__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3175:1: rule__AttributeValueCondition__Group__4 : rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 ;
    public final void rule__AttributeValueCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3179:1: ( rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3180:2: rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46371);
            rule__AttributeValueCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46374);
            rule__AttributeValueCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__4"


    // $ANTLR start "rule__AttributeValueCondition__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3187:1: rule__AttributeValueCondition__Group__4__Impl : ( '==' ) ;
    public final void rule__AttributeValueCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3191:1: ( ( '==' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3192:1: ( '==' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3192:1: ( '==' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3193:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__AttributeValueCondition__Group__4__Impl6402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__4__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3206:1: rule__AttributeValueCondition__Group__5 : rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 ;
    public final void rule__AttributeValueCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3210:1: ( rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3211:2: rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56433);
            rule__AttributeValueCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56436);
            rule__AttributeValueCondition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__5"


    // $ANTLR start "rule__AttributeValueCondition__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3218:1: rule__AttributeValueCondition__Group__5__Impl : ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) ;
    public final void rule__AttributeValueCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3222:1: ( ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3223:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3223:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3224:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3225:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3225:2: rule__AttributeValueCondition__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6463);
            rule__AttributeValueCondition__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__5__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3235:1: rule__AttributeValueCondition__Group__6 : rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 ;
    public final void rule__AttributeValueCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3239:1: ( rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3240:2: rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66493);
            rule__AttributeValueCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66496);
            rule__AttributeValueCondition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__6"


    // $ANTLR start "rule__AttributeValueCondition__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3247:1: rule__AttributeValueCondition__Group__6__Impl : ( '?' ) ;
    public final void rule__AttributeValueCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3251:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3252:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3252:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3253:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__AttributeValueCondition__Group__6__Impl6524); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__6__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3266:1: rule__AttributeValueCondition__Group__7 : rule__AttributeValueCondition__Group__7__Impl ;
    public final void rule__AttributeValueCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3270:1: ( rule__AttributeValueCondition__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3271:2: rule__AttributeValueCondition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76555);
            rule__AttributeValueCondition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__7"


    // $ANTLR start "rule__AttributeValueCondition__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3277:1: rule__AttributeValueCondition__Group__7__Impl : ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) ;
    public final void rule__AttributeValueCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3281:1: ( ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3282:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3282:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3283:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3284:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3284:2: rule__AttributeValueCondition__TypeAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6582);
            rule__AttributeValueCondition__TypeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__7__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3310:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3314:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3315:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06628);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06631);
            rule__CompositeCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0"


    // $ANTLR start "rule__CompositeCondition__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3322:1: rule__CompositeCondition__Group__0__Impl : ( 'composite-condition' ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3326:1: ( ( 'composite-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3327:1: ( 'composite-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3327:1: ( 'composite-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3328:1: 'composite-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__CompositeCondition__Group__0__Impl6659); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3341:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3345:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3346:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16690);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16693);
            rule__CompositeCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1"


    // $ANTLR start "rule__CompositeCondition__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3353:1: rule__CompositeCondition__Group__1__Impl : ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3357:1: ( ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3358:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3358:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3359:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3360:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3360:2: rule__CompositeCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6720);
            rule__CompositeCondition__ConditionIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3370:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3374:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3375:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26750);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26753);
            rule__CompositeCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2"


    // $ANTLR start "rule__CompositeCondition__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3382:1: rule__CompositeCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3386:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3387:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3387:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3388:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__CompositeCondition__Group__2__Impl6781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3401:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3405:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3406:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36812);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36815);
            rule__CompositeCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3"


    // $ANTLR start "rule__CompositeCondition__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3413:1: rule__CompositeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3417:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3418:1: ( '(' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3418:1: ( '(' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3419:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CompositeCondition__Group__3__Impl6843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3432:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3436:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3437:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46874);
            rule__CompositeCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46877);
            rule__CompositeCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4"


    // $ANTLR start "rule__CompositeCondition__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3444:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3448:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3449:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3449:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3450:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3451:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3451:2: rule__CompositeCondition__ComposedConditionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl6904);
            rule__CompositeCondition__ComposedConditionsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3461:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3465:1: ( rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3466:2: rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56934);
            rule__CompositeCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56937);
            rule__CompositeCondition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5"


    // $ANTLR start "rule__CompositeCondition__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3473:1: rule__CompositeCondition__Group__5__Impl : ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3477:1: ( ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3478:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3478:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3479:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3480:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3480:2: rule__CompositeCondition__CompositionTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl6964);
            rule__CompositeCondition__CompositionTypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3490:1: rule__CompositeCondition__Group__6 : rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 ;
    public final void rule__CompositeCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3494:1: ( rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3495:2: rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66994);
            rule__CompositeCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66997);
            rule__CompositeCondition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__6"


    // $ANTLR start "rule__CompositeCondition__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3502:1: rule__CompositeCondition__Group__6__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) ;
    public final void rule__CompositeCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3506:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3507:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3507:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3508:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3509:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3509:2: rule__CompositeCondition__ComposedConditionsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl7024);
            rule__CompositeCondition__ComposedConditionsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__6__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3519:1: rule__CompositeCondition__Group__7 : rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 ;
    public final void rule__CompositeCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3523:1: ( rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3524:2: rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__77054);
            rule__CompositeCondition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__77057);
            rule__CompositeCondition__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__7"


    // $ANTLR start "rule__CompositeCondition__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3531:1: rule__CompositeCondition__Group__7__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3535:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3536:1: ( ')' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3536:1: ( ')' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3537:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CompositeCondition__Group__7__Impl7085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__7__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3550:1: rule__CompositeCondition__Group__8 : rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 ;
    public final void rule__CompositeCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3554:1: ( rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3555:2: rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__87116);
            rule__CompositeCondition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__87119);
            rule__CompositeCondition__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__8"


    // $ANTLR start "rule__CompositeCondition__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3562:1: rule__CompositeCondition__Group__8__Impl : ( '?' ) ;
    public final void rule__CompositeCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3566:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3567:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3567:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3568:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__CompositeCondition__Group__8__Impl7147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__8__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3581:1: rule__CompositeCondition__Group__9 : rule__CompositeCondition__Group__9__Impl ;
    public final void rule__CompositeCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3585:1: ( rule__CompositeCondition__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3586:2: rule__CompositeCondition__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__97178);
            rule__CompositeCondition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__9"


    // $ANTLR start "rule__CompositeCondition__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3592:1: rule__CompositeCondition__Group__9__Impl : ( ( rule__CompositeCondition__TypeAssignment_9 ) ) ;
    public final void rule__CompositeCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3596:1: ( ( ( rule__CompositeCondition__TypeAssignment_9 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3597:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3597:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3598:1: ( rule__CompositeCondition__TypeAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3599:1: ( rule__CompositeCondition__TypeAssignment_9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3599:2: rule__CompositeCondition__TypeAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl7205);
            rule__CompositeCondition__TypeAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__9__Impl"


    // $ANTLR start "rule__FormModel__FormsAssignment"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3633:1: rule__FormModel__FormsAssignment : ( ruleForm ) ;
    public final void rule__FormModel__FormsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3637:1: ( ( ruleForm ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3638:1: ( ruleForm )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3638:1: ( ruleForm )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3639:1: ruleForm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment7263);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__FormsAssignment"


    // $ANTLR start "rule__Form__WelcomeFormAssignment_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3648:1: rule__Form__WelcomeFormAssignment_0 : ( ( 'welcome' ) ) ;
    public final void rule__Form__WelcomeFormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3652:1: ( ( ( 'welcome' ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3653:1: ( ( 'welcome' ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3653:1: ( ( 'welcome' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3654:1: ( 'welcome' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3655:1: ( 'welcome' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3656:1: 'welcome'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Form__WelcomeFormAssignment_07299); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__WelcomeFormAssignment_0"


    // $ANTLR start "rule__Form__NameAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3671:1: rule__Form__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3675:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3676:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3676:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3677:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_2"


    // $ANTLR start "rule__Form__TitleAssignment_3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3686:1: rule__Form__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Form__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3690:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3691:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3691:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3692:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_37369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__TitleAssignment_3"


    // $ANTLR start "rule__Form__DescriptionAssignment_4_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3701:1: rule__Form__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Form__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3705:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3706:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3706:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Form__DescriptionAssignment_4_17400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Form__EntityAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3716:1: rule__Form__EntityAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Form__EntityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3720:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3721:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3721:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3722:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3723:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3724:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_67435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__EntityAssignment_6"


    // $ANTLR start "rule__Form__PagesAssignment_8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3735:1: rule__Form__PagesAssignment_8 : ( rulePage ) ;
    public final void rule__Form__PagesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3739:1: ( ( rulePage ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3740:1: ( rulePage )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3740:1: ( rulePage )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3741:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Form__PagesAssignment_87470);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__PagesAssignment_8"


    // $ANTLR start "rule__Page__TitleAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3750:1: rule__Page__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3754:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3755:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3755:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3756:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TitleAssignment_1"


    // $ANTLR start "rule__Page__PageElementsAssignment_3_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3765:1: rule__Page__PageElementsAssignment_3_0 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3769:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3770:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3770:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3771:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07532);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PageElementsAssignment_3_0"


    // $ANTLR start "rule__Page__PageElementsAssignment_3_1_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3780:1: rule__Page__PageElementsAssignment_3_1_1 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3784:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3785:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3785:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3786:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17563);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PageElementsAssignment_3_1_1"


    // $ANTLR start "rule__Page__ConditionAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3795:1: rule__Page__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Page__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3799:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3800:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3800:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3801:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_57594);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ConditionAssignment_5"


    // $ANTLR start "rule__PageElement__ConditionAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3810:1: rule__PageElement__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__PageElement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3814:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3815:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3815:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3816:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17625);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__ConditionAssignment_1"


    // $ANTLR start "rule__RelationshipPageElement__EditingFormAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3825:1: rule__RelationshipPageElement__EditingFormAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationshipPageElement__EditingFormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3829:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3830:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3830:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3831:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3832:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3833:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__EditingFormAssignment_2"


    // $ANTLR start "rule__Table__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3844:1: rule__Table__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3848:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3849:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3849:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3850:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17695); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementIDAssignment_1"


    // $ANTLR start "rule__Table__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3859:1: rule__Table__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Table__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3863:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3864:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3864:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3865:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__LabelAssignment_2"


    // $ANTLR start "rule__Table__RelationshipAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3874:1: rule__Table__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Table__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3878:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3879:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3879:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3880:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3881:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3882:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RelationshipAssignment_4"


    // $ANTLR start "rule__Table__ColumnsAssignment_6_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3893:1: rule__Table__ColumnsAssignment_6_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3897:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3898:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3898:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3899:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07796);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_6_0"


    // $ANTLR start "rule__Table__ColumnsAssignment_6_1_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3908:1: rule__Table__ColumnsAssignment_6_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3912:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3913:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3913:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3914:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17827);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_6_1_1"


    // $ANTLR start "rule__Column__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3923:1: rule__Column__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3927:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3928:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3928:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3929:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ElementIDAssignment_1"


    // $ANTLR start "rule__Column__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3938:1: rule__Column__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Column__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3942:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3943:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3943:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3944:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__LabelAssignment_2"


    // $ANTLR start "rule__Column__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3953:1: rule__Column__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Column__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3957:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3958:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3958:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3959:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3960:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3961:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAttributeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__AttributeAssignment_4"


    // $ANTLR start "rule__List__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3972:1: rule__List__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3976:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3977:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3977:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3978:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ElementIDAssignment_1"


    // $ANTLR start "rule__List__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3987:1: rule__List__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__List__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3991:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3992:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3992:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__LabelAssignment_2"


    // $ANTLR start "rule__List__RelationshipAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4002:1: rule__List__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__List__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4006:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4007:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4007:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4009:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4010:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_48025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__RelationshipAssignment_4"


    // $ANTLR start "rule__AttributePageElement__AttributeAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4021:1: rule__AttributePageElement__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePageElement__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4025:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4026:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4026:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4027:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4028:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4029:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_28064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__AttributeAssignment_2"


    // $ANTLR start "rule__TextField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4040:1: rule__TextField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4044:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4045:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4045:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4046:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_18099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__ElementIDAssignment_1"


    // $ANTLR start "rule__TextField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4055:1: rule__TextField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4059:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4060:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4060:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4061:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_28130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__LabelAssignment_2"


    // $ANTLR start "rule__TextField__FormatAssignment_3_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4070:1: rule__TextField__FormatAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TextField__FormatAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4074:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4075:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4075:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4076:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_18161); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__FormatAssignment_3_1"


    // $ANTLR start "rule__TextArea__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4085:1: rule__TextArea__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextArea__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4089:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4090:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4090:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4091:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_18192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__ElementIDAssignment_1"


    // $ANTLR start "rule__TextArea__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4100:1: rule__TextArea__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextArea__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4104:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4105:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4105:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4106:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_28223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__LabelAssignment_2"


    // $ANTLR start "rule__SelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4115:1: rule__SelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4119:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4120:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4120:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4121:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_18254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__SelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4130:1: rule__SelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4134:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4135:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4135:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4136:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_28285); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__LabelAssignment_2"


    // $ANTLR start "rule__DateSelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4145:1: rule__DateSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__DateSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4149:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4150:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4150:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4151:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_18316); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__DateSelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4160:1: rule__DateSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DateSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4164:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4165:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4165:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4166:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_28347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__LabelAssignment_2"


    // $ANTLR start "rule__TimeSelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4175:1: rule__TimeSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TimeSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4179:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4180:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4180:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4181:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_18378); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__TimeSelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4190:1: rule__TimeSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TimeSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4194:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4195:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4195:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4196:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28409); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__LabelAssignment_2"


    // $ANTLR start "rule__AttributeValueCondition__ConditionIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4205:1: rule__AttributeValueCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeValueCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4209:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4210:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4210:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4211:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18440); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__ConditionIDAssignment_1"


    // $ANTLR start "rule__AttributeValueCondition__AttributeAssignment_3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4220:1: rule__AttributeValueCondition__AttributeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeValueCondition__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4224:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4225:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4225:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4226:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4227:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4228:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__AttributeAssignment_3"


    // $ANTLR start "rule__AttributeValueCondition__ValueAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4239:1: rule__AttributeValueCondition__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttributeValueCondition__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4243:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4244:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4244:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4245:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58510); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__ValueAssignment_5"


    // $ANTLR start "rule__AttributeValueCondition__TypeAssignment_7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4254:1: rule__AttributeValueCondition__TypeAssignment_7 : ( ruleConditionType ) ;
    public final void rule__AttributeValueCondition__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4258:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4259:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4259:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4260:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78541);
            ruleConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__TypeAssignment_7"


    // $ANTLR start "rule__CompositeCondition__ConditionIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4269:1: rule__CompositeCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4273:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4274:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4274:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4275:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18572); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ConditionIDAssignment_1"


    // $ANTLR start "rule__CompositeCondition__ComposedConditionsAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4284:1: rule__CompositeCondition__ComposedConditionsAssignment_4 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4288:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4289:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4289:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4290:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48603);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ComposedConditionsAssignment_4"


    // $ANTLR start "rule__CompositeCondition__CompositionTypeAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4299:1: rule__CompositeCondition__CompositionTypeAssignment_5 : ( ruleCompositeConditionType ) ;
    public final void rule__CompositeCondition__CompositionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4303:1: ( ( ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4304:1: ( ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4304:1: ( ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4305:1: ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58634);
            ruleCompositeConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__CompositionTypeAssignment_5"


    // $ANTLR start "rule__CompositeCondition__ComposedConditionsAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4314:1: rule__CompositeCondition__ComposedConditionsAssignment_6 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4318:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4319:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4319:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4320:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68665);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ComposedConditionsAssignment_6"


    // $ANTLR start "rule__CompositeCondition__TypeAssignment_9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4329:1: rule__CompositeCondition__TypeAssignment_9 : ( ruleConditionType ) ;
    public final void rule__CompositeCondition__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4333:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4334:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4334:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4335:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98696);
            ruleConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__TypeAssignment_9"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormModel_in_entryRuleFormModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormModel74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormModel__FormsAssignment_in_ruleFormModel100 = new BitSet(new long[]{0x0000040000040002L});
        public static final BitSet FOLLOW_ruleForm_in_entryRuleForm128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForm135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__0_in_ruleForm161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageElement255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__0_in_rulePageElement281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipPageElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__0_in_ruleRelationshipPageElement341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributePageElement555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__0_in_ruleAttributePageElement581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextField615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0_in_ruleTextField641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextArea675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0_in_ruleTextArea701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_entryRuleSelectionField728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionField735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0_in_ruleSelectionField761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateSelectionField795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0_in_ruleDateSelectionField821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSelectionField855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0_in_ruleTimeSelectionField881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition908 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueCondition975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0_in_ruleAttributeValueCondition1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition1035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives_01173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives_01190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives_01222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives_01239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives_01271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives_01288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives_01305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives_01322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives_01339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives_11371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives_11388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__ConditionType__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ConditionType__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConditionType__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConditionType__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConditionType__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompositeConditionType__Alternatives1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CompositeConditionType__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01595 = new BitSet(new long[]{0x0000040000040000L});
        public static final BitSet FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11656 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Form__Group__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__21718 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Form__Group__3_in_rule__Form__Group__21721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__31778 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_rule__Form__Group__4_in_rule__Form__Group__31781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__41838 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_rule__Form__Group__5_in_rule__Form__Group__41841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group_4__0_in_rule__Form__Group__4__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51899 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Form__Group__5__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61961 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__EntityAssignment_6_in_rule__Form__Group__6__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72021 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Form__Group__7__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82083 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Form__Group__9_in_rule__Form__Group__82086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__PagesAssignment_8_in_rule__Form__Group__8__Impl2113 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Form__Group__9__Impl_in_rule__Form__Group__92144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Form__Group__9__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group_4__0__Impl_in_rule__Form__Group_4__02223 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Form__Group_4__1_in_rule__Form__Group_4__02226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Form__Group_4__0__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group_4__1__Impl_in_rule__Form__Group_4__12285 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Form__Group_4__2_in_rule__Form__Group_4__12288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__DescriptionAssignment_4_1_in_rule__Form__Group_4__1__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group_4__2__Impl_in_rule__Form__Group_4__22345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Form__Group_4__2__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02410 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Page__Group__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12472 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22532 = new BitSet(new long[]{0x0000000F68200000L});
        public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Page__Group__2__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32594 = new BitSet(new long[]{0x0000000F68200000L});
        public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42655 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Page__Group__4__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__ConditionAssignment_5_in_rule__Page__Group__5__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02787 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2874 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02909 = new BitSet(new long[]{0x0000000F68000000L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Page__Group_3_1__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__03032 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__13092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__03154 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__03157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__13214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__13217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RelationshipPageElement__Group__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Table__Group__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13401 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23461 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33521 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Table__Group__3__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43583 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53643 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Table__Group__5__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63705 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Table__Group__7__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03841 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3928 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03963 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Table__Group_6_1__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__14025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__04086 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__04089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Column__Group__0__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__14148 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__14151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__24208 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__24211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Column__Group__3__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04397 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__04400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__List__Group__0__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14459 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__14462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24519 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__24522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34579 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__4_in_rule__List__Group__34582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__List__Group__3__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04708 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04893 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextField__Group__0__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14955 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__25015 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__25018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__35075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__05141 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__05144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextField__Group_3__0__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__15203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TextArea__Group__0__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15326 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05449 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SelectionField__Group__0__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15511 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05634 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__DateSelectionField__Group__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15696 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05819 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TimeSelectionField__Group__0__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15881 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06004 = new BitSet(new long[]{0x0000022000000000L});
        public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Condition__Group__0__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__06127 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__06130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AttributeValueCondition__Group__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__16189 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__16192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__26249 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AttributeValueCondition__Group__2__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36311 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46371 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__AttributeValueCondition__Group__4__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56433 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66493 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__AttributeValueCondition__Group__6__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06628 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__CompositeCondition__Group__0__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16690 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26750 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__CompositeCondition__Group__2__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36812 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CompositeCondition__Group__3__Impl6843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46874 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56934 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66994 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__77054 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__77057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CompositeCondition__Group__7__Impl7085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__87116 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__87119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__CompositeCondition__Group__8__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__97178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment7263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Form__WelcomeFormAssignment_07299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_37369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Form__DescriptionAssignment_4_17400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_67435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Form__PagesAssignment_87470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_57594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_48025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_28064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_18099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_28130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_18161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_18192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_28223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_18254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_28285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_18316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_28347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_18378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98696 = new BitSet(new long[]{0x0000000000000002L});
    }


}