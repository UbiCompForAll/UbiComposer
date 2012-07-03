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

import org.ubicompforall.descriptor.Classifier;
import org.ubicompforall.descriptor.Property;
import org.ubicompforall.descriptor.UbiCompDescriptorPackage;
import org.ubicompforall.descriptor.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#isCanReferToOther <em>Can Refer To Other</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#isCanBeReferedTo <em>Can Be Refered To</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#isIsResultValue <em>Is Result Value</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.impl.PropertyImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The default value of the '{@link #isCanReferToOther() <em>Can Refer To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanReferToOther()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_REFER_TO_OTHER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanReferToOther() <em>Can Refer To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanReferToOther()
	 * @generated
	 * @ordered
	 */
	protected boolean canReferToOther = CAN_REFER_TO_OTHER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanBeReferedTo() <em>Can Be Refered To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeReferedTo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_BE_REFERED_TO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanBeReferedTo() <em>Can Be Refered To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeReferedTo()
	 * @generated
	 * @ordered
	 */
	protected boolean canBeReferedTo = CAN_BE_REFERED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsResultValue() <em>Is Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResultValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESULT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsResultValue() <em>Is Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResultValue()
	 * @generated
	 * @ordered
	 */
	protected boolean isResultValue = IS_RESULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> allowedValues;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Classifier dataType;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiCompDescriptorPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanReferToOther() {
		return canReferToOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanReferToOther(boolean newCanReferToOther) {
		boolean oldCanReferToOther = canReferToOther;
		canReferToOther = newCanReferToOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__CAN_REFER_TO_OTHER, oldCanReferToOther, canReferToOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanBeReferedTo() {
		return canBeReferedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBeReferedTo(boolean newCanBeReferedTo) {
		boolean oldCanBeReferedTo = canBeReferedTo;
		canBeReferedTo = newCanBeReferedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__CAN_BE_REFERED_TO, oldCanBeReferedTo, canBeReferedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsResultValue() {
		return isResultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResultValue(boolean newIsResultValue) {
		boolean oldIsResultValue = isResultValue;
		isResultValue = newIsResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__IS_RESULT_VALUE, oldIsResultValue, isResultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getAllowedValues() {
		if (allowedValues == null) {
			allowedValues = new EObjectContainmentEList<Value>(Value.class, this, UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES);
		}
		return allowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (Classifier)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbiCompDescriptorPackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Classifier newDataType) {
		Classifier oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiCompDescriptorPackage.PROPERTY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES:
				return ((InternalEList<?>)getAllowedValues()).basicRemove(otherEnd, msgs);
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
			case UbiCompDescriptorPackage.PROPERTY__CAN_REFER_TO_OTHER:
				return isCanReferToOther();
			case UbiCompDescriptorPackage.PROPERTY__CAN_BE_REFERED_TO:
				return isCanBeReferedTo();
			case UbiCompDescriptorPackage.PROPERTY__IS_RESULT_VALUE:
				return isIsResultValue();
			case UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES:
				return getAllowedValues();
			case UbiCompDescriptorPackage.PROPERTY__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case UbiCompDescriptorPackage.PROPERTY__LOWER_BOUND:
				return getLowerBound();
			case UbiCompDescriptorPackage.PROPERTY__UPPER_BOUND:
				return getUpperBound();
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
			case UbiCompDescriptorPackage.PROPERTY__CAN_REFER_TO_OTHER:
				setCanReferToOther((Boolean)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__CAN_BE_REFERED_TO:
				setCanBeReferedTo((Boolean)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__IS_RESULT_VALUE:
				setIsResultValue((Boolean)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES:
				getAllowedValues().clear();
				getAllowedValues().addAll((Collection<? extends Value>)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__DATA_TYPE:
				setDataType((Classifier)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case UbiCompDescriptorPackage.PROPERTY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
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
			case UbiCompDescriptorPackage.PROPERTY__CAN_REFER_TO_OTHER:
				setCanReferToOther(CAN_REFER_TO_OTHER_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.PROPERTY__CAN_BE_REFERED_TO:
				setCanBeReferedTo(CAN_BE_REFERED_TO_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.PROPERTY__IS_RESULT_VALUE:
				setIsResultValue(IS_RESULT_VALUE_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES:
				getAllowedValues().clear();
				return;
			case UbiCompDescriptorPackage.PROPERTY__DATA_TYPE:
				setDataType((Classifier)null);
				return;
			case UbiCompDescriptorPackage.PROPERTY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case UbiCompDescriptorPackage.PROPERTY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
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
			case UbiCompDescriptorPackage.PROPERTY__CAN_REFER_TO_OTHER:
				return canReferToOther != CAN_REFER_TO_OTHER_EDEFAULT;
			case UbiCompDescriptorPackage.PROPERTY__CAN_BE_REFERED_TO:
				return canBeReferedTo != CAN_BE_REFERED_TO_EDEFAULT;
			case UbiCompDescriptorPackage.PROPERTY__IS_RESULT_VALUE:
				return isResultValue != IS_RESULT_VALUE_EDEFAULT;
			case UbiCompDescriptorPackage.PROPERTY__ALLOWED_VALUES:
				return allowedValues != null && !allowedValues.isEmpty();
			case UbiCompDescriptorPackage.PROPERTY__DATA_TYPE:
				return dataType != null;
			case UbiCompDescriptorPackage.PROPERTY__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case UbiCompDescriptorPackage.PROPERTY__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
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
		result.append(" (canReferToOther: ");
		result.append(canReferToOther);
		result.append(", canBeReferedTo: ");
		result.append(canBeReferedTo);
		result.append(", isResultValue: ");
		result.append(isResultValue);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
