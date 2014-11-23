/*
* generated by Xtext
*/
package at.ac.tuwien.big.forms.form.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;

public class FormParser extends AbstractContentAssistParser {
	
	@Inject
	private FormGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal.InternalFormParser createParser() {
		at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal.InternalFormParser result = new at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal.InternalFormParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPageElementAccess().getAlternatives_0(), "rule__PageElement__Alternatives_0");
					put(grammarAccess.getRelationshipPageElementAccess().getAlternatives_0(), "rule__RelationshipPageElement__Alternatives_0");
					put(grammarAccess.getAttributePageElementAccess().getAlternatives_0(), "rule__AttributePageElement__Alternatives_0");
					put(grammarAccess.getConditionAccess().getAlternatives_1(), "rule__Condition__Alternatives_1");
					put(grammarAccess.getConditionTypeAccess().getAlternatives(), "rule__ConditionType__Alternatives");
					put(grammarAccess.getCompositeConditionTypeAccess().getAlternatives(), "rule__CompositeConditionType__Alternatives");
					put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_3(), "rule__Page__Group_3__0");
					put(grammarAccess.getPageAccess().getGroup_3_1(), "rule__Page__Group_3_1__0");
					put(grammarAccess.getPageElementAccess().getGroup(), "rule__PageElement__Group__0");
					put(grammarAccess.getRelationshipPageElementAccess().getGroup(), "rule__RelationshipPageElement__Group__0");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getTableAccess().getGroup_6(), "rule__Table__Group_6__0");
					put(grammarAccess.getTableAccess().getGroup_6_1(), "rule__Table__Group_6_1__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getAttributePageElementAccess().getGroup(), "rule__AttributePageElement__Group__0");
					put(grammarAccess.getTextFieldAccess().getGroup(), "rule__TextField__Group__0");
					put(grammarAccess.getTextFieldAccess().getGroup_3(), "rule__TextField__Group_3__0");
					put(grammarAccess.getTextAreaAccess().getGroup(), "rule__TextArea__Group__0");
					put(grammarAccess.getSelectionFieldAccess().getGroup(), "rule__SelectionField__Group__0");
					put(grammarAccess.getDateSelectionFieldAccess().getGroup(), "rule__DateSelectionField__Group__0");
					put(grammarAccess.getTimeSelectionFieldAccess().getGroup(), "rule__TimeSelectionField__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getAttributeValueConditionAccess().getGroup(), "rule__AttributeValueCondition__Group__0");
					put(grammarAccess.getCompositeConditionAccess().getGroup(), "rule__CompositeCondition__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getFormModelAccess().getFormsAssignment(), "rule__FormModel__FormsAssignment");
					put(grammarAccess.getFormAccess().getWelcomeFormAssignment_0(), "rule__Form__WelcomeFormAssignment_0");
					put(grammarAccess.getFormAccess().getNameAssignment_2(), "rule__Form__NameAssignment_2");
					put(grammarAccess.getFormAccess().getTitleAssignment_3(), "rule__Form__TitleAssignment_3");
					put(grammarAccess.getFormAccess().getEntityAssignment_5(), "rule__Form__EntityAssignment_5");
					put(grammarAccess.getFormAccess().getPagesAssignment_7(), "rule__Form__PagesAssignment_7");
					put(grammarAccess.getPageAccess().getTitleAssignment_1(), "rule__Page__TitleAssignment_1");
					put(grammarAccess.getPageAccess().getPageElementsAssignment_3_0(), "rule__Page__PageElementsAssignment_3_0");
					put(grammarAccess.getPageAccess().getPageElementsAssignment_3_1_1(), "rule__Page__PageElementsAssignment_3_1_1");
					put(grammarAccess.getPageAccess().getConditionAssignment_5(), "rule__Page__ConditionAssignment_5");
					put(grammarAccess.getPageElementAccess().getConditionAssignment_1(), "rule__PageElement__ConditionAssignment_1");
					put(grammarAccess.getRelationshipPageElementAccess().getEditingFormAssignment_2(), "rule__RelationshipPageElement__EditingFormAssignment_2");
					put(grammarAccess.getTableAccess().getElementIDAssignment_1(), "rule__Table__ElementIDAssignment_1");
					put(grammarAccess.getTableAccess().getLabelAssignment_2(), "rule__Table__LabelAssignment_2");
					put(grammarAccess.getTableAccess().getRelationshipAssignment_4(), "rule__Table__RelationshipAssignment_4");
					put(grammarAccess.getTableAccess().getColumnsAssignment_6_0(), "rule__Table__ColumnsAssignment_6_0");
					put(grammarAccess.getTableAccess().getColumnsAssignment_6_1_1(), "rule__Table__ColumnsAssignment_6_1_1");
					put(grammarAccess.getColumnAccess().getElementIDAssignment_1(), "rule__Column__ElementIDAssignment_1");
					put(grammarAccess.getColumnAccess().getLabelAssignment_2(), "rule__Column__LabelAssignment_2");
					put(grammarAccess.getColumnAccess().getAttributeAssignment_4(), "rule__Column__AttributeAssignment_4");
					put(grammarAccess.getListAccess().getElementIDAssignment_1(), "rule__List__ElementIDAssignment_1");
					put(grammarAccess.getListAccess().getLabelAssignment_2(), "rule__List__LabelAssignment_2");
					put(grammarAccess.getListAccess().getRelationshipAssignment_4(), "rule__List__RelationshipAssignment_4");
					put(grammarAccess.getAttributePageElementAccess().getAttributeAssignment_2(), "rule__AttributePageElement__AttributeAssignment_2");
					put(grammarAccess.getTextFieldAccess().getElementIDAssignment_1(), "rule__TextField__ElementIDAssignment_1");
					put(grammarAccess.getTextFieldAccess().getLabelAssignment_2(), "rule__TextField__LabelAssignment_2");
					put(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1(), "rule__TextField__FormatAssignment_3_1");
					put(grammarAccess.getTextAreaAccess().getElementIDAssignment_1(), "rule__TextArea__ElementIDAssignment_1");
					put(grammarAccess.getTextAreaAccess().getLabelAssignment_2(), "rule__TextArea__LabelAssignment_2");
					put(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1(), "rule__SelectionField__ElementIDAssignment_1");
					put(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2(), "rule__SelectionField__LabelAssignment_2");
					put(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1(), "rule__DateSelectionField__ElementIDAssignment_1");
					put(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2(), "rule__DateSelectionField__LabelAssignment_2");
					put(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1(), "rule__TimeSelectionField__ElementIDAssignment_1");
					put(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2(), "rule__TimeSelectionField__LabelAssignment_2");
					put(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1(), "rule__AttributeValueCondition__ConditionIDAssignment_1");
					put(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3(), "rule__AttributeValueCondition__AttributeAssignment_3");
					put(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5(), "rule__AttributeValueCondition__ValueAssignment_5");
					put(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7(), "rule__AttributeValueCondition__TypeAssignment_7");
					put(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1(), "rule__CompositeCondition__ConditionIDAssignment_1");
					put(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4(), "rule__CompositeCondition__ComposedConditionsAssignment_4");
					put(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5(), "rule__CompositeCondition__CompositionTypeAssignment_5");
					put(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6(), "rule__CompositeCondition__ComposedConditionsAssignment_6");
					put(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9(), "rule__CompositeCondition__TypeAssignment_9");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal.InternalFormParser typedParser = (at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal.InternalFormParser) parser;
			typedParser.entryRuleFormModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FormGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FormGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
