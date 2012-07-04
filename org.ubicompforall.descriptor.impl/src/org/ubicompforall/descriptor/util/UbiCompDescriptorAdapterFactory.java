/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ubicompforall.descriptor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage
 * @generated
 */
public class UbiCompDescriptorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UbiCompDescriptorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiCompDescriptorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UbiCompDescriptorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbiCompDescriptorSwitch<Adapter> modelSwitch =
		new UbiCompDescriptorSwitch<Adapter>() {
			@Override
			public Adapter caseDescriptorLibrary(DescriptorLibrary object) {
				return createDescriptorLibraryAdapter();
			}
			@Override
			public Adapter caseTriggerDesc(TriggerDesc object) {
				return createTriggerDescAdapter();
			}
			@Override
			public Adapter caseConditionDesc(ConditionDesc object) {
				return createConditionDescAdapter();
			}
			@Override
			public Adapter caseConditionalStepDesc(ConditionalStepDesc object) {
				return createConditionalStepDescAdapter();
			}
			@Override
			public Adapter caseDomObjRefDesc(DomObjRefDesc object) {
				return createDomObjRefDescAdapter();
			}
			@Override
			public Adapter caseQueryDesc(QueryDesc object) {
				return createQueryDescAdapter();
			}
			@Override
			public Adapter caseBuildingBlockDesc(BuildingBlockDesc object) {
				return createBuildingBlockDescAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseStepDesc(StepDesc object) {
				return createStepDescAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.DescriptorLibrary <em>Descriptor Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.DescriptorLibrary
	 * @generated
	 */
	public Adapter createDescriptorLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.TriggerDesc <em>Trigger Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.TriggerDesc
	 * @generated
	 */
	public Adapter createTriggerDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.ConditionDesc <em>Condition Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.ConditionDesc
	 * @generated
	 */
	public Adapter createConditionDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.ConditionalStepDesc <em>Conditional Step Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.ConditionalStepDesc
	 * @generated
	 */
	public Adapter createConditionalStepDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.DomObjRefDesc <em>Dom Obj Ref Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.DomObjRefDesc
	 * @generated
	 */
	public Adapter createDomObjRefDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.QueryDesc <em>Query Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.QueryDesc
	 * @generated
	 */
	public Adapter createQueryDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.BuildingBlockDesc <em>Building Block Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.BuildingBlockDesc
	 * @generated
	 */
	public Adapter createBuildingBlockDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.StepDesc <em>Step Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.StepDesc
	 * @generated
	 */
	public Adapter createStepDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ubicompforall.descriptor.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ubicompforall.descriptor.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UbiCompDescriptorAdapterFactory
