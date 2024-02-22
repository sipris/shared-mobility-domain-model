/**
 */
package model;

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
 *   <li>{@link model.Domain#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link model.Domain#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link model.Domain#getInspector <em>Inspector</em>}</li>
 *   <li>{@link model.Domain#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link model.Domain#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see model.SharedMobilityPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' containment reference list.
	 * The list contents are of type {@link model.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' containment reference list.
	 * @see model.SharedMobilityPackage#getDomain_Passenger()
	 * @model containment="true"
	 * @generated
	 */
	List<Passenger> getPassenger();

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference list.
	 * The list contents are of type {@link model.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference list.
	 * @see model.SharedMobilityPackage#getDomain_Vehicle()
	 * @model containment="true"
	 * @generated
	 */
	List<Vehicle> getVehicle();

	/**
	 * Returns the value of the '<em><b>Inspector</b></em>' containment reference list.
	 * The list contents are of type {@link model.Inspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspector</em>' containment reference list.
	 * @see model.SharedMobilityPackage#getDomain_Inspector()
	 * @model containment="true"
	 * @generated
	 */
	List<Inspector> getInspector();

	/**
	 * Returns the value of the '<em><b>Attacker</b></em>' containment reference list.
	 * The list contents are of type {@link model.Attacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker</em>' containment reference list.
	 * @see model.SharedMobilityPackage#getDomain_Attacker()
	 * @model containment="true"
	 * @generated
	 */
	List<Attacker> getAttacker();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link model.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see model.SharedMobilityPackage#getDomain_Provider()
	 * @model containment="true"
	 * @generated
	 */
	List<Provider> getProvider();

} // Domain
