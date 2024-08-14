/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.sharedmobility.model.model.Driver;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;
import org.palladiosimulator.sharedmobility.model.model.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DriverImpl#getDrives <em>Drives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends ParticipantImpl implements Driver {
	/**
	 * The cached value of the '{@link #getDrives() <em>Drives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrives()
	 * @generated
	 * @ordered
	 */
	protected Vehicle drives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmobilityModelPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getDrives() {
		if (drives != null && drives.eIsProxy()) {
			InternalEObject oldDrives = (InternalEObject)drives;
			drives = (Vehicle)eResolveProxy(oldDrives);
			if (drives != oldDrives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SharedmobilityModelPackage.DRIVER__DRIVES, oldDrives, drives));
			}
		}
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetDrives() {
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrives(Vehicle newDrives) {
		Vehicle oldDrives = drives;
		drives = newDrives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedmobilityModelPackage.DRIVER__DRIVES, oldDrives, drives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedmobilityModelPackage.DRIVER__DRIVES:
				if (resolve) return getDrives();
				return basicGetDrives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SharedmobilityModelPackage.DRIVER__DRIVES:
				setDrives((Vehicle)newValue);
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
			case SharedmobilityModelPackage.DRIVER__DRIVES:
				setDrives((Vehicle)null);
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
			case SharedmobilityModelPackage.DRIVER__DRIVES:
				return drives != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl
