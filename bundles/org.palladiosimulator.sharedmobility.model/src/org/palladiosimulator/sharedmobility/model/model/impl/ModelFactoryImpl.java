/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.sharedmobility.model.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.DOMAIN: return createDomain();
			case ModelPackage.PARTICIPANT: return createParticipant();
			case ModelPackage.DRIVER: return createDriver();
			case ModelPackage.USER: return createUser();
			case ModelPackage.ATTACKER: return createAttacker();
			case ModelPackage.CAR: return createCar();
			case ModelPackage.VAN: return createVan();
			case ModelPackage.MOBILITY_SERVICE_PROVIDER: return createMobilityServiceProvider();
			case ModelPackage.RIDE_POOLING_PROVIDER: return createRidePoolingProvider();
			case ModelPackage.CARPOOLING_PROVIDER: return createCarpoolingProvider();
			case ModelPackage.RESERVATION_SERVICE_: return createReservationService_();
			case ModelPackage.PAYMENT_SERVICE_: return createPaymentService_();
			case ModelPackage.FLEET_MAINTAINIG_SERVICE_: return createFleetMaintainigService_();
			case ModelPackage.REGISTRATION_SERVICE_: return createRegistrationService_();
			case ModelPackage.MATCHING_SERVICE_: return createMatchingService_();
			case ModelPackage.PUBLIC_AGENCY: return createPublicAgency();
			case ModelPackage.TRAFIC_LIGHT: return createTraficLight();
			case ModelPackage.SPEED_LIMIT: return createSpeedLimit();
			case ModelPackage.NETWORK_CONNECTOR: return createNetworkConnector();
			case ModelPackage.SERVICES: return createServices();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attacker createAttacker() {
		AttackerImpl attacker = new AttackerImpl();
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car createCar() {
		CarImpl car = new CarImpl();
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Van createVan() {
		VanImpl van = new VanImpl();
		return van;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityServiceProvider createMobilityServiceProvider() {
		MobilityServiceProviderImpl mobilityServiceProvider = new MobilityServiceProviderImpl();
		return mobilityServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RidePoolingProvider createRidePoolingProvider() {
		RidePoolingProviderImpl ridePoolingProvider = new RidePoolingProviderImpl();
		return ridePoolingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpoolingProvider createCarpoolingProvider() {
		CarpoolingProviderImpl carpoolingProvider = new CarpoolingProviderImpl();
		return carpoolingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationService_ createReservationService_() {
		ReservationService_Impl reservationService_ = new ReservationService_Impl();
		return reservationService_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentService_ createPaymentService_() {
		PaymentService_Impl paymentService_ = new PaymentService_Impl();
		return paymentService_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FleetMaintainigService_ createFleetMaintainigService_() {
		FleetMaintainigService_Impl fleetMaintainigService_ = new FleetMaintainigService_Impl();
		return fleetMaintainigService_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationService_ createRegistrationService_() {
		RegistrationService_Impl registrationService_ = new RegistrationService_Impl();
		return registrationService_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingService_ createMatchingService_() {
		MatchingService_Impl matchingService_ = new MatchingService_Impl();
		return matchingService_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicAgency createPublicAgency() {
		PublicAgencyImpl publicAgency = new PublicAgencyImpl();
		return publicAgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficLight createTraficLight() {
		TraficLightImpl traficLight = new TraficLightImpl();
		return traficLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedLimit createSpeedLimit() {
		SpeedLimitImpl speedLimit = new SpeedLimitImpl();
		return speedLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnector createNetworkConnector() {
		NetworkConnectorImpl networkConnector = new NetworkConnectorImpl();
		return networkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
