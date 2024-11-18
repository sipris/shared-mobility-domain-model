/**
 */
package org.sharedmobility.domainmodel.smdm.metamodel.impl;

import identifier.impl.EntityImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage;
import org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator;
import org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator;
import org.sharedmobility.domainmodel.smdm.communication.NetworkConnector;

import org.sharedmobility.domainmodel.smdm.metamodel.MetamodelPackage;
import org.sharedmobility.domainmodel.smdm.metamodel.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sharedmobility.domainmodel.smdm.metamodel.impl.ParticipantImpl#getCommunicationParticipants <em>Communication Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends EntityImpl implements Participant {
	/**
	 * The cached value of the '{@link #getCommunicationParticipants() <em>Communication Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectCommunicator> communicationParticipants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DirectCommunicator> getCommunicationParticipants() {
		if (communicationParticipants == null) {
			communicationParticipants = new EObjectResolvingEList<DirectCommunicator>(DirectCommunicator.class, this,
					MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS);
		}
		return communicationParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS:
			return getCommunicationParticipants();
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
		case MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS:
			getCommunicationParticipants().clear();
			getCommunicationParticipants().addAll((Collection<? extends DirectCommunicator>) newValue);
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
		case MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS:
			getCommunicationParticipants().clear();
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
		case MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS:
			return communicationParticipants != null && !communicationParticipants.isEmpty();
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
		if (baseClass == NetworkConnector.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NetworkCommunicator.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DirectCommunicator.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS:
				return CommunicationPackage.DIRECT_COMMUNICATOR__COMMUNICATION_PARTICIPANTS;
			default:
				return -1;
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
		if (baseClass == NetworkConnector.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NetworkCommunicator.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DirectCommunicator.class) {
			switch (baseFeatureID) {
			case CommunicationPackage.DIRECT_COMMUNICATOR__COMMUNICATION_PARTICIPANTS:
				return MetamodelPackage.PARTICIPANT__COMMUNICATION_PARTICIPANTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParticipantImpl
