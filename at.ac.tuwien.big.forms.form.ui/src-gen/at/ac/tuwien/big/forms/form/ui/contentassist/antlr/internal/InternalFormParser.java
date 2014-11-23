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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Show'", "'Hide'", "'Disable'", "'Enable'", "'None'", "'or'", "'and'", "'form'", "'handles'", "'{'", "'}'", "'page'", "','", "'edits'", "'table'", "'column'", "'list'", "'text-field'", "'format'", "'text-area'", "'selection-field'", "'date-selection-field'", "'time-selection-field'", "'with'", "'attribute-condition'", "':'", "'=='", "'?'", "'composite-condition'", "'('", "')'", "'welcome'"
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

            if ( (LA2_0==25||LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28||(LA2_0>=30 && LA2_0<=33)) ) {
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

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
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
            case 28:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 33:
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

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:886:1: rule__Form__Group__4__Impl : ( 'handles' ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:890:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:891:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:891:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:892:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getHandlesKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Form__Group__4__Impl1869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getHandlesKeyword_4()); 
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:905:1: rule__Form__Group__5 : rule__Form__Group__5__Impl rule__Form__Group__6 ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:909:1: ( rule__Form__Group__5__Impl rule__Form__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:910:2: rule__Form__Group__5__Impl rule__Form__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51900);
            rule__Form__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51903);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:917:1: rule__Form__Group__5__Impl : ( ( rule__Form__EntityAssignment_5 ) ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:921:1: ( ( ( rule__Form__EntityAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:922:1: ( ( rule__Form__EntityAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:922:1: ( ( rule__Form__EntityAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:923:1: ( rule__Form__EntityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:924:1: ( rule__Form__EntityAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:924:2: rule__Form__EntityAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__EntityAssignment_5_in_rule__Form__Group__5__Impl1930);
            rule__Form__EntityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityAssignment_5()); 
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
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61960);
            rule__Form__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61963);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:946:1: rule__Form__Group__6__Impl : ( '{' ) ;
    public final void rule__Form__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:950:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:951:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:951:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:952:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Form__Group__6__Impl1991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_6()); 
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:965:1: rule__Form__Group__7 : rule__Form__Group__7__Impl rule__Form__Group__8 ;
    public final void rule__Form__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:969:1: ( rule__Form__Group__7__Impl rule__Form__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:970:2: rule__Form__Group__7__Impl rule__Form__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72022);
            rule__Form__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72025);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:977:1: rule__Form__Group__7__Impl : ( ( rule__Form__PagesAssignment_7 )* ) ;
    public final void rule__Form__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:981:1: ( ( ( rule__Form__PagesAssignment_7 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:982:1: ( ( rule__Form__PagesAssignment_7 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:982:1: ( ( rule__Form__PagesAssignment_7 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:983:1: ( rule__Form__PagesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:984:1: ( rule__Form__PagesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:984:2: rule__Form__PagesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Form__PagesAssignment_7_in_rule__Form__Group__7__Impl2052);
            	    rule__Form__PagesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesAssignment_7()); 
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:994:1: rule__Form__Group__8 : rule__Form__Group__8__Impl ;
    public final void rule__Form__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:998:1: ( rule__Form__Group__8__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:999:2: rule__Form__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82083);
            rule__Form__Group__8__Impl();

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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1005:1: rule__Form__Group__8__Impl : ( '}' ) ;
    public final void rule__Form__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1009:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1010:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1010:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1011:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Form__Group__8__Impl2111); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_8()); 
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


    // $ANTLR start "rule__Page__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1042:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1046:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1047:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02160);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02163);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1054:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1058:1: ( ( 'page' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1059:1: ( 'page' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1059:1: ( 'page' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1060:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Page__Group__0__Impl2191); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1073:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1077:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1078:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12222);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12225);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1085:1: rule__Page__Group__1__Impl : ( ( rule__Page__TitleAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1089:1: ( ( ( rule__Page__TitleAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1090:1: ( ( rule__Page__TitleAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1090:1: ( ( rule__Page__TitleAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1091:1: ( rule__Page__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1092:1: ( rule__Page__TitleAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1092:2: rule__Page__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2252);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1102:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1106:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1107:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22282);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22285);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1114:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1118:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1119:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1119:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1120:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Page__Group__2__Impl2313); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1133:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1137:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1138:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32344);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32347);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1145:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1149:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1150:1: ( ( rule__Page__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1150:1: ( ( rule__Page__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1151:1: ( rule__Page__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1152:1: ( rule__Page__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25||(LA10_0>=27 && LA10_0<=28)||(LA10_0>=30 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1152:2: rule__Page__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2374);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1162:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1166:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1167:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42405);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42408);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1174:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1178:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1179:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1179:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1180:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Page__Group__4__Impl2436); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1193:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1197:1: ( rule__Page__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1198:2: rule__Page__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52467);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1204:1: rule__Page__Group__5__Impl : ( ( rule__Page__ConditionAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1208:1: ( ( ( rule__Page__ConditionAssignment_5 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1209:1: ( ( rule__Page__ConditionAssignment_5 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1209:1: ( ( rule__Page__ConditionAssignment_5 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1210:1: ( rule__Page__ConditionAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1211:1: ( rule__Page__ConditionAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1211:2: rule__Page__ConditionAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__ConditionAssignment_5_in_rule__Page__Group__5__Impl2494);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1233:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1237:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1238:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02537);
            rule__Page__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02540);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1245:1: rule__Page__Group_3__0__Impl : ( ( rule__Page__PageElementsAssignment_3_0 ) ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1249:1: ( ( ( rule__Page__PageElementsAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1250:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1250:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1251:1: ( rule__Page__PageElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1252:1: ( rule__Page__PageElementsAssignment_3_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1252:2: rule__Page__PageElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2567);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1262:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1266:1: ( rule__Page__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1267:2: rule__Page__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12597);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1273:1: rule__Page__Group_3__1__Impl : ( ( rule__Page__Group_3_1__0 )* ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1277:1: ( ( ( rule__Page__Group_3_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1278:1: ( ( rule__Page__Group_3_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1278:1: ( ( rule__Page__Group_3_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1279:1: ( rule__Page__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1280:1: ( rule__Page__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1280:2: rule__Page__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2624);
            	    rule__Page__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1294:1: rule__Page__Group_3_1__0 : rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 ;
    public final void rule__Page__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1298:1: ( rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1299:2: rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02659);
            rule__Page__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02662);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1306:1: rule__Page__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1310:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1311:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1311:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1312:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Page__Group_3_1__0__Impl2690); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1325:1: rule__Page__Group_3_1__1 : rule__Page__Group_3_1__1__Impl ;
    public final void rule__Page__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1329:1: ( rule__Page__Group_3_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1330:2: rule__Page__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12721);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1336:1: rule__Page__Group_3_1__1__Impl : ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) ;
    public final void rule__Page__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1340:1: ( ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1341:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1341:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1342:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1343:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1343:2: rule__Page__PageElementsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2748);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1357:1: rule__PageElement__Group__0 : rule__PageElement__Group__0__Impl rule__PageElement__Group__1 ;
    public final void rule__PageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1361:1: ( rule__PageElement__Group__0__Impl rule__PageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1362:2: rule__PageElement__Group__0__Impl rule__PageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__02782);
            rule__PageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__02785);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1369:1: rule__PageElement__Group__0__Impl : ( ( rule__PageElement__Alternatives_0 ) ) ;
    public final void rule__PageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1373:1: ( ( ( rule__PageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1374:1: ( ( rule__PageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1374:1: ( ( rule__PageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1375:1: ( rule__PageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1376:1: ( rule__PageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1376:2: rule__PageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl2812);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1386:1: rule__PageElement__Group__1 : rule__PageElement__Group__1__Impl ;
    public final void rule__PageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1390:1: ( rule__PageElement__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1391:2: rule__PageElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__12842);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1397:1: rule__PageElement__Group__1__Impl : ( ( rule__PageElement__ConditionAssignment_1 )? ) ;
    public final void rule__PageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1401:1: ( ( ( rule__PageElement__ConditionAssignment_1 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1402:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1402:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1403:1: ( rule__PageElement__ConditionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1404:1: ( rule__PageElement__ConditionAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1404:2: rule__PageElement__ConditionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl2869);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1418:1: rule__RelationshipPageElement__Group__0 : rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 ;
    public final void rule__RelationshipPageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1422:1: ( rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1423:2: rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__02904);
            rule__RelationshipPageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__02907);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1430:1: rule__RelationshipPageElement__Group__0__Impl : ( ( rule__RelationshipPageElement__Alternatives_0 ) ) ;
    public final void rule__RelationshipPageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1434:1: ( ( ( rule__RelationshipPageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1435:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1435:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1436:1: ( rule__RelationshipPageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1437:1: ( rule__RelationshipPageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1437:2: rule__RelationshipPageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl2934);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1447:1: rule__RelationshipPageElement__Group__1 : rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 ;
    public final void rule__RelationshipPageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1451:1: ( rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1452:2: rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__12964);
            rule__RelationshipPageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__12967);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1459:1: rule__RelationshipPageElement__Group__1__Impl : ( 'edits' ) ;
    public final void rule__RelationshipPageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1463:1: ( ( 'edits' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1464:1: ( 'edits' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1464:1: ( 'edits' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1465:1: 'edits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RelationshipPageElement__Group__1__Impl2995); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1478:1: rule__RelationshipPageElement__Group__2 : rule__RelationshipPageElement__Group__2__Impl ;
    public final void rule__RelationshipPageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1482:1: ( rule__RelationshipPageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1483:2: rule__RelationshipPageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23026);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1489:1: rule__RelationshipPageElement__Group__2__Impl : ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) ;
    public final void rule__RelationshipPageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1493:1: ( ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1494:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1494:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1495:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1496:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1496:2: rule__RelationshipPageElement__EditingFormAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3053);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1512:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1516:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1517:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03089);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03092);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1524:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1528:1: ( ( 'table' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1529:1: ( 'table' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1529:1: ( 'table' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1530:1: 'table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Table__Group__0__Impl3120); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1543:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1547:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1548:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13151);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13154);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1555:1: rule__Table__Group__1__Impl : ( ( rule__Table__ElementIDAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1559:1: ( ( ( rule__Table__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1560:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1560:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1561:1: ( rule__Table__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1562:1: ( rule__Table__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1562:2: rule__Table__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3181);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1572:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1576:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1577:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23211);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23214);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1584:1: rule__Table__Group__2__Impl : ( ( rule__Table__LabelAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1588:1: ( ( ( rule__Table__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1589:1: ( ( rule__Table__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1589:1: ( ( rule__Table__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1590:1: ( rule__Table__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:1: ( rule__Table__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:2: rule__Table__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3241);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1601:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1605:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1606:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33271);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33274);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1613:1: rule__Table__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1617:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1618:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1618:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1619:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Table__Group__3__Impl3302); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1632:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1636:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1637:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43333);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43336);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1644:1: rule__Table__Group__4__Impl : ( ( rule__Table__RelationshipAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1648:1: ( ( ( rule__Table__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1649:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1649:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1650:1: ( rule__Table__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1651:1: ( rule__Table__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1651:2: rule__Table__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3363);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1661:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1665:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1666:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53393);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53396);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1673:1: rule__Table__Group__5__Impl : ( '{' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1677:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1678:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1678:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1679:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Table__Group__5__Impl3424); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1692:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1696:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1697:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63455);
            rule__Table__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63458);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1704:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1708:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1709:1: ( ( rule__Table__Group_6__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1709:1: ( ( rule__Table__Group_6__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1710:1: ( rule__Table__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1711:1: ( rule__Table__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1711:2: rule__Table__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3485);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1721:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1725:1: ( rule__Table__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1726:2: rule__Table__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73516);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1732:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1736:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1737:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1737:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1738:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Table__Group__7__Impl3544); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1767:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1771:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1772:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03591);
            rule__Table__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03594);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1779:1: rule__Table__Group_6__0__Impl : ( ( rule__Table__ColumnsAssignment_6_0 ) ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1783:1: ( ( ( rule__Table__ColumnsAssignment_6_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1784:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1784:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1785:1: ( rule__Table__ColumnsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1786:1: ( rule__Table__ColumnsAssignment_6_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1786:2: rule__Table__ColumnsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3621);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1796:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1800:1: ( rule__Table__Group_6__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1801:2: rule__Table__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13651);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1807:1: rule__Table__Group_6__1__Impl : ( ( rule__Table__Group_6_1__0 )* ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1811:1: ( ( ( rule__Table__Group_6_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1812:1: ( ( rule__Table__Group_6_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1812:1: ( ( rule__Table__Group_6_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1813:1: ( rule__Table__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1814:1: ( rule__Table__Group_6_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1814:2: rule__Table__Group_6_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3678);
            	    rule__Table__Group_6_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1828:1: rule__Table__Group_6_1__0 : rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 ;
    public final void rule__Table__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1832:1: ( rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1833:2: rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03713);
            rule__Table__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03716);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1840:1: rule__Table__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1844:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1845:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1845:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1846:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Table__Group_6_1__0__Impl3744); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1859:1: rule__Table__Group_6_1__1 : rule__Table__Group_6_1__1__Impl ;
    public final void rule__Table__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1863:1: ( rule__Table__Group_6_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1864:2: rule__Table__Group_6_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__13775);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1870:1: rule__Table__Group_6_1__1__Impl : ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) ;
    public final void rule__Table__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1874:1: ( ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1875:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1875:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1876:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1877:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1877:2: rule__Table__ColumnsAssignment_6_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl3802);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1891:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1895:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1896:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03836);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03839);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1903:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1907:1: ( ( 'column' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1908:1: ( 'column' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1908:1: ( 'column' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1909:1: 'column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Column__Group__0__Impl3867); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1922:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1926:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1927:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13898);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13901);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1934:1: rule__Column__Group__1__Impl : ( ( rule__Column__ElementIDAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1938:1: ( ( ( rule__Column__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1939:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1939:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1940:1: ( rule__Column__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:1: ( rule__Column__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:2: rule__Column__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl3928);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1951:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1955:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1956:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23958);
            rule__Column__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23961);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1963:1: rule__Column__Group__2__Impl : ( ( rule__Column__LabelAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1967:1: ( ( ( rule__Column__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1968:1: ( ( rule__Column__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1968:1: ( ( rule__Column__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1969:1: ( rule__Column__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1970:1: ( rule__Column__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1970:2: rule__Column__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl3988);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1980:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1984:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1985:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34018);
            rule__Column__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34021);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1992:1: rule__Column__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1996:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1997:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1997:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1998:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Column__Group__3__Impl4049); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2011:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2015:1: ( rule__Column__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2016:2: rule__Column__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44080);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2022:1: rule__Column__Group__4__Impl : ( ( rule__Column__AttributeAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2026:1: ( ( ( rule__Column__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2027:1: ( ( rule__Column__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2027:1: ( ( rule__Column__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2028:1: ( rule__Column__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2029:1: ( rule__Column__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2029:2: rule__Column__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4107);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2049:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2053:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2054:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04147);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1_in_rule__List__Group__04150);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2061:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2065:1: ( ( 'list' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2066:1: ( 'list' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2066:1: ( 'list' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2067:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__List__Group__0__Impl4178); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2080:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2084:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2085:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14209);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2_in_rule__List__Group__14212);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2092:1: rule__List__Group__1__Impl : ( ( rule__List__ElementIDAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2096:1: ( ( ( rule__List__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2097:1: ( ( rule__List__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2097:1: ( ( rule__List__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2098:1: ( rule__List__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2099:1: ( rule__List__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2099:2: rule__List__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4239);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2109:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2113:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2114:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24269);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3_in_rule__List__Group__24272);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2121:1: rule__List__Group__2__Impl : ( ( rule__List__LabelAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2125:1: ( ( ( rule__List__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2126:1: ( ( rule__List__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2126:1: ( ( rule__List__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2127:1: ( rule__List__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2128:1: ( rule__List__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2128:2: rule__List__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4299);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2138:1: rule__List__Group__3 : rule__List__Group__3__Impl rule__List__Group__4 ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2142:1: ( rule__List__Group__3__Impl rule__List__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2143:2: rule__List__Group__3__Impl rule__List__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34329);
            rule__List__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4_in_rule__List__Group__34332);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2150:1: rule__List__Group__3__Impl : ( 'handles' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2154:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2155:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2155:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2156:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__List__Group__3__Impl4360); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2169:1: rule__List__Group__4 : rule__List__Group__4__Impl ;
    public final void rule__List__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2173:1: ( rule__List__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2174:2: rule__List__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44391);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2180:1: rule__List__Group__4__Impl : ( ( rule__List__RelationshipAssignment_4 ) ) ;
    public final void rule__List__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2184:1: ( ( ( rule__List__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2185:1: ( ( rule__List__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2185:1: ( ( rule__List__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2186:1: ( rule__List__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2187:1: ( rule__List__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2187:2: rule__List__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4418);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2207:1: rule__AttributePageElement__Group__0 : rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 ;
    public final void rule__AttributePageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2211:1: ( rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2212:2: rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04458);
            rule__AttributePageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04461);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2219:1: rule__AttributePageElement__Group__0__Impl : ( ( rule__AttributePageElement__Alternatives_0 ) ) ;
    public final void rule__AttributePageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2223:1: ( ( ( rule__AttributePageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2225:1: ( rule__AttributePageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:1: ( rule__AttributePageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:2: rule__AttributePageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4488);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2236:1: rule__AttributePageElement__Group__1 : rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 ;
    public final void rule__AttributePageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2240:1: ( rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2241:2: rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14518);
            rule__AttributePageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14521);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2248:1: rule__AttributePageElement__Group__1__Impl : ( 'handles' ) ;
    public final void rule__AttributePageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2252:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2254:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4549); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2267:1: rule__AttributePageElement__Group__2 : rule__AttributePageElement__Group__2__Impl ;
    public final void rule__AttributePageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2271:1: ( rule__AttributePageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2272:2: rule__AttributePageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24580);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2278:1: rule__AttributePageElement__Group__2__Impl : ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) ;
    public final void rule__AttributePageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2282:1: ( ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2283:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2283:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2284:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2285:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2285:2: rule__AttributePageElement__AttributeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4607);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2301:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2305:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2306:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04643);
            rule__TextField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04646);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2313:1: rule__TextField__Group__0__Impl : ( 'text-field' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2317:1: ( ( 'text-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2318:1: ( 'text-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2318:1: ( 'text-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2319:1: 'text-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__TextField__Group__0__Impl4674); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2332:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2336:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2337:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14705);
            rule__TextField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14708);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2344:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__ElementIDAssignment_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2348:1: ( ( ( rule__TextField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2349:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2349:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2350:1: ( rule__TextField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2351:1: ( rule__TextField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2351:2: rule__TextField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4735);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2361:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2365:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2366:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__24765);
            rule__TextField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__24768);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2373:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__LabelAssignment_2 ) ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2377:1: ( ( ( rule__TextField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2378:1: ( ( rule__TextField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2378:1: ( ( rule__TextField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2379:1: ( rule__TextField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2380:1: ( rule__TextField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2380:2: rule__TextField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl4795);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2390:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2394:1: ( rule__TextField__Group__3__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2395:2: rule__TextField__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__34825);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2401:1: rule__TextField__Group__3__Impl : ( ( rule__TextField__Group_3__0 )? ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2405:1: ( ( ( rule__TextField__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2406:1: ( ( rule__TextField__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2406:1: ( ( rule__TextField__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2407:1: ( rule__TextField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2408:1: ( rule__TextField__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2408:2: rule__TextField__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl4852);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2426:1: rule__TextField__Group_3__0 : rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 ;
    public final void rule__TextField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2430:1: ( rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2431:2: rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__04891);
            rule__TextField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__04894);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2438:1: rule__TextField__Group_3__0__Impl : ( 'format' ) ;
    public final void rule__TextField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2442:1: ( ( 'format' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2443:1: ( 'format' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2443:1: ( 'format' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2444:1: 'format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TextField__Group_3__0__Impl4922); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2457:1: rule__TextField__Group_3__1 : rule__TextField__Group_3__1__Impl ;
    public final void rule__TextField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2461:1: ( rule__TextField__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2462:2: rule__TextField__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__14953);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2468:1: rule__TextField__Group_3__1__Impl : ( ( rule__TextField__FormatAssignment_3_1 ) ) ;
    public final void rule__TextField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2472:1: ( ( ( rule__TextField__FormatAssignment_3_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2473:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2473:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2474:1: ( rule__TextField__FormatAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2475:1: ( rule__TextField__FormatAssignment_3_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2475:2: rule__TextField__FormatAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl4980);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2489:1: rule__TextArea__Group__0 : rule__TextArea__Group__0__Impl rule__TextArea__Group__1 ;
    public final void rule__TextArea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2493:1: ( rule__TextArea__Group__0__Impl rule__TextArea__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2494:2: rule__TextArea__Group__0__Impl rule__TextArea__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05014);
            rule__TextArea__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05017);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2501:1: rule__TextArea__Group__0__Impl : ( 'text-area' ) ;
    public final void rule__TextArea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2505:1: ( ( 'text-area' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2506:1: ( 'text-area' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2506:1: ( 'text-area' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2507:1: 'text-area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextArea__Group__0__Impl5045); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2520:1: rule__TextArea__Group__1 : rule__TextArea__Group__1__Impl rule__TextArea__Group__2 ;
    public final void rule__TextArea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2524:1: ( rule__TextArea__Group__1__Impl rule__TextArea__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2525:2: rule__TextArea__Group__1__Impl rule__TextArea__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15076);
            rule__TextArea__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15079);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2532:1: rule__TextArea__Group__1__Impl : ( ( rule__TextArea__ElementIDAssignment_1 ) ) ;
    public final void rule__TextArea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2536:1: ( ( ( rule__TextArea__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2537:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2537:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2538:1: ( rule__TextArea__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2539:1: ( rule__TextArea__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2539:2: rule__TextArea__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5106);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2549:1: rule__TextArea__Group__2 : rule__TextArea__Group__2__Impl ;
    public final void rule__TextArea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2553:1: ( rule__TextArea__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2554:2: rule__TextArea__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25136);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2560:1: rule__TextArea__Group__2__Impl : ( ( rule__TextArea__LabelAssignment_2 ) ) ;
    public final void rule__TextArea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2564:1: ( ( ( rule__TextArea__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2565:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2565:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2566:1: ( rule__TextArea__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2567:1: ( rule__TextArea__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2567:2: rule__TextArea__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5163);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2583:1: rule__SelectionField__Group__0 : rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 ;
    public final void rule__SelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2587:1: ( rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2588:2: rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05199);
            rule__SelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05202);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2595:1: rule__SelectionField__Group__0__Impl : ( 'selection-field' ) ;
    public final void rule__SelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2599:1: ( ( 'selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2600:1: ( 'selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2600:1: ( 'selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2601:1: 'selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SelectionField__Group__0__Impl5230); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2614:1: rule__SelectionField__Group__1 : rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 ;
    public final void rule__SelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2618:1: ( rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2619:2: rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15261);
            rule__SelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15264);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2626:1: rule__SelectionField__Group__1__Impl : ( ( rule__SelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__SelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2630:1: ( ( ( rule__SelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2631:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2631:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2632:1: ( rule__SelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2633:1: ( rule__SelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2633:2: rule__SelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5291);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2643:1: rule__SelectionField__Group__2 : rule__SelectionField__Group__2__Impl ;
    public final void rule__SelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2647:1: ( rule__SelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2648:2: rule__SelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25321);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2654:1: rule__SelectionField__Group__2__Impl : ( ( rule__SelectionField__LabelAssignment_2 ) ) ;
    public final void rule__SelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2658:1: ( ( ( rule__SelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2659:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2659:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2660:1: ( rule__SelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2661:1: ( rule__SelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2661:2: rule__SelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5348);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2677:1: rule__DateSelectionField__Group__0 : rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 ;
    public final void rule__DateSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2681:1: ( rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2682:2: rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05384);
            rule__DateSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05387);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2689:1: rule__DateSelectionField__Group__0__Impl : ( 'date-selection-field' ) ;
    public final void rule__DateSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2693:1: ( ( 'date-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2694:1: ( 'date-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2694:1: ( 'date-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2695:1: 'date-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DateSelectionField__Group__0__Impl5415); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2708:1: rule__DateSelectionField__Group__1 : rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 ;
    public final void rule__DateSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2712:1: ( rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2713:2: rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15446);
            rule__DateSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15449);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2720:1: rule__DateSelectionField__Group__1__Impl : ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__DateSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2724:1: ( ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2725:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2725:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2726:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:2: rule__DateSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5476);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2737:1: rule__DateSelectionField__Group__2 : rule__DateSelectionField__Group__2__Impl ;
    public final void rule__DateSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2741:1: ( rule__DateSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2742:2: rule__DateSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25506);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2748:1: rule__DateSelectionField__Group__2__Impl : ( ( rule__DateSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__DateSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2752:1: ( ( ( rule__DateSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2753:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2753:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2754:1: ( rule__DateSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2755:1: ( rule__DateSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2755:2: rule__DateSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5533);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2771:1: rule__TimeSelectionField__Group__0 : rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 ;
    public final void rule__TimeSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2775:1: ( rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2776:2: rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05569);
            rule__TimeSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05572);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2783:1: rule__TimeSelectionField__Group__0__Impl : ( 'time-selection-field' ) ;
    public final void rule__TimeSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2787:1: ( ( 'time-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2788:1: ( 'time-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2788:1: ( 'time-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2789:1: 'time-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TimeSelectionField__Group__0__Impl5600); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2802:1: rule__TimeSelectionField__Group__1 : rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 ;
    public final void rule__TimeSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2806:1: ( rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2807:2: rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15631);
            rule__TimeSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15634);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2814:1: rule__TimeSelectionField__Group__1__Impl : ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__TimeSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2818:1: ( ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2819:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2819:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2820:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2821:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2821:2: rule__TimeSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5661);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2831:1: rule__TimeSelectionField__Group__2 : rule__TimeSelectionField__Group__2__Impl ;
    public final void rule__TimeSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2835:1: ( rule__TimeSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2836:2: rule__TimeSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25691);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2842:1: rule__TimeSelectionField__Group__2__Impl : ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__TimeSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2846:1: ( ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2847:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2847:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2848:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2849:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2849:2: rule__TimeSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5718);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2865:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2869:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2870:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05754);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05757);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2877:1: rule__Condition__Group__0__Impl : ( 'with' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2881:1: ( ( 'with' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2882:1: ( 'with' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2882:1: ( 'with' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2883:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getWithKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Condition__Group__0__Impl5785); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2896:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2900:1: ( rule__Condition__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2901:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15816);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2907:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2911:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2912:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2912:1: ( ( rule__Condition__Alternatives_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2913:1: ( rule__Condition__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2914:1: ( rule__Condition__Alternatives_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2914:2: rule__Condition__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5843);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2928:1: rule__AttributeValueCondition__Group__0 : rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 ;
    public final void rule__AttributeValueCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2932:1: ( rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2933:2: rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__05877);
            rule__AttributeValueCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__05880);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2940:1: rule__AttributeValueCondition__Group__0__Impl : ( 'attribute-condition' ) ;
    public final void rule__AttributeValueCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2944:1: ( ( 'attribute-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2945:1: ( 'attribute-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2945:1: ( 'attribute-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2946:1: 'attribute-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AttributeValueCondition__Group__0__Impl5908); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2959:1: rule__AttributeValueCondition__Group__1 : rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 ;
    public final void rule__AttributeValueCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2963:1: ( rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2964:2: rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__15939);
            rule__AttributeValueCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__15942);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2971:1: rule__AttributeValueCondition__Group__1__Impl : ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__AttributeValueCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2975:1: ( ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2976:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2976:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2977:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2978:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2978:2: rule__AttributeValueCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl5969);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2988:1: rule__AttributeValueCondition__Group__2 : rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 ;
    public final void rule__AttributeValueCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2992:1: ( rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2993:2: rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__25999);
            rule__AttributeValueCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26002);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3000:1: rule__AttributeValueCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeValueCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3004:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3005:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3005:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3006:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AttributeValueCondition__Group__2__Impl6030); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3019:1: rule__AttributeValueCondition__Group__3 : rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 ;
    public final void rule__AttributeValueCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3023:1: ( rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3024:2: rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36061);
            rule__AttributeValueCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36064);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3031:1: rule__AttributeValueCondition__Group__3__Impl : ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) ;
    public final void rule__AttributeValueCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3035:1: ( ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3036:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3036:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3037:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3038:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3038:2: rule__AttributeValueCondition__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6091);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3048:1: rule__AttributeValueCondition__Group__4 : rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 ;
    public final void rule__AttributeValueCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3052:1: ( rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3053:2: rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46121);
            rule__AttributeValueCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46124);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3060:1: rule__AttributeValueCondition__Group__4__Impl : ( '==' ) ;
    public final void rule__AttributeValueCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3064:1: ( ( '==' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3065:1: ( '==' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3065:1: ( '==' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3066:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AttributeValueCondition__Group__4__Impl6152); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3079:1: rule__AttributeValueCondition__Group__5 : rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 ;
    public final void rule__AttributeValueCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3083:1: ( rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3084:2: rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56183);
            rule__AttributeValueCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56186);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3091:1: rule__AttributeValueCondition__Group__5__Impl : ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) ;
    public final void rule__AttributeValueCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3095:1: ( ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3096:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3096:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3097:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3098:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3098:2: rule__AttributeValueCondition__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6213);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3108:1: rule__AttributeValueCondition__Group__6 : rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 ;
    public final void rule__AttributeValueCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3112:1: ( rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3113:2: rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66243);
            rule__AttributeValueCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66246);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3120:1: rule__AttributeValueCondition__Group__6__Impl : ( '?' ) ;
    public final void rule__AttributeValueCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3124:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3125:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3125:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3126:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AttributeValueCondition__Group__6__Impl6274); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3139:1: rule__AttributeValueCondition__Group__7 : rule__AttributeValueCondition__Group__7__Impl ;
    public final void rule__AttributeValueCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3143:1: ( rule__AttributeValueCondition__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3144:2: rule__AttributeValueCondition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76305);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3150:1: rule__AttributeValueCondition__Group__7__Impl : ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) ;
    public final void rule__AttributeValueCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3154:1: ( ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3155:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3155:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3156:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3157:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3157:2: rule__AttributeValueCondition__TypeAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6332);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3183:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3187:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3188:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06378);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06381);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3195:1: rule__CompositeCondition__Group__0__Impl : ( 'composite-condition' ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3199:1: ( ( 'composite-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3200:1: ( 'composite-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3200:1: ( 'composite-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3201:1: 'composite-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__CompositeCondition__Group__0__Impl6409); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3214:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3218:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3219:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16440);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16443);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3226:1: rule__CompositeCondition__Group__1__Impl : ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3230:1: ( ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3231:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3231:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3232:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3233:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3233:2: rule__CompositeCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6470);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3243:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3247:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3248:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26500);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26503);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3255:1: rule__CompositeCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3259:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3260:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3260:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3261:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__CompositeCondition__Group__2__Impl6531); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3274:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3278:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3279:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36562);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36565);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3286:1: rule__CompositeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3290:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3291:1: ( '(' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3291:1: ( '(' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3292:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__CompositeCondition__Group__3__Impl6593); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3305:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3309:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3310:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46624);
            rule__CompositeCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46627);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3317:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3321:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3322:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3322:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3323:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3324:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3324:2: rule__CompositeCondition__ComposedConditionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl6654);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3334:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3338:1: ( rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3339:2: rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56684);
            rule__CompositeCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56687);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3346:1: rule__CompositeCondition__Group__5__Impl : ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3350:1: ( ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3351:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3351:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3352:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3353:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3353:2: rule__CompositeCondition__CompositionTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl6714);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3363:1: rule__CompositeCondition__Group__6 : rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 ;
    public final void rule__CompositeCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3367:1: ( rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3368:2: rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66744);
            rule__CompositeCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66747);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3375:1: rule__CompositeCondition__Group__6__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) ;
    public final void rule__CompositeCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3379:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3380:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3380:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3381:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3382:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3382:2: rule__CompositeCondition__ComposedConditionsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl6774);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3392:1: rule__CompositeCondition__Group__7 : rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 ;
    public final void rule__CompositeCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3396:1: ( rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3397:2: rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__76804);
            rule__CompositeCondition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__76807);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3404:1: rule__CompositeCondition__Group__7__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3408:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3409:1: ( ')' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3409:1: ( ')' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3410:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__CompositeCondition__Group__7__Impl6835); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3423:1: rule__CompositeCondition__Group__8 : rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 ;
    public final void rule__CompositeCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3427:1: ( rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3428:2: rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__86866);
            rule__CompositeCondition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__86869);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3435:1: rule__CompositeCondition__Group__8__Impl : ( '?' ) ;
    public final void rule__CompositeCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3439:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3440:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3440:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3441:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__CompositeCondition__Group__8__Impl6897); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3454:1: rule__CompositeCondition__Group__9 : rule__CompositeCondition__Group__9__Impl ;
    public final void rule__CompositeCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3458:1: ( rule__CompositeCondition__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3459:2: rule__CompositeCondition__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__96928);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3465:1: rule__CompositeCondition__Group__9__Impl : ( ( rule__CompositeCondition__TypeAssignment_9 ) ) ;
    public final void rule__CompositeCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3469:1: ( ( ( rule__CompositeCondition__TypeAssignment_9 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3470:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3470:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3471:1: ( rule__CompositeCondition__TypeAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3472:1: ( rule__CompositeCondition__TypeAssignment_9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3472:2: rule__CompositeCondition__TypeAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl6955);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3506:1: rule__FormModel__FormsAssignment : ( ruleForm ) ;
    public final void rule__FormModel__FormsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3510:1: ( ( ruleForm ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3511:1: ( ruleForm )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3511:1: ( ruleForm )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3512:1: ruleForm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment7013);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3521:1: rule__Form__WelcomeFormAssignment_0 : ( ( 'welcome' ) ) ;
    public final void rule__Form__WelcomeFormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3525:1: ( ( ( 'welcome' ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3526:1: ( ( 'welcome' ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3526:1: ( ( 'welcome' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3527:1: ( 'welcome' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3528:1: ( 'welcome' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3529:1: 'welcome'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Form__WelcomeFormAssignment_07049); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3544:1: rule__Form__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3548:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3549:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3549:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3550:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27088); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3559:1: rule__Form__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Form__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3563:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3564:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3564:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3565:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_37119); if (state.failed) return ;
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


    // $ANTLR start "rule__Form__EntityAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3574:1: rule__Form__EntityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Form__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3578:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3579:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3579:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3580:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityCrossReference_5_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3581:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_57154); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityCrossReference_5_0()); 
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
    // $ANTLR end "rule__Form__EntityAssignment_5"


    // $ANTLR start "rule__Form__PagesAssignment_7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3593:1: rule__Form__PagesAssignment_7 : ( rulePage ) ;
    public final void rule__Form__PagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3597:1: ( ( rulePage ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3598:1: ( rulePage )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3598:1: ( rulePage )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3599:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesPageParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Form__PagesAssignment_77189);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesPageParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Form__PagesAssignment_7"


    // $ANTLR start "rule__Page__TitleAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3608:1: rule__Page__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3612:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3613:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3613:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3614:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17220); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3623:1: rule__Page__PageElementsAssignment_3_0 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3627:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3628:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3628:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3629:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07251);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3638:1: rule__Page__PageElementsAssignment_3_1_1 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3642:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3643:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3643:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3644:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17282);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3653:1: rule__Page__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Page__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3657:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3658:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3658:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3659:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_57313);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3668:1: rule__PageElement__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__PageElement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3672:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3673:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3673:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3674:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17344);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3683:1: rule__RelationshipPageElement__EditingFormAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationshipPageElement__EditingFormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3687:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3688:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3688:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3689:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3690:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3691:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27379); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3702:1: rule__Table__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3706:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3708:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17414); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3717:1: rule__Table__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Table__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3721:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3722:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3722:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3723:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27445); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3732:1: rule__Table__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Table__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3736:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3737:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3737:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3738:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3739:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3740:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47480); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3751:1: rule__Table__ColumnsAssignment_6_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3755:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3756:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3756:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3757:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07515);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3766:1: rule__Table__ColumnsAssignment_6_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3770:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3771:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3771:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3772:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17546);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3781:1: rule__Column__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3785:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3786:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3786:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3787:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17577); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3796:1: rule__Column__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Column__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3800:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3801:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3801:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3802:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27608); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3811:1: rule__Column__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Column__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3815:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3816:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3816:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3817:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3818:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47643); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3830:1: rule__List__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3834:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3835:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3835:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3836:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17678); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3845:1: rule__List__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__List__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3849:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3850:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3850:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3851:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27709); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3860:1: rule__List__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__List__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3864:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3865:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3865:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3866:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3867:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3868:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_47744); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3879:1: rule__AttributePageElement__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePageElement__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3883:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3884:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3884:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3885:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3886:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3887:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_27783); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3898:1: rule__TextField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3902:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3903:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3903:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3904:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_17818); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3913:1: rule__TextField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3917:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3918:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3918:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3919:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_27849); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3928:1: rule__TextField__FormatAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TextField__FormatAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3932:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3933:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3933:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3934:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_17880); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3943:1: rule__TextArea__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextArea__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3947:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3948:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3948:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3949:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_17911); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3958:1: rule__TextArea__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextArea__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3962:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3963:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3963:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3964:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_27942); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3973:1: rule__SelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3977:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3978:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3978:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3979:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_17973); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3988:1: rule__SelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3992:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3994:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_28004); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4003:1: rule__DateSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__DateSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4007:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4009:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_18035); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4018:1: rule__DateSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DateSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4022:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4023:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4023:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4024:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_28066); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4033:1: rule__TimeSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TimeSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4037:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4038:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4038:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4039:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_18097); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4048:1: rule__TimeSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TimeSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4052:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4053:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4053:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4054:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28128); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4063:1: rule__AttributeValueCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeValueCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4067:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4068:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4068:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4069:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18159); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4078:1: rule__AttributeValueCondition__AttributeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeValueCondition__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4082:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4083:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4083:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4084:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4085:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4086:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38194); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4097:1: rule__AttributeValueCondition__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttributeValueCondition__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4101:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4102:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4102:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4103:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58229); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4112:1: rule__AttributeValueCondition__TypeAssignment_7 : ( ruleConditionType ) ;
    public final void rule__AttributeValueCondition__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4116:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4117:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4117:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4118:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78260);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4127:1: rule__CompositeCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4131:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4132:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4132:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4133:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18291); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4142:1: rule__CompositeCondition__ComposedConditionsAssignment_4 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4146:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4147:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4147:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4148:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48322);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4157:1: rule__CompositeCondition__CompositionTypeAssignment_5 : ( ruleCompositeConditionType ) ;
    public final void rule__CompositeCondition__CompositionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4161:1: ( ( ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4162:1: ( ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4162:1: ( ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4163:1: ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58353);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4172:1: rule__CompositeCondition__ComposedConditionsAssignment_6 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4176:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4177:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4177:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4178:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68384);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4187:1: rule__CompositeCondition__TypeAssignment_9 : ( ruleConditionType ) ;
    public final void rule__CompositeCondition__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4191:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4192:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4192:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4193:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98415);
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
        public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__31778 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Form__Group__4_in_rule__Form__Group__31781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__41838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Form__Group__5_in_rule__Form__Group__41841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Form__Group__4__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51900 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__EntityAssignment_5_in_rule__Form__Group__5__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61960 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Form__Group__6__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72022 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__PagesAssignment_7_in_rule__Form__Group__7__Impl2052 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Form__Group__8__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02160 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Page__Group__0__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12222 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22282 = new BitSet(new long[]{0x00000003DA200000L});
        public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Page__Group__2__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32344 = new BitSet(new long[]{0x00000003DA200000L});
        public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42405 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Page__Group__4__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__ConditionAssignment_5_in_rule__Page__Group__5__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02537 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2624 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02659 = new BitSet(new long[]{0x00000003DA000000L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Page__Group_3_1__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__02782 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__02785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__12842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__02904 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__12964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RelationshipPageElement__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03089 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Table__Group__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13151 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23211 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33271 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Table__Group__3__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43333 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53393 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Table__Group__5__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63455 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Table__Group__7__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03591 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3678 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03713 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Table__Group_6_1__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__13775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03836 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Column__Group__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13898 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23958 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Column__Group__3__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04147 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__04150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__List__Group__0__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14209 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__14212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24269 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__24272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__4_in_rule__List__Group__34332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__List__Group__3__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04458 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14518 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04643 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__TextField__Group__0__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14705 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__24765 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__24768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__34825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__04891 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__04894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TextField__Group_3__0__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__14953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextArea__Group__0__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15076 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05199 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SelectionField__Group__0__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15261 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05384 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DateSelectionField__Group__0__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15446 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05569 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TimeSelectionField__Group__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15631 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05754 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Condition__Group__0__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__05877 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__05880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AttributeValueCondition__Group__0__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__15939 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__15942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__25999 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AttributeValueCondition__Group__2__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36061 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46121 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AttributeValueCondition__Group__4__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56183 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66243 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AttributeValueCondition__Group__6__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06378 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__CompositeCondition__Group__0__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16440 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26500 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__CompositeCondition__Group__2__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36562 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__CompositeCondition__Group__3__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46624 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56684 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl6714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66744 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl6774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__76804 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__76807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__CompositeCondition__Group__7__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__86866 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__86869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__CompositeCondition__Group__8__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__96928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl6955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment7013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Form__WelcomeFormAssignment_07049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_37119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_57154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Form__PagesAssignment_77189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_57313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_47744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_27783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_17818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_27849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_17880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_17911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_27942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_17973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_28004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_18035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_28066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_18097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98415 = new BitSet(new long[]{0x0000000000000002L});
    }


}