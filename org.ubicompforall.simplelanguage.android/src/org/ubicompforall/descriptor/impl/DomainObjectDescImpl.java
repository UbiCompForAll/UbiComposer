/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ubicompforall.descriptor.DomainObjectDesc;
import org.ubicompforall.descriptor.UbiCompDescriptorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.impl.DomainObjectDescImpl#getContentURI <em>Content URI</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.DomainObjectDescImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.DomainObjectDescImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.DomainObjectDescImpl#getSelectionArgs <em>Selection Args</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.DomainObjectDescImpl#getSortOrder <em>Sort Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainObjectDescImpl extends ClassifierImpl implements DomainObjectDesc {
	/**
	 * The default value of the '{@link #getContentURI() <em>Content URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentURI() <em>Content URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentURI()
	 * @generated
	 * @ordered
	 */
	protected String contentURI = CONTENT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected String projection = PROJECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected String selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectionArgs() <em>Selection Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectionArgs() <em>Selection Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionArgs()
	 * @generated
	 * @ordered
	 */
	protected String selectionArgs = SELECTION_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected String sortOrder = SORT_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectDescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiCompDescriptorPackage.Literals.DOMAIN_OBJECT_DESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentURI() {
		return contentURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentURI(String newContentURI) {
		String oldContentURI = contentURI;
		contentURI = newContentURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__CONTENT_URI, oldContentURI, contentURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(String newProjection) {
		String oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(String newSelection) {
		String oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectionArgs() {
		return selectionArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionArgs(String newSelectionArgs) {
		String oldSelectionArgs = selectionArgs;
		selectionArgs = newSelectionArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION_ARGS, oldSelectionArgs, selectionArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortOrder() {
		return sortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortOrder(String newSortOrder) {
		String oldSortOrder = sortOrder;
		sortOrder = newSortOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SORT_ORDER, oldSortOrder, sortOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__CONTENT_URI:
				return getContentURI();
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__PROJECTION:
				return getProjection();
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION:
				return getSelection();
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION_ARGS:
				return getSelectionArgs();
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SORT_ORDER:
				return getSortOrder();
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
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__CONTENT_URI:
				setContentURI((String)newValue);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__PROJECTION:
				setProjection((String)newValue);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION:
				setSelection((String)newValue);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION_ARGS:
				setSelectionArgs((String)newValue);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SORT_ORDER:
				setSortOrder((String)newValue);
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
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__CONTENT_URI:
				setContentURI(CONTENT_URI_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__PROJECTION:
				setProjection(PROJECTION_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION_ARGS:
				setSelectionArgs(SELECTION_ARGS_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SORT_ORDER:
				setSortOrder(SORT_ORDER_EDEFAULT);
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
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__CONTENT_URI:
				return CONTENT_URI_EDEFAULT == null ? contentURI != null : !CONTENT_URI_EDEFAULT.equals(contentURI);
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__PROJECTION:
				return PROJECTION_EDEFAULT == null ? projection != null : !PROJECTION_EDEFAULT.equals(projection);
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SELECTION_ARGS:
				return SELECTION_ARGS_EDEFAULT == null ? selectionArgs != null : !SELECTION_ARGS_EDEFAULT.equals(selectionArgs);
			case UbiCompDescriptorPackage.DOMAIN_OBJECT_DESC__SORT_ORDER:
				return SORT_ORDER_EDEFAULT == null ? sortOrder != null : !SORT_ORDER_EDEFAULT.equals(sortOrder);
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
		result.append(" (contentURI: ");
		result.append(contentURI);
		result.append(", projection: ");
		result.append(projection);
		result.append(", selection: ");
		result.append(selection);
		result.append(", selectionArgs: ");
		result.append(selectionArgs);
		result.append(", sortOrder: ");
		result.append(sortOrder);
		result.append(')');
		return result.toString();
	}

} //DomainObjectDescImpl
