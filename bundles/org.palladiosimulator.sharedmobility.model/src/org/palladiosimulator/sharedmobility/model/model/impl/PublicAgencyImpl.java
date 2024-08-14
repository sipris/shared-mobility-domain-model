/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.sharedmobility.model.model.PublicAgency;
import org.palladiosimulator.sharedmobility.model.model.RoadsideUnit;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Agency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.PublicAgencyImpl#getManagedRoadsideUnits <em>Managed Roadside Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicAgencyImpl extends MinimalEObjectImpl.Container implements PublicAgency {
	/**
	 * The cached value of the '{@link #getManagedRoadsideUnits() <em>Managed Roadside Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedRoadsideUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<RoadsideUnit> managedRoadsideUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicAgencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmobilityModelPackage.Literals.PUBLIC_AGENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoadsideUnit> getManagedRoadsideUnits() {
		if (managedRoadsideUnits == null) {
			managedRoadsideUnits = new EObjectResolvingEList<RoadsideUnit>(RoadsideUnit.class, this, SharedmobilityModelPackage.PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS);
		}
		return managedRoadsideUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedmobilityModelPackage.PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS:
				return getManagedRoadsideUnits();
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
			case SharedmobilityModelPackage.PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS:
				getManagedRoadsideUnits().clear();
				getManagedRoadsideUnits().addAll((Collection<? extends RoadsideUnit>)newValue);
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
			case SharedmobilityModelPackage.PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS:
				getManagedRoadsideUnits().clear();
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
			case SharedmobilityModelPackage.PUBLIC_AGENCY__MANAGED_ROADSIDE_UNITS:
				return managedRoadsideUnits != null && !managedRoadsideUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PublicAgencyImpl
