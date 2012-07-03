/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ubicompforall.descriptor.BuildingBlockDesc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.BuildingBlock#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.BuildingBlock#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.BuildingBlock#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getBuildingBlock()
 * @model abstract="true"
 * @generated
 */
public interface BuildingBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference.
	 * @see #setDescriptor(BuildingBlockDesc)
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getBuildingBlock_Descriptor()
	 * @model
	 * @generated
	 */
	BuildingBlockDesc getDescriptor();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.BuildingBlock#getDescriptor <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuildingBlockDesc value);

	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.simplelanguage.PropertyAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getBuildingBlock_PropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssignment> getPropertyValues();

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
	 * @see org.ubicompforall.simplelanguage.SimpleLanguagePackage#getBuildingBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ubicompforall.simplelanguage.BuildingBlock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BuildingBlock
