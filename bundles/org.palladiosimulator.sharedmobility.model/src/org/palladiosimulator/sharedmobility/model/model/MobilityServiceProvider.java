/**
 */
package org.palladiosimulator.sharedmobility.model.model;

import java.util.List;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobility Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getFleet <em>Fleet</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getMobilityServiceProvider()
 * @model
 * @generated
 */
public interface MobilityServiceProvider extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getMobilityServiceProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.sharedmobility.model.model.MobilityServiceProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Drivers</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drivers</em>' reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getMobilityServiceProvider_Drivers()
	 * @model
	 * @generated
	 */
	List<Driver> getDrivers();

	/**
	 * Returns the value of the '<em><b>Fleet</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.sharedmobility.model.model.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fleet</em>' reference list.
	 * @see org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage#getMobilityServiceProvider_Fleet()
	 * @model
	 * @generated
	 */
	List<Vehicle> getFleet();

} // MobilityServiceProvider
