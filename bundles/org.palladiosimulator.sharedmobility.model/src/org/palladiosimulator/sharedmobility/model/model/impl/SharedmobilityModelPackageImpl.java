/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.sharedmobility.model.model.Attacker;
import org.palladiosimulator.sharedmobility.model.model.Car;
import org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider;
import org.palladiosimulator.sharedmobility.model.model.DirectCommunicator;
import org.palladiosimulator.sharedmobility.model.model.Domain;
import org.palladiosimulator.sharedmobility.model.model.Driver;
import org.palladiosimulator.sharedmobility.model.model.FleetMaintainigService_;
import org.palladiosimulator.sharedmobility.model.model.MatchingService_;
import org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider;
import org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator;
import org.palladiosimulator.sharedmobility.model.model.NetworkConnector;
import org.palladiosimulator.sharedmobility.model.model.Participant;
import org.palladiosimulator.sharedmobility.model.model.PaymentService_;
import org.palladiosimulator.sharedmobility.model.model.PublicAgency;
import org.palladiosimulator.sharedmobility.model.model.RegistrationService_;
import org.palladiosimulator.sharedmobility.model.model.ReservationService_;
import org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider;
import org.palladiosimulator.sharedmobility.model.model.RoadsideUnit;
import org.palladiosimulator.sharedmobility.model.model.Services;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;
import org.palladiosimulator.sharedmobility.model.model.SpeedLimit;
import org.palladiosimulator.sharedmobility.model.model.TraficLight;
import org.palladiosimulator.sharedmobility.model.model.User;
import org.palladiosimulator.sharedmobility.model.model.Van;
import org.palladiosimulator.sharedmobility.model.model.Vehicle;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedmobilityModelPackageImpl extends EPackageImpl implements SharedmobilityModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilityServiceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ridePoolingProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carpoolingProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationService_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentService_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fleetMaintainigService_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationService_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingService_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicAgencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadsideUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traficLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directCommunicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkCommunicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SharedmobilityModelPackageImpl() {
		super(eNS_URI, SharedmobilityModelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SharedmobilityModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SharedmobilityModelPackage init() {
		if (isInited) return (SharedmobilityModelPackage)EPackage.Registry.INSTANCE.getEPackage(SharedmobilityModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSharedmobilityModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SharedmobilityModelPackageImpl theSharedmobilityModelPackage = registeredSharedmobilityModelPackage instanceof SharedmobilityModelPackageImpl ? (SharedmobilityModelPackageImpl)registeredSharedmobilityModelPackage : new SharedmobilityModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSharedmobilityModelPackage.createPackageContents();

		// Initialize created meta-data
		theSharedmobilityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSharedmobilityModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SharedmobilityModelPackage.eNS_URI, theSharedmobilityModelPackage);
		return theSharedmobilityModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Parpicipants() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Vehicle() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Attacker() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Provider() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_FirstName() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_LastName() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_Drives() {
		return (EReference)driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttacker() {
		return attackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Passengers() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Name() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Driver() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_AdditionalOptions() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Capacity() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCar() {
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVan() {
		return vanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilityServiceProvider() {
		return mobilityServiceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilityServiceProvider_Name() {
		return (EAttribute)mobilityServiceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityServiceProvider_Drivers() {
		return (EReference)mobilityServiceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityServiceProvider_Fleet() {
		return (EReference)mobilityServiceProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRidePoolingProvider() {
		return ridePoolingProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarpoolingProvider() {
		return carpoolingProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationService_() {
		return reservationService_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentService_() {
		return paymentService_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFleetMaintainigService_() {
		return fleetMaintainigService_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationService_() {
		return registrationService_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingService_() {
		return matchingService_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicAgency() {
		return publicAgencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicAgency_ManagedRoadsideUnits() {
		return (EReference)publicAgencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadsideUnit() {
		return roadsideUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraficLight() {
		return traficLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedLimit() {
		return speedLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkConnector() {
		return networkConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectCommunicator() {
		return directCommunicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectCommunicator_Connections() {
		return (EReference)directCommunicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkCommunicator() {
		return networkCommunicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedmobilityModelFactory getSharedmobilityModelFactory() {
		return (SharedmobilityModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__PARPICIPANTS);
		createEReference(domainEClass, DOMAIN__VEHICLE);
		createEReference(domainEClass, DOMAIN__ATTACKER);
		createEReference(domainEClass, DOMAIN__PROVIDER);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__FIRST_NAME);
		createEAttribute(participantEClass, PARTICIPANT__LAST_NAME);

		driverEClass = createEClass(DRIVER);
		createEReference(driverEClass, DRIVER__DRIVES);

		userEClass = createEClass(USER);

		attackerEClass = createEClass(ATTACKER);

		vehicleEClass = createEClass(VEHICLE);
		createEReference(vehicleEClass, VEHICLE__PASSENGERS);
		createEAttribute(vehicleEClass, VEHICLE__NAME);
		createEReference(vehicleEClass, VEHICLE__DRIVER);
		createEAttribute(vehicleEClass, VEHICLE__ADDITIONAL_OPTIONS);
		createEAttribute(vehicleEClass, VEHICLE__CAPACITY);

		carEClass = createEClass(CAR);

		vanEClass = createEClass(VAN);

		mobilityServiceProviderEClass = createEClass(MOBILITY_SERVICE_PROVIDER);
		createEAttribute(mobilityServiceProviderEClass, MOBILITY_SERVICE_PROVIDER__NAME);
		createEReference(mobilityServiceProviderEClass, MOBILITY_SERVICE_PROVIDER__DRIVERS);
		createEReference(mobilityServiceProviderEClass, MOBILITY_SERVICE_PROVIDER__FLEET);

		ridePoolingProviderEClass = createEClass(RIDE_POOLING_PROVIDER);

		carpoolingProviderEClass = createEClass(CARPOOLING_PROVIDER);

		reservationService_EClass = createEClass(RESERVATION_SERVICE_);

		paymentService_EClass = createEClass(PAYMENT_SERVICE_);

		fleetMaintainigService_EClass = createEClass(FLEET_MAINTAINIG_SERVICE_);

		registrationService_EClass = createEClass(REGISTRATION_SERVICE_);

		matchingService_EClass = createEClass(MATCHING_SERVICE_);

		publicAgencyEClass = createEClass(PUBLIC_AGENCY);
		createEReference(publicAgencyEClass, PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS);

		roadsideUnitEClass = createEClass(ROADSIDE_UNIT);

		traficLightEClass = createEClass(TRAFIC_LIGHT);

		speedLimitEClass = createEClass(SPEED_LIMIT);

		networkConnectorEClass = createEClass(NETWORK_CONNECTOR);

		directCommunicatorEClass = createEClass(DIRECT_COMMUNICATOR);
		createEReference(directCommunicatorEClass, DIRECT_COMMUNICATOR__CONNECTIONS);

		networkCommunicatorEClass = createEClass(NETWORK_COMMUNICATOR);

		servicesEClass = createEClass(SERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		participantEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		participantEClass.getESuperTypes().add(this.getNetworkCommunicator());
		participantEClass.getESuperTypes().add(this.getDirectCommunicator());
		driverEClass.getESuperTypes().add(this.getParticipant());
		userEClass.getESuperTypes().add(this.getParticipant());
		attackerEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		vehicleEClass.getESuperTypes().add(this.getDirectCommunicator());
		vehicleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		vehicleEClass.getESuperTypes().add(this.getNetworkCommunicator());
		carEClass.getESuperTypes().add(this.getVehicle());
		vanEClass.getESuperTypes().add(this.getVehicle());
		mobilityServiceProviderEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		ridePoolingProviderEClass.getESuperTypes().add(this.getMobilityServiceProvider());
		carpoolingProviderEClass.getESuperTypes().add(this.getMobilityServiceProvider());
		roadsideUnitEClass.getESuperTypes().add(this.getDirectCommunicator());
		roadsideUnitEClass.getESuperTypes().add(this.getNetworkCommunicator());
		roadsideUnitEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		traficLightEClass.getESuperTypes().add(this.getRoadsideUnit());
		speedLimitEClass.getESuperTypes().add(this.getRoadsideUnit());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Parpicipants(), this.getParticipant(), null, "parpicipants", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Vehicle(), this.getVehicle(), null, "vehicle", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Attacker(), this.getAttacker(), null, "attacker", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Provider(), this.getMobilityServiceProvider(), null, "provider", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriver_Drives(), this.getVehicle(), null, "drives", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attackerEClass, Attacker.class, "Attacker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicle_Passengers(), this.getUser(), null, "passengers", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Driver(), this.getDriver(), null, "driver", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_AdditionalOptions(), ecorePackage.getEString(), "additionalOptions", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vanEClass, Van.class, "Van", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilityServiceProviderEClass, MobilityServiceProvider.class, "MobilityServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilityServiceProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobilityServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobilityServiceProvider_Drivers(), this.getDriver(), null, "drivers", null, 0, -1, MobilityServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobilityServiceProvider_Fleet(), this.getVehicle(), null, "fleet", null, 0, -1, MobilityServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ridePoolingProviderEClass, RidePoolingProvider.class, "RidePoolingProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(carpoolingProviderEClass, CarpoolingProvider.class, "CarpoolingProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reservationService_EClass, ReservationService_.class, "ReservationService_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paymentService_EClass, PaymentService_.class, "PaymentService_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fleetMaintainigService_EClass, FleetMaintainigService_.class, "FleetMaintainigService_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registrationService_EClass, RegistrationService_.class, "RegistrationService_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchingService_EClass, MatchingService_.class, "MatchingService_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicAgencyEClass, PublicAgency.class, "PublicAgency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicAgency_ManagedRoadsideUnits(), this.getRoadsideUnit(), null, "managedRoadsideUnits", null, 0, -1, PublicAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadsideUnitEClass, RoadsideUnit.class, "RoadsideUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traficLightEClass, TraficLight.class, "TraficLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speedLimitEClass, SpeedLimit.class, "SpeedLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkConnectorEClass, NetworkConnector.class, "NetworkConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directCommunicatorEClass, DirectCommunicator.class, "DirectCommunicator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectCommunicator_Connections(), this.getDirectCommunicator(), null, "connections", null, 0, -1, DirectCommunicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkCommunicatorEClass, NetworkCommunicator.class, "NetworkCommunicator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SharedmobilityModelPackageImpl
