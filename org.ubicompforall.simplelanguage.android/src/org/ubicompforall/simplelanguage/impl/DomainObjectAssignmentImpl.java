/**
 */
package org.ubicompforall.simplelanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ubicompforall.simplelanguage.DomainObjectAssignment;
import org.ubicompforall.simplelanguage.DomainObjectReference;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.impl.DomainObjectAssignmentImpl#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainObjectAssignmentImpl extends PropertyAssignmentImpl implements DomainObjectAssignment {
	/**
	 * The cached value of the '{@link #getDomainObject() <em>Domain Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectReference> domainObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleLanguagePackage.Literals.DOMAIN_OBJECT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectReference> getDomainObject() {
		if (domainObject == null) {
			domainObject = new EObjectContainmentEList<DomainObjectReference>(DomainObjectReference.class, this, SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT);
		}
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT:
				return ((InternalEList<?>)getDomainObject()).basicRemove(otherEnd, msgs);
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
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT:
				return getDomainObject();
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
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT:
				getDomainObject().clear();
				getDomainObject().addAll((Collection<? extends DomainObjectReference>)newValue);
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
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT:
				getDomainObject().clear();
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
			case SimpleLanguagePackage.DOMAIN_OBJECT_ASSIGNMENT__DOMAIN_OBJECT:
				return domainObject != null && !domainObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainObjectAssignmentImpl
