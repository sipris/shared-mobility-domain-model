/**
 */
package org.sharedmobility.domainmodel.smdm.metamodel.impl;

import identifier.Entity;
import identifier.Identifier;
import identifier.IdentifierPackage;
import identifier.NamedElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sharedmobility.domainmodel.smdm.communication.DirectCommunicator;
import org.sharedmobility.domainmodel.smdm.communication.NetworkCommunicator;
import org.sharedmobility.domainmodel.smdm.communication.NetworkConnector;

import org.sharedmobility.domainmodel.smdm.metamodel.MetamodelPackage;
import org.sharedmobility.domainmodel.smdm.metamodel.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sharedmobility.domainmodel.smdm.metamodel.impl.VehicleImpl#getCommunicationParticipants <em>Communication Participants</em>}</li>
 *   <li>{@link org.sharedmobility.domainmodel.smdm.metamodel.impl.VehicleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sharedmobility.domainmodel.smdm.metamodel.impl.VehicleImpl#getEntityName <em>Entity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
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
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = "aName";

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

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
		return MetamodelPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DirectCommunicator> getCommunicationParticipants() {
		if (communicationParticipants == null) {
			communicationParticipants = new EObjectResolvingEList<DirectCommunicator>(DirectCommunicator.class, this,
					MetamodelPackage.VEHICLE__COMMUNICATION_PARTICIPANTS);
		}
		return communicationParticipants;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VEHICLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VEHICLE__ENTITY_NAME, oldEntityName,
					entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.VEHICLE__COMMUNICATION_PARTICIPANTS:
			return getCommunicationParticipants();
		case MetamodelPackage.VEHICLE__ID:
			return getId();
		case MetamodelPackage.VEHICLE__ENTITY_NAME:
			return getEntityName();
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
		case MetamodelPackage.VEHICLE__COMMUNICATION_PARTICIPANTS:
			getCommunicationParticipants().clear();
			getCommunicationParticipants().addAll((Collection<? extends DirectCommunicator>) newValue);
			return;
		case MetamodelPackage.VEHICLE__ID:
			setId((String) newValue);
			return;
		case MetamodelPackage.VEHICLE__ENTITY_NAME:
			setEntityName((String) newValue);
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
		case MetamodelPackage.VEHICLE__COMMUNICATION_PARTICIPANTS:
			getCommunicationParticipants().clear();
			return;
		case MetamodelPackage.VEHICLE__ID:
			setId(ID_EDEFAULT);
			return;
		case MetamodelPackage.VEHICLE__ENTITY_NAME:
			setEntityName(ENTITY_NAME_EDEFAULT);
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
		case MetamodelPackage.VEHICLE__COMMUNICATION_PARTICIPANTS:
			return communicationParticipants != null && !communicationParticipants.isEmpty();
		case MetamodelPackage.VEHICLE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MetamodelPackage.VEHICLE__ENTITY_NAME:
			return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
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
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.VEHICLE__ID:
				return IdentifierPackage.IDENTIFIER__ID;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.VEHICLE__ENTITY_NAME:
				return IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
			case IdentifierPackage.IDENTIFIER__ID:
				return MetamodelPackage.VEHICLE__ID;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME:
				return MetamodelPackage.VEHICLE__ENTITY_NAME;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
			default:
				return -1;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
