/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ubicompforall.descriptor.DescriptorLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.UserService#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.UserService#getName <em>Name</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.UserService#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getUserService()
 * @model
 * @generated
 */
public interface UserService extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.simplelanguage.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getUserService_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

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
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getUserService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.UserService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' reference list.
	 * The list contents are of type {@link org.ubicompforall.descriptor.DescriptorLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' reference list.
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getUserService_Libraries()
	 * @model
	 * @generated
	 */
	EList<DescriptorLibrary> getLibraries();

} // UserService
