/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage
 * @generated
 */
public interface UbiCompDescriptorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbiCompDescriptorFactory eINSTANCE = org.ubicompforall.descriptor.impl.UbiCompDescriptorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Descriptor Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Library</em>'.
	 * @generated
	 */
	DescriptorLibrary createDescriptorLibrary();

	/**
	 * Returns a new object of class '<em>Trigger Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Desc</em>'.
	 * @generated
	 */
	TriggerDesc createTriggerDesc();

	/**
	 * Returns a new object of class '<em>Condition Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Desc</em>'.
	 * @generated
	 */
	ConditionDesc createConditionDesc();

	/**
	 * Returns a new object of class '<em>Conditional Step Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Step Desc</em>'.
	 * @generated
	 */
	ConditionalStepDesc createConditionalStepDesc();

	/**
	 * Returns a new object of class '<em>Dom Obj Ref Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dom Obj Ref Desc</em>'.
	 * @generated
	 */
	DomObjRefDesc createDomObjRefDesc();

	/**
	 * Returns a new object of class '<em>Query Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Desc</em>'.
	 * @generated
	 */
	QueryDesc createQueryDesc();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Step Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Desc</em>'.
	 * @generated
	 */
	StepDesc createStepDesc();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UbiCompDescriptorPackage getUbiCompDescriptorPackage();

} //UbiCompDescriptorFactory
