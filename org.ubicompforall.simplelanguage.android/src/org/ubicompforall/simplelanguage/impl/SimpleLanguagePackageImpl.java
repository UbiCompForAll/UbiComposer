/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ubicompforall.descriptor.UbiCompDescriptorPackage;

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.ConditionalStep;
import org.ubicompforall.simplelanguage.DomainObjectAssignment;
import org.ubicompforall.simplelanguage.DomainObjectReference;
import org.ubicompforall.simplelanguage.InformationObject;
import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;
import org.ubicompforall.simplelanguage.Query;
import org.ubicompforall.simplelanguage.SimpleLanguageFactory;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.Trigger;
import org.ubicompforall.simplelanguage.UserService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleLanguagePackageImpl extends EPackageImpl implements SimpleLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectAssignmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleLanguagePackageImpl() {
		super(eNS_URI, SimpleLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleLanguagePackage init() {
		if (isInited) return (SimpleLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(SimpleLanguagePackage.eNS_URI);

		// Obtain or create and register package
		SimpleLanguagePackageImpl theSimpleLanguagePackage = (SimpleLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UbiCompDescriptorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimpleLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theSimpleLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleLanguagePackage.eNS_URI, theSimpleLanguagePackage);
		return theSimpleLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Conditions() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStep() {
		return conditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStep_StepSequence() {
		return (EReference)conditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStep_Conditions() {
		return (EReference)conditionalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_InfoObjects() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Trigger() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_StepSequence() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Active() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Result() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyReference() {
		return propertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReference_FromObject() {
		return (EReference)propertyReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyReference_FromProperty() {
		return (EAttribute)propertyReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationObject() {
		return informationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingBlock() {
		return buildingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingBlock_Descriptor() {
		return (EReference)buildingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingBlock_PropertyValues() {
		return (EReference)buildingBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingBlock_Name() {
		return (EAttribute)buildingBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectReference() {
		return domainObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectReference_Id() {
		return (EAttribute)domainObjectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectReference_DisplayText() {
		return (EAttribute)domainObjectReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectReference_DataType() {
		return (EReference)domainObjectReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAssignment() {
		return propertyAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAssignment_Property() {
		return (EAttribute)propertyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAssignment_Value() {
		return (EAttribute)propertyAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserService() {
		return userServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserService_Tasks() {
		return (EReference)userServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserService_Name() {
		return (EAttribute)userServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserService_Libraries() {
		return (EReference)userServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectAssignment() {
		return domainObjectAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectAssignment_DomainObject() {
		return (EReference)domainObjectAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLanguageFactory getSimpleLanguageFactory() {
		return (SimpleLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stepEClass = createEClass(STEP);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__CONDITIONS);

		conditionalStepEClass = createEClass(CONDITIONAL_STEP);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__STEP_SEQUENCE);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__CONDITIONS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__INFO_OBJECTS);
		createEReference(taskEClass, TASK__TRIGGER);
		createEReference(taskEClass, TASK__STEP_SEQUENCE);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__ACTIVE);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__RESULT);

		propertyReferenceEClass = createEClass(PROPERTY_REFERENCE);
		createEReference(propertyReferenceEClass, PROPERTY_REFERENCE__FROM_OBJECT);
		createEAttribute(propertyReferenceEClass, PROPERTY_REFERENCE__FROM_PROPERTY);

		informationObjectEClass = createEClass(INFORMATION_OBJECT);

		conditionEClass = createEClass(CONDITION);

		buildingBlockEClass = createEClass(BUILDING_BLOCK);
		createEReference(buildingBlockEClass, BUILDING_BLOCK__DESCRIPTOR);
		createEReference(buildingBlockEClass, BUILDING_BLOCK__PROPERTY_VALUES);
		createEAttribute(buildingBlockEClass, BUILDING_BLOCK__NAME);

		domainObjectReferenceEClass = createEClass(DOMAIN_OBJECT_REFERENCE);
		createEAttribute(domainObjectReferenceEClass, DOMAIN_OBJECT_REFERENCE__ID);
		createEAttribute(domainObjectReferenceEClass, DOMAIN_OBJECT_REFERENCE__DISPLAY_TEXT);
		createEReference(domainObjectReferenceEClass, DOMAIN_OBJECT_REFERENCE__DATA_TYPE);

		propertyAssignmentEClass = createEClass(PROPERTY_ASSIGNMENT);
		createEAttribute(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__PROPERTY);
		createEAttribute(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__VALUE);

		userServiceEClass = createEClass(USER_SERVICE);
		createEReference(userServiceEClass, USER_SERVICE__TASKS);
		createEAttribute(userServiceEClass, USER_SERVICE__NAME);
		createEReference(userServiceEClass, USER_SERVICE__LIBRARIES);

		domainObjectAssignmentEClass = createEClass(DOMAIN_OBJECT_ASSIGNMENT);
		createEReference(domainObjectAssignmentEClass, DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UbiCompDescriptorPackage theUbiCompDescriptorPackage = (UbiCompDescriptorPackage)EPackage.Registry.INSTANCE.getEPackage(UbiCompDescriptorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stepEClass.getESuperTypes().add(this.getBuildingBlock());
		triggerEClass.getESuperTypes().add(this.getBuildingBlock());
		conditionalStepEClass.getESuperTypes().add(this.getStep());
		queryEClass.getESuperTypes().add(this.getInformationObject());
		queryEClass.getESuperTypes().add(this.getStep());
		propertyReferenceEClass.getESuperTypes().add(this.getPropertyAssignment());
		informationObjectEClass.getESuperTypes().add(this.getBuildingBlock());
		conditionEClass.getESuperTypes().add(this.getBuildingBlock());
		domainObjectAssignmentEClass.getESuperTypes().add(this.getPropertyAssignment());

		// Initialize classes and features; add operations and parameters
		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(stepEClass, null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStepEClass, ConditionalStep.class, "ConditionalStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStep_StepSequence(), this.getStep(), null, "stepSequence", null, 0, -1, ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_Conditions(), this.getCondition(), null, "conditions", null, 1, -1, ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_InfoObjects(), this.getInformationObject(), null, "infoObjects", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Trigger(), this.getTrigger(), null, "trigger", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_StepSequence(), this.getStep(), null, "stepSequence", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(taskEClass, null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Result(), ecorePackage.getEString(), "result", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(queryEClass, null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyReferenceEClass, PropertyReference.class, "PropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyReference_FromObject(), this.getBuildingBlock(), null, "fromObject", null, 1, 1, PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyReference_FromProperty(), ecorePackage.getEString(), "fromProperty", null, 0, 1, PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationObjectEClass, InformationObject.class, "InformationObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(conditionEClass, ecorePackage.getEBoolean(), "check", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buildingBlockEClass, BuildingBlock.class, "BuildingBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildingBlock_Descriptor(), theUbiCompDescriptorPackage.getBuildingBlockDesc(), null, "descriptor", null, 0, 1, BuildingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingBlock_PropertyValues(), this.getPropertyAssignment(), null, "propertyValues", null, 0, -1, BuildingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, BuildingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectReferenceEClass, DomainObjectReference.class, "DomainObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainObjectReference_Id(), ecorePackage.getEString(), "id", null, 0, 1, DomainObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainObjectReference_DisplayText(), ecorePackage.getEString(), "displayText", null, 0, 1, DomainObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectReference_DataType(), theUbiCompDescriptorPackage.getDomainObjectDesc(), null, "dataType", null, 1, 1, DomainObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssignmentEClass, PropertyAssignment.class, "PropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyAssignment_Property(), ecorePackage.getEString(), "property", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAssignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userServiceEClass, UserService.class, "UserService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserService_Tasks(), this.getTask(), null, "tasks", null, 0, -1, UserService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserService_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserService_Libraries(), theUbiCompDescriptorPackage.getDescriptorLibrary(), null, "libraries", null, 0, -1, UserService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectAssignmentEClass, DomainObjectAssignment.class, "DomainObjectAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainObjectAssignment_DomainObject(), this.getDomainObjectReference(), null, "domainObject", null, 0, -1, DomainObjectAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleLanguagePackageImpl
