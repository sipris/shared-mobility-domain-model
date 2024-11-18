/**
 */
package org.sharedmobility.domainmodel.smdm.communication;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sharedmobility.domainmodel.smdm.communication.CommunicationFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.sharedmobility.domainmodel.communication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "communication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPackage eINSTANCE = org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkConnector <em>Network Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkConnector
	 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getNetworkConnector()
	 * @generated
	 */
	int NETWORK_CONNECTOR = 1;

	/**
	 * The number of structural features of the '<em>Network Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Network Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator <em>Network Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator
	 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getNetworkCommunicator()
	 * @generated
	 */
	int NETWORK_COMMUNICATOR = 0;

	/**
	 * The number of structural features of the '<em>Network Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_COMMUNICATOR_FEATURE_COUNT = NETWORK_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_COMMUNICATOR_OPERATION_COUNT = NETWORK_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator <em>Direct Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator
	 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getDirectCommunicator()
	 * @generated
	 */
	int DIRECT_COMMUNICATOR = 2;

	/**
	 * The feature id for the '<em><b>Communication Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMUNICATOR__COMMUNICATION_PARTICIPANTS = 0;

	/**
	 * The number of structural features of the '<em>Direct Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMUNICATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Direct Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMUNICATOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator <em>Network Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Communicator</em>'.
	 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator
	 * @generated
	 */
	EClass getNetworkCommunicator();

	/**
	 * Returns the meta object for class '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkConnector <em>Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connector</em>'.
	 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkConnector
	 * @generated
	 */
	EClass getNetworkConnector();

	/**
	 * Returns the meta object for class '{@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator <em>Direct Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Communicator</em>'.
	 * @see org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator
	 * @generated
	 */
	EClass getDirectCommunicator();

	/**
	 * Returns the meta object for the reference list '{@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator#getCommunicationParticipants <em>Communication Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Participants</em>'.
	 * @see org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator#getCommunicationParticipants()
	 * @see #getDirectCommunicator()
	 * @generated
	 */
	EReference getDirectCommunicator_CommunicationParticipants();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationFactory getCommunicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator <em>Network Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator
		 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getNetworkCommunicator()
		 * @generated
		 */
		EClass NETWORK_COMMUNICATOR = eINSTANCE.getNetworkCommunicator();

		/**
		 * The meta object literal for the '{@link org.sharedmobility.domainmodel.smdm.communication.NetworkConnector <em>Network Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sharedmobility.domainmodel.smdm.communication.NetworkConnector
		 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getNetworkConnector()
		 * @generated
		 */
		EClass NETWORK_CONNECTOR = eINSTANCE.getNetworkConnector();

		/**
		 * The meta object literal for the '{@link org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator <em>Direct Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator
		 * @see org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl#getDirectCommunicator()
		 * @generated
		 */
		EClass DIRECT_COMMUNICATOR = eINSTANCE.getDirectCommunicator();

		/**
		 * The meta object literal for the '<em><b>Communication Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_COMMUNICATOR__COMMUNICATION_PARTICIPANTS = eINSTANCE
				.getDirectCommunicator_CommunicationParticipants();

	}

} //CommunicationPackage
