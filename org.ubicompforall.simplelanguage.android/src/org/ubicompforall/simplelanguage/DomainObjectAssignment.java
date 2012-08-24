/**
 */
package org.ubicompforall.simplelanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.DomainObjectAssignment#getDomainObject <em>Domain Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectAssignment()
 * @model
 * @generated
 */
public interface DomainObjectAssignment extends PropertyAssignment {
	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.simplelanguage.DomainObjectReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' containment reference list.
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getDomainObjectAssignment_DomainObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectReference> getDomainObject();

} // DomainObjectAssignment
