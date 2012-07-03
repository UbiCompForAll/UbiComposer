/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.Property#isCanReferToOther <em>Can Refer To Other</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#isCanBeReferedTo <em>Can Be Refered To</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#isIsResultValue <em>Is Result Value</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.Property#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Can Refer To Other</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Refer To Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Refer To Other</em>' attribute.
	 * @see #setCanReferToOther(boolean)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_CanReferToOther()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCanReferToOther();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#isCanReferToOther <em>Can Refer To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Refer To Other</em>' attribute.
	 * @see #isCanReferToOther()
	 * @generated
	 */
	void setCanReferToOther(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Be Refered To</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Refered To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Refered To</em>' attribute.
	 * @see #setCanBeReferedTo(boolean)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_CanBeReferedTo()
	 * @model default="true" required="true"
	 *        extendedMetaData="namespace='' wildcards='' name=''"
	 * @generated
	 */
	boolean isCanBeReferedTo();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#isCanBeReferedTo <em>Can Be Refered To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Refered To</em>' attribute.
	 * @see #isCanBeReferedTo()
	 * @generated
	 */
	void setCanBeReferedTo(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Result Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Result Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Result Value</em>' attribute.
	 * @see #setIsResultValue(boolean)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_IsResultValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsResultValue();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#isIsResultValue <em>Is Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Result Value</em>' attribute.
	 * @see #isIsResultValue()
	 * @generated
	 */
	void setIsResultValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowed Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.descriptor.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Values</em>' containment reference list.
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_AllowedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getAllowedValues();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Classifier)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_DataType()
	 * @model required="true"
	 * @generated
	 */
	Classifier getDataType();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getProperty_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.Property#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // Property
