/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;
import org.palladiosimulator.sharedmobility.model.model.Van;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Van</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VanTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VanTest.class);
	}

	/**
	 * Constructs a new Van test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Van test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Van getFixture() {
		return (Van)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createVan());
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

} //VanTest
