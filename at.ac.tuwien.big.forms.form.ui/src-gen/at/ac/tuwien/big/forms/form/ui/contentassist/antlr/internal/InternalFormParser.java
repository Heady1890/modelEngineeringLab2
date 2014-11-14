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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Show'", "'Hide'", "'Disable'", "'Enable'", "'None'", "'Or'", "'And'", "'form'", "'handles'", "'{'", "'}'", "'page'", "','", "'edits'", "'table'", "'column'", "'list'", "'text-field'", "'format'", "'text-area'", "'selection-field'", "'date-selection-field'", "'time-selection-field'", "'with'", "'attribute-condition'", "':'", "'=='", "'?'", "'composite-condition'", "'('", "')'", "'welcome'"
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:544:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:548:1: ( ( ( rule__ConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:549:1: ( ( rule__ConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:549:1: ( ( rule__ConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:550:1: ( rule__ConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:551:1: ( rule__ConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:551:2: rule__ConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1104);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:563:1: ruleCompositeConditionType : ( ( rule__CompositeConditionType__Alternatives ) ) ;
    public final void ruleCompositeConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:567:1: ( ( ( rule__CompositeConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:568:1: ( ( rule__CompositeConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:568:1: ( ( rule__CompositeConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:569:1: ( rule__CompositeConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:570:1: ( rule__CompositeConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:570:2: rule__CompositeConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1140);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:581:1: rule__PageElement__Alternatives_0 : ( ( ruleRelationshipPageElement ) | ( ruleAttributePageElement ) );
    public final void rule__PageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:585:1: ( ( ruleRelationshipPageElement ) | ( ruleAttributePageElement ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:586:1: ( ruleRelationshipPageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:586:1: ( ruleRelationshipPageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:587:1: ruleRelationshipPageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives_01175);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:592:6: ( ruleAttributePageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:592:6: ( ruleAttributePageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:593:1: ruleAttributePageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives_01192);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:603:1: rule__RelationshipPageElement__Alternatives_0 : ( ( ruleList ) | ( ruleTable ) );
    public final void rule__RelationshipPageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:607:1: ( ( ruleList ) | ( ruleTable ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:608:1: ( ruleList )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:608:1: ( ruleList )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:609:1: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives_01224);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:614:6: ( ruleTable )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:614:6: ( ruleTable )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:615:1: ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives_01241);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:625:1: rule__AttributePageElement__Alternatives_0 : ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) );
    public final void rule__AttributePageElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:629:1: ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:630:1: ( ruleTextField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:630:1: ( ruleTextField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:631:1: ruleTextField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives_01273);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:636:6: ( ruleTextArea )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:636:6: ( ruleTextArea )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:637:1: ruleTextArea
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives_01290);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:642:6: ( ruleSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:642:6: ( ruleSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:643:1: ruleSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_0_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives_01307);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:648:6: ( ruleDateSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:648:6: ( ruleDateSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:649:1: ruleDateSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_0_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives_01324);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:654:6: ( ruleTimeSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:654:6: ( ruleTimeSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:655:1: ruleTimeSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_0_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives_01341);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:665:1: rule__Condition__Alternatives_1 : ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:669:1: ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:670:1: ( ruleAttributeValueCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:670:1: ( ruleAttributeValueCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:671:1: ruleAttributeValueCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_1_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives_11373);
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:676:6: ( ruleCompositeCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:676:6: ( ruleCompositeCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:677:1: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives_11390);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:688:1: rule__ConditionType__Alternatives : ( ( ( 'Show' ) ) | ( ( 'Hide' ) ) | ( ( 'Disable' ) ) | ( ( 'Enable' ) ) | ( ( 'None' ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:692:1: ( ( ( 'Show' ) ) | ( ( 'Hide' ) ) | ( ( 'Disable' ) ) | ( ( 'Enable' ) ) | ( ( 'None' ) ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:693:1: ( ( 'Show' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:693:1: ( ( 'Show' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:694:1: ( 'Show' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:695:1: ( 'Show' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:695:3: 'Show'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__ConditionType__Alternatives1424); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:700:6: ( ( 'Hide' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:700:6: ( ( 'Hide' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:701:1: ( 'Hide' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:702:1: ( 'Hide' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:702:3: 'Hide'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ConditionType__Alternatives1445); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:707:6: ( ( 'Disable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:707:6: ( ( 'Disable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:708:1: ( 'Disable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:709:1: ( 'Disable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:709:3: 'Disable'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConditionType__Alternatives1466); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:714:6: ( ( 'Enable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:714:6: ( ( 'Enable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:715:1: ( 'Enable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:716:1: ( 'Enable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:716:3: 'Enable'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConditionType__Alternatives1487); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:721:6: ( ( 'None' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:721:6: ( ( 'None' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:722:1: ( 'None' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:723:1: ( 'None' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:723:3: 'None'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConditionType__Alternatives1508); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:733:1: rule__CompositeConditionType__Alternatives : ( ( ( 'Or' ) ) | ( ( 'And' ) ) );
    public final void rule__CompositeConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:737:1: ( ( ( 'Or' ) ) | ( ( 'And' ) ) )
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
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:738:1: ( ( 'Or' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:738:1: ( ( 'Or' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:739:1: ( 'Or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:740:1: ( 'Or' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:740:3: 'Or'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__CompositeConditionType__Alternatives1544); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:745:6: ( ( 'And' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:745:6: ( ( 'And' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:746:1: ( 'And' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:747:1: ( 'And' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:747:3: 'And'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__CompositeConditionType__Alternatives1565); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:759:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:763:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:764:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01598);
            rule__Form__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01601);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:771:1: rule__Form__Group__0__Impl : ( ( rule__Form__WelcomeFormAssignment_0 )? ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:775:1: ( ( ( rule__Form__WelcomeFormAssignment_0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:776:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:776:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:777:1: ( rule__Form__WelcomeFormAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:778:1: ( rule__Form__WelcomeFormAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:778:2: rule__Form__WelcomeFormAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1628);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:788:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:792:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:793:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11659);
            rule__Form__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11662);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:800:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:804:1: ( ( 'form' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:805:1: ( 'form' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:805:1: ( 'form' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:806:1: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Form__Group__1__Impl1690); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:819:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:823:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:824:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__21721);
            rule__Form__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3_in_rule__Form__Group__21724);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:831:1: rule__Form__Group__2__Impl : ( ( rule__Form__NameAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:835:1: ( ( ( rule__Form__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:836:1: ( ( rule__Form__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:836:1: ( ( rule__Form__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:837:1: ( rule__Form__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:838:1: ( rule__Form__NameAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:838:2: rule__Form__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl1751);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:848:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:852:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:853:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__31781);
            rule__Form__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4_in_rule__Form__Group__31784);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:860:1: rule__Form__Group__3__Impl : ( ( rule__Form__TitleAssignment_3 ) ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:864:1: ( ( ( rule__Form__TitleAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:865:1: ( ( rule__Form__TitleAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:865:1: ( ( rule__Form__TitleAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:866:1: ( rule__Form__TitleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:867:1: ( rule__Form__TitleAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:867:2: rule__Form__TitleAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl1811);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:877:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:881:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:882:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__41841);
            rule__Form__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5_in_rule__Form__Group__41844);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:889:1: rule__Form__Group__4__Impl : ( 'handles' ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:893:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:894:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:894:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:895:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getHandlesKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Form__Group__4__Impl1872); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:908:1: rule__Form__Group__5 : rule__Form__Group__5__Impl rule__Form__Group__6 ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:912:1: ( rule__Form__Group__5__Impl rule__Form__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:913:2: rule__Form__Group__5__Impl rule__Form__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51903);
            rule__Form__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51906);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:920:1: rule__Form__Group__5__Impl : ( ( rule__Form__EntityAssignment_5 ) ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:924:1: ( ( ( rule__Form__EntityAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:925:1: ( ( rule__Form__EntityAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:925:1: ( ( rule__Form__EntityAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:926:1: ( rule__Form__EntityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:927:1: ( rule__Form__EntityAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:927:2: rule__Form__EntityAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__EntityAssignment_5_in_rule__Form__Group__5__Impl1933);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:937:1: rule__Form__Group__6 : rule__Form__Group__6__Impl rule__Form__Group__7 ;
    public final void rule__Form__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:941:1: ( rule__Form__Group__6__Impl rule__Form__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:942:2: rule__Form__Group__6__Impl rule__Form__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61963);
            rule__Form__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61966);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:949:1: rule__Form__Group__6__Impl : ( '{' ) ;
    public final void rule__Form__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:953:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:954:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:954:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:955:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Form__Group__6__Impl1994); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:968:1: rule__Form__Group__7 : rule__Form__Group__7__Impl rule__Form__Group__8 ;
    public final void rule__Form__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:972:1: ( rule__Form__Group__7__Impl rule__Form__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:973:2: rule__Form__Group__7__Impl rule__Form__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72025);
            rule__Form__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72028);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:980:1: rule__Form__Group__7__Impl : ( ( rule__Form__PagesAssignment_7 )* ) ;
    public final void rule__Form__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:984:1: ( ( ( rule__Form__PagesAssignment_7 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:985:1: ( ( rule__Form__PagesAssignment_7 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:985:1: ( ( rule__Form__PagesAssignment_7 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:986:1: ( rule__Form__PagesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:987:1: ( rule__Form__PagesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:987:2: rule__Form__PagesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Form__PagesAssignment_7_in_rule__Form__Group__7__Impl2055);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:997:1: rule__Form__Group__8 : rule__Form__Group__8__Impl ;
    public final void rule__Form__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1001:1: ( rule__Form__Group__8__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1002:2: rule__Form__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82086);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1008:1: rule__Form__Group__8__Impl : ( '}' ) ;
    public final void rule__Form__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1012:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1013:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1013:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1014:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Form__Group__8__Impl2114); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1045:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1049:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1050:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02163);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02166);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1057:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1061:1: ( ( 'page' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1062:1: ( 'page' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1062:1: ( 'page' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1063:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Page__Group__0__Impl2194); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1076:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1080:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1081:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12225);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12228);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1088:1: rule__Page__Group__1__Impl : ( ( rule__Page__TitleAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1092:1: ( ( ( rule__Page__TitleAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1093:1: ( ( rule__Page__TitleAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1093:1: ( ( rule__Page__TitleAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1094:1: ( rule__Page__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1095:1: ( rule__Page__TitleAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1095:2: rule__Page__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2255);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1105:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1109:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1110:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22285);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22288);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1117:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1121:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1122:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1122:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1123:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Page__Group__2__Impl2316); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1136:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1140:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1141:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32347);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32350);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1148:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1152:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1153:1: ( ( rule__Page__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1153:1: ( ( rule__Page__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1154:1: ( rule__Page__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1155:1: ( rule__Page__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25||(LA10_0>=27 && LA10_0<=28)||(LA10_0>=30 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1155:2: rule__Page__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2377);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1165:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1169:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1170:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42408);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42411);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1177:1: rule__Page__Group__4__Impl : ( ( rule__Page__ConditionAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1181:1: ( ( ( rule__Page__ConditionAssignment_4 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1182:1: ( ( rule__Page__ConditionAssignment_4 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1182:1: ( ( rule__Page__ConditionAssignment_4 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1183:1: ( rule__Page__ConditionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1184:1: ( rule__Page__ConditionAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1184:2: rule__Page__ConditionAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__ConditionAssignment_4_in_rule__Page__Group__4__Impl2438);
                    rule__Page__ConditionAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionAssignment_4()); 
            }

            }


            }

        }
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1194:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1198:1: ( rule__Page__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1199:2: rule__Page__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52469);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1205:1: rule__Page__Group__5__Impl : ( '}' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1209:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1210:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1210:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1211:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Page__Group__5__Impl2497); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1236:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1240:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1241:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02540);
            rule__Page__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02543);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1248:1: rule__Page__Group_3__0__Impl : ( ( rule__Page__PageElementsAssignment_3_0 ) ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1252:1: ( ( ( rule__Page__PageElementsAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1253:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1253:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1254:1: ( rule__Page__PageElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1255:1: ( rule__Page__PageElementsAssignment_3_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1255:2: rule__Page__PageElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2570);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1265:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1269:1: ( rule__Page__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1270:2: rule__Page__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12600);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1276:1: rule__Page__Group_3__1__Impl : ( ( rule__Page__Group_3_1__0 )* ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1280:1: ( ( ( rule__Page__Group_3_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1281:1: ( ( rule__Page__Group_3_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1281:1: ( ( rule__Page__Group_3_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1282:1: ( rule__Page__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1283:1: ( rule__Page__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1283:2: rule__Page__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2627);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1297:1: rule__Page__Group_3_1__0 : rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 ;
    public final void rule__Page__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1301:1: ( rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1302:2: rule__Page__Group_3_1__0__Impl rule__Page__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02662);
            rule__Page__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02665);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1309:1: rule__Page__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1313:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1314:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1314:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1315:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Page__Group_3_1__0__Impl2693); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1328:1: rule__Page__Group_3_1__1 : rule__Page__Group_3_1__1__Impl ;
    public final void rule__Page__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1332:1: ( rule__Page__Group_3_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1333:2: rule__Page__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12724);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1339:1: rule__Page__Group_3_1__1__Impl : ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) ;
    public final void rule__Page__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1343:1: ( ( ( rule__Page__PageElementsAssignment_3_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1344:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1344:1: ( ( rule__Page__PageElementsAssignment_3_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1345:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1346:1: ( rule__Page__PageElementsAssignment_3_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1346:2: rule__Page__PageElementsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2751);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1360:1: rule__PageElement__Group__0 : rule__PageElement__Group__0__Impl rule__PageElement__Group__1 ;
    public final void rule__PageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1364:1: ( rule__PageElement__Group__0__Impl rule__PageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1365:2: rule__PageElement__Group__0__Impl rule__PageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__02785);
            rule__PageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__02788);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1372:1: rule__PageElement__Group__0__Impl : ( ( rule__PageElement__Alternatives_0 ) ) ;
    public final void rule__PageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1376:1: ( ( ( rule__PageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1377:1: ( ( rule__PageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1377:1: ( ( rule__PageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1378:1: ( rule__PageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1379:1: ( rule__PageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1379:2: rule__PageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl2815);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1389:1: rule__PageElement__Group__1 : rule__PageElement__Group__1__Impl ;
    public final void rule__PageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1393:1: ( rule__PageElement__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1394:2: rule__PageElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__12845);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1400:1: rule__PageElement__Group__1__Impl : ( ( rule__PageElement__ConditionAssignment_1 )? ) ;
    public final void rule__PageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1404:1: ( ( ( rule__PageElement__ConditionAssignment_1 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1405:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1405:1: ( ( rule__PageElement__ConditionAssignment_1 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1406:1: ( rule__PageElement__ConditionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:1: ( rule__PageElement__ConditionAssignment_1 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:2: rule__PageElement__ConditionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl2872);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1421:1: rule__RelationshipPageElement__Group__0 : rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 ;
    public final void rule__RelationshipPageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1425:1: ( rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1426:2: rule__RelationshipPageElement__Group__0__Impl rule__RelationshipPageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__02907);
            rule__RelationshipPageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__02910);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1433:1: rule__RelationshipPageElement__Group__0__Impl : ( ( rule__RelationshipPageElement__Alternatives_0 ) ) ;
    public final void rule__RelationshipPageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1437:1: ( ( ( rule__RelationshipPageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1438:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1438:1: ( ( rule__RelationshipPageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1439:1: ( rule__RelationshipPageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1440:1: ( rule__RelationshipPageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1440:2: rule__RelationshipPageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl2937);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1450:1: rule__RelationshipPageElement__Group__1 : rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 ;
    public final void rule__RelationshipPageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1454:1: ( rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1455:2: rule__RelationshipPageElement__Group__1__Impl rule__RelationshipPageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__12967);
            rule__RelationshipPageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__12970);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1462:1: rule__RelationshipPageElement__Group__1__Impl : ( 'edits' ) ;
    public final void rule__RelationshipPageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1466:1: ( ( 'edits' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1467:1: ( 'edits' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1467:1: ( 'edits' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1468:1: 'edits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RelationshipPageElement__Group__1__Impl2998); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1481:1: rule__RelationshipPageElement__Group__2 : rule__RelationshipPageElement__Group__2__Impl ;
    public final void rule__RelationshipPageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1485:1: ( rule__RelationshipPageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1486:2: rule__RelationshipPageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23029);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1492:1: rule__RelationshipPageElement__Group__2__Impl : ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) ;
    public final void rule__RelationshipPageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1496:1: ( ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1497:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1497:1: ( ( rule__RelationshipPageElement__EditingFormAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1498:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1499:1: ( rule__RelationshipPageElement__EditingFormAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1499:2: rule__RelationshipPageElement__EditingFormAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3056);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1515:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1519:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1520:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03092);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03095);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1527:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1531:1: ( ( 'table' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1532:1: ( 'table' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1532:1: ( 'table' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1533:1: 'table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Table__Group__0__Impl3123); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1546:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1550:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1551:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13154);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13157);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1558:1: rule__Table__Group__1__Impl : ( ( rule__Table__ElementIDAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1562:1: ( ( ( rule__Table__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1563:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1563:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1564:1: ( rule__Table__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1565:1: ( rule__Table__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1565:2: rule__Table__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3184);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1575:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1579:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1580:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23214);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23217);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1587:1: rule__Table__Group__2__Impl : ( ( rule__Table__LabelAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:1: ( ( ( rule__Table__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1592:1: ( ( rule__Table__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1592:1: ( ( rule__Table__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1593:1: ( rule__Table__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1594:1: ( rule__Table__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1594:2: rule__Table__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3244);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1604:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1608:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1609:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33274);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33277);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1616:1: rule__Table__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1620:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1622:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Table__Group__3__Impl3305); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1635:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1639:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1640:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43336);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43339);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1647:1: rule__Table__Group__4__Impl : ( ( rule__Table__RelationshipAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1651:1: ( ( ( rule__Table__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1652:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1652:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1653:1: ( rule__Table__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1654:1: ( rule__Table__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1654:2: rule__Table__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3366);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1664:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1668:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1669:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53396);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53399);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1676:1: rule__Table__Group__5__Impl : ( '{' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1680:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1681:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1681:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1682:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Table__Group__5__Impl3427); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1695:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1699:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1700:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63458);
            rule__Table__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63461);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1707:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1711:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1712:1: ( ( rule__Table__Group_6__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1712:1: ( ( rule__Table__Group_6__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1713:1: ( rule__Table__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1714:1: ( rule__Table__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1714:2: rule__Table__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3488);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1724:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1728:1: ( rule__Table__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1729:2: rule__Table__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73519);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1735:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1739:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1740:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1740:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1741:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Table__Group__7__Impl3547); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1770:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1774:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1775:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03594);
            rule__Table__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03597);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1782:1: rule__Table__Group_6__0__Impl : ( ( rule__Table__ColumnsAssignment_6_0 ) ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1786:1: ( ( ( rule__Table__ColumnsAssignment_6_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1787:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1787:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1788:1: ( rule__Table__ColumnsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1789:1: ( rule__Table__ColumnsAssignment_6_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1789:2: rule__Table__ColumnsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3624);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1799:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1803:1: ( rule__Table__Group_6__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1804:2: rule__Table__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13654);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1810:1: rule__Table__Group_6__1__Impl : ( ( rule__Table__Group_6_1__0 )* ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1814:1: ( ( ( rule__Table__Group_6_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1815:1: ( ( rule__Table__Group_6_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1815:1: ( ( rule__Table__Group_6_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1816:1: ( rule__Table__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1817:1: ( rule__Table__Group_6_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1817:2: rule__Table__Group_6_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3681);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1831:1: rule__Table__Group_6_1__0 : rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 ;
    public final void rule__Table__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1835:1: ( rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1836:2: rule__Table__Group_6_1__0__Impl rule__Table__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03716);
            rule__Table__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03719);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1843:1: rule__Table__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1847:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1848:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1848:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1849:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Table__Group_6_1__0__Impl3747); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1862:1: rule__Table__Group_6_1__1 : rule__Table__Group_6_1__1__Impl ;
    public final void rule__Table__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1866:1: ( rule__Table__Group_6_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1867:2: rule__Table__Group_6_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__13778);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1873:1: rule__Table__Group_6_1__1__Impl : ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) ;
    public final void rule__Table__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1877:1: ( ( ( rule__Table__ColumnsAssignment_6_1_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1878:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1878:1: ( ( rule__Table__ColumnsAssignment_6_1_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1879:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_1_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1880:1: ( rule__Table__ColumnsAssignment_6_1_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1880:2: rule__Table__ColumnsAssignment_6_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl3805);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1894:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1898:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1899:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03839);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03842);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1906:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1910:1: ( ( 'column' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1911:1: ( 'column' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1911:1: ( 'column' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1912:1: 'column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Column__Group__0__Impl3870); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1925:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1929:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1930:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13901);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13904);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1937:1: rule__Column__Group__1__Impl : ( ( rule__Column__ElementIDAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:1: ( ( ( rule__Column__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1942:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1942:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1943:1: ( rule__Column__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1944:1: ( rule__Column__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1944:2: rule__Column__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl3931);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1954:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1958:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1959:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23961);
            rule__Column__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23964);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1966:1: rule__Column__Group__2__Impl : ( ( rule__Column__LabelAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1970:1: ( ( ( rule__Column__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1971:1: ( ( rule__Column__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1971:1: ( ( rule__Column__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1972:1: ( rule__Column__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1973:1: ( rule__Column__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1973:2: rule__Column__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl3991);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1983:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1987:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1988:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34021);
            rule__Column__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34024);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1995:1: rule__Column__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1999:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2000:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2000:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2001:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Column__Group__3__Impl4052); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2014:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2018:1: ( rule__Column__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2019:2: rule__Column__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44083);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2025:1: rule__Column__Group__4__Impl : ( ( rule__Column__AttributeAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2029:1: ( ( ( rule__Column__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2030:1: ( ( rule__Column__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2030:1: ( ( rule__Column__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2031:1: ( rule__Column__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2032:1: ( rule__Column__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2032:2: rule__Column__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4110);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2052:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2056:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2057:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04150);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1_in_rule__List__Group__04153);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2064:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2068:1: ( ( 'list' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2069:1: ( 'list' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2069:1: ( 'list' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2070:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__List__Group__0__Impl4181); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2083:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2087:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2088:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14212);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2_in_rule__List__Group__14215);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2095:1: rule__List__Group__1__Impl : ( ( rule__List__ElementIDAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2099:1: ( ( ( rule__List__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2100:1: ( ( rule__List__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2100:1: ( ( rule__List__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2101:1: ( rule__List__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2102:1: ( rule__List__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2102:2: rule__List__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4242);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2112:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2116:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2117:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24272);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3_in_rule__List__Group__24275);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2124:1: rule__List__Group__2__Impl : ( ( rule__List__LabelAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2128:1: ( ( ( rule__List__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2129:1: ( ( rule__List__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2129:1: ( ( rule__List__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2130:1: ( rule__List__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2131:1: ( rule__List__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2131:2: rule__List__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4302);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2141:1: rule__List__Group__3 : rule__List__Group__3__Impl rule__List__Group__4 ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2145:1: ( rule__List__Group__3__Impl rule__List__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2146:2: rule__List__Group__3__Impl rule__List__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34332);
            rule__List__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4_in_rule__List__Group__34335);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2153:1: rule__List__Group__3__Impl : ( 'handles' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2157:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2158:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2158:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2159:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__List__Group__3__Impl4363); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2172:1: rule__List__Group__4 : rule__List__Group__4__Impl ;
    public final void rule__List__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2176:1: ( rule__List__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2177:2: rule__List__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44394);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2183:1: rule__List__Group__4__Impl : ( ( rule__List__RelationshipAssignment_4 ) ) ;
    public final void rule__List__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2187:1: ( ( ( rule__List__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2188:1: ( ( rule__List__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2188:1: ( ( rule__List__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2189:1: ( rule__List__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2190:1: ( rule__List__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2190:2: rule__List__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4421);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2210:1: rule__AttributePageElement__Group__0 : rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 ;
    public final void rule__AttributePageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2214:1: ( rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2215:2: rule__AttributePageElement__Group__0__Impl rule__AttributePageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04461);
            rule__AttributePageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04464);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2222:1: rule__AttributePageElement__Group__0__Impl : ( ( rule__AttributePageElement__Alternatives_0 ) ) ;
    public final void rule__AttributePageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:1: ( ( ( rule__AttributePageElement__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2227:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2227:1: ( ( rule__AttributePageElement__Alternatives_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2228:1: ( rule__AttributePageElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAlternatives_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2229:1: ( rule__AttributePageElement__Alternatives_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2229:2: rule__AttributePageElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4491);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2239:1: rule__AttributePageElement__Group__1 : rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 ;
    public final void rule__AttributePageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2243:1: ( rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2244:2: rule__AttributePageElement__Group__1__Impl rule__AttributePageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14521);
            rule__AttributePageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14524);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2251:1: rule__AttributePageElement__Group__1__Impl : ( 'handles' ) ;
    public final void rule__AttributePageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2255:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2256:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2256:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2257:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4552); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2270:1: rule__AttributePageElement__Group__2 : rule__AttributePageElement__Group__2__Impl ;
    public final void rule__AttributePageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2274:1: ( rule__AttributePageElement__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2275:2: rule__AttributePageElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24583);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2281:1: rule__AttributePageElement__Group__2__Impl : ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) ;
    public final void rule__AttributePageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2285:1: ( ( ( rule__AttributePageElement__AttributeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2286:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2286:1: ( ( rule__AttributePageElement__AttributeAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2287:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2288:1: ( rule__AttributePageElement__AttributeAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2288:2: rule__AttributePageElement__AttributeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4610);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2304:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2308:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2309:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04646);
            rule__TextField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04649);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2316:1: rule__TextField__Group__0__Impl : ( 'text-field' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2320:1: ( ( 'text-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2321:1: ( 'text-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2321:1: ( 'text-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2322:1: 'text-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__TextField__Group__0__Impl4677); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2335:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2339:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2340:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14708);
            rule__TextField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14711);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2347:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__ElementIDAssignment_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2351:1: ( ( ( rule__TextField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2352:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2352:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2353:1: ( rule__TextField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2354:1: ( rule__TextField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2354:2: rule__TextField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4738);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2364:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2368:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2369:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__24768);
            rule__TextField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__24771);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2376:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__LabelAssignment_2 ) ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2380:1: ( ( ( rule__TextField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2381:1: ( ( rule__TextField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2381:1: ( ( rule__TextField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2382:1: ( rule__TextField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2383:1: ( rule__TextField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2383:2: rule__TextField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl4798);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2393:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2397:1: ( rule__TextField__Group__3__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2398:2: rule__TextField__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__34828);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2404:1: rule__TextField__Group__3__Impl : ( ( rule__TextField__Group_3__0 )? ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2408:1: ( ( ( rule__TextField__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2409:1: ( ( rule__TextField__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2409:1: ( ( rule__TextField__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2410:1: ( rule__TextField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2411:1: ( rule__TextField__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2411:2: rule__TextField__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl4855);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2429:1: rule__TextField__Group_3__0 : rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 ;
    public final void rule__TextField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2433:1: ( rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2434:2: rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__04894);
            rule__TextField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__04897);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2441:1: rule__TextField__Group_3__0__Impl : ( 'format' ) ;
    public final void rule__TextField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2445:1: ( ( 'format' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2446:1: ( 'format' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2446:1: ( 'format' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2447:1: 'format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TextField__Group_3__0__Impl4925); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2460:1: rule__TextField__Group_3__1 : rule__TextField__Group_3__1__Impl ;
    public final void rule__TextField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2464:1: ( rule__TextField__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2465:2: rule__TextField__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__14956);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2471:1: rule__TextField__Group_3__1__Impl : ( ( rule__TextField__FormatAssignment_3_1 ) ) ;
    public final void rule__TextField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2475:1: ( ( ( rule__TextField__FormatAssignment_3_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2476:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2476:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2477:1: ( rule__TextField__FormatAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2478:1: ( rule__TextField__FormatAssignment_3_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2478:2: rule__TextField__FormatAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl4983);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2492:1: rule__TextArea__Group__0 : rule__TextArea__Group__0__Impl rule__TextArea__Group__1 ;
    public final void rule__TextArea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2496:1: ( rule__TextArea__Group__0__Impl rule__TextArea__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2497:2: rule__TextArea__Group__0__Impl rule__TextArea__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05017);
            rule__TextArea__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05020);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2504:1: rule__TextArea__Group__0__Impl : ( 'text-area' ) ;
    public final void rule__TextArea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2508:1: ( ( 'text-area' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2509:1: ( 'text-area' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2509:1: ( 'text-area' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2510:1: 'text-area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextArea__Group__0__Impl5048); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2523:1: rule__TextArea__Group__1 : rule__TextArea__Group__1__Impl rule__TextArea__Group__2 ;
    public final void rule__TextArea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2527:1: ( rule__TextArea__Group__1__Impl rule__TextArea__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2528:2: rule__TextArea__Group__1__Impl rule__TextArea__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15079);
            rule__TextArea__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15082);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2535:1: rule__TextArea__Group__1__Impl : ( ( rule__TextArea__ElementIDAssignment_1 ) ) ;
    public final void rule__TextArea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2539:1: ( ( ( rule__TextArea__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2540:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2540:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2541:1: ( rule__TextArea__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2542:1: ( rule__TextArea__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2542:2: rule__TextArea__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5109);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2552:1: rule__TextArea__Group__2 : rule__TextArea__Group__2__Impl ;
    public final void rule__TextArea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2556:1: ( rule__TextArea__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2557:2: rule__TextArea__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25139);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2563:1: rule__TextArea__Group__2__Impl : ( ( rule__TextArea__LabelAssignment_2 ) ) ;
    public final void rule__TextArea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2567:1: ( ( ( rule__TextArea__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2568:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2568:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2569:1: ( rule__TextArea__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2570:1: ( rule__TextArea__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2570:2: rule__TextArea__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5166);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2586:1: rule__SelectionField__Group__0 : rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 ;
    public final void rule__SelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2590:1: ( rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2591:2: rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05202);
            rule__SelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05205);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2598:1: rule__SelectionField__Group__0__Impl : ( 'selection-field' ) ;
    public final void rule__SelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2602:1: ( ( 'selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2603:1: ( 'selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2603:1: ( 'selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2604:1: 'selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SelectionField__Group__0__Impl5233); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2617:1: rule__SelectionField__Group__1 : rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 ;
    public final void rule__SelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2621:1: ( rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2622:2: rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15264);
            rule__SelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15267);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2629:1: rule__SelectionField__Group__1__Impl : ( ( rule__SelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__SelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2633:1: ( ( ( rule__SelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2634:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2634:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2635:1: ( rule__SelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2636:1: ( rule__SelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2636:2: rule__SelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5294);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2646:1: rule__SelectionField__Group__2 : rule__SelectionField__Group__2__Impl ;
    public final void rule__SelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2650:1: ( rule__SelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2651:2: rule__SelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25324);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2657:1: rule__SelectionField__Group__2__Impl : ( ( rule__SelectionField__LabelAssignment_2 ) ) ;
    public final void rule__SelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2661:1: ( ( ( rule__SelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2662:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2662:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2663:1: ( rule__SelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2664:1: ( rule__SelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2664:2: rule__SelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5351);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2680:1: rule__DateSelectionField__Group__0 : rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 ;
    public final void rule__DateSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2684:1: ( rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2685:2: rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05387);
            rule__DateSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05390);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2692:1: rule__DateSelectionField__Group__0__Impl : ( 'date-selection-field' ) ;
    public final void rule__DateSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2696:1: ( ( 'date-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2697:1: ( 'date-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2697:1: ( 'date-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2698:1: 'date-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DateSelectionField__Group__0__Impl5418); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2711:1: rule__DateSelectionField__Group__1 : rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 ;
    public final void rule__DateSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2715:1: ( rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2716:2: rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15449);
            rule__DateSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15452);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2723:1: rule__DateSelectionField__Group__1__Impl : ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__DateSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:1: ( ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2728:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2728:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2729:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2730:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2730:2: rule__DateSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5479);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2740:1: rule__DateSelectionField__Group__2 : rule__DateSelectionField__Group__2__Impl ;
    public final void rule__DateSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2744:1: ( rule__DateSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2745:2: rule__DateSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25509);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2751:1: rule__DateSelectionField__Group__2__Impl : ( ( rule__DateSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__DateSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2755:1: ( ( ( rule__DateSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2756:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2756:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2757:1: ( rule__DateSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:1: ( rule__DateSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:2: rule__DateSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5536);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2774:1: rule__TimeSelectionField__Group__0 : rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 ;
    public final void rule__TimeSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2778:1: ( rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2779:2: rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05572);
            rule__TimeSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05575);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2786:1: rule__TimeSelectionField__Group__0__Impl : ( 'time-selection-field' ) ;
    public final void rule__TimeSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2790:1: ( ( 'time-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2791:1: ( 'time-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2791:1: ( 'time-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2792:1: 'time-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TimeSelectionField__Group__0__Impl5603); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2805:1: rule__TimeSelectionField__Group__1 : rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 ;
    public final void rule__TimeSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2809:1: ( rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2810:2: rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15634);
            rule__TimeSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15637);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2817:1: rule__TimeSelectionField__Group__1__Impl : ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__TimeSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2821:1: ( ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2822:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2822:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2823:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2824:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2824:2: rule__TimeSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5664);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2834:1: rule__TimeSelectionField__Group__2 : rule__TimeSelectionField__Group__2__Impl ;
    public final void rule__TimeSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2838:1: ( rule__TimeSelectionField__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2839:2: rule__TimeSelectionField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25694);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2845:1: rule__TimeSelectionField__Group__2__Impl : ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__TimeSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2849:1: ( ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2850:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2850:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2851:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2852:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2852:2: rule__TimeSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5721);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2868:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2872:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2873:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05757);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05760);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2880:1: rule__Condition__Group__0__Impl : ( 'with' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2884:1: ( ( 'with' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2885:1: ( 'with' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2885:1: ( 'with' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2886:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getWithKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Condition__Group__0__Impl5788); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2899:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2903:1: ( rule__Condition__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2904:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15819);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2910:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2914:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2915:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2915:1: ( ( rule__Condition__Alternatives_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2916:1: ( rule__Condition__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2917:1: ( rule__Condition__Alternatives_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2917:2: rule__Condition__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5846);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2931:1: rule__AttributeValueCondition__Group__0 : rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 ;
    public final void rule__AttributeValueCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2935:1: ( rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2936:2: rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__05880);
            rule__AttributeValueCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__05883);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2943:1: rule__AttributeValueCondition__Group__0__Impl : ( 'attribute-condition' ) ;
    public final void rule__AttributeValueCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2947:1: ( ( 'attribute-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2948:1: ( 'attribute-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2948:1: ( 'attribute-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2949:1: 'attribute-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AttributeValueCondition__Group__0__Impl5911); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2962:1: rule__AttributeValueCondition__Group__1 : rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 ;
    public final void rule__AttributeValueCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2966:1: ( rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2967:2: rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__15942);
            rule__AttributeValueCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__15945);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2974:1: rule__AttributeValueCondition__Group__1__Impl : ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__AttributeValueCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2978:1: ( ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2979:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2979:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2980:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2981:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2981:2: rule__AttributeValueCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl5972);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2991:1: rule__AttributeValueCondition__Group__2 : rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 ;
    public final void rule__AttributeValueCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2995:1: ( rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2996:2: rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__26002);
            rule__AttributeValueCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26005);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3003:1: rule__AttributeValueCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeValueCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3007:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3008:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3008:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3009:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AttributeValueCondition__Group__2__Impl6033); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3022:1: rule__AttributeValueCondition__Group__3 : rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 ;
    public final void rule__AttributeValueCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3026:1: ( rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3027:2: rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36064);
            rule__AttributeValueCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36067);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3034:1: rule__AttributeValueCondition__Group__3__Impl : ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) ;
    public final void rule__AttributeValueCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3038:1: ( ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3039:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3039:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3040:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3041:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3041:2: rule__AttributeValueCondition__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6094);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3051:1: rule__AttributeValueCondition__Group__4 : rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 ;
    public final void rule__AttributeValueCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3055:1: ( rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3056:2: rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46124);
            rule__AttributeValueCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46127);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3063:1: rule__AttributeValueCondition__Group__4__Impl : ( '==' ) ;
    public final void rule__AttributeValueCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3067:1: ( ( '==' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3068:1: ( '==' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3068:1: ( '==' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3069:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AttributeValueCondition__Group__4__Impl6155); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3082:1: rule__AttributeValueCondition__Group__5 : rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 ;
    public final void rule__AttributeValueCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3086:1: ( rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3087:2: rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56186);
            rule__AttributeValueCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56189);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3094:1: rule__AttributeValueCondition__Group__5__Impl : ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) ;
    public final void rule__AttributeValueCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3098:1: ( ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3099:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3099:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3100:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3101:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3101:2: rule__AttributeValueCondition__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6216);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3111:1: rule__AttributeValueCondition__Group__6 : rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 ;
    public final void rule__AttributeValueCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3115:1: ( rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3116:2: rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66246);
            rule__AttributeValueCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66249);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3123:1: rule__AttributeValueCondition__Group__6__Impl : ( '?' ) ;
    public final void rule__AttributeValueCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3127:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3128:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3128:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3129:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AttributeValueCondition__Group__6__Impl6277); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3142:1: rule__AttributeValueCondition__Group__7 : rule__AttributeValueCondition__Group__7__Impl ;
    public final void rule__AttributeValueCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3146:1: ( rule__AttributeValueCondition__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3147:2: rule__AttributeValueCondition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76308);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3153:1: rule__AttributeValueCondition__Group__7__Impl : ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) ;
    public final void rule__AttributeValueCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3157:1: ( ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3158:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3158:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3159:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3160:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3160:2: rule__AttributeValueCondition__TypeAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6335);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3186:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3190:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3191:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06381);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06384);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3198:1: rule__CompositeCondition__Group__0__Impl : ( 'composite-condition' ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3202:1: ( ( 'composite-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3203:1: ( 'composite-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3203:1: ( 'composite-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3204:1: 'composite-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__CompositeCondition__Group__0__Impl6412); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3217:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3221:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3222:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16443);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16446);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3229:1: rule__CompositeCondition__Group__1__Impl : ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3233:1: ( ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3234:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3234:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3235:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3236:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3236:2: rule__CompositeCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6473);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3246:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3250:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3251:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26503);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26506);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3258:1: rule__CompositeCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3262:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3263:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3263:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3264:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__CompositeCondition__Group__2__Impl6534); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3277:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3281:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3282:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36565);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36568);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3289:1: rule__CompositeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3293:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3294:1: ( '(' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3294:1: ( '(' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3295:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__CompositeCondition__Group__3__Impl6596); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3308:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3312:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3313:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46627);
            rule__CompositeCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46630);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3320:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__CompositionTypeAssignment_4 ) ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3324:1: ( ( ( rule__CompositeCondition__CompositionTypeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3325:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3325:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3326:1: ( rule__CompositeCondition__CompositionTypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3327:1: ( rule__CompositeCondition__CompositionTypeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3327:2: rule__CompositeCondition__CompositionTypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_4_in_rule__CompositeCondition__Group__4__Impl6657);
            rule__CompositeCondition__CompositionTypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_4()); 
            }

            }


            }

        }
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3337:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3341:1: ( rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3342:2: rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56687);
            rule__CompositeCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56690);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3349:1: rule__CompositeCondition__Group__5__Impl : ( '?' ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3353:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3354:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3354:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3355:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_5()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__CompositeCondition__Group__5__Impl6718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_5()); 
            }

            }


            }

        }
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3368:1: rule__CompositeCondition__Group__6 : rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 ;
    public final void rule__CompositeCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3372:1: ( rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3373:2: rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66749);
            rule__CompositeCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66752);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3380:1: rule__CompositeCondition__Group__6__Impl : ( ( rule__CompositeCondition__TypeAssignment_6 ) ) ;
    public final void rule__CompositeCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3384:1: ( ( ( rule__CompositeCondition__TypeAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3385:1: ( ( rule__CompositeCondition__TypeAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3385:1: ( ( rule__CompositeCondition__TypeAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3386:1: ( rule__CompositeCondition__TypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3387:1: ( rule__CompositeCondition__TypeAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3387:2: rule__CompositeCondition__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__TypeAssignment_6_in_rule__CompositeCondition__Group__6__Impl6779);
            rule__CompositeCondition__TypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeAssignment_6()); 
            }

            }


            }

        }
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3397:1: rule__CompositeCondition__Group__7 : rule__CompositeCondition__Group__7__Impl ;
    public final void rule__CompositeCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3401:1: ( rule__CompositeCondition__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3402:2: rule__CompositeCondition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__76809);
            rule__CompositeCondition__Group__7__Impl();

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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3408:1: rule__CompositeCondition__Group__7__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3412:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3413:1: ( ')' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3413:1: ( ')' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3414:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__CompositeCondition__Group__7__Impl6837); if (state.failed) return ;
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


    // $ANTLR start "rule__FormModel__FormsAssignment"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3447:1: rule__FormModel__FormsAssignment : ( ruleForm ) ;
    public final void rule__FormModel__FormsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3451:1: ( ( ruleForm ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3452:1: ( ruleForm )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3452:1: ( ruleForm )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3453:1: ruleForm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment6892);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3462:1: rule__Form__WelcomeFormAssignment_0 : ( ( 'welcome' ) ) ;
    public final void rule__Form__WelcomeFormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3466:1: ( ( ( 'welcome' ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3467:1: ( ( 'welcome' ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3467:1: ( ( 'welcome' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3468:1: ( 'welcome' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3469:1: ( 'welcome' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3470:1: 'welcome'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Form__WelcomeFormAssignment_06928); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3485:1: rule__Form__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3489:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3490:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3490:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3491:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__NameAssignment_26967); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3500:1: rule__Form__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Form__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3504:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3505:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3505:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3506:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_36998); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3515:1: rule__Form__EntityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Form__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3519:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3520:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3520:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3521:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityCrossReference_5_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3522:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3523:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_57033); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3534:1: rule__Form__PagesAssignment_7 : ( rulePage ) ;
    public final void rule__Form__PagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3538:1: ( ( rulePage ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3539:1: ( rulePage )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3539:1: ( rulePage )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3540:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesPageParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Form__PagesAssignment_77068);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3549:1: rule__Page__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3553:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3554:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3554:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3555:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17099); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3564:1: rule__Page__PageElementsAssignment_3_0 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3568:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3569:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3569:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3570:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07130);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3579:1: rule__Page__PageElementsAssignment_3_1_1 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3583:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3584:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3584:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3585:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17161);
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


    // $ANTLR start "rule__Page__ConditionAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3594:1: rule__Page__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Page__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3598:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3599:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3599:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3600:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_47192);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ConditionAssignment_4"


    // $ANTLR start "rule__PageElement__ConditionAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3609:1: rule__PageElement__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__PageElement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3613:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3614:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3614:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3615:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17223);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3624:1: rule__RelationshipPageElement__EditingFormAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationshipPageElement__EditingFormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3628:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3629:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3629:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3630:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3631:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3632:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getEditingFormFormIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27258); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3643:1: rule__Table__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3647:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3648:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3648:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3649:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17293); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3658:1: rule__Table__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Table__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3662:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3663:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3663:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3664:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27324); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3673:1: rule__Table__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Table__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3677:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3678:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3678:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3679:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3680:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3681:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47359); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3692:1: rule__Table__ColumnsAssignment_6_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3696:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3697:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3697:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3698:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07394);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: rule__Table__ColumnsAssignment_6_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3711:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3712:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3712:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3713:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17425);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3722:1: rule__Column__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3726:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3727:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3727:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3728:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17456); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3737:1: rule__Column__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Column__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3741:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3742:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3742:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3743:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27487); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3752:1: rule__Column__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Column__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3756:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3757:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3757:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3758:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3759:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3760:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47522); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3771:1: rule__List__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3775:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3776:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3776:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3777:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17557); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3786:1: rule__List__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__List__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3790:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3791:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3791:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3792:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27588); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3801:1: rule__List__RelationshipAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__List__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3805:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3806:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3806:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3807:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3808:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3809:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_47623); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3820:1: rule__AttributePageElement__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePageElement__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3824:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3825:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3825:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3826:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3827:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3828:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_27662); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3839:1: rule__TextField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3843:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3844:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3844:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3845:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_17697); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3854:1: rule__TextField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3858:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3859:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3859:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3860:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_27728); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3869:1: rule__TextField__FormatAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TextField__FormatAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3873:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3874:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3874:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3875:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_17759); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3884:1: rule__TextArea__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextArea__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3888:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3889:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3889:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3890:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_17790); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3899:1: rule__TextArea__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextArea__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3903:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3904:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3904:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3905:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_27821); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3914:1: rule__SelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3918:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3919:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3919:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3920:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_17852); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3929:1: rule__SelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3933:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3934:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3934:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3935:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_27883); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3944:1: rule__DateSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__DateSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3948:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3949:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3949:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3950:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_17914); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3959:1: rule__DateSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DateSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3963:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3964:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3964:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3965:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_27945); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3974:1: rule__TimeSelectionField__ElementIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TimeSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3978:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3979:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3979:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3980:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_17976); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3989:1: rule__TimeSelectionField__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TimeSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3994:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3994:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3995:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28007); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4004:1: rule__AttributeValueCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeValueCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4009:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4009:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4010:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18038); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4019:1: rule__AttributeValueCondition__AttributeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeValueCondition__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4023:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4024:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4024:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4025:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4026:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4027:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38073); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4038:1: rule__AttributeValueCondition__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttributeValueCondition__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4042:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4043:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4043:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4044:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58108); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4053:1: rule__AttributeValueCondition__TypeAssignment_7 : ( ruleConditionType ) ;
    public final void rule__AttributeValueCondition__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4057:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4058:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4058:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4059:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78139);
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
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4068:1: rule__CompositeCondition__ConditionIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4072:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4073:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4073:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4074:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18170); if (state.failed) return ;
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


    // $ANTLR start "rule__CompositeCondition__CompositionTypeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4083:1: rule__CompositeCondition__CompositionTypeAssignment_4 : ( ruleCompositeConditionType ) ;
    public final void rule__CompositeCondition__CompositionTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4087:1: ( ( ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4088:1: ( ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4088:1: ( ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4089:1: ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_48201);
            ruleCompositeConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__CompositionTypeAssignment_4"


    // $ANTLR start "rule__CompositeCondition__TypeAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4098:1: rule__CompositeCondition__TypeAssignment_6 : ( ruleConditionType ) ;
    public final void rule__CompositeCondition__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4102:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4103:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4103:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4104:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_68232);
            ruleConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__TypeAssignment_6"

    // $ANTLR start synpred19_InternalForm
    public final void synpred19_InternalForm_fragment() throws RecognitionException {   
        // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:2: ( rule__PageElement__ConditionAssignment_1 )
        // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1407:2: rule__PageElement__ConditionAssignment_1
        {
        pushFollow(FollowSets000.FOLLOW_rule__PageElement__ConditionAssignment_1_in_synpred19_InternalForm2872);
        rule__PageElement__ConditionAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalForm

    // Delegated rules

    public final boolean synpred19_InternalForm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalForm_fragment(); // can never throw exception
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
    static final String DFA13_eotS =
        "\35\uffff";
    static final String DFA13_eofS =
        "\1\2\34\uffff";
    static final String DFA13_minS =
        "\1\25\1\43\1\uffff\2\4\2\44\1\4\1\50\1\45\1\20\1\5\3\46\2\13\5\51\6\0\1\uffff";
    static final String DFA13_maxS =
        "\1\42\1\47\1\uffff\2\4\2\44\1\4\1\50\1\45\1\21\1\5\3\46\2\17\5\51\6\0\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\31\uffff\1\1";
    static final String DFA13_specialS =
        "\26\uffff\1\5\1\2\1\0\1\3\1\1\1\4\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\1\2\12\uffff\1\1",
            "\1\3\3\uffff\1\4",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\21\1\22\1\23\1\24\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    class DFA13 extends DFA {

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
        public String getDescription() {
            return "1407:1: ( rule__PageElement__ConditionAssignment_1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                         
                        int index13_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_26 = input.LA(1);

                         
                        int index13_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_23 = input.LA(1);

                         
                        int index13_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_25 = input.LA(1);

                         
                        int index13_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_25);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_27 = input.LA(1);

                         
                        int index13_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_27);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_22 = input.LA(1);

                         
                        int index13_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalForm()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
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
        public static final BitSet FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives_01175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives_01192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives_01224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives_01241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives_01273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives_01290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives_01307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives_01324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives_01341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives_11373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives_11390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__ConditionType__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ConditionType__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConditionType__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConditionType__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConditionType__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompositeConditionType__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CompositeConditionType__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01598 = new BitSet(new long[]{0x0000040000040000L});
        public static final BitSet FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11659 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Form__Group__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__21721 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Form__Group__3_in_rule__Form__Group__21724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__31781 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Form__Group__4_in_rule__Form__Group__31784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__41841 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Form__Group__5_in_rule__Form__Group__41844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Form__Group__4__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__51903 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Form__Group__6_in_rule__Form__Group__51906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__EntityAssignment_5_in_rule__Form__Group__5__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__61963 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__7_in_rule__Form__Group__61966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Form__Group__6__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72025 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__PagesAssignment_7_in_rule__Form__Group__7__Impl2055 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Form__Group__8__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02163 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Page__Group__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12225 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22285 = new BitSet(new long[]{0x00000007DA200000L});
        public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Page__Group__2__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32347 = new BitSet(new long[]{0x00000007DA200000L});
        public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42408 = new BitSet(new long[]{0x00000007DA200000L});
        public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__ConditionAssignment_4_in_rule__Page__Group__4__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Page__Group__5__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02540 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__12600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0_in_rule__Page__Group_3__1__Impl2627 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__0__Impl_in_rule__Page__Group_3_1__02662 = new BitSet(new long[]{0x00000003DA000000L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1_in_rule__Page__Group_3_1__02665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Page__Group_3_1__0__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3_1__1__Impl_in_rule__Page__Group_3_1__12724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_1_1_in_rule__Page__Group_3_1__1__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__0__Impl_in_rule__PageElement__Group__02785 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1_in_rule__PageElement__Group__02788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Alternatives_0_in_rule__PageElement__Group__0__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Group__1__Impl_in_rule__PageElement__Group__12845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__ConditionAssignment_1_in_rule__PageElement__Group__1__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__0__Impl_in_rule__RelationshipPageElement__Group__02907 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1_in_rule__RelationshipPageElement__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Alternatives_0_in_rule__RelationshipPageElement__Group__0__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__1__Impl_in_rule__RelationshipPageElement__Group__12967 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2_in_rule__RelationshipPageElement__Group__12970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RelationshipPageElement__Group__1__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Group__2__Impl_in_rule__RelationshipPageElement__Group__23029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__EditingFormAssignment_2_in_rule__RelationshipPageElement__Group__2__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03092 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Table__Group__0__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13154 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23214 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33274 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Table__Group__3__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43336 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__43339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__53396 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Table__Group__6_in_rule__Table__Group__53399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Table__Group__5__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__63458 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Table__Group__7_in_rule__Table__Group__63461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__73519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Table__Group__7__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__03594 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__03597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__13654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0_in_rule__Table__Group_6__1__Impl3681 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__0__Impl_in_rule__Table__Group_6_1__03716 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1_in_rule__Table__Group_6_1__03719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Table__Group_6_1__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6_1__1__Impl_in_rule__Table__Group_6_1__13778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_1_1_in_rule__Table__Group_6_1__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03839 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Column__Group__0__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13901 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23961 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__34021 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Column__Group__4_in_rule__Column__Group__34024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Column__Group__3__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__44083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__04150 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__04153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__List__Group__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__14212 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__14215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__24272 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__24275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__34332 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__List__Group__4_in_rule__List__Group__34335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__List__Group__3__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__44394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__0__Impl_in_rule__AttributePageElement__Group__04461 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1_in_rule__AttributePageElement__Group__04464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Alternatives_0_in_rule__AttributePageElement__Group__0__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__1__Impl_in_rule__AttributePageElement__Group__14521 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2_in_rule__AttributePageElement__Group__14524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributePageElement__Group__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Group__2__Impl_in_rule__AttributePageElement__Group__24583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__AttributeAssignment_2_in_rule__AttributePageElement__Group__2__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04646 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__TextField__Group__0__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14708 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__14711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__24768 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__24771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__34828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__04894 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__04897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TextField__Group_3__0__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__14956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__05017 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__05020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextArea__Group__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__15079 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__15082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__25139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__05202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__05205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SelectionField__Group__0__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__15264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__15267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__25324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl5351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05387 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DateSelectionField__Group__0__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15449 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__25509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05572 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TimeSelectionField__Group__0__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15634 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05757 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Condition__Group__0__Impl5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__05880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__05883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AttributeValueCondition__Group__0__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__15942 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__15945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl5972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__26002 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__26005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AttributeValueCondition__Group__2__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__36064 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__36067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__46124 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__46127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AttributeValueCondition__Group__4__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__56186 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__56189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__66246 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__66249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AttributeValueCondition__Group__6__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__76308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__06381 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__06384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__CompositeCondition__Group__0__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__16443 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__16446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__26503 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__26506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__CompositeCondition__Group__2__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__36565 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__36568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__CompositeCondition__Group__3__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__46627 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__46630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_4_in_rule__CompositeCondition__Group__4__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__56687 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__56690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__CompositeCondition__Group__5__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__66749 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__66752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__TypeAssignment_6_in_rule__CompositeCondition__Group__6__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__76809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__CompositeCondition__Group__7__Impl6837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment6892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Form__WelcomeFormAssignment_06928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_26967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Form__TitleAssignment_36998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_57033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Form__PagesAssignment_77068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_17099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_07130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_1_17161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_47192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__PageElement__ConditionAssignment_17223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipPageElement__EditingFormAssignment_27258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__ElementIDAssignment_17293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Table__LabelAssignment_27324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Table__RelationshipAssignment_47359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_07394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_1_17425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__ElementIDAssignment_17456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Column__LabelAssignment_27487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Column__AttributeAssignment_47522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__ElementIDAssignment_17557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__List__LabelAssignment_27588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__RelationshipAssignment_47623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePageElement__AttributeAssignment_27662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextField__ElementIDAssignment_17697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__LabelAssignment_27728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__FormatAssignment_3_17759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextArea__ElementIDAssignment_17790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextArea__LabelAssignment_27821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SelectionField__ElementIDAssignment_17852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SelectionField__LabelAssignment_27883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DateSelectionField__ElementIDAssignment_17914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DateSelectionField__LabelAssignment_27945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TimeSelectionField__ElementIDAssignment_17976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TimeSelectionField__LabelAssignment_28007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__ConditionIDAssignment_18038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValueCondition__AttributeAssignment_38073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeValueCondition__ValueAssignment_58108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeCondition__ConditionIDAssignment_18170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_48201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_68232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__ConditionAssignment_1_in_synpred19_InternalForm2872 = new BitSet(new long[]{0x0000000000000002L});
    }


}