/*
* generated by Xtext
*/
package at.ac.tuwien.big.forms.entity.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class EntityGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class EntityModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityModel");
		private final Assignment cEntityModelElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEntityModelElementsEntityModelElementParserRuleCall_0 = (RuleCall)cEntityModelElementsAssignment.eContents().get(0);
		
		//// implement your grammar here, starting with the root element: EntityModel
		//EntityModel:
		//	entityModelElements+=EntityModelElement*;
		public ParserRule getRule() { return rule; }

		//entityModelElements+=EntityModelElement*
		public Assignment getEntityModelElementsAssignment() { return cEntityModelElementsAssignment; }

		//EntityModelElement
		public RuleCall getEntityModelElementsEntityModelElementParserRuleCall_0() { return cEntityModelElementsEntityModelElementParserRuleCall_0; }
	}

	public class EntityModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityModelElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEnumerationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EntityModelElement:
		//	Entity | Enumeration;
		public ParserRule getRule() { return rule; }

		//Entity | Enumeration
		public Alternatives getAlternatives() { return cAlternatives; }

		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }

		//Enumeration
		public RuleCall getEnumerationParserRuleCall_1() { return cEnumerationParserRuleCall_1; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cIdKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIdAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cIdAttributeCrossReference_5_0 = (CrossReference)cIdAssignment_5.eContents().get(0);
		private final RuleCall cIdAttributeIDTerminalRuleCall_5_0_1 = (RuleCall)cIdAttributeCrossReference_5_0.eContents().get(1);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cFeaturesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFeaturesFeatureParserRuleCall_7_0 = (RuleCall)cFeaturesAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cFeaturesAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cFeaturesFeatureParserRuleCall_8_1_0 = (RuleCall)cFeaturesAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Entity:
		//	"entity" name=ID ("extends" superType=[Entity])? "{" "id" id=[Attribute] "," features+=Feature (","
		//	features+=Feature)* "}";
		public ParserRule getRule() { return rule; }

		//"entity" name=ID ("extends" superType=[Entity])? "{" "id" id=[Attribute] "," features+=Feature ("," features+=Feature)*
		//"}"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }

		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }

		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"id"
		public Keyword getIdKeyword_4() { return cIdKeyword_4; }

		//id=[Attribute]
		public Assignment getIdAssignment_5() { return cIdAssignment_5; }

		//[Attribute]
		public CrossReference getIdAttributeCrossReference_5_0() { return cIdAttributeCrossReference_5_0; }

		//ID
		public RuleCall getIdAttributeIDTerminalRuleCall_5_0_1() { return cIdAttributeIDTerminalRuleCall_5_0_1; }

		//","
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }

		//features+=Feature
		public Assignment getFeaturesAssignment_7() { return cFeaturesAssignment_7; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_7_0() { return cFeaturesFeatureParserRuleCall_7_0; }

		//("," features+=Feature)*
		public Group getGroup_8() { return cGroup_8; }

		//","
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }

		//features+=Feature
		public Assignment getFeaturesAssignment_8_1() { return cFeaturesAssignment_8_1; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_8_1_0() { return cFeaturesFeatureParserRuleCall_8_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRelationshipParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	Attribute | Relationship;
		public ParserRule getRule() { return rule; }

		//Attribute | Relationship
		public Alternatives getAlternatives() { return cAlternatives; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_0() { return cAttributeParserRuleCall_0; }

		//Relationship
		public RuleCall getRelationshipParserRuleCall_1() { return cRelationshipParserRuleCall_1; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cMandatoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cMandatoryAsteriskKeyword_2_0 = (Keyword)cMandatoryAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeAttributeTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEnumerationAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cEnumerationEnumerationCrossReference_5_1_0 = (CrossReference)cEnumerationAssignment_5_1.eContents().get(0);
		private final RuleCall cEnumerationEnumerationIDTerminalRuleCall_5_1_0_1 = (RuleCall)cEnumerationEnumerationCrossReference_5_1_0.eContents().get(1);
		
		//Attribute:
		//	"attribute" name=ID mandatory?="*"? ":" type=AttributeType (":" enumeration=[Enumeration])?;
		public ParserRule getRule() { return rule; }

		//"attribute" name=ID mandatory?="*"? ":" type=AttributeType (":" enumeration=[Enumeration])?
		public Group getGroup() { return cGroup; }

		//"attribute"
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//mandatory?="*"?
		public Assignment getMandatoryAssignment_2() { return cMandatoryAssignment_2; }

		//"*"
		public Keyword getMandatoryAsteriskKeyword_2_0() { return cMandatoryAsteriskKeyword_2_0; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//type=AttributeType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }

		//AttributeType
		public RuleCall getTypeAttributeTypeEnumRuleCall_4_0() { return cTypeAttributeTypeEnumRuleCall_4_0; }

		//(":" enumeration=[Enumeration])?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//enumeration=[Enumeration]
		public Assignment getEnumerationAssignment_5_1() { return cEnumerationAssignment_5_1; }

		//[Enumeration]
		public CrossReference getEnumerationEnumerationCrossReference_5_1_0() { return cEnumerationEnumerationCrossReference_5_1_0; }

		//ID
		public RuleCall getEnumerationEnumerationIDTerminalRuleCall_5_1_0_1() { return cEnumerationEnumerationIDTerminalRuleCall_5_1_0_1; }
	}

	public class RelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Relationship");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReferenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTargetEntityCrossReference_3_0 = (CrossReference)cTargetAssignment_3.eContents().get(0);
		private final RuleCall cTargetEntityIDTerminalRuleCall_3_0_1 = (RuleCall)cTargetEntityCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLowerBoundAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLowerBoundEIntParserRuleCall_5_0 = (RuleCall)cLowerBoundAssignment_5.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cUpperBoundAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cUpperBoundEIntParserRuleCall_7_0 = (RuleCall)cUpperBoundAssignment_7.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cOppositeOfKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cOppositeAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cOppositeRelationshipCrossReference_9_1_0 = (CrossReference)cOppositeAssignment_9_1.eContents().get(0);
		private final RuleCall cOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1 = (RuleCall)cOppositeRelationshipCrossReference_9_1_0.eContents().get(1);
		
		//Relationship:
		//	"reference" name=ID ":" target=[Entity] "[" lowerBound=EInt ".." upperBound=EInt "]" ("opposite-of"
		//	opposite=[Relationship|QualifiedName])?;
		public ParserRule getRule() { return rule; }

		//"reference" name=ID ":" target=[Entity] "[" lowerBound=EInt ".." upperBound=EInt "]" ("opposite-of"
		//opposite=[Relationship|QualifiedName])?
		public Group getGroup() { return cGroup; }

		//"reference"
		public Keyword getReferenceKeyword_0() { return cReferenceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//target=[Entity]
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }

		//[Entity]
		public CrossReference getTargetEntityCrossReference_3_0() { return cTargetEntityCrossReference_3_0; }

		//ID
		public RuleCall getTargetEntityIDTerminalRuleCall_3_0_1() { return cTargetEntityIDTerminalRuleCall_3_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }

		//lowerBound=EInt
		public Assignment getLowerBoundAssignment_5() { return cLowerBoundAssignment_5; }

		//EInt
		public RuleCall getLowerBoundEIntParserRuleCall_5_0() { return cLowerBoundEIntParserRuleCall_5_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_6() { return cFullStopFullStopKeyword_6; }

		//upperBound=EInt
		public Assignment getUpperBoundAssignment_7() { return cUpperBoundAssignment_7; }

		//EInt
		public RuleCall getUpperBoundEIntParserRuleCall_7_0() { return cUpperBoundEIntParserRuleCall_7_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }

		//("opposite-of" opposite=[Relationship|QualifiedName])?
		public Group getGroup_9() { return cGroup_9; }

		//"opposite-of"
		public Keyword getOppositeOfKeyword_9_0() { return cOppositeOfKeyword_9_0; }

		//opposite=[Relationship|QualifiedName]
		public Assignment getOppositeAssignment_9_1() { return cOppositeAssignment_9_1; }

		//[Relationship|QualifiedName]
		public CrossReference getOppositeRelationshipCrossReference_9_1_0() { return cOppositeRelationshipCrossReference_9_1_0; }

		//QualifiedName
		public RuleCall getOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1() { return cOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1; }
	}

	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLiteralsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLiteralsLiteralParserRuleCall_3_0 = (RuleCall)cLiteralsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLiteralsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLiteralsLiteralParserRuleCall_4_1_0 = (RuleCall)cLiteralsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Enumeration:
		//	"enum" name=ID "{" literals+=Literal ("," literals+=Literal)* "}";
		public ParserRule getRule() { return rule; }

		//"enum" name=ID "{" literals+=Literal ("," literals+=Literal)* "}"
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//literals+=Literal
		public Assignment getLiteralsAssignment_3() { return cLiteralsAssignment_3; }

		//Literal
		public RuleCall getLiteralsLiteralParserRuleCall_3_0() { return cLiteralsLiteralParserRuleCall_3_0; }

		//("," literals+=Literal)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//literals+=Literal
		public Assignment getLiteralsAssignment_4_1() { return cLiteralsAssignment_4_1; }

		//Literal
		public RuleCall getLiteralsLiteralParserRuleCall_4_1_0() { return cLiteralsLiteralParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Literal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Literal:
		//	name=ID "=" value=STRING;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//	"-"? INT;
		public ParserRule getRule() { return rule; }

		//"-"? INT
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName returns ecore::EString:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//(=> "." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//=> "."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	public class AttributeTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntegerIntegerKeyword_1_0 = (Keyword)cIntegerEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTextEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTextTextKeyword_2_0 = (Keyword)cTextEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBooleanBooleanKeyword_3_0 = (Keyword)cBooleanEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cYearEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cYearYearKeyword_4_0 = (Keyword)cYearEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cDateEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cDateDateKeyword_5_0 = (Keyword)cDateEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cTimeEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cTimeTimeKeyword_6_0 = (Keyword)cTimeEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cEmailEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cEmailEmailKeyword_7_0 = (Keyword)cEmailEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cNoneEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cNoneNoneKeyword_8_0 = (Keyword)cNoneEnumLiteralDeclaration_8.eContents().get(0);
		
		//enum AttributeType:
		//	String | Integer | Text | Boolean | Year | Date | Time | Email | None;
		public EnumRule getRule() { return rule; }

		//String | Integer | Text | Boolean | Year | Date | Time | Email | None
		public Alternatives getAlternatives() { return cAlternatives; }

		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }

		//"String"
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }

		//Integer
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_1() { return cIntegerEnumLiteralDeclaration_1; }

		//"Integer"
		public Keyword getIntegerIntegerKeyword_1_0() { return cIntegerIntegerKeyword_1_0; }

		//Text
		public EnumLiteralDeclaration getTextEnumLiteralDeclaration_2() { return cTextEnumLiteralDeclaration_2; }

		//"Text"
		public Keyword getTextTextKeyword_2_0() { return cTextTextKeyword_2_0; }

		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_3() { return cBooleanEnumLiteralDeclaration_3; }

		//"Boolean"
		public Keyword getBooleanBooleanKeyword_3_0() { return cBooleanBooleanKeyword_3_0; }

		//Year
		public EnumLiteralDeclaration getYearEnumLiteralDeclaration_4() { return cYearEnumLiteralDeclaration_4; }

		//"Year"
		public Keyword getYearYearKeyword_4_0() { return cYearYearKeyword_4_0; }

		//Date
		public EnumLiteralDeclaration getDateEnumLiteralDeclaration_5() { return cDateEnumLiteralDeclaration_5; }

		//"Date"
		public Keyword getDateDateKeyword_5_0() { return cDateDateKeyword_5_0; }

		//Time
		public EnumLiteralDeclaration getTimeEnumLiteralDeclaration_6() { return cTimeEnumLiteralDeclaration_6; }

		//"Time"
		public Keyword getTimeTimeKeyword_6_0() { return cTimeTimeKeyword_6_0; }

		//Email
		public EnumLiteralDeclaration getEmailEnumLiteralDeclaration_7() { return cEmailEnumLiteralDeclaration_7; }

		//"Email"
		public Keyword getEmailEmailKeyword_7_0() { return cEmailEmailKeyword_7_0; }

		//None
		public EnumLiteralDeclaration getNoneEnumLiteralDeclaration_8() { return cNoneEnumLiteralDeclaration_8; }

		//"None"
		public Keyword getNoneNoneKeyword_8_0() { return cNoneNoneKeyword_8_0; }
	}
	
	private final EntityModelElements pEntityModel;
	private final EntityModelElementElements pEntityModelElement;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final AttributeElements pAttribute;
	private final AttributeTypeElements unknownRuleAttributeType;
	private final RelationshipElements pRelationship;
	private final EnumerationElements pEnumeration;
	private final LiteralElements pLiteral;
	private final EIntElements pEInt;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntityModel = new EntityModelElements();
		this.pEntityModelElement = new EntityModelElementElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.pAttribute = new AttributeElements();
		this.unknownRuleAttributeType = new AttributeTypeElements();
		this.pRelationship = new RelationshipElements();
		this.pEnumeration = new EnumerationElements();
		this.pLiteral = new LiteralElements();
		this.pEInt = new EIntElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.tuwien.big.forms.entity.Entity".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// implement your grammar here, starting with the root element: EntityModel
	//EntityModel:
	//	entityModelElements+=EntityModelElement*;
	public EntityModelElements getEntityModelAccess() {
		return pEntityModel;
	}
	
	public ParserRule getEntityModelRule() {
		return getEntityModelAccess().getRule();
	}

	//EntityModelElement:
	//	Entity | Enumeration;
	public EntityModelElementElements getEntityModelElementAccess() {
		return pEntityModelElement;
	}
	
	public ParserRule getEntityModelElementRule() {
		return getEntityModelElementAccess().getRule();
	}

	//Entity:
	//	"entity" name=ID ("extends" superType=[Entity])? "{" "id" id=[Attribute] "," features+=Feature (","
	//	features+=Feature)* "}";
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Feature:
	//	Attribute | Relationship;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Attribute:
	//	"attribute" name=ID mandatory?="*"? ":" type=AttributeType (":" enumeration=[Enumeration])?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//enum AttributeType:
	//	String | Integer | Text | Boolean | Year | Date | Time | Email | None;
	public AttributeTypeElements getAttributeTypeAccess() {
		return unknownRuleAttributeType;
	}
	
	public EnumRule getAttributeTypeRule() {
		return getAttributeTypeAccess().getRule();
	}

	//Relationship:
	//	"reference" name=ID ":" target=[Entity] "[" lowerBound=EInt ".." upperBound=EInt "]" ("opposite-of"
	//	opposite=[Relationship|QualifiedName])?;
	public RelationshipElements getRelationshipAccess() {
		return pRelationship;
	}
	
	public ParserRule getRelationshipRule() {
		return getRelationshipAccess().getRule();
	}

	//Enumeration:
	//	"enum" name=ID "{" literals+=Literal ("," literals+=Literal)* "}";
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}

	//Literal:
	//	name=ID "=" value=STRING;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	"-"? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//QualifiedName returns ecore::EString:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
