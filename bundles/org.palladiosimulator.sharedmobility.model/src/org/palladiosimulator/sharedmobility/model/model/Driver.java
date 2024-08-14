/**
 */
package org.palladiosimulator.sharedmobility.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.Driver#getDrives <em>Drives</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Participant {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' reference.
	 * @see #setDrives(Vehicle)
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getDriver_Drives()
	 * @model
	 * @generated
	 */
	Vehicle getDrives();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.sharedmobility.model.model.Driver#getDrives <em>Drives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drives</em>' reference.
	 * @see #getDrives()
	 * @generated
	 */
	void setDrives(Vehicle value);

} // Driver
