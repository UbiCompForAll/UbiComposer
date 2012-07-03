/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.ubicompforall.descriptor.NamedElement;
import org.ubicompforall.descriptor.UbiCompDescriptorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.NamedElementImpl#getUserFriendlyName <em>User Friendly Name</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.NamedElementImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedElementImpl extends EObjectImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserFriendlyName() <em>User Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_FRIENDLY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserFriendlyName() <em>User Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected String userFriendlyName = USER_FRIENDLY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiCompDescriptorPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserFriendlyName() {
		return userFriendlyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFriendlyName(String newUserFriendlyName) {
		String oldUserFriendlyName = userFriendlyName;
		userFriendlyName = newUserFriendlyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.NAMED_ELEMENT__USER_FRIENDLY_NAME, oldUserFriendlyName, userFriendlyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.NAMED_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbiCompDescriptorPackage.NAMED_ELEMENT__NAME:
				return getName();
			case UbiCompDescriptorPackage.NAMED_ELEMENT__USER_FRIENDLY_NAME:
				return getUserFriendlyName();
			case UbiCompDescriptorPackage.NAMED_ELEMENT__DESCRIPTION:
				return getDescription();
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
			case UbiCompDescriptorPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UbiCompDescriptorPackage.NAMED_ELEMENT__USER_FRIENDLY_NAME:
				setUserFriendlyName((String)newValue);
				return;
			case UbiCompDescriptorPackage.NAMED_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case UbiCompDescriptorPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.NAMED_ELEMENT__USER_FRIENDLY_NAME:
				setUserFriendlyName(USER_FRIENDLY_NAME_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.NAMED_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case UbiCompDescriptorPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UbiCompDescriptorPackage.NAMED_ELEMENT__USER_FRIENDLY_NAME:
				return USER_FRIENDLY_NAME_EDEFAULT == null ? userFriendlyName != null : !USER_FRIENDLY_NAME_EDEFAULT.equals(userFriendlyName);
			case UbiCompDescriptorPackage.NAMED_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", userFriendlyName: ");
		result.append(userFriendlyName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
