/**
 */
package model.impl;

import java.util.Collection;
import java.util.List;

import model.Attacker;
import model.Domain;
import model.Inspector;
import model.Passenger;
import model.Provider;
import model.SharedMobilityPackage;
import model.Vehicle;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DomainImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link model.impl.DomainImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link model.impl.DomainImpl#getInspector <em>Inspector</em>}</li>
 *   <li>{@link model.impl.DomainImpl#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link model.impl.DomainImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passenger;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicle;

	/**
	 * The cached value of the '{@link #getInspector() <em>Inspector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspector()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspector> inspector;

	/**
	 * The cached value of the '{@link #getAttacker() <em>Attacker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacker()
	 * @generated
	 * @ordered
	 */
	protected EList<Attacker> attacker;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedMobilityPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Passenger> getPassenger() {
		if (passenger == null) {
			passenger = new EObjectContainmentEList<Passenger>(Passenger.class, this, SharedMobilityPackage.DOMAIN__PASSENGER);
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Vehicle> getVehicle() {
		if (vehicle == null) {
			vehicle = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, SharedMobilityPackage.DOMAIN__VEHICLE);
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Inspector> getInspector() {
		if (inspector == null) {
			inspector = new EObjectContainmentEList<Inspector>(Inspector.class, this, SharedMobilityPackage.DOMAIN__INSPECTOR);
		}
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Attacker> getAttacker() {
		if (attacker == null) {
			attacker = new EObjectContainmentEList<Attacker>(Attacker.class, this, SharedMobilityPackage.DOMAIN__ATTACKER);
		}
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Provider> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<Provider>(Provider.class, this, SharedMobilityPackage.DOMAIN__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SharedMobilityPackage.DOMAIN__PASSENGER:
				return ((InternalEList<?>)getPassenger()).basicRemove(otherEnd, msgs);
			case SharedMobilityPackage.DOMAIN__VEHICLE:
				return ((InternalEList<?>)getVehicle()).basicRemove(otherEnd, msgs);
			case SharedMobilityPackage.DOMAIN__INSPECTOR:
				return ((InternalEList<?>)getInspector()).basicRemove(otherEnd, msgs);
			case SharedMobilityPackage.DOMAIN__ATTACKER:
				return ((InternalEList<?>)getAttacker()).basicRemove(otherEnd, msgs);
			case SharedMobilityPackage.DOMAIN__PROVIDER:
				return ((InternalEList<?>)getProvider()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedMobilityPackage.DOMAIN__PASSENGER:
				return getPassenger();
			case SharedMobilityPackage.DOMAIN__VEHICLE:
				return getVehicle();
			case SharedMobilityPackage.DOMAIN__INSPECTOR:
				return getInspector();
			case SharedMobilityPackage.DOMAIN__ATTACKER:
				return getAttacker();
			case SharedMobilityPackage.DOMAIN__PROVIDER:
				return getProvider();
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
			case SharedMobilityPackage.DOMAIN__PASSENGER:
				getPassenger().clear();
				getPassenger().addAll((Collection<? extends Passenger>)newValue);
				return;
			case SharedMobilityPackage.DOMAIN__VEHICLE:
				getVehicle().clear();
				getVehicle().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case SharedMobilityPackage.DOMAIN__INSPECTOR:
				getInspector().clear();
				getInspector().addAll((Collection<? extends Inspector>)newValue);
				return;
			case SharedMobilityPackage.DOMAIN__ATTACKER:
				getAttacker().clear();
				getAttacker().addAll((Collection<? extends Attacker>)newValue);
				return;
			case SharedMobilityPackage.DOMAIN__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Provider>)newValue);
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
			case SharedMobilityPackage.DOMAIN__PASSENGER:
				getPassenger().clear();
				return;
			case SharedMobilityPackage.DOMAIN__VEHICLE:
				getVehicle().clear();
				return;
			case SharedMobilityPackage.DOMAIN__INSPECTOR:
				getInspector().clear();
				return;
			case SharedMobilityPackage.DOMAIN__ATTACKER:
				getAttacker().clear();
				return;
			case SharedMobilityPackage.DOMAIN__PROVIDER:
				getProvider().clear();
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
			case SharedMobilityPackage.DOMAIN__PASSENGER:
				return passenger != null && !passenger.isEmpty();
			case SharedMobilityPackage.DOMAIN__VEHICLE:
				return vehicle != null && !vehicle.isEmpty();
			case SharedMobilityPackage.DOMAIN__INSPECTOR:
				return inspector != null && !inspector.isEmpty();
			case SharedMobilityPackage.DOMAIN__ATTACKER:
				return attacker != null && !attacker.isEmpty();
			case SharedMobilityPackage.DOMAIN__PROVIDER:
				return provider != null && !provider.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
