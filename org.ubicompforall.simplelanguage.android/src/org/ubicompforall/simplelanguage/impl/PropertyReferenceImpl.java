/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.PropertyReference;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl#getFromObject <em>From Object</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.impl.PropertyReferenceImpl#getFromProperty <em>From Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyReferenceImpl extends PropertyAssignmentImpl implements PropertyReference {
	/**
	 * The cached value of the '{@link #getFromObject() <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromObject()
	 * @generated
	 * @ordered
	 */
	protected BuildingBlock fromObject;

	/**
	 * The default value of the '{@link #getFromProperty() <em>From Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromProperty() <em>From Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromProperty()
	 * @generated
	 * @ordered
	 */
	protected String fromProperty = FROM_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleLanguagePackage.Literals.PROPERTY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingBlock getFromObject() {
		if (fromObject != null && fromObject.eIsProxy()) {
			InternalEObject oldFromObject = (InternalEObject)fromObject;
			fromObject = (BuildingBlock)eResolveProxy(oldFromObject);
			if (fromObject != oldFromObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT, oldFromObject, fromObject));
			}
		}
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingBlock basicGetFromObject() {
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromObject(BuildingBlock newFromObject) {
		BuildingBlock oldFromObject = fromObject;
		fromObject = newFromObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT, oldFromObject, fromObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromProperty() {
		return fromProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromProperty(String newFromProperty) {
		String oldFromProperty = fromProperty;
		fromProperty = newFromProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_PROPERTY, oldFromProperty, fromProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT:
				if (resolve) return getFromObject();
				return basicGetFromObject();
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_PROPERTY:
				return getFromProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT:
				setFromObject((BuildingBlock)newValue);
				return;
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_PROPERTY:
				setFromProperty((String)newValue);
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
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT:
				setFromObject((BuildingBlock)null);
				return;
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_PROPERTY:
				setFromProperty(FROM_PROPERTY_EDEFAULT);
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
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_OBJECT:
				return fromObject != null;
			case SimpleLanguagePackage.PROPERTY_REFERENCE__FROM_PROPERTY:
				return FROM_PROPERTY_EDEFAULT == null ? fromProperty != null : !FROM_PROPERTY_EDEFAULT.equals(fromProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fromProperty: ");
		result.append(fromProperty);
		result.append(')');
		return result.toString();
	}

} //PropertyReferenceImpl
