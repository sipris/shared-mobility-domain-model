/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

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
 * @see org.palladiosimulator.sharedmobility.model.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/palladiosimulator/sharedmobility/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.palladiosimulator.sharedmobility.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Parpicipants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PARPICIPANTS = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ATTACKER = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ParticipantImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONNECTIONS = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__FIRST_NAME = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__LAST_NAME = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.DriverImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ID = PARTICIPANT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ENTITY_NAME = PARTICIPANT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CONNECTIONS = PARTICIPANT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__FIRST_NAME = PARTICIPANT__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__LAST_NAME = PARTICIPANT__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Drives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVES = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.UserImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = PARTICIPANT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENTITY_NAME = PARTICIPANT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONNECTIONS = PARTICIPANT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = PARTICIPANT__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = PARTICIPANT__LAST_NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.AttackerImpl <em>Attacker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.AttackerImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getAttacker()
	 * @generated
	 */
	int ATTACKER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DirectCommunicatorImpl <em>Direct Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.DirectCommunicatorImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDirectCommunicator()
	 * @generated
	 */
	int DIRECT_COMMUNICATOR = 21;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMUNICATOR__CONNECTIONS = 0;

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
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CONNECTIONS = DIRECT_COMMUNICATOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = DIRECT_COMMUNICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PASSENGERS = DIRECT_COMMUNICATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = DIRECT_COMMUNICATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__DRIVER = DIRECT_COMMUNICATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Additional Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ADDITIONAL_OPTIONS = DIRECT_COMMUNICATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CAPACITY = DIRECT_COMMUNICATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = DIRECT_COMMUNICATOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = DIRECT_COMMUNICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.CarImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 6;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__CONNECTIONS = VEHICLE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ID = VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PASSENGERS = VEHICLE__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__DRIVER = VEHICLE__DRIVER;

	/**
	 * The feature id for the '<em><b>Additional Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ADDITIONAL_OPTIONS = VEHICLE__ADDITIONAL_OPTIONS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__CAPACITY = VEHICLE__CAPACITY;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.VanImpl <em>Van</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.VanImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getVan()
	 * @generated
	 */
	int VAN = 7;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__CONNECTIONS = VEHICLE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__ID = VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__PASSENGERS = VEHICLE__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__DRIVER = VEHICLE__DRIVER;

	/**
	 * The feature id for the '<em><b>Additional Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__ADDITIONAL_OPTIONS = VEHICLE__ADDITIONAL_OPTIONS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN__CAPACITY = VEHICLE__CAPACITY;

	/**
	 * The number of structural features of the '<em>Van</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Van</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAN_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl <em>Mobility Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getMobilityServiceProvider()
	 * @generated
	 */
	int MOBILITY_SERVICE_PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER__NAME = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER__DRIVERS = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fleet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER__FLEET = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mobility Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mobility Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_SERVICE_PROVIDER_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RidePoolingProviderImpl <em>Ride Pooling Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.RidePoolingProviderImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRidePoolingProvider()
	 * @generated
	 */
	int RIDE_POOLING_PROVIDER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER__ID = MOBILITY_SERVICE_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER__ENTITY_NAME = MOBILITY_SERVICE_PROVIDER__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER__NAME = MOBILITY_SERVICE_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER__DRIVERS = MOBILITY_SERVICE_PROVIDER__DRIVERS;

	/**
	 * The feature id for the '<em><b>Fleet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER__FLEET = MOBILITY_SERVICE_PROVIDER__FLEET;

	/**
	 * The number of structural features of the '<em>Ride Pooling Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER_FEATURE_COUNT = MOBILITY_SERVICE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ride Pooling Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_POOLING_PROVIDER_OPERATION_COUNT = MOBILITY_SERVICE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.CarpoolingProviderImpl <em>Carpooling Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.CarpoolingProviderImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getCarpoolingProvider()
	 * @generated
	 */
	int CARPOOLING_PROVIDER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER__ID = MOBILITY_SERVICE_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER__ENTITY_NAME = MOBILITY_SERVICE_PROVIDER__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER__NAME = MOBILITY_SERVICE_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER__DRIVERS = MOBILITY_SERVICE_PROVIDER__DRIVERS;

	/**
	 * The feature id for the '<em><b>Fleet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER__FLEET = MOBILITY_SERVICE_PROVIDER__FLEET;

	/**
	 * The number of structural features of the '<em>Carpooling Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER_FEATURE_COUNT = MOBILITY_SERVICE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carpooling Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPOOLING_PROVIDER_OPERATION_COUNT = MOBILITY_SERVICE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ReservationService_Impl <em>Reservation Service </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ReservationService_Impl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getReservationService_()
	 * @generated
	 */
	int RESERVATION_SERVICE_ = 11;

	/**
	 * The number of structural features of the '<em>Reservation Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_SERVICE__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reservation Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_SERVICE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.PaymentService_Impl <em>Payment Service </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.PaymentService_Impl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getPaymentService_()
	 * @generated
	 */
	int PAYMENT_SERVICE_ = 12;

	/**
	 * The number of structural features of the '<em>Payment Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SERVICE__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Payment Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SERVICE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.FleetMaintainigService_Impl <em>Fleet Maintainig Service </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.FleetMaintainigService_Impl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getFleetMaintainigService_()
	 * @generated
	 */
	int FLEET_MAINTAINIG_SERVICE_ = 13;

	/**
	 * The number of structural features of the '<em>Fleet Maintainig Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_MAINTAINIG_SERVICE__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fleet Maintainig Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_MAINTAINIG_SERVICE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RegistrationService_Impl <em>Registration Service </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.RegistrationService_Impl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRegistrationService_()
	 * @generated
	 */
	int REGISTRATION_SERVICE_ = 14;

	/**
	 * The number of structural features of the '<em>Registration Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_SERVICE__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Registration Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_SERVICE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.MatchingService_Impl <em>Matching Service </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.MatchingService_Impl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getMatchingService_()
	 * @generated
	 */
	int MATCHING_SERVICE_ = 15;

	/**
	 * The number of structural features of the '<em>Matching Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_SERVICE__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Matching Service </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_SERVICE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.PublicAgencyImpl <em>Public Agency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.PublicAgencyImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getPublicAgency()
	 * @generated
	 */
	int PUBLIC_AGENCY = 16;

	/**
	 * The feature id for the '<em><b>Managed Roadside Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Public Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_AGENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Public Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_AGENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RoadsideUnitImpl <em>Roadside Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.RoadsideUnitImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRoadsideUnit()
	 * @generated
	 */
	int ROADSIDE_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADSIDE_UNIT__CONNECTIONS = DIRECT_COMMUNICATOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADSIDE_UNIT__ID = DIRECT_COMMUNICATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Roadside Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADSIDE_UNIT_FEATURE_COUNT = DIRECT_COMMUNICATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Roadside Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADSIDE_UNIT_OPERATION_COUNT = DIRECT_COMMUNICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.TraficLightImpl <em>Trafic Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.TraficLightImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getTraficLight()
	 * @generated
	 */
	int TRAFIC_LIGHT = 18;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_LIGHT__CONNECTIONS = ROADSIDE_UNIT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_LIGHT__ID = ROADSIDE_UNIT__ID;

	/**
	 * The number of structural features of the '<em>Trafic Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_LIGHT_FEATURE_COUNT = ROADSIDE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trafic Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_LIGHT_OPERATION_COUNT = ROADSIDE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.SpeedLimitImpl <em>Speed Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.SpeedLimitImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getSpeedLimit()
	 * @generated
	 */
	int SPEED_LIMIT = 19;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_LIMIT__CONNECTIONS = ROADSIDE_UNIT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_LIMIT__ID = ROADSIDE_UNIT__ID;

	/**
	 * The number of structural features of the '<em>Speed Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_LIMIT_FEATURE_COUNT = ROADSIDE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speed Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_LIMIT_OPERATION_COUNT = ROADSIDE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.NetworkConnectorImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getNetworkConnector()
	 * @generated
	 */
	int NETWORK_CONNECTOR = 20;

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
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.NetworkCommunicatorImpl <em>Network Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.NetworkCommunicatorImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getNetworkCommunicator()
	 * @generated
	 */
	int NETWORK_COMMUNICATOR = 22;

	/**
	 * The number of structural features of the '<em>Network Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_COMMUNICATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Network Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_COMMUNICATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ServicesImpl
	 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 23;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.sharedmobility.model.model.Domain#getParpicipants <em>Parpicipants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parpicipants</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain#getParpicipants()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Parpicipants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.sharedmobility.model.model.Domain#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain#getVehicle()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Vehicle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.sharedmobility.model.model.Domain#getAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attacker</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain#getAttacker()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Attacker();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.sharedmobility.model.model.Domain#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain#getProvider()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Provider();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.sharedmobility.model.model.Participant#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Participant#getFirstName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.sharedmobility.model.model.Participant#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Participant#getLastName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_LastName();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.sharedmobility.model.model.Driver#getDrives <em>Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drives</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Driver#getDrives()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Drives();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Attacker
	 * @generated
	 */
	EClass getAttacker();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passengers</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle#getPassengers()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle#getDriver()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Driver();

	/**
	 * Returns the meta object for the attribute list '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getAdditionalOptions <em>Additional Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Options</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle#getAdditionalOptions()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_AdditionalOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle#getCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Capacity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Van <em>Van</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Van</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Van
	 * @generated
	 */
	EClass getVan();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider <em>Mobility Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Service Provider</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider
	 * @generated
	 */
	EClass getMobilityServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getName()
	 * @see #getMobilityServiceProvider()
	 * @generated
	 */
	EAttribute getMobilityServiceProvider_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getDrivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Drivers</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getDrivers()
	 * @see #getMobilityServiceProvider()
	 * @generated
	 */
	EReference getMobilityServiceProvider_Drivers();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getFleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fleet</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getFleet()
	 * @see #getMobilityServiceProvider()
	 * @generated
	 */
	EReference getMobilityServiceProvider_Fleet();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider <em>Ride Pooling Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ride Pooling Provider</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider
	 * @generated
	 */
	EClass getRidePoolingProvider();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider <em>Carpooling Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carpooling Provider</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider
	 * @generated
	 */
	EClass getCarpoolingProvider();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.ReservationService_ <em>Reservation Service </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Service </em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.ReservationService_
	 * @generated
	 */
	EClass getReservationService_();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.PaymentService_ <em>Payment Service </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Service </em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.PaymentService_
	 * @generated
	 */
	EClass getPaymentService_();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.FleetMaintainigService_ <em>Fleet Maintainig Service </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fleet Maintainig Service </em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.FleetMaintainigService_
	 * @generated
	 */
	EClass getFleetMaintainigService_();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.RegistrationService_ <em>Registration Service </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Service </em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.RegistrationService_
	 * @generated
	 */
	EClass getRegistrationService_();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.MatchingService_ <em>Matching Service </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Service </em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.MatchingService_
	 * @generated
	 */
	EClass getMatchingService_();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.PublicAgency <em>Public Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Agency</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.PublicAgency
	 * @generated
	 */
	EClass getPublicAgency();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.sharedmobility.model.model.PublicAgency#getManagedRoadsideUnits <em>Managed Roadside Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Roadside Units</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.PublicAgency#getManagedRoadsideUnits()
	 * @see #getPublicAgency()
	 * @generated
	 */
	EReference getPublicAgency_ManagedRoadsideUnits();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.RoadsideUnit <em>Roadside Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roadside Unit</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.RoadsideUnit
	 * @generated
	 */
	EClass getRoadsideUnit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.TraficLight <em>Trafic Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trafic Light</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.TraficLight
	 * @generated
	 */
	EClass getTraficLight();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.SpeedLimit <em>Speed Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Limit</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.SpeedLimit
	 * @generated
	 */
	EClass getSpeedLimit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.NetworkConnector <em>Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connector</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.NetworkConnector
	 * @generated
	 */
	EClass getNetworkConnector();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.DirectCommunicator <em>Direct Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Communicator</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.DirectCommunicator
	 * @generated
	 */
	EClass getDirectCommunicator();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.sharedmobility.model.model.DirectCommunicator#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.DirectCommunicator#getConnections()
	 * @see #getDirectCommunicator()
	 * @generated
	 */
	EReference getDirectCommunicator_Connections();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator <em>Network Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Communicator</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator
	 * @generated
	 */
	EClass getNetworkCommunicator();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.sharedmobility.model.model.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see org.palladiosimulator.sharedmobility.model.model.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Parpicipants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PARPICIPANTS = eINSTANCE.getDomain_Parpicipants();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__VEHICLE = eINSTANCE.getDomain_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Attacker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ATTACKER = eINSTANCE.getDomain_Attacker();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PROVIDER = eINSTANCE.getDomain_Provider();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ParticipantImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__FIRST_NAME = eINSTANCE.getParticipant_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__LAST_NAME = eINSTANCE.getParticipant_LastName();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.DriverImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Drives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__DRIVES = eINSTANCE.getDriver_Drives();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.UserImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.AttackerImpl <em>Attacker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.AttackerImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getAttacker()
		 * @generated
		 */
		EClass ATTACKER = eINSTANCE.getAttacker();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__PASSENGERS = eINSTANCE.getVehicle_Passengers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__DRIVER = eINSTANCE.getVehicle_Driver();

		/**
		 * The meta object literal for the '<em><b>Additional Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ADDITIONAL_OPTIONS = eINSTANCE.getVehicle_AdditionalOptions();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__CAPACITY = eINSTANCE.getVehicle_Capacity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.CarImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.VanImpl <em>Van</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.VanImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getVan()
		 * @generated
		 */
		EClass VAN = eINSTANCE.getVan();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl <em>Mobility Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getMobilityServiceProvider()
		 * @generated
		 */
		EClass MOBILITY_SERVICE_PROVIDER = eINSTANCE.getMobilityServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILITY_SERVICE_PROVIDER__NAME = eINSTANCE.getMobilityServiceProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_SERVICE_PROVIDER__DRIVERS = eINSTANCE.getMobilityServiceProvider_Drivers();

		/**
		 * The meta object literal for the '<em><b>Fleet</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_SERVICE_PROVIDER__FLEET = eINSTANCE.getMobilityServiceProvider_Fleet();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RidePoolingProviderImpl <em>Ride Pooling Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.RidePoolingProviderImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRidePoolingProvider()
		 * @generated
		 */
		EClass RIDE_POOLING_PROVIDER = eINSTANCE.getRidePoolingProvider();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.CarpoolingProviderImpl <em>Carpooling Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.CarpoolingProviderImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getCarpoolingProvider()
		 * @generated
		 */
		EClass CARPOOLING_PROVIDER = eINSTANCE.getCarpoolingProvider();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ReservationService_Impl <em>Reservation Service </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ReservationService_Impl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getReservationService_()
		 * @generated
		 */
		EClass RESERVATION_SERVICE_ = eINSTANCE.getReservationService_();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.PaymentService_Impl <em>Payment Service </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.PaymentService_Impl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getPaymentService_()
		 * @generated
		 */
		EClass PAYMENT_SERVICE_ = eINSTANCE.getPaymentService_();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.FleetMaintainigService_Impl <em>Fleet Maintainig Service </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.FleetMaintainigService_Impl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getFleetMaintainigService_()
		 * @generated
		 */
		EClass FLEET_MAINTAINIG_SERVICE_ = eINSTANCE.getFleetMaintainigService_();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RegistrationService_Impl <em>Registration Service </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.RegistrationService_Impl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRegistrationService_()
		 * @generated
		 */
		EClass REGISTRATION_SERVICE_ = eINSTANCE.getRegistrationService_();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.MatchingService_Impl <em>Matching Service </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.MatchingService_Impl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getMatchingService_()
		 * @generated
		 */
		EClass MATCHING_SERVICE_ = eINSTANCE.getMatchingService_();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.PublicAgencyImpl <em>Public Agency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.PublicAgencyImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getPublicAgency()
		 * @generated
		 */
		EClass PUBLIC_AGENCY = eINSTANCE.getPublicAgency();

		/**
		 * The meta object literal for the '<em><b>Managed Roadside Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS = eINSTANCE.getPublicAgency_ManagedRoadsideUnits();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.RoadsideUnitImpl <em>Roadside Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.RoadsideUnitImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getRoadsideUnit()
		 * @generated
		 */
		EClass ROADSIDE_UNIT = eINSTANCE.getRoadsideUnit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.TraficLightImpl <em>Trafic Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.TraficLightImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getTraficLight()
		 * @generated
		 */
		EClass TRAFIC_LIGHT = eINSTANCE.getTraficLight();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.SpeedLimitImpl <em>Speed Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.SpeedLimitImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getSpeedLimit()
		 * @generated
		 */
		EClass SPEED_LIMIT = eINSTANCE.getSpeedLimit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.NetworkConnectorImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getNetworkConnector()
		 * @generated
		 */
		EClass NETWORK_CONNECTOR = eINSTANCE.getNetworkConnector();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.DirectCommunicatorImpl <em>Direct Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.DirectCommunicatorImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getDirectCommunicator()
		 * @generated
		 */
		EClass DIRECT_COMMUNICATOR = eINSTANCE.getDirectCommunicator();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_COMMUNICATOR__CONNECTIONS = eINSTANCE.getDirectCommunicator_Connections();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.NetworkCommunicatorImpl <em>Network Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.NetworkCommunicatorImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getNetworkCommunicator()
		 * @generated
		 */
		EClass NETWORK_COMMUNICATOR = eINSTANCE.getNetworkCommunicator();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.sharedmobility.model.model.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ServicesImpl
		 * @see org.palladiosimulator.sharedmobility.model.model.impl.ModelPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

	}

} //ModelPackage
