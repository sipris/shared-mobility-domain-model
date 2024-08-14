/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.sharedmobility.model.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.palladiosimulator.sharedmobility.model.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker</em>'.
	 * @generated
	 */
	Attacker createAttacker();

	/**
	 * Returns a new object of class '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car</em>'.
	 * @generated
	 */
	Car createCar();

	/**
	 * Returns a new object of class '<em>Van</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Van</em>'.
	 * @generated
	 */
	Van createVan();

	/**
	 * Returns a new object of class '<em>Mobility Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobility Service Provider</em>'.
	 * @generated
	 */
	MobilityServiceProvider createMobilityServiceProvider();

	/**
	 * Returns a new object of class '<em>Ride Pooling Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ride Pooling Provider</em>'.
	 * @generated
	 */
	RidePoolingProvider createRidePoolingProvider();

	/**
	 * Returns a new object of class '<em>Carpooling Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carpooling Provider</em>'.
	 * @generated
	 */
	CarpoolingProvider createCarpoolingProvider();

	/**
	 * Returns a new object of class '<em>Reservation Service </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Service </em>'.
	 * @generated
	 */
	ReservationService_ createReservationService_();

	/**
	 * Returns a new object of class '<em>Payment Service </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Service </em>'.
	 * @generated
	 */
	PaymentService_ createPaymentService_();

	/**
	 * Returns a new object of class '<em>Fleet Maintainig Service </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fleet Maintainig Service </em>'.
	 * @generated
	 */
	FleetMaintainigService_ createFleetMaintainigService_();

	/**
	 * Returns a new object of class '<em>Registration Service </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration Service </em>'.
	 * @generated
	 */
	RegistrationService_ createRegistrationService_();

	/**
	 * Returns a new object of class '<em>Matching Service </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Service </em>'.
	 * @generated
	 */
	MatchingService_ createMatchingService_();

	/**
	 * Returns a new object of class '<em>Public Agency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Agency</em>'.
	 * @generated
	 */
	PublicAgency createPublicAgency();

	/**
	 * Returns a new object of class '<em>Trafic Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trafic Light</em>'.
	 * @generated
	 */
	TraficLight createTraficLight();

	/**
	 * Returns a new object of class '<em>Speed Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed Limit</em>'.
	 * @generated
	 */
	SpeedLimit createSpeedLimit();

	/**
	 * Returns a new object of class '<em>Network Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Connector</em>'.
	 * @generated
	 */
	NetworkConnector createNetworkConnector();

	/**
	 * Returns a new object of class '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services</em>'.
	 * @generated
	 */
	Services createServices();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
