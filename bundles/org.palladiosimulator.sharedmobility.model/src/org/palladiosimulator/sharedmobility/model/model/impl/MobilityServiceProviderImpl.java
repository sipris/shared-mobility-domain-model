/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.sharedmobility.model.model.Driver;
import org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;
import org.palladiosimulator.sharedmobility.model.model.Vehicle;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobility Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.MobilityServiceProviderImpl#getFleet <em>Fleet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobilityServiceProviderImpl extends EntityImpl implements MobilityServiceProvider {
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
	 * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> drivers;

	/**
	 * The cached value of the '{@link #getFleet() <em>Fleet</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleet()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> fleet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilityServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmobilityModelPackage.Literals.MOBILITY_SERVICE_PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Driver> getDrivers() {
		if (drivers == null) {
			drivers = new EObjectResolvingEList<Driver>(Driver.class, this, SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__DRIVERS);
		}
		return drivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Vehicle> getFleet() {
		if (fleet == null) {
			fleet = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__FLEET);
		}
		return fleet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__NAME:
				return getName();
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__DRIVERS:
				return getDrivers();
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__FLEET:
				return getFleet();
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
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__NAME:
				setName((String)newValue);
				return;
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__DRIVERS:
				getDrivers().clear();
				getDrivers().addAll((Collection<? extends Driver>)newValue);
				return;
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__FLEET:
				getFleet().clear();
				getFleet().addAll((Collection<? extends Vehicle>)newValue);
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
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__DRIVERS:
				getDrivers().clear();
				return;
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__FLEET:
				getFleet().clear();
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
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__DRIVERS:
				return drivers != null && !drivers.isEmpty();
			case SharedmobilityModelPackage.MOBILITY_SERVICE_PROVIDER__FLEET:
				return fleet != null && !fleet.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MobilityServiceProviderImpl
