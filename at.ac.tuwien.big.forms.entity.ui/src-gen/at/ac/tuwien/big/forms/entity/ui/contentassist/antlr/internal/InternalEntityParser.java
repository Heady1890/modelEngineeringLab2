package at.ac.tuwien.big.forms.entity.ui.contentassist.antlr.internal; 

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
import at.ac.tuwien.big.forms.entity.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Text'", "'Boolean'", "'Year'", "'Date'", "'Time'", "'Email'", "'None'", "'entity'", "'{'", "'id'", "','", "'}'", "'extends'", "'attribute'", "':'", "'reference'", "'['", "'..'", "']'", "'opposite-of'", "'enum'", "'='", "'-'", "'.'", "'*'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g"; }


     
     	private EntityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntityModel"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:61:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:62:1: ( ruleEntityModel EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:63:1: ruleEntityModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModel_in_entryRuleEntityModel67);
            ruleEntityModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:70:1: ruleEntityModel : ( ( rule__EntityModel__EntityModelElementsAssignment )* ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:74:2: ( ( ( rule__EntityModel__EntityModelElementsAssignment )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:75:1: ( ( rule__EntityModel__EntityModelElementsAssignment )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:75:1: ( ( rule__EntityModel__EntityModelElementsAssignment )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:76:1: ( rule__EntityModel__EntityModelElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsAssignment()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:77:1: ( rule__EntityModel__EntityModelElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:77:2: rule__EntityModel__EntityModelElementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EntityModel__EntityModelElementsAssignment_in_ruleEntityModel100);
            	    rule__EntityModel__EntityModelElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getEntityModelElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:89:1: entryRuleEntityModelElement : ruleEntityModelElement EOF ;
    public final void entryRuleEntityModelElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:90:1: ( ruleEntityModelElement EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:91:1: ruleEntityModelElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement128);
            ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModelElement135); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityModelElement"


    // $ANTLR start "ruleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:98:1: ruleEntityModelElement : ( ( rule__EntityModelElement__Alternatives ) ) ;
    public final void ruleEntityModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:102:2: ( ( ( rule__EntityModelElement__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:103:1: ( ( rule__EntityModelElement__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:103:1: ( ( rule__EntityModelElement__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:104:1: ( rule__EntityModelElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelElementAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:105:1: ( rule__EntityModelElement__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:105:2: rule__EntityModelElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModelElement__Alternatives_in_ruleEntityModelElement161);
            rule__EntityModelElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityModelElement"


    // $ANTLR start "entryRuleEntity"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:118:1: ( ruleEntity EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:119:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity188);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:126:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:130:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:131:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:131:1: ( ( rule__Entity__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:132:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:1: ( rule__Entity__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity221);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:145:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:146:1: ( ruleFeature EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:147:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature248);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature255); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:154:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:158:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:159:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:159:1: ( ( rule__Feature__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:160:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:1: ( rule__Feature__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature281);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAttribute"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:173:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:174:1: ( ruleAttribute EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:175:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute308);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:182:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:186:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:187:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:187:1: ( ( rule__Attribute__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:188:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:1: ( rule__Attribute__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute341);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:201:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:202:1: ( ruleRelationship EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:203:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship368);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:210:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:214:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:215:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:215:1: ( ( rule__Relationship__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:216:1: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:1: ( rule__Relationship__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:2: rule__Relationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0_in_ruleRelationship401);
            rule__Relationship__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleEnumeration"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:229:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:230:1: ( ruleEnumeration EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:231:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration428);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:238:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:242:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:243:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:243:1: ( ( rule__Enumeration__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:244:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:1: ( rule__Enumeration__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:2: rule__Enumeration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration461);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleLiteral"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:257:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:258:1: ( ruleLiteral EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:259:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral488);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:266:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:270:2: ( ( ( rule__Literal__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__Literal__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__Literal__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:272:1: ( rule__Literal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:1: ( rule__Literal__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:2: rule__Literal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0_in_ruleLiteral521);
            rule__Literal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEInt"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:285:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:286:1: ( ruleEInt EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:287:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt548);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt555); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:294:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:298:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:299:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:299:1: ( ( rule__EInt__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:300:1: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:301:1: ( rule__EInt__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:301:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt581);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:313:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:314:1: ( ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:315:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName608);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName615); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:322:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:326:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:328:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:329:1: ( rule__QualifiedName__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:329:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName641);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeType"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:342:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:346:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:1: ( ( rule__AttributeType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:348:1: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:349:1: ( rule__AttributeType__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:349:2: rule__AttributeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType678);
            rule__AttributeType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "rule__EntityModelElement__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:360:1: rule__EntityModelElement__Alternatives : ( ( ruleEntity ) | ( ruleEnumeration ) );
    public final void rule__EntityModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:364:1: ( ( ruleEntity ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:365:1: ( ruleEntity )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:365:1: ( ruleEntity )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:366:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives713);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:371:6: ( ruleEnumeration )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:371:6: ( ruleEnumeration )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:372:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives730);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
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
    // $ANTLR end "rule__EntityModelElement__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:382:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleRelationship ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:386:1: ( ( ruleAttribute ) | ( ruleRelationship ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:387:1: ( ruleAttribute )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:387:1: ( ruleAttribute )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:388:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Feature__Alternatives762);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ruleRelationship )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ruleRelationship )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:394:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_rule__Feature__Alternatives779);
                    ruleRelationship();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:404:1: rule__AttributeType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Text' ) ) | ( ( 'Boolean' ) ) | ( ( 'Year' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Email' ) ) | ( ( 'None' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:408:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Text' ) ) | ( ( 'Boolean' ) ) | ( ( 'Year' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Email' ) ) | ( ( 'None' ) ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:1: ( ( 'String' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:1: ( ( 'String' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:410:1: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:411:1: ( 'String' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:411:3: 'String'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__AttributeType__Alternatives812); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:6: ( ( 'Integer' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:6: ( ( 'Integer' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:417:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:418:1: ( 'Integer' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:418:3: 'Integer'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__AttributeType__Alternatives833); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:6: ( ( 'Text' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:6: ( ( 'Text' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:424:1: ( 'Text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:425:1: ( 'Text' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:425:3: 'Text'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__AttributeType__Alternatives854); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:6: ( ( 'Boolean' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:6: ( ( 'Boolean' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:431:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:432:1: ( 'Boolean' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:432:3: 'Boolean'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__AttributeType__Alternatives875); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:6: ( ( 'Year' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:6: ( ( 'Year' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:438:1: ( 'Year' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:439:1: ( 'Year' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:439:3: 'Year'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__AttributeType__Alternatives896); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:6: ( ( 'Date' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:6: ( ( 'Date' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:445:1: ( 'Date' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_5()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:446:1: ( 'Date' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:446:3: 'Date'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AttributeType__Alternatives917); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:451:6: ( ( 'Time' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:451:6: ( ( 'Time' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:452:1: ( 'Time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_6()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:453:1: ( 'Time' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:453:3: 'Time'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AttributeType__Alternatives938); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:458:6: ( ( 'Email' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:458:6: ( ( 'Email' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:459:1: ( 'Email' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_7()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:460:1: ( 'Email' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:460:3: 'Email'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__AttributeType__Alternatives959); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:465:6: ( ( 'None' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:465:6: ( ( 'None' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:466:1: ( 'None' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:467:1: ( 'None' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:467:3: 'None'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributeType__Alternatives980); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:479:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:483:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:484:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01013);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01016);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:491:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:495:1: ( ( 'entity' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:496:1: ( 'entity' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:496:1: ( 'entity' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:497:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Entity__Group__0__Impl1044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:510:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:514:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:515:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11075);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11078);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:522:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:526:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:527:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:527:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:528:1: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:529:1: ( rule__Entity__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:529:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1105);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:539:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:543:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:544:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21135);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21138);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:551:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:555:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:556:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:556:1: ( ( rule__Entity__Group_2__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:557:1: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:558:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:558:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1165);
                    rule__Entity__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:568:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:572:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:573:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31196);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31199);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:580:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:584:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:585:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:585:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:586:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Entity__Group__3__Impl1227); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:599:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:603:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:604:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41258);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41261);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:611:1: rule__Entity__Group__4__Impl : ( 'id' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:615:1: ( ( 'id' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:616:1: ( 'id' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:616:1: ( 'id' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:617:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Entity__Group__4__Impl1289); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:630:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:634:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:635:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51320);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51323);
            rule__Entity__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:642:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__IdAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:646:1: ( ( ( rule__Entity__IdAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:647:1: ( ( rule__Entity__IdAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:647:1: ( ( rule__Entity__IdAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:648:1: ( rule__Entity__IdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:649:1: ( rule__Entity__IdAssignment_5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:649:2: rule__Entity__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__IdAssignment_5_in_rule__Entity__Group__5__Impl1350);
            rule__Entity__IdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:659:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:663:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:664:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61380);
            rule__Entity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61383);
            rule__Entity__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:671:1: rule__Entity__Group__6__Impl : ( ',' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:675:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:676:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:676:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:677:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_6()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group__6__Impl1411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:690:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:694:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:695:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71442);
            rule__Entity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71445);
            rule__Entity__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:702:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 ) ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:706:1: ( ( ( rule__Entity__FeaturesAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:707:1: ( ( rule__Entity__FeaturesAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:707:1: ( ( rule__Entity__FeaturesAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:708:1: ( rule__Entity__FeaturesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:709:1: ( rule__Entity__FeaturesAssignment_7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:709:2: rule__Entity__FeaturesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1472);
            rule__Entity__FeaturesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:719:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:723:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:724:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81502);
            rule__Entity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__81505);
            rule__Entity__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:731:1: rule__Entity__Group__8__Impl : ( ( rule__Entity__Group_8__0 )* ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:735:1: ( ( ( rule__Entity__Group_8__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:736:1: ( ( rule__Entity__Group_8__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:736:1: ( ( rule__Entity__Group_8__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:737:1: ( rule__Entity__Group_8__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_8()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:738:1: ( rule__Entity__Group_8__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:738:2: rule__Entity__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_8__0_in_rule__Entity__Group__8__Impl1532);
            	    rule__Entity__Group_8__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group__9"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:748:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:752:1: ( rule__Entity__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:753:2: rule__Entity__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__91563);
            rule__Entity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9"


    // $ANTLR start "rule__Entity__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:759:1: rule__Entity__Group__9__Impl : ( '}' ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:763:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:764:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:764:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:765:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__9__Impl1591); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:798:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:802:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:803:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01642);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01645);
            rule__Entity__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:810:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:814:1: ( ( 'extends' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:815:1: ( 'extends' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:815:1: ( 'extends' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:816:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group_2__0__Impl1673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:829:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:833:1: ( rule__Entity__Group_2__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:834:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11704);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:840:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:844:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:845:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:845:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:846:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:847:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:847:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1731);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_8__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:861:1: rule__Entity__Group_8__0 : rule__Entity__Group_8__0__Impl rule__Entity__Group_8__1 ;
    public final void rule__Entity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:865:1: ( rule__Entity__Group_8__0__Impl rule__Entity__Group_8__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:866:2: rule__Entity__Group_8__0__Impl rule__Entity__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_8__0__Impl_in_rule__Entity__Group_8__01765);
            rule__Entity__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_8__1_in_rule__Entity__Group_8__01768);
            rule__Entity__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_8__0"


    // $ANTLR start "rule__Entity__Group_8__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:873:1: rule__Entity__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:877:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:878:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:878:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:879:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_8_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group_8__0__Impl1796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_8__0__Impl"


    // $ANTLR start "rule__Entity__Group_8__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:892:1: rule__Entity__Group_8__1 : rule__Entity__Group_8__1__Impl ;
    public final void rule__Entity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:896:1: ( rule__Entity__Group_8__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:897:2: rule__Entity__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_8__1__Impl_in_rule__Entity__Group_8__11827);
            rule__Entity__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_8__1"


    // $ANTLR start "rule__Entity__Group_8__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:903:1: rule__Entity__Group_8__1__Impl : ( ( rule__Entity__FeaturesAssignment_8_1 ) ) ;
    public final void rule__Entity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:907:1: ( ( ( rule__Entity__FeaturesAssignment_8_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:908:1: ( ( rule__Entity__FeaturesAssignment_8_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:908:1: ( ( rule__Entity__FeaturesAssignment_8_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:909:1: ( rule__Entity__FeaturesAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_8_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:910:1: ( rule__Entity__FeaturesAssignment_8_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:910:2: rule__Entity__FeaturesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__FeaturesAssignment_8_1_in_rule__Entity__Group_8__1__Impl1854);
            rule__Entity__FeaturesAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_8__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:924:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:928:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:929:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01888);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01891);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:936:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:940:1: ( ( 'attribute' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:941:1: ( 'attribute' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:941:1: ( 'attribute' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:942:1: 'attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Attribute__Group__0__Impl1919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:955:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:959:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:960:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11950);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11953);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:967:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:971:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:972:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:972:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:973:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:974:1: ( rule__Attribute__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:974:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1980);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:984:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:988:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:989:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22010);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22013);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:996:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MandatoryAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1000:1: ( ( ( rule__Attribute__MandatoryAssignment_2 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1001:1: ( ( rule__Attribute__MandatoryAssignment_2 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1001:1: ( ( rule__Attribute__MandatoryAssignment_2 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1002:1: ( rule__Attribute__MandatoryAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1003:1: ( rule__Attribute__MandatoryAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1003:2: rule__Attribute__MandatoryAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__MandatoryAssignment_2_in_rule__Attribute__Group__2__Impl2040);
                    rule__Attribute__MandatoryAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1013:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1017:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1018:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32071);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32074);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1025:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1029:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1030:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1030:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1031:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Attribute__Group__3__Impl2102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1044:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1048:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1049:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42133);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42136);
            rule__Attribute__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1056:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1060:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1061:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1061:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1062:1: ( rule__Attribute__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1063:1: ( rule__Attribute__TypeAssignment_4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1063:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2163);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1073:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1077:1: ( rule__Attribute__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1078:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52193);
            rule__Attribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1084:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1088:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1089:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1089:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1090:1: ( rule__Attribute__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1091:1: ( rule__Attribute__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1091:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2220);
                    rule__Attribute__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1113:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1117:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1118:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02263);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02266);
            rule__Attribute__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1125:1: rule__Attribute__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1129:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1130:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1130:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1131:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_5_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Attribute__Group_5__0__Impl2294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1144:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1148:1: ( rule__Attribute__Group_5__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1149:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12325);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1155:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1159:1: ( ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1160:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1160:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1161:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationAssignment_5_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1162:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1162:2: rule__Attribute__EnumerationAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2352);
            rule__Attribute__EnumerationAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1176:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1180:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1181:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02386);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02389);
            rule__Relationship__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1188:1: rule__Relationship__Group__0__Impl : ( 'reference' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1192:1: ( ( 'reference' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1193:1: ( 'reference' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1193:1: ( 'reference' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1194:1: 'reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getReferenceKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Relationship__Group__0__Impl2417); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getReferenceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1207:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1211:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1212:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12448);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12451);
            rule__Relationship__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1219:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__NameAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1223:1: ( ( ( rule__Relationship__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1224:1: ( ( rule__Relationship__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1224:1: ( ( rule__Relationship__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1225:1: ( rule__Relationship__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1226:1: ( rule__Relationship__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1226:2: rule__Relationship__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2478);
            rule__Relationship__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1236:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1240:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1241:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22508);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22511);
            rule__Relationship__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1248:1: rule__Relationship__Group__2__Impl : ( ':' ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1252:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1253:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1253:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1254:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getColonKeyword_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Relationship__Group__2__Impl2539); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1267:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1271:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1272:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32570);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32573);
            rule__Relationship__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1279:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__TargetAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1283:1: ( ( ( rule__Relationship__TargetAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1284:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1284:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1285:1: ( rule__Relationship__TargetAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1286:1: ( rule__Relationship__TargetAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1286:2: rule__Relationship__TargetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2600);
            rule__Relationship__TargetAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1296:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1300:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1301:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__42630);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__42633);
            rule__Relationship__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1308:1: rule__Relationship__Group__4__Impl : ( '[' ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1312:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1313:1: ( '[' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1313:1: ( '[' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1314:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Relationship__Group__4__Impl2661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1327:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1331:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1332:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52692);
            rule__Relationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__52695);
            rule__Relationship__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1339:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__LowerBoundAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1343:1: ( ( ( rule__Relationship__LowerBoundAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1344:1: ( ( rule__Relationship__LowerBoundAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1344:1: ( ( rule__Relationship__LowerBoundAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1345:1: ( rule__Relationship__LowerBoundAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1346:1: ( rule__Relationship__LowerBoundAssignment_5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1346:2: rule__Relationship__LowerBoundAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__LowerBoundAssignment_5_in_rule__Relationship__Group__5__Impl2722);
            rule__Relationship__LowerBoundAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__6"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1356:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1360:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1361:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__62752);
            rule__Relationship__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__62755);
            rule__Relationship__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1368:1: rule__Relationship__Group__6__Impl : ( '..' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1372:1: ( ( '..' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1373:1: ( '..' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1373:1: ( '..' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1374:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Relationship__Group__6__Impl2783); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Relationship__Group__7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1387:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1391:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1392:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__72814);
            rule__Relationship__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__72817);
            rule__Relationship__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7"


    // $ANTLR start "rule__Relationship__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1399:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__UpperBoundAssignment_7 ) ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1403:1: ( ( ( rule__Relationship__UpperBoundAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1404:1: ( ( rule__Relationship__UpperBoundAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1404:1: ( ( rule__Relationship__UpperBoundAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1405:1: ( rule__Relationship__UpperBoundAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1406:1: ( rule__Relationship__UpperBoundAssignment_7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1406:2: rule__Relationship__UpperBoundAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__UpperBoundAssignment_7_in_rule__Relationship__Group__7__Impl2844);
            rule__Relationship__UpperBoundAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7__Impl"


    // $ANTLR start "rule__Relationship__Group__8"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1416:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl rule__Relationship__Group__9 ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1420:1: ( rule__Relationship__Group__8__Impl rule__Relationship__Group__9 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1421:2: rule__Relationship__Group__8__Impl rule__Relationship__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__82874);
            rule__Relationship__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__82877);
            rule__Relationship__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8"


    // $ANTLR start "rule__Relationship__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1428:1: rule__Relationship__Group__8__Impl : ( ']' ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1432:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1433:1: ( ']' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1433:1: ( ']' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1434:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Relationship__Group__8__Impl2905); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8__Impl"


    // $ANTLR start "rule__Relationship__Group__9"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1447:1: rule__Relationship__Group__9 : rule__Relationship__Group__9__Impl ;
    public final void rule__Relationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1451:1: ( rule__Relationship__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1452:2: rule__Relationship__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__92936);
            rule__Relationship__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9"


    // $ANTLR start "rule__Relationship__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1458:1: rule__Relationship__Group__9__Impl : ( ( rule__Relationship__Group_9__0 )? ) ;
    public final void rule__Relationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1462:1: ( ( ( rule__Relationship__Group_9__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1463:1: ( ( rule__Relationship__Group_9__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1463:1: ( ( rule__Relationship__Group_9__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1464:1: ( rule__Relationship__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup_9()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1465:1: ( rule__Relationship__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1465:2: rule__Relationship__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__0_in_rule__Relationship__Group__9__Impl2963);
                    rule__Relationship__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9__Impl"


    // $ANTLR start "rule__Relationship__Group_9__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1495:1: rule__Relationship__Group_9__0 : rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 ;
    public final void rule__Relationship__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1499:1: ( rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1500:2: rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__0__Impl_in_rule__Relationship__Group_9__03014);
            rule__Relationship__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__1_in_rule__Relationship__Group_9__03017);
            rule__Relationship__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__0"


    // $ANTLR start "rule__Relationship__Group_9__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1507:1: rule__Relationship__Group_9__0__Impl : ( 'opposite-of' ) ;
    public final void rule__Relationship__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1511:1: ( ( 'opposite-of' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1512:1: ( 'opposite-of' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1512:1: ( 'opposite-of' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1513:1: 'opposite-of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Relationship__Group_9__0__Impl3045); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__0__Impl"


    // $ANTLR start "rule__Relationship__Group_9__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1526:1: rule__Relationship__Group_9__1 : rule__Relationship__Group_9__1__Impl ;
    public final void rule__Relationship__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1530:1: ( rule__Relationship__Group_9__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1531:2: rule__Relationship__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__1__Impl_in_rule__Relationship__Group_9__13076);
            rule__Relationship__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__1"


    // $ANTLR start "rule__Relationship__Group_9__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1537:1: rule__Relationship__Group_9__1__Impl : ( ( rule__Relationship__OppositeAssignment_9_1 ) ) ;
    public final void rule__Relationship__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1541:1: ( ( ( rule__Relationship__OppositeAssignment_9_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1542:1: ( ( rule__Relationship__OppositeAssignment_9_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1542:1: ( ( rule__Relationship__OppositeAssignment_9_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1543:1: ( rule__Relationship__OppositeAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeAssignment_9_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1544:1: ( rule__Relationship__OppositeAssignment_9_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1544:2: rule__Relationship__OppositeAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__OppositeAssignment_9_1_in_rule__Relationship__Group_9__1__Impl3103);
            rule__Relationship__OppositeAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1558:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1562:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1563:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03137);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03140);
            rule__Enumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1570:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1574:1: ( ( 'enum' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1575:1: ( 'enum' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1575:1: ( 'enum' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1576:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Enumeration__Group__0__Impl3168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1589:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1593:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1594:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13199);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13202);
            rule__Enumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1601:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1605:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1606:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1606:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1607:1: ( rule__Enumeration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1608:1: ( rule__Enumeration__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1608:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3229);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1618:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1622:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1623:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23259);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23262);
            rule__Enumeration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1630:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1634:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1635:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1635:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1636:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Enumeration__Group__2__Impl3290); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1649:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1653:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1654:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33321);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33324);
            rule__Enumeration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1661:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1665:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1666:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1666:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1667:1: ( rule__Enumeration__LiteralsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1668:1: ( rule__Enumeration__LiteralsAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1668:2: rule__Enumeration__LiteralsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3351);
            rule__Enumeration__LiteralsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1678:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1682:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1683:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43381);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43384);
            rule__Enumeration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1690:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1694:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1695:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1695:1: ( ( rule__Enumeration__Group_4__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1696:1: ( rule__Enumeration__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1697:1: ( rule__Enumeration__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1697:2: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl3411);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1707:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1711:1: ( rule__Enumeration__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1712:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53442);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1718:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1722:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1723:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1723:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1724:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Enumeration__Group__5__Impl3470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1749:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1753:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1754:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__03513);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__03516);
            rule__Enumeration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0"


    // $ANTLR start "rule__Enumeration__Group_4__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1761:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1765:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1766:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1766:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1767:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Enumeration__Group_4__0__Impl3544); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1780:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1784:1: ( rule__Enumeration__Group_4__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1785:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__13575);
            rule__Enumeration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1"


    // $ANTLR start "rule__Enumeration__Group_4__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1791:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__LiteralsAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1795:1: ( ( ( rule__Enumeration__LiteralsAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1796:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1796:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1797:1: ( rule__Enumeration__LiteralsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1798:1: ( rule__Enumeration__LiteralsAssignment_4_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1798:2: rule__Enumeration__LiteralsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_4_1_in_rule__Enumeration__Group_4__1__Impl3602);
            rule__Enumeration__LiteralsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1812:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1816:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1817:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__03636);
            rule__Literal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__03639);
            rule__Literal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1824:1: rule__Literal__Group__0__Impl : ( ( rule__Literal__NameAssignment_0 ) ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1828:1: ( ( ( rule__Literal__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1829:1: ( ( rule__Literal__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1829:1: ( ( rule__Literal__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1830:1: ( rule__Literal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1831:1: ( rule__Literal__NameAssignment_0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1831:2: rule__Literal__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl3666);
            rule__Literal__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1841:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1845:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1846:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__13696);
            rule__Literal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__13699);
            rule__Literal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1853:1: rule__Literal__Group__1__Impl : ( '=' ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1857:1: ( ( '=' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1858:1: ( '=' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1858:1: ( '=' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1859:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getEqualsSignKeyword_1()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Literal__Group__1__Impl3727); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Literal__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1872:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1876:1: ( rule__Literal__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1877:2: rule__Literal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__23758);
            rule__Literal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2"


    // $ANTLR start "rule__Literal__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1883:1: rule__Literal__Group__2__Impl : ( ( rule__Literal__ValueAssignment_2 ) ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1887:1: ( ( ( rule__Literal__ValueAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1888:1: ( ( rule__Literal__ValueAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1888:1: ( ( rule__Literal__ValueAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1889:1: ( rule__Literal__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1890:1: ( rule__Literal__ValueAssignment_2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1890:2: rule__Literal__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__ValueAssignment_2_in_rule__Literal__Group__2__Impl3785);
            rule__Literal__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1906:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1910:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1911:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03821);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03824);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1918:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1922:1: ( ( ( '-' )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1923:1: ( ( '-' )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1923:1: ( ( '-' )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1924:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1925:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1926:2: '-'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__EInt__Group__0__Impl3853); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1937:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1941:1: ( rule__EInt__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1942:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13886);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1948:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1952:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1953:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1953:1: ( RULE_INT )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1954:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3913); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1969:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1973:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1974:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03946);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03949);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1981:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1985:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1986:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1986:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1987:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3976); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1998:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2002:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2003:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14005);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2009:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2013:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2014:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2014:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2015:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2016:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2016:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4032);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2030:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2034:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2035:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04067);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04070);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2042:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2046:1: ( ( ( '.' ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2047:1: ( ( '.' ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2047:1: ( ( '.' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2048:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2049:1: ( '.' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2050:2: '.'
            {
            match(input,36,FollowSets000.FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl4099); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2061:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2065:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2066:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14131);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2072:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2076:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2077:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2077:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2078:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EntityModel__EntityModelElementsAssignment"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2094:1: rule__EntityModel__EntityModelElementsAssignment : ( ruleEntityModelElement ) ;
    public final void rule__EntityModel__EntityModelElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2098:1: ( ( ruleEntityModelElement ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2099:1: ( ruleEntityModelElement )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2099:1: ( ruleEntityModelElement )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2100:1: ruleEntityModelElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment4196);
            ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__EntityModelElementsAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2109:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2113:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2114:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2114:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2115:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14227); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2124:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2128:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2129:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2129:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2130:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2131:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2132:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__IdAssignment_5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2143:1: rule__Entity__IdAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2147:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2148:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2148:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2149:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2150:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2151:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__IdAssignment_54301); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IdAssignment_5"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2162:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2166:1: ( ( ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2167:1: ( ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2167:1: ( ruleFeature )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2168:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74336);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_7"


    // $ANTLR start "rule__Entity__FeaturesAssignment_8_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2177:1: rule__Entity__FeaturesAssignment_8_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2181:1: ( ( ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2182:1: ( ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2182:1: ( ruleFeature )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2183:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_8_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_8_14367);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_8_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2192:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2196:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2197:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2197:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2198:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__MandatoryAssignment_2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2207:1: rule__Attribute__MandatoryAssignment_2 : ( ( '*' ) ) ;
    public final void rule__Attribute__MandatoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2211:1: ( ( ( '*' ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2212:1: ( ( '*' ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2212:1: ( ( '*' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2213:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryAsteriskKeyword_2_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2214:1: ( '*' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2215:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryAsteriskKeyword_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Attribute__MandatoryAssignment_24434); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MandatoryAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2230:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2234:1: ( ( ruleAttributeType ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2235:1: ( ruleAttributeType )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2235:1: ( ruleAttributeType )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2236:1: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44473);
            ruleAttributeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__EnumerationAssignment_5_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2245:1: rule__Attribute__EnumerationAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__EnumerationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2249:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2250:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2250:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2251:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2252:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2253:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__EnumerationAssignment_5_14508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationEnumerationIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__EnumerationAssignment_5_1"


    // $ANTLR start "rule__Relationship__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2264:1: rule__Relationship__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2268:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2269:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2269:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2270:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__NameAssignment_1"


    // $ANTLR start "rule__Relationship__TargetAssignment_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2279:1: rule__Relationship__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2283:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2284:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2284:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2285:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2286:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2287:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_34578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TargetAssignment_3"


    // $ANTLR start "rule__Relationship__LowerBoundAssignment_5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2298:1: rule__Relationship__LowerBoundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Relationship__LowerBoundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2302:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2303:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2303:1: ( ruleEInt )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2304:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Relationship__LowerBoundAssignment_54613);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__LowerBoundAssignment_5"


    // $ANTLR start "rule__Relationship__UpperBoundAssignment_7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2313:1: rule__Relationship__UpperBoundAssignment_7 : ( ruleEInt ) ;
    public final void rule__Relationship__UpperBoundAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2317:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2318:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2318:1: ( ruleEInt )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2319:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Relationship__UpperBoundAssignment_74644);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__UpperBoundAssignment_7"


    // $ANTLR start "rule__Relationship__OppositeAssignment_9_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2328:1: rule__Relationship__OppositeAssignment_9_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__OppositeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2332:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2333:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2333:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2334:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2335:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2336:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_9_14679);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__OppositeAssignment_9_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2347:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2351:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2352:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2352:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2353:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2362:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2366:1: ( ( ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2367:1: ( ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2367:1: ( ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2368:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_34745);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_4_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2377:1: rule__Enumeration__LiteralsAssignment_4_1 : ( ruleLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2381:1: ( ( ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2382:1: ( ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2382:1: ( ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2383:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_4_14776);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_4_1"


    // $ANTLR start "rule__Literal__NameAssignment_0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2392:1: rule__Literal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Literal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2396:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2397:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2397:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2398:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_04807); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_0"


    // $ANTLR start "rule__Literal__ValueAssignment_2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2407:1: rule__Literal__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2411:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2412:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2412:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2413:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_24838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__EntityModelElementsAssignment_in_ruleEntityModel100 = new BitSet(new long[]{0x0000000200100002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModelElement135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModelElement__Alternatives_in_ruleEntityModelElement161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0_in_ruleLiteral521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_rule__Feature__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__AttributeType__Alternatives812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AttributeType__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AttributeType__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AttributeType__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AttributeType__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AttributeType__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributeType__Alternatives980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01013 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11075 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21135 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31196 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Entity__Group__3__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41258 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Entity__Group__4__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51320 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__IdAssignment_5_in_rule__Entity__Group__5__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61380 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group__6__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71442 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81502 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__81505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_8__0_in_rule__Entity__Group__8__Impl1532 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__91563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__9__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01642 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group_2__0__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_8__0__Impl_in_rule__Entity__Group_8__01765 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_8__1_in_rule__Entity__Group_8__01768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group_8__0__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_8__1__Impl_in_rule__Entity__Group_8__11827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_8_1_in_rule__Entity__Group_8__1__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01888 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Attribute__Group__0__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11950 = new BitSet(new long[]{0x0000002008000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22010 = new BitSet(new long[]{0x0000002008000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__MandatoryAssignment_2_in_rule__Attribute__Group__2__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32071 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Attribute__Group__3__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42133 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02263 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Attribute__Group_5__0__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02386 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Relationship__Group__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12448 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22508 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Relationship__Group__2__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32570 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__42630 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__42633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Relationship__Group__4__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52692 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__52695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__LowerBoundAssignment_5_in_rule__Relationship__Group__5__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__62752 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__62755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Relationship__Group__6__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__72814 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__72817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__UpperBoundAssignment_7_in_rule__Relationship__Group__7__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__82874 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__82877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Relationship__Group__8__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__92936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__0_in_rule__Relationship__Group__9__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__0__Impl_in_rule__Relationship__Group_9__03014 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__1_in_rule__Relationship__Group_9__03017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Relationship__Group_9__0__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__1__Impl_in_rule__Relationship__Group_9__13076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__OppositeAssignment_9_1_in_rule__Relationship__Group_9__1__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03137 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Enumeration__Group__0__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13199 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23259 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__2__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33321 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43381 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl3411 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Enumeration__Group__5__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__03513 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__03516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Enumeration__Group_4__0__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__13575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_4_1_in_rule__Enumeration__Group_4__1__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__03636 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__03639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__13696 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__13699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Literal__Group__1__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__23758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__ValueAssignment_2_in_rule__Literal__Group__2__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03821 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EInt__Group__0__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03946 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4032 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04067 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment4196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__IdAssignment_54301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_8_14367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Attribute__MandatoryAssignment_24434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__EnumerationAssignment_5_14508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_34578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Relationship__LowerBoundAssignment_54613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Relationship__UpperBoundAssignment_74644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_9_14679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_34745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_4_14776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_04807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_24838 = new BitSet(new long[]{0x0000000000000002L});
    }


}