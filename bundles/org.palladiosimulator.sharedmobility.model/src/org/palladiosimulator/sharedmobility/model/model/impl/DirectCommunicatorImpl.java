/**
 */
package org.palladiosimulator.sharedmobility.model.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.sharedmobility.model.model.DirectCommunicator;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Communicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.impl.DirectCommunicatorImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DirectCommunicatorImpl extends MinimalEObjectImpl.Container implements DirectCommunicator {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectCommunicator> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectCommunicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmobilityModelPackage.Literals.DIRECT_COMMUNICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DirectCommunicator> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<DirectCommunicator>(DirectCommunicator.class, this, SharedmobilityModelPackage.DIRECT_COMMUNICATOR__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedmobilityModelPackage.DIRECT_COMMUNICATOR__CONNECTIONS:
				return getConnections();
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
			case SharedmobilityModelPackage.DIRECT_COMMUNICATOR__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends DirectCommunicator>)newValue);
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
			case SharedmobilityModelPackage.DIRECT_COMMUNICATOR__CONNECTIONS:
				getConnections().clear();
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
			case SharedmobilityModelPackage.DIRECT_COMMUNICATOR__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectCommunicatorImpl
