/**
 */
package org.palladiosimulator.sharedmobility.model.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.sharedmobility.model.model.*;

import tools.mdsd.modelingfoundations.identifier.Entity;
import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.sharedmobility.model.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseDriver(Driver object) {
				return createDriverAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseAttacker(Attacker object) {
				return createAttackerAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseCar(Car object) {
				return createCarAdapter();
			}
			@Override
			public Adapter caseVan(Van object) {
				return createVanAdapter();
			}
			@Override
			public Adapter caseMobilityServiceProvider(MobilityServiceProvider object) {
				return createMobilityServiceProviderAdapter();
			}
			@Override
			public Adapter caseRidePoolingProvider(RidePoolingProvider object) {
				return createRidePoolingProviderAdapter();
			}
			@Override
			public Adapter caseCarpoolingProvider(CarpoolingProvider object) {
				return createCarpoolingProviderAdapter();
			}
			@Override
			public Adapter caseReservationService_(ReservationService_ object) {
				return createReservationService_Adapter();
			}
			@Override
			public Adapter casePaymentService_(PaymentService_ object) {
				return createPaymentService_Adapter();
			}
			@Override
			public Adapter caseFleetMaintainigService_(FleetMaintainigService_ object) {
				return createFleetMaintainigService_Adapter();
			}
			@Override
			public Adapter caseRegistrationService_(RegistrationService_ object) {
				return createRegistrationService_Adapter();
			}
			@Override
			public Adapter caseMatchingService_(MatchingService_ object) {
				return createMatchingService_Adapter();
			}
			@Override
			public Adapter casePublicAgency(PublicAgency object) {
				return createPublicAgencyAdapter();
			}
			@Override
			public Adapter caseRoadsideUnit(RoadsideUnit object) {
				return createRoadsideUnitAdapter();
			}
			@Override
			public Adapter caseTraficLight(TraficLight object) {
				return createTraficLightAdapter();
			}
			@Override
			public Adapter caseSpeedLimit(SpeedLimit object) {
				return createSpeedLimitAdapter();
			}
			@Override
			public Adapter caseNetworkConnector(NetworkConnector object) {
				return createNetworkConnectorAdapter();
			}
			@Override
			public Adapter caseDirectCommunicator(DirectCommunicator object) {
				return createDirectCommunicatorAdapter();
			}
			@Override
			public Adapter caseNetworkCommunicator(NetworkCommunicator object) {
				return createNetworkCommunicatorAdapter();
			}
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Attacker
	 * @generated
	 */
	public Adapter createAttackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Car
	 * @generated
	 */
	public Adapter createCarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Van <em>Van</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Van
	 * @generated
	 */
	public Adapter createVanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider <em>Mobility Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider
	 * @generated
	 */
	public Adapter createMobilityServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider <em>Ride Pooling Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider
	 * @generated
	 */
	public Adapter createRidePoolingProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider <em>Carpooling Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider
	 * @generated
	 */
	public Adapter createCarpoolingProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.ReservationService_ <em>Reservation Service </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.ReservationService_
	 * @generated
	 */
	public Adapter createReservationService_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.PaymentService_ <em>Payment Service </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.PaymentService_
	 * @generated
	 */
	public Adapter createPaymentService_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.FleetMaintainigService_ <em>Fleet Maintainig Service </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.FleetMaintainigService_
	 * @generated
	 */
	public Adapter createFleetMaintainigService_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.RegistrationService_ <em>Registration Service </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.RegistrationService_
	 * @generated
	 */
	public Adapter createRegistrationService_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.MatchingService_ <em>Matching Service </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.MatchingService_
	 * @generated
	 */
	public Adapter createMatchingService_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.PublicAgency <em>Public Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.PublicAgency
	 * @generated
	 */
	public Adapter createPublicAgencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.RoadsideUnit <em>Roadside Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.RoadsideUnit
	 * @generated
	 */
	public Adapter createRoadsideUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.TraficLight <em>Trafic Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.TraficLight
	 * @generated
	 */
	public Adapter createTraficLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.SpeedLimit <em>Speed Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.SpeedLimit
	 * @generated
	 */
	public Adapter createSpeedLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.NetworkConnector <em>Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.NetworkConnector
	 * @generated
	 */
	public Adapter createNetworkConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.DirectCommunicator <em>Direct Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.DirectCommunicator
	 * @generated
	 */
	public Adapter createDirectCommunicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator <em>Network Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator
	 * @generated
	 */
	public Adapter createNetworkCommunicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.sharedmobility.model.model.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.sharedmobility.model.model.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
