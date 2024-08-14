/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import java.util.List;

import tools.mdsd.modelingfoundations.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getAdditionalOptions <em>Additional Options</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle()
 * @model abstract="true"
 * @generated
 */
public interface Vehicle extends DirectCommunicator, Identifier, NetworkCommunicator {
	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle_Passengers()
	 * @model
	 * @generated
	 */
	List<User> getPassengers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' reference.
	 * @see #setDriver(Driver)
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle_Driver()
	 * @model
	 * @generated
	 */
	Driver getDriver();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getDriver <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(Driver value);

	/**
	 * Returns the value of the '<em><b>Additional Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Options</em>' attribute list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle_AdditionalOptions()
	 * @model
	 * @generated
	 */
	List<String> getAdditionalOptions();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getVehicle_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.sharedmobility.model.model.Vehicle#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Vehicle
