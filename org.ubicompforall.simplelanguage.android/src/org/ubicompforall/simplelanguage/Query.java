/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.Query#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends InformationObject, Step {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getQuery_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.Query#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform();

} // Query
