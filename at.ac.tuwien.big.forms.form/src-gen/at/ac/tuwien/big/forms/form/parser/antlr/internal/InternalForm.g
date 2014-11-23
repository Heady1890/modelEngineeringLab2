/*
* generated by Xtext
*/
grammar InternalForm;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.tuwien.big.forms.form.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleFormModel
entryRuleFormModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormModelRule()); }
	 iv_ruleFormModel=ruleFormModel 
	 { $current=$iv_ruleFormModel.current; } 
	 EOF 
;

// Rule FormModel
ruleFormModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_0()); 
	    }
		lv_forms_0_0=ruleForm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormModelRule());
	        }
       		add(
       			$current, 
       			"forms",
        		lv_forms_0_0, 
        		"Form");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleForm
entryRuleForm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormRule()); }
	 iv_ruleForm=ruleForm 
	 { $current=$iv_ruleForm.current; } 
	 EOF 
;

// Rule Form
ruleForm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_welcomeForm_0_0=	'welcome' 
    {
        newLeafNode(lv_welcomeForm_0_0, grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormRule());
	        }
       		setWithLastConsumed($current, "welcomeForm", true, "welcome");
	    }

)
)?	otherlv_1='form' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFormAccess().getFormKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		lv_title_3_0=RULE_STRING
		{
			newLeafNode(lv_title_3_0, grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_3_0, 
        		"STRING");
	    }

)
)	otherlv_4='handles' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getHandlesKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getFormAccess().getEntityEntityCrossReference_5_0()); 
	}

)
)	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFormAccess().getPagesPageParserRuleCall_7_0()); 
	    }
		lv_pages_7_0=rulePage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_7_0, 
        		"Page");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='page' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
    }
(
(
		lv_title_1_0=RULE_STRING
		{
			newLeafNode(lv_title_1_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
	    }
		lv_pageElements_3_0=rulePageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"pageElements",
        		lv_pageElements_3_0, 
        		"PageElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_1_1_0()); 
	    }
		lv_pageElements_5_0=rulePageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"pageElements",
        		lv_pageElements_5_0, 
        		"PageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_5_0()); 
	    }
		lv_condition_7_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_7_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRulePageElement
entryRulePageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageElementRule()); }
	 iv_rulePageElement=rulePageElement 
	 { $current=$iv_rulePageElement.current; } 
	 EOF 
;

// Rule PageElement
rulePageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_0_0()); 
    }
    this_RelationshipPageElement_0=ruleRelationshipPageElement
    { 
        $current = $this_RelationshipPageElement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0_1()); 
    }
    this_AttributePageElement_1=ruleAttributePageElement
    { 
        $current = $this_AttributePageElement_1.current; 
        afterParserOrEnumRuleCall();
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPageElementAccess().getConditionConditionParserRuleCall_1_0()); 
	    }
		lv_condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageElementRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleRelationshipPageElement
entryRuleRelationshipPageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationshipPageElementRule()); }
	 iv_ruleRelationshipPageElement=ruleRelationshipPageElement 
	 { $current=$iv_ruleRelationshipPageElement.current; } 
	 EOF 
;

// Rule RelationshipPageElement
ruleRelationshipPageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0_0()); 
    }
    this_List_0=ruleList
    { 
        $current = $this_List_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_0_1()); 
    }
    this_Table_1=ruleTable
    { 
        $current = $this_Table_1.current; 
        afterParserOrEnumRuleCall();
    }
)	otherlv_2='edits' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRelationshipPageElementAccess().getEditsKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationshipPageElementRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getRelationshipPageElementAccess().getEditingFormFormCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='table' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='handles' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getHandlesKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
	}

)
)	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
	    }
		lv_columns_6_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_6_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0()); 
	    }
		lv_columns_8_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_8_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	 iv_ruleColumn=ruleColumn 
	 { $current=$iv_ruleColumn.current; } 
	 EOF 
;

// Rule Column
ruleColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='column' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='handles' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getHandlesKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRuleList
entryRuleList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListRule()); }
	 iv_ruleList=ruleList 
	 { $current=$iv_ruleList.current; } 
	 EOF 
;

// Rule List
ruleList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='list' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='handles' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getListAccess().getHandlesKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getListRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRuleAttributePageElement
entryRuleAttributePageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributePageElementRule()); }
	 iv_ruleAttributePageElement=ruleAttributePageElement 
	 { $current=$iv_ruleAttributePageElement.current; } 
	 EOF 
;

// Rule AttributePageElement
ruleAttributePageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0_0()); 
    }
    this_TextField_0=ruleTextField
    { 
        $current = $this_TextField_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_0_1()); 
    }
    this_TextArea_1=ruleTextArea
    { 
        $current = $this_TextArea_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_0_2()); 
    }
    this_SelectionField_2=ruleSelectionField
    { 
        $current = $this_SelectionField_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_0_3()); 
    }
    this_DateSelectionField_3=ruleDateSelectionField
    { 
        $current = $this_DateSelectionField_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_0_4()); 
    }
    this_TimeSelectionField_4=ruleTimeSelectionField
    { 
        $current = $this_TimeSelectionField_4.current; 
        afterParserOrEnumRuleCall();
    }
)	otherlv_5='handles' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAttributePageElementAccess().getHandlesKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributePageElementRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getAttributePageElementAccess().getAttributeAttributeCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleTextField
entryRuleTextField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextFieldRule()); }
	 iv_ruleTextField=ruleTextField 
	 { $current=$iv_ruleTextField.current; } 
	 EOF 
