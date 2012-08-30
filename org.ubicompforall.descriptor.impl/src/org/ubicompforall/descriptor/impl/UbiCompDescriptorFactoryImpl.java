/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ubicompforall.descriptor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbiCompDescriptorFactoryImpl extends EFactoryImpl implements UbiCompDescriptorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbiCompDescriptorFactory init() {
		try {
			UbiCompDescriptorFactory theUbiCompDescriptorFactory = (UbiCompDescriptorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ubicompforall.org/descriptor"); 
			if (theUbiCompDescriptorFactory != null) {
				return theUbiCompDescriptorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UbiCompDescriptorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiCompDescriptorFactoryImpl() {
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
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY: return createDescriptorLibrary();
			case UbiCompDescriptorPackage.TRIGGER_DESC: return createTriggerDesc();
			case UbiCompDescriptorPackage.CONDITION_DESC: return createConditionDesc();
			case UbiCompDescriptorPackage.CONDITIONAL_STEP_DESC: return createConditionalStepDesc();
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC: return createDomainObjectDesc();
			case UbiCompDescriptorPackage.QUERY_DESC: return createQueryDesc();
			case UbiCompDescriptorPackage.PROPERTY: return createProperty();
			case UbiCompDescriptorPackage.VALUE: return createValue();
			case UbiCompDescriptorPackage.STEP_DESC: return createStepDesc();
			case UbiCompDescriptorPackage.NAMED_ELEMENT: return createNamedElement();
			case UbiCompDescriptorPackage.DATA_TYPE: return createDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorLibrary createDescriptorLibrary() {
		DescriptorLibraryImpl descriptorLibrary = new DescriptorLibraryImpl();
		return descriptorLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDesc createTriggerDesc() {
		TriggerDescImpl triggerDesc = new TriggerDescImpl();
		return triggerDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDesc createConditionDesc() {
		ConditionDescImpl conditionDesc = new ConditionDescImpl();
		return conditionDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStepDesc createConditionalStepDesc() {
		ConditionalStepDescImpl conditionalStepDesc = new ConditionalStepDescImpl();
		return conditionalStepDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectDesc createDomainObjectDesc() {
		DomainObjectDescImpl domainObjectDesc = new DomainObjectDescImpl();
		return domainObjectDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDesc createQueryDesc() {
		QueryDescImpl queryDesc = new QueryDescImpl();
		return queryDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDesc createStepDesc() {
		StepDescImpl stepDesc = new StepDescImpl();
		return stepDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiCompDescriptorPackage getUbiCompDescriptorPackage() {
		return (UbiCompDescriptorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UbiCompDescriptorPackage getPackage() {
		return UbiCompDescriptorPackage.eINSTANCE;
	}

} //UbiCompDescriptorFactoryImpl
