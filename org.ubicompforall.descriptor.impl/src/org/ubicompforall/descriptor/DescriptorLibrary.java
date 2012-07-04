/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.DescriptorLibrary#getBuildingBlocks <em>Building Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getDescriptorLibrary()
 * @model
 * @generated
 */
public interface DescriptorLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Building Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.descriptor.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Blocks</em>' containment reference list.
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getDescriptorLibrary_BuildingBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getBuildingBlocks();

} // DescriptorLibrary
