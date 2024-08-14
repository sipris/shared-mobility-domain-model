/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.sharedmobility.model.model.Driver;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DriverTest extends ParticipantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DriverTest.class);
	}

	/**
	 * Constructs a new Driver test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Driver test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Driver getFixture() {
		return (Driver)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createDriver());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DriverTest
