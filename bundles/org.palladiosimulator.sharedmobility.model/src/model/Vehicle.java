/**
 */
package model;

import java.util.List;
import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Vehicle#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link model.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link model.Vehicle#getInspector <em>Inspector</em>}</li>
 * </ul>
 *
 * @see model.SharedMobilityPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends Entity {
	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' reference list.
	 * The list contents are of type {@link model.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' reference list.
	 * @see model.SharedMobilityPackage#getVehicle_Passengers()
	 * @model
	 * @generated
	 */
	List<Passenger> getPassengers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.SharedMobilityPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inspector</b></em>' reference list.
	 * The list contents are of type {@link model.Inspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspector</em>' reference list.
	 * @see model.SharedMobilityPackage#getVehicle_Inspector()
	 * @model
	 * @generated
	 */
	List<Inspector> getInspector();

} // Vehicle
