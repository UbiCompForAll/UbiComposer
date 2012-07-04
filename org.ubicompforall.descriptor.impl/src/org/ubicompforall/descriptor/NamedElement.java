/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.NamedElement#getUserFriendlyName <em>User Friendly Name</em>}</li>
 *   <li>{@link org.ubicompforall.descriptor.NamedElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Friendly Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Friendly Name</em>' attribute.
	 * @see #setUserFriendlyName(String)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getNamedElement_UserFriendlyName()
	 * @model
	 * @generated
	 */
	String getUserFriendlyName();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.NamedElement#getUserFriendlyName <em>User Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Friendly Name</em>' attribute.
	 * @see #getUserFriendlyName()
	 * @generated
	 */
	void setUserFriendlyName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getNamedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ubicompforall.descriptor.NamedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // NamedElement
