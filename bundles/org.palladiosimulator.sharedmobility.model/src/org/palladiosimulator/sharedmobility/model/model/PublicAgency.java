/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Agency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.PublicAgency#getManagedRoadsideUnits <em>Managed Roadside Units</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getPublicAgency()
 * @model
 * @generated
 */
public interface PublicAgency extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Roadside Units</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.RoadsideUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Roadside Units</em>' reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getPublicAgency_ManagedRoadsideUnits()
	 * @model
	 * @generated
	 */
	List<RoadsideUnit> getManagedRoadsideUnits();

} // PublicAgency
