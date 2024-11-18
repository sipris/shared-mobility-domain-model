/**
 */
package org.sharedmobility.domainmodel.smdm.communication;

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
 *   <li>{@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator#getCommunicationParticipants <em>Communication Participants</em>}</li>
 * </ul>
 *
 * @see org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage#getDirectCommunicator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DirectCommunicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Communication Participants</b></em>' reference list.
	 * The list contents are of type {@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Participants</em>' reference list.
	 * @see org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage#getDirectCommunicator_CommunicationParticipants()
	 * @model
	 * @generated
	 */
	List<DirectCommunicator> getCommunicationParticipants();

} // DirectCommunicator
