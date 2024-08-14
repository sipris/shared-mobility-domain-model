/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Domain#getParpicipants <em>Parpicipants</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Domain#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Domain#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Domain#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Parpicipants</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parpicipants</em>' containment reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDomain_Parpicipants()
	 * @model containment="true"
	 * @generated
	 */
	List<Participant> getParpicipants();

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDomain_Vehicle()
	 * @model containment="true"
	 * @generated
	 */
	List<Vehicle> getVehicle();

	/**
	 * Returns the value of the '<em><b>Attacker</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.Attacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker</em>' containment reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDomain_Attacker()
	 * @model containment="true"
	 * @generated
	 */
	List<Attacker> getAttacker();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDomain_Provider()
	 * @model containment="true"
	 * @generated
	 */
	List<MobilityServiceProvider> getProvider();

} // Domain
