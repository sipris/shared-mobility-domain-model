/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;
import org.palladiosimulator.sharedmobility.model.model.SpeedLimit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Speed Limit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeedLimitTest extends RoadsideUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpeedLimitTest.class);
	}

	/**
	 * Constructs a new Speed Limit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedLimitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Speed Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpeedLimit getFixture() {
		return (SpeedLimit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createSpeedLimit());
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

} //SpeedLimitTest
