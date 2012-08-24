/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ubicompforall.simplelanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleLanguageFactoryImpl extends EFactoryImpl implements SimpleLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleLanguageFactory init() {
		try {
			SimpleLanguageFactory theSimpleLanguageFactory = (SimpleLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://ubicompforall.org/simplelanguage"); 
			if (theSimpleLanguageFactory != null) {
				return theSimpleLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpleLanguagePackage.STEP: return createStep();
			case SimpleLanguagePackage.TRIGGER: return createTrigger();
			case SimpleLanguagePackage.CONDITIONAL_STEP: return createConditionalStep();
			case SimpleLanguagePackage.TASK: return createTask();
			case SimpleLanguagePackage.QUERY: return createQuery();
			case SimpleLanguagePackage.PROPERTY_REFERENCE: return createPropertyReference();
			case SimpleLanguagePackage.INFORMATION_OBJECT: return createInformationObject();
			case SimpleLanguagePackage.CONDITION: return createCondition();
			case SimpleLanguagePackage.DOMAIN_OBJECT_REFERENCE: return createDomainObjectReference();
			case SimpleLanguagePackage.PROPERTY_ASSIGNMENT: return createPropertyAssignment();
			case SimpleLanguagePackage.USER_SERVICE: return createUserService();
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT: return createDomainObjectAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStep createConditionalStep() {
		ConditionalStepImpl conditionalStep = new ConditionalStepImpl();
		return conditionalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReference createPropertyReference() {
		PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationObject createInformationObject() {
		InformationObjectImpl informationObject = new InformationObjectImpl();
		return informationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectReference createDomainObjectReference() {
		DomainObjectReferenceImpl domainObjectReference = new DomainObjectReferenceImpl();
		return domainObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAssignment createPropertyAssignment() {
		PropertyAssignmentImpl propertyAssignment = new PropertyAssignmentImpl();
		return propertyAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserService createUserService() {
		UserServiceImpl userService = new UserServiceImpl();
		return userService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectAssignment createDomainObjectAssignment() {
		DomainObjectAssignmentImpl domainObjectAssignment = new DomainObjectAssignmentImpl();
		return domainObjectAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLanguagePackage getSimpleLanguagePackage() {
		return (SimpleLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleLanguagePackage getPackage() {
		return SimpleLanguagePackage.eINSTANCE;
	}

} //SimpleLanguageFactoryImpl
