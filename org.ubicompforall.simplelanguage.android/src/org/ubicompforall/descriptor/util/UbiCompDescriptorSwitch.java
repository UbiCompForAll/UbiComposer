/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.ubicompforall.descriptor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage
 * @generated
 */
public class UbiCompDescriptorSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UbiCompDescriptorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiCompDescriptorSwitch() {
		if (modelPackage == null) {
			modelPackage = UbiCompDescriptorPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY: {
				DescriptorLibrary descriptorLibrary = (DescriptorLibrary)theEObject;
				T result = caseDescriptorLibrary(descriptorLibrary);
				if (result == null) result = caseNamedElement(descriptorLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.TRIGGER_DESC: {
				TriggerDesc triggerDesc = (TriggerDesc)theEObject;
				T result = caseTriggerDesc(triggerDesc);
				if (result == null) result = caseBuildingBlockDesc(triggerDesc);
				if (result == null) result = caseClassifier(triggerDesc);
				if (result == null) result = caseNamedElement(triggerDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.CONDITION_DESC: {
				ConditionDesc conditionDesc = (ConditionDesc)theEObject;
				T result = caseConditionDesc(conditionDesc);
				if (result == null) result = caseBuildingBlockDesc(conditionDesc);
				if (result == null) result = caseClassifier(conditionDesc);
				if (result == null) result = caseNamedElement(conditionDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.CONDITIONAL_STEP_DESC: {
				ConditionalStepDesc conditionalStepDesc = (ConditionalStepDesc)theEObject;
				T result = caseConditionalStepDesc(conditionalStepDesc);
				if (result == null) result = caseStepDesc(conditionalStepDesc);
				if (result == null) result = caseBuildingBlockDesc(conditionalStepDesc);
				if (result == null) result = caseClassifier(conditionalStepDesc);
				if (result == null) result = caseNamedElement(conditionalStepDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC: {
				DomainObjectDesc domainObjectDesc = (DomainObjectDesc)theEObject;
				T result = caseDomainObjectDesc(domainObjectDesc);
				if (result == null) result = caseClassifier(domainObjectDesc);
				if (result == null) result = caseNamedElement(domainObjectDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.QUERY_DESC: {
				QueryDesc queryDesc = (QueryDesc)theEObject;
				T result = caseQueryDesc(queryDesc);
				if (result == null) result = caseBuildingBlockDesc(queryDesc);
				if (result == null) result = caseClassifier(queryDesc);
				if (result == null) result = caseNamedElement(queryDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC: {
				BuildingBlockDesc buildingBlockDesc = (BuildingBlockDesc)theEObject;
				T result = caseBuildingBlockDesc(buildingBlockDesc);
				if (result == null) result = caseClassifier(buildingBlockDesc);
				if (result == null) result = caseNamedElement(buildingBlockDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.STEP_DESC: {
				StepDesc stepDesc = (StepDesc)theEObject;
				T result = caseStepDesc(stepDesc);
				if (result == null) result = caseBuildingBlockDesc(stepDesc);
				if (result == null) result = caseClassifier(stepDesc);
				if (result == null) result = caseNamedElement(stepDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UbiCompDescriptorPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptorLibrary(DescriptorLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDesc(TriggerDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionDesc(ConditionDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Step Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Step Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStepDesc(ConditionalStepDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObjectDesc(DomainObjectDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDesc(QueryDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building Block Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building Block Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingBlockDesc(BuildingBlockDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepDesc(StepDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //UbiCompDescriptorSwitch
