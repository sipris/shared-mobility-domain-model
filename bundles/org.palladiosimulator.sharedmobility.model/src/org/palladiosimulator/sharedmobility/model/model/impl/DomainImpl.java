/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.sharedmobility.model.model.Attacker;
import org.palladiosimulator.sharedmobility.model.model.Domain;
import org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider;
import org.palladiosimulator.sharedmobility.model.model.Participant;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;
import org.palladiosimulator.sharedmobility.model.model.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl#getParpicipants <em>Parpicipants</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DomainImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getParpicipants() <em>Parpicipants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParpicipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> parpicipants;

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
	protected EList<MobilityServiceProvider> provider;

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
		return SharedmobilityModelPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Participant> getParpicipants() {
		if (parpicipants == null) {
			parpicipants = new EObjectContainmentEList<Participant>(Participant.class, this, SharedmobilityModelPackage.DOMAIN__PARPICIPANTS);
		}
		return parpicipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Vehicle> getVehicle() {
		if (vehicle == null) {
			vehicle = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, SharedmobilityModelPackage.DOMAIN__VEHICLE);
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Attacker> getAttacker() {
		if (attacker == null) {
			attacker = new EObjectContainmentEList<Attacker>(Attacker.class, this, SharedmobilityModelPackage.DOMAIN__ATTACKER);
		}
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MobilityServiceProvider> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<MobilityServiceProvider>(MobilityServiceProvider.class, this, SharedmobilityModelPackage.DOMAIN__PROVIDER);
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
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
				return ((InternalEList<?>)getParpicipants()).basicRemove(otherEnd, msgs);
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
				return ((InternalEList<?>)getVehicle()).basicRemove(otherEnd, msgs);
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
				return ((InternalEList<?>)getAttacker()).basicRemove(otherEnd, msgs);
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
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
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
				return getParpicipants();
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
				return getVehicle();
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
				return getAttacker();
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
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
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
				getParpicipants().clear();
				getParpicipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
				getVehicle().clear();
				getVehicle().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
				getAttacker().clear();
				getAttacker().addAll((Collection<? extends Attacker>)newValue);
				return;
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends MobilityServiceProvider>)newValue);
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
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
				getParpicipants().clear();
				return;
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
				getVehicle().clear();
				return;
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
				getAttacker().clear();
				return;
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
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
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
				return parpicipants != null && !parpicipants.isEmpty();
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
				return vehicle != null && !vehicle.isEmpty();
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
				return attacker != null && !attacker.isEmpty();
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
				return provider != null && !provider.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