;

// Rule TextField
ruleTextField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='text-field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='format' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getFormatKeyword_3_0());
    }
(
(
		lv_format_4_0=RULE_STRING
		{
			newLeafNode(lv_format_4_0, grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"format",
        		lv_format_4_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleTextArea
entryRuleTextArea returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextAreaRule()); }
	 iv_ruleTextArea=ruleTextArea 
	 { $current=$iv_ruleTextArea.current; } 
	 EOF 
;

// Rule TextArea
ruleTextArea returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='text-area' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextAreaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextAreaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleSelectionField
entryRuleSelectionField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelectionFieldRule()); }
	 iv_ruleSelectionField=ruleSelectionField 
	 { $current=$iv_ruleSelectionField.current; } 
	 EOF 
;

// Rule SelectionField
ruleSelectionField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='selection-field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleDateSelectionField
entryRuleDateSelectionField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateSelectionFieldRule()); }
	 iv_ruleDateSelectionField=ruleDateSelectionField 
	 { $current=$iv_ruleDateSelectionField.current; } 
	 EOF 
;

// Rule DateSelectionField
ruleDateSelectionField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='date-selection-field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleTimeSelectionField
entryRuleTimeSelectionField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeSelectionFieldRule()); }
	 iv_ruleTimeSelectionField=ruleTimeSelectionField 
	 { $current=$iv_ruleTimeSelectionField.current; } 
	 EOF 
;

// Rule TimeSelectionField
ruleTimeSelectionField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='time-selection-field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0());
    }
(
(
		lv_elementID_1_0=RULE_ID
		{
			newLeafNode(lv_elementID_1_0, grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"elementID",
        		lv_elementID_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='with' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWithKeyword_0());
    }
(
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_1_0()); 
    }
    this_AttributeValueCondition_1=ruleAttributeValueCondition
    { 
        $current = $this_AttributeValueCondition_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
    }
    this_CompositeCondition_2=ruleCompositeCondition
    { 
        $current = $this_CompositeCondition_2.current; 
        afterParserOrEnumRuleCall();
    }
))
;





// Entry rule entryRuleAttributeValueCondition
entryRuleAttributeValueCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeValueConditionRule()); }
	 iv_ruleAttributeValueCondition=ruleAttributeValueCondition 
	 { $current=$iv_ruleAttributeValueCondition.current; } 
	 EOF 
;

// Rule AttributeValueCondition
ruleAttributeValueCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='attribute-condition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0());
    }
(
(
		lv_conditionID_1_0=RULE_ID
		{
			newLeafNode(lv_conditionID_1_0, grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeValueConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"conditionID",
        		lv_conditionID_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeValueConditionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
	}

)
)	otherlv_4='==' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4());
    }
(
(
		lv_value_5_0=RULE_STRING
		{
			newLeafNode(lv_value_5_0, grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeValueConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_5_0, 
        		"STRING");
	    }

)
)	otherlv_6='?' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
	    }
		lv_type_7_0=ruleConditionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeValueConditionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_7_0, 
        		"ConditionType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCompositeCondition
entryRuleCompositeCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCompositeConditionRule()); }
	 iv_ruleCompositeCondition=ruleCompositeCondition 
	 { $current=$iv_ruleCompositeCondition.current; } 
	 EOF 
;

// Rule CompositeCondition
ruleCompositeCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='composite-condition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
    }
(
(
		lv_conditionID_1_0=RULE_ID
		{
			newLeafNode(lv_conditionID_1_0, grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCompositeConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"conditionID",
        		lv_conditionID_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
    }
	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
	    }
		lv_composedConditions_4_0=ruleAttributeValueCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
	        }
       		add(
       			$current, 
       			"composedConditions",
        		lv_composedConditions_4_0, 
        		"AttributeValueCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
	    }
		lv_compositionType_5_0=ruleCompositeConditionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
	        }
       		set(
       			$current, 
       			"compositionType",
        		lv_compositionType_5_0, 
        		"CompositeConditionType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
	    }
		lv_composedConditions_6_0=ruleAttributeValueCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
	        }
       		add(
       			$current, 
       			"composedConditions",
        		lv_composedConditions_6_0, 
        		"AttributeValueCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7());
    }
	otherlv_8='?' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
	    }
		lv_type_9_0=ruleConditionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_9_0, 
        		"ConditionType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;









// Rule ConditionType
ruleConditionType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Show' 
	{
        $current = grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Hide' 
	{
        $current = grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Disable' 
	{
        $current = grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Enable' 
	{
        $current = grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='None' 
	{
        $current = grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
    }
));



// Rule CompositeConditionType
ruleCompositeConditionType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='or' 
	{
        $current = grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='and' 
	{
        $current = grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


