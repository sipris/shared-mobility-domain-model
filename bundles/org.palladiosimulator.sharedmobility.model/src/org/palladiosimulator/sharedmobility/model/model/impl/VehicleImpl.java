/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.sharedmobility.model.model.Driver;
import org.palladiosimulator.sharedmobility.model.model.NetworkCommunicator;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;
import org.palladiosimulator.sharedmobility.model.model.User;
import org.palladiosimulator.sharedmobility.model.model.Vehicle;

import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getAdditionalOptions <em>Additional Options</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.VehicleImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VehicleImpl extends DirectCommunicatorImpl implements Vehicle {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> passengers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected Driver driver;

	/**
	 * The cached value of the '{@link #getAdditionalOptions() <em>Additional Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> additionalOptions;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmobilityModelPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.VEHICLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<User> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectResolvingEList<User>(User.class, this, SharedmobilityModelPackage.VEHICLE__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.VEHICLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver getDriver() {
		if (driver != null && driver.eIsProxy()) {
			InternalEObject oldDriver = (InternalEObject)driver;
			driver = (Driver)eResolveProxy(oldDriver);
			if (driver != oldDriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SharedmobilityModelPackage.VEHICLE__DRIVER, oldDriver, driver));
			}
		}
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver basicGetDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(Driver newDriver) {
		Driver oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.VEHICLE__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAdditionalOptions() {
		if (additionalOptions == null) {
			additionalOptions = new EDataTypeUniqueEList<String>(String.class, this, SharedmobilityModelPackage.VEHICLE__ADDITIONAL_OPTIONS);
		}
		return additionalOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.VEHICLE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedmobilityModelPackage.VEHICLE__ID:
				return getId();
			case SharedmobilityModelPackage.VEHICLE__PASSENGERS:
				return getPassengers();
			case SharedmobilityModelPackage.VEHICLE__NAME:
				return getName();
			case SharedmobilityModelPackage.VEHICLE__DRIVER:
				if (resolve) return getDriver();
				return basicGetDriver();
			case SharedmobilityModelPackage.VEHICLE__ADDITIONAL_OPTIONS:
				return getAdditionalOptions();
			case SharedmobilityModelPackage.VEHICLE__CAPACITY:
				return getCapacity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SharedmobilityModelPackage.VEHICLE__ID:
				setId((String)newValue);
				return;
			case SharedmobilityModelPackage.VEHICLE__PASSENGERS:
				getPassengers().clear();
				getPassengers().addAll((Collection<? extends User>)newValue);
				return;
			case SharedmobilityModelPackage.VEHICLE__NAME:
				setName((String)newValue);
				return;
			case SharedmobilityModelPackage.VEHICLE__DRIVER:
				setDriver((Driver)newValue);
				return;
			case SharedmobilityModelPackage.VEHICLE__ADDITIONAL_OPTIONS:
				getAdditionalOptions().clear();
				getAdditionalOptions().addAll((Collection<? extends String>)newValue);
				return;
			case SharedmobilityModelPackage.VEHICLE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SharedmobilityModelPackage.VEHICLE__ID:
				setId(ID_EDEFAULT);
				return;
			case SharedmobilityModelPackage.VEHICLE__PASSENGERS:
				getPassengers().clear();
				return;
			case SharedmobilityModelPackage.VEHICLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SharedmobilityModelPackage.VEHICLE__DRIVER:
				setDriver((Driver)null);
				return;
			case SharedmobilityModelPackage.VEHICLE__ADDITIONAL_OPTIONS:
				getAdditionalOptions().clear();
				return;
			case SharedmobilityModelPackage.VEHICLE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SharedmobilityModelPackage.VEHICLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SharedmobilityModelPackage.VEHICLE__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
			case SharedmobilityModelPackage.VEHICLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SharedmobilityModelPackage.VEHICLE__DRIVER:
				return driver != null;
			case SharedmobilityModelPackage.VEHICLE__ADDITIONAL_OPTIONS:
				return additionalOptions != null && !additionalOptions.isEmpty();
			case SharedmobilityModelPackage.VEHICLE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
				case SharedmobilityModelPackage.VEHICLE__ID: return IdentifierPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == NetworkCommunicator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
				case IdentifierPackage.IDENTIFIER__ID: return SharedmobilityModelPackage.VEHICLE__ID;
				default: return -1;
			}
		}
		if (baseClass == NetworkCommunicator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", additionalOptions: ");
		result.append(additionalOptions);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
