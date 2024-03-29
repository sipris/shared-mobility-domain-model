/**
 */
package model;

import java.util.List;
import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Provider#getName <em>Name</em>}</li>
 *   <li>{@link model.Provider#getVehicleFleet <em>Vehicle Fleet</em>}</li>
 * </ul>
 *
 * @see model.SharedMobilityPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.SharedMobilityPackage#getProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Provider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Fleet</b></em>' reference list.
	 * The list contents are of type {@link model.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Fleet</em>' reference list.
	 * @see model.SharedMobilityPackage#getProvider_VehicleFleet()
	 * @model
	 * @generated
	 */
	List<Vehicle> getVehicleFleet();

} // Provider
