/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Communicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.DirectCommunicator#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDirectCommunicator()
 * @model abstract="true"
 * @generated
 */
public interface DirectCommunicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.DirectCommunicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDirectCommunicator_Connections()
	 * @model
	 * @generated
	 */
	List<DirectCommunicator> getConnections();

} // DirectCommunicator
