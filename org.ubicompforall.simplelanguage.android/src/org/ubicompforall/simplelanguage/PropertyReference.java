/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.PropertyReference#getFromObject <em>From Object</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.PropertyReference#getFromProperty <em>From Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getPropertyReference()
 * @model
 * @generated
 */
public interface PropertyReference extends PropertyAssignment {
	/**
	 * Returns the value of the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Object</em>' reference.
	 * @see #setFromObject(BuildingBlock)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getPropertyReference_FromObject()
	 * @model required="true"
	 * @generated
	 */
	BuildingBlock getFromObject();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.PropertyReference#getFromObject <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Object</em>' reference.
	 * @see #getFromObject()
	 * @generated
	 */
	void setFromObject(BuildingBlock value);

	/**
	 * Returns the value of the '<em><b>From Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Property</em>' attribute.
	 * @see #setFromProperty(String)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getPropertyReference_FromProperty()
	 * @model
	 * @generated
	 */
	String getFromProperty();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.PropertyReference#getFromProperty <em>From Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Property</em>' attribute.
	 * @see #getFromProperty()
	 * @generated
	 */
	void setFromProperty(String value);

} // PropertyReference
