/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ubicompforall.descriptor.TriggerDesc#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getTriggerDesc()
 * @model
 * @generated
 */
public interface TriggerDesc extends BuildingBlockDesc {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.ubicompforall.descriptor.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.ubicompforall.descriptor.UbiCompDescriptorPackage#getTriggerDesc_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getParameters();

} // TriggerDesc
