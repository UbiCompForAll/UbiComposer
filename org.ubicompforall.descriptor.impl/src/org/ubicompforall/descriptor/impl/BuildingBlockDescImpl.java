/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ubicompforall.descriptor.BuildingBlockDesc;
import org.ubicompforall.descriptor.Property;
import org.ubicompforall.descriptor.UbiCompDescriptorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building Block Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.impl.BuildingBlockDescImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.BuildingBlockDescImpl#getIconUrl <em>Icon Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BuildingBlockDescImpl extends ClassifierImpl implements BuildingBlockDesc {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected String iconUrl = ICON_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingBlockDescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiCompDescriptorPackage.Literals.BUILDING_BLOCK_DESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconUrl(String newIconUrl) {
		String oldIconUrl = iconUrl;
		iconUrl = newIconUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__ICON_URL, oldIconUrl, iconUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES:
				return getProperties();
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__ICON_URL:
				return getIconUrl();
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
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__ICON_URL:
				setIconUrl((String)newValue);
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
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES:
				getProperties().clear();
				return;
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__ICON_URL:
				setIconUrl(ICON_URL_EDEFAULT);
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
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case UbiCompDescriptorPackage.BUILDING_BLOCK_DESC__ICON_URL:
				return ICON_URL_EDEFAULT == null ? iconUrl != null : !ICON_URL_EDEFAULT.equals(iconUrl);
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
		result.append(" (iconUrl: ");
		result.append(iconUrl);
		result.append(')');
		return result.toString();
	}

} //BuildingBlockDescImpl
