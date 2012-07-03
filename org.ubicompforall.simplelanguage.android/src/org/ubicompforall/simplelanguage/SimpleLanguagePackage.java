/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ubicompforall.simplelanguage.SimpleLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplelanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ubicompforall.org/simplelanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplelanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleLanguagePackage eINSTANCE = org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.BuildingBlockImpl <em>Building Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.BuildingBlockImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getBuildingBlock()
	 * @generated
	 */
	int BUILDING_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__PROPERTY_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.StepImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 0;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTOR = BUILDING_BLOCK__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PROPERTY_VALUES = BUILDING_BLOCK__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = BUILDING_BLOCK__NAME;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.TriggerImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DESCRIPTOR = BUILDING_BLOCK__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PROPERTY_VALUES = BUILDING_BLOCK__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = BUILDING_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITIONS = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.ConditionalStepImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 2;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__DESCRIPTOR = STEP__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__PROPERTY_VALUES = STEP__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Step Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__STEP_SEQUENCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__CONDITIONS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.TaskImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Info Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INFO_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Step Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STEP_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIVE = 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.InformationObjectImpl <em>Information Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.InformationObjectImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getInformationObject()
	 * @generated
	 */
	int INFORMATION_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__DESCRIPTOR = BUILDING_BLOCK__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__PROPERTY_VALUES = BUILDING_BLOCK__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__NAME = BUILDING_BLOCK__NAME;

	/**
	 * The number of structural features of the '<em>Information Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.QueryImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 4;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTOR = INFORMATION_OBJECT__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PROPERTY_VALUES = INFORMATION_OBJECT__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = INFORMATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RESULT = INFORMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.PropertyAssignmentImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getPropertyAssignment()
	 * @generated
	 */
	int PROPERTY_ASSIGNMENT = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__PROPERTY = PROPERTY_ASSIGNMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__VALUE = PROPERTY_ASSIGNMENT__VALUE;

	/**
	 * The feature id for the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__FROM_OBJECT = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__FROM_PROPERTY = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.ConditionImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTOR = BUILDING_BLOCK__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PROPERTY_VALUES = BUILDING_BLOCK__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = BUILDING_BLOCK__NAME;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.DomainObjectReferenceImpl <em>Domain Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.DomainObjectReferenceImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getDomainObjectReference()
	 * @generated
	 */
	int DOMAIN_OBJECT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REFERENCE__DESCRIPTOR = INFORMATION_OBJECT__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REFERENCE__PROPERTY_VALUES = INFORMATION_OBJECT__PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REFERENCE__NAME = INFORMATION_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Domain Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REFERENCE_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.simplelanguage.impl.UserServiceImpl <em>User Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.simplelanguage.impl.UserServiceImpl
	 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getUserService()
	 * @generated
	 */
	int USER_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SERVICE__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SERVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SERVICE__LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>User Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SERVICE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.ubicompforall.simplelanguage.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.ubicompforall.simplelanguage.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.Trigger#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.ubicompforall.simplelanguage.Trigger#getConditions()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Conditions();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step</em>'.
	 * @see org.ubicompforall.simplelanguage.ConditionalStep
	 * @generated
	 */
	EClass getConditionalStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.ConditionalStep#getStepSequence <em>Step Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Sequence</em>'.
	 * @see org.ubicompforall.simplelanguage.ConditionalStep#getStepSequence()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_StepSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.ConditionalStep#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.ubicompforall.simplelanguage.ConditionalStep#getConditions()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Conditions();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.ubicompforall.simplelanguage.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.Task#getInfoObjects <em>Info Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info Objects</em>'.
	 * @see org.ubicompforall.simplelanguage.Task#getInfoObjects()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InfoObjects();

	/**
	 * Returns the meta object for the containment reference '{@link org.ubicompforall.simplelanguage.Task#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see org.ubicompforall.simplelanguage.Task#getTrigger()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.Task#getStepSequence <em>Step Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Sequence</em>'.
	 * @see org.ubicompforall.simplelanguage.Task#getStepSequence()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StepSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ubicompforall.simplelanguage.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.Task#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.ubicompforall.simplelanguage.Task#isActive()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Active();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.ubicompforall.simplelanguage.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.Query#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.ubicompforall.simplelanguage.Query#getResult()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Result();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for the reference '{@link org.ubicompforall.simplelanguage.PropertyReference#getFromObject <em>From Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Object</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyReference#getFromObject()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EReference getPropertyReference_FromObject();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.PropertyReference#getFromProperty <em>From Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Property</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyReference#getFromProperty()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EAttribute getPropertyReference_FromProperty();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.InformationObject <em>Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Object</em>'.
	 * @see org.ubicompforall.simplelanguage.InformationObject
	 * @generated
	 */
	EClass getInformationObject();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.ubicompforall.simplelanguage.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.BuildingBlock <em>Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Block</em>'.
	 * @see org.ubicompforall.simplelanguage.BuildingBlock
	 * @generated
	 */
	EClass getBuildingBlock();

	/**
	 * Returns the meta object for the reference '{@link org.ubicompforall.simplelanguage.BuildingBlock#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see org.ubicompforall.simplelanguage.BuildingBlock#getDescriptor()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EReference getBuildingBlock_Descriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.BuildingBlock#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see org.ubicompforall.simplelanguage.BuildingBlock#getPropertyValues()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EReference getBuildingBlock_PropertyValues();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.BuildingBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ubicompforall.simplelanguage.BuildingBlock#getName()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EAttribute getBuildingBlock_Name();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.DomainObjectReference <em>Domain Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Reference</em>'.
	 * @see org.ubicompforall.simplelanguage.DomainObjectReference
	 * @generated
	 */
	EClass getDomainObjectReference();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.PropertyAssignment <em>Property Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assignment</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyAssignment
	 * @generated
	 */
	EClass getPropertyAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.PropertyAssignment#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyAssignment#getProperty()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EAttribute getPropertyAssignment_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.PropertyAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ubicompforall.simplelanguage.PropertyAssignment#getValue()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EAttribute getPropertyAssignment_Value();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.simplelanguage.UserService <em>User Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Service</em>'.
	 * @see org.ubicompforall.simplelanguage.UserService
	 * @generated
	 */
	EClass getUserService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.simplelanguage.UserService#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.ubicompforall.simplelanguage.UserService#getTasks()
	 * @see #getUserService()
	 * @generated
	 */
	EReference getUserService_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.simplelanguage.UserService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ubicompforall.simplelanguage.UserService#getName()
	 * @see #getUserService()
	 * @generated
	 */
	EAttribute getUserService_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.ubicompforall.simplelanguage.UserService#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see org.ubicompforall.simplelanguage.UserService#getLibraries()
	 * @see #getUserService()
	 * @generated
	 */
	EReference getUserService_Libraries();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleLanguageFactory getSimpleLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.StepImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.TriggerImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__CONDITIONS = eINSTANCE.getTrigger_Conditions();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.ConditionalStepImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getConditionalStep()
		 * @generated
		 */
		EClass CONDITIONAL_STEP = eINSTANCE.getConditionalStep();

		/**
		 * The meta object literal for the '<em><b>Step Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__STEP_SEQUENCE = eINSTANCE.getConditionalStep_StepSequence();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__CONDITIONS = eINSTANCE.getConditionalStep_Conditions();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.TaskImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Info Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INFO_OBJECTS = eINSTANCE.getTask_InfoObjects();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRIGGER = eINSTANCE.getTask_Trigger();

		/**
		 * The meta object literal for the '<em><b>Step Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STEP_SEQUENCE = eINSTANCE.getTask_StepSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACTIVE = eINSTANCE.getTask_Active();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.QueryImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__RESULT = eINSTANCE.getQuery_Result();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '<em><b>From Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERENCE__FROM_OBJECT = eINSTANCE.getPropertyReference_FromObject();

		/**
		 * The meta object literal for the '<em><b>From Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REFERENCE__FROM_PROPERTY = eINSTANCE.getPropertyReference_FromProperty();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.InformationObjectImpl <em>Information Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.InformationObjectImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getInformationObject()
		 * @generated
		 */
		EClass INFORMATION_OBJECT = eINSTANCE.getInformationObject();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.ConditionImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.BuildingBlockImpl <em>Building Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.BuildingBlockImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getBuildingBlock()
		 * @generated
		 */
		EClass BUILDING_BLOCK = eINSTANCE.getBuildingBlock();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK__DESCRIPTOR = eINSTANCE.getBuildingBlock_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK__PROPERTY_VALUES = eINSTANCE.getBuildingBlock_PropertyValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_BLOCK__NAME = eINSTANCE.getBuildingBlock_Name();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.DomainObjectReferenceImpl <em>Domain Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.DomainObjectReferenceImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getDomainObjectReference()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_REFERENCE = eINSTANCE.getDomainObjectReference();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.PropertyAssignmentImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getPropertyAssignment()
		 * @generated
		 */
		EClass PROPERTY_ASSIGNMENT = eINSTANCE.getPropertyAssignment();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ASSIGNMENT__PROPERTY = eINSTANCE.getPropertyAssignment_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ASSIGNMENT__VALUE = eINSTANCE.getPropertyAssignment_Value();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.simplelanguage.impl.UserServiceImpl <em>User Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.simplelanguage.impl.UserServiceImpl
		 * @see org.ubicompforall.simplelanguage.impl.SimpleLanguagePackageImpl#getUserService()
		 * @generated
		 */
		EClass USER_SERVICE = eINSTANCE.getUserService();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SERVICE__TASKS = eINSTANCE.getUserService_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SERVICE__NAME = eINSTANCE.getUserService_Name();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SERVICE__LIBRARIES = eINSTANCE.getUserService_Libraries();

	}

} //SimpleLanguagePackage
