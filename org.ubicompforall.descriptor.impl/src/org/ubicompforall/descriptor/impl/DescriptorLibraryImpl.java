/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ubicompforall.descriptor.Classifier;
import org.ubicompforall.descriptor.DescriptorLibrary;
import org.ubicompforall.descriptor.UbiCompDescriptorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.impl.DescriptorLibraryImpl#getBuildingBlocks <em>Building Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptorLibraryImpl extends NamedElementImpl implements DescriptorLibrary {
	/**
	 * The cached value of the '{@link #getBuildingBlocks() <em>Building Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> buildingBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiCompDescriptorPackage.Literals.DESCRIPTOR_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getBuildingBlocks() {
		if (buildingBlocks == null) {
			buildingBlocks = new EObjectContainmentEList<Classifier>(Classifier.class, this, UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS);
		}
		return buildingBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS:
				return ((InternalEList<?>)getBuildingBlocks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS:
				return getBuildingBlocks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS:
				getBuildingBlocks().clear();
				getBuildingBlocks().addAll((Collection<? extends Classifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS:
				getBuildingBlocks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DESCRIPTOR_LIBRARY__BUILDING_BLOCKS:
				return buildingBlocks != null && !buildingBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DescriptorLibraryImpl
