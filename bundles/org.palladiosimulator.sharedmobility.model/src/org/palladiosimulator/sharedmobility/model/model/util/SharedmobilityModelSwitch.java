/**
 */
package org.palladiosimulator.sharedmobility.model.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.sharedmobility.model.model.*;

import tools.mdsd.modelingfoundations.identifier.Entity;
import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage
 * @generated
 */
public class SharedmobilityModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SharedmobilityModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedmobilityModelSwitch() {
		if (modelPackage == null) {
			modelPackage = SharedmobilityModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SharedmobilityModelPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseEntity(participant);
				if (result == null) result = caseNetworkCommunicator(participant);
				if (result == null) result = caseDirectCommunicator(participant);
				if (result == null) result = caseIdentifier(participant);
				if (result == null) result = caseNamedElement(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.DRIVER: {
				Driver driver = (Driver)theEObject;
				T result = caseDriver(driver);
				if (result == null) result = caseParticipant(driver);
				if (result == null) result = caseEntity(driver);
				if (result == null) result = caseNetworkCommunicator(driver);
				if (result == null) result = caseDirectCommunicator(driver);
				if (result == null) result = caseIdentifier(driver);
				if (result == null) result = caseNamedElement(driver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseParticipant(user);
				if (result == null) result = caseEntity(user);
				if (result == null) result = caseNetworkCommunicator(user);
				if (result == null) result = caseDirectCommunicator(user);
				if (result == null) result = caseIdentifier(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.ATTACKER: {
				Attacker attacker = (Attacker)theEObject;
				T result = caseAttacker(attacker);
				if (result == null) result = caseEntity(attacker);
				if (result == null) result = caseIdentifier(attacker);
				if (result == null) result = caseNamedElement(attacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = caseDirectCommunicator(vehicle);
				if (result == null) result = caseIdentifier(vehicle);
				if (result == null) result = caseNetworkCommunicator(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.CAR: {
				Car car = (Car)theEObject;
				T result = caseCar(car);
				if (result == null) result = caseVehicle(car);
				if (result == null) result = caseDirectCommunicator(car);
				if (result == null) result = caseIdentifier(car);
				if (result == null) result = caseNetworkCommunicator(car);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.VAN: {
				Van van = (Van)theEObject;
				T result = caseVan(van);
				if (result == null) result = caseVehicle(van);
				if (result == null) result = caseDirectCommunicator(van);
				if (result == null) result = caseIdentifier(van);
				if (result == null) result = caseNetworkCommunicator(van);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER: {
				MobilityServiceProvider mobilityServiceProvider = (MobilityServiceProvider)theEObject;
				T result = caseMobilityServiceProvider(mobilityServiceProvider);
				if (result == null) result = caseEntity(mobilityServiceProvider);
				if (result == null) result = caseIdentifier(mobilityServiceProvider);
				if (result == null) result = caseNamedElement(mobilityServiceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.RIDE_POOLING_PROVIDER: {
				RidePoolingProvider ridePoolingProvider = (RidePoolingProvider)theEObject;
				T result = caseRidePoolingProvider(ridePoolingProvider);
				if (result == null) result = caseMobilityServiceProvider(ridePoolingProvider);
				if (result == null) result = caseEntity(ridePoolingProvider);
				if (result == null) result = caseIdentifier(ridePoolingProvider);
				if (result == null) result = caseNamedElement(ridePoolingProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.CARPOOLING_PROVIDER: {
				CarpoolingProvider carpoolingProvider = (CarpoolingProvider)theEObject;
				T result = caseCarpoolingProvider(carpoolingProvider);
				if (result == null) result = caseMobilityServiceProvider(carpoolingProvider);
				if (result == null) result = caseEntity(carpoolingProvider);
				if (result == null) result = caseIdentifier(carpoolingProvider);
				if (result == null) result = caseNamedElement(carpoolingProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.RESERVATION_SERVICE_: {
				ReservationService_ reservationService_ = (ReservationService_)theEObject;
				T result = caseReservationService_(reservationService_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.PAYMENT_SERVICE_: {
				PaymentService_ paymentService_ = (PaymentService_)theEObject;
				T result = casePaymentService_(paymentService_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.FLEET_MAINTAINIG_SERVICE_: {
				FleetMaintainigService_ fleetMaintainigService_ = (FleetMaintainigService_)theEObject;
				T result = caseFleetMaintainigService_(fleetMaintainigService_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.REGISTRATION_SERVICE_: {
				RegistrationService_ registrationService_ = (RegistrationService_)theEObject;
				T result = caseRegistrationService_(registrationService_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.MATCHING_SERVICE_: {
				MatchingService_ matchingService_ = (MatchingService_)theEObject;
				T result = caseMatchingService_(matchingService_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.PUBLIC_AGENCY: {
				PublicAgency publicAgency = (PublicAgency)theEObject;
				T result = casePublicAgency(publicAgency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.ROADSIDE_UNIT: {
				RoadsideUnit roadsideUnit = (RoadsideUnit)theEObject;
				T result = caseRoadsideUnit(roadsideUnit);
				if (result == null) result = caseDirectCommunicator(roadsideUnit);
				if (result == null) result = caseNetworkCommunicator(roadsideUnit);
				if (result == null) result = caseIdentifier(roadsideUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.TRAFIC_LIGHT: {
				TraficLight traficLight = (TraficLight)theEObject;
				T result = caseTraficLight(traficLight);
				if (result == null) result = caseRoadsideUnit(traficLight);
				if (result == null) result = caseDirectCommunicator(traficLight);
				if (result == null) result = caseNetworkCommunicator(traficLight);
				if (result == null) result = caseIdentifier(traficLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.SPEED_LIMIT: {
				SpeedLimit speedLimit = (SpeedLimit)theEObject;
				T result = caseSpeedLimit(speedLimit);
				if (result == null) result = caseRoadsideUnit(speedLimit);
				if (result == null) result = caseDirectCommunicator(speedLimit);
				if (result == null) result = caseNetworkCommunicator(speedLimit);
				if (result == null) result = caseIdentifier(speedLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.NETWORK_CONNECTOR: {
				NetworkConnector networkConnector = (NetworkConnector)theEObject;
				T result = caseNetworkConnector(networkConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.DIRECT_COMMUNICATOR: {
				DirectCommunicator directCommunicator = (DirectCommunicator)theEObject;
				T result = caseDirectCommunicator(directCommunicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.NETWORK_COMMUNICATOR: {
				NetworkCommunicator networkCommunicator = (NetworkCommunicator)theEObject;
				T result = caseNetworkCommunicator(networkCommunicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharedmobilityModelPackage.SERVICES: {
				Services services = (Services)theEObject;
				T result = caseServices(services);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriver(Driver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacker(Attacker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Car</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCar(Car object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Van</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Van</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVan(Van object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobility Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobility Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobilityServiceProvider(MobilityServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ride Pooling Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ride Pooling Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRidePoolingProvider(RidePoolingProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carpooling Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carpooling Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarpoolingProvider(CarpoolingProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Service </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Service </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationService_(ReservationService_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Service </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Service </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentService_(PaymentService_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fleet Maintainig Service </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fleet Maintainig Service </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFleetMaintainigService_(FleetMaintainigService_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration Service </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration Service </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrationService_(RegistrationService_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Service </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Service </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingService_(MatchingService_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Agency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Agency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicAgency(PublicAgency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roadside Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roadside Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoadsideUnit(RoadsideUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trafic Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trafic Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraficLight(TraficLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedLimit(SpeedLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConnector(NetworkConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Communicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectCommunicator(DirectCommunicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Communicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkCommunicator(NetworkCommunicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServices(Services object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SharedmobilityModelSwitch
