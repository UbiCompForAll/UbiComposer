/**
 */
package org.ubicompforall.simplelanguage;

import org.eclipse.emf.ecore.EObject;

import org.ubicompforall.descriptor.DomainObjectDesc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.DomainObjectReference#getId <em>Id</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.DomainObjectReference#getDisplayText <em>Display Text</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.DomainObjectReference#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectReference()
 * @model
 * @generated
 */
public interface DomainObjectReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectReference_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.DomainObjectReference#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Text</em>' attribute.
	 * @see #setDisplayText(String)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectReference_DisplayText()
	 * @model
	 * @generated
	 */
	String getDisplayText();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.DomainObjectReference#getDisplayText <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' attribute.
	 * @see #getDisplayText()
	 * @generated
	 */
	void setDisplayText(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DomainObjectDesc)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectReference_DataType()
	 * @model required="true"
	 * @generated
	 */
	DomainObjectDesc getDataType();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.DomainObjectReference#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DomainObjectDesc value);

} // DomainObjectReference
